// 
// Decompiled by Procyon v0.6.0
// 

package t2;

public final class i
{
    public final int a = a;
    
    public static String a(final int n) {
        final int n2 = 0;
        String s;
        if (n == 1) {
            s = "Clip";
        }
        else if (n == 2) {
            s = "Ellipsis";
        }
        else {
            int n3 = n2;
            if (n == 3) {
                n3 = 1;
            }
            if (n3 != 0) {
                s = "Visible";
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
        return Integer.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return a(this.a);
    }
}
