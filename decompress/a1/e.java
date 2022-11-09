// 
// Decompiled by Procyon v0.6.0
// 

package a1;

import java.util.ListIterator;
import gn.a;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Iterator;
import ah2.c;
import java.util.Collection;
import ah2.f;
import qg2.j;
import java.util.RandomAccess;

public final class e<T> implements RandomAccess
{
    public T[] f;
    public a g;
    public int h;
    
    public e(final Object[] f) {
        this.f = (T[])f;
        this.h = 0;
    }
    
    public final void a(final int n, final T t) {
        this.g(this.h + 1);
        final T[] f = this.f;
        final int h = this.h;
        if (n != h) {
            j.j1((Object[])f, n + 1, (Object[])f, n, h);
        }
        f[n] = t;
        ++this.h;
    }
    
    public final void b(final Object o) {
        this.g(this.h + 1);
        final T[] f = this.f;
        final int h = this.h;
        f[h] = (T)o;
        this.h = h + 1;
    }
    
    public final void c(final int n, final e e) {
        ah2.f.f((Object)e, "elements");
        if (e.j()) {
            return;
        }
        this.g(this.h + e.h);
        final T[] f = this.f;
        final int h = this.h;
        if (n != h) {
            j.j1((Object[])f, e.h + n, (Object[])f, n, h);
        }
        j.j1((Object[])e.f, n, (Object[])f, 0, e.h);
        this.h += e.h;
    }
    
    public final boolean d(int h, final Collection<? extends T> collection) {
        ah2.f.f((Object)collection, "elements");
        final boolean empty = collection.isEmpty();
        int n = 0;
        if (empty) {
            return false;
        }
        this.g(collection.size() + this.h);
        final T[] f = this.f;
        if (h != this.h) {
            j.j1((Object[])f, collection.size() + h, (Object[])f, h, this.h);
        }
        for (final Object next : collection) {
            if (n < 0) {
                c.x0();
                throw null;
            }
            f[n + h] = (T)next;
            ++n;
        }
        h = this.h;
        this.h = collection.size() + h;
        return true;
    }
    
    public final void e() {
        final T[] f = this.f;
        for (int n = this.h - 1; -1 < n; --n) {
            f[n] = null;
        }
        this.h = 0;
    }
    
