// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.identity;

import android.os.BaseBundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import com.twitter.sdk.android.core.Callback;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.sdk.android.core.Logger;
import android.os.Bundle;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.Twitter;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.TwitterAuthConfig;

class OAuthController implements OAuthWebViewClient$Listener
{
    private final TwitterAuthConfig authConfig;
    public final OAuthController.OAuthController$Listener listener;
    private final OAuth1aService oAuth1aService;
    public TwitterAuthToken requestToken;
    private final ProgressBar spinner;
    private final WebView webView;
    
    public OAuthController(final ProgressBar spinner, final WebView webView, final TwitterAuthConfig authConfig, final OAuth1aService oAuth1aService, final OAuthController.OAuthController$Listener listener) {
        this.spinner = spinner;
        this.webView = webView;
        this.authConfig = authConfig;
        this.oAuth1aService = oAuth1aService;
        this.listener = listener;
    }
    
    public static OAuth1aService access$000(final OAuthController oAuthController) {
        return oAuthController.oAuth1aService;
    }
    
    public static WebView access$100(final OAuthController oAuthController) {
        return oAuthController.webView;
    }
    
    public static TwitterAuthConfig access$200(final OAuthController oAuthController) {
        return oAuthController.authConfig;
    }
    
    private void dismissSpinner() {
        ((View)this.spinner).setVisibility(8);
    }
    
    private void dismissWebView() {
        this.webView.stopLoading();
        this.dismissSpinner();
    }
    
    private void handleWebViewError(final WebViewException ex) {
        Twitter.getLogger().e("Twitter", "OAuth web view completed with an error", (Throwable)ex);
        this.handleAuthError(1, new TwitterAuthException("OAuth web view completed with an error"));
    }
    
    private void handleWebViewSuccess(final Bundle bundle) {
        Twitter.getLogger().d("Twitter", "OAuth web view completed successfully");
        if (bundle != null) {
            final String string = ((BaseBundle)bundle).getString("oauth_verifier");
            if (string != null) {
                Twitter.getLogger().d("Twitter", "Converting the request token to an access token.");
                this.oAuth1aService.requestAccessToken(this.newRequestAccessTokenCallback(), this.requestToken, string);
                return;
            }
        }
        final Logger logger = Twitter.getLogger();
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to get authorization, bundle incomplete ");
        sb.append(bundle);
        logger.e("Twitter", sb.toString(), (Throwable)null);
        this.handleAuthError(1, new TwitterAuthException("Failed to get authorization, bundle incomplete"));
    }
    
    public void handleAuthError(final int n, final TwitterAuthException ex) {
        final Intent intent = new Intent();
        intent.putExtra("auth_error", (Serializable)ex);
        this.listener.onComplete(n, intent);
    }
    
    public Callback<OAuthResponse> newRequestAccessTokenCallback() {
        return (Callback<OAuthResponse>)new OAuthController$2(this);
    }
    
    public Callback<OAuthResponse> newRequestTempTokenCallback() {
        return (Callback<OAuthResponse>)new OAuthController$1(this);
    }
    
    public void onError(final WebViewException ex) {
        this.handleWebViewError(ex);
        this.dismissWebView();
    }
    
    public void onPageFinished(final WebView webView, final String s) {
        this.dismissSpinner();
        ((View)webView).setVisibility(0);
    }
    
    public void onSuccess(final Bundle bundle) {
        this.handleWebViewSuccess(bundle);
        this.dismissWebView();
    }
    
    public void setUpWebView(final WebView webView, final WebViewClient webViewClient, final String s, final WebChromeClient webChromeClient) {
        final WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(false);
        settings.setSaveFormData(false);
        ((View)webView).setVerticalScrollBarEnabled(false);
        ((View)webView).setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(webViewClient);
        webView.loadUrl(s);
        ((View)webView).setVisibility(4);
        webView.setWebChromeClient(webChromeClient);
    }
    
    public void startAuth() {
        Twitter.getLogger().d("Twitter", "Obtaining request token to start the sign in flow");
        this.oAuth1aService.requestTempToken(this.newRequestTempTokenCallback());
    }
}
