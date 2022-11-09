// 
// Decompiled by Procyon v0.6.0
// 

package l1;

import androidx.compose.ui.platform.p0;
import pg2.j;
import q1.e;
import zg2.l;
import androidx.compose.ui.platform.q0;

public final class c extends q0 implements f
{
    public final l<e, j> g;
    
    public c(final l<? super e, j> g, final l<? super p0, j> l) {
        ah2.f.f((Object)g, "onDraw");
        ah2.f.f((Object)l, "inspectorInfo");
        super((l)l);
        this.g = (l<e, j>)g;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c && ah2.f.a((Object)this.g, (Object)((c)o).g));
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
    
    public final void k0(final e2.f f) {
        this.g.invoke((Object)f);
        f.c0();
    }
}
