// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import vs1.c$a;
import rh0.b$a;
import ca0.o0;
import of0.k0;
import qv1.j$a;
import x10.j;
import jl0.i;
import nv1.f;
import com.reddit.events.onboardingchaining.OnboardingChainingAnalytics;
import com.reddit.typeahead.QueryFormationPresenter;
import p22.h;
import q20.c;
import mx.b;
import yq1.d;
import n42.g;
import javax.inject.Provider;
import af2.e;
import android.content.Context;
import android.app.Activity;
import zg2.a;

public final class rr
{
    public final a<? extends Activity> a;
    public final a<? extends Context> b;
    public e c;
    public e d;
    public Provider<sg0.a> e;
    public e f;
    public Provider<g> g;
    public d h;
    public ei1.a i;
    public v10.e j;
    public b k;
    public Provider<jl0.d> l;
    public a40.g m;
    public Provider<c> n;
    public ms1.a o;
    public Provider<com.reddit.screens.listing.mapper.a> p;
    public Provider<wh0.a> q;
    public Provider<h> r;
    public Provider<QueryFormationPresenter> s;
    public Provider<kz0.b> t;
    public Provider<rh0.a> u;
    public Provider<pi0.a> v;
    public Provider<OnboardingChainingAnalytics> w;
    public Provider<vs1.b> x;
    public Provider<vs1.a> y;
    
    public rr(final kl kl, final a b, final a a, final p22.d d, final f f) {
        this.a = (a<? extends Activity>)a;
        this.b = (a<? extends Context>)b;
        this.c = af2.e.a((Object)d);
        this.d = af2.e.a((Object)f);
        this.e = (Provider<sg0.a>)af2.c.b((Provider)sx.c.a((Provider)kl.F, (Provider)kl.R0, (Provider)kl.S0, uy.b.c((Provider)kl.z, (Provider)kl.T0, (Provider)kl.L)));
        final e a2 = af2.e.a((Object)b);
        this.f = a2;
        final Provider b2 = af2.c.b((Provider)ei1.a.b((Provider)a2));
        this.g = (Provider<g>)b2;
        this.h = yq1.d.a(b2, (Provider)kl.H0);
        this.i = ei1.a.c((Provider)kl.z);
        this.j = v10.e.a((Provider)kl.h0, (Provider)kl.z, (Provider)this.f, (Provider)kl.l, (Provider)kl.d, (Provider)kl.H1, (Provider)kl.x0, (Provider)this.i, (Provider)mw.b.b(), (Provider)kl.I1, (Provider)kl.A0);
        this.k = mx.b.a((Provider)ht.b.b());
        this.l = (Provider<jl0.d>)af2.h.a((Provider)jl0.i.a((Provider)kl.z));
        this.m = a40.g.a((Provider)kl.z, (Provider)this.l, (Provider)kl.l, (Provider)vg0.a.b((Provider)kl.t0), (Provider)kl.d, (Provider)kl.K1, (Provider)kl.L1, (Provider)kl.M1);
        final Provider b3 = af2.c.b((Provider)ei1.a.a((Provider)this.f));
        this.n = (Provider<c>)b3;
        this.o = ms1.a.b(b3, (Provider)kl.b0);
        this.p = (Provider<com.reddit.screens.listing.mapper.a>)af2.c.b((Provider)x10.j.b((Provider)kl.s0, (Provider)kl.t0, (Provider)kl.g0, (Provider)kl.u0, (Provider)uz.i.c((Provider)kl.v0, (Provider)kl.w0)));
        final Provider b4 = af2.c.b((Provider)vg0.a.d((Provider)kl.F));
        this.q = (Provider<wh0.a>)b4;
        this.r = (Provider<h>)af2.c.b((Provider)new wc1.e((Provider)this.c, (Provider)this.d, (Provider)kl.U3, (Provider)this.e, (Provider)kl.H, (Provider)kl.z, (Provider)ul0.h.a((Provider)kl.u0, (Provider)kl.t0, (Provider)kl.E1, (Provider)kl.F1, (Provider)this.h, (Provider)kl.h0, (Provider)kl.G1, (Provider)kl.H0, (Provider)this.j, (Provider)this.k, (Provider)kl.J1, (Provider)this.m, (Provider)kl.z, (Provider)kl.N1, (Provider)kl.r0, (Provider)kl.O1, (Provider)kl.P1, (Provider)kl.O0, (Provider)kl.x0, (Provider)kl.Q1, (Provider)this.o, (Provider)kl.I, (Provider)this.p, (Provider)p40.a.d((Provider)kl.O1, (Provider)kl.I, (Provider)this.n, b4)), (Provider)kl.u0, (Provider)kl.G0, (Provider)kl.U0, (Provider)kl.V0, (Provider)kl.O0, (Provider)kl.N0, (Provider)kl.R0, (Provider)kl.g4, 3));
        final kf1.b b5 = new kf1.b((Provider)j$a.a, (Provider)kl.z2, 4);
        final kl.o2 f2 = kl.F;
        final k0 k0 = new k0((Provider)f2, 6);
        final e f3 = this.f;
        final kl.o0 s1 = kl.S1;
        final hg0.c c = new hg0.c((Provider)f3, (Provider)s1, 10);
        final k0 k2 = new k0((Provider)f2, 11);
        final kl.na p5 = kl.P;
        final kl.b g4 = kl.g4;
        final kl$s7 m = kl.M;
        this.s = (Provider<QueryFormationPresenter>)af2.c.b((Provider)new p22.b((Provider)this.c, (Provider)this.d, kl.U3, kl.h0, kl.z, kl.W4, (Provider)this.e, m, kl.H, s1, kl.t0, (Provider)b5, g4, kl.U0, g4, kl.V0, kl.R0, (Provider)k0, (Provider)c, new l40.a((Provider)p5, (Provider)k2, (Provider)g4, (Provider)s1, (Provider)f3, (Provider)m, 12), (Provider)k2));
        this.t = (Provider<kz0.b>)af2.c.b((Provider)o0.g((Provider)kl.F));
        final Provider b6 = af2.c.b((Provider)b$a.a);
        this.u = (Provider<rh0.a>)b6;
        this.v = (Provider<pi0.a>)af2.c.b((Provider)mx.b.b((Provider)kl.F, b6));
        this.w = (Provider<OnboardingChainingAnalytics>)af2.c.b((Provider)o0.b((Provider)kl.F));
        final Provider b7 = af2.c.b((Provider)c$a.a);
        this.x = (Provider<vs1.b>)b7;
        this.y = (Provider<vs1.a>)af2.c.b((Provider)cx.b.a(b7, (Provider)kl.p3, (Provider)kl.S0, (Provider)kl.q2, (Provider)kl.O0));
    }
}
