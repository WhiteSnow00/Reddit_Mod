// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.karma_statistics;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import tg2.c;
import javax.inject.Inject;
import y40.b;
import cm0.a;

public final class RedditKarmaStatisticsRepository implements a
{
    public final b a;
    public final e20.a b;
    
    @Inject
    public RedditKarmaStatisticsRepository(final b a, final e20.a b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final long n, final c<? super Long> c) {
        return g.l((CoroutineContext)this.b.c(), (p)new RedditKarmaStatisticsRepository$getMaxKarmaDiff$2(this, n, (c)null), (c)c);
    }
    
    public final Object b(final long n, final c<? super j> c) {
        final Object l = g.l((CoroutineContext)this.b.c(), (p)new RedditKarmaStatisticsRepository$compactDatabase$2(this, n, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return j.a;
    }
    
    public final Object c(final long n, final c<? super j> c) {
        final Object l = g.l((CoroutineContext)this.b.c(), (p)new RedditKarmaStatisticsRepository$updateTodayKarma$2(this, n, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return j.a;
    }
}
