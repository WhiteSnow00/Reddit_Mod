// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import mg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$1$1 extends Lambda implements a<Integer>
{
    public final LazyListState $state;
    
    public LazyListItemProviderKt$rememberLazyListItemProvider$nearestItemsRangeState$1$1(final LazyListState $state) {
        this.$state = $state;
        super(0);
    }
    
    public final Integer invoke() {
        return this.$state.f();
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}
