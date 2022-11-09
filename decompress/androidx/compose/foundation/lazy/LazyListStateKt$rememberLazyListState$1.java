// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazyListStateKt$rememberLazyListState$1 extends Lambda implements a<LazyListState>
{
    public final /* synthetic */ int $initialFirstVisibleItemIndex;
    public final /* synthetic */ int $initialFirstVisibleItemScrollOffset;
    
    public LazyListStateKt$rememberLazyListState$1(final int $initialFirstVisibleItemIndex, final int $initialFirstVisibleItemScrollOffset) {
        this.$initialFirstVisibleItemIndex = $initialFirstVisibleItemIndex;
        this.$initialFirstVisibleItemScrollOffset = $initialFirstVisibleItemScrollOffset;
        super(0);
    }
    
    public final LazyListState invoke() {
        return new LazyListState(this.$initialFirstVisibleItemIndex, this.$initialFirstVisibleItemScrollOffset);
    }
}
