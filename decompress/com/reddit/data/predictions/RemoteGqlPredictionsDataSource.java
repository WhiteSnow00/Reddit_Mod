// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions;

import com.reddit.mutations.r5$d$a;
import com.reddit.mutations.r5$d;
import com.reddit.mutations.r5$e;
import com.reddit.mutations.r5$b;
import com.reddit.mutations.r5;
import o22.z2;
import com.reddit.mutations.e8$d$a;
import com.reddit.mutations.e8$d;
import com.reddit.mutations.e8$e;
import com.reddit.mutations.e8$c;
import com.reddit.mutations.e8$b;
import com.reddit.mutations.e8;
import o22.s4;
import com.reddit.mutations.k9$d$a;
import com.reddit.mutations.k9$d;
import com.reddit.mutations.k9$e;
import com.reddit.mutations.k9$b;
import com.reddit.mutations.k9;
import o22.m5;
import com.reddit.queries.g4$c;
import com.reddit.queries.g4$b;
import com.reddit.queries.g4;
import com.reddit.queries.i4$g;
import com.reddit.queries.i4$d;
import com.reddit.domain.model.Redditor;
import com.reddit.fragment.RedditorRankFragment;
import com.reddit.queries.jc$c$a;
import com.reddit.queries.jc$c;
import com.reddit.queries.jc$e;
import com.reddit.queries.jc$a;
import com.reddit.queries.jc$f;
import td0.a$b;
import com.reddit.queries.jc$g;
import com.reddit.queries.jc$d;
import com.reddit.queries.jc;
import com.reddit.type.RankPeriod;
import sd0.l;
import com.reddit.queries.i4$a;
import com.reddit.queries.i4$h;
import com.reddit.queries.i4$f;
import com.reddit.queries.i4$c;
import com.reddit.queries.i4;
import androidx.appcompat.widget.s0;
import xd0.d$b;
import xd0.d$a;
import com.reddit.queries.f4$a;
import com.reddit.queries.f4$d;
import kotlin.collections.EmptyList;
import com.reddit.domain.predictions.model.PredictionCurrency;
import x50.a$a;
import com.reddit.queries.f4$e;
import sd0.b;
import com.reddit.queries.f4$c;
import com.reddit.queries.f4;
import java.io.Serializable;
import com.reddit.mutations.y2$e$a;
import com.reddit.mutations.y2$e;
import com.reddit.mutations.y2$c;
import com.reddit.mutations.y2$d;
import com.reddit.mutations.y2$b;
import com.reddit.mutations.y2;
import o22.v0;
import com.reddit.mutations.d1$e$a;
import com.reddit.mutations.d1$e;
import com.reddit.mutations.d1$b;
import com.reddit.mutations.d1$d;
import com.reddit.mutations.d1$c;
import com.reddit.mutations.d1;
import com.reddit.type.CreatePredictionTournamentInput;
import com.reddit.type.TournamentCurrency;
import kotlin.NoWhenBranchMatchedException;
import sd0.d;
import com.reddit.mutations.o$e$a;
import com.reddit.mutations.o$e;
import com.reddit.mutations.o$a;
import com.reddit.mutations.o$d;
import com.reddit.mutations.o$c;
import com.reddit.fragment.PostPollFragment;
import com.reddit.mutations.m$e$a;
import com.reddit.mutations.m$e;
import com.reddit.mutations.m$a;
import com.reddit.mutations.m$d;
import com.reddit.mutations.m$c;
import com.reddit.domain.model.PostPoll;
import kl0.wu;
import com.reddit.mutations.e$e$a;
import com.reddit.mutations.e$e;
import com.reddit.domain.model.LoadResult$Success;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.e$d;
import com.reddit.domain.model.LoadResult$Error;
import com.reddit.domain.model.ErrorType;
import com.reddit.mutations.e$c;
import com.reddit.type.AddPredictionDraftsInput;
import com.reddit.domain.model.predictions.PredictionsTournament;
import com.reddit.domain.model.LoadResult;
import com.reddit.queries.w6$c;
import com.reddit.queries.w6$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import ur0.e$a;
import com.reddit.queries.w6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import java.util.Iterator;
import java.util.List;
import com.reddit.domain.model.DiscussionType;
import o22.i2;
import java.util.ArrayList;
import qg2.m;
import o22.o;
import h7.h$a;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import com.reddit.data.model.mapper.DateToGqlDateTimeMapper;
import o22.h2;
import sd0.e;
import javax.inject.Inject;
import ah2.f;
import rr0.a;
import ur0.g;
import x50.h;

public final class RemoteGqlPredictionsDataSource implements h
{
    public final g a;
    public final rr0.a b;
    
    @Inject
    public RemoteGqlPredictionsDataSource(final g a, final rr0.a b) {
        f.f((Object)a, "graphQlClient");
        f.f((Object)b, "goldFeatures");
        this.a = a;
        this.b = b;
    }
    
