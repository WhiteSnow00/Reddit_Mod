// 
// Decompiled by Procyon v0.6.0
// 

package u2;

public final class k
{
    public final long a = a;
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof k;
        boolean b2 = false;
        if (b) {
            if (a == ((k)o).a) {
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
        final long a = this.a;
        String s;
        if (a(a, 0L)) {
            s = "Unspecified";
        }
        else if (a(a, 4294967296L)) {
            s = "Sp";
        }
        else if (a(a, 8589934592L)) {
            s = "Em";
        }
        else {
            s = "Invalid";
        }
        return s;
    }
}
