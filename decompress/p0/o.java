// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import c2.u;
import ah2.f;
import zg2.l;
import j1.b;
import j1.a$b;
import c2.d0;
import androidx.compose.ui.platform.q0;

public final class o extends q0 implements d0
{
    public final a$b g;
    
    public o(final j1.b.a g, final l l) {
        f.f((Object)l, "inspectorInfo");
        super(l);
        this.g = (a$b)g;
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
        return o2 != null && f.a((Object)this.g, (Object)o2.g);
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
    
    public final String toString() {
        final StringBuilder k = a.k("HorizontalAlignModifier(horizontal=");
        k.append(this.g);
        k.append(')');
        return k.toString();
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
        final int a = k.a;
        final a$b g = this.g;
        f.f((Object)g, "horizontal");
        ((b0)o).c = (k)new k$d(g);
        return o;
    }
}
