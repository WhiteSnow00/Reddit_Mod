// 
// Decompiled by Procyon v0.6.0
// 

package kb2;

import q90.e0;
import com.reddit.ui.localization.RedditLocalizationDelegate;
import wa0.j;
import com.reddit.session.n;
import o90.lk;
import com.reddit.webembed.webview.WebEmbedPresenter;
import zd.b;
import o90.mr;
import ng2.e;
import o90.ht;
import mg2.a;
import javax.inject.Inject;
import o90.ao;
import com.reddit.webembed.webview.WebEmbedWebView;
import o90.dt;

public final class i implements dt<WebEmbedWebView, h>
{
    public final f a;
    
    @Inject
    public i(final ao a) {
        this.a = (f)a;
    }
    
    public final ht inject(final Object o, final a a) {
        final WebEmbedWebView webEmbedWebView = (WebEmbedWebView)o;
        e.f((Object)webEmbedWebView, "target");
        e.f((Object)a, "factory");
        final h h = (h)a.invoke();
        final f a2 = this.a;
        final g a3 = h.a;
        final ao ao = (ao)a2;
        ao.getClass();
        a3.getClass();
        final lk a4 = ao.a;
        final mr mr = new mr(a4, a3);
        final n e = ((e0)a4.a).E();
        b.r(e);
        final j d = ((e0)a4.a).D();
        b.r(d);
        final d20.a d2 = ((e0)a4.a).D2();
        b.r(d2);
        webEmbedWebView.setPresenter(new WebEmbedPresenter(a3, e, d, d2));
        final RedditLocalizationDelegate b2 = ((e0)a4.a).b2();
        b.r(b2);
        webEmbedWebView.setLocalizationDelegate((xb0.a)b2);
        return new ht((Object)mr);
    }
}
