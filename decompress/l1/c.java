// 
// Decompiled by Procyon v0.6.0
// 

package l1;

import androidx.compose.ui.platform.n0;
import hg2.j;
import q1.e;
import rg2.l;
import androidx.compose.ui.platform.o0;

public final class c extends o0 implements f
{
    public final l<e, j> g;
    
    public c(final l<? super e, j> g, final l<? super n0, j> l) {
        sg2.e.f((Object)g, "onDraw");
        sg2.e.f((Object)l, "inspectorInfo");
        super(l);
        this.g = (l<e, j>)g;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c && sg2.e.a((Object)this.g, (Object)((c)o).g));
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
    
    public final void n0(final e2.f f) {
        this.g.invoke((e)f);
        f.g0();
    }
}
