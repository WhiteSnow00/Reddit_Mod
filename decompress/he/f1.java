// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.AbstractList;
import java.util.Arrays;
import m5.a;
import java.util.RandomAccess;

public final class f1 extends c implements RandomAccess
{
    public static final f1 i;
    public Object[] g;
    public int h;
    
    static {
        (i = new f1(new Object[0], 0)).f = false;
    }
    
    public f1(final Object[] g, final int h) {
        this.g = g;
        this.h = h;
    }
    
    public final void add(final int n, final Object o) {
        this.a();
        if (n >= 0) {
            final int h = this.h;
            if (n <= h) {
                final Object[] g = this.g;
                if (h < g.length) {
                    System.arraycopy(g, n, g, n + 1, h - n);
                }
                else {
                    final Object[] g2 = new Object[a.a(h, 3, 2, 1)];
                    System.arraycopy(g, 0, g2, 0, n);
                    System.arraycopy(this.g, n, g2, n + 1, this.h - n);
                    this.g = g2;
                }
                this.g[n] = o;
                ++this.h;
                ++((AbstractList)this).modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(b.i("Index:", n, ", Size:", this.h));
    }
    
    public final boolean add(final Object o) {
        this.a();
        final int h = this.h;
        final Object[] g = this.g;
        if (h == g.length) {
            this.g = Arrays.copyOf(g, h * 3 / 2 + 1);
        }
        this.g[this.h++] = o;
        ++((AbstractList)this).modCount;
        return true;
    }
    
    public final void d(final int n) {
        if (n >= 0 && n < this.h) {
            return;
        }
        throw new IndexOutOfBoundsException(b.i("Index:", n, ", Size:", this.h));
    }
    
    public final Object get(final int n) {
        this.d(n);
        return this.g[n];
    }
    
    public final /* bridge */ e0 h(final int n) {
        if (n >= this.h) {
            return (e0)new f1(Arrays.copyOf(this.g, n), this.h);
        }
        throw new IllegalArgumentException();
    }
    
    public final Object remove(final int n) {
        this.a();
        this.d(n);
        final Object[] g = this.g;
        final Object o = g[n];
        final int h = this.h;
        if (n < h - 1) {
            System.arraycopy(g, n + 1, g, n, h - n - 1);
        }
        --this.h;
        ++((AbstractList)this).modCount;
        return o;
    }
    
    public final Object set(final int n, final Object o) {
        this.a();
        this.d(n);
        final Object[] g = this.g;
        final Object o2 = g[n];
        g[n] = o;
        ++((AbstractList)this).modCount;
        return o2;
    }
    
    public final int size() {
        return this.h;
    }
}
