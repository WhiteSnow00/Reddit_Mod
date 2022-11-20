// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import px1.a;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import ah0.b;
import gg2.c;
import zi2.k0;
import ng2.e;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import com.reddit.domain.model.listing.Listing;
import ff2.g;

public final class d implements g
{
    public final RedditLinkRepository f;
    public final Listing g;
    public final SortType h;
    public final SortTimeFrame i;
    public final String j;
    
    public d(final RedditLinkRepository f, final Listing g, final SortType h, final SortTimeFrame i, final String j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void accept(final Object o) {
        final RedditLinkRepository f = this.f;
        final Listing g = this.g;
        final SortType h = this.h;
        final SortTimeFrame i = this.i;
        final String j = this.j;
        final Listing listing = (Listing)o;
        e.f((Object)f, "this$0");
        e.f((Object)g, "$postFilteredListing");
        f.s.e("LinkRepository.process_frontpage_data");
        a.K0(b.l1((CoroutineContext)k0.b, (p)new RedditLinkRepository$saveHomeLinksInternalSingle$1(f, g, h, i, j, (c)null)), (q20.d)f.a).E();
    }
}
