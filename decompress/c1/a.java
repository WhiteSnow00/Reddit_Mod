// 
// Decompiled by Procyon v0.6.0
// 

package c1;

import java.util.ListIterator;

public abstract class a<E> implements ListIterator<E>, tg2.a
{
    public int f;
    public int g;
    
    public a(final int f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public void add(final E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean hasNext() {
        return this.f < this.g;
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.f > 0;
    }
    
    @Override
    public final int nextIndex() {
        return this.f;
    }
    
    @Override
    public final int previousIndex() {
        return this.f - 1;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void set(final E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
