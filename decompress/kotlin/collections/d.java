// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.collections;

import java.util.Arrays;
import sg2.e;
import java.util.Iterator;
import ig2.a$a;
import ig2.j;
import al0.b;
import java.util.RandomAccess;
import ig2.a;

public final class d<T> extends a<T> implements RandomAccess
{
    public final Object[] f;
    public final int g;
    public int h;
    public int i;
    
    public d(final Object[] f, final int i) {
        this.f = f;
        final int n = 1;
        if (i < 0) {
            throw new IllegalArgumentException(d.h("ring buffer filled size should not be negative but it is ", i).toString());
        }
        int n2;
        if (i <= f.length) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            this.g = f.length;
            this.i = i;
            return;
        }
        final StringBuilder j = b.i("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
        j.append(f.length);
        throw new IllegalArgumentException(j.toString().toString());
    }
    
    public final int a() {
        return this.i;
    }
    
    public final void d(final int n) {
        final int n2 = 1;
        if (n < 0) {
            throw new IllegalArgumentException(d.h("n shouldn't be negative but it is ", n).toString());
        }
        int n3;
        if (n <= this.i) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            if (n > 0) {
                final int h = this.h;
                final int g = this.g;
                final int h2 = (h + n) % g;
                if (h > h2) {
                    j.M0(h, g, this.f);
                    j.M0(0, h2, this.f);
                }
                else {
                    j.M0(h, h2, this.f);
                }
                this.h = h2;
                this.i -= n;
            }
            return;
        }
        final StringBuilder i = b.i("n shouldn't be greater than the buffer size: n = ", n, ", size = ");
        i.append(this.i);
        throw new IllegalArgumentException(i.toString().toString());
    }
    
    public final T get(final int n) {
        a$a.a(n, this.i);
        return (T)this.f[(this.h + n) % this.g];
    }
    
    public final Iterator<T> iterator() {
        return (Iterator<T>)new d$a(this);
    }
    
    public final Object[] toArray() {
        return this.toArray(new Object[this.a()]);
    }
    
    public final <T> T[] toArray(final T[] array) {
        e.f((Object)array, "array");
        T[] copy = array;
        if (array.length < this.a()) {
            copy = Arrays.copyOf(array, this.a());
            e.e((Object)copy, "copyOf(this, newSize)");
        }
        final int a = this.a();
        int h = this.h;
        final int n = 0;
        int n2 = 0;
        int n3;
        int i;
        while (true) {
            n3 = n;
            i = n2;
            if (n2 >= a) {
                break;
            }
            n3 = n;
            i = n2;
            if (h >= this.g) {
                break;
            }
            copy[n2] = (T)this.f[h];
            ++n2;
            ++h;
        }
        while (i < a) {
            copy[i] = (T)this.f[n3];
            ++i;
            ++n3;
        }
        if (copy.length > this.a()) {
            copy[this.a()] = null;
        }
        return copy;
    }
}
