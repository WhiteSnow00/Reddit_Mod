// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import y50.d0;
import com.reddit.domain.repository.Subplacement;
import com.reddit.data.remote.RemoteSearchDataSource;
import mg2.l;
import l10.h;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import mr0.e$a;
import com.reddit.queries.t5;
import com.reddit.tracking.RedditEndpoint;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.k0;
import b60.m;
import q20.d;
import px1.a;
import ff2.o;
import b60.g0;
import wu1.c;
import ng2.e;
import af2.c0;
import ff2.q;

public final class b implements pt.b, q
{
    public final int f;
    public final Object g;
    
    public b(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final c0 m(final Object o) {
        final int f = this.f;
        final String s = null;
        switch (f) {
            default: {
                final RedditStreamRepository redditStreamRepository = (RedditStreamRepository)this.g;
                final String s2 = (String)o;
                e.f((Object)redditStreamRepository, "this$0");
                e.f((Object)s2, "it");
                return redditStreamRepository.c.getConfiguration();
            }
            case 3: {
                final RedditSearchRepository redditSearchRepository = (RedditSearchRepository)this.g;
                final RedditSearchRepository$b redditSearchRepository$b = (RedditSearchRepository$b)o;
                e.f((Object)redditSearchRepository, "this$0");
                e.f((Object)redditSearchRepository$b, "key");
                redditSearchRepository.h.b(c.k);
                final RemoteSearchDataSource a = redditSearchRepository.a;
                final String id = redditSearchRepository$b.a.getId();
                final String c = redditSearchRepository.f.c();
                final Subplacement b = redditSearchRepository$b.b;
                String value = s;
                if (b != null) {
                    value = b.getValue();
                }
                final c0 w = a.getTrendingSearches(id, true, c, value).w((o)new g0(2));
                e.e((Object)w, "remote.getTrendingSearch\u2026  )\n          }\n        }");
                return px1.a.K0((c0)w, (d)redditSearchRepository.e);
            }
            case 2: {
                final RedditLinkRepository redditLinkRepository = (RedditLinkRepository)this.g;
                final m m = (m)o;
                e.f((Object)redditLinkRepository, "this$0");
                e.f((Object)m, "requestKey");
                return ah0.b.I1(ah0.b.l1((CoroutineContext)k0.b, (p)new RedditLinkRepository$recommendedMediaLinkStore$2$1$1(redditLinkRepository, m, (gg2.c)null)), RedditEndpoint.RecommendedMediaFeed, redditLinkRepository.f, redditLinkRepository.F, redditLinkRepository.Q, redditLinkRepository.R, redditLinkRepository.S).w((o)new g0(1));
            }
            case 1: {
                final RedditKarmaRepository redditKarmaRepository = (RedditKarmaRepository)this.g;
                final String s3 = (String)o;
                e.f((Object)redditKarmaRepository, "this$0");
                e.f((Object)s3, "username");
                final d0 b2 = redditKarmaRepository.b;
                b2.getClass();
                final c0 w2 = e$a.a((mr0.e)b2.a, (k)new t5(s3), (OkHttpClient)null, (Map)null, 14).w((o)new h(9));
                e.e((Object)w2, "graphQlClient.execute(op\u2026,\n        )\n      }\n    }");
                return w2.w((o)new g0(0));
            }
            case 0: {
                final RedditCategoryRepository redditCategoryRepository = (RedditCategoryRepository)this.g;
                final RedditCategoryRepository$a redditCategoryRepository$a = (RedditCategoryRepository$a)o;
                e.f((Object)redditCategoryRepository, "this$0");
                e.f((Object)redditCategoryRepository$a, "key");
                final Pair<Long, TimeUnit> e = RedditCategoryRepository.e;
                return a.K0(xd.a.X((String)null, (l)new RedditCategoryRepository$remoteGetSubredditsInCategory$1(redditCategoryRepository, (String)null, 0)), (d)redditCategoryRepository.a);
            }
        }
    }
    
    public final boolean test(final Object o) {
        final String s = (String)this.g;
        final Pair pair = (Pair)o;
        e.f((Object)s, "$key");
        e.f((Object)pair, "it");
        return e.a(pair.getFirst(), (Object)s);
    }
}
