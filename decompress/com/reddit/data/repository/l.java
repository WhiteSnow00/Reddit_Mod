// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import kotlin.Pair;
import java.util.concurrent.TimeUnit;
import mg2.p;
import gg2.c;
import com.reddit.domain.model.listing.Listing;
import ng2.e;
import java.util.List;
import ff2.g;

public final class l implements g
{
    public final int f;
    public final Object g;
    
    public l(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void accept(final Object o) {
        switch (this.f) {
            default: {
                final RedditRegionRepository redditRegionRepository = (RedditRegionRepository)this.g;
                final List list = (List)o;
                final TimeUnit h = RedditRegionRepository.h;
                e.f((Object)redditRegionRepository, "this$0");
                redditRegionRepository.b();
                return;
            }
            case 1: {
                final RedditLinkRepository redditLinkRepository = (RedditLinkRepository)this.g;
                final Listing listing = (Listing)o;
                final Pair<Long, TimeUnit> h2 = RedditLinkRepository.h0;
                e.f((Object)redditLinkRepository, "this$0");
                redditLinkRepository.s.e("LinkRepository.getPopular_network_fetch");
                redditLinkRepository.s.b("LinkRepository.getPopular_update_subreddit_titles");
                zi2.g.i((p)new RedditLinkRepository$fetchPopularListing$3$1(redditLinkRepository, listing, (c)null));
                redditLinkRepository.s.e("LinkRepository.getPopular_update_subreddit_titles");
                return;
            }
            case 0: {
                final RedditLinkRepository redditLinkRepository2 = (RedditLinkRepository)this.g;
                final Listing listing2 = (Listing)o;
                e.f((Object)redditLinkRepository2, "this$0");
                zi2.g.i((p)new RedditLinkRepository$popularLinkStore$2$1$2$1(redditLinkRepository2, listing2, (c)null));
            }
        }
    }
}
