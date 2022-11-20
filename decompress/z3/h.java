// 
// Decompiled by Procyon v0.6.0
// 

package z3;

import android.util.SparseArray;
import og2.a;
import java.util.Iterator;

public final class h implements Iterator<Object>, a
{
    public int f;
    public final SparseArray<Object> g;
    
    public h(final SparseArray<Object> g) {
        this.g = g;
    }
    
    @Override
    public final boolean hasNext() {
        return this.f < this.g.size();
    }
    
    @Override
    public final Object next() {
        return this.g.valueAt(this.f++);
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
