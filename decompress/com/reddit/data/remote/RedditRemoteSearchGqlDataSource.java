// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.queries.ra$e;
import com.reddit.queries.ra$h;
import com.reddit.queries.ra$g;
import com.reddit.queries.ra$l;
import com.reddit.queries.ra$a;
import com.reddit.queries.ra$f;
import com.reddit.queries.ra$k;
import com.reddit.queries.ra;
import y10.w;
import com.reddit.queries.ra$d;
import com.reddit.queries.ra$i;
import com.reddit.queries.ra$c;
import com.reddit.queries.bb;
import com.reddit.domain.model.search.RemoteSearchResult;
import com.reddit.queries.ta$e;
import com.reddit.queries.ta$g$a;
import com.reddit.queries.ta$g;
import com.reddit.queries.ta$a;
import com.reddit.queries.ta$f;
import com.reddit.queries.ta$i;
import com.reddit.queries.ta;
import com.reddit.data.model.graphql.GqlSubredditMapper;
import com.reddit.domain.model.Subreddit;
import com.reddit.queries.ta$d;
import com.reddit.fragment.SubredditDetailsFragment;
import com.reddit.queries.ta$c;
import com.reddit.listing.model.sort.SortTimeFrame;
import mg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import y12.a1;
import com.reddit.listing.model.sort.SearchSortType;
import com.reddit.queries.wa$e;
import com.reddit.queries.wa$i;
import com.reddit.queries.wa$f$a;
import com.reddit.queries.wa$f;
import com.reddit.queries.wa$d;
import com.reddit.queries.wa$h;
import com.reddit.queries.wa$b;
import dg2.m;
import com.reddit.queries.wa;
import com.reddit.type.SearchPostSort;
import java.util.Locale;
import com.reddit.queries.wa$c;
import kotlin.collections.EmptyList;
import com.reddit.queries.pa$e;
import com.reddit.fragment.SearchCommentFragment$g;
import com.reddit.fragment.AuthorInfoFragment$a;
import com.reddit.fragment.AuthorInfoFragment$c;
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
import com.reddit.fragment.SearchCommentFragment$b$a;
import com.reddit.fragment.SearchCommentFragment$b;
import com.reddit.fragment.SearchCommentFragment$d;
import com.reddit.fragment.SearchCommentFragment;
import com.reddit.queries.pa$g$a;
import com.reddit.queries.pa$g;
import com.reddit.queries.pa$a;
import com.reddit.queries.pa$f;
import com.reddit.queries.pa$i;
import com.reddit.queries.pa;
import xu1.b$b;
import com.reddit.fragment.SearchCommentFragment$c;
import com.reddit.fragment.FeedAnswerableQuestionsFragment;
import com.reddit.fragment.PostRecommendationFragment$u;
import xu1.b$a;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import com.squareup.moshi.JsonAdapter;
import com.reddit.queries.pa$d;
import com.reddit.queries.pa$c;
import com.reddit.type.TreatmentProtocol;
import com.reddit.queries.va$e;
import dl0.vi;
import com.reddit.fragment.SearchPersonFragment;
import com.reddit.queries.va$g$a;
import com.reddit.queries.va$g;
import java.util.Iterator;
import java.util.List;
import com.reddit.queries.va$a;
import com.reddit.queries.va$f;
import com.reddit.queries.va$i;
import java.io.IOException;
import com.reddit.network.common.RetryAlgo;
import com.reddit.queries.va;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.d0;
import com.reddit.queries.va$d;
import java.util.ArrayList;
import com.reddit.queries.va$c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xu1.d;
import com.reddit.domain.model.Result;
import gg2.c;
import oi0.z0;
import ff2.o;
import l10.h;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import mr0.e;
import mr0.e$a;
import com.reddit.queries.za;
import y12.d3;
import com.reddit.events.search.SearchStructureType;
import com.reddit.domain.model.search.OriginPageType;
import h7.h$a;
import af2.c0;
import javax.inject.Inject;
import cg2.f;
import wa0.x;
import xd0.s;
import y50.h0;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import com.squareup.moshi.y;
import i70.b;
import i70.a;

public final class RedditRemoteSearchGqlDataSource implements a, b
{
    public final y a;
    public final z50.a b;
    public final GqlPostToLinkDomainModelMapper c;
    public final h0 d;
    public final s e;
    public final jr0.a f;
    public final av.a g;
    public final x h;
    public final f i;
    
    @Inject
    public RedditRemoteSearchGqlDataSource(final y a, final z50.a b, final GqlPostToLinkDomainModelMapper c, final h0 d, final s e, final jr0.a f, final av.a g, final x h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = kotlin.a.b((mg2.a)new RedditRemoteSearchGqlDataSource$richTextAdapter$2(this));
    }
    
    public final c0 a(final String s, final Boolean b, final String s2, final String s3) {
        b.w(s, "query", s2, "searchCorrelationId", s3, "searchQueryId");
        final c0 w = e$a.a((e)this.b, (k)new za(s, h$a.b((Object)new d3(h$a.b((Object)s3), h$a.b((Object)s2), h$a.b((Object)((Enum)OriginPageType.HOME).name()), h$a.b((Object)((Enum)SearchStructureType.SEARCH).name()), h$a.b((Object)b), 1))), (OkHttpClient)null, (Map)null, 14).w((o)new h(4));
        ng2.e.e((Object)w, "graphQlClient.execute(\n \u2026\n        ),\n      )\n    }");
        return w;
    }
    
