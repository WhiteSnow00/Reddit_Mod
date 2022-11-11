// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;
import java.util.Collection;

public final class p6 extends q6
{
    public final void a(final long n, final Object o) {
        ((j6)f8.j(n, o)).r();
    }
    
    public final void b(final Object o, final long n, final Object o2) {
        final j6 j6 = (j6)f8.j(n, o);
        final j6 j7 = (j6)f8.j(n, o2);
        final int size = ((List)j6).size();
        final int size2 = ((List)j7).size();
        Object h = j6;
        if (size > 0) {
            h = j6;
            if (size2 > 0) {
                h = j6;
                if (!j6.s()) {
                    h = j6.h(size2 + size);
                }
                ((List)h).addAll((Collection)j7);
            }
        }
        if (size <= 0) {
            h = j7;
        }
        f8.q(o, n, h);
    }
}
