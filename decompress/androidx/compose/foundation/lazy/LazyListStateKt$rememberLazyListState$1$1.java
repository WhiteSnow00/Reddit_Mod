// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import mg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LazyListStateKt$rememberLazyListState$1$1 extends Lambda implements a<LazyListState>
{
    public final int $initialFirstVisibleItemIndex;
    public final int $initialFirstVisibleItemScrollOffset;
    
    public LazyListStateKt$rememberLazyListState$1$1(final int $initialFirstVisibleItemIndex, final int $initialFirstVisibleItemScrollOffset) {
        this.$initialFirstVisibleItemIndex = $initialFirstVisibleItemIndex;
        this.$initialFirstVisibleItemScrollOffset = $initialFirstVisibleItemScrollOffset;
        super(0);
    }
    
    public final LazyListState invoke() {
        return new LazyListState(this.$initialFirstVisibleItemIndex, this.$initialFirstVisibleItemScrollOffset);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}
