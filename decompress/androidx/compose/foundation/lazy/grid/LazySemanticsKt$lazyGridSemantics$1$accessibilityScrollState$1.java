// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$1 extends Lambda implements a<Float>
{
    public final /* synthetic */ LazyGridState $state;
    
    public LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$1(final LazyGridState $state) {
        this.$state = $state;
        super(0);
    }
    
    public final Float invoke() {
        return ((SnapshotMutableStateImpl<Number>)this.$state.a.b).getValue().intValue() / 100000.0f + this.$state.e();
    }
}