    public static h2 o(final e e) {
        final String formatDateToGqlDateTimeString = DateToGqlDateTimeMapper.INSTANCE.formatDateToGqlDateTimeString(new Date(TimeUnit.SECONDS.toMillis(e.h)));
        final String title = e.getTitle();
        final o o = new o(h$a.c((Object)e.getContent()), (h7.h)null, 2);
        final List g = e.g;
        final ArrayList list = new ArrayList<i2>(m.P0((Iterable)g, 10));
        final Iterator iterator = g.iterator();
        while (iterator.hasNext()) {
            list.add(new i2(h$a.c((Object)iterator.next()), 2));
        }
        return new h2(title, o, h$a.c((Object)list), formatDateToGqlDateTimeString, e.getDiscussionType() == DiscussionType.CHAT, h$a.c((Object)e.isNsfw()), h$a.c((Object)e.isSpoiler()), h$a.c((Object)e.getFlairId()), h$a.c((Object)e.getFlairText()));
    }
    
    public final Object a(final String s, final c<? super Boolean> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlPredictionsDataSource$isPredictionCreationAllowed.RemoteGqlPredictionsDataSource$isPredictionCreationAllowed$1) {
                final RemoteGqlPredictionsDataSource$isPredictionCreationAllowed.RemoteGqlPredictionsDataSource$isPredictionCreationAllowed$1 remoteGqlPredictionsDataSource$isPredictionCreationAllowed$1 = (RemoteGqlPredictionsDataSource$isPredictionCreationAllowed.RemoteGqlPredictionsDataSource$isPredictionCreationAllowed$1)c;
                final int label = remoteGqlPredictionsDataSource$isPredictionCreationAllowed$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$isPredictionCreationAllowed$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPredictionsDataSource$isPredictionCreationAllowed$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlPredictionsDataSource$isPredictionCreationAllowed.RemoteGqlPredictionsDataSource$isPredictionCreationAllowed$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPredictionsDataSource$isPredictionCreationAllowed.RemoteGqlPredictionsDataSource$isPredictionCreationAllowed$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPredictionsDataSource$isPredictionCreationAllowed.RemoteGqlPredictionsDataSource$isPredictionCreationAllowed$1)o).label;
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
            final w6 w6 = new w6(s);
            ((RemoteGqlPredictionsDataSource$isPredictionCreationAllowed.RemoteGqlPredictionsDataSource$isPredictionCreationAllowed$1)o).label = 1;
            if ((b = e$a.b(14, (k)w6, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final w6$c a2 = ((w6$b)b).a;
        return a2 != null && a2.b;
    }
    
    public final Object b(String b, final String s, final String s2, final e e, final boolean b2, final c<? super LoadResult<PredictionsTournament>> c) {
        RemoteGqlPredictionsDataSource$addPredictionToTournament.RemoteGqlPredictionsDataSource$addPredictionToTournament$1 remoteGqlPredictionsDataSource$addPredictionToTournament$2 = null;
        Label_0059: {
            if (c instanceof RemoteGqlPredictionsDataSource$addPredictionToTournament.RemoteGqlPredictionsDataSource$addPredictionToTournament$1) {
                final RemoteGqlPredictionsDataSource$addPredictionToTournament.RemoteGqlPredictionsDataSource$addPredictionToTournament$1 remoteGqlPredictionsDataSource$addPredictionToTournament$1 = (RemoteGqlPredictionsDataSource$addPredictionToTournament.RemoteGqlPredictionsDataSource$addPredictionToTournament$1)c;
                final int label = remoteGqlPredictionsDataSource$addPredictionToTournament$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$addPredictionToTournament$1.label = label + Integer.MIN_VALUE;
                    remoteGqlPredictionsDataSource$addPredictionToTournament$2 = remoteGqlPredictionsDataSource$addPredictionToTournament$1;
                    break Label_0059;
                }
            }
            remoteGqlPredictionsDataSource$addPredictionToTournament$2 = new RemoteGqlPredictionsDataSource$addPredictionToTournament.RemoteGqlPredictionsDataSource$addPredictionToTournament$1(this, (c)c);
        }
        final Object result = remoteGqlPredictionsDataSource$addPredictionToTournament$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteGqlPredictionsDataSource$addPredictionToTournament$2.label;
        RemoteGqlPredictionsDataSource remoteGqlPredictionsDataSource;
        Object b3;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlPredictionsDataSource = (RemoteGqlPredictionsDataSource)remoteGqlPredictionsDataSource$addPredictionToTournament$2.L$0;
            aj2.c.Q0(result);
            b3 = result;
        }
        else {
            aj2.c.Q0(result);
            final AddPredictionDraftsInput addPredictionDraftsInput = new AddPredictionDraftsInput(s, s2, ah2.c.X((Object)o(e)), b, b2);
            final g a = this.a;
            final com.reddit.mutations.e e2 = new com.reddit.mutations.e(addPredictionDraftsInput);
            remoteGqlPredictionsDataSource$addPredictionToTournament$2.L$0 = this;
            remoteGqlPredictionsDataSource$addPredictionToTournament$2.label = 1;
            b3 = e$a.b(14, (k)e2, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)remoteGqlPredictionsDataSource$addPredictionToTournament$2, (OkHttpClient)null);
            if (b3 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlPredictionsDataSource = this;
        }
        final com.reddit.mutations.e$a a2 = ((e$c)b3).a;
        final String s3 = null;
        if (a2 == null) {
            return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
        }
        if (!a2.b) {
            final ErrorType failure = ErrorType.FAILURE;
            final List d = a2.d;
            b = s3;
            if (d != null) {
                final e$d e$d = (e$d)CollectionsKt___CollectionsKt.s1(d);
                b = s3;
                if (e$d != null) {
                    b = e$d.b;
                }
            }
            return new LoadResult$Error(failure, b);
        }
        final e$e c2 = a2.c;
        if (c2 != null) {
            final e$e$a b4 = c2.b;
            if (b4 != null) {
                final wu a3 = b4.a;
                if (a3 != null) {
                    remoteGqlPredictionsDataSource.getClass();
                    return new LoadResult$Success((Object)GqlDataToDomainModelMapperKt.toDomainModel(a3));
                }
            }
        }
        return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
    }
    
    public final Object c(String b, final String s, final c<? super LoadResult<PostPoll>> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlPredictionsDataSource$changePredictionResult.RemoteGqlPredictionsDataSource$changePredictionResult$1) {
                final RemoteGqlPredictionsDataSource$changePredictionResult.RemoteGqlPredictionsDataSource$changePredictionResult$1 remoteGqlPredictionsDataSource$changePredictionResult$1 = (RemoteGqlPredictionsDataSource$changePredictionResult.RemoteGqlPredictionsDataSource$changePredictionResult$1)c;
                final int label = remoteGqlPredictionsDataSource$changePredictionResult$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$changePredictionResult$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPredictionsDataSource$changePredictionResult$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlPredictionsDataSource$changePredictionResult.RemoteGqlPredictionsDataSource$changePredictionResult$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPredictionsDataSource$changePredictionResult.RemoteGqlPredictionsDataSource$changePredictionResult$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPredictionsDataSource$changePredictionResult.RemoteGqlPredictionsDataSource$changePredictionResult$1)o).label;
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
            final o22.g g = new o22.g(b, (h7.h)null, h$a.c((Object)s), 2);
            final g a = this.a;
            final com.reddit.mutations.m m = new com.reddit.mutations.m(g);
            ((RemoteGqlPredictionsDataSource$changePredictionResult.RemoteGqlPredictionsDataSource$changePredictionResult$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)m, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final m$a a2 = ((m$c)b2).a;
        Object o2;
        if (a2 == null) {
            o2 = new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
        }
        else if (!a2.b) {
            final ErrorType failure = ErrorType.FAILURE;
            final List d = a2.d;
            b = s2;
            if (d != null) {
                final m$d m$d = (m$d)CollectionsKt___CollectionsKt.s1(d);
                b = s2;
                if (m$d != null) {
                    b = m$d.b;
                }
            }
            o2 = new LoadResult$Error(failure, b);
        }
        else {
            final m$e c2 = a2.c;
            if (c2 != null) {
                final m$e$a b3 = c2.b;
                if (b3 != null) {
                    final PostPollFragment a3 = b3.a;
                    if (a3 != null) {
                        o2 = new LoadResult$Success((Object)GqlDataToDomainModelMapperKt.toDomainModel(a3));
                        return o2;
                    }
                }
            }
            o2 = new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
        }
        return o2;
    }
    
    public final Object d(String b, final String s, final c<? super LoadResult<PostPoll>> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlPredictionsDataSource$changePredictionVote.RemoteGqlPredictionsDataSource$changePredictionVote$1) {
                final RemoteGqlPredictionsDataSource$changePredictionVote.RemoteGqlPredictionsDataSource$changePredictionVote$1 remoteGqlPredictionsDataSource$changePredictionVote$1 = (RemoteGqlPredictionsDataSource$changePredictionVote.RemoteGqlPredictionsDataSource$changePredictionVote$1)c;
                final int label = remoteGqlPredictionsDataSource$changePredictionVote$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$changePredictionVote$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPredictionsDataSource$changePredictionVote$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlPredictionsDataSource$changePredictionVote.RemoteGqlPredictionsDataSource$changePredictionVote$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPredictionsDataSource$changePredictionVote.RemoteGqlPredictionsDataSource$changePredictionVote$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPredictionsDataSource$changePredictionVote.RemoteGqlPredictionsDataSource$changePredictionVote$1)o).label;
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
            final o22.h h = new o22.h(b, h$a.c((Object)s));
            final g a = this.a;
            final com.reddit.mutations.o o2 = new com.reddit.mutations.o(h);
            ((RemoteGqlPredictionsDataSource$changePredictionVote.RemoteGqlPredictionsDataSource$changePredictionVote$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)o2, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final o$a a2 = ((o$c)b2).a;
        final String s2 = null;
        if (a2 == null) {
            return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
        }
        if (!a2.b) {
            final ErrorType failure = ErrorType.FAILURE;
            final List d = a2.d;
            b = s2;
            if (d != null) {
                final o$d o$d = (o$d)CollectionsKt___CollectionsKt.s1(d);
                b = s2;
                if (o$d != null) {
                    b = o$d.b;
                }
            }
            return new LoadResult$Error(failure, b);
        }
        final o$e c2 = a2.c;
        if (c2 != null) {
            final o$e$a b3 = c2.b;
            if (b3 != null) {
                final PostPollFragment a3 = b3.a;
                if (a3 != null) {
                    return new LoadResult$Success((Object)GqlDataToDomainModelMapperKt.toDomainModel(a3));
                }
            }
        }
        return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
    }
    
    public final Object e(final d d, final c<? super LoadResult<PredictionsTournament>> c) {
        RemoteGqlPredictionsDataSource$createTournament.RemoteGqlPredictionsDataSource$createTournament$1 remoteGqlPredictionsDataSource$createTournament$2 = null;
        Label_0050: {
            if (c instanceof RemoteGqlPredictionsDataSource$createTournament.RemoteGqlPredictionsDataSource$createTournament$1) {
                final RemoteGqlPredictionsDataSource$createTournament.RemoteGqlPredictionsDataSource$createTournament$1 remoteGqlPredictionsDataSource$createTournament$1 = (RemoteGqlPredictionsDataSource$createTournament.RemoteGqlPredictionsDataSource$createTournament$1)c;
                final int label = remoteGqlPredictionsDataSource$createTournament$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$createTournament$1.label = label + Integer.MIN_VALUE;
                    remoteGqlPredictionsDataSource$createTournament$2 = remoteGqlPredictionsDataSource$createTournament$1;
                    break Label_0050;
                }
            }
            remoteGqlPredictionsDataSource$createTournament$2 = new RemoteGqlPredictionsDataSource$createTournament.RemoteGqlPredictionsDataSource$createTournament$1(this, (c)c);
        }
        final Object result = remoteGqlPredictionsDataSource$createTournament$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteGqlPredictionsDataSource$createTournament$2.label;
        RemoteGqlPredictionsDataSource remoteGqlPredictionsDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlPredictionsDataSource = (RemoteGqlPredictionsDataSource)remoteGqlPredictionsDataSource$createTournament$2.L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final String f = d.f;
            final h7.h c2 = h$a.c((Object)d.g);
            final String h = d.h;
            final int n = RemoteGqlPredictionsDataSource.a.a[d.j.ordinal()];
            TournamentCurrency tournamentCurrency;
            if (n != 1) {
                if (n != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tournamentCurrency = TournamentCurrency.TOKENS;
            }
            else {
                tournamentCurrency = TournamentCurrency.COINS;
            }
            final boolean k = d.k;
            final List i = d.i;
            final ArrayList list = new ArrayList<h2>(m.P0((Iterable)i, 10));
            final Iterator iterator = i.iterator();
            while (iterator.hasNext()) {
                list.add(o((e)iterator.next()));
            }
            final CreatePredictionTournamentInput createPredictionTournamentInput = new CreatePredictionTournamentInput(c2, f, h, tournamentCurrency, k, list, h$a.c((Object)d.l));
            final g a = this.a;
            final d1 d2 = new d1(createPredictionTournamentInput);
            remoteGqlPredictionsDataSource$createTournament$2.L$0 = this;
            remoteGqlPredictionsDataSource$createTournament$2.label = 1;
            b = e$a.b(14, (k)d2, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)remoteGqlPredictionsDataSource$createTournament$2, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlPredictionsDataSource = this;
        }
        final d1$b a2 = ((d1$c)b).a;
        final String s = null;
        if (a2 == null) {
            return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
        }
        if (!a2.b) {
            final ErrorType failure = ErrorType.FAILURE;
            final List d3 = a2.d;
            String b2 = s;
            if (d3 != null) {
                final d1$d d1$d = (d1$d)CollectionsKt___CollectionsKt.s1(d3);
                b2 = s;
                if (d1$d != null) {
                    b2 = d1$d.b;
                }
            }
            return new LoadResult$Error(failure, b2);
        }
        final d1$e c3 = a2.c;
        if (c3 != null) {
            final d1$e$a b3 = c3.b;
            if (b3 != null) {
                final wu a3 = b3.a;
                if (a3 != null) {
                    remoteGqlPredictionsDataSource.getClass();
                    return new LoadResult$Success((Object)GqlDataToDomainModelMapperKt.toDomainModel(a3));
                }
            }
        }
        return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
    }
    
    public final Object f(String b, final c<? super LoadResult<PredictionsTournament>> c) {
        RemoteGqlPredictionsDataSource$endTournament.RemoteGqlPredictionsDataSource$endTournament$1 remoteGqlPredictionsDataSource$endTournament$2 = null;
        Label_0050: {
            if (c instanceof RemoteGqlPredictionsDataSource$endTournament.RemoteGqlPredictionsDataSource$endTournament$1) {
                final RemoteGqlPredictionsDataSource$endTournament.RemoteGqlPredictionsDataSource$endTournament$1 remoteGqlPredictionsDataSource$endTournament$1 = (RemoteGqlPredictionsDataSource$endTournament.RemoteGqlPredictionsDataSource$endTournament$1)c;
                final int label = remoteGqlPredictionsDataSource$endTournament$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$endTournament$1.label = label + Integer.MIN_VALUE;
                    remoteGqlPredictionsDataSource$endTournament$2 = remoteGqlPredictionsDataSource$endTournament$1;
                    break Label_0050;
                }
            }
            remoteGqlPredictionsDataSource$endTournament$2 = new RemoteGqlPredictionsDataSource$endTournament.RemoteGqlPredictionsDataSource$endTournament$1(this, (c)c);
        }
        final Object result = remoteGqlPredictionsDataSource$endTournament$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteGqlPredictionsDataSource$endTournament$2.label;
        RemoteGqlPredictionsDataSource remoteGqlPredictionsDataSource;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlPredictionsDataSource = (RemoteGqlPredictionsDataSource)remoteGqlPredictionsDataSource$endTournament$2.L$0;
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final y2 y2 = new y2(new v0(b));
            remoteGqlPredictionsDataSource$endTournament$2.L$0 = this;
            remoteGqlPredictionsDataSource$endTournament$2.label = 1;
            b2 = e$a.b(14, (k)y2, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)remoteGqlPredictionsDataSource$endTournament$2, (OkHttpClient)null);
            if (b2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlPredictionsDataSource = this;
        }
        final y2$c a2 = ((y2$b)b2).a;
        final String s = null;
        if (a2 == null) {
            return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
        }
        if (!a2.b) {
            final ErrorType failure = ErrorType.FAILURE;
            final List c2 = a2.c;
            b = s;
            if (c2 != null) {
                final y2$d y2$d = (y2$d)CollectionsKt___CollectionsKt.s1(c2);
                b = s;
                if (y2$d != null) {
                    b = y2$d.b;
                }
            }
            return new LoadResult$Error(failure, b);
        }
        final y2$e d = a2.d;
        if (d != null) {
            final y2$e$a b3 = d.b;
            if (b3 != null) {
                final wu a3 = b3.a;
                if (a3 != null) {
                    remoteGqlPredictionsDataSource.getClass();
                    return new LoadResult$Success((Object)GqlDataToDomainModelMapperKt.toDomainModel(a3));
                }
            }
        }
        return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
    }
    
    public final Serializable g(final String s, final c c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlPredictionsDataSource$getPredictionChipPackages$1) {
                final RemoteGqlPredictionsDataSource$getPredictionChipPackages$1 remoteGqlPredictionsDataSource$getPredictionChipPackages$1 = (RemoteGqlPredictionsDataSource$getPredictionChipPackages$1)c;
                final int label = remoteGqlPredictionsDataSource$getPredictionChipPackages$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$getPredictionChipPackages$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPredictionsDataSource$getPredictionChipPackages$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlPredictionsDataSource$getPredictionChipPackages$1(this, (c<? super RemoteGqlPredictionsDataSource$getPredictionChipPackages$1>)c);
        }
        final Object result = ((RemoteGqlPredictionsDataSource$getPredictionChipPackages$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPredictionsDataSource$getPredictionChipPackages$1)o).label;
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
            final f4 f4 = new f4(s);
            ((RemoteGqlPredictionsDataSource$getPredictionChipPackages$1)o).label = 1;
            if ((b = e$a.b(14, (k)f4, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
        }
        final f4$c f4$c = (f4$c)b;
        f.f((Object)f4$c, "response");
        final f4$d a2 = f4$c.a;
        final Serializable s2 = null;
        f4$a b2;
        if (a2 != null) {
            b2 = a2.b;
        }
        else {
            b2 = null;
        }
        Serializable s3 = s2;
        if (b2 != null) {
            final List b3 = b2.b;
            s3 = s2;
            if (b3 != null) {
                final ArrayList list = new ArrayList<b>(m.P0((Iterable)b3, 10));
                for (final f4$e f4$e : b3) {
                    final String b4 = f4$e.b;
                    final String c2 = f4$e.c;
                    final int d = f4$e.d;
                    final int n = a$a.a[((Enum)f4$e.e).ordinal()];
                    PredictionCurrency predictionCurrency;
                    if (n != 1) {
                        if (n != 2) {
                            predictionCurrency = null;
                        }
                        else {
                            predictionCurrency = PredictionCurrency.TOKENS;
                        }
                    }
                    else {
                        predictionCurrency = PredictionCurrency.COINS;
                    }
                    list.add(new b(b4, c2, d, predictionCurrency));
                }
                s3 = list;
            }
        }
        Object instance;
        if ((instance = s3) == null) {
            instance = EmptyList.INSTANCE;
        }
        return (Serializable)instance;
    }
    
    public final Object h(final xd0.d d, final String s, final c c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlPredictionsDataSource$getPredictionTournaments$1) {
                final RemoteGqlPredictionsDataSource$getPredictionTournaments$1 remoteGqlPredictionsDataSource$getPredictionTournaments$1 = (RemoteGqlPredictionsDataSource$getPredictionTournaments$1)c;
                final int label = remoteGqlPredictionsDataSource$getPredictionTournaments$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$getPredictionTournaments$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPredictionsDataSource$getPredictionTournaments$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlPredictionsDataSource$getPredictionTournaments$1(this, (c<? super RemoteGqlPredictionsDataSource$getPredictionTournaments$1>)c);
        }
        final Object result = ((RemoteGqlPredictionsDataSource$getPredictionTournaments$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPredictionsDataSource$getPredictionTournaments$1)o).label;
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
            final i4 i4 = new i4(s, d instanceof d$b, h$a.b((Object)a), false, false, (h7.h)null, s0.h(this.b), 864);
            final g a2 = this.a;
            ((RemoteGqlPredictionsDataSource$getPredictionTournaments$1)o).label = 1;
            if ((b = e$a.b(14, (k)i4, (ur0.e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final i4$h a3 = ((i4$c)b).a;
        if (a3 != null) {
            final i4$a b2 = a3.b;
            if (b2 != null) {
                final List c2 = b2.c;
                if (c2 != null) {
                    final ArrayList list = new ArrayList<PredictionsTournament>(m.P0((Iterable)c2, 10));
                    final Iterator iterator = c2.iterator();
                    while (iterator.hasNext()) {
                        list.add(GqlDataToDomainModelMapperKt.toDomainModel(((i4$f)iterator.next()).e.a));
                    }
                    return new LoadResult$Success((Object)list);
                }
            }
        }
        return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
    }
    
    public final Object i(final String s, String l$0, final c<? super l> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit.RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1) {
                final RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit.RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1 remoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1 = (RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit.RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1)c;
                final int label = remoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit.RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit.RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit.RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (String)((RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit.RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final jc jc = new jc(s, RankPeriod.ALL_TIME, a.f(100), h$a.c((Object)l$0));
            ((RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit.RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1)o).L$0 = l$0;
            ((RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit.RemoteGqlPredictionsDataSource$getPredictorsLeaderboardForSubreddit$1)o).label = 1;
            if ((b = e$a.b(14, (k)jc, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final jc$f a2 = ((jc$d)b).a;
        final sd0.k k = null;
        jc$a b2;
        if (a2 != null) {
            b2 = a2.b;
        }
        else {
            b2 = null;
        }
        if (b2 != null) {
            final jc$e c2 = b2.c;
            if (c2 != null) {
                final String b3 = b2.b;
                final jc$c c3 = c2.c;
                sd0.k a3 = k;
                if (c3 != null) {
                    final jc$c$a b4 = c3.b;
                    a3 = k;
                    if (b4 != null) {
                        final RedditorRankFragment a4 = b4.a;
                        a3 = k;
                        if (a4 != null) {
                            a3 = x50.a.a(a4);
                        }
                    }
                }
                final List b5 = c2.b;
                final ArrayList<sd0.k> list = new ArrayList<sd0.k>();
                final Iterator iterator = b5.iterator();
                while (iterator.hasNext()) {
                    final sd0.k a5 = x50.a.a(((jc$g)iterator.next()).b.a);
                    if (a5 != null) {
                        list.add(a5);
                    }
                }
                Object f;
                if (l$0 != null) {
                    f = new a$b(l$0);
                }
                else {
                    f = td0.a$a.f;
                }
                return new l(b3, a3, (ArrayList)list, (td0.a)f);
            }
        }
        return null;
    }
    
    public final Object j(final xd0.d d, String string, final c c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1) {
                final RemoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1 remoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1 = (RemoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1)c;
                final int label = remoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1(this, (c<? super RemoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1>)c);
        }
        final Object result = ((RemoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1)o).label;
        final Object o2 = null;
        final String s = null;
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
            final i4 i4 = new i4(string, d instanceof d$b, h$a.b((Object)a), false, false, h$a.c((Object)Boolean.TRUE), s0.h(this.b), 800);
            final g a2 = this.a;
            ((RemoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1)o).label = 1;
            if ((b = e$a.b(14, (k)i4, (ur0.e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final i4$h a3 = ((i4$c)b).a;
        Object o3 = o2;
        if (a3 != null) {
            final i4$a b2 = a3.b;
            if (b2 == null) {
                o3 = o2;
            }
            else {
                final List c2 = b2.c;
                i4$f i4$f;
                if (c2 != null) {
                    i4$f = (i4$f)CollectionsKt___CollectionsKt.s1(c2);
                }
                else {
                    i4$f = null;
                }
                final i4$g b3 = b2.b;
                o3 = o2;
                if (i4$f != null) {
                    final PredictionsTournament domainModel = GqlDataToDomainModelMapperKt.toDomainModel(i4$f.e.a);
                    final Integer b4 = i4$f.b;
                    int intValue;
                    if (b4 != null) {
                        intValue = b4;
                    }
                    else {
                        intValue = 0;
                    }
                    final List c3 = i4$f.c;
                    Object instance;
                    if (c3 != null) {
                        final ArrayList list = new ArrayList<Redditor>(m.P0((Iterable)c3, 10));
                        final Iterator iterator = c3.iterator();
                        while (true) {
                            instance = list;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            list.add((Object)GqlDataToDomainModelMapperKt.toRedditor(((i4$d)iterator.next()).b.a));
                        }
                    }
                    else {
                        instance = null;
                    }
                    if (instance == null) {
                        instance = EmptyList.INSTANCE;
                    }
                    Label_0423: {
                        if (b3 != null) {
                            final Object b5 = b3.b;
                            if (b5 != null) {
                                string = b5.toString();
                                break Label_0423;
                            }
                        }
                        string = null;
                    }
                    String string2 = s;
                    if (b3 != null) {
                        final Object c4 = b3.c;
                        string2 = s;
                        if (c4 != null) {
                            string2 = c4.toString();
                        }
                    }
                    o3 = new vd0.b(domainModel, intValue, (List)instance, string, string2);
                }
            }
        }
        return o3;
    }
    
    public final Object k(final String s, final c<? super Integer> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament.RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament$1) {
                final RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament.RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament$1 remoteGqlPredictionsDataSource$getUserTokensBalanceForTournament$1 = (RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament.RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament$1)c;
                final int label = remoteGqlPredictionsDataSource$getUserTokensBalanceForTournament$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$getUserTokensBalanceForTournament$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPredictionsDataSource$getUserTokensBalanceForTournament$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament.RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament.RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament.RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament$1)o).label;
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
            final g4 g4 = new g4(s);
            ((RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament.RemoteGqlPredictionsDataSource$getUserTokensBalanceForTournament$1)o).label = 1;
            if ((b = e$a.b(14, (k)g4, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final g4$c a2 = ((g4$b)b).a;
        Integer b2;
        if (a2 != null) {
            b2 = a2.b;
        }
        else {
            b2 = null;
        }
        return b2;
    }
    
    public final Object l(final String s, final String s2, final String s3, final String s4, final c<? super PostPoll> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlPredictionsDataSource$predict.RemoteGqlPredictionsDataSource$predict$1) {
                final RemoteGqlPredictionsDataSource$predict.RemoteGqlPredictionsDataSource$predict$1 remoteGqlPredictionsDataSource$predict$1 = (RemoteGqlPredictionsDataSource$predict.RemoteGqlPredictionsDataSource$predict$1)c;
                final int label = remoteGqlPredictionsDataSource$predict$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$predict$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPredictionsDataSource$predict$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlPredictionsDataSource$predict.RemoteGqlPredictionsDataSource$predict$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPredictionsDataSource$predict.RemoteGqlPredictionsDataSource$predict$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPredictionsDataSource$predict.RemoteGqlPredictionsDataSource$predict$1)o).label;
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
            final m5 m5 = new m5(h$a.c((Object)s3), s, s2, s4);
            final g a = this.a;
            final k9 k9 = new k9(m5);
            ((RemoteGqlPredictionsDataSource$predict.RemoteGqlPredictionsDataSource$predict$1)o).label = 1;
            if ((b = e$a.b(14, (k)k9, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final k9$e a2 = ((k9$b)b).a;
        f.c((Object)a2);
        if (!a2.b) {
            throw new IllegalStateException("Check failed.".toString());
        }
        final k9$d c2 = a2.c;
        PostPollFragment a3 = null;
        Label_0222: {
            if (c2 != null) {
                final k9$d$a b2 = c2.b;
                if (b2 != null) {
                    a3 = b2.a;
                    break Label_0222;
                }
            }
            a3 = null;
        }
        if (a3 != null) {
            return GqlDataToDomainModelMapperKt.toDomainModel(a3);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
    
    public final Object m(String b, final String s, final c<? super LoadResult<PredictionsTournament>> c) {
        RemoteGqlPredictionsDataSource$renameTournament.RemoteGqlPredictionsDataSource$renameTournament$1 remoteGqlPredictionsDataSource$renameTournament$2 = null;
        Label_0054: {
            if (c instanceof RemoteGqlPredictionsDataSource$renameTournament.RemoteGqlPredictionsDataSource$renameTournament$1) {
                final RemoteGqlPredictionsDataSource$renameTournament.RemoteGqlPredictionsDataSource$renameTournament$1 remoteGqlPredictionsDataSource$renameTournament$1 = (RemoteGqlPredictionsDataSource$renameTournament.RemoteGqlPredictionsDataSource$renameTournament$1)c;
                final int label = remoteGqlPredictionsDataSource$renameTournament$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$renameTournament$1.label = label + Integer.MIN_VALUE;
                    remoteGqlPredictionsDataSource$renameTournament$2 = remoteGqlPredictionsDataSource$renameTournament$1;
                    break Label_0054;
                }
            }
            remoteGqlPredictionsDataSource$renameTournament$2 = new RemoteGqlPredictionsDataSource$renameTournament.RemoteGqlPredictionsDataSource$renameTournament$1(this, (c)c);
        }
        final Object result = remoteGqlPredictionsDataSource$renameTournament$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteGqlPredictionsDataSource$renameTournament$2.label;
        RemoteGqlPredictionsDataSource remoteGqlPredictionsDataSource;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlPredictionsDataSource = (RemoteGqlPredictionsDataSource)remoteGqlPredictionsDataSource$renameTournament$2.L$0;
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final s4 s2 = new s4(b, h$a.c((Object)s));
            final g a = this.a;
            final e8 e8 = new e8(s2);
            remoteGqlPredictionsDataSource$renameTournament$2.L$0 = this;
            remoteGqlPredictionsDataSource$renameTournament$2.label = 1;
            b2 = e$a.b(14, (k)e8, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)remoteGqlPredictionsDataSource$renameTournament$2, (OkHttpClient)null);
            if (b2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlPredictionsDataSource = this;
        }
        final e8$e a2 = ((e8$b)b2).a;
        final String s3 = null;
        if (a2 == null) {
            return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
        }
        if (!a2.b) {
            final ErrorType failure = ErrorType.FAILURE;
            final List c2 = a2.c;
            b = s3;
            if (c2 != null) {
                final e8$c e8$c = (e8$c)CollectionsKt___CollectionsKt.s1(c2);
                b = s3;
                if (e8$c != null) {
                    b = e8$c.b;
                }
            }
            return new LoadResult$Error(failure, b);
        }
        final e8$d d = a2.d;
        if (d != null) {
            final e8$d$a b3 = d.b;
            if (b3 != null) {
                final wu a3 = b3.a;
                if (a3 != null) {
                    remoteGqlPredictionsDataSource.getClass();
                    return new LoadResult$Success((Object)GqlDataToDomainModelMapperKt.toDomainModel(a3));
                }
            }
        }
        return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
    }
    
    public final Object n(final String s, final String s2, final c<? super PostPoll> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlPredictionsDataSource$resolve.RemoteGqlPredictionsDataSource$resolve$1) {
                final RemoteGqlPredictionsDataSource$resolve.RemoteGqlPredictionsDataSource$resolve$1 remoteGqlPredictionsDataSource$resolve$1 = (RemoteGqlPredictionsDataSource$resolve.RemoteGqlPredictionsDataSource$resolve$1)c;
                final int label = remoteGqlPredictionsDataSource$resolve$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$resolve$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPredictionsDataSource$resolve$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlPredictionsDataSource$resolve.RemoteGqlPredictionsDataSource$resolve$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPredictionsDataSource$resolve.RemoteGqlPredictionsDataSource$resolve$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPredictionsDataSource$resolve.RemoteGqlPredictionsDataSource$resolve$1)o).label;
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
            final z2 z2 = new z2(s, s2);
            final g a = this.a;
            final r5 r5 = new r5(z2);
            ((RemoteGqlPredictionsDataSource$resolve.RemoteGqlPredictionsDataSource$resolve$1)o).label = 1;
            if ((b = e$a.b(14, (k)r5, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final r5$e a2 = ((r5$b)b).a;
        f.c((Object)a2);
        if (!a2.b) {
            throw new IllegalStateException("Check failed.".toString());
        }
        final r5$d c2 = a2.c;
        PostPollFragment a3 = null;
        Label_0207: {
            if (c2 != null) {
                final r5$d$a b2 = c2.b;
                if (b2 != null) {
                    a3 = b2.a;
                    break Label_0207;
                }
            }
            a3 = null;
        }
        if (a3 != null) {
            return GqlDataToDomainModelMapperKt.toDomainModel(a3);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
    
    public final Object p(String b, final long n, final c<? super LoadResult<PostPoll>> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlPredictionsDataSource$updateVotingEndTime.RemoteGqlPredictionsDataSource$updateVotingEndTime$1) {
                final RemoteGqlPredictionsDataSource$updateVotingEndTime.RemoteGqlPredictionsDataSource$updateVotingEndTime$1 remoteGqlPredictionsDataSource$updateVotingEndTime$1 = (RemoteGqlPredictionsDataSource$updateVotingEndTime.RemoteGqlPredictionsDataSource$updateVotingEndTime$1)c;
                final int label = remoteGqlPredictionsDataSource$updateVotingEndTime$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPredictionsDataSource$updateVotingEndTime$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPredictionsDataSource$updateVotingEndTime$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlPredictionsDataSource$updateVotingEndTime.RemoteGqlPredictionsDataSource$updateVotingEndTime$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPredictionsDataSource$updateVotingEndTime.RemoteGqlPredictionsDataSource$updateVotingEndTime$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPredictionsDataSource$updateVotingEndTime.RemoteGqlPredictionsDataSource$updateVotingEndTime$1)o).label;
        final String s = null;
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
            final o22.g g = new o22.g(b, h$a.c((Object)DateToGqlDateTimeMapper.INSTANCE.formatDateToGqlDateTimeString(new Date(n))), (h7.h)null, 4);
            final g a = this.a;
            final com.reddit.mutations.m m = new com.reddit.mutations.m(g);
            ((RemoteGqlPredictionsDataSource$updateVotingEndTime.RemoteGqlPredictionsDataSource$updateVotingEndTime$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)m, (ur0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final m$a a2 = ((m$c)b2).a;
        if (a2 == null) {
            return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
        }
        if (!a2.b) {
            final ErrorType failure = ErrorType.FAILURE;
            final List d = a2.d;
            b = s;
            if (d != null) {
                final m$d m$d = (m$d)CollectionsKt___CollectionsKt.s1(d);
                b = s;
                if (m$d != null) {
                    b = m$d.b;
                }
            }
            return new LoadResult$Error(failure, b);
        }
        final m$e c2 = a2.c;
        if (c2 != null) {
            final m$e$a b3 = c2.b;
            if (b3 != null) {
                final PostPollFragment a3 = b3.a;
                if (a3 != null) {
                    return new LoadResult$Success((Object)GqlDataToDomainModelMapperKt.toDomainModel(a3));
                }
            }
        }
        return new LoadResult$Error(ErrorType.SERVICE_ERROR, (String)null);
    }
}
