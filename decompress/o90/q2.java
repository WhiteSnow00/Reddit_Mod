// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import v40.k;
import se2.h;
import mg0.x;
import m20.c;
import ox.b;
import hi0.a0;
import javax.inject.Provider;
import wb0.a;
import se2.e;

public final class q2
{
    public final z0 a;
    public e b;
    public e c;
    public e d;
    public a e;
    public Provider<a0> f;
    public b g;
    public Provider<c> h;
    public Provider<ub1.b> i;
    
    public q2(final z0 a, final ub1.c c, final rg2.a a2, final rg2.a a3, final ub1.a a4) {
        this.a = a;
        this.b = se2.e.a((Object)a3);
        this.c = se2.e.a((Object)c);
        this.d = se2.e.a((Object)a4);
        this.e = wb0.a.c((Provider)a.y);
        this.f = (Provider<a0>)se2.h.a((Provider)x.a((Provider)a.h));
        final e a5 = se2.e.a((Object)a2);
        final e c2 = this.c;
        final e b = this.b;
        this.g = new b((Provider)new ox.c((Provider)c2, (Provider)a5, (Provider)b, (Provider)a.w, 12), (Provider)this.f, (Provider)new oa1.b((Object)this.d, 1), (Provider)a.y, (Provider)a.r, 11);
        final Provider b2 = se2.c.b((Provider)oa1.b.a((Provider)b));
        this.h = (Provider<c>)b2;
        this.i = (Provider<ub1.b>)se2.c.b((Provider)new do0.k((Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)a.r1, (Provider)this.e, (Provider)a.y, (Provider)a.D, (Provider)a.j, (Provider)a.b0, (Provider)this.f, (Provider)a.e, (Provider)a.p0, (Provider)a.k, (Provider)a.s1, (Provider)this.g, (Provider)a.l0, (Provider)new k((Provider)a.c0, b2, (Provider)a.t1, 14), (Provider)a.w, (Provider)a.r, (Provider)a.u1, (Provider)a.v1, (Provider)a.w1, (Provider)a.x1, (Provider)a.m1, 1));
    }
}
