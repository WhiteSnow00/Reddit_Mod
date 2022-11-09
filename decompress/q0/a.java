// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import c2.u;
import ah2.f;
import pg2.j;
import androidx.compose.ui.platform.p0;
import zg2.l;
import u2.g;
import l0.s;
import c2.d0;
import androidx.compose.ui.platform.q0;

public final class a extends q0 implements d0
{
    public final s<g> g;
    
    public a(final s<g> g, final l<? super p0, j> l) {
        f.f((Object)g, "animationSpec");
        f.f((Object)l, "inspectorInfo");
        super((l)l);
        this.g = g;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a && (f.a((Object)this.g, (Object)((a)o).g) ^ true));
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
    
    public final Object y0(final u u, final Object o) {
        f.f((Object)u, "<this>");
        return this.g;
    }
}
