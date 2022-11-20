// 
// Decompiled by Procyon v0.6.0
// 

package qe;

import cg.j;
import mg.d0;

public final class w implements Runnable
{
    public final String f;
    public final long g;
    public final o1 h;
    
    public w(final o1 h, final String f, final long g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final o1 h = this.h;
        final String f = this.f;
        final long g = this.g;
        ((p2)h).t();
        d0.v(f);
        final Integer n = (Integer)h.j.getOrDefault((Object)f, (Object)null);
        if (n != null) {
            final p5 z = ((j4)((j)h).g).v().z(false);
            final int n2 = n - 1;
            if (n2 == 0) {
                h.j.remove((Object)f);
                final Long n3 = (Long)h.i.getOrDefault((Object)f, (Object)null);
                if (n3 == null) {
                    ((j4)((j)h).g).c().m.a("First ad unit exposure time was never set");
                }
                else {
                    final long longValue = n3;
                    h.i.remove((Object)f);
                    h.y(f, g - longValue, z);
                }
                if (h.j.isEmpty()) {
                    final long k = h.k;
                    if (k == 0L) {
                        ((j4)((j)h).g).c().m.a("First ad exposure time was never set");
                    }
                    else {
                        h.x(g - k, z);
                        h.k = 0L;
                    }
                }
            }
            else {
                h.j.put((Object)f, (Object)n2);
            }
        }
        else {
            ((j4)((j)h).g).c().m.b((Object)f, "Call to endAdUnitExposure for unknown ad unit id");
        }
    }
}
