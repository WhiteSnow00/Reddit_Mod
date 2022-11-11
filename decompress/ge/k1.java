// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.util.NoSuchElementException;
import java.util.Iterator;

public final class k1 implements Iterator
{
    @Override
    public final boolean hasNext() {
        return false;
    }
    
    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
