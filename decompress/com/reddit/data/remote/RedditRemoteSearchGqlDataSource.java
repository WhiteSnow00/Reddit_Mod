// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.fragment.SearchCommentFragment$g;
import com.reddit.queries.oa$e;
import com.reddit.queries.oa$h;
import com.reddit.queries.oa$g;
import com.reddit.queries.oa$l;
import com.reddit.queries.oa$a;
import com.reddit.queries.oa$f;
import com.reddit.queries.oa$k;
import com.reddit.queries.oa;
import z10.w;
import com.reddit.queries.oa$d;
import com.reddit.queries.oa$i;
import com.reddit.queries.oa$c;
import com.reddit.queries.ya;
import com.reddit.domain.model.search.RemoteSearchResult;
import com.reddit.queries.qa$e;
import com.reddit.queries.qa$g$a;
import com.reddit.queries.qa$g;
import com.reddit.queries.qa$a;
import com.reddit.queries.qa$f;
import com.reddit.queries.qa$i;
import com.reddit.queries.qa;
import com.reddit.domain.model.Subreddit;
import com.reddit.data.model.graphql.GqlSubredditMapper;
import com.reddit.queries.qa$d;
import com.reddit.fragment.SubredditDetailsFragment;
import com.reddit.queries.qa$c;
import com.reddit.listing.model.sort.SortTimeFrame;
import zg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o22.a1;
import com.reddit.queries.sa$e;
import com.reddit.queries.sa$g$a;
import com.reddit.queries.sa$g;
import com.reddit.queries.sa$a;
import com.reddit.queries.sa$f;
import com.reddit.queries.sa$i;
import com.reddit.queries.sa;
import com.reddit.queries.sa$d;
import com.reddit.queries.sa$c;
import h7.h;
import com.reddit.listing.model.sort.SearchSortType;
import com.reddit.queries.ta$d;
import com.reddit.queries.ta$f$a;
import com.reddit.queries.ta$f;
import com.reddit.queries.ta$h;
import com.reddit.queries.ta$e;
import com.reddit.queries.ta$i;
import com.reddit.type.SearchPostSort;
import java.util.Locale;
import com.reddit.queries.ta;
import kotlin.collections.EmptyList;
import com.reddit.queries.ta$c;
import com.reddit.queries.ta$b;
import com.reddit.type.TreatmentProtocol;
import com.reddit.queries.ma$e;
import kl0.sh;
import com.reddit.fragment.AuthorInfoFragment$a;
import com.reddit.fragment.AuthorInfoFragment;
import com.reddit.fragment.PostContentFragment$r$a;
import com.reddit.fragment.PostContentFragment$r;
import com.reddit.fragment.PostFragment$d;
import com.reddit.domain.model.Link;
import com.reddit.fragment.CrosspostContentFragment;
import com.reddit.fragment.PostFragment$e$a;
import com.reddit.fragment.PostFragment$e;
import com.reddit.fragment.PostFragment$c;
import com.reddit.fragment.PostContentFragment;
import com.reddit.fragment.SubredditFragment;
import com.reddit.fragment.PostFragment$g$a;
import com.reddit.fragment.PostFragment$g;
import com.reddit.fragment.PostFragment$a;
import com.reddit.fragment.PostFragment;
import com.reddit.fragment.SearchCommentFragment$a$a;
import com.reddit.fragment.SearchCommentFragment$a;
import com.reddit.fragment.SearchCommentFragment$h;
import com.reddit.fragment.SearchPersonFragment;
import com.reddit.fragment.SearchCommentFragment$b$a;
import com.reddit.fragment.SearchCommentFragment$b;
import com.reddit.fragment.SearchCommentFragment$d;
import com.reddit.fragment.SearchCommentFragment;
import com.reddit.queries.ma$g$a;
import com.reddit.queries.ma$g;
import java.util.Iterator;
import com.reddit.queries.ma$a;
import com.reddit.queries.ma$f;
import com.reddit.queries.ma$i;
import java.io.IOException;
import com.reddit.network.common.RetryAlgo;
import com.reddit.queries.ma;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.Result$Error;
import com.reddit.domain.model.Result$Success;
import jv1.c$b;
import com.reddit.fragment.SearchCommentFragment$c;
import java.util.List;
import com.reddit.fragment.FeedAnswerableQuestionsFragment;
import com.reddit.fragment.PostRecommendationFragment$u;
import jv1.c$a;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import com.squareup.moshi.JsonAdapter;
import com.reddit.queries.ma$d;
import java.util.ArrayList;
import com.reddit.queries.ma$c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.Result;
import tg2.c;
import yi0.u0;
import sf2.o;
import qw.d;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import ur0.e;
import ur0.e$a;
import com.reddit.queries.wa;
import o22.d3;
import com.reddit.events.search.SearchStructureType;
import com.reddit.domain.model.search.OriginPageType;
import h7.h$a;
import ak0.m;
import nf2.c0;
import javax.inject.Inject;
import pg2.f;
import db0.z;
import ge0.a0;
import d60.f0;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import com.squareup.moshi.y;
import p70.b;
import p70.a;

public final class RedditRemoteSearchGqlDataSource implements a, b
{
    public final y a;
    public final e60.a b;
    public final GqlPostToLinkDomainModelMapper c;
    public final f0 d;
    public final a0 e;
    public final rr0.a f;
    public final ev.a g;
    public final z h;
    public final f i;
    
