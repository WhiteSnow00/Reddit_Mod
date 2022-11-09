// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import bh2.a;
import java.util.Iterator;

public abstract class t<K, V, T> implements Iterator<T>, a
{
    public Object[] f;
    public int g;
    public int h;
    
    public t() {
        final s e = s.e;
        this.f = s.e.d;
    }
    
    @Override
    public final boolean hasNext() {
        return this.h < this.g;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
