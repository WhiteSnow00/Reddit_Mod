// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import nj1.d;
import pp1.d$a;
import be1.h;
import b40.k0;
import qp1.g$a;
import hg0.f;
import nx0.g;
import f40.a;
import nx.c;
import cx.b;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;
import se2.e;

public final class r1
{
    public final z0 a;
    public e b;
    public Provider<ChatAnalytics> c;
    public e d;
    public b e;
    public c f;
    public oa1.b g;
    public Provider<m20.c> h;
    public a i;
    public hx.c j;
    public Provider<sp1.a> k;
    
    public r1(final z0 a, final rg2.a a2, final sp1.b b) {
        this.a = a;
        this.b = se2.e.a((Object)b);
        this.c = (Provider<ChatAnalytics>)se2.c.b((Provider)px.a.a((Provider)a.K0, nx0.g.a((Provider)a.K0, (Provider)a.r), (Provider)a.b0, (Provider)a.c, (Provider)a.h));
        final e a3 = se2.e.a((Object)a2);
        this.d = a3;
        this.e = cx.b.b((Provider)a3, (Provider)a.j0, (Provider)a.w, (Provider)a.L0, (Provider)a.M0, (Provider)a.N0);
        this.f = new c((Provider)a.O0, 25);
        this.g = new oa1.b((Object)a.m, 8);
        final Provider b2 = se2.c.b((Provider)oa1.b.a((Provider)this.d));
        this.h = (Provider<m20.c>)b2;
        final z0.v q0 = a.Q0;
        final z0.z0$s9 m = a.m;
        final z0.z0$r d0 = a.D0;
        final q30.b b3 = new q30.b((Provider)q0, (Provider)m, (Provider)d0, 25);
        final z0.y0 k0 = a.K0;
        final z0.x9 c = a.c;
        final e d2 = this.d;
        final z0.z0 p3 = a.P0;
        this.i = new a(b2, (Provider)k0, (Provider)c, (Provider)d2, (Provider)p3, (Provider)b3, 6);
        this.j = new hx.c((Provider)m, (Provider)k0, (Provider)d0, (Provider)d2, (Provider)p3, 13);
        final com.reddit.metrics.a a4 = new com.reddit.metrics.a((Provider)hg0.f.c((Provider)a.j), (Provider)a.i, 8);
        final z0.x9 c2 = a.c;
        final oa1.b g = this.g;
        final a i = this.i;
        final hx.c j = this.j;
        final z0.z0 p4 = a.P0;
        final oy.e e = new oy.e((Provider)c2, (Provider)g, (Provider)i, (Provider)j, (Provider)p4, (Provider)a4, 6);
        final qp1.g a5 = g$a.a;
        final z0.z0$e1 r0 = a.R0;
        final k0 k2 = new k0((Provider)e, (Provider)p4, (Provider)a5, (Provider)r0, 18);
        final z0.z0$s9 l = a.m;
        this.k = (Provider<sp1.a>)se2.c.b((Provider)new d((Provider)this.b, (Provider)this.c, (Provider)this.e, (Provider)this.f, (Provider)k2, (Provider)a.O0, (Provider)new h((Provider)l, 5), (Provider)a.e, (Provider)d$a.a, (Provider)p4, (se2.d)a5, (Provider)r0, (Provider)l, (Provider)a.U0, a.r, 1));
    }
}
