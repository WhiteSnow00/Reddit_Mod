// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import sg2.e;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;

public final class j implements Comparator<LayoutNode>
{
    public static final j f;
    
    static {
        f = new j();
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final LayoutNode layoutNode = (LayoutNode)o;
        final LayoutNode layoutNode2 = (LayoutNode)o2;
        e.f((Object)layoutNode, "a");
        e.f((Object)layoutNode2, "b");
        int n = e.h(layoutNode2.m, layoutNode.m);
        if (n == 0) {
            n = e.h(layoutNode.hashCode(), layoutNode2.hashCode());
        }
        return n;
    }
}
