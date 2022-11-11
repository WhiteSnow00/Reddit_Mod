// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import qz.i;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import xd0.g0;
import se2.h;
import mg0.x;
import hh0.b$a;
import ae0.s;
import com.reddit.screen.BaseScreen;
import com.reddit.domain.modtools.scheduledposts.usecase.CreateScheduledPostUseCase_Factory;
import uv0.b;
import hi0.a0;
import cz0.c;
import se2.e;
import hh0.a;
import javax.inject.Provider;

public final class pg
{
    public final z0 a;
    public Provider<a> b;
    public Provider<fi0.a> c;
    public e d;
    public e e;
    public c f;
    public Provider<a0> g;
    public Provider<ei0.c> h;
    public zz.c i;
    public f40.a j;
    public b k;
    public r10.e l;
    public ax.b m;
    public nx.c n;
    public e o;
    public CreateScheduledPostUseCase_Factory p;
    public wb0.a q;
    public q40.a r;
    public Provider<z61.b> s;
    
    public pg(final z0 a, final z61.c c, final z61.a a2, final BaseScreen baseScreen, final s s) {
        this.a = a;
        final Provider b = se2.c.b((Provider)b$a.a);
        this.b = (Provider<a>)b;
        this.c = (Provider<fi0.a>)se2.c.b((Provider)rx.b.a((Provider)a.h, b));
        this.d = se2.e.a((Object)c);
        final e a3 = se2.e.a((Object)baseScreen);
        this.e = a3;
        this.f = cz0.c.b((Provider)a3);
        this.g = (Provider<a0>)se2.h.a((Provider)x.a((Provider)a.h));
        this.h = (Provider<ei0.c>)se2.c.b((Provider)wb0.a.a((Provider)a.h));
        final c f = this.f;
        this.i = new zz.c((Provider)f, (Provider)a.V, 21);
        this.j = f40.a.a((Provider)f, (Provider)this.e, (Provider)a.j0, (Provider)a.w, (Provider)a.T, (Provider)a.f3);
        this.k = uv0.b.d((Provider)a.m);
        this.l = r10.e.b((Provider)a.c0, (Provider)a.m, (Provider)this.f, (Provider)a.n, (Provider)a.i, (Provider)a.D2, (Provider)a.V, (Provider)this.k, (Provider)nx.a.a(), (Provider)a.i0, (Provider)a.E2);
        final z0.z0$e3 v = a.V;
        final ax.b m = new ax.b((Provider)v, 28);
        this.m = m;
        this.n = new nx.c((Provider)new ly.b((Provider)v, (Provider)m, 18), 26);
        this.o = se2.e.a((Object)a2);
        this.p = CreateScheduledPostUseCase_Factory.create((Provider<g0>)a.y, (Provider<ScheduledPostRepository>)a.o0, (Provider<m20.b>)a.m, (Provider<a20.a>)a.r);
        this.q = wb0.a.c((Provider)a.y);
        this.r = q40.a.a((Provider)a.w, (Provider)a.s0, (Provider)a.t0, (Provider)a.u0, (Provider)this.f, (Provider)a.v0, (Provider)qz.i.c((Provider)a.w0, (Provider)a.u0), (Provider)a.w0);
        this.s = (Provider<z61.b>)se2.c.b((Provider)new z61.e((Provider)this.d, (Provider)this.f, a.l0, a.y, a.V1, a.m, a.e, a.p0, (Provider)this.g, (Provider)this.h, a.w, a.D2, a.V, a.n, (Provider)this.i, (Provider)this.j, (Provider)this.l, (Provider)this.m, (Provider)this.n, a.F2, (Provider)this.o, (Provider)this.p, a.r0, a.i, a.k0, a.q0, (Provider)this.q, (Provider)this.r, se2.e.b((Object)s), a.r, a.e0, a.L0, a.x0));
    }
}
