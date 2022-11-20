// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import u2.b;
import c2.k;
import c2.h0;
import cg.d;
import c2.w;
import c2.u;
import c2.x;
import ng2.e;
import cg2.j;
import androidx.compose.ui.platform.o0;
import mg2.l;
import p0.z;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.p0;

public final class PaddingValuesModifier extends p0 implements a
{
    public final z g;
    
    public PaddingValuesModifier(final z g, final l<? super o0, j> l) {
        e.f((Object)g, "paddingValues");
        e.f((Object)l, "inspectorInfo");
        super((l)l);
        this.g = g;
    }
    
    public final boolean equals(final Object o) {
        PaddingValuesModifier paddingValuesModifier;
        if (o instanceof PaddingValuesModifier) {
            paddingValuesModifier = (PaddingValuesModifier)o;
        }
        else {
            paddingValuesModifier = null;
        }
        return paddingValuesModifier != null && e.a((Object)this.g, (Object)paddingValuesModifier.g);
    }
    
    public final w h(final x x, final u u, final long n) {
        e.f((Object)x, "$this$measure");
        final float b = this.g.b(((k)x).getLayoutDirection());
        final boolean b2 = false;
        final float n2 = 0;
        int n3 = b2 ? 1 : 0;
        if (Float.compare(b, n2) >= 0) {
            n3 = (b2 ? 1 : 0);
            if (Float.compare(this.g.d(), n2) >= 0) {
                n3 = (b2 ? 1 : 0);
                if (Float.compare(this.g.c(((k)x).getLayoutDirection()), n2) >= 0) {
                    n3 = (b2 ? 1 : 0);
                    if (Float.compare(this.g.a(), n2) >= 0) {
                        n3 = 1;
                    }
                }
            }
        }
        if (n3 != 0) {
            final int n4 = ((u2.b)x).w0(this.g.c(((k)x).getLayoutDirection())) + ((u2.b)x).w0(this.g.b(((k)x).getLayoutDirection()));
            final int n5 = ((u2.b)x).w0(this.g.a()) + ((u2.b)x).w0(this.g.d());
            final h0 s0 = u.s0(cg.d.v3(-n4, -n5, n));
            return x.N0(x, cg.d.s1(s0.f + n4, n), cg.d.q1(s0.g + n5, n), (l)new PaddingValuesModifier$measure.PaddingValuesModifier$measure$2(s0, x, this));
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
}
