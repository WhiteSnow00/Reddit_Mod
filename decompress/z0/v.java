// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import java.util.ConcurrentModificationException;
import ah2.f;
import bh2.a;
import java.util.Iterator;

public final class v implements Iterator<Object>, a
{
    public final x0 f;
    public final int g;
    public int h;
    public final int i;
    
    public v(final int h, final int g, final x0 f) {
        ah2.f.f((Object)f, "table");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = f.l;
        if (!f.k) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final boolean hasNext() {
        return this.h < this.g;
    }
    
    @Override
    public final Object next() {
        final x0 f = this.f;
        if (f.l == this.i) {
            final int h = this.h;
            this.h = at1.a.q(h, f.f) + h;
            return new u(this, h);
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
