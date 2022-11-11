// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.fragment.PostFragment$g$a;
import com.reddit.fragment.PostFragment$g;
import com.reddit.fragment.PostFragment$a;
import com.reddit.fragment.PostContentFragment;
import com.reddit.queries.PostsByIdsQuery$b$a;
import com.reddit.fragment.SubredditFragment;
import com.reddit.fragment.CrosspostContentFragment;
import com.reddit.fragment.PostRecommendationFragment$u;
import com.squareup.moshi.JsonAdapter;
import com.reddit.queries.PostsByIdsQuery$b;
import com.reddit.queries.PostsByIdsQuery$Data;
import com.reddit.queries.PostsByIdsQuery;
import com.reddit.queries.g1$g$a;
import com.reddit.queries.g1$g;
import com.reddit.queries.g1$f$a;
import com.reddit.queries.g1$f;
import com.reddit.queries.g1$c;
import com.reddit.queries.g1$e;
import com.reddit.queries.g1$d;
import com.reddit.queries.g1$b;
import com.reddit.queries.g1;
import com.reddit.queries.jd$f$a;
import com.reddit.queries.jd$f;
import com.reddit.queries.jd$e$a;
import com.reddit.queries.jd$e;
import com.reddit.queries.jd$g;
import com.reddit.queries.jd$d;
import com.reddit.queries.jd$c;
import com.reddit.queries.jd$b;
import com.reddit.queries.jd;
import com.reddit.queries.m6$g$a;
import com.reddit.queries.m6$g;
import com.reddit.fragment.PostFragment;
import com.reddit.queries.m6$f$a;
import com.reddit.queries.m6$f;
import java.util.Iterator;
import com.reddit.queries.m6$d;
import al0.ti;
import com.reddit.queries.m6$e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import kotlin.collections.EmptyList;
import java.util.List;
import com.reddit.fragment.FeedAnswerableQuestionsFragment;
import com.reddit.queries.m6$c;
import java.util.ArrayList;
import com.reddit.queries.m6$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import mr0.e$a;
import com.reddit.queries.m6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.listing.Listing;
import lg2.c;
import g22.z0;
import lw0.b;
import com.reddit.type.FeedFeature;
import h7.h;
import javax.inject.Inject;
import kotlin.a;
import sg2.e;
import hg2.f;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import com.squareup.moshi.y;
import mr0.g;
import w50.k;

public final class RemoteGqlHistoryDataSourceImpl implements k
{
    public final g a;
    public final y b;
    public final GqlPostToLinkDomainModelMapper c;
    public final f d;
    
    @Inject
    public RemoteGqlHistoryDataSourceImpl(final g a, final y b, final GqlPostToLinkDomainModelMapper c) {
        e.f((Object)a, "graphQlClient");
        e.f((Object)b, "moshi");
        e.f((Object)c, "gqlPostToLinkDomainModelMapper");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.a.b((rg2.a)new RemoteGqlHistoryDataSourceImpl$richTextAdapter$2(this));
    }
    
    public static h e() {
        return h.a.c(new z0(h.a.c(b.r1((Object)FeedFeature.COMMENT_POST_UNITS)), 2));
    }
    
