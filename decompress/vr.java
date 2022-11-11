// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import my1.b$a;
import x10.j;
import jl0.i;
import com.reddit.events.common.AnalyticsScreenReferrer;
import dv1.h;
import com.reddit.screen.BaseScreen;
import dv1.d;
import com.reddit.events.userprofile.UserProfileAnalytics;
import com.reddit.events.trophy.TrophyAnalytics;
import n41.c;
import dv1.k;
import of0.k0;
import iv0.b;
import af2.e;
import com.reddit.events.usermodal.UserModalAnalytics;
import dv1.g;
import com.reddit.screens.listing.mapper.a;
import javax.inject.Provider;

public final class vr implements du
{
    public Provider<a> A;
    public Provider<wh0.a> B;
    public Provider<g> C;
    public Provider<UserModalAnalytics> D;
    public Provider<my1.a> E;
    public final kl a;
    public e b;
    public b c;
    public ex.b d;
    public k0 e;
    public Provider<o20.a> f;
    public k g;
    public c h;
    public e i;
    public mx.b j;
    public Provider<TrophyAnalytics> k;
    public xb0.b l;
    public Provider<UserProfileAnalytics> m;
    public e n;
    public d o;
    public vg0.a p;
    public vg0.a q;
    public Provider<n42.g> r;
    public yq1.d s;
    public ei1.a t;
    public v10.e u;
    public mx.b v;
    public Provider<jl0.d> w;
    public a40.g x;
    public Provider<q20.c> y;
    public ms1.a z;
    
    public vr(final kl a, final BaseScreen baseScreen, final h h, final ie0.h h2, final AnalyticsScreenReferrer analyticsScreenReferrer) {
        this.a = a;
        this.b = af2.e.a((Object)h);
        this.c = iv0.b.b((Provider)af2.e.a((Object)baseScreen));
        this.d = ex.b.a((Provider)a.J);
        this.e = new k0((Provider)a.F, 4);
        this.f = (Provider<o20.a>)af2.c.b((Provider)vx.d.b((Provider)this.c, (Provider)a.N, (Provider)a.P));
        final b c = this.c;
        this.g = new k((Provider)c, (Provider)a.n1, (Provider)a.P, 0);
        this.h = n41.c.a((Provider)c, (Provider)a.f1);
        this.i = af2.e.b((Object)analyticsScreenReferrer);
        this.j = new mx.b((Provider)a.p1, (Provider)a.m1, 11);
        this.k = (Provider<TrophyAnalytics>)af2.c.b((Provider)new vg0.a((Provider)a.F, 14));
        this.l = xb0.b.c((Provider)a.F);
        this.m = (Provider<UserProfileAnalytics>)af2.c.b((Provider)k0.a((Provider)a.F));
        this.n = af2.e.b((Object)h2);
        final b c2 = this.c;
        this.o = new d((Provider)c2, (Provider)a.B1, 0);
        final kl.o2 f = a.F;
        this.p = new vg0.a((Provider)f, 8);
        this.q = new vg0.a((Provider)f, 7);
        final Provider b = af2.c.b((Provider)ei1.a.b((Provider)c2));
        this.r = (Provider<n42.g>)b;
        this.s = yq1.d.a(b, (Provider)a.H0);
        this.t = ei1.a.c((Provider)a.z);
        this.u = v10.e.a((Provider)a.h0, (Provider)a.z, (Provider)this.c, (Provider)a.l, (Provider)a.d, (Provider)a.H1, (Provider)a.x0, (Provider)this.t, (Provider)mw.b.b(), (Provider)a.I1, (Provider)a.A0);
        this.v = mx.b.a((Provider)ht.b.b());
        this.w = (Provider<jl0.d>)af2.h.a((Provider)jl0.i.a((Provider)a.z));
        this.x = a40.g.a((Provider)a.z, (Provider)this.w, (Provider)a.l, (Provider)vg0.a.b((Provider)a.t0), (Provider)a.d, (Provider)a.K1, (Provider)a.L1, (Provider)a.M1);
        final Provider b2 = af2.c.b((Provider)ei1.a.a((Provider)this.c));
        this.y = (Provider<q20.c>)b2;
        this.z = ms1.a.b(b2, (Provider)a.b0);
        this.A = (Provider<a>)af2.c.b((Provider)x10.j.b((Provider)a.s0, (Provider)a.t0, (Provider)a.g0, (Provider)a.u0, (Provider)uz.i.c((Provider)a.v0, (Provider)a.w0)));
        final Provider b3 = af2.c.b((Provider)vg0.a.d((Provider)a.F));
        this.B = (Provider<wh0.a>)b3;
        this.C = (Provider<g>)af2.c.b((Provider)new o71.e((Provider)this.b, (Provider)a.l1, (Provider)a.j, (Provider)a.H, (Provider)a.m1, (Provider)this.c, (Provider)this.d, (Provider)a.n0, (Provider)this.e, (Provider)a.M, (Provider)a.u0, (Provider)this.f, (Provider)this.g, (Provider)this.h, (Provider)a.P, (Provider)this.i, (Provider)a.o1, (Provider)this.j, (Provider)a.q1, (Provider)this.k, (Provider)this.l, (Provider)this.m, (Provider)this.n, (Provider)a.r1, (Provider)a.s1, (Provider)a.d, (Provider)a.o, (Provider)a.t1, (Provider)a.u1, (Provider)a.B0, (Provider)a.z1, (Provider)a.A1, (Provider)this.o, (Provider)this.p, (Provider)this.q, (Provider)a.C1, (Provider)a.D1, (Provider)a.Y, (Provider)ul0.h.a((Provider)a.u0, (Provider)a.t0, (Provider)a.E1, (Provider)a.F1, (Provider)this.s, (Provider)a.h0, (Provider)a.G1, (Provider)a.H0, (Provider)this.u, (Provider)this.v, (Provider)a.J1, (Provider)this.x, (Provider)a.z, (Provider)a.N1, (Provider)a.r0, (Provider)a.O1, (Provider)a.P1, (Provider)a.O0, (Provider)a.x0, (Provider)a.Q1, (Provider)this.z, (Provider)a.I, (Provider)this.A, (Provider)p40.a.d((Provider)a.O1, (Provider)a.I, (Provider)this.y, b3)), (Provider)a.R1, (Provider)a.R, (Provider)a.e, 1));
        this.D = (Provider<UserModalAnalytics>)af2.c.b((Provider)xb0.b.d((Provider)a.F));
        this.E = (Provider<my1.a>)af2.h.a((Provider)b$a.a);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
