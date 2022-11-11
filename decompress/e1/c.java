// 
// Decompiled by Procyon v0.6.0
// 

package e1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import sg2.e;
import java.util.Map;
import tg2.a;
import java.util.Iterator;

public final class c<E> implements Iterator<E>, a
{
    public Object f;
    public final Map<E, e1.a> g;
    public int h;
    
    public c(final d1.c g, final Object f) {
        e.f((Object)g, "map");
        this.f = f;
        this.g = (Map<E, e1.a>)g;
    }
    
    @Override
    public final boolean hasNext() {
        return this.h < this.g.size();
    }
    
    @Override
    public final E next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        final Object f = this.f;
        ++this.h;
        final e1.a value = this.g.get(f);
        if (value != null) {
            this.f = value.b;
            return (E)f;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Hash code of an element (");
        sb.append(f);
        sb.append(") has changed after it was added to the persistent set.");
        throw new ConcurrentModificationException(sb.toString());
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
