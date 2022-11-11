// 
// Decompiled by Procyon v0.6.0
// 

package o1;

public final class c0
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof c0;
        boolean b2 = false;
        if (b) {
            if (a == ((c0)o).a) {
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
        final int a = this.a;
        final int n = 0;
        String s;
        if (a == 0) {
            s = "NonZero";
        }
        else {
            int n2 = n;
            if (a == 1) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "EvenOdd";
            }
            else {
                s = "Unknown";
            }
        }
        return s;
    }
}
