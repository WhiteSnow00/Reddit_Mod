// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import lq0.k;
import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.ListIterator;
import java.util.Iterator;
import sg2.e;
import java.util.Arrays;
import hg2.j;
import java.util.Collection;
import bg.d;
import tg2.a;
import java.util.List;

public final class b<T> implements List<T>, tg2.a
{
    public Object[] f;
    public long[] g;
    public int h;
    public int i;
    
    public b() {
        this.f = new Object[16];
        this.g = new long[16];
        this.h = -1;
    }
    
    public final long a() {
        final long v = d.v(Float.POSITIVE_INFINITY, false);
        int n = this.h + 1;
        final int l0 = b.L0((List)this);
        long n2 = v;
        if (n <= l0) {
            long n3 = v;
            while (true) {
                final long n4 = this.g[n];
                long n5 = n3;
                if (aa1.a.Q(n4, n3) < 0) {
                    n5 = n4;
                }
                if (Float.intBitsToFloat((int)(n5 >> 32)) < 0.0f && aa1.a.B0(n5)) {
                    return n5;
                }
                n2 = n5;
                if (n == l0) {
                    break;
                }
                ++n;
                n3 = n5;
            }
        }
        return n2;
    }
    
    @Override
    public final void add(final int n, final T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean add(final T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean addAll(final int n, final Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean addAll(final Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void c(final T t, final float n, final boolean b, final rg2.a<j> a) {
        final int h = this.h;
        final int h2 = h + 1;
        this.h = h2;
        final Object[] f = this.f;
        if (h2 >= f.length) {
            final int n2 = f.length + 16;
            final Object[] copy = Arrays.copyOf(f, n2);
            e.e((Object)copy, "copyOf(this, newSize)");
            this.f = copy;
            final long[] copy2 = Arrays.copyOf(this.g, n2);
            e.e((Object)copy2, "copyOf(this, newSize)");
            this.g = copy2;
        }
        final Object[] f2 = this.f;
        final int h3 = this.h;
        f2[h3] = t;
        this.g[h3] = d.v(n, b);
        this.d();
        a.invoke();
        this.h = h;
    }
    
    @Override
    public final void clear() {
        this.h = -1;
        this.d();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        e.f((Object)collection, "elements");
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final void d() {
        int n = this.h + 1;
        final int l0 = b.L0((List)this);
        if (n <= l0) {
            while (true) {
                this.f[n] = null;
                if (n == l0) {
                    break;
                }
                ++n;
            }
        }
        this.i = this.h + 1;
    }
    
    @Override
    public final T get(final int n) {
        return (T)this.f[n];
    }
    
    @Override
    public final int indexOf(final Object o) {
        final int l0 = b.L0((List)this);
        if (l0 >= 0) {
            int n;
            for (n = 0; !e.a(this.f[n], o); ++n) {
                if (n == l0) {
                    return -1;
                }
            }
            return n;
        }
        return -1;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.i == 0;
    }
    
    @Override
    public final Iterator<T> iterator() {
        return new a(0, 7);
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        for (int l0 = b.L0((List)this); -1 < l0; --l0) {
            if (e.a(this.f[l0], o)) {
                return l0;
            }
        }
        return -1;
    }
    
    @Override
    public final ListIterator<T> listIterator() {
        return new a(0, 7);
    }
    
    @Override
    public final ListIterator<T> listIterator(final int n) {
        return new a(n, 6);
    }
    
    @Override
    public final T remove(final int n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final void replaceAll(final UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final T set(final int n, final T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final int size() {
        return this.i;
    }
    
    @Override
    public final void sort(final Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final List<T> subList(final int n, final int n2) {
        return new b(n, n2);
    }
    
    @Override
    public final Object[] toArray() {
        return k.I0((Collection)this);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        e.f((Object)array, "array");
        return (T[])k.J0((Collection)this, (Object[])array);
    }
    
    public final class a implements ListIterator<T>, tg2.a
    {
        public int f;
        public final int g;
        public final int h;
        
        public a(final b b, int n, int i) {
            if ((i & 0x1) != 0x0) {
                n = 0;
            }
            if ((i & 0x4) != 0x0) {
                i = b.i;
            }
            else {
                i = 0;
            }
            this(n, 0, i);
        }
        
        public a(final int f, final int g, final int h) {
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        @Override
        public final void add(final T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean hasNext() {
            return this.f < this.h;
        }
        
        @Override
        public final boolean hasPrevious() {
            return this.f > this.g;
        }
        
        @Override
        public final T next() {
            return (T)b.this.f[this.f++];
        }
        
        @Override
        public final int nextIndex() {
            return this.f - this.g;
        }
        
        @Override
        public final T previous() {
            final Object[] f = b.this.f;
            final int f2 = this.f - 1;
            this.f = f2;
            return (T)f[f2];
        }
        
        @Override
        public final int previousIndex() {
            return this.f - this.g - 1;
        }
        
        @Override
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final void set(final T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
    
    public final class b implements List<T>, tg2.a
    {
        public final int f;
        public final int g;
        
        public b(final int f, final int g) {
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final void add(final int n, final T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean add(final T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean addAll(final int n, final Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean addAll(final Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean contains(final Object o) {
            return this.indexOf(o) != -1;
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            e.f((Object)collection, "elements");
            final Iterator<Object> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final T get(final int n) {
            return (T)e2.b.this.f[n + this.f];
        }
        
        @Override
        public final int indexOf(final Object o) {
            int f = this.f;
            final int g = this.g;
            if (f <= g) {
                while (!e.a(e2.b.this.f[f], o)) {
                    if (f == g) {
                        return -1;
                    }
                    ++f;
                }
                return f - this.f;
            }
            return -1;
        }
        
        @Override
        public final boolean isEmpty() {
            return this.g - this.f == 0;
        }
        
        @Override
        public final Iterator<T> iterator() {
            final e2.b<T> h = e2.b.this;
            final int f = this.f;
            return new a(f, f, this.g);
        }
        
        @Override
        public final int lastIndexOf(final Object o) {
            int g = this.g;
            final int f = this.f;
            if (f <= g) {
                while (!e.a(e2.b.this.f[g], o)) {
                    if (g == f) {
                        return -1;
                    }
                    --g;
                }
                return g - this.f;
            }
            return -1;
        }
        
        @Override
        public final ListIterator<T> listIterator() {
            final e2.b<T> h = e2.b.this;
            final int f = this.f;
            return new a(f, f, this.g);
        }
        
        @Override
        public final ListIterator<T> listIterator(final int n) {
            final e2.b<T> h = e2.b.this;
            final int f = this.f;
            return new a(n + f, f, this.g);
        }
        
        @Override
        public final T remove(final int n) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean remove(final Object o) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final void replaceAll(final UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final T set(final int n, final T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final int size() {
            return this.g - this.f;
        }
        
        @Override
        public final void sort(final Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final List<T> subList(final int n, final int n2) {
            final e2.b<T> h = e2.b.this;
            final int f = this.f;
            return new b(n + f, f + n2);
        }
        
        @Override
        public final Object[] toArray() {
            return k.I0((Collection)this);
        }
        
        @Override
        public final <T> T[] toArray(final T[] array) {
            e.f((Object)array, "array");
            return (T[])k.J0((Collection)this, (Object[])array);
        }
    }
}
