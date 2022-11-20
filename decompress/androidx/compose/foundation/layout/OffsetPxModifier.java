// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import c2.h0;
import c2.w;
import c2.u;
import c2.x;
import ng2.e;
import u2.g;
import u2.b;
import mg2.l;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.p0;

public final class OffsetPxModifier extends p0 implements a
{
    public final l<u2.b, g> g;
    public final boolean h;
    
    public OffsetPxModifier(final l g, final l l) {
        e.f((Object)g, "offset");
        e.f((Object)l, "inspectorInfo");
        super(l);
        this.g = (l<u2.b, g>)g;
        this.h = true;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        OffsetPxModifier offsetPxModifier;
        if (o instanceof OffsetPxModifier) {
            offsetPxModifier = (OffsetPxModifier)o;
        }
        else {
            offsetPxModifier = null;
        }
        if (offsetPxModifier == null) {
            return false;
        }
        if (!e.a((Object)this.g, (Object)offsetPxModifier.g) || this.h != offsetPxModifier.h) {
            b = false;
        }
        return b;
    }
    
    public final w h(final x x, final u u, final long n) {
        e.f((Object)x, "$this$measure");
        final h0 s0 = u.s0(n);
        return x.N0(x, s0.f, s0.g, (l)new OffsetPxModifier$measure.OffsetPxModifier$measure$1(this, x, s0));
    }
    
    public final int hashCode() {
        return Boolean.hashCode(this.h) + this.g.hashCode() * 31;
    }
    
    public final String toString() {
        final StringBuilder t = a.t("OffsetPxModifier(offset=");
        t.append(this.g);
        t.append(", rtlAware=");
        return d.n(t, this.h, ')');
    }
}
