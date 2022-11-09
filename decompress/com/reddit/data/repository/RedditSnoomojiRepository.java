// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import r20.d;
import a4.u1;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.SubredditSnoomoji;
import nf2.c0;
import javax.inject.Inject;
import pg2.f;
import r20.a;
import com.reddit.data.remote.RemoteSnoomojiDataSource;
import ge0.k0;

public final class RedditSnoomojiRepository implements k0
{
    public final RemoteSnoomojiDataSource a;
    public final a b;
    public final f c;
    
    @Inject
    public RedditSnoomojiRepository(final RemoteSnoomojiDataSource a, final a b) {
        ah2.f.f((Object)a, "remote");
        ah2.f.f((Object)b, "backgroundThread");
        this.a = a;
        this.b = b;
        this.c = kotlin.a.b((zg2.a)new RedditSnoomojiRepository$store.RedditSnoomojiRepository$store$2(this));
    }
    
    public final c0<SubredditSnoomoji> a(final String s) {
        ah2.f.f((Object)s, "subreddit");
        if (s.length() > 0) {
            final Object value = this.c.getValue();
            ah2.f.e(value, "<get-store>(...)");
            final c0 value2 = ((Store)value).get((Object)s);
            ah2.f.e((Object)value2, "store.get(subreddit)");
            return (c0<SubredditSnoomoji>)u1.j1(value2, (d)this.b);
        }
        throw new IllegalArgumentException("Subreddit name can't be empty.".toString());
    }
}
