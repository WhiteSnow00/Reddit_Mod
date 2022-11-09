// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import c2.u;
import androidx.appcompat.widget.s0;
import ah2.f;
import pg2.j;
import androidx.compose.ui.platform.p0;
import zg2.l;
import c2.d0;
import androidx.compose.ui.platform.q0;

public final class t extends q0 implements d0
{
    public final float g;
    public final boolean h;
    
    public t(final float g, final boolean h, final l<? super p0, j> l) {
        f.f((Object)l, "inspectorInfo");
        super((l)l);
        this.g = g;
        this.h = h;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        t t;
        if (o instanceof t) {
            t = (t)o;
        }
        else {
            t = null;
        }
        if (t == null) {
            return false;
        }
        if (this.g != t.g || this.h != t.h) {
            b = false;
        }
        return b;
    }
    
    public final int hashCode() {
        return Boolean.hashCode(this.h) + Float.hashCode(this.g) * 31;
    }
    
    public final String toString() {
        final StringBuilder k = a.k("LayoutWeightImpl(weight=");
        k.append(this.g);
        k.append(", fill=");
        return s0.o(k, this.h, ')');
    }
    
    public final Object y0(final u u, Object o) {
        f.f((Object)u, "<this>");
        b0 b0;
        if (o instanceof b0) {
            b0 = (b0)o;
        }
        else {
            b0 = null;
        }
        o = b0;
        if (b0 == null) {
            o = new b0(0);
        }
        ((b0)o).a = this.g;
        ((b0)o).b = this.h;
        return o;
    }
}
