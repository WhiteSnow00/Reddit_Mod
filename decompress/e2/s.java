// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import ah2.f;
import androidx.compose.ui.node.LayoutNode;
import z0.a;

public final class s extends a<LayoutNode>
{
    public s(final LayoutNode layoutNode) {
        f.f((Object)layoutNode, "root");
        super(layoutNode);
    }
    
    public final void a(final int n, final int n2) {
        ((LayoutNode)super.c).O(n, n2);
    }
    
    public final void b() {
        final m l = ((LayoutNode)super.a).l;
        if (l != null) {
            l.l();
        }
    }
    
    public final void c(final int n, final int n2, final int n3) {
        ((LayoutNode)super.c).J(n, n2, n3);
    }
    
    public final void d(final int n, final Object o) {
        f.f((Object)o, "instance");
    }
    
    public final void f(final int n, final Object o) {
        final LayoutNode layoutNode = (LayoutNode)o;
        f.f((Object)layoutNode, "instance");
        ((LayoutNode)super.c).x(n, layoutNode);
    }
    
    @Override
    public final void i() {
        ((LayoutNode)super.a).N();
    }
}
