// 
// Decompiled by Procyon v0.6.0
// 

package v1;

public final class a
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
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
        return Integer.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int n = 0;
        String s;
        if (a == 1) {
            s = "Touch";
        }
        else {
            int n2 = n;
            if (a == 2) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "Keyboard";
            }
            else {
                s = "Error";
            }
        }
        return s;
    }
}
