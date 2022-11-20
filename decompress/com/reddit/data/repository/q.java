// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import b60.o0;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.g;
import af2.g0;
import b60.p0;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import gg2.c;
import java.util.Map;
import vl.a;
import com.reddit.session.m;
import x12.p$a;
import com.reddit.tracking.TrackerParams$TrackerType;
import kotlin.collections.EmptyList;
import ng2.e;
import af2.c0;
import pt.b;

public final class q implements b
{
    public final int f;
    public final RedditSubredditRepository g;
    
    public q(final RedditSubredditRepository g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final c0 m(final Object o) {
        switch (this.f) {
            default: {
                final RedditSubredditRepository g = this.g;
                final RedditSubredditRepository$c redditSubredditRepository$c = (RedditSubredditRepository$c)o;
                e.f((Object)g, "this$0");
                e.f((Object)redditSubredditRepository$c, "key");
                final Pair<Long, TimeUnit> g2 = RedditSubredditRepository.G;
                final int n = RedditSubredditRepository$h.b[((Enum)redditSubredditRepository$c.a).ordinal()];
                final c0 c0 = null;
                c0<EmptyList> c2;
                if (n != 1) {
                    if (n != 2) {
                        c2 = af2.c0.v(EmptyList.INSTANCE);
                        e.e((Object)c2, "just(emptyList())");
                    }
                    else {
                        String s;
                        if ((s = redditSubredditRepository$c.b) == null) {
                            s = p$a.c(g.k, TrackerParams$TrackerType.Listing, RedditSubredditRepository.class.getSimpleName(), (String)null, (String)null, g.s, g.r, 92).a;
                        }
                        final m m = (m)g.o.d().invoke();
                        c2 = c0;
                        if (m != null) {
                            final String kindWithId = m.getKindWithId();
                            c2 = c0;
                            if (kindWithId != null) {
                                final c0 l1 = ah0.b.l1((CoroutineContext)g.p.c(), (p)new RedditSubredditRepository$remoteFetcherForKey$3$1(g, kindWithId, (Map)a.X2(s, g.k, (String)null), (c)null));
                                final p0 p = new p0((Object)g, 1);
                                l1.getClass();
                                c2 = RxJavaPlugins.onAssembly((c0)new pf2.e((af2.g0<Object>)l1, (g<? super Throwable>)p));
                            }
                        }
                        if (c2 == null) {
                            c2 = af2.c0.v(EmptyList.INSTANCE);
                            e.e((Object)c2, "just(emptyList())");
                        }
                    }
                }
                else {
                    String s2;
                    if ((s2 = redditSubredditRepository$c.b) == null) {
                        s2 = p$a.c(g.k, TrackerParams$TrackerType.Listing, RedditSubredditRepository.class.getSimpleName(), (String)null, (String)null, g.s, g.r, 92).a;
                    }
                    final c0 l2 = ah0.b.l1((CoroutineContext)g.p.c(), (p)new RedditSubredditRepository$remoteFetcherForKey$1(g, (Map)a.X2(s2, g.k, (String)null), (c)null));
                    final o0 o2 = new o0((Object)g, 1);
                    l2.getClass();
                    c2 = RxJavaPlugins.onAssembly((c0)new pf2.e((af2.g0<Object>)l2, (g<? super Throwable>)o2));
                    e.e((Object)c2, "private fun remoteFetche\u2026st(emptyList())\n    }\n  }");
                }
                return c2;
            }
            case 0: {
                final RedditSubredditRepository g3 = this.g;
                final String s3 = (String)o;
                e.f((Object)g3, "this$0");
                e.f((Object)s3, "it");
                return g3.c.getCrosspostableSubreddits();
            }
        }
    }
}
