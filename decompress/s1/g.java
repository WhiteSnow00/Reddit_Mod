// 
// Decompiled by Procyon v0.6.0
// 

package s1;

import sg2.e;
import z0.a;

public final class g extends a<f>
{
    public g(final b b) {
        e.f((Object)b, "root");
        super((Object)b);
    }
    
    public static b j(final f f) {
        if (f instanceof b) {
            return (b)f;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }
    
    public final void a(final int n, final int n2) {
        j((f)super.c).e(n, n2);
    }
    
    public final void c(final int n, int n2, final int n3) {
        final b j = j((f)super.c);
        int i = 0;
        final int n4 = 0;
        if (n > n2) {
            for (int k = n4; k < n3; ++k) {
                final f f = j.c.get(n);
                j.c.remove(n);
                j.c.add(n2, f);
                ++n2;
            }
        }
        else {
            while (i < n3) {
                final f f2 = j.c.get(n);
                j.c.remove(n);
                j.c.add(n2 - 1, f2);
                ++i;
            }
        }
        j.c();
    }
    
    public final void d(final int n, final Object o) {
        final f f = (f)o;
        e.f((Object)f, "instance");
        final b j = j((f)super.c);
        j.getClass();
        if (n < j.c.size()) {
            j.c.set(n, f);
        }
        else {
            j.c.add(f);
        }
        f.d(j.h);
        j.c();
    }
    
    public final void f(final int n, final Object o) {
        e.f((Object)o, "instance");
    }
    
    public final void i() {
        final b j = j((f)super.a);
        j.e(0, j.c.size());
    }
}
