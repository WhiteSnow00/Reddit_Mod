// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import se2.h;
import mg0.x;
import qz.i;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import xd0.g0;
import ox.f;
import nx0.g;
import android.content.SharedPreferences;
import com.reddit.domain.model.postsubmit.CreatorKitResult$ImageInfo;
import com.reddit.domain.model.postsubmit.CreatorKitResult$Work$VideoInfo;
import c6.l;
import ae0.t;
import com.reddit.domain.model.PostType;
import com.reddit.screen.BaseScreen;
import c71.d;
import hi0.u;
import hi0.a0;
import q40.a;
import com.reddit.domain.modtools.scheduledposts.usecase.CreateScheduledPostUseCase_Factory;
import hf0.o;
import t31.b;
import javax.inject.Provider;
import cz0.c;
import se2.e;

public final class na
{
    public final z0 a;
    public e b;
    public e c;
    public c d;
    public Provider<b> e;
    public e f;
    public Provider<o> g;
    public jx.c h;
    public CreateScheduledPostUseCase_Factory i;
    public a j;
    public e k;
    public e l;
    public e m;
    public e n;
    public Provider<a0> o;
    public Provider<u> p;
    public f40.a q;
    public Provider<c71.c> r;
    
    public na(final z0 a, final d d, final BaseScreen baseScreen, final c71.b b, final PostType postType, final t t, final l l, final CreatorKitResult$Work$VideoInfo creatorKitResult$Work$VideoInfo, final CreatorKitResult$ImageInfo creatorKitResult$ImageInfo, final SharedPreferences sharedPreferences) {
        this.a = a;
        this.b = se2.e.a((Object)d);
        final e a2 = se2.e.a((Object)baseScreen);
        this.c = a2;
        final c b2 = cz0.c.b((Provider)a2);
        this.d = b2;
        this.e = (Provider<b>)se2.c.b((Provider)nx0.g.b((Provider)b2, (Provider)a.w));
        this.f = se2.e.a((Object)b);
        final e a3 = se2.e.a((Object)postType);
        final ib0.b b3 = new ib0.b((Provider)a.n, 8);
        final z0.z0$s9 m = a.m;
        final z0.w5 f2 = a.F2;
        final z0.z0$p5 l2 = a.l0;
        final Provider b4 = se2.c.b((Provider)new f((Provider)a3, (Provider)l2, (Provider)m, (Provider)a.t1, (Provider)new iz.b((Provider)m, (Provider)f2, (Provider)l2, (Provider)b3, 6), (Provider)a.r, (Provider)a.q0, 6));
        this.g = (Provider<o>)b4;
        final z0.z0$s9 i = a.m;
        this.h = new jx.c((Provider)i, (Provider)a.x0, b4, (Provider)a.K, 3);
        this.i = CreateScheduledPostUseCase_Factory.create((Provider<g0>)a.y, (Provider<ScheduledPostRepository>)a.o0, (Provider<m20.b>)i, (Provider<a20.a>)a.r);
        this.j = q40.a.a((Provider)a.w, (Provider)a.s0, (Provider)a.t0, (Provider)a.u0, (Provider)this.d, (Provider)a.v0, (Provider)qz.i.c((Provider)a.w0, (Provider)a.u0), (Provider)a.w0);
        this.k = se2.e.b((Object)t);
        this.l = se2.e.b((Object)l);
        this.m = se2.e.b((Object)creatorKitResult$Work$VideoInfo);
        this.n = se2.e.b((Object)creatorKitResult$ImageInfo);
        final Provider a4 = se2.h.a((Provider)x.a((Provider)a.h));
        this.o = (Provider<a0>)a4;
        this.p = (Provider<u>)se2.c.b(a4);
        this.q = f40.a.a((Provider)this.d, (Provider)this.c, (Provider)a.j0, (Provider)a.w, (Provider)a.T, (Provider)a.f3);
        this.r = (Provider<c71.c>)se2.c.b((Provider)new c71.e((Provider)this.b, (Provider)this.e, (Provider)this.f, a.y, (Provider)this.h, (Provider)this.i, (Provider)this.j, (Provider)this.k, a.c, a.V1, a.i, a.k0, (Provider)this.l, (Provider)this.m, (Provider)this.n, (Provider)this.p, (Provider)this.d, (Provider)this.q, a.r, a.l0, a.u1, a.w, a.O1, se2.e.a((Object)sharedPreferences), a.j3, a.L0, a.m1));
    }
}
