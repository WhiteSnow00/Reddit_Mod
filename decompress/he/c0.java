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

public final class c0 extends c implements RandomAccess, d1
{
    public int[] g;
    public int h;
    
    static {
        new c0(new int[0], 0).f = false;
    }
    
    public c0() {
        this(new int[10], 0);
    }
    
    public c0(final int[] g, final int h) {
        this.g = g;
        this.h = h;
    }
    
    public final void add(final int n, final Object o) {
        final int intValue = (int)o;
        this.a();
        if (n >= 0) {
            final int h = this.h;
            if (n <= h) {
                final int[] g = this.g;
                if (h < g.length) {
                    System.arraycopy(g, n, g, n + 1, h - n);
                }
                else {
                    final int[] g2 = new int[a.a(h, 3, 2, 1)];
                    System.arraycopy(g, 0, g2, 0, n);
                    System.arraycopy(this.g, n, g2, n + 1, this.h - n);
                    this.g = g2;
                }
                this.g[n] = intValue;
                ++this.h;
                ++((AbstractList)this).modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(b.i("Index:", n, ", Size:", this.h));
    }
    
    public final /* bridge */ boolean add(final Object o) {
        this.d((int)o);
        return true;
    }
    
    public final boolean addAll(final Collection collection) {
        this.a();
        final Charset a = f0.a;
        collection.getClass();
        if (!(collection instanceof c0)) {
            return super.addAll(collection);
        }
        final c0 c0 = (c0)collection;
        final int h = c0.h;
        if (h == 0) {
            return false;
        }
        final int h2 = this.h;
        if (Integer.MAX_VALUE - h2 >= h) {
            final int h3 = h2 + h;
            final int[] g = this.g;
            if (h3 > g.length) {
                this.g = Arrays.copyOf(g, h3);
            }
            System.arraycopy(c0.g, 0, this.g, this.h, c0.h);
            this.h = h3;
            ++((AbstractList)this).modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    public final void d(final int n) {
        this.a();
        final int h = this.h;
        final int[] g = this.g;
        if (h == g.length) {
            final int[] g2 = new int[a.a(h, 3, 2, 1)];
            System.arraycopy(g, 0, g2, 0, h);
            this.g = g2;
        }
        this.g[this.h++] = n;
    }
    
    public final void e(final int n) {
        if (n >= 0 && n < this.h) {
            return;
        }
        throw new IndexOutOfBoundsException(b.i("Index:", n, ", Size:", this.h));
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c0)) {
            return super.equals(o);
        }
        final c0 c0 = (c0)o;
        if (this.h != c0.h) {
            return false;
        }
        final int[] g = c0.g;
        for (int i = 0; i < this.h; ++i) {
            if (this.g[i] != g[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final Object get(final int n) {
        this.e(n);
        return this.g[n];
    }
    
    public final /* bridge */ e0 h(final int n) {
        if (n >= this.h) {
            return (e0)new c0(Arrays.copyOf(this.g, n), this.h);
        }
        throw new IllegalArgumentException();
    }
    
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.h; ++i) {
            n = n * 31 + this.g[i];
        }
        return n;
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof Integer)) {
            return -1;
        }
        final int intValue = (int)o;
        for (int h = this.h, i = 0; i < h; ++i) {
            if (this.g[i] == intValue) {
                return i;
            }
        }
        return -1;
    }
    
    public final /* bridge */ Object remove(final int n) {
        this.a();
        this.e(n);
        final int[] g = this.g;
        final int n2 = g[n];
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
            final int[] g = this.g;
            System.arraycopy(g, n2, g, n, this.h - n2);
            this.h -= n2 - n;
            ++((AbstractList)this).modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    
    public final /* bridge */ Object set(final int n, final Object o) {
        final int intValue = (int)o;
        this.a();
        this.e(n);
        final int[] g = this.g;
        final int n2 = g[n];
        g[n] = intValue;
        return n2;
    }
    
    public final int size() {
        return this.h;
    }
}
