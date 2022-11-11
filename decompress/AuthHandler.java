// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.identity;

import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterAuthException;
import nu2.w;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterAuthToken;
import android.content.Intent;
import android.app.Activity;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.Callback;

public abstract class AuthHandler
{
    public static final String EXTRA_AUTH_ERROR = "auth_error";
    public static final String EXTRA_SCREEN_NAME = "screen_name";
    public static final String EXTRA_TOKEN = "tk";
    public static final String EXTRA_TOKEN_SECRET = "ts";
    public static final String EXTRA_USER_ID = "user_id";
    public static final int RESULT_CODE_ERROR = 1;
    private final Callback<TwitterSession> callback;
    private final TwitterAuthConfig config;
    public final int requestCode;
    
    public AuthHandler(final TwitterAuthConfig config, final Callback<TwitterSession> callback, final int requestCode) {
        this.config = config;
        this.callback = callback;
        this.requestCode = requestCode;
    }
    
    public abstract boolean authorize(final Activity p0);
    
    public TwitterAuthConfig getAuthConfig() {
        return this.config;
    }
    
    public Callback<TwitterSession> getCallback() {
        return this.callback;
    }
    
    public boolean handleOnActivityResult(final int n, final int n2, final Intent intent) {
        if (this.requestCode != n) {
            return false;
        }
        final Callback<TwitterSession> callback = this.getCallback();
        if (callback != null) {
            if (n2 == -1) {
                callback.success(new Result((Object)new TwitterSession(new TwitterAuthToken(intent.getStringExtra("tk"), intent.getStringExtra("ts")), intent.getLongExtra("user_id", 0L), intent.getStringExtra("screen_name")), (w)null));
            }
            else if (intent != null && intent.hasExtra("auth_error")) {
                callback.failure((TwitterException)intent.getSerializableExtra("auth_error"));
            }
            else {
                callback.failure((TwitterException)new TwitterAuthException("Authorize failed."));
            }
        }
        return true;
    }
}
