// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class g7
{
    public static final g7 b;
    public final Map a = a;
    
    static {
        final d5 d5 = new d5();
        final HashMap hashMap = (HashMap)d5.a;
        if (hashMap != null) {
            final g7 b2 = new g7(Collections.unmodifiableMap((Map<?, ?>)hashMap));
            d5.a = null;
            b = b2;
            return;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof g7 && this.a.equals(((g7)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
