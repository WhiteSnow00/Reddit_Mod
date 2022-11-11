// 
// Decompiled by Procyon v0.6.0
// 

package rb2;

import q90.e0;
import com.reddit.ui.localization.RedditLocalizationDelegate;
import va0.k;
import com.reddit.session.o;
import o90.dl;
import com.reddit.webembed.webview.WebEmbedPresenter;
import ui.b;
import o90.yr;
import o90.xt;
import rg2.a;
import javax.inject.Inject;
import o90.eh;
import com.reddit.webembed.webview.WebEmbedWebView;
import o90.tt;

public final class h implements tt<WebEmbedWebView, g>
{
    public final e a;
    
    @Inject
    public h(final eh a) {
        this.a = (e)a;
    }
    
    @Override
    public final xt inject(final Object o, final a a) {
        final WebEmbedWebView webEmbedWebView = (WebEmbedWebView)o;
        sg2.e.f((Object)webEmbedWebView, "target");
        sg2.e.f((Object)a, "factory");
        final g g = a.invoke();
        final e a2 = this.a;
        final f a3 = g.a;
        final eh eh = (eh)a2;
        eh.getClass();
        a3.getClass();
        final dl a4 = eh.a;
        final yr yr = new yr(a4, a3);
        final o e = ((e0)a4.a).E();
        b.n((Object)e);
        final k d = ((e0)a4.a).D();
        b.n((Object)d);
        final a20.a b2 = ((e0)a4.a).B2();
        b.n((Object)b2);
        webEmbedWebView.setPresenter(new WebEmbedPresenter(a3, e, d, b2));
        final RedditLocalizationDelegate z1 = ((e0)a4.a).Z1();
        b.n((Object)z1);
        webEmbedWebView.setLocalizationDelegate((yb0.a)z1);
        return new xt((Object)yr);
    }
}
