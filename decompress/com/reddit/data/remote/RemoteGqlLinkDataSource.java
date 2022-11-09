// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.domain.model.MediaMetaData;
import com.reddit.mutations.z7$d;
import com.reddit.mutations.z7$c;
import com.reddit.mutations.z7$b;
import com.reddit.mutations.z7;
import o22.q4;
import com.reddit.domain.model.vote.VoteDirection;
import com.reddit.mutations.o7;
import com.reddit.type.HideState;
import com.reddit.mutations.m7$d;
import com.reddit.mutations.m7$b;
import com.reddit.mutations.m7;
import o22.h4;
import com.reddit.type.PostFollowState;
import com.reddit.mutations.t7$d;
import com.reddit.mutations.t7$c;
import com.reddit.mutations.t7$b;
import com.reddit.mutations.t7;
import o22.m4;
import com.reddit.type.PostSaveState;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.mutations.r7;
import o22.k4;
import com.reddit.type.NSFWState;
import com.reddit.queries.xc$d$a;
import com.reddit.queries.xc$d;
import com.reddit.queries.xc$c;
import com.reddit.queries.xc$e;
import com.reddit.queries.xc$b;
import com.reddit.queries.xc;
import com.reddit.queries.u9$e$a;
import com.reddit.queries.u9$e;
import com.reddit.queries.u9$d$a;
import com.reddit.queries.u9$d;
import com.reddit.queries.u9$f;
import com.reddit.queries.u9$g;
import com.reddit.queries.u9$c;
import com.reddit.queries.u9$b;
import com.reddit.queries.u9;
import o22.p2;
import com.reddit.type.VideoFeedEndpoint;
import com.reddit.queries.q9$f$a;
import com.reddit.queries.q9$f;
import com.reddit.queries.q9$e$a;
import com.reddit.queries.q9$e;
import com.reddit.queries.q9$d;
import com.reddit.queries.q9$g;
import com.reddit.queries.q9$c;
import com.reddit.queries.q9$b;
import com.reddit.queries.q9;
import o22.l2;
import com.reddit.type.PostType;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.type.MediaFeedEndpoint;
import com.reddit.domain.model.media.FbpMediaType;
import com.reddit.domain.model.media.VideoContext;
import com.reddit.queries.i4$e$a;
import com.reddit.queries.i4$a;
import com.reddit.queries.i4$h;
import com.reddit.queries.i4$e;
import com.reddit.queries.i4$f;
import com.reddit.queries.i4$c;
import com.reddit.queries.i4;
import xd0.d$b;
import xd0.d$a;
import com.reddit.queries.a9;
import d60.l;
import com.reddit.queries.PopularFeedElementsWithEligibleExperiencesQuery;
import kl0.sh;
import com.reddit.queries.n7$k$a;
import com.reddit.queries.n7$k;
import com.reddit.fragment.CrosspostContentFragment;
import com.reddit.fragment.PostFragment$e$a;
import com.reddit.fragment.PostFragment$e;
import com.reddit.fragment.PostFragment$c;
import com.reddit.fragment.SubredditFragment;
import com.reddit.fragment.PostFragment$g$a;
import com.reddit.fragment.PostFragment$g;
import com.reddit.fragment.PostFragment$a;
import com.reddit.fragment.PostFragment;
import com.reddit.queries.n7$l$a;
import com.reddit.queries.n7$l;
import com.reddit.queries.n7$c;
import com.reddit.queries.n7$j;
import com.reddit.queries.n7$i;
import com.reddit.fragment.FeedAnswerableQuestionsFragment;
import com.reddit.fragment.PostRecommendationFragment$u;
import com.squareup.moshi.JsonAdapter;
import com.reddit.queries.n7$h;
import com.reddit.queries.n7$g;
import com.reddit.queries.n7;
import com.reddit.type.ModQueueItemType;
import com.reddit.type.ModQueueType;
import com.reddit.domain.repository.ModQueueSortingType;
import com.reddit.domain.model.ILink;
import com.reddit.fragment.PostContentFragment;
import java.util.Iterator;
import com.reddit.queries.o0$a;
import com.reddit.queries.o0$b;
import com.reddit.queries.o0$c;
import com.reddit.domain.model.listing.Listing;
import com.reddit.domain.model.Link;
import java.util.ArrayList;
import com.reddit.queries.o0$e;
import com.reddit.queries.o0;
import com.reddit.mutations.p7$b;
import com.reddit.mutations.p7$e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.Result$Error;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.p7$d;
import com.reddit.domain.model.Result$Success;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import com.reddit.mutations.p7$c;
import com.reddit.network.common.RetryAlgo;
import com.reddit.mutations.p7;
import o22.j4;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.Result;
import o22.w0;
import com.reddit.type.PostFeedSort;
import com.reddit.type.PostFeedRange;
import java.util.Map;
import d60.n;
import com.reddit.queries.HomeElementsWithEligibleExperiencesQuery;
import o22.z0;
import com.reddit.type.FeedFeature;
import androidx.appcompat.widget.s0;
import o22.c1;
import com.reddit.type.UxTargetingExperience;
import io.reactivex.plugins.RxJavaPlugins;
import nf2.g0;
import rq.m;
import sf2.o;
import d60.p;
import okhttp3.OkHttpClient;
import h7.k;
import ur0.e;
import ur0.e$a;
import com.reddit.listing.common.ListingType;
import h7.h;
import com.reddit.queries.HomeElementsQuery;
import o22.g5;
import kotlin.collections.EmptyList;
import com.reddit.ads.domain.DisplaySource;
import com.reddit.data.model.mapper.InputVariableToGqlVariableMapperKt;
import h7.h$a;
import kotlin.collections.c;
import nf2.c0;
import o22.x1;
import o22.d0;
import java.util.List;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import javax.inject.Inject;
import pg2.f;
import com.reddit.session.Session;
import ge0.a0;
import db0.i;
import az0.b;
import db0.x;
import db0.t;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import bt0.j;
import e22.d;
import o50.a;
import com.squareup.moshi.y;
import ur0.g;

public final class RemoteGqlLinkDataSource
{
    public final g a;
    public final av.g b;
    public final y c;
    public final o50.a d;
    public final d e;
    public final j f;
    public final gv.a g;
    public final GqlPostToLinkDomainModelMapper h;
    public final t i;
    public final rr0.a j;
    public final x k;
    public final az0.b l;
    public final x01.a m;
    public final i n;
    public final a0 o;
    public final ub0.a p;
    public final Session q;
    public final f r;
    public final f s;
    public final f t;
    
    @Inject
    public RemoteGqlLinkDataSource(final g a, final av.g b, final y c, final o50.a d, final d e, final j f, final gv.a g, final GqlPostToLinkDomainModelMapper h, final t i, final rr0.a j, final x k, final az0.b l, final x01.a m, final i n, final a0 o, final ub0.a p17, final Session q) {
        ah2.f.f((Object)a, "graphQlClient");
        ah2.f.f((Object)b, "adPixelConfig");
        ah2.f.f((Object)c, "moshi");
        ah2.f.f((Object)d, "mockFeedElementOkHttpClientFactory");
        ah2.f.f((Object)e, "firebaseTracingDelegate");
        ah2.f.f((Object)f, "onboardingSettings");
        ah2.f.f((Object)g, "adsFeatures");
        ah2.f.f((Object)h, "gqlPostToLinkDomainModelMapper");
        ah2.f.f((Object)i, "onboardingFeatures");
        ah2.f.f((Object)j, "goldFeatures");
        ah2.f.f((Object)k, "profileFeatures");
        ah2.f.f((Object)l, "fullBleedPlayerFeatures");
        ah2.f.f((Object)m, "modFeatures");
        ah2.f.f((Object)n, "feedsFeatures");
        ah2.f.f((Object)o, "preferenceRepository");
        ah2.f.f((Object)p17, "growthFeatures");
        ah2.f.f((Object)q, "activeSession");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p17;
        this.q = q;
        this.r = kotlin.a.b((zg2.a)new RemoteGqlLinkDataSource$richTextAdapter.RemoteGqlLinkDataSource$richTextAdapter$2(this));
        this.s = kotlin.a.b((zg2.a)new RemoteGqlLinkDataSource$isLoggedOutHomeV0Enabled.RemoteGqlLinkDataSource$isLoggedOutHomeV0Enabled$2(this));
        this.t = kotlin.a.b((zg2.a)new RemoteGqlLinkDataSource$loggedOutHomeV0VariantName.RemoteGqlLinkDataSource$loggedOutHomeV0VariantName$2(this));
    }
    
