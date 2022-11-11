// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.internal.scribe.TwitterCoreScribeClientHolder;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.internal.SessionVerifier;
import com.twitter.sdk.android.core.internal.TwitterSessionVerifier;
import com.twitter.sdk.android.core.internal.persistence.SerializationStrategy;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStoreImpl;
import com.twitter.sdk.android.core.internal.SessionMonitor;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

public class TwitterCore
{
    public static final String KIT_SCRIBE_NAME = "TwitterCore";
    public static final String PREF_KEY_ACTIVE_GUEST_SESSION = "active_guestsession";
    public static final String PREF_KEY_ACTIVE_TWITTER_SESSION = "active_twittersession";
    public static final String PREF_KEY_GUEST_SESSION = "guestsession";
    public static final String PREF_KEY_TWITTER_SESSION = "twittersession";
    public static final String SESSION_PREF_FILE_NAME = "session_store";
    public static final String TAG = "Twitter";
    public static volatile TwitterCore instance;
    private final ConcurrentHashMap<Session, TwitterApiClient> apiClients;
    private final TwitterAuthConfig authConfig;
    private final Context context;
    private volatile TwitterApiClient guestClient;
    public SessionManager<GuestSession> guestSessionManager;
    private volatile GuestSessionProvider guestSessionProvider;
    public SessionMonitor<TwitterSession> sessionMonitor;
    public SessionManager<TwitterSession> twitterSessionManager;
    
    public TwitterCore(final TwitterAuthConfig twitterAuthConfig) {
        this(twitterAuthConfig, new ConcurrentHashMap<Session, TwitterApiClient>(), null);
    }
    
    public TwitterCore(final TwitterAuthConfig authConfig, final ConcurrentHashMap<Session, TwitterApiClient> apiClients, final TwitterApiClient guestClient) {
        this.authConfig = authConfig;
        this.apiClients = apiClients;
        this.guestClient = guestClient;
        final Context context = Twitter.getInstance().getContext(this.getIdentifier());
        this.context = context;
        this.twitterSessionManager = (SessionManager<TwitterSession>)new PersistedSessionManager((PreferenceStore)new PreferenceStoreImpl(context, "session_store"), (SerializationStrategy)new TwitterSession$Serializer(), "active_twittersession", "twittersession");
        this.guestSessionManager = (SessionManager<GuestSession>)new PersistedSessionManager((PreferenceStore)new PreferenceStoreImpl(context, "session_store"), (SerializationStrategy)new GuestSession$Serializer(), "active_guestsession", "guestsession");
        this.sessionMonitor = new SessionMonitor<TwitterSession>(this.twitterSessionManager, Twitter.getInstance().getExecutorService(), (SessionVerifier<TwitterSession>)new TwitterSessionVerifier());
    }
    
    private void createGuestClient() {
        synchronized (this) {
            if (this.guestClient == null) {
                this.guestClient = new TwitterApiClient();
            }
        }
    }
    
    private void createGuestClient(final TwitterApiClient guestClient) {
        synchronized (this) {
            if (this.guestClient == null) {
                this.guestClient = guestClient;
            }
        }
    }
    
    private void createGuestSessionProvider() {
        synchronized (this) {
            if (this.guestSessionProvider == null) {
                this.guestSessionProvider = new GuestSessionProvider(new OAuth2Service(this, new TwitterApi()), (SessionManager)this.guestSessionManager);
            }
        }
    }
    
    public static TwitterCore getInstance() {
        if (TwitterCore.instance == null) {
            synchronized (TwitterCore.class) {
                if (TwitterCore.instance == null) {
                    TwitterCore.instance = new TwitterCore(Twitter.getInstance().getTwitterAuthConfig());
                    Twitter.getInstance().getExecutorService().execute(new Runnable() {
                        @Override
                        public void run() {
                            TwitterCore.instance.doInBackground();
                        }
                    });
                }
            }
        }
        return TwitterCore.instance;
    }
    
    private void setUpScribeClient() {
        TwitterCoreScribeClientHolder.initialize(this.context, (SessionManager<? extends Session<TwitterAuthToken>>)this.getSessionManager(), this.getGuestSessionProvider(), Twitter.getInstance().getIdManager(), "TwitterCore", this.getVersion());
    }
    
    public void addApiClient(final TwitterSession twitterSession, final TwitterApiClient twitterApiClient) {
        if (!this.apiClients.containsKey(twitterSession)) {
            this.apiClients.putIfAbsent((Session)twitterSession, twitterApiClient);
        }
    }
    
    public void addGuestApiClient(final TwitterApiClient twitterApiClient) {
        if (this.guestClient == null) {
            this.createGuestClient(twitterApiClient);
        }
    }
    
    public void doInBackground() {
        this.twitterSessionManager.getActiveSession();
        this.guestSessionManager.getActiveSession();
        this.getGuestSessionProvider();
        this.setUpScribeClient();
        this.sessionMonitor.monitorActivityLifecycle(Twitter.getInstance().getActivityLifecycleManager());
    }
    
    public TwitterApiClient getApiClient() {
        final TwitterSession twitterSession = (TwitterSession)this.twitterSessionManager.getActiveSession();
        if (twitterSession == null) {
            return this.getGuestApiClient();
        }
        return this.getApiClient(twitterSession);
    }
    
    public TwitterApiClient getApiClient(final TwitterSession twitterSession) {
        if (!this.apiClients.containsKey(twitterSession)) {
            this.apiClients.putIfAbsent((Session)twitterSession, new TwitterApiClient(twitterSession));
        }
        return this.apiClients.get(twitterSession);
    }
    
    public TwitterAuthConfig getAuthConfig() {
        return this.authConfig;
    }
    
    public TwitterApiClient getGuestApiClient() {
        if (this.guestClient == null) {
            this.createGuestClient();
        }
        return this.guestClient;
    }
    
    public GuestSessionProvider getGuestSessionProvider() {
        if (this.guestSessionProvider == null) {
            this.createGuestSessionProvider();
        }
        return this.guestSessionProvider;
    }
    
    public String getIdentifier() {
        return "com.twitter.sdk.android:twitter-core";
    }
    
    public SessionManager<TwitterSession> getSessionManager() {
        return this.twitterSessionManager;
    }
    
    public String getVersion() {
        return "3.1.1.9";
    }
}
