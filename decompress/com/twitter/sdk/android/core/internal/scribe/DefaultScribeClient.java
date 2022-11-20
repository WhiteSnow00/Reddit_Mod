// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.util.List;
import java.util.Collections;
import android.os.Build$VERSION;
import android.text.TextUtils;
import com.google.gson.FieldNamingPolicy;
import hj.i;
import hj.h;
import com.twitter.sdk.android.core.internal.ExecutorUtils;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.internal.IdManager;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public class DefaultScribeClient extends ScribeClient
{
    private static final String DEBUG_BUILD = "debug";
    private static final String SCRIBE_PATH_TYPE = "sdk";
    private static final String SCRIBE_PATH_VERSION = "i";
    private static final String SCRIBE_URL = "https://syndication.twitter.com";
    private static volatile ScheduledExecutorService executor;
    private final String advertisingId;
    private final Context context;
    private final SessionManager<? extends Session<TwitterAuthToken>> sessionManager;
    
    public DefaultScribeClient(final Context context, final SessionManager<? extends Session<TwitterAuthToken>> sessionManager, final GuestSessionProvider guestSessionProvider, final IdManager idManager, final ScribeConfig scribeConfig) {
        this(context, TwitterCore.getInstance().getAuthConfig(), sessionManager, guestSessionProvider, idManager, scribeConfig);
    }
    
    public DefaultScribeClient(final Context context, final TwitterAuthConfig twitterAuthConfig, final SessionManager<? extends Session<TwitterAuthToken>> sessionManager, final GuestSessionProvider guestSessionProvider, final IdManager idManager, final ScribeConfig scribeConfig) {
        super(context, getExecutor(), scribeConfig, new ScribeEvent.Transform(getGson()), twitterAuthConfig, (SessionManager)sessionManager, guestSessionProvider, idManager);
        this.context = context;
        this.sessionManager = sessionManager;
        this.advertisingId = idManager.getAdvertisingId();
    }
    
    private static ScheduledExecutorService getExecutor() {
        if (DefaultScribeClient.executor == null) {
            synchronized (DefaultScribeClient.class) {
                if (DefaultScribeClient.executor == null) {
                    DefaultScribeClient.executor = ExecutorUtils.buildSingleThreadScheduledExecutorService("scribe");
                }
            }
        }
        return DefaultScribeClient.executor;
    }
    
    private static h getGson() {
        final i i = new i();
        i.c = FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;
        return i.a();
    }
    
    private String getLanguage() {
        return this.context.getResources().getConfiguration().locale.getLanguage();
    }
    
    public static ScribeConfig getScribeConfig(final String s, final String s2) {
        return new ScribeConfig(isEnabled(), getScribeUrl("https://syndication.twitter.com", ""), "i", "sdk", "", getUserAgent(s, s2), 100, 600);
    }
    
    public static String getScribeUrl(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            return s2;
        }
        return s;
    }
    
    public static String getUserAgent(final String s, final String s2) {
        final StringBuilder r = d.r("TwitterKit/", "3.0", " (Android ");
        r.append(Build$VERSION.SDK_INT);
        r.append(") ");
        r.append(s);
        r.append("/");
        r.append(s2);
        return r.toString();
    }
    
    private static boolean isEnabled() {
        return true;
    }
    
    public Session getActiveSession() {
        return this.sessionManager.getActiveSession();
    }
    
    public long getScribeSessionId(final Session session) {
        long id;
        if (session != null) {
            id = session.getId();
        }
        else {
            id = 0L;
        }
        return id;
    }
    
    public void scribe(final EventNamespace eventNamespace, final String s) {
        this.scribe(ScribeEventFactory.newScribeEvent(eventNamespace, s, System.currentTimeMillis(), this.getLanguage(), this.advertisingId, (List)Collections.emptyList()));
    }
    
    public void scribe(final EventNamespace eventNamespace, final List<ScribeItem> list) {
        this.scribe(ScribeEventFactory.newScribeEvent(eventNamespace, "", System.currentTimeMillis(), this.getLanguage(), this.advertisingId, (List)list));
    }
    
    public void scribe(final ScribeEvent scribeEvent) {
        super.scribe(scribeEvent, this.getScribeSessionId(this.getActiveSession()));
    }
    
    public void scribe(final EventNamespace... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            this.scribe(array[i], Collections.emptyList());
        }
    }
}
