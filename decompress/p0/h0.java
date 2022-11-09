// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import c2.u;
import ah2.f;
import zg2.l;
import j1.b;
import j1.a$c;
import c2.d0;
import androidx.compose.ui.platform.q0;

public final class h0 extends q0 implements d0
{
    public final a$c g;
    
    public h0(final j1.b.b g, final l l) {
        f.f((Object)l, "inspectorInfo");
        super(l);
        this.g = (a$c)g;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        h0 h0;
        if (o instanceof h0) {
            h0 = (h0)o;
        }
        else {
            h0 = null;
        }
        return h0 != null && f.a((Object)this.g, (Object)h0.g);
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
    
    public final String toString() {
        final StringBuilder k = a.k("VerticalAlignModifier(vertical=");
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
        final a$c g = this.g;
        f.f((Object)g, "vertical");
        ((b0)o).c = (k)new k$f(g);
        return o;
    }
}
