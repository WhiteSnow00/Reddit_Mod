// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.domain.model.SubredditForkingVisibility;
import hg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rg2.p;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import a20.a;
import com.reddit.data.local.LocalSubredditForkingDataSource;
import xd0.e0;

public final class RedditSubredditForkingRepository implements e0
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
    
    public final Object a(final String s, final c c) {
        final Object l = g.l((CoroutineContext)this.b.c(), (p)new RedditSubredditForkingRepository$setBottomSheetShown$2(this, s, true, (c)null), c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return j.a;
    }
    
    public final Object b(final String s, final c c) {
        final Object l = g.l((CoroutineContext)this.b.c(), (p)new RedditSubredditForkingRepository$setSubredditForked$2(this, s, true, (c)null), c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return j.a;
    }
    
    public final Object c(final String s, final c<? super j> c) {
        final Object l = g.l((CoroutineContext)this.b.c(), (p)new RedditSubredditForkingRepository$createSubredditForkingVisibility$2(this, s, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return j.a;
    }
    
    public final Object d(final String s, final c c) {
        final Object l = g.l((CoroutineContext)this.b.c(), (p)new RedditSubredditForkingRepository$setHookModuleDismissed$2(this, s, true, (c)null), c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return j.a;
    }
    
    public final Object e(final String s, final c<? super SubredditForkingVisibility> c) {
        return g.l((CoroutineContext)this.b.c(), (p)new RedditSubredditForkingRepository$getSubredditForkingVisibility$2(this, s, (c)null), (c)c);
    }
}
