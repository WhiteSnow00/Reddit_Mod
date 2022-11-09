// 
// Decompiled by Procyon v0.6.0
// 

package nc;

import ab.a;

public final class d extends j
{
    public final /* synthetic */ e j;
    
    public d(final e j) {
        this.j = j;
    }
    
    public final void p() {
        final e j = this.j;
        final Object b = j.b;
        monitorenter(b);
        final boolean b2 = false;
        try {
            ((a)this).f = 0;
            super.h = null;
            j.f[j.h++] = this;
            int n = b2 ? 1 : 0;
            if (!j.c.isEmpty()) {
                n = (b2 ? 1 : 0);
                if (j.h > 0) {
                    n = 1;
                }
            }
            if (n != 0) {
                j.b.notify();
            }
        }
        finally {
            monitorexit(b);
        }
    }
}
