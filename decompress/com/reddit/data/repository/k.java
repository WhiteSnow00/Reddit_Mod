// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.domain.model.PostPoll;
import com.reddit.domain.model.UserSubreddit;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import com.reddit.domain.model.ILink;
import va0.i;
import b60.d2;
import java.util.Comparator;
import pd0.j;
import java.util.HashSet;
import kotlin.Pair;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.SubredditCategory;
import af2.c0;
import b60.q;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import gg2.c;
import zi2.k0;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.listing.Listing;
import av1.a;
import kotlin.collections.EmptyList;
import java.util.List;
import java.util.ArrayList;
import com.reddit.domain.model.search.AccountSearchResultItem;
import com.reddit.domain.model.search.SubredditSearchResultItem;
import com.reddit.data.remote.UnrecognizedTypeaheadResult;
import e22.b;
import com.reddit.domain.model.search.SearchResultItem;
import java.util.LinkedHashMap;
import ng2.e;
import com.reddit.domain.model.search.SearchResult;
import od0.d;
import ff2.o;

public final class k implements o
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public k(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public k(final d h, final RedditLinkRepository g) {
        this.f = 1;
        this.h = h;
        this.g = g;
    }
    
    public final Object apply(Object value) {
        switch (this.f) {
            default: {
                final RedditSearchRepository redditSearchRepository = (RedditSearchRepository)this.g;
                final String s = (String)this.h;
                final SearchResult searchResult = (SearchResult)value;
                final TimeUnit l = RedditSearchRepository.l;
                e.f((Object)redditSearchRepository, "this$0");
                e.f((Object)s, "$query");
                e.f((Object)searchResult, "response");
                final List items = searchResult.getItems();
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (final Object next : items) {
                    final SearchResultItem searchResultItem = (SearchResultItem)next;
                    final boolean u6 = redditSearchRepository.i.U6();
                    final boolean b = false;
                    boolean b2;
                    if (u6) {
                        if (searchResultItem instanceof b) {
                            b2 = ((b)searchResultItem).a.k;
                        }
                        else {
                            if (!(searchResultItem instanceof e22.d)) {
                                throw new UnrecognizedTypeaheadResult("Unable to recognize SearchResultItem type");
                            }
                            b2 = ((e22.d)searchResultItem).a.g;
                        }
                    }
                    else if (searchResultItem instanceof SubredditSearchResultItem) {
                        b2 = e.a((Object)((SubredditSearchResultItem)searchResultItem).getSubreddit().getOver18(), (Object)Boolean.TRUE);
                    }
                    else {
                        if (!(searchResultItem instanceof AccountSearchResultItem)) {
                            throw new UnrecognizedTypeaheadResult("Unable to recognize SearchResultItem type");
                        }
                        final UserSubreddit subreddit = ((AccountSearchResultItem)searchResultItem).getAccount().getSubreddit();
                        b2 = b;
                        if (subreddit != null) {
                            b2 = b;
                            if (subreddit.getOver18()) {
                                b2 = true;
                            }
                        }
                    }
                    final Boolean value2 = b2;
                    if ((value = linkedHashMap.get(value2)) == null) {
                        value = new ArrayList();
                        linkedHashMap.put(value2, value);
                    }
                    ((List)value).add(next);
                }
                Object instance;
                if ((instance = linkedHashMap.get(Boolean.FALSE)) == null) {
                    instance = EmptyList.INSTANCE;
                }
                Object instance2;
                if ((instance2 = linkedHashMap.get(Boolean.TRUE)) == null) {
                    instance2 = EmptyList.INSTANCE;
                }
                return new a(s, (List)instance, (List)instance2);
            }
            case 3: {
                final Listing listing = (Listing)this.g;
                final wb0.a a = (wb0.a)this.h;
                final Boolean b3 = (Boolean)value;
                e.f((Object)listing, "$links");
                e.f((Object)a, "$dataSource");
                e.f((Object)b3, "result");
                final List children = listing.getChildren();
                final ArrayList list = new ArrayList();
                for (final Object next2 : children) {
                    if (next2 instanceof Link) {
                        list.add(next2);
                    }
                }
                c0<Boolean> c0;
                if (b3 && (list.isEmpty() ^ true)) {
                    c0 = ah0.b.l1((CoroutineContext)k0.b, (p)new RedditLinkRepositoryKt$saveCrowdsourceTaggingQuestions$1$1(a, (List)list, (c)null)).w((ff2.o<? super Object, ? extends Boolean>)new q((Object)b3, 3));
                }
                else {
                    c0 = af2.c0.v(b3);
                }
                return c0;
            }
            case 2: {
                final Listing listing2 = (Listing)this.g;
                final SubredditCategory subredditCategory = (SubredditCategory)this.h;
                final List list2 = (List)value;
                final Pair<Long, TimeUnit> e = RedditCategoryRepository.e;
                ng2.e.f((Object)listing2, "$subredditListing");
                ng2.e.f((Object)subredditCategory, "$category");
                ng2.e.f((Object)list2, "it");
                final ArrayList j5 = CollectionsKt___CollectionsKt.J5((Collection)listing2.getChildren());
                j5.addAll(list2);
                return new Pair((Object)subredditCategory, (Object)j5);
            }
            case 1: {
                final d d = (d)this.h;
                final RedditLinkRepository redditLinkRepository = (RedditLinkRepository)this.g;
                final Listing listing3 = (Listing)value;
                e.f((Object)d, "$requestType");
                e.f((Object)redditLinkRepository, "this$0");
                e.f((Object)listing3, "listing");
                final List children2 = listing3.getChildren();
                final HashSet set = new HashSet();
                final ArrayList list3 = new ArrayList();
                for (final Object next3 : children2) {
                    if (set.add(((Link)next3).getUniqueId())) {
                        list3.add(next3);
                    }
                }
                value = list3;
                if (d instanceof d.a) {
                    final ArrayList<Link> list4 = new ArrayList<Link>();
                    for (final Object next4 : list3) {
                        final PostPoll poll = ((Link)next4).getPoll();
                        String predictionTournamentId;
                        if (poll != null) {
                            predictionTournamentId = poll.getPredictionTournamentId();
                        }
                        else {
                            predictionTournamentId = null;
                        }
                        if (e.a((Object)predictionTournamentId, (Object)((d.a)d).a)) {
                            list4.add((Link)next4);
                        }
                    }
                    value = list4;
                }
                final pd0.i q = redditLinkRepository.q;
                q.getClass();
                return Listing.copy$default(listing3, CollectionsKt___CollectionsKt.x5((Iterable)value, (Comparator)new j(q.a)), (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (Object)null);
            }
            case 0: {
                final RedditLinkRepository redditLinkRepository2 = (RedditLinkRepository)this.g;
                final d2 d2 = (d2)this.h;
                final Listing listing4 = (Listing)value;
                e.f((Object)redditLinkRepository2, "this$0");
                e.f((Object)d2, "$requestKey");
                e.f((Object)listing4, "prefilterListing");
                final Listing w0 = RedditLinkRepository.w0(listing4, d2.q, d2.r);
                final List children3 = w0.getChildren();
                final HashSet set2 = new HashSet();
                final ArrayList list5 = new ArrayList();
                for (final Object next5 : children3) {
                    if (set2.add(((ILink)next5).getUniqueId())) {
                        list5.add(next5);
                    }
                }
                return Listing.copy$default(w0, (List)list5, (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (Object)null);
            }
        }
    }
}
