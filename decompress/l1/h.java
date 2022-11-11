// 
// Decompiled by Procyon v0.6.0
// 

package l1;

import sg2.e;
import androidx.compose.ui.platform.n0;
import hg2.j;
import q1.c;
import rg2.l;
import androidx.compose.ui.platform.o0;

public final class h extends o0 implements f
{
    public final l<c, j> g;
    
    public h(final l<? super c, j> g, final l<? super n0, j> l) {
        e.f((Object)g, "onDraw");
        e.f((Object)l, "inspectorInfo");
        super(l);
        this.g = (l<c, j>)g;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof h && e.a((Object)this.g, (Object)((h)o).g));
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
    
    public final void n0(final e2.f f) {
        this.g.invoke((c)f);
    }
}
