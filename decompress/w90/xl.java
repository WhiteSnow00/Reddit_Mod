// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import h00.i;
import g60.u1;
import bs0.h;
import c00.j;
import com.reddit.domain.model.predictions.PredictionCommentDomainModelMapper_Factory;
import os0.d$a;
import of0.k0;
import com.reddit.screen.BaseScreen;
import g60.j1;
import hg0.c;
import m32.l;
import ps0.d;
import com.reddit.events.emailverification.EmailVerificationAnalytics;
import com.reddit.events.emailcollection.EmailCollectionAnalytics;
import com.reddit.events.recentchats.RecentChatAnalytics;
import ca0.o0;
import q32.b;
import ls1.a;
import javax.inject.Provider;
import af2.e;

public final class xl implements du
{
    public e A;
    public Provider<a> B;
    public Provider<yy1.a> C;
    public e D;
    public Provider<dh0.a> E;
    public Provider<b> F;
    public Provider<ws0.a> G;
    public final kl a;
    public e b;
    public o0 c;
    public Provider<RecentChatAnalytics> d;
    public e e;
    public iv0.b f;
    public Provider<hg0.a> g;
    public Provider<ng0.a> h;
    public Provider<cg0.a> i;
    public Provider<ig0.a> j;
    public Provider<EmailCollectionAnalytics> k;
    public Provider<EmailVerificationAnalytics> l;
    public Provider<ps0.e> m;
    public Provider<d> n;
    public n20.b o;
    public Provider<l> p;
    public c q;
    public e r;
    public l40.a s;
    public sa1.b t;
    public sa1.b u;
    public j1 v;
    public yq1.d w;
    public Provider<fx.a> x;
    public hx.a y;
    public Provider<bs0.d> z;
    
