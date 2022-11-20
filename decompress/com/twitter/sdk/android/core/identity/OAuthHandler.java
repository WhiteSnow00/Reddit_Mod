// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.identity;

import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.TwitterAuthConfig;

class OAuthHandler extends AuthHandler
{
    public OAuthHandler(final TwitterAuthConfig twitterAuthConfig, final Callback<TwitterSession> callback, final int n) {
        super(twitterAuthConfig, (Callback)callback, n);
    }
    
    public boolean authorize(final Activity activity) {
        activity.startActivityForResult(this.newIntent(activity), super.requestCode);
        return true;
    }
    
    public Intent newIntent(final Activity activity) {
        final Intent intent = new Intent((Context)activity, (Class)OAuthActivity.class);
        intent.putExtra("auth_config", (Parcelable)this.getAuthConfig());
        return intent;
    }
}
