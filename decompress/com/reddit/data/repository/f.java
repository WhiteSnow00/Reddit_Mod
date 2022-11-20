// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.data.remote.RemoteLinkDataSource;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import java.util.Map;
import b60.n0;
import mg2.p;
import io.reactivex.internal.operators.single.SingleFlatMap;
import b60.q0;
import com.reddit.listing.model.sort.HistorySortType;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.g;
import af2.g0;
import pf2.h;
import com.reddit.tracking.RedditEndpoint;
import ff2.o;
import y50.m;
import okhttp3.OkHttpClient;
import h7.k;
import mr0.e$a;
import com.reddit.queries.ja;
import h7.h$a;
import kotlin.collections.c;
import vl.a;
import ng2.e;
import b60.d2;
import af2.c0;
import pt.b;

public final class f implements b
{
    public final int f;
    public final RedditLinkRepository g;
    
    public f(final RedditLinkRepository g, final int f) {
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
                final RemoteGqlLinkDataSource g2 = g.g;
                final String d3 = d2.d;
                g2.getClass();
                final c0 w = e$a.a((mr0.e)g2.a, (k)new ja(h$a.c((Object)d3), h$a.a(), h$a.a(), aq2.a.h(g2.j), 48), (OkHttpClient)null, map, 10).w((o)new m(g2, 3));
                e.e((Object)w, "graphQlClient.execute(\n \u2026,\n        )\n      }\n    }");
                return RxJavaPlugins.onAssembly((c0)new h((af2.g0<Object>)ah0.b.I1((c0)w, RedditEndpoint.SavedPosts, g.f, g.F, g.Q, g.R, g.S), (ff2.g<? super Object>)new n(0, g, d2)));
            }
            case 1: {
                final RedditLinkRepository g3 = this.g;
                final b60.f f = (b60.f)o;
                e.f((Object)g3, "this$0");
                e.f((Object)f, "<name for destructuring parameter 0>");
                final String a = f.a;
                final HistorySortType b = f.b;
                final String c = f.c;
                c0 c2;
                if (b == HistorySortType.RECENT) {
                    final c0 w2 = g3.c.K().w((o)new q0(3));
                    e.e((Object)w2, "localDb.getReadLinkIds()\u2026, ThingType.LINK) }\n    }");
                    c2 = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)w2, (o)new com.reddit.data.repository.h(c, g3)));
                }
                else if (g3.z.k7()) {
                    c2 = (c0)zi2.g.i((p)new RedditLinkRepository$historyLinkStore$2$1$2(b, g3, c, (gg2.c)null));
                }
                else {
                    c2 = g3.b.getHistoryListing(a, b, c);
                }
                return c2;
            }
            case 0: {
                final RedditLinkRepository g4 = this.g;
                final b60.c c3 = (b60.c)o;
                e.f((Object)g4, "this$0");
                e.f((Object)c3, "requestKey");
                final RemoteLinkDataSource b2 = g4.b;
                final String value = String.valueOf(c3.a);
                final SortTimeFrame b3 = c3.b;
                final String c4 = c3.c;
                final String e = c3.e;
                ng2.e.c((Object)e);
                return b2.getLinkListing(e, value, b3, c4).w((o)new n0(0));
            }
        }
    }
}
