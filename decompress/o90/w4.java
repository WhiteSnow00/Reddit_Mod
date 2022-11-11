// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import gf0.b$a;
import sj0.a;
import com.reddit.feature.fullbleedplayer.image.FullBleedImageScreen$a;
import com.reddit.feature.fullbleedplayer.image.FullBleedImageViewModel;
import v10.t;
import com.reddit.feature.fullbleedplayer.FBPLocalSubredditSubscriptionManager;
import y30.d;
import r72.h;
import javax.inject.Provider;
import zy.g;
import cz0.c;
import ff0.q1;
import hg0.f;
import uv0.b;
import se2.e;
import com.reddit.domain.model.streaming.StreamCorrelation;
import com.reddit.screen.BaseScreen;

public final class w4
{
    public final BaseScreen a;
    public final StreamCorrelation b;
    public final z0 c;
    public e d;
    public b e;
    public e f;
    public f g;
    public q1 h;
    public e i;
    public c j;
    public g k;
    public Provider<h> l;
    public vy.e m;
    public d n;
    public iz.b o;
    public Provider<FBPLocalSubredditSubscriptionManager> p;
    public e q;
    public Provider<t> r;
    public d s;
    public be1.h t;
    public oa1.b u;
    public com.reddit.feature.fullbleedplayer.image.b v;
    public Provider<xi0.b> w;
    public Provider<FullBleedImageViewModel> x;
    
    public w4(final z0 c, final BaseScreen a, final FullBleedImageScreen$a fullBleedImageScreen$a, final StreamCorrelation b, final a a2) {
        this.c = c;
        this.a = a;
        this.b = b;
        final e a3 = se2.e.a((Object)a);
        this.d = a3;
        this.e = new b((Provider)a3, 9);
        this.f = se2.e.a((Object)fullBleedImageScreen$a);
        this.g = hg0.f.c((Provider)c.j);
        this.h = q1.e((Provider)this.d);
        this.i = se2.e.a((Object)b);
        this.j = cz0.c.b((Provider)this.d);
        final g k = new g((Provider)this.h, (Provider)this.d, (Provider)c.m, (Provider)this.i, (Provider)c.w, (Provider)c.E, (Provider)pi.d.a((Provider)this.j, com.reddit.metrics.a.a((Provider)c.b0, (Provider)c.y), (Provider)c.m, (Provider)c.A0, (Provider)c.B0), 3);
        this.k = k;
        this.l = (Provider<h>)se2.c.b((Provider)new jt0.e((Provider)c.b0, (Provider)k, 7));
        final z0.z0$c9 a4 = c.A1;
        final z0.w8 x1 = c.X1;
        final z0.z0$s r = c.r;
        this.m = new vy.e((Provider)a4, (Provider)x1, (Provider)r, 14);
        this.n = new d((Provider)a4, (Provider)r, (Provider)b$a.a, 8);
        this.o = iz.b.c((Provider)this.j, c.w, c.f1, c.W1);
        this.p = (Provider<FBPLocalSubredditSubscriptionManager>)se2.c.b((Provider)new ib0.b((Provider)c.y, 28));
        this.q = se2.e.b((Object)a2);
        this.r = (Provider<t>)se2.c.b((Provider)new zz.c((Provider)this.j, (Provider)c.c2, 1));
        this.s = new d((Provider)c.m, (Provider)c.w0, (Provider)c.P1, 12);
        final e d = this.d;
        this.t = new be1.h((Provider)d, 0);
        final oa1.b b2 = oa1.b.b((Provider)d);
        this.u = b2;
        final b e = this.e;
        final e d2 = this.d;
        final z0.z0$c9 a5 = c.A1;
        final z0.z0$t6 y1 = c.Y1;
        final z0.z0$s9 m = c.m;
        this.v = new com.reddit.feature.fullbleedplayer.image.b((Provider)e, (Provider)d2, a5, y1, m, (Provider)this.k, (Provider)this.f, c.Z1, c.c, c.a2, c.L1, c.b2, (Provider)this.q, (Provider)this.r, (Provider)this.s, c.b0, (Provider)this.l, c.P1, (Provider)this.t, b2, c.d2);
        this.w = (Provider<xi0.b>)se2.c.b((Provider)new q30.b((Provider)c.h, (Provider)c.O1, (Provider)q30.b.a((Provider)m, (Provider)c.N1, (Provider)c.x0), 19));
        this.x = (Provider<FullBleedImageViewModel>)se2.c.b((Provider)new com.reddit.feature.fullbleedplayer.image.a((Provider)this.e, c.w, (Provider)this.d, (Provider)this.f, (Provider)this.g, (Provider)this.l, (Provider)this.m, (Provider)this.n, c.c0, (Provider)this.k, c.m, (Provider)this.o, (Provider)this.p, (Provider)this.q, (Provider)this.v, c.b0, (Provider)this.w, c.P1, c.z0, c.A1, c.r, c.e2, (Provider)zz.c.b((Provider)c.y0, (Provider)c.z0), c.k0, (Provider)this.t, (Provider)this.u));
    }
}
