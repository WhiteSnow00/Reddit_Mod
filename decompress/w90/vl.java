// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import of0.k0;
import ah2.f;
import rh0.b$a;
import com.reddit.news.data.FeedType;
import com.reddit.screen.BaseScreen;
import com.reddit.news.domain.RedditPostPresenceDelegate;
import com.reddit.news.domain.RedditPostAnalyticsDelegate;
import com.reddit.events.recommendations.RecommendationAnalytics;
import com.reddit.events.blocked.BlockedAccountsAnalytics;
import com.reddit.news.domain.paging.RedditFeedPager;
import a51.d;
import ou0.c;
import com.reddit.news.ui.FeedAnalytics;
import j51.g;
import uy.b;
import rh0.a;
import javax.inject.Provider;
import af2.e;

public final class vl implements du
{
    public final kl a;
    public e b;
    public Provider<a> c;
    public Provider<pi0.a> d;
    public e e;
    public b f;
    public g g;
    public i51.g h;
    public Provider<FeedAnalytics> i;
    public Provider<c> j;
    public d k;
    public e l;
    public Provider<RedditFeedPager> m;
    public Provider<BlockedAccountsAnalytics> n;
    public Provider<RecommendationAnalytics> o;
    public e p;
    public Provider<RedditPostAnalyticsDelegate> q;
    public Provider<x41.e> r;
    public Provider<c51.e> s;
    public Provider<RedditPostPresenceDelegate> t;
    
    public vl(final kl a, final BaseScreen baseScreen, final sg0.b b, final FeedType feedType) {
        this.a = a;
        this.b = af2.e.a((Object)baseScreen);
        final Provider b2 = af2.c.b((Provider)b$a.a);
        this.c = (Provider<a>)b2;
        this.d = (Provider<pi0.a>)af2.c.b((Provider)mx.b.b((Provider)a.F, b2));
        this.e = af2.e.a((Object)b);
        this.f = new b((Provider)a.Y, (Provider)a.a0, (Provider)a.o, 16);
        this.g = j51.g.a((Provider)this.c, r40.a.a((Provider)iv0.b.b((Provider)this.b), a.P0, (Provider)a.z, (Provider)a.b0, (Provider)a.c0), a.F, a.d0);
        final kl.ea h0 = a.h0;
        ah2.f.f((Object)h0, "numberFormatter");
        this.h = new i51.g(h0);
        final kl.o2 f = a.F;
        final e e = this.e;
        ah2.f.f((Object)f, "eventSender");
        ah2.f.f((Object)e, "analyticsScreenData");
        this.i = (Provider<FeedAnalytics>)af2.c.b((Provider)new i51.c(f, (Provider)e));
        final kl$v2 v0 = a.v0;
        ah2.f.f((Object)v0, "feedsFeatures");
        final Provider b3 = af2.c.b((Provider)new l51.f(v0));
        this.j = (Provider<c>)b3;
        this.k = a51.d.a(a.j0, a.O, a.k0, b3);
        final e a2 = af2.e.a((Object)feedType);
        this.l = a2;
        this.m = (Provider<RedditFeedPager>)af2.c.b((Provider)e51.e.a(a.Z, (Provider)this.h, (Provider)i51.b.a, (Provider)this.i, (Provider)this.k, a2));
        this.n = (Provider<BlockedAccountsAnalytics>)af2.c.b((Provider)k0.b((Provider)a.F));
        final Provider b4 = af2.c.b((Provider)vx.b.b((Provider)a.F, (Provider)this.c));
        this.o = (Provider<RecommendationAnalytics>)b4;
        final h51.c u = a.U;
        final e b5 = this.b;
        this.p = af2.e.a((Object)new j51.e(j51.d.a(u, (Provider)b5, (Provider)this.d, a.V, a.W, (Provider)this.e, a.Z, (Provider)this.f, (Provider)this.g, a.e0, a.M, a.N, a.Y, a.f0, a.g0, (Provider)this.h, a.o, (Provider)this.m, a.F, (Provider)this.c, a.l0, (Provider)b5, a.m0, a.n0, (Provider)this.n, a.o0, (Provider)this.l, b4)));
        this.q = (Provider<RedditPostAnalyticsDelegate>)af2.c.b((Provider)c51.d.a(a.Z, (Provider)this.d, (Provider)this.e, a.o));
        final kl.h4 x = a.X;
        ah2.f.f((Object)x, "localDb");
        final Provider b6 = af2.c.b((Provider)new x41.f(x));
        this.r = (Provider<x41.e>)b6;
        this.s = (Provider<c51.e>)af2.c.b((Provider)c51.f.a(a.Y, (Provider)this.m, b6));
        this.t = (Provider<RedditPostPresenceDelegate>)af2.c.b((Provider)c51.g.a(a.q0, a.o, (Provider)this.m, a.O));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