    public static c0 d(final RemoteGqlLinkDataSource remoteGqlLinkDataSource, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final dv.a a, final ListingViewMode listingViewMode, final String s2, String s3, final List list, List list2, final Integer n, final d0 d0, final x1 x1, boolean b, final int n2) {
        SortType sortType2;
        if ((n2 & 0x1) != 0x0) {
            sortType2 = null;
        }
        else {
            sortType2 = sortType;
        }
        SortTimeFrame sortTimeFrame2;
        if ((n2 & 0x2) != 0x0) {
            sortTimeFrame2 = null;
        }
        else {
            sortTimeFrame2 = sortTimeFrame;
        }
        String s4;
        if ((n2 & 0x4) != 0x0) {
            s4 = null;
        }
        else {
            s4 = s;
        }
        dv.a a2;
        if ((n2 & 0x8) != 0x0) {
            a2 = null;
        }
        else {
            a2 = a;
        }
        ListingViewMode listingViewMode2;
        if ((n2 & 0x10) != 0x0) {
            listingViewMode2 = null;
        }
        else {
            listingViewMode2 = listingViewMode;
        }
        String s5;
        if ((n2 & 0x20) != 0x0) {
            s5 = null;
        }
        else {
            s5 = s2;
        }
        Map n3;
        if ((n2 & 0x40) != 0x0) {
            n3 = c.N1();
        }
        else {
            n3 = null;
        }
        if ((n2 & 0x80) != 0x0) {
            s3 = null;
        }
        List list3;
        if ((n2 & 0x100) != 0x0) {
            list3 = null;
        }
        else {
            list3 = list;
        }
        if ((n2 & 0x200) != 0x0) {
            list2 = null;
        }
        Integer n4;
        if ((n2 & 0x400) != 0x0) {
            n4 = null;
        }
        else {
            n4 = n;
        }
        d0 d2;
        if ((n2 & 0x800) != 0x0) {
            d2 = null;
        }
        else {
            d2 = d0;
        }
        x1 x2;
        if ((n2 & 0x1000) != 0x0) {
            x2 = null;
        }
        else {
            x2 = x1;
        }
        if ((n2 & 0x2000) != 0x0) {
            b = false;
        }
        remoteGqlLinkDataSource.getClass();
        ah2.f.f((Object)n3, "requestHeaders");
        c0 c10;
        if (remoteGqlLinkDataSource.q.isLoggedOut() && (boolean)remoteGqlLinkDataSource.s.getValue()) {
            final g a3 = remoteGqlLinkDataSource.a;
            final h c = h$a.c((Object)s4);
            h h;
            if (n4 != null && n4 != 0) {
                h = h$a.c((Object)n4);
            }
            else {
                h = h$a.a();
            }
            PostFeedRange apolloPostFeedRange;
            if (sortTimeFrame2 != null) {
                apolloPostFeedRange = InputVariableToGqlVariableMapperKt.toApolloPostFeedRange(sortTimeFrame2);
            }
            else {
                apolloPostFeedRange = null;
            }
            final h c2 = h$a.c((Object)apolloPostFeedRange);
            Object apolloAdContextInput$default = null;
            if (listingViewMode2 != null) {
                apolloAdContextInput$default = InputVariableToGqlVariableMapperKt.getApolloAdContextInput$default((DisplaySource)null, listingViewMode2, a2, remoteGqlLinkDataSource.b, 1, (Object)null);
            }
            final h c3 = h$a.c(apolloAdContextInput$default);
            final Boolean false = Boolean.FALSE;
            final h c4 = h$a.c((Object)false);
            final h a4 = h$a.a();
            final h c5 = h$a.c((Object)false);
            final h c6 = h$a.c((Object)false);
            final h c7 = h$a.c((Object)remoteGqlLinkDataSource.t.getValue());
            final h c8 = h$a.c((Object)remoteGqlLinkDataSource.o.G3());
            final h c9 = h$a.c((Object)b);
            final EmptyList instance = EmptyList.INSTANCE;
            final HomeElementsQuery homeElementsQuery = new HomeElementsQuery((h)null, (h)null, (h)null, (h)null, c2, c, h, c3, (h)null, c9, (h)null, c4, a4, c5, (h)null, (h)null, (h)null, c6, c7, c8, (List)instance, new g5(h$a.c((Object)instance)), 115983);
            remoteGqlLinkDataSource.d.a(ListingType.HOME);
            final c0 w = e$a.a((e)a3, (k)homeElementsQuery, (OkHttpClient)null, n3, 8).w((o)new p(remoteGqlLinkDataSource, 0));
            final m m = new m((Object)remoteGqlLinkDataSource, 3);
            w.getClass();
            c10 = RxJavaPlugins.onAssembly((c0)new cg2.h((g0)w, (sf2.g)m));
            ah2.f.e((Object)c10, "graphQlClient.execute(\n \u2026HOME_LINKS_MAPPING)\n    }");
        }
        else if (remoteGqlLinkDataSource.i.Fb()) {
            if (remoteGqlLinkDataSource.i.K5()) {
                c10 = e(remoteGqlLinkDataSource, sortType2, sortTimeFrame2, s4, a2, listingViewMode2, s5, n3, s3, list3, list2, n4, d2, x2, false, ah2.c.X((Object)UxTargetingExperience.REONBOARDING_IN_FEED), remoteGqlLinkDataSource.a(), 8192);
            }
            else {
                final boolean b2 = s4 == null || s4.length() == 0;
                final g a5 = remoteGqlLinkDataSource.a;
                final h c11 = h$a.c((Object)list3);
                final h c12 = h$a.c((Object)s3);
                final h c13 = h$a.c((Object)list2);
                final h c14 = h$a.c((Object)s4);
                h h2;
                if (n4 != null && n4 != 0) {
                    h2 = h$a.c((Object)n4);
                }
                else {
                    h2 = h$a.a();
                }
                PostFeedRange apolloPostFeedRange2;
                if (sortTimeFrame2 != null) {
                    apolloPostFeedRange2 = InputVariableToGqlVariableMapperKt.toApolloPostFeedRange(sortTimeFrame2);
                }
                else {
                    apolloPostFeedRange2 = null;
                }
                final h c15 = h$a.c((Object)apolloPostFeedRange2);
                PostFeedSort apolloPostFeedSort;
                if (sortType2 != null) {
                    apolloPostFeedSort = InputVariableToGqlVariableMapperKt.toApolloPostFeedSort(sortType2);
                }
                else {
                    apolloPostFeedSort = null;
                }
                final h c16 = h$a.c((Object)apolloPostFeedSort);
                o22.a apolloAdContextInput$default2;
                if (listingViewMode2 != null) {
                    apolloAdContextInput$default2 = InputVariableToGqlVariableMapperKt.getApolloAdContextInput$default((DisplaySource)null, listingViewMode2, a2, remoteGqlLinkDataSource.b, 1, (Object)null);
                }
                else {
                    apolloAdContextInput$default2 = null;
                }
                final HomeElementsWithEligibleExperiencesQuery homeElementsWithEligibleExperiencesQuery = new HomeElementsWithEligibleExperiencesQuery(c11, c12, c13, c16, c15, c14, h2, h$a.c((Object)apolloAdContextInput$default2), h$a.c((Object)new c1(h$a.c((Object)s5), 14)), h$a.c((Object)d2), h$a.c((Object)b2), h$a.a(), h$a.c((Object)Boolean.TRUE), h$a.c((Object)x2), s0.h(remoteGqlLinkDataSource.j), h$a.c((Object)new z0(h$a.c((Object)ah2.c.X((Object)FeedFeature.COMMENT_POST_UNITS)), 2)), h$a.c((Object)remoteGqlLinkDataSource.n.t2()), ah2.c.Y((Object[])new UxTargetingExperience[] { UxTargetingExperience.REONBOARDING_IN_FEED, UxTargetingExperience.REONBOARDING_BOTTOM_SHEET }), remoteGqlLinkDataSource.a());
                remoteGqlLinkDataSource.d.a(ListingType.HOME);
                final c0 w2 = e$a.a((e)a5, (k)homeElementsWithEligibleExperiencesQuery, (OkHttpClient)null, n3, 8).w((o)new n(remoteGqlLinkDataSource, 1));
                final d60.o o = new d60.o(remoteGqlLinkDataSource, 1);
                w2.getClass();
                c10 = RxJavaPlugins.onAssembly((c0)new cg2.h((g0)w2, (sf2.g)o));
                ah2.f.e((Object)c10, "graphQlClient.execute(\n \u2026HOME_LINKS_MAPPING)\n    }");
            }
        }
        else {
            c10 = e(remoteGqlLinkDataSource, sortType2, sortTimeFrame2, s4, a2, listingViewMode2, s5, n3, s3, list3, list2, n4, d2, x2, b, null, null, 49152);
        }
        return c10;
    }
    
