// 
// Decompiled by Procyon v0.6.0
// 

package r0;

import m5.a;

public final class x
{
    public final int a;
    
    public x(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof x;
        boolean b2 = false;
        if (b) {
            if (a == ((x)o).a) {
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
        return m5.a.d("LineIndex(value=", this.a, ')');
    }
}
