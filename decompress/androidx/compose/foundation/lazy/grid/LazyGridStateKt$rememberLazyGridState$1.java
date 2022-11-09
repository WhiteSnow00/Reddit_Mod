// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazyGridStateKt$rememberLazyGridState$1 extends Lambda implements a<LazyGridState>
{
    public final /* synthetic */ int $initialFirstVisibleItemIndex;
    public final /* synthetic */ int $initialFirstVisibleItemScrollOffset;
    
    public LazyGridStateKt$rememberLazyGridState$1(final int $initialFirstVisibleItemIndex, final int $initialFirstVisibleItemScrollOffset) {
        this.$initialFirstVisibleItemIndex = $initialFirstVisibleItemIndex;
        this.$initialFirstVisibleItemScrollOffset = $initialFirstVisibleItemScrollOffset;
        super(0);
    }
    
    public final LazyGridState invoke() {
        return new LazyGridState(this.$initialFirstVisibleItemIndex, this.$initialFirstVisibleItemScrollOffset);
    }
}
