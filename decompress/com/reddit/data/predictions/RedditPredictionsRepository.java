// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions;

import com.reddit.session.Session;
import com.nytimes.android.external.store3.base.impl.Store;
import java.util.UUID;
import java.util.Iterator;
import java.util.List;
import java.io.Serializable;
import jd0.h;
import com.reddit.domain.predictions.model.PredictionCurrency;
import io.reactivex.internal.operators.single.SingleFlatMapMaybe;
import io.reactivex.plugins.RxJavaPlugins;
import af2.g0;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import af2.t;
import com.reddit.domain.model.ErrorType;
import af2.c0;
import com.reddit.domain.model.predictions.PredictionsTournament;
import com.reddit.session.m;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import jd0.f$a;
import jd0.f$b;
import com.reddit.domain.model.PostPoll;
import jd0.l;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.domain.model.LoadResult$Error;
import com.reddit.domain.model.LoadResult$Success;
import com.reddit.domain.model.LoadResult;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import javax.inject.Inject;
import ng2.e;
import cg2.f;
import pd0.n;
import ff0.t1;
import com.reddit.session.o;
import hd0.a;
import od0.b;
import x40.e0;
import od0.c;

public final class RedditPredictionsRepository implements c
{
    public final RemoteGqlPredictionsDataSource a;
    public final e0 b;
    public final b c;
    public final a d;
    public final q20.a e;
    public final te0.a f;
    public final jr0.a g;
    public final o h;
    public final t1 i;
    public final n j;
    public final d20.a k;
    public final f l;
    public final f m;
    
    @Inject
    public RedditPredictionsRepository(final RemoteGqlPredictionsDataSource a, final e0 b, final b c, final a d, final q20.a e, final te0.a f, final jr0.a g, final o h, final t1 i, final n j, final d20.a k) {
        ng2.e.f((Object)a, "remoteGql");
        ng2.e.f((Object)b, "localLinkDataSource");
        ng2.e.f((Object)c, "localPredictionsTournamentDataSource");
        ng2.e.f((Object)d, "localTournamentPostDataSource");
        ng2.e.f((Object)e, "backgroundThread");
        ng2.e.f((Object)f, "coinsRepository");
        ng2.e.f((Object)g, "goldFeatures");
        ng2.e.f((Object)h, "sessionView");
        ng2.e.f((Object)i, "voteLinkUseCase");
        ng2.e.f((Object)j, "predictionsTournamentUpdateLinkUseCase");
        ng2.e.f((Object)k, "dispatcherProvider");
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
        this.l = kotlin.a.b((mg2.a)new RedditPredictionsRepository$predictorsLeaderboardStore$2(this));
        this.m = kotlin.a.b((mg2.a)new RedditPredictionsRepository$subredditPredictionTournamentsStore$2(this));
    }
    
