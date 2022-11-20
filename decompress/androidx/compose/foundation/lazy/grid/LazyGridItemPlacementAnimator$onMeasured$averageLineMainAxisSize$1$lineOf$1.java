// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import r0.q;
import java.util.List;
import kotlin.Metadata;
import mg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1 extends Lambda implements l<Integer, Integer>
{
    public final List<q> $positionedItems;
    public final LazyGridItemPlacementAnimator $this_run;
    
    public LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1(final LazyGridItemPlacementAnimator $this_run, final List<q> $positionedItems) {
        this.$this_run = $this_run;
        this.$positionedItems = $positionedItems;
        super(1);
    }
    
    public final Integer invoke(int n) {
        if (this.$this_run.b) {
            n = this.$positionedItems.get(n).e;
        }
        else {
            n = this.$positionedItems.get(n).f;
        }
        return n;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke(((Number)o).intValue());
    }
}
