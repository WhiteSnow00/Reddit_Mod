// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import a92.b;
import java.util.Arrays;

public final class b3 implements Comparable
{
    public final byte[] f = Arrays.copyOf(array, array.length);
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof b3 && Arrays.equals(this.f, ((b3)o).f);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.f);
    }
    
    @Override
    public final String toString() {
        return b.A0(this.f);
    }
}
