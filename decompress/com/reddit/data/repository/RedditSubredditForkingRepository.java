// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import cg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import com.reddit.domain.model.SubredditForkingVisibility;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import d20.a;
import com.reddit.data.local.LocalSubredditForkingDataSource;
import xd0.f0;

public final class RedditSubredditForkingRepository implements f0
{
    public final LocalSubredditForkingDataSource a;
    public final a b;
    
    @Inject
    public RedditSubredditForkingRepository(final LocalSubredditForkingDataSource a, final a b) {
        e.f((Object)a, "dataSource");
        e.f((Object)b, "dispatcherProvider");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object a(final String s, final c<? super SubredditForkingVisibility> c) {
        return g.j((CoroutineContext)this.b.c(), (p)new RedditSubredditForkingRepository$getSubredditForkingVisibility$2(this, s, (c)null), c);
    }
    
    @Override
    public final Object b(final String s, final c c) {
        final Object j = g.j((CoroutineContext)this.b.c(), (p)new RedditSubredditForkingRepository$setBottomSheetShown$2(this, s, true, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final Object c(final String s, final c c) {
        final Object j = g.j((CoroutineContext)this.b.c(), (p)new RedditSubredditForkingRepository$setSubredditForked$2(this, s, true, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final Object d(final String s, final c c) {
        final Object j = g.j((CoroutineContext)this.b.c(), (p)new RedditSubredditForkingRepository$setHookModuleDismissed$2(this, s, true, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final Object e(final String s, final c<? super j> c) {
        final Object j = g.j((CoroutineContext)this.b.c(), (p)new RedditSubredditForkingRepository$createSubredditForkingVisibility$2(this, s, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
}
