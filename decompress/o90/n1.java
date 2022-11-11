// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import be1.h;
import qp1.g$a;
import hg0.f;
import nx0.g;
import f40.a;
import m20.c;
import cx.b;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;
import se2.e;

public final class n1
{
    public final z0 a;
    public e b;
    public Provider<ChatAnalytics> c;
    public e d;
    public b e;
    public nx.b f;
    public Provider<c> g;
    public hx.c h;
    public oa1.b i;
    public a j;
    public q30.e k;
    public Provider<lp1.a> l;
    
    public n1(final z0 a, final rg2.a a2, final lp1.b b, final rg2.a a3) {
        this.a = a;
        this.b = se2.e.a((Object)b);
        this.c = (Provider<ChatAnalytics>)se2.c.b((Provider)px.a.a((Provider)a.K0, nx0.g.a((Provider)a.K0, (Provider)a.r), (Provider)a.b0, (Provider)a.c, (Provider)a.h));
        final e a4 = se2.e.a((Object)a2);
        this.d = a4;
        this.e = cx.b.b((Provider)a4, (Provider)a.j0, (Provider)a.w, (Provider)a.L0, (Provider)a.M0, (Provider)a.N0);
        this.f = new nx.b((Provider)a.O0, 29);
        final Provider b2 = se2.c.b((Provider)oa1.b.a((Provider)this.d));
        this.g = (Provider<c>)b2;
        final z0.z0$s9 m = a.m;
        final z0.y0 k0 = a.K0;
        final z0.z0$r d0 = a.D0;
        final e d2 = this.d;
        final z0.z0 p4 = a.P0;
        this.h = new hx.c((Provider)m, (Provider)k0, (Provider)d0, (Provider)d2, (Provider)p4, 13);
        this.i = new oa1.b((Object)m, 8);
        this.j = new a(b2, (Provider)k0, (Provider)a.c, (Provider)d2, (Provider)p4, (Provider)new q30.b((Provider)a.Q0, (Provider)m, (Provider)d0, 25), 6);
        final com.reddit.metrics.a a5 = new com.reddit.metrics.a((Provider)hg0.f.c((Provider)a.j), (Provider)a.i, 8);
        final z0.x9 c = a.c;
        final oa1.b i = this.i;
        final a j = this.j;
        final hx.c h = this.h;
        final z0.z0 p5 = a.P0;
        this.k = new q30.e(this.g, (Provider)h, (Provider)new oy.e((Provider)c, (Provider)i, (Provider)j, (Provider)h, (Provider)p5, (Provider)a5, 6), (Provider)p5, (Provider)g$a.a, (Provider)a.R0, 10);
        final zz.c a6 = zz.c.a((Provider)se2.e.a((Object)a3), (Provider)a.w);
        final z0.z0$s9 l = a.m;
        this.l = (Provider<lp1.a>)se2.c.b((Provider)new lp1.c((Provider)this.b, (Provider)this.c, (Provider)this.e, (Provider)this.f, (Provider)this.k, a.O0, a.S0, (Provider)a6, a.T0, a.e, a.c, new h((Provider)l, 5), a.K0, a.P0, l, a.R0, a.U0, a.V0, a.W0, a.r));
    }
}
