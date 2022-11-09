// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import bh2.a;

public final class u implements Iterable<Object>, a
{
    public final /* synthetic */ v f;
    public final /* synthetic */ int g;
    
    public u(final v f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Iterator<Object> iterator() {
        final v f = this.f;
        final x0 f2 = f.f;
        if (f2.l == f.i) {
            final int g = this.g;
            return new v(g + 1, at1.a.q(g, f2.f) + g, f2);
        }
        throw new ConcurrentModificationException();
    }
}
