// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import lw0.b;

public final class w implements Runnable
{
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;
    public final /* synthetic */ k1 h;
    
    public w(final k1 h, final String f, final long g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final k1 h = this.h;
        final String f = this.f;
        final long g = this.g;
        h.M();
        b.O(f);
        final Integer n = (Integer)h.h.getOrDefault((Object)f, (Object)null);
        if (n != null) {
            final u5 t = ((h4)h.f).u().T(false);
            final int n2 = n - 1;
            if (n2 == 0) {
                h.h.remove((Object)f);
                final Long n3 = (Long)h.g.getOrDefault((Object)f, (Object)null);
                if (n3 == null) {
                    ((h4)h.f).h().k.a("First ad unit exposure time was never set");
                }
                else {
                    final long longValue = n3;
                    h.g.remove((Object)f);
                    h.R(f, g - longValue, t);
                }
                if (h.h.isEmpty()) {
                    final long i = h.i;
                    if (i == 0L) {
                        ((h4)h.f).h().k.a("First ad exposure time was never set");
                    }
                    else {
                        h.Q(g - i, t);
                        h.i = 0L;
                    }
                }
            }
            else {
                h.h.put((Object)f, (Object)n2);
            }
        }
        else {
            ((h4)h.f).h().k.b((Object)f, "Call to endAdUnitExposure for unknown ad unit id");
        }
    }
}
