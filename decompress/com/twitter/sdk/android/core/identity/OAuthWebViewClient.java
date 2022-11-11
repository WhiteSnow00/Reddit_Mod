// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.identity;

import android.os.BaseBundle;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;
import android.os.Bundle;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import java.net.URI;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class OAuthWebViewClient extends WebViewClient
{
    private final String completeUrl;
    private final Listener listener;
    
    public OAuthWebViewClient(final String completeUrl, final Listener listener) {
        this.completeUrl = completeUrl;
        this.listener = listener;
    }
    
    public void onPageFinished(final WebView webView, final String s) {
        super.onPageFinished(webView, s);
        this.listener.onPageFinished(webView, s);
    }
    
    public void onReceivedError(final WebView webView, final int n, final String s, final String s2) {
        super.onReceivedError(webView, n, s, s2);
        this.listener.onError(new WebViewException(n, s, s2));
    }
    
    public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.listener.onError(new WebViewException(sslError.getPrimaryError(), null, null));
    }
    
    public boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        if (s.startsWith(this.completeUrl)) {
            final TreeMap<String, String> queryParams = UrlUtils.getQueryParams(URI.create(s), false);
            final Bundle bundle = new Bundle(queryParams.size());
            for (final Map.Entry<String, V> entry : queryParams.entrySet()) {
                ((BaseBundle)bundle).putString((String)entry.getKey(), (String)entry.getValue());
            }
            this.listener.onSuccess(bundle);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, s);
    }
    
    public interface Listener
    {
        void onError(final WebViewException p0);
        
        void onPageFinished(final WebView p0, final String p1);
        
        void onSuccess(final Bundle p0);
    }
}
