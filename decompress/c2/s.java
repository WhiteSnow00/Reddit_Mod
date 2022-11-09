// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import mj2.c0;
import u2.b;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.IntrinsicMinMax;
import java.util.ArrayList;
import ah2.f;
import java.util.List;
import androidx.compose.ui.node.LayoutNode;

public interface s
{
    t c(final u p0, final List<? extends r> p1, final long p2);
    
    default int d(final LayoutNode.LayoutNode$f u, final List list, final int n) {
        f.f((Object)u, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((i)list.get(i), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return this.c((u)new k((b)u, u.f.w), list2, c0.b(0, n, 7)).getWidth();
    }
    
    default int f(final LayoutNode.LayoutNode$f u, final List list, final int n) {
        f.f((Object)u, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((i)list.get(i), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return this.c((u)new k((b)u, u.f.w), list2, c0.b(0, n, 7)).getWidth();
    }
    
    default int g(final LayoutNode.LayoutNode$f u, final List list, final int n) {
        f.f((Object)u, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((i)list.get(i), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return this.c((u)new k((b)u, u.f.w), list2, c0.b(n, 0, 13)).getHeight();
    }
    
    default int h(final LayoutNode.LayoutNode$f u, final List list, final int n) {
        f.f((Object)u, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((i)list.get(i), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return this.c((u)new k((b)u, u.f.w), list2, c0.b(n, 0, 13)).getHeight();
    }
}
