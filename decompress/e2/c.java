// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import bg.d;
import sg2.e;
import c2.s;
import z0.h0;
import androidx.compose.ui.node.LayoutNode;

public final class c
{
    public final LayoutNode a;
    public h0<s> b;
    public s c;
    
    public c(final LayoutNode a) {
        e.f((Object)a, "layoutNode");
        this.a = a;
    }
    
    public final s a() {
        Object b;
        if ((b = this.b) == null) {
            final s c = this.c;
            if (c == null) {
                throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
            }
            b = d.t0((Object)c);
        }
        this.b = (h0<s>)b;
        return (s)((h0)b).getValue();
    }
}
