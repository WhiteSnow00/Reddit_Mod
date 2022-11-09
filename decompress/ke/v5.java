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

public final class v5 extends d5 implements RandomAccess, g7
{
    public float[] g;
    public int h;
    
    static {
        new v5(0, new float[0]).f = false;
    }
    
    public v5() {
        this(0, new float[10]);
    }
    
    public v5(final int h, final float[] g) {
        this.g = g;
        this.h = h;
    }
    
    public final void add(final int n, final Object o) {
        final float floatValue = (float)o;
        this.a();
        if (n >= 0) {
            final int h = this.h;
            if (n <= h) {
                final float[] g = this.g;
                if (h < g.length) {
                    System.arraycopy(g, n, g, n + 1, h - n);
                }
                else {
                    final float[] g2 = new float[s0.f(h, 3, 2, 1)];
                    System.arraycopy(g, 0, g2, 0, n);
                    System.arraycopy(this.g, n, g2, n + 1, this.h - n);
                    this.g = g2;
                }
                this.g[n] = floatValue;
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
        if (!(collection instanceof v5)) {
            return super.addAll(collection);
        }
        final v5 v5 = (v5)collection;
        final int h = v5.h;
        if (h == 0) {
            return false;
        }
        final int h2 = this.h;
        if (Integer.MAX_VALUE - h2 >= h) {
            final int h3 = h2 + h;
            final float[] g = this.g;
            if (h3 > g.length) {
                this.g = Arrays.copyOf(g, h3);
            }
            System.arraycopy(v5.g, 0, this.g, this.h, v5.h);
            this.h = h3;
            ++((AbstractList)this).modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    public final void b(final float n) {
        this.a();
        final int h = this.h;
        final float[] g = this.g;
        if (h == g.length) {
            final float[] g2 = new float[s0.f(h, 3, 2, 1)];
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
        if (!(o instanceof v5)) {
            return super.equals(o);
        }
        final v5 v5 = (v5)o;
        if (this.h != v5.h) {
            return false;
        }
        final float[] g = v5.g;
        for (int i = 0; i < this.h; ++i) {
            if (Float.floatToIntBits(this.g[i]) != Float.floatToIntBits(g[i])) {
                return false;
            }
        }
        return true;
    }
    
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.h; ++i) {
            n = n * 31 + Float.floatToIntBits(this.g[i]);
        }
        return n;
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof Float)) {
            return -1;
        }
        final float floatValue = (float)o;
        for (int h = this.h, i = 0; i < h; ++i) {
            if (this.g[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }
    
    public final void removeRange(final int n, final int n2) {
        this.a();
        if (n2 >= n) {
            final float[] g = this.g;
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
