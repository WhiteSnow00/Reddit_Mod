// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import ej2.c0;
import u2.b;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.IntrinsicMinMax;
import java.util.ArrayList;
import sg2.e;
import java.util.List;
import androidx.compose.ui.node.LayoutNode$f;

public interface s
{
    t c(final u p0, final List<? extends r> p1, final long p2);
    
    default int d(final LayoutNode$f layoutNode$f, final List list, final int n) {
        e.f((Object)layoutNode$f, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((i)list.get(i), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return this.c((u)new k((b)layoutNode$f, layoutNode$f.f.w), list2, c0.n2(0, n, 7)).getWidth();
    }
    
    default int f(final LayoutNode$f layoutNode$f, final List list, final int n) {
        e.f((Object)layoutNode$f, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((i)list.get(i), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return this.c((u)new k((b)layoutNode$f, layoutNode$f.f.w), list2, c0.n2(0, n, 7)).getWidth();
    }
    
    default int g(final LayoutNode$f layoutNode$f, final List list, final int n) {
        e.f((Object)layoutNode$f, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((i)list.get(i), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return this.c((u)new k((b)layoutNode$f, layoutNode$f.f.w), list2, c0.n2(n, 0, 13)).getHeight();
    }
    
    default int h(final LayoutNode$f layoutNode$f, final List list, final int n) {
        e.f((Object)layoutNode$f, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((i)list.get(i), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return this.c((u)new k((b)layoutNode$f, layoutNode$f.f.w), list2, c0.n2(n, 0, 13)).getHeight();
    }
}
