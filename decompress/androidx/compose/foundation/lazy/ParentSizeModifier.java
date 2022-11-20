// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import c2.h0;
import cg.d;
import c2.w;
import c2.u;
import c2.x;
import z0.k0;
import ng2.e;
import cg2.j;
import androidx.compose.ui.platform.o0;
import mg2.l;
import z0.c1;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.p0;

public final class ParentSizeModifier extends p0 implements a
{
    public final float g;
    public final c1<Integer> h;
    public final c1<Integer> i;
    
    public ParentSizeModifier(final float g, final l<? super o0, j> l, final c1<Integer> h, final c1<Integer> i) {
        e.f((Object)l, "inspectorInfo");
        super((l)l);
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public ParentSizeModifier(final float n, final l l, k0 k0, k0 k2, final int n2) {
        if ((n2 & 0x4) != 0x0) {
            k0 = null;
        }
        if ((n2 & 0x8) != 0x0) {
            k2 = null;
        }
        this(n, (l<? super o0, j>)l, (c1<Integer>)k0, (c1<Integer>)k2);
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParentSizeModifier)) {
            return false;
        }
        final c1<Integer> h = this.h;
        final ParentSizeModifier parentSizeModifier = (ParentSizeModifier)o;
        if (!e.a((Object)h, (Object)parentSizeModifier.h) || !e.a((Object)this.i, (Object)parentSizeModifier.i) || this.g != parentSizeModifier.g) {
            b = false;
        }
        return b;
    }
    
    public final w h(final x x, final u u, final long n) {
        e.f((Object)x, "$this$measure");
        final c1<Integer> h = this.h;
        int n2;
        if (h != null && ((Number)h.getValue()).intValue() != Integer.MAX_VALUE) {
            n2 = p7.a.W(((Number)this.h.getValue()).floatValue() * this.g);
        }
        else {
            n2 = Integer.MAX_VALUE;
        }
        final c1<Integer> i = this.i;
        int n3;
        if (i != null && ((Number)i.getValue()).intValue() != Integer.MAX_VALUE) {
            n3 = p7.a.W(((Number)this.i.getValue()).floatValue() * this.g);
        }
        else {
            n3 = Integer.MAX_VALUE;
        }
        int j;
        if (n2 != Integer.MAX_VALUE) {
            j = n2;
        }
        else {
            j = u2.a.j(n);
        }
        int k;
        if (n3 != Integer.MAX_VALUE) {
            k = n3;
        }
        else {
            k = u2.a.i(n);
        }
        if (n2 == Integer.MAX_VALUE) {
            n2 = u2.a.h(n);
        }
        if (n3 == Integer.MAX_VALUE) {
            n3 = u2.a.g(n);
        }
        final h0 s0 = u.s0(cg.d.G(j, n2, k, n3));
        return x.N0(x, s0.f, s0.g, (l)new ParentSizeModifier$measure.ParentSizeModifier$measure$1(s0));
    }
    
    public final int hashCode() {
        final c1<Integer> h = this.h;
        int hashCode = 0;
        int hashCode2;
        if (h != null) {
            hashCode2 = h.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final c1<Integer> i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return Float.hashCode(this.g) + (hashCode2 * 31 + hashCode) * 31;
    }
}
