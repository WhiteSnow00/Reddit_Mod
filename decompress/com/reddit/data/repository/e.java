// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import q20.d;
import af2.c0;
import px1.a;
import ff2.o;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import ah0.b;
import gg2.c;
import zi2.k0;
import com.reddit.domain.model.listing.Listing;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import ff2.g;

public final class e implements g
{
    public final RedditLinkRepository f;
    public final SortType g;
    public final SortTimeFrame h;
    public final String i;
    public final String j;
    
    public e(final RedditLinkRepository f, final SortType g, final SortTimeFrame h, final String i, final String j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void accept(final Object o) {
        final RedditLinkRepository f = this.f;
        final SortType g = this.g;
        final SortTimeFrame h = this.h;
        final String i = this.i;
        final String j = this.j;
        final Listing listing = (Listing)o;
        ng2.e.f((Object)f, "this$0");
        ng2.e.f((Object)g, "$sort");
        ng2.e.f((Object)j, "$geoFilter");
        ng2.e.e((Object)listing, "listing");
        String geoFilter = listing.getGeoFilter();
        if (geoFilter == null) {
            geoFilter = j;
        }
        final c0 p = b.l1((CoroutineContext)k0.b, (p)new RedditLinkRepository$savePopularLinksInternalSingle$1(f, listing, g, h, i, geoFilter, (c)null)).p((o)new k(3, listing, f.d));
        ng2.e.e((Object)p, "flatMap { result ->\n    \u2026le.just(result)\n    }\n  }");
        a.K0((c0)p, (d)f.a).E();
    }
}
