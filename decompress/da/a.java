// 
// Decompiled by Procyon v0.6.0
// 

package da;

import u2.l;
import n1.c;

public final class a implements y1.a
{
    public final boolean f;
    public final boolean g;
    
    public a(final boolean f, final boolean g) {
        this.f = f;
        this.g = g;
    }
    
    public final long b(int e, long n, final long n2) {
        if (e == 2) {
            e = 1;
        }
        else {
            e = 0;
        }
        if (e != 0) {
            final boolean f = this.f;
            final boolean g = this.g;
            float d = 0.0f;
            float c;
            if (f) {
                c = n1.c.c(n2);
            }
            else {
                c = 0.0f;
            }
            if (g) {
                d = n1.c.d(n2);
            }
            n = wd.a.f(c, d);
        }
        else {
            e = c.e;
            n = c.b;
        }
        return n;
    }
    
    public final Object d(final long n, final long n2, final lg2.c<? super l> c) {
        final boolean f = this.f;
        final boolean g = this.g;
        float c2 = 0.0f;
        float b;
        if (f) {
            b = l.b(n2);
        }
        else {
            b = 0.0f;
        }
        if (g) {
            c2 = l.c(n2);
        }
        return new l(vl.a.i(b, c2));
    }
}
