// 
// Decompiled by Procyon v0.6.0
// 

package ul2;

import nm2.a;
import java.util.Arrays;

public final class c
{
    public final int[] a;
    
    public c(final int[] array) {
        this.a = array.clone();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c && Arrays.equals(this.a, ((c)o).a));
    }
    
    @Override
    public final int hashCode() {
        return nm2.a.f(this.a);
    }
}
