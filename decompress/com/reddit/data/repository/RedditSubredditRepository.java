// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import b60.r1;
import kotlin.coroutines.CoroutineContext;
import com.reddit.queries.da;
import com.reddit.domain.model.RelatedSubredditsResponse;
import com.reddit.domain.model.CommunityDrawerListing;
import io.reactivex.internal.operators.single.SingleFlatMap;
import com.reddit.domain.model.tagging.SubredditTaggingQuestions;
import java.util.HashSet;
import com.reddit.common.experiments.model.mainactivity.BigFishSubredditOptimizationVariant$a;
import com.reddit.common.experiments.model.mainactivity.BigFishSubredditOptimizationVariant;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.reddit.domain.model.UserSubredditPaginatedListing;
import com.reddit.domain.model.PaginatedListing;
import java.util.LinkedHashMap;
import com.reddit.domain.model.SubredditListItem;
import com.reddit.domain.model.Mappings;
import com.reddit.domain.model.Regions;
import com.reddit.domain.model.SubredditCounterpartMapping;
import com.reddit.structuredstyles.model.StructuredStyle;
import com.reddit.domain.model.tagging.CrowdsourceTaggingQuestion;
import com.reddit.domain.model.communitycreation.SubredditTopic;
import com.reddit.domain.model.tagging.SubredditRatingSurveyAnswers;
import java.util.Collection;
import com.reddit.domain.model.SubredditTriggeredInvite;
import y12.a0;
import com.reddit.domain.model.communitycreation.CreateSubredditResult;
import com.reddit.domain.model.communitycreation.CreateSubreddit;
import java.io.Serializable;
import com.reddit.domain.model.Result;
import af2.g0;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import b60.u1;
import b60.t1;
import b60.s1;
import y12.b5;
import com.reddit.mutations.e9;
import com.reddit.data.model.graphql.GqlCreateUpdateSubredditMapper;
import com.reddit.domain.model.communitysettings.UpdateSubredditSettings;
import y10.w;
import com.reddit.common.ThingType;
import com.reddit.notification.common.NotificationLevel;
import kotlinx.coroutines.flow.CancellableFlowImpl;
import com.reddit.domain.model.UserSubredditListings;
import com.reddit.queries.r0;
import com.reddit.domain.model.communitycreation.SubredditTopicsResult;
import java.util.Iterator;
import com.reddit.domain.model.Ambassador;
import com.reddit.domain.model.Ambassadors;
import cg2.j;
import b60.n0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import af2.t;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import mr0.e$a;
import com.reddit.queries.zd;
import h7.h$a;
import com.reddit.domain.model.communitycreation.SubredditNameValidationResult;
import af2.c0;
import io.reactivex.plugins.RxJavaPlugins;
import af2.r;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import b60.v1;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.Subreddit;
import af2.n;
import com.reddit.domain.model.UpdateResponse;
import com.reddit.domain.model.SubredditAction;
import mg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.SubredditActionSource;
import java.util.ArrayList;
import q20.d;
import mg.d0;
import java.util.Set;
import java.io.InputStream;
import java.io.Closeable;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.inject.Inject;
import com.reddit.domain.model.SubredditListingProgressIndicator;
import dg.l0;
import kotlinx.coroutines.channels.BufferOverflow;
import ng2.e;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.g;
import android.content.Context;
import s12.c;
import com.reddit.session.o;
import xd0.m;
import com.squareup.moshi.y;
import x12.p;
import wb0.b;
import com.reddit.data.remote.RemoteGqlSubredditQuestionsDataSource;
import com.reddit.data.remote.RemoteGqlSubredditTopicsDataSource;
import xd0.h;
import com.reddit.data.remote.RemoteGqlSubredditDataSource;
import com.reddit.data.remote.RemoteSubredditStatsDataSource;
import com.reddit.data.remote.RemoteSubredditDataSource;
import q20.a;
import wa0.q;
import cg2.f;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xd0.h0;

public final class RedditSubredditRepository implements h0
{
    public static final Pair<Long, TimeUnit> G;
    public final cg2.f A;
    public final cg2.f B;
    public final cg2.f C;
    public final cg2.f D;
    public final cg2.f E;
    public final cg2.f F;
    public final q a;
    public final q20.a b;
    public final RemoteSubredditDataSource c;
    public final RemoteSubredditStatsDataSource d;
    public final RemoteGqlSubredditDataSource e;
    public final h f;
    public final RemoteGqlSubredditTopicsDataSource g;
    public final RemoteGqlSubredditQuestionsDataSource h;
    public final wb0.a i;
    public final wb0.b j;
    public final p k;
    public final y l;
    public final m m;
    public final wa0.p n;
    public final o o;
    public final d20.a p;
    public final dw0.a q;
    public final c r;
    public final Context s;
    public final wa0.b t;
    public final kotlinx.coroutines.flow.g u;
    public final StateFlowImpl v;
    public final kotlinx.coroutines.flow.g w;
    public final StateFlowImpl x;
    public final StateFlowImpl y;
    public final cg2.f z;
    
    static {
        G = new Pair((Object)1L, (Object)TimeUnit.HOURS);
    }
    
    @Inject
    public RedditSubredditRepository(final q a, final q20.a b, final RemoteSubredditDataSource c, final RemoteSubredditStatsDataSource d, final RemoteGqlSubredditDataSource e, final h f, final RemoteGqlSubredditTopicsDataSource g, final RemoteGqlSubredditQuestionsDataSource h, final wb0.a i, final wb0.b j, final p k, final y l, final m m, final wa0.p n, final o o, final d20.a p20, final dw0.a q, final c r, final Context s, final wa0.b t) {
        ng2.e.f((Object)a, "membersFeatures");
        ng2.e.f((Object)b, "backgroundThread");
        ng2.e.f((Object)c, "remote");
        ng2.e.f((Object)d, "remoteStats");
        ng2.e.f((Object)e, "remoteGql");
        ng2.e.f((Object)f, "inboxNotificationSettingsRepository");
        ng2.e.f((Object)g, "subredditTopicsRemoteGql");
        ng2.e.f((Object)h, "subredditQuestionsDataSource");
        ng2.e.f((Object)i, "localSubredditQuestionsDataSource");
        ng2.e.f((Object)j, "local");
        ng2.e.f((Object)k, "trackingDelegate");
        ng2.e.f((Object)l, "moshi");
        ng2.e.f((Object)m, "myAccountRepository");
        ng2.e.f((Object)n, "mainActivityFeatures");
        ng2.e.f((Object)o, "sessionView");
        ng2.e.f((Object)p20, "dispatcherProvider");
        ng2.e.f((Object)q, "logger");
        ng2.e.f((Object)r, "tracingFeatures");
        ng2.e.f((Object)s, "context");
        ng2.e.f((Object)t, "channelsFeatures");
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
        this.u = l0.m(1, 0, drop_OLDEST, 2);
        final SubredditListingProgressIndicator complete = SubredditListingProgressIndicator.COMPLETE;
        this.v = xd.a.h((Object)complete);
        this.w = l0.m(1, 0, drop_OLDEST, 2);
        this.x = xd.a.h((Object)complete);
        this.y = xd.a.h((Object)complete);
        this.z = kotlin.a.b((mg2.a)new RedditSubredditRepository$subredditAboutStore$2(this));
        this.A = kotlin.a.b((mg2.a)new RedditSubredditRepository$quarantinedSubredditAboutStore$2(this));
        this.B = kotlin.a.b((mg2.a)new RedditSubredditRepository$structuredStyleStore$2(this));
        this.C = kotlin.a.b((mg2.a)new RedditSubredditRepository$crosspostableSubredditsStore$2(this));
        this.D = kotlin.a.b((mg2.a)new RedditSubredditRepository$subredditListingStore$2(this));
        this.E = kotlin.a.b((mg2.a)new RedditSubredditRepository$subredditListingGroupStore$2(this));
        this.F = kotlin.a.b((mg2.a)new RedditSubredditRepository$subredditGroupStore$2(this));
    }
    
    public static String s0(Context o, String b) {
        final InputStream open = ((Context)o).getAssets().open((String)b);
        ng2.e.e((Object)open, "context.assets.open(fileName)");
        final InputStreamReader inputStreamReader = new InputStreamReader(open, xi2.a.b);
        if (inputStreamReader instanceof BufferedReader) {
            o = inputStreamReader;
        }
        else {
            o = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            b = kotlin.io.a.b((Reader)o);
            zd.b.u((Closeable)o, null);
            return (String)b;
        }
        finally {
            try {}
            finally {
                zd.b.u((Closeable)o, (Throwable)b);
            }
        }
    }
    
    @Override
    public final Object A(final gg2.c<? super Set<String>> c) {
        return this.j.J();
    }
    
    @Override
    public final af2.a B(final String s) {
        ng2.e.f((Object)s, "subredditName");
        return d0.S0(this.c.optInGatedSubreddit(s, "yes"), (d)this.b);
    }
    
