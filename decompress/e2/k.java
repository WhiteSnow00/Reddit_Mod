// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import c2.l;
import c2.x;
import kotlin.Pair;
import androidx.compose.ui.node.LayoutNode$LayoutState;
import androidx.compose.ui.node.LayoutNode;
import a1.e;

public final class k
{
    public final e<LayoutNode> a;
    
    public k() {
        this.a = (e<LayoutNode>)new e((Object[])new LayoutNode[16]);
    }
    
    public static void a(final LayoutNode layoutNode) {
        final LayoutNode$LayoutState n = layoutNode.n;
        final LayoutNode$LayoutState idle = LayoutNode$LayoutState.Idle;
        final int n2 = 0;
        if (n == idle && !layoutNode.W) {
            if (!layoutNode.V) {
                if (layoutNode.z) {
                    final e s = layoutNode.S;
                    if (s != null) {
                        final int h = s.h;
                        if (h > 0) {
                            final Object[] f = s.f;
                            int n3 = 0;
                            do {
                                final Pair pair = (Pair)f[n3];
                                ((x)pair.getSecond()).E((l)pair.getFirst());
                            } while (++n3 < h);
                        }
                    }
                }
            }
        }
        layoutNode.T = false;
        final e v = layoutNode.v();
        final int h2 = v.h;
        if (h2 > 0) {
            final Object[] f2 = v.f;
            int n4 = n2;
            do {
                a((LayoutNode)f2[n4]);
            } while (++n4 < h2);
        }
    }
}
