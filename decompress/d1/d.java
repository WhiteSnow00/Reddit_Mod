// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import java.util.NoSuchElementException;
import sg2.e;
import tg2.a;
import java.util.Iterator;

public abstract class d<K, V, T> implements Iterator<T>, a
{
    public final t<K, V, T>[] f;
    public int g;
    public boolean h;
    
    public d(final s<K, V> s, final t<K, V, T>[] f) {
        e.f((Object)s, "node");
        this.f = f;
        this.h = true;
        final t<K, V, T> t = f[0];
        final Object[] d = s.d;
        final int bitCount = Integer.bitCount(s.a);
        t.getClass();
        e.f((Object)d, "buffer");
        t.f = d;
        t.g = bitCount * 2;
        t.h = 0;
        this.g = 0;
        this.a();
    }
    
    public final void a() {
        final t<K, V, T>[] f = this.f;
        int g = this.g;
        final t<K, V, T> t = f[g];
        if (t.h < t.g) {
            return;
        }
        while (-1 < g) {
            final int c = this.c(g);
            int c2;
            if ((c2 = c) == -1) {
                final t<K, V, T> t2 = this.f[g];
                final int h = t2.h;
                final Object[] f2 = t2.f;
                final boolean b = h < f2.length;
                c2 = c;
                if (b) {
                    final int length = f2.length;
                    t2.h = h + 1;
                    c2 = this.c(g);
                }
            }
            if (c2 != -1) {
                this.g = c2;
                return;
            }
            if (g > 0) {
                final t<K, V, T> t3 = this.f[g - 1];
                final int h2 = t3.h;
                final int length2 = t3.f.length;
                t3.h = h2 + 1;
            }
            final t<K, V, T> t4 = this.f[g];
            final Object[] d = s.e.d;
            t4.getClass();
            e.f((Object)d, "buffer");
            t4.f = d;
            t4.g = 0;
            t4.h = 0;
            --g;
        }
        this.h = false;
    }
    
    public final int c(final int n) {
        final t<K, V, T>[] f = this.f;
        final t<K, V, T> t = f[n];
        final int h = t.h;
        if (h < t.g) {
            return n;
        }
        final Object[] f2 = t.f;
        if (h >= f2.length) {
            return -1;
        }
        final int length = f2.length;
        final Object o = f2[h];
        if (o != null) {
            final s s = (s)o;
            if (n == 6) {
                final t<K, V, T> t2 = f[n + 1];
                final Object[] d = s.d;
                final int length2 = d.length;
                t2.getClass();
                t2.f = d;
                t2.g = length2;
                t2.h = 0;
            }
            else {
                final t<K, V, T> t3 = f[n + 1];
                final Object[] d2 = s.d;
                final int bitCount = Integer.bitCount(s.a);
                t3.getClass();
                e.f((Object)d2, "buffer");
                t3.f = d2;
                t3.g = bitCount * 2;
                t3.h = 0;
            }
            return this.c(n + 1);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
    }
    
    @Override
    public final boolean hasNext() {
        return this.h;
    }
    
    @Override
    public T next() {
        if (this.h) {
            final T next = this.f[this.g].next();
            this.a();
            return next;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