    @Override
    public final af2.a C(final ArrayList list, final SubredditActionSource subredditActionSource) {
        this.p0().clear();
        final af2.a setSubscriptionState = this.c.setSubscriptionState(CollectionsKt___CollectionsKt.a5((Iterable)list, (CharSequence)",", (String)null, (String)null, (l)null, 62), SubredditAction.UNSUBSCRIBE, subredditActionSource);
        final af2.a k = this.j.o(list).K();
        ng2.e.e((Object)k, "local.unsubscribeSubredd\u2026dditList).toCompletable()");
        final af2.a e = setSubscriptionState.e((af2.e)k);
        ng2.e.e((Object)e, "remoteSubscribeList.andThen(localSubscribe)");
        return d0.S0(e, (d)this.b);
    }
    
    @Override
    public final Object D(final String s, final String s2, final gg2.c<? super UpdateResponse> c) {
        return this.h.a(s, s2, (gg2.c)c);
    }
    
    @Override
    public final n<Subreddit> E(final String s, final boolean b) {
        ng2.e.f((Object)s, "subredditName");
        n n;
        if (b) {
            final Object value = this.z.getValue();
            ng2.e.e(value, "<get-subredditAboutStore>(...)");
            final n m = ((Store)value).m((Object)s).M();
            final v1 v1 = new v1(this, s, 0);
            m.getClass();
            n = RxJavaPlugins.onAssembly((n)new MaybeOnErrorNext((r)m, (ff2.o)v1));
            ng2.e.e((Object)n, "{\n      subredditAboutSt\u2026dditName)\n        }\n    }");
        }
        else {
            n = this.j.w(s);
        }
        return px1.a.J0(n, (d)this.b);
    }
    
    @Override
    public final c0<SubredditNameValidationResult> F(final String s) {
        ng2.e.f((Object)s, "subredditName");
        final RemoteGqlSubredditDataSource e = this.e;
        e.getClass();
        final c0 w = px1.a.K0(e$a.a((mr0.e)e.a, (k)new zd(new y12.c0(h$a.c((Object)s), 14)), (OkHttpClient)null, (Map)null, 14), (d)e.d).w((ff2.o)new lv.b(10));
        ng2.e.e((Object)w, "graphQlClient\n      .exe\u2026?.code,\n        )\n      }");
        return px1.a.K0((c0)w, (d)this.b);
    }
    
    @Override
    public final t G() {
        final t n = this.j.F(3).N();
        ng2.e.e((Object)n, "local.getRecentSubreddit\u2026t = limit).toObservable()");
        return px0.c.T2((t)n, this.b);
    }
    
