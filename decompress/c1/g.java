// 
// Decompiled by Procyon v0.6.0
// 

package c1;

import java.util.NoSuchElementException;

public final class g<E> extends a<E>
{
    public final E h;
    
    public g(final E h, final int n) {
        super(n, 1);
        this.h = h;
    }
    
    @Override
    public final E next() {
        if (this.hasNext()) {
            ++super.f;
            return this.h;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final E previous() {
        if (this.hasPrevious()) {
            --super.f;
            return this.h;
        }
        throw new NoSuchElementException();
    }
}
