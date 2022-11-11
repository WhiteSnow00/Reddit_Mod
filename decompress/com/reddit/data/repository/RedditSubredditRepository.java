// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.data.common.CommunityErrorType;
import kotlin.Metadata;
import com.reddit.queries.da;
import com.reddit.domain.model.RelatedSubredditsResponse;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import com.reddit.domain.model.CommunityDrawerListing;
import com.reddit.domain.model.SubredditListItem;
import java.util.HashSet;
import com.reddit.common.experiments.model.mainactivity.BigFishSubredditOptimizationVariant$a;
import com.reddit.common.experiments.model.mainactivity.BigFishSubredditOptimizationVariant;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.reddit.domain.model.UserSubredditPaginatedListing;
import com.reddit.domain.model.PaginatedListing;
import java.util.LinkedHashMap;
import com.reddit.domain.model.Mappings;
import com.reddit.domain.model.Regions;
import com.reddit.domain.model.SubredditCounterpartMapping;
import com.reddit.structuredstyles.model.StructuredStyle;
import java.util.Collection;
import com.reddit.domain.model.tagging.SubredditTaggingQuestions;
import hg2.j;
import g22.a0;
import com.reddit.mutations.s1;
import com.reddit.domain.model.communitycreation.CreateSubredditResult;
import com.reddit.domain.model.communitycreation.CreateSubreddit;
import com.reddit.domain.model.SubredditTriggeredInvite;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import z50.w1;
import z50.v1;
import g22.b5;
import com.reddit.mutations.e9;
import com.reddit.data.model.graphql.GqlCreateUpdateSubredditMapper;
import com.reddit.domain.model.communitysettings.UpdateSubredditSettings;
import java.util.Set;
import v10.v;
import com.reddit.common.ThingType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.reddit.notification.common.NotificationLevel;
import com.reddit.queries.r0;
import com.reddit.domain.model.communitycreation.SubredditTopicsResult;
import z50.n1;
import com.reddit.domain.model.Result;
import kotlinx.coroutines.flow.CancellableFlowImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.UserSubredditListings;
import kotlin.collections.EmptyList;
import com.reddit.domain.model.Ambassador;
import com.reddit.domain.model.Ambassadors;
import z50.s;
import com.reddit.domain.model.communitycreation.SubredditTopic;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import mr0.e$a;
import com.reddit.queries.zd;
import com.reddit.domain.model.communitycreation.SubredditNameValidationResult;
import java.util.Iterator;
import java.io.Serializable;
import com.reddit.domain.model.SubredditAction;
import rg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.SubredditActionSource;
import java.util.ArrayList;
import com.reddit.domain.model.tagging.CrowdsourceTaggingQuestion;
import java.util.List;
import z50.u1;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import z50.t1;
import ff2.c0;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.single.SingleFlatMap;
import z50.m0;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.Subreddit;
import ff2.n;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.domain.model.tagging.SubredditRatingSurveyAnswers;
import ff2.t;
import kf2.o;
import z50.f0;
import java.io.InputStream;
import java.io.Closeable;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.inject.Inject;
import bg.d;
import com.reddit.domain.model.SubredditListingProgressIndicator;
import kotlinx.coroutines.channels.BufferOverflow;
import sg2.e;
import kotlinx.coroutines.flow.StateFlowImpl;
import android.content.Context;
import a22.c;
import va0.q;
import xd0.m;
import com.squareup.moshi.y;
import f22.p;
import xb0.b;
import com.reddit.data.remote.RemoteGqlSubredditQuestionsDataSource;
import com.reddit.data.remote.RemoteGqlSubredditTopicsDataSource;
import xd0.h;
import com.reddit.data.remote.RemoteGqlSubredditDataSource;
import com.reddit.data.remote.RemoteSubredditStatsDataSource;
import com.reddit.data.remote.RemoteSubredditDataSource;
import n20.a;
import va0.r;
import hg2.f;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xd0.g0;

public final class RedditSubredditRepository implements g0
{
    public static final Pair<Long, TimeUnit> G;
    public final hg2.f A;
    public final hg2.f B;
    public final hg2.f C;
    public final hg2.f D;
    public final hg2.f E;
    public final hg2.f F;
    public final r a;
    public final n20.a b;
    public final RemoteSubredditDataSource c;
    public final RemoteSubredditStatsDataSource d;
    public final RemoteGqlSubredditDataSource e;
    public final xd0.h f;
    public final RemoteGqlSubredditTopicsDataSource g;
    public final RemoteGqlSubredditQuestionsDataSource h;
    public final xb0.a i;
    public final xb0.b j;
    public final p k;
    public final y l;
    public final m m;
    public final q n;
    public final com.reddit.session.p o;
    public final a20.a p;
    public final cw0.a q;
    public final a22.c r;
    public final Context s;
    public final va0.b t;
    public final kotlinx.coroutines.flow.f u;
    public final StateFlowImpl v;
    public final kotlinx.coroutines.flow.f w;
    public final StateFlowImpl x;
    public final StateFlowImpl y;
    public final hg2.f z;
    
    static {
        G = new Pair((Object)1L, (Object)TimeUnit.HOURS);
    }
    
    @Inject
    public RedditSubredditRepository(final r a, final n20.a b, final RemoteSubredditDataSource c, final RemoteSubredditStatsDataSource d, final RemoteGqlSubredditDataSource e, final xd0.h f, final RemoteGqlSubredditTopicsDataSource g, final RemoteGqlSubredditQuestionsDataSource h, final xb0.a i, final xb0.b j, final p k, final y l, final m m, final q n, final com.reddit.session.p o, final a20.a p20, final cw0.a q, final a22.c r, final Context s, final va0.b t) {
        sg2.e.f((Object)a, "membersFeatures");
        sg2.e.f((Object)b, "backgroundThread");
        sg2.e.f((Object)c, "remote");
        sg2.e.f((Object)d, "remoteStats");
        sg2.e.f((Object)e, "remoteGql");
        sg2.e.f((Object)f, "inboxNotificationSettingsRepository");
        sg2.e.f((Object)g, "subredditTopicsRemoteGql");
        sg2.e.f((Object)h, "subredditQuestionsDataSource");
        sg2.e.f((Object)i, "localSubredditQuestionsDataSource");
        sg2.e.f((Object)j, "local");
        sg2.e.f((Object)k, "trackingDelegate");
        sg2.e.f((Object)l, "moshi");
        sg2.e.f((Object)m, "myAccountRepository");
        sg2.e.f((Object)n, "mainActivityFeatures");
        sg2.e.f((Object)o, "sessionView");
        sg2.e.f((Object)p20, "dispatcherProvider");
        sg2.e.f((Object)q, "logger");
        sg2.e.f((Object)r, "tracingFeatures");
        sg2.e.f((Object)s, "context");
        sg2.e.f((Object)t, "channelsFeatures");
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
        this.p = p20;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        final BufferOverflow drop_OLDEST = BufferOverflow.DROP_OLDEST;
        this.u = a92.b.l(1, 0, drop_OLDEST, 2);
        final SubredditListingProgressIndicator complete = SubredditListingProgressIndicator.COMPLETE;
        this.v = bg.d.n((Object)complete);
        this.w = a92.b.l(1, 0, drop_OLDEST, 2);
        this.x = bg.d.n((Object)complete);
        this.y = bg.d.n((Object)complete);
        this.z = kotlin.a.b((rg2.a)new RedditSubredditRepository$subredditAboutStore$2(this));
        this.A = kotlin.a.b((rg2.a)new RedditSubredditRepository$quarantinedSubredditAboutStore$2(this));
        this.B = kotlin.a.b((rg2.a)new RedditSubredditRepository$structuredStyleStore$2(this));
        this.C = kotlin.a.b((rg2.a)new RedditSubredditRepository$crosspostableSubredditsStore$2(this));
        this.D = kotlin.a.b((rg2.a)new RedditSubredditRepository$subredditListingStore$2(this));
        this.E = kotlin.a.b((rg2.a)new RedditSubredditRepository$subredditListingGroupStore$2(this));
        this.F = kotlin.a.b((rg2.a)new RedditSubredditRepository$subredditGroupStore$2(this));
    }
    
    public static String s0(Context o, String b) {
        final InputStream open = ((Context)o).getAssets().open((String)b);
        sg2.e.e((Object)open, "context.assets.open(fileName)");
        final InputStreamReader inputStreamReader = new InputStreamReader(open, cj2.a.b);
        if (inputStreamReader instanceof BufferedReader) {
            o = inputStreamReader;
        }
        else {
            o = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            b = kotlin.io.a.b((Reader)o);
            lw0.b.X((Closeable)o, (Throwable)null);
            return (String)b;
        }
        finally {
            try {}
            finally {
                lw0.b.X((Closeable)o, (Throwable)b);
            }
        }
    }
    
    public final kotlinx.coroutines.flow.e A() {
        final kotlinx.coroutines.flow.f w = this.w;
        final t map = this.j.D().map((o)new f0(7));
        sg2.e.e((Object)map, "local.observeModeratingS\u2026tyDrawerListing(it)\n    }");
        return new kotlinx.coroutines.flow.e((hj2.e)w, (hj2.e)kotlinx.coroutines.rx2.e.b(map), (rg2.q)new RedditSubredditRepository$observeModeratingSubredditsListing$2((lg2.c)null));
    }
    
