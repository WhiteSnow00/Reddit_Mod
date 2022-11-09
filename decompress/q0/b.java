// 
// Decompiled by Procyon v0.6.0
// 

package q0;

public final class b
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof b;
        boolean b2 = false;
        if (b) {
            if (a == ((b)o).a) {
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
        return a.g("DataIndex(value=", this.a, ')');
    }
}
