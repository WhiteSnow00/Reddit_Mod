// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.discover.usecase;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import pg2.j;
import tg2.c;
import javax.inject.Inject;
import java.util.concurrent.TimeUnit;
import com.reddit.session.r;
import db0.g;
import qb0.a;

public final class RedditDiscoverFTUEUseCase implements a
{
    public static final long e;
    public final g a;
    public final pb0.a b;
    public final e20.a c;
    public final r d;
    
    static {
        e = TimeUnit.DAYS.toSeconds(14L);
    }
    
    @Inject
    public RedditDiscoverFTUEUseCase(final g a, final pb0.a b, final e20.a c, final r d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(final c<? super j> c) {
        if (!this.d()) {
            return j.a;
        }
        final Object l = mj2.g.l((CoroutineContext)this.c.c(), (p)new RedditDiscoverFTUEUseCase$dismissFTUE$2(this, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return j.a;
    }
    
    public final Object b(final c<? super j> c) {
        if (!this.d()) {
            return j.a;
        }
        final Object l = mj2.g.l((CoroutineContext)this.c.c(), (p)new RedditDiscoverFTUEUseCase$dismissTabBadge$2(this, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return j.a;
    }
    
    public final boolean c() {
        final com.reddit.session.p p = (com.reddit.session.p)this.d.d().invoke();
        boolean b = false;
        if (p == null) {
            return false;
        }
        if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - p.getCreatedUtc() >= RedditDiscoverFTUEUseCase.e) {
            b = true;
        }
        return b;
    }
    
    public final boolean d() {
        final boolean tc = this.a.Tc();
        boolean b = true;
        if (!tc) {
            b = false;
        }
        return b;
    }
    
    public final Object e(final c<? super Boolean> c) {
        if (!this.d()) {
            return Boolean.FALSE;
        }
        if (!this.c()) {
            return Boolean.FALSE;
        }
        return mj2.g.l((CoroutineContext)this.c.c(), (p)new RedditDiscoverFTUEUseCase$isFTUEEligible$2(this, (c)null), (c)c);
    }
    
    public final Object f(final c<? super Boolean> c) {
        if (!this.d()) {
            return Boolean.FALSE;
        }
        if (!this.c()) {
            return Boolean.FALSE;
        }
        return mj2.g.l((CoroutineContext)this.c.c(), (p)new RedditDiscoverFTUEUseCase$isTabBadgeEligible$2(this, (c)null), (c)c);
    }
}
