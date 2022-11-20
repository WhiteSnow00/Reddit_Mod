// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import u2.b;
import c2.h0;
import ng2.e;
import c2.w;
import c2.u;
import c2.x;
import u2.d;
import mg2.l;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.p0;

public final class PaddingModifier extends p0 implements a
{
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final boolean k;
    
    public PaddingModifier() {
        throw null;
    }
    
    public PaddingModifier(final float g, final float h, final float i, final float j, final l l) {
        super(l);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        final boolean b = true;
        this.k = true;
        int n = 0;
        Label_0111: {
            if ((g >= 0.0f || u2.d.a(g, Float.NaN)) && (h >= 0.0f || u2.d.a(h, Float.NaN)) && (i >= 0.0f || u2.d.a(i, Float.NaN))) {
                n = (b ? 1 : 0);
                if (j >= 0.0f) {
                    break Label_0111;
                }
                if (u2.d.a(j, Float.NaN)) {
                    n = (b ? 1 : 0);
                    break Label_0111;
                }
            }
            n = 0;
        }
        if (n != 0) {
            return;
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }
    
    public final boolean equals(final Object o) {
        PaddingModifier paddingModifier;
        if (o instanceof PaddingModifier) {
            paddingModifier = (PaddingModifier)o;
        }
        else {
            paddingModifier = null;
        }
        final boolean b = false;
        if (paddingModifier == null) {
            return false;
        }
        boolean b2 = b;
        if (u2.d.a(this.g, paddingModifier.g)) {
            b2 = b;
            if (u2.d.a(this.h, paddingModifier.h)) {
                b2 = b;
                if (u2.d.a(this.i, paddingModifier.i)) {
                    b2 = b;
                    if (u2.d.a(this.j, paddingModifier.j)) {
                        b2 = b;
                        if (this.k == paddingModifier.k) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final w h(final x x, final u u, final long n) {
        e.f((Object)x, "$this$measure");
        final int n2 = ((u2.b)x).w0(this.i) + ((u2.b)x).w0(this.g);
        final int n3 = ((u2.b)x).w0(this.j) + ((u2.b)x).w0(this.h);
        final h0 s0 = u.s0(cg.d.v3(-n2, -n3, n));
        return x.N0(x, cg.d.s1(s0.f + n2, n), cg.d.q1(s0.g + n3, n), (l)new PaddingModifier$measure.PaddingModifier$measure$1(this, s0, x));
    }
    
    public final int hashCode() {
        return Boolean.hashCode(this.k) + aq2.a.b(this.j, aq2.a.b(this.i, aq2.a.b(this.h, Float.hashCode(this.g) * 31, 31), 31), 31);
    }
}
