// 
// Decompiled by Procyon v0.6.0
// 

package p1;

public final class b
{
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final int e = 0;
    
    static {
        final long n = 3;
        final long n2 = n << 32;
        a = (((long)0 & 0xFFFFFFFFL) | n2);
        b = (((long)1 & 0xFFFFFFFFL) | n2);
        c = (n2 | ((long)2 & 0xFFFFFFFFL));
        d = ((n & 0xFFFFFFFFL) | (long)4 << 32);
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static String b(final long n) {
        String s;
        if (a(n, p1.b.a)) {
            s = "Rgb";
        }
        else if (a(n, p1.b.b)) {
            s = "Xyz";
        }
        else if (a(n, p1.b.c)) {
            s = "Lab";
        }
        else if (a(n, p1.b.d)) {
            s = "Cmyk";
        }
        else {
            s = "Unknown";
        }
        return s;
    }
}
