// 
// Decompiled by Procyon v0.6.0
// 

package rb2;

import sg2.e;
import com.reddit.webembed.webview.WebEmbedWebView;

public final class g
{
    public final f a;
    
    public g(final WebEmbedWebView a) {
        e.f((Object)a, "webView");
        this.a = (f)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof g && e.a((Object)this.a, (Object)((g)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("WebEmbedWebViewDependencies(webView=");
        r.append(this.a);
        r.append(')');
        return r.toString();
    }
}
