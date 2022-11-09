// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.Collection;
import com.reddit.listing.model.sort.HistorySortType;
import com.reddit.domain.model.listing.RemovalReason;
import com.reddit.domain.model.listing.ContentRemovalMessage;
import g60.q0;
import com.reddit.domain.model.Result;
import g60.d1;
import g60.n0;
import com.reddit.data.local.UserLinkKey;
import g60.t0;
import com.reddit.domain.repository.ModQueueSortingType;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.domain.model.vote.VoteDirection;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import com.reddit.mutations.k2;
import o22.m0;
import g60.u0;
import com.reddit.common.experiments.model.channels.FeedNotificationsVariant;
import g60.z1;
import g60.x0;
import io.reactivex.internal.operators.single.SingleDoFinally;
import g60.w0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import g60.v0;
import o22.x1;
import o22.d0;
import h7.h$a;
import mj2.j0;
import com.reddit.common.ThingType;
import com.reddit.frontpage.presentation.link.DistinguishType;
import n22.p$a;
import com.reddit.tracking.TrackerParams$TrackerType;
import com.reddit.type.HideState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.collections.EmptyList;
import com.nytimes.android.external.store3.base.impl.Store;
import java.util.UUID;
import kotlin.coroutines.CoroutineContext;
import com.reddit.domain.model.media.FbpMediaType;
import com.reddit.domain.model.media.VideoContext;
import nf2.n;
import okhttp3.OkHttpClient;
import ur0.e$a;
import com.reddit.queries.ib;
import androidx.appcompat.widget.s0;
import com.reddit.domain.model.UpdateSubredditTitleSafetyDto;
import com.reddit.listing.common.ListingType;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.ads.domain.DisplaySource;
import io.reactivex.plugins.RxJavaPlugins;
import nf2.g0;
import cg2.h;
import sf2.o;
import g60.y0;
import com.reddit.tracking.RedditEndpoint;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import g60.o2;
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
import a4.u1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.Link;
import cb0.j;
import java.util.Iterator;
import com.google.firebase.perf.metrics.Trace;
import java.util.List;
import com.reddit.domain.model.ILink;
import com.reddit.domain.model.TopicsRecommendationFeedElement;
import java.util.ArrayList;
import mj2.g;
import com.reddit.domain.model.listing.Listing;
import db0.l;
import com.reddit.session.q;
import com.reddit.listing.model.sort.SortType$a;
import com.reddit.listing.model.sort.SortType;
import db0.x;
import db0.c0;
import bt0.e;
import e22.d;
import yd0.i;
import com.reddit.domain.targeting.ResurrectedUserTargetingUseCase;
import ge0.o0;
import db0.t;
import c50.p0;
import d60.k;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import n22.p;
import java.util.LinkedHashMap;
import c50.i0;
import com.reddit.data.remote.RemoteLinkDataSource;
import com.reddit.domain.usecase.GeoFilterUseCase;
import ge0.a0;
import com.reddit.events.discover.DiscoverAnalytics;
import ge0.w;
import db0.m;
import android.content.Context;
import n22.f;
import db0.c;
import ow0.b;
import e20.a;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ge0.r;

public final class RedditLinkRepository implements r
{
    public static final Pair<Long, TimeUnit> h0;
    public static final Pair<Long, TimeUnit> i0;
    public static final Pair<Long, TimeUnit> j0;
    public final a A;
    public final mb0.a B;
    public final b C;
    public final c D;
    public final uf0.a E;
    public final f F;
    public final Context G;
    public final i22.c H;
    public final m I;
    public final ge0.m J;
    public final w K;
    public final DiscoverAnalytics L;
    public final u01.a M;
    public final a0 N;
    public final GeoFilterUseCase O;
    public final ub0.a P;
    public final String Q;
    public final String R;
    public final boolean S;
    public final pg2.f T;
    public final pg2.f U;
    public final pg2.f V;
    public final pg2.f W;
    public final pg2.f X;
    public final pg2.f Y;
    public final pg2.f Z;
    public final r20.a a;
    public final pg2.f a0;
    public final RemoteLinkDataSource b;
    public final pg2.f b0;
    public final i0 c;
    public LinkedHashMap c0;
    public final gc0.a d;
    public final pg2.f d0;
    public final ev.a e;
    public final pg2.f e0;
    public final p f;
    public final pg2.f f0;
    public final RemoteGqlLinkDataSource g;
    public final pg2.f g0;
    public final k h;
    public final p0 i;
    public final d60.a j;
    public final t k;
    public final cb0.k l;
    public final o0 m;
    public final fd0.b n;
    public final ew.a o;
    public final ResurrectedUserTargetingUseCase p;
    public final i q;
    public final i81.a r;
    public final d s;
    public final e t;
    public final jw0.a u;
    public final c0 v;
    public final gv.a w;
    public final aw.a x;
    public final x01.a y;
    public final x z;
    
    static {
        final SortType$a companion = SortType.Companion;
        final TimeUnit seconds = TimeUnit.SECONDS;
        h0 = new Pair((Object)10L, (Object)seconds);
        i0 = new Pair((Object)60L, (Object)seconds);
        j0 = new Pair((Object)1L, (Object)TimeUnit.HOURS);
    }
    
    public RedditLinkRepository(final r20.a a, final RemoteLinkDataSource b, final i0 c, final gc0.a d, final ev.a e, final p f, final RemoteGqlLinkDataSource g, final k h, final p0 i, final d60.a j, final t k, final cb0.k l, final o0 m, final fd0.b n, final ew.a o, final ResurrectedUserTargetingUseCase p44, final i q, final i81.a r, final d s, final e t, final jw0.a u, final c0 v, final gv.a w, final aw.a x, final x01.a y, final x z, final a a2, final mb0.a b2, final b c2, final c d2, final uf0.a e2, final f f2, final Context g2, final i22.c h2, final m i2, final q q2, final ge0.m j2, final w k2, final l l2, final DiscoverAnalytics l3, final u01.a m2, final a0 n2, final GeoFilterUseCase o2, final ub0.a p45) {
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
        this.L = l3;
        this.M = m2;
        this.N = n2;
        this.O = o2;
        this.P = p45;
        this.Q = l2.c();
        this.R = String.valueOf(l2.n());
        this.S = q2.z();
        this.T = kotlin.a.b((zg2.a)new RedditLinkRepository$submittedStore.RedditLinkRepository$submittedStore$2(this));
        this.U = kotlin.a.b((zg2.a)new RedditLinkRepository$popularLinkStore.RedditLinkRepository$popularLinkStore$2(this));
        this.V = kotlin.a.b((zg2.a)new RedditLinkRepository$categoryLinkStore.RedditLinkRepository$categoryLinkStore$2(this));
        this.W = kotlin.a.b((zg2.a)new RedditLinkRepository$historyLinkStore.RedditLinkRepository$historyLinkStore$2(this));
        this.X = kotlin.a.b((zg2.a)new RedditLinkRepository$subredditLinkStore.RedditLinkRepository$subredditLinkStore$2(this));
        this.Y = kotlin.a.b((zg2.a)new RedditLinkRepository$multiredditLinkStore.RedditLinkRepository$multiredditLinkStore$2(this));
        this.Z = kotlin.a.b((zg2.a)new RedditLinkRepository$savedPostsStore.RedditLinkRepository$savedPostsStore$2(this));
        this.a0 = kotlin.a.b((zg2.a)new RedditLinkRepository$topAwardedPostsStore.RedditLinkRepository$topAwardedPostsStore$2(this));
        this.b0 = kotlin.a.b((zg2.a)new RedditLinkRepository$predictionsTournamentPostsStore.RedditLinkRepository$predictionsTournamentPostsStore$2(this));
        this.c0 = new LinkedHashMap();
        this.d0 = kotlin.a.b((zg2.a)new RedditLinkRepository$discoverTopicLinksStore.RedditLinkRepository$discoverTopicLinksStore$2(this));
        this.e0 = kotlin.a.b((zg2.a)new RedditLinkRepository$recommendedVideosLinkStore.RedditLinkRepository$recommendedVideosLinkStore$2(this));
        this.f0 = kotlin.a.b((zg2.a)new RedditLinkRepository$recommendedMediaLinkStore.RedditLinkRepository$recommendedMediaLinkStore$2(this));
        this.g0 = kotlin.a.b((zg2.a)new RedditLinkRepository$postDuplicatesStore.RedditLinkRepository$postDuplicatesStore$2(this));
    }
    
    public static Listing c(final RedditLinkRepository redditLinkRepository, Listing listing) {
        redditLinkRepository.getClass();
        final Trace b = ri.b.b("LinkRepository.filter_topic_recommendations");
        if (redditLinkRepository.k.Fb()) {
            b.stop();
        }
        else {
            Listing<Object> copy$default = listing;
            if (!(boolean)g.k((zg2.p)new RedditLinkRepository$filterTopicRecommendations$showTopicRecommendations$1(redditLinkRepository, (tg2.c)null))) {
                final List children = listing.getChildren();
                final ArrayList list = new ArrayList();
                for (final Object next : children) {
                    if (((ILink)next) instanceof TopicsRecommendationFeedElement ^ true) {
                        list.add(next);
                    }
                }
                copy$default = Listing.copy$default(listing, list, null, null, null, null, false, null, 126, null);
            }
            b.stop();
            listing = copy$default;
        }
        return listing;
    }
    
    public static final Listing d(final RedditLinkRepository redditLinkRepository, Listing copy$default, final cb0.i i, final j j) {
        final Trace b = ri.b.b("LinkRepository.filter_generic_listing");
        if (i != null) {
            copy$default = Listing.copy$default(copy$default, i.a(copy$default.getChildren(), j), null, null, null, null, false, null, 126, null);
        }
        b.stop();
        return copy$default;
    }
    
