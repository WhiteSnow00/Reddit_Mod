// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import mg2.p;
import gg2.c;
import ng2.e;
import com.reddit.domain.model.listing.Listing;
import ff2.g;

public final class o implements g
{
    public final int f;
    public final RedditLinkRepository g;
    
    public o(final RedditLinkRepository g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void accept(final Object o) {
        switch (this.f) {
            default: {
                final RedditLinkRepository g = this.g;
                final Listing listing = (Listing)o;
                final Pair<Long, TimeUnit> h0 = RedditLinkRepository.h0;
                e.f((Object)g, "this$0");
                g.s.e("LinkRepository.getFrontpage_network_fetch");
                g.s.b("LinkRepository.getFrontpage_update_subreddit_titles");
                zi2.g.i((p)new RedditLinkRepository$getHome$remote$1$1(g, listing, (c)null));
                g.s.e("LinkRepository.getFrontpage_update_subreddit_titles");
                return;
            }
            case 0: {
                final RedditLinkRepository g2 = this.g;
                final Listing listing2 = (Listing)o;
                e.f((Object)g2, "this$0");
                zi2.g.i((p)new RedditLinkRepository$subredditLinkStore$2$1$2$1(g2, listing2, (c)null));
            }
        }
    }
}
