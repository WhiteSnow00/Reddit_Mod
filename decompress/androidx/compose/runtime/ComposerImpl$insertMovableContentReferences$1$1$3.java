// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.Metadata;
import pg2.j;
import z0.t0;
import z0.y0;
import z0.c;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b" }, d2 = { "Lz0/c;", "applier", "Lz0/y0;", "<anonymous parameter 1>", "Lz0/t0;", "<anonymous parameter 2>", "Lpg2/j;", "invoke", "(Lz0/c;Lz0/y0;Lz0/t0;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ComposerImpl$insertMovableContentReferences$1$1$3 extends Lambda implements q<c<?>, y0, t0, j>
{
    public final /* synthetic */ Ref$IntRef $effectiveNodeIndex;
    public final /* synthetic */ List<Object> $nodesToInsert;
    
    public ComposerImpl$insertMovableContentReferences$1$1$3(final Ref$IntRef $effectiveNodeIndex, final List<?> $nodesToInsert) {
        this.$effectiveNodeIndex = $effectiveNodeIndex;
        this.$nodesToInsert = (List<Object>)$nodesToInsert;
        super(3);
    }
    
    public final void invoke(final c<?> c, final y0 y0, final t0 t0) {
        androidx.viewpager.widget.c.t(c, "applier", y0, "<anonymous parameter 1>", t0, "<anonymous parameter 2>");
        final int element = this.$effectiveNodeIndex.element;
        final List<Object> $nodesToInsert = this.$nodesToInsert;
        for (int size = $nodesToInsert.size(), i = 0; i < size; ++i) {
            final Object value = $nodesToInsert.get(i);
            final int n = element + i;
            c.f(n, value);
            c.d(n, value);
        }
    }
}
