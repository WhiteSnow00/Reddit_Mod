// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import sg2.e;
import lw0.b;
import java.util.List;

public final class m implements Comparable<m>
{
    public static final m g;
    public static final m h;
    public static final m i;
    public static final m j;
    public static final m k;
    public static final m l;
    public static final m m;
    public static final m n;
    public static final m o;
    public static final m p;
    public static final m q;
    public static final List<m> r;
    public final int f;
    
    static {
        final m m2 = new m(100);
        final m m3 = new m(200);
        final m l2 = new m(300);
        final m m4 = g = new m(400);
        final m n2 = h = new m(500);
        final m o2 = i = new m(600);
        final m p2 = j = new m(700);
        final m q2 = k = new m(800);
        final m m5 = new m(900);
        l = l2;
        m = m4;
        n = n2;
        o = o2;
        p = p2;
        q = q2;
        r = b.s1((Object[])new m[] { m2, m3, l2, m4, n2, o2, p2, q2, m5 });
    }
    
    public m(final int f) {
        this.f = f;
        int n = 0;
        if (1 <= f) {
            n = n;
            if (f < 1001) {
                n = 1;
            }
        }
        if (n != 0) {
            return;
        }
        throw new IllegalArgumentException(d.h("Font weight can be in range [1, 1000]. Current value: ", f).toString());
    }
    
    public final int a(final m m) {
        e.f((Object)m, "other");
        return e.h(this.f, m.f);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof m && this.f == ((m)o).f);
    }
    
    @Override
    public final int hashCode() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return d.l(a.r("FontWeight(weight="), this.f, ')');
    }
}
