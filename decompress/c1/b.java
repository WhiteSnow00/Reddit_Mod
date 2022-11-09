// 
// Decompiled by Procyon v0.6.0
// 

package c1;

import java.util.NoSuchElementException;
import ah2.f;

public final class b<T> extends a<T>
{
    public final T[] h;
    
    public b(final T[] h, final int n, final int n2) {
        ah2.f.f((Object)h, "buffer");
        super(n, n2);
        this.h = h;
    }
    
    @Override
    public final T next() {
        if (this.hasNext()) {
            return this.h[super.f++];
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final T previous() {
        if (this.hasPrevious()) {
            final T[] h = this.h;
            final int f = super.f - 1;
            super.f = f;
            return h[f];
        }
        throw new NoSuchElementException();
    }
}
