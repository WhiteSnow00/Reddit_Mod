// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import r0.i;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$2 extends Lambda implements a<Float>
{
    public final /* synthetic */ i $itemProvider;
    public final /* synthetic */ LazyGridState $state;
    
    public LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$2(final LazyGridState $state, final i $itemProvider) {
        this.$state = $state;
        this.$itemProvider = $itemProvider;
        super(0);
    }
    
    public final Float invoke() {
        final LazyGridState $state = this.$state;
        float n;
        if ($state.s) {
            n = this.$itemProvider.K0() + 1.0f;
        }
        else {
            n = $state.e() + ((SnapshotMutableStateImpl<Number>)this.$state.a.b).getValue().intValue() / 100000.0f;
        }
        return n;
    }
}
