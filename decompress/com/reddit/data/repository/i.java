// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import x12.f;
import kotlin.Pair;
import mg2.p;
import gg2.c;
import va0.j;
import com.reddit.domain.model.listing.Listing;
import b60.d2;
import java.util.concurrent.TimeUnit;
import b60.f0;
import aq2.a;
import ng2.e;
import ff2.g;

public final class i implements g
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public i(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void accept(final Object o) {
        switch (this.f) {
            default: {
                final RedditSubredditRepository$d redditSubredditRepository$d = (RedditSubredditRepository$d)this.g;
                final RedditSubredditRepository redditSubredditRepository = (RedditSubredditRepository)this.h;
                final Throwable t = (Throwable)o;
                final Pair<Long, TimeUnit> g = RedditSubredditRepository.G;
                e.f((Object)redditSubredditRepository$d, "$key");
                e.f((Object)redditSubredditRepository, "this$0");
                redditSubredditRepository$d.c = null;
                a.y("Failed to fetch moderated subreddits", t, redditSubredditRepository.q);
                return;
            }
            case 1: {
                final f0 f0 = (f0)this.g;
                final com.reddit.tracking.a a = (com.reddit.tracking.a)this.h;
                final Throwable t2 = (Throwable)o;
                e.f((Object)f0, "this$0");
                e.f((Object)a, "$stopwatch");
                final f h = f0.h;
                long convert;
                if (a.b) {
                    final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
                    e.f((Object)milliseconds, "desiredUnit");
                    long d;
                    if (a.b) {
                        d = ((Number)a.a.invoke()).longValue() - a.c + a.d;
                    }
                    else {
                        d = a.d;
                    }
                    convert = milliseconds.convert(d, TimeUnit.NANOSECONDS);
                }
                else {
                    convert = -1L;
                }
                e.e((Object)t2, "throwable");
                h.c(convert, t2, "https://oauth.reddit.com/api/logged_out/badge_counts", f0.k, f0.l, f0.m);
                return;
            }
            case 0: {
                final RedditLinkRepository redditLinkRepository = (RedditLinkRepository)this.g;
                final d2 d2 = (d2)this.h;
                final Listing listing = (Listing)o;
                e.f((Object)redditLinkRepository, "this$0");
                e.f((Object)d2, "$requestKey");
                e.e((Object)listing, "prefilterListing");
                zi2.g.i((p)new RedditLinkRepository$multiredditLinkStore$2$1$1$1(redditLinkRepository, RedditLinkRepository.o0(redditLinkRepository, listing, d2.q, d2.r), (c)null));
            }
        }
    }
}
