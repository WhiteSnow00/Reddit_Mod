// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.queries.lb;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.listing.RemovalReason;
import com.reddit.domain.model.listing.ContentRemovalMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import b60.q0;
import kotlin.collections.EmptyList;
import com.reddit.data.local.UserLinkKey;
import b60.i0;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.domain.repository.ModQueueSortingType;
import b60.r0;
import okhttp3.OkHttpClient;
import mr0.e$a;
import com.reddit.mutations.k2;
import y12.m0;
import java.util.UUID;
import com.reddit.domain.model.vote.VoteDirection;
import com.reddit.domain.model.media.FbpMediaType;
import com.reddit.domain.model.media.VideoContext;
import com.reddit.common.experiments.model.channels.FeedNotificationsVariant;
import b60.m1;
import b60.l1;
import io.reactivex.internal.operators.single.SingleDoFinally;
import io.reactivex.internal.operators.single.SingleFlatMap;
import b60.q;
import y12.x1;
import h7.h$a;
import zi2.k0;
import com.reddit.common.ThingType;
import b60.t;
import com.reddit.frontpage.presentation.link.DistinguishType;
import x12.p$a;
import com.reddit.tracking.TrackerParams$TrackerType;
import com.reddit.listing.model.sort.HistorySortType;
import com.reddit.type.HideState;
import kotlin.coroutines.CoroutineContext;
import com.nytimes.android.external.store3.base.impl.Store;
import mg.d0;
import com.reddit.domain.model.UpdateSubredditTitleSafetyDto;
import y10.w;
import com.reddit.listing.common.ListingType;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.ads.domain.DisplaySource;
import af2.g0;
import pf2.h;
import com.reddit.tracking.RedditEndpoint;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import b60.d2;
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
import dg2.m;
import com.reddit.domain.model.Link;
import java.util.Iterator;
import com.google.firebase.perf.metrics.Trace;
import com.reddit.domain.model.ILink;
import com.reddit.domain.model.TopicsRecommendationFeedElement;
import java.util.ArrayList;
import b60.j0;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import zi2.g;
import java.util.Collection;
import af2.c0;
import com.reddit.domain.model.listing.Listing;
import com.reddit.session.n;
import com.reddit.listing.model.sort.SortType$a;
import com.reddit.listing.model.sort.SortType;
import wa0.v;
import wa0.a0;
import ws0.e;
import o12.d;
import pd0.i;
import com.reddit.domain.targeting.ResurrectedUserTargetingUseCase;
import xd0.h0;
import wa0.r;
import x40.l0;
import y50.l;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import x12.p;
import java.util.LinkedHashMap;
import x40.e0;
import com.reddit.data.remote.RemoteLinkDataSource;
import com.reddit.domain.usecase.GeoFilterUseCase;
import xd0.s;
import com.reddit.events.discover.DiscoverAnalytics;
import xd0.o;
import wa0.k;
import s12.c;
import android.content.Context;
import x12.f;
import iw0.b;
import d20.a;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xd0.j;

public final class RedditLinkRepository implements j
{
    public static final Pair<Long, TimeUnit> h0;
    public static final Pair<Long, TimeUnit> i0;
    public static final Pair<Long, TimeUnit> j0;
    public final d20.a A;
    public final fb0.a B;
    public final b C;
    public final wa0.b D;
    public final lf0.a E;
    public final f F;
    public final Context G;
    public final c H;
    public final k I;
    public final or0.c J;
    public final o K;
    public final DiscoverAnalytics L;
    public final p01.a M;
    public final s N;
    public final GeoFilterUseCase O;
    public final nb0.a P;
    public final String Q;
    public final String R;
    public final boolean S;
    public final cg2.f T;
    public final cg2.f U;
    public final cg2.f V;
    public final cg2.f W;
    public final cg2.f X;
    public final cg2.f Y;
    public final cg2.f Z;
    public final q20.a a;
    public final cg2.f a0;
    public final RemoteLinkDataSource b;
    public final cg2.f b0;
    public final e0 c;
    public LinkedHashMap c0;
    public final wb0.a d;
    public final cg2.f d0;
    public final av.a e;
    public final cg2.f e0;
    public final p f;
    public final cg2.f f0;
    public final RemoteGqlLinkDataSource g;
    public final cg2.f g0;
    public final l h;
    public final l0 i;
    public final y50.a j;
    public final r k;
    public final va0.k l;
    public final h0 m;
    public final wc0.b n;
    public final cw.a o;
    public final ResurrectedUserTargetingUseCase p;
    public final i q;
    public final d81.a r;
    public final d s;
    public final e t;
    public final dw0.a u;
    public final a0 v;
    public final cv.a w;
    public final xv.a x;
    public final s01.a y;
    public final v z;
    
    static {
        final SortType$a companion = SortType.Companion;
        final TimeUnit seconds = TimeUnit.SECONDS;
        h0 = new Pair((Object)10L, (Object)seconds);
        i0 = new Pair((Object)60L, (Object)seconds);
        j0 = new Pair((Object)1L, (Object)TimeUnit.HOURS);
    }
    
    public RedditLinkRepository(final q20.a a, final RemoteLinkDataSource b, final e0 c, final wb0.a d, final av.a e, final p f, final RemoteGqlLinkDataSource g, final l h, final l0 i, final y50.a j, final r k, final va0.k l, final h0 m, final wc0.b n, final cw.a o, final ResurrectedUserTargetingUseCase p44, final i q, final d81.a r, final d s, final e t, final dw0.a u, final a0 v, final cv.a w, final xv.a x, final s01.a y, final v z, final d20.a a2, final fb0.a b2, final b c2, final wa0.b d2, final lf0.a e2, final f f2, final Context g2, final c h2, final k i2, final n n2, final or0.c j2, final o k2, final wa0.j j3, final DiscoverAnalytics l2, final p01.a m2, final s n3, final GeoFilterUseCase o2, final nb0.a p45) {
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
        this.N = n3;
        this.O = o2;
        this.P = p45;
        this.Q = j3.e();
        this.R = String.valueOf(j3.o());
        this.S = n2.A();
        this.T = kotlin.a.b((mg2.a)new RedditLinkRepository$submittedStore$2(this));
        this.U = kotlin.a.b((mg2.a)new RedditLinkRepository$popularLinkStore$2(this));
        this.V = kotlin.a.b((mg2.a)new RedditLinkRepository$categoryLinkStore$2(this));
        this.W = kotlin.a.b((mg2.a)new RedditLinkRepository$historyLinkStore$2(this));
        this.X = kotlin.a.b((mg2.a)new RedditLinkRepository$subredditLinkStore$2(this));
        this.Y = kotlin.a.b((mg2.a)new RedditLinkRepository$multiredditLinkStore$2(this));
        this.Z = kotlin.a.b((mg2.a)new RedditLinkRepository$savedPostsStore$2(this));
        this.a0 = kotlin.a.b((mg2.a)new RedditLinkRepository$topAwardedPostsStore$2(this));
        this.b0 = kotlin.a.b((mg2.a)new RedditLinkRepository$predictionsTournamentPostsStore$2(this));
        this.c0 = new LinkedHashMap();
        this.d0 = kotlin.a.b((mg2.a)new RedditLinkRepository$discoverTopicLinksStore$2(this));
        this.e0 = kotlin.a.b((mg2.a)new RedditLinkRepository$recommendedVideosLinkStore$2(this));
        this.f0 = kotlin.a.b((mg2.a)new RedditLinkRepository$recommendedMediaLinkStore$2(this));
        this.g0 = kotlin.a.b((mg2.a)new RedditLinkRepository$postDuplicatesStore$2(this));
    }
    
