// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import hh0.b$a;
import zk0.g;
import ee1.h;
import ib0.b;
import pi.d;
import com.reddit.events.recommendations.RecommendationAnalytics;
import uw.f;
import v40.k;
import cz0.c;
import zk0.a;
import b40.k0;
import com.reddit.screen.discover.feed.grid.optimizer.DiscoverGridOptimizer;
import com.reddit.screen.discover.feed.grid.optimizer.DiscoverGridOptimizer$a;
import javax.inject.Provider;
import se2.e;
import com.reddit.screen.BaseScreen;

public final class s3
{
    public final BaseScreen a;
    public final z0 b;
    public e c;
    public e d;
    public e e;
    public Provider<DiscoverGridOptimizer$a> f;
    public Provider<DiscoverGridOptimizer> g;
    public k0 h;
    public Provider<a> i;
    public Provider<com.reddit.screens.listing.mapper.a> j;
    public q30.e k;
    public e l;
    public e m;
    public c n;
    public k o;
    public Provider<hh0.a> p;
    public Provider<fi0.a> q;
    public f r;
    public Provider<RecommendationAnalytics> s;
    public d t;
    public e u;
    public b v;
    public se2.b w;
    public Provider<l42.c> x;
    
    public s3(final z0 b, final ee1.d d, final String s, final ee1.b b2, final BaseScreen a, final Integer n, final me1.a a2, final rg2.a a3) {
        this.b = b;
        this.a = a;
        this.c = se2.e.a((Object)d);
        this.d = se2.e.b((Object)a2);
        this.e = se2.e.a((Object)s);
        final Provider b3 = se2.c.b((Provider)new h(new com.reddit.metrics.a((Provider)b.m, (Provider)se2.e.a((Object)n), 5)));
        this.f = (Provider<DiscoverGridOptimizer$a>)b3;
        this.g = (Provider<DiscoverGridOptimizer>)se2.c.b((Provider)new yr0.d((Object)new com.reddit.screen.discover.feed.grid.optimizer.a(b3), 11));
        final z0.z0$d2 p8 = b.p1;
        final z0.z0$s9 m = b.m;
        this.h = new k0((Provider)p8, (Provider)m, (Provider)b.o1, (Provider)b.x0, 5);
        this.i = (Provider<a>)se2.h.a((Provider)zk0.g.a((Provider)m));
        this.j = (Provider<com.reddit.screens.listing.mapper.a>)se2.c.b((Provider)yw.b.b((Provider)this.i, (Provider)b.j, (Provider)b.G, (Provider)b.c, (Provider)zz.c.b((Provider)b.y0, (Provider)b.z0)));
        this.k = new q30.e(this.j, this.i, (Provider)b.M1, (Provider)b.m, (Provider)q30.b.a((Provider)b.m, (Provider)b.N1, (Provider)b.x0), (Provider)b.o1, 4);
        this.l = se2.e.a((Object)b2);
        final e a4 = se2.e.a((Object)a);
        this.m = a4;
        final c b4 = cz0.c.b((Provider)a4);
        this.n = b4;
        this.o = new k((Provider)b4, (Provider)b.w, (Provider)b.f1, 15);
        final Provider b5 = se2.c.b((Provider)b$a.a);
        this.p = (Provider<hh0.a>)b5;
        this.q = (Provider<fi0.a>)se2.c.b((Provider)rx.b.a((Provider)b.h, b5));
        final z0.z0$j2 h = b.h;
        this.r = new f((Provider)h, (Provider)b.o1, 24);
        this.s = (Provider<RecommendationAnalytics>)se2.c.b((Provider)uw.f.d((Provider)h, (Provider)this.p));
        this.t = pi.d.a((Provider)this.n, com.reddit.metrics.a.a((Provider)b.b0, (Provider)b.y), (Provider)b.m, (Provider)b.A0, (Provider)b.B0);
        this.u = se2.e.a((Object)a3);
        this.v = new b((Provider)b.p1, 0);
        this.w = new se2.b();
        final Provider b6 = se2.c.b((Provider)this.c);
        this.x = (Provider<l42.c>)b6;
        final z0.z0$c2 o1 = b.o1;
        final z0.z2 p9 = b.P1;
        final k o2 = this.o;
        final z0.z0$m0 d2 = b.d0;
        final Provider<fi0.a> q = this.q;
        final z0.z0$k5 q2 = b.Q1;
        final Provider<RecommendationAnalytics> s2 = this.s;
        final d t = this.t;
        final f r = this.r;
        final b v = this.v;
        final z0.z0$e7 b7 = b.b0;
        final z0.z0$l2 w0 = b.W0;
        final z0.z0$j7 w2 = b.w0;
        final z0.z0$s9 i = b.m;
        final se2.b w3 = this.w;
        se2.b.a((Provider)w3, se2.c.b((Provider)new ee1.f((Provider)this.c, (Provider)this.d, (Provider)this.e, (Provider)this.g, (Provider)this.h, (Provider)this.k, (Provider)this.l, (Provider)o2, i, (Provider)q, (Provider)r, b.s1, (Provider)s2, (Provider)t, b.O1, p9, b.d1, b7, o1, b.L, w2, d2, (Provider)this.u, w0, q2, (Provider)v, (Provider)new de1.a((Provider)o1, (Provider)p9, (Provider)o2, (Provider)d2, (Provider)q, (Provider)q2, (Provider)s2, (Provider)t, (Provider)r, (Provider)v, (Provider)b7, (Provider)w0, (Provider)w2, (Provider)i, (Provider)w3, (Provider)b.r, b6, (Provider)this.m, 0))));
    }
}
