// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.events.discover.DiscoverAnalytics;
import com.reddit.domain.model.Link;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.type.PostFeedSort;
import com.reddit.type.PostFeedRange;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import java.util.Map;
import b60.p0;
import b60.o0;
import com.reddit.events.discover.DiscoverAnalytics$Noun;
import com.reddit.events.discover.DiscoverAnalytics$PageType;
import b60.d;
import io.reactivex.plugins.RxJavaPlugins;
import af2.g0;
import pf2.h;
import com.reddit.queries.a8;
import y12.c1;
import com.reddit.ads.domain.DisplaySource;
import b60.j;
import y50.m;
import okhttp3.OkHttpClient;
import h7.k;
import mr0.e$a;
import com.reddit.queries.rd;
import com.reddit.type.ProfileElementsQueryType;
import com.reddit.data.model.mapper.InputVariableToGqlVariableMapperKt;
import h7.h$a;
import com.reddit.data.local.UserLinkKey;
import ff2.o;
import b60.t;
import com.reddit.tracking.RedditEndpoint;
import mg2.p;
import kotlin.collections.c;
import vl.a;
import ng2.e;
import b60.d2;
import af2.c0;
import pt.b;

public final class g implements b
{
    public final int f;
    public final RedditLinkRepository g;
    
    public g(final RedditLinkRepository g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final c0 m(final Object o) {
        switch (this.f) {
            default: {
                final RedditLinkRepository g = this.g;
                final d2 d2 = (d2)o;
                e.f((Object)g, "this$0");
                e.f((Object)d2, "<name for destructuring parameter 0>");
                final String n = d2.n;
                Map map;
                if (n != null) {
                    map = a.X2(n, g.f, (String)null);
                }
                else {
                    map = c.u4();
                }
                return ah0.b.I1(ah0.b.m1((p)new RedditLinkRepository$topAwardedPostsStore$2$1$1(g, map, (gg2.c)null)), RedditEndpoint.TopAwardedPosts, g.f, g.F, g.Q, g.R, g.S).w((o)new t(2));
            }
            case 3: {
                final RedditLinkRepository g2 = this.g;
                final UserLinkKey userLinkKey = (UserLinkKey)o;
                e.f((Object)g2, "this$0");
                e.f((Object)userLinkKey, "<name for destructuring parameter 0>");
                final String a = userLinkKey.a;
                final SortType b = userLinkKey.b;
                final String c = userLinkKey.c;
                final SortTimeFrame d3 = userLinkKey.d;
                final String e = userLinkKey.e;
                Map map2;
                if (e != null) {
                    map2 = vl.a.X2(e, g2.f, (String)null);
                }
                else {
                    map2 = kotlin.collections.c.u4();
                }
                final RemoteGqlLinkDataSource g3 = g2.g;
                g3.getClass();
                ng2.e.f((Object)a, "username");
                final mr0.g a2 = g3.a;
                final h7.h c2 = h$a.c((Object)c);
                PostFeedRange apolloPostFeedRange;
                if (d3 != null) {
                    apolloPostFeedRange = InputVariableToGqlVariableMapperKt.toApolloPostFeedRange(d3);
                }
                else {
                    apolloPostFeedRange = null;
                }
                final h7.h c3 = h$a.c((Object)apolloPostFeedRange);
                PostFeedSort apolloPostFeedSort;
                if (b != null) {
                    apolloPostFeedSort = InputVariableToGqlVariableMapperKt.toApolloPostFeedSort(b);
                }
                else {
                    apolloPostFeedSort = null;
                }
                final h7.h c4 = h$a.c((Object)apolloPostFeedSort);
                final h7.h a3 = h$a.a();
                final h7.h a4 = h$a.a();
                final h7.h h = aq2.a.h(g3.j);
                ProfileElementsQueryType profileElementsQueryType;
                if (g3.k.i1()) {
                    profileElementsQueryType = ProfileElementsQueryType.POSTS_SETS;
                }
                else {
                    profileElementsQueryType = ProfileElementsQueryType.POSTS;
                }
                final c0 w = e$a.a((mr0.e)a2, (k)new rd(a, c4, c3, c2, a3, profileElementsQueryType, a4, h), (OkHttpClient)null, map2, 10).w((o)new m(g3, 1));
                ng2.e.e((Object)w, "graphQlClient.execute(\n \u2026,\n        )\n      }\n    }");
                return ah0.b.I1((c0)w, RedditEndpoint.UserSubmittedPostsGql, g2.f, g2.F, g2.Q, g2.R, g2.S);
            }
            case 2: {
                final RedditLinkRepository g4 = this.g;
                final j j = (j)o;
                e.f((Object)g4, "this$0");
                e.f((Object)j, "<name for destructuring parameter 0>");
                return g4.b.getDuplicates(j.a, j.b, j.c).w((o)new t(1));
            }
            case 1: {
                final RedditLinkRepository g5 = this.g;
                final d2 d4 = (d2)o;
                e.f((Object)g5, "this$0");
                e.f((Object)d4, "requestKey");
                final String n2 = d4.n;
                Map map3;
                if (n2 != null) {
                    map3 = a.X2(n2, g5.f, (String)null);
                }
                else {
                    map3 = c.u4();
                }
                final RemoteGqlLinkDataSource g6 = g5.g;
                final String i = d4.j;
                e.c((Object)i);
                final SortType b2 = d4.b;
                final SortTimeFrame c5 = d4.c;
                final String d5 = d4.d;
                final ListingViewMode h2 = d4.h;
                final String c6 = g5.e.c();
                g6.getClass();
                final mr0.g a5 = g6.a;
                final h7.h c7 = h$a.c((Object)d5);
                final h7.h a6 = h$a.a();
                PostFeedRange apolloPostFeedRange2;
                if (c5 != null) {
                    apolloPostFeedRange2 = InputVariableToGqlVariableMapperKt.toApolloPostFeedRange(c5);
                }
                else {
                    apolloPostFeedRange2 = null;
                }
                final h7.h c8 = h$a.c((Object)apolloPostFeedRange2);
                PostFeedSort apolloPostFeedSort2;
                if (b2 != null) {
                    apolloPostFeedSort2 = InputVariableToGqlVariableMapperKt.toApolloPostFeedSort(b2);
                }
                else {
                    apolloPostFeedSort2 = null;
                }
                final h7.h c9 = h$a.c((Object)apolloPostFeedSort2);
                y12.a apolloAdContextInput$default;
                if (h2 != null) {
                    apolloAdContextInput$default = InputVariableToGqlVariableMapperKt.getApolloAdContextInput$default((DisplaySource)null, h2, (zu.a)null, g6.b, 1, (Object)null);
                }
                else {
                    apolloAdContextInput$default = null;
                }
                final c0 w2 = e$a.a((mr0.e)a5, (k)new a8(i, c9, c8, c7, a6, h$a.c((Object)apolloAdContextInput$default), h$a.c((Object)new c1(h$a.c((Object)c6), 14)), h$a.a(), aq2.a.h(g6.j)), (OkHttpClient)null, map3, 10).w((o)new y50.o(g6, 1));
                e.e((Object)w2, "graphQlClient.execute(\n \u2026,\n        )\n      }\n    }");
                return RxJavaPlugins.onAssembly((c0)new h((af2.g0<Object>)ah0.b.I1((c0)w2, RedditEndpoint.MultiredditPosts, g5.f, g5.F, g5.Q, g5.R, g5.S), (ff2.g<? super Object>)new i(0, g5, d4)));
            }
            case 0: {
                final RedditLinkRepository g7 = this.g;
                final d d6 = (d)o;
                e.f((Object)g7, "this$0");
                e.f((Object)d6, "<name for destructuring parameter 0>");
                final String a7 = d6.a;
                final String b3 = d6.b;
                final Link c10 = d6.c;
                final String d7 = d6.d;
                final String e2 = d6.e;
                final DiscoverAnalytics l = g7.L;
                l.f(DiscoverAnalytics$PageType.DISCOVER_POST);
                l.g(DiscoverAnalytics$Noun.DISCOVER_POST);
                final c0 m1 = ah0.b.m1((p)new RedditLinkRepository$discoverTopicLinksStore$2$1$2(g7, a7, b3, c10, d7, e2, (gg2.c)null));
                final o0 o2 = new o0((Object)g7, 0);
                m1.getClass();
                final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new h((g0)m1, (ff2.g)o2));
                final p0 p = new p0((Object)g7, 0);
                onAssembly.getClass();
                return RxJavaPlugins.onAssembly((c0)new pf2.e((af2.g0<Object>)onAssembly, (ff2.g<? super Throwable>)p));
            }
        }
    }
}
