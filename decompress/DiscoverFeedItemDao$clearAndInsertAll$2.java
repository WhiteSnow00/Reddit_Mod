// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.dao;

import java.util.List;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.room.dao.DiscoverFeedItemDao$DefaultImpls", f = "DiscoverFeedItemDao.kt", l = { 23 }, m = "clearAndInsertAll")
final class DiscoverFeedItemDao$clearAndInsertAll$2 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    
    public DiscoverFeedItemDao$clearAndInsertAll$2(final tg2.c<? super DiscoverFeedItemDao$clearAndInsertAll$2> c) {
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return a.a.a(null, null, null, (tg2.c)this);
    }
}
