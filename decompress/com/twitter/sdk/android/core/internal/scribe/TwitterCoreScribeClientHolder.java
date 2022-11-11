// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import com.twitter.sdk.android.core.internal.IdManager;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import android.content.Context;

public class TwitterCoreScribeClientHolder
{
    private static DefaultScribeClient instance;
    
    public static DefaultScribeClient getScribeClient() {
        return TwitterCoreScribeClientHolder.instance;
    }
    
    public static void initialize(final Context context, final SessionManager<? extends Session<TwitterAuthToken>> sessionManager, final GuestSessionProvider guestSessionProvider, final IdManager idManager, final String s, final String s2) {
        TwitterCoreScribeClientHolder.instance = new DefaultScribeClient(context, (SessionManager)sessionManager, guestSessionProvider, idManager, DefaultScribeClient.getScribeConfig(s, s2));
    }
}
