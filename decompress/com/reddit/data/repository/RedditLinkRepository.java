// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.Collection;
import z50.h0;
import com.reddit.queries.lb;
import z50.i0;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.listing.RemovalReason;
import com.reddit.domain.model.listing.ContentRemovalMessage;
import com.reddit.domain.model.media.FbpMediaType;
import z50.q0;
import z50.f0;
import com.reddit.data.local.UserLinkKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.collections.EmptyList;
import com.reddit.common.experiments.model.channels.FeedNotificationsVariant;
import z50.p1;
import z50.o0;
import io.reactivex.internal.operators.single.SingleDoFinally;
import g22.x1;
import g22.d0;
import a4.a0;
import ej2.j0;
import rg2.q;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import io.reactivex.internal.operators.single.SingleFlatMap;
import okhttp3.OkHttpClient;
import mr0.e$a;
import com.reddit.mutations.k2;
import g22.m0;
import com.reddit.domain.model.vote.VoteDirection;
import java.util.UUID;
import z50.k0;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.common.ThingType;
import ff2.r;
import com.reddit.frontpage.presentation.link.DistinguishType;
import com.reddit.listing.model.sort.HistorySortType;
import f22.p$a;
import com.reddit.tracking.TrackerParams$TrackerType;
import z50.l0;
import kotlin.coroutines.CoroutineContext;
import com.reddit.domain.model.media.VideoContext;
import com.reddit.type.HideState;
import com.reddit.domain.repository.ModQueueSortingType;
import com.nytimes.android.external.store3.base.impl.Store;
import ff2.n;
import com.reddit.domain.model.UpdateSubredditTitleSafetyDto;
import v10.v;
import com.reddit.listing.common.ListingType;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.ads.domain.DisplaySource;
import io.reactivex.plugins.RxJavaPlugins;
import uf2.h;
import bm0.p0;
import ej2.c0;
import com.reddit.tracking.RedditEndpoint;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import z50.e2;
import com.reddit.domain.model.mod.CrowdControlFilterLevel;
import com.reddit.ads.link.models.AppStoreData;
import com.reddit.domain.model.DiscussionType;
import com.reddit.domain.model.listing.RecommendationContext;
import com.reddit.domain.model.PostGallery;
import com.reddit.domain.model.liveaudio.LegacyAudioRoom;
import com.reddit.domain.model.liveaudio.AudioRoom;
import com.reddit.domain.model.RpanVideo;
import com.reddit.domain.model.predictions.PostPredictionsTournamentData;
import com.reddit.domain.model.PostPoll;
import java.util.Map;
import com.reddit.domain.model.RichTextResponse;
import com.reddit.domain.model.OutboundLink;
import com.reddit.ads.domain.PromoLayoutType;
import com.reddit.domain.model.SubredditDetail;
import com.reddit.mod.notes.domain.model.NoteLabel;
import com.reddit.domain.modtools.ModQueueTriggers;
import com.reddit.domain.model.mod.BannedBy;
import com.reddit.domain.model.LinkMedia;
import com.reddit.domain.model.Preview;
import com.reddit.domain.awardsleaderboard.AwardLeaderboardStatus;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ig2.m;
import com.reddit.domain.model.Link;
import java.util.Iterator;
import com.google.firebase.perf.metrics.Trace;
import java.util.List;
import com.reddit.domain.model.ILink;
import com.reddit.domain.model.TopicsRecommendationFeedElement;
import java.util.ArrayList;
import ej2.g;
import com.reddit.domain.model.listing.Listing;
import com.reddit.listing.model.sort.SortType$a;
import com.reddit.listing.model.sort.SortType;
import va0.w;
import va0.b0;
import us0.e;
import w12.d;
import pd0.i;
import com.reddit.domain.targeting.ResurrectedUserTargetingUseCase;
import v40.n0;
import w50.k;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import f22.p;
import java.util.LinkedHashMap;
import v40.g0;
import com.reddit.data.remote.RemoteLinkDataSource;
import com.reddit.domain.usecase.GeoFilterUseCase;
import xd0.s;
import com.reddit.events.discover.DiscoverAnalytics;
import xd0.o;
import va0.l;
import a22.c;
import android.content.Context;
import f22.f;
import hw0.b;
import a20.a;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xd0.j;

public final class RedditLinkRepository implements j
{
    public static final Pair<Long, TimeUnit> h0;
    public static final Pair<Long, TimeUnit> i0;
    public static final Pair<Long, TimeUnit> j0;
    public final a A;
    public final eb0.a B;
    public final b C;
    public final va0.b D;
    public final lf0.a E;
    public final f F;
    public final Context G;
    public final c H;
    public final l I;
    public final nr0.c J;
    public final o K;
    public final DiscoverAnalytics L;
    public final l01.a M;
    public final s N;
    public final GeoFilterUseCase O;
    public final mb0.a P;
    public final String Q;
    public final String R;
    public final boolean S;
    public final hg2.f T;
    public final hg2.f U;
    public final hg2.f V;
    public final hg2.f W;
    public final hg2.f X;
    public final hg2.f Y;
    public final hg2.f Z;
    public final n20.a a;
    public final hg2.f a0;
    public final RemoteLinkDataSource b;
    public final hg2.f b0;
    public final g0 c;
    public LinkedHashMap c0;
    public final xb0.a d;
    public final hg2.f d0;
    public final av.a e;
    public final hg2.f e0;
    public final p f;
    public final hg2.f f0;
    public final RemoteGqlLinkDataSource g;
    public final hg2.f g0;
    public final k h;
    public final n0 i;
    public final w50.a j;
    public final va0.s k;
    public final ua0.k l;
    public final xd0.g0 m;
    public final wc0.b n;
    public final bw.a o;
    public final ResurrectedUserTargetingUseCase p;
    public final i q;
    public final b81.a r;
    public final d s;
    public final e t;
    public final cw0.a u;
    public final b0 v;
    public final cv.a w;
    public final wv.a x;
    public final o01.a y;
    public final w z;
    
    static {
        final SortType$a companion = SortType.Companion;
        final TimeUnit seconds = TimeUnit.SECONDS;
        h0 = new Pair((Object)10L, (Object)seconds);
        i0 = new Pair((Object)60L, (Object)seconds);
        j0 = new Pair((Object)1L, (Object)TimeUnit.HOURS);
    }
    
    public RedditLinkRepository(final n20.a a, final RemoteLinkDataSource b, final g0 c, final xb0.a d, final av.a e, final p f, final RemoteGqlLinkDataSource g, final k h, final n0 i, final w50.a j, final va0.s k, final ua0.k l, final xd0.g0 m, final wc0.b n, final bw.a o, final ResurrectedUserTargetingUseCase p44, final i q, final b81.a r, final d s, final e t, final cw0.a u, final b0 v, final cv.a w, final wv.a x, final o01.a y, final w z, final a a2, final eb0.a b2, final b c2, final va0.b d2, final lf0.a e2, final f f2, final Context g2, final c h2, final l i2, final com.reddit.session.o o2, final nr0.c j2, final o k2, final va0.k k3, final DiscoverAnalytics l2, final l01.a m2, final s n2, final GeoFilterUseCase o3, final mb0.a p45) {
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
        this.p = p44;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a2;
        this.B = b2;
        this.C = c2;
        this.D = d2;
        this.E = e2;
        this.F = f2;
        this.G = g2;
        this.H = h2;
        this.I = i2;
        this.J = j2;
        this.K = k2;
        this.L = l2;
        this.M = m2;
        this.N = n2;
        this.O = o3;
        this.P = p45;
        this.Q = k3.c();
        this.R = String.valueOf(k3.n());
        this.S = o2.A();
        this.T = kotlin.a.b((rg2.a)new RedditLinkRepository$submittedStore$2(this));
        this.U = kotlin.a.b((rg2.a)new RedditLinkRepository$popularLinkStore$2(this));
        this.V = kotlin.a.b((rg2.a)new RedditLinkRepository$categoryLinkStore$2(this));
        this.W = kotlin.a.b((rg2.a)new RedditLinkRepository$historyLinkStore$2(this));
        this.X = kotlin.a.b((rg2.a)new RedditLinkRepository$subredditLinkStore$2(this));
        this.Y = kotlin.a.b((rg2.a)new RedditLinkRepository$multiredditLinkStore$2(this));
        this.Z = kotlin.a.b((rg2.a)new RedditLinkRepository$savedPostsStore$2(this));
        this.a0 = kotlin.a.b((rg2.a)new RedditLinkRepository$topAwardedPostsStore$2(this));
        this.b0 = kotlin.a.b((rg2.a)new RedditLinkRepository$predictionsTournamentPostsStore$2(this));
        this.c0 = new LinkedHashMap();
        this.d0 = kotlin.a.b((rg2.a)new RedditLinkRepository$discoverTopicLinksStore$2(this));
        this.e0 = kotlin.a.b((rg2.a)new RedditLinkRepository$recommendedVideosLinkStore$2(this));
        this.f0 = kotlin.a.b((rg2.a)new RedditLinkRepository$recommendedMediaLinkStore$2(this));
        this.g0 = kotlin.a.b((rg2.a)new RedditLinkRepository$postDuplicatesStore$2(this));
    }
    
