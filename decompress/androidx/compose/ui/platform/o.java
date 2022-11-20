// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import e2.h0;
import androidx.compose.ui.semantics.SemanticsNode;
import e2.b;
import dg.l0;
import ng2.e;
import b4.c;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import a4.a;

public final class o extends a
{
    public final LayoutNode b;
    public final AndroidComposeView c;
    public final AndroidComposeView d;
    
    public o(final LayoutNode b, final AndroidComposeView c, final AndroidComposeView d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final c c) {
        e.f((Object)view, "host");
        e.f((Object)c, "info");
        super.onInitializeAccessibilityNodeInfo(view, c);
        final h0 p2 = l0.p0(this.b);
        e.c((Object)p2);
        final SemanticsNode g = new SemanticsNode(p2, false, xd.a.g1((b)p2)).g();
        e.c((Object)g);
        int g2;
        if ((g2 = g.g) == this.c.getSemanticsOwner().a().g) {
            g2 = -1;
        }
        final AndroidComposeView d = this.d;
        c.b = g2;
        c.a.setParent((View)d, g2);
    }
}