    public final Object B(final String s, final SubredditRatingSurveyAnswers subredditRatingSurveyAnswers, final lg2.c<? super UpdateResponse> c) {
        return this.h.g(s, subredditRatingSurveyAnswers, (lg2.c)c);
    }
    
    public final n<Subreddit> C(final String s, final boolean b, final boolean b2) {
        sg2.e.f((Object)s, "subredditName");
        n n;
        if (b) {
            Store store;
            if (b2) {
                final Store value = this.A.getValue();
                sg2.e.e((Object)value, "<get-quarantinedSubredditAboutStore>(...)");
                store = value;
            }
            else {
                final Store value2 = this.z.getValue();
                sg2.e.e((Object)value2, "<get-subredditAboutStore>(...)");
                store = value2;
            }
            final Store value3 = this.B.getValue();
            sg2.e.e((Object)value3, "<get-structuredStyleStore>(...)");
            final c0 j = value3.j((Object)s);
            sg2.e.e((Object)j, "structuredStyleStore.fetch(subredditName)");
            final c0 i = store.j((Object)s);
            final m0 m0 = new m0(j, 1);
            i.getClass();
            final c0<Object> onAssembly = RxJavaPlugins.onAssembly((c0<Object>)new SingleFlatMap((ff2.g0)i, (o)m0));
            final z50.o o = new z50.o((Object)this, 5);
            onAssembly.getClass();
            final ff2.n<Object> k = RxJavaPlugins.onAssembly((c0<Object>)new SingleFlatMap((ff2.g0)onAssembly, (o)o)).M();
            final t1 t1 = new t1(this, s, b2);
            k.getClass();
            n = RxJavaPlugins.onAssembly((ff2.n<Object>)new MaybeOnErrorNext((ff2.r)k, (o)t1));
        }
        else {
            final n x = this.j.x(s);
            final Store value4 = this.B.getValue();
            sg2.e.e((Object)value4, "<get-structuredStyleStore>(...)");
            n = x.B(value4.get((Object)s).M(), (kf2.c)new u1());
        }
        sg2.e.e((Object)n, "if (refresh) {\n      val\u2026       },\n        )\n    }");
        return (n<Subreddit>)a92.b.a0(n, (n20.d)this.b);
    }
    
    public final Object D(final String s, final lg2.c<? super List<CrowdsourceTaggingQuestion>> c) {
        return this.i.d(s, (lg2.c)c);
    }
    
    public final Object E(final String s, final String s2, final lg2.c<? super UpdateResponse> c) {
        return this.h.c(s, s2, (lg2.c)c);
    }
    
    public final ff2.a F(final String s) {
        sg2.e.f((Object)s, "subredditName");
        return yd.b.i0(this.c.optInGatedSubreddit(s, "yes"), (n20.d)this.b);
    }
    
    public final ff2.a G(final ArrayList list, final SubredditActionSource subredditActionSource) {
        this.p0().clear();
        final ff2.a setSubscriptionState = this.c.setSubscriptionState(CollectionsKt___CollectionsKt.I3((Iterable)list, (CharSequence)",", (String)null, (String)null, (l)null, 62), SubredditAction.UNSUBSCRIBE, subredditActionSource);
        final ff2.a k = this.j.o(list).K();
        sg2.e.e((Object)k, "local.unsubscribeSubredd\u2026dditList).toCompletable()");
        final ff2.a e = setSubscriptionState.e((ff2.e)k);
        sg2.e.e((Object)e, "remoteSubscribeList.andThen(localSubscribe)");
        return yd.b.i0(e, (n20.d)this.b);
    }
    
    public final Object H(final String s, final String s2, final lg2.c<? super UpdateResponse> c) {
        return this.h.b(s, s2, (lg2.c)c);
    }
    
    public final n<Subreddit> I(final String s, final boolean b) {
        sg2.e.f((Object)s, "subredditName");
        n n;
        if (b) {
            final Store value = this.z.getValue();
            sg2.e.e((Object)value, "<get-subredditAboutStore>(...)");
            final n m = value.j((Object)s).M();
            final u u = new u(this, s, 1);
            m.getClass();
            n = RxJavaPlugins.onAssembly((ff2.n<Object>)new MaybeOnErrorNext((ff2.r)m, (o)u));
            sg2.e.e((Object)n, "{\n      subredditAboutSt\u2026dditName)\n        }\n    }");
        }
        else {
            n = this.j.x(s);
        }
        return (n<Subreddit>)a92.b.a0(n, (n20.d)this.b);
    }
    