    @Override
    public final Object H(String l$1, final gg2.c<? super UpdateResponse> c) {
        RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 = null;
        Label_0051: {
            if (c instanceof RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1) {
                redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 = (RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1)c;
                final int label = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label = label + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1 = new RedditSubredditRepository$dismissCrowdsourceTaggingQuestion$1(this, (gg2.c)c);
        }
        Object l$2 = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label;
        RedditSubredditRepository redditSubredditRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final Object l$3 = redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$0;
                    cg.d.b4(l$2);
                    return l$3;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$1 = (String)redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$1;
                redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$0;
                cg.d.b4(l$2);
            }
        }
        else {
            cg.d.b4(l$2);
            final RemoteGqlSubredditQuestionsDataSource h = this.h;
            final EmptyList instance = EmptyList.INSTANCE;
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$0 = this;
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.L$1 = l$1;
            redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1.label = 1;
            l$2 = h.f(l$1, (List)instance, (gg2.c)redditSubredditRepository$dismissCrowdsourceTaggingQuestion$1, true);
            if (l$2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditSubredditRepository = this;
        }
        Object o = l$2;
        if (!((UpdateResponse)l$2).getSuccess()) {
            return o;
        }
        final wb0.a i = redditSubredditRepository.i;
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
    
    @Override
    public final kotlinx.coroutines.flow.f I() {
        final kotlinx.coroutines.flow.g u = this.u;
        final t map = this.j.n().map((ff2.o)new n0(6));
        ng2.e.e((Object)map, "local.observeFollowingSu\u2026tyDrawerListing(it)\n    }");
        return new kotlinx.coroutines.flow.f((cj2.e)u, (cj2.e)kotlinx.coroutines.rx2.e.b(map), (mg2.q)new RedditSubredditRepository$observeFollowingSubredditsListing$2((gg2.c)null));
    }
    
    @Override
    public final Object J(final String s, final gg2.c<? super j> c) {
        final Object t0 = this.t0(RedditSubredditRepository$SubredditGroup.SUBSCRIBED, s, c);
        if (t0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return t0;
        }
        return cg2.j.a;
    }
    
    @Override
    public final List<String> K() {
        final Ambassadors ambassadors = (Ambassadors)new t31.c(true).c().a((Class)Ambassadors.class).fromJson(s0(this.s, "reddit_ambassadors.json"));
        if (ambassadors != null) {
            final List list = ambassadors.getList();
            if (list != null) {
                final ArrayList list2 = new ArrayList(dg2.m.u4((Iterable)list, 10));
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
    
    @Override
    public final c0<List<String>> L(final String s) {
        ng2.e.f((Object)s, "subredditId");
        final c0<EmptyList> y = this.j.Q(s).g(EmptyList.INSTANCE).y();
        ng2.e.e((Object)y, "local.getPinnedPosts(sub\u2026y(emptyList()).toSingle()");
        return (c0<List<String>>)y;
    }
    
    @Override
    public final c0 M() {
        return px1.a.K0(this.j.F(25), (d)this.b);
    }
    
    @Override
    public final Object N(final String s, final String s2, final gg2.c<? super UpdateResponse> c) {
        return this.g.b(s, s2, (gg2.c)c);
    }
    
    @Override
    public final kotlinx.coroutines.flow.f O() {
        final kotlinx.coroutines.flow.g u = this.u;
        final t map = this.j.y().map((ff2.o)new n0(8));
        ng2.e.e((Object)map, "local.observeSubscribedS\u2026tyDrawerListing(it)\n    }");
        return new kotlinx.coroutines.flow.f((cj2.e)u, (cj2.e)kotlinx.coroutines.rx2.e.b(map), (mg2.q)new RedditSubredditRepository$observeSubscribedSubredditsListing$2((gg2.c)null));
    }
    
    @Override
    public final c0<SubredditTopicsResult> P(final int n, final String s, final boolean b) {
        final RemoteGqlSubredditTopicsDataSource g = this.g;
        final c0 w = px1.a.K0(e$a.a((mr0.e)g.a, (k)new r0(h$a.c((Object)n), h$a.c((Object)s), h$a.c((Object)b)), (OkHttpClient)null, (Map)null, 14), (d)g.b).w((ff2.o)new l10.h(7)).w((ff2.o)new su.d(11));
        ng2.e.e((Object)w, "graphQlClient\n      .exe\u2026     },\n        )\n      }");
        return px1.a.K0((c0)w, (d)this.b);
    }
    
    @Override
    public final t Q(final String s, final boolean b) {
        t<List<Subreddit>> t;
        if (b) {
            t = this.o0(RedditSubredditRepository$SubredditGroup.SUBSCRIBED, s).N().mergeWith((af2.y<? extends List<Subreddit>>)this.j.y());
        }
        else {
            t = this.q0(RedditSubredditRepository$SubredditGroup.SUBSCRIBED, s).N().mergeWith((af2.y<? extends List<Subreddit>>)this.j.y());
        }
        ng2.e.e((Object)t, "if (refresh) {\n      fet\u2026cribedSubreddits())\n    }");
        return px0.c.T2((t)t, this.b);
    }
    
    @Override
    public final Object R(final gg2.c<? super cj2.e<UserSubredditListings>> c) {
        RedditSubredditRepository$observeUserSubredditListings$1 redditSubredditRepository$observeUserSubredditListings$1 = null;
        Label_0051: {
            if (c instanceof RedditSubredditRepository$observeUserSubredditListings$1) {
                redditSubredditRepository$observeUserSubredditListings$1 = (RedditSubredditRepository$observeUserSubredditListings$1)c;
                final int label = redditSubredditRepository$observeUserSubredditListings$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$observeUserSubredditListings$1.label = label + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            redditSubredditRepository$observeUserSubredditListings$1 = new RedditSubredditRepository$observeUserSubredditListings$1(this, (gg2.c)c);
        }
        Object o = redditSubredditRepository$observeUserSubredditListings$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$observeUserSubredditListings$1.label;
        RedditSubredditRepository redditSubredditRepository = null;
        Object o3 = null;
        Object o4 = null;
        Object k = null;
        Label_0373: {
            Object o2 = null;
            Label_0292: {
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            o2 = redditSubredditRepository$observeUserSubredditListings$1.L$1;
                            redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$observeUserSubredditListings$1.L$0;
                            cg.d.b4(o);
                            break Label_0292;
                        }
                        if (label2 == 3) {
                            o3 = redditSubredditRepository$observeUserSubredditListings$1.L$2;
                            final cj2.e e = (cj2.e)redditSubredditRepository$observeUserSubredditListings$1.L$1;
                            redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$observeUserSubredditListings$1.L$0;
                            cg.d.b4(o);
                            o4 = e;
                            k = o;
                            break Label_0373;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$observeUserSubredditListings$1.L$0;
                        cg.d.b4(o);
                    }
                }
                else {
                    cg.d.b4(o);
                    final wb0.b j = this.j;
                    redditSubredditRepository$observeUserSubredditListings$1.L$0 = this;
                    redditSubredditRepository$observeUserSubredditListings$1.label = 1;
                    o = j.s();
                    if (o == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    redditSubredditRepository = this;
                }
                o2 = new kotlinx.coroutines.flow.f((cj2.e)o, (cj2.e)redditSubredditRepository.v, (mg2.q)new RedditSubredditRepository$observeUserSubredditListings$subscribedFlow$1((gg2.c)null));
                final wb0.b i = redditSubredditRepository.j;
                redditSubredditRepository$observeUserSubredditListings$1.L$0 = redditSubredditRepository;
                redditSubredditRepository$observeUserSubredditListings$1.L$1 = o2;
                redditSubredditRepository$observeUserSubredditListings$1.label = 2;
                if ((o = i.p()) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final kotlinx.coroutines.flow.f l$2 = new kotlinx.coroutines.flow.f((cj2.e)o, (cj2.e)redditSubredditRepository.x, (mg2.q)new RedditSubredditRepository$observeUserSubredditListings$moderatingFlow$1((gg2.c)null));
            final wb0.b l = redditSubredditRepository.j;
            redditSubredditRepository$observeUserSubredditListings$1.L$0 = redditSubredditRepository;
            redditSubredditRepository$observeUserSubredditListings$1.L$1 = o2;
            redditSubredditRepository$observeUserSubredditListings$1.L$2 = l$2;
            redditSubredditRepository$observeUserSubredditListings$1.label = 3;
            k = l.K();
            if (k == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o4 = o2;
            o3 = l$2;
        }
        Object q = p2.b.q((cj2.e)o4, (cj2.e)o3, (cj2.e)new kotlinx.coroutines.flow.f((cj2.e)k, (cj2.e)redditSubredditRepository.y, (mg2.q)new RedditSubredditRepository$observeUserSubredditListings$followingFlow$1((gg2.c)null)), (mg2.r)new RedditSubredditRepository$observeUserSubredditListings$2((gg2.c)null));
        if (!(q instanceof cj2.a)) {
            q = new CancellableFlowImpl((cj2.e<?>)q);
        }
        return q;
    }
    
    @Override
    public final af2.a S(final String s, final String s2, final NotificationLevel notificationLevel) {
        ng2.e.f((Object)s, "subredditKindWithId");
        ng2.e.f((Object)s2, "subredditName");
        ng2.e.f((Object)notificationLevel, "notificationLevel");
        final af2.a i = xd.a.k1((mg2.p)new RedditSubredditRepository$updateNotificationLevel$1(this, s, notificationLevel, (gg2.c)null)).i((af2.e)this.j.E(s2, notificationLevel).K());
        ng2.e.e((Object)i, "override fun updateNotif\u2026eOn(backgroundThread)\n  }");
        return d0.S0(i, (d)this.b);
    }
    
    @Override
    public final Object T(final String s, final ContinuationImpl continuationImpl) {
        return this.e.i(s, (gg2.c)continuationImpl);
    }
    
    @Override
    public final c0<Boolean> U(final Subreddit subreddit) {
        ng2.e.f((Object)subreddit, "subreddit");
        return px1.a.K0(this.j.O(subreddit), (d)this.b);
    }
    
    @Override
    public final c0<Set<String>> V(final String s) {
        final c0 value = this.p0().get((Object)s);
        ng2.e.e((Object)value, "crosspostableSubredditsStore.get(username)");
        return px1.a.K0(value, (d)this.b);
    }
    
    @Override
    public final Object W(final String s, final gg2.c<? super j> c) {
        final Object t0 = this.t0(RedditSubredditRepository$SubredditGroup.MODERATING, s, c);
        if (t0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return t0;
        }
        return cg2.j.a;
    }
    
    @Override
    public final Object X(final String l$1, boolean z$0, final gg2.c<? super UpdateResponse> c) {
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
            o = new RedditSubredditRepository$updateFavoriteState$1(this, (gg2.c)c);
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
                        cg.d.b4(o2);
                        break Label_0279;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    z$0 = ((RedditSubredditRepository$updateFavoriteState$1)o).Z$0;
                    s = (String)((RedditSubredditRepository$updateFavoriteState$1)o).L$1;
                    l$2 = (RedditSubredditRepository)((RedditSubredditRepository$updateFavoriteState$1)o).L$0;
                    cg.d.b4(o2);
                }
            }
            else {
                cg.d.b4(o2);
                final String e = y10.w.e(l$1, ThingType.SUBREDDIT);
                final RemoteGqlSubredditDataSource e2 = this.e;
                ((RedditSubredditRepository$updateFavoriteState$1)o).L$0 = this;
                ((RedditSubredditRepository$updateFavoriteState$1)o).L$1 = l$1;
                ((RedditSubredditRepository$updateFavoriteState$1)o).Z$0 = z$0;
                ((RedditSubredditRepository$updateFavoriteState$1)o).label = 1;
                o2 = e2.p(e, z$0, (gg2.c)o);
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
            if ((o2 = kotlinx.coroutines.rx2.d.b(t, (gg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        if (!(boolean)o2) {
            return new UpdateResponse(false, (String)null);
        }
        final RedditSubredditRepository$SubredditGroup subscribed = RedditSubredditRepository$SubredditGroup.SUBSCRIBED;
        final Object value = l$2.F.getValue();
        ng2.e.e(value, "<get-subredditGroupStore>(...)");
        ((Store)value).a((Object)new RedditSubredditRepository$c(subscribed, (String)null));
        return new UpdateResponse(true, (String)null);
    }
    
    @Override
    public final Object Y(final ArrayList list, final gg2.c c) {
        final j v = this.j.v(list);
        if (v == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return v;
        }
        return cg2.j.a;
    }
    
    @Override
    public final Object Z(final String s, final String s2, final gg2.c<? super UpdateResponse> c) {
        return this.h.b(s, s2, (gg2.c)c);
    }
    
    @Override
    public final af2.a a(final String s) {
        ng2.e.f((Object)s, "subredditId");
        return d0.S0(this.j.a(s), (d)this.b);
    }
    
    @Override
    public final c0<UpdateResponse> a0(final UpdateSubredditSettings updateSubredditSettings) {
        final RemoteGqlSubredditDataSource e = this.e;
        final b5 map = GqlCreateUpdateSubredditMapper.INSTANCE.map(updateSubredditSettings);
        e.getClass();
        ng2.e.f((Object)map, "input");
        final c0 w = px1.a.K0(e$a.a((mr0.e)e.a, (k)new e9(map), (OkHttpClient)null, (Map)null, 14), (d)e.d).w((ff2.o)new su.d(10));
        ng2.e.e((Object)w, "graphQlClient\n      .exe\u2026essage,\n        )\n      }");
        return w;
    }
    
    @Override
    public final af2.a b(final String s) {
        ng2.e.f((Object)s, "subredditName");
        return this.j.b(s);
    }
    
    @Override
    public final af2.a b0(final String s) {
        ng2.e.f((Object)s, "subredditName");
        return d0.S0(this.c.optInQuarantinedSubreddit(s, "yes"), (d)this.b);
    }
    
    @Override
    public final c0<Boolean> c(final String s) {
        ng2.e.f((Object)s, "subredditName");
        final af2.a setSubscriptionState = this.c.setSubscriptionState(s, SubredditAction.UNSUBSCRIBE, (SubredditActionSource)null);
        af2.a a;
        if (r20.a.c(s)) {
            a = this.j.u(s).k((ff2.a)new s1(this, s));
        }
        else {
            a = af2.a.h();
        }
        final af2.a r = af2.a.r((af2.e)a, (af2.e)this.j.m(s));
        ng2.e.e((Object)r, "mergeArray(\n      unfoll\u2026dit(subredditName),\n    )");
        final af2.a e = setSubscriptionState.e((af2.e)r);
        ng2.e.e((Object)e, "unsubscribeSubreddit\n   \u2026andThen(unsubscribeLocal)");
        final c0<Boolean> b = d0.S0(e, (d)this.b).B(Boolean.TRUE);
        ng2.e.e((Object)b, "unsubscribeSubreddit\n   \u2026   .toSingleDefault(true)");
        return b;
    }
    
    @Override
    public final af2.a c0(final List<String> list, final SubredditActionSource subredditActionSource) {
        ng2.e.f((Object)list, "subredditList");
        this.p0().clear();
        final af2.a e = this.c.setSubscriptionState(CollectionsKt___CollectionsKt.a5((Iterable)list, (CharSequence)",", (String)null, (String)null, (l)null, 62), SubredditAction.SUBSCRIBE, subredditActionSource).e((af2.e)af2.t.fromIterable((Iterable<?>)list).flatMapCompletable((ff2.o<? super Object, ? extends af2.e>)new b60.q((Object)this, 5)));
        ng2.e.e((Object)e, "remoteSubscribeList.andThen(localSubscribe)");
        return d0.S0(e, (d)this.b);
    }
    
    @Override
    public final af2.a d(final String s) {
        ng2.e.f((Object)s, "subredditName");
        return this.j.d(s);
    }
    
    @Override
    public final t d0(final String s, final boolean b) {
        t<List<Subreddit>> t;
        if (b) {
            t = this.o0(RedditSubredditRepository$SubredditGroup.MODERATING, s).N().mergeWith((af2.y<? extends List<Subreddit>>)this.j.C());
        }
        else {
            t = this.q0(RedditSubredditRepository$SubredditGroup.MODERATING, s).N().mergeWith((af2.y<? extends List<Subreddit>>)this.j.C());
        }
        ng2.e.e((Object)t, "if (refresh) {\n      fet\u2026ratingSubreddits())\n    }");
        return px0.c.T2((t)t, this.b);
    }
    
    @Override
    public final c0<Boolean> e(final String s) {
        ng2.e.f((Object)s, "subredditName");
        this.p0().clear();
        final af2.a setSubscriptionState = this.c.setSubscriptionState(s, SubredditAction.SUBSCRIBE, (SubredditActionSource)null);
        af2.a a;
        if (r20.a.c(s)) {
            a = this.j.k(s).k((ff2.a)new t1(this, s));
        }
        else {
            a = af2.a.h();
        }
        final c0 n = this.j.N(s);
        final u1 u1 = new u1(this, s, 0);
        n.getClass();
        final af2.a r = af2.a.r((af2.e)a, (af2.e)RxJavaPlugins.onAssembly((af2.a)new SingleFlatMapCompletable<Object>((af2.g0<?>)n, (ff2.o<?, ? extends af2.e>)u1)));
        ng2.e.e((Object)r, "mergeArray(\n      follow\u2026       }\n        },\n    )");
        final af2.a e = setSubscriptionState.e((af2.e)r);
        ng2.e.e((Object)e, "remoteSubscribe\n      .andThen(localSubscribe)");
        final c0<Boolean> b = d0.S0(e, (d)this.b).B(Boolean.TRUE);
        ng2.e.e((Object)b, "remoteSubscribe\n      .a\u2026   .toSingleDefault(true)");
        return b;
    }
    
    @Override
    public final Object e0(final String s, final gg2.c<? super Result<Boolean>> c) {
        if (r20.a.c(s)) {
            return this.e.c(r20.a.i(s), (gg2.c)c);
        }
        return this.e.h(r20.a.h(s), (gg2.c)c);
    }
    
    @Override
    public final af2.a f(final String s) {
        ng2.e.f((Object)s, "kindWithId");
        return d0.S0(this.j.f(s), (d)this.b);
    }
    
    @Override
    public final Object f0(final String s, final String s2, final gg2.c<? super UpdateResponse> c) {
        return this.h.c(s, s2, (gg2.c)c);
    }
    
    @Override
    public final c0<List<Subreddit>> g() {
        return px1.a.K0(this.j.g(), (d)this.b);
    }
    
    @Override
    public final t g0(final String s, final boolean b) {
        t<List<Subreddit>> t;
        if (b) {
            t = this.o0(RedditSubredditRepository$SubredditGroup.FOLLOWING, s).N().mergeWith((af2.y<? extends List<Subreddit>>)this.j.n());
        }
        else {
            t = this.q0(RedditSubredditRepository$SubredditGroup.FOLLOWING, s).N().mergeWith((af2.y<? extends List<Subreddit>>)this.j.n());
        }
        ng2.e.e((Object)t, "if (refresh) {\n      fet\u2026lowingSubreddits())\n    }");
        return px0.c.T2((t)t, this.b);
    }
    
    @Override
    public final af2.a h(final String s) {
        ng2.e.f((Object)s, "subredditName");
        return this.j.h(s);
    }
    
    @Override
    public final Serializable h0(final List list, final gg2.c c) {
        final RemoteGqlSubredditDataSource e = this.e;
        final ArrayList list2 = new ArrayList(dg2.m.u4((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(r20.a.i((String)iterator.next()));
        }
        return e.e(list2, c);
    }
    
    @Override
    public final af2.a i() {
        return this.j.i();
    }
    
    @Override
    public final c0<CreateSubredditResult> i0(final CreateSubreddit createSubreddit) {
        final RemoteGqlSubredditDataSource e = this.e;
        final a0 map = GqlCreateUpdateSubredditMapper.INSTANCE.map(createSubreddit);
        e.getClass();
        ng2.e.f((Object)map, "input");
        final c0 w = px1.a.K0(e$a.a((mr0.e)e.a, (k)new com.reddit.mutations.s1(map), (OkHttpClient)null, (Map)null, 14), (d)e.d).w((ff2.o)new l10.q(8));
        ng2.e.e((Object)w, "graphQlClient\n      .exe\u2026essage,\n        )\n      }");
        return w;
    }
    
    @Override
    public final n<List<SubredditTriggeredInvite>> j() {
        return this.j.j();
    }
    
    @Override
    public final Object j0(final List<String> list, final gg2.c<? super List<Subreddit>> c) {
        return this.e.k((List)list, (gg2.c)c);
    }
    
    @Override
    public final af2.a k(final String s, final ArrayList list) {
        ng2.e.f((Object)s, "subredditId");
        return this.j.P(s, list);
    }
    
    @Override
    public final c0<Boolean> k0(final List<Subreddit> list) {
        ng2.e.f((Object)list, "subreddits");
        return px1.a.K0(this.j.I((Collection)list), (d)this.b);
    }
    
    @Override
    public final c0<List<Subreddit>> l(final String s) {
        return px1.a.K0((c0)this.q0(RedditSubredditRepository$SubredditGroup.FAVORITES, s), (d)this.b);
    }
    
    @Override
    public final Object l0(final String s, final SubredditRatingSurveyAnswers subredditRatingSurveyAnswers, final gg2.c<? super UpdateResponse> c) {
        return this.h.g(s, subredditRatingSurveyAnswers, (gg2.c)c);
    }
    
    @Override
    public final Object m(final String s, final gg2.c<? super Subreddit> c) {
        RedditSubredditRepository$getOrFetchSubreddit$1 redditSubredditRepository$getOrFetchSubreddit$2 = null;
        Label_0053: {
            if (c instanceof RedditSubredditRepository$getOrFetchSubreddit$1) {
                final RedditSubredditRepository$getOrFetchSubreddit$1 redditSubredditRepository$getOrFetchSubreddit$1 = (RedditSubredditRepository$getOrFetchSubreddit$1)c;
                final int label = redditSubredditRepository$getOrFetchSubreddit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$getOrFetchSubreddit$1.label = label + Integer.MIN_VALUE;
                    redditSubredditRepository$getOrFetchSubreddit$2 = redditSubredditRepository$getOrFetchSubreddit$1;
                    break Label_0053;
                }
            }
            redditSubredditRepository$getOrFetchSubreddit$2 = new RedditSubredditRepository$getOrFetchSubreddit$1(this, (gg2.c)c);
        }
        final Object result = redditSubredditRepository$getOrFetchSubreddit$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$getOrFetchSubreddit$2.label;
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
            final Object value = this.z.getValue();
            ng2.e.e(value, "<get-subredditAboutStore>(...)");
            final c0 value2 = ((Store)value).get((Object)s);
            ng2.e.e((Object)value2, "subredditAboutStore.get(subredditName)");
            final c0 k0 = px1.a.K0(value2, (d)this.b);
            redditSubredditRepository$getOrFetchSubreddit$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(k0, (gg2.c)redditSubredditRepository$getOrFetchSubreddit$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(b, "subredditAboutStore.get(\u2026undThread)\n      .await()");
        return b;
    }
    
    @Override
    public final Object m0(final String s, final gg2.c<? super SubredditTopic> c) {
        return this.g.a(s, (gg2.c)c);
    }
    
    @Override
    public final Object n(final String s, final gg2.c<? super List<CrowdsourceTaggingQuestion>> c) {
        return this.i.b(s, (gg2.c)c);
    }
    
    @Override
    public final c0<StructuredStyle> n0(final String s) {
        ng2.e.f((Object)s, "subredditName");
        final Object value = this.B.getValue();
        ng2.e.e(value, "<get-structuredStyleStore>(...)");
        final c0 value2 = ((Store)value).get((Object)s);
        ng2.e.e((Object)value2, "structuredStyleStore.get(subredditName)");
        return px1.a.K0(value2, (d)this.b);
    }
    
    @Override
    public final Object o(String l$1, final ArrayList list, final gg2.c c) {
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
                    cg.d.b4(result);
                    return l$2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$1 = (String)redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$1;
                redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$0;
                cg.d.b4(result);
                f = result;
            }
        }
        else {
            cg.d.b4(result);
            final RemoteGqlSubredditQuestionsDataSource h = this.h;
            redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$0 = this;
            redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.L$1 = l$1;
            redditSubredditRepository$submitCrowdsourceTaggingAnswer$2.label = 1;
            f = h.f(l$1, (List)list, (gg2.c)redditSubredditRepository$submitCrowdsourceTaggingAnswer$2, false);
            if (f == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditSubredditRepository = this;
        }
        Object o = f;
        if (!((UpdateResponse)f).getSuccess()) {
            return o;
        }
        final wb0.a i = redditSubredditRepository.i;
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
    
    public final c0<List<Subreddit>> o0(final RedditSubredditRepository$SubredditGroup redditSubredditRepository$SubredditGroup, final String s) {
        final Object value = this.F.getValue();
        ng2.e.e(value, "<get-subredditGroupStore>(...)");
        final c0 m = ((Store)value).m((Object)new RedditSubredditRepository$c(redditSubredditRepository$SubredditGroup, s));
        ng2.e.e((Object)m, "subredditGroupStore.fetc\u2026ey(group, correlationId))");
        return m;
    }
    
    @Override
    public final String p(String subreddit_name, final String s, final String s2) {
        ng2.e.f((Object)subreddit_name, "subredditName");
        ng2.e.f((Object)s2, "deviceLanguage");
        final SubredditCounterpartMapping subredditCounterpartMapping = (SubredditCounterpartMapping)new t31.c(true).c().a((Class)SubredditCounterpartMapping.class).fromJson(s0(this.s, "counterpart_communities.json"));
        final Mappings mappings = null;
        Object o = null;
        Label_0186: {
            Label_0182: {
                if (subredditCounterpartMapping != null) {
                    final List regions = subredditCounterpartMapping.getRegions();
                    if (regions != null) {
                        while (true) {
                            for (final Object next : regions) {
                                final Regions regions2 = (Regions)next;
                                if (ng2.e.a((Object)regions2.getLanguage(), (Object)s) || ng2.e.a((Object)regions2.getLanguage(), (Object)s2)) {
                                    final Regions regions3 = (Regions)next;
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
        } while (!xi2.j.z0(((Mappings)next2).getSubreddit_counterpart(), subreddit_name, true));
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
    
    public final Store<Set<String>, String> p0() {
        final Object value = this.C.getValue();
        ng2.e.e(value, "<get-crosspostableSubredditsStore>(...)");
        return (Store<Set<String>, String>)value;
    }
    
    @Override
    public final Object q(gg2.c<? super List<SubredditListItem>> m3) {
        RedditSubredditRepository$fetchAllUserSubredditListItems$1 redditSubredditRepository$fetchAllUserSubredditListItems$1 = null;
        Label_0047: {
            if (m3 instanceof RedditSubredditRepository$fetchAllUserSubredditListItems$1) {
                redditSubredditRepository$fetchAllUserSubredditListItems$1 = (RedditSubredditRepository$fetchAllUserSubredditListItems$1)m3;
                final int label = redditSubredditRepository$fetchAllUserSubredditListItems$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.label = label + Integer.MIN_VALUE;
                    break Label_0047;
                }
            }
            redditSubredditRepository$fetchAllUserSubredditListItems$1 = new RedditSubredditRepository$fetchAllUserSubredditListItems$1(this, (gg2.c)m3);
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
                                cg.d.b4(result);
                                break Label_0380;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            Object r0 = m3 = redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0;
                            try {
                                cg.d.b4(result);
                                m3 = r0;
                                r0 = result;
                                break Label_0348;
                            }
                            finally {
                                break Label_0348;
                            }
                        }
                    }
                    final Iterator iterator = (Iterator)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2;
                    m3 = redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1;
                    l$3 = (RedditSubredditRepository)redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0;
                    cg.d.b4(result);
                    iterator2 = iterator;
                }
                else {
                    cg.d.b4(result);
                    m3 = cg.d.m3((Object[])new cj2.p[] { (cj2.p)this.v, (cj2.p)this.x, (cj2.p)this.y });
                    iterator2 = ((Iterable)m3).iterator();
                    l$3 = this;
                }
                while (iterator2.hasNext()) {
                    final cj2.p p = iterator2.next();
                    final SubredditListingProgressIndicator loading = SubredditListingProgressIndicator.LOADING;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0 = l$3;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1 = m3;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2 = iterator2;
                    redditSubredditRepository$fetchAllUserSubredditListItems$1.label = 1;
                    if (((cj2.o)p).emit((Object)loading, (gg2.c)redditSubredditRepository$fetchAllUserSubredditListItems$1) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                Label_0300: {
                    break Label_0300;
                    final Iterator l$1;
                    final Throwable l$2;
                    while (l$1.hasNext()) {
                        final cj2.p p2 = l$1.next();
                        final SubredditListingProgressIndicator error = SubredditListingProgressIndicator.ERROR;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0 = l$2;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1 = l$1;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2 = null;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.label = 3;
                        if (((cj2.o)p2).emit((Object)error, (gg2.c)redditSubredditRepository$fetchAllUserSubredditListItems$1) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    throw l$2;
                    try {
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$0 = m3;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$1 = null;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.L$2 = null;
                        redditSubredditRepository$fetchAllUserSubredditListItems$1.label = 2;
                        final Object r0 = l$3.r0((gg2.c)redditSubredditRepository$fetchAllUserSubredditListItems$1);
                        if (r0 == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        return r0;
                    }
                    finally {
                        iterable = (Iterable)m3;
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
    
    public final c0<List<Subreddit>> q0(final RedditSubredditRepository$SubredditGroup redditSubredditRepository$SubredditGroup, final String s) {
        final Object value = this.F.getValue();
        ng2.e.e(value, "<get-subredditGroupStore>(...)");
        final c0 value2 = ((Store)value).get((Object)new RedditSubredditRepository$c(redditSubredditRepository$SubredditGroup, s));
        ng2.e.e((Object)value2, "subredditGroupStore.get(\u2026ey(group, correlationId))");
        return value2;
    }
    
    @Override
    public final c0 r(final String s, final LinkedHashMap linkedHashMap) {
        final RedditSubredditRepository$a redditSubredditRepository$a = new RedditSubredditRepository$a(s, linkedHashMap);
        final Object value = this.D.getValue();
        ng2.e.e(value, "<get-subredditListingStore>(...)");
        final c0 m = ((Store)value).m((Object)redditSubredditRepository$a);
        ng2.e.e((Object)m, "if (refresh) {\n      sub\u2026ore.get(requestKey)\n    }");
        return px1.a.K0(m, (d)this.b);
    }
    
    public final Serializable r0(final gg2.c c) {
        Object o = null;
        Label_0053: {
            if (c instanceof RedditSubredditRepository$performFetchUserSubredditListItems$1) {
                final RedditSubredditRepository$performFetchUserSubredditListItems$1 redditSubredditRepository$performFetchUserSubredditListItems$1 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)c;
                final int label = redditSubredditRepository$performFetchUserSubredditListItems$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$performFetchUserSubredditListItems$1.label = label + Integer.MIN_VALUE;
                    o = redditSubredditRepository$performFetchUserSubredditListItems$1;
                    break Label_0053;
                }
            }
            o = new RedditSubredditRepository$performFetchUserSubredditListItems$1(this, c);
        }
        Object result = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).result;
        Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        while (true) {
            Object l$30 = null;
            Object o27 = null;
            Object l$39 = null;
            Object o33 = null;
            Object o35 = null;
            Object o36 = null;
            RedditSubredditRepository redditSubredditRepository5 = null;
            Label_2507: {
                PaginatedListing paginatedListing = null;
                Object o2 = null;
                Object o3 = null;
                Object o4 = null;
                Object o5 = null;
                Object o6 = null;
                Object o7 = null;
                Object o8 = null;
                RedditSubredditRepository redditSubredditRepository2 = null;
                Label_2416: {
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
                    Label_2224: {
                        UserSubredditPaginatedListing l$42 = null;
                        Object o30 = null;
                        j j = null;
                        Object o31 = null;
                        Object o32 = null;
                        Object o34 = null;
                        Object o37 = null;
                        Label_2045: {
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
                            Label_1962: {
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
                                Object o17 = null;
                                Label_1756: {
                                    Label_1589: {
                                        PaginatedListing paginatedListing3 = null;
                                        UserSubredditPaginatedListing userSubredditPaginatedListing2 = null;
                                        Object o18 = null;
                                        Object o19 = null;
                                        Object o20 = null;
                                        Object o21 = null;
                                        Object o22 = null;
                                        Object o23 = null;
                                        Object o24 = null;
                                        RedditSubredditRepository redditSubredditRepository4 = null;
                                        Label_1513: {
                                            PaginatedListing l$27 = null;
                                            UserSubredditPaginatedListing l$28 = null;
                                            Object l$29 = null;
                                            Object l$31 = null;
                                            Object l$32 = null;
                                            Object l$33 = null;
                                            Object l$34 = null;
                                            Object l$35 = null;
                                            RedditSubredditRepository l$36 = null;
                                            RedditSubredditRepository$performFetchUserSubredditListItems$1 redditSubredditRepository$performFetchUserSubredditListItems$4 = null;
                                            Object o25 = null;
                                            Label_1307: {
                                                Object o26 = null;
                                                Object o28 = null;
                                                Object o29 = null;
                                                Object l$37 = null;
                                                RedditSubredditRepository l$38 = null;
                                                Label_1086: {
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
                                                            cg.d.b4(result);
                                                            redditSubredditRepository2 = redditSubredditRepository;
                                                            break Label_2416;
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
                                                            cg.d.b4(result);
                                                            redditSubredditRepository$performFetchUserSubredditListItems$2 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o;
                                                            o9 = coroutine_SUSPENDED;
                                                            break Label_2224;
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
                                                            cg.d.b4(result);
                                                            o16 = ref$BooleanRef;
                                                            break Label_1962;
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
                                                            cg.d.b4(result);
                                                            redditSubredditRepository$performFetchUserSubredditListItems$3 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o;
                                                            o17 = coroutine_SUSPENDED;
                                                            break Label_1756;
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
                                                            cg.d.b4(result);
                                                            break Label_1513;
                                                        }
                                                        case 2: {
                                                            l$27 = (PaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9;
                                                            l$28 = (UserSubredditPaginatedListing)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8;
                                                            l$29 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            l$30 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            l$31 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            l$32 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            l$33 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            l$34 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            l$35 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            l$36 = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            cg.d.b4(result);
                                                            redditSubredditRepository$performFetchUserSubredditListItems$4 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o;
                                                            o25 = coroutine_SUSPENDED;
                                                            break Label_1307;
                                                        }
                                                        case 1: {
                                                            o26 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7;
                                                            l$30 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6;
                                                            l$31 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5;
                                                            o27 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4;
                                                            o28 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3;
                                                            o29 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2;
                                                            l$37 = ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1;
                                                            l$38 = (RedditSubredditRepository)((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0;
                                                            cg.d.b4(result);
                                                            break Label_1086;
                                                        }
                                                        case 0: {
                                                            cg.d.b4(result);
                                                            l$39 = new ArrayList();
                                                            o29 = new Ref$BooleanRef();
                                                            ((Ref$BooleanRef)o29).element = true;
                                                            o28 = new Ref$ObjectRef();
                                                            o27 = new Ref$BooleanRef();
                                                            ((Ref$BooleanRef)o27).element = true;
                                                            l$31 = new Ref$ObjectRef();
                                                            l$30 = new Ref$BooleanRef();
                                                            ((Ref$BooleanRef)l$30).element = true;
                                                            o26 = new Ref$ObjectRef();
                                                            l$40 = this;
                                                            break;
                                                        }
                                                    }
                                                    final RemoteGqlSubredditDataSource e = l$40.e;
                                                    final boolean element = ((Ref$BooleanRef)o29).element;
                                                    final String s = (String)((Ref$ObjectRef)o28).element;
                                                    final boolean element2 = ((Ref$BooleanRef)o27).element;
                                                    final String s2 = (String)((Ref$ObjectRef)l$31).element;
                                                    final boolean element3 = ((Ref$BooleanRef)l$30).element;
                                                    final String s3 = (String)((Ref$ObjectRef)o26).element;
                                                    final BigFishSubredditOptimizationVariant$a companion = BigFishSubredditOptimizationVariant.Companion;
                                                    final BigFishSubredditOptimizationVariant a8 = l$40.n.A8();
                                                    companion.getClass();
                                                    final int a9 = BigFishSubredditOptimizationVariant$a.a(a8);
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0 = l$40;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1 = l$39;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2 = o29;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3 = o28;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4 = o27;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5 = l$31;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6 = l$30;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7 = o26;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8 = null;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9 = null;
                                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).label = 1;
                                                    final Object n = e.n(element, s, element2, s2, element3, s3, a9, (gg2.c)o);
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
                                                o30 = o;
                                                j = (j)coroutine_SUSPENDED;
                                                o31 = o26;
                                                o32 = l$30;
                                                o33 = l$31;
                                                o34 = o27;
                                                o35 = o28;
                                                o36 = o29;
                                                o37 = l$37;
                                                redditSubredditRepository5 = l$38;
                                                if (subscribed == null) {
                                                    break Label_1589;
                                                }
                                                final wb0.b i = l$38.j;
                                                final List items = subscribed.getItems();
                                                final boolean b = ((Ref$ObjectRef)o28).element == null && ((Ref$ObjectRef)l$31).element == null;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$0 = l$38;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$1 = l$37;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$2 = o29;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$3 = o28;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$4 = o27;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$5 = l$31;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$6 = l$30;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$7 = o26;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$8 = l$41;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).L$9 = subscribed;
                                                ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o).label = 2;
                                                if (i.l(items, b) == coroutine_SUSPENDED) {
                                                    return (Serializable)coroutine_SUSPENDED;
                                                }
                                                l$35 = l$37;
                                                l$36 = l$38;
                                                l$34 = o29;
                                                l$32 = o27;
                                                l$29 = o26;
                                                l$27 = subscribed;
                                                l$28 = l$41;
                                                l$33 = o28;
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
                                            o21 = l$32;
                                            o22 = l$33;
                                            o23 = l$34;
                                            o24 = l$35;
                                            redditSubredditRepository4 = l$36;
                                            if (!l$27.getHasNextPage()) {
                                                final StateFlowImpl v = l$36.v;
                                                final SubredditListingProgressIndicator complete = SubredditListingProgressIndicator.COMPLETE;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$0 = l$36;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$1 = l$35;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$2 = l$34;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$3 = l$33;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$4 = l$32;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$5 = l$31;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$6 = l$30;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$7 = l$29;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$8 = l$28;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.L$9 = l$27;
                                                redditSubredditRepository$performFetchUserSubredditListItems$4.label = 3;
                                                v.setValue((Object)complete);
                                                o = redditSubredditRepository$performFetchUserSubredditListItems$4;
                                                coroutine_SUSPENDED = o25;
                                                paginatedListing3 = l$27;
                                                userSubredditPaginatedListing2 = l$28;
                                                o18 = l$29;
                                                o19 = l$30;
                                                o20 = l$31;
                                                o21 = l$32;
                                                o22 = l$33;
                                                o23 = l$34;
                                                o24 = l$35;
                                                redditSubredditRepository4 = l$36;
                                                if (cg2.j.a == o25) {
                                                    return (Serializable)o25;
                                                }
                                            }
                                        }
                                        ((Ref$BooleanRef)o23).element = paginatedListing3.getHasNextPage();
                                        ((Ref$ObjectRef)o22).element = paginatedListing3.getEndCursor();
                                        ((List)o24).addAll(paginatedListing3.getItems());
                                        l$42 = userSubredditPaginatedListing2;
                                        o32 = o19;
                                        o33 = o20;
                                        o35 = o22;
                                        o36 = o23;
                                        o37 = o24;
                                        redditSubredditRepository5 = redditSubredditRepository4;
                                        o34 = o21;
                                        o31 = o18;
                                        j = (j)coroutine_SUSPENDED;
                                        o30 = o;
                                    }
                                    final PaginatedListing followed = l$42.getFollowed();
                                    if (followed == null) {
                                        break Label_2045;
                                    }
                                    final wb0.b k = redditSubredditRepository5.j;
                                    final List items2 = followed.getItems();
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$0 = redditSubredditRepository5;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$1 = o37;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$2 = o36;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$3 = o35;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$4 = o34;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$5 = o33;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$6 = o32;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$7 = o31;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$8 = l$42;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$9 = followed;
                                    ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).label = 4;
                                    if (k.l(items2, false) == j) {
                                        return (Serializable)j;
                                    }
                                    l$25 = o37;
                                    l$22 = o34;
                                    l$19 = o31;
                                    final UserSubredditPaginatedListing userSubredditPaginatedListing3 = l$42;
                                    l$26 = redditSubredditRepository5;
                                    l$23 = o35;
                                    l$21 = o33;
                                    l$20 = o32;
                                    l$18 = userSubredditPaginatedListing3;
                                    l$17 = followed;
                                    o17 = j;
                                    redditSubredditRepository$performFetchUserSubredditListItems$3 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o30;
                                    l$24 = o36;
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
                                    if (cg2.j.a == o17) {
                                        return (Serializable)o17;
                                    }
                                }
                            }
                            ((Ref$BooleanRef)o13).element = paginatedListing2.getHasNextPage();
                            ((Ref$ObjectRef)o12).element = paginatedListing2.getEndCursor();
                            ((List)o15).addAll(paginatedListing2.getItems());
                            final Object o38 = o16;
                            l$42 = userSubredditPaginatedListing;
                            o33 = o12;
                            redditSubredditRepository5 = redditSubredditRepository3;
                            o32 = o11;
                            o35 = o14;
                            o30 = o;
                            j = (j)coroutine_SUSPENDED;
                            o31 = o10;
                            o34 = o13;
                            o36 = o38;
                            o37 = o15;
                        }
                        final PaginatedListing moderated = l$42.getModerated();
                        if (moderated == null) {
                            o27 = o34;
                            l$30 = o32;
                            final Object o26 = o31;
                            coroutine_SUSPENDED = j;
                            o = o30;
                            l$39 = o37;
                            break Label_2507;
                        }
                        final wb0.b l = redditSubredditRepository5.j;
                        final List items3 = moderated.getItems();
                        final boolean b2 = ((Ref$ObjectRef)o31).element == null;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$0 = redditSubredditRepository5;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$1 = o37;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$2 = o36;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$3 = o35;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$4 = o34;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$5 = o33;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$6 = o32;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$7 = o31;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$8 = moderated;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).L$9 = null;
                        ((RedditSubredditRepository$performFetchUserSubredditListItems$1)o30).label = 6;
                        if (l.r(items3, b2) == j) {
                            return (Serializable)j;
                        }
                        final Object o39 = o35;
                        l$11 = o33;
                        l$8 = moderated;
                        l$16 = redditSubredditRepository5;
                        l$14 = o36;
                        l$12 = o34;
                        l$10 = o32;
                        l$15 = o37;
                        l$13 = o39;
                        l$9 = o31;
                        o9 = j;
                        redditSubredditRepository$performFetchUserSubredditListItems$2 = (RedditSubredditRepository$performFetchUserSubredditListItems$1)o30;
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
                        if (cg2.j.a == o9) {
                            return (Serializable)o9;
                        }
                    }
                }
                ((Ref$BooleanRef)o3).element = paginatedListing.getHasNextPage();
                ((Ref$ObjectRef)o2).element = paginatedListing.getEndCursor();
                ((List)o8).addAll(paginatedListing.getItems());
                Object o26 = o2;
                l$30 = o3;
                o33 = o4;
                o27 = o5;
                o35 = o6;
                o36 = o7;
                l$39 = o8;
                redditSubredditRepository5 = redditSubredditRepository2;
            }
            if (!((Ref$BooleanRef)o36).element && !((Ref$BooleanRef)o27).element && !((Ref$BooleanRef)l$30).element) {
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
            Object l$31 = o33;
            Object o28 = o35;
            Object o29 = o36;
            continue;
        }
    }
    
    @Override
    public final Object s(String s, final gg2.c<? super SubredditTaggingQuestions> c) {
        RedditSubredditRepository$getSubredditQuestions$1 redditSubredditRepository$getSubredditQuestions$1 = null;
        Label_0051: {
            if (c instanceof RedditSubredditRepository$getSubredditQuestions$1) {
                redditSubredditRepository$getSubredditQuestions$1 = (RedditSubredditRepository$getSubredditQuestions$1)c;
                final int label = redditSubredditRepository$getSubredditQuestions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$getSubredditQuestions$1.label = label + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            redditSubredditRepository$getSubredditQuestions$1 = new RedditSubredditRepository$getSubredditQuestions$1(this, (gg2.c)c);
        }
        Object o = redditSubredditRepository$getSubredditQuestions$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$getSubredditQuestions$1.label;
        SubredditTaggingQuestions l$0 = null;
        String s2 = null;
        RedditSubredditRepository redditSubredditRepository2 = null;
        Label_0296: {
            RedditSubredditRepository l$2;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        l$0 = (SubredditTaggingQuestions)redditSubredditRepository$getSubredditQuestions$1.L$2;
                        s2 = (String)redditSubredditRepository$getSubredditQuestions$1.L$1;
                        final RedditSubredditRepository redditSubredditRepository = (RedditSubredditRepository)redditSubredditRepository$getSubredditQuestions$1.L$0;
                        cg.d.b4(o);
                        redditSubredditRepository2 = redditSubredditRepository;
                        break Label_0296;
                    }
                    if (label2 == 3) {
                        final SubredditTaggingQuestions subredditTaggingQuestions = (SubredditTaggingQuestions)redditSubredditRepository$getSubredditQuestions$1.L$0;
                        cg.d.b4(o);
                        return subredditTaggingQuestions;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    s = (String)redditSubredditRepository$getSubredditQuestions$1.L$1;
                    l$2 = (RedditSubredditRepository)redditSubredditRepository$getSubredditQuestions$1.L$0;
                    cg.d.b4(o);
                }
            }
            else {
                cg.d.b4(o);
                final RemoteGqlSubredditQuestionsDataSource h = this.h;
                redditSubredditRepository$getSubredditQuestions$1.L$0 = this;
                redditSubredditRepository$getSubredditQuestions$1.L$1 = s;
                redditSubredditRepository$getSubredditQuestions$1.label = 1;
                o = h.e(s, (gg2.c)redditSubredditRepository$getSubredditQuestions$1);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                l$2 = this;
            }
            final SubredditTaggingQuestions l$3 = (SubredditTaggingQuestions)o;
            final wb0.a i = l$2.i;
            redditSubredditRepository$getSubredditQuestions$1.L$0 = l$2;
            redditSubredditRepository$getSubredditQuestions$1.L$1 = s;
            redditSubredditRepository$getSubredditQuestions$1.L$2 = l$3;
            redditSubredditRepository$getSubredditQuestions$1.label = 2;
            if (i.d(s, (gg2.c)redditSubredditRepository$getSubredditQuestions$1) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditSubredditRepository2 = l$2;
            s2 = s;
            l$0 = l$3;
        }
        final List crowdsourceTaggingQuestion = l$0.getCrowdsourceTaggingQuestion();
        SubredditTaggingQuestions subredditTaggingQuestions = l$0;
        if (crowdsourceTaggingQuestion != null) {
            final wb0.a j = redditSubredditRepository2.i;
            redditSubredditRepository$getSubredditQuestions$1.L$0 = l$0;
            redditSubredditRepository$getSubredditQuestions$1.L$1 = null;
            redditSubredditRepository$getSubredditQuestions$1.L$2 = null;
            redditSubredditRepository$getSubredditQuestions$1.label = 3;
            subredditTaggingQuestions = l$0;
            if (j.a(s2, crowdsourceTaggingQuestion, (gg2.c)redditSubredditRepository$getSubredditQuestions$1) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return subredditTaggingQuestions;
    }
    
    @Override
    public final c0 t(final String s, final boolean b) {
        c0<List<Subreddit>> c0;
        if (b) {
            c0 = this.o0(RedditSubredditRepository$SubredditGroup.SUBSCRIBED, s);
        }
        else {
            c0<List<Subreddit>> c2;
            if (this.a.Q7()) {
                c2 = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)this.q0(RedditSubredditRepository$SubredditGroup.SUBSCRIBED, s), (ff2.o)new com.reddit.data.repository.h(this, s)));
                ng2.e.e((Object)c2, "{\n      getFromSubreddit\u2026)\n        }\n      }\n    }");
            }
            else {
                c2 = this.q0(RedditSubredditRepository$SubredditGroup.SUBSCRIBED, s);
            }
            c0 = px1.a.K0((c0)c2, (d)this.b).w((ff2.o)new b60.g0(9));
            ng2.e.e((Object)c0, "if (membersFeatures.useR\u2026->\n      subreddits\n    }");
        }
        return c0;
    }
    
    public final Object t0(final RedditSubredditRepository$SubredditGroup redditSubredditRepository$SubredditGroup, final String s, final gg2.c<? super j> c) {
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
            o = new RedditSubredditRepository$startSubredditListingFetch$1(this, (gg2.c)c);
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
            cg.d.b4(result);
        }
        else {
            cg.d.b4(result);
            o2 = new RedditSubredditRepository$d(redditSubredditRepository$SubredditGroup, s);
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).L$0 = this;
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).L$1 = o2;
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).label = 1;
            if (this.u0((RedditSubredditRepository$d)o2, (gg2.c<? super CommunityDrawerListing>)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            l$0 = this;
        }
        while (((RedditSubredditRepository$d)o2).c != null || ((RedditSubredditRepository$d)o2).d != null) {
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).L$0 = l$0;
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).L$1 = o2;
            ((RedditSubredditRepository$startSubredditListingFetch$1)o).label = 2;
            if (l$0.u0((RedditSubredditRepository$d)o2, (gg2.c<? super CommunityDrawerListing>)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return cg2.j.a;
    }
    
    @Override
    public final c0<RelatedSubredditsResponse> u(final String s) {
        ng2.e.f((Object)s, "subredditId");
        final RemoteGqlSubredditDataSource e = this.e;
        e.getClass();
        final c0 w = e$a.a((mr0.e)e.a, (k)new da(y10.w.e(s, ThingType.SUBREDDIT)), (OkHttpClient)null, (Map)null, 14).w((ff2.o)new l10.e((Object)e, 6));
        ng2.e.e((Object)w, "graphQlClient\n      .exe\u2026sformer.apply(it)\n      }");
        return px1.a.K0((c0)w, (d)this.b);
    }
    
    public final Object u0(final RedditSubredditRepository$d redditSubredditRepository$d, final gg2.c<? super CommunityDrawerListing> c) {
        RedditSubredditRepository$startSubscribedSubredditListingFetch$2 redditSubredditRepository$startSubscribedSubredditListingFetch$3 = null;
        Label_0053: {
            if (c instanceof RedditSubredditRepository$startSubscribedSubredditListingFetch$2) {
                final RedditSubredditRepository$startSubscribedSubredditListingFetch$2 redditSubredditRepository$startSubscribedSubredditListingFetch$2 = (RedditSubredditRepository$startSubscribedSubredditListingFetch$2)c;
                final int label = redditSubredditRepository$startSubscribedSubredditListingFetch$2.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditSubredditRepository$startSubscribedSubredditListingFetch$2.label = label + Integer.MIN_VALUE;
                    redditSubredditRepository$startSubscribedSubredditListingFetch$3 = redditSubredditRepository$startSubscribedSubredditListingFetch$2;
                    break Label_0053;
                }
            }
            redditSubredditRepository$startSubscribedSubredditListingFetch$3 = new RedditSubredditRepository$startSubscribedSubredditListingFetch$2(this, (gg2.c)c);
        }
        final Object result = redditSubredditRepository$startSubscribedSubredditListingFetch$3.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditSubredditRepository$startSubscribedSubredditListingFetch$3.label;
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
            final ij2.a c2 = this.p.c();
            final RedditSubredditRepository$startSubscribedSubredditListingFetch$3 redditSubredditRepository$startSubscribedSubredditListingFetch$4 = new RedditSubredditRepository$startSubscribedSubredditListingFetch$3(this, redditSubredditRepository$d, (gg2.c)null);
            redditSubredditRepository$startSubscribedSubredditListingFetch$3.label = 1;
            if ((j = zi2.g.j((CoroutineContext)c2, (mg2.p)redditSubredditRepository$startSubscribedSubredditListingFetch$4, (gg2.c)redditSubredditRepository$startSubscribedSubredditListingFetch$3)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(j, "private suspend fun star\u2026ch(key).await()\n    }\n  }");
        return j;
    }
    
    @Override
    public final Object v(final String s, final String s2, final boolean b, final gg2.c<? super UpdateResponse> c) {
        return this.h.d(s, s2, b, (gg2.c)c);
    }
    
    @Override
    public final c0 w(final String s, final boolean b) {
        c0<List<Subreddit>> c0;
        if (b) {
            c0 = this.o0(RedditSubredditRepository$SubredditGroup.MODERATING, s);
        }
        else {
            c0 = this.q0(RedditSubredditRepository$SubredditGroup.MODERATING, s);
        }
        return px1.a.K0((c0)c0, (d)this.b);
    }
    
    @Override
    public final Object x(final String s, final String s2, final String s3, final gg2.c<? super UpdateResponse> c) {
        return this.e.o(s, s2, s3, (gg2.c)c);
    }
    
    @Override
    public final kotlinx.coroutines.flow.f y() {
        final kotlinx.coroutines.flow.g w = this.w;
        final t map = this.j.C().map((ff2.o)new su.d(17));
        ng2.e.e((Object)map, "local.observeModeratingS\u2026tyDrawerListing(it)\n    }");
        return new kotlinx.coroutines.flow.f((cj2.e)w, (cj2.e)kotlinx.coroutines.rx2.e.b(map), (mg2.q)new RedditSubredditRepository$observeModeratingSubredditsListing$2((gg2.c)null));
    }
    
    @Override
    public final n<Subreddit> z(final String s, final boolean b, final boolean b2) {
        ng2.e.f((Object)s, "subredditName");
        n n;
        if (b) {
            Store store;
            if (b2) {
                final Object value = this.A.getValue();
                ng2.e.e(value, "<get-quarantinedSubredditAboutStore>(...)");
                store = (Store)value;
            }
            else {
                final Object value2 = this.z.getValue();
                ng2.e.e(value2, "<get-subredditAboutStore>(...)");
                store = (Store)value2;
            }
            final Object value3 = this.B.getValue();
            ng2.e.e(value3, "<get-structuredStyleStore>(...)");
            final c0 m = ((Store)value3).m((Object)s);
            ng2.e.e((Object)m, "structuredStyleStore.fetch(subredditName)");
            final c0 i = store.m((Object)s);
            final b60.r r = new b60.r((Object)m, 5);
            i.getClass();
            final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)i, (ff2.o)r));
            final b60.o o = new b60.o((Object)this, 3);
            onAssembly.getClass();
            final n j = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)onAssembly, (ff2.o)o)).M();
            final r1 r2 = new r1(this, s, b2);
            j.getClass();
            n = RxJavaPlugins.onAssembly((n)new MaybeOnErrorNext((r)j, (ff2.o)r2));
        }
        else {
            final n w = this.j.w(s);
            final Object value4 = this.B.getValue();
            ng2.e.e(value4, "<get-structuredStyleStore>(...)");
            n = w.C(((Store)value4).get((Object)s).M(), (ff2.c)new com.reddit.video.creation.widgets.voiceover.b(1));
        }
        ng2.e.e((Object)n, "if (refresh) {\n      val\u2026       },\n        )\n    }");
        return px1.a.J0(n, (d)this.b);
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
            ng2.e.f((Object)s, "key");
            ng2.e.f((Object)subreddit, "subreddit");
            return (c0)this.a.invoke((Object)subreddit);
        }
        
        public final n c(final Object o) {
            final String s = (String)o;
            ng2.e.f((Object)s, "key");
            return (n)this.b.invoke((Object)s);
        }
    }
    
    public static final class e implements pt.d<List<? extends Subreddit>, RedditSubredditRepository$a>
    {
        public final mg2.p<List<Subreddit>, String, c0<Boolean>> a;
        public final l<String, n<List<Subreddit>>> b;
        
        public e(final l b, final mg2.p a) {
            this.a = (mg2.p<List<Subreddit>, String, c0<Boolean>>)a;
            this.b = (l<String, n<List<Subreddit>>>)b;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final RedditSubredditRepository$a redditSubredditRepository$a = (RedditSubredditRepository$a)o;
            final List list = (List)o2;
            ng2.e.f((Object)redditSubredditRepository$a, "key");
            ng2.e.f((Object)list, "subreddits");
            return (c0)this.a.invoke((Object)list, (Object)redditSubredditRepository$a.toString());
        }
        
        public final n c(final Object o) {
            final RedditSubredditRepository$a redditSubredditRepository$a = (RedditSubredditRepository$a)o;
            ng2.e.f((Object)redditSubredditRepository$a, "key");
            return (n)this.b.invoke((Object)redditSubredditRepository$a.toString());
        }
    }
    
    public static final class f implements pt.d<CommunityDrawerListing, RedditSubredditRepository$d>
    {
        public final mg2.p<RedditSubredditRepository$SubredditGroup, CommunityDrawerListing, c0<Boolean>> a;
        public final l<RedditSubredditRepository$SubredditGroup, n<CommunityDrawerListing>> b;
        
        public f(final l b, final mg2.p a) {
            this.a = (mg2.p<RedditSubredditRepository$SubredditGroup, CommunityDrawerListing, c0<Boolean>>)a;
            this.b = (l<RedditSubredditRepository$SubredditGroup, n<CommunityDrawerListing>>)b;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final RedditSubredditRepository$d redditSubredditRepository$d = (RedditSubredditRepository$d)o;
            final CommunityDrawerListing communityDrawerListing = (CommunityDrawerListing)o2;
            ng2.e.f((Object)redditSubredditRepository$d, "key");
            ng2.e.f((Object)communityDrawerListing, "subscriptions");
            return (c0)this.a.invoke((Object)redditSubredditRepository$d.a, (Object)communityDrawerListing);
        }
        
        public final n c(final Object o) {
            final RedditSubredditRepository$d redditSubredditRepository$d = (RedditSubredditRepository$d)o;
            ng2.e.f((Object)redditSubredditRepository$d, "key");
            return (n)this.b.invoke((Object)redditSubredditRepository$d.a);
        }
    }
    
    public static final class g implements pt.d<List<? extends Subreddit>, RedditSubredditRepository$c>
    {
        public final mg2.p<RedditSubredditRepository$SubredditGroup, List<Subreddit>, c0<Boolean>> a;
        public final l<RedditSubredditRepository$SubredditGroup, n<List<Subreddit>>> b;
        
        public g(final l b, final mg2.p a) {
            this.a = (mg2.p<RedditSubredditRepository$SubredditGroup, List<Subreddit>, c0<Boolean>>)a;
            this.b = (l<RedditSubredditRepository$SubredditGroup, n<List<Subreddit>>>)b;
        }
        
        public final c0 b(final Object o, final Object o2) {
            final RedditSubredditRepository$c redditSubredditRepository$c = (RedditSubredditRepository$c)o;
            final List list = (List)o2;
            ng2.e.f((Object)redditSubredditRepository$c, "key");
            ng2.e.f((Object)list, "subscriptions");
            return (c0)this.a.invoke((Object)redditSubredditRepository$c.a, (Object)list);
        }
        
        public final n c(final Object o) {
            final RedditSubredditRepository$c redditSubredditRepository$c = (RedditSubredditRepository$c)o;
            ng2.e.f((Object)redditSubredditRepository$c, "key");
            return (n)this.b.invoke((Object)redditSubredditRepository$c.a);
        }
    }
}
