// 
// Decompiled by Procyon v0.6.0
// 

package hg2;

import sg2.e;
import lw0.b;

public final class i implements Comparable<i>
{
    public final long f = f;
    
    public static int a(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    @Override
    public final int compareTo(final Object o) {
        final long n = lcmp(this.f ^ Long.MIN_VALUE, ((i)o).f ^ Long.MIN_VALUE);
        int n2;
        if (n < 0) {
            n2 = -1;
        }
        else if (n == 0) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        return n2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long f = this.f;
        final boolean b = o instanceof i;
        boolean b2 = false;
        if (b) {
            if (f == ((i)o).f) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return a(this.f);
    }
    
    @Override
    public final String toString() {
        final long f = this.f;
        String s;
        if (f >= 0L) {
            b.T(10);
            s = Long.toString(f, 10);
            e.e((Object)s, "toString(this, checkRadix(radix))");
        }
        else {
            final long n = 10;
            final long n2 = (f >>> 1) / n << 1;
            long n4;
            final long n3 = n4 = f - n2 * n;
            long n5 = n2;
            if (n3 >= n) {
                n4 = n3 - n;
                n5 = n2 + 1L;
            }
            final StringBuilder sb = new StringBuilder();
            b.T(10);
            final String string = Long.toString(n5, 10);
            e.e((Object)string, "toString(this, checkRadix(radix))");
            sb.append(string);
            b.T(10);
            final String string2 = Long.toString(n4, 10);
            e.e((Object)string2, "toString(this, checkRadix(radix))");
            sb.append(string2);
            s = sb.toString();
        }
        return s;
    }
}
