// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import kotlin.Metadata;
import pg2.j;
import z0.t0;
import z0.y0;
import z0.c;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b" }, d2 = { "Lz0/c;", "applier", "Lz0/y0;", "<anonymous parameter 1>", "Lz0/t0;", "<anonymous parameter 2>", "Lpg2/j;", "invoke", "(Lz0/c;Lz0/y0;Lz0/t0;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ComposerImpl$realizeDowns$1 extends Lambda implements q<c<?>, y0, t0, j>
{
    public final /* synthetic */ Object[] $nodes;
    
    public ComposerImpl$realizeDowns$1(final Object[] $nodes) {
        this.$nodes = $nodes;
        super(3);
    }
    
    public final void invoke(final c<?> c, final y0 y0, final t0 t0) {
        androidx.viewpager.widget.c.t(c, "applier", y0, "<anonymous parameter 1>", t0, "<anonymous parameter 2>");
        for (int length = this.$nodes.length, i = 0; i < length; ++i) {
            c.g(this.$nodes[i]);
        }
    }
}
