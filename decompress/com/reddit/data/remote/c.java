// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import rg2.p;
import kotlin.coroutines.CoroutineContext;
import javax.inject.Inject;
import sg2.e;
import a20.a;
import mr0.g;

public final class c
{
    public final g a;
    public final a b;
    
    @Inject
    public c(final g a, final a b) {
        e.f((Object)a, "graphQlClient");
        e.f((Object)b, "dispatcherProvider");
        this.a = a;
        this.b = b;
    }
    
    public static Object a(final c c, final String s, final Integer n, final String s2, final lg2.c c2) {
        return ej2.g.l((CoroutineContext)c.b.c(), (p)new RemoteGqlSubredditLeaderboardDataSource$getSubredditLeaderboadPage$2(c, s, n, s2, (Boolean)null, (lg2.c)null), c2);
    }
}
