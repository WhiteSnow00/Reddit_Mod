// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import bq1.g;
import aq1.d$a;
import bq1.g$a;
import e40.k;
import lx.d;
import q20.c;
import ei1.a;
import ca0.o0;
import n20.b;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;
import af2.e;

public final class s1
{
    public final a1 a;
    public e b;
    public Provider<ChatAnalytics> c;
    public e d;
    public b e;
    public o0 f;
    public a g;
    public Provider<c> h;
    public bb0.b i;
    public sx.b j;
    public Provider<dq1.a> k;
    
    public s1(final a1 a, final zg2.a a2, final dq1.b b) {
        this.a = a;
        this.b = af2.e.a((Object)b);
        this.c = (Provider<ChatAnalytics>)af2.c.b((Provider)lx.d.a((Provider)a.I0, n41.c.b((Provider)a.I0, (Provider)a.r), (Provider)a.b0, (Provider)a.c, (Provider)a.h));
        final e a3 = af2.e.a((Object)a2);
        this.d = a3;
        this.e = n20.b.b((Provider)a3, (Provider)a.w, (Provider)a.J0, (Provider)a.K0);
        this.f = new o0((Provider)a.L0, 1);
        this.g = new a((Object)a.m, 1);
        final Provider b2 = af2.c.b((Provider)ei1.a.a((Provider)this.d));
        this.h = (Provider<c>)b2;
        final a1$v n0 = a.N0;
        final a1$p9 m = a.m;
        final a1$r c0 = a.C0;
        final k k = new k((Provider)n0, (Provider)m, (Provider)c0, 29);
        final a1$y0 i0 = a.I0;
        final a1$u9 c2 = a.c;
        final e d = this.d;
        final a1$z0 m2 = a.M0;
        this.i = new bb0.b(b2, (Provider)i0, (Provider)c2, (Provider)d, (Provider)m2, (Provider)k, 6);
        this.j = new sx.b((Provider)m, (Provider)i0, (Provider)c0, (Provider)d, (Provider)m2, 9);
        final kf1.b b3 = new kf1.b((Provider)vg0.a.b((Provider)a.j), (Provider)a.i, 1);
        final a1$u9 c3 = a.c;
        final a g = this.g;
        final bb0.b j = this.i;
        final sx.b l = this.j;
        final a1$z0 m3 = a.M0;
        final w30.d d2 = new w30.d((Provider)c3, (Provider)g, (Provider)j, (Provider)l, (Provider)m3, (Provider)b3, 5);
        final g a4 = g$a.a;
        final a1.e1 o0 = a.O0;
        final v40.d d3 = new v40.d((Provider)d2, (Provider)m3, (Provider)a4, (Provider)o0, 7);
        final a1$p9 m4 = a.m;
        this.k = (Provider<dq1.a>)af2.c.b((Provider)new c60.c((Provider)this.b, (Provider)this.c, (Provider)this.e, (Provider)this.f, (Provider)d3, (Provider)a.L0, (Provider)new iv0.b((Provider)m4, 14), (Provider)a.e, (Provider)d$a.a, (Provider)m3, (Provider)a4, (Provider)o0, (Provider)m4, (Provider)a.R0, (Provider)a.r, 4));
    }
}
