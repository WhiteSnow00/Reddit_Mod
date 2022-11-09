// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import com.reddit.auth.data.RedditAuthRepository;
import co1.j;
import mj2.b0;
import db0.t;
import db0.c0;
import com.reddit.auth.common.sso.RedditSsoAuthProvider;
import ge0.r0;
import ge0.u;
import com.reddit.auth.domain.usecase.SignUpUseCase;
import com.reddit.auth.screen.signup.SignUpViewModel;
import com.reddit.events.auth.AuthAnalytics;
import com.reddit.auth.screen.signup.SignUpPresenter;
import jx.r;
import jx.q;
import jx.s;
import bz.k;
import javax.inject.Provider;
import bz.f;
import vx.d;
import af2.e;
import ly.c;
import jx.b;
import com.reddit.screen.BaseScreen;
import com.bluelinelabs.conductor.Router;
import zg2.a;
import com.reddit.auth.screen.signup.SignUpScreen;

public final class qd
{
    public final SignUpScreen a;
    public final a<? extends Router> b;
    public final BaseScreen c;
    public final a<? extends b> d;
    public final c e;
    public final zy.b f;
    public final a1 g;
    public e h;
    public e i;
    public sa1.b j;
    public d k;
    public sx.c l;
    public e m;
    public uy.b n;
    public e o;
    public uy.b p;
    public qb0.b q;
    public e r;
    public af2.b s;
    public sa1.b t;
    public j31.d u;
    public f v;
    
    public qd(final a1 g, final SignUpScreen a, final BaseScreen c, final a b, final a d, final c e, final zy.b f, final qy.a a2) {
        this.g = g;
        this.a = a;
        this.b = (a<? extends Router>)b;
        this.c = c;
        this.d = (a<? extends b>)d;
        this.e = e;
        this.f = f;
        this.h = af2.e.a((Object)a);
        final e a3 = af2.e.a((Object)c);
        this.i = a3;
        final sa1.b a4 = sa1.b.a((Provider)a3);
        this.j = a4;
        final a1$p9 m = g.m;
        this.k = new d((Provider)this.h, (Provider)g.K, (Provider)new vx.b((Provider)a4, (Provider)m, 0), 0);
        this.l = new sx.c((Provider)g.c, (Provider)g.N, (Provider)g.M, (Provider)m, 0);
        this.m = af2.e.a((Object)b);
        this.n = uy.b.b((Provider)this.m, (Provider)g.S, (Provider)vx.b.a((Provider)this.j, (Provider)g.C));
        this.o = af2.e.a((Object)d);
        this.p = uy.b.a((Provider)this.n, (Provider)this.o, af2.e.a((Object)e));
        this.q = qb0.b.d((Provider)g.h);
        this.r = af2.e.a((Object)f);
        this.s = new af2.b();
        final e i = this.i;
        this.t = new sa1.b((Object)i, 3);
        this.u = new j31.d((Object)i, 5);
        final ww0.c a5 = ww0.c.a((Provider)i);
        final sa1.b t = this.t;
        final j31.d u = this.u;
        final a1.i2 f2 = g.f4;
        final a1$p9 j = g.m;
        final a1$m8 d2 = g.d4;
        final sx.c l = this.l;
        final af2.b s = this.s;
        final uy.b p8 = this.p;
        final qb0.b q = this.q;
        this.v = new f((Provider)this.h, (Provider)l, g.R, g.z, (Provider)p8, g.D, d2, f2, (Provider)q, (Provider)this.r, j, g.A, (Provider)s, g.g4, g.z0, new k((Provider)t, (Provider)u, (Provider)a5, (Provider)f2, (Provider)j, (Provider)d2, (Provider)l, (Provider)s, (Provider)p8, (Provider)q, (Provider)this.i, 0), (Provider)this.j);
        final e a6 = af2.e.a((Object)a2);
        final af2.b s2 = this.s;
        final a1$k s3 = g.S3;
        final e h = this.h;
        final d k = this.k;
        final f v = this.v;
        af2.b.a((Provider)s2, af2.c.b((Provider)vx.c.a((Provider)s3, (Provider)h, (Provider)k, (Provider)v, (Provider)v, (Provider)g.D, (Provider)this.q, (Provider)g.b0, (Provider)a6, (Provider)g.h4, (Provider)g.r, (Provider)g.z0)));
    }
    
    public final uy.a a() {
        final a<? extends Router> b = this.b;
        final q d7 = this.g.a.D7();
        kz0.k.N((Object)d7);
        final a c = sa1.b.c(this.c);
        final r i5 = this.g.a.I5();
        kz0.k.N((Object)i5);
        return new uy.a((zy.a)new zy.c((a)b, d7, (s)new zy.f(c, i5)), (a)this.d, this.e);
    }
    
    public final SignUpPresenter b() {
        final SignUpScreen a = this.a;
        final SignUpUseCase c = this.c();
        final sx.a d1 = this.g.a.D1();
        kz0.k.N((Object)d1);
        final sx.d u3 = this.g.a.U3();
        kz0.k.N((Object)u3);
        final uy.a a2 = this.a();
        final u d2 = this.g.a.d();
        kz0.k.N((Object)d2);
        final r0 t4 = this.g.a.T4();
        kz0.k.N((Object)t4);
        final nx.e v0 = this.g.a.v0();
        kz0.k.N((Object)v0);
        final s40.e u4 = this.g.a.U4();
        kz0.k.N((Object)u4);
        final AuthAnalytics authAnalytics = new AuthAnalytics(u4);
        final zy.b f = this.f;
        final q20.b k4 = this.g.a.k4();
        kz0.k.N((Object)k4);
        final RedditSsoAuthProvider t5 = this.g.a.t6();
        kz0.k.N((Object)t5);
        final xe2.a a3 = af2.c.a((Provider)this.s);
        final c0 m = this.g.a.m();
        kz0.k.N((Object)m);
        final t p = this.g.a.P();
        kz0.k.N((Object)p);
        final b0 d3 = sa1.b.d(this.c);
        final sk1.a a4 = j31.d.a(this.c);
        final j b = ww0.c.b(this.c);
        final nx.e v2 = this.g.a.v0();
        kz0.k.N((Object)v2);
        final q20.b k5 = this.g.a.k4();
        kz0.k.N((Object)k5);
        final r0 t6 = this.g.a.T4();
        kz0.k.N((Object)t6);
        final SignUpUseCase c2 = this.c();
        final xe2.a a5 = af2.c.a((Provider)this.s);
        final uy.a a6 = this.a();
        final s40.e u5 = this.g.a.U4();
        kz0.k.N((Object)u5);
        return new SignUpPresenter((bz.e)a, c, d1, u3, (jx.a)a2, d2, t4, (jx.e)v0, authAnalytics, f, k4, (lx.e)t5, a3, m, p, new SignUpViewModel(d3, (h1.b)a4, b, (jx.e)v2, k5, t6, c2, a5, (jx.a)a6, new AuthAnalytics(u5), (nb1.s)this.c), sa1.b.c(this.c));
    }
    
    public final SignUpUseCase c() {
        final com.reddit.session.q e = this.g.a.E();
        kz0.k.N((Object)e);
        final RedditAuthRepository k3 = this.g.a.k3();
        kz0.k.N((Object)k3);
        final nx.a d2 = this.g.a.d2();
        kz0.k.N((Object)d2);
        final q20.b k4 = this.g.a.k4();
        kz0.k.N((Object)k4);
        return new SignUpUseCase(e, (ry.b)k3, (ry.a)d2, k4);
    }
}
