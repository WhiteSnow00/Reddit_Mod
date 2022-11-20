// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import u2.b;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.IntrinsicMinMax;
import java.util.ArrayList;
import ng2.e;
import java.util.List;
import androidx.compose.ui.node.NodeCoordinator;

public interface v
{
    default int a(final v v, final NodeCoordinator nodeCoordinator, final List list, final int n) {
        return v.b(nodeCoordinator, list, n);
    }
    
    default int c(final v v, final NodeCoordinator nodeCoordinator, final List list, final int n) {
        return v.d(nodeCoordinator, list, n);
    }
    
    default int f(final v v, final NodeCoordinator nodeCoordinator, final List list, final int n) {
        return v.h(nodeCoordinator, list, n);
    }
    
    default int g(final v v, final NodeCoordinator nodeCoordinator, final List list, final int n) {
        return v.e(nodeCoordinator, list, n);
    }
    
    default int b(final NodeCoordinator nodeCoordinator, final List list, final int n) {
        e.f((Object)nodeCoordinator, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((j)list.get(i), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return this.i((x)new l((b)nodeCoordinator, nodeCoordinator.l.v), list2, cg.d.J(0, n, 7)).getWidth();
    }
    
    default int d(final NodeCoordinator nodeCoordinator, final List list, final int n) {
        e.f((Object)nodeCoordinator, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((j)list.get(i), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return this.i((x)new l((b)nodeCoordinator, nodeCoordinator.l.v), list2, cg.d.J(n, 0, 13)).getHeight();
    }
    
    default int e(final NodeCoordinator nodeCoordinator, final List list, final int n) {
        e.f((Object)nodeCoordinator, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((j)list.get(i), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return this.i((x)new l((b)nodeCoordinator, nodeCoordinator.l.v), list2, cg.d.J(n, 0, 13)).getHeight();
    }
    
    default int h(final NodeCoordinator nodeCoordinator, final List list, final int n) {
        e.f((Object)nodeCoordinator, "<this>");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            list2.add(new d((j)list.get(i), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return this.i((x)new l((b)nodeCoordinator, nodeCoordinator.l.v), list2, cg.d.J(0, n, 7)).getWidth();
    }
    
    w i(final x p0, final List<? extends u> p1, final long p2);
}
