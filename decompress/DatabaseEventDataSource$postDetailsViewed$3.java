// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.datasource.local;

import ah2.f;
import kotlin.Metadata;
import com.reddit.data.events.models.Event;
import kotlin.Pair;
import lh0.a;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "Llh0/a;", "eventDataModel", "Lkotlin/Pair;", "Lcom/reddit/data/events/models/Event;", "invoke", "(Llh0/a;)Lkotlin/Pair;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class DatabaseEventDataSource$postDetailsViewed$3 extends Lambda implements l<a, Pair<? extends Event, ? extends a>>
{
    public final /* synthetic */ DatabaseEventDataSource this$0;
    
    public DatabaseEventDataSource$postDetailsViewed$3(final DatabaseEventDataSource this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final Pair<Event, a> invoke(final a a) {
        f.f((Object)a, "eventDataModel");
        final Object fromJson = this.this$0.i().fromJson(new String(a.c, kj2.a.b));
        f.c(fromJson);
        return (Pair<Event, a>)new Pair(fromJson, (Object)a);
    }
}
