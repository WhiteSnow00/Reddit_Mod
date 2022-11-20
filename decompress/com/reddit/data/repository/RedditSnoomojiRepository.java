// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import q20.d;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.SubredditSnoomoji;
import af2.c0;
import javax.inject.Inject;
import ng2.e;
import cg2.f;
import q20.a;
import com.reddit.data.remote.RemoteSnoomojiDataSource;
import xd0.d0;

public final class RedditSnoomojiRepository implements d0
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
        this.c = kotlin.a.b((mg2.a)new RedditSnoomojiRepository$store$2(this));
    }
    
    @Override
    public final c0<SubredditSnoomoji> a(final String s) {
        e.f((Object)s, "subreddit");
        if (s.length() > 0) {
            final Object value = this.c.getValue();
            e.e(value, "<get-store>(...)");
            final c0 value2 = ((Store)value).get((Object)s);
            e.e((Object)value2, "store.get(subreddit)");
            return px1.a.K0(value2, (d)this.b);
        }
        throw new IllegalArgumentException("Subreddit name can't be empty.".toString());
    }
}