    public static c0 e(final RemoteGqlLinkDataSource remoteGqlLinkDataSource, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final dv.a a, final ListingViewMode listingViewMode, final String s2, final Map map, final String s3, List list, List list2, Integer n, final d0 d0, final x1 x1, boolean b, final List list3, final g5 g5, final int n2) {
        SortType sortType2;
        if ((n2 & 0x1) != 0x0) {
            sortType2 = null;
        }
        else {
            sortType2 = sortType;
        }
        SortTimeFrame sortTimeFrame2;
        if ((n2 & 0x2) != 0x0) {
            sortTimeFrame2 = null;
        }
        else {
            sortTimeFrame2 = sortTimeFrame;
        }
        String s4;
        if ((n2 & 0x4) != 0x0) {
            s4 = null;
        }
        else {
            s4 = s;
        }
        ListingViewMode listingViewMode2;
        if ((n2 & 0x10) != 0x0) {
            listingViewMode2 = null;
        }
        else {
            listingViewMode2 = listingViewMode;
        }
        Object o;
        if ((n2 & 0x20) != 0x0) {
            o = null;
        }
        else {
            o = s2;
        }
        Map n3;
        if ((n2 & 0x40) != 0x0) {
            n3 = c.N1();
        }
        else {
            n3 = map;
        }
        Object o2;
        if ((n2 & 0x80) != 0x0) {
            o2 = null;
        }
        else {
            o2 = s3;
        }
        if ((n2 & 0x100) != 0x0) {
            list = null;
        }
        if ((n2 & 0x200) != 0x0) {
            list2 = null;
        }
        if ((n2 & 0x400) != 0x0) {
            n = null;
        }
        Object o3;
        if ((n2 & 0x800) != 0x0) {
            o3 = null;
        }
        else {
            o3 = d0;
        }
        Object o4;
        if ((n2 & 0x1000) != 0x0) {
            o4 = null;
        }
        else {
            o4 = x1;
        }
        if ((n2 & 0x2000) != 0x0) {
            b = false;
        }
        Object instance;
        if ((n2 & 0x4000) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        else {
            instance = list3;
        }
        g5 g6;
        if ((n2 & 0x8000) != 0x0) {
            g6 = new g5(h$a.c((Object)EmptyList.INSTANCE));
        }
        else {
            g6 = g5;
        }
        remoteGqlLinkDataSource.getClass();
        ah2.f.f(instance, "experienceInputs");
        ah2.f.f((Object)g6, "advancedConfiguration");
        final boolean b2 = s4 == null || s4.length() == 0;
        final g a2 = remoteGqlLinkDataSource.a;
        final h c = h$a.c((Object)list);
        final h c2 = h$a.c(o2);
        final h c3 = h$a.c((Object)list2);
        final h c4 = h$a.c((Object)s4);
        h h;
        if (n != null && n != 0) {
            h = h$a.c((Object)n);
        }
        else {
            h = h$a.a();
        }
        PostFeedRange apolloPostFeedRange;
        if (sortTimeFrame2 != null) {
            apolloPostFeedRange = InputVariableToGqlVariableMapperKt.toApolloPostFeedRange(sortTimeFrame2);
        }
        else {
            apolloPostFeedRange = null;
        }
        final h c5 = h$a.c((Object)apolloPostFeedRange);
        PostFeedSort apolloPostFeedSort;
        if (sortType2 != null) {
            apolloPostFeedSort = InputVariableToGqlVariableMapperKt.toApolloPostFeedSort(sortType2);
        }
        else {
            apolloPostFeedSort = null;
        }
        final h c6 = h$a.c((Object)apolloPostFeedSort);
        o22.a apolloAdContextInput$default;
        if (listingViewMode2 != null) {
            apolloAdContextInput$default = InputVariableToGqlVariableMapperKt.getApolloAdContextInput$default((DisplaySource)null, listingViewMode2, a, remoteGqlLinkDataSource.b, 1, (Object)null);
        }
        else {
            apolloAdContextInput$default = null;
        }
        final HomeElementsQuery homeElementsQuery = new HomeElementsQuery(c, c2, c3, c6, c5, c4, h, h$a.c((Object)apolloAdContextInput$default), h$a.c((Object)new c1(h$a.c(o), 14)), h$a.c((Object)b), h$a.c(o3), h$a.c((Object)b2), h$a.a(), h$a.c((Object)Boolean.TRUE), h$a.c(o4), s0.h(remoteGqlLinkDataSource.j), h$a.c((Object)new z0(h$a.c((Object)ah2.c.X((Object)FeedFeature.COMMENT_POST_UNITS)), 2)), h$a.c((Object)remoteGqlLinkDataSource.n.t2()), (h)null, (h)null, (List)instance, g6, 786432);
        remoteGqlLinkDataSource.d.a(ListingType.HOME);
        final c0 w = e$a.a((e)a2, (k)homeElementsQuery, (OkHttpClient)null, n3, 8).w((o)new n(remoteGqlLinkDataSource, 0));
        final d60.o o5 = new d60.o(remoteGqlLinkDataSource, 0);
        w.getClass();
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new cg2.h((g0)w, (sf2.g)o5));
        ah2.f.e((Object)onAssembly, "graphQlClient.execute(\n \u2026HOME_LINKS_MAPPING)\n    }");
        return onAssembly;
    }
    
