// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import bq1.g;
import in0.v;
import aq1.d$a;
import bq1.g$a;
import e40.k;
import lx.d;
import q20.c;
import ot2.a;
import n20.b;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;
import af2.e;

public final class o1
{
    public final a1 a;
    public e b;
    public Provider<ChatAnalytics> c;
    public e d;
    public b e;
    public a f;
    public Provider<c> g;
    public sx.b h;
    public ei1.a i;
    public bb0.b j;
    public gx.b k;
    public Provider<wp1.a> l;
    
    public o1(final a1 a, final zg2.a a2, final wp1.b b, final zg2.a a3) {
        this.a = a;
        this.b = af2.e.a((Object)b);
        this.c = (Provider<ChatAnalytics>)af2.c.b((Provider)lx.d.a((Provider)a.I0, n41.c.b((Provider)a.I0, (Provider)a.r), (Provider)a.b0, (Provider)a.c, (Provider)a.h));
        final e a4 = af2.e.a((Object)a2);
        this.d = a4;
        this.e = n20.b.b((Provider)a4, (Provider)a.w, (Provider)a.J0, (Provider)a.K0);
        this.f = new a((Provider)a.L0, 1);
        final Provider b2 = af2.c.b((Provider)ei1.a.a((Provider)this.d));
        this.g = (Provider<c>)b2;
        final a1$p9 m = a.m;
        final a1$y0 i0 = a.I0;
        final a1$r c0 = a.C0;
        final e d = this.d;
        final a1$z0 m2 = a.M0;
        this.h = new sx.b((Provider)m, (Provider)i0, (Provider)c0, (Provider)d, (Provider)m2, 9);
        this.i = new ei1.a((Object)m, 1);
        this.j = new bb0.b(b2, (Provider)i0, (Provider)a.c, (Provider)d, (Provider)m2, (Provider)new k((Provider)a.N0, (Provider)m, (Provider)c0, 29), 6);
        final kf1.b b3 = new kf1.b((Provider)vg0.a.b((Provider)a.j), (Provider)a.i, 1);
        final a1$u9 c2 = a.c;
        final ei1.a j = this.i;
        final bb0.b k = this.j;
        final sx.b h = this.h;
        final a1$z0 m3 = a.M0;
        final w30.d d2 = new w30.d((Provider)c2, (Provider)j, (Provider)k, (Provider)h, (Provider)m3, (Provider)b3, 5);
        final Provider<c> g = this.g;
        final g a5 = g$a.a;
        this.k = new gx.b((Provider)g, (Provider)h, (Provider)d2, (Provider)m3, (Provider)a5, (Provider)a.O0, 6);
        final d00.c a6 = d00.c.a((Provider)af2.e.a((Object)a3), (Provider)a.w);
        final a1$p9 l = a.m;
        this.l = (Provider<wp1.a>)af2.c.b((Provider)new v((Provider)this.b, (Provider)this.c, (Provider)this.e, (Provider)this.f, (Provider)this.k, (Provider)a.L0, (Provider)a.P0, (Provider)a6, (Provider)a.Q0, (Provider)a.e, (Provider)a.c, (Provider)new iv0.b((Provider)l, 14), (Provider)d$a.a, (Provider)a.I0, (Provider)a.M0, (Provider)l, (Provider)a5, (Provider)a.O0, (Provider)a.R0, (Provider)a.S0, (Provider)a.T0, (Provider)a.r, 1));
    }
}