    public static c0 m0(final RedditLinkRepository redditLinkRepository, final Listing listing, final Listing listing2, final af2.n n, final Boolean b) {
        ng2.e.f((Object)redditLinkRepository, "this$0");
        ng2.e.f((Object)listing, "$listing");
        ng2.e.f((Object)listing2, "$postFilteredListing");
        ng2.e.f((Object)n, "$local");
        ng2.e.f((Object)b, "it");
        c0<Listing> c0;
        if (redditLinkRepository.v.g()) {
            final ArrayList j5 = CollectionsKt___CollectionsKt.J5((Collection)g.i((mg2.p)new RedditLinkRepository$getHome$remoteOrPreload$4$3$links$1(redditLinkRepository, listing2, (gg2.c)null)));
            v0(listing, j5);
            c0 = af2.c0.v(Listing.copy$default(listing2, (List)j5, (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (Object)null));
        }
        else {
            c0 = RxJavaPlugins.onAssembly((af2.n)new io.reactivex.internal.operators.maybe.a((af2.r)n, (ff2.o)new nw.d((Object)redditLinkRepository, 4, (Object)listing, (Object)listing2))).z(listing);
        }
        return c0.w((ff2.o<? super Listing, ?>)new j0(redditLinkRepository, 1));
    }
    
    public static Listing n0(final RedditLinkRepository redditLinkRepository, Listing listing) {
        redditLinkRepository.getClass();
        final Trace b = qi.b.b("LinkRepository.filter_topic_recommendations");
        if (redditLinkRepository.k.Hb()) {
            b.stop();
        }
        else {
            Listing copy$default = listing;
            if (!(boolean)g.i((mg2.p)new RedditLinkRepository$filterTopicRecommendations$showTopicRecommendations$1(redditLinkRepository, (gg2.c)null))) {
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
    
    public static final Listing o0(final RedditLinkRepository redditLinkRepository, Listing copy$default, final va0.i i, final va0.j j) {
        final Trace b = qi.b.b("LinkRepository.filter_generic_listing");
        if (i != null) {
            copy$default = Listing.copy$default(copy$default, i.a(copy$default.getChildren(), j), (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (Object)null);
        }
        b.stop();
        return copy$default;
    }
    
    public static final List p0(final RedditLinkRepository redditLinkRepository, final List list) {
        redditLinkRepository.getClass();
        final ArrayList list2 = new ArrayList();
        for (final Object next : list) {
            if (next instanceof Link) {
                list2.add(next);
            }
        }
        final ArrayList list3 = new ArrayList<String>(m.u4((Iterable)list2, 10));
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list3.add(((Link)iterator2.next()).getId());
        }
        final List f = redditLinkRepository.c.f(CollectionsKt___CollectionsKt.I5((Iterable)list3));
        int p2;
        if ((p2 = cg.d.p3(m.u4((Iterable)f, 10))) < 16) {
            p2 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap<String, d60.k>(p2);
        for (final Object next2 : f) {
            linkedHashMap.put(((d60.k)next2).a, (d60.k)next2);
        }
        List<ILink> list4;
        if (linkedHashMap.isEmpty()) {
            list4 = list;
        }
        else {
            final ArrayList<ILink> list5 = new ArrayList<ILink>(m.u4((Iterable)list, 10));
            final Iterator iterator4 = list.iterator();
            while (true) {
                list4 = list5;
                if (!iterator4.hasNext()) {
                    break;
                }
                Object copy$default;
                final Object o = copy$default = iterator4.next();
                if (o instanceof Link) {
                    copy$default = o;
                    if (linkedHashMap.containsKey(((ILink)o).getId())) {
                        final d60.k value = linkedHashMap.get(((ILink)o).getId());
                        ng2.e.c((Object)value);
                        final d60.k k = value;
                        final Link link = (Link)o;
                        final boolean b = k.b;
                        final Boolean e = k.e;
                        copy$default = Link.copy$default(link, (String)null, (String)null, 0L, (Long)null, (String)null, (String)null, (String)null, (String)null, 0, (Boolean)null, 0, 0.0, 0, 0L, (Long)null, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (List)null, (List)null, (String)null, (String)null, (String)null, false, (List)null, (AwardLeaderboardStatus)null, false, false, (String)null, false, false, (String)null, (String)null, (Preview)null, (Preview)null, (LinkMedia)null, (String)null, (String)null, (String)null, false, (String)null, (String)null, (String)null, false, false, false, false, false, false, false, false, false, false, false, false, (String)null, (String)null, (Long)null, (String)null, (String)null, false, false, false, (BannedBy)null, (Integer)null, false, false, (String)null, (List)null, (List)null, (ModQueueTriggers)null, (NoteLabel)null, (List)null, (SubredditDetail)null, false, false, (Boolean)null, (PromoLayoutType)null, (List)null, (OutboundLink)null, (String)null, (List)null, false, (RichTextResponse)null, (Map)null, (PostPoll)null, (PostPredictionsTournamentData)null, (RpanVideo)null, (AudioRoom)null, (LegacyAudioRoom)null, (PostGallery)null, (RecommendationContext)null, (List)null, b, e != null && e, (String)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (String)null, false, (Long)null, (Long)null, false, (DiscussionType)null, (Boolean)null, (String)null, (Integer)null, (AppStoreData)null, (Boolean)null, (String)null, false, (String)null, (String)null, (List)null, (Integer)null, (String)null, (List)null, (String)null, (CrowdControlFilterLevel)null, false, (List)null, -1, -1, -1, -7, (Object)null);
                        ng2.e.d(copy$default, "null cannot be cast to non-null type com.reddit.domain.model.ILink");
                    }
                }
                list5.add((ILink)copy$default);
            }
        }
        return list4;
    }
    
    public static final Object q0(final RedditLinkRepository redditLinkRepository, final d2 d2, final gg2.c c) {
        redditLinkRepository.getClass();
        RedditLinkRepository$fetchPopularListing$1 redditLinkRepository$fetchPopularListing$2 = null;
        Label_0058: {
            if (c instanceof RedditLinkRepository$fetchPopularListing$1) {
                final RedditLinkRepository$fetchPopularListing$1 redditLinkRepository$fetchPopularListing$1 = (RedditLinkRepository$fetchPopularListing$1)c;
                final int label = redditLinkRepository$fetchPopularListing$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$fetchPopularListing$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$fetchPopularListing$2 = redditLinkRepository$fetchPopularListing$1;
                    break Label_0058;
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
            cg.d.b4(result);
            b = result;
        }
        else {
            cg.d.b4(result);
            final DisplaySource a = d2.a;
            final SortType b2 = d2.b;
            final SortTimeFrame c2 = d2.c;
            final String d3 = d2.d;
            final Integer e = d2.e;
            final zu.a g = d2.g;
            final ListingViewMode h = d2.h;
            final String l = d2.l;
            final String n = d2.n;
            final String o = d2.o;
            final Boolean s = d2.s;
            Map map;
            if (n != null) {
                map = vl.a.X2(n, redditLinkRepository.f, o);
            }
            else {
                map = kotlin.collections.c.u4();
            }
            redditLinkRepository.s.b("LinkRepository.getPopular_network_fetch");
            final RemoteGqlLinkDataSource g2 = redditLinkRepository.g;
            ng2.e.c((Object)b2);
            ng2.e.c((Object)l);
            final c0 w = ah0.b.I1(g2.h(a, b2, c2, d3, g, h, l, redditLinkRepository.e.c(), map, e, s), RedditEndpoint.PopularPosts, redditLinkRepository.f, redditLinkRepository.F, redditLinkRepository.Q, redditLinkRepository.R, redditLinkRepository.S).w((ff2.o)new su.d(13));
            final com.reddit.data.repository.l i = new com.reddit.data.repository.l(redditLinkRepository, 1);
            w.getClass();
            final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new h((g0)w, (ff2.g)i));
            ng2.e.e((Object)onAssembly, "remoteGql.getPopularLink\u2026E_SUBREDDIT_TITLES)\n    }");
            redditLinkRepository$fetchPopularListing$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(onAssembly, (gg2.c)redditLinkRepository$fetchPopularListing$2)) == coroutine_SUSPENDED) {
                b = coroutine_SUSPENDED;
                return b;
            }
        }
        ng2.e.e(b, "remoteGql.getPopularLink\u2026DIT_TITLES)\n    }.await()");
        return b;
    }
    
    public static final Object r0(final RedditLinkRepository redditLinkRepository, final Listing listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final gg2.c c) {
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
            cg.d.b4(result);
        }
        else {
            cg.d.b4(result);
            final e0 c2 = redditLinkRepository.c;
            redditLinkRepository$saveHomeLinksInternal$2.label = 1;
            if (c2.I(listing, sortType, sortTimeFrame, s, (gg2.c)redditLinkRepository$saveHomeLinksInternal$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return Boolean.TRUE;
    }
    
    public static final Object s0(RedditLinkRepository l$0, final Listing listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final gg2.c c) {
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
            cg.d.b4(result);
        }
        else {
            cg.d.b4(result);
            l$0.s.b("LocalLinkDataSource.savePopularElements");
            final e0 c2 = l$0.c;
            redditLinkRepository$savePopularLinksInternal$2.L$0 = l$0;
            redditLinkRepository$savePopularLinksInternal$2.label = 1;
            if (c2.w(listing, sortType, sortTimeFrame, s, s2, (gg2.c)redditLinkRepository$savePopularLinksInternal$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        l$0.s.e("LocalLinkDataSource.savePopularElements");
        return Boolean.TRUE;
    }
    
    public static final Object t0(final RedditLinkRepository redditLinkRepository, final List list, ListingType l$1, final gg2.c c) {
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
                        cg.d.b4(result);
                        break Label_0281;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    cg.d.b4(result);
                    final ArrayList list2 = new ArrayList(m.u4((Iterable)list, 10));
                    iterator = list.iterator();
                    l$2 = redditLinkRepository;
                    list3 = list2;
                }
                Object a;
                if (iterator.hasNext()) {
                    final Link link = iterator.next();
                    final cw.a o4 = l$2.o;
                    final boolean promoted = link.getPromoted();
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$0 = l$2;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$1 = l$1;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$2 = list3;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$3 = iterator;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).L$4 = list3;
                    ((RedditLinkRepository$updateAdsSessionSlot$1)o).label = 1;
                    if (o4.b(promoted, l$1, (gg2.c)o) != coroutine_SUSPENDED) {
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
                    a = cg2.j.a;
                }
                return a;
            }
            ((Collection<cg2.j>)o2).add(cg2.j.a);
            final Object o5 = o3;
            l$1 = listingType;
            List list3 = (List)o5;
            continue;
        }
    }
    
    public static final Object u0(final RedditLinkRepository redditLinkRepository, final List list, final gg2.c c) {
        Object o3;
        if (redditLinkRepository.B.R2()) {
            final h0 m = redditLinkRepository.m;
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
                            final String g = w.g(link.getSubredditId());
                            final SubredditDetail subredditDetail3 = link.getSubredditDetail();
                            Boolean titleSafe2 = b;
                            if (subredditDetail3 != null) {
                                titleSafe2 = subredditDetail3.isTitleSafe();
                            }
                            ng2.e.c((Object)titleSafe2);
                            o2 = new UpdateSubredditTitleSafetyDto(g, (boolean)titleSafe2);
                        }
                    }
                }
                if (o2 != null) {
                    list2.add(o2);
                }
            }
            o3 = m.Y(list2, c);
            if (o3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                o3 = cg2.j.a;
            }
        }
        else {
            o3 = cg2.j.a;
        }
        return o3;
    }
    
    public static void v0(final Listing listing, final ArrayList list) {
        final List children = listing.getChildren();
        final ArrayList list2 = new ArrayList<Pair>(m.u4((Iterable)children, 10));
        final Iterator iterator = children.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < 0) {
                cg.d.a4();
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
        for (final Map.Entry<Number, V> entry : kotlin.collections.c.E4((List)list3).entrySet()) {
            if (entry.getKey().intValue() < list.size()) {
                list.add(entry.getKey().intValue(), entry.getValue());
            }
        }
    }
    
