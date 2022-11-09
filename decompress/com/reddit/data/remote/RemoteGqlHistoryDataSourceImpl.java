// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.queries.k6$g$a;
import com.reddit.queries.k6$g;
import com.reddit.queries.k6$f$a;
import com.reddit.queries.k6$f;
import com.reddit.queries.k6$d;
import com.reddit.queries.k6$e;
import com.reddit.queries.k6$c;
import com.reddit.queries.k6$b;
import com.reddit.queries.k6;
import com.reddit.queries.g1$g$a;
import com.reddit.queries.g1$g;
import com.reddit.queries.g1$f$a;
import com.reddit.queries.g1$f;
import com.reddit.queries.g1$c;
import com.reddit.queries.g1$e;
import com.reddit.queries.g1$d;
import com.reddit.queries.g1$b;
import com.reddit.queries.g1;
import com.reddit.queries.id$f$a;
import com.reddit.queries.id$f;
import com.reddit.queries.id$e$a;
import com.reddit.queries.id$e;
import com.reddit.queries.id$g;
import kl0.sh;
import com.reddit.queries.id$d;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import com.reddit.queries.id$c;
import com.reddit.queries.id$b;
import com.reddit.queries.id;
import com.reddit.fragment.PostFragment$g$a;
import com.reddit.fragment.PostFragment$g;
import com.reddit.fragment.PostFragment$a;
import com.reddit.fragment.PostFragment;
import com.reddit.fragment.PostContentFragment;
import com.reddit.queries.PostsByIdsQuery$b$a;
import com.reddit.fragment.SubredditFragment;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.collections.EmptyList;
import com.reddit.fragment.CrosspostContentFragment;
import com.reddit.fragment.FeedAnswerableQuestionsFragment;
import com.reddit.fragment.PostRecommendationFragment$u;
import com.squareup.moshi.JsonAdapter;
import com.reddit.queries.PostsByIdsQuery$b;
import java.util.ArrayList;
import com.reddit.queries.PostsByIdsQuery$Data;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import ur0.e$a;
import com.reddit.queries.PostsByIdsQuery;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.listing.Listing;
import java.util.List;
import o22.z0;
import h7.h$a;
import ah2.c;
import com.reddit.type.FeedFeature;
import h7.h;
import javax.inject.Inject;
import kotlin.a;
import pg2.f;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import com.squareup.moshi.y;
import ur0.g;
import d60.k;

public final class RemoteGqlHistoryDataSourceImpl implements k
{
    public final g a;
    public final y b;
    public final GqlPostToLinkDomainModelMapper c;
    public final f d;
    
    @Inject
    public RemoteGqlHistoryDataSourceImpl(final g a, final y b, final GqlPostToLinkDomainModelMapper c) {
        ah2.f.f((Object)a, "graphQlClient");
        ah2.f.f((Object)b, "moshi");
        ah2.f.f((Object)c, "gqlPostToLinkDomainModelMapper");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.a.b((zg2.a)new RemoteGqlHistoryDataSourceImpl$richTextAdapter.RemoteGqlHistoryDataSourceImpl$richTextAdapter$2(this));
    }
    
    public static h e() {
        return h$a.c((Object)new z0(h$a.c((Object)c.X((Object)FeedFeature.COMMENT_POST_UNITS)), 2));
    }
    
