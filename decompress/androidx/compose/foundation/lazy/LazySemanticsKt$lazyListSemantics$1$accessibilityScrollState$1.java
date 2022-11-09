// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1 extends Lambda implements a<Float>
{
    public final /* synthetic */ LazyListState $state;
    
    public LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1(final LazyListState $state) {
        this.$state = $state;
        super(0);
    }
    
    public final Float invoke() {
        return this.$state.g() / 100000.0f + this.$state.f();
    }
}
