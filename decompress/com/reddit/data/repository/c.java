// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import q20.d;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.o;
import io.reactivex.internal.operators.single.SingleFlatMap;
import cg2.j;
import af2.g0;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import ng2.e;
import af2.c0;
import pt.b;

public final class c implements b
{
    public final int f;
    public final Object g;
    
    public c(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final c0 m(final Object o) {
        switch (this.f) {
            default: {
                final RedditSubredditRepository redditSubredditRepository = (RedditSubredditRepository)this.g;
                final String s = (String)o;
                e.f((Object)redditSubredditRepository, "this$0");
                e.f((Object)s, "subredditName");
                final c0 l1 = ah0.b.l1((CoroutineContext)redditSubredditRepository.p.c(), (p)new RedditSubredditRepository$structuredStyleStore$2$1$gqlStructuredStyle$1(redditSubredditRepository, s, (gg2.c)null));
                final c0 subredditStructuredStyle = redditSubredditRepository.c.getSubredditStructuredStyle(s);
                final b b = new b();
                l1.getClass();
                return c0.Q((af2.g0<?>)l1, (af2.g0<?>)subredditStructuredStyle, (ff2.c<? super Object, ? super Object, ?>)b);
            }
            case 0: {
                final RedditCategoryRepository redditCategoryRepository = (RedditCategoryRepository)this.g;
                final j j = (j)o;
                e.f((Object)redditCategoryRepository, "this$0");
                e.f((Object)j, "it");
                final c0 subredditsInRecommended = redditCategoryRepository.b.subredditsInRecommended((String)null);
                final a a = new a(redditCategoryRepository, 1);
                subredditsInRecommended.getClass();
                final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)subredditsInRecommended, (o)a));
                e.e((Object)onAssembly, "remote.subredditsInRecom\u2026      }\n        }\n      }");
                return px1.a.K0(onAssembly, (d)redditCategoryRepository.a);
            }
        }
    }
}
