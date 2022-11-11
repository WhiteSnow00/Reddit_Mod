// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.post_chaining;

import com.reddit.queries.s9$f$a;
import com.reddit.queries.s9$f;
import com.reddit.queries.s9$e$a;
import com.reddit.queries.s9$e;
import com.reddit.queries.s9$d;
import com.reddit.queries.s9$g;
import h7.h;
import com.reddit.queries.s9$c;
import com.reddit.queries.s9$b;
import com.reddit.queries.s9;
import o22.m2;
import com.reddit.type.PostType$a;
import com.reddit.type.PostType;
import com.reddit.type.RecommendedPostFeedEntryPoint;
import kl0.sh;
import com.reddit.queries.o9$g$a;
import com.reddit.queries.o9$g;
import com.reddit.fragment.SubredditFragment;
import com.reddit.fragment.PostFragment$g$a;
import com.reddit.fragment.PostFragment$g;
import com.reddit.fragment.PostFragment$a;
import com.reddit.fragment.PostContentFragment;
import com.reddit.fragment.PostFragment$d;
import com.reddit.fragment.PostFragment;
import com.reddit.queries.o9$f$a;
import com.reddit.queries.o9$f;
import java.util.Iterator;
import com.reddit.queries.o9$i;
import com.reddit.queries.o9$e;
import com.reddit.queries.o9$a;
import com.reddit.queries.o9$h;
import com.reddit.domain.model.paging.PageInfo;
import kotlin.collections.EmptyList;
import java.util.List;
import com.reddit.fragment.CrosspostContentFragment;
import com.reddit.fragment.FeedAnswerableQuestionsFragment;
import com.reddit.fragment.PostRecommendationFragment$u;
import com.squareup.moshi.JsonAdapter;
import com.reddit.queries.o9$d;
import com.reddit.domain.model.Link;
import java.util.ArrayList;
import com.reddit.queries.o9$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.o9;
import androidx.appcompat.widget.s0;
import h7.h$a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.discovery.RecommendedPostsListing;
import tg2.c;
import javax.inject.Inject;
import pg2.f;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import com.squareup.moshi.y;
import ur0.g;
import id0.a;

public final class RecommendedPostsGqlDataSource implements a
{
    public final g a;
    public final y b;
    public final GqlPostToLinkDomainModelMapper c;
    public final rr0.a d;
    public final f e;
    