    public final Serializable J(final List list, final lg2.c c) {
        final RemoteGqlSubredditDataSource e = this.e;
        final ArrayList list2 = new ArrayList(ig2.m.c3((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(o20.a.i((String)iterator.next()));
        }
        return e.e(list2, c);
    }
    
    public final c0<SubredditNameValidationResult> K(final String s) {
        sg2.e.f((Object)s, "subredditName");
        final RemoteGqlSubredditDataSource e = this.e;
        e.getClass();
        final c0 w = nn0.a.V(e$a.a((mr0.e)e.a, (k)new zd(new g22.c0(h7.h.a.c(s), 14)), (OkHttpClient)null, (Map)null, 14), (n20.d)e.d).w((o)new su.d(7));
        sg2.e.e((Object)w, "graphQlClient\n      .exe\u2026?.code,\n        )\n      }");
        return nn0.a.V((c0)w, (n20.d)this.b);
    }
    
    public final t L() {
        final t n = this.j.G(3).N();
        sg2.e.e((Object)n, "local.getRecentSubreddit\u2026t = limit).toObservable()");
        return mf1.a.S(n, this.b);
    }
    
    public final Object M(final String s, final lg2.c<? super SubredditTopic> c) {
        return this.g.a(s, (lg2.c)c);
    }
    
    public final kotlinx.coroutines.flow.e N() {
        final kotlinx.coroutines.flow.f u = this.u;
        final t map = this.j.n().map((o)new s(8));
        sg2.e.e((Object)map, "local.observeFollowingSu\u2026tyDrawerListing(it)\n    }");
        return new kotlinx.coroutines.flow.e((hj2.e)u, (hj2.e)kotlinx.coroutines.rx2.e.b(map), (rg2.q)new RedditSubredditRepository$observeFollowingSubredditsListing$2((lg2.c)null));
    }
    
    public final List<String> O() {
        final Ambassadors ambassadors = (Ambassadors)new p31.c(true).c().a((Class)Ambassadors.class).fromJson(s0(this.s, "reddit_ambassadors.json"));
        if (ambassadors != null) {
            final List list = ambassadors.getList();
            if (list != null) {
                final ArrayList list2 = new ArrayList(ig2.m.c3((Iterable)list, 10));
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
    
    public final c0<List<String>> P(final String s) {
        sg2.e.f((Object)s, "subredditId");
        final c0 x = this.j.Q(s).g((Object)EmptyList.INSTANCE).x();
        sg2.e.e((Object)x, "local.getPinnedPosts(sub\u2026y(emptyList()).toSingle()");
        return x;
    }
    
    public final Object Q(final List<String> list, final lg2.c<? super List<Subreddit>> c) {
        return this.e.k((List)list, (lg2.c)c);
    }
    
    public final c0 R() {
        return nn0.a.V(this.j.G(25), (n20.d)this.b);
    }
    
    public final Object S(final lg2.c<? super hj2.e<UserSubredditListings>> c) {
        RedditSubredditRepository$observeUserSubredditListings$1 redditSubredditRepository$observeUserSubredditListings$1 = null;
        Label_0047: {
            if (c instanceof RedditSubredditRepository$observeUserSubredditListings$1) {
                redditSubredditRepository$observeUserSubredditListings$1 = (RedditSubredditRepository$observeUserSubredditListings$1)c;
                final int label = redditSubredditRepository$observeUserSubredditListings$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$observeUserSubredditListings$1.label = label + Integer.MIN_VALUE;
                    break Label_0047;
                }
            }
            redditSubredditRepository$observeUserSubredditListings$1 = new RedditSubredditRepository$observeUserSubredditListings$1(this, (lg2.c)c);
        }
        Object o = redditSubredditRepository$observeUserSubredditListings$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$observeUserSubredditListings$1.label;
        Object o2 = null;
        RedditSubredditRepository redditSubredditRepository = null;
        hj2.e e2 = null;
        Label_0352: {
            Label_0278: {
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            o2 = redditSubredditRepository$observeUserSubredditListings$1.L$1;
                            redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$observeUserSubredditListings$1.L$0;
                            yd.b.k0(o);
                            break Label_0278;
                        }
                        if (label2 == 3) {
                            final hj2.e e = (hj2.e)redditSubredditRepository$observeUserSubredditListings$1.L$2;
                            o2 = redditSubredditRepository$observeUserSubredditListings$1.L$1;
                            redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$observeUserSubredditListings$1.L$0;
                            yd.b.k0(o);
                            e2 = e;
                            break Label_0352;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$observeUserSubredditListings$1.L$0;
                        yd.b.k0(o);
                    }
                }
                else {
                    yd.b.k0(o);
                    final xb0.b j = this.j;
                    redditSubredditRepository$observeUserSubredditListings$1.L$0 = this;
                    redditSubredditRepository$observeUserSubredditListings$1.label = 1;
                    o = j.s();
                    if (o == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    redditSubredditRepository = this;
                }
                o2 = new kotlinx.coroutines.flow.e((hj2.e)o, (hj2.e)redditSubredditRepository.v, (rg2.q)new RedditSubredditRepository$observeUserSubredditListings$subscribedFlow$1((lg2.c)null));
                final xb0.b i = redditSubredditRepository.j;
                redditSubredditRepository$observeUserSubredditListings$1.L$0 = redditSubredditRepository;
                redditSubredditRepository$observeUserSubredditListings$1.L$1 = o2;
                redditSubredditRepository$observeUserSubredditListings$1.label = 2;
                if ((o = i.p()) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final kotlinx.coroutines.flow.e l$2 = new kotlinx.coroutines.flow.e((hj2.e)o, (hj2.e)redditSubredditRepository.x, (rg2.q)new RedditSubredditRepository$observeUserSubredditListings$moderatingFlow$1((lg2.c)null));
            final xb0.b k = redditSubredditRepository.j;
            redditSubredditRepository$observeUserSubredditListings$1.L$0 = redditSubredditRepository;
            redditSubredditRepository$observeUserSubredditListings$1.L$1 = o2;
            redditSubredditRepository$observeUserSubredditListings$1.L$2 = l$2;
            redditSubredditRepository$observeUserSubredditListings$1.label = 3;
            o = k.K();
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            e2 = l$2;
        }
        Object h = kotlinx.coroutines.flow.a.h((hj2.e)o2, e2, new kotlinx.coroutines.flow.e((hj2.e)o, (hj2.e)redditSubredditRepository.y, (rg2.q)new RedditSubredditRepository$observeUserSubredditListings$followingFlow$1((lg2.c)null)), (rg2.r)new RedditSubredditRepository$observeUserSubredditListings$2((lg2.c)null));
        if (!(h instanceof hj2.a)) {
            h = new CancellableFlowImpl((hj2.e)h);
        }
        return h;
    }
    
    public final Object T(final String s, final lg2.c<? super Result<Boolean>> c) {
        if (o20.a.c(s)) {
            return this.e.c(o20.a.i(s), (lg2.c)c);
        }
        return this.e.h(o20.a.h(s), (lg2.c)c);
    }
    
    public final kotlinx.coroutines.flow.e U() {
        final kotlinx.coroutines.flow.f u = this.u;
        final t map = this.j.z().map((o)new n1(6));
        sg2.e.e((Object)map, "local.observeSubscribedS\u2026tyDrawerListing(it)\n    }");
        return new kotlinx.coroutines.flow.e((hj2.e)u, (hj2.e)kotlinx.coroutines.rx2.e.b(map), (rg2.q)new RedditSubredditRepository$observeSubscribedSubredditsListing$2((lg2.c)null));
    }
    
    public final c0<SubredditTopicsResult> V(final int n, final String s, final boolean b) {
        final RemoteGqlSubredditTopicsDataSource g = this.g;
        final c0 w = nn0.a.V(e$a.a((mr0.e)g.a, (k)new r0(h7.h.a.c(n), h7.h.a.c(s), h7.h.a.c(b)), (OkHttpClient)null, (Map)null, 14), (n20.d)g.b).w((o)new y30.m(8)).w((o)new nw.d(16));
        sg2.e.e((Object)w, "graphQlClient\n      .exe\u2026     },\n        )\n      }");
        return nn0.a.V((c0)w, (n20.d)this.b);
    }
    
    public final t W(final String s, final boolean b) {
        t t;
        if (b) {
            t = this.o0(SubredditGroup.SUBSCRIBED, s).N().mergeWith((ff2.y)this.j.z());
        }
        else {
            t = this.q0(SubredditGroup.SUBSCRIBED, s).N().mergeWith((ff2.y)this.j.z());
        }
        sg2.e.e((Object)t, "if (refresh) {\n      fet\u2026cribedSubreddits())\n    }");
        return mf1.a.S(t, this.b);
    }
    
    public final ff2.a X(final String s, final String s2, final NotificationLevel notificationLevel) {
        sg2.e.f((Object)s, "subredditKindWithId");
        sg2.e.f((Object)s2, "subredditName");
        sg2.e.f((Object)notificationLevel, "notificationLevel");
        final ff2.a i = yg.a.z1((rg2.p)new RedditSubredditRepository$updateNotificationLevel$1(this, s, notificationLevel, (lg2.c)null)).i((ff2.e)this.j.F(s2, notificationLevel).K());
        sg2.e.e((Object)i, "override fun updateNotif\u2026eOn(backgroundThread)\n  }");
        return yd.b.i0(i, (n20.d)this.b);
    }
    
    public final Object Y(final String s, final ContinuationImpl continuationImpl) {
        return this.e.i(s, (lg2.c)continuationImpl);
    }
    
    public final Object Z(final String l$1, boolean z$0, final lg2.c<? super UpdateResponse> c) {
        Object o = null;
        Label_0056: {
            if (c instanceof RedditSubredditRepository$updateFavoriteState$1) {
                final RedditSubredditRepository$updateFavoriteState$1 redditSubredditRepository$updateFavoriteState$1 = (RedditSubredditRepository$updateFavoriteState$1)c;
                final int label = redditSubredditRepository$updateFavoriteState$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$updateFavoriteState$1.label = label + Integer.MIN_VALUE;
                    o = redditSubredditRepository$updateFavoriteState$1;
                    break Label_0056;
                }
            }
            o = new RedditSubredditRepository$updateFavoriteState$1(this, (lg2.c)c);
        }
        Object o2 = ((RedditSubredditRepository$updateFavoriteState$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditSubredditRepository$updateFavoriteState$1)o).label;
        RedditSubredditRepository l$2 = null;
        Label_0279: {
            String s;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        l$2 = (RedditSubredditRepository)((RedditSubredditRepository$updateFavoriteState$1)o).L$0;
                        yd.b.k0(o2);
                        break Label_0279;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    z$0 = ((RedditSubredditRepository$updateFavoriteState$1)o).Z$0;
                    s = (String)((RedditSubredditRepository$updateFavoriteState$1)o).L$1;
                    l$2 = (RedditSubredditRepository)((RedditSubredditRepository$updateFavoriteState$1)o).L$0;
                    yd.b.k0(o2);
                }
            }
            else {
                yd.b.k0(o2);
                final String e = v10.v.e(l$1, ThingType.SUBREDDIT);
                final RemoteGqlSubredditDataSource e2 = this.e;
                ((RedditSubredditRepository$updateFavoriteState$1)o).L$0 = this;
                ((RedditSubredditRepository$updateFavoriteState$1)o).L$1 = l$1;
                ((RedditSubredditRepository$updateFavoriteState$1)o).Z$0 = z$0;
                ((RedditSubredditRepository$updateFavoriteState$1)o).label = 1;
                o2 = e2.p(e, z$0, (lg2.c)o);
                if (o2 == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                s = l$1;
                l$2 = this;
            }
            final UpdateResponse updateResponse = (UpdateResponse)o2;
            if (!updateResponse.getSuccess()) {
                return updateResponse;
            }
            final c0 t = l$2.j.t(s, z$0);
            ((RedditSubredditRepository$updateFavoriteState$1)o).L$0 = l$2;
            ((RedditSubredditRepository$updateFavoriteState$1)o).L$1 = null;
            ((RedditSubredditRepository$updateFavoriteState$1)o).label = 2;
            if ((o2 = kotlinx.coroutines.rx2.d.b(t, (lg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        if (!(boolean)o2) {
            return new UpdateResponse(false, (String)null);
        }
        final SubredditGroup subscribed = SubredditGroup.SUBSCRIBED;
        final Object value = l$2.F.getValue();
        sg2.e.e(value, "<get-subredditGroupStore>(...)");
        ((Store)value).a((Object)new c(subscribed, null));
        return new UpdateResponse(true, (String)null);
    }
    
    public final ff2.a a(final String s) {
        sg2.e.f((Object)s, "subredditId");
        return yd.b.i0(this.j.a(s), (n20.d)this.b);
    }
    
    public final c0<Boolean> a0(final Subreddit subreddit) {
        sg2.e.f((Object)subreddit, "subreddit");
        return nn0.a.V(this.j.O(subreddit), (n20.d)this.b);
    }
    
    public final ff2.a b(final String s) {
        sg2.e.f((Object)s, "subredditName");
        return this.j.b(s);
    }
    
    public final c0<Set<String>> b0(final String s) {
        final c0 value = this.p0().get((Object)s);
        sg2.e.e((Object)value, "crosspostableSubredditsStore.get(username)");
        return nn0.a.V(value, (n20.d)this.b);
    }
    
    public final c0<Boolean> c(final String s) {
        sg2.e.f((Object)s, "subredditName");
        final ff2.a setSubscriptionState = this.c.setSubscriptionState(s, SubredditAction.UNSUBSCRIBE, (SubredditActionSource)null);
        ff2.a a;
        if (o20.a.c(s)) {
            a = this.j.u(s).k((kf2.a)new b40.q(2, (Object)this, (Object)s));
        }
        else {
            a = ff2.a.h();
        }
        final ff2.a r = ff2.a.r((ff2.e)a, (ff2.e)this.j.m(s));
        sg2.e.e((Object)r, "mergeArray(\n      unfoll\u2026dit(subredditName),\n    )");
        final ff2.a e = setSubscriptionState.e((ff2.e)r);
        sg2.e.e((Object)e, "unsubscribeSubreddit\n   \u2026andThen(unsubscribeLocal)");
        final c0<Boolean> b = yd.b.i0(e, (n20.d)this.b).B(Boolean.TRUE);
        sg2.e.e((Object)b, "unsubscribeSubreddit\n   \u2026   .toSingleDefault(true)");
        return b;
    }
    
    public final c0<UpdateResponse> c0(final UpdateSubredditSettings updateSubredditSettings) {
        final RemoteGqlSubredditDataSource e = this.e;
        final b5 map = GqlCreateUpdateSubredditMapper.INSTANCE.map(updateSubredditSettings);
        e.getClass();
        sg2.e.f((Object)map, "input");
        final c0 w = nn0.a.V(e$a.a((mr0.e)e.a, (k)new e9(map), (OkHttpClient)null, (Map)null, 14), (n20.d)e.d).w((o)new kv.a(13));
        sg2.e.e((Object)w, "graphQlClient\n      .exe\u2026essage,\n        )\n      }");
        return w;
    }
    
    public final ff2.a d(final String s) {
        sg2.e.f((Object)s, "subredditName");
        return this.j.d(s);
    }
    
    public final ff2.a d0(final String s) {
        sg2.e.f((Object)s, "subredditName");
        return yd.b.i0(this.c.optInQuarantinedSubreddit(s, "yes"), (n20.d)this.b);
    }
    
    public final c0<Boolean> e(final String s) {
        sg2.e.f((Object)s, "subredditName");
        this.p0().clear();
        final ff2.a setSubscriptionState = this.c.setSubscriptionState(s, SubredditAction.SUBSCRIBE, (SubredditActionSource)null);
        ff2.a a;
        if (o20.a.c(s)) {
            a = this.j.k(s).k((kf2.a)new v1(this, s));
        }
        else {
            a = ff2.a.h();
        }
        final c0 n = this.j.N(s);
        final w1 w1 = new w1(this, s, 0);
        n.getClass();
        final ff2.a r = ff2.a.r((ff2.e)a, (ff2.e)RxJavaPlugins.onAssembly((ff2.a)new SingleFlatMapCompletable((ff2.g0)n, (o)w1)));
        sg2.e.e((Object)r, "mergeArray(\n      follow\u2026       }\n        },\n    )");
        final ff2.a e = setSubscriptionState.e((ff2.e)r);
        sg2.e.e((Object)e, "remoteSubscribe\n      .andThen(localSubscribe)");
        final c0<Boolean> b = yd.b.i0(e, (n20.d)this.b).B(Boolean.TRUE);
        sg2.e.e((Object)b, "remoteSubscribe\n      .a\u2026   .toSingleDefault(true)");
        return b;
    }
    
    public final ff2.a e0(final List<String> list, final SubredditActionSource subredditActionSource) {
        sg2.e.f((Object)list, "subredditList");
        this.p0().clear();
        final ff2.a e = this.c.setSubscriptionState(CollectionsKt___CollectionsKt.I3((Iterable)list, (CharSequence)",", (String)null, (String)null, (l)null, 62), SubredditAction.SUBSCRIBE, subredditActionSource).e((ff2.e)ff2.t.fromIterable((Iterable)list).flatMapCompletable((o)new z50.q((Object)this, 4)));
        sg2.e.e((Object)e, "remoteSubscribeList.andThen(localSubscribe)");
        return yd.b.i0(e, (n20.d)this.b);
    }
    
    public final ff2.a f(final String s) {
        sg2.e.f((Object)s, "kindWithId");
        return yd.b.i0(this.j.f(s), (n20.d)this.b);
    }
    
    public final t f0(final String s, final boolean b) {
        t t;
        if (b) {
            t = this.o0(SubredditGroup.MODERATING, s).N().mergeWith((ff2.y)this.j.D());
        }
        else {
            t = this.q0(SubredditGroup.MODERATING, s).N().mergeWith((ff2.y)this.j.D());
        }
        sg2.e.e((Object)t, "if (refresh) {\n      fet\u2026ratingSubreddits())\n    }");
        return mf1.a.S(t, this.b);
    }
    
    public final c0<List<Subreddit>> g() {
        return nn0.a.V(this.j.g(), (n20.d)this.b);
    }
    
    public final Object g0(final String s, final String s2, final lg2.c<? super UpdateResponse> c) {
        return this.g.b(s, s2, (lg2.c)c);
    }
    
    public final ff2.a h(final String s) {
        sg2.e.f((Object)s, "subredditName");
        return this.j.h(s);
    }
    
    public final t h0(final String s, final boolean b) {
        t t;
        if (b) {
            t = this.o0(SubredditGroup.FOLLOWING, s).N().mergeWith((ff2.y)this.j.n());
        }
        else {
            t = this.q0(SubredditGroup.FOLLOWING, s).N().mergeWith((ff2.y)this.j.n());
        }
        sg2.e.e((Object)t, "if (refresh) {\n      fet\u2026lowingSubreddits())\n    }");
        return mf1.a.S(t, this.b);
    }
    
    public final ff2.a i() {
        return this.j.i();
    }
    
    public final Object i0(final String s, final String s2, final lg2.c<? super UpdateResponse> c) {
        return this.h.a(s, s2, (lg2.c)c);
    }
    
    public final n<List<SubredditTriggeredInvite>> j() {
        return (n<List<SubredditTriggeredInvite>>)this.j.j();
    }
    
    public final c0<CreateSubredditResult> j0(final CreateSubreddit createSubreddit) {
        final RemoteGqlSubredditDataSource e = this.e;
        final a0 map = GqlCreateUpdateSubredditMapper.INSTANCE.map(createSubreddit);
        e.getClass();
        sg2.e.f((Object)map, "input");
        final c0 w = nn0.a.V(e$a.a((mr0.e)e.a, (k)new s1(map), (OkHttpClient)null, (Map)null, 14), (n20.d)e.d).w((o)new y30.m(7));
        sg2.e.e((Object)w, "graphQlClient\n      .exe\u2026essage,\n        )\n      }");
        return w;
    }
    
    public final ff2.a k(final String s, final ArrayList list) {
        sg2.e.f((Object)s, "subredditId");
        return this.j.P(s, list);
    }
    
    public final Object k0(final String s, final lg2.c<? super j> c) {
        final Object t0 = this.t0(SubredditGroup.SUBSCRIBED, s, c);
        if (t0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return t0;
        }
        return hg2.j.a;
    }
    
    public final Object l(String s, final lg2.c<? super SubredditTaggingQuestions> c) {
        RedditSubredditRepository$getSubredditQuestions$1 redditSubredditRepository$getSubredditQuestions$1 = null;
        Label_0050: {
            if (c instanceof RedditSubredditRepository$getSubredditQuestions$1) {
                redditSubredditRepository$getSubredditQuestions$1 = (RedditSubredditRepository$getSubredditQuestions$1)c;
                final int label = redditSubredditRepository$getSubredditQuestions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$getSubredditQuestions$1.label = label + Integer.MIN_VALUE;
                    break Label_0050;
                }
            }
            redditSubredditRepository$getSubredditQuestions$1 = new RedditSubredditRepository$getSubredditQuestions$1(this, (lg2.c)c);
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
                        yd.b.k0(o);
                        redditSubredditRepository2 = redditSubredditRepository;
                        break Label_0283;
                    }
                    if (label2 == 3) {
                        final SubredditTaggingQuestions subredditTaggingQuestions = (SubredditTaggingQuestions)redditSubredditRepository$getSubredditQuestions$1.L$0;
                        yd.b.k0(o);
                        return subredditTaggingQuestions;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    s = (String)redditSubredditRepository$getSubredditQuestions$1.L$1;
                    l$2 = (RedditSubredditRepository)redditSubredditRepository$getSubredditQuestions$1.L$0;
                    yd.b.k0(o);
                }
            }
            else {
                yd.b.k0(o);
                final RemoteGqlSubredditQuestionsDataSource h = this.h;
                redditSubredditRepository$getSubredditQuestions$1.L$0 = this;
                redditSubredditRepository$getSubredditQuestions$1.L$1 = s;
                redditSubredditRepository$getSubredditQuestions$1.label = 1;
                o = h.e(s, (lg2.c)redditSubredditRepository$getSubredditQuestions$1);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                l$2 = this;
            }
            final SubredditTaggingQuestions l$3 = (SubredditTaggingQuestions)o;
            final xb0.a i = l$2.i;
            redditSubredditRepository$getSubredditQuestions$1.L$0 = l$2;
            redditSubredditRepository$getSubredditQuestions$1.L$1 = s;
            redditSubredditRepository$getSubredditQuestions$1.L$2 = l$3;
            redditSubredditRepository$getSubredditQuestions$1.label = 2;
            if (i.e(s, (lg2.c)redditSubredditRepository$getSubredditQuestions$1) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditSubredditRepository2 = l$2;
            s2 = s;
            l$0 = l$3;
        }
        final List<CrowdsourceTaggingQuestion> crowdsourceTaggingQuestion = l$0.getCrowdsourceTaggingQuestion();
        SubredditTaggingQuestions subredditTaggingQuestions = l$0;
        if (crowdsourceTaggingQuestion != null) {
            final xb0.a j = redditSubredditRepository2.i;
            redditSubredditRepository$getSubredditQuestions$1.L$0 = l$0;
            redditSubredditRepository$getSubredditQuestions$1.L$1 = null;
            redditSubredditRepository$getSubredditQuestions$1.L$2 = null;
            redditSubredditRepository$getSubredditQuestions$1.label = 3;
            subredditTaggingQuestions = l$0;
            if (j.a(s2, (List)crowdsourceTaggingQuestion, (lg2.c)redditSubredditRepository$getSubredditQuestions$1) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return subredditTaggingQuestions;
    }
    
    public final c0<Boolean> l0(final List<Subreddit> list) {
        sg2.e.f((Object)list, "subreddits");
        return nn0.a.V(this.j.I((Collection)list), (n20.d)this.b);
    }
    
    public final c0<List<Subreddit>> m(final String s) {
        return nn0.a.V((c0)this.q0(SubredditGroup.FAVORITES, s), (n20.d)this.b);
    }
    
    public final c0<StructuredStyle> m0(final String s) {
        sg2.e.f((Object)s, "subredditName");
        final Store value = this.B.getValue();
        sg2.e.e((Object)value, "<get-structuredStyleStore>(...)");
        final c0 value2 = value.get((Object)s);
        sg2.e.e((Object)value2, "structuredStyleStore.get(subredditName)");
        return nn0.a.V(value2, (n20.d)this.b);
    }
    
    public final Object n(final lg2.c<? super Set<String>> c) {
        return this.j.J();
    }
    
    public final Object n0(String l$1, final lg2.c<? super UpdateResponse> c) {
        RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 = null;
        Label_0050: {
            if (c instanceof RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1) {
                redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 = (RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1)c;
                final int label = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label = label + Integer.MIN_VALUE;
                    break Label_0050;
                }
            }
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 = new RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1(this, (lg2.c)c);
        }
        Object l$2 = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label;
        RedditSubredditRepository redditSubredditRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final Object l$3 = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$0;
                    yd.b.k0(l$2);
                    return l$3;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$1 = (String)redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$1;
                redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$0;
                yd.b.k0(l$2);
            }
        }
        else {
            yd.b.k0(l$2);
            final RemoteGqlSubredditQuestionsDataSource h = this.h;
            final EmptyList instance = EmptyList.INSTANCE;
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$0 = this;
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$1 = l$1;
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label = 1;
            l$2 = h.f(l$1, (List)instance, (lg2.c)redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1, true);
            if (l$2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditSubredditRepository = this;
        }
        Object o = l$2;
        if (!((UpdateResponse)l$2).getSuccess()) {
            return o;
        }
        final xb0.a i = redditSubredditRepository.i;
        redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$0 = l$2;
        redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$1 = null;
        redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label = 2;
        if (i.j(l$1, (ContinuationImpl)redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final Object l$3 = l$2;
        o = l$3;
        return o;
    }
    
    public final String o(String subreddit_name, final String s, final String s2) {
        sg2.e.f((Object)subreddit_name, "subredditName");
        sg2.e.f((Object)s2, "deviceLanguage");
        final SubredditCounterpartMapping subredditCounterpartMapping = (SubredditCounterpartMapping)new p31.c(true).c().a((Class)SubredditCounterpartMapping.class).fromJson(s0(this.s, "counterpart_communities.json"));
        final Mappings mappings = null;
        Object o = null;
        Label_0186: {
            Label_0182: {
                if (subredditCounterpartMapping != null) {
                    final List<Regions> regions = subredditCounterpartMapping.getRegions();
                    if (regions != null) {
                        while (true) {
                            for (final Regions next : regions) {
                                final Regions regions2 = next;
                                if (sg2.e.a((Object)regions2.getLanguage(), (Object)s) || sg2.e.a((Object)regions2.getLanguage(), (Object)s2)) {
                                    final Regions regions3 = next;
                                    final Regions regions4 = regions3;
                                    if (regions4 == null) {
                                        break Label_0182;
                                    }
                                    o = regions4.getMappings();
                                    if (o != null) {
                                        break Label_0186;
                                    }
                                    break Label_0182;
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
        } while (!cj2.j.F0(((Mappings)next2).getSubreddit_counterpart(), subreddit_name, true));
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
    
    public final c0<List<Subreddit>> o0(final SubredditGroup subredditGroup, final String s) {
        final Store value = this.F.getValue();
        sg2.e.e((Object)value, "<get-subredditGroupStore>(...)");
        final c0 j = value.j((Object)new c(subredditGroup, s));
        sg2.e.e((Object)j, "subredditGroupStore.fetc\u2026ey(group, correlationId))");
        return j;
    }
    
    public final Object p(final String s, final lg2.c<? super j> c) {
        final Object t0 = this.t0(SubredditGroup.MODERATING, s, c);
        if (t0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return t0;
        }
        return hg2.j.a;
    }
    
    public final Store<Set<String>, String> p0() {
        final Store value = this.C.getValue();
        sg2.e.e((Object)value, "<get-crosspostableSubredditsStore>(...)");
        return (Store<Set<String>, String>)value;
    }
    
    public final Object q(final String s, final lg2.c<? super Subreddit> c) {
        RedditSubredditRepository$getOrFetchSubreddit$1 redditSubredditRepository$getOrFetchSubreddit$2 = null;
        Label_0052: {
            if (c instanceof RedditSubredditRepository$getOrFetchSubreddit$1) {
                final RedditSubredditRepository$getOrFetchSubreddit$1 redditSubredditRepository$getOrFetchSubreddit$1 = (RedditSubredditRepository$getOrFetchSubreddit$1)c;
                final int label = redditSubredditRepository$getOrFetchSubreddit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$getOrFetchSubreddit$1.label = label + Integer.MIN_VALUE;
                    redditSubredditRepository$getOrFetchSubreddit$2 = redditSubredditRepository$getOrFetchSubreddit$1;
                    break Label_0052;
                }
            }
            redditSubredditRepository$getOrFetchSubreddit$2 = new RedditSubredditRepository$getOrFetchSubreddit$1(this, (lg2.c)c);
        }
        final Object result = redditSubredditRepository$getOrFetchSubreddit$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$getOrFetchSubreddit$2.label;
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
            final Store value = this.z.getValue();
            sg2.e.e((Object)value, "<get-subredditAboutStore>(...)");
            final c0 value2 = value.get((Object)s);
            sg2.e.e((Object)value2, "subredditAboutStore.get(subredditName)");
            final c0 v = nn0.a.V(value2, (n20.d)this.b);
            redditSubredditRepository$getOrFetchSubreddit$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(v, (lg2.c)redditSubredditRepository$getOrFetchSubreddit$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(b, "subredditAboutStore.get(\u2026undThread)\n      .await()");
        return b;
    }
    
    public final c0<List<Subreddit>> q0(final SubredditGroup subredditGroup, final String s) {
        final Store value = this.F.getValue();
        sg2.e.e((Object)value, "<get-subredditGroupStore>(...)");
        final c0 value2 = value.get((Object)new c(subredditGroup, s));
        sg2.e.e((Object)value2, "subredditGroupStore.get(\u2026ey(group, correlationId))");
        return value2;
    }
    
    public final c0 r(final String s, final LinkedHashMap linkedHashMap) {
        final a a = new a(s, linkedHashMap);
        final Store value = this.D.getValue();
        sg2.e.e((Object)value, "<get-subredditListingStore>(...)");
        final c0 j = value.j((Object)a);
        sg2.e.e((Object)j, "if (refresh) {\n      sub\u2026ore.get(requestKey)\n    }");
        return nn0.a.V(j, (n20.d)this.b);
    }
    
    public final Serializable r0(final lg2.c c) {
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
            o = new RedditSubredditRepository$performFetchUserSubredditListItems$1(this, c);
        }
        Object result = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).result;
        Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        while (true) {
            Object o27 = null;
            Object o29 = null;
            List l$39 = null;
            Object o35 = null;
            Object o37 = null;
            Object o38 = null;
            RedditSubredditRepository redditSubredditRepository5 = null;
            Label_2484: {
                PaginatedListing paginatedListing = null;
                Object o2 = null;
                Object o3 = null;
                Object o4 = null;
                Object o5 = null;
                Object o6 = null;
                Object o7 = null;
                Object o8 = null;
                RedditSubredditRepository redditSubredditRepository2 = null;
                Label_2394: {
                    PaginatedListing l$8 = null;
                    Object l$9 = null;
                    Object l$10 = null;
                    Object l$11 = null;
                    Object l$12 = null;
                    Object l$13 = null;
                    Object l$14 = null;
                    Object l$15 = null;
                    RedditSubredditRepository l$16 = null;
                    RedditSubredditRepository$performFetchUserSubredditListItems$1 redditSubredditRepository$performFetchUserSubredditListItems$2 = null;
                    Object o9 = null;
                    Label_2206: {
                        Object o17 = null;
                        Object o24 = null;
                        UserSubredditPaginatedListing l$42 = null;
                        Object o32 = null;
                        Object o33 = null;
                        Object o34 = null;
                        Object o36 = null;
                        Label_2027: {
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
                            Label_1949: {
                                PaginatedListing l$17 = null;
                                UserSubredditPaginatedListing l$18 = null;
                                Object l$19 = null;
                                Object l$20 = null;
                                Object l$21 = null;
                                Object l$22 = null;
                                Object l$23 = null;
                                Object l$24 = null;
                                Object l$25 = null;
                                RedditSubredditRepository l$26 = null;
                                RedditSubredditRepository$performFetchUserSubredditListItems$1 redditSubredditRepository$performFetchUserSubredditListItems$3 = null;
                                Label_1747: {
                                    Label_1588: {
                                        PaginatedListing paginatedListing3 = null;
                                        UserSubredditPaginatedListing userSubredditPaginatedListing2 = null;
                                        Object o18 = null;
                                        Object o19 = null;
                                        Object o20 = null;
                                        Object o21 = null;
                                        Object o22 = null;
                                        Object o23 = null;
                                        RedditSubredditRepository redditSubredditRepository4 = null;
                                        Label_1513: {
                                            PaginatedListing l$27 = null;
                                            UserSubredditPaginatedListing l$28 = null;
                                            Object l$29 = null;
                                            Object l$30 = null;
                                            Object l$31 = null;
                                            Object l$32 = null;
                                            Object l$33 = null;
                                            Object l$34 = null;
                                            RedditSubredditRepository l$35 = null;
                                            RedditSubredditRepository$performFetchUserSubredditListItems$1 redditSubredditRepository$performFetchUserSubredditListItems$4 = null;
                                            Object o25 = null;
                                            Ref$BooleanRef l$36 = null;
                                            Label_1311: {
                                                Object o26 = null;
                                                Object o28 = null;
                                                Object o30 = null;
                                                Object o31 = null;
                                                Object l$37 = null;
                                                RedditSubredditRepository l$38 = null;
                                                Label_1079: {
                                                    final RedditSubredditRepository l$40;
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
                                                            yd.b.k0(result);
                                                            redditSubredditRepository2 = redditSubredditRepository;
                                                            break Label_2394;
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
                                                            yd.b.k0(result);
                                                            redditSubredditRepository$performFetchUserSubredditListItems$2 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o;
                                                            o9 = coroutine_SUSPENDED;
                                                            break Label_2206;
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
                                                            yd.b.k0(result);
                                                            o16 = ref$BooleanRef;
                                                            break Label_1949;
                                                        }
                                                        case 4: {
                                                            l$17 = (PaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9;
                                                            l$18 = (UserSubredditPaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8;
                                                            l$19 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            l$20 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            l$21 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            l$22 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            l$23 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            l$24 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            l$25 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            l$26 = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            yd.b.k0(result);
                                                            redditSubredditRepository$performFetchUserSubredditListItems$3 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o;
                                                            o17 = coroutine_SUSPENDED;
                                                            break Label_1747;
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
                                                            yd.b.k0(result);
                                                            break Label_1513;
                                                        }
                                                        case 2: {
                                                            l$27 = (PaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9;
                                                            l$28 = (UserSubredditPaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8;
                                                            l$29 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            l$30 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            l$31 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            final Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            l$32 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            l$33 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            l$34 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            l$35 = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            yd.b.k0(result);
                                                            redditSubredditRepository$performFetchUserSubredditListItems$4 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o;
                                                            o25 = coroutine_SUSPENDED;
                                                            l$36 = ref$BooleanRef2;
                                                            break Label_1311;
                                                        }
                                                        case 1: {
                                                            o26 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            o27 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            o28 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            o29 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            o30 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            o31 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            l$37 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            l$38 = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            yd.b.k0(result);
                                                            break Label_1079;
                                                        }
                                                        case 0: {
                                                            yd.b.k0(result);
                                                            l$39 = new ArrayList();
                                                            o31 = new Ref$BooleanRef();
                                                            ((Ref$BooleanRef)o31).element = true;
                                                            o30 = new Ref$ObjectRef();
                                                            o29 = new Ref$BooleanRef();
                                                            ((Ref$BooleanRef)o29).element = true;
                                                            o28 = new Ref$ObjectRef();
                                                            o27 = new Ref$BooleanRef();
                                                            ((Ref$BooleanRef)o27).element = true;
                                                            o26 = new Ref$ObjectRef();
                                                            l$40 = this;
                                                            break;
                                                        }
                                                    }
                                                    final RemoteGqlSubredditDataSource e = l$40.e;
                                                    final boolean element = ((Ref$BooleanRef)o31).element;
                                                    final String s = (String)((Ref$ObjectRef)o30).element;
                                                    final boolean element2 = ((Ref$BooleanRef)o29).element;
                                                    final String s2 = (String)((Ref$ObjectRef)o28).element;
                                                    final boolean element3 = ((Ref$BooleanRef)o27).element;
                                                    final String s3 = (String)((Ref$ObjectRef)o26).element;
                                                    final BigFishSubredditOptimizationVariant$a companion = BigFishSubredditOptimizationVariant.Companion;
                                                    final BigFishSubredditOptimizationVariant v8 = l$40.n.v8();
                                                    companion.getClass();
                                                    final int a = BigFishSubredditOptimizationVariant$a.a(v8);
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0 = l$40;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1 = l$39;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2 = o31;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3 = o30;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4 = o29;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5 = o28;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6 = o27;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7 = o26;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8 = null;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9 = null;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).label = 1;
                                                    final Object n = e.n(element, s, element2, s2, element3, s3, a, (lg2.c)o);
                                                    if (n == coroutine_SUSPENDED) {
                                                        return (Serializable)coroutine_SUSPENDED;
                                                    }
                                                    l$38 = l$40;
                                                    result = n;
                                                    l$37 = l$39;
                                                }
                                                final UserSubredditPaginatedListing l$41 = (UserSubredditPaginatedListing)result;
                                                final PaginatedListing subscribed = l$41.getSubscribed();
                                                l$42 = l$41;
                                                o32 = o;
                                                o17 = coroutine_SUSPENDED;
                                                o33 = o26;
                                                o34 = o27;
                                                o35 = o28;
                                                o36 = o29;
                                                o37 = o30;
                                                o38 = o31;
                                                o24 = l$37;
                                                redditSubredditRepository5 = l$38;
                                                if (subscribed == null) {
                                                    break Label_1588;
                                                }
                                                final xb0.b j = l$38.j;
                                                final List items = subscribed.getItems();
                                                final boolean b = ((Ref$ObjectRef)o30).element == null && ((Ref$ObjectRef)o28).element == null;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0 = l$38;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1 = l$37;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2 = o31;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3 = o30;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4 = o29;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5 = o28;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6 = o27;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7 = o26;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8 = l$41;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9 = subscribed;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).label = 2;
                                                if (j.l(items, b) == coroutine_SUSPENDED) {
                                                    return (Serializable)coroutine_SUSPENDED;
                                                }
                                                l$35 = l$38;
                                                l$33 = o31;
                                                l$31 = o28;
                                                l$36 = (Ref$BooleanRef)o29;
                                                final Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef)o26;
                                                l$27 = subscribed;
                                                l$28 = l$41;
                                                l$34 = l$37;
                                                l$32 = o30;
                                                l$30 = o27;
                                                l$29 = ref$ObjectRef;
                                                o25 = coroutine_SUSPENDED;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o;
                                            }
                                            o = redditSubredditRepository$performFetchUserSubredditListItems$4;
                                            coroutine_SUSPENDED = o25;
                                            paginatedListing3 = l$27;
                                            userSubredditPaginatedListing2 = l$28;
                                            o18 = l$29;
                                            o19 = l$30;
                                            o20 = l$31;
                                            o21 = l$36;
                                            o22 = l$32;
                                            o23 = l$33;
                                            o24 = l$34;
                                            redditSubredditRepository4 = l$35;
                                            if (!l$27.getHasNextPage()) {
                                                final StateFlowImpl v9 = l$35.v;
                                                final SubredditListingProgressIndicator complete = SubredditListingProgressIndicator.COMPLETE;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$0 = l$35;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$1 = l$34;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$2 = l$33;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$3 = l$32;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$4 = l$36;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$5 = l$31;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$6 = l$30;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$7 = l$29;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$8 = l$28;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$9 = l$27;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.label = 3;
                                                v9.setValue((Object)complete);
                                                o = redditSubredditRepository$performFetchUserSubredditListItems$4;
                                                coroutine_SUSPENDED = o25;
                                                paginatedListing3 = l$27;
                                                userSubredditPaginatedListing2 = l$28;
                                                o18 = l$29;
                                                o19 = l$30;
                                                o20 = l$31;
                                                o21 = l$36;
                                                o22 = l$32;
                                                o23 = l$33;
                                                o24 = l$34;
                                                redditSubredditRepository4 = l$35;
                                                if (hg2.j.a == o25) {
                                                    return (Serializable)o25;
                                                }
                                            }
                                        }
                                        ((Ref$BooleanRef)o23).element = paginatedListing3.getHasNextPage();
                                        ((Ref$ObjectRef)o22).element = paginatedListing3.getEndCursor();
                                        ((List)o24).addAll(paginatedListing3.getItems());
                                        l$42 = userSubredditPaginatedListing2;
                                        final Object o39 = o18;
                                        o34 = o19;
                                        o35 = o20;
                                        o37 = o22;
                                        o38 = o23;
                                        redditSubredditRepository5 = redditSubredditRepository4;
                                        o36 = o21;
                                        o33 = o39;
                                        o17 = coroutine_SUSPENDED;
                                        o32 = o;
                                    }
                                    final PaginatedListing followed = l$42.getFollowed();
                                    if (followed == null) {
                                        break Label_2027;
                                    }
                                    final xb0.b i = redditSubredditRepository5.j;
                                    final List items2 = followed.getItems();
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$0 = redditSubredditRepository5;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$1 = o24;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$2 = o38;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$3 = o37;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$4 = o36;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$5 = o35;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$6 = o34;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$7 = o33;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$8 = l$42;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$9 = followed;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).label = 4;
                                    if (i.l(items2, false) == o17) {
                                        return (Serializable)o17;
                                    }
                                    l$19 = o33;
                                    final UserSubredditPaginatedListing userSubredditPaginatedListing3 = l$42;
                                    l$24 = o38;
                                    l$20 = o34;
                                    l$26 = redditSubredditRepository5;
                                    l$25 = o24;
                                    l$23 = o37;
                                    l$22 = o36;
                                    l$21 = o35;
                                    l$18 = userSubredditPaginatedListing3;
                                    l$17 = followed;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o32;
                                }
                                o16 = l$24;
                                o = redditSubredditRepository$performFetchUserSubredditListItems$3;
                                coroutine_SUSPENDED = o17;
                                paginatedListing2 = l$17;
                                redditSubredditRepository3 = l$26;
                                userSubredditPaginatedListing = l$18;
                                o10 = l$19;
                                o11 = l$20;
                                o12 = l$21;
                                o13 = l$22;
                                o14 = l$23;
                                o15 = l$25;
                                if (!l$17.getHasNextPage()) {
                                    final StateFlowImpl y = l$26.y;
                                    final SubredditListingProgressIndicator complete2 = SubredditListingProgressIndicator.COMPLETE;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$0 = l$26;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$1 = l$25;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$2 = l$24;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$3 = l$23;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$4 = l$22;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$5 = l$21;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$6 = l$20;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$7 = l$19;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$8 = l$18;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.L$9 = l$17;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3.label = 5;
                                    y.setValue((Object)complete2);
                                    o16 = l$24;
                                    o = redditSubredditRepository$performFetchUserSubredditListItems$3;
                                    coroutine_SUSPENDED = o17;
                                    paginatedListing2 = l$17;
                                    redditSubredditRepository3 = l$26;
                                    userSubredditPaginatedListing = l$18;
                                    o10 = l$19;
                                    o11 = l$20;
                                    o12 = l$21;
                                    o13 = l$22;
                                    o14 = l$23;
                                    o15 = l$25;
                                    if (hg2.j.a == o17) {
                                        return (Serializable)o17;
                                    }
                                }
                            }
                            ((Ref$BooleanRef)o13).element = paginatedListing2.getHasNextPage();
                            ((Ref$ObjectRef)o12).element = paginatedListing2.getEndCursor();
                            ((List)o15).addAll(paginatedListing2.getItems());
                            o33 = o10;
                            o24 = o15;
                            o38 = o16;
                            l$42 = userSubredditPaginatedListing;
                            redditSubredditRepository5 = redditSubredditRepository3;
                            o34 = o11;
                            o37 = o14;
                            o32 = o;
                            o17 = coroutine_SUSPENDED;
                            o35 = o12;
                            o36 = o13;
                        }
                        final PaginatedListing moderated = l$42.getModerated();
                        if (moderated == null) {
                            o29 = o36;
                            o27 = o34;
                            final Object o26 = o33;
                            coroutine_SUSPENDED = o17;
                            o = o32;
                            l$39 = (List)o24;
                            break Label_2484;
                        }
                        final xb0.b k = redditSubredditRepository5.j;
                        final List items3 = moderated.getItems();
                        final boolean b2 = ((Ref$ObjectRef)o33).element == null;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$0 = redditSubredditRepository5;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$1 = o24;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$2 = o38;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$3 = o37;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$4 = o36;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$5 = o35;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$6 = o34;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$7 = o33;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$8 = moderated;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).L$9 = null;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o32).label = 6;
                        if (k.r(items3, b2) == o17) {
                            return (Serializable)o17;
                        }
                        l$13 = o37;
                        final Object o40 = o35;
                        l$9 = o33;
                        l$8 = moderated;
                        l$16 = redditSubredditRepository5;
                        final Object o41 = o38;
                        l$12 = o36;
                        l$10 = o34;
                        l$15 = o24;
                        l$14 = o41;
                        l$11 = o40;
                        o9 = o17;
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
                        final StateFlowImpl x = l$16.x;
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
                        x.setValue((Object)complete3);
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
                        if (hg2.j.a == o9) {
                            return (Serializable)o9;
                        }
                    }
                }
                ((Ref$BooleanRef)o3).element = paginatedListing.getHasNextPage();
                ((Ref$ObjectRef)o2).element = paginatedListing.getEndCursor();
                ((List)o8).addAll(paginatedListing.getItems());
                Object o26 = o2;
                o27 = o3;
                o35 = o4;
                o29 = o5;
                o37 = o6;
                o38 = o7;
                l$39 = (List)o8;
                redditSubredditRepository5 = redditSubredditRepository2;
            }
            if (!((Ref$BooleanRef)o38).element && !((Ref$BooleanRef)o29).element && !((Ref$BooleanRef)o27).element) {
                final HashSet<String> set = new HashSet<String>();
                final ArrayList<SubredditListItem> list = new ArrayList<SubredditListItem>();
                for (final Object next : l$39) {
                    if (set.add(((SubredditListItem)next).getId())) {
                        list.add((SubredditListItem)next);
                    }
                }
                return list;
            }
            RedditSubredditRepository l$40 = redditSubredditRepository5;
            Object o28 = o35;
            Object o30 = o37;
            Object o31 = o38;
            continue;
        }
    }
    
    public final Object s(String l$1, final ArrayList list, final lg2.c c) {
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
            redditSubredditRepository$submitCrowdsourceTaggingAnswer$2 = new RedditSubredditRepository$submitCrowdsourceTaggingAnswer$1(this, c);
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
                    yd.b.k0(result);
                    return l$2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$1 = (String)redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$1;
                redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$0;
                yd.b.k0(result);
                f = result;
            }
        }
        else {
            yd.b.k0(result);
            final RemoteGqlSubredditQuestionsDataSource h = this.h;
            redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$0 = this;
            redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$1 = l$1;
            redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.label = 1;
            f = h.f(l$1, (List)list, (lg2.c)redditSubredditRepository$submitCrowdsourceTaggingAnswer$2, false);
            if (f == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditSubredditRepository = this;
        }
        Object o = f;
        if (!((UpdateResponse)f).getSuccess()) {
            return o;
        }
        final xb0.a i = redditSubredditRepository.i;
        redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$0 = f;
        redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$1 = null;
        redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.label = 2;
        if (i.j(l$1, (ContinuationImpl)redditSubredditRepository$submitCrowdsourceTaggingAnswer$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final Object l$2 = f;
        o = l$2;
        return o;
    }
    
    public final c0 t(final String s, final boolean b) {
        c0<List<Subreddit>> c0;
        if (b) {
            c0 = this.o0(SubredditGroup.SUBSCRIBED, s);
        }
        else {
            Object o;
            if (this.a.I7()) {
                o = RxJavaPlugins.onAssembly((c0<Object>)new SingleFlatMap((ff2.g0)this.q0(SubredditGroup.SUBSCRIBED, s), (o)new u(this, s, 0)));
                sg2.e.e(o, "{\n      getFromSubreddit\u2026)\n        }\n      }\n    }");
            }
            else {
                o = this.q0(SubredditGroup.SUBSCRIBED, s);
            }
            c0 = nn0.a.V((c0)o, (n20.d)this.b).w((o)new n1(5));
            sg2.e.e((Object)c0, "if (membersFeatures.useR\u2026->\n      subreddits\n    }");
        }
        return c0;
    }
    
    public final Object t0(final SubredditGroup subredditGroup, final String s, final lg2.c<? super j> c) {
        Object o = null;
        Label_0056: {
            if (c instanceof RedditSubredditRepository$startSubredditListingFetch$1) {
                final RedditSubredditRepository$startSubredditListingFetch$1 redditSubredditRepository$startSubredditListingFetch$1 = (RedditSubredditRepository$startSubredditListingFetch$1)c;
                final int label = redditSubredditRepository$startSubredditListingFetch$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$startSubredditListingFetch$1.label = label + Integer.MIN_VALUE;
                    o = redditSubredditRepository$startSubredditListingFetch$1;
                    break Label_0056;
                }
            }
            o = new RedditSubredditRepository$startSubredditListingFetch$1(this, (lg2.c)c);
        }
        final Object result = ((RedditSubredditRepository$startSubredditListingFetch$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditSubredditRepository$startSubredditListingFetch$1)o).label;
        Object o2;
        RedditSubredditRepository l$0;
        if (label2 != 0) {
            if (label2 != 1 && label2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o2 = ((RedditSubredditRepository$startSubredditListingFetch$1)o).L$1;
            l$0 = (RedditSubredditRepository)((RedditSubredditRepository$startSubredditListingFetch$1)o).L$0;
            yd.b.k0(result);
        }
        else {
            yd.b.k0(result);
            o2 = new d(subredditGroup, s);
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).L$0 = this;
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).L$1 = o2;
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).label = 1;
            if (this.u0((d)o2, (lg2.c<? super CommunityDrawerListing>)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            l$0 = this;
        }
        while (((d)o2).c != null || ((d)o2).d != null) {
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).L$0 = l$0;
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).L$1 = o2;
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).label = 2;
            if (l$0.u0((d)o2, (lg2.c<? super CommunityDrawerListing>)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return hg2.j.a;
    }
    
    public final Object u(final String s, final String s2, final boolean b, final lg2.c<? super UpdateResponse> c) {
        return this.h.d(s, s2, b, (lg2.c)c);
    }
    
    public final Object u0(final d d, final lg2.c<? super CommunityDrawerListing> c) {
        RedditSubredditRepository$startSubscribedSubredditListingFetch$2 redditSubredditRepository$startSubscribedSubredditListingFetch$3 = null;
        Label_0052: {
            if (c instanceof RedditSubredditRepository$startSubscribedSubredditListingFetch$2) {
                final RedditSubredditRepository$startSubscribedSubredditListingFetch$2 redditSubredditRepository$startSubscribedSubredditListingFetch$2 = (RedditSubredditRepository$startSubscribedSubredditListingFetch$2)c;
                final int label = redditSubredditRepository$startSubscribedSubredditListingFetch$2.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$startSubscribedSubredditListingFetch$2.label = label + Integer.MIN_VALUE;
                    redditSubredditRepository$startSubscribedSubredditListingFetch$3 = redditSubredditRepository$startSubscribedSubredditListingFetch$2;
                    break Label_0052;
                }
            }
            redditSubredditRepository$startSubscribedSubredditListingFetch$3 = new RedditSubredditRepository$startSubscribedSubredditListingFetch$2(this, (lg2.c)c);
        }
        final Object result = redditSubredditRepository$startSubscribedSubredditListingFetch$3.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$startSubscribedSubredditListingFetch$3.label;
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
            final mj2.a c2 = this.p.c();
            final RedditSubredditRepository$startSubscribedSubredditListingFetch$3 redditSubredditRepository$startSubscribedSubredditListingFetch$4 = new RedditSubredditRepository$startSubscribedSubredditListingFetch$3(this, d, (lg2.c)null);
            redditSubredditRepository$startSubscribedSubredditListingFetch$3.label = 1;
            if ((l = ej2.g.l((CoroutineContext)c2, (rg2.p)redditSubredditRepository$startSubscribedSubredditListingFetch$4, (lg2.c)redditSubredditRepository$startSubscribedSubredditListingFetch$3)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(l, "private suspend fun star\u2026ch(key).await()\n    }\n  }");
        return l;
    }
    
    public final c0<RelatedSubredditsResponse> v(final String s) {
        sg2.e.f((Object)s, "subredditId");
        final RemoteGqlSubredditDataSource e = this.e;
        e.getClass();
        final c0 w = e$a.a((mr0.e)e.a, (k)new da(v10.v.e(s, ThingType.SUBREDDIT)), (OkHttpClient)null, (Map)null, 14).w((o)new su.e((Object)e, 10));
        sg2.e.e((Object)w, "graphQlClient\n      .exe\u2026sformer.apply(it)\n      }");
        return nn0.a.V((c0)w, (n20.d)this.b);
    }
    
    public final Object w(lg2.c<? super List<SubredditListItem>> s1) {
        RedditSubredditRepository$fetchAllUserSubredditListItems$1 redditSubredditRepository$fetchAllUserSubredditListItems$1 = null;
        Label_0047: {
            if (s1 instanceof RedditSubredditRepository$fetchAllUserSubredditListItems$1) {
                redditSubredditRepository$fetchAllUserSubredditListItems$1 = (RedditSubredditRepository$fetchAllUserSubredditListItems$1)s1;
                final int label = redditSubredditRepository$fetchAllUserSubredditListItems$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.label = label + Integer.MIN_VALUE;
                    break Label_0047;
                }
            }
            redditSubredditRepository$fetchAllUserSubredditListItems$1 = new RedditSubredditRepository$fetchAllUserSubredditListItems$1(this, (lg2.c)s1);
        }
        final Object result = redditSubredditRepository$fetchAllUserSubredditListItems$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$fetchAllUserSubredditListItems$1.label;
        while (true) {
            List list2 = null;
            Throwable t = null;
            Label_0348: {
                Iterator iterator;
                RedditSubredditRepository l$3;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 != 2) {
                            if (label2 == 3) {
                                final Iterator l$1 = (Iterator)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1;
                                final Throwable l$2 = (Throwable)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0;
                                yd.b.k0(result);
                                break Label_0384;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            final List list = s1 = (List)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0;
                            try {
                                yd.b.k0(result);
                                s1 = list;
                                break Label_0348;
                            }
                            finally {
                                break Label_0348;
                            }
                        }
                    }
                    iterator = (Iterator)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2;
                    s1 = (List)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1;
                    final RedditSubredditRepository redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0;
                    yd.b.k0(result);
                    l$3 = redditSubredditRepository;
                }
                else {
                    yd.b.k0(result);
                    s1 = lw0.b.s1((Object[])new hj2.s[] { (hj2.s)this.v, (hj2.s)this.x, (hj2.s)this.y });
                    iterator = s1.iterator();
                    l$3 = this;
                }
                while (iterator.hasNext()) {
                    final hj2.s s2 = iterator.next();
                    final SubredditListingProgressIndicator loading = SubredditListingProgressIndicator.LOADING;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0 = l$3;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1 = s1;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2 = iterator;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.label = 1;
                    if (((hj2.r)s2).emit((Object)loading, (lg2.c)redditSubredditRepository$fetchAllUserSubredditListItems$1) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                Label_0300: {
                    break Label_0300;
                    final Iterator l$1;
                    final Throwable l$2;
                    while (l$1.hasNext()) {
                        final hj2.s s3 = l$1.next();
                        final SubredditListingProgressIndicator error = SubredditListingProgressIndicator.ERROR;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0 = l$2;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1 = l$1;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2 = null;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.label = 3;
                        if (((hj2.r)s3).emit((Object)error, (lg2.c)redditSubredditRepository$fetchAllUserSubredditListItems$1) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    throw l$2;
                    try {
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0 = s1;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1 = null;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2 = null;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.label = 2;
                        final Serializable r0 = l$3.r0((lg2.c)redditSubredditRepository$fetchAllUserSubredditListItems$1);
                        if (r0 == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        return r0;
                    }
                    finally {
                        list2 = s1;
                        final Throwable t2;
                        t = t2;
                    }
                }
            }
            final Iterator iterator2 = list2.iterator();
            final Throwable l$2 = t;
            final Iterator l$1 = iterator2;
            continue;
        }
    }
    
    public final Object x(final String s, final String s2, final String s3, final lg2.c<? super UpdateResponse> c) {
        return this.e.o(s, s2, s3, (lg2.c)c);
    }
    
    public final c0 y(final String s, final boolean b) {
        c0<List<Subreddit>> c0;
        if (b) {
            c0 = this.o0(SubredditGroup.MODERATING, s);
        }
        else {
            c0 = this.q0(SubredditGroup.MODERATING, s);
        }
        return nn0.a.V((c0)c0, (n20.d)this.b);
    }
    
    public final Object z(final ArrayList list, final lg2.c c) {
        final j w = this.j.w(list);
        if (w == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return w;
        }
        return hg2.j.a;
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lcom/reddit/data/repository/RedditSubredditRepository$SubredditGroup;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "FAVORITES", "FOLLOWING", "SUBSCRIBED", "MODERATING", "data_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum SubredditGroup
    {
        FAVORITES("favorites"), 
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
    
    public static final class b implements pt.d<Subreddit, String>
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
            sg2.e.f((Object)s, "key");
            sg2.e.f((Object)subreddit, "subreddit");
            return this.a.invoke(subreddit);
        }
        
        public final n c(final Object o) {
            final String s = (String)o;
            sg2.e.f((Object)s, "key");
            return this.b.invoke(s);
        }
    }
    
    public static final class c
    {
        public final SubredditGroup a;
        public final String b;
        
        public c(final SubredditGroup a, final String b) {
            sg2.e.f((Object)a, "group");
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
            sg2.e.f((Object)a, "group");
            this.a = a;
            this.b = b;
            this.c = null;
            this.d = null;
        }
    }
    
    public static final class e implements pt.d<List<? extends Subreddit>, a>
    {
        public final rg2.p<List<Subreddit>, String, c0<Boolean>> a;
        public final l<String, n<List<Subreddit>>> b;
        
        public e(final l b, final rg2.p a) {
            this.a = a;
            this.b = b;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final a a = (a)o;
            final List list = (List)o2;
            sg2.e.f((Object)a, "key");
            sg2.e.f((Object)list, "subreddits");
            return this.a.invoke(list, a.toString());
        }
        
        public final n c(final Object o) {
            final a a = (a)o;
            sg2.e.f((Object)a, "key");
            return this.b.invoke(a.toString());
        }
    }
    
    public static final class f implements pt.d<CommunityDrawerListing, d>
    {
        public final rg2.p<SubredditGroup, CommunityDrawerListing, c0<Boolean>> a;
        public final l<SubredditGroup, n<CommunityDrawerListing>> b;
        
        public f(final l b, final rg2.p a) {
            this.a = a;
            this.b = b;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final d d = (d)o;
            final CommunityDrawerListing communityDrawerListing = (CommunityDrawerListing)o2;
            sg2.e.f((Object)d, "key");
            sg2.e.f((Object)communityDrawerListing, "subscriptions");
            return this.a.invoke(d.a, communityDrawerListing);
        }
        
        public final n c(final Object o) {
            final d d = (d)o;
            sg2.e.f((Object)d, "key");
            return this.b.invoke(d.a);
        }
    }
    
    public static final class g implements pt.d<List<? extends Subreddit>, c>
    {
        public final rg2.p<SubredditGroup, List<Subreddit>, c0<Boolean>> a;
        public final l<SubredditGroup, n<List<Subreddit>>> b;
        
        public g(final l b, final rg2.p a) {
            this.a = a;
            this.b = b;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final c c = (c)o;
            final List list = (List)o2;
            sg2.e.f((Object)c, "key");
            sg2.e.f((Object)list, "subscriptions");
            return this.a.invoke(c.a, list);
        }
        
        public final n c(final Object o) {
            final c c = (c)o;
            sg2.e.f((Object)c, "key");
            return this.b.invoke(c.a);
        }
    }
}
