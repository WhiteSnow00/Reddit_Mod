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
import v10.v;
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
import rg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import g22.a1;
import com.reddit.queries.pa$e;
import com.reddit.fragment.SearchCommentFragment$g;
import com.reddit.fragment.AuthorInfoFragment$a;
import com.reddit.fragment.AuthorInfoFragment$c;
import com.reddit.fragment.AuthorInfoFragment;
import com.reddit.fragment.PostContentFragment$r$a;
import com.reddit.fragment.PostContentFragment$r;
import com.reddit.fragment.PostFragment$d;
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
import yu1.c$b;
import com.reddit.fragment.SearchCommentFragment$c;
import yu1.c$a;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import com.reddit.queries.pa$d;
import com.reddit.queries.pa$c;
import yu1.d;
import com.reddit.fragment.PostFragment$e$a;
import com.reddit.fragment.PostFragment$e;
import com.reddit.fragment.PostFragment$c;
import com.reddit.queries.wa$d;
import com.reddit.listing.model.sort.SearchSortType;
import com.reddit.fragment.CrosspostContentFragment;
import com.reddit.fragment.PostContentFragment;
import com.reddit.queries.wa$e;
import com.reddit.queries.wa$i;
import com.reddit.fragment.SubredditFragment;
import com.reddit.queries.wa$h;
import com.reddit.queries.wa$f$a;
import com.reddit.queries.wa$f;
import com.reddit.fragment.PostFragment$g$a;
import com.reddit.fragment.PostFragment$g;
import com.reddit.fragment.PostFragment$a;
import com.reddit.queries.wa$b;
import com.reddit.queries.wa$c;
import com.reddit.fragment.FeedAnswerableQuestionsFragment;
import com.reddit.fragment.PostRecommendationFragment$u;
import com.squareup.moshi.JsonAdapter;
import com.reddit.type.SearchPostSort;
import java.util.Locale;
import kotlin.collections.EmptyList;
import com.reddit.queries.wa;
import com.reddit.fragment.PostFragment;
import com.reddit.domain.model.Link;
import com.reddit.type.TreatmentProtocol;
import com.reddit.queries.va$e;
import al0.ti;
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
import com.reddit.queries.va$d;
import java.util.ArrayList;
import com.reddit.queries.va$c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.Result;
import lg2.c;
import oi0.u0;
import kf2.o;
import y30.m;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import mr0.e;
import mr0.e$a;
import com.reddit.queries.za;
import g22.d3;
import com.reddit.events.search.SearchStructureType;
import com.reddit.domain.model.search.OriginPageType;
import h7.h;
import ff2.c0;
import javax.inject.Inject;
import hg2.f;
import xd0.s;
import w50.f0;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import com.squareup.moshi.y;
import h70.b;
import h70.a;

public final class RedditRemoteSearchGqlDataSource implements a, b
{
    public final y a;
    public final x50.a b;
    public final GqlPostToLinkDomainModelMapper c;
    public final f0 d;
    public final s e;
    public final jr0.a f;
    public final av.a g;
    public final va0.y h;
    public final f i;
    
    @Inject
    public RedditRemoteSearchGqlDataSource(final y a, final x50.a b, final GqlPostToLinkDomainModelMapper c, final f0 d, final s e, final jr0.a f, final av.a g, final va0.y h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = kotlin.a.b((rg2.a)new RedditRemoteSearchGqlDataSource$richTextAdapter$2(this));
    }
    
    public final c0 a(final String s, final Boolean b, final String s2, final String s3) {
        al0.b.q(s, "query", s2, "searchCorrelationId", s3, "searchQueryId");
        final c0 w = e$a.a((e)this.b, (k)new za(s, h7.h.a.b(new d3(h7.h.a.b(s3), h7.h.a.b(s2), h7.h.a.b(((Enum)OriginPageType.HOME).name()), h7.h.a.b(((Enum)SearchStructureType.SEARCH).name()), h7.h.a.b(b), 1))), (OkHttpClient)null, (Map)null, 14).w((o)new m(5));
        sg2.e.e((Object)w, "graphQlClient.execute(\n \u2026\n        ),\n      )\n    }");
        return w;
    }
    