    @Inject
    public RecommendedPostsGqlDataSource(final GqlPostToLinkDomainModelMapper c, final rr0.a d, final g a, final y b) {
        ah2.f.f((Object)b, "moshi");
        ah2.f.f((Object)d, "goldFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = kotlin.a.b((zg2.a)new RecommendedPostsGqlDataSource$richTextAdapter$2(this));
    }
    
    public final Object a(final String s, final String s2, final String s3, final String s4, final c<? super RecommendedPostsListing> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RecommendedPostsGqlDataSource$getRecommendedPosts.RecommendedPostsGqlDataSource$getRecommendedPosts$1) {
                final RecommendedPostsGqlDataSource$getRecommendedPosts.RecommendedPostsGqlDataSource$getRecommendedPosts$1 recommendedPostsGqlDataSource$getRecommendedPosts$1 = (RecommendedPostsGqlDataSource$getRecommendedPosts.RecommendedPostsGqlDataSource$getRecommendedPosts$1)c;
                final int label = recommendedPostsGqlDataSource$getRecommendedPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    recommendedPostsGqlDataSource$getRecommendedPosts$1.label = label + Integer.MIN_VALUE;
                    o = recommendedPostsGqlDataSource$getRecommendedPosts$1;
                    break Label_0059;
                }
            }
            o = new RecommendedPostsGqlDataSource$getRecommendedPosts.RecommendedPostsGqlDataSource$getRecommendedPosts$1(this, (c)c);
        }
        final Object result = ((RecommendedPostsGqlDataSource$getRecommendedPosts.RecommendedPostsGqlDataSource$getRecommendedPosts$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RecommendedPostsGqlDataSource$getRecommendedPosts.RecommendedPostsGqlDataSource$getRecommendedPosts$1)o).label;
        RecommendedPostsGqlDataSource recommendedPostsGqlDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recommendedPostsGqlDataSource = (RecommendedPostsGqlDataSource)((RecommendedPostsGqlDataSource$getRecommendedPosts.RecommendedPostsGqlDataSource$getRecommendedPosts$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final o9 o2 = new o9(s, s2, h$a.b((Object)Boolean.TRUE), h$a.b((Object)s3), h$a.b((Object)s4), s0.h(this.d));
            ((RecommendedPostsGqlDataSource$getRecommendedPosts.RecommendedPostsGqlDataSource$getRecommendedPosts$1)o).L$0 = this;
            ((RecommendedPostsGqlDataSource$getRecommendedPosts.RecommendedPostsGqlDataSource$getRecommendedPosts$1)o).label = 1;
            b = e$a.b(14, (k)o2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            recommendedPostsGqlDataSource = this;
        }
        final o9$c o9$c = (o9$c)b;
        final o9$h a2 = o9$c.a;
        final PageInfo pageInfo = null;
        Object instance = null;
        Label_0454: {
            if (a2 != null) {
                final o9$a b2 = a2.b;
                if (b2 != null) {
                    final o9$e b3 = b2.b;
                    if (b3 != null) {
                        final o9$i b4 = b3.b;
                        if (b4 != null) {
                            final List c2 = b4.c;
                            if (c2 != null) {
                                final ArrayList<Link> list = new ArrayList<Link>();
                                final Iterator iterator = c2.iterator();
                                while (true) {
                                    instance = list;
                                    if (!iterator.hasNext()) {
                                        break Label_0454;
                                    }
                                    final o9$d o9$d = (o9$d)iterator.next();
                                    Link map$default = null;
                                    Label_0437: {
                                        if (o9$d != null) {
                                            final o9$f b5 = o9$d.b;
                                            if (b5 != null) {
                                                final o9$f$a b6 = b5.b;
                                                if (b6 != null) {
                                                    final PostFragment a3 = b6.a;
                                                    if (a3 != null) {
                                                        final PostFragment$d c3 = a3.c;
                                                        if (c3 != null) {
                                                            final PostContentFragment a4 = c3.a;
                                                            if (a4 != null) {
                                                                final GqlPostToLinkDomainModelMapper c4 = recommendedPostsGqlDataSource.c;
                                                                final PostFragment$a d = a3.d;
                                                                SubredditFragment a5 = null;
                                                                Label_0390: {
                                                                    if (d != null) {
                                                                        final PostFragment$g c5 = d.c;
                                                                        if (c5 != null) {
                                                                            final PostFragment$g$a b7 = c5.b;
                                                                            if (b7 != null) {
                                                                                a5 = b7.a;
                                                                                break Label_0390;
                                                                            }
                                                                        }
                                                                    }
                                                                    a5 = null;
                                                                }
                                                                final JsonAdapter jsonAdapter = (JsonAdapter)recommendedPostsGqlDataSource.e.getValue();
                                                                ah2.f.e((Object)jsonAdapter, "richTextAdapter");
                                                                map$default = GqlPostToLinkDomainModelMapper.map$default(c4, a5, a4, (PostRecommendationFragment$u)null, (FeedAnswerableQuestionsFragment)null, (CrosspostContentFragment)null, (String)null, (List)null, (Integer)null, jsonAdapter, 252, (Object)null);
                                                                break Label_0437;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        map$default = null;
                                    }
                                    if (map$default == null) {
                                        continue;
                                    }
                                    list.add(map$default);
                                }
                            }
                        }
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        final o9$h a6 = o9$c.a;
        sh a7 = null;
        Label_0519: {
            if (a6 != null) {
                final o9$a b8 = a6.b;
                if (b8 != null) {
                    final o9$e b9 = b8.b;
                    if (b9 != null) {
                        final o9$i b10 = b9.b;
                        if (b10 != null) {
                            final o9$g b11 = b10.b;
                            if (b11 != null) {
                                final o9$g$a b12 = b11.b;
                                if (b12 != null) {
                                    a7 = b12.a;
                                    break Label_0519;
                                }
                            }
                        }
                    }
                }
            }
            a7 = null;
        }
        recommendedPostsGqlDataSource.getClass();
        PageInfo pageInfo2;
        if (a7 == null) {
            pageInfo2 = pageInfo;
        }
        else {
            pageInfo2 = new PageInfo(a7.b, false, (String)null, a7.c);
        }
        return new RecommendedPostsListing((List<Link>)instance, pageInfo2);
    }
    
    public final Object b(final List<String> list, final List<String> list2, final String s, final String s2, final Integer n, final String s3, final String s4, final c<? super RecommendedPostsListing> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RecommendedPostsGqlDataSource$getRecommendedPostsV2.RecommendedPostsGqlDataSource$getRecommendedPostsV2$1) {
                final RecommendedPostsGqlDataSource$getRecommendedPostsV2.RecommendedPostsGqlDataSource$getRecommendedPostsV2$1 recommendedPostsGqlDataSource$getRecommendedPostsV2$1 = (RecommendedPostsGqlDataSource$getRecommendedPostsV2.RecommendedPostsGqlDataSource$getRecommendedPostsV2$1)c;
                final int label = recommendedPostsGqlDataSource$getRecommendedPostsV2$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    recommendedPostsGqlDataSource$getRecommendedPostsV2$1.label = label + Integer.MIN_VALUE;
                    o = recommendedPostsGqlDataSource$getRecommendedPostsV2$1;
                    break Label_0059;
                }
            }
            o = new RecommendedPostsGqlDataSource$getRecommendedPostsV2.RecommendedPostsGqlDataSource$getRecommendedPostsV2$1(this, (c)c);
        }
        final Object result = ((RecommendedPostsGqlDataSource$getRecommendedPostsV2.RecommendedPostsGqlDataSource$getRecommendedPostsV2$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RecommendedPostsGqlDataSource$getRecommendedPostsV2.RecommendedPostsGqlDataSource$getRecommendedPostsV2$1)o).label;
        final PageInfo pageInfo = null;
        RecommendedPostsGqlDataSource recommendedPostsGqlDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recommendedPostsGqlDataSource = (RecommendedPostsGqlDataSource)((RecommendedPostsGqlDataSource$getRecommendedPostsV2.RecommendedPostsGqlDataSource$getRecommendedPostsV2$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final h b2 = h$a.b((Object)list);
            final h b3 = h$a.b((Object)list2);
            final h b4 = h$a.b((Object)s);
            Object unknown__ = null;
            Label_0256: {
                if (s3 != null && s3.length() != 0) {
                    RecommendedPostFeedEntryPoint.Companion.getClass();
                    ah2.f.f((Object)s3, "rawValue");
                    final RecommendedPostFeedEntryPoint[] values = RecommendedPostFeedEntryPoint.values();
                    final int length = values.length;
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            final RecommendedPostFeedEntryPoint recommendedPostFeedEntryPoint = values[i];
                            if (ah2.f.a((Object)recommendedPostFeedEntryPoint.getRawValue(), (Object)s3)) {
                                unknown__ = recommendedPostFeedEntryPoint;
                                if (recommendedPostFeedEntryPoint == null) {
                                    unknown__ = RecommendedPostFeedEntryPoint.UNKNOWN__;
                                }
                                break Label_0256;
                            }
                            else {
                                ++i;
                            }
                        }
                        final RecommendedPostFeedEntryPoint recommendedPostFeedEntryPoint = null;
                        continue;
                    }
                }
                unknown__ = null;
            }
            final h b5 = h$a.b(unknown__);
            Object a2;
            if (s4 == null || s4.length() == 0) {
                a2 = null;
            }
            else {
                PostType.Companion.getClass();
                a2 = PostType$a.a(s4);
            }
            final s9 s5 = new s9(new m2(b3, b2, b5, h$a.b(a2), b4), h$a.c((Object)n), h$a.c((Object)s2), s0.h(this.d));
            ((RecommendedPostsGqlDataSource$getRecommendedPostsV2.RecommendedPostsGqlDataSource$getRecommendedPostsV2$1)o).L$0 = this;
            ((RecommendedPostsGqlDataSource$getRecommendedPostsV2.RecommendedPostsGqlDataSource$getRecommendedPostsV2$1)o).label = 1;
            b = e$a.b(14, (k)s5, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            recommendedPostsGqlDataSource = this;
        }
        final s9$b s9$b = (s9$b)b;
        final s9$g a3 = s9$b.a;
        Object instance = null;
        Label_0626: {
            if (a3 != null) {
                final s9$d b6 = a3.b;
                if (b6 != null) {
                    final List c2 = b6.c;
                    if (c2 != null) {
                        final ArrayList<Link> list3 = new ArrayList<Link>();
                        final Iterator iterator = c2.iterator();
                        while (true) {
                            instance = list3;
                            if (!iterator.hasNext()) {
                                break Label_0626;
                            }
                            final s9$c s9$c = (s9$c)iterator.next();
                            Link map$default = null;
                            Label_0609: {
                                if (s9$c != null) {
                                    final s9$e b7 = s9$c.b;
                                    if (b7 != null) {
                                        final s9$e$a b8 = b7.b;
                                        if (b8 != null) {
                                            final PostFragment a4 = b8.a;
                                            if (a4 != null) {
                                                final PostFragment$d c3 = a4.c;
                                                if (c3 != null) {
                                                    final PostContentFragment a5 = c3.a;
                                                    if (a5 != null) {
                                                        final GqlPostToLinkDomainModelMapper c4 = recommendedPostsGqlDataSource.c;
                                                        final PostFragment$a d = a4.d;
                                                        SubredditFragment a6 = null;
                                                        Label_0562: {
                                                            if (d != null) {
                                                                final PostFragment$g c5 = d.c;
                                                                if (c5 != null) {
                                                                    final PostFragment$g$a b9 = c5.b;
                                                                    if (b9 != null) {
                                                                        a6 = b9.a;
                                                                        break Label_0562;
                                                                    }
                                                                }
                                                            }
                                                            a6 = null;
                                                        }
                                                        final JsonAdapter jsonAdapter = (JsonAdapter)recommendedPostsGqlDataSource.e.getValue();
                                                        ah2.f.e((Object)jsonAdapter, "richTextAdapter");
                                                        map$default = GqlPostToLinkDomainModelMapper.map$default(c4, a6, a5, (PostRecommendationFragment$u)null, (FeedAnswerableQuestionsFragment)null, (CrosspostContentFragment)null, (String)null, (List)null, (Integer)null, jsonAdapter, 252, (Object)null);
                                                        break Label_0609;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                map$default = null;
                            }
                            if (map$default == null) {
                                continue;
                            }
                            list3.add(map$default);
                        }
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        final s9$g a7 = s9$b.a;
        sh a8 = null;
        Label_0673: {
            if (a7 != null) {
                final s9$d b10 = a7.b;
                if (b10 != null) {
                    final s9$f b11 = b10.b;
                    if (b11 != null) {
                        final s9$f$a b12 = b11.b;
                        if (b12 != null) {
                            a8 = b12.a;
                            break Label_0673;
                        }
                    }
                }
            }
            a8 = null;
        }
        recommendedPostsGqlDataSource.getClass();
        PageInfo pageInfo2;
        if (a8 == null) {
            pageInfo2 = pageInfo;
        }
        else {
            pageInfo2 = new PageInfo(a8.b, false, (String)null, a8.c);
        }
        return new RecommendedPostsListing((List<Link>)instance, pageInfo2);
    }
}
