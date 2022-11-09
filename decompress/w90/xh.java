// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import java.util.Map;
import db0.t;
import ix1.j;
import ix1.m;
import e40.k;
import u60.c$a;
import da0.b$a;
import af2.h;
import vx.d;
import d00.f;
import ux0.i$a;
import yl1.c;
import com.reddit.billing.RedditBillingManager;
import com.reddit.billing.RemotePurchaseDataSource;
import javax.inject.Provider;
import zy.e;
import vx.b;
import uz.i;
import rx.a;
import com.reddit.screen.BaseScreen;

public final class xh implements du
{
    public final BaseScreen a;
    public final kl b;
    public a c;
    public i d;
    public b e;
    public e f;
    public sx.b g;
    public af2.e h;
    public iv0.b i;
    public sa1.b j;
    public Provider<RemotePurchaseDataSource> k;
    public py.b l;
    public Provider<RedditBillingManager> m;
    public i n;
    public a o;
    public Provider<ze0.e> p;
    
    public xh(final kl b, final BaseScreen a, final c c) {
        this.b = b;
        this.a = a;
        final a c2 = new a((Provider)i$a.a, 15);
        this.c = c2;
        final kl$x6 e = b.e;
        final i d = new i((Provider)new f((Provider)e, (Provider)c2, 15), (Provider)e, 11);
        this.d = d;
        final b e2 = new b((Provider)e, (Provider)d, 11);
        this.e = e2;
        this.f = new e((Provider)d, (Provider)e2, (Provider)e, 7);
        this.g = new sx.b((Provider)e, (Provider)d, (Provider)e2, (Provider)new d((Provider)e, (Provider)d, (Provider)e2, 7), (Provider)new py.b((Provider)b.R2, (Provider)e, 9), 2);
        final af2.e a2 = af2.e.a((Object)a);
        this.h = a2;
        this.i = iv0.b.b((Provider)a2);
        this.j = sa1.b.a((Provider)this.h);
        final Provider a3 = af2.h.a((Provider)rx.b.a((Provider)b.X0));
        this.k = (Provider<RemotePurchaseDataSource>)a3;
        this.l = py.b.a(a3, (Provider)b.Y0);
        final Provider b2 = af2.c.b((Provider)vx.c.b((Provider)this.i, (Provider)this.j, (Provider)this.l, (Provider)b.u0, (Provider)b.M, (Provider)b.Z0, (Provider)b.a1, (Provider)b.H, (Provider)b.z, (Provider)uz.i.a((Provider)b.u0, (Provider)b.e), (Provider)b.b1, (Provider)b.x0));
        this.m = (Provider<RedditBillingManager>)b2;
        final i n = new i((Provider)new mw.b(b2, 14), (Provider)this.c, 12);
        this.n = n;
        final a o = new a((Provider)new b40.b(b2, 12), 17);
        this.o = o;
        final k i0 = b.i0;
        final kl$x6 e3 = b.e;
        final da0.b a4 = b$a.a;
        final u60.e a5 = u60.e.a((Provider)i0, (Provider)this.g, (Provider)n, (Provider)o, (Provider)b.R2, (Provider)new e40.d((Provider)i0, (Provider)a4, (Provider)e3, 1), (Provider)new b((Provider)new a((Provider)b.c, 13), (Provider)a4, 9), (Provider)new d00.c((Provider)c$a.a, (Provider)w60.b$a.a, 10), (Provider)new rx.b((Provider)e3, 15), (Provider)e3);
        final e e4 = new e((Provider)b.h, (Provider)b.i, (Provider)b.j, 6);
        final kl$x6 e5 = b.e;
        this.p = (Provider<ze0.e>)af2.c.b((Provider)new k((Provider)w10.a.b((Provider)b.i0, (Provider)this.f, (Provider)this.g, (Provider)this.e, (Provider)this.d, (Provider)a5, (Provider)this.n, (Provider)this.o, (Provider)b.S2, (Provider)b.T2, (Provider)e5, (Provider)new f((Provider)e4, (Provider)e5, 13)), (Provider)new a((Provider)this.f, 16), (Provider)b.U2, 7));
    }
    
    public final m a() {
        final zg2.a c = iv0.b.c(this.a);
        final j i = kl.I(this.b);
        final q20.b k4 = ((e0)this.b.a).k4();
        kz0.k.N((Object)k4);
        final ix1.d d = new ix1.d();
        final t p = ((e0)this.b.a).P();
        kz0.k.N((Object)p);
        final e80.d x8 = ((e0)this.b.a).x8();
        kz0.k.N((Object)x8);
        return new m(c, i, k4, d, p, x8, new mx1.a());
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
