// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups.batchstore;

import kotlin.Metadata;
import kotlin.Pair;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\b\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "<anonymous>", "Lkotlin/Pair;", "Key", "Value", "key", "invoke", "(Ljava/lang/Object;)Lkotlin/Pair;" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class BatchStore$getCachedValues$1 extends Lambda implements l<Object, Pair<Object, Object>>
{
    public final /* synthetic */ a<Object, Object> this$0;
    
    public BatchStore$getCachedValues$1(final a<Object, Object> this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final Pair<Object, Object> invoke(final Object o) {
        final Object value = this.this$0.b.get(o);
        if (value == null) {
            return null;
        }
        return (Pair<Object, Object>)new Pair(o, value);
    }
}
