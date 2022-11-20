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

public final class g extends c implements RandomAccess, d1
{
    public boolean[] g;
    public int h;
    
    static {
        new g(new boolean[0], 0).f = false;
    }
    
    public g() {
        this(new boolean[10], 0);
    }
    
    public g(final boolean[] g, final int h) {
        this.g = g;
        this.h = h;
    }
    
    public final void add(final int n, final Object o) {
        final boolean booleanValue = (boolean)o;
        this.a();
        if (n >= 0) {
            final int h = this.h;
            if (n <= h) {
                final boolean[] g = this.g;
                if (h < g.length) {
                    System.arraycopy(g, n, g, n + 1, h - n);
                }
                else {
                    final boolean[] g2 = new boolean[a.a(h, 3, 2, 1)];
                    System.arraycopy(g, 0, g2, 0, n);
                    System.arraycopy(this.g, n, g2, n + 1, this.h - n);
                    this.g = g2;
                }
                this.g[n] = booleanValue;
                ++this.h;
                ++((AbstractList)this).modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(b.i("Index:", n, ", Size:", this.h));
    }
    
    public final /* bridge */ boolean add(final Object o) {
        this.c((boolean)o);
        return true;
    }
    
    public final boolean addAll(final Collection collection) {
        this.a();
        final Charset a = f0.a;
        collection.getClass();
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        final g g = (g)collection;
        final int h = g.h;
        if (h == 0) {
            return false;
        }
        final int h2 = this.h;
        if (Integer.MAX_VALUE - h2 >= h) {
            final int h3 = h2 + h;
            final boolean[] g2 = this.g;
            if (h3 > g2.length) {
                this.g = Arrays.copyOf(g2, h3);
            }
            System.arraycopy(g.g, 0, this.g, this.h, g.h);
            this.h = h3;
            ++((AbstractList)this).modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    public final void c(final boolean b) {
        this.a();
        final int h = this.h;
        final boolean[] g = this.g;
        if (h == g.length) {
            final boolean[] g2 = new boolean[a.a(h, 3, 2, 1)];
            System.arraycopy(g, 0, g2, 0, h);
            this.g = g2;
        }
        this.g[this.h++] = b;
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
        if (!(o instanceof g)) {
            return super.equals(o);
        }
        final g g = (g)o;
        if (this.h != g.h) {
            return false;
        }
        final boolean[] g2 = g.g;
        for (int i = 0; i < this.h; ++i) {
            if (this.g[i] != g2[i]) {
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
            return (e0)new g(Arrays.copyOf(this.g, n), this.h);
        }
        throw new IllegalArgumentException();
    }
    
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.h; ++i) {
            final boolean b = this.g[i];
            final Charset a = f0.a;
            int n2;
            if (b) {
                n2 = 1231;
            }
            else {
                n2 = 1237;
            }
            n = n * 31 + n2;
        }
        return n;
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof Boolean)) {
            return -1;
        }
        final boolean booleanValue = (boolean)o;
        for (int h = this.h, i = 0; i < h; ++i) {
            if (this.g[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }
    
    public final /* bridge */ Object remove(final int n) {
        this.a();
        this.d(n);
        final boolean[] g = this.g;
        final boolean b = g[n];
        final int h = this.h;
        if (n < h - 1) {
            System.arraycopy(g, n + 1, g, n, h - n - 1);
        }
        --this.h;
        ++((AbstractList)this).modCount;
        return b;
    }
    
    public final void removeRange(final int n, final int n2) {
        this.a();
        if (n2 >= n) {
            final boolean[] g = this.g;
            System.arraycopy(g, n2, g, n, this.h - n2);
            this.h -= n2 - n;
            ++((AbstractList)this).modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    
    public final /* bridge */ Object set(final int n, final Object o) {
        final boolean booleanValue = (boolean)o;
        this.a();
        this.d(n);
        final boolean[] g = this.g;
        final boolean b = g[n];
        g[n] = booleanValue;
        return b;
    }
    
    public final int size() {
        return this.h;
    }
}
