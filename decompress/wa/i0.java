// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import bd.c0;
import ah0.b;

public final class i0
{
    public static final i0 c;
    public final long a;
    public final long b;
    
    static {
        final i0 c2 = new i0(0L, 0L);
        new i0(Long.MAX_VALUE, Long.MAX_VALUE);
        new i0(Long.MAX_VALUE, 0L);
        new i0(0L, Long.MAX_VALUE);
        c = c2;
    }
    
    public i0(final long a, final long b) {
        final boolean b2 = true;
        ah0.b.C(a >= 0L);
        ah0.b.C(b >= 0L && b2);
        this.a = a;
        this.b = b;
    }
    
    public final long a(final long n, final long n2, final long n3) {
        final long a = this.a;
        if (a == 0L && this.b == 0L) {
            return n;
        }
        long n4 = Long.MIN_VALUE;
        final int a2 = c0.a;
        final long n5 = n - a;
        if (((a ^ n) & (n ^ n5)) >= 0L) {
            n4 = n5;
        }
        final long b = this.b;
        long n7;
        final long n6 = n7 = n + b;
        if (((b ^ n6) & (n ^ n6)) < 0L) {
            n7 = Long.MAX_VALUE;
        }
        boolean b2 = true;
        final boolean b3 = n4 <= n2 && n2 <= n7;
        if (n4 > n3 || n3 > n7) {
            b2 = false;
        }
        if (b3 && b2) {
            if (Math.abs(n2 - n) <= Math.abs(n3 - n)) {
                return n2;
            }
            return n3;
        }
        else {
            if (b3) {
                return n2;
            }
            if (b2) {
                return n3;
            }
            return n4;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && i0.class == o.getClass()) {
            final i0 i0 = (i0)o;
            if (this.a != i0.a || this.b != i0.b) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (int)this.a * 31 + (int)this.b;
    }
}
