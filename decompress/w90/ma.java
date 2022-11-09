// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import c50.j1;
import bc0.d;
import ok1.b$a;
import uz.i;
import af2.h;
import com.reddit.screen.BaseScreen;
import qk1.c;
import ee0.a;
import g60.g1;
import com.reddit.billing.RedditBillingManager;
import com.reddit.billing.RemotePurchaseDataSource;
import javax.inject.Provider;
import iv0.b;
import af2.e;

public final class ma
{
    public e a;
    public e b;
    public e c;
    public b d;
    public sa1.b e;
    public Provider<RemotePurchaseDataSource> f;
    public py.b g;
    public Provider<RedditBillingManager> h;
    public g1 i;
    public Provider<a> j;
    public Provider<ot1.b> k;
    public Provider<qk1.b> l;
    
    public ma(final a1 a1, final c c, final qk1.a a2, final BaseScreen baseScreen) {
        this.a = af2.e.a((Object)c);
        this.b = af2.e.a((Object)a2);
        final e a3 = af2.e.a((Object)baseScreen);
        this.c = a3;
        this.d = iv0.b.b((Provider)a3);
        this.e = sa1.b.a((Provider)this.c);
        final Provider a4 = af2.h.a((Provider)rx.b.a((Provider)a1.D0));
        this.f = (Provider<RemotePurchaseDataSource>)a4;
        this.g = py.b.a(a4, (Provider)a1.E0);
        final Provider b = af2.c.b((Provider)vx.c.b((Provider)this.d, (Provider)this.e, (Provider)this.g, (Provider)a1.c, (Provider)a1.b0, (Provider)a1.F0, (Provider)a1.G0, (Provider)a1.o0, (Provider)a1.m, (Provider)uz.i.a((Provider)a1.c, (Provider)a1.K), (Provider)a1.H0, (Provider)a1.V));
        this.h = (Provider<RedditBillingManager>)b;
        final b b2 = new b((Provider)b$a.a, 12);
        final a1.a6 h3 = a1.H3;
        final a1$u9 c2 = a1.c;
        final a1$q3 j = a1.J;
        final a1.f6 k = a1.K;
        this.i = new g1((Provider)h3, (Provider)c2, (Provider)j, b, (Provider)k, (Provider)a1.r, (Provider)b2, 1);
        this.j = (Provider<a>)af2.h.a((Provider)new d((Provider)a1.b0, b, (Provider)j, (Provider)a1.g0, (Provider)a1.X0, (Provider)k, 1));
        final Provider b3 = af2.c.b((Provider)new d((Provider)this.d, (Provider)a1.w, (Provider)a1.T, (Provider)a1.g0, (Provider)a1.E, (Provider)a1.c1, 6));
        this.k = (Provider<ot1.b>)b3;
        final a1.a6 h4 = a1.H3;
        final a1.h1 z = a1.Z;
        final a1.f6 i = a1.K;
        this.l = (Provider<qk1.b>)af2.c.b((Provider)new j1((Provider)this.a, (Provider)this.b, (Provider)this.i, (Provider)this.j, (Provider)i, (Provider)a1.c0, (Provider)a1.W, b3, (Provider)a1.w, (Provider)new hx.a((Provider)h4, (Provider)z, (Provider)i, (Provider)a1.r, 4), 6));
    }
}
