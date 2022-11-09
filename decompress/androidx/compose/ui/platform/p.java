// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import h2.k;
import androidx.compose.ui.semantics.SemanticsNode;
import a4.u1;
import ah2.f;
import b4.c;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import a4.a;

public final class p extends a
{
    public final /* synthetic */ LayoutNode b;
    public final /* synthetic */ AndroidComposeView c;
    public final /* synthetic */ AndroidComposeView d;
    
    public p(final LayoutNode b, final AndroidComposeView c, final AndroidComposeView d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void onInitializeAccessibilityNodeInfo(final View view, final c c) {
        f.f((Object)view, "host");
        f.f((Object)c, "info");
        super.onInitializeAccessibilityNodeInfo(view, c);
        final k x = u1.X(this.b);
        f.c((Object)x);
        final SemanticsNode g = new SemanticsNode(x, false).g();
        f.c((Object)g);
        int f;
        if ((f = g.f) == this.c.getSemanticsOwner().a().f) {
            f = -1;
        }
        final AndroidComposeView d = this.d;
        c.b = f;
        c.a.setParent((View)d, f);
    }
}
