// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import c2.u;
import hg2.j;
import androidx.compose.ui.platform.n0;
import sg2.e;
import rg2.l;
import j1.b;
import j1.a$b;
import c2.d0;
import androidx.compose.ui.platform.o0;

public final class o extends o0 implements d0
{
    public final a$b g;
    
    public o(final b.a g, final l l) {
        e.f((Object)l, "inspectorInfo");
        super(l);
        this.g = (a$b)g;
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
        final int a = k.a;
        final a$b g = this.g;
        e.f((Object)g, "horizontal");
        ((b0)o).c = (k)new k$d(g);
        return o;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        o o2;
        if (o instanceof o) {
            o2 = (o)o;
        }
        else {
            o2 = null;
        }
        return o2 != null && e.a((Object)this.g, (Object)o2.g);
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
    
    public final String toString() {
        final StringBuilder r = a.r("HorizontalAlignModifier(horizontal=");
        r.append(this.g);
        r.append(')');
        return r.toString();
    }
}
