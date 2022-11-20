// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.identity;

import android.view.View;
import android.os.BaseBundle;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.R$id;
import com.twitter.sdk.android.core.R$layout;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.sdk.android.core.TwitterAuthException;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.app.Activity;

public class OAuthActivity extends Activity implements OAuthController$Listener
{
    public static final String EXTRA_AUTH_CONFIG = "auth_config";
    private static final String STATE_PROGRESS = "progress";
    public OAuthController oAuthController;
    private ProgressBar spinner;
    private WebView webView;
    
    public void onBackPressed() {
        this.oAuthController.handleAuthError(0, new TwitterAuthException("Authorization failed, request was canceled."));
    }
    
    public void onComplete(final int n, final Intent intent) {
        this.setResult(n, intent);
        this.finish();
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R$layout.tw__activity_oauth);
        this.spinner = (ProgressBar)this.findViewById(R$id.tw__spinner);
        this.webView = (WebView)this.findViewById(R$id.tw__web_view);
        int visibility = 0;
        final boolean b = bundle == null || ((BaseBundle)bundle).getBoolean("progress", false);
        final ProgressBar spinner = this.spinner;
        if (!b) {
            visibility = 8;
        }
        ((View)spinner).setVisibility(visibility);
        (this.oAuthController = new OAuthController(this.spinner, this.webView, (TwitterAuthConfig)this.getIntent().getParcelableExtra("auth_config"), new OAuth1aService(TwitterCore.getInstance(), new TwitterApi()), (OAuthController.OAuthController$Listener)this)).startAuth();
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        if (((View)this.spinner).getVisibility() == 0) {
            ((BaseBundle)bundle).putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }
}