    public static Listing m0(final RedditLinkRepository redditLinkRepository, Listing listing) {
        redditLinkRepository.getClass();
        final Trace b = pi.b.b("LinkRepository.filter_topic_recommendations");
        if (redditLinkRepository.k.xb()) {
            b.stop();
        }
        else {
            Listing copy$default = listing;
            if (!(boolean)g.k((rg2.p)new RedditLinkRepository$filterTopicRecommendations$showTopicRecommendations$1(redditLinkRepository, (lg2.c)null))) {
                final List children = listing.getChildren();
                final ArrayList list = new ArrayList();
                for (final Object next : children) {
                    if (((ILink)next) instanceof TopicsRecommendationFeedElement ^ true) {
                        list.add(next);
                    }
                }
                copy$default = Listing.copy$default(listing, (List)list, (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (Object)null);
            }
            b.stop();
            listing = copy$default;
        }
        return listing;
    }
    
    public static final Listing n0(final RedditLinkRepository redditLinkRepository, Listing copy$default, final ua0.i i, final ua0.j j) {
        final Trace b = pi.b.b("LinkRepository.filter_generic_listing");
        if (i != null) {
            copy$default = Listing.copy$default(copy$default, i.a(copy$default.getChildren(), j), (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (Object)null);
        }
        b.stop();
        return copy$default;
    }
    
    public static final List o0(final RedditLinkRepository redditLinkRepository, final List list) {
        redditLinkRepository.getClass();
        final ArrayList list2 = new ArrayList();
        for (final Object next : list) {
            if (next instanceof Link) {
                list2.add(next);
            }
        }
        final ArrayList list3 = new ArrayList<String>(m.c3((Iterable)list2, 10));
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list3.add(((Link)iterator2.next()).getId());
        }
        final List f = redditLinkRepository.c.f(CollectionsKt___CollectionsKt.q4((Iterable)list3));
        int o0;
        if ((o0 = bg.d.o0(m.c3((Iterable)f, 10))) < 16) {
            o0 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap<String, b60.k>(o0);
        for (final Object next2 : f) {
            linkedHashMap.put(((b60.k)next2).a, (b60.k)next2);
        }
        List<ILink> list4;
        if (linkedHashMap.isEmpty()) {
            list4 = list;
        }
        else {
            final ArrayList<ILink> list5 = new ArrayList<ILink>(m.c3((Iterable)list, 10));
            final Iterator iterator4 = list.iterator();
            while (true) {
                list4 = list5;
                if (!iterator4.hasNext()) {
                    break;
                }
                ILink copy$default;
                final ILink link = copy$default = (ILink)iterator4.next();
                if (link instanceof Link) {
                    copy$default = link;
                    if (linkedHashMap.containsKey(link.getId())) {
                        final b60.k value = linkedHashMap.get(link.getId());
                        sg2.e.c((Object)value);
                        final b60.k k = value;
                        final Link link2 = (Link)link;
                        final boolean b = k.b;
                        final Boolean e = k.e;
                        copy$default = Link.copy$default(link2, null, null, 0L, null, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, b, e != null && e, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, -1, -1, 1073741823, 536870911, null);
                        sg2.e.d((Object)copy$default, "null cannot be cast to non-null type com.reddit.domain.model.ILink");
                    }
                }
                list5.add(copy$default);
            }
        }
        return list4;
    }
    
    public static final Object p0(final RedditLinkRepository redditLinkRepository, final e2 e2, final lg2.c c) {
        redditLinkRepository.getClass();
        RedditLinkRepository$fetchPopularListing$1 redditLinkRepository$fetchPopularListing$2 = null;
        Label_0057: {
            if (c instanceof RedditLinkRepository$fetchPopularListing$1) {
                final RedditLinkRepository$fetchPopularListing$1 redditLinkRepository$fetchPopularListing$1 = (RedditLinkRepository$fetchPopularListing$1)c;
                final int label = redditLinkRepository$fetchPopularListing$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$fetchPopularListing$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$fetchPopularListing$2 = redditLinkRepository$fetchPopularListing$1;
                    break Label_0057;
                }
            }
            redditLinkRepository$fetchPopularListing$2 = new RedditLinkRepository$fetchPopularListing$1(redditLinkRepository, c);
        }
        final Object result = redditLinkRepository$fetchPopularListing$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$fetchPopularListing$2.label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            b = result;
        }
        else {
            yd.b.k0(result);
            final DisplaySource a = e2.a;
            final SortType b2 = e2.b;
            final SortTimeFrame c2 = e2.c;
            final String d = e2.d;
            final Integer e3 = e2.e;
            final zu.a g = e2.g;
            final ListingViewMode h = e2.h;
            final String l = e2.l;
            final String n = e2.n;
            final String o = e2.o;
            final Boolean s = e2.s;
            Map map;
            if (n != null) {
                map = aa1.a.U0(n, redditLinkRepository.f, o);
            }
            else {
                map = kotlin.collections.c.V0();
            }
            redditLinkRepository.s.b("LinkRepository.getPopular_network_fetch");
            final RemoteGqlLinkDataSource g2 = redditLinkRepository.g;
            sg2.e.c((Object)b2);
            sg2.e.c((Object)l);
            final ff2.c0 w = c0.u4(g2.h(a, b2, c2, d, g, h, l, redditLinkRepository.e.c(), map, e3, s), RedditEndpoint.PopularPosts, redditLinkRepository.f, redditLinkRepository.F, redditLinkRepository.Q, redditLinkRepository.R, redditLinkRepository.S).w((kf2.o)new p0(5));
            final com.reddit.data.repository.d d2 = new com.reddit.data.repository.d(redditLinkRepository, 0);
            w.getClass();
            final ff2.c0<Object> onAssembly = RxJavaPlugins.onAssembly(new h<Object>((ff2.g0<Object>)w, (kf2.g<? super Object>)d2));
            sg2.e.e((Object)onAssembly, "remoteGql.getPopularLink\u2026E_SUBREDDIT_TITLES)\n    }");
            redditLinkRepository$fetchPopularListing$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b((ff2.c0)onAssembly, (lg2.c)redditLinkRepository$fetchPopularListing$2)) == coroutine_SUSPENDED) {
                b = coroutine_SUSPENDED;
                return b;
            }
        }
        sg2.e.e(b, "remoteGql.getPopularLink\u2026DIT_TITLES)\n    }.await()");
        return b;
    }
    
    public static final Object q0(final RedditLinkRepository redditLinkRepository, final Listing listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final lg2.c c) {
        redditLinkRepository.getClass();
        RedditLinkRepository$saveHomeLinksInternal$1 redditLinkRepository$saveHomeLinksInternal$2 = null;
        Label_0066: {
            if (c instanceof RedditLinkRepository$saveHomeLinksInternal$1) {
                final RedditLinkRepository$saveHomeLinksInternal$1 redditLinkRepository$saveHomeLinksInternal$1 = (RedditLinkRepository$saveHomeLinksInternal$1)c;
                final int label = redditLinkRepository$saveHomeLinksInternal$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$saveHomeLinksInternal$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$saveHomeLinksInternal$2 = redditLinkRepository$saveHomeLinksInternal$1;
                    break Label_0066;
                }
            }
            redditLinkRepository$saveHomeLinksInternal$2 = new RedditLinkRepository$saveHomeLinksInternal$1(redditLinkRepository, c);
        }
        final Object result = redditLinkRepository$saveHomeLinksInternal$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$saveHomeLinksInternal$2.label;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
        }
        else {
            yd.b.k0(result);
            final g0 c2 = redditLinkRepository.c;
            redditLinkRepository$saveHomeLinksInternal$2.label = 1;
            if (c2.E(listing, sortType, sortTimeFrame, s, (lg2.c)redditLinkRepository$saveHomeLinksInternal$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return Boolean.TRUE;
    }
    
    public static final Object r0(RedditLinkRepository l$0, final Listing listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final lg2.c c) {
        l$0.getClass();
        RedditLinkRepository$savePopularLinksInternal$1 redditLinkRepository$savePopularLinksInternal$2 = null;
        Label_0066: {
            if (c instanceof RedditLinkRepository$savePopularLinksInternal$1) {
                final RedditLinkRepository$savePopularLinksInternal$1 redditLinkRepository$savePopularLinksInternal$1 = (RedditLinkRepository$savePopularLinksInternal$1)c;
                final int label = redditLinkRepository$savePopularLinksInternal$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$savePopularLinksInternal$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$savePopularLinksInternal$2 = redditLinkRepository$savePopularLinksInternal$1;
                    break Label_0066;
                }
            }
            redditLinkRepository$savePopularLinksInternal$2 = new RedditLinkRepository$savePopularLinksInternal$1(l$0, c);
        }
        final Object result = redditLinkRepository$savePopularLinksInternal$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$savePopularLinksInternal$2.label;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (RedditLinkRepository)redditLinkRepository$savePopularLinksInternal$2.L$0;
            yd.b.k0(result);
        }
        else {
            yd.b.k0(result);
            l$0.s.b("LocalLinkDataSource.savePopularElements");
            final g0 c2 = l$0.c;
            redditLinkRepository$savePopularLinksInternal$2.L$0 = l$0;
            redditLinkRepository$savePopularLinksInternal$2.label = 1;
            if (c2.D(listing, sortType, sortTimeFrame, s, s2, (lg2.c)redditLinkRepository$savePopularLinksInternal$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        l$0.s.e("LocalLinkDataSource.savePopularElements");
        return Boolean.TRUE;
    }
    
    public static final Object s0(final RedditLinkRepository redditLinkRepository, final List list, ListingType l$1, final lg2.c c) {
        redditLinkRepository.getClass();
        Object o = null;
        Label_0061: {
            if (c instanceof RedditLinkRepository$updateAdsSessionSlot$1) {
                final RedditLinkRepository$updateAdsSessionSlot$1 redditLinkRepository$updateAdsSessionSlot$1 = (RedditLinkRepository$updateAdsSessionSlot$1)c;
                final int label = redditLinkRepository$updateAdsSessionSlot$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$updateAdsSessionSlot$1.label = label + Integer.MIN_VALUE;
                    o = redditLinkRepository$updateAdsSessionSlot$1;
                    break Label_0061;
                }
            }
            o = new RedditLinkRepository$updateAdsSessionSlot$1(redditLinkRepository, c);
        }
        final Object result = ((RedditLinkRepository$updateAdsSessionSlot$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditLinkRepository$updateAdsSessionSlot$1)o).label;
        while (true) {
            Object o2 = null;
            Object o3 = null;
            ListingType listingType = null;
            Label_0281: {
                Iterator iterator;
                RedditLinkRepository l$2;
                List list3;
                if (label2 != 0) {
                    if (label2 == 1) {
                        o2 = ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$4;
                        iterator = (Iterator)((RedditLinkRepository$updateAdsSessionSlot$1)o).L$3;
                        o3 = ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$2;
                        listingType = (ListingType)((RedditLinkRepository$updateAdsSessionSlot$1)o).L$1;
                        l$2 = (RedditLinkRepository)((RedditLinkRepository$updateAdsSessionSlot$1)o).L$0;
                        yd.b.k0(result);
                        break Label_0281;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    yd.b.k0(result);
                    final ArrayList list2 = new ArrayList(m.c3((Iterable)list, 10));
                    iterator = list.iterator();
                    l$2 = redditLinkRepository;
                    list3 = list2;
                }
                Object a;
                if (iterator.hasNext()) {
                    final Link link = iterator.next();
                    final bw.a o4 = l$2.o;
                    final boolean promoted = link.getPromoted();
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$0 = l$2;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$1 = l$1;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$2 = list3;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$3 = iterator;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$4 = list3;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).label = 1;
                    if (o4.a(promoted, l$1, (lg2.c)o) != coroutine_SUSPENDED) {
                        final ListingType listingType2 = l$1;
                        o3 = list3;
                        o2 = list3;
                        listingType = listingType2;
                        break Label_0281;
                    }
                    a = coroutine_SUSPENDED;
                }
                else {
                    final List list4 = list3;
                    a = hg2.j.a;
                }
                return a;
            }
            ((Collection<hg2.j>)o2).add(hg2.j.a);
            final Object o5 = o3;
            l$1 = listingType;
            List list3 = (List)o5;
            continue;
        }
    }
    
    public static final Object t0(final RedditLinkRepository redditLinkRepository, final List list, final lg2.c c) {
        Object o3;
        if (redditLinkRepository.B.G2()) {
            final xd0.g0 m = redditLinkRepository.m;
            final ArrayList list2 = new ArrayList();
            for (final Link link : list) {
                final SubredditDetail subredditDetail = link.getSubredditDetail();
                final Object o = null;
                final Boolean b = null;
                Object o2 = o;
                if (subredditDetail != null) {
                    final SubredditDetail subredditDetail2 = link.getSubredditDetail();
                    Boolean titleSafe;
                    if (subredditDetail2 != null) {
                        titleSafe = subredditDetail2.isTitleSafe();
                    }
                    else {
                        titleSafe = null;
                    }
                    o2 = o;
                    if (titleSafe != null) {
                        if (link.getSubredditId().length() == 0) {
                            o2 = o;
                        }
                        else {
                            final String g = v.g(link.getSubredditId());
                            final SubredditDetail subredditDetail3 = link.getSubredditDetail();
                            Boolean titleSafe2 = b;
                            if (subredditDetail3 != null) {
                                titleSafe2 = subredditDetail3.isTitleSafe();
                            }
                            sg2.e.c((Object)titleSafe2);
                            o2 = new UpdateSubredditTitleSafetyDto(g, (boolean)titleSafe2);
                        }
                    }
                }
                if (o2 != null) {
                    list2.add(o2);
                }
            }
            o3 = m.z(list2, c);
            if (o3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                o3 = hg2.j.a;
            }
        }
        else {
            o3 = hg2.j.a;
        }
        return o3;
    }
    
    public static void u0(final Listing listing, final ArrayList list) {
        final List children = listing.getChildren();
        final ArrayList list2 = new ArrayList<Pair>(m.c3((Iterable)children, 10));
        final Iterator iterator = children.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < 0) {
                lw0.b.I2();
                throw null;
            }
            list2.add(new Pair((Object)n, (Object)next));
            ++n;
        }
        final ArrayList<Pair> list3 = new ArrayList<Pair>();
        for (final Pair next2 : list2) {
            if (next2.getSecond() instanceof Link ^ true) {
                list3.add(next2);
            }
        }
        for (final Map.Entry<Number, V> entry : kotlin.collections.c.g1((List)list3).entrySet()) {
            if (entry.getKey().intValue() < list.size()) {
                list.add(entry.getKey().intValue(), entry.getValue());
            }
        }
    }
    
    public static Listing v0(Listing copy$default, final ua0.i i, final ua0.j j) {
        final Trace b = pi.b.b("LinkRepository.filter_generic_listing");
        if (i != null) {
            copy$default = Listing.copy$default(copy$default, i.a(copy$default.getChildren(), j), (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (Object)null);
        }
        b.stop();
        return copy$default;
    }
    
    public final ff2.a A(final String s) {
        sg2.e.f((Object)s, "id");
        return yd.b.i0(yg.a.z1((rg2.p)new RedditLinkRepository$markNsfw$1(this, s, (lg2.c)null)), (n20.d)this.a);
    }
    
    public final ff2.a B(final String s) {
        sg2.e.f((Object)s, "id");
        return yd.b.i0(this.b.modUnlockComments(s), (n20.d)this.a);
    }
    
    public final RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1 C(final String s) {
        sg2.e.f((Object)s, "kindWithId");
        return new RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1((hj2.e)this.E.c(s));
    }
    
    public final n<Link> D(final String s) {
        sg2.e.f((Object)s, "id");
        return (n<Link>)a92.b.a0(this.c.b(s), (n20.d)this.a);
    }
    
    public final ff2.c0<Map<String, Link>> E(final String s, final String s2, final String s3) {
        sg2.e.f((Object)s, "prefixedSubredditName");
        sg2.e.f((Object)s2, "linkId");
        final z50.j j = new z50.j(s, s2, s3);
        final Store value = this.g0.getValue();
        sg2.e.e((Object)value, "<get-postDuplicatesStore>(...)");
        final ff2.c0 value2 = value.get((Object)j);
        sg2.e.e((Object)value2, "postDuplicatesStore.get(key)");
        return nn0.a.V(value2, (n20.d)this.a);
    }
    
    public final Object F(final String s, final ModQueueSortingType modQueueSortingType, final String s2, final lg2.c<? super Listing<Link>> c) {
        return this.g.g(s, modQueueSortingType, s2, (lg2.c)c);
    }
    
    public final ff2.c0<Boolean> G(final String s, final String s2) {
        sg2.e.f((Object)s, "linkKindWithId");
        sg2.e.f((Object)s2, "linkId");
        final ff2.c0 p2 = this.g.u(s, HideState.NONE).p((kf2.o)new com.reddit.data.repository.l(this, s2, 2));
        sg2.e.e((Object)p2, "remoteGql.updatePostHide\u2026).toSingleDefault(resp) }");
        return nn0.a.V((ff2.c0)p2, (n20.d)this.a);
    }
    
    public final Object H(final String s, final VideoContext videoContext, final boolean b, final String s2, final lg2.c<? super Listing<Link>> c) {
        RedditLinkRepository$fetchRecommendedVideos$1 redditLinkRepository$fetchRecommendedVideos$2 = null;
        Label_0061: {
            if (c instanceof RedditLinkRepository$fetchRecommendedVideos$1) {
                final RedditLinkRepository$fetchRecommendedVideos$1 redditLinkRepository$fetchRecommendedVideos$1 = (RedditLinkRepository$fetchRecommendedVideos$1)c;
                final int label = redditLinkRepository$fetchRecommendedVideos$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$fetchRecommendedVideos$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$fetchRecommendedVideos$2 = redditLinkRepository$fetchRecommendedVideos$1;
                    break Label_0061;
                }
            }
            redditLinkRepository$fetchRecommendedVideos$2 = new RedditLinkRepository$fetchRecommendedVideos$1(this, (lg2.c)c);
        }
        final Object result = redditLinkRepository$fetchRecommendedVideos$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$fetchRecommendedVideos$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            l = result;
        }
        else {
            yd.b.k0(result);
            final z50.n n = new z50.n(s, videoContext, new zu.a(s2, ListingViewMode.IMMERSIVE, (zu.b)null, 4), 20);
            final mj2.a c2 = this.A.c();
            final RedditLinkRepository$fetchRecommendedVideos$2 redditLinkRepository$fetchRecommendedVideos$3 = new RedditLinkRepository$fetchRecommendedVideos$2(this, n, b, (lg2.c)null);
            redditLinkRepository$fetchRecommendedVideos$2.label = 1;
            if ((l = ej2.g.l((CoroutineContext)c2, (rg2.p)redditLinkRepository$fetchRecommendedVideos$3, (lg2.c)redditLinkRepository$fetchRecommendedVideos$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(l, "override suspend fun fet\u2026    }\n        }\n    }\n  }");
        return l;
    }
    
    public final Object I(final String s, final lg2.c<? super hg2.j> c) {
        final Object c2 = this.M.c(s, true, (lg2.c)c);
        if (c2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return c2;
        }
        return hg2.j.a;
    }
    
    public final Object J(final String s, final int n, final lg2.c<? super hg2.j> c) {
        return ej2.g.l((CoroutineContext)this.A.c(), (rg2.p)new RedditLinkRepository$saveGalleryPosition$2(this, s, n, (lg2.c)null), (lg2.c)c);
    }
    
    public final ff2.c0<Listing<ILink>> K(final DisplaySource displaySource, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final boolean b, final ListingViewMode listingViewMode, final String s3, final boolean b2, final Context context, final c c, final Integer n, final ua0.i<ILink> i, final ua0.j<ILink> j) {
        sg2.e.f((Object)sortType, "sort");
        sg2.e.f((Object)s3, "geoFilter");
        sg2.e.f((Object)context, "context");
        sg2.e.f((Object)c, "tracingFeatures");
        final boolean u2 = this.P.u2();
        final e2 e2 = new e2(displaySource, sortType, sortTimeFrame, s, n, (String)null, this.w0(s2), listingViewMode, (String)null, (String)null, (String)null, s3, b2, (String)null, (String)null, (ua0.i)i, (ua0.j)j, Boolean.valueOf(u2), 59168);
        ff2.c0<Object> c2;
        if (b && u2) {
            c2 = yd.b.b0((rg2.p)new RedditLinkRepository$getPopular$fetchFunction$1(this, e2, sortType, sortTimeFrame, s, s3, (lg2.c)null));
        }
        else if (b) {
            this.s.b("LinkRepository.process_popular_data");
            if (this.v.e()) {
                final ff2.c0 b3 = yd.b.b0((rg2.p)new RedditLinkRepository$getPopular$fetchFunction$result$1(b, this, sortType, sortTimeFrame, s3, listingViewMode, e2, (ua0.i)i, (ua0.j)j, (lg2.c)null));
                final com.reddit.data.repository.g g = new com.reddit.data.repository.g(this, sortType, sortTimeFrame, s, s3);
                b3.getClass();
                c2 = RxJavaPlugins.onAssembly(new h<Object>((ff2.g0<Object>)b3, (kf2.g<? super Object>)g));
            }
            else {
                final Store value = this.U.getValue();
                sg2.e.e((Object)value, "<get-popularLinkStore>(...)");
                c2 = value.j((Object)e2);
            }
            sg2.e.e((Object)c2, "override fun getPopular(\u2026eOn(backgroundThread)\n  }");
            this.s.e("LinkRepository.process_popular_data");
        }
        else {
            final Store value2 = this.U.getValue();
            sg2.e.e((Object)value2, "<get-popularLinkStore>(...)");
            c2 = value2.get((Object)e2);
            sg2.e.e((Object)c2, "{\n      popularLinkStore.get(requestKey)\n    }");
        }
        final ff2.c0<Object> w = c2.w((kf2.o<? super Object, ?>)new l0(this, 1));
        sg2.e.e((Object)w, "fetchFunction()\n      .m\u2026lterTopicRecommendations)");
        return nn0.a.V((ff2.c0)w, (n20.d)this.a);
    }
    
    public final ff2.c0 L(final String s, final String s2, final boolean b, final Context context, final c c, final String s3, final ua0.i i, final ua0.j j) {
        sg2.e.f((Object)s, "username");
        sg2.e.f((Object)context, "context");
        sg2.e.f((Object)c, "tracingFeatures");
        final e2 e2 = new e2((DisplaySource)null, (SortType)null, (SortTimeFrame)null, s2, (Integer)null, (String)null, (zu.a)null, (ListingViewMode)null, (String)null, (String)null, s, (String)null, false, s3, (String)null, i, j, (Boolean)null, 318455);
        ff2.c0 c2;
        if (b) {
            final Store value = this.Z.getValue();
            sg2.e.e((Object)value, "<get-savedPostsStore>(...)");
            final ff2.c0 k = value.j((Object)e2);
            final Store value2 = this.Z.getValue();
            sg2.e.e((Object)value2, "<get-savedPostsStore>(...)");
            c2 = k.z(value2.get((Object)e2));
        }
        else {
            final Store value3 = this.Z.getValue();
            sg2.e.e((Object)value3, "<get-savedPostsStore>(...)");
            c2 = value3.get((Object)e2);
        }
        sg2.e.e((Object)c2, "if (refresh) {\n      sav\u2026ore.get(requestKey)\n    }");
        return nn0.a.V((ff2.c0)c2, (n20.d)this.a);
    }
    
    public final ff2.a M() {
        return yd.b.i0(this.c.n(), (n20.d)this.a);
    }
    
    public final Object N(final Link link, final lg2.c<? super hg2.j> c) {
        final Object l = ej2.g.l((CoroutineContext)this.A.c(), (rg2.p)new RedditLinkRepository$updateCachedLink$2(this, link, (lg2.c)null), (lg2.c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return hg2.j.a;
    }
    
    public final ff2.c0 O(final String s, final LinkedHashMap linkedHashMap) {
        p$a.c(this.f, TrackerParams$TrackerType.Listing, RedditLinkRepository.class.getSimpleName(), (String)null, (String)null, this.G, this.H, 92).getClass();
        return nn0.a.V(this.b.getDiscoveryUnitListing(s, (Map)linkedHashMap, (String)null), (n20.d)this.a);
    }
    
    public final ff2.c0 P(final String s, final HistorySortType historySortType, final String s2, final boolean b, final Context context, final c c) {
        sg2.e.f((Object)s, "username");
        sg2.e.f((Object)historySortType, "sort");
        sg2.e.f((Object)context, "context");
        sg2.e.f((Object)c, "tracingFeatures");
        final z50.f f = new z50.f(s, historySortType, s2);
        ff2.c0 c2;
        if (b) {
            final Store value = this.W.getValue();
            sg2.e.e((Object)value, "<get-historyLinkStore>(...)");
            c2 = value.j((Object)f);
        }
        else {
            final Store value2 = this.W.getValue();
            sg2.e.e((Object)value2, "<get-historyLinkStore>(...)");
            c2 = value2.get((Object)f);
        }
        sg2.e.e((Object)c2, "if (refresh) historyLink\u2026LinkStore.get(requestKey)");
        return nn0.a.V(c2, (n20.d)this.a);
    }
    
    public final ff2.a Q(final String s, final DistinguishType distinguishType) {
        sg2.e.f((Object)s, "id");
        sg2.e.f((Object)distinguishType, "how");
        return yg.a.x1((CoroutineContext)this.A.c(), (rg2.p)new RedditLinkRepository$distinguish$1(this, s, distinguishType, false, (lg2.c)null));
    }
    
    public final ff2.a R(final String s) {
        sg2.e.f((Object)s, "id");
        return yd.b.i0(this.b.modMarkSpoiler(s), (n20.d)this.a);
    }
    
    public final n S(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        final n p3 = this.c.P(sortTimeFrame, sortType, s);
        final p0 p4 = new p0(4);
        p3.getClass();
        final ff2.n<Object> onAssembly = RxJavaPlugins.onAssembly((ff2.n<Object>)new io.reactivex.internal.operators.maybe.a((r)p3, (kf2.o)p4));
        sg2.e.e((Object)onAssembly, "localDb.getAllPopularLin\u2026isting.toILinkListing() }");
        final ff2.n<Object> onAssembly2 = RxJavaPlugins.onAssembly((ff2.n<Object>)new io.reactivex.internal.operators.maybe.a((r)vl.a.j((n)onAssembly, this.d), (kf2.o)new z50.r(2)));
        sg2.e.e((Object)onAssembly2, "localDb.getAllPopularLin\u2026listing.toLinkListing() }");
        return a92.b.a0((n)onAssembly2, (n20.d)this.a);
    }
    
    public final Object T(final String s, final od0.d d, final boolean b, final String s2, final lg2.c c) {
        RedditLinkRepository$getPredictionsTournamentPosts$1 redditLinkRepository$getPredictionsTournamentPosts$2 = null;
        Label_0061: {
            if (c instanceof RedditLinkRepository$getPredictionsTournamentPosts$1) {
                final RedditLinkRepository$getPredictionsTournamentPosts$1 redditLinkRepository$getPredictionsTournamentPosts$1 = (RedditLinkRepository$getPredictionsTournamentPosts$1)c;
                final int label = redditLinkRepository$getPredictionsTournamentPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$getPredictionsTournamentPosts$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$getPredictionsTournamentPosts$2 = redditLinkRepository$getPredictionsTournamentPosts$1;
                    break Label_0061;
                }
            }
            redditLinkRepository$getPredictionsTournamentPosts$2 = new RedditLinkRepository$getPredictionsTournamentPosts$1(this, c);
        }
        final Object result = redditLinkRepository$getPredictionsTournamentPosts$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$getPredictionsTournamentPosts$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            l = result;
        }
        else {
            yd.b.k0(result);
            final z50.k k = new z50.k(s, d, s2);
            final mj2.a c2 = this.A.c();
            final RedditLinkRepository$getPredictionsTournamentPosts$2 redditLinkRepository$getPredictionsTournamentPosts$3 = new RedditLinkRepository$getPredictionsTournamentPosts$2(b, this, k, (lg2.c)null);
            redditLinkRepository$getPredictionsTournamentPosts$2.label = 1;
            if ((l = ej2.g.l((CoroutineContext)c2, (rg2.p)redditLinkRepository$getPredictionsTournamentPosts$3, (lg2.c)redditLinkRepository$getPredictionsTournamentPosts$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(l, "override suspend fun get\u2026      }.await()\n    }\n  }");
        return l;
    }
    
    public final ff2.a U(final String s) {
        sg2.e.f((Object)s, "linkId");
        final ff2.a e = this.b.unsave(v10.v.d(s, ThingType.LINK)).e((ff2.e)this.c.unsave(s).t());
        sg2.e.e((Object)e, "remote.unsave(ThingUtil.\u2026inkId).onErrorComplete())");
        return yd.b.i0(e, (n20.d)this.a);
    }
    
    public final ff2.c0<Listing<Link>> V(final String s, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s2, final Integer n, final String s3, final boolean b, final ListingViewMode listingViewMode, final Context context, final c c, final String s4, final String s5, final ua0.i<Link> i, final ua0.j<Link> j) {
        sg2.e.f((Object)s, "subredditName");
        sg2.e.f((Object)context, "context");
        sg2.e.f((Object)c, "tracingFeatures");
        final e2 e2 = new e2((DisplaySource)null, sortType, sortTimeFrame, s2, n, (String)null, this.w0(s3), listingViewMode, s, (String)null, (String)null, (String)null, false, s4, s5, (ua0.i)i, (ua0.j)j, (Boolean)null, 286241);
        ff2.c0 c2;
        if (b) {
            final Store value = this.X.getValue();
            sg2.e.e((Object)value, "<get-subredditLinkStore>(...)");
            c2 = value.j((Object)e2);
        }
        else {
            final Store value2 = this.X.getValue();
            sg2.e.e((Object)value2, "<get-subredditLinkStore>(...)");
            c2 = value2.get((Object)e2);
        }
        sg2.e.e((Object)c2, "if (refresh) {\n      sub\u2026ore.get(requestKey)\n    }");
        return nn0.a.V(c2, (n20.d)this.a);
    }
    
    public final Object W(final Link l$1, final lg2.c<? super Boolean> c) {
        RedditLinkRepository$unsubscribeFromPost$1 redditLinkRepository$unsubscribeFromPost$2 = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$unsubscribeFromPost$1) {
                final RedditLinkRepository$unsubscribeFromPost$1 redditLinkRepository$unsubscribeFromPost$1 = (RedditLinkRepository$unsubscribeFromPost$1)c;
                final int label = redditLinkRepository$unsubscribeFromPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$unsubscribeFromPost$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$unsubscribeFromPost$2 = redditLinkRepository$unsubscribeFromPost$1;
                    break Label_0052;
                }
            }
            redditLinkRepository$unsubscribeFromPost$2 = new RedditLinkRepository$unsubscribeFromPost$1(this, (lg2.c)c);
        }
        Object o = redditLinkRepository$unsubscribeFromPost$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$unsubscribeFromPost$2.label;
        Link link;
        RedditLinkRepository redditLinkRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final boolean z$0 = redditLinkRepository$unsubscribeFromPost$2.Z$0;
                    yd.b.k0(o);
                    return z$0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                link = (Link)redditLinkRepository$unsubscribeFromPost$2.L$1;
                redditLinkRepository = (RedditLinkRepository)redditLinkRepository$unsubscribeFromPost$2.L$0;
                yd.b.k0(o);
            }
        }
        else {
            yd.b.k0(o);
            final RemoteGqlLinkDataSource g = this.g;
            final String kindWithId = l$1.getKindWithId();
            redditLinkRepository$unsubscribeFromPost$2.L$0 = this;
            redditLinkRepository$unsubscribeFromPost$2.L$1 = l$1;
            redditLinkRepository$unsubscribeFromPost$2.label = 1;
            o = g.t(kindWithId, (lg2.c)redditLinkRepository$unsubscribeFromPost$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            link = l$1;
            redditLinkRepository = this;
        }
        final boolean z$0 = (boolean)o;
        final ff2.a t = redditLinkRepository.c.c(link.getId()).t();
        sg2.e.e((Object)t, "localDb.unsubscribe(link\u2026\n      .onErrorComplete()");
        final ff2.a i0 = yd.b.i0(t, (n20.d)redditLinkRepository.a);
        redditLinkRepository$unsubscribeFromPost$2.L$0 = null;
        redditLinkRepository$unsubscribeFromPost$2.L$1 = null;
        redditLinkRepository$unsubscribeFromPost$2.Z$0 = z$0;
        redditLinkRepository$unsubscribeFromPost$2.label = 2;
        if (kotlinx.coroutines.rx2.d.a(i0, (lg2.c)redditLinkRepository$unsubscribeFromPost$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return z$0;
    }
    
    public final Object X(final String s, final lg2.c c) {
        RedditLinkRepository$getTopAwardedPosts$1 redditLinkRepository$getTopAwardedPosts$2 = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$getTopAwardedPosts$1) {
                final RedditLinkRepository$getTopAwardedPosts$1 redditLinkRepository$getTopAwardedPosts$1 = (RedditLinkRepository$getTopAwardedPosts$1)c;
                final int label = redditLinkRepository$getTopAwardedPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$getTopAwardedPosts$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$getTopAwardedPosts$2 = redditLinkRepository$getTopAwardedPosts$1;
                    break Label_0052;
                }
            }
            redditLinkRepository$getTopAwardedPosts$2 = new RedditLinkRepository$getTopAwardedPosts$1(this, c);
        }
        final Object result = redditLinkRepository$getTopAwardedPosts$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$getTopAwardedPosts$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            l = result;
        }
        else {
            yd.b.k0(result);
            final e2 e2 = new e2((DisplaySource)null, (SortType)null, (SortTimeFrame)null, (String)null, (Integer)null, (String)null, (zu.a)null, (ListingViewMode)null, (String)null, (String)null, (String)null, (String)null, false, s, (String)null, (ua0.i)null, (ua0.j)null, (Boolean)null, 516095);
            final mj2.a c2 = this.A.c();
            final RedditLinkRepository$getTopAwardedPosts$2 redditLinkRepository$getTopAwardedPosts$3 = new RedditLinkRepository$getTopAwardedPosts$2(false, this, e2, (lg2.c)null);
            redditLinkRepository$getTopAwardedPosts$2.label = 1;
            if ((l = ej2.g.l((CoroutineContext)c2, (rg2.p)redditLinkRepository$getTopAwardedPosts$3, (lg2.c)redditLinkRepository$getTopAwardedPosts$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(l, "override suspend fun get\u2026      }.await()\n    }\n  }");
        return l;
    }
    
    public final ff2.c0 Y(final String s, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s2, final String s3, final boolean b, final ListingViewMode listingViewMode, final Context context, final c c, final ua0.i i, final ua0.j j) {
        sg2.e.f((Object)s, "multiredditPath");
        sg2.e.f((Object)context, "context");
        sg2.e.f((Object)c, "tracingFeatures");
        final e2 e2 = new e2((DisplaySource)null, sortType, sortTimeFrame, s2, (Integer)null, s3, (zu.a)null, listingViewMode, (String)null, s, (String)null, (String)null, false, (String)null, (String)null, i, j, (Boolean)null, 318801);
        ff2.c0 c2;
        if (b) {
            final Store value = this.Y.getValue();
            sg2.e.e((Object)value, "<get-multiredditLinkStore>(...)");
            c2 = value.j((Object)e2);
        }
        else {
            final Store value2 = this.Y.getValue();
            sg2.e.e((Object)value2, "<get-multiredditLinkStore>(...)");
            c2 = value2.get((Object)e2);
        }
        sg2.e.e((Object)c2, "if (refresh) {\n      mul\u2026ore.get(requestKey)\n    }");
        return nn0.a.V(c2, (n20.d)this.a);
    }
    
    public final void Z() {
        final Store value = this.g0.getValue();
        sg2.e.e((Object)value, "<get-postDuplicatesStore>(...)");
        value.clear();
    }
    
    public final Object a(final String l$1, final lg2.c<? super UpdateResponse> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$unSave$1) {
                final RedditLinkRepository$unSave$1 redditLinkRepository$unSave$1 = (RedditLinkRepository$unSave$1)c;
                final int label = redditLinkRepository$unSave$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$unSave$1.label = label + Integer.MIN_VALUE;
                    o = redditLinkRepository$unSave$1;
                    break Label_0052;
                }
            }
            o = new RedditLinkRepository$unSave$1(this, (lg2.c)c);
        }
        Object o2 = ((RedditLinkRepository$unSave$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditLinkRepository$unSave$1)o).label;
        String s;
        RedditLinkRepository redditLinkRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final UpdateResponse updateResponse = (UpdateResponse)((RedditLinkRepository$unSave$1)o).L$0;
                    yd.b.k0(o2);
                    return updateResponse;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                s = (String)((RedditLinkRepository$unSave$1)o).L$1;
                redditLinkRepository = (RedditLinkRepository)((RedditLinkRepository$unSave$1)o).L$0;
                yd.b.k0(o2);
            }
        }
        else {
            yd.b.k0(o2);
            final RemoteGqlLinkDataSource g = this.g;
            final String d = v10.v.d(l$1, ThingType.LINK);
            ((RedditLinkRepository$unSave$1)o).L$0 = this;
            ((RedditLinkRepository$unSave$1)o).L$1 = l$1;
            ((RedditLinkRepository$unSave$1)o).label = 1;
            o2 = g.s(d, (lg2.c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            s = l$1;
            redditLinkRepository = this;
        }
        UpdateResponse updateResponse2;
        final UpdateResponse l$2 = updateResponse2 = (UpdateResponse)o2;
        if (!l$2.getSuccess()) {
            return updateResponse2;
        }
        final ff2.a t = redditLinkRepository.c.unsave(s).t();
        sg2.e.e((Object)t, "localDb.unsave(linkId).onErrorComplete()");
        ((RedditLinkRepository$unSave$1)o).L$0 = l$2;
        ((RedditLinkRepository$unSave$1)o).L$1 = null;
        ((RedditLinkRepository$unSave$1)o).label = 2;
        if (kotlinx.coroutines.rx2.d.a(t, (lg2.c)o) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final UpdateResponse updateResponse = l$2;
        updateResponse2 = updateResponse;
        return updateResponse2;
    }
    
    public final n a0(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        final g0 c = this.c;
        sg2.e.c((Object)s);
        return a92.b.a0(c.k(sortTimeFrame, sortType, s), (n20.d)this.a);
    }
    
    public final ff2.c0<Link> b(final String s) {
        sg2.e.f((Object)s, "id");
        final n b = this.c.b(s);
        final k0 k0 = new k0(this, 0);
        b.getClass();
        final ff2.n<Object> onAssembly = RxJavaPlugins.onAssembly((ff2.n<Object>)new io.reactivex.internal.operators.maybe.a((r)b, (kf2.o)k0));
        sg2.e.e((Object)onAssembly, "localDb.getLinkById(id)\n\u2026.map(::useUniqueIdForAds)");
        final n a0 = a92.b.a0((n)onAssembly, (n20.d)this.a);
        final ff2.c0 w = this.b.getLinksByIds(v10.v.d(s, ThingType.LINK)).w((kf2.o)new l0(this, 0));
        sg2.e.e((Object)w, "remote.getLinksByIds(Thi\u2026nk(it.children.first()) }");
        final ff2.c0 v = a0.v(nn0.a.V((ff2.c0)w, (n20.d)this.a));
        sg2.e.e((Object)v, "localDb.getLinkById(id)\n\u2026ackgroundThread),\n      )");
        return v;
    }
    
    public final ff2.c0<Boolean> b0(final String s, final String s2) {
        sg2.e.f((Object)s, "linkKindWithId");
        sg2.e.f((Object)s2, "linkId");
        final ff2.c0 p2 = this.g.u(s, HideState.HIDDEN).p((kf2.o)new com.reddit.accountutil.a(7, (Object)this, (Object)s2));
        sg2.e.e((Object)p2, "remoteGql.updatePostHide\u2026).toSingleDefault(resp) }");
        return nn0.a.V((ff2.c0)p2, (n20.d)this.a);
    }
    
    public final void c(final String s) {
        sg2.e.f((Object)s, "requestId");
        this.i.c(s);
    }
    
    public final Object c0(String string, String s, String g, boolean b, String s2, boolean b2, final rg2.l<? super Link, hg2.j> l, final lg2.c<? super Listing<Link>> c) {
        RedditLinkRepository$getDiscoverLinks$1 redditLinkRepository$getDiscoverLinks$1 = null;
        Label_0057: {
            if (c instanceof RedditLinkRepository$getDiscoverLinks$1) {
                redditLinkRepository$getDiscoverLinks$1 = (RedditLinkRepository$getDiscoverLinks$1)c;
                final int label = redditLinkRepository$getDiscoverLinks$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$getDiscoverLinks$1.label = label + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            redditLinkRepository$getDiscoverLinks$1 = new RedditLinkRepository$getDiscoverLinks$1(this, (lg2.c)c);
        }
        Object o = redditLinkRepository$getDiscoverLinks$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$getDiscoverLinks$1.label;
        Label_0955: {
            Link link = null;
            RedditLinkRepository redditLinkRepository2 = null;
            String s7 = null;
            String s8 = null;
            boolean b3 = false;
            String s9 = null;
            String s10 = null;
            boolean b4 = false;
            Label_0651: {
                String s4 = null;
                RedditLinkRepository redditLinkRepository = null;
                rg2.l<? super Link, hg2.j> k = null;
                String s11 = null;
                Link link3 = null;
                Label_0540: {
                    rg2.l<? super Link, hg2.j> i = null;
                    String s3 = null;
                    String s5 = null;
                    Label_0522: {
                        rg2.l<? super Link, hg2.j> j;
                        String s6;
                        if (label2 != 0) {
                            if (label2 != 1) {
                                if (label2 == 2) {
                                    b2 = redditLinkRepository$getDiscoverLinks$1.Z$1;
                                    b = redditLinkRepository$getDiscoverLinks$1.Z$0;
                                    i = (rg2.l)redditLinkRepository$getDiscoverLinks$1.L$5;
                                    s3 = (String)redditLinkRepository$getDiscoverLinks$1.L$4;
                                    s4 = (String)redditLinkRepository$getDiscoverLinks$1.L$3;
                                    s = (String)redditLinkRepository$getDiscoverLinks$1.L$2;
                                    s5 = (String)redditLinkRepository$getDiscoverLinks$1.L$1;
                                    redditLinkRepository = (RedditLinkRepository)redditLinkRepository$getDiscoverLinks$1.L$0;
                                    yd.b.k0(o);
                                    break Label_0522;
                                }
                                if (label2 == 3) {
                                    yd.b.k0(o);
                                    break Label_0955;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                b2 = redditLinkRepository$getDiscoverLinks$1.Z$1;
                                b = redditLinkRepository$getDiscoverLinks$1.Z$0;
                                j = (rg2.l)redditLinkRepository$getDiscoverLinks$1.L$5;
                                s2 = (String)redditLinkRepository$getDiscoverLinks$1.L$4;
                                g = (String)redditLinkRepository$getDiscoverLinks$1.L$3;
                                s = (String)redditLinkRepository$getDiscoverLinks$1.L$2;
                                s6 = (String)redditLinkRepository$getDiscoverLinks$1.L$1;
                                redditLinkRepository = (RedditLinkRepository)redditLinkRepository$getDiscoverLinks$1.L$0;
                                yd.b.k0(o);
                            }
                        }
                        else {
                            yd.b.k0(o);
                            if (s2 != null) {
                                link = null;
                                redditLinkRepository2 = this;
                                s7 = string;
                                s8 = s2;
                                b3 = b;
                                s9 = g;
                                s10 = s;
                                b4 = b2;
                                break Label_0651;
                            }
                            if (b) {
                                redditLinkRepository$getDiscoverLinks$1.L$0 = this;
                                redditLinkRepository$getDiscoverLinks$1.L$1 = string;
                                redditLinkRepository$getDiscoverLinks$1.L$2 = s;
                                redditLinkRepository$getDiscoverLinks$1.L$3 = g;
                                redditLinkRepository$getDiscoverLinks$1.L$4 = s2;
                                redditLinkRepository$getDiscoverLinks$1.L$5 = l;
                                redditLinkRepository$getDiscoverLinks$1.Z$0 = b;
                                redditLinkRepository$getDiscoverLinks$1.Z$1 = b2;
                                redditLinkRepository$getDiscoverLinks$1.label = 1;
                                final Object x0 = this.x0(s, (lg2.c<? super Link>)redditLinkRepository$getDiscoverLinks$1);
                                if (x0 == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                s6 = string;
                                redditLinkRepository = this;
                                o = x0;
                                j = l;
                            }
                            else {
                                final ff2.c0<Link> b5 = this.b(s);
                                redditLinkRepository$getDiscoverLinks$1.L$0 = this;
                                redditLinkRepository$getDiscoverLinks$1.L$1 = string;
                                redditLinkRepository$getDiscoverLinks$1.L$2 = s;
                                redditLinkRepository$getDiscoverLinks$1.L$3 = g;
                                redditLinkRepository$getDiscoverLinks$1.L$4 = s2;
                                redditLinkRepository$getDiscoverLinks$1.L$5 = l;
                                redditLinkRepository$getDiscoverLinks$1.Z$0 = b;
                                redditLinkRepository$getDiscoverLinks$1.Z$1 = b2;
                                redditLinkRepository$getDiscoverLinks$1.label = 2;
                                final Object b6 = kotlinx.coroutines.rx2.d.b((ff2.c0)b5, (lg2.c)redditLinkRepository$getDiscoverLinks$1);
                                if (b6 == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                s5 = string;
                                redditLinkRepository = this;
                                o = b6;
                                i = l;
                                s3 = s2;
                                s4 = g;
                                break Label_0522;
                            }
                        }
                        final Link link2 = (Link)o;
                        s4 = g;
                        g = s2;
                        k = j;
                        s11 = s6;
                        link3 = link2;
                        break Label_0540;
                    }
                    link3 = (Link)o;
                    s11 = s5;
                    k = i;
                    g = s3;
                }
                b4 = b2;
                s10 = s;
                s9 = s4;
                b3 = b;
                s8 = g;
                s7 = s11;
                link = link3;
                redditLinkRepository2 = redditLinkRepository;
                if (k != null) {
                    sg2.e.e((Object)link3, "it");
                    k.invoke(link3);
                    b4 = b2;
                    s10 = s;
                    s9 = s4;
                    b3 = b;
                    s8 = g;
                    s7 = s11;
                    link = link3;
                    redditLinkRepository2 = redditLinkRepository;
                }
            }
            g = aw.b.g(s7, '_', s10);
            if (!b4 && redditLinkRepository2.c0.containsKey(g)) {
                final Object value = redditLinkRepository2.c0.get(g);
                sg2.e.c(value);
                string = (String)value;
            }
            else {
                string = UUID.randomUUID().toString();
                final LinkedHashMap c2 = redditLinkRepository2.c0;
                sg2.e.e((Object)string, "it");
                c2.put(g, string);
            }
            final z50.d d = new z50.d(s7, s8, link, s9, string);
            ff2.c0 c3;
            if (link != null) {
                final Object value2 = redditLinkRepository2.d0.getValue();
                sg2.e.e(value2, "<get-discoverTopicLinksStore>(...)");
                c3 = ((Store)value2).get((Object)d).w((kf2.o)new com.reddit.data.repository.b(link, 1));
            }
            else {
                final Object value3 = redditLinkRepository2.d0.getValue();
                sg2.e.e(value3, "<get-discoverTopicLinksStore>(...)");
                c3 = ((Store)value3).get((Object)d);
            }
            sg2.e.e((Object)c3, "if (firstLink != null) {\u2026ore.get(requestKey)\n    }");
            ff2.c0 z = c3;
            if (b3) {
                final Object value4 = redditLinkRepository2.d0.getValue();
                sg2.e.e(value4, "<get-discoverTopicLinksStore>(...)");
                z = ((Store)value4).j((Object)d).z(c3);
            }
            sg2.e.e((Object)z, "if (refresh) {\n      dis\u2026   getWithFirstLink\n    }");
            final ff2.c0 v = nn0.a.V((ff2.c0)z, (n20.d)redditLinkRepository2.a);
            redditLinkRepository$getDiscoverLinks$1.L$0 = null;
            redditLinkRepository$getDiscoverLinks$1.L$1 = null;
            redditLinkRepository$getDiscoverLinks$1.L$2 = null;
            redditLinkRepository$getDiscoverLinks$1.L$3 = null;
            redditLinkRepository$getDiscoverLinks$1.L$4 = null;
            redditLinkRepository$getDiscoverLinks$1.L$5 = null;
            redditLinkRepository$getDiscoverLinks$1.label = 3;
            if ((o = kotlinx.coroutines.rx2.d.b(v, (lg2.c)redditLinkRepository$getDiscoverLinks$1)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(o, "fetchFunction()\n      .s\u2026backgroundThread).await()");
        return o;
    }
    
    public final ff2.a d(final String s) {
        sg2.e.f((Object)s, "linkId");
        return yd.b.i0(this.c.d(s), (n20.d)this.a);
    }
    
    public final hg2.j d0(final String s, final VoteDirection voteDirection) {
        this.E.a(voteDirection.getValue(), s);
        return hg2.j.a;
    }
    
    public final ff2.c0<Boolean> delete(final String s) {
        sg2.e.f((Object)s, "linkId");
        final RemoteGqlLinkDataSource g = this.g;
        g.getClass();
        final ff2.c0 w = e$a.a((mr0.e)g.a, (h7.k)new k2(new m0(s)), (OkHttpClient)null, (Map)null, 14).w((kf2.o)new b40.m(6));
        sg2.e.e((Object)w, "graphQlClient.execute(\n \u2026deletePost?.ok ?: false }");
        final ff2.c0<Object> onAssembly = RxJavaPlugins.onAssembly((ff2.c0<Object>)new SingleFlatMap((ff2.g0)nn0.a.V((ff2.c0)w, (n20.d)this.a), (kf2.o)new com.reddit.data.repository.l(this, s, 1)));
        sg2.e.e((Object)onAssembly, "remoteGql.delete(linkId \u2026gle.just(deleted)\n      }");
        return (ff2.c0<Boolean>)onAssembly;
    }
    
    public final ff2.a e() {
        final ff2.a t = this.c.o().t();
        sg2.e.e((Object)t, "localDb.clearExpiredMutations().onErrorComplete()");
        return yd.b.i0(t, (n20.d)this.a);
    }
    
    public final ff2.a e0(final String s, final VoteDirection voteDirection) {
        sg2.e.f((Object)s, "kindWithId");
        sg2.e.f((Object)voteDirection, "direction");
        return yd.b.i0(this.b.vote(s, voteDirection.getValue()), (n20.d)this.a);
    }
    
    public final Object f(final String s, final VoteDirection voteDirection, final lg2.c<? super UpdateResponse> c) {
        return this.g.v(s, voteDirection, (lg2.c)c);
    }
    
    public final ff2.a f0(final String s) {
        sg2.e.f((Object)s, "linkId");
        final ff2.a e = this.b.save(v10.v.d(s, ThingType.LINK)).e((ff2.e)this.c.save(s).t());
        sg2.e.e((Object)e, "remote.save(ThingUtil.pr\u2026inkId).onErrorComplete())");
        return yd.b.i0(e, (n20.d)this.a);
    }
    
    public final ff2.a follow(final String s, final boolean b) {
        sg2.e.f((Object)s, "linkId");
        final ff2.a e = this.b.follow(v10.v.d(s, ThingType.LINK), b).e((ff2.e)this.c.follow(s, b).t());
        sg2.e.e((Object)e, "remote.follow(ThingUtil.\u2026ollow).onErrorComplete())");
        return yd.b.i0(e, (n20.d)this.a);
    }
    
    public final RedditLinkRepository$getLinkStreamById$$inlined$map$1 g(final String s) {
        sg2.e.f((Object)s, "linkId");
        return new RedditLinkRepository$getLinkStreamById$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1((hj2.e)this.c.I(s), (q)new RedditLinkRepository$getLinkStreamById$1(this, (lg2.c)null)), this, s);
    }
    
    public final VoteDirection g0(final String s) {
        sg2.e.f((Object)s, "kindWithId");
        final Integer b = this.E.b(s);
        VoteDirection fromInt;
        if (b != null) {
            fromInt = VoteDirection.Companion.fromInt(b.intValue());
        }
        else {
            fromInt = null;
        }
        return fromInt;
    }
    
    public final Object getLinkTitle(final String s, final lg2.c<? super String> c) {
        return ej2.g.l((CoroutineContext)this.A.c(), (rg2.p)new RedditLinkRepository$getLinkTitle$2(this, s, (lg2.c)null), (lg2.c)c);
    }
    
    public final Object h(final String l$1, final lg2.c<? super UpdateResponse> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$save$1) {
                final RedditLinkRepository$save$1 redditLinkRepository$save$1 = (RedditLinkRepository$save$1)c;
                final int label = redditLinkRepository$save$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$save$1.label = label + Integer.MIN_VALUE;
                    o = redditLinkRepository$save$1;
                    break Label_0052;
                }
            }
            o = new RedditLinkRepository$save$1(this, (lg2.c)c);
        }
        Object o2 = ((RedditLinkRepository$save$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditLinkRepository$save$1)o).label;
        String s;
        RedditLinkRepository redditLinkRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final UpdateResponse updateResponse = (UpdateResponse)((RedditLinkRepository$save$1)o).L$0;
                    yd.b.k0(o2);
                    return updateResponse;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                s = (String)((RedditLinkRepository$save$1)o).L$1;
                redditLinkRepository = (RedditLinkRepository)((RedditLinkRepository$save$1)o).L$0;
                yd.b.k0(o2);
            }
        }
        else {
            yd.b.k0(o2);
            final RemoteGqlLinkDataSource g = this.g;
            final String d = v10.v.d(l$1, ThingType.LINK);
            ((RedditLinkRepository$save$1)o).L$0 = this;
            ((RedditLinkRepository$save$1)o).L$1 = l$1;
            ((RedditLinkRepository$save$1)o).label = 1;
            o2 = g.q(d, (lg2.c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            s = l$1;
            redditLinkRepository = this;
        }
        UpdateResponse updateResponse2;
        final UpdateResponse l$2 = updateResponse2 = (UpdateResponse)o2;
        if (!l$2.getSuccess()) {
            return updateResponse2;
        }
        final ff2.a t = redditLinkRepository.c.save(s).t();
        sg2.e.e((Object)t, "localDb.save(linkId).onErrorComplete()");
        ((RedditLinkRepository$save$1)o).L$0 = l$2;
        ((RedditLinkRepository$save$1)o).L$1 = null;
        ((RedditLinkRepository$save$1)o).label = 2;
        if (kotlinx.coroutines.rx2.d.a(t, (lg2.c)o) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final UpdateResponse updateResponse = l$2;
        updateResponse2 = updateResponse;
        return updateResponse2;
    }
    
    public final ff2.a h0(final String s, final boolean b) {
        sg2.e.f((Object)s, "id");
        return yg.a.z1((rg2.p)new RedditLinkRepository$remove$1(this, s, b, (lg2.c)null));
    }
    
    public final ff2.c0 i(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final boolean b, final ListingViewMode listingViewMode, final String s3, final Context context, final c c, final List list, final Integer n, final ua0.i i, final ua0.j j, final boolean b2) {
        sg2.e.f((Object)context, "context");
        sg2.e.f((Object)c, "tracingFeatures");
        final n k = vl.a.j(a4.a0.y0((CoroutineContext)ej2.j0.b, (rg2.p)new RedditLinkRepository$getHomeLinksInternalMaybe$1(this, sortType, sortTimeFrame, s, (lg2.c)null)), this.d);
        this.s.b("LinkRepository.getFrontpage_network_fetch");
        final String l = this.t.L();
        final String j2 = this.t.j0();
        final String e = this.t.e();
        d0 d0;
        if ((l == null || cj2.j.H0((CharSequence)l)) && (j2 == null || cj2.j.H0((CharSequence)j2)) && (e == null || cj2.j.H0((CharSequence)e))) {
            d0 = null;
        }
        else {
            List n2;
            if (e != null) {
                n2 = kotlin.text.b.n1((CharSequence)e, new String[] { "," });
            }
            else {
                n2 = null;
            }
            d0 = new d0(h7.h.a.c(n2), h7.h.a.c(l), h7.h.a.c(j2));
        }
        final FeedNotificationsVariant d2 = this.D.D9();
        String variant;
        if (d2 != null) {
            variant = d2.getVariant();
        }
        else {
            variant = null;
        }
        x1 x1;
        if (variant != null) {
            x1 = new x1(h7.h.a.c(variant));
        }
        else {
            x1 = null;
        }
        final ff2.c0<Object> onAssembly = RxJavaPlugins.onAssembly(new h<Object>((ff2.g0<Object>)ej2.c0.u4(RemoteGqlLinkDataSource.d(this.g, sortType, sortTimeFrame, s, this.w0(s2), listingViewMode, this.e.c(), s3, list, this.n.o(), n, d0, x1, b2, 64), RedditEndpoint.HomePosts, this.f, this.F, this.Q, this.R, this.S), (kf2.g<? super Object>)new com.reddit.data.repository.j(this, 1)));
        sg2.e.e((Object)onAssembly, "remoteGql.getHomeLinks(\n\u2026E_SUBREDDIT_TITLES)\n    }");
        final boolean b3 = b && sortType != null && this.J.c(sortType, sortTimeFrame, listingViewMode);
        ff2.c0<Object> onAssembly2 = onAssembly;
        if (b3) {
            final ff2.c0 b4 = yd.b.b0((rg2.p)new RedditLinkRepository$getHome$remoteOrPreload$1(this, (lg2.c)null));
            final z50.m0 m0 = new z50.m0((ff2.c0)onAssembly, 0);
            b4.getClass();
            final ff2.c0<Object> onAssembly3 = RxJavaPlugins.onAssembly((ff2.c0<Object>)new SingleFlatMap((ff2.g0)b4, (kf2.o)m0));
            final z50.n0 n3 = new z50.n0(this);
            onAssembly3.getClass();
            onAssembly2 = RxJavaPlugins.onAssembly((ff2.c0<Object>)new SingleDoFinally((ff2.g0)onAssembly3, (kf2.a)n3));
        }
        final o0 o0 = new o0(this, i, j, k, sortType, sortTimeFrame, s);
        onAssembly2.getClass();
        final ff2.c0<Object> onAssembly4 = RxJavaPlugins.onAssembly((ff2.c0<Object>)new SingleFlatMap((ff2.g0)onAssembly2, (kf2.o)o0));
        final p1 p14 = new p1(1);
        onAssembly4.getClass();
        ff2.c0<Object> c2 = RxJavaPlugins.onAssembly(new uf2.e<Object>((ff2.g0<Object>)onAssembly4, (kf2.g<? super Throwable>)p14));
        sg2.e.e((Object)c2, "override fun getHome(\n  \u2026eOn(backgroundThread)\n  }");
        if (!b) {
            c2 = k.e((r)c2.M()).firstOrError();
        }
        final ff2.c0<Object> w = c2.w((kf2.o<? super Object, ?>)new k0(this, 1));
        sg2.e.e((Object)w, "if (refresh) {\n        r\u2026lterTopicRecommendations)");
        return nn0.a.V((ff2.c0)w, (n20.d)this.a);
    }
    
    public final ff2.a i0(final String s) {
        sg2.e.f((Object)s, "id");
        return yg.a.z1((rg2.p)new RedditLinkRepository$approve$1(this, s, (lg2.c)null));
    }
    
    public final Object j(final String s, final lg2.c<? super Listing<Link>> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$getAllLocalDiscoverLinks$1) {
                final RedditLinkRepository$getAllLocalDiscoverLinks$1 redditLinkRepository$getAllLocalDiscoverLinks$1 = (RedditLinkRepository$getAllLocalDiscoverLinks$1)c;
                final int label = redditLinkRepository$getAllLocalDiscoverLinks$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$getAllLocalDiscoverLinks$1.label = label + Integer.MIN_VALUE;
                    o = redditLinkRepository$getAllLocalDiscoverLinks$1;
                    break Label_0052;
                }
            }
            o = new RedditLinkRepository$getAllLocalDiscoverLinks$1(this, (lg2.c)c);
        }
        final Object result = ((RedditLinkRepository$getAllLocalDiscoverLinks$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditLinkRepository$getAllLocalDiscoverLinks$1)o).label;
        Object g;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            g = result;
        }
        else {
            yd.b.k0(result);
            final n a0 = a92.b.a0(this.c.F(s, (String)null), (n20.d)this.a);
            ((RedditLinkRepository$getAllLocalDiscoverLinks$1)o).label = 1;
            if ((g = kotlinx.coroutines.rx2.d.g(a0, (lg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        Listing listing;
        if ((listing = (Listing)g) == null) {
            listing = new Listing((List)EmptyList.INSTANCE, (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (DefaultConstructorMarker)null);
        }
        return listing;
    }
    
    public final ff2.c0<Listing<Link>> j0(final List<String> list) {
        sg2.e.f((Object)list, "ids");
        final ff2.c0 w = this.b.getLinksByIds(CollectionsKt___CollectionsKt.I3((Iterable)list, (CharSequence)",", (String)null, (String)null, (rg2.l)null, 62)).w((kf2.o)new hf0.g((Object)this, 0));
        sg2.e.e((Object)w, "remote.getLinksByIds(\n  \u2026apRemoteLink(it) })\n    }");
        return nn0.a.V((ff2.c0)w, (n20.d)this.a);
    }
    
    public final n<Listing<Link>> k() {
        return (n<Listing<Link>>)a92.b.a0(this.c.S(), (n20.d)this.a);
    }
    
    public final n<Listing<Link>> k0(final String s) {
        return (n<Listing<Link>>)a92.b.a0(this.c.v(s), (n20.d)this.a);
    }
    
    public final ff2.c0 l(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final String s3) {
        sg2.e.f((Object)s, "username");
        sg2.e.f((Object)sortType, "sort");
        final UserLinkKey userLinkKey = new UserLinkKey(sortType, sortTimeFrame, s, s2, s3);
        final Store value = this.T.getValue();
        sg2.e.e((Object)value, "<get-submittedStore>(...)");
        final ff2.c0 value2 = value.get((Object)userLinkKey);
        sg2.e.e((Object)value2, "submittedStore.get(linkKey)");
        ff2.c0 c0;
        if (s2 == null) {
            final ff2.c0 v = nn0.a.V(value2, (n20.d)this.a);
            final ff2.c0 x = this.i.d().q((kf2.o)new z50.r(1)).g((Object)EmptyList.INSTANCE).x();
            sg2.e.e((Object)x, "localVideoDataSource.get\u2026())\n          .toSingle()");
            final ff2.c0<Object> q = ff2.c0.Q((ff2.g0<?>)v, (ff2.g0<?>)x, (kf2.c<? super Object, ? super Object, ?>)new mf1.a());
            sg2.e.b((Object)q, "zipWith(other, BiFunctio\u2026-> zipper.invoke(t, u) })");
            c0 = nn0.a.V((ff2.c0)q, (n20.d)this.a);
        }
        else {
            final ff2.c0 w = value2.w((kf2.o)new z50.s(1));
            sg2.e.e((Object)w, "get.map { toSubmittedListing(it, listOf()) }");
            c0 = nn0.a.V((ff2.c0)w, (n20.d)this.a);
        }
        return c0;
    }
    
    public final n<Listing<Link>> l0(final SortType sortType, final SortTimeFrame sortTimeFrame) {
        final n o = this.c.K(sortType, sortTimeFrame).o((kf2.o)new f0(2));
        sg2.e.e((Object)o, "localDb.getAllHomeLinks(\u2026isting.toILinkListing() }");
        final n o2 = vl.a.j(o, this.d).o((kf2.o)new q0(3));
        sg2.e.e((Object)o2, "localDb.getAllHomeLinks(\u2026listing.toLinkListing() }");
        return (n<Listing<Link>>)a92.b.a0(o2, (n20.d)this.a);
    }
    
    public final n<Listing<Link>> m(final String s) {
        return (n<Listing<Link>>)a92.b.a0(this.c.z(s), (n20.d)this.a);
    }
    
    public final ff2.a n(final String s) {
        sg2.e.f((Object)s, "id");
        return yd.b.i0(this.b.modUnMarkSpoiler(s), (n20.d)this.a);
    }
    
    public final Object o(final Link l$1, final lg2.c<? super Boolean> c) {
        RedditLinkRepository$subscribeToPost$1 redditLinkRepository$subscribeToPost$2 = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$subscribeToPost$1) {
                final RedditLinkRepository$subscribeToPost$1 redditLinkRepository$subscribeToPost$1 = (RedditLinkRepository$subscribeToPost$1)c;
                final int label = redditLinkRepository$subscribeToPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$subscribeToPost$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$subscribeToPost$2 = redditLinkRepository$subscribeToPost$1;
                    break Label_0052;
                }
            }
            redditLinkRepository$subscribeToPost$2 = new RedditLinkRepository$subscribeToPost$1(this, (lg2.c)c);
        }
        Object o = redditLinkRepository$subscribeToPost$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$subscribeToPost$2.label;
        Link link;
        RedditLinkRepository redditLinkRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final boolean z$0 = redditLinkRepository$subscribeToPost$2.Z$0;
                    yd.b.k0(o);
                    return z$0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                link = (Link)redditLinkRepository$subscribeToPost$2.L$1;
                redditLinkRepository = (RedditLinkRepository)redditLinkRepository$subscribeToPost$2.L$0;
                yd.b.k0(o);
            }
        }
        else {
            yd.b.k0(o);
            final RemoteGqlLinkDataSource g = this.g;
            final String kindWithId = l$1.getKindWithId();
            redditLinkRepository$subscribeToPost$2.L$0 = this;
            redditLinkRepository$subscribeToPost$2.L$1 = l$1;
            redditLinkRepository$subscribeToPost$2.label = 1;
            o = g.r(kindWithId, (lg2.c)redditLinkRepository$subscribeToPost$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            link = l$1;
            redditLinkRepository = this;
        }
        final boolean z$0 = (boolean)o;
        final ff2.a t = redditLinkRepository.c.e(link.getId()).t();
        sg2.e.e((Object)t, "localDb.subscribe(link.i\u2026\n      .onErrorComplete()");
        final ff2.a i0 = yd.b.i0(t, (n20.d)redditLinkRepository.a);
        redditLinkRepository$subscribeToPost$2.L$0 = null;
        redditLinkRepository$subscribeToPost$2.L$1 = null;
        redditLinkRepository$subscribeToPost$2.Z$0 = z$0;
        redditLinkRepository$subscribeToPost$2.label = 2;
        if (kotlinx.coroutines.rx2.d.a(i0, (lg2.c)redditLinkRepository$subscribeToPost$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return z$0;
    }
    
    public final Object p(final String s, final lg2.c<? super hg2.j> c) {
        final Object c2 = this.M.c(s, false, (lg2.c)c);
        if (c2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return c2;
        }
        return hg2.j.a;
    }
    
    public final Object q(final String s, final VideoContext videoContext, final boolean b, final FbpMediaType fbpMediaType, final lg2.c<? super Listing<Link>> c) {
        RedditLinkRepository$fetchRecommendedMedia$1 redditLinkRepository$fetchRecommendedMedia$2 = null;
        Label_0061: {
            if (c instanceof RedditLinkRepository$fetchRecommendedMedia$1) {
                final RedditLinkRepository$fetchRecommendedMedia$1 redditLinkRepository$fetchRecommendedMedia$1 = (RedditLinkRepository$fetchRecommendedMedia$1)c;
                final int label = redditLinkRepository$fetchRecommendedMedia$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$fetchRecommendedMedia$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$fetchRecommendedMedia$2 = redditLinkRepository$fetchRecommendedMedia$1;
                    break Label_0061;
                }
            }
            redditLinkRepository$fetchRecommendedMedia$2 = new RedditLinkRepository$fetchRecommendedMedia$1(this, (lg2.c)c);
        }
        final Object result = redditLinkRepository$fetchRecommendedMedia$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$fetchRecommendedMedia$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            l = result;
        }
        else {
            yd.b.k0(result);
            final z50.m m = new z50.m(s, videoContext, fbpMediaType);
            final mj2.a c2 = this.A.c();
            final RedditLinkRepository$fetchRecommendedMedia$2 redditLinkRepository$fetchRecommendedMedia$3 = new RedditLinkRepository$fetchRecommendedMedia$2(this, m, b, (lg2.c)null);
            redditLinkRepository$fetchRecommendedMedia$2.label = 1;
            if ((l = ej2.g.l((CoroutineContext)c2, (rg2.p)redditLinkRepository$fetchRecommendedMedia$3, (lg2.c)redditLinkRepository$fetchRecommendedMedia$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(l, "override suspend fun fet\u2026   it\n        }\n    }\n  }");
        return l;
    }
    
    public final n r(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        return a92.b.a0(this.c.w(sortTimeFrame, sortType, s), (n20.d)this.a);
    }
    
    public final ff2.a s(final String s) {
        sg2.e.f((Object)s, "id");
        return yd.b.i0(this.b.modLockComments(s), (n20.d)this.a);
    }
    
    public final ff2.a sendRemovalMessage(final ContentRemovalMessage contentRemovalMessage) {
        return yd.b.i0(this.b.sendRemovalMessage(contentRemovalMessage), (n20.d)this.a);
    }
    
    public final ff2.a sendRemovalReason(final RemovalReason removalReason) {
        return yd.b.i0(this.b.sendRemovalReason(removalReason), (n20.d)this.a);
    }
    
    public final ff2.c0 t(final ArrayList list) {
        final ff2.c0 w = this.c.C(list).w((kf2.o)new k0(this, 2));
        sg2.e.e((Object)w, "localDb.getLinksById(ids\u2026seUniqueIdForAds)\n      }");
        return nn0.a.V((ff2.c0)w, (n20.d)this.a);
    }
    
    public final ff2.a u(final String s) {
        sg2.e.f((Object)s, "id");
        return yd.b.i0(yg.a.z1((rg2.p)new RedditLinkRepository$unMarkNsfw$1(this, s, (lg2.c)null)), (n20.d)this.a);
    }
    
    public final Object v(final Link link, final String s, final boolean b, final boolean b2, final lg2.c<? super Result<Link>> c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RedditLinkRepository$edit$1) {
                final RedditLinkRepository$edit$1 redditLinkRepository$edit$1 = (RedditLinkRepository$edit$1)c;
                final int label = redditLinkRepository$edit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$edit$1.label = label + Integer.MIN_VALUE;
                    o = redditLinkRepository$edit$1;
                    break Label_0061;
                }
            }
            o = new RedditLinkRepository$edit$1(this, (lg2.c)c);
        }
        Object o2 = ((RedditLinkRepository$edit$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditLinkRepository$edit$1)o).label;
        Label_0424: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        yd.b.k0(o2);
                        break Label_0424;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    yd.b.k0(o2);
                }
            }
            else {
                yd.b.k0(o2);
                if (this.I.Z8()) {
                    ((RedditLinkRepository$edit$1)o).label = 1;
                    if ((o2 = ej2.g.e((rg2.p)new RedditLinkRepository$editGql$2(link, b, this, b2, s, (lg2.c)null), (lg2.c)o)) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                else {
                    final String id = link.getId();
                    final String d = v10.v.d(id, ThingType.LINK);
                    ff2.a a;
                    if (b) {
                        a = this.b.modMarkNsfw(d);
                    }
                    else {
                        a = this.b.modUnMarkNsfw(d);
                    }
                    ff2.a a2;
                    if (b2) {
                        a2 = this.b.modMarkSpoiler(d);
                    }
                    else {
                        a2 = this.b.modUnMarkSpoiler(d);
                    }
                    final Boolean true = Boolean.TRUE;
                    final ff2.c0<Boolean> b3 = a.B(true);
                    sg2.e.e((Object)b3, "markNsfw.toSingleDefault(true)");
                    final ff2.c0 v = nn0.a.V((ff2.c0)b3, (n20.d)this.a);
                    final ff2.c0<Boolean> b4 = a2.B(true);
                    sg2.e.e((Object)b4, "markSpoiler.toSingleDefault(true)");
                    final ff2.c0<Object> p5 = ff2.c0.P(v, nn0.a.V((ff2.c0)b4, (n20.d)this.a), nn0.a.V(this.b.edit(d, s, "json"), (n20.d)this.a), (kf2.h)new i51.f());
                    final i0 i0 = new i0(this, id, b, b2);
                    p5.getClass();
                    final ff2.c0<Object> onAssembly = RxJavaPlugins.onAssembly((ff2.c0<Object>)new SingleFlatMap((ff2.g0)p5, (kf2.o)i0));
                    sg2.e.e((Object)onAssembly, "zip(\n      markNsfw.toSi\u2026)\n        }\n      }\n    }");
                    final ff2.c0 v2 = nn0.a.V((ff2.c0)onAssembly, (n20.d)this.a);
                    ((RedditLinkRepository$edit$1)o).label = 2;
                    if ((o2 = kotlinx.coroutines.rx2.d.b(v2, (lg2.c)o)) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    break Label_0424;
                }
            }
            return o2;
        }
        sg2.e.e(o2, "{\n      editLegacy(link.\u2026 isSpoiler).await()\n    }");
        return o2;
    }
    
    public final ff2.c0<List<Link>> w(final String s) {
        sg2.e.f((Object)s, "subredditName");
        final RemoteGqlLinkDataSource g = this.g;
        g.getClass();
        final ff2.c0 w = e$a.a((mr0.e)g.a, (h7.k)new lb(a81.e.k(g.j), s), (OkHttpClient)null, (Map)null, 14).w((kf2.o)new su.e((Object)g, 8));
        sg2.e.e((Object)w, "graphQlClient\n      .exe\u2026 } ?: emptyList()\n      }");
        final ff2.c0 w2 = w.w((kf2.o)new z50.o((Object)this, 2));
        sg2.e.e((Object)w2, "remoteGql.getSubredditSt\u2026it.map(::mapRemoteLink) }");
        return nn0.a.V((ff2.c0)w2, (n20.d)this.a);
    }
    
    public final zu.a w0(final String s) {
        zu.a a;
        if (this.w.ob()) {
            a = (zu.a)ej2.g.k((rg2.p)new RedditLinkRepository$fetchAdContext$1(this, s, (lg2.c)null));
        }
        else {
            a = new zu.a(s, (ListingViewMode)null, (zu.b)null, 6);
        }
        return a;
    }
    
    public final ff2.a x(final String s) {
        sg2.e.f((Object)s, "id");
        return yd.b.i0(this.b.modUncollapseComment(s), (n20.d)this.a);
    }
    
    public final Object x0(final String s, final lg2.c<? super Link> c) {
        RedditLinkRepository$fetchLinkFromRemote$1 redditLinkRepository$fetchLinkFromRemote$2 = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$fetchLinkFromRemote$1) {
                final RedditLinkRepository$fetchLinkFromRemote$1 redditLinkRepository$fetchLinkFromRemote$1 = (RedditLinkRepository$fetchLinkFromRemote$1)c;
                final int label = redditLinkRepository$fetchLinkFromRemote$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$fetchLinkFromRemote$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$fetchLinkFromRemote$2 = redditLinkRepository$fetchLinkFromRemote$1;
                    break Label_0052;
                }
            }
            redditLinkRepository$fetchLinkFromRemote$2 = new RedditLinkRepository$fetchLinkFromRemote$1(this, (lg2.c)c);
        }
        final Object result = redditLinkRepository$fetchLinkFromRemote$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$fetchLinkFromRemote$2.label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            b = result;
        }
        else {
            yd.b.k0(result);
            final ff2.c0 w = this.b.getLinksByIds(v10.v.d(s, ThingType.LINK)).w((kf2.o)new h0((Object)this, 0));
            sg2.e.e((Object)w, "remote.getLinksByIds(Thi\u2026nk(it.children.first()) }");
            final ff2.c0 v = nn0.a.V((ff2.c0)w, (n20.d)this.a);
            redditLinkRepository$fetchLinkFromRemote$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(v, (lg2.c)redditLinkRepository$fetchLinkFromRemote$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(b, "remote.getLinksByIds(Thi\u2026undThread)\n      .await()");
        return b;
    }
    
    public final Object y(final lg2.c<? super Boolean> c) {
        return ej2.g.l((CoroutineContext)this.A.c(), (rg2.p)new RedditLinkRepository$pruneListings$2(this, (lg2.c)null), (lg2.c)c);
    }
    
    public final Link y0(Link link) {
        final SubredditDetail subredditDetail = link.getSubredditDetail();
        if (subredditDetail != null) {
            final Boolean userIsSubscriber = subredditDetail.getUserIsSubscriber();
            if (userIsSubscriber != null) {
                final Link copy$default = Link.copy$default(link, null, null, 0L, null, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, userIsSubscriber, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, -1, -1, Integer.MAX_VALUE, 536870911, null);
                if (copy$default != null) {
                    link = copy$default;
                }
            }
        }
        Link copy$default2 = link;
        if (sg2.e.a((Object)this.e.b(), (Object)Boolean.TRUE)) {
            copy$default2 = Link.copy$default(link, null, null, 0L, null, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, true, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, -1, -1, -2049, 536870911, null);
        }
        return copy$default2;
    }
    
    public final n<Listing<Link>> z(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2) {
        final g0 c = this.c;
        sg2.e.c((Object)s);
        return (n<Listing<Link>>)a92.b.a0(c.l(sortType, sortTimeFrame, s, s2), (n20.d)this.a);
    }
    
    public final <T extends ILink> T z0(final T t) {
        if (!(t instanceof Link)) {
            return t;
        }
        final Link copy$default = Link.copy$default((Link)t, this.x.a(t.getId(), t.getUniqueId(), t.getPromoted()), null, 0L, null, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, -2, -1, -1, 536870911, null);
        sg2.e.d((Object)copy$default, "null cannot be cast to non-null type T of com.reddit.data.repository.RedditLinkRepository.useUniqueIdForAds");
        return (T)copy$default;
    }
}
