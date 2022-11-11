// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions;

import java.util.concurrent.ConcurrentHashMap;
import sg2.e;
import com.reddit.domain.model.predictions.PredictionsTournament;
import javax.inject.Inject;
import kotlin.a;
import hg2.f;
import od0.b;

public final class RedditLocalPredictionsTournamentDataSource implements b
{
    public final f a;
    
    @Inject
    public RedditLocalPredictionsTournamentDataSource() {
        this.a = kotlin.a.b((rg2.a)RedditLocalPredictionsTournamentDataSource$tournamentsCache$2.INSTANCE);
    }
    
    public final void a(final PredictionsTournament predictionsTournament) {
        e.f((Object)predictionsTournament, "tournament");
        this.a.getValue().put(predictionsTournament.getTournamentId(), predictionsTournament);
    }
    
    public final void b() {
        this.a.getValue().clear();
    }
    
    public final PredictionsTournament c(final String s) {
        e.f((Object)s, "tournamentId");
        return this.a.getValue().get(s);
    }
}
