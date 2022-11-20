// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.data.remote.RemoteLinkDataSource;
import java.util.List;
import com.reddit.type.PostFeedSort;
import com.reddit.type.PostFeedRange;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import b60.q0;
import kotlin.coroutines.CoroutineContext;
import zi2.k0;
import b60.n;
import ff2.g;
import pf2.h;
import io.reactivex.plugins.RxJavaPlugins;
import af2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import b60.r0;
import com.reddit.listing.common.ListingType;
import com.reddit.queries.pb;
import com.reddit.ads.domain.DisplaySource;
import y50.r;
import java.util.Map;
import com.reddit.queries.i8;
import cg.d;
import y12.a1;
import com.reddit.type.SearchPostSort;
import com.reddit.tracking.RedditEndpoint;
import ff2.o;
import y50.p;
import okhttp3.OkHttpClient;
import h7.k;
import mr0.e$a;
import y12.c1;
import com.reddit.data.model.mapper.InputVariableToGqlVariableMapperKt;
import h7.h$a;
import xi2.j;
import kotlin.collections.c;
import vl.a;
import ng2.e;
import b60.d2;
import af2.c0;
import pt.b;

public final class m implements b
{
    public final int f;
    public final RedditLinkRepository g;
    
    public m(final RedditLinkRepository g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final c0 m(final Object o) {
        switch (this.f) {
            default: {
                final RedditLinkRepository g = this.g;
                final d2 d2 = (d2)o;
                e.f((Object)g, "this$0");
                e.f((Object)d2, "requestKey");
                final String n = d2.n;
                Map map;
                if (n != null) {
                    map = a.X2(n, g.f, (String)null);
                }
                else {
                    map = c.u4();
                }
                c0 c6;
                if (j.z0(d2.i, "all", true)) {
                    final RemoteGqlLinkDataSource g2 = g.g;
                    final SortType b = d2.b;
                    final SortTimeFrame c = d2.c;
                    final String d3 = d2.d;
                    final String f = d2.f;
                    final ListingViewMode h = d2.h;
                    final String c2 = g.e.c();
                    g2.getClass();
                    final mr0.g a = g2.a;
                    final h7.h c3 = h$a.c((Object)d3);
                    final h7.h a2 = h$a.a();
                    PostFeedRange apolloPostFeedRange;
                    if (c != null) {
                        apolloPostFeedRange = InputVariableToGqlVariableMapperKt.toApolloPostFeedRange(c);
                    }
                    else {
                        apolloPostFeedRange = null;
                    }
                    final h7.h c4 = h$a.c((Object)apolloPostFeedRange);
                    PostFeedSort apolloPostFeedSort;
                    if (b != null) {
                        apolloPostFeedSort = InputVariableToGqlVariableMapperKt.toApolloPostFeedSort(b);
                    }
                    else {
                        apolloPostFeedSort = null;
                    }
                    final h7.h c5 = h$a.c((Object)apolloPostFeedSort);
                    y12.a apolloAdContextInput;
                    if (h != null) {
                        apolloAdContextInput = InputVariableToGqlVariableMapperKt.getApolloAdContextInput(f, h, g2.b);
                    }
                    else {
                        apolloAdContextInput = null;
                    }
                    final c0 w = e$a.a((mr0.e)a, (k)new com.reddit.queries.e(c5, c4, c3, a2, h$a.c((Object)apolloAdContextInput), h$a.c((Object)new c1(h$a.c((Object)c2), 14)), h$a.a(), aq2.a.h(g2.j), 768), (OkHttpClient)null, map, 10).w((o)new p(g2, 1));
                    e.e((Object)w, "graphQlClient.execute(\n \u2026,\n        )\n      }\n    }");
                    c6 = ah0.b.I1((c0)w, RedditEndpoint.AllPosts, g.f, g.F, g.Q, g.R, g.S);
                }
                else {
                    final String i = d2.i;
                    boolean b2 = true;
                    if (!j.z0(i, "all", true) && !j.z0(d2.i, "friends", true) && !j.z0(d2.i, "mod", true)) {
                        if (d2.p != null && g.z.Y5()) {
                            final RemoteGqlLinkDataSource g3 = g.g;
                            final String j = d2.i;
                            e.c((Object)j);
                            final String p = d2.p;
                            final String d4 = d2.d;
                            final SearchPostSort new1 = SearchPostSort.NEW;
                            final Integer e = d2.e;
                            if (d4 != null) {
                                b2 = false;
                            }
                            g3.getClass();
                            ng2.e.f((Object)new1, "sort");
                            final StringBuilder sb = new StringBuilder();
                            sb.append("subreddit:\"");
                            sb.append(j);
                            sb.append("\" AND flair_name:\"");
                            sb.append(p);
                            sb.append('\"');
                            final String string = sb.toString();
                            final List l3 = d.l3((Object)new a1(h$a.c((Object)"nsfw"), h$a.c((Object)"1")));
                            final h7.h c7 = h$a.c((Object)new1);
                            int intValue;
                            if (e != null) {
                                intValue = e;
                            }
                            else {
                                intValue = 20;
                            }
                            c6 = e$a.a((mr0.e)g3.a, (k)new i8(string, intValue, h$a.c((Object)d4), c7, j, h$a.c((Object)l3), h$a.a(), h$a.a(), h$a.c((Object)(b2 ^ true)), h$a.c((Object)Boolean.FALSE), h$a.a()), (OkHttpClient)null, (Map)null, 14).w((o)new r(g3, b2, p));
                            ng2.e.e((Object)c6, "graphQlClient.execute(\n \u2026,\n        )\n      }\n    }");
                        }
                        else {
                            final RemoteGqlLinkDataSource g4 = g.g;
                            final String k = d2.i;
                            e.c((Object)k);
                            final SortType b3 = d2.b;
                            final SortTimeFrame c8 = d2.c;
                            final String d5 = d2.d;
                            final Integer e2 = d2.e;
                            final zu.a g5 = d2.g;
                            final ListingViewMode h2 = d2.h;
                            final String c9 = g.e.c();
                            g4.getClass();
                            final mr0.g a3 = g4.a;
                            final h7.h c10 = h$a.c((Object)Boolean.TRUE);
                            final h7.h c11 = h$a.c((Object)d5);
                            final h7.h c12 = h$a.c((Object)e2);
                            PostFeedRange apolloPostFeedRange2;
                            if (c8 != null) {
                                apolloPostFeedRange2 = InputVariableToGqlVariableMapperKt.toApolloPostFeedRange(c8);
                            }
                            else {
                                apolloPostFeedRange2 = null;
                            }
                            final h7.h c13 = h$a.c((Object)apolloPostFeedRange2);
                            PostFeedSort apolloPostFeedSort2;
                            if (b3 != null) {
                                apolloPostFeedSort2 = InputVariableToGqlVariableMapperKt.toApolloPostFeedSort(b3);
                            }
                            else {
                                apolloPostFeedSort2 = null;
                            }
                            final h7.h c14 = h$a.c((Object)apolloPostFeedSort2);
                            y12.a apolloAdContextInput$default;
                            if (h2 != null) {
                                apolloAdContextInput$default = InputVariableToGqlVariableMapperKt.getApolloAdContextInput$default((DisplaySource)null, h2, g5, g4.b, 1, (Object)null);
                            }
                            else {
                                apolloAdContextInput$default = null;
                            }
                            final pb pb = new pb(k, c14, c13, c11, c12, h$a.c((Object)apolloAdContextInput$default), h$a.c((Object)new c1(h$a.c((Object)c9), 14)), c10, aq2.a.h(g4.j));
                            g4.d.a(ListingType.SUBREDDIT);
                            final c0 w2 = e$a.a((mr0.e)a3, (k)pb, (OkHttpClient)null, map, 8).w((o)new su.c((Object)g4, 10));
                            e.e((Object)w2, "graphQlClient.execute(\n \u2026)\n        }\n      }\n    }");
                            c6 = ah0.b.I1((c0)w2, RedditEndpoint.SubredditPosts, g.f, g.F, g.Q, g.R, g.S);
                        }
                    }
                    else {
                        final RemoteLinkDataSource b4 = g.b;
                        final String m = d2.i;
                        e.c((Object)m);
                        final SortType b5 = d2.b;
                        final SortTimeFrame c15 = d2.c;
                        final String d6 = d2.d;
                        final String f2 = d2.f;
                        final ListingViewMode h3 = d2.h;
                        final String c16 = g.e.c();
                        final String i2 = d2.i;
                        e.c((Object)i2);
                        c6 = b4.getSubredditLinks(m, b5, c15, d6, f2, h3, true, c16, map, "debug", i2);
                    }
                }
                final r0 r0 = new r0(0, (Object)g, (Object)d2);
                c6.getClass();
                final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)c6, (o)r0));
                final com.reddit.data.repository.o o2 = new com.reddit.data.repository.o(g, 0);
                onAssembly.getClass();
                return RxJavaPlugins.onAssembly((c0)new h((af2.g0<Object>)onAssembly, (ff2.g<? super Object>)o2));
            }
            case 0: {
                final RedditLinkRepository g6 = this.g;
                final n n2 = (n)o;
                e.f((Object)g6, "this$0");
                e.f((Object)n2, "requestKey");
                return ah0.b.I1(ah0.b.l1((CoroutineContext)k0.b, (mg2.p)new RedditLinkRepository$recommendedVideosLinkStore$2$1$1(g6, n2, (gg2.c)null)), RedditEndpoint.RecommendedVideoPosts, g6.f, g6.F, g6.Q, g6.R, g6.S).w((o)new q0(0));
            }
        }
    }
}
