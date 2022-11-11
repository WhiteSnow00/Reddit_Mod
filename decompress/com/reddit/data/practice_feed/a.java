// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.practice_feed;

import com.reddit.fragment.PostRecommendationFragment$u;
import com.reddit.fragment.PostFragment$g$a;
import com.reddit.fragment.PostFragment$g;
import com.reddit.fragment.PostFragment$a;
import com.reddit.fragment.PostContentFragment;
import com.reddit.fragment.PostFragment$d;
import com.reddit.fragment.PostFragment;
import com.reddit.fragment.PostRecommendationFragment;
import com.reddit.queries.x8$e$a;
import com.reddit.queries.x8$e;
import com.reddit.fragment.SubredditFragment;
import java.util.Iterator;
import com.reddit.queries.x8$d;
import com.reddit.queries.x8$f;
import kotlin.collections.EmptyList;
import com.reddit.fragment.CrosspostContentFragment;
import com.reddit.fragment.FeedAnswerableQuestionsFragment;
import com.squareup.moshi.JsonAdapter;
import com.reddit.queries.x8$c;
import com.reddit.domain.model.Link;
import java.util.ArrayList;
import com.reddit.queries.x8$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import mr0.e$a;
import com.reddit.queries.x8;
import h7.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import lg2.c;
import java.util.List;
import javax.inject.Inject;
import sg2.e;
import hg2.f;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import com.squareup.moshi.y;
import mr0.g;
import ed0.b;

public final class a implements b
{
    public final g a;
    public final y b;
    public final GqlPostToLinkDomainModelMapper c;
    public final jr0.a d;
    public final f e;
    
    @Inject
    public a(final GqlPostToLinkDomainModelMapper c, final jr0.a d, final g a, final y b) {
        sg2.e.f((Object)b, "moshi");
        sg2.e.f((Object)d, "goldFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = kotlin.a.b((rg2.a)new RemoteGqlPracticeFeedDataSource$richTextAdapter$2(this));
    }
    
    public final Serializable a(final List list, final int n, final c c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlPracticeFeedDataSource$getLinks$1) {
                final RemoteGqlPracticeFeedDataSource$getLinks$1 remoteGqlPracticeFeedDataSource$getLinks$1 = (RemoteGqlPracticeFeedDataSource$getLinks$1)c;
                final int label = remoteGqlPracticeFeedDataSource$getLinks$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPracticeFeedDataSource$getLinks$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPracticeFeedDataSource$getLinks$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlPracticeFeedDataSource$getLinks$1(this, c);
        }
        final Object result = ((RemoteGqlPracticeFeedDataSource$getLinks$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPracticeFeedDataSource$getLinks$1)o).label;
        a a;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a = (a)((RemoteGqlPracticeFeedDataSource$getLinks$1)o).L$0;
            yd.b.k0(result);
            b = result;
        }
        else {
            yd.b.k0(result);
            final g a2 = this.a;
            final x8 x8 = new x8(h.a.c(list), a.g(n), a81.e.k(this.d), 52);
            ((RemoteGqlPracticeFeedDataSource$getLinks$1)o).L$0 = this;
            ((RemoteGqlPracticeFeedDataSource$getLinks$1)o).label = 1;
            b = e$a.b(14, (k)x8, (mr0.e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            a = this;
        }
        final x8$f a3 = ((x8$b)b).a;
        if (a3 != null) {
            final x8$d b2 = a3.b;
            if (b2 != null) {
                final List b3 = b2.b;
                if (b3 != null) {
                    final ArrayList<Link> list2 = new ArrayList<Link>();
                    final Iterator iterator = b3.iterator();
                    while (true) {
                        final Object instance = list2;
                        if (!iterator.hasNext()) {
                            return (Serializable)instance;
                        }
                        final x8$c x8$c = (x8$c)iterator.next();
                        final Link link = null;
                        final SubredditFragment subredditFragment = null;
                        Link map$default = link;
                        if (x8$c != null) {
                            final x8$e b4 = x8$c.b;
                            map$default = link;
                            if (b4 != null) {
                                final x8$e$a b5 = b4.b;
                                map$default = link;
                                if (b5 != null) {
                                    final PostRecommendationFragment a4 = b5.a;
                                    map$default = link;
                                    if (a4 != null) {
                                        a.getClass();
                                        final PostFragment a5 = a4.c.b.a;
                                        map$default = link;
                                        if (a5 != null) {
                                            final PostFragment$d c2 = a5.c;
                                            map$default = link;
                                            if (c2 != null) {
                                                final PostContentFragment a6 = c2.a;
                                                map$default = link;
                                                if (a6 != null) {
                                                    final GqlPostToLinkDomainModelMapper c3 = a.c;
                                                    final PostFragment$a d = a5.d;
                                                    SubredditFragment a7 = subredditFragment;
                                                    if (d != null) {
                                                        final PostFragment$g c4 = d.c;
                                                        a7 = subredditFragment;
                                                        if (c4 != null) {
                                                            final PostFragment$g$a b6 = c4.b;
                                                            a7 = subredditFragment;
                                                            if (b6 != null) {
                                                                a7 = b6.a;
                                                            }
                                                        }
                                                    }
                                                    final PostRecommendationFragment$u b7 = a4.b;
                                                    final JsonAdapter jsonAdapter = a.e.getValue();
                                                    sg2.e.e((Object)jsonAdapter, "richTextAdapter");
                                                    map$default = GqlPostToLinkDomainModelMapper.map$default(c3, a7, a6, b7, (FeedAnswerableQuestionsFragment)null, (CrosspostContentFragment)null, (String)null, (List)null, (Integer)null, jsonAdapter, 248, (Object)null);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (map$default == null) {
                            continue;
                        }
                        list2.add(map$default);
                    }
                }
            }
        }
        final Object instance = EmptyList.INSTANCE;
        return (Serializable)instance;
    }
}
