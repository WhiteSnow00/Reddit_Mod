// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import bh2.a;
import java.util.Iterator;

public final class z0 implements Iterator<Object>, a
{
    public int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ y0 h;
    
    public z0(final int f, final int g, final y0 h) {
        this.g = g;
        this.h = h;
        this.f = f;
    }
    
    @Override
    public final boolean hasNext() {
        return this.f < this.g;
    }
    
    @Override
    public final Object next() {
        Object o;
        if (this.hasNext()) {
            final y0 h = this.h;
            o = h.c[h.h(this.f++)];
        }
        else {
            o = null;
        }
        return o;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
