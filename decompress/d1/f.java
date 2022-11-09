// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import ah2.l;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;

public class f<K, V, T> extends d<K, V, T>
{
    public final e<K, V> i;
    public K j;
    public boolean k;
    public int l;
    
    public f(final e<K, V> i, final t<K, V, T>[] array) {
        ah2.f.f((Object)i, "builder");
        super(i.h, array);
        this.i = i;
        this.l = i.j;
    }
    
    public final void c(int n, final s<?, ?> s, final K k, final int n2) {
        final int n3 = n2 * 5;
        if (n3 > 30) {
            final t<K, V, T> t = super.f[n2];
            final Object[] d = s.d;
            n = d.length;
            t.getClass();
            t.f = d;
            t.g = n;
            t.h = 0;
            while (true) {
                final t<K, V, T> t2 = super.f[n2];
                if (ah2.f.a(t2.f[t2.h], (Object)k)) {
                    break;
                }
                final t<K, V, T> t3 = super.f[n2];
                t3.h += 2;
            }
            super.g = n2;
            return;
        }
        final int n4 = 1 << (n >> n3 & 0x1F);
        if (s.h(n4)) {
            n = s.f(n4);
            final t<K, V, T> t4 = super.f[n2];
            final Object[] d2 = s.d;
            final int bitCount = Integer.bitCount(s.a);
            t4.getClass();
            ah2.f.f((Object)d2, "buffer");
            t4.f = d2;
            t4.g = bitCount * 2;
            t4.h = n;
            super.g = n2;
            return;
        }
        final int t5 = s.t(n4);
        final s s2 = s.s(t5);
        final t<K, V, T> t6 = super.f[n2];
        final Object[] d3 = s.d;
        final int bitCount2 = Integer.bitCount(s.a);
        t6.getClass();
        ah2.f.f((Object)d3, "buffer");
        t6.f = d3;
        t6.g = bitCount2 * 2;
        t6.h = t5;
        this.c(n, (s<?, ?>)s2, k, n2 + 1);
    }
    
    @Override
    public final T next() {
        if (this.i.j != this.l) {
            throw new ConcurrentModificationException();
        }
        if (super.h) {
            final t<K, V, T> t = super.f[super.g];
            this.j = (K)t.f[t.h];
            this.k = true;
            return super.next();
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        if (this.k) {
            final boolean h = super.h;
            if (h) {
                if (!h) {
                    throw new NoSuchElementException();
                }
                final t<K, V, T> t = super.f[super.g];
                final Object o = t.f[t.h];
                ah2.l.c((Object)this.i).remove(this.j);
                int hashCode;
                if (o != null) {
                    hashCode = o.hashCode();
                }
                else {
                    hashCode = 0;
                }
                this.c(hashCode, this.i.h, (K)o, 0);
            }
            else {
                ah2.l.c((Object)this.i).remove(this.j);
            }
            this.j = null;
            this.k = false;
            this.l = this.i.j;
            return;
        }
        throw new IllegalStateException();
    }
}