    @Inject
    public RedditRemoteSearchGqlDataSource(final y a, final e60.a b, final GqlPostToLinkDomainModelMapper c, final f0 d, final a0 e, final rr0.a f, final ev.a g, final z h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = kotlin.a.b((zg2.a)new RedditRemoteSearchGqlDataSource$richTextAdapter.RedditRemoteSearchGqlDataSource$richTextAdapter$2(this));
    }
    
    public final c0 a(final String s, final Boolean b, final String s2, final String s3) {
        m.y(s, "query", s2, "searchCorrelationId", s3, "searchQueryId");
        final c0 w = e$a.a((e)this.b, (k)new wa(s, h$a.b((Object)new d3(h$a.b((Object)s3), h$a.b((Object)s2), h$a.b((Object)((Enum)OriginPageType.HOME).name()), h$a.b((Object)((Enum)SearchStructureType.SEARCH).name()), h$a.b((Object)b), 1))), (OkHttpClient)null, (Map)null, 14).w((o)new d(10));
        ah2.f.e((Object)w, "graphQlClient.execute(\n \u2026\n        ),\n      )\n    }");
        return w;
    }
    
    public final Object b(String s, final u0 u0, final jv1.b b, final String s2, c<? super Result<jv1.f<jv1.c>>> o) {
        RedditRemoteSearchGqlDataSource$searchComments.RedditRemoteSearchGqlDataSource$searchComments$1 redditRemoteSearchGqlDataSource$searchComments$1 = null;
        Label_0055: {
            if (o instanceof RedditRemoteSearchGqlDataSource$searchComments.RedditRemoteSearchGqlDataSource$searchComments$1) {
                redditRemoteSearchGqlDataSource$searchComments$1 = (RedditRemoteSearchGqlDataSource$searchComments.RedditRemoteSearchGqlDataSource$searchComments$1)o;
                final int label = redditRemoteSearchGqlDataSource$searchComments$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRemoteSearchGqlDataSource$searchComments$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            redditRemoteSearchGqlDataSource$searchComments$1 = new RedditRemoteSearchGqlDataSource$searchComments.RedditRemoteSearchGqlDataSource$searchComments$1(this, (c)o);
        }
        final Object result = redditRemoteSearchGqlDataSource$searchComments$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditRemoteSearchGqlDataSource$searchComments$1.label;
        o = "";
        final String s3 = null;
        Label_0122: {
            if (label2 == 0) {
                break Label_0122;
            }
            Label_0112: {
                if (label2 != 1) {
                    break Label_0112;
                }
                RedditRemoteSearchGqlDataSource redditRemoteSearchGqlDataSource = (RedditRemoteSearchGqlDataSource)redditRemoteSearchGqlDataSource$searchComments$1.L$0;
                try {
                    aj2.c.Q0(result);
                    Object b2 = result;
                    while (true) {
                        final ma$c ma$c = (ma$c)b2;
                        try {
                            final ma$i a = ma$c.a;
                            ma$a b4 = null;
                            Label_0238: {
                                if (a != null) {
                                    final ma$f b3 = a.b;
                                    if (b3 != null) {
                                        b4 = b3.b;
                                        break Label_0238;
                                    }
                                }
                                b4 = null;
                            }
                            ah2.f.c((Object)b4);
                            final List c = b4.c;
                            final ArrayList<Object> list = new ArrayList<Object>();
                            for (final ma$d ma$d : c) {
                                Object o2 = null;
                                Label_1028: {
                                    if (ma$d != null) {
                                        final ma$g b5 = ma$d.b;
                                        if (b5 != null) {
                                            final ma$g$a b6 = b5.b;
                                            if (b6 != null) {
                                                final SearchCommentFragment a2 = b6.a;
                                                if (a2 != null) {
                                                    final GqlPostToLinkDomainModelMapper c2 = redditRemoteSearchGqlDataSource.c;
                                                    o = redditRemoteSearchGqlDataSource.i.getValue();
                                                    ah2.f.e(o, "richTextAdapter");
                                                    ah2.f.f((Object)c2, "linkMapper");
                                                    final SearchCommentFragment$d g = a2.g;
                                                    if (g != null) {
                                                        final String b7 = g.b;
                                                        final Object c3 = g.c;
                                                        String s4;
                                                        if (c3 instanceof String) {
                                                            s4 = (String)c3;
                                                        }
                                                        else {
                                                            s4 = null;
                                                        }
                                                        final c$a c$a = new c$a(b7, s4, GqlDataToDomainModelMapperKt.toMediaDataMap(g.d.a));
                                                        final SearchCommentFragment$b h = a2.h;
                                                        if (h != null) {
                                                            final SearchCommentFragment$b$a b8 = h.b;
                                                            if (b8 != null) {
                                                                final SearchPersonFragment a3 = b8.a;
                                                                if (a3 != null) {
                                                                    final jv1.e i2 = at1.a.i2(a3);
                                                                    final SearchCommentFragment$h l = a2.l;
                                                                    if (l != null) {
                                                                        final SearchCommentFragment$a c4 = l.c;
                                                                        Link map$default = null;
                                                                        Label_0616: {
                                                                            if (c4 != null) {
                                                                                final SearchCommentFragment$a$a c5 = c4.c;
                                                                                if (c5 != null) {
                                                                                    final PostFragment a4 = c5.a;
                                                                                    if (a4 != null) {
                                                                                        final PostFragment$a d = a4.d;
                                                                                        SubredditFragment a5 = null;
                                                                                        Label_0530: {
                                                                                            if (d != null) {
                                                                                                final PostFragment$g c6 = d.c;
                                                                                                if (c6 != null) {
                                                                                                    final PostFragment$g$a b9 = c6.b;
                                                                                                    if (b9 != null) {
                                                                                                        a5 = b9.a;
                                                                                                        break Label_0530;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            a5 = null;
                                                                                        }
                                                                                        final PostContentFragment a6 = a4.c.a;
                                                                                        final PostFragment$c b10 = a4.b;
                                                                                        CrosspostContentFragment a7 = null;
                                                                                        Label_0589: {
                                                                                            if (b10 != null) {
                                                                                                final PostFragment$e c7 = b10.c;
                                                                                                if (c7 != null) {
                                                                                                    final PostFragment$e$a b11 = c7.b;
                                                                                                    if (b11 != null) {
                                                                                                        a7 = b11.a;
                                                                                                        break Label_0589;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            a7 = null;
                                                                                        }
                                                                                        map$default = GqlPostToLinkDomainModelMapper.map$default(c2, a5, a6, (PostRecommendationFragment$u)null, (FeedAnswerableQuestionsFragment)null, a7, (String)null, (List)null, (Integer)null, (JsonAdapter)o, 236, (Object)null);
                                                                                        break Label_0616;
                                                                                    }
                                                                                }
                                                                            }
                                                                            map$default = null;
                                                                        }
                                                                        ah2.f.c((Object)map$default);
                                                                        final List j = a2.j;
                                                                        int n;
                                                                        if (j != null) {
                                                                            final Iterator iterator2 = j.iterator();
                                                                            n = 0;
                                                                            while (iterator2.hasNext()) {
                                                                                n += ((SearchCommentFragment$c)iterator2.next()).b;
                                                                            }
                                                                        }
                                                                        else {
                                                                            n = 0;
                                                                        }
                                                                        final SearchCommentFragment$h k = a2.l;
                                                                        AuthorInfoFragment a10 = null;
                                                                        Label_0790: {
                                                                            if (k != null) {
                                                                                final SearchCommentFragment$a c8 = k.c;
                                                                                if (c8 != null) {
                                                                                    final SearchCommentFragment$a$a c9 = c8.c;
                                                                                    if (c9 != null) {
                                                                                        final PostFragment a8 = c9.a;
                                                                                        if (a8 != null) {
                                                                                            final PostFragment$d c10 = a8.c;
                                                                                            if (c10 != null) {
                                                                                                final PostContentFragment a9 = c10.a;
                                                                                                if (a9 != null) {
                                                                                                    final PostContentFragment$r e = a9.E;
                                                                                                    if (e != null) {
                                                                                                        final PostContentFragment$r$a b12 = e.b;
                                                                                                        if (b12 != null) {
                                                                                                            a10 = b12.a;
                                                                                                            break Label_0790;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            a10 = null;
                                                                        }
                                                                        final String b13 = a2.b;
                                                                        final long c11 = ur0.c.c(a2.c.toString());
                                                                        o = a2.e;
                                                                        int n2;
                                                                        if (o != null) {
                                                                            n2 = (int)(double)o;
                                                                        }
                                                                        else {
                                                                            n2 = 0;
                                                                        }
                                                                        final boolean f = a2.f;
                                                                        final boolean m = a2.i;
                                                                        if (a10 != null) {
                                                                            o = a10.d;
                                                                        }
                                                                        else {
                                                                            o = null;
                                                                        }
                                                                        final boolean b14 = o != null;
                                                                        AuthorInfoFragment$a e2;
                                                                        if (a10 != null) {
                                                                            e2 = a10.e;
                                                                        }
                                                                        else {
                                                                            e2 = null;
                                                                        }
                                                                        final c$b c$b = new c$b(map$default, b14, e2 != null);
                                                                        final Object d2 = a2.d;
                                                                        Long value;
                                                                        if (d2 != null) {
                                                                            value = ur0.c.c(d2.toString());
                                                                        }
                                                                        else {
                                                                            value = null;
                                                                        }
                                                                        o = a2.k;
                                                                        if (o == null || (o = ((SearchCommentFragment$g)o).b) == null) {
                                                                            o = map$default.getKindWithId();
                                                                        }
                                                                        o2 = new jv1.c(b13, (String)o, c11, value, n2, f, n, c$a, i2, m, c$b);
                                                                        break Label_1028;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    o2 = null;
                                }
                                if (o2 != null) {
                                    list.add(o2);
                                }
                            }
                            final sh a11 = b4.b.b.a;
                            redditRemoteSearchGqlDataSource.getClass();
                            if (!a11.b) {
                                s = null;
                            }
                            else {
                                s = a11.c;
                            }
                            final ma$e d3 = b4.d;
                            String rawValue = s3;
                            if (d3 != null) {
                                final TreatmentProtocol b15 = d3.b;
                                rawValue = s3;
                                if (b15 != null) {
                                    rawValue = b15.getRawValue();
                                }
                            }
                            return new Result$Success((Object)new jv1.f((ArrayList)list, s, rawValue));
                        }
                        catch (final NullPointerException ex) {
                            s = ex.getMessage();
                            if (s == null) {
                                s = (String)o;
                            }
                            return new Result$Error(s, false, 2, (DefaultConstructorMarker)null);
                        }
                        Label_0203: {
                            redditRemoteSearchGqlDataSource = this;
                        }
                        continue;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    aj2.c.Q0(result);
                    final e60.a b16 = this.b;
                    final ma ma = new ma(h$a.b((Object)s2), this.f(u0, b), at1.a.g2(u0, (String)null), s);
                    redditRemoteSearchGqlDataSource$searchComments$1.L$0 = this;
                    redditRemoteSearchGqlDataSource$searchComments$1.label = 1;
                    b2 = e$a.b(14, (k)ma, (e)b16, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchComments$1, (OkHttpClient)null);
                    iftrue(Label_0203:)(b2 != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final IOException ex2) {
                    s = ex2.getMessage();
                    if (s == null) {
                        s = (String)o;
                    }
                    return new Result$Error(s, false, 2, (DefaultConstructorMarker)null);
                }
            }
        }
    }
    
    public final Object c(String s, final u0 u0, final jv1.b b, final String s2, final Integer n, c<? super Result<jv1.f<Link>>> s3) {
        RedditRemoteSearchGqlDataSource$searchPosts.RedditRemoteSearchGqlDataSource$searchPosts$1 redditRemoteSearchGqlDataSource$searchPosts$1 = null;
        Label_0055: {
            if (s3 instanceof RedditRemoteSearchGqlDataSource$searchPosts.RedditRemoteSearchGqlDataSource$searchPosts$1) {
                redditRemoteSearchGqlDataSource$searchPosts$1 = (RedditRemoteSearchGqlDataSource$searchPosts.RedditRemoteSearchGqlDataSource$searchPosts$1)s3;
                final int label = redditRemoteSearchGqlDataSource$searchPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRemoteSearchGqlDataSource$searchPosts$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            redditRemoteSearchGqlDataSource$searchPosts$1 = new RedditRemoteSearchGqlDataSource$searchPosts.RedditRemoteSearchGqlDataSource$searchPosts$1(this, (c)s3);
        }
        final Object result = redditRemoteSearchGqlDataSource$searchPosts$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditRemoteSearchGqlDataSource$searchPosts$1.label;
        s3 = "";
        Label_0119: {
            if (label2 == 0) {
                break Label_0119;
            }
            Label_0109: {
                if (label2 != 1) {
                    break Label_0109;
                }
                RedditRemoteSearchGqlDataSource redditRemoteSearchGqlDataSource = (RedditRemoteSearchGqlDataSource)redditRemoteSearchGqlDataSource$searchPosts$1.L$0;
                try {
                    aj2.c.Q0(result);
                    Object b2 = result;
                    while (true) {
                        String value = null;
                        Block_8: {
                        Block_7_Outer:
                            while (true) {
                                final ta$i a = ((ta$b)b2).a;
                                ta$h b4 = null;
                                Label_0335: {
                                    if (a != null) {
                                        final ta$e b3 = a.b;
                                        if (b3 != null) {
                                            b4 = b3.b;
                                            break Label_0335;
                                        }
                                    }
                                    b4 = null;
                                }
                                Object instance = null;
                                Label_0439: {
                                    if (b4 != null) {
                                        final List d = b4.d;
                                        if (d != null) {
                                            final ArrayList<PostFragment> list = new ArrayList<PostFragment>();
                                            final Iterator iterator = d.iterator();
                                            while (true) {
                                                instance = list;
                                                if (!iterator.hasNext()) {
                                                    break Label_0439;
                                                }
                                                final ta$c ta$c = (ta$c)iterator.next();
                                                PostFragment a2 = null;
                                                Label_0421: {
                                                    if (ta$c != null) {
                                                        final ta$f b5 = ta$c.b;
                                                        if (b5 != null) {
                                                            final ta$f$a b6 = b5.b;
                                                            if (b6 != null) {
                                                                a2 = b6.a;
                                                                break Label_0421;
                                                            }
                                                        }
                                                    }
                                                    a2 = null;
                                                }
                                                if (a2 == null) {
                                                    continue Block_7_Outer;
                                                }
                                                list.add(a2);
                                            }
                                        }
                                    }
                                    instance = EmptyList.INSTANCE;
                                }
                                final ArrayList list2 = new ArrayList<Link>(qg2.m.P0((Iterable)instance, 10));
                                for (final PostFragment postFragment : instance) {
                                    final GqlPostToLinkDomainModelMapper c = redditRemoteSearchGqlDataSource.c;
                                    final PostFragment$a d2 = postFragment.d;
                                    SubredditFragment a3 = null;
                                    Label_0528: {
                                        if (d2 != null) {
                                            final PostFragment$g c2 = d2.c;
                                            if (c2 != null) {
                                                final PostFragment$g$a b7 = c2.b;
                                                if (b7 != null) {
                                                    a3 = b7.a;
                                                    break Label_0528;
                                                }
                                            }
                                        }
                                        a3 = null;
                                    }
                                    final PostContentFragment a4 = postFragment.c.a;
                                    final PostFragment$c b8 = postFragment.b;
                                    CrosspostContentFragment a5 = null;
                                    Label_0587: {
                                        if (b8 != null) {
                                            final PostFragment$e c3 = b8.c;
                                            if (c3 != null) {
                                                final PostFragment$e$a b9 = c3.b;
                                                if (b9 != null) {
                                                    a5 = b9.a;
                                                    break Label_0587;
                                                }
                                            }
                                        }
                                        a5 = null;
                                    }
                                    final JsonAdapter jsonAdapter = (JsonAdapter)redditRemoteSearchGqlDataSource.i.getValue();
                                    ah2.f.e((Object)jsonAdapter, "richTextAdapter");
                                    list2.add(GqlPostToLinkDomainModelMapper.map$default(c, a3, a4, (PostRecommendationFragment$u)null, (FeedAnswerableQuestionsFragment)null, a5, (String)null, (List)null, (Integer)null, jsonAdapter, 236, (Object)null));
                                }
                                Object o;
                                try {
                                    ah2.f.c((Object)b4);
                                    final sh a6 = b4.b.b.a;
                                    redditRemoteSearchGqlDataSource.getClass();
                                    if (!a6.b) {
                                        s = null;
                                    }
                                    else {
                                        s = a6.c;
                                    }
                                    final ta$d e = b4.e;
                                    String rawValue = null;
                                    Label_0716: {
                                        if (e != null) {
                                            final TreatmentProtocol b10 = e.b;
                                            if (b10 != null) {
                                                rawValue = b10.getRawValue();
                                                break Label_0716;
                                            }
                                        }
                                        rawValue = null;
                                    }
                                    o = new Result$Success((Object)new jv1.f(list2, s, rawValue));
                                }
                                catch (final NullPointerException ex) {
                                    s = ex.getMessage();
                                    if (s != null) {
                                        s3 = s;
                                    }
                                    o = new Result$Error(s3, false, 2, (DefaultConstructorMarker)null);
                                }
                                return o;
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                while (true) {
                                    final SearchSortType g;
                                    value = g.getValue();
                                    iftrue(Label_0175:)(value == null);
                                    break Block_8;
                                    final SearchPostSort value2;
                                    final h b11 = h$a.b((Object)value2);
                                    final e60.a b12 = this.b;
                                    final ta ta = new ta(h$a.b((Object)n), h$a.b((Object)s2), b11, this.f(u0, b), at1.a.g2(u0, this.g.c()), h$a.c((Object)this.f.qc()), s);
                                    redditRemoteSearchGqlDataSource$searchPosts$1.L$0 = this;
                                    redditRemoteSearchGqlDataSource$searchPosts$1.label = 1;
                                    b2 = e$a.b(14, (k)ta, (e)b12, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchPosts$1, (OkHttpClient)null);
                                    iftrue(Label_0300:)(b2 != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                    aj2.c.Q0(result);
                                    g = b.g;
                                    iftrue(Label_0175:)(g == null);
                                    continue;
                                }
                                Label_0300: {
                                    redditRemoteSearchGqlDataSource = this;
                                }
                                continue Block_7_Outer;
                            }
                            Label_0175: {
                                final SearchPostSort value2 = null;
                            }
                            continue;
                        }
                        final String upperCase = value.toUpperCase(Locale.ROOT);
                        ah2.f.e((Object)upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        final SearchPostSort value2 = SearchPostSort.valueOf(upperCase);
                        continue;
                    }
                }
                catch (final IOException ex2) {
                    s = ex2.getMessage();
                    if (s != null) {
                        s3 = s;
                    }
                    return new Result$Error(s3, false, 2, (DefaultConstructorMarker)null);
                }
            }
        }
    }
    
    public final Object d(final String s, final u0 u0, final jv1.b b, final String s2, final c<? super Result<jv1.f<jv1.d>>> c) {
        if (this.h.L7()) {
            return this.h(s, u0, b, s2, c);
        }
        return this.g(s, u0, b, s2, c);
    }
    
    public final Object e(String s, final u0 u0, final jv1.b b, final String s2, c<? super Result<jv1.f<jv1.e>>> iterator) {
        RedditRemoteSearchGqlDataSource$searchPeople.RedditRemoteSearchGqlDataSource$searchPeople$1 redditRemoteSearchGqlDataSource$searchPeople$1 = null;
        Label_0055: {
            if (iterator instanceof RedditRemoteSearchGqlDataSource$searchPeople.RedditRemoteSearchGqlDataSource$searchPeople$1) {
                redditRemoteSearchGqlDataSource$searchPeople$1 = (RedditRemoteSearchGqlDataSource$searchPeople.RedditRemoteSearchGqlDataSource$searchPeople$1)iterator;
                final int label = redditRemoteSearchGqlDataSource$searchPeople$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRemoteSearchGqlDataSource$searchPeople$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            redditRemoteSearchGqlDataSource$searchPeople$1 = new RedditRemoteSearchGqlDataSource$searchPeople.RedditRemoteSearchGqlDataSource$searchPeople$1(this, (c)iterator);
        }
        final Object result = redditRemoteSearchGqlDataSource$searchPeople$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditRemoteSearchGqlDataSource$searchPeople$1.label;
        iterator = "";
        final String s3 = null;
        Label_0122: {
            if (label2 == 0) {
                break Label_0122;
            }
            Label_0112: {
                if (label2 != 1) {
                    break Label_0112;
                }
                RedditRemoteSearchGqlDataSource redditRemoteSearchGqlDataSource = (RedditRemoteSearchGqlDataSource)redditRemoteSearchGqlDataSource$searchPeople$1.L$0;
                try {
                    aj2.c.Q0(result);
                    Object b2 = result;
                Label_0156_Outer:
                    while (true) {
                    Label_0156:
                        while (true) {
                            while (true) {
                                final sa$c sa$c = (sa$c)b2;
                                try {
                                    final sa$i a = sa$c.a;
                                    sa$a b4 = null;
                                    Label_0277: {
                                        if (a != null) {
                                            final sa$f b3 = a.b;
                                            if (b3 != null) {
                                                b4 = b3.b;
                                                break Label_0277;
                                            }
                                        }
                                        b4 = null;
                                    }
                                    ah2.f.c((Object)b4);
                                    final List c = b4.c;
                                    final ArrayList<jv1.e> list = new ArrayList<jv1.e>();
                                    iterator = c.iterator();
                                    while (((Iterator)iterator).hasNext()) {
                                        final sa$d sa$d = ((Iterator<sa$d>)iterator).next();
                                        jv1.e i2 = null;
                                        Label_0365: {
                                            if (sa$d != null) {
                                                final sa$g b5 = sa$d.b;
                                                if (b5 != null) {
                                                    final sa$g$a b6 = b5.b;
                                                    if (b6 != null) {
                                                        final SearchPersonFragment a2 = b6.a;
                                                        if (a2 != null) {
                                                            i2 = at1.a.i2(a2);
                                                            break Label_0365;
                                                        }
                                                    }
                                                }
                                            }
                                            i2 = null;
                                        }
                                        if (i2 != null) {
                                            list.add(i2);
                                        }
                                    }
                                    final sh a3 = b4.b.b.a;
                                    redditRemoteSearchGqlDataSource.getClass();
                                    if (!a3.b) {
                                        s = null;
                                    }
                                    else {
                                        s = a3.c;
                                    }
                                    final sa$e d = b4.d;
                                    String rawValue = s3;
                                    if (d != null) {
                                        final TreatmentProtocol b7 = d.b;
                                        rawValue = s3;
                                        if (b7 != null) {
                                            rawValue = b7.getRawValue();
                                        }
                                    }
                                    return new Result$Success((Object)new jv1.f((ArrayList)list, s, rawValue));
                                }
                                catch (final NullPointerException ex) {
                                    s = ex.getMessage();
                                    if (s == null) {
                                        s = (String)iterator;
                                    }
                                    return new Result$Error(s, false, 2, (DefaultConstructorMarker)null);
                                }
                                final Object o = null;
                                break Label_0156;
                                Label_0242: {
                                    redditRemoteSearchGqlDataSource = this;
                                }
                                continue Label_0156_Outer;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            final e60.a b8 = this.b;
                            Object o = null;
                            final sa sa = new sa(h$a.b((Object)s2), this.f(u0, b), h$a.b(o), at1.a.g2(u0, (String)null), s);
                            redditRemoteSearchGqlDataSource$searchPeople$1.L$0 = this;
                            redditRemoteSearchGqlDataSource$searchPeople$1.label = 1;
                            b2 = e$a.b(14, (k)sa, (e)b8, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchPeople$1, (OkHttpClient)null);
                            iftrue(Label_0242:)(b2 != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                            Label_0145: {
                                o = new Integer(50);
                            }
                            continue Label_0156;
                        }
                        aj2.c.Q0(result);
                        iftrue(Label_0145:)(!this.h.Va());
                        continue Label_0156_Outer;
                    }
                }
                catch (final IOException ex2) {
                    s = ex2.getMessage();
                    if (s == null) {
                        s = (String)iterator;
                    }
                    return new Result$Error(s, false, 2, (DefaultConstructorMarker)null);
                }
            }
        }
    }
    
    public final h f(final u0 u0, final jv1.b b) {
        final h b2 = h$a.b((Object)"nsfw");
        String s;
        if (this.e.G3() && !b.i) {
            s = "1";
        }
        else {
            s = "0";
        }
        final ArrayList a0 = ah2.c.a0((Object[])new a1[] { new a1(b2, h$a.b((Object)s)) });
        final SortTimeFrame h = b.h;
        if (h != null) {
            a0.add(new a1(h$a.b((Object)"time_range"), h$a.b((Object)h)));
        }
        if (u0.f != null) {
            a0.add(new a1(h$a.b((Object)"subreddit_names"), h$a.b((Object)u0.f)));
        }
        final List j = b.j;
        if (j != null && (j.isEmpty() ^ true)) {
            a0.add(new a1(h$a.b((Object)"post_types"), h$a.b((Object)CollectionsKt___CollectionsKt.y1((Iterable)j, (CharSequence)",", (String)null, (String)null, (l)RedditRemoteSearchGqlDataSource$getFilterInput$1$3$1.INSTANCE, 30))));
        }
        final List k = b.k;
        if (k != null && (k.isEmpty() ^ true)) {
            a0.add(new a1(h$a.b((Object)"post_ids"), h$a.b((Object)CollectionsKt___CollectionsKt.y1((Iterable)k, (CharSequence)",", (String)null, (String)null, (l)null, 62))));
        }
        return h$a.b((Object)a0);
    }
    
    public final Object g(String s, final u0 u0, final jv1.b b, String id, c<? super Result<jv1.f<jv1.d>>> o) {
        RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy.RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1 redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1 = null;
        Label_0055: {
            if (o instanceof RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy.RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1) {
                redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1 = (RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy.RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1)o;
                final int label = redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1 = new RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy.RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1(this, (c)o);
        }
        final Object result = redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1.label;
        o = "";
        final String s2 = null;
        Label_0122: {
            if (label2 == 0) {
                break Label_0122;
            }
            Label_0112: {
                if (label2 != 1) {
                    break Label_0112;
                }
                RedditRemoteSearchGqlDataSource redditRemoteSearchGqlDataSource = (RedditRemoteSearchGqlDataSource)redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1.L$0;
                try {
                    aj2.c.Q0(result);
                    Object b2 = result;
                    while (true) {
                        final qa$c qa$c = (qa$c)b2;
                        try {
                            final qa$i a = qa$c.a;
                            qa$a b4 = null;
                            Label_0231: {
                                if (a != null) {
                                    final qa$f b3 = a.b;
                                    if (b3 != null) {
                                        b4 = b3.b;
                                        break Label_0231;
                                    }
                                }
                                b4 = null;
                            }
                            ah2.f.c((Object)b4);
                            final List c = b4.c;
                            final ArrayList<SubredditDetailsFragment> list = new ArrayList<SubredditDetailsFragment>();
                            o = c.iterator();
                            while (((Iterator)o).hasNext()) {
                                final qa$d qa$d = ((Iterator<qa$d>)o).next();
                                SubredditDetailsFragment a2 = null;
                                Label_0310: {
                                    if (qa$d != null) {
                                        final qa$g b5 = qa$d.b;
                                        if (b5 != null) {
                                            final qa$g$a b6 = b5.b;
                                            if (b6 != null) {
                                                a2 = b6.a;
                                                break Label_0310;
                                            }
                                        }
                                    }
                                    a2 = null;
                                }
                                if (a2 != null) {
                                    list.add(a2);
                                }
                            }
                            o = new ArrayList<Object>(qg2.m.P0((Iterable)list, 10));
                            for (final SubredditDetailsFragment subredditDetailsFragment : list) {
                                final GqlSubredditMapper instance = GqlSubredditMapper.INSTANCE;
                                final JsonAdapter jsonAdapter = (JsonAdapter)redditRemoteSearchGqlDataSource.i.getValue();
                                ah2.f.e((Object)jsonAdapter, "richTextAdapter");
                                ((ArrayList<Subreddit>)o).add(instance.map(subredditDetailsFragment, jsonAdapter));
                            }
                            final ArrayList list2 = new ArrayList<jv1.d>(qg2.m.P0((Iterable)o, 10));
                            o = ((ArrayList<Object>)o).iterator();
                            while (((Iterator)o).hasNext()) {
                                final Subreddit subreddit = (Subreddit)((Iterator<qa$d>)o).next();
                                id = subreddit.getId();
                                list2.add(new jv1.d(id, subreddit.getCommunityIcon(), subreddit.getDisplayNamePrefixed(), subreddit.getUserIsSubscriber(), subreddit.getSubscribers(), subreddit.getPublicDescription(), subreddit.getOver18(), subreddit.getKindWithId(), subreddit.getDisplayName(), subreddit.getQuarantined(), subreddit.isMyReddit()));
                            }
                            final sh a3 = b4.b.b.a;
                            redditRemoteSearchGqlDataSource.getClass();
                            if (!a3.b) {
                                s = null;
                            }
                            else {
                                s = a3.c;
                            }
                            final qa$e d = b4.d;
                            String rawValue = s2;
                            if (d != null) {
                                final TreatmentProtocol b7 = d.b;
                                rawValue = s2;
                                if (b7 != null) {
                                    rawValue = b7.getRawValue();
                                }
                            }
                            return new Result$Success((Object)new jv1.f(list2, s, rawValue));
                        }
                        catch (final NullPointerException ex) {
                            s = ex.getMessage();
                            if (s != null) {
                                o = s;
                            }
                            return new Result$Error((String)o, false, 2, (DefaultConstructorMarker)null);
                        }
                        Label_0196: {
                            redditRemoteSearchGqlDataSource = this;
                        }
                        continue;
                    }
                    aj2.c.Q0(result);
                    final e60.a b8 = this.b;
                    final qa qa = new qa(s, h$a.b((Object)id), this.f(u0, b), at1.a.g2(u0, (String)null));
                    redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1.L$0 = this;
                    redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1.label = 1;
                    b2 = e$a.b(14, (k)qa, (e)b8, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1, (OkHttpClient)null);
                    iftrue(Label_0196:)(b2 != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final IOException ex2) {
                    s = ex2.getMessage();
                    if (s != null) {
                        o = s;
                    }
                    return new Result$Error((String)o, false, 2, (DefaultConstructorMarker)null);
                }
            }
        }
    }
    
    public final c0<RemoteSearchResult> getSearchSuggestions(final String s, final Boolean b, final Boolean b2, final boolean b3, final String s2, final String s3) {
        m.y(s, "query", s2, "searchCorrelationId", s3, "searchQueryId");
        final c0 w = e$a.a((e)this.b, (k)new ya(s, h$a.b((Object)new d3(h$a.b((Object)s3), h$a.b((Object)s2), h$a.b((Object)((Enum)OriginPageType.HOME).name()), h$a.b((Object)((Enum)SearchStructureType.SEARCH).name()), h$a.b((Object)b2), 1))), (OkHttpClient)null, (Map)null, 14).w((o)new wu.e(5));
        ah2.f.e((Object)w, "graphQlClient.execute(\n \u2026\n        ),\n      )\n    }");
        return (c0<RemoteSearchResult>)w;
    }
    
    public final Object h(String s, final u0 u0, final jv1.b b, final String s2, c<? super Result<jv1.f<jv1.d>>> iterator) {
        RedditRemoteSearchGqlDataSource$searchCommunitiesNew.RedditRemoteSearchGqlDataSource$searchCommunitiesNew$1 redditRemoteSearchGqlDataSource$searchCommunitiesNew$1 = null;
        Label_0055: {
            if (iterator instanceof RedditRemoteSearchGqlDataSource$searchCommunitiesNew.RedditRemoteSearchGqlDataSource$searchCommunitiesNew$1) {
                redditRemoteSearchGqlDataSource$searchCommunitiesNew$1 = (RedditRemoteSearchGqlDataSource$searchCommunitiesNew.RedditRemoteSearchGqlDataSource$searchCommunitiesNew$1)iterator;
                final int label = redditRemoteSearchGqlDataSource$searchCommunitiesNew$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRemoteSearchGqlDataSource$searchCommunitiesNew$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            redditRemoteSearchGqlDataSource$searchCommunitiesNew$1 = new RedditRemoteSearchGqlDataSource$searchCommunitiesNew.RedditRemoteSearchGqlDataSource$searchCommunitiesNew$1(this, (c)iterator);
        }
        final Object result = redditRemoteSearchGqlDataSource$searchCommunitiesNew$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditRemoteSearchGqlDataSource$searchCommunitiesNew$1.label;
        iterator = "";
        Label_0119: {
            if (label2 == 0) {
                break Label_0119;
            }
            Label_0109: {
                if (label2 != 1) {
                    break Label_0109;
                }
                RedditRemoteSearchGqlDataSource redditRemoteSearchGqlDataSource = (RedditRemoteSearchGqlDataSource)redditRemoteSearchGqlDataSource$searchCommunitiesNew$1.L$0;
                try {
                    aj2.c.Q0(result);
                    Object b2 = result;
                    while (true) {
                        final oa$c oa$c = (oa$c)b2;
                        try {
                            final oa$k a = oa$c.a;
                            oa$a b4 = null;
                            Label_0230: {
                                if (a != null) {
                                    final oa$f b3 = a.b;
                                    if (b3 != null) {
                                        b4 = b3.b;
                                        break Label_0230;
                                    }
                                }
                                b4 = null;
                            }
                            ah2.f.c((Object)b4);
                            final List c = b4.c;
                            final ArrayList<oa$i> list = new ArrayList<oa$i>();
                            iterator = c.iterator();
                            while (((Iterator)iterator).hasNext()) {
                                final oa$d oa$d = ((Iterator<oa$d>)iterator).next();
                                oa$i b5;
                                if (oa$d != null) {
                                    b5 = oa$d.b;
                                }
                                else {
                                    b5 = null;
                                }
                                if (b5 != null) {
                                    list.add(b5);
                                }
                            }
                            iterator = new ArrayList<jv1.d>(qg2.m.P0((Iterable)list, 10));
                            for (final oa$i oa$i : list) {
                                redditRemoteSearchGqlDataSource.d.getClass();
                                ah2.f.f((Object)oa$i, "node");
                                final String g = w.g(oa$i.b);
                                final String d = oa$i.d;
                                final boolean j = oa$i.j;
                                final oa$l e = oa$i.e;
                                Object c2;
                                if (e != null) {
                                    c2 = e.c;
                                }
                                else {
                                    c2 = null;
                                }
                                String s3;
                                if (c2 instanceof String) {
                                    s3 = (String)c2;
                                }
                                else {
                                    s3 = null;
                                }
                                if (!((s3 == null || s3.length() == 0) ^ true)) {
                                    s3 = null;
                                }
                                s = s3;
                                if (s3 == null) {
                                    final oa$l e2 = oa$i.e;
                                    Object b7 = null;
                                    Label_0495: {
                                        if (e2 != null) {
                                            final oa$g b6 = e2.b;
                                            if (b6 != null) {
                                                b7 = b6.b;
                                                break Label_0495;
                                            }
                                        }
                                        b7 = null;
                                    }
                                    if (b7 instanceof String) {
                                        s = (String)b7;
                                    }
                                    else {
                                        s = null;
                                    }
                                }
                                final long n = (long)oa$i.g;
                                String f = oa$i.f;
                                if (f == null) {
                                    f = "";
                                }
                                final boolean h = oa$i.h;
                                final String b8 = oa$i.b;
                                final String c3 = oa$i.c;
                                final boolean i = oa$i.i;
                                final oa$h k = oa$i.k;
                                ((ArrayList<jv1.d>)iterator).add(new jv1.d(g, s, d, Boolean.valueOf(j), Long.valueOf(n), f, Boolean.valueOf(h), b8, c3, Boolean.valueOf(i), k != null && k.b));
                            }
                            final sh a2 = b4.b.b.a;
                            redditRemoteSearchGqlDataSource.getClass();
                            if (!a2.b) {
                                s = null;
                            }
                            else {
                                s = a2.c;
                            }
                            final oa$e d2 = b4.d;
                            if (d2 != null) {
                                final TreatmentProtocol b9 = d2.b;
                                if (b9 != null) {
                                    final String rawValue = b9.getRawValue();
                                    return new Result$Success((Object)new jv1.f((ArrayList)iterator, s, rawValue));
                                }
                            }
                            final String rawValue = null;
                            return new Result$Success((Object)new jv1.f((ArrayList)iterator, s, rawValue));
                        }
                        catch (final NullPointerException ex) {
                            s = ex.getMessage();
                            if (s == null) {
                                s = (String)iterator;
                            }
                            return new Result$Error(s, false, 2, (DefaultConstructorMarker)null);
                        }
                        return coroutine_SUSPENDED;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        aj2.c.Q0(result);
                        final e60.a b10 = this.b;
                        final oa oa = new oa(s, h$a.b((Object)s2), this.f(u0, b), at1.a.g2(u0, (String)null));
                        redditRemoteSearchGqlDataSource$searchCommunitiesNew$1.L$0 = this;
                        redditRemoteSearchGqlDataSource$searchCommunitiesNew$1.label = 1;
                        b2 = e$a.b(14, (k)oa, (e)b10, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchCommunitiesNew$1, (OkHttpClient)null);
                        iftrue(Label_0193:)(b2 != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                        Label_0193: {
                            redditRemoteSearchGqlDataSource = this;
                        }
                        continue;
                    }
                }
                catch (final IOException ex2) {
                    s = ex2.getMessage();
                    if (s == null) {
                        s = (String)iterator;
                    }
                    return new Result$Error(s, false, 2, (DefaultConstructorMarker)null);
                }
            }
        }
    }
}
