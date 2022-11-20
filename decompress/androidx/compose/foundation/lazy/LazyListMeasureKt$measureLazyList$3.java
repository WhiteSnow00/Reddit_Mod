// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import ng2.e;
import java.util.List;
import kotlin.Metadata;
import cg2.j;
import c2.h0;
import mg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "Lc2/h0$a;", "Lcg2/j;", "invoke", "(Lc2/h0$a;)V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class LazyListMeasureKt$measureLazyList$3 extends Lambda implements l<h0.a, j>
{
    public final a $headerItem;
    public final List<a> $positionedItems;
    
    public LazyListMeasureKt$measureLazyList$3(final List<a> $positionedItems, final a $headerItem) {
        this.$positionedItems = $positionedItems;
        this.$headerItem = $headerItem;
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        this.invoke((h0.a)o);
        return j.a;
    }
    
    public final void invoke(final h0.a a) {
        e.f((Object)a, "$this$invoke");
        final List<a> $positionedItems = this.$positionedItems;
        final a $headerItem = this.$headerItem;
        for (int size = $positionedItems.size(), i = 0; i < size; ++i) {
            final a a2 = $positionedItems.get(i);
            if (a2 != $headerItem) {
                a2.d(a);
            }
        }
        final a $headerItem2 = this.$headerItem;
        if ($headerItem2 != null) {
            $headerItem2.d(a);
        }
    }
}
