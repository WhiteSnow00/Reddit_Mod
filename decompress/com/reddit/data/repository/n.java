// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import mg2.p;
import gg2.c;
import va0.j;
import va0.i;
import com.reddit.domain.model.listing.Listing;
import b60.d2;
import ng2.e;
import com.reddit.tracking.a;
import b60.f0;
import ff2.g;

public final class n implements g
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public n(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void accept(final Object o) {
        switch (this.f) {
            default: {
                final f0 f0 = (f0)this.g;
                final a a = (a)this.h;
                final df2.a a2 = (df2.a)o;
                e.f((Object)f0, "this$0");
                e.f((Object)a, "$stopwatch");
                if (!a.b) {
                    a.a();
                }
                return;
            }
            case 0: {
                final RedditLinkRepository redditLinkRepository = (RedditLinkRepository)this.g;
                final d2 d2 = (d2)this.h;
                final Listing listing = (Listing)o;
                e.f((Object)redditLinkRepository, "this$0");
                e.f((Object)d2, "$requestKey");
                e.e((Object)listing, "prefilterListing");
                zi2.g.i((p)new RedditLinkRepository$savedPostsStore$2$1$1$1(redditLinkRepository, RedditLinkRepository.o0(redditLinkRepository, listing, d2.q, d2.r), (c)null));
            }
        }
    }
}
