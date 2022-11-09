// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions.local;

import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import pg2.f;
import qd0.a;

public final class MemoryPredictionsTournamentPostDataSource implements a
{
    public final f a;
    
    @Inject
    public MemoryPredictionsTournamentPostDataSource() {
        this.a = kotlin.a.b((zg2.a)MemoryPredictionsTournamentPostDataSource$tournamentIdToPostCache.MemoryPredictionsTournamentPostDataSource$tournamentIdToPostCache$2.INSTANCE);
    }
    
    public final String a(final String s) {
        return ((ConcurrentHashMap)this.a.getValue()).get(s);
    }
    
    public final void b(final String s, final String s2) {
        ah2.f.f((Object)s, "tournamentId");
        ah2.f.f((Object)s2, "tournamentPostKindWithId");
        ((ConcurrentHashMap)this.a.getValue()).put(s, s2);
    }
}
