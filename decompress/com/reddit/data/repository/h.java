// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.listing.Listing;
import mg2.p;
import zi2.g;
import gg2.c;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.EmptyList;
import tg2.i;
import af2.c0;
import ng2.e;
import java.util.List;
import ff2.o;

public final class h implements o
{
    public final int f;
    public final String g;
    public final Object h;
    
    public h(final RedditSubredditRepository h, final String g) {
        this.f = 1;
        this.h = h;
        this.g = g;
    }
    
    public h(final String g, final RedditLinkRepository h) {
        this.f = 0;
        this.g = g;
        this.h = h;
    }
    
    public final Object apply(Object i) {
        switch (this.f) {
            default: {
                final RedditSubredditRepository redditSubredditRepository = (RedditSubredditRepository)this.h;
                final String g = this.g;
                final List list = (List)i;
                final Pair<Long, TimeUnit> g2 = RedditSubredditRepository.G;
                e.f((Object)redditSubredditRepository, "this$0");
                e.f((Object)list, "it");
                Object o;
                if (list.isEmpty()) {
                    o = redditSubredditRepository.o0(RedditSubredditRepository$SubredditGroup.SUBSCRIBED, g);
                }
                else {
                    o = c0.v(list);
                    e.e(o, "{\n          Single.just(it)\n        }");
                }
                return o;
            }
            case 0: {
                final String g3 = this.g;
                final RedditLinkRepository redditLinkRepository = (RedditLinkRepository)this.h;
                final List list2 = (List)i;
                e.f((Object)redditLinkRepository, "this$0");
                e.f((Object)list2, "it");
                Object o3;
                if (list2.isEmpty() ^ true) {
                    final i j = new i(Math.max(0, list2.indexOf(g3) + 1), list2.size() - 1);
                    Object o2;
                    if (j.isEmpty()) {
                        o2 = EmptyList.INSTANCE;
                    }
                    else {
                        o2 = CollectionsKt___CollectionsKt.I5((Iterable)list2.subList(j.n(), j.m() + 1));
                    }
                    if (redditLinkRepository.z.k7()) {
                        i = zi2.g.i((p)new RedditLinkRepository$historyLinkStore$2$1$1$1(redditLinkRepository, (List)o2, (c)null));
                        e.e(i, "class RedditLinkReposito\u2026REDDIT_NAME = \"mod\"\n  }\n}");
                        o3 = i;
                    }
                    else {
                        o3 = redditLinkRepository.i0((List<String>)o2);
                    }
                }
                else {
                    o3 = c0.v(new Listing((List)EmptyList.INSTANCE, (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (DefaultConstructorMarker)null));
                    e.e(o3, "{\n              Single.j\u2026ptyList()))\n            }");
                }
                return o3;
            }
        }
    }
}
