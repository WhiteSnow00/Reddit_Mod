// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.data.common.CommunityErrorType;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import com.reddit.domain.model.CommunityDrawerListing;
import com.reddit.queries.aa;
import com.reddit.domain.model.RelatedSubredditsResponse;
import java.util.HashSet;
import com.reddit.common.experiments.model.mainactivity.BigFishSubredditOptimizationVariant$a;
import com.reddit.common.experiments.model.mainactivity.BigFishSubredditOptimizationVariant;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.reddit.domain.model.UserSubredditPaginatedListing;
import com.reddit.domain.model.PaginatedListing;
import com.reddit.domain.model.tagging.SubredditTaggingQuestions;
import java.util.LinkedHashMap;
import com.reddit.domain.model.SubredditListItem;
import com.reddit.domain.model.Mappings;
import com.reddit.domain.model.Regions;
import com.reddit.domain.model.SubredditCounterpartMapping;
import com.reddit.structuredstyles.model.StructuredStyle;
import com.reddit.domain.model.tagging.SubredditRatingSurveyAnswers;
import java.util.Collection;
import com.reddit.domain.model.tagging.CrowdsourceTaggingQuestion;
import com.reddit.domain.model.communitycreation.SubredditTopic;
import o22.a0;
import com.reddit.mutations.s1;
import com.reddit.domain.model.communitycreation.CreateSubredditResult;
import com.reddit.domain.model.communitycreation.CreateSubreddit;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import g60.h2;
import g60.g2;
import java.io.Serializable;
import kotlinx.coroutines.flow.CancellableFlowImpl;
import com.reddit.domain.model.UserSubredditListings;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.SubredditTriggeredInvite;
import o22.b5;
import com.reddit.mutations.e9;
import com.reddit.data.model.graphql.GqlCreateUpdateSubredditMapper;
import com.reddit.domain.model.communitysettings.UpdateSubredditSettings;
import com.reddit.domain.model.communitysettings.SubredditSettings;
import com.reddit.notification.common.NotificationLevel;
import com.reddit.queries.r0;
import com.reddit.domain.model.communitycreation.SubredditTopicsResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.reddit.common.ThingType;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import com.reddit.domain.model.Ambassador;
import qg2.m;
import com.reddit.domain.model.Ambassadors;
import com.reddit.queries.yd;
import h7.h$a;
import com.reddit.domain.model.communitycreation.SubredditNameValidationResult;
import com.reddit.domain.model.SubredditAction;
import zg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.SubredditActionSource;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import ur0.e$a;
import com.reddit.queries.SubredditNewCommunityProgressCardsCountQuery;
import java.util.ArrayList;
import com.reddit.domain.model.UpdateResponse;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import java.util.Set;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import io.reactivex.plugins.RxJavaPlugins;
import nf2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import g60.v0;
import com.nytimes.android.external.store3.base.impl.Store;
import nf2.n;
import nf2.t;
import zg2.q;
import kotlinx.coroutines.rx2.e;
import sf2.o;
import g60.n0;
import kotlinx.coroutines.flow.g;
import com.reddit.domain.model.Subreddit;
import java.util.List;
import a4.u1;
import nf2.c0;
import java.io.InputStream;
import java.io.Closeable;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.inject.Inject;
import com.reddit.domain.model.SubredditListingProgressIndicator;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.h;
import android.content.Context;
import i22.c;
import db0.r;
import db0.d;
import ge0.u;
import com.squareup.moshi.y;
import gc0.b;
import com.reddit.data.remote.RemoteGqlSubredditQuestionsDataSource;
import com.reddit.data.remote.RemoteGqlSubredditTopicsDataSource;
import ge0.p;
import com.reddit.data.remote.RemoteGqlSubredditDataSource;
import com.reddit.data.remote.RemoteSubredditStatsDataSource;
import com.reddit.data.remote.RemoteSubredditDataSource;
import r20.a;
import db0.s;
import pg2.f;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ge0.o0;

public final class RedditSubredditRepository implements o0
{
    public static final Pair<Long, TimeUnit> H;
    public final pg2.f A;
    public final pg2.f B;
    public final pg2.f C;
    public final pg2.f D;
    public final pg2.f E;
    public final pg2.f F;
    public final pg2.f G;
    public final s a;
    public final r20.a b;
    public final RemoteSubredditDataSource c;
    public final RemoteSubredditStatsDataSource d;
    public final RemoteGqlSubredditDataSource e;
    public final p f;
    public final RemoteGqlSubredditTopicsDataSource g;
    public final RemoteGqlSubredditQuestionsDataSource h;
    public final gc0.a i;
    public final gc0.b j;
    public final n22.p k;
    public final y l;
    public final u m;
    public final db0.d n;
    public final r o;
    public final com.reddit.session.r p;
    public final e20.a q;
    public final jw0.a r;
    public final i22.c s;
    public final Context t;
    public final db0.c u;
    public final kotlinx.coroutines.flow.h v;
    public final StateFlowImpl w;
    public final kotlinx.coroutines.flow.h x;
    public final StateFlowImpl y;
    public final StateFlowImpl z;
    
    static {
        H = new Pair((Object)1L, (Object)TimeUnit.HOURS);
    }
    
    @Inject
    public RedditSubredditRepository(final s a, final r20.a b, final RemoteSubredditDataSource c, final RemoteSubredditStatsDataSource d, final RemoteGqlSubredditDataSource e, final p f, final RemoteGqlSubredditTopicsDataSource g, final RemoteGqlSubredditQuestionsDataSource h, final gc0.a i, final gc0.b j, final n22.p k, final y l, final u m, final db0.d n, final r o, final com.reddit.session.r p21, final e20.a q, final jw0.a r, final i22.c s, final Context t, final db0.c u) {
        ah2.f.f((Object)a, "membersFeatures");
        ah2.f.f((Object)b, "backgroundThread");
        ah2.f.f((Object)c, "remote");
        ah2.f.f((Object)d, "remoteStats");
        ah2.f.f((Object)e, "remoteGql");
        ah2.f.f((Object)f, "inboxNotificationSettingsRepository");
        ah2.f.f((Object)g, "subredditTopicsRemoteGql");
        ah2.f.f((Object)h, "subredditQuestionsDataSource");
        ah2.f.f((Object)i, "localSubredditQuestionsDataSource");
        ah2.f.f((Object)j, "local");
        ah2.f.f((Object)k, "trackingDelegate");
        ah2.f.f((Object)l, "moshi");
        ah2.f.f((Object)m, "myAccountRepository");
        ah2.f.f((Object)n, "communitiesFeatures");
        ah2.f.f((Object)o, "mainActivityFeatures");
        ah2.f.f((Object)p21, "sessionView");
        ah2.f.f((Object)q, "dispatcherProvider");
        ah2.f.f((Object)r, "logger");
        ah2.f.f((Object)s, "tracingFeatures");
        ah2.f.f((Object)t, "context");
        ah2.f.f((Object)u, "channelsFeatures");
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
        this.p = p21;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        final BufferOverflow drop_OLDEST = BufferOverflow.DROP_OLDEST;
        this.v = pj2.u.g(1, 0, drop_OLDEST, 2);
        final SubredditListingProgressIndicator complete = SubredditListingProgressIndicator.COMPLETE;
        this.w = o72.f.f((Object)complete);
        this.x = pj2.u.g(1, 0, drop_OLDEST, 2);
        this.y = o72.f.f((Object)complete);
        this.z = o72.f.f((Object)complete);
        this.A = kotlin.a.b((zg2.a)new RedditSubredditRepository$subredditAboutStore.RedditSubredditRepository$subredditAboutStore$2(this));
        this.B = kotlin.a.b((zg2.a)new RedditSubredditRepository$quarantinedSubredditAboutStore.RedditSubredditRepository$quarantinedSubredditAboutStore$2(this));
        this.C = kotlin.a.b((zg2.a)new RedditSubredditRepository$structuredStyleStore.RedditSubredditRepository$structuredStyleStore$2(this));
        this.D = kotlin.a.b((zg2.a)new RedditSubredditRepository$crosspostableSubredditsStore.RedditSubredditRepository$crosspostableSubredditsStore$2(this));
        this.E = kotlin.a.b((zg2.a)new RedditSubredditRepository$subredditListingStore.RedditSubredditRepository$subredditListingStore$2(this));
        this.F = kotlin.a.b((zg2.a)new RedditSubredditRepository$subredditListingGroupStore.RedditSubredditRepository$subredditListingGroupStore$2(this));
        this.G = kotlin.a.b((zg2.a)new RedditSubredditRepository$subredditGroupStore.RedditSubredditRepository$subredditGroupStore$2(this));
    }
    
    public static String w0(Context o, String b) {
        final InputStream open = ((Context)o).getAssets().open((String)b);
        ah2.f.e((Object)open, "context.assets.open(fileName)");
        final InputStreamReader inputStreamReader = new InputStreamReader(open, kj2.a.b);
        if (inputStreamReader instanceof BufferedReader) {
            o = inputStreamReader;
        }
        else {
            o = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            b = kotlin.io.a.b((Reader)o);
            n02.r.o((Closeable)o, (Throwable)null);
            return (String)b;
        }
        finally {
            try {}
            finally {
                n02.r.o((Closeable)o, (Throwable)b);
            }
        }
    }
    
    public final c0 A(final String s, final boolean b) {
        c0<List<Subreddit>> c0;
        if (b) {
            c0 = this.s0(SubredditGroup.MODERATING, s);
        }
        else {
            c0 = this.u0(SubredditGroup.MODERATING, s);
        }
        return u1.j1((c0)c0, (r20.d)this.b);
    }
    
    public final kotlinx.coroutines.flow.g B() {
        final kotlinx.coroutines.flow.h x = this.x;
        final t map = this.j.B().map((o)new n0(7));
        ah2.f.e((Object)map, "local.observeModeratingS\u2026tyDrawerListing(it)\n    }");
        return new kotlinx.coroutines.flow.g((pj2.e)x, (pj2.e)kotlinx.coroutines.rx2.e.b(map), (q)new RedditSubredditRepository$observeModeratingSubredditsListing$2((tg2.c)null));
    }
    
