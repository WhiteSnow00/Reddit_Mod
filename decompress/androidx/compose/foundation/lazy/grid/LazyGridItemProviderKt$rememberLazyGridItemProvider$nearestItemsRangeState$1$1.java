// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import mg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$1$1 extends Lambda implements a<Integer>
{
    public final LazyGridState $state;
    
    public LazyGridItemProviderKt$rememberLazyGridItemProvider$nearestItemsRangeState$1$1(final LazyGridState $state) {
        this.$state = $state;
        super(0);
    }
    
    public final Integer invoke() {
        return this.$state.e();
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}