    public static Listing w0(Listing copy$default, final va0.i i, final va0.j j) {
        final Trace b = qi.b.b("LinkRepository.filter_generic_listing");
        if (i != null) {
            copy$default = Listing.copy$default(copy$default, i.a(copy$default.getChildren(), j), (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (Object)null);
        }
        b.stop();
        return copy$default;
    }
    
    @Override
    public final af2.a A(final String s) {
        ng2.e.f((Object)s, "id");
        return mg.d0.S0(this.b.modUnlockComments(s), (q20.d)this.a);
    }
    
    public final <T extends ILink> T A0(final T t) {
        if (!(t instanceof Link)) {
            return t;
        }
        final Link copy$default = Link.copy$default((Link)t, this.x.a(t.getId(), t.getUniqueId(), t.getPromoted()), (String)null, 0L, (Long)null, (String)null, (String)null, (String)null, (String)null, 0, (Boolean)null, 0, 0.0, 0, 0L, (Long)null, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (List)null, (List)null, (String)null, (String)null, (String)null, false, (List)null, (AwardLeaderboardStatus)null, false, false, (String)null, false, false, (String)null, (String)null, (Preview)null, (Preview)null, (LinkMedia)null, (String)null, (String)null, (String)null, false, (String)null, (String)null, (String)null, false, false, false, false, false, false, false, false, false, false, false, false, (String)null, (String)null, (Long)null, (String)null, (String)null, false, false, false, (BannedBy)null, (Integer)null, false, false, (String)null, (List)null, (List)null, (ModQueueTriggers)null, (NoteLabel)null, (List)null, (SubredditDetail)null, false, false, (Boolean)null, (PromoLayoutType)null, (List)null, (OutboundLink)null, (String)null, (List)null, false, (RichTextResponse)null, (Map)null, (PostPoll)null, (PostPredictionsTournamentData)null, (RpanVideo)null, (AudioRoom)null, (LegacyAudioRoom)null, (PostGallery)null, (RecommendationContext)null, (List)null, false, false, (String)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (String)null, false, (Long)null, (Long)null, false, (DiscussionType)null, (Boolean)null, (String)null, (Integer)null, (AppStoreData)null, (Boolean)null, (String)null, false, (String)null, (String)null, (List)null, (Integer)null, (String)null, (List)null, (String)null, (CrowdControlFilterLevel)null, false, (List)null, -2, -1, -1, -1, (Object)null);
        ng2.e.d((Object)copy$default, "null cannot be cast to non-null type T of com.reddit.data.repository.RedditLinkRepository.useUniqueIdForAds");
        return (T)copy$default;
    }
    
    @Override
    public final RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1 B(final String s) {
        ng2.e.f((Object)s, "kindWithId");
        return new RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1((cj2.e)this.E.c(s));
    }
    
    @Override
    public final af2.n<Link> C(final String s) {
        ng2.e.f((Object)s, "id");
        return px1.a.J0(this.c.a(s), (q20.d)this.a);
    }
    
    @Override
    public final c0 D(final String s, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s2, final String s3, final boolean b, final ListingViewMode listingViewMode, final Context context, final c c, final va0.i i, final va0.j j) {
        ng2.e.f((Object)s, "multiredditPath");
        ng2.e.f((Object)context, "context");
        ng2.e.f((Object)c, "tracingFeatures");
        final d2 d2 = new d2(null, sortType, sortTimeFrame, s2, null, s3, null, listingViewMode, null, s, null, null, false, null, null, i, j, null, 318801);
        c0 c2;
        if (b) {
            final Object value = this.Y.getValue();
            ng2.e.e(value, "<get-multiredditLinkStore>(...)");
            c2 = ((Store)value).m((Object)d2);
        }
        else {
            final Object value2 = this.Y.getValue();
            ng2.e.e(value2, "<get-multiredditLinkStore>(...)");
            c2 = ((Store)value2).get((Object)d2);
        }
        ng2.e.e((Object)c2, "if (refresh) {\n      mul\u2026ore.get(requestKey)\n    }");
        return px1.a.K0(c2, (q20.d)this.a);
    }
    
    @Override
    public final c0<Map<String, Link>> E(final String s, final String s2, final String s3) {
        ng2.e.f((Object)s, "prefixedSubredditName");
        ng2.e.f((Object)s2, "linkId");
        final b60.j j = new b60.j(s, s2, s3);
        final Object value = this.g0.getValue();
        ng2.e.e(value, "<get-postDuplicatesStore>(...)");
        final c0 value2 = ((Store)value).get((Object)j);
        ng2.e.e((Object)value2, "postDuplicatesStore.get(key)");
        return px1.a.K0(value2, (q20.d)this.a);
    }
    
    @Override
    public final Object F(final String s, final gg2.c<? super cg2.j> c) {
        final Object e = this.M.e(s, false, (gg2.c)c);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return cg2.j.a;
    }
    
    @Override
    public final Object G(final String s, final gg2.c c) {
        RedditLinkRepository$getTopAwardedPosts$1 redditLinkRepository$getTopAwardedPosts$2 = null;
        Label_0053: {
            if (c instanceof RedditLinkRepository$getTopAwardedPosts$1) {
                final RedditLinkRepository$getTopAwardedPosts$1 redditLinkRepository$getTopAwardedPosts$1 = (RedditLinkRepository$getTopAwardedPosts$1)c;
                final int label = redditLinkRepository$getTopAwardedPosts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$getTopAwardedPosts$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$getTopAwardedPosts$2 = redditLinkRepository$getTopAwardedPosts$1;
                    break Label_0053;
                }
            }
            redditLinkRepository$getTopAwardedPosts$2 = new RedditLinkRepository$getTopAwardedPosts$1(this, c);
        }
        final Object result = redditLinkRepository$getTopAwardedPosts$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$getTopAwardedPosts$2.label;
        Object j;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            j = result;
        }
        else {
            cg.d.b4(result);
            final d2 d2 = new d2(null, null, null, null, null, null, null, null, null, null, null, null, false, s, null, null, null, null, 516095);
            final ij2.a c2 = this.A.c();
            final RedditLinkRepository$getTopAwardedPosts$2 redditLinkRepository$getTopAwardedPosts$3 = new RedditLinkRepository$getTopAwardedPosts$2(false, this, d2, (gg2.c)null);
            redditLinkRepository$getTopAwardedPosts$2.label = 1;
            if ((j = zi2.g.j((CoroutineContext)c2, (mg2.p)redditLinkRepository$getTopAwardedPosts$3, (gg2.c)redditLinkRepository$getTopAwardedPosts$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(j, "override suspend fun get\u2026      }.await()\n    }\n  }");
        return j;
    }
    
    @Override
    public final c0<Boolean> H(final String s, final String s2) {
        ng2.e.f((Object)s, "linkKindWithId");
        ng2.e.f((Object)s2, "linkId");
        final c0 p2 = this.g.u(s, HideState.NONE).p((ff2.o)new b60.h0(this, s2, 1));
        ng2.e.e((Object)p2, "remoteGql.updatePostHide\u2026).toSingleDefault(resp) }");
        return px1.a.K0((c0)p2, (q20.d)this.a);
    }
    
    @Override
    public final c0 I(final String s, final HistorySortType historySortType, final String s2, final boolean b, final Context context, final c c) {
        ng2.e.f((Object)s, "username");
        ng2.e.f((Object)historySortType, "sort");
        ng2.e.f((Object)context, "context");
        ng2.e.f((Object)c, "tracingFeatures");
        final b60.f f = new b60.f(s, historySortType, s2);
        c0 c2;
        if (b) {
            final Object value = this.W.getValue();
            ng2.e.e(value, "<get-historyLinkStore>(...)");
            c2 = ((Store)value).m((Object)f);
        }
        else {
            final Object value2 = this.W.getValue();
            ng2.e.e(value2, "<get-historyLinkStore>(...)");
            c2 = ((Store)value2).get((Object)f);
        }
        ng2.e.e((Object)c2, "if (refresh) historyLink\u2026LinkStore.get(requestKey)");
        return px1.a.K0(c2, (q20.d)this.a);
    }
    
    @Override
    public final af2.a J() {
        return mg.d0.S0(this.c.k(), (q20.d)this.a);
    }
    
    @Override
    public final c0 K(final String s, final LinkedHashMap linkedHashMap) {
        p$a.c(this.f, TrackerParams$TrackerType.Listing, RedditLinkRepository.class.getSimpleName(), (String)null, (String)null, this.G, this.H, 92).getClass();
        return px1.a.K0(this.b.getDiscoveryUnitListing(s, (Map)linkedHashMap, (String)null), (q20.d)this.a);
    }
    
    @Override
    public final Object L(final Link link, final gg2.c<? super cg2.j> c) {
        final Object j = zi2.g.j((CoroutineContext)this.A.c(), (mg2.p)new RedditLinkRepository$updateCachedLink$2(this, link, (gg2.c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final af2.a M(final String s, final DistinguishType distinguishType) {
        ng2.e.f((Object)s, "id");
        ng2.e.f((Object)distinguishType, "how");
        return xd.a.j1((CoroutineContext)this.A.c(), (mg2.p)new RedditLinkRepository$distinguish$1(this, s, distinguishType, false, (gg2.c)null));
    }
    
    @Override
    public final Object N(final String s, final int n, final gg2.c<? super cg2.j> c) {
        return zi2.g.j((CoroutineContext)this.A.c(), (mg2.p)new RedditLinkRepository$saveGalleryPosition$2(this, s, n, (gg2.c)null), c);
    }
    
    @Override
    public final Object O(final String s, final gg2.c<? super cg2.j> c) {
        final Object e = this.M.e(s, true, (gg2.c)c);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return cg2.j.a;
    }
    
    @Override
    public final af2.a P(final String s) {
        ng2.e.f((Object)s, "id");
        return mg.d0.S0(this.b.modMarkSpoiler(s), (q20.d)this.a);
    }
    
    @Override
    public final Object Q(final Link l$1, final gg2.c<? super Boolean> c) {
        RedditLinkRepository$unsubscribeFromPost$1 redditLinkRepository$unsubscribeFromPost$2 = null;
        Label_0053: {
            if (c instanceof RedditLinkRepository$unsubscribeFromPost$1) {
                final RedditLinkRepository$unsubscribeFromPost$1 redditLinkRepository$unsubscribeFromPost$1 = (RedditLinkRepository$unsubscribeFromPost$1)c;
                final int label = redditLinkRepository$unsubscribeFromPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$unsubscribeFromPost$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$unsubscribeFromPost$2 = redditLinkRepository$unsubscribeFromPost$1;
                    break Label_0053;
                }
            }
            redditLinkRepository$unsubscribeFromPost$2 = new RedditLinkRepository$unsubscribeFromPost$1(this, (gg2.c)c);
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
                    cg.d.b4(o);
                    return z$0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                link = (Link)redditLinkRepository$unsubscribeFromPost$2.L$1;
                redditLinkRepository = (RedditLinkRepository)redditLinkRepository$unsubscribeFromPost$2.L$0;
                cg.d.b4(o);
            }
        }
        else {
            cg.d.b4(o);
            final RemoteGqlLinkDataSource g = this.g;
            final String kindWithId = l$1.getKindWithId();
            redditLinkRepository$unsubscribeFromPost$2.L$0 = this;
            redditLinkRepository$unsubscribeFromPost$2.L$1 = l$1;
            redditLinkRepository$unsubscribeFromPost$2.label = 1;
            o = g.t(kindWithId, (gg2.c)redditLinkRepository$unsubscribeFromPost$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            link = l$1;
            redditLinkRepository = this;
        }
        final boolean z$0 = (boolean)o;
        final af2.a t = redditLinkRepository.c.c(link.getId()).t();
        ng2.e.e((Object)t, "localDb.unsubscribe(link\u2026\n      .onErrorComplete()");
        final af2.a s0 = mg.d0.S0(t, (q20.d)redditLinkRepository.a);
        redditLinkRepository$unsubscribeFromPost$2.L$0 = null;
        redditLinkRepository$unsubscribeFromPost$2.L$1 = null;
        redditLinkRepository$unsubscribeFromPost$2.Z$0 = z$0;
        redditLinkRepository$unsubscribeFromPost$2.label = 2;
        if (kotlinx.coroutines.rx2.d.a(s0, (gg2.c)redditLinkRepository$unsubscribeFromPost$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return z$0;
    }
    
    @Override
    public final af2.n R(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        final af2.n o = this.c.O(sortTimeFrame, sortType, s);
        final b60.g0 g0 = new b60.g0(4);
        o.getClass();
        final af2.n onAssembly = RxJavaPlugins.onAssembly((af2.n)new io.reactivex.internal.operators.maybe.a((af2.r)o, (ff2.o)g0));
        ng2.e.e((Object)onAssembly, "localDb.getAllPopularLin\u2026isting.toILinkListing() }");
        final af2.n onAssembly2 = RxJavaPlugins.onAssembly((af2.n)new io.reactivex.internal.operators.maybe.a((af2.r)vl.a.r0(onAssembly, this.d), (ff2.o)new t(5)));
        ng2.e.e((Object)onAssembly2, "localDb.getAllPopularLin\u2026listing.toLinkListing() }");
        return px1.a.J0(onAssembly2, (q20.d)this.a);
    }
    
    @Override
    public final Object S(final String s, final od0.d d, final boolean b, final String s2, final gg2.c c) {
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
        Object j;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            j = result;
        }
        else {
            cg.d.b4(result);
            final b60.k k = new b60.k(s, d, s2);
            final ij2.a c2 = this.A.c();
            final RedditLinkRepository$getPredictionsTournamentPosts$2 redditLinkRepository$getPredictionsTournamentPosts$3 = new RedditLinkRepository$getPredictionsTournamentPosts$2(b, this, k, (gg2.c)null);
            redditLinkRepository$getPredictionsTournamentPosts$2.label = 1;
            if ((j = zi2.g.j((CoroutineContext)c2, (mg2.p)redditLinkRepository$getPredictionsTournamentPosts$3, (gg2.c)redditLinkRepository$getPredictionsTournamentPosts$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(j, "override suspend fun get\u2026      }.await()\n    }\n  }");
        return j;
    }
    
    @Override
    public final af2.a T(final String s) {
        ng2.e.f((Object)s, "linkId");
        final af2.a e = this.b.unsave(y10.w.d(s, ThingType.LINK)).e((af2.e)this.c.unsave(s).t());
        ng2.e.e((Object)e, "remote.unsave(ThingUtil.\u2026inkId).onErrorComplete())");
        return mg.d0.S0(e, (q20.d)this.a);
    }
    
    @Override
    public final c0 U(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final boolean b, final ListingViewMode listingViewMode, final String s3, final Context context, final c c, final List list, final Integer n, final va0.i i, final va0.j j, final boolean b2) {
        ng2.e.f((Object)context, "context");
        ng2.e.f((Object)c, "tracingFeatures");
        final af2.n r0 = vl.a.r0(xd.a.l1((CoroutineContext)k0.b, (mg2.p)new RedditLinkRepository$getHomeLinksInternalMaybe$1(this, sortType, sortTimeFrame, s, (gg2.c)null)), this.d);
        this.s.b("LinkRepository.getFrontpage_network_fetch");
        final String k = this.t.K();
        final String j2 = this.t.j0();
        final String e = this.t.e();
        final boolean b3 = false;
        y12.d0 d0;
        if ((k == null || xi2.j.B0((CharSequence)k)) && (j2 == null || xi2.j.B0((CharSequence)j2)) && (e == null || xi2.j.B0((CharSequence)e))) {
            d0 = null;
        }
        else {
            List h1;
            if (e != null) {
                h1 = kotlin.text.b.h1((CharSequence)e, new String[] { "," });
            }
            else {
                h1 = null;
            }
            d0 = new y12.d0(h$a.c((Object)h1), h$a.c((Object)k), h$a.c((Object)j2));
        }
        final FeedNotificationsVariant h2 = this.D.H9();
        String variant;
        if (h2 != null) {
            variant = h2.getVariant();
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
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new h((g0)ah0.b.I1(RemoteGqlLinkDataSource.d(this.g, sortType, sortTimeFrame, s, this.x0(s2), listingViewMode, this.e.c(), s3, list, this.n.p(), n, d0, x1, b2, 64), RedditEndpoint.HomePosts, this.f, this.F, this.Q, this.R, this.S), (ff2.g)new com.reddit.data.repository.o(this, 1)));
        ng2.e.e((Object)onAssembly, "remoteGql.getHomeLinks(\n\u2026E_SUBREDDIT_TITLES)\n    }");
        int n2;
        if (b && sortType != null) {
            n2 = (b3 ? 1 : 0);
            if (this.J.c(sortType, sortTimeFrame, listingViewMode)) {
                n2 = 1;
            }
        }
        else {
            n2 = (b3 ? 1 : 0);
        }
        Object onAssembly2 = onAssembly;
        if (n2 != 0) {
            final c0 m1 = ah0.b.m1((mg2.p)new RedditLinkRepository$getHome$remoteOrPreload$1(this, (gg2.c)null));
            final q q = new q((Object)onAssembly, 2);
            m1.getClass();
            final c0 onAssembly3 = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)m1, (ff2.o)q));
            final b60.k0 k2 = new b60.k0(this);
            onAssembly3.getClass();
            onAssembly2 = RxJavaPlugins.onAssembly((c0)new SingleDoFinally((af2.g0<Object>)onAssembly3, (ff2.a)k2));
        }
        final b60.l0 l0 = new b60.l0(this, i, j, r0, sortType, sortTimeFrame, s);
        ((c0)onAssembly2).getClass();
        final c0 onAssembly4 = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)onAssembly2, (ff2.o)l0));
        final l1 l2 = new l1(1);
        onAssembly4.getClass();
        c0 c2 = RxJavaPlugins.onAssembly((c0)new pf2.e((g0)onAssembly4, (ff2.g)l2));
        ng2.e.e((Object)c2, "override fun getHome(\n  \u2026eOn(backgroundThread)\n  }");
        if (!b) {
            c2 = r0.e((af2.r)c2.M()).firstOrError();
        }
        final c0 w = c2.w((ff2.o)new m1((Object)this, 1));
        ng2.e.e((Object)w, "if (refresh) {\n        r\u2026lterTopicRecommendations)");
        return px1.a.K0((c0)w, (q20.d)this.a);
    }
    
    @Override
    public final Object V(final String s, final VideoContext videoContext, final boolean b, final FbpMediaType fbpMediaType, final gg2.c<? super Listing<Link>> c) {
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
            redditLinkRepository$fetchRecommendedMedia$2 = new RedditLinkRepository$fetchRecommendedMedia$1(this, (gg2.c)c);
        }
        final Object result = redditLinkRepository$fetchRecommendedMedia$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$fetchRecommendedMedia$2.label;
        Object j;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            j = result;
        }
        else {
            cg.d.b4(result);
            final b60.m m = new b60.m(s, videoContext, fbpMediaType);
            final ij2.a c2 = this.A.c();
            final RedditLinkRepository$fetchRecommendedMedia$2 redditLinkRepository$fetchRecommendedMedia$3 = new RedditLinkRepository$fetchRecommendedMedia$2(this, m, b, (gg2.c)null);
            redditLinkRepository$fetchRecommendedMedia$2.label = 1;
            if ((j = zi2.g.j((CoroutineContext)c2, (mg2.p)redditLinkRepository$fetchRecommendedMedia$3, (gg2.c)redditLinkRepository$fetchRecommendedMedia$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(j, "override suspend fun fet\u2026   it\n        }\n    }\n  }");
        return j;
    }
    
    @Override
    public final void W() {
        final Object value = this.g0.getValue();
        ng2.e.e(value, "<get-postDuplicatesStore>(...)");
        ((Store)value).clear();
    }
    
    @Override
    public final c0 X(final String s, final String s2, final boolean b, final Context context, final c c, final String s3, final va0.i i, final va0.j j) {
        ng2.e.f((Object)s, "username");
        ng2.e.f((Object)context, "context");
        ng2.e.f((Object)c, "tracingFeatures");
        final d2 d2 = new d2(null, null, null, s2, null, null, null, null, null, null, s, null, false, s3, null, i, j, null, 318455);
        c0 c2;
        if (b) {
            final Object value = this.Z.getValue();
            ng2.e.e(value, "<get-savedPostsStore>(...)");
            final c0 m = ((Store)value).m((Object)d2);
            final Object value2 = this.Z.getValue();
            ng2.e.e(value2, "<get-savedPostsStore>(...)");
            c2 = m.z(((Store)value2).get((Object)d2));
        }
        else {
            final Object value3 = this.Z.getValue();
            ng2.e.e(value3, "<get-savedPostsStore>(...)");
            c2 = ((Store)value3).get((Object)d2);
        }
        ng2.e.e((Object)c2, "if (refresh) {\n      sav\u2026ore.get(requestKey)\n    }");
        return px1.a.K0((c0)c2, (q20.d)this.a);
    }
    
    @Override
    public final af2.n Y(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        final e0 c = this.c;
        ng2.e.c((Object)s);
        return px1.a.J0(c.o(sortTimeFrame, sortType, s), (q20.d)this.a);
    }
    
    @Override
    public final c0<Boolean> Z(final String s, final String s2) {
        ng2.e.f((Object)s, "linkKindWithId");
        ng2.e.f((Object)s2, "linkId");
        final c0 p2 = this.g.u(s, HideState.HIDDEN).p((ff2.o)new b60.h0(this, s2, 0));
        ng2.e.e((Object)p2, "remoteGql.updatePostHide\u2026).toSingleDefault(resp) }");
        return px1.a.K0((c0)p2, (q20.d)this.a);
    }
    
    @Override
    public final c0<Link> a(final String s) {
        ng2.e.f((Object)s, "id");
        final af2.n a = this.c.a(s);
        final b60.r r = new b60.r((Object)this, 2);
        a.getClass();
        final af2.n onAssembly = RxJavaPlugins.onAssembly((af2.n)new io.reactivex.internal.operators.maybe.a((af2.r)a, (ff2.o)r));
        ng2.e.e((Object)onAssembly, "localDb.getLinkById(id)\n\u2026.map(::useUniqueIdForAds)");
        final af2.n j0 = px1.a.J0(onAssembly, (q20.d)this.a);
        final c0 w = this.b.getLinksByIds(y10.w.d(s, ThingType.LINK)).w((ff2.o)new j0(this, 0));
        ng2.e.e((Object)w, "remote.getLinksByIds(Thi\u2026nk(it.children.first()) }");
        final c0 w2 = j0.w(px1.a.K0((c0)w, (q20.d)this.a));
        ng2.e.e((Object)w2, "localDb.getLinkById(id)\n\u2026ackgroundThread),\n      )");
        return w2;
    }
    
    @Override
    public final cg2.j a0(final String s, final VoteDirection voteDirection) {
        this.E.a(voteDirection.getValue(), s);
        return cg2.j.a;
    }
    
    @Override
    public final void b(final String s) {
        ng2.e.f((Object)s, "requestId");
        this.i.b(s);
    }
    
    @Override
    public final af2.a b0(final String s, final VoteDirection voteDirection) {
        ng2.e.f((Object)s, "kindWithId");
        ng2.e.f((Object)voteDirection, "direction");
        return mg.d0.S0(this.b.vote(s, voteDirection.getValue()), (q20.d)this.a);
    }
    
    @Override
    public final af2.a c() {
        final af2.a t = this.c.l().t();
        ng2.e.e((Object)t, "localDb.clearExpiredMutations().onErrorComplete()");
        return mg.d0.S0(t, (q20.d)this.a);
    }
    
    @Override
    public final af2.a c0(final String s) {
        ng2.e.f((Object)s, "linkId");
        final af2.a e = this.b.save(y10.w.d(s, ThingType.LINK)).e((af2.e)this.c.save(s).t());
        ng2.e.e((Object)e, "remote.save(ThingUtil.pr\u2026inkId).onErrorComplete())");
        return mg.d0.S0(e, (q20.d)this.a);
    }
    
    @Override
    public final af2.a d(final String s) {
        ng2.e.f((Object)s, "linkId");
        return mg.d0.S0(this.c.d(s), (q20.d)this.a);
    }
    
    @Override
    public final Object d0(String string, String s, String h, final boolean b, String s2, final boolean b2, final mg2.l<? super Link, cg2.j> l, final gg2.c<? super Listing<Link>> c) {
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
            redditLinkRepository$getDiscoverLinks$1 = new RedditLinkRepository$getDiscoverLinks$1(this, (gg2.c)c);
        }
        Object o = redditLinkRepository$getDiscoverLinks$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$getDiscoverLinks$1.label;
        Label_0971: {
            Link link = null;
            RedditLinkRepository redditLinkRepository2 = null;
            String s6 = null;
            String s7 = null;
            boolean b5 = false;
            String s8 = null;
            String s9 = null;
            boolean b6 = false;
            Label_0667: {
                boolean b3 = false;
                boolean b4 = false;
                String s3 = null;
                RedditLinkRepository redditLinkRepository = null;
                Link link2 = null;
                mg2.l k = null;
                Label_0556: {
                    mg2.l i = null;
                    String s4 = null;
                    Label_0542: {
                        mg2.l j;
                        String s5;
                        if (label2 != 0) {
                            if (label2 != 1) {
                                if (label2 == 2) {
                                    b3 = redditLinkRepository$getDiscoverLinks$1.Z$1;
                                    b4 = redditLinkRepository$getDiscoverLinks$1.Z$0;
                                    i = (mg2.l)redditLinkRepository$getDiscoverLinks$1.L$5;
                                    s3 = (String)redditLinkRepository$getDiscoverLinks$1.L$4;
                                    s2 = (String)redditLinkRepository$getDiscoverLinks$1.L$3;
                                    s = (String)redditLinkRepository$getDiscoverLinks$1.L$2;
                                    s4 = (String)redditLinkRepository$getDiscoverLinks$1.L$1;
                                    redditLinkRepository = (RedditLinkRepository)redditLinkRepository$getDiscoverLinks$1.L$0;
                                    cg.d.b4(o);
                                    break Label_0542;
                                }
                                if (label2 == 3) {
                                    cg.d.b4(o);
                                    break Label_0971;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                b3 = redditLinkRepository$getDiscoverLinks$1.Z$1;
                                b4 = redditLinkRepository$getDiscoverLinks$1.Z$0;
                                j = (mg2.l)redditLinkRepository$getDiscoverLinks$1.L$5;
                                s3 = (String)redditLinkRepository$getDiscoverLinks$1.L$4;
                                h = (String)redditLinkRepository$getDiscoverLinks$1.L$3;
                                s = (String)redditLinkRepository$getDiscoverLinks$1.L$2;
                                s5 = (String)redditLinkRepository$getDiscoverLinks$1.L$1;
                                redditLinkRepository = (RedditLinkRepository)redditLinkRepository$getDiscoverLinks$1.L$0;
                                cg.d.b4(o);
                            }
                        }
                        else {
                            cg.d.b4(o);
                            if (s2 != null) {
                                link = null;
                                redditLinkRepository2 = this;
                                s6 = string;
                                s7 = s2;
                                b5 = b;
                                s8 = h;
                                s9 = s;
                                b6 = b2;
                                break Label_0667;
                            }
                            if (b) {
                                redditLinkRepository$getDiscoverLinks$1.L$0 = this;
                                redditLinkRepository$getDiscoverLinks$1.L$1 = string;
                                redditLinkRepository$getDiscoverLinks$1.L$2 = s;
                                redditLinkRepository$getDiscoverLinks$1.L$3 = h;
                                redditLinkRepository$getDiscoverLinks$1.L$4 = s2;
                                redditLinkRepository$getDiscoverLinks$1.L$5 = l;
                                redditLinkRepository$getDiscoverLinks$1.Z$0 = b;
                                redditLinkRepository$getDiscoverLinks$1.Z$1 = b2;
                                redditLinkRepository$getDiscoverLinks$1.label = 1;
                                final Object y0 = this.y0(s, (gg2.c<? super Link>)redditLinkRepository$getDiscoverLinks$1);
                                if (y0 == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                s5 = string;
                                redditLinkRepository = this;
                                o = y0;
                                j = l;
                                s3 = s2;
                                b4 = b;
                                b3 = b2;
                            }
                            else {
                                final c0<Link> a = this.a(s);
                                redditLinkRepository$getDiscoverLinks$1.L$0 = this;
                                redditLinkRepository$getDiscoverLinks$1.L$1 = string;
                                redditLinkRepository$getDiscoverLinks$1.L$2 = s;
                                redditLinkRepository$getDiscoverLinks$1.L$3 = h;
                                redditLinkRepository$getDiscoverLinks$1.L$4 = s2;
                                redditLinkRepository$getDiscoverLinks$1.L$5 = l;
                                redditLinkRepository$getDiscoverLinks$1.Z$0 = b;
                                redditLinkRepository$getDiscoverLinks$1.Z$1 = b2;
                                redditLinkRepository$getDiscoverLinks$1.label = 2;
                                final Object b7 = kotlinx.coroutines.rx2.d.b(a, (gg2.c)redditLinkRepository$getDiscoverLinks$1);
                                if (b7 == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                s4 = string;
                                redditLinkRepository = this;
                                o = b7;
                                i = l;
                                s3 = s2;
                                b4 = b;
                                s2 = h;
                                b3 = b2;
                                break Label_0542;
                            }
                        }
                        link2 = (Link)o;
                        s2 = h;
                        k = j;
                        h = s5;
                        break Label_0556;
                    }
                    link2 = (Link)o;
                    h = s4;
                    k = i;
                }
                b6 = b3;
                s9 = s;
                s8 = s2;
                b5 = b4;
                s7 = s3;
                s6 = h;
                link = link2;
                redditLinkRepository2 = redditLinkRepository;
                if (k != null) {
                    ng2.e.e((Object)link2, "it");
                    k.invoke((Object)link2);
                    b6 = b3;
                    s9 = s;
                    s8 = s2;
                    b5 = b4;
                    s7 = s3;
                    s6 = h;
                    link = link2;
                    redditLinkRepository2 = redditLinkRepository;
                }
            }
            h = b.h(s6, '_', s9);
            if (!b6 && redditLinkRepository2.c0.containsKey(h)) {
                final Object value = redditLinkRepository2.c0.get(h);
                ng2.e.c(value);
                string = (String)value;
            }
            else {
                string = UUID.randomUUID().toString();
                final LinkedHashMap c2 = redditLinkRepository2.c0;
                ng2.e.e((Object)string, "it");
                c2.put(h, string);
            }
            final b60.d d = new b60.d(s6, s7, link, s8, string);
            c0 c3;
            if (link != null) {
                final Object value2 = redditLinkRepository2.d0.getValue();
                ng2.e.e(value2, "<get-discoverTopicLinksStore>(...)");
                c3 = ((Store)value2).get((Object)d).w((ff2.o)new com.reddit.data.repository.a(link, 2));
            }
            else {
                final Object value3 = redditLinkRepository2.d0.getValue();
                ng2.e.e(value3, "<get-discoverTopicLinksStore>(...)");
                c3 = ((Store)value3).get((Object)d);
            }
            ng2.e.e((Object)c3, "if (firstLink != null) {\u2026ore.get(requestKey)\n    }");
            c0 z = c3;
            if (b5) {
                final Object value4 = redditLinkRepository2.d0.getValue();
                ng2.e.e(value4, "<get-discoverTopicLinksStore>(...)");
                z = ((Store)value4).m((Object)d).z(c3);
            }
            ng2.e.e((Object)z, "if (refresh) {\n      dis\u2026   getWithFirstLink\n    }");
            final c0 k2 = px1.a.K0((c0)z, (q20.d)redditLinkRepository2.a);
            redditLinkRepository$getDiscoverLinks$1.L$0 = null;
            redditLinkRepository$getDiscoverLinks$1.L$1 = null;
            redditLinkRepository$getDiscoverLinks$1.L$2 = null;
            redditLinkRepository$getDiscoverLinks$1.L$3 = null;
            redditLinkRepository$getDiscoverLinks$1.L$4 = null;
            redditLinkRepository$getDiscoverLinks$1.L$5 = null;
            redditLinkRepository$getDiscoverLinks$1.label = 3;
            if ((o = kotlinx.coroutines.rx2.d.b(k2, (gg2.c)redditLinkRepository$getDiscoverLinks$1)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(o, "fetchFunction()\n      .s\u2026backgroundThread).await()");
        return o;
    }
    
    @Override
    public final c0<Boolean> delete(final String s) {
        ng2.e.f((Object)s, "linkId");
        final RemoteGqlLinkDataSource g = this.g;
        g.getClass();
        final c0 w = e$a.a((mr0.e)g.a, (h7.k)new k2(new m0(s)), (OkHttpClient)null, (Map)null, 14).w((ff2.o)new l10.h(6));
        ng2.e.e((Object)w, "graphQlClient.execute(\n \u2026deletePost?.ok ?: false }");
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)px1.a.K0((c0)w, (q20.d)this.a), (ff2.o)new r0(1, (Object)this, (Object)s)));
        ng2.e.e((Object)onAssembly, "remoteGql.delete(linkId \u2026gle.just(deleted)\n      }");
        return onAssembly;
    }
    
    @Override
    public final Object e(final String s, final ModQueueSortingType modQueueSortingType, final String s2, final gg2.c<? super Listing<Link>> c) {
        return this.g.g(s, modQueueSortingType, s2, (gg2.c)c);
    }
    
    @Override
    public final VoteDirection e0(final String s) {
        ng2.e.f((Object)s, "kindWithId");
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
    
    @Override
    public final Object f(final String l$1, final gg2.c<? super UpdateResponse> c) {
        Object o = null;
        Label_0053: {
            if (c instanceof RedditLinkRepository$unSave$1) {
                final RedditLinkRepository$unSave$1 redditLinkRepository$unSave$1 = (RedditLinkRepository$unSave$1)c;
                final int label = redditLinkRepository$unSave$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$unSave$1.label = label + Integer.MIN_VALUE;
                    o = redditLinkRepository$unSave$1;
                    break Label_0053;
                }
            }
            o = new RedditLinkRepository$unSave$1(this, (gg2.c)c);
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
                    cg.d.b4(o2);
                    return updateResponse;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                s = (String)((RedditLinkRepository$unSave$1)o).L$1;
                redditLinkRepository = (RedditLinkRepository)((RedditLinkRepository$unSave$1)o).L$0;
                cg.d.b4(o2);
            }
        }
        else {
            cg.d.b4(o2);
            final RemoteGqlLinkDataSource g = this.g;
            final String d = y10.w.d(l$1, ThingType.LINK);
            ((RedditLinkRepository$unSave$1)o).L$0 = this;
            ((RedditLinkRepository$unSave$1)o).L$1 = l$1;
            ((RedditLinkRepository$unSave$1)o).label = 1;
            o2 = g.s(d, (gg2.c)o);
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
        final af2.a t = redditLinkRepository.c.unsave(s).t();
        ng2.e.e((Object)t, "localDb.unsave(linkId).onErrorComplete()");
        ((RedditLinkRepository$unSave$1)o).L$0 = l$2;
        ((RedditLinkRepository$unSave$1)o).L$1 = null;
        ((RedditLinkRepository$unSave$1)o).label = 2;
        if (kotlinx.coroutines.rx2.d.a(t, (gg2.c)o) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final UpdateResponse updateResponse = l$2;
        updateResponse2 = updateResponse;
        return updateResponse2;
    }
    
    @Override
    public final af2.a f0(final String s, final boolean b) {
        ng2.e.f((Object)s, "id");
        return xd.a.k1((mg2.p)new RedditLinkRepository$remove$1(this, s, b, (gg2.c)null));
    }
    
    @Override
    public final af2.a follow(final String s, final boolean b) {
        ng2.e.f((Object)s, "linkId");
        final af2.a e = this.b.follow(y10.w.d(s, ThingType.LINK), b).e((af2.e)this.c.follow(s, b).t());
        ng2.e.e((Object)e, "remote.follow(ThingUtil.\u2026ollow).onErrorComplete())");
        return mg.d0.S0(e, (q20.d)this.a);
    }
    
    @Override
    public final RedditLinkRepository$getLinkStreamById$$inlined$map$1 g(final String s) {
        ng2.e.f((Object)s, "linkId");
        return new RedditLinkRepository$getLinkStreamById$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1((cj2.e)this.c.b(s), (mg2.q)new RedditLinkRepository$getLinkStreamById$1(this, (gg2.c)null)), this, s);
    }
    
    @Override
    public final af2.a g0(final String s) {
        ng2.e.f((Object)s, "id");
        return xd.a.k1((mg2.p)new RedditLinkRepository$approve$1(this, s, (gg2.c)null));
    }
    
    @Override
    public final Object getLinkTitle(final String s, final gg2.c<? super String> c) {
        return zi2.g.j((CoroutineContext)this.A.c(), (mg2.p)new RedditLinkRepository$getLinkTitle$2(this, s, (gg2.c)null), c);
    }
    
    @Override
    public final Object h(final String s, final VoteDirection voteDirection, final gg2.c<? super UpdateResponse> c) {
        return this.g.v(s, voteDirection, (gg2.c)c);
    }
    
    @Override
    public final Object h0(final String s, final VideoContext videoContext, final boolean b, final String s2, final gg2.c<? super Listing<Link>> c) {
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
            redditLinkRepository$fetchRecommendedVideos$2 = new RedditLinkRepository$fetchRecommendedVideos$1(this, (gg2.c)c);
        }
        final Object result = redditLinkRepository$fetchRecommendedVideos$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$fetchRecommendedVideos$2.label;
        Object j;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            j = result;
        }
        else {
            cg.d.b4(result);
            final b60.n n = new b60.n(s, videoContext, new zu.a(s2, ListingViewMode.IMMERSIVE, (zu.b)null, 4), 20);
            final ij2.a c2 = this.A.c();
            final RedditLinkRepository$fetchRecommendedVideos$2 redditLinkRepository$fetchRecommendedVideos$3 = new RedditLinkRepository$fetchRecommendedVideos$2(this, n, b, (gg2.c)null);
            redditLinkRepository$fetchRecommendedVideos$2.label = 1;
            if ((j = zi2.g.j((CoroutineContext)c2, (mg2.p)redditLinkRepository$fetchRecommendedVideos$3, (gg2.c)redditLinkRepository$fetchRecommendedVideos$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(j, "override suspend fun fet\u2026    }\n        }\n    }\n  }");
        return j;
    }
    
    @Override
    public final Object i(final String l$1, final gg2.c<? super UpdateResponse> c) {
        Object o = null;
        Label_0053: {
            if (c instanceof RedditLinkRepository$save$1) {
                final RedditLinkRepository$save$1 redditLinkRepository$save$1 = (RedditLinkRepository$save$1)c;
                final int label = redditLinkRepository$save$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$save$1.label = label + Integer.MIN_VALUE;
                    o = redditLinkRepository$save$1;
                    break Label_0053;
                }
            }
            o = new RedditLinkRepository$save$1(this, (gg2.c)c);
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
                    cg.d.b4(o2);
                    return updateResponse;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                s = (String)((RedditLinkRepository$save$1)o).L$1;
                redditLinkRepository = (RedditLinkRepository)((RedditLinkRepository$save$1)o).L$0;
                cg.d.b4(o2);
            }
        }
        else {
            cg.d.b4(o2);
            final RemoteGqlLinkDataSource g = this.g;
            final String d = y10.w.d(l$1, ThingType.LINK);
            ((RedditLinkRepository$save$1)o).L$0 = this;
            ((RedditLinkRepository$save$1)o).L$1 = l$1;
            ((RedditLinkRepository$save$1)o).label = 1;
            o2 = g.q(d, (gg2.c)o);
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
        final af2.a t = redditLinkRepository.c.save(s).t();
        ng2.e.e((Object)t, "localDb.save(linkId).onErrorComplete()");
        ((RedditLinkRepository$save$1)o).L$0 = l$2;
        ((RedditLinkRepository$save$1)o).L$1 = null;
        ((RedditLinkRepository$save$1)o).label = 2;
        if (kotlinx.coroutines.rx2.d.a(t, (gg2.c)o) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final UpdateResponse updateResponse = l$2;
        updateResponse2 = updateResponse;
        return updateResponse2;
    }
    
    @Override
    public final c0<Listing<Link>> i0(final List<String> list) {
        ng2.e.f((Object)list, "ids");
        final c0 w = this.b.getLinksByIds(CollectionsKt___CollectionsKt.a5((Iterable)list, (CharSequence)",", (String)null, (String)null, (mg2.l)null, 62)).w((ff2.o)new i0(this, 1));
        ng2.e.e((Object)w, "remote.getLinksByIds(\n  \u2026apRemoteLink(it) })\n    }");
        return px1.a.K0((c0)w, (q20.d)this.a);
    }
    
    @Override
    public final af2.n<Listing<Link>> j() {
        return px1.a.J0(this.c.R(), (q20.d)this.a);
    }
    
    @Override
    public final af2.n<Listing<Link>> j0(final String s) {
        return px1.a.J0(this.c.v(s), (q20.d)this.a);
    }
    
    @Override
    public final c0 k(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final String s3) {
        ng2.e.f((Object)s, "username");
        ng2.e.f((Object)sortType, "sort");
        final UserLinkKey userLinkKey = new UserLinkKey(sortType, sortTimeFrame, s, s2, s3);
        final Object value = this.T.getValue();
        ng2.e.e(value, "<get-submittedStore>(...)");
        final c0 value2 = ((Store)value).get((Object)userLinkKey);
        ng2.e.e((Object)value2, "submittedStore.get(linkKey)");
        c0 c0;
        if (s2 == null) {
            final c0 k0 = px1.a.K0(value2, (q20.d)this.a);
            final c0<EmptyList> y = this.i.c().r((ff2.o<? super Throwable, ? extends EmptyList>)new b60.g0(3)).g(EmptyList.INSTANCE).y();
            ng2.e.e((Object)y, "localVideoDataSource.get\u2026())\n          .toSingle()");
            final c0<Object> q = af2.c0.Q((af2.g0<?>)k0, (af2.g0<?>)y, (ff2.c<? super Object, ? super Object, ?>)new ah0.b());
            ng2.e.b((Object)q, "zipWith(other, BiFunctio\u2026-> zipper.invoke(t, u) })");
            c0 = px1.a.K0((c0)q, (q20.d)this.a);
        }
        else {
            final c0 w = value2.w((ff2.o)new t(4));
            ng2.e.e((Object)w, "get.map { toSubmittedListing(it, listOf()) }");
            c0 = px1.a.K0((c0)w, (q20.d)this.a);
        }
        return c0;
    }
    
    @Override
    public final af2.n<Listing<Link>> k0(final SortType sortType, final SortTimeFrame sortTimeFrame) {
        final af2.n p2 = this.c.L(sortType, sortTimeFrame).p((ff2.o)new q0(2));
        ng2.e.e((Object)p2, "localDb.getAllHomeLinks(\u2026isting.toILinkListing() }");
        final af2.n p3 = vl.a.r0((af2.n)p2, this.d).p((ff2.o)new su.d(12));
        ng2.e.e((Object)p3, "localDb.getAllHomeLinks(\u2026listing.toLinkListing() }");
        return px1.a.J0((af2.n)p3, (q20.d)this.a);
    }
    
    @Override
    public final c0<Listing<ILink>> l(final DisplaySource displaySource, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final boolean b, final ListingViewMode listingViewMode, final String s3, final boolean b2, final Context context, final c c, final Integer n, final va0.i<ILink> i, final va0.j<ILink> j) {
        ng2.e.f((Object)sortType, "sort");
        ng2.e.f((Object)s3, "geoFilter");
        ng2.e.f((Object)context, "context");
        ng2.e.f((Object)c, "tracingFeatures");
        final boolean d2 = this.P.D2();
        final d2 d3 = new d2(displaySource, sortType, sortTimeFrame, s, n, null, this.x0(s2), listingViewMode, null, null, null, s3, b2, null, null, i, j, d2, 59168);
        c0 c2;
        if (b && d2) {
            c2 = ah0.b.m1((mg2.p)new RedditLinkRepository$getPopular$fetchFunction$1(this, d3, sortType, sortTimeFrame, s, s3, (gg2.c)null));
        }
        else if (b) {
            this.s.b("LinkRepository.process_popular_data");
            if (this.v.g()) {
                final c0 m1 = ah0.b.m1((mg2.p)new RedditLinkRepository$getPopular$fetchFunction$result$1(b, this, sortType, sortTimeFrame, s3, listingViewMode, d3, (va0.i)i, (va0.j)j, (gg2.c)null));
                final com.reddit.data.repository.e e = new com.reddit.data.repository.e(this, sortType, sortTimeFrame, s, s3);
                m1.getClass();
                c2 = RxJavaPlugins.onAssembly((c0)new h((af2.g0<Object>)m1, (ff2.g<? super Object>)e));
            }
            else {
                final Object value = this.U.getValue();
                ng2.e.e(value, "<get-popularLinkStore>(...)");
                c2 = ((Store)value).m((Object)d3);
            }
            ng2.e.e((Object)c2, "override fun getPopular(\u2026eOn(backgroundThread)\n  }");
            this.s.e("LinkRepository.process_popular_data");
        }
        else {
            final Object value2 = this.U.getValue();
            ng2.e.e(value2, "<get-popularLinkStore>(...)");
            c2 = ((Store)value2).get((Object)d3);
            ng2.e.e((Object)c2, "{\n      popularLinkStore.get(requestKey)\n    }");
        }
        final c0 w = c2.w((ff2.o)new i0(this, 3));
        ng2.e.e((Object)w, "fetchFunction()\n      .m\u2026lterTopicRecommendations)");
        return px1.a.K0((c0)w, (q20.d)this.a);
    }
    
    @Override
    public final Object l0(final gg2.c<? super Boolean> c) {
        return zi2.g.j((CoroutineContext)this.A.c(), (mg2.p)new RedditLinkRepository$pruneListings$2(this, (gg2.c)null), c);
    }
    
    @Override
    public final af2.n<Listing<Link>> m(final String s) {
        return px1.a.J0(this.c.B(s), (q20.d)this.a);
    }
    
    @Override
    public final af2.a n(final String s) {
        ng2.e.f((Object)s, "id");
        return mg.d0.S0(this.b.modUnMarkSpoiler(s), (q20.d)this.a);
    }
    
    @Override
    public final Object o(final Link l$1, final gg2.c<? super Boolean> c) {
        RedditLinkRepository$subscribeToPost$1 redditLinkRepository$subscribeToPost$2 = null;
        Label_0053: {
            if (c instanceof RedditLinkRepository$subscribeToPost$1) {
                final RedditLinkRepository$subscribeToPost$1 redditLinkRepository$subscribeToPost$1 = (RedditLinkRepository$subscribeToPost$1)c;
                final int label = redditLinkRepository$subscribeToPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$subscribeToPost$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$subscribeToPost$2 = redditLinkRepository$subscribeToPost$1;
                    break Label_0053;
                }
            }
            redditLinkRepository$subscribeToPost$2 = new RedditLinkRepository$subscribeToPost$1(this, (gg2.c)c);
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
                    cg.d.b4(o);
                    return z$0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                link = (Link)redditLinkRepository$subscribeToPost$2.L$1;
                redditLinkRepository = (RedditLinkRepository)redditLinkRepository$subscribeToPost$2.L$0;
                cg.d.b4(o);
            }
        }
        else {
            cg.d.b4(o);
            final RemoteGqlLinkDataSource g = this.g;
            final String kindWithId = l$1.getKindWithId();
            redditLinkRepository$subscribeToPost$2.L$0 = this;
            redditLinkRepository$subscribeToPost$2.L$1 = l$1;
            redditLinkRepository$subscribeToPost$2.label = 1;
            o = g.r(kindWithId, (gg2.c)redditLinkRepository$subscribeToPost$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            link = l$1;
            redditLinkRepository = this;
        }
        final boolean z$0 = (boolean)o;
        final af2.a t = redditLinkRepository.c.e(link.getId()).t();
        ng2.e.e((Object)t, "localDb.subscribe(link.i\u2026\n      .onErrorComplete()");
        final af2.a s0 = mg.d0.S0(t, (q20.d)redditLinkRepository.a);
        redditLinkRepository$subscribeToPost$2.L$0 = null;
        redditLinkRepository$subscribeToPost$2.L$1 = null;
        redditLinkRepository$subscribeToPost$2.Z$0 = z$0;
        redditLinkRepository$subscribeToPost$2.label = 2;
        if (kotlinx.coroutines.rx2.d.a(s0, (gg2.c)redditLinkRepository$subscribeToPost$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return z$0;
    }
    
    @Override
    public final af2.n p(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        return px1.a.J0(this.c.y(sortTimeFrame, sortType, s), (q20.d)this.a);
    }
    
    @Override
    public final c0<Listing<Link>> q(final String s, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s2, final Integer n, final String s3, final boolean b, final ListingViewMode listingViewMode, final Context context, final c c, final String s4, final String s5, final va0.i<Link> i, final va0.j<Link> j) {
        ng2.e.f((Object)s, "subredditName");
        ng2.e.f((Object)context, "context");
        ng2.e.f((Object)c, "tracingFeatures");
        final d2 d2 = new d2(null, sortType, sortTimeFrame, s2, n, null, this.x0(s3), listingViewMode, s, null, null, null, false, s4, s5, i, j, null, 286241);
        c0 c2;
        if (b) {
            final Object value = this.X.getValue();
            ng2.e.e(value, "<get-subredditLinkStore>(...)");
            c2 = ((Store)value).m((Object)d2);
        }
        else {
            final Object value2 = this.X.getValue();
            ng2.e.e(value2, "<get-subredditLinkStore>(...)");
            c2 = ((Store)value2).get((Object)d2);
        }
        ng2.e.e((Object)c2, "if (refresh) {\n      sub\u2026ore.get(requestKey)\n    }");
        return px1.a.K0(c2, (q20.d)this.a);
    }
    
    @Override
    public final af2.a r(final String s) {
        ng2.e.f((Object)s, "id");
        return mg.d0.S0(this.b.modLockComments(s), (q20.d)this.a);
    }
    
    @Override
    public final Object s(final String s, final gg2.c<? super Listing<Link>> c) {
        Object o = null;
        Label_0053: {
            if (c instanceof RedditLinkRepository$getAllLocalDiscoverLinks$1) {
                final RedditLinkRepository$getAllLocalDiscoverLinks$1 redditLinkRepository$getAllLocalDiscoverLinks$1 = (RedditLinkRepository$getAllLocalDiscoverLinks$1)c;
                final int label = redditLinkRepository$getAllLocalDiscoverLinks$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$getAllLocalDiscoverLinks$1.label = label + Integer.MIN_VALUE;
                    o = redditLinkRepository$getAllLocalDiscoverLinks$1;
                    break Label_0053;
                }
            }
            o = new RedditLinkRepository$getAllLocalDiscoverLinks$1(this, (gg2.c)c);
        }
        final Object result = ((RedditLinkRepository$getAllLocalDiscoverLinks$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditLinkRepository$getAllLocalDiscoverLinks$1)o).label;
        Object g;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            g = result;
        }
        else {
            cg.d.b4(result);
            final af2.n j0 = px1.a.J0(this.c.G(s, (String)null), (q20.d)this.a);
            ((RedditLinkRepository$getAllLocalDiscoverLinks$1)o).label = 1;
            if ((g = kotlinx.coroutines.rx2.d.g(j0, (gg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        Listing listing;
        if ((listing = (Listing)g) == null) {
            listing = new Listing((List)EmptyList.INSTANCE, (String)null, (String)null, (String)null, (String)null, false, (List)null, 126, (DefaultConstructorMarker)null);
        }
        return listing;
    }
    
    @Override
    public final af2.a sendRemovalMessage(final ContentRemovalMessage contentRemovalMessage) {
        return mg.d0.S0(this.b.sendRemovalMessage(contentRemovalMessage), (q20.d)this.a);
    }
    
    @Override
    public final af2.a sendRemovalReason(final RemovalReason removalReason) {
        return mg.d0.S0(this.b.sendRemovalReason(removalReason), (q20.d)this.a);
    }
    
    @Override
    public final c0 t(final ArrayList list) {
        final c0 w = this.c.F(list).w((ff2.o)new i0(this, 4));
        ng2.e.e((Object)w, "localDb.getLinksById(ids\u2026seUniqueIdForAds)\n      }");
        return px1.a.K0((c0)w, (q20.d)this.a);
    }
    
    @Override
    public final af2.a u(final String s) {
        ng2.e.f((Object)s, "id");
        return mg.d0.S0(xd.a.k1((mg2.p)new RedditLinkRepository$unMarkNsfw$1(this, s, (gg2.c)null)), (q20.d)this.a);
    }
    
    @Override
    public final Object v(final Link link, final String s, final boolean b, final boolean b2, final gg2.c<? super Result<Link>> c) {
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
            o = new RedditLinkRepository$edit$1(this, (gg2.c)c);
        }
        Object o2 = ((RedditLinkRepository$edit$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditLinkRepository$edit$1)o).label;
        Label_0426: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        cg.d.b4(o2);
                        break Label_0426;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    cg.d.b4(o2);
                }
            }
            else {
                cg.d.b4(o2);
                if (this.I.e9()) {
                    ((RedditLinkRepository$edit$1)o).label = 1;
                    if ((o2 = mg.d0.G((mg2.p)new RedditLinkRepository$editGql$2(link, b, this, b2, s, (gg2.c)null), (gg2.c)o)) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                else {
                    final String id = link.getId();
                    final String d = y10.w.d(id, ThingType.LINK);
                    af2.a a;
                    if (b) {
                        a = this.b.modMarkNsfw(d);
                    }
                    else {
                        a = this.b.modUnMarkNsfw(d);
                    }
                    af2.a a2;
                    if (b2) {
                        a2 = this.b.modMarkSpoiler(d);
                    }
                    else {
                        a2 = this.b.modUnMarkSpoiler(d);
                    }
                    final Boolean true = Boolean.TRUE;
                    final c0<Boolean> b3 = a.B(true);
                    ng2.e.e((Object)b3, "markNsfw.toSingleDefault(true)");
                    final c0 k0 = px1.a.K0((c0)b3, (q20.d)this.a);
                    final c0<Boolean> b4 = a2.B(true);
                    ng2.e.e((Object)b4, "markSpoiler.toSingleDefault(true)");
                    final c0<Object> p5 = af2.c0.P(k0, px1.a.K0((c0)b4, (q20.d)this.a), px1.a.K0(this.b.edit(d, s, "json"), (q20.d)this.a), (ff2.h)new aq2.a());
                    final b60.m0 m0 = new b60.m0(this, id, b, b2);
                    p5.getClass();
                    final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)p5, (ff2.o)m0));
                    ng2.e.e((Object)onAssembly, "zip(\n      markNsfw.toSi\u2026)\n        }\n      }\n    }");
                    final c0 k2 = px1.a.K0(onAssembly, (q20.d)this.a);
                    ((RedditLinkRepository$edit$1)o).label = 2;
                    if ((o2 = kotlinx.coroutines.rx2.d.b(k2, (gg2.c)o)) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    break Label_0426;
                }
            }
            return o2;
        }
        ng2.e.e(o2, "{\n      editLegacy(link.\u2026 isSpoiler).await()\n    }");
        return o2;
    }
    
    @Override
    public final c0<List<Link>> w(final String s) {
        ng2.e.f((Object)s, "subredditName");
        final RemoteGqlLinkDataSource g = this.g;
        g.getClass();
        final c0 w = e$a.a((mr0.e)g.a, (h7.k)new lb(aq2.a.h(g.j), s), (OkHttpClient)null, (Map)null, 14).w((ff2.o)new y50.q(g, 1));
        ng2.e.e((Object)w, "graphQlClient\n      .exe\u2026 } ?: emptyList()\n      }");
        final c0 w2 = w.w((ff2.o)new i0(this, 2));
        ng2.e.e((Object)w2, "remoteGql.getSubredditSt\u2026it.map(::mapRemoteLink) }");
        return px1.a.K0((c0)w2, (q20.d)this.a);
    }
    
    @Override
    public final af2.a x(final String s) {
        ng2.e.f((Object)s, "id");
        return mg.d0.S0(this.b.modUncollapseComment(s), (q20.d)this.a);
    }
    
    public final zu.a x0(final String s) {
        zu.a a;
        if (this.w.xb()) {
            a = (zu.a)zi2.g.i((mg2.p)new RedditLinkRepository$fetchAdContext$1(this, s, (gg2.c)null));
        }
        else {
            a = new zu.a(s, (ListingViewMode)null, (zu.b)null, 6);
        }
        return a;
    }
    
    @Override
    public final af2.n<Listing<Link>> y(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2) {
        final e0 c = this.c;
        ng2.e.c((Object)s);
        return px1.a.J0(c.p(sortType, sortTimeFrame, s, s2), (q20.d)this.a);
    }
    
    public final Object y0(final String s, final gg2.c<? super Link> c) {
        RedditLinkRepository$fetchLinkFromRemote$1 redditLinkRepository$fetchLinkFromRemote$2 = null;
        Label_0053: {
            if (c instanceof RedditLinkRepository$fetchLinkFromRemote$1) {
                final RedditLinkRepository$fetchLinkFromRemote$1 redditLinkRepository$fetchLinkFromRemote$1 = (RedditLinkRepository$fetchLinkFromRemote$1)c;
                final int label = redditLinkRepository$fetchLinkFromRemote$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLinkRepository$fetchLinkFromRemote$1.label = label + Integer.MIN_VALUE;
                    redditLinkRepository$fetchLinkFromRemote$2 = redditLinkRepository$fetchLinkFromRemote$1;
                    break Label_0053;
                }
            }
            redditLinkRepository$fetchLinkFromRemote$2 = new RedditLinkRepository$fetchLinkFromRemote$1(this, (gg2.c)c);
        }
        final Object result = redditLinkRepository$fetchLinkFromRemote$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLinkRepository$fetchLinkFromRemote$2.label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            b = result;
        }
        else {
            cg.d.b4(result);
            final c0 w = this.b.getLinksByIds(y10.w.d(s, ThingType.LINK)).w((ff2.o)new i0(this, 0));
            ng2.e.e((Object)w, "remote.getLinksByIds(Thi\u2026nk(it.children.first()) }");
            final c0 k0 = px1.a.K0((c0)w, (q20.d)this.a);
            redditLinkRepository$fetchLinkFromRemote$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(k0, (gg2.c)redditLinkRepository$fetchLinkFromRemote$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(b, "remote.getLinksByIds(Thi\u2026undThread)\n      .await()");
        return b;
    }
    
    @Override
    public final af2.a z(final String s) {
        ng2.e.f((Object)s, "id");
        return mg.d0.S0(xd.a.k1((mg2.p)new RedditLinkRepository$markNsfw$1(this, s, (gg2.c)null)), (q20.d)this.a);
    }
    
    public final Link z0(Link link) {
        final SubredditDetail subredditDetail = link.getSubredditDetail();
        if (subredditDetail != null) {
            final Boolean userIsSubscriber = subredditDetail.getUserIsSubscriber();
            if (userIsSubscriber != null) {
                final Link copy$default = Link.copy$default(link, (String)null, (String)null, 0L, (Long)null, (String)null, (String)null, (String)null, (String)null, 0, (Boolean)null, 0, 0.0, 0, 0L, (Long)null, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (List)null, (List)null, (String)null, (String)null, (String)null, false, (List)null, (AwardLeaderboardStatus)null, false, false, (String)null, false, false, (String)null, (String)null, (Preview)null, (Preview)null, (LinkMedia)null, (String)null, (String)null, (String)null, false, (String)null, (String)null, (String)null, false, false, false, false, false, false, false, false, false, false, false, false, (String)null, (String)null, (Long)null, (String)null, (String)null, false, false, false, (BannedBy)null, (Integer)null, false, false, (String)null, (List)null, (List)null, (ModQueueTriggers)null, (NoteLabel)null, (List)null, (SubredditDetail)null, false, false, (Boolean)null, (PromoLayoutType)null, (List)null, (OutboundLink)null, (String)null, (List)null, false, (RichTextResponse)null, (Map)null, (PostPoll)null, (PostPredictionsTournamentData)null, (RpanVideo)null, (AudioRoom)null, (LegacyAudioRoom)null, (PostGallery)null, (RecommendationContext)null, (List)null, false, (boolean)userIsSubscriber, (String)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (String)null, false, (Long)null, (Long)null, false, (DiscussionType)null, (Boolean)null, (String)null, (Integer)null, (AppStoreData)null, (Boolean)null, (String)null, false, (String)null, (String)null, (List)null, (Integer)null, (String)null, (List)null, (String)null, (CrowdControlFilterLevel)null, false, (List)null, -1, -1, -1, -5, (Object)null);
                if (copy$default != null) {
                    link = copy$default;
                }
            }
        }
        Link copy$default2 = link;
        if (ng2.e.a((Object)this.e.b(), (Object)Boolean.TRUE)) {
            copy$default2 = Link.copy$default(link, (String)null, (String)null, 0L, (Long)null, (String)null, (String)null, (String)null, (String)null, 0, (Boolean)null, 0, 0.0, 0, 0L, (Long)null, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (List)null, (List)null, (String)null, (String)null, (String)null, false, (List)null, (AwardLeaderboardStatus)null, false, false, (String)null, false, false, (String)null, (String)null, (Preview)null, (Preview)null, (LinkMedia)null, (String)null, (String)null, (String)null, false, (String)null, (String)null, (String)null, false, false, false, false, false, false, false, false, false, false, false, false, (String)null, (String)null, (Long)null, (String)null, (String)null, false, false, false, (BannedBy)null, (Integer)null, false, false, (String)null, (List)null, (List)null, (ModQueueTriggers)null, (NoteLabel)null, (List)null, (SubredditDetail)null, true, false, (Boolean)null, (PromoLayoutType)null, (List)null, (OutboundLink)null, (String)null, (List)null, false, (RichTextResponse)null, (Map)null, (PostPoll)null, (PostPredictionsTournamentData)null, (RpanVideo)null, (AudioRoom)null, (LegacyAudioRoom)null, (PostGallery)null, (RecommendationContext)null, (List)null, false, false, (String)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (String)null, false, (Long)null, (Long)null, false, (DiscussionType)null, (Boolean)null, (String)null, (Integer)null, (AppStoreData)null, (Boolean)null, (String)null, false, (String)null, (String)null, (List)null, (Integer)null, (String)null, (List)null, (String)null, (CrowdControlFilterLevel)null, false, (List)null, -1, -1, -16385, -1, (Object)null);
        }
        return copy$default2;
    }
}
