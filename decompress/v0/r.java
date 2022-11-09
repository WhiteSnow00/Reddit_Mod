// 
// Decompiled by Procyon v0.6.0
// 

package v0;

import yd.a;
import n1.c;
import n1.d;
import ah2.f;
import c2.l;
import i2.n;

public final class r
{
    public final n a;
    public l b;
    public l c;
    
    public r(final n a) {
        f.f((Object)a, "value");
        this.a = a;
    }
    
    public final long a(final long n) {
        final l b = this.b;
        d e = null;
        Label_0069: {
            if (b != null) {
                final boolean attached = b.isAttached();
                d d = null;
                if (attached) {
                    final l c = this.c;
                    if (c != null) {
                        d = c.B(b, true);
                    }
                }
                else {
                    d = n1.d.e;
                }
                if ((e = d) != null) {
                    break Label_0069;
                }
            }
            e = d.e;
        }
        final float c2 = n1.c.c(n);
        float n2 = e.a;
        if (c2 >= n2) {
            final float c3 = n1.c.c(n);
            n2 = e.c;
            if (c3 <= n2) {
                n2 = n1.c.c(n);
            }
        }
        final float d2 = n1.c.d(n);
        float n3 = e.b;
        if (d2 >= n3) {
            final float d3 = n1.c.d(n);
            n3 = e.d;
            if (d3 <= n3) {
                n3 = n1.c.d(n);
            }
        }
        return yd.a.y0(n2, n3);
    }
    
    public final int b(long c, final boolean b) {
        long a = c;
        if (b) {
            a = this.a(c);
        }
        c = this.c(a);
        return this.a.l(c);
    }
    
    public final long c(final long n) {
        final l b = this.b;
        long a = n;
        if (b != null) {
            final l c = this.c;
            c c2;
            if (c != null) {
                long y;
                if (b.isAttached() && c.isAttached()) {
                    y = b.y(c, n);
                }
                else {
                    y = n;
                }
                c2 = new c(y);
            }
            else {
                c2 = null;
            }
            a = n;
            if (c2 != null) {
                a = c2.a;
            }
        }
        return a;
    }
}
