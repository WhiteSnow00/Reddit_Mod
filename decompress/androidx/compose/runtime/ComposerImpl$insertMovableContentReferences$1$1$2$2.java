// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import z0.j0;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.Metadata;
import pg2.j;
import z0.t0;
import z0.y0;
import z0.c;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b" }, d2 = { "Lz0/c;", "applier", "Lz0/y0;", "slots", "Lz0/t0;", "rememberManager", "Lpg2/j;", "invoke", "(Lz0/c;Lz0/y0;Lz0/t0;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ComposerImpl$insertMovableContentReferences$1$1$2$2 extends Lambda implements q<c<?>, y0, t0, j>
{
    public final /* synthetic */ Ref$IntRef $effectiveNodeIndex;
    public final /* synthetic */ List<q<c<?>, y0, t0, j>> $offsetChanges;
    
    public ComposerImpl$insertMovableContentReferences$1$1$2$2(final Ref$IntRef $effectiveNodeIndex, final List<q<c<?>, y0, t0, j>> $offsetChanges) {
        this.$effectiveNodeIndex = $effectiveNodeIndex;
        this.$offsetChanges = $offsetChanges;
        super(3);
    }
    
    public final void invoke(final c<?> c, final y0 y0, final t0 t0) {
        androidx.viewpager.widget.c.t(c, "applier", y0, "slots", t0, "rememberManager");
        final int element = this.$effectiveNodeIndex.element;
        Object o = c;
        if (element > 0) {
            o = new j0((z0.c<Object>)c, element);
        }
        final List<q<c<?>, y0, t0, j>> $offsetChanges = this.$offsetChanges;
        for (int i = 0; i < $offsetChanges.size(); ++i) {
            ((q)$offsetChanges.get(i)).invoke(o, (Object)y0, (Object)t0);
        }
    }
}
