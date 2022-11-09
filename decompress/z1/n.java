// 
// Decompiled by Procyon v0.6.0
// 

package z1;

public final class n
{
    public final long a = a;
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static String b(final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PointerId(value=");
        sb.append(n);
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof n;
        boolean b2 = false;
        if (b) {
            if (a == ((n)o).a) {
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
        return b(this.a);
    }
}
