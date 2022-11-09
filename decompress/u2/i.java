// 
// Decompiled by Procyon v0.6.0
// 

package u2;

public final class i
{
    public final long a = a;
    
    static {
        new a();
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static final int b(final long n) {
        return (int)(n & 0xFFFFFFFFL);
    }
    
    public static String c(final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append((int)(n >> 32));
        sb.append(" x ");
        sb.append(b(n));
        return sb.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof i;
        boolean b2 = false;
        if (b) {
            if (a == ((i)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return c(this.a);
    }
    
    public static final class a
    {
    }
}
