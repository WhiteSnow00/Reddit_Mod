// 
// Decompiled by Procyon v0.6.0
// 

package n1;

public final class a
{
    public static final long b;
    public final long a = a;
    
    static {
        b = at1.a.g(0.0f, 0.0f);
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static final float b(final long n) {
        return Float.intBitsToFloat((int)(n >> 32));
    }
    
    public static final float c(final long n) {
        return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
    }
    
    public static String d(final long n) {
        String s;
        if (b(n) == c(n)) {
            final StringBuilder k = a.k("CornerRadius.circular(");
            k.append(a80.a.M0(b(n)));
            k.append(')');
            s = k.toString();
        }
        else {
            final StringBuilder i = a.k("CornerRadius.elliptical(");
            i.append(a80.a.M0(b(n)));
            i.append(", ");
            i.append(a80.a.M0(c(n)));
            i.append(')');
            s = i.toString();
        }
        return s;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof a;
        boolean b2 = false;
        if (b) {
            if (a == ((a)o).a) {
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
        return d(this.a);
    }
}