    public final n<Subreddit> C(final String s, final boolean b, final boolean b2) {
        ah2.f.f((Object)s, "subredditName");
        n n;
        if (b) {
            Store store;
            if (b2) {
                final Object value = this.B.getValue();
                ah2.f.e(value, "<get-quarantinedSubredditAboutStore>(...)");
                store = (Store)value;
            }
            else {
                final Object value2 = this.A.getValue();
                ah2.f.e(value2, "<get-subredditAboutStore>(...)");
                store = (Store)value2;
            }
            final Object value3 = this.C.getValue();
            ah2.f.e(value3, "<get-structuredStyleStore>(...)");
            final c0 b3 = ((Store)value3).b((Object)s);
            ah2.f.e((Object)b3, "structuredStyleStore.fetch(subredditName)");
            final c0 b4 = store.b((Object)s);
            final v0 v0 = new v0(b3, 1);
            b4.getClass();
            final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)b4, (o)v0));
            final g60.o o = new g60.o(this, 5);
            onAssembly.getClass();
            final n m = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)onAssembly, (o)o)).M();
            final d60.q q = new d60.q(this, s, b2);
            m.getClass();
            n = RxJavaPlugins.onAssembly((n)new MaybeOnErrorNext((nf2.r)m, (o)q));
        }
        else {
            final n v2 = this.j.v(s);
            final Object value4 = this.C.getValue();
            ah2.f.e(value4, "<get-structuredStyleStore>(...)");
            n = v2.C(((Store)value4).get((Object)s).M(), (sf2.c)new ag0.a());
        }
        ah2.f.e((Object)n, "if (refresh) {\n      val\u2026       },\n        )\n    }");
        return (n<Subreddit>)dg.d.A1(n, (r20.d)this.b);
    }
    
    public final t D(final String s, final boolean b) {
        t t;
        if (b) {
            t = this.s0(SubredditGroup.FAVORITES_AND_USERS, s).N().mergeWith((nf2.y)this.j.S());
        }
        else {
            t = this.u0(SubredditGroup.FAVORITES_AND_USERS, s).N().mergeWith((nf2.y)this.j.S());
        }
        ah2.f.e((Object)t, "if (refresh) {\n      fet\u2026bredditsAndUsers())\n    }");
        return eg.n0.G0(t, this.b);
    }
    
    public final Object E(final tg2.c<? super Set<String>> c) {
        return this.j.J();
    }
    
    public final Object F(final String s, final tg2.c<? super j> c) {
        final Object x0 = this.x0(SubredditGroup.MODERATING, s, c);
        if (x0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return x0;
        }
        return pg2.j.a;
    }
    
    public final Object G(final String s, final String s2, final tg2.c<? super UpdateResponse> c) {
        return this.h.a(s, s2, c);
    }
    
    public final c0 H(final ArrayList list) {
        final RemoteGqlSubredditQuestionsDataSource h = this.h;
        h.getClass();
        final c0 w = e$a.a((ur0.e)h.a, (k)new SubredditNewCommunityProgressCardsCountQuery(list), (OkHttpClient)null, (Map)null, 14).w((o)new ov.c(13));
        ah2.f.e((Object)w, "graphQlClient\n      .exe\u2026rds?.size ?: 0) }\n      }");
        return w;
    }
    
    public final nf2.a I(final String s) {
        ah2.f.f((Object)s, "subredditName");
        return o72.f.t(this.c.optInGatedSubreddit(s, "yes"), (r20.d)this.b);
    }
    
    public final nf2.a J(final ArrayList list, final SubredditActionSource subredditActionSource) {
        this.t0().clear();
        final nf2.a setSubscriptionState = this.c.setSubscriptionState(CollectionsKt___CollectionsKt.y1((Iterable)list, (CharSequence)",", (String)null, (String)null, (l)null, 62), SubredditAction.UNSUBSCRIBE, subredditActionSource);
        final nf2.a k = this.j.m(list).K();
        ah2.f.e((Object)k, "local.unsubscribeSubredd\u2026dditList).toCompletable()");
        final nf2.a e = setSubscriptionState.e((nf2.e)k);
        ah2.f.e((Object)e, "remoteSubscribeList.andThen(localSubscribe)");
        return o72.f.t(e, (r20.d)this.b);
    }
    
    public final n<Subreddit> K(final String s, final boolean b) {
        ah2.f.f((Object)s, "subredditName");
        n n;
        if (b) {
            final Object value = this.A.getValue();
            ah2.f.e(value, "<get-subredditAboutStore>(...)");
            final n m = ((Store)value).b((Object)s).M();
            final w w = new w(1, this, s);
            m.getClass();
            n = RxJavaPlugins.onAssembly((n)new MaybeOnErrorNext((nf2.r)m, (o)w));
            ah2.f.e((Object)n, "{\n      subredditAboutSt\u2026dditName)\n        }\n    }");
        }
        else {
            n = this.j.v(s);
        }
        return (n<Subreddit>)dg.d.A1(n, (r20.d)this.b);
    }
    
    public final Object L(final String s, final String s2, final tg2.c<? super UpdateResponse> c) {
        return this.g.b(s, s2, c);
    }
    
    public final c0<SubredditNameValidationResult> M(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final RemoteGqlSubredditDataSource e = this.e;
        e.getClass();
        final c0 w = u1.j1(e$a.a((ur0.e)e.a, (k)new yd(new o22.c0(h$a.c((Object)s), 14)), (OkHttpClient)null, (Map)null, 14), (r20.d)e.d).w((o)new ov.d(7));
        ah2.f.e((Object)w, "graphQlClient\n      .exe\u2026?.code,\n        )\n      }");
        return (c0<SubredditNameValidationResult>)u1.j1(w, (r20.d)this.b);
    }
    
    public final t N() {
        final t n = this.j.F(3).N();
        ah2.f.e((Object)n, "local.getRecentSubreddit\u2026t = limit).toObservable()");
        return eg.n0.G0(n, this.b);
    }
    
    public final c0 O(final String s, final boolean b) {
        c0<List<Subreddit>> c0;
        if (b) {
            c0 = this.s0(SubredditGroup.DEFAULTS, s);
        }
        else {
            c0 = this.u0(SubredditGroup.DEFAULTS, s);
        }
        return u1.j1((c0)c0, (r20.d)this.b);
    }
    
    public final kotlinx.coroutines.flow.g P() {
        final kotlinx.coroutines.flow.h v = this.v;
        final t map = this.j.l().map((o)new ch.b(15));
        ah2.f.e((Object)map, "local.observeFollowingSu\u2026tyDrawerListing(it)\n    }");
        return new kotlinx.coroutines.flow.g((pj2.e)v, (pj2.e)kotlinx.coroutines.rx2.e.b(map), (q)new RedditSubredditRepository$observeFollowingSubredditsListing$2((tg2.c)null));
    }
    
    public final Object Q(final String s, final tg2.c<? super j> c) {
        final Object x0 = this.x0(SubredditGroup.SUBSCRIBED, s, c);
        if (x0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return x0;
        }
        return pg2.j.a;
    }
    
    public final List<String> R() {
        final Ambassadors ambassadors = (Ambassadors)mk2.e.F(true).d().a((Class)Ambassadors.class).fromJson(w0(this.t, "reddit_ambassadors.json"));
        if (ambassadors != null) {
            final List list = ambassadors.getList();
            if (list != null) {
                final ArrayList list2 = new ArrayList(qg2.m.P0((Iterable)list, 10));
                final Iterator iterator = list.iterator();
                while (true) {
                    final Object instance = list2;
                    if (!iterator.hasNext()) {
                        return (List<String>)instance;
                    }
                    list2.add((Object)((Ambassador)iterator.next()).getUser_name());
                }
            }
        }
        final Object instance = EmptyList.INSTANCE;
        return (List<String>)instance;
    }
    
    public final Object S(final String l$1, boolean z$0, final tg2.c<? super UpdateResponse> c) {
        RedditSubredditRepository$updateFavoriteState.RedditSubredditRepository$updateFavoriteState$1 redditSubredditRepository$updateFavoriteState$2 = null;
        Label_0056: {
            if (c instanceof RedditSubredditRepository$updateFavoriteState.RedditSubredditRepository$updateFavoriteState$1) {
                final RedditSubredditRepository$updateFavoriteState.RedditSubredditRepository$updateFavoriteState$1 redditSubredditRepository$updateFavoriteState$1 = (RedditSubredditRepository$updateFavoriteState.RedditSubredditRepository$updateFavoriteState$1)c;
                final int label = redditSubredditRepository$updateFavoriteState$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$updateFavoriteState$1.label = label + Integer.MIN_VALUE;
                    redditSubredditRepository$updateFavoriteState$2 = redditSubredditRepository$updateFavoriteState$1;
                    break Label_0056;
                }
            }
            redditSubredditRepository$updateFavoriteState$2 = new RedditSubredditRepository$updateFavoriteState.RedditSubredditRepository$updateFavoriteState$1(this, (tg2.c)c);
        }
        Object o = redditSubredditRepository$updateFavoriteState$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$updateFavoriteState$2.label;
        RedditSubredditRepository l$2 = null;
        Label_0279: {
            String s;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        l$2 = (RedditSubredditRepository)redditSubredditRepository$updateFavoriteState$2.L$0;
                        aj2.c.Q0(o);
                        break Label_0279;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    z$0 = redditSubredditRepository$updateFavoriteState$2.Z$0;
                    s = (String)redditSubredditRepository$updateFavoriteState$2.L$1;
                    l$2 = (RedditSubredditRepository)redditSubredditRepository$updateFavoriteState$2.L$0;
                    aj2.c.Q0(o);
                }
            }
            else {
                aj2.c.Q0(o);
                final String e = z10.w.e(l$1, ThingType.SUBREDDIT);
                final RemoteGqlSubredditDataSource e2 = this.e;
                redditSubredditRepository$updateFavoriteState$2.L$0 = this;
                redditSubredditRepository$updateFavoriteState$2.L$1 = l$1;
                redditSubredditRepository$updateFavoriteState$2.Z$0 = z$0;
                redditSubredditRepository$updateFavoriteState$2.label = 1;
                o = e2.p(e, z$0, (tg2.c<? super UpdateResponse>)redditSubredditRepository$updateFavoriteState$2);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                s = l$1;
                l$2 = this;
            }
            final UpdateResponse updateResponse = (UpdateResponse)o;
            if (!updateResponse.getSuccess()) {
                return updateResponse;
            }
            final c0 s2 = l$2.j.s(s, z$0);
            redditSubredditRepository$updateFavoriteState$2.L$0 = l$2;
            redditSubredditRepository$updateFavoriteState$2.L$1 = null;
            redditSubredditRepository$updateFavoriteState$2.label = 2;
            if ((o = kotlinx.coroutines.rx2.d.b(s2, (tg2.c)redditSubredditRepository$updateFavoriteState$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        if (!(boolean)o) {
            return new UpdateResponse(false, null);
        }
        final SubredditGroup subscribed = SubredditGroup.SUBSCRIBED;
        final Object value = l$2.G.getValue();
        ah2.f.e(value, "<get-subredditGroupStore>(...)");
        ((Store)value).a((Object)new c(subscribed, null));
        return new UpdateResponse(true, null);
    }
    
    public final c0<List<String>> T(final String s) {
        ah2.f.f((Object)s, "subredditId");
        final c0 y = this.j.R(s).g((Object)EmptyList.INSTANCE).y();
        ah2.f.e((Object)y, "local.getPinnedPosts(sub\u2026y(emptyList()).toSingle()");
        return (c0<List<String>>)y;
    }
    
    public final Object U(String l$1, final tg2.c<? super UpdateResponse> c) {
        RedditSubredditRepository$dismissCrowdsourceTaggingQuestion.RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 = null;
        Label_0050: {
            if (c instanceof RedditSubredditRepository$dismissCrowdsourceTaggingQuestion.RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1) {
                redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 = (RedditSubredditRepository$dismissCrowdsourceTaggingQuestion.RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1)c;
                final int label = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label = label + Integer.MIN_VALUE;
                    break Label_0050;
                }
            }
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 = new RedditSubredditRepository$dismissCrowdsourceTaggingQuestion.RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1(this, (tg2.c)c);
        }
        Object l$2 = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label;
        RedditSubredditRepository redditSubredditRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final Object l$3 = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$0;
                    aj2.c.Q0(l$2);
                    return l$3;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$1 = (String)redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$1;
                redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$0;
                aj2.c.Q0(l$2);
            }
        }
        else {
            aj2.c.Q0(l$2);
            final RemoteGqlSubredditQuestionsDataSource h = this.h;
            final EmptyList instance = EmptyList.INSTANCE;
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$0 = this;
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$1 = l$1;
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label = 1;
            l$2 = h.f(l$1, (List)instance, (tg2.c)redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1, true);
            if (l$2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditSubredditRepository = this;
        }
        Object o = l$2;
        if (!((UpdateResponse)l$2).getSuccess()) {
            return o;
        }
        final gc0.a i = redditSubredditRepository.i;
        redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$0 = l$2;
        redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$1 = null;
        redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label = 2;
        if (i.h(l$1, (ContinuationImpl)redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final Object l$3 = l$2;
        o = l$3;
        return o;
    }
    
    public final c0 V() {
        return u1.j1(this.j.F(25), (r20.d)this.b);
    }
    
    public final kotlinx.coroutines.flow.g W() {
        final kotlinx.coroutines.flow.h v = this.v;
        final t map = this.j.x().map((o)new g60.u(9));
        ah2.f.e((Object)map, "local.observeSubscribedS\u2026tyDrawerListing(it)\n    }");
        return new kotlinx.coroutines.flow.g((pj2.e)v, (pj2.e)kotlinx.coroutines.rx2.e.b(map), (q)new RedditSubredditRepository$observeSubscribedSubredditsListing$2((tg2.c)null));
    }
    
    public final c0<SubredditTopicsResult> X(final int n, final String s, final boolean b) {
        final RemoteGqlSubredditTopicsDataSource g = this.g;
        final c0 w = u1.j1(e$a.a((ur0.e)g.a, (k)new r0(h$a.c((Object)n), h$a.c((Object)s), h$a.c((Object)b)), (OkHttpClient)null, (Map)null, 14), (r20.d)g.b).w((o)new wu.e(8)).w((o)new m10.p(6));
        ah2.f.e((Object)w, "graphQlClient\n      .exe\u2026     },\n        )\n      }");
        return (c0<SubredditTopicsResult>)u1.j1(w, (r20.d)this.b);
    }
    
    public final t Y(final String s, final boolean b) {
        t t;
        if (b) {
            t = this.s0(SubredditGroup.SUBSCRIBED, s).N().mergeWith((nf2.y)this.j.x());
        }
        else {
            t = this.u0(SubredditGroup.SUBSCRIBED, s).N().mergeWith((nf2.y)this.j.x());
        }
        ah2.f.e((Object)t, "if (refresh) {\n      fet\u2026cribedSubreddits())\n    }");
        return eg.n0.G0(t, this.b);
    }
    
    public final nf2.a Z(final String s, final String s2, final NotificationLevel notificationLevel) {
        ah2.f.f((Object)s, "subredditKindWithId");
        ah2.f.f((Object)s2, "subredditName");
        ah2.f.f((Object)notificationLevel, "notificationLevel");
        final nf2.a i = wi.b.a0((zg2.p)new RedditSubredditRepository$updateNotificationLevel$1(this, s, notificationLevel, (tg2.c)null)).i((nf2.e)this.j.E(s2, notificationLevel).K());
        ah2.f.e((Object)i, "override fun updateNotif\u2026eOn(backgroundThread)\n  }");
        return o72.f.t(i, (r20.d)this.b);
    }
    
    public final nf2.a a(final String s) {
        ah2.f.f((Object)s, "subredditId");
        return o72.f.t(this.j.a(s), (r20.d)this.b);
    }
    
    public final Object a0(final ArrayList list, final tg2.c c) {
        final j u = this.j.u(list);
        if (u == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return u;
        }
        return pg2.j.a;
    }
    
    public final nf2.a b(final String s) {
        ah2.f.f((Object)s, "subredditName");
        return this.j.b(s);
    }
    
    public final Object b0(final String s, final ContinuationImpl continuationImpl) {
        return this.e.i(s, (tg2.c<? super SubredditSettings>)continuationImpl);
    }
    
    public final nf2.a c(final String s) {
        ah2.f.f((Object)s, "subredditName");
        return this.j.c(s);
    }
    
    public final c0<Boolean> c0(final Subreddit subreddit) {
        ah2.f.f((Object)subreddit, "subreddit");
        return (c0<Boolean>)u1.j1(this.j.P(subreddit), (r20.d)this.b);
    }
    
    public final nf2.a d(final String s) {
        ah2.f.f((Object)s, "kindWithId");
        return o72.f.t(this.j.d(s), (r20.d)this.b);
    }
    
    public final c0<Set<String>> d0(final String s) {
        final c0 value = this.t0().get((Object)s);
        ah2.f.e((Object)value, "crosspostableSubredditsStore.get(username)");
        return (c0<Set<String>>)u1.j1(value, (r20.d)this.b);
    }
    
    public final c0<List<Subreddit>> e() {
        return (c0<List<Subreddit>>)u1.j1(this.j.e(), (r20.d)this.b);
    }
    
    public final c0<UpdateResponse> e0(final UpdateSubredditSettings updateSubredditSettings) {
        final RemoteGqlSubredditDataSource e = this.e;
        final b5 map = GqlCreateUpdateSubredditMapper.INSTANCE.map(updateSubredditSettings);
        e.getClass();
        ah2.f.f((Object)map, "input");
        final c0 w = u1.j1(e$a.a((ur0.e)e.a, (k)new e9(map), (OkHttpClient)null, (Map)null, 14), (r20.d)e.d).w((o)new ov.c(12));
        ah2.f.e((Object)w, "graphQlClient\n      .exe\u2026essage,\n        )\n      }");
        return (c0<UpdateResponse>)w;
    }
    
    public final nf2.a f(final String s) {
        ah2.f.f((Object)s, "subredditName");
        return this.j.f(s);
    }
    
    public final nf2.a f0(final String s) {
        ah2.f.f((Object)s, "subredditName");
        return o72.f.t(this.c.optInQuarantinedSubreddit(s, "yes"), (r20.d)this.b);
    }
    
    public final nf2.a g() {
        return this.j.g();
    }
    
    public final nf2.a g0(final List<String> list, final SubredditActionSource subredditActionSource) {
        ah2.f.f((Object)list, "subredditList");
        this.t0().clear();
        final nf2.a e = this.c.setSubscriptionState(CollectionsKt___CollectionsKt.y1((Iterable)list, (CharSequence)",", (String)null, (String)null, (l)null, 62), SubredditAction.SUBSCRIBE, subredditActionSource).e((nf2.e)nf2.t.fromIterable((Iterable)list).flatMapCompletable((o)new g60.q(this, 4)));
        ah2.f.e((Object)e, "remoteSubscribeList.andThen(localSubscribe)");
        return o72.f.t(e, (r20.d)this.b);
    }
    
    public final n<List<SubredditTriggeredInvite>> h() {
        return (n<List<SubredditTriggeredInvite>>)this.j.h();
    }
    
    public final t h0(final String s, final boolean b) {
        t t;
        if (b) {
            t = this.s0(SubredditGroup.MODERATING, s).N().mergeWith((nf2.y)this.j.B());
        }
        else {
            t = this.u0(SubredditGroup.MODERATING, s).N().mergeWith((nf2.y)this.j.B());
        }
        ah2.f.e((Object)t, "if (refresh) {\n      fet\u2026ratingSubreddits())\n    }");
        return eg.n0.G0(t, this.b);
    }
    
    public final nf2.a i(final String s, final ArrayList list) {
        ah2.f.f((Object)s, "subredditId");
        return this.j.Q(s, list);
    }
    
    public final Object i0(final String s, final tg2.c<? super Result<Boolean>> c) {
        if (s20.a.c(s)) {
            return this.e.c(s20.a.i(s), c);
        }
        return this.e.h(s20.a.h(s), c);
    }
    
    public final c0<List<Subreddit>> j(final String s) {
        return (c0<List<Subreddit>>)u1.j1((c0)this.u0(SubredditGroup.FAVORITES, s), (r20.d)this.b);
    }
    
    public final t j0(final String s, final boolean b) {
        t t;
        if (b) {
            t = this.s0(SubredditGroup.FOLLOWING, s).N().mergeWith((nf2.y)this.j.l());
        }
        else {
            t = this.u0(SubredditGroup.FOLLOWING, s).N().mergeWith((nf2.y)this.j.l());
        }
        ah2.f.e((Object)t, "if (refresh) {\n      fet\u2026lowingSubreddits())\n    }");
        return eg.n0.G0(t, this.b);
    }
    
    public final Object k(final String s, final tg2.c<? super Subreddit> c) {
        RedditSubredditRepository$getOrFetchSubreddit.RedditSubredditRepository$getOrFetchSubreddit$1 redditSubredditRepository$getOrFetchSubreddit$2 = null;
        Label_0052: {
            if (c instanceof RedditSubredditRepository$getOrFetchSubreddit.RedditSubredditRepository$getOrFetchSubreddit$1) {
                final RedditSubredditRepository$getOrFetchSubreddit.RedditSubredditRepository$getOrFetchSubreddit$1 redditSubredditRepository$getOrFetchSubreddit$1 = (RedditSubredditRepository$getOrFetchSubreddit.RedditSubredditRepository$getOrFetchSubreddit$1)c;
                final int label = redditSubredditRepository$getOrFetchSubreddit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$getOrFetchSubreddit$1.label = label + Integer.MIN_VALUE;
                    redditSubredditRepository$getOrFetchSubreddit$2 = redditSubredditRepository$getOrFetchSubreddit$1;
                    break Label_0052;
                }
            }
            redditSubredditRepository$getOrFetchSubreddit$2 = new RedditSubredditRepository$getOrFetchSubreddit.RedditSubredditRepository$getOrFetchSubreddit$1(this, (tg2.c)c);
        }
        final Object result = redditSubredditRepository$getOrFetchSubreddit$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$getOrFetchSubreddit$2.label;
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
            final Object value = this.A.getValue();
            ah2.f.e(value, "<get-subredditAboutStore>(...)");
            final c0 value2 = ((Store)value).get((Object)s);
            ah2.f.e((Object)value2, "subredditAboutStore.get(subredditName)");
            final c0 j1 = u1.j1(value2, (r20.d)this.b);
            redditSubredditRepository$getOrFetchSubreddit$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(j1, (tg2.c)redditSubredditRepository$getOrFetchSubreddit$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(b, "subredditAboutStore.get(\u2026undThread)\n      .await()");
        return b;
    }
    
    public final Object k0(final String s, final String s2, final tg2.c<? super UpdateResponse> c) {
        return this.h.b(s, s2, c);
    }
    
    public final c0<Boolean> l(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final nf2.a setSubscriptionState = this.c.setSubscriptionState(s, SubredditAction.UNSUBSCRIBE, null);
        nf2.a a;
        if (s20.a.c(s)) {
            a = this.j.t(s).l((sf2.a)new h40.p(2, (Object)this, (Object)s));
        }
        else {
            a = nf2.a.h();
        }
        final nf2.a s2 = nf2.a.s(new nf2.e[] { (nf2.e)a, (nf2.e)this.j.k(s) });
        ah2.f.e((Object)s2, "mergeArray(\n      unfoll\u2026dit(subredditName),\n    )");
        final nf2.a e = setSubscriptionState.e((nf2.e)s2);
        ah2.f.e((Object)e, "unsubscribeSubreddit\n   \u2026andThen(unsubscribeLocal)");
        final c0 c = o72.f.t(e, (r20.d)this.b).C((Object)Boolean.TRUE);
        ah2.f.e((Object)c, "unsubscribeSubreddit\n   \u2026   .toSingleDefault(true)");
        return (c0<Boolean>)c;
    }
    
    public final Object l0(final tg2.c<? super pj2.e<UserSubredditListings>> c) {
        RedditSubredditRepository$observeUserSubredditListings.RedditSubredditRepository$observeUserSubredditListings$1 redditSubredditRepository$observeUserSubredditListings$1 = null;
        Label_0047: {
            if (c instanceof RedditSubredditRepository$observeUserSubredditListings.RedditSubredditRepository$observeUserSubredditListings$1) {
                redditSubredditRepository$observeUserSubredditListings$1 = (RedditSubredditRepository$observeUserSubredditListings.RedditSubredditRepository$observeUserSubredditListings$1)c;
                final int label = redditSubredditRepository$observeUserSubredditListings$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$observeUserSubredditListings$1.label = label + Integer.MIN_VALUE;
                    break Label_0047;
                }
            }
            redditSubredditRepository$observeUserSubredditListings$1 = new RedditSubredditRepository$observeUserSubredditListings.RedditSubredditRepository$observeUserSubredditListings$1(this, (tg2.c)c);
        }
        Object o = redditSubredditRepository$observeUserSubredditListings$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$observeUserSubredditListings$1.label;
        Object o2 = null;
        RedditSubredditRepository redditSubredditRepository = null;
        Object o3 = null;
        Label_0356: {
            Label_0278: {
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            o2 = redditSubredditRepository$observeUserSubredditListings$1.L$1;
                            redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$observeUserSubredditListings$1.L$0;
                            aj2.c.Q0(o);
                            break Label_0278;
                        }
                        if (label2 == 3) {
                            final pj2.e e = (pj2.e)redditSubredditRepository$observeUserSubredditListings$1.L$2;
                            o2 = redditSubredditRepository$observeUserSubredditListings$1.L$1;
                            redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$observeUserSubredditListings$1.L$0;
                            aj2.c.Q0(o);
                            o3 = e;
                            break Label_0356;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$observeUserSubredditListings$1.L$0;
                        aj2.c.Q0(o);
                    }
                }
                else {
                    aj2.c.Q0(o);
                    final gc0.b j = this.j;
                    redditSubredditRepository$observeUserSubredditListings$1.L$0 = this;
                    redditSubredditRepository$observeUserSubredditListings$1.label = 1;
                    o = j.q();
                    if (o == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    redditSubredditRepository = this;
                }
                o2 = new kotlinx.coroutines.flow.g((pj2.e)o, (pj2.e)redditSubredditRepository.w, (q)new RedditSubredditRepository$observeUserSubredditListings$subscribedFlow$1((tg2.c)null));
                final gc0.b i = redditSubredditRepository.j;
                redditSubredditRepository$observeUserSubredditListings$1.L$0 = redditSubredditRepository;
                redditSubredditRepository$observeUserSubredditListings$1.L$1 = o2;
                redditSubredditRepository$observeUserSubredditListings$1.label = 2;
                if ((o = i.n()) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final kotlinx.coroutines.flow.g l$2 = new kotlinx.coroutines.flow.g((pj2.e)o, (pj2.e)redditSubredditRepository.y, (q)new RedditSubredditRepository$observeUserSubredditListings$moderatingFlow$1((tg2.c)null));
            final gc0.b k = redditSubredditRepository.j;
            redditSubredditRepository$observeUserSubredditListings$1.L$0 = redditSubredditRepository;
            redditSubredditRepository$observeUserSubredditListings$1.L$1 = o2;
            redditSubredditRepository$observeUserSubredditListings$1.L$2 = l$2;
            redditSubredditRepository$observeUserSubredditListings$1.label = 3;
            final pj2.e l = k.K();
            if (l == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o3 = l$2;
            o = l;
        }
        Object p = pj2.u.p((pj2.e)o2, (pj2.e)o3, (pj2.e)new kotlinx.coroutines.flow.g((pj2.e)o, (pj2.e)redditSubredditRepository.z, (q)new RedditSubredditRepository$observeUserSubredditListings$followingFlow$1((tg2.c)null)), (zg2.r)new RedditSubredditRepository$observeUserSubredditListings$2((tg2.c)null));
        if (!(p instanceof pj2.a)) {
            p = new CancellableFlowImpl((pj2.e)p);
        }
        return p;
    }
    
    public final Object m(String l$1, final ArrayList list, final tg2.c c) {
        RedditSubredditRepository$submitCrowdsourceTaggingAnswer$1 redditSubredditRepository$submitCrowdsourceTaggingAnswer$2 = null;
        Label_0056: {
            if (c instanceof RedditSubredditRepository$submitCrowdsourceTaggingAnswer$1) {
                final RedditSubredditRepository$submitCrowdsourceTaggingAnswer$1 redditSubredditRepository$submitCrowdsourceTaggingAnswer$1 = (RedditSubredditRepository$submitCrowdsourceTaggingAnswer$1)c;
                final int label = redditSubredditRepository$submitCrowdsourceTaggingAnswer$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$submitCrowdsourceTaggingAnswer$1.label = label + Integer.MIN_VALUE;
                    redditSubredditRepository$submitCrowdsourceTaggingAnswer$2 = redditSubredditRepository$submitCrowdsourceTaggingAnswer$1;
                    break Label_0056;
                }
            }
            redditSubredditRepository$submitCrowdsourceTaggingAnswer$2 = new RedditSubredditRepository$submitCrowdsourceTaggingAnswer$1(this, (tg2.c<? super RedditSubredditRepository$submitCrowdsourceTaggingAnswer$1>)c);
        }
        final Object result = redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.label;
        RedditSubredditRepository redditSubredditRepository;
        Object f;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final Object l$2 = redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$0;
                    aj2.c.Q0(result);
                    return l$2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$1 = (String)redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$1;
                redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$0;
                aj2.c.Q0(result);
                f = result;
            }
        }
        else {
            aj2.c.Q0(result);
            final RemoteGqlSubredditQuestionsDataSource h = this.h;
            redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$0 = this;
            redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$1 = l$1;
            redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.label = 1;
            f = h.f(l$1, list, (tg2.c)redditSubredditRepository$submitCrowdsourceTaggingAnswer$2, false);
            if (f == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditSubredditRepository = this;
        }
        Object o = f;
        if (!((UpdateResponse)f).getSuccess()) {
            return o;
        }
        final gc0.a i = redditSubredditRepository.i;
        redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$0 = f;
        redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$1 = null;
        redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.label = 2;
        if (i.h(l$1, (ContinuationImpl)redditSubredditRepository$submitCrowdsourceTaggingAnswer$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final Object l$2 = f;
        o = l$2;
        return o;
    }
    
    public final Serializable m0(final List list, final tg2.c c) {
        final RemoteGqlSubredditDataSource e = this.e;
        final ArrayList list2 = new ArrayList(qg2.m.P0((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(s20.a.i((String)iterator.next()));
        }
        return e.e(list2, c);
    }
    
    public final c0<Boolean> n(final String s) {
        ah2.f.f((Object)s, "subredditName");
        this.t0().clear();
        final nf2.a setSubscriptionState = this.c.setSubscriptionState(s, SubredditAction.SUBSCRIBE, null);
        nf2.a a;
        if (s20.a.c(s)) {
            a = this.j.i(s).l((sf2.a)new g2(this, s));
        }
        else {
            a = nf2.a.h();
        }
        final c0 o = this.j.O(s);
        final h2 h2 = new h2(this, s, 0);
        o.getClass();
        final nf2.a s2 = nf2.a.s(new nf2.e[] { (nf2.e)a, (nf2.e)RxJavaPlugins.onAssembly((nf2.a)new SingleFlatMapCompletable((g0)o, (o)h2)) });
        ah2.f.e((Object)s2, "mergeArray(\n      follow\u2026       }\n        },\n    )");
        final nf2.a e = setSubscriptionState.e((nf2.e)s2);
        ah2.f.e((Object)e, "remoteSubscribe\n      .andThen(localSubscribe)");
        final c0 c = o72.f.t(e, (r20.d)this.b).C((Object)Boolean.TRUE);
        ah2.f.e((Object)c, "remoteSubscribe\n      .a\u2026   .toSingleDefault(true)");
        return (c0<Boolean>)c;
    }
    
    public final c0<CreateSubredditResult> n0(final CreateSubreddit createSubreddit) {
        final RemoteGqlSubredditDataSource e = this.e;
        final a0 map = GqlCreateUpdateSubredditMapper.INSTANCE.map(createSubreddit);
        e.getClass();
        ah2.f.f((Object)map, "input");
        final c0 w = u1.j1(e$a.a((ur0.e)e.a, (k)new s1(map), (OkHttpClient)null, (Map)null, 14), (r20.d)e.d).w((o)new qw.d(12));
        ah2.f.e((Object)w, "graphQlClient\n      .exe\u2026essage,\n        )\n      }");
        return (c0<CreateSubredditResult>)w;
    }
    
    public final Object o(final String s, final tg2.c<? super SubredditTopic> c) {
        return this.g.a(s, c);
    }
    
    public final c0<Boolean> o0(final String s, final String s2, final boolean b) {
        ah2.f.f((Object)s, "subredditId");
        final c0 c = this.c.postFavorites(b, s2).C((Object)Boolean.TRUE).C((Object)Boolean.FALSE);
        ah2.f.e((Object)c, "remote.postFavorites(fav\u2026.onErrorReturnItem(false)");
        final c0 q = c0.Q((g0)c, (g0)this.j.s(s, b), (sf2.c)new x(this));
        ah2.f.e((Object)q, "remoteSave.zipWith(\n    \u2026    remote\n      },\n    )");
        return (c0<Boolean>)u1.j1(q, (r20.d)this.b);
    }
    
    public final Object p(final String s, final tg2.c<? super List<CrowdsourceTaggingQuestion>> c) {
        return this.i.n(s, (tg2.c)c);
    }
    
    public final c0<Boolean> p0(final List<Subreddit> list) {
        ah2.f.f((Object)list, "subreddits");
        return (c0<Boolean>)u1.j1(this.j.C((Collection)list), (r20.d)this.b);
    }
    
    public final Object q(final String s, final SubredditRatingSurveyAnswers subredditRatingSurveyAnswers, final tg2.c<? super UpdateResponse> c) {
        return this.h.g(s, subredditRatingSurveyAnswers, c);
    }
    
    public final c0<StructuredStyle> q0(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final Object value = this.C.getValue();
        ah2.f.e(value, "<get-structuredStyleStore>(...)");
        final c0 value2 = ((Store)value).get((Object)s);
        ah2.f.e((Object)value2, "structuredStyleStore.get(subredditName)");
        return (c0<StructuredStyle>)u1.j1(value2, (r20.d)this.b);
    }
    
    public final String r(String subreddit_name, final String s, final String s2) {
        ah2.f.f((Object)subreddit_name, "subredditName");
        ah2.f.f((Object)s2, "deviceLanguage");
        final SubredditCounterpartMapping subredditCounterpartMapping = (SubredditCounterpartMapping)mk2.e.F(true).d().a((Class)SubredditCounterpartMapping.class).fromJson(w0(this.t, "counterpart_communities.json"));
        final Mappings mappings = null;
        Object o = null;
        Label_0182: {
            Label_0178: {
                if (subredditCounterpartMapping != null) {
                    final List regions = subredditCounterpartMapping.getRegions();
                    if (regions != null) {
                        while (true) {
                            for (final Object next : regions) {
                                final Regions regions2 = (Regions)next;
                                if (ah2.f.a((Object)regions2.getLanguage(), (Object)s) || ah2.f.a((Object)regions2.getLanguage(), (Object)s2)) {
                                    final Regions regions3 = (Regions)next;
                                    final Regions regions4 = regions3;
                                    if (regions4 == null) {
                                        break Label_0178;
                                    }
                                    o = regions4.getMappings();
                                    if (o != null) {
                                        break Label_0182;
                                    }
                                    break Label_0178;
                                }
                            }
                            final Regions regions3 = null;
                            continue;
                        }
                    }
                }
            }
            o = EmptyList.INSTANCE;
        }
        final Iterator iterator2 = ((Iterable)o).iterator();
        Object next2;
        do {
            next2 = mappings;
            if (!iterator2.hasNext()) {
                break;
            }
            next2 = iterator2.next();
        } while (!kj2.j.V1(((Mappings)next2).getSubreddit_counterpart(), subreddit_name, true));
        final Mappings mappings2 = (Mappings)next2;
        if (mappings2 != null) {
            subreddit_name = mappings2.getSubreddit_name();
            if (subreddit_name != null) {
                return subreddit_name;
            }
        }
        subreddit_name = "";
        return subreddit_name;
    }
    
    public final Object r0(final List<String> list, final tg2.c<? super List<Subreddit>> c) {
        return this.e.k(list, c);
    }
    
    public final Object s(tg2.c<? super List<SubredditListItem>> y) {
        RedditSubredditRepository$fetchAllUserSubredditListItems.RedditSubredditRepository$fetchAllUserSubredditListItems$1 redditSubredditRepository$fetchAllUserSubredditListItems$1 = null;
        Label_0047: {
            if (y instanceof RedditSubredditRepository$fetchAllUserSubredditListItems.RedditSubredditRepository$fetchAllUserSubredditListItems$1) {
                redditSubredditRepository$fetchAllUserSubredditListItems$1 = (RedditSubredditRepository$fetchAllUserSubredditListItems.RedditSubredditRepository$fetchAllUserSubredditListItems$1)y;
                final int label = redditSubredditRepository$fetchAllUserSubredditListItems$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.label = label + Integer.MIN_VALUE;
                    break Label_0047;
                }
            }
            redditSubredditRepository$fetchAllUserSubredditListItems$1 = new RedditSubredditRepository$fetchAllUserSubredditListItems.RedditSubredditRepository$fetchAllUserSubredditListItems$1(this, (tg2.c)y);
        }
        final Object result = redditSubredditRepository$fetchAllUserSubredditListItems$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$fetchAllUserSubredditListItems$1.label;
        while (true) {
            Iterable iterable = null;
            Throwable t = null;
            Label_0348: {
                RedditSubredditRepository l$3;
                Iterator iterator2;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 != 2) {
                            if (label2 == 3) {
                                final Iterator l$1 = (Iterator)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1;
                                final Throwable l$2 = (Throwable)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0;
                                aj2.c.Q0(result);
                                break Label_0384;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            Object v0 = y = redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0;
                            try {
                                aj2.c.Q0(result);
                                y = v0;
                                v0 = result;
                                break Label_0348;
                            }
                            finally {
                                break Label_0348;
                            }
                        }
                    }
                    final Iterator iterator = (Iterator)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2;
                    y = redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1;
                    l$3 = (RedditSubredditRepository)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0;
                    aj2.c.Q0(result);
                    iterator2 = iterator;
                }
                else {
                    aj2.c.Q0(result);
                    y = ah2.c.Y((Object[])new pj2.p[] { (pj2.p)this.w, (pj2.p)this.y, (pj2.p)this.z });
                    iterator2 = ((Iterable)y).iterator();
                    l$3 = this;
                }
                while (iterator2.hasNext()) {
                    final pj2.p p = iterator2.next();
                    final SubredditListingProgressIndicator loading = SubredditListingProgressIndicator.LOADING;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0 = l$3;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1 = y;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2 = iterator2;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.label = 1;
                    if (((pj2.o)p).emit((Object)loading, (tg2.c)redditSubredditRepository$fetchAllUserSubredditListItems$1) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                Label_0300: {
                    break Label_0300;
                    final Iterator l$1;
                    final Throwable l$2;
                    while (l$1.hasNext()) {
                        final pj2.p p2 = l$1.next();
                        final SubredditListingProgressIndicator error = SubredditListingProgressIndicator.ERROR;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0 = l$2;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1 = l$1;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2 = null;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.label = 3;
                        if (((pj2.o)p2).emit((Object)error, (tg2.c)redditSubredditRepository$fetchAllUserSubredditListItems$1) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    throw l$2;
                    try {
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0 = y;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1 = null;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2 = null;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.label = 2;
                        final Object v0 = l$3.v0((tg2.c)redditSubredditRepository$fetchAllUserSubredditListItems$1);
                        if (v0 == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        return v0;
                    }
                    finally {
                        iterable = (Iterable)y;
                        final Throwable t2;
                        t = t2;
                    }
                }
            }
            final Iterator iterator3 = iterable.iterator();
            final Throwable l$2 = t;
            final Iterator l$1 = iterator3;
            continue;
        }
    }
    
    public final c0<List<Subreddit>> s0(final SubredditGroup subredditGroup, final String s) {
        final Object value = this.G.getValue();
        ah2.f.e(value, "<get-subredditGroupStore>(...)");
        final c0 b = ((Store)value).b((Object)new c(subredditGroup, s));
        ah2.f.e((Object)b, "subredditGroupStore.fetc\u2026ey(group, correlationId))");
        return (c0<List<Subreddit>>)b;
    }
    
    public final c0 t(final String s, final LinkedHashMap linkedHashMap) {
        final a a = new a(s, linkedHashMap);
        final Object value = this.E.getValue();
        ah2.f.e(value, "<get-subredditListingStore>(...)");
        final c0 b = ((Store)value).b((Object)a);
        ah2.f.e((Object)b, "if (refresh) {\n      sub\u2026ore.get(requestKey)\n    }");
        return u1.j1(b, (r20.d)this.b);
    }
    
    public final Store<Set<String>, String> t0() {
        final Object value = this.D.getValue();
        ah2.f.e(value, "<get-crosspostableSubredditsStore>(...)");
        return (Store<Set<String>, String>)value;
    }
    
    public final Object u(String s, final tg2.c<? super SubredditTaggingQuestions> c) {
        RedditSubredditRepository$getSubredditQuestions.RedditSubredditRepository$getSubredditQuestions$1 redditSubredditRepository$getSubredditQuestions$1 = null;
        Label_0050: {
            if (c instanceof RedditSubredditRepository$getSubredditQuestions.RedditSubredditRepository$getSubredditQuestions$1) {
                redditSubredditRepository$getSubredditQuestions$1 = (RedditSubredditRepository$getSubredditQuestions.RedditSubredditRepository$getSubredditQuestions$1)c;
                final int label = redditSubredditRepository$getSubredditQuestions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$getSubredditQuestions$1.label = label + Integer.MIN_VALUE;
                    break Label_0050;
                }
            }
            redditSubredditRepository$getSubredditQuestions$1 = new RedditSubredditRepository$getSubredditQuestions.RedditSubredditRepository$getSubredditQuestions$1(this, (tg2.c)c);
        }
        Object o = redditSubredditRepository$getSubredditQuestions$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$getSubredditQuestions$1.label;
        SubredditTaggingQuestions l$0 = null;
        String s2 = null;
        RedditSubredditRepository redditSubredditRepository2 = null;
        Label_0283: {
            RedditSubredditRepository l$2;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        l$0 = (SubredditTaggingQuestions)redditSubredditRepository$getSubredditQuestions$1.L$2;
                        s2 = (String)redditSubredditRepository$getSubredditQuestions$1.L$1;
                        final RedditSubredditRepository redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$getSubredditQuestions$1.L$0;
                        aj2.c.Q0(o);
                        redditSubredditRepository2 = redditSubredditRepository;
                        break Label_0283;
                    }
                    if (label2 == 3) {
                        final SubredditTaggingQuestions subredditTaggingQuestions = (SubredditTaggingQuestions)redditSubredditRepository$getSubredditQuestions$1.L$0;
                        aj2.c.Q0(o);
                        return subredditTaggingQuestions;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    s = (String)redditSubredditRepository$getSubredditQuestions$1.L$1;
                    l$2 = (RedditSubredditRepository)redditSubredditRepository$getSubredditQuestions$1.L$0;
                    aj2.c.Q0(o);
                }
            }
            else {
                aj2.c.Q0(o);
                final RemoteGqlSubredditQuestionsDataSource h = this.h;
                redditSubredditRepository$getSubredditQuestions$1.L$0 = this;
                redditSubredditRepository$getSubredditQuestions$1.L$1 = s;
                redditSubredditRepository$getSubredditQuestions$1.label = 1;
                o = h.e(s, (tg2.c<? super SubredditTaggingQuestions>)redditSubredditRepository$getSubredditQuestions$1);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                l$2 = this;
            }
            final SubredditTaggingQuestions l$3 = (SubredditTaggingQuestions)o;
            final gc0.a i = l$2.i;
            redditSubredditRepository$getSubredditQuestions$1.L$0 = l$2;
            redditSubredditRepository$getSubredditQuestions$1.L$1 = s;
            redditSubredditRepository$getSubredditQuestions$1.L$2 = l$3;
            redditSubredditRepository$getSubredditQuestions$1.label = 2;
            if (i.k(s, (tg2.c)redditSubredditRepository$getSubredditQuestions$1) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditSubredditRepository2 = l$2;
            s2 = s;
            l$0 = l$3;
        }
        final List<CrowdsourceTaggingQuestion> crowdsourceTaggingQuestion = l$0.getCrowdsourceTaggingQuestion();
        SubredditTaggingQuestions subredditTaggingQuestions = l$0;
        if (crowdsourceTaggingQuestion != null) {
            final gc0.a j = redditSubredditRepository2.i;
            redditSubredditRepository$getSubredditQuestions$1.L$0 = l$0;
            redditSubredditRepository$getSubredditQuestions$1.L$1 = null;
            redditSubredditRepository$getSubredditQuestions$1.L$2 = null;
            redditSubredditRepository$getSubredditQuestions$1.label = 3;
            subredditTaggingQuestions = l$0;
            if (j.j(s2, (List)crowdsourceTaggingQuestion, (tg2.c)redditSubredditRepository$getSubredditQuestions$1) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return subredditTaggingQuestions;
    }
    
    public final c0<List<Subreddit>> u0(final SubredditGroup subredditGroup, final String s) {
        final Object value = this.G.getValue();
        ah2.f.e(value, "<get-subredditGroupStore>(...)");
        final c0 value2 = ((Store)value).get((Object)new c(subredditGroup, s));
        ah2.f.e((Object)value2, "subredditGroupStore.get(\u2026ey(group, correlationId))");
        return (c0<List<Subreddit>>)value2;
    }
    
    public final c0 v(final String s, final boolean b) {
        c0 c0;
        if (b) {
            c0 = this.s0(SubredditGroup.SUBSCRIBED, s);
        }
        else {
            c0 c2;
            if (this.a.O7()) {
                c2 = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)this.u0(SubredditGroup.SUBSCRIBED, s), (o)new w(0, this, s)));
                ah2.f.e((Object)c2, "{\n      getFromSubreddit\u2026)\n        }\n      }\n    }");
            }
            else {
                c2 = this.u0(SubredditGroup.SUBSCRIBED, s);
            }
            c0 = u1.j1(c2, (r20.d)this.b).w((o)new g60.u(8));
            ah2.f.e((Object)c0, "if (membersFeatures.useR\u2026->\n      subreddits\n    }");
        }
        return c0;
    }
    
    public final Serializable v0(final tg2.c c) {
        Object o = null;
        Label_0049: {
            if (c instanceof RedditSubredditRepository$performFetchUserSubredditListItems$1) {
                final RedditSubredditRepository$performFetchUserSubredditListItems$1 redditSubredditRepository$performFetchUserSubredditListItems$1 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)c;
                final int label = redditSubredditRepository$performFetchUserSubredditListItems$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$performFetchUserSubredditListItems$1.label = label + Integer.MIN_VALUE;
                    o = redditSubredditRepository$performFetchUserSubredditListItems$1;
                    break Label_0049;
                }
            }
            o = new RedditSubredditRepository$performFetchUserSubredditListItems$1(this, (tg2.c<? super RedditSubredditRepository$performFetchUserSubredditListItems$1>)c);
        }
        Object result = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).result;
        Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        while (true) {
            RedditSubredditRepository l$16 = null;
            Object o27 = null;
            Object o29 = null;
            Object l$38 = null;
            Object o33 = null;
            Object o34 = null;
            Object o35 = null;
            Label_2461: {
                PaginatedListing paginatedListing = null;
                Object o2 = null;
                Object o3 = null;
                Object o4 = null;
                Object o5 = null;
                Object o6 = null;
                Object o7 = null;
                Object o8 = null;
                RedditSubredditRepository redditSubredditRepository2 = null;
                Label_2371: {
                    PaginatedListing l$8 = null;
                    Object l$9 = null;
                    Object l$10 = null;
                    Object l$11 = null;
                    Object l$12 = null;
                    Object l$13 = null;
                    Object l$14 = null;
                    Object l$15 = null;
                    RedditSubredditRepository$performFetchUserSubredditListItems$1 redditSubredditRepository$performFetchUserSubredditListItems$2 = null;
                    Object o9 = null;
                    Label_2183: {
                        Object l$19 = null;
                        Object o18 = null;
                        Object o21 = null;
                        UserSubredditPaginatedListing l$41 = null;
                        Object o32 = null;
                        Object o36 = null;
                        Label_2016: {
                            PaginatedListing paginatedListing2 = null;
                            UserSubredditPaginatedListing userSubredditPaginatedListing = null;
                            Object o10 = null;
                            Object o11 = null;
                            Object o12 = null;
                            Object o13 = null;
                            Object o14 = null;
                            Object o15 = null;
                            RedditSubredditRepository redditSubredditRepository3 = null;
                            Object o16 = null;
                            Label_1938: {
                                PaginatedListing followed = null;
                                UserSubredditPaginatedListing l$17 = null;
                                Object l$18 = null;
                                Object l$20 = null;
                                Object l$21 = null;
                                Object l$22 = null;
                                Object l$23 = null;
                                Object l$24 = null;
                                RedditSubredditRepository l$25 = null;
                                RedditSubredditRepository$performFetchUserSubredditListItems$1 redditSubredditRepository$performFetchUserSubredditListItems$3 = null;
                                Object o17 = null;
                                Label_1736: {
                                    Label_1576: {
                                        PaginatedListing paginatedListing3 = null;
                                        UserSubredditPaginatedListing userSubredditPaginatedListing2 = null;
                                        Object o19 = null;
                                        Object o20 = null;
                                        Object o22 = null;
                                        Object o23 = null;
                                        Object o24 = null;
                                        RedditSubredditRepository redditSubredditRepository4 = null;
                                        Label_1509: {
                                            PaginatedListing l$26 = null;
                                            UserSubredditPaginatedListing l$27 = null;
                                            Object l$28 = null;
                                            Object l$29 = null;
                                            Object l$30 = null;
                                            Object l$31 = null;
                                            Object l$32 = null;
                                            Object l$33 = null;
                                            Object l$34 = null;
                                            RedditSubredditRepository l$35 = null;
                                            RedditSubredditRepository$performFetchUserSubredditListItems$1 redditSubredditRepository$performFetchUserSubredditListItems$4 = null;
                                            Object o25 = null;
                                            Label_1307: {
                                                Object o26 = null;
                                                Object o28 = null;
                                                Object o30 = null;
                                                Object o31 = null;
                                                Object l$36 = null;
                                                RedditSubredditRepository l$37 = null;
                                                Label_1075: {
                                                    final RedditSubredditRepository l$39;
                                                    switch (((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).label) {
                                                        default: {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        case 7: {
                                                            paginatedListing = (PaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8;
                                                            o2 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            o3 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            o4 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            o5 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            o6 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            o7 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            o8 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            final RedditSubredditRepository redditSubredditRepository = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            aj2.c.Q0(result);
                                                            redditSubredditRepository2 = redditSubredditRepository;
                                                            break Label_2371;
                                                        }
                                                        case 6: {
                                                            l$8 = (PaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8;
                                                            l$9 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            l$10 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            l$11 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            l$12 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            l$13 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            l$14 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            l$15 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            l$16 = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            aj2.c.Q0(result);
                                                            redditSubredditRepository$performFetchUserSubredditListItems$2 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o;
                                                            o9 = coroutine_SUSPENDED;
                                                            break Label_2183;
                                                        }
                                                        case 5: {
                                                            paginatedListing2 = (PaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9;
                                                            userSubredditPaginatedListing = (UserSubredditPaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8;
                                                            o10 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            o11 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            o12 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            o13 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            o14 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            final Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            o15 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            redditSubredditRepository3 = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            aj2.c.Q0(result);
                                                            o16 = ref$BooleanRef;
                                                            break Label_1938;
                                                        }
                                                        case 4: {
                                                            followed = (PaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9;
                                                            l$17 = (UserSubredditPaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8;
                                                            l$18 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            l$19 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            l$20 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            l$21 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            l$22 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            l$23 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            l$24 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            l$25 = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            aj2.c.Q0(result);
                                                            redditSubredditRepository$performFetchUserSubredditListItems$3 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o;
                                                            o17 = coroutine_SUSPENDED;
                                                            break Label_1736;
                                                        }
                                                        case 3: {
                                                            paginatedListing3 = (PaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9;
                                                            userSubredditPaginatedListing2 = (UserSubredditPaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8;
                                                            o18 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            o19 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            o20 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            o21 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            o22 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            o23 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            o24 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            redditSubredditRepository4 = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            aj2.c.Q0(result);
                                                            break Label_1509;
                                                        }
                                                        case 2: {
                                                            l$26 = (PaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9;
                                                            l$27 = (UserSubredditPaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8;
                                                            l$28 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            l$29 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            l$30 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            l$31 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            l$32 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            l$33 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            l$34 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            l$35 = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            aj2.c.Q0(result);
                                                            redditSubredditRepository$performFetchUserSubredditListItems$4 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o;
                                                            o25 = coroutine_SUSPENDED;
                                                            break Label_1307;
                                                        }
                                                        case 1: {
                                                            o26 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            o27 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            o28 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            o29 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            o30 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            o31 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            l$36 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            l$37 = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            aj2.c.Q0(result);
                                                            break Label_1075;
                                                        }
                                                        case 0: {
                                                            aj2.c.Q0(result);
                                                            l$38 = new ArrayList();
                                                            o31 = new Ref$BooleanRef();
                                                            ((Ref$BooleanRef)o31).element = true;
                                                            o30 = new Ref$ObjectRef();
                                                            o29 = new Ref$BooleanRef();
                                                            ((Ref$BooleanRef)o29).element = true;
                                                            o28 = new Ref$ObjectRef();
                                                            o27 = new Ref$BooleanRef();
                                                            ((Ref$BooleanRef)o27).element = true;
                                                            o26 = new Ref$ObjectRef();
                                                            l$39 = this;
                                                            break;
                                                        }
                                                    }
                                                    final RemoteGqlSubredditDataSource e = l$39.e;
                                                    final boolean element = ((Ref$BooleanRef)o31).element;
                                                    final String s = (String)((Ref$ObjectRef)o30).element;
                                                    final boolean element2 = ((Ref$BooleanRef)o29).element;
                                                    final String s2 = (String)((Ref$ObjectRef)o28).element;
                                                    final boolean element3 = ((Ref$BooleanRef)o27).element;
                                                    final String s3 = (String)((Ref$ObjectRef)o26).element;
                                                    final BigFishSubredditOptimizationVariant$a companion = BigFishSubredditOptimizationVariant.Companion;
                                                    final BigFishSubredditOptimizationVariant z8 = l$39.o.z8();
                                                    companion.getClass();
                                                    final int a = BigFishSubredditOptimizationVariant$a.a(z8);
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0 = l$39;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1 = l$38;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2 = o31;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3 = o30;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4 = o29;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5 = o28;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6 = o27;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7 = o26;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8 = null;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9 = null;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).label = 1;
                                                    final Object n = e.n(element, s, element2, s2, element3, s3, a, (tg2.c<? super UserSubredditPaginatedListing>)o);
                                                    if (n == coroutine_SUSPENDED) {
                                                        return (Serializable)coroutine_SUSPENDED;
                                                    }
                                                    l$37 = l$39;
                                                    result = n;
                                                    l$36 = l$38;
                                                }
                                                final UserSubredditPaginatedListing l$40 = (UserSubredditPaginatedListing)result;
                                                final PaginatedListing subscribed = l$40.getSubscribed();
                                                l$41 = l$40;
                                                o32 = o;
                                                o9 = coroutine_SUSPENDED;
                                                o18 = o26;
                                                l$19 = o27;
                                                o33 = o28;
                                                o21 = o29;
                                                o34 = o30;
                                                o35 = o31;
                                                o36 = l$36;
                                                l$16 = l$37;
                                                if (subscribed == null) {
                                                    break Label_1576;
                                                }
                                                final gc0.b j = l$37.j;
                                                final List<SubredditListItem> items = subscribed.getItems();
                                                final boolean b = ((Ref$ObjectRef)o30).element == null && ((Ref$ObjectRef)o28).element == null;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0 = l$37;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1 = l$36;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2 = o31;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3 = o30;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4 = o29;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5 = o28;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6 = o27;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7 = o26;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8 = l$40;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9 = subscribed;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).label = 2;
                                                if (j.j((List)items, b) == coroutine_SUSPENDED) {
                                                    return (Serializable)coroutine_SUSPENDED;
                                                }
                                                l$34 = l$36;
                                                l$35 = l$37;
                                                l$32 = o30;
                                                final Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef)o28;
                                                l$31 = o29;
                                                l$28 = o26;
                                                l$26 = subscribed;
                                                l$29 = o27;
                                                l$27 = l$40;
                                                l$33 = o31;
                                                l$30 = ref$ObjectRef;
                                                o25 = coroutine_SUSPENDED;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o;
                                            }
                                            o = redditSubredditRepository$performFetchUserSubredditListItems$4;
                                            coroutine_SUSPENDED = o25;
                                            paginatedListing3 = l$26;
                                            userSubredditPaginatedListing2 = l$27;
                                            o18 = l$28;
                                            o19 = l$29;
                                            o20 = l$30;
                                            o21 = l$31;
                                            o22 = l$32;
                                            o23 = l$33;
                                            o24 = l$34;
                                            redditSubredditRepository4 = l$35;
                                            if (!l$26.getHasNextPage()) {
                                                final StateFlowImpl w = l$35.w;
                                                final SubredditListingProgressIndicator complete = SubredditListingProgressIndicator.COMPLETE;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$0 = l$35;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$1 = l$34;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$2 = l$33;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$3 = l$32;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$4 = l$31;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$5 = l$30;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$6 = l$29;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$7 = l$28;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$8 = l$27;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$9 = l$26;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.label = 3;
                                                w.setValue((Object)complete);
                                                o = redditSubredditRepository$performFetchUserSubredditListItems$4;
                                                coroutine_SUSPENDED = o25;
                                                paginatedListing3 = l$26;
                                                userSubredditPaginatedListing2 = l$27;
                                                o18 = l$28;
                                                o19 = l$29;
                                                o20 = l$30;
                                                o21 = l$31;
                                                o22 = l$32;
                                                o23 = l$33;
                                                o24 = l$34;
                                                redditSubredditRepository4 = l$35;
                                                if (pg2.j.a == o25) {
                                                    return (Serializable)o25;
                                                }
                                            }
                                        }
                                        ((Ref$BooleanRef)o23).element = paginatedListing3.getHasNextPage();
                                        ((Ref$ObjectRef)o22).element = paginatedListing3.getEndCursor();
                                        ((List)o24).addAll(paginatedListing3.getItems());
                                        l$41 = userSubredditPaginatedListing2;
                                        l$19 = o19;
                                        o33 = o20;
                                        o34 = o22;
                                        o35 = o23;
                                        o36 = o24;
                                        l$16 = redditSubredditRepository4;
                                        o9 = coroutine_SUSPENDED;
                                        o32 = o;
                                    }
                                    followed = l$41.getFollowed();
                                    if (followed == null) {
                                        break Label_2016;
                                    }
                                    final gc0.b i = l$16.j;
                                    final List<SubredditListItem> items2 = followed.getItems();
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$0 = l$16;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$1 = o36;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$2 = o35;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$3 = o34;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$4 = o21;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$5 = o33;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$6 = l$19;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$7 = o18;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$8 = l$41;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$9 = followed;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).label = 4;
                                    if (i.j((List)items2, false) == o9) {
                                        return (Serializable)o9;
                                    }
                                    l$21 = o21;
                                    final Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef)o18;
                                    l$23 = o35;
                                    final RedditSubredditRepository redditSubredditRepository5 = l$16;
                                    l$24 = o36;
                                    l$22 = o34;
                                    l$20 = o33;
                                    l$18 = ref$ObjectRef2;
                                    l$17 = l$41;
                                    l$25 = redditSubredditRepository5;
                                    o17 = o9;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o32;
                                }
                                o16 = l$23;
                                o = redditSubredditRepository$performFetchUserSubredditListItems$3;
                                coroutine_SUSPENDED = o17;
                                paginatedListing2 = followed;
                                redditSubredditRepository3 = l$25;
                                userSubredditPaginatedListing = l$17;
                                o10 = l$18;
                                o11 = l$19;
                                o12 = l$20;
                                o13 = l$21;
                                o14 = l$22;
                                o15 = l$24;
                                if (!followed.getHasNextPage()) {
                                    final StateFlowImpl z9 = l$25.z;
                                    final SubredditListingProgressIndicator complete2 = SubredditListingProgressIndicator.COMPLETE;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$0 = l$25;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$1 = l$24;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$2 = l$23;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$3 = l$22;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$4 = l$21;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$5 = l$20;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$6 = l$19;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$7 = l$18;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$8 = l$17;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$9 = followed;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.label = 5;
                                    z9.setValue((Object)complete2);
                                    o16 = l$23;
                                    o = redditSubredditRepository$performFetchUserSubredditListItems$3;
                                    coroutine_SUSPENDED = o17;
                                    paginatedListing2 = followed;
                                    redditSubredditRepository3 = l$25;
                                    userSubredditPaginatedListing = l$17;
                                    o10 = l$18;
                                    o11 = l$19;
                                    o12 = l$20;
                                    o13 = l$21;
                                    o14 = l$22;
                                    o15 = l$24;
                                    if (pg2.j.a == o17) {
                                        return (Serializable)o17;
                                    }
                                }
                            }
                            ((Ref$BooleanRef)o13).element = paginatedListing2.getHasNextPage();
                            ((Ref$ObjectRef)o12).element = paginatedListing2.getEndCursor();
                            ((List)o15).addAll(paginatedListing2.getItems());
                            o18 = o10;
                            o35 = o16;
                            l$41 = userSubredditPaginatedListing;
                            o33 = o12;
                            l$16 = redditSubredditRepository3;
                            l$19 = o11;
                            o34 = o14;
                            o32 = o;
                            o9 = coroutine_SUSPENDED;
                            o21 = o13;
                            o36 = o15;
                        }
                        final PaginatedListing moderated = l$41.getModerated();
                        if (moderated == null) {
                            o29 = o21;
                            o27 = l$19;
                            final Object o26 = o18;
                            coroutine_SUSPENDED = o9;
                            o = o32;
                            l$38 = o36;
                            break Label_2461;
                        }
                        final gc0.b k = l$16.j;
                        final List<SubredditListItem> items3 = moderated.getItems();
                        final boolean b2 = ((Ref$ObjectRef)o18).element == null;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$0 = l$16;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$1 = o36;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$2 = o35;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$3 = o34;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$4 = o21;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$5 = o33;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$6 = l$19;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$7 = o18;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$8 = moderated;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$9 = null;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).label = 6;
                        if (k.p((List)items3, b2) == o9) {
                            return (Serializable)o9;
                        }
                        l$11 = o33;
                        l$9 = o18;
                        l$14 = o35;
                        l$12 = o21;
                        l$10 = l$19;
                        l$15 = o36;
                        l$13 = o34;
                        l$8 = moderated;
                        redditSubredditRepository$performFetchUserSubredditListItems$2 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o32;
                    }
                    redditSubredditRepository2 = l$16;
                    o = redditSubredditRepository$performFetchUserSubredditListItems$2;
                    coroutine_SUSPENDED = o9;
                    paginatedListing = l$8;
                    o2 = l$9;
                    o3 = l$10;
                    o4 = l$11;
                    o5 = l$12;
                    o6 = l$13;
                    o7 = l$14;
                    o8 = l$15;
                    if (!l$8.getHasNextPage()) {
                        final StateFlowImpl y = l$16.y;
                        final SubredditListingProgressIndicator complete3 = SubredditListingProgressIndicator.COMPLETE;
                        redditSubredditRepository$performFetchUserSubredditListItems$2.L$0 = l$16;
                        redditSubredditRepository$performFetchUserSubredditListItems$2.L$1 = l$15;
                        redditSubredditRepository$performFetchUserSubredditListItems$2.L$2 = l$14;
                        redditSubredditRepository$performFetchUserSubredditListItems$2.L$3 = l$13;
                        redditSubredditRepository$performFetchUserSubredditListItems$2.L$4 = l$12;
                        redditSubredditRepository$performFetchUserSubredditListItems$2.L$5 = l$11;
                        redditSubredditRepository$performFetchUserSubredditListItems$2.L$6 = l$10;
                        redditSubredditRepository$performFetchUserSubredditListItems$2.L$7 = l$9;
                        redditSubredditRepository$performFetchUserSubredditListItems$2.L$8 = l$8;
                        redditSubredditRepository$performFetchUserSubredditListItems$2.label = 7;
                        y.setValue((Object)complete3);
                        redditSubredditRepository2 = l$16;
                        o = redditSubredditRepository$performFetchUserSubredditListItems$2;
                        coroutine_SUSPENDED = o9;
                        paginatedListing = l$8;
                        o2 = l$9;
                        o3 = l$10;
                        o4 = l$11;
                        o5 = l$12;
                        o6 = l$13;
                        o7 = l$14;
                        o8 = l$15;
                        if (pg2.j.a == o9) {
                            return (Serializable)o9;
                        }
                    }
                }
                ((Ref$BooleanRef)o3).element = paginatedListing.getHasNextPage();
                ((Ref$ObjectRef)o2).element = paginatedListing.getEndCursor();
                ((List)o8).addAll(paginatedListing.getItems());
                Object o26 = o2;
                o27 = o3;
                o33 = o4;
                o29 = o5;
                o34 = o6;
                o35 = o7;
                l$38 = o8;
                l$16 = redditSubredditRepository2;
            }
            if (!((Ref$BooleanRef)o35).element && !((Ref$BooleanRef)o29).element && !((Ref$BooleanRef)o27).element) {
                final HashSet<String> set = new HashSet<String>();
                final ArrayList<SubredditListItem> list = new ArrayList<SubredditListItem>();
                for (final Object next : l$38) {
                    if (set.add(((SubredditListItem)next).getId())) {
                        list.add((SubredditListItem)next);
                    }
                }
                return list;
            }
            RedditSubredditRepository l$39 = l$16;
            Object o28 = o33;
            Object o30 = o34;
            Object o31 = o35;
            continue;
        }
    }
    
    public final c0<RelatedSubredditsResponse> w(final String s) {
        ah2.f.f((Object)s, "subredditId");
        final RemoteGqlSubredditDataSource e = this.e;
        e.getClass();
        final c0 w = e$a.a((ur0.e)e.a, (k)new aa(z10.w.e(s, ThingType.SUBREDDIT)), (OkHttpClient)null, (Map)null, 14).w((o)new qw.c((Object)e, 12));
        ah2.f.e((Object)w, "graphQlClient\n      .exe\u2026sformer.apply(it)\n      }");
        return (c0<RelatedSubredditsResponse>)u1.j1(w, (r20.d)this.b);
    }
    
    public final Object x(final String s, final String s2, final String s3, final tg2.c<? super UpdateResponse> c) {
        return this.e.o(s, s2, s3, c);
    }
    
    public final Object x0(final SubredditGroup subredditGroup, final String s, final tg2.c<? super j> c) {
        Object o = null;
        Label_0056: {
            if (c instanceof RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1) {
                final RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1 redditSubredditRepository$startSubredditListingFetch$1 = (RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1)c;
                final int label = redditSubredditRepository$startSubredditListingFetch$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$startSubredditListingFetch$1.label = label + Integer.MIN_VALUE;
                    o = redditSubredditRepository$startSubredditListingFetch$1;
                    break Label_0056;
                }
            }
            o = new RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1(this, (tg2.c)c);
        }
        final Object result = ((RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1)o).label;
        Object o2;
        RedditSubredditRepository l$0;
        if (label2 != 0) {
            if (label2 != 1 && label2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o2 = ((RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1)o).L$1;
            l$0 = (RedditSubredditRepository)((RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1)o).L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            o2 = new d(subredditGroup, s);
            ((RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1)o).L$0 = this;
            ((RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1)o).L$1 = o2;
            ((RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1)o).label = 1;
            if (this.y0((d)o2, (tg2.c<? super CommunityDrawerListing>)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            l$0 = this;
        }
        while (((d)o2).c != null || ((d)o2).d != null) {
            ((RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1)o).L$0 = l$0;
            ((RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1)o).L$1 = o2;
            ((RedditSubredditRepository$startSubredditListingFetch.RedditSubredditRepository$startSubredditListingFetch$1)o).label = 2;
            if (l$0.y0((d)o2, (tg2.c<? super CommunityDrawerListing>)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return pg2.j.a;
    }
    
    public final Object y(final String s, final String s2, final boolean b, final tg2.c<? super UpdateResponse> c) {
        return this.h.d(s, s2, b, c);
    }
    
    public final Object y0(final d d, final tg2.c<? super CommunityDrawerListing> c) {
        RedditSubredditRepository$startSubscribedSubredditListingFetch.RedditSubredditRepository$startSubscribedSubredditListingFetch$2 redditSubredditRepository$startSubscribedSubredditListingFetch$3 = null;
        Label_0052: {
            if (c instanceof RedditSubredditRepository$startSubscribedSubredditListingFetch.RedditSubredditRepository$startSubscribedSubredditListingFetch$2) {
                final RedditSubredditRepository$startSubscribedSubredditListingFetch.RedditSubredditRepository$startSubscribedSubredditListingFetch$2 redditSubredditRepository$startSubscribedSubredditListingFetch$2 = (RedditSubredditRepository$startSubscribedSubredditListingFetch.RedditSubredditRepository$startSubscribedSubredditListingFetch$2)c;
                final int label = redditSubredditRepository$startSubscribedSubredditListingFetch$2.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$startSubscribedSubredditListingFetch$2.label = label + Integer.MIN_VALUE;
                    redditSubredditRepository$startSubscribedSubredditListingFetch$3 = redditSubredditRepository$startSubscribedSubredditListingFetch$2;
                    break Label_0052;
                }
            }
            redditSubredditRepository$startSubscribedSubredditListingFetch$3 = new RedditSubredditRepository$startSubscribedSubredditListingFetch.RedditSubredditRepository$startSubscribedSubredditListingFetch$2(this, (tg2.c)c);
        }
        final Object result = redditSubredditRepository$startSubscribedSubredditListingFetch$3.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$startSubscribedSubredditListingFetch$3.label;
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
            final uj2.a c2 = this.q.c();
            final RedditSubredditRepository$startSubscribedSubredditListingFetch$3 redditSubredditRepository$startSubscribedSubredditListingFetch$4 = new RedditSubredditRepository$startSubscribedSubredditListingFetch$3(this, d, (tg2.c)null);
            redditSubredditRepository$startSubscribedSubredditListingFetch$3.label = 1;
            if ((l = mj2.g.l((CoroutineContext)c2, (zg2.p)redditSubredditRepository$startSubscribedSubredditListingFetch$4, (tg2.c)redditSubredditRepository$startSubscribedSubredditListingFetch$3)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(l, "private suspend fun star\u2026ch(key).await()\n    }\n  }");
        return l;
    }
    
    public final Object z(final String s, final String s2, final tg2.c<? super UpdateResponse> c) {
        return this.h.c(s, s2, c);
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f" }, d2 = { "Lcom/reddit/data/repository/RedditSubredditRepository$SubredditGroup;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "DEFAULTS", "FAVORITES", "FAVORITES_AND_USERS", "FOLLOWING", "SUBSCRIBED", "MODERATING", "data_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum SubredditGroup
    {
        DEFAULTS("defaults"), 
        FAVORITES("favorites"), 
        FAVORITES_AND_USERS("favorites_and_users"), 
        FOLLOWING("following"), 
        MODERATING("moderating"), 
        SUBSCRIBED("subscriptions");
        
        private final String type;
        
        private SubredditGroup(final String type) {
            this.type = type;
        }
        
        @Override
        public String toString() {
            return this.type;
        }
    }
    
    public static final class a
    {
        public final String a;
        public final Map<String, String> b;
        
        public a(final String a, final LinkedHashMap b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class b implements tt.d<Subreddit, String>
    {
        public final l<Subreddit, c0<Boolean>> a;
        public final l<String, n<Subreddit>> b;
        
        public b(final l<? super Subreddit, ? extends c0<Boolean>> a, final l<? super String, ? extends n<Subreddit>> b) {
            this.a = (l<Subreddit, c0<Boolean>>)a;
            this.b = (l<String, n<Subreddit>>)b;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final String s = (String)o;
            final Subreddit subreddit = (Subreddit)o2;
            ah2.f.f((Object)s, "key");
            ah2.f.f((Object)subreddit, "subreddit");
            return (c0)this.a.invoke((Object)subreddit);
        }
        
        public final n c(final Object o) {
            final String s = (String)o;
            ah2.f.f((Object)s, "key");
            return (n)this.b.invoke((Object)s);
        }
    }
    
    public static final class c
    {
        public final SubredditGroup a;
        public final String b;
        
        public c(final SubredditGroup a, final String b) {
            ah2.f.f((Object)a, "group");
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class d
    {
        public final SubredditGroup a;
        public final String b;
        public String c;
        public String d;
        
        public d(final SubredditGroup a, final String b) {
            ah2.f.f((Object)a, "group");
            this.a = a;
            this.b = b;
            this.c = null;
            this.d = null;
        }
    }
    
    public static final class e implements tt.d<List<? extends Subreddit>, a>
    {
        public final zg2.p<List<Subreddit>, String, c0<Boolean>> a;
        public final l<String, n<List<Subreddit>>> b;
        
        public e(final l b, final zg2.p a) {
            this.a = (zg2.p<List<Subreddit>, String, c0<Boolean>>)a;
            this.b = (l<String, n<List<Subreddit>>>)b;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final a a = (a)o;
            final List list = (List)o2;
            ah2.f.f((Object)a, "key");
            ah2.f.f((Object)list, "subreddits");
            return (c0)this.a.invoke((Object)list, (Object)a.toString());
        }
        
        public final n c(final Object o) {
            final a a = (a)o;
            ah2.f.f((Object)a, "key");
            return (n)this.b.invoke((Object)a.toString());
        }
    }
    
    public static final class f implements tt.d<CommunityDrawerListing, d>
    {
        public final zg2.p<SubredditGroup, CommunityDrawerListing, c0<Boolean>> a;
        public final l<SubredditGroup, n<CommunityDrawerListing>> b;
        
        public f(final l b, final zg2.p a) {
            this.a = (zg2.p<SubredditGroup, CommunityDrawerListing, c0<Boolean>>)a;
            this.b = (l<SubredditGroup, n<CommunityDrawerListing>>)b;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final d d = (d)o;
            final CommunityDrawerListing communityDrawerListing = (CommunityDrawerListing)o2;
            ah2.f.f((Object)d, "key");
            ah2.f.f((Object)communityDrawerListing, "subscriptions");
            return (c0)this.a.invoke((Object)d.a, (Object)communityDrawerListing);
        }
        
        public final n c(final Object o) {
            final d d = (d)o;
            ah2.f.f((Object)d, "key");
            return (n)this.b.invoke((Object)d.a);
        }
    }
    
    public static final class g implements tt.d<List<? extends Subreddit>, c>
    {
        public final zg2.p<SubredditGroup, List<Subreddit>, c0<Boolean>> a;
        public final l<SubredditGroup, n<List<Subreddit>>> b;
        
        public g(final l b, final zg2.p a) {
            this.a = (zg2.p<SubredditGroup, List<Subreddit>, c0<Boolean>>)a;
            this.b = (l<SubredditGroup, n<List<Subreddit>>>)b;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final c c = (c)o;
            final List list = (List)o2;
            ah2.f.f((Object)c, "key");
            ah2.f.f((Object)list, "subscriptions");
            return (c0)this.a.invoke((Object)c.a, (Object)list);
        }
        
        public final n c(final Object o) {
            final c c = (c)o;
            ah2.f.f((Object)c, "key");
            return (n)this.b.invoke((Object)c.a);
        }
    }
}
