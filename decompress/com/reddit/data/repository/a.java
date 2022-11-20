// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.data.remote.RemoteGqlBlockedAccountDataSource;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import q20.d;
import java.util.Map;
import okhttp3.OkHttpClient;
import mr0.e$a;
import com.reddit.queries.z;
import h7.h$a;
import mg2.l;
import af2.c0;
import kotlin.Pair;
import com.reddit.domain.model.SubredditCategory;
import com.reddit.data.model.category.RecommendedCategory;
import b60.r;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import ah0.b;
import gg2.c;
import java.util.List;
import zi2.k0;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.listing.Listing;
import com.reddit.domain.model.MyAccount;
import com.reddit.domain.model.search.RemoteSearchResultSet;
import com.reddit.domain.model.search.SearchResult;
import java.util.ArrayList;
import dg2.m;
import com.reddit.domain.model.search.RemoteSearchResult;
import com.reddit.data.model.StreamVideoDataRemoteDataModel;
import ng2.e;
import com.reddit.domain.model.Subreddit;
import ff2.o;

public final class a implements o
{
    public final int f;
    public final Object g;
    
    public a(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                final Subreddit subreddit = (Subreddit)this.g;
                final Boolean b = (Boolean)o;
                final Pair<Long, TimeUnit> g = RedditSubredditRepository.G;
                e.f((Object)subreddit, "$subreddit");
                e.f((Object)b, "it");
                return subreddit;
            }
            case 6: {
                final RedditStreamRepository redditStreamRepository = (RedditStreamRepository)this.g;
                final StreamVideoDataRemoteDataModel streamVideoDataRemoteDataModel = (StreamVideoDataRemoteDataModel)o;
                e.f((Object)redditStreamRepository, "this$0");
                e.f((Object)streamVideoDataRemoteDataModel, "it");
                return redditStreamRepository.r(streamVideoDataRemoteDataModel);
            }
            case 5: {
                final String s = (String)this.g;
                final RemoteSearchResult remoteSearchResult = (RemoteSearchResult)o;
                final TimeUnit l = RedditSearchRepository.l;
                e.f((Object)s, "$query");
                e.f((Object)remoteSearchResult, "searchResults");
                final List items = remoteSearchResult.getItems();
                final ArrayList list = new ArrayList<SearchResult>(m.u4((Iterable)items, 10));
                for (final RemoteSearchResultSet set : items) {
                    list.add(new SearchResult(s, set.getItems(), set.getAfter()));
                }
                return list;
            }
            case 4: {
                final RedditMyAccountRepository redditMyAccountRepository = (RedditMyAccountRepository)this.g;
                final MyAccount myAccount = (MyAccount)o;
                e.f((Object)redditMyAccountRepository, "this$0");
                e.f((Object)myAccount, "myAccount");
                return redditMyAccountRepository.e.getUserSubredditSettings(RedditMyAccountRepository.u(myAccount));
            }
            case 3: {
                final wb0.a a = (wb0.a)this.g;
                final Listing listing = (Listing)o;
                e.f((Object)a, "$dataSource");
                e.f((Object)listing, "listing");
                final List children = listing.getChildren();
                final ArrayList list2 = new ArrayList();
                for (final Object next : children) {
                    if (next instanceof Link) {
                        list2.add(next);
                    }
                }
                return b.l1((CoroutineContext)k0.b, (p)new RedditLinkRepositoryKt$attachCrowdsourceTaggingQuestions$1$1(a, (List)list2, (c)null)).w((o)new r((Object)listing, 3)).M();
            }
            case 2: {
                final Link link = (Link)this.g;
                final Listing listing2 = (Listing)o;
                final Pair<Long, TimeUnit> h0 = RedditLinkRepository.h0;
                e.f((Object)listing2, "listing");
                final List children2 = listing2.getChildren();
                final ArrayList list3 = new ArrayList();
                for (final Object next2 : children2) {
                    if (e.a((Object)((Link)next2).getId(), (Object)link.getId()) ^ true) {
                        list3.add(next2);
                    }
                }
                return Listing.copy$default(listing2, (List)px1.a.t0((Object)link, (List)list3), (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (Object)null);
            }
            case 1: {
                final RedditCategoryRepository redditCategoryRepository = (RedditCategoryRepository)this.g;
                final RecommendedCategory recommendedCategory = (RecommendedCategory)o;
                final Pair<Long, TimeUnit> e = RedditCategoryRepository.e;
                ng2.e.f((Object)redditCategoryRepository, "this$0");
                ng2.e.f((Object)recommendedCategory, "it");
                final SubredditCategory subredditCategory = new SubredditCategory("recommended", "Recommended", recommendedCategory.getColor(), recommendedCategory.getIcon());
                final Listing subreddits = recommendedCategory.getSubreddits();
                c0<Pair> c0;
                if (subreddits.getAfter() == null) {
                    c0 = af2.c0.v(new Pair((Object)subredditCategory, (Object)subreddits.getChildren()));
                    ng2.e.e((Object)c0, "{\n          Single.just(\u2026ting.children))\n        }");
                }
                else {
                    c0 = xd.a.X(subreddits.getAfter(), (l)new RedditCategoryRepository$remoteGetRecommendedCategory$1$1(redditCategoryRepository)).w((ff2.o<? super Object, ? extends Pair>)new k(2, subreddits, subredditCategory));
                    ng2.e.e((Object)c0, "private fun remoteGetRec\u2026cribeOn(backgroundThread)");
                }
                return c0;
            }
            case 0: {
                final RedditBlockedAccountRepository redditBlockedAccountRepository = (RedditBlockedAccountRepository)this.g;
                final Boolean b2 = (Boolean)o;
                e.f((Object)redditBlockedAccountRepository, "this$0");
                e.f((Object)b2, "isCached");
                c0<Set> c2;
                if (b2) {
                    c2 = c0.v(redditBlockedAccountRepository.d.a);
                    e.e((Object)c2, "{\n          Single.just(\u2026taSource.get())\n        }");
                }
                else {
                    final RemoteGqlBlockedAccountDataSource c3 = redditBlockedAccountRepository.c;
                    c3.getClass();
                    final c0 w = e$a.a((mr0.e)c3.a, (h7.k)new z(h$a.a(), h$a.b((Object)1000)), (OkHttpClient)null, (Map)null, 14).w((o)new com.reddit.video.creation.widgets.adjustclips.trim.c(18));
                    e.e((Object)w, "graphQlClient.execute(op\u2026   ?: emptyList()\n      }");
                    c2 = px1.a.K0((c0)w, (d)redditBlockedAccountRepository.a);
                }
                return c2.w((ff2.o<? super Set, ?>)new r((Object)b2, 1));
            }
        }
    }
}
