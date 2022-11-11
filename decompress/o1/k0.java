// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import hg2.i;
import n1.c;
import aa1.a;

public final class k0
{
    public static final k0 d;
    public final long a;
    public final long b;
    public final float c;
    
    static {
        d = new k0(0L, 0.0f, 7);
    }
    
    public k0(long e, float n, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            e = aa1.a.e(4278190080L);
        }
        long b;
        if ((n2 & 0x2) != 0x0) {
            b = n1.c.b;
        }
        else {
            b = 0L;
        }
        if ((n2 & 0x4) != 0x0) {
            n = 0.0f;
        }
        this(e, b, n);
    }
    
    public k0(final long a, final long b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k0)) {
            return false;
        }
        final long a = this.a;
        final k0 k0 = (k0)o;
        return r.c(a, k0.a) && n1.c.a(this.b, k0.b) && this.c == k0.c;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int m = r.m;
        final int a2 = i.a(a);
        final long b = this.b;
        final int e = n1.c.e;
        return Float.hashCode(this.c) + b.b(b, a2 * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Shadow(color=");
        android.support.v4.media.a.q(this.a, r, ", offset=");
        r.append((Object)n1.c.h(this.b));
        r.append(", blurRadius=");
        return b.h(r, this.c, ')');
    }
}
