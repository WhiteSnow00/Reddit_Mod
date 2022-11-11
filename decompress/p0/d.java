// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import al0.g7;
import c2.u;
import sg2.e;
import hg2.j;
import androidx.compose.ui.platform.n0;
import rg2.l;
import j1.a;
import c2.d0;
import androidx.compose.ui.platform.o0;

public final class d extends o0 implements d0
{
    public a g;
    public boolean h;
    
    public d(final a g, final boolean h, final l<? super n0, j> l) {
        e.f((Object)g, "alignment");
        e.f((Object)l, "inspectorInfo");
        super(l);
        this.g = g;
        this.h = h;
    }
    
    public final Object B0(final u u, final Object o) {
        e.f((Object)u, "<this>");
        return this;
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
        if (!e.a((Object)this.g, (Object)d.g) || this.h != d.h) {
            b = false;
        }
        return b;
    }
    
    public final int hashCode() {
        return Boolean.hashCode(this.h) + this.g.hashCode() * 31;
    }
    
    public final String toString() {
        final StringBuilder r = a.r("BoxChildData(alignment=");
        r.append(this.g);
        r.append(", matchParentSize=");
        return g7.m(r, this.h, ')');
    }
}
