// 
// Decompiled by Procyon v0.6.0
// 

package o2;

public final class i
{
    public final int a = a;
    
    public static String a(final int n) {
        final int n2 = 0;
        String s;
        if (n == 0) {
            s = "None";
        }
        else if (n == 1) {
            s = "Default";
        }
        else if (n == 2) {
            s = "Go";
        }
        else if (n == 3) {
            s = "Search";
        }
        else if (n == 4) {
            s = "Send";
        }
        else if (n == 5) {
            s = "Previous";
        }
        else if (n == 6) {
            s = "Next";
        }
        else {
            int n3 = n2;
            if (n == 7) {
                n3 = 1;
            }
            if (n3 != 0) {
                s = "Done";
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
