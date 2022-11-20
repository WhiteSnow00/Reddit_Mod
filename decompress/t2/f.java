// 
// Decompiled by Procyon v0.6.0
// 

package t2;

public final class f
{
    public final int a;
    
    public f(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof f;
        boolean b2 = false;
        if (b) {
            if (a == ((f)o).a) {
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
            s = "Left";
        }
        else if (a == 2) {
            s = "Right";
        }
        else if (a == 3) {
            s = "Center";
        }
        else if (a == 4) {
            s = "Justify";
        }
        else if (a == 5) {
            s = "Start";
        }
        else {
            int n2 = n;
            if (a == 6) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "End";
            }
            else {
                s = "Invalid";
            }
        }
        return s;
    }
}
