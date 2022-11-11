// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import u2.b;
import c2.e0;
import rg2.l;
import sg2.e;
import c2.t;
import c2.r;
import c2.u;
import u2.f;
import androidx.compose.ui.layout.a;

public final class MinimumTouchTargetModifier implements a
{
    public final long f;
    
    public MinimumTouchTargetModifier(final long f) {
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        MinimumTouchTargetModifier minimumTouchTargetModifier;
        if (o instanceof MinimumTouchTargetModifier) {
            minimumTouchTargetModifier = (MinimumTouchTargetModifier)o;
        }
        else {
            minimumTouchTargetModifier = null;
        }
        boolean b = false;
        if (minimumTouchTargetModifier == null) {
            return false;
        }
        final long f = this.f;
        final long f2 = minimumTouchTargetModifier.f;
        final int d = u2.f.d;
        if (f == f2) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        final long f = this.f;
        final int d = u2.f.d;
        return Long.hashCode(f);
    }
    
    public final t v(final u u, final r r, final long n) {
        e.f((Object)u, "$this$measure");
        e.f((Object)r, "measurable");
        final e0 h = r.H(n);
        final int max = Math.max(h.f, ((b)u).w0(u2.f.b(this.f)));
        final int max2 = Math.max(h.g, ((b)u).w0(u2.f.a(this.f)));
        return u.U(u, max, max2, (l)new MinimumTouchTargetModifier$measure.MinimumTouchTargetModifier$measure$1(max, h, max2));
    }
}
