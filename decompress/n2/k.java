// 
// Decompiled by Procyon v0.6.0
// 

package n2;

public final class k
{
    public final int a = a;
    
    public static String a(final int n) {
        final int n2 = 0;
        String s;
        if (n == 0) {
            s = "Normal";
        }
        else {
            int n3 = n2;
            if (n == 1) {
                n3 = 1;
            }
            if (n3 != 0) {
                s = "Italic";
            }
            else {
                s = "Invalid";
            }
        }
        return s;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
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
        return Integer.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return a(this.a);
    }
}
