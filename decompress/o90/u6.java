// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import hg0.f;
import yy.d;
import se2.h;
import b40.k0;
import bn0.c;
import com.reddit.frontpage.presentation.listing.linkpager.LinkPagerPresenter;
import mg0.m;
import com.reddit.domain.usecase.b;
import javax.inject.Provider;
import se2.e;
import android.app.Activity;
import rg2.a;

public final class u6
{
    public final a<? extends Activity> a;
    public final z0 b;
    public e c;
    public Provider<b> d;
    public e e;
    public Provider<m> f;
    public Provider<LinkPagerPresenter> g;
    public Provider<lh0.b> h;
    
    public u6(final z0 b, final c c, final bn0.a a, final a a2) {
        this.b = b;
        this.a = a2;
        this.c = se2.e.a((Object)c);
        this.d = (Provider<b>)se2.c.b((Provider)new k0((Provider)b.A1, (Provider)b.L, (Provider)b.k1, (Provider)b.p2, 7));
        this.e = se2.e.a((Object)a);
        final Provider a3 = se2.h.a((Provider)jx.c.c((Provider)b.h, (Provider)b.e2, (Provider)b.O1, q30.b.a((Provider)b.m, (Provider)b.N1, (Provider)b.x0)));
        this.f = (Provider<m>)a3;
        this.g = (Provider<LinkPagerPresenter>)se2.c.b((Provider)new d((Provider)this.c, (Provider)this.d, (Provider)this.e, (Provider)b.p0, (Provider)b.A1, a3, (Provider)b.j, (Provider)b.h, 3));
        this.h = (Provider<lh0.b>)se2.c.b((Provider)hg0.f.e((Provider)b.h));
    }
}
