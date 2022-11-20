// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import java.util.List;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.Session;
import android.os.Handler;
import android.os.Looper;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.GuestSessionProvider;
import android.content.Context;

public class TweetUi
{
    private static final String KIT_SCRIBE_NAME = "TweetUi";
    public static final String LOGTAG = "TweetUi";
    public static volatile TweetUi instance;
    public Context context;
    public GuestSessionProvider guestSessionProvider;
    private Picasso imageLoader;
    public DefaultScribeClient scribeClient;
    public SessionManager<TwitterSession> sessionManager;
    private TweetRepository tweetRepository;
    
    public TweetUi() {
        final TwitterCore instance = TwitterCore.getInstance();
        this.context = Twitter.getInstance().getContext(this.getIdentifier());
        this.sessionManager = (SessionManager<TwitterSession>)instance.getSessionManager();
        this.guestSessionProvider = instance.getGuestSessionProvider();
        this.tweetRepository = new TweetRepository(new Handler(Looper.getMainLooper()), (SessionManager<TwitterSession>)instance.getSessionManager());
        this.imageLoader = Picasso.f(Twitter.getInstance().getContext(this.getIdentifier()));
        this.setUpScribeClient();
    }
    
    public static TweetUi getInstance() {
        if (TweetUi.instance == null) {
            synchronized (TweetUi.class) {
                if (TweetUi.instance == null) {
                    TweetUi.instance = new TweetUi();
                }
            }
        }
        return TweetUi.instance;
    }
    
    private void setUpScribeClient() {
        this.scribeClient = new DefaultScribeClient(this.context, this.sessionManager, this.guestSessionProvider, Twitter.getInstance().getIdManager(), DefaultScribeClient.getScribeConfig("TweetUi", this.getVersion()));
    }
    
    public String getIdentifier() {
        return "com.twitter.sdk.android:tweet-ui";
    }
    
    public Picasso getImageLoader() {
        return this.imageLoader;
    }
    
    public TweetRepository getTweetRepository() {
        return this.tweetRepository;
    }
    
    public String getVersion() {
        return "3.1.1.9";
    }
    
    public void scribe(final EventNamespace eventNamespace, final List<ScribeItem> list) {
        final DefaultScribeClient scribeClient = this.scribeClient;
        if (scribeClient == null) {
            return;
        }
        scribeClient.scribe(eventNamespace, list);
    }
    
    public void scribe(final EventNamespace... array) {
        if (this.scribeClient == null) {
            return;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            this.scribeClient.scribe(array[i]);
        }
    }
    
    public void setImageLoader(final Picasso imageLoader) {
        this.imageLoader = imageLoader;
    }
    
    public void setTweetRepository(final TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }
}
