// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.predictions.usecase;

import ng2.e;
import kotlin.Metadata;
import com.reddit.domain.model.predictions.PredictionsTournament;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.predictions.SubredditPredictionsTournamentState;
import com.reddit.domain.model.Subreddit;
import javax.inject.Inject;
import od0.c;

public final class GetSubredditTournamentStatusUseCase
{
    public final c a;
    
    @Inject
    public GetSubredditTournamentStatusUseCase(final c a) {
        this.a = a;
    }
    
    public final Object a(final Subreddit subreddit, final gg2.c<? super SubredditPredictionsTournamentState> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof GetSubredditTournamentStatusUseCase$fetchFromRepository$1) {
                final GetSubredditTournamentStatusUseCase$fetchFromRepository$1 getSubredditTournamentStatusUseCase$fetchFromRepository$1 = (GetSubredditTournamentStatusUseCase$fetchFromRepository$1)c;
                final int label = getSubredditTournamentStatusUseCase$fetchFromRepository$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    getSubredditTournamentStatusUseCase$fetchFromRepository$1.label = label + Integer.MIN_VALUE;
                    o = getSubredditTournamentStatusUseCase$fetchFromRepository$1;
                    break Label_0051;
                }
            }
            o = new GetSubredditTournamentStatusUseCase$fetchFromRepository$1(this, (gg2.c)c);
        }
        final Object result = ((GetSubredditTournamentStatusUseCase$fetchFromRepository$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((GetSubredditTournamentStatusUseCase$fetchFromRepository$1)o).label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            l = result;
        }
        else {
            d.b4(result);
            final c a = this.a;
            final String displayName = subreddit.getDisplayName();
            ((GetSubredditTournamentStatusUseCase$fetchFromRepository$1)o).label = 1;
            if ((l = a.l(displayName, true, (gg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final PredictionsTournament predictionsTournament = (PredictionsTournament)l;
        Object instance;
        if (predictionsTournament == null) {
            instance = SubredditPredictionsTournamentState.NoLiveTournaments.INSTANCE;
        }
        else {
            instance = new SubredditPredictionsTournamentState.HasLiveTournament(predictionsTournament);
        }
        return instance;
    }
    
    @Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/predictions/usecase/GetSubredditTournamentStatusUseCase$DoesNotAllowPredictions;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "subreddit", "Lcom/reddit/domain/model/Subreddit;", "(Lcom/reddit/domain/model/Subreddit;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class DoesNotAllowPredictions extends IllegalArgumentException
    {
        public DoesNotAllowPredictions(final Subreddit subreddit) {
            e.f((Object)subreddit, "subreddit");
            final StringBuilder sb = new StringBuilder();
            sb.append("Subreddit ");
            sb.append(subreddit.getDisplayName());
            sb.append(" (id: ");
            sb.append(subreddit.getKindWithId());
            sb.append(") does not allow predictions.");
            super(sb.toString());
        }
    }
}
