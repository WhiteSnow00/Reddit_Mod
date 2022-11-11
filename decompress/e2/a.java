// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import sg2.e;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;

public final class a implements Comparator<LayoutNode>
{
    @Override
    public final int compare(final Object o, final Object o2) {
        final LayoutNode layoutNode = (LayoutNode)o;
        final LayoutNode layoutNode2 = (LayoutNode)o2;
        e.f((Object)layoutNode, "l1");
        e.f((Object)layoutNode2, "l2");
        int n = e.h(layoutNode.m, layoutNode2.m);
        if (n == 0) {
            n = e.h(layoutNode.hashCode(), layoutNode2.hashCode());
        }
        return n;
    }
}
