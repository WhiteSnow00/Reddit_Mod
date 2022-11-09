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
import j1.a;
import c2.d0;
import androidx.compose.ui.platform.q0;

public final class d extends q0 implements d0
{
    public a g;
    public boolean h;
    
    public d(final a g, final boolean h, final l<? super p0, j> l) {
        f.f((Object)g, "alignment");
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
        d d;
        if (o instanceof d) {
            d = (d)o;
        }
        else {
            d = null;
        }
        if (d == null) {
            return false;
        }
        if (!f.a((Object)this.g, (Object)d.g) || this.h != d.h) {
            b = false;
        }
        return b;
    }
    
    public final int hashCode() {
        return Boolean.hashCode(this.h) + this.g.hashCode() * 31;
    }
    
    public final String toString() {
        final StringBuilder k = a.k("BoxChildData(alignment=");
        k.append(this.g);
        k.append(", matchParentSize=");
        return s0.o(k, this.h, ')');
    }
    
    public final Object y0(final u u, final Object o) {
        f.f((Object)u, "<this>");
        return this;
    }
}
