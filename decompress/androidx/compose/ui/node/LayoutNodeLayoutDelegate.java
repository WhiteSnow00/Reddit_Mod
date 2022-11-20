// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import h.s;
import ng2.e;

public final class LayoutNodeLayoutDelegate
{
    public final LayoutNode a;
    public LayoutNode.LayoutState b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public final LayoutNodeLayoutDelegate.LayoutNodeLayoutDelegate$MeasurePassDelegate k;
    public LayoutNodeLayoutDelegate.LayoutNodeLayoutDelegate$LookaheadPassDelegate l;
    
    public LayoutNodeLayoutDelegate(final LayoutNode a) {
        ng2.e.f((Object)a, "layoutNode");
        this.a = a;
        this.b = LayoutNode.LayoutState.Idle;
        this.k = new LayoutNodeLayoutDelegate.LayoutNodeLayoutDelegate$MeasurePassDelegate(this);
    }
    
    public static boolean b(final LayoutNode layoutNode) {
        final s u = layoutNode.u;
        LayoutNode layoutNode2;
        if (u != null) {
            layoutNode2 = (LayoutNode)u.g;
        }
        else {
            layoutNode2 = null;
        }
        return e.a((Object)layoutNode2, (Object)layoutNode);
    }
    
    public final NodeCoordinator a() {
        return this.a.G.c;
    }
    
    public final void c(final int j) {
        final int i = this.j;
        this.j = j;
        int n = false ? 1 : 0;
        final boolean b = i == 0;
        if (j == 0) {
            n = (true ? 1 : 0);
        }
        if ((b ? 1 : 0) != n) {
            final LayoutNode x = this.a.x();
            LayoutNodeLayoutDelegate h;
            if (x != null) {
                h = x.H;
            }
            else {
                h = null;
            }
            if (h != null) {
                if (j == 0) {
                    h.c(h.j - 1);
                }
                else {
                    h.c(h.j + 1);
                }
            }
        }
    }
}
