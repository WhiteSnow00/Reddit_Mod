// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Collection;
import java.util.List;

public final class k0 extends l0
{
    public final List a(final long n, final Object o) {
        e0 h;
        final e0 e0 = h = (e0)b2.j(n, o);
        if (!e0.s()) {
            final int size = ((List)e0).size();
            int n2;
            if (size == 0) {
                n2 = 10;
            }
            else {
                n2 = size + size;
            }
            h = e0.h(n2);
            b2.s(o, n, (Object)h);
        }
        return (List)h;
    }
    
    public final void b(final long n, final Object o) {
        ((e0)b2.j(n, o)).r();
    }
    
    public final void c(final Object o, final long n, final Object o2) {
        final e0 e0 = (e0)b2.j(n, o);
        final e0 e2 = (e0)b2.j(n, o2);
        final int size = ((List)e0).size();
        final int size2 = ((List)e2).size();
        Object h = e0;
        if (size > 0) {
            h = e0;
            if (size2 > 0) {
                h = e0;
                if (!e0.s()) {
                    h = e0.h(size2 + size);
                }
                ((List)h).addAll((Collection)e2);
            }
        }
        if (size <= 0) {
            h = e2;
        }
        b2.s(o, n, h);
    }
}