    public final Object a(final List<String> list, final tg2.c<? super Listing<Link>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlHistoryDataSourceImpl$getPostsByIds.RemoteGqlHistoryDataSourceImpl$getPostsByIds$1) {
                final RemoteGqlHistoryDataSourceImpl$getPostsByIds.RemoteGqlHistoryDataSourceImpl$getPostsByIds$1 remoteGqlHistoryDataSourceImpl$getPostsByIds$1 = (RemoteGqlHistoryDataSourceImpl$getPostsByIds.RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)c;
                final int label = remoteGqlHistoryDataSourceImpl$getPostsByIds$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlHistoryDataSourceImpl$getPostsByIds$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlHistoryDataSourceImpl$getPostsByIds$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlHistoryDataSourceImpl$getPostsByIds.RemoteGqlHistoryDataSourceImpl$getPostsByIds$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlHistoryDataSourceImpl$getPostsByIds.RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlHistoryDataSourceImpl$getPostsByIds.RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)o).label;
        RemoteGqlHistoryDataSourceImpl remoteGqlHistoryDataSourceImpl;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlHistoryDataSourceImpl = (RemoteGqlHistoryDataSourceImpl)((RemoteGqlHistoryDataSourceImpl$getPostsByIds.RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final Boolean true = Boolean.TRUE;
            final PostsByIdsQuery postsByIdsQuery = new PostsByIdsQuery((List)list, h$a.c((Object)true), e(), h$a.c((Object)true));
            ((RemoteGqlHistoryDataSourceImpl$getPostsByIds.RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)o).L$0 = this;
            ((RemoteGqlHistoryDataSourceImpl$getPostsByIds.RemoteGqlHistoryDataSourceImpl$getPostsByIds$1)o).label = 1;
            b = e$a.b(14, (h7.k)postsByIdsQuery, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
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
                            final JsonAdapter jsonAdapter = (JsonAdapter)remoteGqlHistoryDataSourceImpl.d.getValue();
                            ah2.f.e((Object)jsonAdapter, "richTextAdapter");
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
        return new Listing((List)instance, null, null, null, null, false, null, 126, null);
    }
    
    public final Object b(final String s, final tg2.c<? super Listing<Link>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlHistoryDataSourceImpl$getUpvotedPosts.RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1) {
                final RemoteGqlHistoryDataSourceImpl$getUpvotedPosts.RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1 remoteGqlHistoryDataSourceImpl$getUpvotedPosts$1 = (RemoteGqlHistoryDataSourceImpl$getUpvotedPosts.RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)c;
                final int label = remoteGqlHistoryDataSourceImpl$getUpvotedPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlHistoryDataSourceImpl$getUpvotedPosts$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlHistoryDataSourceImpl$getUpvotedPosts$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlHistoryDataSourceImpl$getUpvotedPosts.RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlHistoryDataSourceImpl$getUpvotedPosts.RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlHistoryDataSourceImpl$getUpvotedPosts.RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)o).label;
        RemoteGqlHistoryDataSourceImpl remoteGqlHistoryDataSourceImpl;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlHistoryDataSourceImpl = (RemoteGqlHistoryDataSourceImpl)((RemoteGqlHistoryDataSourceImpl$getUpvotedPosts.RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final h c2 = h$a.c((Object)s);
            final h f = a.f(10);
            final Boolean true = Boolean.TRUE;
            final id id = new id(c2, f, h$a.c((Object)true), h$a.c((Object)true), e(), h$a.c((Object)true));
            ((RemoteGqlHistoryDataSourceImpl$getUpvotedPosts.RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)o).L$0 = this;
            ((RemoteGqlHistoryDataSourceImpl$getUpvotedPosts.RemoteGqlHistoryDataSourceImpl$getUpvotedPosts$1)o).label = 1;
            b = e$a.b(14, (h7.k)id, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlHistoryDataSourceImpl = this;
        }
        final id$b id$b = (id$b)b;
        final id$d a2 = id$b.a;
        final sh sh = null;
        Object instance = null;
        Label_0353: {
            if (a2 != null) {
                final id$g b2 = a2.b;
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
                            final id$c id$c = (id$c)iterator.next();
                            final GqlPostToLinkDomainModelMapper c4 = remoteGqlHistoryDataSourceImpl.c;
                            Link link$default = null;
                            Label_0335: {
                                if (id$c != null) {
                                    final id$e b3 = id$c.b;
                                    if (b3 != null) {
                                        final id$e$a b4 = b3.b;
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
        final id$d a4 = id$b.a;
        sh a5 = sh;
        if (a4 != null) {
            final id$g b5 = a4.b;
            a5 = sh;
            if (b5 != null) {
                final id$f b6 = b5.b;
                a5 = sh;
                if (b6 != null) {
                    final id$f$a b7 = b6.b;
                    a5 = sh;
                    if (b7 != null) {
                        a5 = b7.a;
                    }
                }
            }
        }
        return new Listing((List)instance, GqlDataToDomainModelMapperKt.getAfter(a5), null, null, null, false, null, 124, null);
    }
    
    public final Object c(final String s, final tg2.c<? super Listing<Link>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlHistoryDataSourceImpl$getDownvotedPosts.RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1) {
                final RemoteGqlHistoryDataSourceImpl$getDownvotedPosts.RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1 remoteGqlHistoryDataSourceImpl$getDownvotedPosts$1 = (RemoteGqlHistoryDataSourceImpl$getDownvotedPosts.RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)c;
                final int label = remoteGqlHistoryDataSourceImpl$getDownvotedPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlHistoryDataSourceImpl$getDownvotedPosts$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlHistoryDataSourceImpl$getDownvotedPosts$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlHistoryDataSourceImpl$getDownvotedPosts.RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlHistoryDataSourceImpl$getDownvotedPosts.RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlHistoryDataSourceImpl$getDownvotedPosts.RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)o).label;
        RemoteGqlHistoryDataSourceImpl remoteGqlHistoryDataSourceImpl;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlHistoryDataSourceImpl = (RemoteGqlHistoryDataSourceImpl)((RemoteGqlHistoryDataSourceImpl$getDownvotedPosts.RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final h c2 = h$a.c((Object)s);
            final h f = a.f(10);
            final Boolean true = Boolean.TRUE;
            final g1 g1 = new g1(c2, f, h$a.c((Object)true), h$a.c((Object)true), e(), h$a.c((Object)true));
            ((RemoteGqlHistoryDataSourceImpl$getDownvotedPosts.RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)o).L$0 = this;
            ((RemoteGqlHistoryDataSourceImpl$getDownvotedPosts.RemoteGqlHistoryDataSourceImpl$getDownvotedPosts$1)o).label = 1;
            b = e$a.b(14, (h7.k)g1, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlHistoryDataSourceImpl = this;
        }
        final g1$b g1$b = (g1$b)b;
        final g1$e a2 = g1$b.a;
        final sh sh = null;
        Object instance = null;
        Label_0351: {
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
                                break Label_0351;
                            }
                            final g1$d g1$d = (g1$d)iterator.next();
                            final GqlPostToLinkDomainModelMapper c4 = remoteGqlHistoryDataSourceImpl.c;
                            Link link$default = null;
                            Label_0333: {
                                if (g1$d != null) {
                                    final g1$f b3 = g1$d.b;
                                    if (b3 != null) {
                                        final g1$f$a b4 = b3.b;
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
        final g1$e a4 = g1$b.a;
        sh a5 = sh;
        if (a4 != null) {
            final g1$c b5 = a4.b;
            a5 = sh;
            if (b5 != null) {
                final g1$g b6 = b5.b;
                a5 = sh;
                if (b6 != null) {
                    final g1$g$a b7 = b6.b;
                    a5 = sh;
                    if (b7 != null) {
                        a5 = b7.a;
                    }
                }
            }
        }
        return new Listing((List)instance, GqlDataToDomainModelMapperKt.getAfter(a5), null, null, null, false, null, 124, null);
    }
    
    public final Object d(final String s, final tg2.c<? super Listing<Link>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlHistoryDataSourceImpl$getHiddenPosts.RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1) {
                final RemoteGqlHistoryDataSourceImpl$getHiddenPosts.RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1 remoteGqlHistoryDataSourceImpl$getHiddenPosts$1 = (RemoteGqlHistoryDataSourceImpl$getHiddenPosts.RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)c;
                final int label = remoteGqlHistoryDataSourceImpl$getHiddenPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlHistoryDataSourceImpl$getHiddenPosts$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlHistoryDataSourceImpl$getHiddenPosts$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlHistoryDataSourceImpl$getHiddenPosts.RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlHistoryDataSourceImpl$getHiddenPosts.RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlHistoryDataSourceImpl$getHiddenPosts.RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)o).label;
        RemoteGqlHistoryDataSourceImpl remoteGqlHistoryDataSourceImpl;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlHistoryDataSourceImpl = (RemoteGqlHistoryDataSourceImpl)((RemoteGqlHistoryDataSourceImpl$getHiddenPosts.RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final h c2 = h$a.c((Object)s);
            final h f = a.f(10);
            final Boolean true = Boolean.TRUE;
            final k6 k6 = new k6(c2, f, h$a.c((Object)true), h$a.c((Object)true), e(), h$a.c((Object)true));
            ((RemoteGqlHistoryDataSourceImpl$getHiddenPosts.RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)o).L$0 = this;
            ((RemoteGqlHistoryDataSourceImpl$getHiddenPosts.RemoteGqlHistoryDataSourceImpl$getHiddenPosts$1)o).label = 1;
            b = e$a.b(14, (h7.k)k6, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlHistoryDataSourceImpl = this;
        }
        final k6$b k6$b = (k6$b)b;
        final k6$e a2 = k6$b.a;
        final sh sh = null;
        Object instance = null;
        Label_0353: {
            if (a2 != null) {
                final k6$d b2 = a2.b;
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
                            final k6$c k6$c = (k6$c)iterator.next();
                            final GqlPostToLinkDomainModelMapper c4 = remoteGqlHistoryDataSourceImpl.c;
                            Link link$default = null;
                            Label_0335: {
                                if (k6$c != null) {
                                    final k6$f b3 = k6$c.b;
                                    if (b3 != null) {
                                        final k6$f$a b4 = b3.b;
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
        final k6$e a4 = k6$b.a;
        sh a5 = sh;
        if (a4 != null) {
            final k6$d b5 = a4.b;
            a5 = sh;
            if (b5 != null) {
                final k6$g b6 = b5.b;
                a5 = sh;
                if (b6 != null) {
                    final k6$g$a b7 = b6.b;
                    a5 = sh;
                    if (b7 != null) {
                        a5 = b7.a;
                    }
                }
            }
        }
        return new Listing((List)instance, GqlDataToDomainModelMapperKt.getAfter(a5), null, null, null, false, null, 124, null);
    }
}
