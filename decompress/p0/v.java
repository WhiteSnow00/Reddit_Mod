// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import c2.i;
import androidx.compose.ui.node.LayoutNodeWrapper;
import u2.a$a;
import u2.a;
import sg2.e;
import c2.r;
import c2.u;
import androidx.compose.foundation.layout.IntrinsicSizeModifier;

public final class v implements IntrinsicSizeModifier
{
    public static final v f;
    
    static {
        f = new v();
    }
    
    public final long H(final u u, final r r, final long n) {
        e.f((Object)u, "$this$calculateContentConstraints");
        e.f((Object)r, "measurable");
        return a$a.e(((i)r).F(a.g(n)));
    }
    
    public final int k(final u u, final LayoutNodeWrapper layoutNodeWrapper, final int n) {
        e.f((Object)u, "<this>");
        e.f((Object)layoutNodeWrapper, "measurable");
        return ((i)layoutNodeWrapper).F(n);
    }
}
