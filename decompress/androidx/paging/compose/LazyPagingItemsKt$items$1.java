// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging.compose;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import d5.c;
import c5.j;
import d5.b;
import kotlin.Metadata;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n" }, d2 = { "", "T", "", "index", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class LazyPagingItemsKt$items$1 extends Lambda implements l<Integer, Object>
{
    public final /* synthetic */ b<Object> $items;
    public final /* synthetic */ l<Object, Object> $key;
    
    public LazyPagingItemsKt$items$1(final b<Object> $items, final l<Object, ?> $key) {
        this.$items = $items;
        this.$key = (l<Object, Object>)$key;
        super(1);
    }
    
    public final Object invoke(final int n) {
        final Object value = ((j)((SnapshotMutableStateImpl)this.$items.b).getValue()).get(n);
        Object invoke;
        if (value == null) {
            invoke = new c(n);
        }
        else {
            invoke = this.$key.invoke(value);
        }
        return invoke;
    }
}
