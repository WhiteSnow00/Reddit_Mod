// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import q0.l;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2 extends Lambda implements a<Float>
{
    public final /* synthetic */ l $itemProvider;
    public final /* synthetic */ LazyListState $state;
    
    public LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2(final LazyListState $state, final l $itemProvider) {
        this.$state = $state;
        this.$itemProvider = $itemProvider;
        super(0);
    }
    
    public final Float invoke() {
        final LazyListState $state = this.$state;
        float n;
        if ($state.q) {
            n = this.$itemProvider.K0() + 1.0f;
        }
        else {
            n = $state.f() + this.$state.g() / 100000.0f;
        }
        return n;
    }
}
