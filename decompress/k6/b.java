// 
// Decompiled by Procyon v0.6.0
// 

package k6;

import l6.q;
import java.util.Collection;
import l6.t;
import androidx.work.impl.foreground.a;
import androidx.work.impl.WorkDatabase;

public final class b implements Runnable
{
    public final /* synthetic */ WorkDatabase f;
    public final /* synthetic */ String g;
    public final /* synthetic */ a h;
    
    public b(final a h, final WorkDatabase f, final String g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final q k = ((t)this.f.x()).k(this.g);
        if (k != null && k.b()) {
            synchronized (this.h.i) {
                this.h.l.put(this.g, k);
                this.h.m.add(k);
                final a h = this.h;
                h.n.b((Collection)h.m);
            }
        }
    }
}
