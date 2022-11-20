// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import bd.r;

public final class k implements a
{
    public final l a;
    
    public k(final l a) {
        this.a = a;
    }
    
    @Override
    public final void a(int i) {
        final l a = this.a;
        synchronized (a) {
            final int j = a.i;
            if (j != 0 && !a.e) {
                monitorexit(a);
            }
            else if (j == i) {
                monitorexit(a);
            }
            else {
                a.i = i;
                if (i != 1 && i != 0 && i != 8) {
                    a.l = a.i(i);
                    final long d = a.d.d();
                    if (a.f > 0) {
                        i = (int)(d - a.g);
                    }
                    else {
                        i = 0;
                    }
                    a.k(i, a.h, a.l);
                    a.g = d;
                    a.h = 0L;
                    a.k = 0L;
                    a.j = 0L;
                    final q c = a.c;
                    c.b.clear();
                    c.d = -1;
                    c.e = 0;
                    c.f = 0;
                    monitorexit(a);
                }
            }
        }
    }
}
