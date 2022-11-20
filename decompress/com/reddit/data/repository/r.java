// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import b60.w1;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.g;
import af2.g0;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import gg2.c;
import java.util.Map;
import vl.a;
import com.reddit.session.m;
import x12.p$a;
import com.reddit.tracking.TrackerParams$TrackerType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.SubredditListingProgressIndicator;
import java.util.List;
import com.reddit.domain.model.CommunityDrawerListing;
import kotlin.collections.EmptyList;
import ng2.e;
import af2.c0;
import pt.b;

public final class r implements b
{
    public final int f;
    public final RedditSubredditRepository g;
    
    public r(final RedditSubredditRepository g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final c0 m(final Object o) {
        switch (this.f) {
            default: {
                final RedditSubredditRepository g = this.g;
                final RedditSubredditRepository$d redditSubredditRepository$d = (RedditSubredditRepository$d)o;
                e.f((Object)g, "this$0");
                e.f((Object)redditSubredditRepository$d, "key");
                final Pair<Long, TimeUnit> g2 = RedditSubredditRepository.G;
                final int n = RedditSubredditRepository$h.b[((Enum)redditSubredditRepository$d.a).ordinal()];
                final c0 c0 = null;
                c0<CommunityDrawerListing> c2;
                if (n != 1) {
                    if (n != 2) {
                        c2 = af2.c0.v(new CommunityDrawerListing((List)EmptyList.INSTANCE, (String)null, (String)null, false, (SubredditListingProgressIndicator)null, 30, (DefaultConstructorMarker)null));
                        e.e((Object)c2, "just(CommunityDrawerListing(emptyList()))");
                    }
                    else {
                        String s;
                        if ((s = redditSubredditRepository$d.b) == null) {
                            s = p$a.c(g.k, TrackerParams$TrackerType.Listing, RedditSubredditRepository.class.getSimpleName(), (String)null, (String)null, g.s, g.r, 92).a;
                        }
                        final m m = (m)g.o.d().invoke();
                        c2 = c0;
                        if (m != null) {
                            final String kindWithId = m.getKindWithId();
                            c2 = c0;
                            if (kindWithId != null) {
                                final c0 l1 = ah0.b.l1((CoroutineContext)g.p.c(), (p)new RedditSubredditRepository$remoteFetcherListingForKey$3$1(g, kindWithId, (Map)a.X2(s, g.k, (String)null), redditSubredditRepository$d, (c)null));
                                final i i = new i(2, redditSubredditRepository$d, g);
                                l1.getClass();
                                c2 = RxJavaPlugins.onAssembly((c0)new pf2.e((af2.g0<Object>)l1, (g<? super Throwable>)i));
                            }
                        }
                        if (c2 == null) {
                            c2 = af2.c0.v(new CommunityDrawerListing((List)EmptyList.INSTANCE, (String)null, (String)null, false, (SubredditListingProgressIndicator)null, 30, (DefaultConstructorMarker)null));
                            e.e((Object)c2, "just(CommunityDrawerListing(emptyList()))");
                        }
                    }
                }
                else {
                    String s2;
                    if ((s2 = redditSubredditRepository$d.b) == null) {
                        s2 = p$a.c(g.k, TrackerParams$TrackerType.Listing, RedditSubredditRepository.class.getSimpleName(), (String)null, (String)null, g.s, g.r, 92).a;
                    }
                    final c0 l2 = ah0.b.l1((CoroutineContext)g.p.c(), (p)new RedditSubredditRepository$remoteFetcherListingForKey$1(g, (Map)a.X2(s2, g.k, (String)null), redditSubredditRepository$d, (c)null));
                    final w1 w1 = new w1(redditSubredditRepository$d, g);
                    l2.getClass();
                    c2 = RxJavaPlugins.onAssembly((c0)new pf2.e((af2.g0<Object>)l2, (g<? super Throwable>)w1));
                    e.e((Object)c2, "private fun remoteFetche\u2026g(emptyList()))\n    }\n  }");
                }
                return c2;
            }
            case 0: {
                final RedditSubredditRepository g3 = this.g;
                final String s3 = (String)o;
                e.f((Object)g3, "this$0");
                e.f((Object)s3, "key");
                return g3.c.getQuarantinedSubreddit(s3, s3);
            }
        }
    }
}