    public final Object b(String s, final u0 u0, final yu1.b b, final String s2, final c<? super Result<yu1.f<yu1.e>>> c) {
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
                    yd.b.k0(result);
                    Object b2 = result;
                Label_0156:
                    while (true) {
                        while (true) {
                            final va$c va$c = (va$c)b2;
                            try {
                                final va$i a = va$c.a;
                                va$a b4 = null;
                                Label_0277: {
                                    if (a != null) {
                                        final va$f b3 = a.b;
                                        if (b3 != null) {
                                            b4 = b3.b;
                                            break Label_0277;
                                        }
                                    }
                                    b4 = null;
                                }
                                sg2.e.c((Object)b4);
                                final List c2 = b4.c;
                                final ArrayList<yu1.e> list = new ArrayList<yu1.e>();
                                for (final va$d va$d : c2) {
                                    yu1.e s4 = null;
                                    Label_0365: {
                                        if (va$d != null) {
                                            final va$g b5 = va$d.b;
                                            if (b5 != null) {
                                                final va$g$a b6 = b5.b;
                                                if (b6 != null) {
                                                    final SearchPersonFragment a2 = b6.a;
                                                    if (a2 != null) {
                                                        s4 = ej2.c0.s4(a2);
                                                        break Label_0365;
                                                    }
                                                }
                                            }
                                        }
                                        s4 = null;
                                    }
                                    if (s4 != null) {
                                        list.add(s4);
                                    }
                                }
                                final ti a3 = b4.b.b.a;
                                redditRemoteSearchGqlDataSource.getClass();
                                if (!a3.b) {
                                    s = null;
                                }
                                else {
                                    s = a3.c;
                                }
                                final va$e d = b4.d;
                                String rawValue = s3;
                                if (d != null) {
                                    final TreatmentProtocol b7 = d.b;
                                    rawValue = s3;
                                    if (b7 != null) {
                                        rawValue = b7.getRawValue();
                                    }
                                }
                                return new Result.Success(new yu1.f((ArrayList)list, s, rawValue));
                            }
                            catch (final NullPointerException ex) {
                                s = ex.getMessage();
                                if (s == null) {
                                    s = "";
                                }
                                return new Result.Error(s, false, null, 6, null);
                            }
                            Label_0145: {
                                final Object o2 = new Integer(50);
                            }
                            break Label_0156;
                            Label_0242:
                            redditRemoteSearchGqlDataSource = this;
                            continue;
                        }
                        yd.b.k0(result);
                        iftrue(Label_0145:)(!this.h.Oa());
                        Block_7: {
                            break Block_7;
                            final x50.a b8 = this.b;
                            final Object o2;
                            final va va = new va(h7.h.a.b(s2), this.f(u0, b), h7.h.a.b(o2), ej2.c0.q4(u0, (String)null), s);
                            ((RedditRemoteSearchGqlDataSource$searchPeople$1)o).L$0 = this;
                            ((RedditRemoteSearchGqlDataSource$searchPeople$1)o).label = 1;
                            b2 = e$a.b(14, (k)va, (e)b8, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
                            iftrue(Label_0242:)(b2 != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                        }
                        final Object o2 = null;
                        continue Label_0156;
                    }
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
    
    public final Object c(String s, final u0 u0, final yu1.b b, final String s2, final Integer n, c<? super Result<yu1.f<Link>>> s3) {
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
                        yd.b.k0(result);
                        final Object b2 = result;
                        break Label_0310;
                    }
                    catch (final IOException ex) {
                        s = ex.getMessage();
                        if (s != null) {
                            s3 = s;
                        }
                        return new Result.Error(s3, false, null, 6, null);
                    Label_0536:
                        while (true) {
                        Label_0343:
                            while (true) {
                            Label_0186:
                                while (true) {
                                    Object b2;
                                    ArrayList<PostFragment> list;
                                    List d = null;
                                    Iterator iterator;
                                    Iterator iterator2;
                                    PostFragment$a d2;
                                    PostFragment$g c;
                                    PostFragment$g$a b3;
                                    SearchPostSort value;
                                    h b4;
                                    x50.a b5;
                                    wa wa;
                                    PostFragment a;
                                    Object instance;
                                    wa$f b7;
                                    wa$f$a b6 = null;
                                    wa$h b8 = null;
                                    SubredditFragment a2;
                                    String value2;
                                    String upperCase;
                                    ArrayList list2;
                                    wa$i a3;
                                    wa$e b9;
                                    JsonAdapter jsonAdapter;
                                    GqlPostToLinkDomainModelMapper c2;
                                    PostContentFragment a4;
                                    CrosspostContentFragment a5;
                                    wa$c wa$c;
                                    PostFragment postFragment;
                                    SearchSortType g;
                                    ti a6;
                                    wa$d e;
                                    String rawValue;
                                    TreatmentProtocol b10;
                                    Object o;
                                    PostFragment$c b11;
                                    PostFragment$e c3 = null;
                                    PostFragment$e$a b12;
                                    Label_0373_Outer:Label_0429_Outer:Block_26_Outer:
                                    while (true) {
                                        list = new ArrayList<PostFragment>();
                                        iterator = d.iterator();
                                        Block_13: {
                                            while (true) {
                                            Block_8_Outer:
                                                while (true) {
                                                    while (true) {
                                                        Label_0470_Outer:Block_21_Outer:Label_0595_Outer:
                                                        while (true) {
                                                            break Label_0373;
                                                        Label_0595:
                                                            while (true) {
                                                                while (true) {
                                                                Block_9_Outer:
                                                                    while (true) {
                                                                        Block_16: {
                                                                        Block_11_Outer:
                                                                            while (true) {
                                                                                while (true) {
                                                                                    while (true) {
                                                                                        while (true) {
                                                                                            Block_20: {
                                                                                            Block_12:
                                                                                                while (true) {
                                                                                                    iftrue(Label_0647:)(!iterator2.hasNext());
                                                                                                    break Block_20;
                                                                                                    c = d2.c;
                                                                                                    iftrue(Label_0534:)(c == null);
                                                                                                    b3 = c.b;
                                                                                                    iftrue(Label_0534:)(b3 == null);
                                                                                                    Label_0447: {
                                                                                                        Block_23: {
                                                                                                            break Block_23;
                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                            b4 = h7.h.a.b(value);
                                                                                                            b5 = this.b;
                                                                                                            wa = new wa(h7.h.a.b(n), h7.h.a.b(s2), b4, this.f(u0, b), ej2.c0.q4(u0, this.g.c()), h7.h.a.c(this.f.jc()), s);
                                                                                                            redditRemoteSearchGqlDataSource$searchPosts$1.L$0 = this;
                                                                                                            redditRemoteSearchGqlDataSource$searchPosts$1.label = 1;
                                                                                                            b2 = e$a.b(14, (k)wa, (e)b5, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchPosts$1, (OkHttpClient)null);
                                                                                                            iftrue(Label_0308:)(b2 != coroutine_SUSPENDED);
                                                                                                            return coroutine_SUSPENDED;
                                                                                                            Label_0308: {
                                                                                                                redditRemoteSearchGqlDataSource = this;
                                                                                                            }
                                                                                                            break Label_0310;
                                                                                                            iftrue(Label_0373:)(a == null);
                                                                                                            break Label_0595;
                                                                                                            Label_0443:
                                                                                                            instance = EmptyList.INSTANCE;
                                                                                                            break Label_0447;
                                                                                                            b6 = b7.b;
                                                                                                            iftrue(Label_0427:)(b6 == null);
                                                                                                            break Label_0470_Outer;
                                                                                                            iftrue(Label_0443:)(b8 == null);
                                                                                                            break Block_13;
                                                                                                        }
                                                                                                        a2 = b3.a;
                                                                                                        break Label_0536;
                                                                                                        upperCase = value2.toUpperCase(Locale.ROOT);
                                                                                                        sg2.e.e((Object)upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                                                                                        value = SearchPostSort.valueOf(upperCase);
                                                                                                        continue Label_0186;
                                                                                                    }
                                                                                                    list2 = new ArrayList<Link>(ig2.m.c3((Iterable)instance, 10));
                                                                                                    iterator2 = ((Iterable)instance).iterator();
                                                                                                    continue Block_21_Outer;
                                                                                                    b9 = a3.b;
                                                                                                    iftrue(Label_0341:)(b9 == null);
                                                                                                    break Block_12;
                                                                                                    jsonAdapter = redditRemoteSearchGqlDataSource.i.getValue();
                                                                                                    sg2.e.e((Object)jsonAdapter, "richTextAdapter");
                                                                                                    list2.add(GqlPostToLinkDomainModelMapper.map$default(c2, a2, a4, (PostRecommendationFragment$u)null, (FeedAnswerableQuestionsFragment)null, a5, (String)null, (List)null, (Integer)null, jsonAdapter, 236, (Object)null));
                                                                                                    continue Block_21_Outer;
                                                                                                }
                                                                                                b8 = b9.b;
                                                                                                continue Label_0343;
                                                                                                wa$c = (wa$c)iterator.next();
                                                                                                iftrue(Label_0427:)(wa$c == null);
                                                                                                break Block_16;
                                                                                            }
                                                                                            postFragment = (PostFragment)iterator2.next();
                                                                                            c2 = redditRemoteSearchGqlDataSource.c;
                                                                                            d2 = postFragment.d;
                                                                                            iftrue(Label_0534:)(d2 == null);
                                                                                            continue Label_0429_Outer;
                                                                                        }
                                                                                        a3 = ((wa$b)b2).a;
                                                                                        iftrue(Label_0341:)(a3 == null);
                                                                                        continue Label_0595_Outer;
                                                                                    }
                                                                                    instance = list;
                                                                                    iftrue(Label_0447:)(!iterator.hasNext());
                                                                                    continue Block_8_Outer;
                                                                                }
                                                                                Label_0592: {
                                                                                    a5 = null;
                                                                                }
                                                                                continue Label_0595;
                                                                                value2 = g.getValue();
                                                                                iftrue(Label_0183:)(value2 == null);
                                                                                continue Block_11_Outer;
                                                                            }
                                                                            try {
                                                                                Label_0647: {
                                                                                    sg2.e.c((Object)b8);
                                                                                }
                                                                                a6 = b8.b.b.a;
                                                                                redditRemoteSearchGqlDataSource.getClass();
                                                                                if (!a6.b) {
                                                                                    s = null;
                                                                                }
                                                                                else {
                                                                                    s = a6.c;
                                                                                }
                                                                                e = b8.e;
                                                                                rawValue = s4;
                                                                                if (e != null) {
                                                                                    b10 = e.b;
                                                                                    rawValue = s4;
                                                                                    if (b10 != null) {
                                                                                        rawValue = b10.getRawValue();
                                                                                    }
                                                                                }
                                                                                o = new Result.Success(new yu1.f(list2, s, rawValue));
                                                                            }
                                                                            catch (final NullPointerException ex2) {
                                                                                s = ex2.getMessage();
                                                                                if (s == null) {
                                                                                    s = s3;
                                                                                }
                                                                                o = new Result.Error(s, false, null, 6, null);
                                                                            }
                                                                            return o;
                                                                            c3 = b11.c;
                                                                            iftrue(Label_0592:)(c3 == null);
                                                                            break Block_8_Outer;
                                                                        }
                                                                        b7 = wa$c.b;
                                                                        iftrue(Label_0427:)(b7 == null);
                                                                        continue Block_9_Outer;
                                                                    }
                                                                    a4 = postFragment.c.a;
                                                                    b11 = postFragment.b;
                                                                    iftrue(Label_0592:)(b11 == null);
                                                                    continue Block_26_Outer;
                                                                }
                                                                a5 = b12.a;
                                                                continue Label_0595;
                                                            }
                                                            list.add(a);
                                                            continue Label_0470_Outer;
                                                        }
                                                        a = b6.a;
                                                        continue Block_8_Outer;
                                                        yd.b.k0(result);
                                                        g = b.g;
                                                        iftrue(Label_0183:)(g == null);
                                                        continue Block_26_Outer;
                                                    }
                                                    Label_0427: {
                                                        a = null;
                                                    }
                                                    continue Block_8_Outer;
                                                }
                                                b12 = c3.b;
                                                iftrue(Label_0592:)(b12 == null);
                                                continue;
                                            }
                                        }
                                        d = b8.d;
                                        iftrue(Label_0443:)(d == null);
                                        continue Label_0373_Outer;
                                    }
                                    Label_0183: {
                                        value = null;
                                    }
                                    continue Label_0186;
                                }
                                Label_0341: {
                                    final wa$h b8 = null;
                                }
                                continue Label_0343;
                            }
                            Label_0534: {
                                final SubredditFragment a2 = null;
                            }
                            continue Label_0536;
                        }
                    }
                }
            }
        }
    }
    