    public final Object b(String s, final z0 z0, final xu1.a a, final String s2, final c<? super Result<xu1.e<d>>> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RedditRemoteSearchGqlDataSource$searchPeople$1) {
                final RedditRemoteSearchGqlDataSource$searchPeople$1 redditRemoteSearchGqlDataSource$searchPeople$1 = (RedditRemoteSearchGqlDataSource$searchPeople$1)c;
                final int label = redditRemoteSearchGqlDataSource$searchPeople$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRemoteSearchGqlDataSource$searchPeople$1.label = label + Integer.MIN_VALUE;
                    o = redditRemoteSearchGqlDataSource$searchPeople$1;
                    break Label_0059;
                }
            }
            o = new RedditRemoteSearchGqlDataSource$searchPeople$1(this, (c)c);
        }
        final Object result = ((RedditRemoteSearchGqlDataSource$searchPeople$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditRemoteSearchGqlDataSource$searchPeople$1)o).label;
        final String s3 = null;
        Label_0122: {
            if (label2 == 0) {
                break Label_0122;
            }
            Label_0112: {
                if (label2 != 1) {
                    break Label_0112;
                }
                RedditRemoteSearchGqlDataSource redditRemoteSearchGqlDataSource = (RedditRemoteSearchGqlDataSource)((RedditRemoteSearchGqlDataSource$searchPeople$1)o).L$0;
                try {
                    cg.d.b4(result);
                    Object b = result;
                Label_0156_Outer:
                    while (true) {
                        while (true) {
                            while (true) {
                                final va$c va$c = (va$c)b;
                                try {
                                    final va$i a2 = va$c.a;
                                    va$a b3 = null;
                                    Label_0277: {
                                        if (a2 != null) {
                                            final va$f b2 = a2.b;
                                            if (b2 != null) {
                                                b3 = b2.b;
                                                break Label_0277;
                                            }
                                        }
                                        b3 = null;
                                    }
                                    ng2.e.c((Object)b3);
                                    final List c2 = b3.c;
                                    final ArrayList<d> list = new ArrayList<d>();
                                    for (final va$d va$d : c2) {
                                        d k1 = null;
                                        Label_0365: {
                                            if (va$d != null) {
                                                final va$g b4 = va$d.b;
                                                if (b4 != null) {
                                                    final va$g$a b5 = b4.b;
                                                    if (b5 != null) {
                                                        final SearchPersonFragment a3 = b5.a;
                                                        if (a3 != null) {
                                                            k1 = d0.k1(a3);
                                                            break Label_0365;
                                                        }
                                                    }
                                                }
                                            }
                                            k1 = null;
                                        }
                                        if (k1 != null) {
                                            list.add(k1);
                                        }
                                    }
                                    final vi a4 = b3.b.b.a;
                                    redditRemoteSearchGqlDataSource.getClass();
                                    if (!a4.b) {
                                        s = null;
                                    }
                                    else {
                                        s = a4.c;
                                    }
                                    final va$e d = b3.d;
                                    String rawValue = s3;
                                    if (d != null) {
                                        final TreatmentProtocol b6 = d.b;
                                        rawValue = s3;
                                        if (b6 != null) {
                                            rawValue = b6.getRawValue();
                                        }
                                    }
                                    return new Result.Success(new xu1.e((ArrayList)list, s, rawValue));
                                }
                                catch (final NullPointerException ex) {
                                    s = ex.getMessage();
                                    if (s == null) {
                                        s = "";
                                    }
                                    return new Result.Error(s, false, null, 6, null);
                                }
                                final Object o2 = null;
                                final z50.a b7 = this.b;
                                final va va = new va(h$a.b((Object)s2), this.f(z0, a), h$a.b(o2), d0.c1(z0, (String)null), s);
                                ((RedditRemoteSearchGqlDataSource$searchPeople$1)o).L$0 = this;
                                ((RedditRemoteSearchGqlDataSource$searchPeople$1)o).label = 1;
                                b = e$a.b(14, (k)va, (e)b7, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
                                iftrue(Label_0242:)(b != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                                Label_0242: {
                                    redditRemoteSearchGqlDataSource = this;
                                }
                                continue Label_0156_Outer;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            Label_0145: {
                                final Object o2 = new Integer(50);
                            }
                            continue;
                        }
                        cg.d.b4(result);
                        iftrue(Label_0145:)(!this.h.Wa());
                        continue Label_0156_Outer;
                    }
                }
                catch (final IOException ex2) {
                    s = ex2.getMessage();
                    if (s == null) {
                        s = "";
                    }
                    return new Result.Error(s, false, null, 6, null);
                }
            }
        }
    }
    
    public final Object c(final String s, final z0 z0, final xu1.a a, final String s2, final c<? super Result<xu1.e<xu1.c>>> c) {
        if (this.h.O7()) {
            return this.h(s, z0, a, s2, c);
        }
        return this.g(s, z0, a, s2, c);
    }
    
    public final Object d(String s, final z0 z0, final xu1.a a, final String s2, final c<? super Result<xu1.e<xu1.b>>> c) {
        RedditRemoteSearchGqlDataSource$searchComments$1 redditRemoteSearchGqlDataSource$searchComments$2 = null;
        Label_0059: {
            if (c instanceof RedditRemoteSearchGqlDataSource$searchComments$1) {
                final RedditRemoteSearchGqlDataSource$searchComments$1 redditRemoteSearchGqlDataSource$searchComments$1 = (RedditRemoteSearchGqlDataSource$searchComments$1)c;
                final int label = redditRemoteSearchGqlDataSource$searchComments$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRemoteSearchGqlDataSource$searchComments$1.label = label + Integer.MIN_VALUE;
                    redditRemoteSearchGqlDataSource$searchComments$2 = redditRemoteSearchGqlDataSource$searchComments$1;
                    break Label_0059;
                }
            }
            redditRemoteSearchGqlDataSource$searchComments$2 = new RedditRemoteSearchGqlDataSource$searchComments$1(this, (c)c);
        }
        final Object result = redditRemoteSearchGqlDataSource$searchComments$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditRemoteSearchGqlDataSource$searchComments$2.label;
        final String s3 = null;
        Label_0122: {
            if (label2 == 0) {
                break Label_0122;
            }
            Label_0112: {
                if (label2 != 1) {
                    break Label_0112;
                }
                RedditRemoteSearchGqlDataSource redditRemoteSearchGqlDataSource = (RedditRemoteSearchGqlDataSource)redditRemoteSearchGqlDataSource$searchComments$2.L$0;
                try {
                    cg.d.b4(result);
                    Object b = result;
                    while (true) {
                        final pa$c pa$c = (pa$c)b;
                        try {
                            final pa$i a2 = pa$c.a;
                            pa$a b3 = null;
                            Label_0239: {
                                if (a2 != null) {
                                    final pa$f b2 = a2.b;
                                    if (b2 != null) {
                                        b3 = b2.b;
                                        break Label_0239;
                                    }
                                }
                                b3 = null;
                            }
                            ng2.e.c((Object)b3);
                            final List c2 = b3.c;
                            final ArrayList<Object> list = new ArrayList<Object>();
                            for (final pa$d pa$d : c2) {
                                Object o = null;
                                Label_1029: {
                                    if (pa$d != null) {
                                        final pa$g b4 = pa$d.b;
                                        if (b4 != null) {
                                            final pa$g$a b5 = b4.b;
                                            if (b5 != null) {
                                                final SearchCommentFragment a3 = b5.a;
                                                if (a3 != null) {
                                                    final GqlPostToLinkDomainModelMapper c3 = redditRemoteSearchGqlDataSource.c;
                                                    final JsonAdapter jsonAdapter = (JsonAdapter)redditRemoteSearchGqlDataSource.i.getValue();
                                                    ng2.e.e((Object)jsonAdapter, "richTextAdapter");
                                                    ng2.e.f((Object)c3, "linkMapper");
                                                    final SearchCommentFragment$d g = a3.g;
                                                    if (g != null) {
                                                        final String b6 = g.b;
                                                        final Object c4 = g.c;
                                                        String s4;
                                                        if (c4 instanceof String) {
                                                            s4 = (String)c4;
                                                        }
                                                        else {
                                                            s4 = null;
                                                        }
                                                        final b$a b$a = new b$a(b6, s4, GqlDataToDomainModelMapperKt.toMediaDataMap(g.d.a));
                                                        final SearchCommentFragment$b h = a3.h;
                                                        if (h != null) {
                                                            final SearchCommentFragment$b$a b7 = h.b;
                                                            if (b7 != null) {
                                                                final SearchPersonFragment a4 = b7.a;
                                                                if (a4 != null) {
                                                                    final d k1 = d0.k1(a4);
                                                                    final SearchCommentFragment$h l = a3.l;
                                                                    if (l != null) {
                                                                        final SearchCommentFragment$a c5 = l.c;
                                                                        Link map$default = null;
                                                                        Label_0617: {
                                                                            if (c5 != null) {
                                                                                final SearchCommentFragment$a$a c6 = c5.c;
                                                                                if (c6 != null) {
                                                                                    final PostFragment a5 = c6.a;
                                                                                    if (a5 != null) {
                                                                                        final PostFragment$a d = a5.d;
                                                                                        SubredditFragment a6 = null;
                                                                                        Label_0531: {
                                                                                            if (d != null) {
                                                                                                final PostFragment$g c7 = d.c;
                                                                                                if (c7 != null) {
                                                                                                    final PostFragment$g$a b8 = c7.b;
                                                                                                    if (b8 != null) {
                                                                                                        a6 = b8.a;
                                                                                                        break Label_0531;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            a6 = null;
                                                                                        }
                                                                                        final PostContentFragment a7 = a5.c.a;
                                                                                        final PostFragment$c b9 = a5.b;
                                                                                        CrosspostContentFragment a8 = null;
                                                                                        Label_0590: {
                                                                                            if (b9 != null) {
                                                                                                final PostFragment$e c8 = b9.c;
                                                                                                if (c8 != null) {
                                                                                                    final PostFragment$e$a b10 = c8.b;
                                                                                                    if (b10 != null) {
                                                                                                        a8 = b10.a;
                                                                                                        break Label_0590;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            a8 = null;
                                                                                        }
                                                                                        map$default = GqlPostToLinkDomainModelMapper.map$default(c3, a6, a7, (PostRecommendationFragment$u)null, (FeedAnswerableQuestionsFragment)null, a8, (String)null, (List)null, (Integer)null, jsonAdapter, 236, (Object)null);
                                                                                        break Label_0617;
                                                                                    }
                                                                                }
                                                                            }
                                                                            map$default = null;
                                                                        }
                                                                        ng2.e.c((Object)map$default);
                                                                        final List j = a3.j;
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
                                                                        final SearchCommentFragment$h i = a3.l;
                                                                        AuthorInfoFragment a11 = null;
                                                                        Label_0791: {
                                                                            if (i != null) {
                                                                                final SearchCommentFragment$a c9 = i.c;
                                                                                if (c9 != null) {
                                                                                    final SearchCommentFragment$a$a c10 = c9.c;
                                                                                    if (c10 != null) {
                                                                                        final PostFragment a9 = c10.a;
                                                                                        if (a9 != null) {
                                                                                            final PostFragment$d c11 = a9.c;
                                                                                            if (c11 != null) {
                                                                                                final PostContentFragment a10 = c11.a;
                                                                                                if (a10 != null) {
                                                                                                    final PostContentFragment$r f = a10.F;
                                                                                                    if (f != null) {
                                                                                                        final PostContentFragment$r$a b11 = f.b;
                                                                                                        if (b11 != null) {
                                                                                                            a11 = b11.a;
                                                                                                            break Label_0791;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            a11 = null;
                                                                        }
                                                                        final String b12 = a3.b;
                                                                        final long c12 = mr0.c.c(a3.c.toString());
                                                                        final Double e = a3.e;
                                                                        int n2;
                                                                        if (e != null) {
                                                                            n2 = (int)(double)e;
                                                                        }
                                                                        else {
                                                                            n2 = 0;
                                                                        }
                                                                        final boolean f2 = a3.f;
                                                                        final boolean m = a3.i;
                                                                        AuthorInfoFragment$c d2;
                                                                        if (a11 != null) {
                                                                            d2 = a11.d;
                                                                        }
                                                                        else {
                                                                            d2 = null;
                                                                        }
                                                                        final boolean b13 = d2 != null;
                                                                        AuthorInfoFragment$a e2;
                                                                        if (a11 != null) {
                                                                            e2 = a11.e;
                                                                        }
                                                                        else {
                                                                            e2 = null;
                                                                        }
                                                                        final b$b b$b = new b$b(map$default, b13, e2 != null);
                                                                        final Object d3 = a3.d;
                                                                        Long value;
                                                                        if (d3 != null) {
                                                                            value = mr0.c.c(d3.toString());
                                                                        }
                                                                        else {
                                                                            value = null;
                                                                        }
                                                                        final SearchCommentFragment$g k2 = a3.k;
                                                                        String s5;
                                                                        if (k2 == null || (s5 = k2.b) == null) {
                                                                            s5 = map$default.getKindWithId();
                                                                        }
                                                                        o = new xu1.b(b12, s5, c12, value, n2, f2, n, b$a, k1, m, b$b);
                                                                        break Label_1029;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    o = null;
                                }
                                if (o != null) {
                                    list.add(o);
                                }
                            }
                            final vi a12 = b3.b.b.a;
                            redditRemoteSearchGqlDataSource.getClass();
                            if (!a12.b) {
                                s = null;
                            }
                            else {
                                s = a12.c;
                            }
                            final pa$e d4 = b3.d;
                            String rawValue = s3;
                            if (d4 != null) {
                                final TreatmentProtocol b14 = d4.b;
                                rawValue = s3;
                                if (b14 != null) {
                                    rawValue = b14.getRawValue();
                                }
                            }
                            return new Result.Success(new xu1.e((ArrayList)list, s, rawValue));
                        }
                        catch (final NullPointerException ex) {
                            s = ex.getMessage();
                            if (s == null) {
                                s = "";
                            }
                            return new Result.Error(s, false, null, 6, null);
                        }
                        cg.d.b4(result);
                        final z50.a b15 = this.b;
                        final pa pa = new pa(h$a.b((Object)s2), this.f(z0, a), d0.c1(z0, (String)null), s);
                        redditRemoteSearchGqlDataSource$searchComments$2.L$0 = this;
                        redditRemoteSearchGqlDataSource$searchComments$2.label = 1;
                        b = e$a.b(14, (k)pa, (e)b15, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchComments$2, (OkHttpClient)null);
                        iftrue(Label_0204:)(b != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        Label_0204: {
                            redditRemoteSearchGqlDataSource = this;
                        }
                        continue;
                    }
                }
                catch (final IOException ex2) {
                    s = ex2.getMessage();
                    if (s == null) {
                        s = "";
                    }
                    return new Result.Error(s, false, null, 6, null);
                }
            }
        }
    }
    
    public final Object e(String s, final z0 z0, final xu1.a a, final String s2, final Integer n, c<? super Result<xu1.e<Link>>> s3) {
        RedditRemoteSearchGqlDataSource$searchPosts$1 redditRemoteSearchGqlDataSource$searchPosts$1 = null;
        Label_0055: {
            if (s3 instanceof RedditRemoteSearchGqlDataSource$searchPosts$1) {
                redditRemoteSearchGqlDataSource$searchPosts$1 = (RedditRemoteSearchGqlDataSource$searchPosts$1)s3;
                final int label = redditRemoteSearchGqlDataSource$searchPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRemoteSearchGqlDataSource$searchPosts$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            redditRemoteSearchGqlDataSource$searchPosts$1 = new RedditRemoteSearchGqlDataSource$searchPosts$1(this, (c)s3);
        }
        final Object result = redditRemoteSearchGqlDataSource$searchPosts$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditRemoteSearchGqlDataSource$searchPosts$1.label;
        s3 = "";
        final String s4 = null;
        Label_0127: {
            if (label2 == 0) {
                break Label_0127;
            }
            Label_0117: {
                if (label2 != 1) {
                    break Label_0117;
                }
                RedditRemoteSearchGqlDataSource redditRemoteSearchGqlDataSource = (RedditRemoteSearchGqlDataSource)redditRemoteSearchGqlDataSource$searchPosts$1.L$0;
                Label_0310: {
                    try {
                        cg.d.b4(result);
                        final Object b = result;
                        break Label_0310;
                    }
                    catch (final IOException ex) {
                        s = ex.getMessage();
                        if (s != null) {
                            s3 = s;
                        }
                        return new Result.Error(s3, false, null, 6, null);
                        Label_0341: {
                            final wa$h b2 = null;
                        }
                        Object b;
                        wa$h b2;
                        Object instance;
                        Iterator iterator = null;
                        vi a2;
                        wa$d e;
                        String rawValue;
                        TreatmentProtocol b3;
                        ArrayList list;
                        Object o;
                        ArrayList<PostFragment> list2;
                        Iterator iterator2;
                        PostFragment a3;
                        SearchPostSort value;
                        wa$c wa$c;
                        wa$f b5;
                        wa$f$a b4;
                        SubredditFragment a4;
                        CrosspostContentFragment a5;
                        PostFragment$e$a b6;
                        PostFragment$g c;
                        PostFragment$g$a b7;
                        wa$i a6;
                        wa$e b8;
                        List d;
                        PostFragment$e c2;
                        JsonAdapter jsonAdapter;
                        GqlPostToLinkDomainModelMapper c3;
                        PostContentFragment a7;
                        String value2;
                        String upperCase;
                        PostFragment$a d2;
                        SearchSortType g = null;
                        h7.h b9;
                        z50.a b10;
                        wa wa;
                        PostFragment postFragment;
                        PostFragment$c b11 = null;
                        Block_9_Outer:Block_21_Outer:
                        while (true) {
                        Block_24:
                            while (true) {
                                Block_20: {
                                    while (true) {
                                        Block_8: {
                                            Label_0470_Outer:Label_0373_Outer:Label_0536_Outer:
                                            while (true) {
                                                break Label_0343;
                                                Label_0443:
                                                instance = EmptyList.INSTANCE;
                                                Block_12: {
                                                    Label_0536:Block_13_Outer:
                                                    while (true) {
                                                        Block_23: {
                                                            while (true) {
                                                            Block_11_Outer:
                                                                while (true) {
                                                                Block_14:
                                                                    while (true) {
                                                                        Block_19:Block_22_Outer:
                                                                        while (true) {
                                                                            Label_0447: {
                                                                                break Label_0447;
                                                                                iftrue(Label_0647:)(!iterator.hasNext());
                                                                                break Block_20;
                                                                                try {
                                                                                    Label_0647:
                                                                                    ng2.e.c((Object)b2);
                                                                                    a2 = b2.b.b.a;
                                                                                    redditRemoteSearchGqlDataSource.getClass();
                                                                                    if (!a2.b) {
                                                                                        s = null;
                                                                                    }
                                                                                    else {
                                                                                        s = a2.c;
                                                                                    }
                                                                                    e = b2.e;
                                                                                    rawValue = s4;
                                                                                    if (e != null) {
                                                                                        b3 = e.b;
                                                                                        rawValue = s4;
                                                                                        if (b3 != null) {
                                                                                            rawValue = b3.getRawValue();
                                                                                        }
                                                                                    }
                                                                                    o = new Result.Success(new xu1.e(list, s, rawValue));
                                                                                }
                                                                                catch (final NullPointerException ex2) {
                                                                                    s = ex2.getMessage();
                                                                                    if (s == null) {
                                                                                        s = s3;
                                                                                    }
                                                                                    o = new Result.Error(s, false, null, 6, null);
                                                                                }
                                                                                return o;
                                                                                Label_0308:
                                                                                redditRemoteSearchGqlDataSource = this;
                                                                                break Label_0310;
                                                                                instance = list2;
                                                                                iftrue(Label_0447:)(!iterator2.hasNext());
                                                                                Label_0186: {
                                                                                    while (true) {
                                                                                        Label_0595: {
                                                                                            while (true) {
                                                                                            Block_17_Outer:
                                                                                                while (true) {
                                                                                                    Block_15: {
                                                                                                        break Block_15;
                                                                                                        iftrue(Label_0373:)(a3 == null);
                                                                                                        break Block_19;
                                                                                                        Label_0183:
                                                                                                        value = null;
                                                                                                        break Label_0186;
                                                                                                    }
                                                                                                    wa$c = (wa$c)iterator2.next();
                                                                                                    iftrue(Label_0427:)(wa$c == null);
                                                                                                    Block_18: {
                                                                                                        while (true) {
                                                                                                            Block_16: {
                                                                                                                break Block_16;
                                                                                                                b4 = b5.b;
                                                                                                                iftrue(Label_0427:)(b4 == null);
                                                                                                                break Block_18;
                                                                                                                Label_0534:
                                                                                                                a4 = null;
                                                                                                                break Label_0536;
                                                                                                            }
                                                                                                            b5 = wa$c.b;
                                                                                                            iftrue(Label_0427:)(b5 == null);
                                                                                                            continue Label_0536_Outer;
                                                                                                        }
                                                                                                        Label_0592:
                                                                                                        a5 = null;
                                                                                                        break Label_0595;
                                                                                                        Label_0427:
                                                                                                        a3 = null;
                                                                                                        continue Block_17_Outer;
                                                                                                        a5 = b6.a;
                                                                                                        break Label_0595;
                                                                                                        b7 = c.b;
                                                                                                        iftrue(Label_0534:)(b7 == null);
                                                                                                        break Block_23;
                                                                                                    }
                                                                                                    a3 = b4.a;
                                                                                                    continue Block_17_Outer;
                                                                                                }
                                                                                                b8 = a6.b;
                                                                                                iftrue(Label_0341:)(b8 == null);
                                                                                                break Block_12;
                                                                                                d = b2.d;
                                                                                                iftrue(Label_0443:)(d == null);
                                                                                                break Block_14;
                                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                b6 = c2.b;
                                                                                                iftrue(Label_0592:)(b6 == null);
                                                                                                continue Block_22_Outer;
                                                                                            }
                                                                                        }
                                                                                        jsonAdapter = (JsonAdapter)redditRemoteSearchGqlDataSource.i.getValue();
                                                                                        ng2.e.e((Object)jsonAdapter, "richTextAdapter");
                                                                                        list.add((Object)GqlPostToLinkDomainModelMapper.map$default(c3, a4, a7, (PostRecommendationFragment$u)null, (FeedAnswerableQuestionsFragment)null, a5, (String)null, (List)null, (Integer)null, jsonAdapter, 236, (Object)null));
                                                                                        continue Label_0373_Outer;
                                                                                        upperCase = value2.toUpperCase(Locale.ROOT);
                                                                                        ng2.e.e((Object)upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                                                                        value = SearchPostSort.valueOf(upperCase);
                                                                                        break Label_0186;
                                                                                        c = d2.c;
                                                                                        iftrue(Label_0534:)(c == null);
                                                                                        continue Block_11_Outer;
                                                                                    }
                                                                                    cg.d.b4(result);
                                                                                    g = a.g;
                                                                                    iftrue(Label_0183:)(g == null);
                                                                                    break Block_8;
                                                                                }
                                                                                b9 = h$a.b((Object)value);
                                                                                b10 = this.b;
                                                                                wa = new wa(h$a.b((Object)n), h$a.b((Object)s2), b9, this.f(z0, a), d0.c1(z0, this.g.c()), h$a.c((Object)this.f.vc()), s);
                                                                                redditRemoteSearchGqlDataSource$searchPosts$1.L$0 = this;
                                                                                redditRemoteSearchGqlDataSource$searchPosts$1.label = 1;
                                                                                b = e$a.b(14, (k)wa, (e)b10, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchPosts$1, (OkHttpClient)null);
                                                                                iftrue(Label_0308:)(b != coroutine_SUSPENDED);
                                                                                return coroutine_SUSPENDED;
                                                                            }
                                                                            list = new ArrayList(m.u4((Iterable)instance, 10));
                                                                            iterator = ((Iterable)instance).iterator();
                                                                            continue Label_0373_Outer;
                                                                        }
                                                                        list2.add(a3);
                                                                        continue Label_0536_Outer;
                                                                        a6 = ((wa$b)b).a;
                                                                        iftrue(Label_0341:)(a6 == null);
                                                                        continue Block_13_Outer;
                                                                    }
                                                                    list2 = new ArrayList<PostFragment>();
                                                                    iterator2 = d.iterator();
                                                                    continue Label_0536_Outer;
                                                                }
                                                                iftrue(Label_0443:)(b2 == null);
                                                                continue Block_9_Outer;
                                                            }
                                                            a7 = postFragment.c.a;
                                                            b11 = postFragment.b;
                                                            iftrue(Label_0592:)(b11 == null);
                                                            break Block_24;
                                                        }
                                                        a4 = b7.a;
                                                        continue Label_0536;
                                                    }
                                                }
                                                b2 = b8.b;
                                                continue Label_0470_Outer;
                                            }
                                        }
                                        value2 = g.getValue();
                                        iftrue(Label_0183:)(value2 == null);
                                        continue Block_21_Outer;
                                    }
                                }
                                postFragment = (PostFragment)iterator.next();
                                c3 = redditRemoteSearchGqlDataSource.c;
                                d2 = postFragment.d;
                                iftrue(Label_0534:)(d2 == null);
                                continue;
                            }
                            c2 = b11.c;
                            iftrue(Label_0592:)(c2 == null);
                            continue Block_21_Outer;
                        }
                    }
                }
            }
        }
    }
    
    public final h7.h f(final z0 z0, final xu1.a a) {
        final h7.h b = h$a.b((Object)"nsfw");
        String s;
        if (this.e.l() && !a.i) {
            s = "1";
        }
        else {
            s = "0";
        }
        final ArrayList t3 = cg.d.t3((Object[])new a1[] { new a1(b, h$a.b((Object)s)) });
        final SortTimeFrame h = a.h;
        if (h != null) {
            t3.add(new a1(h$a.b((Object)"time_range"), h$a.b((Object)h)));
        }
        if (z0.f != null) {
            t3.add(new a1(h$a.b((Object)"subreddit_names"), h$a.b((Object)z0.f)));
        }
        final List j = a.j;
        if (j != null && (j.isEmpty() ^ true)) {
            t3.add(new a1(h$a.b((Object)"post_types"), h$a.b((Object)CollectionsKt___CollectionsKt.a5((Iterable)j, (CharSequence)",", (String)null, (String)null, (l)RedditRemoteSearchGqlDataSource$getFilterInput$1$3$1.INSTANCE, 30))));
        }
        final List k = a.k;
        if (k != null && (k.isEmpty() ^ true)) {
            t3.add(new a1(h$a.b((Object)"post_ids"), h$a.b((Object)CollectionsKt___CollectionsKt.a5((Iterable)k, (CharSequence)",", (String)null, (String)null, (l)null, 62))));
        }
        return h$a.b((Object)t3);
    }
    
    public final Object g(String s, final z0 z0, final xu1.a a, String displayNamePrefixed, final c<? super Result<xu1.e<xu1.c>>> c) {
        RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1 redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2 = null;
        Label_0059: {
            if (c instanceof RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1) {
                final RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1 redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1 = (RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1)c;
                final int label = redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1.label = label + Integer.MIN_VALUE;
                    redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2 = redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1;
                    break Label_0059;
                }
            }
            redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2 = new RedditRemoteSearchGqlDataSource$searchCommunitiesLegacy$1(this, (c)c);
        }
        final Object result = redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2.label;
        final String s2 = null;
        Label_0122: {
            if (label2 == 0) {
                break Label_0122;
            }
            Label_0112: {
                if (label2 != 1) {
                    break Label_0112;
                }
                RedditRemoteSearchGqlDataSource redditRemoteSearchGqlDataSource = (RedditRemoteSearchGqlDataSource)redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2.L$0;
                try {
                    cg.d.b4(result);
                    Object b = result;
                    while (true) {
                        final ta$c ta$c = (ta$c)b;
                        try {
                            final ta$i a2 = ta$c.a;
                            ta$a b3 = null;
                            Label_0231: {
                                if (a2 != null) {
                                    final ta$f b2 = a2.b;
                                    if (b2 != null) {
                                        b3 = b2.b;
                                        break Label_0231;
                                    }
                                }
                                b3 = null;
                            }
                            ng2.e.c((Object)b3);
                            final List c2 = b3.c;
                            final ArrayList<SubredditDetailsFragment> list = new ArrayList<SubredditDetailsFragment>();
                            for (final ta$d ta$d : c2) {
                                SubredditDetailsFragment a3 = null;
                                Label_0310: {
                                    if (ta$d != null) {
                                        final ta$g b4 = ta$d.b;
                                        if (b4 != null) {
                                            final ta$g$a b5 = b4.b;
                                            if (b5 != null) {
                                                a3 = b5.a;
                                                break Label_0310;
                                            }
                                        }
                                    }
                                    a3 = null;
                                }
                                if (a3 != null) {
                                    list.add(a3);
                                }
                            }
                            final ArrayList list2 = new ArrayList<Subreddit>(m.u4((Iterable)list, 10));
                            for (final SubredditDetailsFragment subredditDetailsFragment : list) {
                                final GqlSubredditMapper instance = GqlSubredditMapper.INSTANCE;
                                final JsonAdapter jsonAdapter = (JsonAdapter)redditRemoteSearchGqlDataSource.i.getValue();
                                ng2.e.e((Object)jsonAdapter, "richTextAdapter");
                                list2.add(instance.map(subredditDetailsFragment, jsonAdapter));
                            }
                            final ArrayList list3 = new ArrayList<xu1.c>(m.u4((Iterable)list2, 10));
                            for (final Subreddit subreddit : list2) {
                                final String id = subreddit.getId();
                                displayNamePrefixed = subreddit.getDisplayNamePrefixed();
                                list3.add(new xu1.c(id, subreddit.getCommunityIcon(), displayNamePrefixed, subreddit.getUserIsSubscriber(), subreddit.getSubscribers(), subreddit.getPublicDescription(), subreddit.getOver18(), subreddit.getKindWithId(), subreddit.getDisplayName(), subreddit.getQuarantined(), subreddit.isMyReddit()));
                            }
                            final vi a4 = b3.b.b.a;
                            redditRemoteSearchGqlDataSource.getClass();
                            if (!a4.b) {
                                s = null;
                            }
                            else {
                                s = a4.c;
                            }
                            final ta$e d = b3.d;
                            String rawValue = s2;
                            if (d != null) {
                                final TreatmentProtocol b6 = d.b;
                                rawValue = s2;
                                if (b6 != null) {
                                    rawValue = b6.getRawValue();
                                }
                            }
                            return new Result.Success(new xu1.e(list3, s, rawValue));
                        }
                        catch (final NullPointerException ex) {
                            s = ex.getMessage();
                            if (s == null) {
                                s = "";
                            }
                            return new Result.Error(s, false, null, 6, null);
                        }
                        return coroutine_SUSPENDED;
                        Label_0196: {
                            redditRemoteSearchGqlDataSource = this;
                        }
                        continue;
                    }
                    cg.d.b4(result);
                    final z50.a b7 = this.b;
                    final ta ta = new ta(s, h$a.b((Object)displayNamePrefixed), this.f(z0, a), d0.c1(z0, (String)null));
                    redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2.L$0 = this;
                    redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2.label = 1;
                    b = e$a.b(14, (k)ta, (e)b7, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2, (OkHttpClient)null);
                    iftrue(Label_0196:)(b != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final IOException ex2) {
                    s = ex2.getMessage();
                    if (s == null) {
                        s = "";
                    }
                    return new Result.Error(s, false, null, 6, null);
                }
            }
        }
    }
    
    public final c0<RemoteSearchResult> getSearchSuggestions(final String s, final Boolean b, final Boolean b2, final boolean b3, final String s2, final String s3) {
        b.w(s, "query", s2, "searchCorrelationId", s3, "searchQueryId");
        final c0 w = e$a.a((e)this.b, (k)new bb(s, h$a.b((Object)new d3(h$a.b((Object)s3), h$a.b((Object)s2), h$a.b((Object)((Enum)OriginPageType.HOME).name()), h$a.b((Object)((Enum)SearchStructureType.SEARCH).name()), h$a.b((Object)b2), 1))), (OkHttpClient)null, (Map)null, 14).w((o)new su.d(9));
        ng2.e.e((Object)w, "graphQlClient.execute(\n \u2026\n        ),\n      )\n    }");
        return w;
    }
    
    public final Object h(String s, final z0 z0, final xu1.a a, final String s2, final c<? super Result<xu1.e<xu1.c>>> c) {
        RedditRemoteSearchGqlDataSource$searchCommunitiesNew$1 redditRemoteSearchGqlDataSource$searchCommunitiesNew$2 = null;
        Label_0059: {
            if (c instanceof RedditRemoteSearchGqlDataSource$searchCommunitiesNew$1) {
                final RedditRemoteSearchGqlDataSource$searchCommunitiesNew$1 redditRemoteSearchGqlDataSource$searchCommunitiesNew$1 = (RedditRemoteSearchGqlDataSource$searchCommunitiesNew$1)c;
                final int label = redditRemoteSearchGqlDataSource$searchCommunitiesNew$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRemoteSearchGqlDataSource$searchCommunitiesNew$1.label = label + Integer.MIN_VALUE;
                    redditRemoteSearchGqlDataSource$searchCommunitiesNew$2 = redditRemoteSearchGqlDataSource$searchCommunitiesNew$1;
                    break Label_0059;
                }
            }
            redditRemoteSearchGqlDataSource$searchCommunitiesNew$2 = new RedditRemoteSearchGqlDataSource$searchCommunitiesNew$1(this, (c)c);
        }
        final Object result = redditRemoteSearchGqlDataSource$searchCommunitiesNew$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditRemoteSearchGqlDataSource$searchCommunitiesNew$2.label;
        Label_0119: {
            if (label2 == 0) {
                break Label_0119;
            }
            Label_0109: {
                if (label2 != 1) {
                    break Label_0109;
                }
                RedditRemoteSearchGqlDataSource redditRemoteSearchGqlDataSource = (RedditRemoteSearchGqlDataSource)redditRemoteSearchGqlDataSource$searchCommunitiesNew$2.L$0;
                try {
                    cg.d.b4(result);
                    Object b = result;
                    while (true) {
                        final ra$c ra$c = (ra$c)b;
                        try {
                            final ra$k a2 = ra$c.a;
                            ra$a b3 = null;
                            Label_0230: {
                                if (a2 != null) {
                                    final ra$f b2 = a2.b;
                                    if (b2 != null) {
                                        b3 = b2.b;
                                        break Label_0230;
                                    }
                                }
                                b3 = null;
                            }
                            ng2.e.c((Object)b3);
                            final List c2 = b3.c;
                            final ArrayList<ra$i> list = new ArrayList<ra$i>();
                            for (final ra$d ra$d : c2) {
                                ra$i b4;
                                if (ra$d != null) {
                                    b4 = ra$d.b;
                                }
                                else {
                                    b4 = null;
                                }
                                if (b4 != null) {
                                    list.add(b4);
                                }
                            }
                            final ArrayList list2 = new ArrayList<xu1.c>(m.u4((Iterable)list, 10));
                            for (final ra$i ra$i : list) {
                                redditRemoteSearchGqlDataSource.d.getClass();
                                ng2.e.f((Object)ra$i, "node");
                                final String g = w.g(ra$i.b);
                                final String d = ra$i.d;
                                final boolean j = ra$i.j;
                                final ra$l e = ra$i.e;
                                Object c3;
                                if (e != null) {
                                    c3 = e.c;
                                }
                                else {
                                    c3 = null;
                                }
                                String s3;
                                if (c3 instanceof String) {
                                    s3 = (String)c3;
                                }
                                else {
                                    s3 = null;
                                }
                                if (!((s3 == null || s3.length() == 0) ^ true)) {
                                    s3 = null;
                                }
                                s = s3;
                                if (s3 == null) {
                                    final ra$l e2 = ra$i.e;
                                    Object b6 = null;
                                    Label_0495: {
                                        if (e2 != null) {
                                            final ra$g b5 = e2.b;
                                            if (b5 != null) {
                                                b6 = b5.b;
                                                break Label_0495;
                                            }
                                        }
                                        b6 = null;
                                    }
                                    if (b6 instanceof String) {
                                        s = (String)b6;
                                    }
                                    else {
                                        s = null;
                                    }
                                }
                                final long n = (long)ra$i.g;
                                String f = ra$i.f;
                                if (f == null) {
                                    f = "";
                                }
                                final boolean h = ra$i.h;
                                final String b7 = ra$i.b;
                                final String c4 = ra$i.c;
                                final boolean i = ra$i.i;
                                final ra$h k = ra$i.k;
                                list2.add(new xu1.c(g, s, d, Boolean.valueOf(j), Long.valueOf(n), f, Boolean.valueOf(h), b7, c4, Boolean.valueOf(i), k != null && k.b));
                            }
                            final vi a3 = b3.b.b.a;
                            redditRemoteSearchGqlDataSource.getClass();
                            if (!a3.b) {
                                s = null;
                            }
                            else {
                                s = a3.c;
                            }
                            final ra$e d2 = b3.d;
                            if (d2 != null) {
                                final TreatmentProtocol b8 = d2.b;
                                if (b8 != null) {
                                    final String rawValue = b8.getRawValue();
                                    return new Result.Success(new xu1.e(list2, s, rawValue));
                                }
                            }
                            final String rawValue = null;
                            return new Result.Success(new xu1.e(list2, s, rawValue));
                        }
                        catch (final NullPointerException ex) {
                            s = ex.getMessage();
                            if (s == null) {
                                s = "";
                            }
                            return new Result.Error(s, false, null, 6, null);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        Label_0193: {
                            redditRemoteSearchGqlDataSource = this;
                        }
                        continue;
                    }
                    cg.d.b4(result);
                    final z50.a b9 = this.b;
                    final ra ra = new ra(s, h$a.b((Object)s2), this.f(z0, a), d0.c1(z0, (String)null));
                    redditRemoteSearchGqlDataSource$searchCommunitiesNew$2.L$0 = this;
                    redditRemoteSearchGqlDataSource$searchCommunitiesNew$2.label = 1;
                    b = e$a.b(14, (k)ra, (e)b9, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchCommunitiesNew$2, (OkHttpClient)null);
                    iftrue(Label_0193:)(b != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final IOException ex2) {
                    s = ex2.getMessage();
                    if (s == null) {
                        s = "";
                    }
                    return new Result.Error(s, false, null, 6, null);
                }
            }
        }
    }
}
