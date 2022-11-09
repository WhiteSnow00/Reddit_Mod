// 
// Decompiled by Procyon v0.6.0
// 

package c1;

import java.util.NoSuchElementException;
import ah2.f;

public final class i<E> extends a<E>
{
    public int h;
    public Object[] i;
    public boolean j;
    
    public i(final Object[] array, final int n, int j, final int h) {
        ah2.f.f((Object)array, "root");
        super(n, j);
        this.h = h;
        final Object[] i = new Object[h];
        this.i = i;
        if (n == j) {
            j = 1;
        }
        else {
            j = 0;
        }
        this.j = (j != 0);
        i[0] = array;
        this.b(n - j, 1);
    }
    
    public final E a() {
        final int f = super.f;
        final Object o = this.i[this.h - 1];
        if (o != null) {
            return (E)((Object[])o)[f & 0x1F];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }
    
    public final void b(final int n, int i) {
        int n2 = (this.h - i) * 5;
        while (i < this.h) {
            final Object[] j = this.i;
            final Object o = j[i - 1];
            if (o == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            j[i] = ((Object[])o)[n >> n2 & 0x1F];
            n2 -= 5;
            ++i;
        }
    }
    
    @Override
    public final E next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        final E a = this.a();
        if (++super.f == super.g) {
            this.j = true;
            return a;
        }
        int n = 0;
        int f;
        while (true) {
            f = super.f;
            if ((f >> n & 0x1F) != 0x0) {
                break;
            }
            n += 5;
        }
        if (n > 0) {
            this.b(f, this.h - 1 - n / 5 + 1);
        }
        return a;
    }
    
    @Override
    public final E previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        --super.f;
        final boolean j = this.j;
        int n = 0;
        if (j) {
            this.j = false;
            return this.a();
        }
        int f;
        while (true) {
            f = super.f;
            if ((f >> n & 0x1F) != 0x1F) {
                break;
            }
            n += 5;
        }
        if (n > 0) {
            this.b(f, this.h - 1 - n / 5 + 1);
        }
        return this.a();
    }
}
