// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.datasource.local;

import com.reddit.data.events.models.components.ActionInfo;
import ah2.f;
import kotlin.Metadata;
import lh0.a;
import com.reddit.data.events.models.Event;
import kotlin.Pair;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "Lkotlin/Pair;", "Lcom/reddit/data/events/models/Event;", "Llh0/a;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class DatabaseEventDataSource$postDetailsViewed$4 extends Lambda implements l<Pair<? extends Event, ? extends a>, Boolean>
{
    public static final DatabaseEventDataSource$postDetailsViewed$4 INSTANCE;
    
    static {
        INSTANCE = new DatabaseEventDataSource$postDetailsViewed$4();
    }
    
    public DatabaseEventDataSource$postDetailsViewed$4() {
        super(1);
    }
    
    public final Boolean invoke(final Pair<Event, a> pair) {
        f.f((Object)pair, "<name for destructuring parameter 0>");
        final Event event = (Event)pair.component1();
        if (f.a((Object)event.source, (Object)"global") && f.a((Object)event.action, (Object)"view") && f.a((Object)event.noun, (Object)"screen")) {
            final ActionInfo action_info = event.action_info;
            String page_type;
            if (action_info != null) {
                page_type = action_info.page_type;
            }
            else {
                page_type = null;
            }
            if (f.a((Object)page_type, (Object)"post_detail")) {
                return true;
            }
        }
        return false;
    }
}
