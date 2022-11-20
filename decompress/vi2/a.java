// 
// Decompiled by Procyon v0.6.0
// 

package vi2;

import java.util.Iterator;

public final class a<E> implements Iterable<E>
{
    public static final a<Object> i;
    public final E f;
    public final a<E> g;
    public final int h;
    
    static {
        i = new a<Object>();
    }
    
    public a() {
        this.h = 0;
        this.f = null;
        this.g = null;
    }
    
    public a(final E f, final a<E> g) {
        this.f = f;
        this.g = g;
        this.h = g.h + 1;
    }
    
    public final a<E> a(final Object o) {
        if (this.h == 0) {
            return this;
        }
        if (this.f.equals(o)) {
            return this.g;
        }
        final a<E> a = this.g.a(o);
        if (a == this.g) {
            return this;
        }
        return new a<E>(this.f, (a<Object>)a);
    }
    
    public final a<E> d(final int n) {
        if (n < 0 || n > this.h) {
            throw new IndexOutOfBoundsException();
        }
        if (n == 0) {
            return this;
        }
        return this.g.d(n - 1);
    }
    
    @Override
    public final Iterator<E> iterator() {
        return new a<E>(this.d(0));
    }
    
    public static final class a<E> implements Iterator<E>
    {
        public vi2.a<E> f;
        
        public a(final vi2.a<E> f) {
            this.f = f;
        }
        
        @Override
        public final boolean hasNext() {
            return this.f.h > 0;
        }
        
        @Override
        public final E next() {
            final vi2.a<E> f = this.f;
            final E f2 = f.f;
            this.f = f.g;
            return f2;
        }
        
        @Override
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
