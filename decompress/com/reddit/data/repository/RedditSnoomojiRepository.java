// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import n20.d;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.SubredditSnoomoji;
import javax.inject.Inject;
import sg2.e;
import hg2.f;
import n20.a;
import com.reddit.data.remote.RemoteSnoomojiDataSource;
import xd0.c0;

public final class RedditSnoomojiRepository implements c0
{
    public final RemoteSnoomojiDataSource a;
    public final a b;
    public final f c;
    
    @Inject
    public RedditSnoomojiRepository(final RemoteSnoomojiDataSource a, final a b) {
        e.f((Object)a, "remote");
        e.f((Object)b, "backgroundThread");
        this.a = a;
        this.b = b;
        this.c = kotlin.a.b((rg2.a)new RedditSnoomojiRepository$store$2(this));
    }
    
    public final ff2.c0<SubredditSnoomoji> a(final String s) {
        e.f((Object)s, "subreddit");
        if (s.length() > 0) {
            final Store value = this.c.getValue();
            e.e((Object)value, "<get-store>(...)");
            final ff2.c0 value2 = value.get((Object)s);
            e.e((Object)value2, "store.get(subreddit)");
            return nn0.a.V(value2, (d)this.b);
        }
        throw new IllegalArgumentException("Subreddit name can't be empty.".toString());
    }
}