    public final boolean f(final T t) {
        final int n = this.h - 1;
        if (n >= 0) {
            for (int n2 = 0; !ah2.f.a((Object)this.f[n2], (Object)t); ++n2) {
                if (n2 == n) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final void g(final int n) {
        final T[] f = this.f;
        if (f.length < n) {
            final T[] copy = Arrays.copyOf(f, Math.max(n, f.length * 2));
            ah2.f.e((Object)copy, "copyOf(this, newSize)");
            this.f = copy;
        }
    }
    
    public final int i(final T t) {
        final int h = this.h;
        if (h > 0) {
            int n = 0;
            while (!ah2.f.a((Object)t, (Object)this.f[n])) {
                if (++n >= h) {
                    return -1;
                }
            }
            return n;
        }
        return -1;
    }
    
    public final boolean j() {
        return this.h == 0;
    }
    
    public final boolean k() {
        return this.h != 0;
    }
    
    public final boolean l(final T t) {
        final int i = this.i(t);
        if (i >= 0) {
            this.n(i);
            return true;
        }
        return false;
    }
    
    public final void m(final e e) {
        ah2.f.f((Object)e, "elements");
        final int n = e.h - 1;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                this.l(e.f[n2]);
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
    }
    
    public final T n(int h) {
        final T[] f = this.f;
        final T t = f[h];
        final int h2 = this.h;
        if (h != h2 - 1) {
            j.j1((Object[])f, h, (Object[])f, h + 1, h2);
        }
        h = this.h - 1;
        f[this.h = h] = null;
        return t;
    }
    
    public final void o(final Comparator<T> comparator) {
        ah2.f.f((Object)comparator, "comparator");
        final T[] f = this.f;
        final int h = this.h;
        ah2.f.f((Object)f, "<this>");
        Arrays.sort(f, 0, h, comparator);
    }
    
    public static final class a<T> implements List<T>, bh2.c
    {
        public final e<T> f;
        
        public a(final e<T> f) {
            f.f((Object)f, "vector");
            this.f = f;
        }
        
        @Override
        public final void add(final int n, final T t) {
            this.f.a(n, t);
        }
        
        @Override
        public final boolean add(final T t) {
            this.f.b(t);
            return true;
        }
        
        @Override
        public final boolean addAll(final int n, final Collection<? extends T> collection) {
            ah2.f.f((Object)collection, "elements");
            return this.f.d(n, collection);
        }
        
        @Override
        public final boolean addAll(final Collection<? extends T> collection) {
            ah2.f.f((Object)collection, "elements");
            final e<T> f = this.f;
            f.getClass();
            return f.d(f.h, collection);
        }
        
        @Override
        public final void clear() {
            this.f.e();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return this.f.f((T)o);
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            ah2.f.f((Object)collection, "elements");
            final e<T> f = this.f;
            f.getClass();
            final Iterator<Object> iterator = (Iterator<Object>)collection.iterator();
            while (iterator.hasNext()) {
                if (!f.f(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final T get(final int n) {
            gn.a.P(n, (List)this);
            return this.f.f[n];
        }
        
        @Override
        public final int indexOf(final Object o) {
            return this.f.i((T)o);
        }
        
        @Override
        public final boolean isEmpty() {
            return this.f.j();
        }
        
        @Override
        public final Iterator<T> iterator() {
            return (Iterator<T>)new e$c((List)this, 0);
        }
        
        @Override
        public final int lastIndexOf(final Object o) {
            final e<T> f = this.f;
            final int h = f.h;
            int n2;
            final int n = n2 = -1;
            if (h > 0) {
                n2 = h - 1;
                while (!ah2.f.a(o, (Object)f.f[n2])) {
                    if (--n2 < 0) {
                        n2 = n;
                        break;
                    }
                }
            }
            return n2;
        }
        
        @Override
        public final ListIterator<T> listIterator() {
            return (ListIterator<T>)new e$c((List)this, 0);
        }
        
        @Override
        public final ListIterator<T> listIterator(final int n) {
            return (ListIterator<T>)new e$c((List)this, n);
        }
        
        @Override
        public final T remove(final int n) {
            gn.a.P(n, (List)this);
            return this.f.n(n);
        }
        
        @Override
        public final boolean remove(final Object o) {
            return this.f.l((T)o);
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            ah2.f.f((Object)collection, "elements");
            final e<T> f = this.f;
            f.getClass();
            final boolean empty = collection.isEmpty();
            boolean b = false;
            if (!empty) {
                final int h = f.h;
                final Iterator iterator = collection.iterator();
                while (iterator.hasNext()) {
                    f.l((T)iterator.next());
                }
                if (h != f.h) {
                    b = true;
                }
            }
            return b;
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            ah2.f.f((Object)collection, "elements");
            final e<T> f = this.f;
            f.getClass();
            final int h = f.h;
            for (int n = h - 1; -1 < n; --n) {
                if (!collection.contains(f.f[n])) {
                    f.n(n);
                }
            }
            return h != f.h;
        }
        
        @Override
        public final T set(final int n, final T t) {
            gn.a.P(n, (List)this);
            final T[] f = this.f.f;
            final T t2 = f[n];
            f[n] = t;
            return t2;
        }
        
        @Override
        public final int size() {
            return this.f.h;
        }
        
        @Override
        public final List<T> subList(final int n, final int n2) {
            gn.a.R(n, n2, (List)this);
            return new b<T>(this, n, n2);
        }
        
        @Override
        public final Object[] toArray() {
            return c.G0((Collection)this);
        }
        
        @Override
        public final <T> T[] toArray(final T[] array) {
            ah2.f.f((Object)array, "array");
            return (T[])c.H0((Collection)this, (Object[])array);
        }
    }
    
    public static final class b<T> implements List<T>, bh2.c
    {
        public final List<T> f;
        public final int g;
        public int h;
        
        public b(final List<T> f, final int g, final int h) {
            f.f((Object)f, "list");
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        @Override
        public final void add(final int n, final T t) {
            this.f.add(n + this.g, t);
            ++this.h;
        }
        
        @Override
        public final boolean add(final T t) {
            this.f.add(this.h++, t);
            return true;
        }
        
        @Override
        public final boolean addAll(int h, final Collection<? extends T> collection) {
            ah2.f.f((Object)collection, "elements");
            this.f.addAll(h + this.g, collection);
            h = this.h;
            this.h = collection.size() + h;
            return collection.size() > 0;
        }
        
        @Override
        public final boolean addAll(final Collection<? extends T> collection) {
            ah2.f.f((Object)collection, "elements");
            this.f.addAll(this.h, collection);
            this.h += collection.size();
            return collection.size() > 0;
        }
        
        @Override
        public final void clear() {
            int n = this.h - 1;
            final int g = this.g;
            if (g <= n) {
                while (true) {
                    this.f.remove(n);
                    if (n == g) {
                        break;
                    }
                    --n;
                }
            }
            this.h = this.g;
        }
        
        @Override
        public final boolean contains(final Object o) {
            for (int i = this.g; i < this.h; ++i) {
                if (ah2.f.a((Object)this.f.get(i), o)) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            ah2.f.f((Object)collection, "elements");
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
            gn.a.P(n, (List)this);
            return this.f.get(n + this.g);
        }
        
        @Override
        public final int indexOf(final Object o) {
            for (int i = this.g; i < this.h; ++i) {
                if (ah2.f.a((Object)this.f.get(i), o)) {
                    return i - this.g;
                }
            }
            return -1;
        }
        
        @Override
        public final boolean isEmpty() {
            return this.h == this.g;
        }
        
        @Override
        public final Iterator<T> iterator() {
            return (Iterator<T>)new e$c((List)this, 0);
        }
        
        @Override
        public final int lastIndexOf(final Object o) {
            int n = this.h - 1;
            final int g = this.g;
            if (g <= n) {
                while (!ah2.f.a((Object)this.f.get(n), o)) {
                    if (n == g) {
                        return -1;
                    }
                    --n;
                }
                return n - this.g;
            }
            return -1;
        }
        
        @Override
        public final ListIterator<T> listIterator() {
            return (ListIterator<T>)new e$c((List)this, 0);
        }
        
        @Override
        public final ListIterator<T> listIterator(final int n) {
            return (ListIterator<T>)new e$c((List)this, n);
        }
        
        @Override
        public final T remove(final int n) {
            gn.a.P(n, (List)this);
            final T remove = this.f.remove(n + this.g);
            --this.h;
            return remove;
        }
        
        @Override
        public final boolean remove(final Object o) {
            for (int i = this.g; i < this.h; ++i) {
                if (ah2.f.a((Object)this.f.get(i), o)) {
                    this.f.remove(i);
                    --this.h;
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            ah2.f.f((Object)collection, "elements");
            final int h = this.h;
            final Iterator<Object> iterator = collection.iterator();
            while (iterator.hasNext()) {
                this.remove(iterator.next());
            }
            return h != this.h;
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            ah2.f.f((Object)collection, "elements");
            final int h = this.h;
            int n = h - 1;
            final int g = this.g;
            if (g <= n) {
                while (true) {
                    if (!collection.contains(this.f.get(n))) {
                        this.f.remove(n);
                        --this.h;
                    }
                    if (n == g) {
                        break;
                    }
                    --n;
                }
            }
            return h != this.h;
        }
        
        @Override
        public final T set(final int n, final T t) {
            gn.a.P(n, (List)this);
            return this.f.set(n + this.g, t);
        }
        
        @Override
        public final int size() {
            return this.h - this.g;
        }
        
        @Override
        public final List<T> subList(final int n, final int n2) {
            gn.a.R(n, n2, (List)this);
            return new b((List<Object>)this, n, n2);
        }
        
        @Override
        public final Object[] toArray() {
            return c.G0((Collection)this);
        }
        
        @Override
        public final <T> T[] toArray(final T[] array) {
            ah2.f.f((Object)array, "array");
            return (T[])c.H0((Collection)this, (Object[])array);
        }
    }
}
