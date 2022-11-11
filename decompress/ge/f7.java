// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class f7
{
    public static final f7 b;
    public final Map a = a;
    
    static {
        final c5 c5 = new c5();
        final HashMap hashMap = (HashMap)c5.a;
        if (hashMap != null) {
            final f7 b2 = new f7(Collections.unmodifiableMap((Map<?, ?>)hashMap));
            c5.a = null;
            b = b2;
            return;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof f7 && this.a.equals(((f7)o).a);
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
