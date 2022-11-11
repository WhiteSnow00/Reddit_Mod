// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import c2.l;
import z1.t;
import androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1;
import j1.d;
import sg2.e;
import androidx.compose.ui.node.LayoutNodeWrapper;
import z1.u;

public final class o extends g<o, u>
{
    public o(final LayoutNodeWrapper layoutNodeWrapper, final u u) {
        e.f((Object)layoutNodeWrapper, "layoutNodeWrapper");
        e.f((Object)u, "modifier");
        super(layoutNodeWrapper, (d)u);
    }
    
    @Override
    public final void a() {
        super.i = true;
        ((u)super.g).I0().f = (l)super.f;
        ((u)super.g).I0().g = true;
    }
    
    @Override
    public final void b() {
        super.i = false;
        ((u)super.g).I0().g = false;
    }
    
    public final boolean c() {
        final t i0 = ((u)super.g).I0();
        i0.getClass();
        final boolean b = i0 instanceof PointerInteropFilter$pointerInputFilter$1;
        boolean b2 = false;
        if (!b) {
            final o o = (o)super.h;
            if (o == null || !o.c()) {
                return b2;
            }
        }
        b2 = true;
        return b2;
    }
}
