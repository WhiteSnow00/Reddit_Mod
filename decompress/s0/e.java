// 
// Decompiled by Procyon v0.6.0
// 

package s0;

import z0.d;
import kotlin.collections.c;
import java.util.Map;

public interface e
{
    int M();
    
    default Object a(final int n) {
        return new a(n);
    }
    
    default Object c(final int n) {
        return null;
    }
    
    default Map<Object, Integer> d() {
        return c.u4();
    }
    
    void g(final int p0, final d p1, final int p2);
}
