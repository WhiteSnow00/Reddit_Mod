// 
// Decompiled by Procyon v0.6.0
// 

package kb2;

import android.view.View;
import android.net.Uri;
import com.reddit.webembed.webview.WebEmbedWebView$a;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.reddit.webembed.webview.WebEmbedWebView;
import android.webkit.WebViewClient;

public final class e extends WebViewClient
{
    public final WebEmbedWebView a;
    
    public e(final WebEmbedWebView a) {
        this.a = a;
    }
    
    public final void doUpdateVisitedHistory(final WebView webView, final String s, final boolean b) {
        super.doUpdateVisitedHistory(webView, s, b);
        this.a.o.x(s);
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
        super.onPageFinished(webView, s);
        ((View)this.a).requestApplyInsets();
    }
    
    public final void onReceivedError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        ng2.e.f((Object)webResourceRequest, "request");
        ng2.e.f((Object)webResourceError, "error");
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        final WebEmbedWebView$a o = this.a.o;
        webResourceRequest.isForMainFrame();
        final Uri url = webResourceRequest.getUrl();
        ng2.e.e((Object)url, "request.url");
        o.D(url, webResourceError.getDescription().toString());
        if (webView != null) {
            webView.loadUrl("about:blank");
        }
        this.a.o.y();
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
        ng2.e.f((Object)webResourceRequest, "request");
        super.shouldOverrideUrlLoading(webView, webResourceRequest);
        final WebEmbedWebView a = this.a;
        a.getClass();
        final Uri url = webResourceRequest.getUrl();
        if (url != null) {
            final WebEmbedWebView$a o = a.o;
            final String string = url.toString();
            ng2.e.e((Object)string, "url.toString()");
            o.C(string);
        }
        return false;
    }
}
