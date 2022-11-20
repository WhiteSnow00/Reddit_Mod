// 
// Decompiled by Procyon v0.6.0
// 

package qe;

import cg.j;
import rd.a;
import mg.d0;

public final class w5 implements Runnable
{
    public final l7 f;
    public final boolean g;
    public final f7 h;
    public final g6 i;
    
    public w5(final g6 i, final l7 f, final boolean g, final f7 h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        final g6 i = this.i;
        final y2 k = i.k;
        if (k == null) {
            ((j4)((j)i).g).c().m.a("Discarding data. Failed to set user property");
            return;
        }
        d0.y((Object)this.f);
        final g6 j = this.i;
        Object h;
        if (this.g) {
            h = null;
        }
        else {
            h = this.h;
        }
        j.w(k, (a)h, this.f);
        this.i.D();
    }
}
