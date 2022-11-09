// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import kotlin.Metadata;
import rk2.f;
import tt.d;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "Ltt/d;", "Lrk2/f;", "Lcom/reddit/data/local/RedditLocalSubredditDataSource$b;", "invoke", "()Ltt/d;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class RedditLocalSubredditDataSource$saveSubredditListing$1 extends Lambda implements a<d<f, RedditLocalSubredditDataSource.b>>
{
    public final /* synthetic */ RedditLocalSubredditDataSource this$0;
    
    public RedditLocalSubredditDataSource$saveSubredditListing$1(final RedditLocalSubredditDataSource this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final d<f, RedditLocalSubredditDataSource.b> invoke() {
        final Object value = this.this$0.p.getValue();
        ah2.f.e(value, "<get-subredditListingPersister>(...)");
        return (d<f, RedditLocalSubredditDataSource.b>)value;
    }
}
