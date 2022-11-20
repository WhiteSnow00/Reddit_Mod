// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import r0.g;
import java.util.List;
import kotlin.Metadata;
import mg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 extends Lambda implements l<Integer, Integer>
{
    public final boolean $isVertical;
    public final List<g> $visibleItems;
    
    public LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1(final boolean $isVertical, final List<? extends g> $visibleItems) {
        this.$isVertical = $isVertical;
        this.$visibleItems = (List<g>)$visibleItems;
        super(1);
    }
    
    public final Integer invoke(int n) {
        if (this.$isVertical) {
            n = this.$visibleItems.get(n).d();
        }
        else {
            n = this.$visibleItems.get(n).b();
        }
        return n;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke(((Number)o).intValue());
    }
}
