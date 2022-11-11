// 
// Decompiled by Procyon v0.6.0
// 

package h2;

public final class g
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof g;
        boolean b2 = false;
        if (b) {
            if (a == ((g)o).a) {
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
            s = "Button";
        }
        else if (a == 1) {
            s = "Checkbox";
        }
        else if (a == 2) {
            s = "Switch";
        }
        else if (a == 3) {
            s = "RadioButton";
        }
        else if (a == 4) {
            s = "Tab";
        }
        else {
            int n2 = n;
            if (a == 5) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "Image";
            }
            else {
                s = "Unknown";
            }
        }
        return s;
    }
}
