// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import c2.h0;
import mg2.l;
import cg.d;
import c2.w;
import ng2.e;
import c2.j;
import c2.k;
import c2.u;
import c2.x;
import androidx.compose.ui.layout.a;

public interface IntrinsicSizeModifier extends a
{
    long L(final x p0, final u p1, final long p2);
    
    default int b(final k k, final j j, final int n) {
        e.f((Object)k, "<this>");
        return j.t(n);
    }
    
    default int c(final k k, final j j, final int n) {
        e.f((Object)k, "<this>");
        return j.l0(n);
    }
    
    default int f(final k k, final j j, final int n) {
        e.f((Object)k, "<this>");
        return j.L(n);
    }
    
    default int g(final k k, final j j, final int n) {
        e.f((Object)k, "<this>");
        return j.r0(n);
    }
    
    default w h(final x x, final u u, final long n) {
        e.f((Object)x, "$this$measure");
        final h0 s0 = u.s0(cg.d.p1(n, this.L(x, u, n)));
        return x.N0(x, s0.f, s0.g, (l)new IntrinsicSizeModifier$measure.IntrinsicSizeModifier$measure$1(s0));
    }
}
