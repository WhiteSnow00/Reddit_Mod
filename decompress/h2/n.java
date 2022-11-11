// 
// Decompiled by Procyon v0.6.0
// 

package h2;

import wd.a;
import androidx.compose.ui.semantics.SemanticsNode;
import sg2.e;
import androidx.compose.ui.node.LayoutNode;

public final class n
{
    public final LayoutNode a;
    
    public n(final LayoutNode a) {
        e.f((Object)a, "rootNode");
        this.a = a;
    }
    
    public final SemanticsNode a() {
        final k n = wd.a.N(this.a);
        e.c((Object)n);
        return new SemanticsNode(n, false);
    }
}
