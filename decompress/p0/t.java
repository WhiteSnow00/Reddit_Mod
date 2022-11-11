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
import c2.d0;
import androidx.compose.ui.platform.o0;

public final class t extends o0 implements d0
{
    public final float g;
    public final boolean h;
    
    public t(final float g, final boolean h, final l<? super n0, j> l) {
        e.f((Object)l, "inspectorInfo");
        super(l);
        this.g = g;
        this.h = h;
    }
    
    public final Object B0(final u u, Object o) {
        e.f((Object)u, "<this>");
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
        final StringBuilder r = a.r("LayoutWeightImpl(weight=");
        r.append(this.g);
        r.append(", fill=");
        return g7.m(r, this.h, ')');
    }
}
