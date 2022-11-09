// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions;

import java.util.concurrent.ConcurrentHashMap;
import com.reddit.domain.model.predictions.PredictionsTournament;
import javax.inject.Inject;
import kotlin.a;
import pg2.f;
import xd0.b;

public final class RedditLocalPredictionsTournamentDataSource implements b
{
    public final f a;
    
    @Inject
    public RedditLocalPredictionsTournamentDataSource() {
        this.a = kotlin.a.b((zg2.a)RedditLocalPredictionsTournamentDataSource$tournamentsCache.RedditLocalPredictionsTournamentDataSource$tournamentsCache$2.INSTANCE);
    }
    
    public final void a(final PredictionsTournament predictionsTournament) {
        ah2.f.f((Object)predictionsTournament, "tournament");
        ((ConcurrentHashMap)this.a.getValue()).put(predictionsTournament.getTournamentId(), predictionsTournament);
    }
    
    public final void b() {
        ((ConcurrentHashMap)this.a.getValue()).clear();
    }
    
    public final PredictionsTournament c(final String s) {
        ah2.f.f((Object)s, "tournamentId");
        return ((ConcurrentHashMap)this.a.getValue()).get(s);
    }
}
