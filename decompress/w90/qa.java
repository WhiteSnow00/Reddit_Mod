// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import af2.h;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import ge0.o0;
import of0.k0;
import android.content.SharedPreferences;
import com.reddit.domain.model.postsubmit.CreatorKitResult$ImageInfo;
import com.reddit.domain.model.postsubmit.CreatorKitResult$Work$VideoInfo;
import c6.k;
import je0.t;
import com.reddit.domain.model.PostType;
import com.reddit.screen.BaseScreen;
import j71.d;
import j71.c;
import ri0.u;
import ri0.a0;
import x40.a;
import com.reddit.domain.modtools.scheduledposts.usecase.CreateScheduledPostUseCase_Factory;
import qf0.m;
import javax.inject.Provider;
import iv0.b;
import af2.e;

public final class qa
{
    public final a1 a;
    public e b;
    public e c;
    public b d;
    public Provider<c41.b> e;
    public e f;
    public Provider<m> g;
    public n20.b h;
    public CreateScheduledPostUseCase_Factory i;
    public a j;
    public e k;
    public e l;
    public e m;
    public e n;
    public Provider<a0> o;
    public Provider<u> p;
    public cx.b q;
    public Provider<c> r;
    
    public qa(final a1 a, final d d, final BaseScreen baseScreen, final j71.b b, final PostType postType, final t t, final k k, final CreatorKitResult$Work$VideoInfo creatorKitResult$Work$VideoInfo, final CreatorKitResult$ImageInfo creatorKitResult$ImageInfo, final SharedPreferences sharedPreferences) {
        this.a = a;
        this.b = af2.e.a((Object)d);
        final e a2 = af2.e.a((Object)baseScreen);
        this.c = a2;
        final b b2 = iv0.b.b((Provider)a2);
        this.d = b2;
        this.e = (Provider<c41.b>)af2.c.b((Provider)d00.c.d((Provider)b2, (Provider)a.w));
        this.f = af2.e.a((Object)b);
        final e a3 = af2.e.a((Object)postType);
        final k0 k2 = new k0((Provider)a.n, 2);
        final a1$p9 m = a.m;
        final a1$v5 d2 = a.D2;
        final a1$o5 k3 = a.k0;
        final Provider b3 = af2.c.b((Provider)new ri.d((Provider)a3, (Provider)k3, (Provider)m, (Provider)a.q1, (Provider)new p40.a((Provider)m, (Provider)d2, (Provider)k3, (Provider)k2, 8), (Provider)a.r, (Provider)a.p0, 3));
        this.g = (Provider<m>)b3;
        final a1$p9 i = a.m;
        this.h = new n20.b((Provider)i, (Provider)a.w0, b3, (Provider)a.K, 5);
        this.i = CreateScheduledPostUseCase_Factory.create((Provider<o0>)a.y, (Provider<ScheduledPostRepository>)a.n0, (Provider<q20.b>)i, (Provider<e20.a>)a.r);
        this.j = x40.a.a((Provider)a.w, (Provider)a.r0, (Provider)a.s0, (Provider)a.t0, (Provider)this.d, (Provider)a.u0, (Provider)d00.c.e((Provider)a.v0, (Provider)a.t0), (Provider)a.v0);
        this.k = af2.e.b((Object)t);
        this.l = af2.e.b((Object)k);
        this.m = af2.e.b((Object)creatorKitResult$Work$VideoInfo);
        this.n = af2.e.b((Object)creatorKitResult$ImageInfo);
        final Provider a4 = af2.h.a((Provider)qb0.b.c((Provider)a.h));
        this.o = (Provider<a0>)a4;
        this.p = (Provider<u>)af2.c.b(a4);
        this.q = cx.b.c((Provider)this.d, (Provider)this.c, (Provider)a.w, (Provider)a.T, (Provider)a.d3);
        this.r = (Provider<c>)af2.c.b((Provider)new j71.e((Provider)this.b, (Provider)this.e, (Provider)this.f, a.y, (Provider)this.h, (Provider)this.i, (Provider)this.j, (Provider)this.k, a.c, a.Z1, a.i, a.j0, (Provider)this.l, (Provider)this.m, (Provider)this.n, (Provider)this.p, (Provider)this.d, (Provider)this.q, a.r, a.k0, a.r1, a.w, a.L1, af2.e.a((Object)sharedPreferences), a.h3, a.J0, a.j1));
    }
}
