// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.AbstractList;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import ag0.a;
import androidx.appcompat.widget.s0;
import java.util.RandomAccess;

public final class n5 extends d5 implements RandomAccess, g7
{
    public double[] g;
    public int h;
    
    static {
        new n5(new double[0], 0).f = false;
    }
    
    public n5() {
        this(new double[10], 0);
    }
    
    public n5(final double[] g, final int h) {
        this.g = g;
        this.h = h;
    }
    
    public final void add(final int n, final Object o) {
        final double doubleValue = (double)o;
        this.a();
        if (n >= 0) {
            final int h = this.h;
            if (n <= h) {
                final double[] g = this.g;
                if (h < g.length) {
                    System.arraycopy(g, n, g, n + 1, h - n);
                }
                else {
                    final double[] g2 = new double[s0.f(h, 3, 2, 1)];
                    System.arraycopy(g, 0, g2, 0, n);
                    System.arraycopy(this.g, n, g2, n + 1, this.h - n);
                    this.g = g2;
                }
                this.g[n] = doubleValue;
                ++this.h;
                ++((AbstractList)this).modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(a.m("Index:", n, ", Size:", this.h));
    }
    
    public final boolean addAll(final Collection collection) {
        this.a();
        final Charset a = i6.a;
        collection.getClass();
        if (!(collection instanceof n5)) {
            return super.addAll(collection);
        }
        final n5 n5 = (n5)collection;
        final int h = n5.h;
        if (h == 0) {
            return false;
        }
        final int h2 = this.h;
        if (Integer.MAX_VALUE - h2 >= h) {
            final int h3 = h2 + h;
            final double[] g = this.g;
            if (h3 > g.length) {
                this.g = Arrays.copyOf(g, h3);
            }
            System.arraycopy(n5.g, 0, this.g, this.h, n5.h);
            this.h = h3;
            ++((AbstractList)this).modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    public final void b(final double n) {
        this.a();
        final int h = this.h;
        final double[] g = this.g;
        if (h == g.length) {
            final double[] g2 = new double[s0.f(h, 3, 2, 1)];
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
        throw new IndexOutOfBoundsException(a.m("Index:", n, ", Size:", this.h));
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n5)) {
            return super.equals(o);
        }
        final n5 n5 = (n5)o;
        if (this.h != n5.h) {
            return false;
        }
        final double[] g = n5.g;
        for (int i = 0; i < this.h; ++i) {
            if (Double.doubleToLongBits(this.g[i]) != Double.doubleToLongBits(g[i])) {
                return false;
            }
        }
        return true;
    }
    
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.h; ++i) {
            n = n * 31 + i6.a(Double.doubleToLongBits(this.g[i]));
        }
        return n;
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof Double)) {
            return -1;
        }
        final double doubleValue = (double)o;
        for (int h = this.h, i = 0; i < h; ++i) {
            if (this.g[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }
    
    public final void removeRange(final int n, final int n2) {
        this.a();
        if (n2 >= n) {
            final double[] g = this.g;
            System.arraycopy(g, n2, g, n, this.h - n2);
            this.h -= n2 - n;
            ++((AbstractList)this).modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    
    public final int size() {
        return this.h;
    }
}
