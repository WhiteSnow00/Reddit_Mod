// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.AbstractList;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import m5.a;
import java.util.RandomAccess;

public final class m0 extends c implements RandomAccess, d1
{
    public long[] g;
    public int h;
    
    static {
        new m0(new long[0], 0).f = false;
    }
    
    public m0() {
        this(new long[10], 0);
    }
    
    public m0(final long[] g, final int h) {
        this.g = g;
        this.h = h;
    }
    
    public final void add(final int n, final Object o) {
        final long longValue = (long)o;
        this.a();
        if (n >= 0) {
            final int h = this.h;
            if (n <= h) {
                final long[] g = this.g;
                if (h < g.length) {
                    System.arraycopy(g, n, g, n + 1, h - n);
                }
                else {
                    final long[] g2 = new long[a.a(h, 3, 2, 1)];
                    System.arraycopy(g, 0, g2, 0, n);
                    System.arraycopy(this.g, n, g2, n + 1, this.h - n);
                    this.g = g2;
                }
                this.g[n] = longValue;
                ++this.h;
                ++((AbstractList)this).modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(b.i("Index:", n, ", Size:", this.h));
    }
    
    public final /* bridge */ boolean add(final Object o) {
        this.c((long)o);
        return true;
    }
    
    public final boolean addAll(final Collection collection) {
        this.a();
        final Charset a = f0.a;
        collection.getClass();
        if (!(collection instanceof m0)) {
            return super.addAll(collection);
        }
        final m0 m0 = (m0)collection;
        final int h = m0.h;
        if (h == 0) {
            return false;
        }
        final int h2 = this.h;
        if (Integer.MAX_VALUE - h2 >= h) {
            final int h3 = h2 + h;
            final long[] g = this.g;
            if (h3 > g.length) {
                this.g = Arrays.copyOf(g, h3);
            }
            System.arraycopy(m0.g, 0, this.g, this.h, m0.h);
            this.h = h3;
            ++((AbstractList)this).modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    public final void c(final long n) {
        this.a();
        final int h = this.h;
        final long[] g = this.g;
        if (h == g.length) {
            final long[] g2 = new long[a.a(h, 3, 2, 1)];
            System.arraycopy(g, 0, g2, 0, h);
            this.g = g2;
        }
        this.g[this.h++] = n;
    }
    
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    public final void d(final int n) {
        if (n >= 0 && n < this.h) {
            return;
        }
        throw new IndexOutOfBoundsException(b.i("Index:", n, ", Size:", this.h));
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m0)) {
            return super.equals(o);
        }
        final m0 m0 = (m0)o;
        if (this.h != m0.h) {
            return false;
        }
        final long[] g = m0.g;
        for (int i = 0; i < this.h; ++i) {
            if (this.g[i] != g[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final Object get(final int n) {
        this.d(n);
        return this.g[n];
    }
    
    public final /* bridge */ e0 h(final int n) {
        if (n >= this.h) {
            return (e0)new m0(Arrays.copyOf(this.g, n), this.h);
        }
        throw new IllegalArgumentException();
    }
    
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.h; ++i) {
            n = n * 31 + f0.a(this.g[i]);
        }
        return n;
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof Long)) {
            return -1;
        }
        final long longValue = (long)o;
        for (int h = this.h, i = 0; i < h; ++i) {
            if (this.g[i] == longValue) {
                return i;
            }
        }
        return -1;
    }
    
    public final /* bridge */ Object remove(final int n) {
        this.a();
        this.d(n);
        final long[] g = this.g;
        final long n2 = g[n];
        final int h = this.h;
        if (n < h - 1) {
            System.arraycopy(g, n + 1, g, n, h - n - 1);
        }
        --this.h;
        ++((AbstractList)this).modCount;
        return n2;
    }
    
    public final void removeRange(final int n, final int n2) {
        this.a();
        if (n2 >= n) {
            final long[] g = this.g;
            System.arraycopy(g, n2, g, n, this.h - n2);
            this.h -= n2 - n;
            ++((AbstractList)this).modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    
    public final /* bridge */ Object set(final int n, final Object o) {
        final long longValue = (long)o;
        this.a();
        this.d(n);
        final long[] g = this.g;
        final long n2 = g[n];
        g[n] = longValue;
        return n2;
    }
    
    public final int size() {
        return this.h;
    }
}
