// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import b5.k;
import c2.h0;
import ng2.e;
import c2.w;
import c2.u;
import c2.x;
import u2.d;
import mg2.l;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.p0;

public final class OffsetModifier extends p0 implements a
{
    public final float g;
    public final float h;
    public final boolean i;
    
    public OffsetModifier() {
        throw null;
    }
    
    public OffsetModifier(final float g, final float h, final boolean i, final l l) {
        super(l);
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        OffsetModifier offsetModifier;
        if (o instanceof OffsetModifier) {
            offsetModifier = (OffsetModifier)o;
        }
        else {
            offsetModifier = null;
        }
        if (offsetModifier == null) {
            return false;
        }
        if (!u2.d.a(this.g, offsetModifier.g) || !u2.d.a(this.h, offsetModifier.h) || this.i != offsetModifier.i) {
            b = false;
        }
        return b;
    }
    
    public final w h(final x x, final u u, final long n) {
        e.f((Object)x, "$this$measure");
        final h0 s0 = u.s0(n);
        return x.N0(x, s0.f, s0.g, (l)new OffsetModifier$measure.OffsetModifier$measure$1(this, s0, x));
    }
    
    public final int hashCode() {
        return Boolean.hashCode(this.i) + aq2.a.b(this.h, Float.hashCode(this.g) * 31, 31);
    }
    
    public final String toString() {
        final StringBuilder t = a.t("OffsetModifier(x=");
        k.s(this.g, t, ", y=");
        k.s(this.h, t, ", rtlAware=");
        return d.n(t, this.i, ')');
    }
}
