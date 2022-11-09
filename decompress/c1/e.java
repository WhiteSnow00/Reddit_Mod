// 
// Decompiled by Procyon v0.6.0
// 

package c1;

import java.util.NoSuchElementException;
import ah2.f;

public final class e<T> extends a<T>
{
    public final T[] h;
    public final i<T> i;
    
    public e(final Object[] array, final int n, final Object[] h, int n2, final int n3) {
        ah2.f.f((Object)array, "root");
        ah2.f.f((Object)h, "tail");
        super(n, n2);
        this.h = (T[])h;
        final int n4 = n2 - 1 & 0xFFFFFFE0;
        n2 = n;
        if (n > n4) {
            n2 = n4;
        }
        this.i = new i<T>(array, n2, n4, n3);
    }
    
    @Override
    public final T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        if (this.i.hasNext()) {
            ++super.f;
            return this.i.next();
        }
        return this.h[super.f++ - this.i.g];
    }
    
    @Override
    public final T previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        int f = super.f;
        final i<T> i = this.i;
        final int g = i.g;
        if (f > g) {
            final T[] h = this.h;
            --f;
            super.f = f;
            return h[f - g];
        }
        super.f = f - 1;
        return i.previous();
    }
}