    public static /* synthetic */ c0 i(final RemoteGqlLinkDataSource remoteGqlLinkDataSource, DisplaySource displaySource, SortType sortType, SortTimeFrame sortTimeFrame, String s, dv.a a, ListingViewMode listingViewMode, final String s2, String s3, Map n1, Integer n2, Boolean true, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            displaySource = null;
        }
        if ((n3 & 0x2) != 0x0) {
            sortType = null;
        }
        if ((n3 & 0x4) != 0x0) {
            sortTimeFrame = null;
        }
        if ((n3 & 0x8) != 0x0) {
            s = null;
        }
        if ((n3 & 0x10) != 0x0) {
            a = null;
        }
        if ((n3 & 0x20) != 0x0) {
            listingViewMode = null;
        }
        if ((n3 & 0x80) != 0x0) {
            s3 = null;
        }
        if ((n3 & 0x100) != 0x0) {
            n1 = c.N1();
        }
        if ((n3 & 0x200) != 0x0) {
            n2 = null;
        }
        if ((n3 & 0x400) != 0x0) {
            true = Boolean.TRUE;
        }
        return remoteGqlLinkDataSource.h(displaySource, sortType, sortTimeFrame, s, a, listingViewMode, s2, s3, n1, n2, true);
    }
    
    public final g5 a() {
        h h;
        if (this.f.A2()) {
            h = h$a.c((Object)ah2.c.Y((Object[])new w0[] { new w0(h$a.c((Object)UxTargetingExperience.REONBOARDING_IN_FEED), h$a.c((Object)this.f.i1())), new w0(h$a.c((Object)UxTargetingExperience.REONBOARDING_BOTTOM_SHEET), h$a.c((Object)this.f.C0())) }));
        }
        else {
            h = h$a.c((Object)EmptyList.INSTANCE);
        }
        return new g5(h);
    }
    
    public final Object b(String s, String b, final tg2.c<? super Result<a>> c) {
        Object o = null;
        Label_0056: {
            if (c instanceof RemoteGqlLinkDataSource$edit.RemoteGqlLinkDataSource$edit$1) {
                final RemoteGqlLinkDataSource$edit.RemoteGqlLinkDataSource$edit$1 remoteGqlLinkDataSource$edit$1 = (RemoteGqlLinkDataSource$edit.RemoteGqlLinkDataSource$edit$1)c;
                final int label = remoteGqlLinkDataSource$edit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$edit$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$edit$1;
                    break Label_0056;
                }
            }
            o = new RemoteGqlLinkDataSource$edit.RemoteGqlLinkDataSource$edit$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$edit.RemoteGqlLinkDataSource$edit$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$edit.RemoteGqlLinkDataSource$edit$1)o).label;
        final String s2 = null;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final p7 p3 = new p7(new j4(s, new o22.o(h$a.c((Object)b), (h)null, 2)));
            ((RemoteGqlLinkDataSource$edit.RemoteGqlLinkDataSource$edit$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)p3, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final p7$e a2 = ((p7$c)b2).a;
        Object o2;
        if (a2 != null) {
            if (a2.c) {
                final p7$b b3 = a2.b;
                if (b3 != null) {
                    b = b3.b;
                    ah2.f.c((Object)b3);
                    final String c2 = b3.c;
                    final p7$b b4 = a2.b;
                    ah2.f.c((Object)b4);
                    final Object d = b4.d;
                    s = s2;
                    if (d != null) {
                        s = d.toString();
                    }
                    final p7$b b5 = a2.b;
                    ah2.f.c((Object)b5);
                    o2 = new Result$Success((Object)new a(GqlDataToDomainModelMapperKt.toMediaDataMap(b5.e.a), b, c2, s));
                    return o2;
                }
            }
            final List d2 = a2.d;
            Label_0322: {
                if (d2 != null) {
                    final p7$d p7$d = (p7$d)CollectionsKt___CollectionsKt.s1(d2);
                    if (p7$d != null) {
                        s = p7$d.b;
                        break Label_0322;
                    }
                }
                s = null;
            }
            b = s;
            if (s == null) {
                b = "";
            }
            o2 = new Result$Error(b, false, 2, (DefaultConstructorMarker)null);
        }
        else {
            o2 = new Result$Error("Empty response from server", false, 2, (DefaultConstructorMarker)null);
        }
        return o2;
    }
    
    public final Object c(final int n, final String s, final String s2, final tg2.c c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RemoteGqlLinkDataSource$getCommentPageAdsListing$1) {
                final RemoteGqlLinkDataSource$getCommentPageAdsListing$1 remoteGqlLinkDataSource$getCommentPageAdsListing$1 = (RemoteGqlLinkDataSource$getCommentPageAdsListing$1)c;
                final int label = remoteGqlLinkDataSource$getCommentPageAdsListing$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$getCommentPageAdsListing$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$getCommentPageAdsListing$1;
                    break Label_0061;
                }
            }
            o = new RemoteGqlLinkDataSource$getCommentPageAdsListing$1(this, (tg2.c<? super RemoteGqlLinkDataSource$getCommentPageAdsListing$1>)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$getCommentPageAdsListing$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$getCommentPageAdsListing$1)o).label;
        RemoteGqlLinkDataSource remoteGqlLinkDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlLinkDataSource = (RemoteGqlLinkDataSource)((RemoteGqlLinkDataSource$getCommentPageAdsListing$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            String s3;
            if ((s3 = s2) == null) {
                s3 = "";
            }
            final o0 o2 = new o0(s, s3, n);
            ((RemoteGqlLinkDataSource$getCommentPageAdsListing$1)o).L$0 = this;
            ((RemoteGqlLinkDataSource$getCommentPageAdsListing$1)o).label = 1;
            b = e$a.b(14, (k)o2, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlLinkDataSource = this;
        }
        final o0$b a2 = ((o0$e)b).a;
        if (a2 != null) {
            final o0$a c2 = a2.c;
            if (c2 != null) {
                final List c3 = c2.c;
                if (c3 != null) {
                    final ArrayList<Link> list = new ArrayList<Link>();
                    final Iterator iterator = c3.iterator();
                    while (true) {
                        final Object instance = list;
                        if (!iterator.hasNext()) {
                            return new Listing((List)instance, null, null, null, null, false, null, 126, null);
                        }
                        final o0$c o0$c = (o0$c)iterator.next();
                        final GqlPostToLinkDomainModelMapper h = remoteGqlLinkDataSource.h;
                        final PostContentFragment a3 = o0$c.b.a;
                        Link link;
                        if (a3 != null) {
                            link = h.toLink(a3);
                        }
                        else {
                            link = null;
                        }
                        if (link == null) {
                            continue;
                        }
                        list.add(link);
                    }
                }
            }
        }
        final Object instance = EmptyList.INSTANCE;
        return new Listing((List)instance, null, null, null, null, false, null, 126, null);
    }
    
    public final Object f(final SortType sortType, final SortTimeFrame sortTimeFrame, final Integer n, final List<String> list, final ListingViewMode listingViewMode, final dv.a a, final boolean b, final tg2.c<? super Listing<? extends ILink>> c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RemoteGqlLinkDataSource$getHomeLinksSuspend.RemoteGqlLinkDataSource$getHomeLinksSuspend$1) {
                final RemoteGqlLinkDataSource$getHomeLinksSuspend.RemoteGqlLinkDataSource$getHomeLinksSuspend$1 remoteGqlLinkDataSource$getHomeLinksSuspend$1 = (RemoteGqlLinkDataSource$getHomeLinksSuspend.RemoteGqlLinkDataSource$getHomeLinksSuspend$1)c;
                final int label = remoteGqlLinkDataSource$getHomeLinksSuspend$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$getHomeLinksSuspend$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$getHomeLinksSuspend$1;
                    break Label_0061;
                }
            }
            o = new RemoteGqlLinkDataSource$getHomeLinksSuspend.RemoteGqlLinkDataSource$getHomeLinksSuspend$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$getHomeLinksSuspend.RemoteGqlLinkDataSource$getHomeLinksSuspend$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$getHomeLinksSuspend.RemoteGqlLinkDataSource$getHomeLinksSuspend$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final c0 d = d(this, sortType, sortTimeFrame, null, a, listingViewMode, null, null, list, null, n, null, null, b, 6884);
            ((RemoteGqlLinkDataSource$getHomeLinksSuspend.RemoteGqlLinkDataSource$getHomeLinksSuspend$1)o).label = 1;
            b2 = kotlinx.coroutines.rx2.d.b(d, (tg2.c)o);
            if (b2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(b2, "getHomeLinks(\n      sort\u2026sureEvents,\n    ).await()");
        return b2;
    }
    
    public final Object g(String c, final ModQueueSortingType modQueueSortingType, final String s, final tg2.c<? super Listing<Link>> c2) {
        Object o = null;
        Label_0061: {
            if (c2 instanceof RemoteGqlLinkDataSource$getModQueueItems.RemoteGqlLinkDataSource$getModQueueItems$1) {
                final RemoteGqlLinkDataSource$getModQueueItems.RemoteGqlLinkDataSource$getModQueueItems$1 remoteGqlLinkDataSource$getModQueueItems$1 = (RemoteGqlLinkDataSource$getModQueueItems.RemoteGqlLinkDataSource$getModQueueItems$1)c2;
                final int label = remoteGqlLinkDataSource$getModQueueItems$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$getModQueueItems$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$getModQueueItems$1;
                    break Label_0061;
                }
            }
            o = new RemoteGqlLinkDataSource$getModQueueItems.RemoteGqlLinkDataSource$getModQueueItems$1(this, (tg2.c)c2);
        }
        final Object result = ((RemoteGqlLinkDataSource$getModQueueItems.RemoteGqlLinkDataSource$getModQueueItems$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$getModQueueItems.RemoteGqlLinkDataSource$getModQueueItems$1)o).label;
        final String s2 = null;
        RemoteGqlLinkDataSource remoteGqlLinkDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlLinkDataSource = (RemoteGqlLinkDataSource)((RemoteGqlLinkDataSource$getModQueueItems.RemoteGqlLinkDataSource$getModQueueItems$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            List x;
            if (c != null) {
                x = ah2.c.X((Object)c);
            }
            else {
                x = null;
            }
            final n7 n7 = new n7(h$a.c((Object)x), ModQueueType.MOD, h$a.c((Object)n11.b.a(modQueueSortingType)), h$a.c((Object)ah2.c.X((Object)ModQueueItemType.POST)), h$a.c((Object)s), s0.h(this.j));
            ((RemoteGqlLinkDataSource$getModQueueItems.RemoteGqlLinkDataSource$getModQueueItems$1)o).L$0 = this;
            ((RemoteGqlLinkDataSource$getModQueueItems.RemoteGqlLinkDataSource$getModQueueItems$1)o).label = 1;
            b = e$a.b(14, (k)n7, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlLinkDataSource = this;
        }
        final n7$g n7$g = (n7$g)b;
        final n7$i a2 = n7$g.a;
        Object instance = null;
        Label_0499: {
            if (a2 != null) {
                final List c3 = a2.c;
                if (c3 != null) {
                    final ArrayList<Link> list = new ArrayList<Link>();
                    final Iterator iterator = c3.iterator();
                    while (true) {
                        instance = list;
                        if (!iterator.hasNext()) {
                            break Label_0499;
                        }
                        final n7$h n7$h = (n7$h)iterator.next();
                        Link map$default = null;
                        Label_0481: {
                            if (n7$h != null) {
                                final n7$j b2 = n7$h.b;
                                if (b2 != null) {
                                    final n7$c c4 = b2.c;
                                    if (c4 != null) {
                                        final n7$l c5 = c4.c;
                                        if (c5 != null) {
                                            final n7$l$a b3 = c5.b;
                                            if (b3 != null) {
                                                final PostFragment a3 = b3.a;
                                                if (a3 != null) {
                                                    final GqlPostToLinkDomainModelMapper h = remoteGqlLinkDataSource.h;
                                                    final PostFragment$a d = a3.d;
                                                    SubredditFragment a4 = null;
                                                    Label_0387: {
                                                        if (d != null) {
                                                            final PostFragment$g c6 = d.c;
                                                            if (c6 != null) {
                                                                final PostFragment$g$a b4 = c6.b;
                                                                if (b4 != null) {
                                                                    a4 = b4.a;
                                                                    break Label_0387;
                                                                }
                                                            }
                                                        }
                                                        a4 = null;
                                                    }
                                                    final PostContentFragment a5 = a3.c.a;
                                                    final PostFragment$c b5 = a3.b;
                                                    CrosspostContentFragment a6 = null;
                                                    Label_0433: {
                                                        if (b5 != null) {
                                                            final PostFragment$e c7 = b5.c;
                                                            if (c7 != null) {
                                                                final PostFragment$e$a b6 = c7.b;
                                                                if (b6 != null) {
                                                                    a6 = b6.a;
                                                                    break Label_0433;
                                                                }
                                                            }
                                                        }
                                                        a6 = null;
                                                    }
                                                    final JsonAdapter jsonAdapter = (JsonAdapter)remoteGqlLinkDataSource.r.getValue();
                                                    ah2.f.e((Object)jsonAdapter, "richTextAdapter");
                                                    map$default = GqlPostToLinkDomainModelMapper.map$default(h, a4, a5, (PostRecommendationFragment$u)null, (FeedAnswerableQuestionsFragment)null, a6, (String)null, (List)null, (Integer)null, jsonAdapter, 224, (Object)null);
                                                    break Label_0481;
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
            instance = EmptyList.INSTANCE;
        }
        final n7$i a7 = n7$g.a;
        c = s2;
        if (a7 != null) {
            final n7$k b7 = a7.b;
            c = s2;
            if (b7 != null) {
                final n7$k$a b8 = b7.b;
                c = s2;
                if (b8 != null) {
                    sh a8 = b8.a;
                    c = s2;
                    if (a8 != null) {
                        if (!a8.b) {
                            a8 = null;
                        }
                        c = s2;
                        if (a8 != null) {
                            c = a8.c;
                        }
                    }
                }
            }
        }
        return new Listing((List)instance, c, null, null, null, false, null, 124, null);
    }
    
    public final c0<Listing<ILink>> h(final DisplaySource displaySource, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final dv.a a, final ListingViewMode listingViewMode, final String s2, final String s3, final Map<String, String> map, final Integer n, final Boolean b) {
        String s4 = s2;
        ah2.f.f((Object)s4, "geoFilter");
        ah2.f.f((Object)map, "requestHeaders");
        c0 c0;
        if (this.i.Fb()) {
            if (this.i.K5()) {
                c0 = this.j(displaySource, sortType, sortTimeFrame, s, a, listingViewMode, s2, s3, map, n, b, ah2.c.X((Object)UxTargetingExperience.REONBOARDING_IN_FEED), this.a());
            }
            else {
                final g a2 = this.a;
                final h c2 = h$a.c((Object)s);
                h h;
                if (n != null && n != 0) {
                    h = h$a.c((Object)n);
                }
                else {
                    h = h$a.a();
                }
                PostFeedRange apolloPostFeedRange;
                if (sortTimeFrame != null) {
                    apolloPostFeedRange = InputVariableToGqlVariableMapperKt.toApolloPostFeedRange(sortTimeFrame);
                }
                else {
                    apolloPostFeedRange = null;
                }
                final h c3 = h$a.c((Object)apolloPostFeedRange);
                PostFeedSort apolloPostFeedSort;
                if (sortType != null) {
                    apolloPostFeedSort = InputVariableToGqlVariableMapperKt.toApolloPostFeedSort(sortType);
                }
                else {
                    apolloPostFeedSort = null;
                }
                final h c4 = h$a.c((Object)apolloPostFeedSort);
                o22.a apolloAdContextInput;
                if (listingViewMode != null) {
                    apolloAdContextInput = InputVariableToGqlVariableMapperKt.getApolloAdContextInput(displaySource, listingViewMode, a, this.b);
                }
                else {
                    apolloAdContextInput = null;
                }
                final h c5 = h$a.c((Object)apolloAdContextInput);
                final h c6 = h$a.c((Object)new c1(h$a.c((Object)s3), 14));
                if (s2.length() <= 0) {
                    s4 = null;
                }
                final PopularFeedElementsWithEligibleExperiencesQuery popularFeedElementsWithEligibleExperiencesQuery = new PopularFeedElementsWithEligibleExperiencesQuery(c4, c3, c2, h, c5, h$a.c((Object)s4), c6, h$a.a(), h$a.c((Object)b), h$a.c((Object)Boolean.TRUE), s0.h(this.j), ah2.c.Y((Object[])new UxTargetingExperience[] { UxTargetingExperience.REONBOARDING_IN_FEED, UxTargetingExperience.REONBOARDING_BOTTOM_SHEET }), this.a());
                this.d.a(ListingType.POPULAR);
                final c0 w = e$a.a((e)a2, (k)popularFeedElementsWithEligibleExperiencesQuery, (OkHttpClient)null, (Map)map, 8).w((o)new l(this, 1));
                final d60.m m = new d60.m(this, 1);
                w.getClass();
                c0 = RxJavaPlugins.onAssembly((c0)new cg2.h((g0)w, (sf2.g)m));
                ah2.f.e((Object)c0, "graphQlClient.execute(\n \u2026ULAR_LINKS_MAPPING)\n    }");
            }
        }
        else {
            final EmptyList instance = EmptyList.INSTANCE;
            c0 = this.j(displaySource, sortType, sortTimeFrame, s, a, listingViewMode, s2, s3, map, n, b, (List<? extends UxTargetingExperience>)instance, new g5(h$a.c((Object)instance)));
        }
        return (c0<Listing<ILink>>)c0;
    }
    
    public final c0<Listing<ILink>> j(final DisplaySource displaySource, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final dv.a a, final ListingViewMode listingViewMode, final String s2, final String s3, final Map<String, String> map, final Integer n, final Boolean b, final List<? extends UxTargetingExperience> list, final g5 g5) {
        final g a2 = this.a;
        final h c = h$a.c((Object)s);
        h h;
        if (n != null && n != 0) {
            h = h$a.c((Object)n);
        }
        else {
            h = h$a.a();
        }
        PostFeedRange apolloPostFeedRange;
        if (sortTimeFrame != null) {
            apolloPostFeedRange = InputVariableToGqlVariableMapperKt.toApolloPostFeedRange(sortTimeFrame);
        }
        else {
            apolloPostFeedRange = null;
        }
        final h c2 = h$a.c((Object)apolloPostFeedRange);
        PostFeedSort apolloPostFeedSort;
        if (sortType != null) {
            apolloPostFeedSort = InputVariableToGqlVariableMapperKt.toApolloPostFeedSort(sortType);
        }
        else {
            apolloPostFeedSort = null;
        }
        final h c3 = h$a.c((Object)apolloPostFeedSort);
        o22.a apolloAdContextInput;
        if (listingViewMode != null) {
            apolloAdContextInput = InputVariableToGqlVariableMapperKt.getApolloAdContextInput(displaySource, listingViewMode, a, this.b);
        }
        else {
            apolloAdContextInput = null;
        }
        final h c4 = h$a.c((Object)apolloAdContextInput);
        final h c5 = h$a.c((Object)new c1(h$a.c((Object)s3), 14));
        final int length = s2.length();
        boolean b2 = false;
        if (length > 0) {
            b2 = true;
        }
        String s4;
        if (b2) {
            s4 = s2;
        }
        else {
            s4 = null;
        }
        final a9 a3 = new a9(c3, c2, c, h, c4, h$a.c((Object)s4), c5, h$a.a(), h$a.c((Object)b), h$a.c((Object)Boolean.TRUE), s0.h(this.j), (List)list, g5);
        this.d.a(ListingType.POPULAR);
        final c0 w = e$a.a((e)a2, (k)a3, (OkHttpClient)null, (Map)map, 8).w((o)new l(this, 0));
        final d60.m m = new d60.m(this, 0);
        w.getClass();
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new cg2.h((g0)w, (sf2.g)m));
        ah2.f.e((Object)onAssembly, "graphQlClient.execute(\n \u2026ULAR_LINKS_MAPPING)\n    }");
        return (c0<Listing<ILink>>)onAssembly;
    }
    
    public final Object k(final SortType sortType, final SortTimeFrame sortTimeFrame, final Integer n, final String s, final ListingViewMode listingViewMode, final tg2.c<? super Listing<? extends ILink>> c) {
        RemoteGqlLinkDataSource$getPopularLinksSuspend.RemoteGqlLinkDataSource$getPopularLinksSuspend$1 remoteGqlLinkDataSource$getPopularLinksSuspend$2 = null;
        Label_0061: {
            if (c instanceof RemoteGqlLinkDataSource$getPopularLinksSuspend.RemoteGqlLinkDataSource$getPopularLinksSuspend$1) {
                final RemoteGqlLinkDataSource$getPopularLinksSuspend.RemoteGqlLinkDataSource$getPopularLinksSuspend$1 remoteGqlLinkDataSource$getPopularLinksSuspend$1 = (RemoteGqlLinkDataSource$getPopularLinksSuspend.RemoteGqlLinkDataSource$getPopularLinksSuspend$1)c;
                final int label = remoteGqlLinkDataSource$getPopularLinksSuspend$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$getPopularLinksSuspend$1.label = label + Integer.MIN_VALUE;
                    remoteGqlLinkDataSource$getPopularLinksSuspend$2 = remoteGqlLinkDataSource$getPopularLinksSuspend$1;
                    break Label_0061;
                }
            }
            remoteGqlLinkDataSource$getPopularLinksSuspend$2 = new RemoteGqlLinkDataSource$getPopularLinksSuspend.RemoteGqlLinkDataSource$getPopularLinksSuspend$1(this, (tg2.c)c);
        }
        final Object result = remoteGqlLinkDataSource$getPopularLinksSuspend$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteGqlLinkDataSource$getPopularLinksSuspend$2.label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final c0 i = i(this, null, sortType, sortTimeFrame, null, null, listingViewMode, s, null, null, n, this.p.u2(), 409);
            remoteGqlLinkDataSource$getPopularLinksSuspend$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(i, (tg2.c)remoteGqlLinkDataSource$getPopularLinksSuspend$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(b, "getPopularLinks(\n      s\u2026idRelaunch,\n    ).await()");
        return b;
    }
    
    public final Object l(final String s, final xd0.d d, final boolean b, final Map<String, String> map, final tg2.c<? super Listing<Link>> c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RemoteGqlLinkDataSource$getPredictionsTournamentPosts.RemoteGqlLinkDataSource$getPredictionsTournamentPosts$1) {
                final RemoteGqlLinkDataSource$getPredictionsTournamentPosts.RemoteGqlLinkDataSource$getPredictionsTournamentPosts$1 remoteGqlLinkDataSource$getPredictionsTournamentPosts$1 = (RemoteGqlLinkDataSource$getPredictionsTournamentPosts.RemoteGqlLinkDataSource$getPredictionsTournamentPosts$1)c;
                final int label = remoteGqlLinkDataSource$getPredictionsTournamentPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$getPredictionsTournamentPosts$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$getPredictionsTournamentPosts$1;
                    break Label_0061;
                }
            }
            o = new RemoteGqlLinkDataSource$getPredictionsTournamentPosts.RemoteGqlLinkDataSource$getPredictionsTournamentPosts$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$getPredictionsTournamentPosts.RemoteGqlLinkDataSource$getPredictionsTournamentPosts$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$getPredictionsTournamentPosts.RemoteGqlLinkDataSource$getPredictionsTournamentPosts$1)o).label;
        final List list = null;
        RemoteGqlLinkDataSource remoteGqlLinkDataSource;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlLinkDataSource = (RemoteGqlLinkDataSource)((RemoteGqlLinkDataSource$getPredictionsTournamentPosts.RemoteGqlLinkDataSource$getPredictionsTournamentPosts$1)o).L$0;
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            d$a d$a;
            if (d instanceof d$a) {
                d$a = (d$a)d;
            }
            else {
                d$a = null;
            }
            String a;
            if (d$a != null) {
                a = d$a.a;
            }
            else {
                a = null;
            }
            final g a2 = this.a;
            final i4 i4 = new i4(s, d instanceof d$b, h$a.b((Object)a), true, b, (h)null, s0.h(this.j), 864);
            ((RemoteGqlLinkDataSource$getPredictionsTournamentPosts.RemoteGqlLinkDataSource$getPredictionsTournamentPosts$1)o).L$0 = this;
            ((RemoteGqlLinkDataSource$getPredictionsTournamentPosts.RemoteGqlLinkDataSource$getPredictionsTournamentPosts$1)o).label = 1;
            b2 = e$a.b(10, (k)i4, (e)a2, (RetryAlgo)null, (Map)map, (tg2.c)o, (OkHttpClient)null);
            if (b2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlLinkDataSource = this;
        }
        final i4$h a3 = ((i4$c)b2).a;
        if (a3 != null) {
            final i4$a b3 = a3.b;
            if (b3 != null) {
                final List c2 = b3.c;
                if (c2 != null) {
                    final i4$f i4$f = (i4$f)CollectionsKt___CollectionsKt.s1(c2);
                    if (i4$f != null) {
                        final List d2 = i4$f.d;
                        Object instance = list;
                        if (d2 != null) {
                            final ArrayList list2 = new ArrayList<Link>();
                            for (final i4$e i4$e : d2) {
                                final GqlPostToLinkDomainModelMapper h = remoteGqlLinkDataSource.h;
                                Link link$default = null;
                                Label_0391: {
                                    if (i4$e != null) {
                                        final i4$e$a b4 = i4$e.b;
                                        if (b4 != null) {
                                            final PostFragment a4 = b4.a;
                                            if (a4 != null) {
                                                link$default = GqlPostToLinkDomainModelMapper.toLink$default(h, a4, (FeedAnswerableQuestionsFragment)null, (String)null, (List)null, (Integer)null, 15, (Object)null);
                                                break Label_0391;
                                            }
                                        }
                                    }
                                    link$default = null;
                                }
                                if (link$default != null) {
                                    list2.add(link$default);
                                }
                            }
                            instance = list2;
                        }
                        if (instance != null) {
                            return new Listing((List)instance, null, null, null, null, false, null, 126, null);
                        }
                    }
                }
            }
        }
        Object instance = EmptyList.INSTANCE;
        return new Listing((List)instance, null, null, null, null, false, null, 126, null);
    }
    
    public final Object m(String s, final VideoContext videoContext, final String s2, final FbpMediaType fbpMediaType, final tg2.c<? super Listing<Link>> c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RemoteGqlLinkDataSource$getRecommendedMedia.RemoteGqlLinkDataSource$getRecommendedMedia$1) {
                final RemoteGqlLinkDataSource$getRecommendedMedia.RemoteGqlLinkDataSource$getRecommendedMedia$1 remoteGqlLinkDataSource$getRecommendedMedia$1 = (RemoteGqlLinkDataSource$getRecommendedMedia.RemoteGqlLinkDataSource$getRecommendedMedia$1)c;
                final int label = remoteGqlLinkDataSource$getRecommendedMedia$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$getRecommendedMedia$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$getRecommendedMedia$1;
                    break Label_0061;
                }
            }
            o = new RemoteGqlLinkDataSource$getRecommendedMedia.RemoteGqlLinkDataSource$getRecommendedMedia$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$getRecommendedMedia.RemoteGqlLinkDataSource$getRecommendedMedia$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$getRecommendedMedia.RemoteGqlLinkDataSource$getRecommendedMedia$1)o).label;
        final sh sh = null;
        RemoteGqlLinkDataSource remoteGqlLinkDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlLinkDataSource = (RemoteGqlLinkDataSource)((RemoteGqlLinkDataSource$getRecommendedMedia.RemoteGqlLinkDataSource$getRecommendedMedia$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final h c2 = h$a.c((Object)s);
            List seedSubredditIds;
            if (videoContext != null) {
                seedSubredditIds = videoContext.getSeedSubredditIds();
            }
            else {
                seedSubredditIds = null;
            }
            final h c3 = h$a.c((Object)seedSubredditIds);
            MediaFeedEndpoint mediaFeedEndpoint = null;
            Label_0252: {
                if (videoContext != null) {
                    final ListingType listingType = videoContext.getListingType();
                    if (listingType != null) {
                        final int n = RemoteGqlLinkDataSource.b.b[((Enum)listingType).ordinal()];
                        if (n == 1) {
                            mediaFeedEndpoint = MediaFeedEndpoint.HOME;
                            break Label_0252;
                        }
                        if (n == 2) {
                            mediaFeedEndpoint = MediaFeedEndpoint.COMMUNITY;
                            break Label_0252;
                        }
                        if (n != 3) {
                            mediaFeedEndpoint = MediaFeedEndpoint.POPULAR;
                            break Label_0252;
                        }
                        if (this.l.Vc()) {
                            mediaFeedEndpoint = MediaFeedEndpoint.DISCOVER;
                            break Label_0252;
                        }
                        mediaFeedEndpoint = MediaFeedEndpoint.POPULAR;
                        break Label_0252;
                    }
                }
                mediaFeedEndpoint = null;
            }
            final h c4 = h$a.c((Object)mediaFeedEndpoint);
            final int n2 = RemoteGqlLinkDataSource.b.c[((Enum)fbpMediaType).ordinal()];
            PostType postType;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    postType = PostType.GALLERY;
                }
                else {
                    postType = PostType.IMAGE;
                }
            }
            else {
                postType = PostType.VIDEO;
            }
            final h c5 = h$a.c((Object)postType);
            if (videoContext != null) {
                s = videoContext.getLinkKindWithId();
            }
            else {
                s = null;
            }
            final h c6 = h$a.c((Object)s);
            if (videoContext != null) {
                s = videoContext.getNavigationSessionId();
            }
            else {
                s = null;
            }
            final h c7 = h$a.c((Object)s);
            List onboardingCategories;
            if (videoContext != null) {
                onboardingCategories = videoContext.getOnboardingCategories();
            }
            else {
                onboardingCategories = null;
            }
            final q9 q9 = new q9(h$a.c((Object)new l2(c3, c4, c6, c5, c7, h$a.c((Object)onboardingCategories))), c2, a.f(10), h$a.c((Object)new c1(h$a.c((Object)s2), 14)), 240);
            ((RemoteGqlLinkDataSource$getRecommendedMedia.RemoteGqlLinkDataSource$getRecommendedMedia$1)o).L$0 = this;
            ((RemoteGqlLinkDataSource$getRecommendedMedia.RemoteGqlLinkDataSource$getRecommendedMedia$1)o).label = 1;
            b = e$a.b(14, (k)q9, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlLinkDataSource = this;
        }
        final q9$b q9$b = (q9$b)b;
        Object o2 = null;
        Label_0878: {
            if (remoteGqlLinkDataSource.g.w6()) {
                final q9$g a2 = q9$b.a;
                if (a2 != null) {
                    final q9$d b2 = a2.b;
                    if (b2 != null) {
                        final List d = b2.d;
                        if (d != null) {
                            final ArrayList<Link> list = new ArrayList<Link>();
                            final Iterator iterator = d.iterator();
                            while (true) {
                                o2 = list;
                                if (!iterator.hasNext()) {
                                    break Label_0878;
                                }
                                final q9$c q9$c = (q9$c)iterator.next();
                                final GqlPostToLinkDomainModelMapper h = remoteGqlLinkDataSource.h;
                                Link link$default = null;
                                Label_0619: {
                                    if (q9$c != null) {
                                        final q9$e b3 = q9$c.b;
                                        if (b3 != null) {
                                            final q9$e$a b4 = b3.b;
                                            if (b4 != null) {
                                                final PostFragment a3 = b4.a;
                                                if (a3 != null) {
                                                    link$default = GqlPostToLinkDomainModelMapper.toLink$default(h, a3, (FeedAnswerableQuestionsFragment)null, (String)null, (List)null, (Integer)null, 15, (Object)null);
                                                    break Label_0619;
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
                o2 = EmptyList.INSTANCE;
            }
            else {
                final q9$g a4 = q9$b.a;
                if (a4 != null) {
                    final q9$d b5 = a4.b;
                    if (b5 != null) {
                        final List d2 = b5.d;
                        if (d2 != null) {
                            final ArrayList<Link> list2 = new ArrayList<Link>();
                            for (final q9$c q9$c2 : d2) {
                                final GqlPostToLinkDomainModelMapper h2 = remoteGqlLinkDataSource.h;
                                Link link$default2 = null;
                                Label_0770: {
                                    if (q9$c2 != null) {
                                        final q9$e b6 = q9$c2.b;
                                        if (b6 != null) {
                                            final q9$e$a b7 = b6.b;
                                            if (b7 != null) {
                                                final PostFragment a5 = b7.a;
                                                if (a5 != null) {
                                                    link$default2 = GqlPostToLinkDomainModelMapper.toLink$default(h2, a5, (FeedAnswerableQuestionsFragment)null, (String)null, (List)null, (Integer)null, 15, (Object)null);
                                                    break Label_0770;
                                                }
                                            }
                                        }
                                    }
                                    link$default2 = null;
                                }
                                if (link$default2 != null) {
                                    list2.add(link$default2);
                                }
                            }
                            o2 = new ArrayList<Link>();
                            for (final Link next : list2) {
                                final Link link = next;
                                if (link.isVideo() && !link.getPromoted() && !link.getHidden() && !link.getRemoved()) {
                                    ((ArrayList<Link>)o2).add(next);
                                }
                            }
                            break Label_0878;
                        }
                    }
                }
                o2 = EmptyList.INSTANCE;
            }
        }
        final q9$g a6 = q9$b.a;
        sh a7 = sh;
        if (a6 != null) {
            final q9$d b8 = a6.b;
            a7 = sh;
            if (b8 != null) {
                final q9$f b9 = b8.b;
                a7 = sh;
                if (b9 != null) {
                    final q9$f$a b10 = b9.b;
                    a7 = sh;
                    if (b10 != null) {
                        a7 = b10.a;
                    }
                }
            }
        }
        return new Listing((List)o2, GqlDataToDomainModelMapperKt.getAfter(a7), null, null, null, false, null, 124, null);
    }
    
    public final Object n(String s, final VideoContext videoContext, final String s2, final dv.a a, final tg2.c<? super Listing<Link>> c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RemoteGqlLinkDataSource$getRecommendedVideos.RemoteGqlLinkDataSource$getRecommendedVideos$1) {
                final RemoteGqlLinkDataSource$getRecommendedVideos.RemoteGqlLinkDataSource$getRecommendedVideos$1 remoteGqlLinkDataSource$getRecommendedVideos$1 = (RemoteGqlLinkDataSource$getRecommendedVideos.RemoteGqlLinkDataSource$getRecommendedVideos$1)c;
                final int label = remoteGqlLinkDataSource$getRecommendedVideos$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$getRecommendedVideos$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$getRecommendedVideos$1;
                    break Label_0061;
                }
            }
            o = new RemoteGqlLinkDataSource$getRecommendedVideos.RemoteGqlLinkDataSource$getRecommendedVideos$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$getRecommendedVideos.RemoteGqlLinkDataSource$getRecommendedVideos$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$getRecommendedVideos.RemoteGqlLinkDataSource$getRecommendedVideos$1)o).label;
        final sh sh = null;
        RemoteGqlLinkDataSource remoteGqlLinkDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlLinkDataSource = (RemoteGqlLinkDataSource)((RemoteGqlLinkDataSource$getRecommendedVideos.RemoteGqlLinkDataSource$getRecommendedVideos$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a2 = this.a;
            final h c2 = h$a.c((Object)s);
            List seedSubredditIds;
            if (videoContext != null) {
                seedSubredditIds = videoContext.getSeedSubredditIds();
            }
            else {
                seedSubredditIds = null;
            }
            final h c3 = h$a.c((Object)seedSubredditIds);
            VideoFeedEndpoint videoFeedEndpoint = null;
            Label_0233: {
                if (videoContext != null) {
                    final ListingType listingType = videoContext.getListingType();
                    if (listingType != null) {
                        final int n = RemoteGqlLinkDataSource.b.b[((Enum)listingType).ordinal()];
                        if (n == 1) {
                            videoFeedEndpoint = VideoFeedEndpoint.HOME;
                            break Label_0233;
                        }
                        if (n == 2) {
                            videoFeedEndpoint = VideoFeedEndpoint.COMMUNITY;
                            break Label_0233;
                        }
                        if (n != 3) {
                            videoFeedEndpoint = VideoFeedEndpoint.POPULAR;
                            break Label_0233;
                        }
                        videoFeedEndpoint = VideoFeedEndpoint.DISCOVER;
                        break Label_0233;
                    }
                }
                videoFeedEndpoint = null;
            }
            final h c4 = h$a.c((Object)videoFeedEndpoint);
            if (videoContext != null) {
                s = videoContext.getLinkKindWithId();
            }
            else {
                s = null;
            }
            final h c5 = h$a.c((Object)s);
            if (videoContext != null) {
                s = videoContext.getNavigationSessionId();
            }
            else {
                s = null;
            }
            final h c6 = h$a.c((Object)s);
            List onboardingCategories;
            if (videoContext != null) {
                onboardingCategories = videoContext.getOnboardingCategories();
            }
            else {
                onboardingCategories = null;
            }
            final h c7 = h$a.c((Object)new p2(c3, c4, c5, c6, h$a.c((Object)onboardingCategories)));
            final h f = a.f(10);
            final h c8 = h$a.c((Object)new c1(h$a.c((Object)s2), 14));
            final h a3 = h$a.a();
            final h h = s0.h(this.j);
            o22.a apolloAdContextInput = null;
            Label_0388: {
                if (a != null) {
                    final ListingViewMode b2 = a.b;
                    if (b2 != null) {
                        apolloAdContextInput = InputVariableToGqlVariableMapperKt.getApolloAdContextInput(a.a, b2, this.b);
                        break Label_0388;
                    }
                }
                apolloAdContextInput = null;
            }
            final u9 u9 = new u9(c7, c2, f, a3, c8, h, h$a.c((Object)apolloAdContextInput), 384);
            ((RemoteGqlLinkDataSource$getRecommendedVideos.RemoteGqlLinkDataSource$getRecommendedVideos$1)o).L$0 = this;
            ((RemoteGqlLinkDataSource$getRecommendedVideos.RemoteGqlLinkDataSource$getRecommendedVideos$1)o).label = 1;
            b = e$a.b(14, (k)u9, (e)a2, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlLinkDataSource = this;
        }
        final u9$b u9$b = (u9$b)b;
        Object o2 = null;
        Label_0862: {
            if (remoteGqlLinkDataSource.g.w6()) {
                final u9$g a4 = u9$b.a;
                if (a4 != null) {
                    final u9$f b3 = a4.b;
                    if (b3 != null) {
                        final List d = b3.d;
                        if (d != null) {
                            final ArrayList<Link> list = new ArrayList<Link>();
                            final Iterator iterator = d.iterator();
                            while (true) {
                                o2 = list;
                                if (!iterator.hasNext()) {
                                    break Label_0862;
                                }
                                final u9$c u9$c = (u9$c)iterator.next();
                                final GqlPostToLinkDomainModelMapper h2 = remoteGqlLinkDataSource.h;
                                Link link$default = null;
                                Label_0601: {
                                    if (u9$c != null) {
                                        final u9$d b4 = u9$c.b;
                                        if (b4 != null) {
                                            final u9$d$a b5 = b4.b;
                                            if (b5 != null) {
                                                final PostFragment a5 = b5.a;
                                                if (a5 != null) {
                                                    link$default = GqlPostToLinkDomainModelMapper.toLink$default(h2, a5, (FeedAnswerableQuestionsFragment)null, (String)null, (List)null, (Integer)null, 15, (Object)null);
                                                    break Label_0601;
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
                o2 = EmptyList.INSTANCE;
            }
            else {
                final u9$g a6 = u9$b.a;
                if (a6 != null) {
                    final u9$f b6 = a6.b;
                    if (b6 != null) {
                        final List d2 = b6.d;
                        if (d2 != null) {
                            final ArrayList<Link> list2 = new ArrayList<Link>();
                            for (final u9$c u9$c2 : d2) {
                                final GqlPostToLinkDomainModelMapper h3 = remoteGqlLinkDataSource.h;
                                Link link$default2 = null;
                                Label_0752: {
                                    if (u9$c2 != null) {
                                        final u9$d b7 = u9$c2.b;
                                        if (b7 != null) {
                                            final u9$d$a b8 = b7.b;
                                            if (b8 != null) {
                                                final PostFragment a7 = b8.a;
                                                if (a7 != null) {
                                                    link$default2 = GqlPostToLinkDomainModelMapper.toLink$default(h3, a7, (FeedAnswerableQuestionsFragment)null, (String)null, (List)null, (Integer)null, 15, (Object)null);
                                                    break Label_0752;
                                                }
                                            }
                                        }
                                    }
                                    link$default2 = null;
                                }
                                if (link$default2 != null) {
                                    list2.add(link$default2);
                                }
                            }
                            o2 = new ArrayList<Link>();
                            for (final Link next : list2) {
                                final Link link = next;
                                if (link.isVideo() && !link.getPromoted() && !link.getHidden() && !link.getRemoved()) {
                                    ((ArrayList<Link>)o2).add(next);
                                }
                            }
                            break Label_0862;
                        }
                    }
                }
                o2 = EmptyList.INSTANCE;
            }
        }
        final u9$g a8 = u9$b.a;
        sh a9 = sh;
        if (a8 != null) {
            final u9$f b9 = a8.b;
            a9 = sh;
            if (b9 != null) {
                final u9$e b10 = b9.b;
                a9 = sh;
                if (b10 != null) {
                    final u9$e$a b11 = b10.b;
                    a9 = sh;
                    if (b11 != null) {
                        a9 = b11.a;
                    }
                }
            }
        }
        return new Listing((List)o2, GqlDataToDomainModelMapperKt.getAfter(a9), null, null, null, false, null, 124, null);
    }
    
    public final Object o(final Map<String, String> map, final tg2.c<? super Listing<Link>> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RemoteGqlLinkDataSource$getTopAwardedPosts.RemoteGqlLinkDataSource$getTopAwardedPosts$1) {
                final RemoteGqlLinkDataSource$getTopAwardedPosts.RemoteGqlLinkDataSource$getTopAwardedPosts$1 remoteGqlLinkDataSource$getTopAwardedPosts$1 = (RemoteGqlLinkDataSource$getTopAwardedPosts.RemoteGqlLinkDataSource$getTopAwardedPosts$1)c;
                final int label = remoteGqlLinkDataSource$getTopAwardedPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$getTopAwardedPosts$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$getTopAwardedPosts$1;
                    break Label_0052;
                }
            }
            o = new RemoteGqlLinkDataSource$getTopAwardedPosts.RemoteGqlLinkDataSource$getTopAwardedPosts$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$getTopAwardedPosts.RemoteGqlLinkDataSource$getTopAwardedPosts$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$getTopAwardedPosts.RemoteGqlLinkDataSource$getTopAwardedPosts$1)o).label;
        RemoteGqlLinkDataSource remoteGqlLinkDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlLinkDataSource = (RemoteGqlLinkDataSource)((RemoteGqlLinkDataSource$getTopAwardedPosts.RemoteGqlLinkDataSource$getTopAwardedPosts$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final xc xc = new xc(a.f(0), h$a.a(), s0.h(this.j), 24);
            ((RemoteGqlLinkDataSource$getTopAwardedPosts.RemoteGqlLinkDataSource$getTopAwardedPosts$1)o).L$0 = this;
            ((RemoteGqlLinkDataSource$getTopAwardedPosts.RemoteGqlLinkDataSource$getTopAwardedPosts$1)o).label = 1;
            b = e$a.b(10, (k)xc, (e)a, (RetryAlgo)null, (Map)map, (tg2.c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlLinkDataSource = this;
        }
        final xc$c a2 = ((xc$b)b).a;
        if (a2 != null) {
            final List b2 = a2.b;
            if (b2 != null) {
                final ArrayList<Link> list = new ArrayList<Link>();
                for (final xc$e xc$e : b2) {
                    final GqlPostToLinkDomainModelMapper h = remoteGqlLinkDataSource.h;
                    final xc$d b3 = xc$e.b;
                    Link link$default = null;
                    Label_0294: {
                        if (b3 != null) {
                            final xc$d$a b4 = b3.b;
                            if (b4 != null) {
                                final PostFragment a3 = b4.a;
                                if (a3 != null) {
                                    link$default = GqlPostToLinkDomainModelMapper.toLink$default(h, a3, (FeedAnswerableQuestionsFragment)null, (String)null, (List)null, (Integer)null, 15, (Object)null);
                                    break Label_0294;
                                }
                            }
                        }
                        link$default = null;
                    }
                    if (link$default != null) {
                        list.add(link$default);
                    }
                }
                final ArrayList<Link> list2 = new ArrayList<Link>();
                final Iterator<Link> iterator2 = list.iterator();
                while (true) {
                    final Object instance = list2;
                    if (!iterator2.hasNext()) {
                        return new Listing((List)instance, null, null, null, null, false, null, 126, null);
                    }
                    final Link next = iterator2.next();
                    final Link link = next;
                    if (link.getHidden() || link.getOver18() || link.getRemoved() || link.getSpam() || link.getQuarantine()) {
                        continue;
                    }
                    list2.add(next);
                }
            }
        }
        final Object instance = EmptyList.INSTANCE;
        return new Listing((List)instance, null, null, null, null, false, null, 126, null);
    }
    
    public final Object p(final String s, final NSFWState nsfwState, final tg2.c<? super pg2.j> c) {
        final Object b = e$a.b(14, (k)new r7(new k4(s, nsfwState)), (e)this.a, (RetryAlgo)null, (Map)null, (tg2.c)c, (OkHttpClient)null);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        return pg2.j.a;
    }
    
    public final Object q(String b, final tg2.c<? super UpdateResponse> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RemoteGqlLinkDataSource$save.RemoteGqlLinkDataSource$save$1) {
                final RemoteGqlLinkDataSource$save.RemoteGqlLinkDataSource$save$1 remoteGqlLinkDataSource$save$1 = (RemoteGqlLinkDataSource$save.RemoteGqlLinkDataSource$save$1)c;
                final int label = remoteGqlLinkDataSource$save$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$save$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$save$1;
                    break Label_0052;
                }
            }
            o = new RemoteGqlLinkDataSource$save.RemoteGqlLinkDataSource$save$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$save.RemoteGqlLinkDataSource$save$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$save.RemoteGqlLinkDataSource$save$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final t7 t7 = new t7(new m4(b, PostSaveState.SAVED));
            ((RemoteGqlLinkDataSource$save.RemoteGqlLinkDataSource$save$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)t7, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final t7$d a2 = ((t7$b)b2).a;
        final String s = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean b3 = a2.b;
            final List c2 = a2.c;
            b = s;
            if (c2 != null) {
                final t7$c t7$c = (t7$c)CollectionsKt___CollectionsKt.s1(c2);
                b = s;
                if (t7$c != null) {
                    b = t7$c.b;
                }
            }
            updateResponse = new UpdateResponse(b3, b);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
    
    public final Object r(final String s, final tg2.c<? super Boolean> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RemoteGqlLinkDataSource$subscribeToPost.RemoteGqlLinkDataSource$subscribeToPost$1) {
                final RemoteGqlLinkDataSource$subscribeToPost.RemoteGqlLinkDataSource$subscribeToPost$1 remoteGqlLinkDataSource$subscribeToPost$1 = (RemoteGqlLinkDataSource$subscribeToPost.RemoteGqlLinkDataSource$subscribeToPost$1)c;
                final int label = remoteGqlLinkDataSource$subscribeToPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$subscribeToPost$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$subscribeToPost$1;
                    break Label_0052;
                }
            }
            o = new RemoteGqlLinkDataSource$subscribeToPost.RemoteGqlLinkDataSource$subscribeToPost$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$subscribeToPost.RemoteGqlLinkDataSource$subscribeToPost$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$subscribeToPost.RemoteGqlLinkDataSource$subscribeToPost$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final m7 m7 = new m7(new h4(s, PostFollowState.FOLLOWED));
            ((RemoteGqlLinkDataSource$subscribeToPost.RemoteGqlLinkDataSource$subscribeToPost$1)o).label = 1;
            if ((b = e$a.b(14, (k)m7, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final m7$d a2 = ((m7$b)b).a;
        return a2 != null && a2.b;
    }
    
    public final Object s(String b, final tg2.c<? super UpdateResponse> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RemoteGqlLinkDataSource$unSave.RemoteGqlLinkDataSource$unSave$1) {
                final RemoteGqlLinkDataSource$unSave.RemoteGqlLinkDataSource$unSave$1 remoteGqlLinkDataSource$unSave$1 = (RemoteGqlLinkDataSource$unSave.RemoteGqlLinkDataSource$unSave$1)c;
                final int label = remoteGqlLinkDataSource$unSave$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$unSave$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$unSave$1;
                    break Label_0052;
                }
            }
            o = new RemoteGqlLinkDataSource$unSave.RemoteGqlLinkDataSource$unSave$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$unSave.RemoteGqlLinkDataSource$unSave$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$unSave.RemoteGqlLinkDataSource$unSave$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final t7 t7 = new t7(new m4(b, PostSaveState.NONE));
            ((RemoteGqlLinkDataSource$unSave.RemoteGqlLinkDataSource$unSave$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)t7, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final t7$d a2 = ((t7$b)b2).a;
        final String s = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean b3 = a2.b;
            final List c2 = a2.c;
            b = s;
            if (c2 != null) {
                final t7$c t7$c = (t7$c)CollectionsKt___CollectionsKt.s1(c2);
                b = s;
                if (t7$c != null) {
                    b = t7$c.b;
                }
            }
            updateResponse = new UpdateResponse(b3, b);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
    
    public final Object t(final String s, final tg2.c<? super Boolean> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RemoteGqlLinkDataSource$unsubscribeFromPost.RemoteGqlLinkDataSource$unsubscribeFromPost$1) {
                final RemoteGqlLinkDataSource$unsubscribeFromPost.RemoteGqlLinkDataSource$unsubscribeFromPost$1 remoteGqlLinkDataSource$unsubscribeFromPost$1 = (RemoteGqlLinkDataSource$unsubscribeFromPost.RemoteGqlLinkDataSource$unsubscribeFromPost$1)c;
                final int label = remoteGqlLinkDataSource$unsubscribeFromPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$unsubscribeFromPost$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$unsubscribeFromPost$1;
                    break Label_0052;
                }
            }
            o = new RemoteGqlLinkDataSource$unsubscribeFromPost.RemoteGqlLinkDataSource$unsubscribeFromPost$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$unsubscribeFromPost.RemoteGqlLinkDataSource$unsubscribeFromPost$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$unsubscribeFromPost.RemoteGqlLinkDataSource$unsubscribeFromPost$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final m7 m7 = new m7(new h4(s, PostFollowState.UNFOLLOWED));
            ((RemoteGqlLinkDataSource$unsubscribeFromPost.RemoteGqlLinkDataSource$unsubscribeFromPost$1)o).label = 1;
            if ((b = e$a.b(14, (k)m7, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final m7$d a2 = ((m7$b)b).a;
        return a2 != null && a2.b;
    }
    
    public final c0<Boolean> u(final String s, final HideState hideState) {
        ah2.f.f((Object)s, "linkKindWithId");
        ah2.f.f((Object)hideState, "hideState");
        final c0 w = e$a.a((e)this.a, (k)new o7(new o22.i4(s, hideState)), (OkHttpClient)null, (Map)null, 14).w((o)new ov.c(10));
        ah2.f.e((Object)w, "graphQlClient.execute(\n \u2026tHideState?.ok ?: false }");
        return (c0<Boolean>)w;
    }
    
    public final Object v(String b, final VoteDirection voteDirection, final tg2.c<? super UpdateResponse> c) {
        Object o = null;
        Label_0056: {
            if (c instanceof RemoteGqlLinkDataSource$vote.RemoteGqlLinkDataSource$vote$1) {
                final RemoteGqlLinkDataSource$vote.RemoteGqlLinkDataSource$vote$1 remoteGqlLinkDataSource$vote$1 = (RemoteGqlLinkDataSource$vote.RemoteGqlLinkDataSource$vote$1)c;
                final int label = remoteGqlLinkDataSource$vote$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLinkDataSource$vote$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLinkDataSource$vote$1;
                    break Label_0056;
                }
            }
            o = new RemoteGqlLinkDataSource$vote.RemoteGqlLinkDataSource$vote$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlLinkDataSource$vote.RemoteGqlLinkDataSource$vote$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLinkDataSource$vote.RemoteGqlLinkDataSource$vote$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final z7 z7 = new z7(new q4(b, GqlDataToDomainModelMapperKt.toVoteState(voteDirection)));
            ((RemoteGqlLinkDataSource$vote.RemoteGqlLinkDataSource$vote$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)z7, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final z7$d a2 = ((z7$b)b2).a;
        final String s = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean b3 = a2.b;
            final List c2 = a2.c;
            b = s;
            if (c2 != null) {
                final z7$c z7$c = (z7$c)CollectionsKt___CollectionsKt.s1(c2);
                b = s;
                if (z7$c != null) {
                    b = z7$c.b;
                }
            }
            updateResponse = new UpdateResponse(b3, b);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final String c;
        public final Map<String, MediaMetaData> d;
        
        public a(final Map d, final String a, final String b, final String c) {
            ah2.f.f((Object)a, "markdown");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return ah2.f.a((Object)this.a, (Object)a.a) && ah2.f.a((Object)this.b, (Object)a.b) && ah2.f.a((Object)this.c, (Object)a.c) && ah2.f.a((Object)this.d, (Object)a.d);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final String b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final String c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final Map<String, MediaMetaData> d = this.d;
            if (d != null) {
                hashCode2 = d.hashCode();
            }
            return ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("EditLinkRemoteResponse(markdown=");
            k.append(this.a);
            k.append(", html=");
            k.append(this.b);
            k.append(", richtext=");
            k.append(this.c);
            k.append(", mediaMetaData=");
            return a40.f.p(k, (Map)this.d, ')');
        }
    }
}
