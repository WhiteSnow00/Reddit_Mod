// 
// Decompiled by Procyon v0.6.0
// 

package n9;

public final class a
{
    public int a;
    public long b;
    
    public a(final long b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public static a a(final String s, final int n, final int n2) {
        if (n >= n2) {
            return null;
        }
        long n3 = 0L;
        int i;
        for (i = n; i < n2; ++i) {
            final char char1 = s.charAt(i);
            if (char1 < '0' || char1 > '9') {
                break;
            }
            n3 = n3 * 10L + (char1 - '0');
            if (n3 > 2147483647L) {
                return null;
            }
        }
        if (i == n) {
            return null;
        }
        return new a(n3, i);
    }
}
