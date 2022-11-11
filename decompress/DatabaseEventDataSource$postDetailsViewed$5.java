// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.datasource.local;

import com.reddit.data.events.models.components.Subreddit;
import com.reddit.data.events.models.components.Post;
import kotlin.Metadata;
import bh0.f;
import lh0.a;
import com.reddit.data.events.models.Event;
import kotlin.Pair;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "Lkotlin/Pair;", "Lcom/reddit/data/events/models/Event;", "Llh0/a;", "<name for destructuring parameter 0>", "Lbh0/f;", "invoke", "(Lkotlin/Pair;)Lbh0/f;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class DatabaseEventDataSource$postDetailsViewed$5 extends Lambda implements l<Pair<? extends Event, ? extends a>, f>
{
    public static final DatabaseEventDataSource$postDetailsViewed$5 INSTANCE;
    
    static {
        INSTANCE = new DatabaseEventDataSource$postDetailsViewed$5();
    }
    
    public DatabaseEventDataSource$postDetailsViewed$5() {
        super(1);
    }
    
    public final f invoke(final Pair<Event, a> pair) {
        ah2.f.f((Object)pair, "<name for destructuring parameter 0>");
        final Event event = (Event)pair.component1();
        final a a = (a)pair.component2();
        final Post post = event.post;
        String id;
        if (post != null) {
            id = post.id;
        }
        else {
            id = null;
        }
        if (id == null) {
            return null;
        }
        final Subreddit subreddit = event.subreddit;
        String id2;
        if (subreddit != null) {
            id2 = subreddit.id;
        }
        else {
            id2 = null;
        }
        if (id2 == null) {
            return null;
        }
        return new f(id, id2, a.b);
    }
}
