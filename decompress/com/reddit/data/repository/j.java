// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import com.reddit.ads.domain.DisplaySource;
import java.util.Map;
import od0.d;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.g;
import af2.g0;
import pf2.h;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import b60.d2;
import ff2.o;
import com.reddit.tracking.RedditEndpoint;
import mg2.p;
import kotlin.collections.c;
import vl.a;
import ng2.e;
import b60.k;
import af2.c0;
import pt.b;

public final class j implements b
{
    public final int f;
    public final RedditLinkRepository g;
    
    public j(final RedditLinkRepository g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final c0 m(final Object o) {
        switch (this.f) {
            default: {
                final RedditLinkRepository g = this.g;
                final k k = (k)o;
                e.f((Object)g, "this$0");
                e.f((Object)k, "<name for destructuring parameter 0>");
                final String a = k.a;
                final d b = k.b;
                final String c = k.c;
                Map map;
                if (c != null) {
                    map = vl.a.X2(c, g.f, (String)null);
                }
                else {
                    map = kotlin.collections.c.u4();
                }
                return ah0.b.I1(ah0.b.m1((p)new RedditLinkRepository$predictionsTournamentPostsStore$2$1$1(g, a, b, map, (gg2.c)null)), RedditEndpoint.PredictionsTournamentPosts, g.f, g.F, g.Q, g.R, g.S).w((o)new com.reddit.data.repository.k(b, g));
            }
            case 0: {
                final RedditLinkRepository g2 = this.g;
                final d2 d2 = (d2)o;
                e.f((Object)g2, "this$0");
                e.f((Object)d2, "requestKey");
                final String n = d2.n;
                Map map2;
                if (n != null) {
                    map2 = a.X2(n, g2.f, d2.o);
                }
                else {
                    map2 = c.u4();
                }
                final RemoteGqlLinkDataSource g3 = g2.g;
                final DisplaySource a2 = d2.a;
                final SortType b2 = d2.b;
                e.c((Object)b2);
                final SortTimeFrame c2 = d2.c;
                final String d3 = d2.d;
                final zu.a g4 = d2.g;
                final ListingViewMode h = d2.h;
                final String l = d2.l;
                e.c((Object)l);
                final c0 w = ah0.b.I1(RemoteGqlLinkDataSource.i(g3, a2, b2, c2, d3, g4, h, l, g2.e.c(), map2, d2.e, (Boolean)null, 1024), RedditEndpoint.PopularPosts, g2.f, g2.F, g2.Q, g2.R, g2.S).w((o)new com.reddit.data.repository.k(0, g2, d2));
                final l i = new l(g2, 0);
                w.getClass();
                return RxJavaPlugins.onAssembly((c0)new h((af2.g0<Object>)w, (ff2.g<? super Object>)i));
            }
        }
    }
}
