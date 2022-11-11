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

public final class w implements IntrinsicSizeModifier
{
    public static final w f;
    
    static {
        f = new w();
    }
    
    public final long H(final u u, final r r, final long n) {
        e.f((Object)u, "$this$calculateContentConstraints");
        e.f((Object)r, "measurable");
        return a$a.d(((i)r).C(a.h(n)));
    }
    
    public final int c(final u u, final LayoutNodeWrapper layoutNodeWrapper, final int n) {
        e.f((Object)u, "<this>");
        e.f((Object)layoutNodeWrapper, "measurable");
        return ((i)layoutNodeWrapper).C(n);
    }
}
