// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.layout;

import c2.h0;
import java.util.ArrayList;
import cg.d;
import mg2.l;
import u2.a;
import ng2.e;
import c2.w;
import c2.u;
import java.util.List;
import c2.x;
import androidx.compose.ui.node.LayoutNode$c;

public final class RootMeasurePolicy extends LayoutNode$c
{
    public static final RootMeasurePolicy b;
    
    static {
        b = new RootMeasurePolicy();
    }
    
    public RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }
    
    public final w i(final x x, final List<? extends u> list, final long n) {
        e.f((Object)x, "$this$measure");
        e.f((Object)list, "measurables");
        w w;
        if (list.isEmpty()) {
            w = x.N0(x, a.j(n), a.i(n), (l)RootMeasurePolicy$measure$1.INSTANCE);
        }
        else {
            final int size = list.size();
            int i = 0;
            if (size == 1) {
                final h0 s0 = list.get(0).s0(n);
                w = x.N0(x, d.s1(s0.f, n), d.q1(s0.g, n), (l)new RootMeasurePolicy$measure$2(s0));
            }
            else {
                final ArrayList list2 = new ArrayList(list.size());
                for (int size2 = list.size(), j = 0; j < size2; ++j) {
                    list2.add(list.get(j).s0(n));
                }
                final int size3 = list2.size();
                int max = 0;
                int max2 = 0;
                while (i < size3) {
                    final h0 h0 = list2.get(i);
                    max = Math.max(h0.f, max);
                    max2 = Math.max(h0.g, max2);
                    ++i;
                }
                w = x.N0(x, d.s1(max, n), d.q1(max2, n), (l)new RootMeasurePolicy$measure$4((List)list2));
            }
        }
        return w;
    }
}