    public xl(final kl a, final BaseScreen baseScreen, final bs0.e e, final yy1.b b, final q32.c c, final String s, final zg2.a a2) {
        this.a = a;
        this.b = af2.e.a((Object)e);
        final kl.o2 f = a.F;
        this.c = new o0((Provider)f, 14);
        this.d = (Provider<RecentChatAnalytics>)af2.c.b((Provider)new xb0.b((Provider)f, 15));
        final e a3 = af2.e.a((Object)baseScreen);
        this.e = a3;
        final iv0.b b2 = iv0.b.b((Provider)a3);
        this.f = b2;
        this.g = (Provider<hg0.a>)af2.c.b((Provider)new c((Provider)b2, (Provider)a.P, 0));
        this.h = (Provider<ng0.a>)af2.c.b((Provider)new vx.b((Provider)this.f, (Provider)a.P, 17));
        this.i = (Provider<cg0.a>)af2.c.b((Provider)new uy.b((Provider)a.M, (Provider)a.g0, (Provider)a.g2, 18));
        this.j = (Provider<ig0.a>)af2.c.b((Provider)new w30.b((Provider)a.M, (Provider)a.g0, (Provider)a.g2, 19));
        this.k = (Provider<EmailCollectionAnalytics>)af2.c.b((Provider)new k0((Provider)a.F, 8));
        this.l = (Provider<EmailVerificationAnalytics>)af2.c.b((Provider)new ug0.a((Provider)a.F, 6));
        final Provider b3 = af2.c.b((Provider)d$a.a);
        this.m = (Provider<ps0.e>)b3;
        this.n = (Provider<d>)af2.c.b((Provider)new zy.e((Provider)a.g0, b3, (Provider)a.a4, 21));
        this.o = n20.b.b((Provider)this.f, (Provider)a.P, (Provider)a.R, (Provider)a.t4);
        this.p = (Provider<l>)af2.c.b((Provider)this.b);
        this.q = new c((Provider)new nx.c((Provider)a.c, (Provider)a.M, (Provider)a.x3, (Provider)a.d4, 7), (Provider)kq0.d$a.a, 7);
        this.r = af2.e.a((Object)a2);
        this.s = new l40.a((Provider)this.p, (Provider)a.b4, (Provider)a.c4, (Provider)this.q, (Provider)this.r, (Provider)new ei1.a((Object)e40.d.a((Provider)a.z, (Provider)a.h0, PredictionCommentDomainModelMapper_Factory.create()), 2), 10);
        final sa1.b a4 = sa1.b.a((Provider)this.e);
        this.t = a4;
        this.u = sa1.b.b((Provider)a4);
        this.v = j1.a((Provider)a.l, (Provider)a.u4, (Provider)a.g0, (Provider)a.D3, (Provider)a.t3, (Provider)a.b0, (Provider)a.v4, (Provider)a.M, (Provider)a.w4, (Provider)a.x4, (Provider)a.f2, (Provider)a.o, (Provider)a.y4);
        this.w = new yq1.d((Provider)a.P, (Provider)this.t, 3);
        this.x = (Provider<fx.a>)af2.c.b((Provider)gx.b.a((Provider)a.B, (Provider)a.C, (Provider)a.l, (Provider)a.D, (Provider)a.E, (Provider)a.c));
        final ug0.a a5 = new ug0.a((Provider)a.F, 0);
        final e e2 = this.e;
        final kl.na p7 = a.P;
        final kl.k3 c2 = a.C;
        this.y = new hx.a((Provider)e2, (Provider)p7, (Provider)c2, (Provider)a5, 0);
        final x40.a a6 = x40.a.a((Provider)a.P, (Provider)a.s3, (Provider)a.t3, (Provider)a.C, (Provider)this.f, (Provider)a.u3, (Provider)d00.c.e((Provider)a.v3, (Provider)c2), (Provider)a.v3);
        final o0 o0 = new o0((Provider)a.F, 11);
        final kl$a1 o2 = a.O1;
        final kl.c1 b4 = a.B4;
        final kl.p m3 = a.m3;
        final kl$u c3 = a.C4;
        final kl$z1 s2 = a.S;
        final e b5 = this.b;
        final iv0.b f2 = this.f;
        final kl$s7 i = a.M;
        this.z = (Provider<bs0.d>)af2.c.b((Provider)new h(a.J0, a.z, (Provider)b5, a.H, a.g2, i, a.u0, (Provider)this.c, a.x3, a.s4, a.W3, (Provider)this.d, a.X3, a.V1, a.g0, a.D, a.r0, a.x0, a.n1, a.Y3, (Provider)this.g, (Provider)this.h, (Provider)this.i, (Provider)this.j, (Provider)this.k, (Provider)this.l, (Provider)this.n, a.j4, a.V, a.p1, (Provider)this.o, (Provider)this.s, (Provider)this.u, (Provider)this.v, (Provider)this.w, (Provider)this.x, (Provider)this.y, (Provider)a6, a.o, a.z4, a.v0, a.H2, a.b0, a.M0, (Provider)f2, a.Q2, a.R, a.A4, (Provider)new j((Provider)o2, (Provider)b4, (Provider)m3, (Provider)c3, (Provider)s2, (Provider)b5, (Provider)f2, (Provider)o0, (Provider)i, (Provider)a.N, 4), a.x1));
        this.A = af2.e.a((Object)b);
        this.B = (Provider<a>)af2.c.b((Provider)w30.d.b((Provider)this.f, (Provider)this.e, (Provider)a.P, (Provider)a.y0, (Provider)a.E0, (Provider)a.x0));
        this.C = (Provider<yy1.a>)af2.c.b((Provider)u1.a((Provider)this.A, (Provider)a.h1, this.B, (Provider)a.V, (Provider)a.x0, (Provider)af2.e.a((Object)s), (Provider)a.l, (Provider)a.D4));
        this.D = af2.e.a((Object)c);
        final Provider b6 = af2.c.b((Provider)new xb0.b((Provider)a.F, 9));
        this.E = (Provider<dh0.a>)b6;
        this.F = (Provider<b>)af2.c.b((Provider)new i((Provider)this.D, (Provider)a.n1, (Provider)this.w, (Provider)a.E4, b6, 16));
        this.G = (Provider<ws0.a>)af2.c.b((Provider)p40.a.a((Provider)this.f, (Provider)a.P, (Provider)a.N, (Provider)this.e));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
