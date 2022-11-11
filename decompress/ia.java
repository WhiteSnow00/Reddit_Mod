// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import a40.f;
import dg.d;
import java.util.Arrays;

public final class ia
{
    public final byte[] a;
    
    public ia(final byte[] array, final int n) {
        System.arraycopy(array, 0, this.a = new byte[n], 0, n);
    }
    
    public static ia a(final byte[] array) {
        if (array != null) {
            return new ia(array, array.length);
        }
        throw new NullPointerException("data must be non-null");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ia && Arrays.equals(((ia)o).a, this.a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return f.n("Bytes(", d.l2(this.a), ")");
    }
}
