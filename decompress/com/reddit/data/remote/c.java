// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import zg2.p;
import kotlin.coroutines.CoroutineContext;
import javax.inject.Inject;
import ah2.f;
import e20.a;
import ur0.g;

public final class c
{
    public final g a;
    public final a b;
    
    @Inject
    public c(final g a, final a b) {
        f.f((Object)a, "graphQlClient");
        f.f((Object)b, "dispatcherProvider");
        this.a = a;
        this.b = b;
    }
    
    public static Object a(final c c, final String s, final Integer n, final String s2, final tg2.c c2) {
        return mj2.g.l((CoroutineContext)c.b.c(), (p)new RemoteGqlSubredditLeaderboardDataSource$getSubredditLeaderboadPage$2(c, s, n, s2, (Boolean)null, (tg2.c)null), c2);
    }
}