    public final Object a(final String s, final c<? super Listing<Link>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1) {
                final RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1 remoteGqlHistoryDataSourceImpl$getHiddenPosts$1 = (RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)c;
                final int label = remoteGqlHistoryDataSourceImpl$getHiddenPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlHistoryDataSourceImpl$getHiddenPosts$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlHistoryDataSourceImpl$getHiddenPosts$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1(this, (c)c);
        }
        final Object result = ((RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)o).label;
        RemoteGqlHistoryDataSourceImpl remoteGqlHistoryDataSourceImpl;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlHistoryDataSourceImpl = (RemoteGqlHistoryDataSourceImpl)((RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)o).L$0;
            yd.b.k0(result);
            b = result;
        }
        else {
            yd.b.k0(result);
            final g a = this.a;
            final h c2 = h.a.c(s);
            final h g = a.g(10);
            final Boolean true = Boolean.TRUE;
            final m6 m6 = new m6(c2, g, h.a.c(true), h.a.c(true), e(), h.a.c(true));
            ((RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)o).L$0 = this;
            ((RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)o).label = 1;
            b = e$a.b(14, (h7.k)m6, (mr0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlHistoryDataSourceImpl = this;
        }
        final m6$b m6$b = (m6$b)b;
        final m6$e a2 = m6$b.a;
        final ti ti = null;
        Object instance = null;
        Label_0353: {
            if (a2 != null) {
                final m6$d b2 = a2.b;
                if (b2 != null) {
                    final List c3 = b2.c;
                    if (c3 != null) {
                        final ArrayList<Link> list = new ArrayList<Link>();
                        final Iterator iterator = c3.iterator();
                        while (true) {
                            instance = list;
                            if (!iterator.hasNext()) {
                                break Label_0353;
                            }
                            final m6$c m6$c = (m6$c)iterator.next();
                            final GqlPostToLinkDomainModelMapper c4 = remoteGqlHistoryDataSourceImpl.c;
                            Link link$default = null;
                            Label_0335: {
                                if (m6$c != null) {
                                    final m6$f b3 = m6$c.b;
                                    if (b3 != null) {
                                        final m6$f$a b4 = b3.b;
                                        if (b4 != null) {
                                            final PostFragment a3 = b4.a;
                                            if (a3 != null) {
                                                link$default = GqlPostToLinkDomainModelMapper.toLink$default(c4, a3, (FeedAnswerableQuestionsFragment)null, (String)null, (List)null, (Integer)null, 15, (Object)null);
                                                break Label_0335;
                                            }
                                        }
                                    }
                                }
                                link$default = null;
                            }
                            if (link$default == null) {
                                continue;
                            }
                            list.add(link$default);
                        }
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        final m6$e a4 = m6$b.a;
        ti a5 = ti;
        if (a4 != null) {
            final m6$d b5 = a4.b;
            a5 = ti;
            if (b5 != null) {
                final m6$g b6 = b5.b;
                a5 = ti;
                if (b6 != null) {
                    final m6$g$a b7 = b6.b;
                    a5 = ti;
                    if (b7 != null) {
                        a5 = b7.a;
                    }
                }
            }
        }
        return new Listing((List)instance, GqlDataToDomainModelMapperKt.getAfter(a5), (String)null, (String)null, (String)null, false, (List)null, 124, (DefaultConstructorMarker)null);
    }
    
    public final Object b(final String s, final c<? super Listing<Link>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1) {
                final RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1 remoteGqlHistoryDataSourceImpl$getUpvotedPosts$1 = (RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)c;
                final int label = remoteGqlHistoryDataSourceImpl$getUpvotedPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlHistoryDataSourceImpl$getUpvotedPosts$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlHistoryDataSourceImpl$getUpvotedPosts$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1(this, (c)c);
        }
        final Object result = ((RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)o).label;
        RemoteGqlHistoryDataSourceImpl remoteGqlHistoryDataSourceImpl;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlHistoryDataSourceImpl = (RemoteGqlHistoryDataSourceImpl)((RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)o).L$0;
            yd.b.k0(result);
            b = result;
        }
        else {
            yd.b.k0(result);
            final g a = this.a;
            final h c2 = h.a.c(s);
            final h g = a.g(10);
            final Boolean true = Boolean.TRUE;
            final jd jd = new jd(c2, g, h.a.c(true), h.a.c(true), e(), h.a.c(true));
            ((RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)o).L$0 = this;
            ((RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)o).label = 1;
            b = e$a.b(14, (h7.k)jd, (mr0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlHistoryDataSourceImpl = this;
        }
        final jd$b jd$b = (jd$b)b;
        final jd$d a2 = jd$b.a;
        final ti ti = null;
        Object instance = null;
        Label_0351: {
            if (a2 != null) {
                final jd$g b2 = a2.b;
                if (b2 != null) {
                    final List c3 = b2.c;
                    if (c3 != null) {
                        final ArrayList<Link> list = new ArrayList<Link>();
                        final Iterator iterator = c3.iterator();
                        while (true) {
                            instance = list;
                            if (!iterator.hasNext()) {
                                break Label_0351;
                            }
                            final jd$c jd$c = (jd$c)iterator.next();
                            final GqlPostToLinkDomainModelMapper c4 = remoteGqlHistoryDataSourceImpl.c;
                            Link link$default = null;
                            Label_0333: {
                                if (jd$c != null) {
                                    final jd$e b3 = jd$c.b;
                                    if (b3 != null) {
                                        final jd$e$a b4 = b3.b;
                                        if (b4 != null) {
                                            final PostFragment a3 = b4.a;
                                            if (a3 != null) {
                                                link$default = GqlPostToLinkDomainModelMapper.toLink$default(c4, a3, (FeedAnswerableQuestionsFragment)null, (String)null, (List)null, (Integer)null, 15, (Object)null);
                                                break Label_0333;
                                            }
                                        }
                                    }
                                }
                                link$default = null;
                            }
                            if (link$default == null) {
                                continue;
                            }
                            list.add(link$default);
                        }
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        final jd$d a4 = jd$b.a;
        ti a5 = ti;
        if (a4 != null) {
            final jd$g b5 = a4.b;
            a5 = ti;
            if (b5 != null) {
                final jd$f b6 = b5.b;
                a5 = ti;
                if (b6 != null) {
                    final jd$f$a b7 = b6.b;
                    a5 = ti;
                    if (b7 != null) {
                        a5 = b7.a;
                    }
                }
            }
        }
        return new Listing((List)instance, GqlDataToDomainModelMapperKt.getAfter(a5), (String)null, (String)null, (String)null, false, (List)null, 124, (DefaultConstructorMarker)null);
    }
    
    public final Object c(final String s, final c<? super Listing<Link>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1) {
                final RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1 remoteGqlHistoryDataSourceImpl$getDownvotedPosts$1 = (RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)c;
                final int label = remoteGqlHistoryDataSourceImpl$getDownvotedPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlHistoryDataSourceImpl$getDownvotedPosts$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlHistoryDataSourceImpl$getDownvotedPosts$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1(this, (c)c);
        }
        final Object result = ((RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)o).label;
        RemoteGqlHistoryDataSourceImpl remoteGqlHistoryDataSourceImpl;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlHistoryDataSourceImpl = (RemoteGqlHistoryDataSourceImpl)((RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)o).L$0;
            yd.b.k0(result);
            b = result;
        }
        else {
            yd.b.k0(result);
            final g a = this.a;
            final h c2 = h.a.c(s);
            final h g = a.g(10);
            final Boolean true = Boolean.TRUE;
            final g1 g2 = new g1(c2, g, h.a.c(true), h.a.c(true), e(), h.a.c(true));
            ((RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)o).L$0 = this;
            ((RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)o).label = 1;
            b = e$a.b(14, (h7.k)g2, (mr0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlHistoryDataSourceImpl = this;
        }
        final g1$b g1$b = (g1$b)b;
        final g1$e a2 = g1$b.a;
        final ti ti = null;
        Object instance = null;
        Label_0353: {
            if (a2 != null) {
                final g1$c b2 = a2.b;
                if (b2 != null) {
                    final List c3 = b2.c;
                    if (c3 != null) {
                        final ArrayList<Link> list = new ArrayList<Link>();
                        final Iterator iterator = c3.iterator();
                        while (true) {
                            instance = list;
                            if (!iterator.hasNext()) {
                                break Label_0353;
                            }
                            final g1$d g1$d = (g1$d)iterator.next();
                            final GqlPostToLinkDomainModelMapper c4 = remoteGqlHistoryDataSourceImpl.c;
                            Link link$default = null;
                            Label_0335: {
                                if (g1$d != null) {
                                    final g1$f b3 = g1$d.b;
                                    if (b3 != null) {
                                        final g1$f$a b4 = b3.b;
                                        if (b4 != null) {
                                            final PostFragment a3 = b4.a;
                                            if (a3 != null) {
                                                link$default = GqlPostToLinkDomainModelMapper.toLink$default(c4, a3, (FeedAnswerableQuestionsFragment)null, (String)null, (List)null, (Integer)null, 15, (Object)null);
                                                break Label_0335;
                                            }
                                        }
                                    }
                                }
                                link$default = null;
                            }
                            if (link$default == null) {
                                continue;
                            }
                            list.add(link$default);
                        }
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        final g1$e a4 = g1$b.a;
        ti a5 = ti;
        if (a4 != null) {
            final g1$c b5 = a4.b;
            a5 = ti;
            if (b5 != null) {
                final g1$g b6 = b5.b;
                a5 = ti;
                if (b6 != null) {
                    final g1$g$a b7 = b6.b;
                    a5 = ti;
                    if (b7 != null) {
                        a5 = b7.a;
                    }
                }
            }
        }
        return new Listing((List)instance, GqlDataToDomainModelMapperKt.getAfter(a5), (String)null, (String)null, (String)null, false, (List)null, 124, (DefaultConstructorMarker)null);
    }
    
    public final Object d(final List<String> list, final c<? super Listing<Link>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlHistoryDataSourceImpl$getPostsByIds$1) {
                final RemoteGqlHistoryDataSourceImpl$getPostsByIds$1 remoteGqlHistoryDataSourceImpl$getPostsByIds$1 = (RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)c;
                final int label = remoteGqlHistoryDataSourceImpl$getPostsByIds$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlHistoryDataSourceImpl$getPostsByIds$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlHistoryDataSourceImpl$getPostsByIds$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlHistoryDataSourceImpl$getPostsByIds$1(this, (c)c);
        }
        final Object result = ((RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)o).label;
        RemoteGqlHistoryDataSourceImpl remoteGqlHistoryDataSourceImpl;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlHistoryDataSourceImpl = (RemoteGqlHistoryDataSourceImpl)((RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)o).L$0;
            yd.b.k0(result);
            b = result;
        }
        else {
            yd.b.k0(result);
            final g a = this.a;
            final Boolean true = Boolean.TRUE;
            final PostsByIdsQuery postsByIdsQuery = new PostsByIdsQuery((List)list, h.a.c(true), e(), h.a.c(true));
            ((RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)o).L$0 = this;
            ((RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)o).label = 1;
            b = e$a.b(14, (h7.k)postsByIdsQuery, (mr0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlHistoryDataSourceImpl = this;
        }
        final List a2 = ((PostsByIdsQuery$Data)b).a;
        Object instance;
        if (a2 != null) {
            final ArrayList<Link> list2 = new ArrayList<Link>();
            final Iterator iterator = a2.iterator();
            while (true) {
                instance = list2;
                if (!iterator.hasNext()) {
                    break;
                }
                final PostsByIdsQuery$b postsByIdsQuery$b = (PostsByIdsQuery$b)iterator.next();
                final Link link = null;
                final SubredditFragment subredditFragment = null;
                Link map$default = link;
                if (postsByIdsQuery$b != null) {
                    final PostsByIdsQuery$b$a b2 = postsByIdsQuery$b.b;
                    map$default = link;
                    if (b2 != null) {
                        final PostContentFragment a3 = b2.a;
                        map$default = link;
                        if (a3 != null) {
                            final GqlPostToLinkDomainModelMapper c2 = remoteGqlHistoryDataSourceImpl.c;
                            final PostFragment b3 = b2.b;
                            SubredditFragment a4 = subredditFragment;
                            if (b3 != null) {
                                final PostFragment$a d = b3.d;
                                a4 = subredditFragment;
                                if (d != null) {
                                    final PostFragment$g c3 = d.c;
                                    a4 = subredditFragment;
                                    if (c3 != null) {
                                        final PostFragment$g$a b4 = c3.b;
                                        a4 = subredditFragment;
                                        if (b4 != null) {
                                            a4 = b4.a;
                                        }
                                    }
                                }
                            }
                            final JsonAdapter jsonAdapter = remoteGqlHistoryDataSourceImpl.d.getValue();
                            e.e((Object)jsonAdapter, "richTextAdapter");
                            map$default = GqlPostToLinkDomainModelMapper.map$default(c2, a4, a3, (PostRecommendationFragment$u)null, (FeedAnswerableQuestionsFragment)null, (CrosspostContentFragment)null, (String)null, (List)null, (Integer)null, jsonAdapter, 252, (Object)null);
                        }
                    }
                }
                if (map$default == null) {
                    continue;
                }
                list2.add(map$default);
            }
        }
        else {
            instance = EmptyList.INSTANCE;
        }
        return new Listing((List)instance, (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (DefaultConstructorMarker)null);
    }
}
