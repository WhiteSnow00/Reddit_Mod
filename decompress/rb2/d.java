// 
// Decompiled by Procyon v0.6.0
// 

package rb2;

import android.view.View;
import android.net.Uri;
import sg2.e;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.reddit.webembed.webview.WebEmbedWebView;
import android.webkit.WebViewClient;

public final class d extends WebViewClient
{
    public final /* synthetic */ WebEmbedWebView a;
    
    public d(final WebEmbedWebView a) {
        this.a = a;
    }
    
    public final void doUpdateVisitedHistory(final WebView webView, final String s, final boolean b) {
        super.doUpdateVisitedHistory(webView, s, b);
        this.a.o.y(s);
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
        super.onPageFinished(webView, s);
        ((View)this.a).requestApplyInsets();
    }
    
    public final void onReceivedError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        e.f((Object)webResourceRequest, "request");
        e.f((Object)webResourceError, "error");
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        final WebEmbedWebView.a o = this.a.o;
        webResourceRequest.isForMainFrame();
        final Uri url = webResourceRequest.getUrl();
        e.e((Object)url, "request.url");
        o.B(url, webResourceError.getDescription().toString());
        if (webView != null) {
            webView.loadUrl("about:blank");
        }
        this.a.o.z();
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
        e.f((Object)webResourceRequest, "request");
        super.shouldOverrideUrlLoading(webView, webResourceRequest);
        final WebEmbedWebView a = this.a;
        a.getClass();
        final Uri url = webResourceRequest.getUrl();
        if (url != null) {
            final WebEmbedWebView.a o = a.o;
            final String string = url.toString();
            e.e((Object)string, "url.toString()");
            o.A(string);
        }
        return false;
    }
}
