// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import a92.b;
import java.util.Arrays;

public final class ga
{
    public final byte[] a;
    
    public ga(final byte[] array, final int n) {
        System.arraycopy(array, 0, this.a = new byte[n], 0, n);
    }
    
    public static ga a(final byte[] array) {
        if (array != null) {
            return new ga(array, array.length);
        }
        throw new NullPointerException("data must be non-null");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ga && Arrays.equals(((ga)o).a, this.a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return a.k("Bytes(", b.A0(this.a), ")");
    }
}
