// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import at1.a;
import kotlin.jvm.internal.Ref$IntRef;
import z0.b;
import kotlin.Metadata;
import pg2.j;
import z0.t0;
import z0.y0;
import z0.c;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b" }, d2 = { "Lz0/c;", "applier", "Lz0/y0;", "slots", "Lz0/t0;", "<anonymous parameter 2>", "Lpg2/j;", "invoke", "(Lz0/c;Lz0/y0;Lz0/t0;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ComposerImpl$insertMovableContentReferences$1$1$1 extends Lambda implements q<c<?>, y0, t0, j>
{
    public final /* synthetic */ b $anchor;
    public final /* synthetic */ Ref$IntRef $effectiveNodeIndex;
    
    public ComposerImpl$insertMovableContentReferences$1$1$1(final Ref$IntRef $effectiveNodeIndex, final b $anchor) {
        this.$effectiveNodeIndex = $effectiveNodeIndex;
        this.$anchor = $anchor;
        super(3);
    }
    
    public final void invoke(final c<?> c, final y0 y0, final t0 t0) {
        androidx.viewpager.widget.c.t(c, "applier", y0, "slots", t0, "<anonymous parameter 2>");
        final Ref$IntRef $effectiveNodeIndex = this.$effectiveNodeIndex;
        final int c2 = y0.c(this.$anchor);
        final int r = y0.r;
        final boolean b = true;
        ComposerKt.f(r < c2);
        ComposerImpl.a0(y0, (c)c, c2);
        final int r2 = y0.r;
        int n;
        for (n = y0.s; n >= 0 && !y0.s(n); n = y0.y(n)) {}
        int n2 = n + 1;
        int n3 = 0;
        int element;
        while (true) {
            element = n3;
            if (n2 >= r2) {
                break;
            }
            if (y0.p(r2, n2)) {
                if (y0.s(n2)) {
                    n3 = 0;
                }
                ++n2;
            }
            else {
                int v;
                if (y0.s(n2)) {
                    v = 1;
                }
                else {
                    v = a.v(y0.n(n2), y0.b);
                }
                n3 += v;
                n2 += y0.o(n2);
            }
        }
        int r3;
        while (true) {
            r3 = y0.r;
            if (r3 >= c2) {
                break;
            }
            if (y0.p(c2, r3)) {
                final int r4 = y0.r;
                if (r4 < y0.g && a.t(y0.n(r4), y0.b)) {
                    c.g(y0.x(y0.r));
                    element = 0;
                }
                y0.J();
            }
            else {
                element += y0.F();
            }
        }
        ComposerKt.f(r3 == c2 && b);
        $effectiveNodeIndex.element = element;
    }
}
