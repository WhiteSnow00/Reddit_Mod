// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import java.util.List;
import z0.x0;
import z0.f0;
import z0.r0;
import z0.b;
import z0.i;
import ah2.f;
import z0.g0;
import kotlin.Metadata;
import pg2.j;
import z0.t0;
import z0.y0;
import z0.c;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b" }, d2 = { "Lz0/c;", "<anonymous parameter 0>", "Lz0/y0;", "slots", "Lz0/t0;", "<anonymous parameter 2>", "Lpg2/j;", "invoke", "(Lz0/c;Lz0/y0;Lz0/t0;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ComposerImpl$insertMovableContentReferences$1$1$4 extends Lambda implements q<c<?>, y0, t0, j>
{
    public final /* synthetic */ g0 $from;
    public final /* synthetic */ g0 $to;
    public final /* synthetic */ ComposerImpl this$0;
    
    public ComposerImpl$insertMovableContentReferences$1$1$4(final ComposerImpl this$0, final g0 $from, final g0 $to) {
        this.this$0 = this$0;
        this.$from = $from;
        this.$to = $to;
        super(3);
    }
    
    public final void invoke(c<?> o, final y0 y0, final t0 t0) {
        androidx.viewpager.widget.c.t((c)o, "<anonymous parameter 0>", y0, "slots", t0, "<anonymous parameter 2>");
        final f0 k = this.this$0.b.k(this.$from);
        if (k != null) {
            final x0 a = k.a;
            f.f((Object)a, "table");
            ComposerKt.f(y0.m <= 0 && y0.o(y0.r + 1) == 1);
            final int r = y0.r;
            final int h = y0.h;
            final int i = y0.i;
            y0.a(1);
            y0.J();
            y0.e();
            o = a.d();
            try {
                final List a2 = z0.y0.a.a((y0)o, 1, y0, false, true);
                ((y0)o).f();
                y0.j();
                y0.i();
                y0.r = r;
                y0.h = h;
                y0.i = i;
                if (a2.isEmpty() ^ true) {
                    final i b = (i)this.$to.c;
                    for (int size = a2.size(), j = 0; j < size; ++j) {
                        o = a2.get(j);
                        f.f(o, "anchor");
                        o = y0.H(y0.c((b)o), 0);
                        if (o instanceof r0) {
                            o = o;
                        }
                        else {
                            o = null;
                        }
                        if (o != null) {
                            f.f((Object)b, "composition");
                            ((r0)o).b = b;
                        }
                    }
                }
                return;
            }
            finally {
                ((y0)o).f();
            }
        }
        ComposerKt.c("Could not resolve state for movable content");
        throw null;
    }
}