    public static final Object v(final RedditPredictionsRepository redditPredictionsRepository, final RedditPredictionsRepository.RedditPredictionsRepository$b redditPredictionsRepository$b, final gg2.c c) {
        redditPredictionsRepository.getClass();
        Object o = null;
        Label_0056: {
            if (c instanceof RedditPredictionsRepository$fetchSubredditPredictionTournaments$1) {
                final RedditPredictionsRepository$fetchSubredditPredictionTournaments$1 redditPredictionsRepository$fetchSubredditPredictionTournaments$1 = (RedditPredictionsRepository$fetchSubredditPredictionTournaments$1)c;
                final int label = redditPredictionsRepository$fetchSubredditPredictionTournaments$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$fetchSubredditPredictionTournaments$1.label = label + Integer.MIN_VALUE;
                    o = redditPredictionsRepository$fetchSubredditPredictionTournaments$1;
                    break Label_0056;
                }
            }
            o = new RedditPredictionsRepository$fetchSubredditPredictionTournaments$1(redditPredictionsRepository, c);
        }
        final Object result = ((RedditPredictionsRepository$fetchSubredditPredictionTournaments$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPredictionsRepository$fetchSubredditPredictionTournaments$1)o).label;
        Object h;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            h = result;
        }
        else {
            d.b4(result);
            final RemoteGqlPredictionsDataSource a = redditPredictionsRepository.a;
            final String a2 = redditPredictionsRepository$b.a;
            final od0.d b = redditPredictionsRepository$b.b;
            ((RedditPredictionsRepository$fetchSubredditPredictionTournaments$1)o).label = 1;
            if ((h = a.h(b, a2, (gg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final LoadResult loadResult = (LoadResult)h;
        Object o2;
        if (loadResult instanceof LoadResult$Success) {
            o2 = new u20.a(((LoadResult$Success)loadResult).getData());
        }
        else {
            if (!(loadResult instanceof LoadResult$Error)) {
                throw new NoWhenBranchMatchedException();
            }
            o2 = new u20.a((Object)null);
        }
        return o2;
    }
    
    public static final Object w(final RedditPredictionsRepository redditPredictionsRepository, final RedditPredictionsRepository.RedditPredictionsRepository$a redditPredictionsRepository$a, final gg2.c c) {
        redditPredictionsRepository.getClass();
        Object o = null;
        Label_0056: {
            if (c instanceof RedditPredictionsRepository$fetchSubredditPredictorsLeaderboardInfo$1) {
                final RedditPredictionsRepository$fetchSubredditPredictorsLeaderboardInfo$1 redditPredictionsRepository$fetchSubredditPredictorsLeaderboardInfo$1 = (RedditPredictionsRepository$fetchSubredditPredictorsLeaderboardInfo$1)c;
                final int label = redditPredictionsRepository$fetchSubredditPredictorsLeaderboardInfo$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$fetchSubredditPredictorsLeaderboardInfo$1.label = label + Integer.MIN_VALUE;
                    o = redditPredictionsRepository$fetchSubredditPredictorsLeaderboardInfo$1;
                    break Label_0056;
                }
            }
            o = new RedditPredictionsRepository$fetchSubredditPredictorsLeaderboardInfo$1(redditPredictionsRepository, c);
        }
        final Object result = ((RedditPredictionsRepository$fetchSubredditPredictorsLeaderboardInfo$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPredictionsRepository$fetchSubredditPredictorsLeaderboardInfo$1)o).label;
        Object i;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            i = result;
        }
        else {
            d.b4(result);
            final RemoteGqlPredictionsDataSource a = redditPredictionsRepository.a;
            final String a2 = redditPredictionsRepository$a.a;
            final String c2 = redditPredictionsRepository$a.c;
            ((RedditPredictionsRepository$fetchSubredditPredictorsLeaderboardInfo$1)o).label = 1;
            if ((i = a.i(a2, c2, (gg2.c<? super l>)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final l l = (l)i;
        Object o2;
        if (l != null) {
            o2 = new u20.a((Object)l);
        }
        else {
            o2 = new u20.a((Object)null);
        }
        return o2;
    }
    
    public static final Object x(final RedditPredictionsRepository redditPredictionsRepository, final String s, final jd0.f f, final PostPoll postPoll, final boolean b, final gg2.c c) {
        redditPredictionsRepository.getClass();
        RedditPredictionsRepository$updateTournamentPostIfNeeded$1 redditPredictionsRepository$updateTournamentPostIfNeeded$2 = null;
        Label_0064: {
            if (c instanceof RedditPredictionsRepository$updateTournamentPostIfNeeded$1) {
                final RedditPredictionsRepository$updateTournamentPostIfNeeded$1 redditPredictionsRepository$updateTournamentPostIfNeeded$1 = (RedditPredictionsRepository$updateTournamentPostIfNeeded$1)c;
                final int label = redditPredictionsRepository$updateTournamentPostIfNeeded$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$updateTournamentPostIfNeeded$1.label = label + Integer.MIN_VALUE;
                    redditPredictionsRepository$updateTournamentPostIfNeeded$2 = redditPredictionsRepository$updateTournamentPostIfNeeded$1;
                    break Label_0064;
                }
            }
            redditPredictionsRepository$updateTournamentPostIfNeeded$2 = new RedditPredictionsRepository$updateTournamentPostIfNeeded$1(redditPredictionsRepository, c);
        }
        final Object result = redditPredictionsRepository$updateTournamentPostIfNeeded$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPredictionsRepository$updateTournamentPostIfNeeded$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            o = result;
        }
        else {
            d.b4(result);
            String s2;
            if (f instanceof f$b) {
                s2 = ((f$b)f).f;
            }
            else {
                if (!e.a((Object)f, (Object)f$a.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                final String predictionTournamentId = postPoll.getPredictionTournamentId();
                if (predictionTournamentId != null) {
                    s2 = redditPredictionsRepository.d.a(predictionTournamentId);
                }
                else {
                    s2 = null;
                }
            }
            if (s2 == null) {
                o = Boolean.FALSE;
                return o;
            }
            final ij2.a c2 = redditPredictionsRepository.k.c();
            final RedditPredictionsRepository$updateTournamentPostIfNeeded$2 redditPredictionsRepository$updateTournamentPostIfNeeded$3 = new RedditPredictionsRepository$updateTournamentPostIfNeeded$2(redditPredictionsRepository, s2, b, postPoll, s, (gg2.c)null);
            redditPredictionsRepository$updateTournamentPostIfNeeded$2.label = 1;
            if ((o = g.j((CoroutineContext)c2, (p)redditPredictionsRepository$updateTournamentPostIfNeeded$3, (gg2.c)redditPredictionsRepository$updateTournamentPostIfNeeded$2)) == coroutine_SUSPENDED) {
                o = coroutine_SUSPENDED;
                return o;
            }
        }
        e.e(o, "private suspend fun upda\u2026       .await()\n    }\n  }");
        return o;
    }
    
    public final Object A(final gg2.c<? super Integer> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RedditPredictionsRepository$getUpdatedUserCoinsBalance$1) {
                final RedditPredictionsRepository$getUpdatedUserCoinsBalance$1 redditPredictionsRepository$getUpdatedUserCoinsBalance$1 = (RedditPredictionsRepository$getUpdatedUserCoinsBalance$1)c;
                final int label = redditPredictionsRepository$getUpdatedUserCoinsBalance$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$getUpdatedUserCoinsBalance$1.label = label + Integer.MIN_VALUE;
                    o = redditPredictionsRepository$getUpdatedUserCoinsBalance$1;
                    break Label_0047;
                }
            }
            o = new RedditPredictionsRepository$getUpdatedUserCoinsBalance$1(this, (gg2.c)c);
        }
        final Object result = ((RedditPredictionsRepository$getUpdatedUserCoinsBalance$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPredictionsRepository$getUpdatedUserCoinsBalance$1)o).label;
        Integer n = null;
        Label_0090: {
            if (label2 == 0) {
                break Label_0090;
            }
            Label_0080: {
                if (label2 != 1) {
                    break Label_0080;
                }
                try {
                    cg.d.b4(result);
                    Object c2 = result;
                    Label_0123: {
                        n = (Integer)c2;
                    }
                    return n;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    cg.d.b4(result);
                    final te0.a f = this.f;
                    ((RedditPredictionsRepository$getUpdatedUserCoinsBalance$1)o).label = 1;
                    iftrue(Label_0123:)((c2 = f.c((ContinuationImpl)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final Exception ex) {
                    pu2.a.a.a(a.k(ex, a.t("Failed to retrieve updated user coins balance: ")), new Object[0]);
                    n = null;
                }
            }
        }
        return n;
    }
    
    public final void B() {
        this.z().clear();
        this.c.b();
    }
    
    public final Object C(final String s, final PostPoll postPoll, final Integer n, final boolean b, final jd0.f f, final ContinuationImpl continuationImpl) {
        return zi2.g.j((CoroutineContext)this.k.c(), (p)new RedditPredictionsRepository$onPredictionActionComplete$2(this, s, n, f, postPoll, b, (gg2.c)null), (gg2.c)continuationImpl);
    }
    
    public final Object D(String l$1, final String s, final gg2.c<? super Boolean> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditPredictionsRepository$upvotePostIfNeeded$1) {
                final RedditPredictionsRepository$upvotePostIfNeeded$1 redditPredictionsRepository$upvotePostIfNeeded$1 = (RedditPredictionsRepository$upvotePostIfNeeded$1)c;
                final int label = redditPredictionsRepository$upvotePostIfNeeded$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$upvotePostIfNeeded$1.label = label + Integer.MIN_VALUE;
                    o = redditPredictionsRepository$upvotePostIfNeeded$1;
                    break Label_0054;
                }
            }
            o = new RedditPredictionsRepository$upvotePostIfNeeded$1(this, (gg2.c)c);
        }
        Object o2 = ((RedditPredictionsRepository$upvotePostIfNeeded$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPredictionsRepository$upvotePostIfNeeded$1)o).label;
        boolean b = false;
        Label_0400: {
            RedditPredictionsRepository redditPredictionsRepository = null;
            boolean a = false;
            Label_0343: {
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            cg.d.b4(o2);
                            break Label_0400;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        l$1 = (String)((RedditPredictionsRepository$upvotePostIfNeeded$1)o).L$1;
                        redditPredictionsRepository = (RedditPredictionsRepository)((RedditPredictionsRepository$upvotePostIfNeeded$1)o).L$0;
                        cg.d.b4(o2);
                    }
                }
                else {
                    cg.d.b4(o2);
                    final m m = (m)this.h.d().invoke();
                    String kindWithId;
                    if (m != null) {
                        kindWithId = m.getKindWithId();
                    }
                    else {
                        kindWithId = null;
                    }
                    if (ng2.e.a((Object)kindWithId, (Object)s)) {
                        return Boolean.FALSE;
                    }
                    final Integer b2 = com.reddit.domain.vote.a.a.b(l$1);
                    if (b2 != null) {
                        if (b2 == 0) {
                            redditPredictionsRepository = this;
                            a = true;
                            break Label_0343;
                        }
                    }
                    boolean b3 = false;
                    Label_0262: {
                        Label_0253: {
                            if (b2 != null) {
                                if (b2 == -1) {
                                    break Label_0253;
                                }
                            }
                            if (b2 != null) {
                                if (b2 == 1) {
                                    break Label_0253;
                                }
                            }
                            b3 = false;
                            break Label_0262;
                        }
                        b3 = true;
                    }
                    if (b3) {
                        redditPredictionsRepository = this;
                        a = false;
                        break Label_0343;
                    }
                    final ij2.a c2 = this.k.c();
                    final RedditPredictionsRepository$upvotePostIfNeeded$shouldAutoUpVotePost$1 redditPredictionsRepository$upvotePostIfNeeded$shouldAutoUpVotePost$1 = new RedditPredictionsRepository$upvotePostIfNeeded$shouldAutoUpVotePost$1(this, l$1, (gg2.c)null);
                    ((RedditPredictionsRepository$upvotePostIfNeeded$1)o).L$0 = this;
                    ((RedditPredictionsRepository$upvotePostIfNeeded$1)o).L$1 = l$1;
                    ((RedditPredictionsRepository$upvotePostIfNeeded$1)o).label = 1;
                    o2 = zi2.g.j((CoroutineContext)c2, (p)redditPredictionsRepository$upvotePostIfNeeded$shouldAutoUpVotePost$1, (gg2.c)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    redditPredictionsRepository = this;
                }
                a = ng2.e.a(o2, (Object)Boolean.TRUE);
            }
            if (!a) {
                return b;
            }
            final ij2.a c3 = redditPredictionsRepository.k.c();
            final RedditPredictionsRepository$upvotePostIfNeeded$2 redditPredictionsRepository$upvotePostIfNeeded$2 = new RedditPredictionsRepository$upvotePostIfNeeded$2(redditPredictionsRepository, l$1, (gg2.c)null);
            ((RedditPredictionsRepository$upvotePostIfNeeded$1)o).L$0 = null;
            ((RedditPredictionsRepository$upvotePostIfNeeded$1)o).L$1 = null;
            ((RedditPredictionsRepository$upvotePostIfNeeded$1)o).label = 2;
            if (zi2.g.j((CoroutineContext)c3, (p)redditPredictionsRepository$upvotePostIfNeeded$2, (gg2.c)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        b = true;
        return b;
    }
    
    public final Object a(final jd0.d d, final gg2.c<? super LoadResult<PredictionsTournament>> c) {
        RedditPredictionsRepository$createTournament$1 redditPredictionsRepository$createTournament$2 = null;
        Label_0051: {
            if (c instanceof RedditPredictionsRepository$createTournament$1) {
                final RedditPredictionsRepository$createTournament$1 redditPredictionsRepository$createTournament$1 = (RedditPredictionsRepository$createTournament$1)c;
                final int label = redditPredictionsRepository$createTournament$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$createTournament$1.label = label + Integer.MIN_VALUE;
                    redditPredictionsRepository$createTournament$2 = redditPredictionsRepository$createTournament$1;
                    break Label_0051;
                }
            }
            redditPredictionsRepository$createTournament$2 = new RedditPredictionsRepository$createTournament$1(this, (gg2.c)c);
        }
        final Object result = redditPredictionsRepository$createTournament$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPredictionsRepository$createTournament$2.label;
        RedditPredictionsRepository redditPredictionsRepository;
        Object e;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redditPredictionsRepository = (RedditPredictionsRepository)redditPredictionsRepository$createTournament$2.L$0;
            d.b4(result);
            e = result;
        }
        else {
            d.b4(result);
            final RemoteGqlPredictionsDataSource a = this.a;
            redditPredictionsRepository$createTournament$2.L$0 = this;
            redditPredictionsRepository$createTournament$2.label = 1;
            e = a.e(d, (gg2.c<? super LoadResult<PredictionsTournament>>)redditPredictionsRepository$createTournament$2);
            if (e == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPredictionsRepository = this;
        }
        final LoadResult loadResult = (LoadResult)e;
        redditPredictionsRepository.B();
        return e;
    }
    
    public final Object b(final String s, final gg2.c c) {
        return zi2.g.j((CoroutineContext)this.k.c(), (p)new RedditPredictionsRepository$getSubredditPredictorsLeaderboard$2(this, s, true, (gg2.c)null), c);
    }
    
    public final c0 c(final String s, final String s2, final jd0.e e) {
        e.f((Object)s, "tournamentId");
        e.f((Object)s2, "subredditKindWithId");
        return ah0.b.m1((p)new RedditPredictionsRepository$submitPredictionPostToTournamentRx$1(this, s, s2, e, true, (gg2.c)null));
    }
    
    public final Object d(String l$1, final long n, f$a l$2, final gg2.c c) {
        RedditPredictionsRepository$updateVotingEndTime$1 redditPredictionsRepository$updateVotingEndTime$2 = null;
        Label_0059: {
            if (c instanceof RedditPredictionsRepository$updateVotingEndTime$1) {
                final RedditPredictionsRepository$updateVotingEndTime$1 redditPredictionsRepository$updateVotingEndTime$1 = (RedditPredictionsRepository$updateVotingEndTime$1)c;
                final int label = redditPredictionsRepository$updateVotingEndTime$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$updateVotingEndTime$1.label = label + Integer.MIN_VALUE;
                    redditPredictionsRepository$updateVotingEndTime$2 = redditPredictionsRepository$updateVotingEndTime$1;
                    break Label_0059;
                }
            }
            redditPredictionsRepository$updateVotingEndTime$2 = new RedditPredictionsRepository$updateVotingEndTime$1(this, c);
        }
        Object o = redditPredictionsRepository$updateVotingEndTime$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPredictionsRepository$updateVotingEndTime$2.label;
        RedditPredictionsRepository redditPredictionsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final Object o2 = redditPredictionsRepository$updateVotingEndTime$2.L$0;
                    cg.d.b4(o);
                    return o2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$2 = (f$a)redditPredictionsRepository$updateVotingEndTime$2.L$2;
                l$1 = (String)redditPredictionsRepository$updateVotingEndTime$2.L$1;
                redditPredictionsRepository = (RedditPredictionsRepository)redditPredictionsRepository$updateVotingEndTime$2.L$0;
                cg.d.b4(o);
            }
        }
        else {
            cg.d.b4(o);
            if (!this.g.a5()) {
                return new LoadResult$Error(ErrorType.DISABLED_FEATURE, (String)null);
            }
            final RemoteGqlPredictionsDataSource a = this.a;
            redditPredictionsRepository$updateVotingEndTime$2.L$0 = this;
            redditPredictionsRepository$updateVotingEndTime$2.L$1 = l$1;
            redditPredictionsRepository$updateVotingEndTime$2.L$2 = l$2;
            redditPredictionsRepository$updateVotingEndTime$2.label = 1;
            o = a.p(l$1, n, (gg2.c<? super LoadResult<PostPoll>>)redditPredictionsRepository$updateVotingEndTime$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPredictionsRepository = this;
        }
        Object o3;
        final LoadResult l$3 = (LoadResult)(o3 = o);
        if (!(l$3 instanceof LoadResult$Success)) {
            return o3;
        }
        final PostPoll postPoll = (PostPoll)((LoadResult$Success)l$3).getData();
        redditPredictionsRepository$updateVotingEndTime$2.L$0 = l$3;
        redditPredictionsRepository$updateVotingEndTime$2.L$1 = null;
        redditPredictionsRepository$updateVotingEndTime$2.L$2 = null;
        redditPredictionsRepository$updateVotingEndTime$2.label = 2;
        if (redditPredictionsRepository.C(l$1, postPoll, null, false, (jd0.f)l$2, (ContinuationImpl)redditPredictionsRepository$updateVotingEndTime$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final Object o2 = l$3;
        o3 = o2;
        return o3;
    }
    
    public final t e(final String s) {
        ng2.e.f((Object)s, "subredditName");
        final t onAssembly = RxJavaPlugins.onAssembly((t)new SingleFlatMapObservable((g0)this.y(s, null, false), (ff2.o)new lv.b(8)));
        ng2.e.e((Object)onAssembly, "getPredictorsLeaderboard\u2026just(emptyList())\n      }");
        return px0.c.T2(onAssembly, this.e);
    }
    
    public final af2.n f(final String s) {
        ng2.e.f((Object)s, "subredditName");
        final af2.n onAssembly = RxJavaPlugins.onAssembly((af2.n)new SingleFlatMapMaybe((g0)this.y(s, null, false), (ff2.o)new su.d(8)));
        ng2.e.e((Object)onAssembly, "getPredictorsLeaderboard\u2026 ?: Maybe.empty()\n      }");
        return px1.a.J0(onAssembly, (q20.d)this.e);
    }
    
    public final Object g(final String s, final gg2.c<? super Integer> c) {
        return this.a.k(s, c);
    }
    
    public final Object h(final String l$1, String s, final String s2, String l$2, PredictionCurrency l$3, String l$4, final jd0.f l$5, final gg2.c<? super h> c) {
        RedditPredictionsRepository$predict$1 redditPredictionsRepository$predict$1 = null;
        Label_0055: {
            if (c instanceof RedditPredictionsRepository$predict$1) {
                redditPredictionsRepository$predict$1 = (RedditPredictionsRepository$predict$1)c;
                final int label = redditPredictionsRepository$predict$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$predict$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            redditPredictionsRepository$predict$1 = new RedditPredictionsRepository$predict$1(this, (gg2.c)c);
        }
        Object o = redditPredictionsRepository$predict$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPredictionsRepository$predict$1.label;
        PostPoll postPoll = null;
        jd0.f f = null;
        RedditPredictionsRepository redditPredictionsRepository = null;
        Integer l$6 = null;
        Label_0594: {
            Object a = null;
            Label_0524: {
                Boolean b;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            postPoll = (PostPoll)redditPredictionsRepository$predict$1.L$4;
                            f = (jd0.f)redditPredictionsRepository$predict$1.L$3;
                            l$4 = (String)redditPredictionsRepository$predict$1.L$2;
                            s = (String)redditPredictionsRepository$predict$1.L$1;
                            redditPredictionsRepository = (RedditPredictionsRepository)redditPredictionsRepository$predict$1.L$0;
                            cg.d.b4(o);
                            a = o;
                            break Label_0524;
                        }
                        if (label2 == 3) {
                            l$6 = (Integer)redditPredictionsRepository$predict$1.L$4;
                            postPoll = (PostPoll)redditPredictionsRepository$predict$1.L$3;
                            f = (jd0.f)redditPredictionsRepository$predict$1.L$2;
                            s = (String)redditPredictionsRepository$predict$1.L$1;
                            redditPredictionsRepository = (RedditPredictionsRepository)redditPredictionsRepository$predict$1.L$0;
                            cg.d.b4(o);
                            break Label_0594;
                        }
                        if (label2 == 4) {
                            final boolean z$0 = redditPredictionsRepository$predict$1.Z$0;
                            final PostPoll postPoll2 = (PostPoll)redditPredictionsRepository$predict$1.L$0;
                            cg.d.b4(o);
                            return new h(postPoll2, z$0, (boolean)o);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        f = (jd0.f)redditPredictionsRepository$predict$1.L$4;
                        s = (String)redditPredictionsRepository$predict$1.L$3;
                        l$3 = (PredictionCurrency)redditPredictionsRepository$predict$1.L$2;
                        l$2 = (String)redditPredictionsRepository$predict$1.L$1;
                        redditPredictionsRepository = (RedditPredictionsRepository)redditPredictionsRepository$predict$1.L$0;
                        cg.d.b4(o);
                        b = (Boolean)o;
                    }
                }
                else {
                    cg.d.b4(o);
                    final RemoteGqlPredictionsDataSource a2 = this.a;
                    redditPredictionsRepository$predict$1.L$0 = this;
                    redditPredictionsRepository$predict$1.L$1 = l$1;
                    redditPredictionsRepository$predict$1.L$2 = l$3;
                    redditPredictionsRepository$predict$1.L$3 = l$4;
                    redditPredictionsRepository$predict$1.L$4 = l$5;
                    redditPredictionsRepository$predict$1.label = 1;
                    final Object l = a2.l(l$1, s, s2, l$2, (gg2.c<? super PostPoll>)redditPredictionsRepository$predict$1);
                    if (l == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    s = l$4;
                    redditPredictionsRepository = this;
                    b = (Boolean)l;
                    f = l$5;
                    l$2 = l$1;
                }
                final PostPoll l$7 = (PostPoll)b;
                redditPredictionsRepository$predict$1.L$0 = redditPredictionsRepository;
                redditPredictionsRepository$predict$1.L$1 = l$2;
                redditPredictionsRepository$predict$1.L$2 = s;
                redditPredictionsRepository$predict$1.L$3 = f;
                redditPredictionsRepository$predict$1.L$4 = l$7;
                redditPredictionsRepository$predict$1.label = 2;
                redditPredictionsRepository.getClass();
                final int n = RedditPredictionsRepository.RedditPredictionsRepository$c.a[l$3.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a = null;
                }
                else {
                    a = redditPredictionsRepository.A((gg2.c<? super Integer>)redditPredictionsRepository$predict$1);
                }
                if (a == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                l$4 = l$2;
                postPoll = l$7;
                final String s3 = s;
                s = l$4;
                l$4 = s3;
            }
            l$6 = (Integer)a;
            redditPredictionsRepository$predict$1.L$0 = redditPredictionsRepository;
            redditPredictionsRepository$predict$1.L$1 = s;
            redditPredictionsRepository$predict$1.L$2 = f;
            redditPredictionsRepository$predict$1.L$3 = postPoll;
            redditPredictionsRepository$predict$1.L$4 = l$6;
            redditPredictionsRepository$predict$1.label = 3;
            if ((o = redditPredictionsRepository.D(s, l$4, (gg2.c<? super Boolean>)redditPredictionsRepository$predict$1)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final boolean z$0 = (boolean)o;
        redditPredictionsRepository$predict$1.L$0 = postPoll;
        redditPredictionsRepository$predict$1.L$1 = null;
        redditPredictionsRepository$predict$1.L$2 = null;
        redditPredictionsRepository$predict$1.L$3 = null;
        redditPredictionsRepository$predict$1.L$4 = null;
        redditPredictionsRepository$predict$1.Z$0 = z$0;
        redditPredictionsRepository$predict$1.label = 4;
        o = redditPredictionsRepository.C(s, postPoll, l$6, z$0, f, (ContinuationImpl)redditPredictionsRepository$predict$1);
        if (o == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final PostPoll postPoll2 = postPoll;
        return new h(postPoll2, z$0, (boolean)o);
    }
    
    public final Object i(final String s, final String s2, final gg2.c c) {
        return zi2.g.j((CoroutineContext)this.k.c(), (p)new RedditPredictionsRepository$getSubredditTournamentPredictorsLeaderboard$2(this, s, s2, true, (gg2.c)null), c);
    }
    
    public final Serializable j(final String s, final gg2.c c) {
        return this.a.g(s, c);
    }
    
    public final Object k(final String s, final String s2, final gg2.c c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditPredictionsRepository$getSubredditPredictionTournament$1) {
                final RedditPredictionsRepository$getSubredditPredictionTournament$1 redditPredictionsRepository$getSubredditPredictionTournament$1 = (RedditPredictionsRepository$getSubredditPredictionTournament$1)c;
                final int label = redditPredictionsRepository$getSubredditPredictionTournament$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$getSubredditPredictionTournament$1.label = label + Integer.MIN_VALUE;
                    o = redditPredictionsRepository$getSubredditPredictionTournament$1;
                    break Label_0054;
                }
            }
            o = new RedditPredictionsRepository$getSubredditPredictionTournament$1(this, c);
        }
        final Object result = ((RedditPredictionsRepository$getSubredditPredictionTournament$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPredictionsRepository$getSubredditPredictionTournament$1)o).label;
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
            final PredictionsTournament c2 = this.c.c(s2);
            if (c2 != null) {
                return new u20.a((Object)c2);
            }
            final c0 value = this.z().get((Object)new RedditPredictionsRepository.RedditPredictionsRepository$b(s, (od0.d)new od0.d.a(s2)));
            ng2.e.e((Object)value, "if (requestFresh) {\n    \u2026ntsStore.get(key)\n      }");
            final ij2.a c3 = this.k.c();
            final RedditPredictionsRepository$getSubredditPredictionTournament$2 redditPredictionsRepository$getSubredditPredictionTournament$2 = new RedditPredictionsRepository$getSubredditPredictionTournament$2(value, this, s2, (gg2.c)null);
            ((RedditPredictionsRepository$getSubredditPredictionTournament$1)o).label = 1;
            if ((j = zi2.g.j((CoroutineContext)c3, (p)redditPredictionsRepository$getSubredditPredictionTournament$2, (gg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(j, "override suspend fun get\u2026await()\n      }\n    }\n  }");
        return (u20.a)j;
    }
    
    public final Object l(final String s, final boolean b, final gg2.c<? super PredictionsTournament> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditPredictionsRepository$getLiveTournament$1) {
                final RedditPredictionsRepository$getLiveTournament$1 redditPredictionsRepository$getLiveTournament$1 = (RedditPredictionsRepository$getLiveTournament$1)c;
                final int label = redditPredictionsRepository$getLiveTournament$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$getLiveTournament$1.label = label + Integer.MIN_VALUE;
                    o = redditPredictionsRepository$getLiveTournament$1;
                    break Label_0054;
                }
            }
            o = new RedditPredictionsRepository$getLiveTournament$1(this, (gg2.c)c);
        }
        final Object result = ((RedditPredictionsRepository$getLiveTournament$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPredictionsRepository$getLiveTournament$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            b2 = result;
        }
        else {
            cg.d.b4(result);
            final c0<u20.a<List<PredictionsTournament>>> q = this.q(s, b);
            ((RedditPredictionsRepository$getLiveTournament$1)o).label = 1;
            if ((b2 = kotlinx.coroutines.rx2.d.b(q, (gg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final List list = (List)((u20.a)b2).a;
        Object o2 = null;
        final PredictionsTournament predictionsTournament = null;
        if (list != null) {
            final Iterator iterator = list.iterator();
            Object next;
            do {
                next = predictionsTournament;
                if (!iterator.hasNext()) {
                    break;
                }
                next = iterator.next();
            } while (!((PredictionsTournament)next).isLive());
            o2 = next;
        }
        return o2;
    }
    
    public final Object m(String s, final String s2, PredictionCurrency l$2, final gg2.c<? super LoadResult<PostPoll>> c) {
        RedditPredictionsRepository$changePredictionResult$1 redditPredictionsRepository$changePredictionResult$2 = null;
        Label_0059: {
            if (c instanceof RedditPredictionsRepository$changePredictionResult$1) {
                final RedditPredictionsRepository$changePredictionResult$1 redditPredictionsRepository$changePredictionResult$1 = (RedditPredictionsRepository$changePredictionResult$1)c;
                final int label = redditPredictionsRepository$changePredictionResult$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$changePredictionResult$1.label = label + Integer.MIN_VALUE;
                    redditPredictionsRepository$changePredictionResult$2 = redditPredictionsRepository$changePredictionResult$1;
                    break Label_0059;
                }
            }
            redditPredictionsRepository$changePredictionResult$2 = new RedditPredictionsRepository$changePredictionResult$1(this, (gg2.c)c);
        }
        Object o = redditPredictionsRepository$changePredictionResult$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPredictionsRepository$changePredictionResult$2.label;
        Object l$3 = null;
        String s3 = null;
        RedditPredictionsRepository l$4 = null;
        Object o2 = null;
        Label_0392: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        l$3 = redditPredictionsRepository$changePredictionResult$2.L$2;
                        s3 = (String)redditPredictionsRepository$changePredictionResult$2.L$1;
                        l$4 = (RedditPredictionsRepository)redditPredictionsRepository$changePredictionResult$2.L$0;
                        cg.d.b4(o);
                        o2 = o;
                        break Label_0392;
                    }
                    if (label2 == 3) {
                        l$3 = redditPredictionsRepository$changePredictionResult$2.L$0;
                        cg.d.b4(o);
                        return l$3;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    l$2 = (PredictionCurrency)redditPredictionsRepository$changePredictionResult$2.L$2;
                    s = (String)redditPredictionsRepository$changePredictionResult$2.L$1;
                    l$4 = (RedditPredictionsRepository)redditPredictionsRepository$changePredictionResult$2.L$0;
                    cg.d.b4(o);
                }
            }
            else {
                cg.d.b4(o);
                if (!this.g.L9()) {
                    return new LoadResult$Error(ErrorType.DISABLED_FEATURE, (String)null);
                }
                final RemoteGqlPredictionsDataSource a = this.a;
                redditPredictionsRepository$changePredictionResult$2.L$0 = this;
                redditPredictionsRepository$changePredictionResult$2.L$1 = s;
                redditPredictionsRepository$changePredictionResult$2.L$2 = l$2;
                redditPredictionsRepository$changePredictionResult$2.label = 1;
                o = a.c(s, s2, (gg2.c<? super LoadResult<PostPoll>>)redditPredictionsRepository$changePredictionResult$2);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                l$4 = this;
            }
            final Object o3;
            final LoadResult l$5 = (LoadResult)(o3 = o);
            if (!(l$5 instanceof LoadResult$Success)) {
                return o3;
            }
            redditPredictionsRepository$changePredictionResult$2.L$0 = l$4;
            redditPredictionsRepository$changePredictionResult$2.L$1 = s;
            redditPredictionsRepository$changePredictionResult$2.L$2 = l$5;
            redditPredictionsRepository$changePredictionResult$2.label = 2;
            l$4.getClass();
            final int n = RedditPredictionsRepository.RedditPredictionsRepository$c.a[l$2.ordinal()];
            Object a2;
            if (n != 1) {
                if (n != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = null;
            }
            else {
                a2 = l$4.A((gg2.c<? super Integer>)redditPredictionsRepository$changePredictionResult$2);
            }
            if (a2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o2 = a2;
            s3 = s;
            l$3 = l$5;
        }
        final Integer n2 = (Integer)o2;
        final f$a f = f$a.f;
        final PostPoll postPoll = (PostPoll)((LoadResult$Success)l$3).getData();
        redditPredictionsRepository$changePredictionResult$2.L$0 = l$3;
        redditPredictionsRepository$changePredictionResult$2.L$1 = null;
        redditPredictionsRepository$changePredictionResult$2.L$2 = null;
        redditPredictionsRepository$changePredictionResult$2.label = 3;
        if (l$4.C(s3, postPoll, n2, false, (jd0.f)f, (ContinuationImpl)redditPredictionsRepository$changePredictionResult$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return l$3;
    }
    
    public final Object n(final String s, final String s2, final gg2.c<? super LoadResult<PredictionsTournament>> c) {
        RedditPredictionsRepository$renameTournament$1 redditPredictionsRepository$renameTournament$2 = null;
        Label_0054: {
            if (c instanceof RedditPredictionsRepository$renameTournament$1) {
                final RedditPredictionsRepository$renameTournament$1 redditPredictionsRepository$renameTournament$1 = (RedditPredictionsRepository$renameTournament$1)c;
                final int label = redditPredictionsRepository$renameTournament$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$renameTournament$1.label = label + Integer.MIN_VALUE;
                    redditPredictionsRepository$renameTournament$2 = redditPredictionsRepository$renameTournament$1;
                    break Label_0054;
                }
            }
            redditPredictionsRepository$renameTournament$2 = new RedditPredictionsRepository$renameTournament$1(this, (gg2.c)c);
        }
        final Object result = redditPredictionsRepository$renameTournament$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPredictionsRepository$renameTournament$2.label;
        final LoadResult$Success loadResult$Success = null;
        RedditPredictionsRepository redditPredictionsRepository;
        Object m;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redditPredictionsRepository = (RedditPredictionsRepository)redditPredictionsRepository$renameTournament$2.L$0;
            cg.d.b4(result);
            m = result;
        }
        else {
            cg.d.b4(result);
            if (!this.g.H8()) {
                return new LoadResult$Error(ErrorType.DISABLED_FEATURE, (String)null);
            }
            final RemoteGqlPredictionsDataSource a = this.a;
            redditPredictionsRepository$renameTournament$2.L$0 = this;
            redditPredictionsRepository$renameTournament$2.label = 1;
            m = a.m(s, s2, (gg2.c<? super LoadResult<PredictionsTournament>>)redditPredictionsRepository$renameTournament$2);
            if (m == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPredictionsRepository = this;
        }
        final LoadResult loadResult = (LoadResult)m;
        LoadResult$Success loadResult$Success2 = loadResult$Success;
        if (loadResult instanceof LoadResult$Success) {
            loadResult$Success2 = (LoadResult$Success)loadResult;
        }
        if (loadResult$Success2 != null) {
            redditPredictionsRepository.B();
        }
        return m;
    }
    
    public final Object o(final String s, final String s2, final jd0.e e, final boolean b, final gg2.c<? super LoadResult<PredictionsTournament>> c) {
        RedditPredictionsRepository$submitPredictionPostToTournament$1 redditPredictionsRepository$submitPredictionPostToTournament$2 = null;
        Label_0059: {
            if (c instanceof RedditPredictionsRepository$submitPredictionPostToTournament$1) {
                final RedditPredictionsRepository$submitPredictionPostToTournament$1 redditPredictionsRepository$submitPredictionPostToTournament$1 = (RedditPredictionsRepository$submitPredictionPostToTournament$1)c;
                final int label = redditPredictionsRepository$submitPredictionPostToTournament$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$submitPredictionPostToTournament$1.label = label + Integer.MIN_VALUE;
                    redditPredictionsRepository$submitPredictionPostToTournament$2 = redditPredictionsRepository$submitPredictionPostToTournament$1;
                    break Label_0059;
                }
            }
            redditPredictionsRepository$submitPredictionPostToTournament$2 = new RedditPredictionsRepository$submitPredictionPostToTournament$1(this, (gg2.c)c);
        }
        final Object result = redditPredictionsRepository$submitPredictionPostToTournament$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPredictionsRepository$submitPredictionPostToTournament$2.label;
        RedditPredictionsRepository redditPredictionsRepository;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redditPredictionsRepository = (RedditPredictionsRepository)redditPredictionsRepository$submitPredictionPostToTournament$2.L$0;
            cg.d.b4(result);
            b2 = result;
        }
        else {
            cg.d.b4(result);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(s2);
            sb.append(e);
            final byte[] bytes = sb.toString().getBytes(xi2.a.b);
            e.e((Object)bytes, "this as java.lang.String).getBytes(charset)");
            final String string = UUID.nameUUIDFromBytes(bytes).toString();
            e.e((Object)string, "nameUUIDFromBytes((tourn\u2026toByteArray()).toString()");
            final String l = b.l("add-dfts-", string);
            final RemoteGqlPredictionsDataSource a = this.a;
            redditPredictionsRepository$submitPredictionPostToTournament$2.L$0 = this;
            redditPredictionsRepository$submitPredictionPostToTournament$2.label = 1;
            b2 = a.b(l, s, s2, e, b, (gg2.c<? super LoadResult<PredictionsTournament>>)redditPredictionsRepository$submitPredictionPostToTournament$2);
            if (b2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPredictionsRepository = this;
        }
        final LoadResult loadResult = (LoadResult)b2;
        redditPredictionsRepository.B();
        return loadResult;
    }
    
    public final Object p(final String s, final gg2.c<? super LoadResult<PredictionsTournament>> c) {
        RedditPredictionsRepository$endTournament$1 redditPredictionsRepository$endTournament$2 = null;
        Label_0051: {
            if (c instanceof RedditPredictionsRepository$endTournament$1) {
                final RedditPredictionsRepository$endTournament$1 redditPredictionsRepository$endTournament$1 = (RedditPredictionsRepository$endTournament$1)c;
                final int label = redditPredictionsRepository$endTournament$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$endTournament$1.label = label + Integer.MIN_VALUE;
                    redditPredictionsRepository$endTournament$2 = redditPredictionsRepository$endTournament$1;
                    break Label_0051;
                }
            }
            redditPredictionsRepository$endTournament$2 = new RedditPredictionsRepository$endTournament$1(this, (gg2.c)c);
        }
        final Object result = redditPredictionsRepository$endTournament$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPredictionsRepository$endTournament$2.label;
        LoadResult$Success loadResult$Success = null;
        RedditPredictionsRepository redditPredictionsRepository;
        Object f;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redditPredictionsRepository = (RedditPredictionsRepository)redditPredictionsRepository$endTournament$2.L$0;
            cg.d.b4(result);
            f = result;
        }
        else {
            cg.d.b4(result);
            if (!this.g.H8()) {
                return new LoadResult$Error(ErrorType.DISABLED_FEATURE, (String)null);
            }
            final RemoteGqlPredictionsDataSource a = this.a;
            redditPredictionsRepository$endTournament$2.L$0 = this;
            redditPredictionsRepository$endTournament$2.label = 1;
            f = a.f(s, (gg2.c<? super LoadResult<PredictionsTournament>>)redditPredictionsRepository$endTournament$2);
            if (f == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPredictionsRepository = this;
        }
        final LoadResult loadResult = (LoadResult)f;
        if (loadResult instanceof LoadResult$Success) {
            loadResult$Success = (LoadResult$Success)loadResult;
        }
        if (loadResult$Success != null) {
            redditPredictionsRepository.B();
        }
        return f;
    }
    
    public final c0<u20.a<List<PredictionsTournament>>> q(final String s, final boolean b) {
        ng2.e.f((Object)s, "subredditName");
        final RedditPredictionsRepository.RedditPredictionsRepository$b redditPredictionsRepository$b = new RedditPredictionsRepository.RedditPredictionsRepository$b(s, (od0.d)od0.d.b.a);
        c0 c0;
        if (b) {
            c0 = this.z().m((Object)redditPredictionsRepository$b);
            ng2.e.e((Object)c0, "{\n      subredditPredict\u2026ntsStore.fetch(key)\n    }");
        }
        else {
            c0 = this.z().get((Object)redditPredictionsRepository$b);
            ng2.e.e((Object)c0, "{\n      subredditPredict\u2026mentsStore.get(key)\n    }");
        }
        return c0;
    }
    
    public final void r(final String s, final String s2) {
        ng2.e.f((Object)s, "tournamentId");
        ng2.e.f((Object)s2, "tournamentPostKindWithId");
        this.d.b(s, s2);
    }
    
    public final Object s(String s, final String s2, final gg2.c<? super PostPoll> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditPredictionsRepository$resolve$1) {
                final RedditPredictionsRepository$resolve$1 redditPredictionsRepository$resolve$1 = (RedditPredictionsRepository$resolve$1)c;
                final int label = redditPredictionsRepository$resolve$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$resolve$1.label = label + Integer.MIN_VALUE;
                    o = redditPredictionsRepository$resolve$1;
                    break Label_0054;
                }
            }
            o = new RedditPredictionsRepository$resolve$1(this, (gg2.c)c);
        }
        Object o2 = ((RedditPredictionsRepository$resolve$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPredictionsRepository$resolve$1)o).label;
        RedditPredictionsRepository redditPredictionsRepository = null;
        PostPoll postPoll2 = null;
        Label_0349: {
            PostPoll l$1 = null;
            String s3 = null;
            RedditPredictionsRepository l$2 = null;
            Label_0290: {
                RedditPredictionsRepository l$3;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            l$1 = (PostPoll)((RedditPredictionsRepository$resolve$1)o).L$2;
                            s3 = (String)((RedditPredictionsRepository$resolve$1)o).L$1;
                            l$2 = (RedditPredictionsRepository)((RedditPredictionsRepository$resolve$1)o).L$0;
                            cg.d.b4(o2);
                            break Label_0290;
                        }
                        if (label2 == 3) {
                            final PostPoll postPoll = (PostPoll)((RedditPredictionsRepository$resolve$1)o).L$1;
                            redditPredictionsRepository = (RedditPredictionsRepository)((RedditPredictionsRepository$resolve$1)o).L$0;
                            cg.d.b4(o2);
                            postPoll2 = postPoll;
                            break Label_0349;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        s = (String)((RedditPredictionsRepository$resolve$1)o).L$1;
                        l$3 = (RedditPredictionsRepository)((RedditPredictionsRepository$resolve$1)o).L$0;
                        cg.d.b4(o2);
                    }
                }
                else {
                    cg.d.b4(o2);
                    final RemoteGqlPredictionsDataSource a = this.a;
                    ((RedditPredictionsRepository$resolve$1)o).L$0 = this;
                    ((RedditPredictionsRepository$resolve$1)o).L$1 = s;
                    ((RedditPredictionsRepository$resolve$1)o).label = 1;
                    o2 = a.n(s, s2, (gg2.c<? super PostPoll>)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    l$3 = this;
                }
                final PostPoll l$4 = (PostPoll)o2;
                ((RedditPredictionsRepository$resolve$1)o).L$0 = l$3;
                ((RedditPredictionsRepository$resolve$1)o).L$1 = s;
                ((RedditPredictionsRepository$resolve$1)o).L$2 = l$4;
                ((RedditPredictionsRepository$resolve$1)o).label = 2;
                o2 = l$3.A((gg2.c<? super Integer>)o);
                if (o2 == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                s3 = s;
                l$2 = l$3;
                l$1 = l$4;
            }
            final Integer n = (Integer)o2;
            final f$a f = f$a.f;
            ((RedditPredictionsRepository$resolve$1)o).L$0 = l$2;
            ((RedditPredictionsRepository$resolve$1)o).L$1 = l$1;
            ((RedditPredictionsRepository$resolve$1)o).L$2 = null;
            ((RedditPredictionsRepository$resolve$1)o).label = 3;
            postPoll2 = l$1;
            redditPredictionsRepository = l$2;
            if (l$2.C(s3, l$1, n, false, (jd0.f)f, (ContinuationImpl)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final Object value = redditPredictionsRepository.l.getValue();
        ng2.e.e(value, "<get-predictorsLeaderboardStore>(...)");
        ((Store)value).clear();
        return postPoll2;
    }
    
    public final Object t(final od0.d d, final String s, final gg2.c c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1) {
                final RedditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1 redditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1 = (RedditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1)c;
                final int label = redditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1.label = label + Integer.MIN_VALUE;
                    o = redditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1;
                    break Label_0054;
                }
            }
            o = new RedditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1(this, c);
        }
        final Object result = ((RedditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1)o).label;
        RedditPredictionsRepository redditPredictionsRepository;
        Object j;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redditPredictionsRepository = (RedditPredictionsRepository)((RedditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1)o).L$0;
            d.b4(result);
            j = result;
        }
        else {
            d.b4(result);
            final RemoteGqlPredictionsDataSource a = this.a;
            ((RedditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1)o).L$0 = this;
            ((RedditPredictionsRepository$getSubredditPredictionsTournamentHeaderInfo$1)o).label = 1;
            j = a.j(d, s, (gg2.c)o);
            if (j == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPredictionsRepository = this;
        }
        final md0.b b = (md0.b)j;
        if (b != null) {
            final PredictionsTournament a2 = b.a;
            if (a2 != null) {
                redditPredictionsRepository.c.a(a2);
            }
        }
        return j;
    }
    
    public final Object u(String l$1, final String s, jd0.f l$2, final gg2.c<? super LoadResult<PostPoll>> c) {
        RedditPredictionsRepository$changePredictionVote$1 redditPredictionsRepository$changePredictionVote$2 = null;
        Label_0059: {
            if (c instanceof RedditPredictionsRepository$changePredictionVote$1) {
                final RedditPredictionsRepository$changePredictionVote$1 redditPredictionsRepository$changePredictionVote$1 = (RedditPredictionsRepository$changePredictionVote$1)c;
                final int label = redditPredictionsRepository$changePredictionVote$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPredictionsRepository$changePredictionVote$1.label = label + Integer.MIN_VALUE;
                    redditPredictionsRepository$changePredictionVote$2 = redditPredictionsRepository$changePredictionVote$1;
                    break Label_0059;
                }
            }
            redditPredictionsRepository$changePredictionVote$2 = new RedditPredictionsRepository$changePredictionVote$1(this, (gg2.c)c);
        }
        Object o = redditPredictionsRepository$changePredictionVote$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPredictionsRepository$changePredictionVote$2.label;
        RedditPredictionsRepository redditPredictionsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final Object o2 = redditPredictionsRepository$changePredictionVote$2.L$0;
                    cg.d.b4(o);
                    return o2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$2 = (jd0.f)redditPredictionsRepository$changePredictionVote$2.L$2;
                l$1 = (String)redditPredictionsRepository$changePredictionVote$2.L$1;
                redditPredictionsRepository = (RedditPredictionsRepository)redditPredictionsRepository$changePredictionVote$2.L$0;
                cg.d.b4(o);
            }
        }
        else {
            cg.d.b4(o);
            if (!this.g.Y2()) {
                return new LoadResult$Error(ErrorType.DISABLED_FEATURE, (String)null);
            }
            final RemoteGqlPredictionsDataSource a = this.a;
            redditPredictionsRepository$changePredictionVote$2.L$0 = this;
            redditPredictionsRepository$changePredictionVote$2.L$1 = l$1;
            redditPredictionsRepository$changePredictionVote$2.L$2 = l$2;
            redditPredictionsRepository$changePredictionVote$2.label = 1;
            o = a.d(l$1, s, (gg2.c<? super LoadResult<PostPoll>>)redditPredictionsRepository$changePredictionVote$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPredictionsRepository = this;
        }
        Object o3;
        final LoadResult l$3 = (LoadResult)(o3 = o);
        if (!(l$3 instanceof LoadResult$Success)) {
            return o3;
        }
        final PostPoll postPoll = (PostPoll)((LoadResult$Success)l$3).getData();
        redditPredictionsRepository$changePredictionVote$2.L$0 = l$3;
        redditPredictionsRepository$changePredictionVote$2.L$1 = null;
        redditPredictionsRepository$changePredictionVote$2.L$2 = null;
        redditPredictionsRepository$changePredictionVote$2.label = 2;
        if (redditPredictionsRepository.C(l$1, postPoll, null, false, l$2, (ContinuationImpl)redditPredictionsRepository$changePredictionVote$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final Object o2 = l$3;
        o3 = o2;
        return o3;
    }
    
    public final c0<u20.a<l>> y(final String s, final String s2, final boolean b) {
        String username;
        if ((username = ((Session)this.h.c()).getUsername()) == null) {
            username = "";
        }
        final RedditPredictionsRepository.RedditPredictionsRepository$a redditPredictionsRepository$a = new RedditPredictionsRepository.RedditPredictionsRepository$a(s, username, s2);
        c0 c0;
        if (b) {
            final Object value = this.l.getValue();
            ng2.e.e(value, "<get-predictorsLeaderboardStore>(...)");
            c0 = ((Store)value).m((Object)redditPredictionsRepository$a);
            ng2.e.e((Object)c0, "{\n      predictorsLeader\u2026ardStore.fetch(key)\n    }");
        }
        else {
            final Object value2 = this.l.getValue();
            ng2.e.e(value2, "<get-predictorsLeaderboardStore>(...)");
            c0 = ((Store)value2).get((Object)redditPredictionsRepository$a);
            ng2.e.e((Object)c0, "{\n      predictorsLeaderboardStore.get(key)\n    }");
        }
        return c0;
    }
    
    public final Store<u20.a<List<PredictionsTournament>>, RedditPredictionsRepository.RedditPredictionsRepository$b> z() {
        final Object value = this.m.getValue();
        ng2.e.e(value, "<get-subredditPredictionTournamentsStore>(...)");
        return (Store<u20.a<List<PredictionsTournament>>, RedditPredictionsRepository.RedditPredictionsRepository$b>)value;
    }
}
