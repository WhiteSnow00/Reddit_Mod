// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import com.reddit.auth.data.RedditAuthRepository;
import com.reddit.session.o;
import qn1.j;
import va0.b0;
import com.reddit.auth.common.sso.RedditSsoAuthProvider;
import xd0.j0;
import xd0.m;
import com.reddit.auth.domain.usecase.SignUpUseCase;
import com.reddit.auth.screen.signup.SignUpViewModel;
import com.reddit.events.auth.AuthAnalytics;
import com.reddit.auth.screen.signup.SignUpPresenter;
import fx.r;
import fx.q;
import fx.s;
import xy.k;
import javax.inject.Provider;
import be1.h;
import hg0.f;
import rx.d;
import se2.e;
import hy.c;
import fx.b;
import com.reddit.screen.BaseScreen;
import com.bluelinelabs.conductor.Router;
import rg2.a;
import com.reddit.auth.screen.signup.SignUpScreen;

public final class nd
{
    public final SignUpScreen a;
    public final a<? extends Router> b;
    public final BaseScreen c;
    public final a<? extends b> d;
    public final c e;
    public final vy.b f;
    public final z0 g;
    public e h;
    public e i;
    public uv0.b j;
    public d k;
    public ox.c l;
    public e m;
    public qy.b n;
    public e o;
    public qy.b p;
    public f q;
    public e r;
    public se2.b s;
    public uv0.b t;
    public h u;
    public xy.f v;
    
