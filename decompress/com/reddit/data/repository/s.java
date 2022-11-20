// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import mg2.p;
import kotlin.coroutines.CoroutineContext;
import gg2.c;
import ng2.e;
import com.reddit.data.remote.RemoteSnoomojiDataSource;
import af2.c0;
import pt.b;

public final class s implements b
{
    public final int f;
    public final Object g;
    
    public s(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final c0 m(final Object o) {
        switch (this.f) {
            default: {
                return ((RemoteSnoomojiDataSource)this.g).fetchSnoomoji((String)o);
            }
            case 0: {
                final RedditSubredditRepository redditSubredditRepository = (RedditSubredditRepository)this.g;
                final String s = (String)o;
                e.f((Object)redditSubredditRepository, "this$0");
                e.f((Object)s, "key");
                return ah0.b.l1((CoroutineContext)redditSubredditRepository.p.c(), (p)new RedditSubredditRepository$subredditAboutStore$2$1$1(s, redditSubredditRepository, (c)null));
            }
        }
    }
}
