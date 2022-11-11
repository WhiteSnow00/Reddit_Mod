// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import c2.u;
import sg2.e;
import hg2.j;
import androidx.compose.ui.platform.n0;
import rg2.l;
import u2.g;
import l0.s;
import c2.d0;
import androidx.compose.ui.platform.o0;

public final class a extends o0 implements d0
{
    public final s<g> g;
    
    public a(final s<g> g, final l<? super n0, j> l) {
        e.f((Object)g, "animationSpec");
        e.f((Object)l, "inspectorInfo");
        super(l);
        this.g = g;
    }
    
    public final Object B0(final u u, final Object o) {
        e.f((Object)u, "<this>");
        return this.g;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a && (e.a((Object)this.g, (Object)((a)o).g) ^ true));
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
}
