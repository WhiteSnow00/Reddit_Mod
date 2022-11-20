// 
// Decompiled by Procyon v0.6.0
// 

package kb2;

import ng2.e;
import com.reddit.webembed.webview.WebEmbedWebView;

public final class h
{
    public final g a;
    
    public h(final WebEmbedWebView a) {
        e.f((Object)a, "webView");
        this.a = (g)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof h && e.a((Object)this.a, (Object)((h)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("WebEmbedWebViewDependencies(webView=");
        t.append(this.a);
        t.append(')');
        return t.toString();
    }
}