    public static final List e(final RedditLinkRepository redditLinkRepository, final List list) {
        redditLinkRepository.getClass();
        final ArrayList list2 = new ArrayList();
        for (final Object next : list) {
            if (next instanceof Link) {
                list2.add(next);
            }
        }
        final ArrayList list3 = new ArrayList<String>(qg2.m.P0((Iterable)list2, 10));
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list3.add(((Link)iterator2.next()).getId());
        }
        final List<i60.k> q = redditLinkRepository.c.q(CollectionsKt___CollectionsKt.h2((Iterable)list3));
        int a0;
        if ((a0 = u1.A0(qg2.m.P0((Iterable)q, 10))) < 16) {
            a0 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap<String, i60.k>(a0);
        for (final i60.k next2 : q) {
            linkedHashMap.put(next2.a, next2);
        }
        List<ILink> list4;
        if (linkedHashMap.isEmpty()) {
            list4 = list;
        }
        else {
            final ArrayList<ILink> list5 = new ArrayList<ILink>(qg2.m.P0((Iterable)list, 10));
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
                        final i60.k value = linkedHashMap.get(link.getId());
                        ah2.f.c((Object)value);
                        final i60.k k = value;
                        final Link link2 = (Link)link;
                        final boolean b = k.b;
                        final Boolean e = k.e;
                        copy$default = Link.copy$default(link2, null, null, 0L, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, b, e != null && e, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -1, -1, -1610612737, 134217727, null);
                        ah2.f.d((Object)copy$default, "null cannot be cast to non-null type com.reddit.domain.model.ILink");
                    }
                }
                list5.add(copy$default);
            }
        }
        return list4;
    }
    
    public static final Object f(final RedditLinkRepository redditLinkRepository, final o2 o2, final tg2.c c) {
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
            redditLinkRepository$fetchPopularListing$2 = new RedditLinkRepository$fetchPopularListing$1(redditLinkRepository, (tg2.c<? super RedditLinkRepository$fetchPopularListing$1>)c);
        }
        final Object result = redditLinkRepository$fetchPopularListing$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$fetchPopularListing$2.label;
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
            final DisplaySource a = o2.a;
            final SortType b2 = o2.b;
            final SortTimeFrame c2 = o2.c;
            final String d = o2.d;
            final Integer e = o2.e;
            final dv.a g = o2.g;
            final ListingViewMode h = o2.h;
            final String l = o2.l;
            final String n = o2.n;
            final String o3 = o2.o;
            final Boolean s = o2.s;
            Map map;
            if (n != null) {
                map = a80.a.s0(n, redditLinkRepository.f, o3);
            }
            else {
                map = kotlin.collections.c.N1();
            }
            redditLinkRepository.s.b("LinkRepository.getPopular_network_fetch");
            final RemoteGqlLinkDataSource g2 = redditLinkRepository.g;
            ah2.f.c((Object)b2);
            ah2.f.c((Object)l);
            final nf2.c0 w = aj2.c.X0((nf2.c0)g2.h(a, b2, c2, d, g, h, l, redditLinkRepository.e.c(), map, e, s), RedditEndpoint.PopularPosts, redditLinkRepository.f, redditLinkRepository.F, redditLinkRepository.Q, redditLinkRepository.R, redditLinkRepository.S).w((o)new y0(5));
            final com.reddit.data.repository.f f = new com.reddit.data.repository.f(redditLinkRepository, 0);
            w.getClass();
            final nf2.c0 onAssembly = RxJavaPlugins.onAssembly((nf2.c0)new h((g0)w, (sf2.g)f));
            ah2.f.e((Object)onAssembly, "remoteGql.getPopularLink\u2026E_SUBREDDIT_TITLES)\n    }");
            redditLinkRepository$fetchPopularListing$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(onAssembly, (tg2.c)redditLinkRepository$fetchPopularListing$2)) == coroutine_SUSPENDED) {
                b = coroutine_SUSPENDED;
                return b;
            }
        }
        ah2.f.e(b, "remoteGql.getPopularLink\u2026DIT_TITLES)\n    }.await()");
        return b;
    }
    
    public static final Object q0(final RedditLinkRepository redditLinkRepository, final Listing listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final tg2.c c) {
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
            redditLinkRepository$saveHomeLinksInternal$2 = new RedditLinkRepository$saveHomeLinksInternal$1(redditLinkRepository, (tg2.c<? super RedditLinkRepository$saveHomeLinksInternal$1>)c);
        }
        final Object result = redditLinkRepository$saveHomeLinksInternal$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$saveHomeLinksInternal$2.label;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            final i0 c2 = redditLinkRepository.c;
            redditLinkRepository$saveHomeLinksInternal$2.label = 1;
            if (c2.U(listing, sortType, sortTimeFrame, s, (tg2.c)redditLinkRepository$saveHomeLinksInternal$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return Boolean.TRUE;
    }
    
    public static final Object r0(RedditLinkRepository l$0, final Listing listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final tg2.c c) {
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
            redditLinkRepository$savePopularLinksInternal$2 = new RedditLinkRepository$savePopularLinksInternal$1(l$0, (tg2.c<? super RedditLinkRepository$savePopularLinksInternal$1>)c);
        }
        final Object result = redditLinkRepository$savePopularLinksInternal$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$savePopularLinksInternal$2.label;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (RedditLinkRepository)redditLinkRepository$savePopularLinksInternal$2.L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            l$0.s.b("LocalLinkDataSource.savePopularElements");
            final i0 c2 = l$0.c;
            redditLinkRepository$savePopularLinksInternal$2.L$0 = l$0;
            redditLinkRepository$savePopularLinksInternal$2.label = 1;
            if (c2.D(listing, sortType, sortTimeFrame, s, s2, (tg2.c)redditLinkRepository$savePopularLinksInternal$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        l$0.s.e("LocalLinkDataSource.savePopularElements");
        return Boolean.TRUE;
    }
    
    public static final Object s0(final RedditLinkRepository redditLinkRepository, final List list, ListingType l$1, final tg2.c c) {
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
            o = new RedditLinkRepository$updateAdsSessionSlot$1(redditLinkRepository, (tg2.c<? super RedditLinkRepository$updateAdsSessionSlot$1>)c);
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
                        aj2.c.Q0(result);
                        break Label_0281;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    aj2.c.Q0(result);
                    final ArrayList list2 = new ArrayList(qg2.m.P0((Iterable)list, 10));
                    iterator = list.iterator();
                    l$2 = redditLinkRepository;
                    list3 = list2;
                }
                Object a;
                if (iterator.hasNext()) {
                    final Link link = iterator.next();
                    final ew.a o4 = l$2.o;
                    final boolean promoted = link.getPromoted();
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$0 = l$2;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$1 = l$1;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$2 = list3;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$3 = iterator;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$4 = list3;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).label = 1;
                    if (o4.b(promoted, l$1, (tg2.c)o) != coroutine_SUSPENDED) {
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
                    a = pg2.j.a;
                }
                return a;
            }
            ((Collection<pg2.j>)o2).add(pg2.j.a);
            final Object o5 = o3;
            l$1 = listingType;
            List list3 = (List)o5;
            continue;
        }
    }
    
    public static final Object t0(final RedditLinkRepository redditLinkRepository, final List list, final tg2.c c) {
        Object o3;
        if (redditLinkRepository.B.H2()) {
            final o0 m = redditLinkRepository.m;
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
                            final String g = z10.w.g(link.getSubredditId());
                            final SubredditDetail subredditDetail3 = link.getSubredditDetail();
                            Boolean titleSafe2 = b;
                            if (subredditDetail3 != null) {
                                titleSafe2 = subredditDetail3.isTitleSafe();
                            }
                            ah2.f.c((Object)titleSafe2);
                            o2 = new UpdateSubredditTitleSafetyDto(g, titleSafe2);
                        }
                    }
                }
                if (o2 != null) {
                    list2.add(o2);
                }
            }
            o3 = m.a0(list2, c);
            if (o3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                o3 = pg2.j.a;
            }
        }
        else {
            o3 = pg2.j.a;
        }
        return o3;
    }
    
    public static void u0(final Listing listing, final ArrayList list) {
        final List children = listing.getChildren();
        final ArrayList list2 = new ArrayList<Pair>(qg2.m.P0((Iterable)children, 10));
        final Iterator iterator = children.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < 0) {
                ah2.c.x0();
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
        for (final Map.Entry<Number, V> entry : kotlin.collections.c.X1((List)list3).entrySet()) {
            if (entry.getKey().intValue() < list.size()) {
                list.add(entry.getKey().intValue(), entry.getValue());
            }
        }
    }
    
    public static Listing v0(Listing copy$default, final cb0.i i, final j j) {
        final Trace b = ri.b.b("LinkRepository.filter_generic_listing");
        if (i != null) {
            copy$default = Listing.copy$default(copy$default, i.a(copy$default.getChildren(), j), null, null, null, null, false, null, 126, null);
        }
        b.stop();
        return copy$default;
    }
    
    public final nf2.c0<List<Link>> A(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final RemoteGqlLinkDataSource g = this.g;
        g.getClass();
        final nf2.c0 w = e$a.a((ur0.e)g.a, (h7.k)new ib(s0.h(g.j), s), (OkHttpClient)null, (Map)null, 14).w((o)new qw.c((Object)g, 10));
        ah2.f.e((Object)w, "graphQlClient\n      .exe\u2026 } ?: emptyList()\n      }");
        final nf2.c0 w2 = w.w((o)new g60.o(this, 2));
        ah2.f.e((Object)w2, "remoteGql.getSubredditSt\u2026it.map(::mapRemoteLink) }");
        return (nf2.c0<List<Link>>)u1.j1(w2, (r20.d)this.a);
    }
    
    public final nf2.a B(final String s) {
        ah2.f.f((Object)s, "id");
        return o72.f.t(this.b.modUncollapseComment(s), (r20.d)this.a);
    }
    
    public final n<Listing<Link>> C(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2) {
        final i0 c = this.c;
        ah2.f.c((Object)s);
        return (n<Listing<Link>>)dg.d.A1((n)c.w(sortType, sortTimeFrame, s, s2), (r20.d)this.a);
    }
    
    public final Object D(final String s, final VideoContext videoContext, final boolean b, final FbpMediaType fbpMediaType, final tg2.c<? super Listing<Link>> c) {
        RedditLinkRepository$fetchRecommendedMedia.RedditLinkRepository$fetchRecommendedMedia$1 redditLinkRepository$fetchRecommendedMedia$2 = null;
        Label_0061: {
            if (c instanceof RedditLinkRepository$fetchRecommendedMedia.RedditLinkRepository$fetchRecommendedMedia$1) {
                final RedditLinkRepository$fetchRecommendedMedia.RedditLinkRepository$fetchRecommendedMedia$1 redditLinkRepository$fetchRecommendedMedia$1 = (RedditLinkRepository$fetchRecommendedMedia.RedditLinkRepository$fetchRecommendedMedia$1)c;
                final int label = redditLinkRepository$fetchRecommendedMedia$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$fetchRecommendedMedia$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$fetchRecommendedMedia$2 = redditLinkRepository$fetchRecommendedMedia$1;
                    break Label_0061;
                }
            }
            redditLinkRepository$fetchRecommendedMedia$2 = new RedditLinkRepository$fetchRecommendedMedia.RedditLinkRepository$fetchRecommendedMedia$1(this, (tg2.c)c);
        }
        final Object result = redditLinkRepository$fetchRecommendedMedia$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$fetchRecommendedMedia$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            l = result;
        }
        else {
            aj2.c.Q0(result);
            final g60.m m = new g60.m(s, videoContext, fbpMediaType);
            final uj2.a c2 = this.A.c();
            final RedditLinkRepository$fetchRecommendedMedia$2 redditLinkRepository$fetchRecommendedMedia$3 = new RedditLinkRepository$fetchRecommendedMedia$2(this, m, b, (tg2.c)null);
            redditLinkRepository$fetchRecommendedMedia$2.label = 1;
            if ((l = mj2.g.l((CoroutineContext)c2, (zg2.p)redditLinkRepository$fetchRecommendedMedia$3, (tg2.c)redditLinkRepository$fetchRecommendedMedia$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(l, "override suspend fun fet\u2026   it\n        }\n    }\n  }");
        return l;
    }
    
    public final Object E(final String s, final tg2.c<? super pg2.j> c) {
        final Object e = this.M.e(s, false, (tg2.c)c);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return pg2.j.a;
    }
    
    public final Object F(String string, String s, String g, final boolean b, String s2, final boolean b2, final zg2.l<? super Link, pg2.j> l, final tg2.c<? super Listing<Link>> c) {
        RedditLinkRepository$getDiscoverLinks.RedditLinkRepository$getDiscoverLinks$1 redditLinkRepository$getDiscoverLinks$1 = null;
        Label_0057: {
            if (c instanceof RedditLinkRepository$getDiscoverLinks.RedditLinkRepository$getDiscoverLinks$1) {
                redditLinkRepository$getDiscoverLinks$1 = (RedditLinkRepository$getDiscoverLinks.RedditLinkRepository$getDiscoverLinks$1)c;
                final int label = redditLinkRepository$getDiscoverLinks$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$getDiscoverLinks$1.label = label + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            redditLinkRepository$getDiscoverLinks$1 = new RedditLinkRepository$getDiscoverLinks.RedditLinkRepository$getDiscoverLinks$1(this, (tg2.c)c);
        }
        Object o = redditLinkRepository$getDiscoverLinks$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$getDiscoverLinks$1.label;
        Label_0982: {
            Link link = null;
            RedditLinkRepository redditLinkRepository2 = null;
            String s6 = null;
            String s7 = null;
            boolean b5 = false;
            String s8 = null;
            String s9 = null;
            boolean b6 = false;
            Label_0678: {
                boolean b3 = false;
                boolean b4 = false;
                RedditLinkRepository redditLinkRepository = null;
                String s11 = null;
                zg2.l k = null;
                Link link3 = null;
                Label_0567: {
                    zg2.l i = null;
                    String s3 = null;
                    String s4 = null;
                    Label_0548: {
                        zg2.l j;
                        String s5;
                        if (label2 != 0) {
                            if (label2 != 1) {
                                if (label2 == 2) {
                                    b3 = redditLinkRepository$getDiscoverLinks$1.Z$1;
                                    b4 = redditLinkRepository$getDiscoverLinks$1.Z$0;
                                    i = (zg2.l)redditLinkRepository$getDiscoverLinks$1.L$5;
                                    s3 = (String)redditLinkRepository$getDiscoverLinks$1.L$4;
                                    g = (String)redditLinkRepository$getDiscoverLinks$1.L$3;
                                    s = (String)redditLinkRepository$getDiscoverLinks$1.L$2;
                                    s4 = (String)redditLinkRepository$getDiscoverLinks$1.L$1;
                                    redditLinkRepository = (RedditLinkRepository)redditLinkRepository$getDiscoverLinks$1.L$0;
                                    aj2.c.Q0(o);
                                    break Label_0548;
                                }
                                if (label2 == 3) {
                                    aj2.c.Q0(o);
                                    break Label_0982;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                b3 = redditLinkRepository$getDiscoverLinks$1.Z$1;
                                b4 = redditLinkRepository$getDiscoverLinks$1.Z$0;
                                j = (zg2.l)redditLinkRepository$getDiscoverLinks$1.L$5;
                                s2 = (String)redditLinkRepository$getDiscoverLinks$1.L$4;
                                g = (String)redditLinkRepository$getDiscoverLinks$1.L$3;
                                s = (String)redditLinkRepository$getDiscoverLinks$1.L$2;
                                s5 = (String)redditLinkRepository$getDiscoverLinks$1.L$1;
                                redditLinkRepository = (RedditLinkRepository)redditLinkRepository$getDiscoverLinks$1.L$0;
                                aj2.c.Q0(o);
                            }
                        }
                        else {
                            aj2.c.Q0(o);
                            if (s2 != null) {
                                link = null;
                                redditLinkRepository2 = this;
                                s6 = string;
                                s7 = s2;
                                b5 = b;
                                s8 = g;
                                s9 = s;
                                b6 = b2;
                                break Label_0678;
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
                                final Object x0 = this.x0(s, (tg2.c<? super Link>)redditLinkRepository$getDiscoverLinks$1);
                                if (x0 == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                final String s10 = string;
                                redditLinkRepository = this;
                                o = x0;
                                s5 = s10;
                                j = l;
                                b4 = b;
                                b3 = b2;
                            }
                            else {
                                final nf2.c0<Link> a = this.a(s);
                                redditLinkRepository$getDiscoverLinks$1.L$0 = this;
                                redditLinkRepository$getDiscoverLinks$1.L$1 = string;
                                redditLinkRepository$getDiscoverLinks$1.L$2 = s;
                                redditLinkRepository$getDiscoverLinks$1.L$3 = g;
                                redditLinkRepository$getDiscoverLinks$1.L$4 = s2;
                                redditLinkRepository$getDiscoverLinks$1.L$5 = l;
                                redditLinkRepository$getDiscoverLinks$1.Z$0 = b;
                                redditLinkRepository$getDiscoverLinks$1.Z$1 = b2;
                                redditLinkRepository$getDiscoverLinks$1.label = 2;
                                final Object b7 = kotlinx.coroutines.rx2.d.b((nf2.c0)a, (tg2.c)redditLinkRepository$getDiscoverLinks$1);
                                if (b7 == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                s4 = string;
                                redditLinkRepository = this;
                                o = b7;
                                i = l;
                                s3 = s2;
                                b4 = b;
                                b3 = b2;
                                break Label_0548;
                            }
                        }
                        final Link link2 = (Link)o;
                        s11 = s2;
                        k = j;
                        s2 = s5;
                        link3 = link2;
                        break Label_0567;
                    }
                    link3 = (Link)o;
                    s2 = s4;
                    k = i;
                    s11 = s3;
                }
                b6 = b3;
                s9 = s;
                s8 = g;
                b5 = b4;
                s7 = s11;
                s6 = s2;
                link = link3;
                redditLinkRepository2 = redditLinkRepository;
                if (k != null) {
                    ah2.f.e((Object)link3, "it");
                    k.invoke((Object)link3);
                    b6 = b3;
                    s9 = s;
                    s8 = g;
                    b5 = b4;
                    s7 = s11;
                    s6 = s2;
                    link = link3;
                    redditLinkRepository2 = redditLinkRepository;
                }
            }
            g = androidx.viewpager.widget.c.g(s6, '_', s9);
            if (!b6 && redditLinkRepository2.c0.containsKey(g)) {
                final Object value = redditLinkRepository2.c0.get(g);
                ah2.f.c(value);
                string = (String)value;
            }
            else {
                string = UUID.randomUUID().toString();
                final LinkedHashMap c2 = redditLinkRepository2.c0;
                ah2.f.e((Object)string, "it");
                c2.put(g, string);
            }
            final g60.d d = new g60.d(s6, s7, link, s8, string);
            nf2.c0 c3;
            if (link != null) {
                final Object value2 = redditLinkRepository2.d0.getValue();
                ah2.f.e(value2, "<get-discoverTopicLinksStore>(...)");
                c3 = ((Store)value2).get((Object)d).w((o)new com.reddit.data.repository.g(link, 0));
            }
            else {
                final Object value3 = redditLinkRepository2.d0.getValue();
                ah2.f.e(value3, "<get-discoverTopicLinksStore>(...)");
                c3 = ((Store)value3).get((Object)d);
            }
            ah2.f.e((Object)c3, "if (firstLink != null) {\u2026ore.get(requestKey)\n    }");
            nf2.c0 z = c3;
            if (b5) {
                final Object value4 = redditLinkRepository2.d0.getValue();
                ah2.f.e(value4, "<get-discoverTopicLinksStore>(...)");
                z = ((Store)value4).b((Object)d).z(c3);
            }
            ah2.f.e((Object)z, "if (refresh) {\n      dis\u2026   getWithFirstLink\n    }");
            final nf2.c0 j2 = u1.j1(z, (r20.d)redditLinkRepository2.a);
            redditLinkRepository$getDiscoverLinks$1.L$0 = null;
            redditLinkRepository$getDiscoverLinks$1.L$1 = null;
            redditLinkRepository$getDiscoverLinks$1.L$2 = null;
            redditLinkRepository$getDiscoverLinks$1.L$3 = null;
            redditLinkRepository$getDiscoverLinks$1.L$4 = null;
            redditLinkRepository$getDiscoverLinks$1.L$5 = null;
            redditLinkRepository$getDiscoverLinks$1.label = 3;
            if ((o = kotlinx.coroutines.rx2.d.b(j2, (tg2.c)redditLinkRepository$getDiscoverLinks$1)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(o, "fetchFunction()\n      .s\u2026backgroundThread).await()");
        return o;
    }
    
    public final nf2.a G(final String s) {
        ah2.f.f((Object)s, "id");
        return o72.f.t(wi.b.a0((zg2.p)new RedditLinkRepository$markNsfw$1(this, s, (tg2.c)null)), (r20.d)this.a);
    }
    
    public final nf2.a H(final String s) {
        ah2.f.f((Object)s, "id");
        return o72.f.t(this.b.modUnlockComments(s), (r20.d)this.a);
    }
    
    public final RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1 I(final String s) {
        ah2.f.f((Object)s, "kindWithId");
        return new RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1((pj2.e)this.E.c(s));
    }
    
    public final Object J(final Link l$1, final tg2.c<? super Boolean> c) {
        RedditLinkRepository$unsubscribeFromPost.RedditLinkRepository$unsubscribeFromPost$1 redditLinkRepository$unsubscribeFromPost$2 = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$unsubscribeFromPost.RedditLinkRepository$unsubscribeFromPost$1) {
                final RedditLinkRepository$unsubscribeFromPost.RedditLinkRepository$unsubscribeFromPost$1 redditLinkRepository$unsubscribeFromPost$1 = (RedditLinkRepository$unsubscribeFromPost.RedditLinkRepository$unsubscribeFromPost$1)c;
                final int label = redditLinkRepository$unsubscribeFromPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$unsubscribeFromPost$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$unsubscribeFromPost$2 = redditLinkRepository$unsubscribeFromPost$1;
                    break Label_0052;
                }
            }
            redditLinkRepository$unsubscribeFromPost$2 = new RedditLinkRepository$unsubscribeFromPost.RedditLinkRepository$unsubscribeFromPost$1(this, (tg2.c)c);
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
                    aj2.c.Q0(o);
                    return z$0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                link = (Link)redditLinkRepository$unsubscribeFromPost$2.L$1;
                redditLinkRepository = (RedditLinkRepository)redditLinkRepository$unsubscribeFromPost$2.L$0;
                aj2.c.Q0(o);
            }
        }
        else {
            aj2.c.Q0(o);
            final RemoteGqlLinkDataSource g = this.g;
            final String kindWithId = l$1.getKindWithId();
            redditLinkRepository$unsubscribeFromPost$2.L$0 = this;
            redditLinkRepository$unsubscribeFromPost$2.L$1 = l$1;
            redditLinkRepository$unsubscribeFromPost$2.label = 1;
            o = g.t(kindWithId, (tg2.c<? super Boolean>)redditLinkRepository$unsubscribeFromPost$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            link = l$1;
            redditLinkRepository = this;
        }
        final boolean z$0 = (boolean)o;
        final nf2.a u = redditLinkRepository.c.l(link.getId()).u();
        ah2.f.e((Object)u, "localDb.unsubscribe(link\u2026\n      .onErrorComplete()");
        final nf2.a t = o72.f.t(u, (r20.d)redditLinkRepository.a);
        redditLinkRepository$unsubscribeFromPost$2.L$0 = null;
        redditLinkRepository$unsubscribeFromPost$2.L$1 = null;
        redditLinkRepository$unsubscribeFromPost$2.Z$0 = z$0;
        redditLinkRepository$unsubscribeFromPost$2.label = 2;
        if (kotlinx.coroutines.rx2.d.a(t, (tg2.c)redditLinkRepository$unsubscribeFromPost$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return z$0;
    }
    
    public final n<Link> K(final String s) {
        ah2.f.f((Object)s, "id");
        return (n<Link>)dg.d.A1((n)this.c.a(s), (r20.d)this.a);
    }
    
    public final nf2.c0<Map<String, Link>> L(final String s, final String s2, final String s3) {
        ah2.f.f((Object)s, "prefixedSubredditName");
        ah2.f.f((Object)s2, "linkId");
        final g60.j j = new g60.j(s, s2, s3);
        final Object value = this.g0.getValue();
        ah2.f.e(value, "<get-postDuplicatesStore>(...)");
        final nf2.c0 value2 = ((Store)value).get((Object)j);
        ah2.f.e((Object)value2, "postDuplicatesStore.get(key)");
        return (nf2.c0<Map<String, Link>>)u1.j1(value2, (r20.d)this.a);
    }
    
    public final Object M(final String s, final tg2.c<? super Listing<Link>> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$getAllLocalDiscoverLinks.RedditLinkRepository$getAllLocalDiscoverLinks$1) {
                final RedditLinkRepository$getAllLocalDiscoverLinks.RedditLinkRepository$getAllLocalDiscoverLinks$1 redditLinkRepository$getAllLocalDiscoverLinks$1 = (RedditLinkRepository$getAllLocalDiscoverLinks.RedditLinkRepository$getAllLocalDiscoverLinks$1)c;
                final int label = redditLinkRepository$getAllLocalDiscoverLinks$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$getAllLocalDiscoverLinks$1.label = label + Integer.MIN_VALUE;
                    o = redditLinkRepository$getAllLocalDiscoverLinks$1;
                    break Label_0052;
                }
            }
            o = new RedditLinkRepository$getAllLocalDiscoverLinks.RedditLinkRepository$getAllLocalDiscoverLinks$1(this, (tg2.c)c);
        }
        final Object result = ((RedditLinkRepository$getAllLocalDiscoverLinks.RedditLinkRepository$getAllLocalDiscoverLinks$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditLinkRepository$getAllLocalDiscoverLinks.RedditLinkRepository$getAllLocalDiscoverLinks$1)o).label;
        Object g;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            g = result;
        }
        else {
            aj2.c.Q0(result);
            final n a1 = dg.d.A1((n)this.c.O(s, null), (r20.d)this.a);
            ((RedditLinkRepository$getAllLocalDiscoverLinks.RedditLinkRepository$getAllLocalDiscoverLinks$1)o).label = 1;
            if ((g = kotlinx.coroutines.rx2.d.g(a1, (tg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        Listing listing;
        if ((listing = (Listing)g) == null) {
            listing = new Listing((List)EmptyList.INSTANCE, null, null, null, null, false, null, 126, null);
        }
        return listing;
    }
    
    public final Object N(final Link link, final tg2.c<? super pg2.j> c) {
        final Object l = mj2.g.l((CoroutineContext)this.A.c(), (zg2.p)new RedditLinkRepository$updateCachedLink$2(this, link, (tg2.c)null), (tg2.c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return pg2.j.a;
    }
    
    public final Object O(final String s, final int n, final tg2.c<? super pg2.j> c) {
        return mj2.g.l((CoroutineContext)this.A.c(), (zg2.p)new RedditLinkRepository$saveGalleryPosition$2(this, s, n, (tg2.c)null), (tg2.c)c);
    }
    
    public final nf2.c0<Boolean> P(final String s, final String s2) {
        ah2.f.f((Object)s, "linkKindWithId");
        ah2.f.f((Object)s2, "linkId");
        final nf2.c0 p2 = this.g.u(s, HideState.NONE).p((o)new com.reddit.data.repository.n(this, s2, 2));
        ah2.f.e((Object)p2, "remoteGql.updatePostHide\u2026).toSingleDefault(resp) }");
        return (nf2.c0<Boolean>)u1.j1(p2, (r20.d)this.a);
    }
    
    public final nf2.c0<Listing<ILink>> Q(final DisplaySource displaySource, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final boolean b, final ListingViewMode listingViewMode, final String s3, final boolean b2, final Context context, final i22.c c, final Integer n, final cb0.i<ILink> i, final j<ILink> j) {
        ah2.f.f((Object)sortType, "sort");
        ah2.f.f((Object)s3, "geoFilter");
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)c, "tracingFeatures");
        final boolean u2 = this.P.u2();
        final o2 o2 = new o2(displaySource, sortType, sortTimeFrame, s, n, (String)null, this.w0(s2), listingViewMode, (String)null, (String)null, (String)null, s3, b2, (String)null, (String)null, (cb0.i)i, (j)j, Boolean.valueOf(u2), 59168);
        nf2.c0 c2;
        if (b && u2) {
            c2 = u1.W0((zg2.p)new RedditLinkRepository$getPopular$fetchFunction$1(this, o2, sortType, sortTimeFrame, s, s3, (tg2.c)null));
        }
        else if (b) {
            this.s.b("LinkRepository.process_popular_data");
            if (this.v.e()) {
                final nf2.c0 w0 = u1.W0((zg2.p)new RedditLinkRepository$getPopular$fetchFunction$result$1(b, this, sortType, sortTimeFrame, s3, listingViewMode, o2, (cb0.i)i, (j)j, (tg2.c)null));
                final com.reddit.data.repository.e e = new com.reddit.data.repository.e(this, sortType, sortTimeFrame, s, s3);
                w0.getClass();
                c2 = RxJavaPlugins.onAssembly((nf2.c0)new h((g0)w0, (sf2.g)e));
            }
            else {
                final Object value = this.U.getValue();
                ah2.f.e(value, "<get-popularLinkStore>(...)");
                c2 = ((Store)value).b((Object)o2);
            }
            ah2.f.e((Object)c2, "override fun getPopular(\u2026eOn(backgroundThread)\n  }");
            this.s.e("LinkRepository.process_popular_data");
        }
        else {
            final Object value2 = this.U.getValue();
            ah2.f.e(value2, "<get-popularLinkStore>(...)");
            c2 = ((Store)value2).get((Object)o2);
            ah2.f.e((Object)c2, "{\n      popularLinkStore.get(requestKey)\n    }");
        }
        final nf2.c0 w2 = c2.w((o)new g60.s0(this, 1));
        ah2.f.e((Object)w2, "fetchFunction()\n      .m\u2026lterTopicRecommendations)");
        return (nf2.c0<Listing<ILink>>)u1.j1(w2, (r20.d)this.a);
    }
    
    public final Object R(final String s, final tg2.c c) {
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
            redditLinkRepository$getTopAwardedPosts$2 = new RedditLinkRepository$getTopAwardedPosts$1(this, (tg2.c<? super RedditLinkRepository$getTopAwardedPosts$1>)c);
        }
        final Object result = redditLinkRepository$getTopAwardedPosts$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$getTopAwardedPosts$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            l = result;
        }
        else {
            aj2.c.Q0(result);
            final o2 o2 = new o2((DisplaySource)null, (SortType)null, (SortTimeFrame)null, (String)null, (Integer)null, (String)null, (dv.a)null, (ListingViewMode)null, (String)null, (String)null, (String)null, (String)null, false, s, (String)null, (cb0.i)null, (j)null, (Boolean)null, 516095);
            final uj2.a c2 = this.A.c();
            final RedditLinkRepository$getTopAwardedPosts$2 redditLinkRepository$getTopAwardedPosts$3 = new RedditLinkRepository$getTopAwardedPosts$2(false, this, o2, (tg2.c)null);
            redditLinkRepository$getTopAwardedPosts$2.label = 1;
            if ((l = mj2.g.l((CoroutineContext)c2, (zg2.p)redditLinkRepository$getTopAwardedPosts$3, (tg2.c)redditLinkRepository$getTopAwardedPosts$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(l, "override suspend fun get\u2026      }.await()\n    }\n  }");
        return l;
    }
    
    public final Object S(final String s, final xd0.d d, final boolean b, final String s2, final tg2.c c) {
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
            redditLinkRepository$getPredictionsTournamentPosts$2 = new RedditLinkRepository$getPredictionsTournamentPosts$1(this, (tg2.c<? super RedditLinkRepository$getPredictionsTournamentPosts$1>)c);
        }
        final Object result = redditLinkRepository$getPredictionsTournamentPosts$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$getPredictionsTournamentPosts$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            l = result;
        }
        else {
            aj2.c.Q0(result);
            final g60.k k = new g60.k(s, d, s2);
            final uj2.a c2 = this.A.c();
            final RedditLinkRepository$getPredictionsTournamentPosts$2 redditLinkRepository$getPredictionsTournamentPosts$3 = new RedditLinkRepository$getPredictionsTournamentPosts$2(b, this, k, (tg2.c)null);
            redditLinkRepository$getPredictionsTournamentPosts$2.label = 1;
            if ((l = mj2.g.l((CoroutineContext)c2, (zg2.p)redditLinkRepository$getPredictionsTournamentPosts$3, (tg2.c)redditLinkRepository$getPredictionsTournamentPosts$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(l, "override suspend fun get\u2026      }.await()\n    }\n  }");
        return l;
    }
    
    public final nf2.c0 T(final String s, final String s2, final boolean b, final Context context, final i22.c c, final String s3, final cb0.i i, final j j) {
        ah2.f.f((Object)s, "username");
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)c, "tracingFeatures");
        final o2 o2 = new o2((DisplaySource)null, (SortType)null, (SortTimeFrame)null, s2, (Integer)null, (String)null, (dv.a)null, (ListingViewMode)null, (String)null, (String)null, s, (String)null, false, s3, (String)null, i, j, (Boolean)null, 318455);
        nf2.c0 c2;
        if (b) {
            final Object value = this.Z.getValue();
            ah2.f.e(value, "<get-savedPostsStore>(...)");
            final nf2.c0 b2 = ((Store)value).b((Object)o2);
            final Object value2 = this.Z.getValue();
            ah2.f.e(value2, "<get-savedPostsStore>(...)");
            c2 = b2.z(((Store)value2).get((Object)o2));
        }
        else {
            final Object value3 = this.Z.getValue();
            ah2.f.e(value3, "<get-savedPostsStore>(...)");
            c2 = ((Store)value3).get((Object)o2);
        }
        ah2.f.e((Object)c2, "if (refresh) {\n      sav\u2026ore.get(requestKey)\n    }");
        return u1.j1(c2, (r20.d)this.a);
    }
    
    public final Object U(final String s, final VideoContext videoContext, final boolean b, final String s2, final tg2.c<? super Listing<Link>> c) {
        RedditLinkRepository$fetchRecommendedVideos.RedditLinkRepository$fetchRecommendedVideos$1 redditLinkRepository$fetchRecommendedVideos$2 = null;
        Label_0061: {
            if (c instanceof RedditLinkRepository$fetchRecommendedVideos.RedditLinkRepository$fetchRecommendedVideos$1) {
                final RedditLinkRepository$fetchRecommendedVideos.RedditLinkRepository$fetchRecommendedVideos$1 redditLinkRepository$fetchRecommendedVideos$1 = (RedditLinkRepository$fetchRecommendedVideos.RedditLinkRepository$fetchRecommendedVideos$1)c;
                final int label = redditLinkRepository$fetchRecommendedVideos$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$fetchRecommendedVideos$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$fetchRecommendedVideos$2 = redditLinkRepository$fetchRecommendedVideos$1;
                    break Label_0061;
                }
            }
            redditLinkRepository$fetchRecommendedVideos$2 = new RedditLinkRepository$fetchRecommendedVideos.RedditLinkRepository$fetchRecommendedVideos$1(this, (tg2.c)c);
        }
        final Object result = redditLinkRepository$fetchRecommendedVideos$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$fetchRecommendedVideos$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            l = result;
        }
        else {
            aj2.c.Q0(result);
            final g60.n n = new g60.n(s, videoContext, new dv.a(s2, ListingViewMode.IMMERSIVE, (dv.b)null, 4), 20);
            final uj2.a c2 = this.A.c();
            final RedditLinkRepository$fetchRecommendedVideos$2 redditLinkRepository$fetchRecommendedVideos$3 = new RedditLinkRepository$fetchRecommendedVideos$2(this, n, b, (tg2.c)null);
            redditLinkRepository$fetchRecommendedVideos$2.label = 1;
            if ((l = mj2.g.l((CoroutineContext)c2, (zg2.p)redditLinkRepository$fetchRecommendedVideos$3, (tg2.c)redditLinkRepository$fetchRecommendedVideos$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(l, "override suspend fun fet\u2026    }\n        }\n    }\n  }");
        return l;
    }
    
    public final nf2.a V() {
        return o72.f.t(this.c.k(), (r20.d)this.a);
    }
    
    public final nf2.c0 W(final String s, final LinkedHashMap linkedHashMap) {
        p$a.c(this.f, TrackerParams$TrackerType.Listing, RedditLinkRepository.class.getSimpleName(), (String)null, (String)null, this.G, this.H, 92).getClass();
        return u1.j1((nf2.c0)this.b.getDiscoveryUnitListing(s, linkedHashMap, null), (r20.d)this.a);
    }
    
    public final nf2.a X(final String s, final DistinguishType distinguishType) {
        ah2.f.f((Object)s, "id");
        ah2.f.f((Object)distinguishType, "how");
        return wi.b.Z((CoroutineContext)this.A.c(), (zg2.p)new RedditLinkRepository$distinguish$1(this, s, distinguishType, false, (tg2.c)null));
    }
    
    public final Object Y(final String s, final tg2.c<? super pg2.j> c) {
        final Object e = this.M.e(s, true, (tg2.c)c);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return pg2.j.a;
    }
    
    public final nf2.a Z(final String s) {
        ah2.f.f((Object)s, "id");
        return o72.f.t(this.b.modMarkSpoiler(s), (r20.d)this.a);
    }
    
    public final nf2.c0<Link> a(final String s) {
        ah2.f.f((Object)s, "id");
        final n<Link> a = this.c.a(s);
        final g60.p0 p = new g60.p0(this, 0);
        a.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((nf2.r)a, (o)p));
        ah2.f.e((Object)onAssembly, "localDb.getLinkById(id)\n\u2026.map(::useUniqueIdForAds)");
        final n a2 = dg.d.A1(onAssembly, (r20.d)this.a);
        final nf2.c0 w = this.b.getLinksByIds(z10.w.d(s, ThingType.LINK)).w((o)new g60.s0(this, 0));
        ah2.f.e((Object)w, "remote.getLinksByIds(Thi\u2026nk(it.children.first()) }");
        final nf2.c0 w2 = a2.w(u1.j1(w, (r20.d)this.a));
        ah2.f.e((Object)w2, "localDb.getLinkById(id)\n\u2026ackgroundThread),\n      )");
        return (nf2.c0<Link>)w2;
    }
    
    public final nf2.c0 a0(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final boolean b, final ListingViewMode listingViewMode, final String s3, final Context context, final i22.c c, final List list, final Integer n, final cb0.i i, final j j, final boolean b2) {
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)c, "tracingFeatures");
        final n f = ah2.c.f(ae.b.h0((CoroutineContext)mj2.j0.b, (zg2.p)new RedditLinkRepository$getHomeLinksInternalMaybe$1(this, sortType, sortTimeFrame, s, (tg2.c)null)), this.d);
        this.s.b("LinkRepository.getFrontpage_network_fetch");
        final String l = this.t.L();
        final String j2 = this.t.j0();
        final String e = this.t.e();
        d0 d0;
        if ((l == null || kj2.j.X1((CharSequence)l)) && (j2 == null || kj2.j.X1((CharSequence)j2)) && (e == null || kj2.j.X1((CharSequence)e))) {
            d0 = null;
        }
        else {
            List e2;
            if (e != null) {
                e2 = kotlin.text.b.E2((CharSequence)e, new String[] { "," });
            }
            else {
                e2 = null;
            }
            d0 = new d0(h$a.c((Object)e2), h$a.c((Object)l), h$a.c((Object)j2));
        }
        final FeedNotificationsVariant j3 = this.D.J9();
        String variant;
        if (j3 != null) {
            variant = j3.getVariant();
        }
        else {
            variant = null;
        }
        x1 x1;
        if (variant != null) {
            x1 = new x1(h$a.c((Object)variant));
        }
        else {
            x1 = null;
        }
        final nf2.c0 onAssembly = RxJavaPlugins.onAssembly((nf2.c0)new h((g0)aj2.c.X0(RemoteGqlLinkDataSource.d(this.g, sortType, sortTimeFrame, s, this.w0(s2), listingViewMode, this.e.c(), s3, list, this.n.o(), n, d0, x1, b2, 64), RedditEndpoint.HomePosts, this.f, this.F, this.Q, this.R, this.S), (sf2.g)new com.reddit.data.repository.l(this, 1)));
        ah2.f.e((Object)onAssembly, "remoteGql.getHomeLinks(\n\u2026E_SUBREDDIT_TITLES)\n    }");
        final boolean b3 = b && sortType != null && this.J.c(sortType, sortTimeFrame, listingViewMode);
        nf2.c0 onAssembly2 = onAssembly;
        if (b3) {
            final nf2.c0 w0 = u1.W0((zg2.p)new RedditLinkRepository$getHome$remoteOrPreload$1(this, (tg2.c)null));
            final v0 v0 = new v0(onAssembly, 0);
            w0.getClass();
            final nf2.c0 onAssembly3 = RxJavaPlugins.onAssembly((nf2.c0)new SingleFlatMap((g0)w0, (o)v0));
            final w0 w2 = new w0(this);
            onAssembly3.getClass();
            onAssembly2 = RxJavaPlugins.onAssembly((nf2.c0)new SingleDoFinally((g0)onAssembly3, (sf2.a)w2));
        }
        final x0 x2 = new x0(this, i, j, f, sortType, sortTimeFrame, s);
        onAssembly2.getClass();
        final nf2.c0 onAssembly4 = RxJavaPlugins.onAssembly((nf2.c0)new SingleFlatMap((g0)onAssembly2, (o)x2));
        final z1 z1 = new z1(1);
        onAssembly4.getClass();
        nf2.c0 c2 = RxJavaPlugins.onAssembly((nf2.c0)new cg2.e((g0)onAssembly4, (sf2.g)z1));
        ah2.f.e((Object)c2, "override fun getHome(\n  \u2026eOn(backgroundThread)\n  }");
        if (!b) {
            c2 = f.e((nf2.r)c2.M()).firstOrError();
        }
        final nf2.c0 w3 = c2.w((o)new g60.p0(this, 1));
        ah2.f.e((Object)w3, "if (refresh) {\n        r\u2026lterTopicRecommendations)");
        return u1.j1(w3, (r20.d)this.a);
    }
    
    public final void b(final String s) {
        ah2.f.f((Object)s, "requestId");
        this.i.b(s);
    }
    
    public final n b0(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        final n x = this.c.X(sortTimeFrame, sortType, s);
        final y0 y0 = new y0(4);
        x.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((nf2.r)x, (o)y0));
        ah2.f.e((Object)onAssembly, "localDb.getAllPopularLin\u2026isting.toILinkListing() }");
        final n onAssembly2 = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((nf2.r)ah2.c.f(onAssembly, this.d), (o)new u0(1)));
        ah2.f.e((Object)onAssembly2, "localDb.getAllPopularLin\u2026listing.toLinkListing() }");
        return dg.d.A1(onAssembly2, (r20.d)this.a);
    }
    
    public final nf2.a c0(final String s) {
        ah2.f.f((Object)s, "linkId");
        final nf2.a e = this.b.unsave(z10.w.d(s, ThingType.LINK)).e((nf2.e)this.c.unsave(s).u());
        ah2.f.e((Object)e, "remote.unsave(ThingUtil.\u2026inkId).onErrorComplete())");
        return o72.f.t(e, (r20.d)this.a);
    }
    
    public final void d0() {
        final Object value = this.g0.getValue();
        ah2.f.e(value, "<get-postDuplicatesStore>(...)");
        ((Store)value).clear();
    }
    
    public final nf2.c0<Boolean> delete(final String s) {
        ah2.f.f((Object)s, "linkId");
        final RemoteGqlLinkDataSource g = this.g;
        g.getClass();
        final nf2.c0 w = e$a.a((ur0.e)g.a, (h7.k)new k2(new m0(s)), (OkHttpClient)null, (Map)null, 14).w((o)new m10.p(5));
        ah2.f.e((Object)w, "graphQlClient.execute(\n \u2026deletePost?.ok ?: false }");
        final nf2.c0 onAssembly = RxJavaPlugins.onAssembly((nf2.c0)new SingleFlatMap((g0)u1.j1(w, (r20.d)this.a), (o)new com.reddit.data.repository.n(this, s, 1)));
        ah2.f.e((Object)onAssembly, "remoteGql.delete(linkId \u2026gle.just(deleted)\n      }");
        return (nf2.c0<Boolean>)onAssembly;
    }
    
    public final n e0(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        final i0 c = this.c;
        ah2.f.c((Object)s);
        return dg.d.A1(c.v(sortTimeFrame, sortType, s), (r20.d)this.a);
    }
    
    public final nf2.c0<Boolean> f0(final String s, final String s2) {
        ah2.f.f((Object)s, "linkKindWithId");
        ah2.f.f((Object)s2, "linkId");
        final nf2.c0 p2 = this.g.u(s, HideState.HIDDEN).p((o)new m10.l(3, (Object)this, (Object)s2));
        ah2.f.e((Object)p2, "remoteGql.updatePostHide\u2026).toSingleDefault(resp) }");
        return (nf2.c0<Boolean>)u1.j1(p2, (r20.d)this.a);
    }
    
    public final nf2.a follow(final String s, final boolean b) {
        ah2.f.f((Object)s, "linkId");
        final nf2.a e = this.b.follow(z10.w.d(s, ThingType.LINK), b).e((nf2.e)this.c.follow(s, b).u());
        ah2.f.e((Object)e, "remote.follow(ThingUtil.\u2026ollow).onErrorComplete())");
        return o72.f.t(e, (r20.d)this.a);
    }
    
    public final RedditLinkRepository$getLinkStreamById$$inlined$map$1 g(final String s) {
        ah2.f.f((Object)s, "linkId");
        return new RedditLinkRepository$getLinkStreamById$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1((pj2.e)this.c.R(s), (zg2.q)new RedditLinkRepository$getLinkStreamById$1(this, (tg2.c)null)), this, s);
    }
    
    public final pg2.j g0(final String s, final VoteDirection voteDirection) {
        this.E.a(voteDirection.getValue(), s);
        return pg2.j.a;
    }
    
    public final Object getLinkTitle(final String s, final tg2.c<? super String> c) {
        return mj2.g.l((CoroutineContext)this.A.c(), (zg2.p)new RedditLinkRepository$getLinkTitle$2(this, s, (tg2.c)null), (tg2.c)c);
    }
    
    public final Object h(String l$1, final tg2.c<? super UpdateResponse> c) {
        RedditLinkRepository$unSave.RedditLinkRepository$unSave$1 redditLinkRepository$unSave$2 = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$unSave.RedditLinkRepository$unSave$1) {
                final RedditLinkRepository$unSave.RedditLinkRepository$unSave$1 redditLinkRepository$unSave$1 = (RedditLinkRepository$unSave.RedditLinkRepository$unSave$1)c;
                final int label = redditLinkRepository$unSave$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$unSave$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$unSave$2 = redditLinkRepository$unSave$1;
                    break Label_0052;
                }
            }
            redditLinkRepository$unSave$2 = new RedditLinkRepository$unSave.RedditLinkRepository$unSave$1(this, (tg2.c)c);
        }
        Object o = redditLinkRepository$unSave$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$unSave$2.label;
        RedditLinkRepository redditLinkRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final UpdateResponse updateResponse = (UpdateResponse)redditLinkRepository$unSave$2.L$0;
                    aj2.c.Q0(o);
                    return updateResponse;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$1 = (String)redditLinkRepository$unSave$2.L$1;
                redditLinkRepository = (RedditLinkRepository)redditLinkRepository$unSave$2.L$0;
                aj2.c.Q0(o);
            }
        }
        else {
            aj2.c.Q0(o);
            final RemoteGqlLinkDataSource g = this.g;
            final String d = z10.w.d(l$1, ThingType.LINK);
            redditLinkRepository$unSave$2.L$0 = this;
            redditLinkRepository$unSave$2.L$1 = l$1;
            redditLinkRepository$unSave$2.label = 1;
            o = g.s(d, (tg2.c<? super UpdateResponse>)redditLinkRepository$unSave$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditLinkRepository = this;
        }
        UpdateResponse updateResponse2;
        final UpdateResponse l$2 = updateResponse2 = (UpdateResponse)o;
        if (!l$2.getSuccess()) {
            return updateResponse2;
        }
        final nf2.a u = redditLinkRepository.c.unsave(l$1).u();
        ah2.f.e((Object)u, "localDb.unsave(linkId).onErrorComplete()");
        redditLinkRepository$unSave$2.L$0 = l$2;
        redditLinkRepository$unSave$2.L$1 = null;
        redditLinkRepository$unSave$2.label = 2;
        if (kotlinx.coroutines.rx2.d.a(u, (tg2.c)redditLinkRepository$unSave$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final UpdateResponse updateResponse = l$2;
        updateResponse2 = updateResponse;
        return updateResponse2;
    }
    
    public final nf2.a h0(final String s, final VoteDirection voteDirection) {
        ah2.f.f((Object)s, "kindWithId");
        ah2.f.f((Object)voteDirection, "direction");
        return o72.f.t(this.b.vote(s, voteDirection.getValue()), (r20.d)this.a);
    }
    
    public final Object i(String l$1, final tg2.c<? super UpdateResponse> c) {
        RedditLinkRepository$save.RedditLinkRepository$save$1 redditLinkRepository$save$2 = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$save.RedditLinkRepository$save$1) {
                final RedditLinkRepository$save.RedditLinkRepository$save$1 redditLinkRepository$save$1 = (RedditLinkRepository$save.RedditLinkRepository$save$1)c;
                final int label = redditLinkRepository$save$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$save$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$save$2 = redditLinkRepository$save$1;
                    break Label_0052;
                }
            }
            redditLinkRepository$save$2 = new RedditLinkRepository$save.RedditLinkRepository$save$1(this, (tg2.c)c);
        }
        Object o = redditLinkRepository$save$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$save$2.label;
        RedditLinkRepository redditLinkRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final UpdateResponse updateResponse = (UpdateResponse)redditLinkRepository$save$2.L$0;
                    aj2.c.Q0(o);
                    return updateResponse;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$1 = (String)redditLinkRepository$save$2.L$1;
                redditLinkRepository = (RedditLinkRepository)redditLinkRepository$save$2.L$0;
                aj2.c.Q0(o);
            }
        }
        else {
            aj2.c.Q0(o);
            final RemoteGqlLinkDataSource g = this.g;
            final String d = z10.w.d(l$1, ThingType.LINK);
            redditLinkRepository$save$2.L$0 = this;
            redditLinkRepository$save$2.L$1 = l$1;
            redditLinkRepository$save$2.label = 1;
            o = g.q(d, (tg2.c<? super UpdateResponse>)redditLinkRepository$save$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditLinkRepository = this;
        }
        UpdateResponse updateResponse2;
        final UpdateResponse l$2 = updateResponse2 = (UpdateResponse)o;
        if (!l$2.getSuccess()) {
            return updateResponse2;
        }
        final nf2.a u = redditLinkRepository.c.save(l$1).u();
        ah2.f.e((Object)u, "localDb.save(linkId).onErrorComplete()");
        redditLinkRepository$save$2.L$0 = l$2;
        redditLinkRepository$save$2.L$1 = null;
        redditLinkRepository$save$2.label = 2;
        if (kotlinx.coroutines.rx2.d.a(u, (tg2.c)redditLinkRepository$save$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final UpdateResponse updateResponse = l$2;
        updateResponse2 = updateResponse;
        return updateResponse2;
    }
    
    public final nf2.a i0(final String s) {
        ah2.f.f((Object)s, "linkId");
        final nf2.a e = this.b.save(z10.w.d(s, ThingType.LINK)).e((nf2.e)this.c.save(s).u());
        ah2.f.e((Object)e, "remote.save(ThingUtil.pr\u2026inkId).onErrorComplete())");
        return o72.f.t(e, (r20.d)this.a);
    }
    
    public final Object j(final String s, final VoteDirection voteDirection, final tg2.c<? super UpdateResponse> c) {
        return this.g.v(s, voteDirection, c);
    }
    
    public final Object j0(final tg2.c<? super Boolean> c) {
        return mj2.g.l((CoroutineContext)this.A.c(), (zg2.p)new RedditLinkRepository$pruneListings$2(this, (tg2.c)null), (tg2.c)c);
    }
    
    public final nf2.a k() {
        final nf2.a u = this.c.o().u();
        ah2.f.e((Object)u, "localDb.clearExpiredMutations().onErrorComplete()");
        return o72.f.t(u, (r20.d)this.a);
    }
    
    public final VoteDirection k0(final String s) {
        ah2.f.f((Object)s, "kindWithId");
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
    
    public final Object l(final String s, final ModQueueSortingType modQueueSortingType, final String s2, final tg2.c<? super Listing<Link>> c) {
        return this.g.g(s, modQueueSortingType, s2, c);
    }
    
    public final nf2.a l0(final String s, final boolean b) {
        ah2.f.f((Object)s, "id");
        return wi.b.a0((zg2.p)new RedditLinkRepository$remove$1(this, s, b, (tg2.c)null));
    }
    
    public final nf2.a m(final String s) {
        ah2.f.f((Object)s, "linkId");
        return o72.f.t(this.c.m(s), (r20.d)this.a);
    }
    
    public final nf2.a m0(final String s) {
        ah2.f.f((Object)s, "id");
        return wi.b.a0((zg2.p)new RedditLinkRepository$approve$1(this, s, (tg2.c)null));
    }
    
    public final n<Listing<Link>> n() {
        return (n<Listing<Link>>)dg.d.A1((n)this.c.Z(), (r20.d)this.a);
    }
    
    public final nf2.c0<Listing<Link>> n0(final List<String> list) {
        ah2.f.f((Object)list, "ids");
        final nf2.c0 w = this.b.getLinksByIds(CollectionsKt___CollectionsKt.y1((Iterable)list, (CharSequence)",", (String)null, (String)null, (zg2.l)null, 62)).w((o)new t0(this, 0));
        ah2.f.e((Object)w, "remote.getLinksByIds(\n  \u2026apRemoteLink(it) })\n    }");
        return (nf2.c0<Listing<Link>>)u1.j1(w, (r20.d)this.a);
    }
    
    public final nf2.c0 o(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final String s3) {
        ah2.f.f((Object)s, "username");
        ah2.f.f((Object)sortType, "sort");
        final UserLinkKey userLinkKey = new UserLinkKey(sortType, sortTimeFrame, s, s2, s3);
        final Object value = this.T.getValue();
        ah2.f.e(value, "<get-submittedStore>(...)");
        final nf2.c0 value2 = ((Store)value).get((Object)userLinkKey);
        ah2.f.e((Object)value2, "submittedStore.get(linkKey)");
        nf2.c0 c0;
        if (s2 == null) {
            final nf2.c0 j1 = u1.j1(value2, (r20.d)this.a);
            final nf2.c0 y = this.i.c().r((o)new u0(0)).g((Object)EmptyList.INSTANCE).y();
            ah2.f.e((Object)y, "localVideoDataSource.get\u2026())\n          .toSingle()");
            final nf2.c0 q = nf2.c0.Q((g0)j1, (g0)y, (sf2.c)new u1());
            ah2.f.b((Object)q, "zipWith(other, BiFunctio\u2026-> zipper.invoke(t, u) })");
            c0 = u1.j1(q, (r20.d)this.a);
        }
        else {
            final nf2.c0 w = value2.w((o)new ch.b(8));
            ah2.f.e((Object)w, "get.map { toSubmittedListing(it, listOf()) }");
            c0 = u1.j1(w, (r20.d)this.a);
        }
        return c0;
    }
    
    public final n<Listing<Link>> o0(final String s) {
        return (n<Listing<Link>>)dg.d.A1((n)this.c.C(s), (r20.d)this.a);
    }
    
    public final n<Listing<Link>> p(final String s) {
        return (n<Listing<Link>>)dg.d.A1((n)this.c.I(s), (r20.d)this.a);
    }
    
    public final n<Listing<Link>> p0(final SortType sortType, final SortTimeFrame sortTimeFrame) {
        final n p2 = this.c.T(sortType, sortTimeFrame).p((o)new n0(2));
        ah2.f.e((Object)p2, "localDb.getAllHomeLinks(\u2026isting.toILinkListing() }");
        final n p3 = ah2.c.f(p2, this.d).p((o)new d1(3));
        ah2.f.e((Object)p3, "localDb.getAllHomeLinks(\u2026listing.toLinkListing() }");
        return (n<Listing<Link>>)dg.d.A1(p3, (r20.d)this.a);
    }
    
    public final nf2.a q(final String s) {
        ah2.f.f((Object)s, "id");
        return o72.f.t(this.b.modUnMarkSpoiler(s), (r20.d)this.a);
    }
    
    public final n r(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        return dg.d.A1(this.c.F(sortTimeFrame, sortType, s), (r20.d)this.a);
    }
    
    public final Object s(final Link link, final String s, final boolean b, final boolean b2, final tg2.c<? super Result<Link>> c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RedditLinkRepository$edit.RedditLinkRepository$edit$1) {
                final RedditLinkRepository$edit.RedditLinkRepository$edit$1 redditLinkRepository$edit$1 = (RedditLinkRepository$edit.RedditLinkRepository$edit$1)c;
                final int label = redditLinkRepository$edit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$edit$1.label = label + Integer.MIN_VALUE;
                    o = redditLinkRepository$edit$1;
                    break Label_0061;
                }
            }
            o = new RedditLinkRepository$edit.RedditLinkRepository$edit$1(this, (tg2.c)c);
        }
        Object o2 = ((RedditLinkRepository$edit.RedditLinkRepository$edit$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditLinkRepository$edit.RedditLinkRepository$edit$1)o).label;
        Label_0424: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        aj2.c.Q0(o2);
                        break Label_0424;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    aj2.c.Q0(o2);
                }
            }
            else {
                aj2.c.Q0(o2);
                if (this.I.f9()) {
                    ((RedditLinkRepository$edit.RedditLinkRepository$edit$1)o).label = 1;
                    if ((o2 = mj2.g.e((zg2.p)new RedditLinkRepository$editGql$2(link, b, this, b2, s, (tg2.c)null), (tg2.c)o)) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                else {
                    final String id = link.getId();
                    final String d = z10.w.d(id, ThingType.LINK);
                    nf2.a a;
                    if (b) {
                        a = this.b.modMarkNsfw(d);
                    }
                    else {
                        a = this.b.modUnMarkNsfw(d);
                    }
                    nf2.a a2;
                    if (b2) {
                        a2 = this.b.modMarkSpoiler(d);
                    }
                    else {
                        a2 = this.b.modUnMarkSpoiler(d);
                    }
                    final Boolean true = Boolean.TRUE;
                    final nf2.c0 c2 = a.C((Object)true);
                    ah2.f.e((Object)c2, "markNsfw.toSingleDefault(true)");
                    final nf2.c0 j1 = u1.j1(c2, (r20.d)this.a);
                    final nf2.c0 c3 = a2.C((Object)true);
                    ah2.f.e((Object)c3, "markSpoiler.toSingleDefault(true)");
                    final nf2.c0 p5 = nf2.c0.P(j1, u1.j1(c3, (r20.d)this.a), u1.j1((nf2.c0)this.b.edit(d, s, "json"), (r20.d)this.a), (sf2.h)new a2.b());
                    final q0 q0 = new q0(this, id, b, b2);
                    p5.getClass();
                    final nf2.c0 onAssembly = RxJavaPlugins.onAssembly((nf2.c0)new SingleFlatMap((g0)p5, (o)q0));
                    ah2.f.e((Object)onAssembly, "zip(\n      markNsfw.toSi\u2026)\n        }\n      }\n    }");
                    final nf2.c0 j2 = u1.j1(onAssembly, (r20.d)this.a);
                    ((RedditLinkRepository$edit.RedditLinkRepository$edit$1)o).label = 2;
                    if ((o2 = kotlinx.coroutines.rx2.d.b(j2, (tg2.c)o)) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    break Label_0424;
                }
            }
            return o2;
        }
        ah2.f.e(o2, "{\n      editLegacy(link.\u2026 isSpoiler).await()\n    }");
        return o2;
    }
    
    public final nf2.a sendRemovalMessage(final ContentRemovalMessage contentRemovalMessage) {
        return o72.f.t(this.b.sendRemovalMessage(contentRemovalMessage), (r20.d)this.a);
    }
    
    public final nf2.a sendRemovalReason(final RemovalReason removalReason) {
        return o72.f.t(this.b.sendRemovalReason(removalReason), (r20.d)this.a);
    }
    
    public final nf2.c0<Listing<Link>> t(final String s, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s2, final Integer n, final String s3, final boolean b, final ListingViewMode listingViewMode, final Context context, final i22.c c, final String s4, final String s5, final cb0.i<Link> i, final j<Link> j) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)c, "tracingFeatures");
        final o2 o2 = new o2((DisplaySource)null, sortType, sortTimeFrame, s2, n, (String)null, this.w0(s3), listingViewMode, s, (String)null, (String)null, (String)null, false, s4, s5, (cb0.i)i, (j)j, (Boolean)null, 286241);
        nf2.c0 c2;
        if (b) {
            final Object value = this.X.getValue();
            ah2.f.e(value, "<get-subredditLinkStore>(...)");
            c2 = ((Store)value).b((Object)o2);
        }
        else {
            final Object value2 = this.X.getValue();
            ah2.f.e(value2, "<get-subredditLinkStore>(...)");
            c2 = ((Store)value2).get((Object)o2);
        }
        ah2.f.e((Object)c2, "if (refresh) {\n      sub\u2026ore.get(requestKey)\n    }");
        return (nf2.c0<Listing<Link>>)u1.j1(c2, (r20.d)this.a);
    }
    
    public final Object u(final Link l$1, final tg2.c<? super Boolean> c) {
        RedditLinkRepository$subscribeToPost.RedditLinkRepository$subscribeToPost$1 redditLinkRepository$subscribeToPost$2 = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$subscribeToPost.RedditLinkRepository$subscribeToPost$1) {
                final RedditLinkRepository$subscribeToPost.RedditLinkRepository$subscribeToPost$1 redditLinkRepository$subscribeToPost$1 = (RedditLinkRepository$subscribeToPost.RedditLinkRepository$subscribeToPost$1)c;
                final int label = redditLinkRepository$subscribeToPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$subscribeToPost$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$subscribeToPost$2 = redditLinkRepository$subscribeToPost$1;
                    break Label_0052;
                }
            }
            redditLinkRepository$subscribeToPost$2 = new RedditLinkRepository$subscribeToPost.RedditLinkRepository$subscribeToPost$1(this, (tg2.c)c);
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
                    aj2.c.Q0(o);
                    return z$0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                link = (Link)redditLinkRepository$subscribeToPost$2.L$1;
                redditLinkRepository = (RedditLinkRepository)redditLinkRepository$subscribeToPost$2.L$0;
                aj2.c.Q0(o);
            }
        }
        else {
            aj2.c.Q0(o);
            final RemoteGqlLinkDataSource g = this.g;
            final String kindWithId = l$1.getKindWithId();
            redditLinkRepository$subscribeToPost$2.L$0 = this;
            redditLinkRepository$subscribeToPost$2.L$1 = l$1;
            redditLinkRepository$subscribeToPost$2.label = 1;
            o = g.r(kindWithId, (tg2.c<? super Boolean>)redditLinkRepository$subscribeToPost$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            link = l$1;
            redditLinkRepository = this;
        }
        final boolean z$0 = (boolean)o;
        final nf2.a u = redditLinkRepository.c.n(link.getId()).u();
        ah2.f.e((Object)u, "localDb.subscribe(link.i\u2026\n      .onErrorComplete()");
        final nf2.a t = o72.f.t(u, (r20.d)redditLinkRepository.a);
        redditLinkRepository$subscribeToPost$2.L$0 = null;
        redditLinkRepository$subscribeToPost$2.L$1 = null;
        redditLinkRepository$subscribeToPost$2.Z$0 = z$0;
        redditLinkRepository$subscribeToPost$2.label = 2;
        if (kotlinx.coroutines.rx2.d.a(t, (tg2.c)redditLinkRepository$subscribeToPost$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return z$0;
    }
    
    public final nf2.a v(final String s) {
        ah2.f.f((Object)s, "id");
        return o72.f.t(this.b.modLockComments(s), (r20.d)this.a);
    }
    
    public final nf2.c0 w(final String s, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s2, final String s3, final boolean b, final ListingViewMode listingViewMode, final Context context, final i22.c c, final cb0.i i, final j j) {
        ah2.f.f((Object)s, "multiredditPath");
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)c, "tracingFeatures");
        final o2 o2 = new o2((DisplaySource)null, sortType, sortTimeFrame, s2, (Integer)null, s3, (dv.a)null, listingViewMode, (String)null, s, (String)null, (String)null, false, (String)null, (String)null, i, j, (Boolean)null, 318801);
        nf2.c0 c2;
        if (b) {
            final Object value = this.Y.getValue();
            ah2.f.e(value, "<get-multiredditLinkStore>(...)");
            c2 = ((Store)value).b((Object)o2);
        }
        else {
            final Object value2 = this.Y.getValue();
            ah2.f.e(value2, "<get-multiredditLinkStore>(...)");
            c2 = ((Store)value2).get((Object)o2);
        }
        ah2.f.e((Object)c2, "if (refresh) {\n      mul\u2026ore.get(requestKey)\n    }");
        return u1.j1(c2, (r20.d)this.a);
    }
    
    public final dv.a w0(final String s) {
        dv.a a;
        if (this.w.vb()) {
            a = (dv.a)mj2.g.k((zg2.p)new RedditLinkRepository$fetchAdContext$1(this, s, (tg2.c)null));
        }
        else {
            a = new dv.a(s, (ListingViewMode)null, (dv.b)null, 6);
        }
        return a;
    }
    
    public final nf2.c0 x(final ArrayList list) {
        final nf2.c0 w = this.c.N(list).w((o)new g60.p0(this, 2));
        ah2.f.e((Object)w, "localDb.getLinksById(ids\u2026seUniqueIdForAds)\n      }");
        return u1.j1(w, (r20.d)this.a);
    }
    
    public final Object x0(final String s, final tg2.c<? super Link> c) {
        RedditLinkRepository$fetchLinkFromRemote.RedditLinkRepository$fetchLinkFromRemote$1 redditLinkRepository$fetchLinkFromRemote$2 = null;
        Label_0052: {
            if (c instanceof RedditLinkRepository$fetchLinkFromRemote.RedditLinkRepository$fetchLinkFromRemote$1) {
                final RedditLinkRepository$fetchLinkFromRemote.RedditLinkRepository$fetchLinkFromRemote$1 redditLinkRepository$fetchLinkFromRemote$1 = (RedditLinkRepository$fetchLinkFromRemote.RedditLinkRepository$fetchLinkFromRemote$1)c;
                final int label = redditLinkRepository$fetchLinkFromRemote$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$fetchLinkFromRemote$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$fetchLinkFromRemote$2 = redditLinkRepository$fetchLinkFromRemote$1;
                    break Label_0052;
                }
            }
            redditLinkRepository$fetchLinkFromRemote$2 = new RedditLinkRepository$fetchLinkFromRemote.RedditLinkRepository$fetchLinkFromRemote$1(this, (tg2.c)c);
        }
        final Object result = redditLinkRepository$fetchLinkFromRemote$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$fetchLinkFromRemote$2.label;
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
            final nf2.c0 w = this.b.getLinksByIds(z10.w.d(s, ThingType.LINK)).w((o)new com.reddit.data.repository.b(this, 1));
            ah2.f.e((Object)w, "remote.getLinksByIds(Thi\u2026nk(it.children.first()) }");
            final nf2.c0 j1 = u1.j1(w, (r20.d)this.a);
            redditLinkRepository$fetchLinkFromRemote$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(j1, (tg2.c)redditLinkRepository$fetchLinkFromRemote$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(b, "remote.getLinksByIds(Thi\u2026undThread)\n      .await()");
        return b;
    }
    
    public final nf2.a y(final String s) {
        ah2.f.f((Object)s, "id");
        return o72.f.t(wi.b.a0((zg2.p)new RedditLinkRepository$unMarkNsfw$1(this, s, (tg2.c)null)), (r20.d)this.a);
    }
    
    public final Link y0(Link link) {
        final SubredditDetail subredditDetail = link.getSubredditDetail();
        if (subredditDetail != null) {
            final Boolean userIsSubscriber = subredditDetail.getUserIsSubscriber();
            if (userIsSubscriber != null) {
                final Link copy$default = Link.copy$default(link, null, null, 0L, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, userIsSubscriber, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -1, -1, -1073741825, 134217727, null);
                if (copy$default != null) {
                    link = copy$default;
                }
            }
        }
        Link copy$default2 = link;
        if (ah2.f.a((Object)this.e.b(), (Object)Boolean.TRUE)) {
            copy$default2 = Link.copy$default(link, null, null, 0L, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, true, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -1, -1, -1025, 134217727, null);
        }
        return copy$default2;
    }
    
    public final nf2.c0 z(final String s, final HistorySortType historySortType, final String s2, final boolean b, final Context context, final i22.c c) {
        ah2.f.f((Object)s, "username");
        ah2.f.f((Object)historySortType, "sort");
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)c, "tracingFeatures");
        final g60.f f = new g60.f(s, historySortType, s2);
        nf2.c0 c2;
        if (b) {
            final Object value = this.W.getValue();
            ah2.f.e(value, "<get-historyLinkStore>(...)");
            c2 = ((Store)value).b((Object)f);
        }
        else {
            final Object value2 = this.W.getValue();
            ah2.f.e(value2, "<get-historyLinkStore>(...)");
            c2 = ((Store)value2).get((Object)f);
        }
        ah2.f.e((Object)c2, "if (refresh) historyLink\u2026LinkStore.get(requestKey)");
        return u1.j1(c2, (r20.d)this.a);
    }
    
    public final <T extends ILink> T z0(final T t) {
        if (!(t instanceof Link)) {
            return t;
        }
        final Link copy$default = Link.copy$default((Link)t, this.x.a(t.getId(), t.getUniqueId(), t.getPromoted()), null, 0L, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -2, -1, -1, 134217727, null);
        ah2.f.d((Object)copy$default, "null cannot be cast to non-null type T of com.reddit.data.repository.RedditLinkRepository.useUniqueIdForAds");
        return (T)copy$default;
    }
}