    public final Object d(final String s, final u0 u0, final yu1.b b, final String s2, final c<? super Result<yu1.f<d>>> c) {
        if (this.h.G7()) {
            return this.h(s, u0, b, s2, c);
        }
        return this.g(s, u0, b, s2, c);
    }
    
    public final Object e(String s, final u0 u0, final yu1.b b, String b2, final c<? super Result<yu1.f<yu1.c>>> c) {
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
        final String s2 = null;
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
                    yd.b.k0(result);
                    Object b3 = result;
                    while (true) {
                        final pa$c pa$c = (pa$c)b3;
                        try {
                            final pa$i a = pa$c.a;
                            pa$a b5 = null;
                            Label_0239: {
                                if (a != null) {
                                    final pa$f b4 = a.b;
                                    if (b4 != null) {
                                        b5 = b4.b;
                                        break Label_0239;
                                    }
                                }
                                b5 = null;
                            }
                            sg2.e.c((Object)b5);
                            final List c2 = b5.c;
                            final ArrayList<Object> list = new ArrayList<Object>();
                            for (final pa$d pa$d : c2) {
                                Object o = null;
                                Label_1029: {
                                    if (pa$d != null) {
                                        final pa$g b6 = pa$d.b;
                                        if (b6 != null) {
                                            final pa$g$a b7 = b6.b;
                                            if (b7 != null) {
                                                final SearchCommentFragment a2 = b7.a;
                                                if (a2 != null) {
                                                    final GqlPostToLinkDomainModelMapper c3 = redditRemoteSearchGqlDataSource.c;
                                                    final JsonAdapter jsonAdapter = redditRemoteSearchGqlDataSource.i.getValue();
                                                    sg2.e.e((Object)jsonAdapter, "richTextAdapter");
                                                    sg2.e.f((Object)c3, "linkMapper");
                                                    final SearchCommentFragment$d g = a2.g;
                                                    if (g != null) {
                                                        b2 = g.b;
                                                        final Object c4 = g.c;
                                                        String s3;
                                                        if (c4 instanceof String) {
                                                            s3 = (String)c4;
                                                        }
                                                        else {
                                                            s3 = null;
                                                        }
                                                        final c$a c$a = new c$a(b2, s3, GqlDataToDomainModelMapperKt.toMediaDataMap(g.d.a));
                                                        final SearchCommentFragment$b h = a2.h;
                                                        if (h != null) {
                                                            final SearchCommentFragment$b$a b8 = h.b;
                                                            if (b8 != null) {
                                                                final SearchPersonFragment a3 = b8.a;
                                                                if (a3 != null) {
                                                                    final yu1.e s4 = ej2.c0.s4(a3);
                                                                    final SearchCommentFragment$h l = a2.l;
                                                                    if (l != null) {
                                                                        final SearchCommentFragment$a c5 = l.c;
                                                                        Link map$default = null;
                                                                        Label_0617: {
                                                                            if (c5 != null) {
                                                                                final SearchCommentFragment$a$a c6 = c5.c;
                                                                                if (c6 != null) {
                                                                                    final PostFragment a4 = c6.a;
                                                                                    if (a4 != null) {
                                                                                        final PostFragment$a d = a4.d;
                                                                                        SubredditFragment a5 = null;
                                                                                        Label_0531: {
                                                                                            if (d != null) {
                                                                                                final PostFragment$g c7 = d.c;
                                                                                                if (c7 != null) {
                                                                                                    final PostFragment$g$a b9 = c7.b;
                                                                                                    if (b9 != null) {
                                                                                                        a5 = b9.a;
                                                                                                        break Label_0531;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            a5 = null;
                                                                                        }
                                                                                        final PostContentFragment a6 = a4.c.a;
                                                                                        final PostFragment$c b10 = a4.b;
                                                                                        CrosspostContentFragment a7 = null;
                                                                                        Label_0590: {
                                                                                            if (b10 != null) {
                                                                                                final PostFragment$e c8 = b10.c;
                                                                                                if (c8 != null) {
                                                                                                    final PostFragment$e$a b11 = c8.b;
                                                                                                    if (b11 != null) {
                                                                                                        a7 = b11.a;
                                                                                                        break Label_0590;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            a7 = null;
                                                                                        }
                                                                                        map$default = GqlPostToLinkDomainModelMapper.map$default(c3, a5, a6, (PostRecommendationFragment$u)null, (FeedAnswerableQuestionsFragment)null, a7, (String)null, (List)null, (Integer)null, jsonAdapter, 236, (Object)null);
                                                                                        break Label_0617;
                                                                                    }
                                                                                }
                                                                            }
                                                                            map$default = null;
                                                                        }
                                                                        sg2.e.c((Object)map$default);
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
                                                                        final SearchCommentFragment$h i = a2.l;
                                                                        AuthorInfoFragment a10 = null;
                                                                        Label_0791: {
                                                                            if (i != null) {
                                                                                final SearchCommentFragment$a c9 = i.c;
                                                                                if (c9 != null) {
                                                                                    final SearchCommentFragment$a$a c10 = c9.c;
                                                                                    if (c10 != null) {
                                                                                        final PostFragment a8 = c10.a;
                                                                                        if (a8 != null) {
                                                                                            final PostFragment$d c11 = a8.c;
                                                                                            if (c11 != null) {
                                                                                                final PostContentFragment a9 = c11.a;
                                                                                                if (a9 != null) {
                                                                                                    final PostContentFragment$r f = a9.F;
                                                                                                    if (f != null) {
                                                                                                        final PostContentFragment$r$a b12 = f.b;
                                                                                                        if (b12 != null) {
                                                                                                            a10 = b12.a;
                                                                                                            break Label_0791;
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
                                                                        final long c12 = mr0.c.c(a2.c.toString());
                                                                        final Double e = a2.e;
                                                                        int n2;
                                                                        if (e != null) {
                                                                            n2 = (int)(double)e;
                                                                        }
                                                                        else {
                                                                            n2 = 0;
                                                                        }
                                                                        final boolean f2 = a2.f;
                                                                        final boolean k = a2.i;
                                                                        AuthorInfoFragment$c d2;
                                                                        if (a10 != null) {
                                                                            d2 = a10.d;
                                                                        }
                                                                        else {
                                                                            d2 = null;
                                                                        }
                                                                        final boolean b14 = d2 != null;
                                                                        AuthorInfoFragment$a e2;
                                                                        if (a10 != null) {
                                                                            e2 = a10.e;
                                                                        }
                                                                        else {
                                                                            e2 = null;
                                                                        }
                                                                        final c$b c$b = new c$b(map$default, b14, e2 != null);
                                                                        final Object d3 = a2.d;
                                                                        Long value;
                                                                        if (d3 != null) {
                                                                            value = mr0.c.c(d3.toString());
                                                                        }
                                                                        else {
                                                                            value = null;
                                                                        }
                                                                        final SearchCommentFragment$g m = a2.k;
                                                                        String s5;
                                                                        if (m == null || (s5 = m.b) == null) {
                                                                            s5 = map$default.getKindWithId();
                                                                        }
                                                                        o = new yu1.c(b13, s5, c12, value, n2, f2, n, c$a, s4, k, c$b);
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
                            final ti a11 = b5.b.b.a;
                            redditRemoteSearchGqlDataSource.getClass();
                            if (!a11.b) {
                                s = null;
                            }
                            else {
                                s = a11.c;
                            }
                            final pa$e d4 = b5.d;
                            String rawValue = s2;
                            if (d4 != null) {
                                final TreatmentProtocol b15 = d4.b;
                                rawValue = s2;
                                if (b15 != null) {
                                    rawValue = b15.getRawValue();
                                }
                            }
                            return new Result.Success(new yu1.f((ArrayList)list, s, rawValue));
                        }
                        catch (final NullPointerException ex) {
                            s = ex.getMessage();
                            if (s == null) {
                                s = "";
                            }
                            return new Result.Error(s, false, null, 6, null);
                        }
                        Label_0204: {
                            redditRemoteSearchGqlDataSource = this;
                        }
                        continue;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    yd.b.k0(result);
                    final x50.a b16 = this.b;
                    final pa pa = new pa(h7.h.a.b(b2), this.f(u0, b), ej2.c0.q4(u0, (String)null), s);
                    redditRemoteSearchGqlDataSource$searchComments$2.L$0 = this;
                    redditRemoteSearchGqlDataSource$searchComments$2.label = 1;
                    b3 = e$a.b(14, (k)pa, (e)b16, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchComments$2, (OkHttpClient)null);
                    iftrue(Label_0204:)(b3 != coroutine_SUSPENDED);
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
    
    public final h f(final u0 u0, final yu1.b b) {
        final h b2 = h7.h.a.b("nsfw");
        String s;
        if (this.e.p() && !b.i) {
            s = "1";
        }
        else {
            s = "0";
        }
        final ArrayList z1 = lw0.b.z1((Object[])new a1[] { new a1(b2, h7.h.a.b(s)) });
        final SortTimeFrame h = b.h;
        if (h != null) {
            z1.add(new a1(h7.h.a.b("time_range"), h7.h.a.b(h)));
        }
        if (u0.f != null) {
            z1.add(new a1(h7.h.a.b("subreddit_names"), h7.h.a.b(u0.f)));
        }
        final List j = b.j;
        if (j != null && (j.isEmpty() ^ true)) {
            z1.add(new a1(h7.h.a.b("post_types"), h7.h.a.b(CollectionsKt___CollectionsKt.I3((Iterable)j, (CharSequence)",", (String)null, (String)null, (l)RedditRemoteSearchGqlDataSource$getFilterInput$1$3$1.INSTANCE, 30))));
        }
        final List k = b.k;
        if (k != null && (k.isEmpty() ^ true)) {
            z1.add(new a1(h7.h.a.b("post_ids"), h7.h.a.b(CollectionsKt___CollectionsKt.I3((Iterable)k, (CharSequence)",", (String)null, (String)null, (l)null, 62))));
        }
        return h7.h.a.b(z1);
    }
    
    public final Object g(String s, final u0 u0, final yu1.b b, final String s2, final c<? super Result<yu1.f<d>>> c) {
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
        final String s3 = null;
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
                    yd.b.k0(result);
                    Object b2 = result;
                    while (true) {
                        final ta$c ta$c = (ta$c)b2;
                        try {
                            final ta$i a = ta$c.a;
                            ta$a b4 = null;
                            Label_0231: {
                                if (a != null) {
                                    final ta$f b3 = a.b;
                                    if (b3 != null) {
                                        b4 = b3.b;
                                        break Label_0231;
                                    }
                                }
                                b4 = null;
                            }
                            sg2.e.c((Object)b4);
                            final List c2 = b4.c;
                            final ArrayList<SubredditDetailsFragment> list = new ArrayList<SubredditDetailsFragment>();
                            for (final ta$d ta$d : c2) {
                                SubredditDetailsFragment a2 = null;
                                Label_0310: {
                                    if (ta$d != null) {
                                        final ta$g b5 = ta$d.b;
                                        if (b5 != null) {
                                            final ta$g$a b6 = b5.b;
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
                            final ArrayList list2 = new ArrayList<Subreddit>(ig2.m.c3((Iterable)list, 10));
                            for (final SubredditDetailsFragment subredditDetailsFragment : list) {
                                final GqlSubredditMapper instance = GqlSubredditMapper.INSTANCE;
                                final JsonAdapter jsonAdapter = redditRemoteSearchGqlDataSource.i.getValue();
                                sg2.e.e((Object)jsonAdapter, "richTextAdapter");
                                list2.add(instance.map(subredditDetailsFragment, jsonAdapter));
                            }
                            final ArrayList list3 = new ArrayList<d>(ig2.m.c3((Iterable)list2, 10));
                            for (final Subreddit subreddit : list2) {
                                list3.add(new d(subreddit.getId(), subreddit.getCommunityIcon(), subreddit.getDisplayNamePrefixed(), subreddit.getUserIsSubscriber(), subreddit.getSubscribers(), subreddit.getPublicDescription(), subreddit.getOver18(), subreddit.getKindWithId(), subreddit.getDisplayName(), subreddit.getQuarantined(), subreddit.isMyReddit()));
                            }
                            final ti a3 = b4.b.b.a;
                            redditRemoteSearchGqlDataSource.getClass();
                            if (!a3.b) {
                                s = null;
                            }
                            else {
                                s = a3.c;
                            }
                            final ta$e d = b4.d;
                            String rawValue = s3;
                            if (d != null) {
                                final TreatmentProtocol b7 = d.b;
                                rawValue = s3;
                                if (b7 != null) {
                                    rawValue = b7.getRawValue();
                                }
                            }
                            return new Result.Success(new yu1.f(list3, s, rawValue));
                        }
                        catch (final NullPointerException ex) {
                            s = ex.getMessage();
                            if (s == null) {
                                s = "";
                            }
                            return new Result.Error(s, false, null, 6, null);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        yd.b.k0(result);
                        final x50.a b8 = this.b;
                        final ta ta = new ta(s, h7.h.a.b(s2), this.f(u0, b), ej2.c0.q4(u0, (String)null));
                        redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2.L$0 = this;
                        redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2.label = 1;
                        b2 = e$a.b(14, (k)ta, (e)b8, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchCommunitiesLegacy$2, (OkHttpClient)null);
                        iftrue(Label_0196:)(b2 != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                        Label_0196: {
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
    
    public final c0<RemoteSearchResult> getSearchSuggestions(final String s, final Boolean b, final Boolean b2, final boolean b3, final String s2, final String s3) {
        al0.b.q(s, "query", s2, "searchCorrelationId", s3, "searchQueryId");
        final c0 w = e$a.a((e)this.b, (k)new bb(s, h7.h.a.b(new d3(h7.h.a.b(s3), h7.h.a.b(s2), h7.h.a.b(((Enum)OriginPageType.HOME).name()), h7.h.a.b(((Enum)SearchStructureType.SEARCH).name()), h7.h.a.b(b2), 1))), (OkHttpClient)null, (Map)null, 14).w((o)new nw.d(13));
        sg2.e.e((Object)w, "graphQlClient.execute(\n \u2026\n        ),\n      )\n    }");
        return w;
    }
    
    public final Object h(String s, final u0 u0, final yu1.b b, final String s2, final c<? super Result<yu1.f<d>>> c) {
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
        int n = 1;
        Label_0122: {
            if (label2 == 0) {
                break Label_0122;
            }
            Label_0112: {
                if (label2 != 1) {
                    break Label_0112;
                }
                RedditRemoteSearchGqlDataSource redditRemoteSearchGqlDataSource = (RedditRemoteSearchGqlDataSource)redditRemoteSearchGqlDataSource$searchCommunitiesNew$2.L$0;
                try {
                    yd.b.k0(result);
                    Object b2 = result;
                    while (true) {
                        final ra$c ra$c = (ra$c)b2;
                        try {
                            final ra$k a = ra$c.a;
                            ra$a b4 = null;
                            Label_0233: {
                                if (a != null) {
                                    final ra$f b3 = a.b;
                                    if (b3 != null) {
                                        b4 = b3.b;
                                        break Label_0233;
                                    }
                                }
                                b4 = null;
                            }
                            sg2.e.c((Object)b4);
                            final List c2 = b4.c;
                            final ArrayList<ra$i> list = new ArrayList<ra$i>();
                            for (final ra$d ra$d : c2) {
                                ra$i b5;
                                if (ra$d != null) {
                                    b5 = ra$d.b;
                                }
                                else {
                                    b5 = null;
                                }
                                if (b5 != null) {
                                    list.add(b5);
                                }
                            }
                            final ArrayList list2 = new ArrayList<d>(ig2.m.c3((Iterable)list, 10));
                            for (final ra$i ra$i : list) {
                                redditRemoteSearchGqlDataSource.d.getClass();
                                sg2.e.f((Object)ra$i, "node");
                                final String g = v.g(ra$i.b);
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
                                int n2;
                                if (s3 != null && s3.length() != 0) {
                                    n2 = 0;
                                }
                                else {
                                    n2 = n;
                                }
                                if ((n2 ^ n) == 0x0) {
                                    s3 = null;
                                }
                                s = s3;
                                if (s3 == null) {
                                    final ra$l e2 = ra$i.e;
                                    Object b7 = null;
                                    Label_0500: {
                                        if (e2 != null) {
                                            final ra$g b6 = e2.b;
                                            if (b6 != null) {
                                                b7 = b6.b;
                                                break Label_0500;
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
                                final long n3 = (long)ra$i.g;
                                String f = ra$i.f;
                                if (f == null) {
                                    f = "";
                                }
                                final boolean h = ra$i.h;
                                final String b8 = ra$i.b;
                                final String c4 = ra$i.c;
                                final boolean i = ra$i.i;
                                final ra$h k = ra$i.k;
                                list2.add(new d(g, s, d, Boolean.valueOf(j), Long.valueOf(n3), f, Boolean.valueOf(h), b8, c4, Boolean.valueOf(i), k != null && k.b));
                                n = 1;
                            }
                            final ti a2 = b4.b.b.a;
                            redditRemoteSearchGqlDataSource.getClass();
                            if (!a2.b) {
                                s = null;
                            }
                            else {
                                s = a2.c;
                            }
                            final ra$e d2 = b4.d;
                            if (d2 != null) {
                                final TreatmentProtocol b9 = d2.b;
                                if (b9 != null) {
                                    final String rawValue = b9.getRawValue();
                                    return new Result.Success(new yu1.f(list2, s, rawValue));
                                }
                            }
                            final String rawValue = null;
                            return new Result.Success(new yu1.f(list2, s, rawValue));
                        }
                        catch (final NullPointerException ex) {
                            s = ex.getMessage();
                            if (s == null) {
                                s = "";
                            }
                            return new Result.Error(s, false, null, 6, null);
                        }
                        yd.b.k0(result);
                        final x50.a b10 = this.b;
                        final ra ra = new ra(s, h7.h.a.b(s2), this.f(u0, b), ej2.c0.q4(u0, (String)null));
                        redditRemoteSearchGqlDataSource$searchCommunitiesNew$2.L$0 = this;
                        redditRemoteSearchGqlDataSource$searchCommunitiesNew$2.label = 1;
                        b2 = e$a.b(14, (k)ra, (e)b10, (RetryAlgo)null, (Map)null, (c)redditRemoteSearchGqlDataSource$searchCommunitiesNew$2, (OkHttpClient)null);
                        iftrue(Label_0196:)(b2 != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                        Label_0196: {
                            redditRemoteSearchGqlDataSource = this;
                        }
                        continue;
                    }
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
}