    public nd(final z0 g, final SignUpScreen a, final BaseScreen c, final a b, final a d, final c e, final vy.b f, final my.a a2) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = se2.e.a((Object)a);
        final e a3 = se2.e.a((Object)c);
        this.i = a3;
        final uv0.b e2 = uv0.b.e((Provider)a3);
        this.j = e2;
        final z0.z0$s9 m = g.m;
        this.k = new d((Provider)this.h, (Provider)g.K, (Provider)new rx.b((Provider)e2, (Provider)m, 0), 0);
        this.l = new ox.c((Provider)g.c, (Provider)g.N, (Provider)g.M, (Provider)m, 0);
        this.m = se2.e.a((Object)b);
        this.n = qy.b.b((Provider)this.m, (Provider)g.S, (Provider)uw.f.a((Provider)this.j, (Provider)g.C));
        this.o = se2.e.a((Object)d);
        this.p = qy.b.a((Provider)this.n, (Provider)this.o, se2.e.a((Object)e));
        this.q = hg0.f.b((Provider)g.h);
        this.r = se2.e.a((Object)f);
        this.s = new se2.b();
        final e i = this.i;
        this.t = new uv0.b((Provider)i, 9);
        this.u = new h((Provider)i, 0);
        final oa1.b b2 = oa1.b.b((Provider)i);
        final uv0.b t = this.t;
        final h u = this.u;
        final z0.z0$i2 f2 = g.f4;
        final z0.z0$s9 j = g.m;
        final z0.z0$p8 d2 = g.d4;
        final ox.c l = this.l;
        final se2.b s = this.s;
        final qy.b p8 = this.p;
        final f q = this.q;
        final e k = this.i;
        final z0.z0$h6 k2 = g.K;
        this.v = new xy.f((Provider)this.h, (Provider)l, (Provider)g.R, (Provider)g.z, (Provider)p8, (Provider)g.D, (Provider)d2, (Provider)f2, (Provider)q, (Provider)this.r, (Provider)j, (Provider)g.A, (Provider)s, (Provider)g.g4, (Provider)g.A0, (Provider)new k((Provider)t, (Provider)u, (Provider)b2, (Provider)f2, (Provider)j, (Provider)d2, (Provider)l, (Provider)s, (Provider)p8, (Provider)q, (Provider)k, (Provider)k2, 0), (Provider)this.j, (Provider)k2, 0);
        final e a4 = se2.e.a((Object)a2);
        final se2.b s2 = this.s;
        final z0.z0$k r3 = g.R3;
        final e h = this.h;
        final d k3 = this.k;
        final xy.f v = this.v;
        se2.b.a((Provider)s2, se2.c.b((Provider)rx.c.a((Provider)r3, (Provider)h, (Provider)k3, (Provider)v, (Provider)v, (Provider)g.D, (Provider)this.q, (Provider)g.b0, (Provider)a4, (Provider)g.h4, (Provider)g.r, (Provider)g.A0)));
    }
    
    public final qy.a a() {
        final a<? extends Router> b = this.b;
        final q c7 = this.g.a.C7();
        ui.b.n((Object)c7);
        final a g = uv0.b.g(this.c);
        final r g2 = this.g.a.G5();
        ui.b.n((Object)g2);
        return new qy.a((vy.a)new vy.c((a)b, c7, (s)new vy.f(g, g2)), (a)this.d, this.e);
    }
    
    public final SignUpPresenter b() {
        final SignUpScreen a = this.a;
        final SignUpUseCase c = this.c();
        final ox.a a2 = this.g.a.A1();
        ui.b.n((Object)a2);
        final ox.d s3 = this.g.a.S3();
        ui.b.n((Object)s3);
        final qy.a a3 = this.a();
        final m d = this.g.a.d();
        ui.b.n((Object)d);
        final j0 r4 = this.g.a.R4();
        ui.b.n((Object)r4);
        final jx.e u0 = this.g.a.u0();
        ui.b.n((Object)u0);
        final l40.e s4 = this.g.a.S4();
        ui.b.n((Object)s4);
        final AuthAnalytics authAnalytics = new AuthAnalytics(s4);
        final vy.b f = this.f;
        final m20.b i4 = this.g.a.i4();
        ui.b.n((Object)i4);
        final RedditSsoAuthProvider s5 = this.g.a.s6();
        ui.b.n((Object)s5);
        final pe2.a a4 = se2.c.a((Provider)this.s);
        final b0 m = this.g.a.m();
        ui.b.n((Object)m);
        final va0.s p = this.g.a.P();
        ui.b.n((Object)p);
        final ej2.b0 h = uv0.b.h(this.c);
        final gk1.a b = be1.h.b(this.c);
        final j c2 = oa1.b.c(this.c);
        final jx.e u2 = this.g.a.u0();
        ui.b.n((Object)u2);
        final m20.b i5 = this.g.a.i4();
        ui.b.n((Object)i5);
        final j0 r5 = this.g.a.R4();
        ui.b.n((Object)r5);
        final SignUpUseCase c3 = this.c();
        final pe2.a a5 = se2.c.a((Provider)this.s);
        final qy.a a6 = this.a();
        final l40.e s6 = this.g.a.S4();
        ui.b.n((Object)s6);
        final AuthAnalytics authAnalytics2 = new AuthAnalytics(s6);
        final BaseScreen c4 = this.c;
        final cw0.a a7 = this.g.a.a();
        ui.b.n((Object)a7);
        final SignUpViewModel signUpViewModel = new SignUpViewModel(h, (h1.b)b, c2, (fx.e)u2, i5, r5, c3, a5, (fx.a)a6, authAnalytics2, (kb1.s)c4, a7);
        final a g = uv0.b.g(this.c);
        final cw0.a a8 = this.g.a.a();
        ui.b.n((Object)a8);
        return new SignUpPresenter((xy.e)a, c, a2, s3, (fx.a)a3, d, r4, (fx.e)u0, authAnalytics, f, i4, (hx.d)s5, a4, m, p, signUpViewModel, g, a8);
    }
    
    public final SignUpUseCase c() {
        final o e = this.g.a.E();
        ui.b.n((Object)e);
        final RedditAuthRepository i3 = this.g.a.i3();
        ui.b.n((Object)i3);
        final jx.a a2 = this.g.a.a2();
        ui.b.n((Object)a2);
        final m20.b i4 = this.g.a.i4();
        ui.b.n((Object)i4);
        return new SignUpUseCase(e, (ny.b)i3, (ny.a)a2, i4);
    }
}
