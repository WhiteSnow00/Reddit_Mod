// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import sg2.e;
import z0.b;
import java.util.ArrayList;
import xv.a;
import kotlin.Metadata;
import hg2.j;
import z0.t0;
import z0.y0;
import z0.c;
import rg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b" }, d2 = { "Lz0/c;", "<anonymous parameter 0>", "Lz0/y0;", "slots", "Lz0/t0;", "<anonymous parameter 2>", "Lhg2/j;", "invoke", "(Lz0/c;Lz0/y0;Lz0/t0;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ComposerImpl$start$2 extends Lambda implements q<c<?>, y0, t0, j>
{
    public final /* synthetic */ int $currentRelativePosition;
    
    public ComposerImpl$start$2(final int $currentRelativePosition) {
        this.$currentRelativePosition = $currentRelativePosition;
        super(3);
    }
    
    public final void invoke(final c<?> c, final y0 y0, final t0 t0) {
        a.c((c)c, "<anonymous parameter 0>", y0, "slots", t0, "<anonymous parameter 2>");
        int i = this.$currentRelativePosition;
        if (y0.m != 0) {
            throw new IllegalArgumentException("Cannot move a group while inserting".toString());
        }
        if (i >= 0) {
            if (i != 0) {
                final int r = y0.r;
                final int s = y0.s;
                final int g = y0.g;
                int n = r;
                while (i > 0) {
                    final int n2 = n + aa1.a.o(y0.n(n), y0.b);
                    if (n2 > g) {
                        throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
                    }
                    --i;
                    n = n2;
                }
                final int o = aa1.a.o(y0.n(n), y0.b);
                final int h = y0.h;
                final int g2 = y0.g(y0.n(n), y0.b);
                final int[] b = y0.b;
                final int n3 = n + o;
                final int g3 = y0.g(y0.n(n3), b);
                final int n4 = g3 - g2;
                y0.r(n4, Math.max(y0.r - 1, 0));
                y0.q(o);
                final int[] b2 = y0.b;
                final int n5 = y0.n(n3) * 5;
                ig2.j.C0(y0.n(r) * 5, n5, o * 5 + n5, b2, b2);
                if (n4 > 0) {
                    final Object[] c2 = y0.c;
                    ig2.j.F0(c2, h, c2, y0.h(g2 + n4), y0.h(g3 + n4));
                }
                final int n6 = g2 + n4;
                final int n7 = n6 - h;
                final int j = y0.j;
                final int k = y0.k;
                final int length = y0.c.length;
                final int l = y0.l;
                for (int n8 = r; n8 < r + o; ++n8) {
                    final int n9 = y0.n(n8);
                    final int n10 = y0.g(n9, b2) - n7;
                    int n11;
                    if (l < n9) {
                        n11 = 0;
                    }
                    else {
                        n11 = j;
                    }
                    int n12 = n10;
                    if (n10 > n11) {
                        n12 = -(length - k - n10 + 1);
                    }
                    final int m = y0.j;
                    final int k2 = y0.k;
                    final int length2 = y0.c.length;
                    int n13;
                    if ((n13 = n12) > m) {
                        n13 = -(length2 - k2 - n12 + 1);
                    }
                    b2[n9 * 5 + 4] = n13;
                }
                final int m2 = y0.m();
                final int s2 = aa1.a.s(y0.d, n3, m2);
                final ArrayList<b> list = new ArrayList<b>();
                if (s2 >= 0) {
                    while (s2 < y0.d.size()) {
                        final Object value = y0.d.get(s2);
                        e.e(value, "anchors[index]");
                        final b b3 = (b)value;
                        final int c3 = y0.c(b3);
                        if (c3 < n3 || c3 >= o + n3) {
                            break;
                        }
                        list.add(b3);
                        y0.d.remove(s2);
                    }
                }
                for (int size = list.size(), n14 = 0; n14 < size; ++n14) {
                    final b b4 = list.get(n14);
                    final int a = y0.c(b4) + (r - n3);
                    if (a >= y0.e) {
                        b4.a = -(m2 - a);
                    }
                    else {
                        b4.a = a;
                    }
                    y0.d.add(aa1.a.s(y0.d, a, m2), b4);
                }
                if (!(y0.C(n3, o) ^ true)) {
                    ComposerKt.c("Unexpectedly removed anchors".toString());
                    throw null;
                }
                y0.l(s, y0.g, r);
                if (n4 > 0) {
                    y0.D(n6, n4, n3 - 1);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
    }
}
