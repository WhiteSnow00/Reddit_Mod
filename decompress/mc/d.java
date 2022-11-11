// 
// Decompiled by Procyon v0.6.0
// 

package mc;

import za.f;
import za.a;
import za.h;

public final class d extends j
{
    public final /* synthetic */ e j;
    
    public d(final e j) {
        this.j = j;
    }
    
    public final void t() {
        final e j = this.j;
        final Object b = ((h)j).b;
        monitorenter(b);
        final boolean b2 = false;
        try {
            ((a)this).f = 0;
            super.h = null;
            ((h)j).f[((h)j).h++] = (f)this;
            int n = b2 ? 1 : 0;
            if (!((h)j).c.isEmpty()) {
                n = (b2 ? 1 : 0);
                if (((h)j).h > 0) {
                    n = 1;
                }
            }
            if (n != 0) {
                ((h)j).b.notify();
            }
        }
        finally {
            monitorexit(b);
        }
    }
}
