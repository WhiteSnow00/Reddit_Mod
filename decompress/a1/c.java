// 
// Decompiled by Procyon v0.6.0
// 

package a1;

import lq0.k;
import java.util.Iterator;
import java.util.Collection;
import ig2.j;
import sg2.e;
import tg2.a;
import java.util.Set;

public final class c<T> implements Set<T>, a
{
    public int f;
    public Object[] g;
    
    public c() {
        this.g = new Object[16];
    }
    
    public final int a(final Object o) {
        int n = this.f - 1;
        final int identityHashCode = System.identityHashCode(o);
        int i = 0;
        while (i <= n) {
            final int n2 = i + n >>> 1;
            final Object o2 = this.g[n2];
            if (o2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
            final int identityHashCode2 = System.identityHashCode(o2);
            if (identityHashCode2 < identityHashCode) {
                i = n2 + 1;
            }
            else if (identityHashCode2 > identityHashCode) {
                n = n2 - 1;
            }
            else {
                if (o2 == o) {
                    return n2;
                }
                for (int j = n2 - 1; -1 < j; --j) {
                    final Object o3 = this.g[j];
                    if (o3 == o) {
                        return j;
                    }
                    if (System.identityHashCode(o3) != identityHashCode) {
                        break;
                    }
                }
                for (int j = n2 + 1; j < this.f; ++j) {
                    final Object o4 = this.g[j];
                    if (o4 == o) {
                        return j;
                    }
                    if (System.identityHashCode(o4) != identityHashCode) {
                        j = -(j + 1);
                        return j;
                    }
                }
                int j = this.f;
                return -(j + 1);
            }
        }
        return -(i + 1);
    }
    
    @Override
    public final boolean add(final T t) {
        e.f((Object)t, "value");
        int a;
        if (this.f > 0) {
            if ((a = this.a(t)) >= 0) {
                return false;
            }
        }
        else {
            a = -1;
        }
        final int n = -(a + 1);
        final int f = this.f;
        final Object[] g = this.g;
        if (f == g.length) {
            final Object[] g2 = new Object[g.length * 2];
            j.F0(g, n + 1, g2, n, f);
            j.I0(this.g, g2, 0, 0, n, 6);
            this.g = g2;
        }
        else {
            j.F0(g, n + 1, g, n, f);
        }
        this.g[n] = t;
        ++this.f;
        return true;
    }
    
    @Override
    public final boolean addAll(final Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final void clear() {
        for (int f = this.f, i = 0; i < f; ++i) {
            this.g[i] = null;
        }
        this.f = 0;
    }
    
    @Override
    public final boolean contains(final Object o) {
        boolean b = false;
        if (o == null) {
            return false;
        }
        if (this.a(o) >= 0) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        e.f((Object)collection, "elements");
        final boolean empty = collection.isEmpty();
        final boolean b = true;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator iterator = collection.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (this.contains(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.f == 0;
    }
    
    @Override
    public final Iterator<T> iterator() {
        return new Iterator<T>() {
            public int f;
            public final /* synthetic */ c<T> g;
            
            @Override
            public final boolean hasNext() {
                return this.f < this.g.f;
            }
            
            @Override
            public final T next() {
                final Object o = this.g.g[this.f++];
                if (o != null) {
                    return (T)o;
                }
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
            
            @Override
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
    
    @Override
    public final boolean remove(final T t) {
        if (t == null) {
            return false;
        }
        final int a = this.a(t);
        if (a >= 0) {
            final int f = this.f;
            if (a < f - 1) {
                final Object[] g = this.g;
                j.F0(g, a, g, a + 1, f);
            }
            final int f2 = this.f - 1;
            this.f = f2;
            this.g[f2] = null;
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final int size() {
        return this.f;
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
