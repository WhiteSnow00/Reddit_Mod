// 
// Decompiled by Procyon v0.6.0
// 

package qf2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicLong;
import if2.i;

public final class a<T> implements i<T>
{
    public static final int n;
    public static final Object o;
    public final AtomicLong f;
    public int g;
    public long h;
    public final int i;
    public AtomicReferenceArray<Object> j;
    public final int k;
    public AtomicReferenceArray<Object> l;
    public final AtomicLong m;
    
    static {
        n = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
        o = new Object();
    }
    
    public a(int n) {
        final AtomicLong f = new AtomicLong();
        this.f = f;
        this.m = new AtomicLong();
        n = 1 << 32 - Integer.numberOfLeadingZeros(Math.max(8, n) - 1);
        final int n2 = n - 1;
        final AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(n + 1);
        this.j = atomicReferenceArray;
        this.i = n2;
        this.g = Math.min(n / 4, a.n);
        this.l = atomicReferenceArray;
        this.k = n2;
        this.h = n2 - 1;
        f.lazySet(0L);
    }
    
    public final boolean a(final T t, final T t2) {
        final AtomicReferenceArray<Object> j = this.j;
        final long value = this.f.get();
        final int i = this.i;
        final long n = 2L + value;
        if (j.get((int)n & i) == null) {
            final int n2 = (int)value & i;
            j.lazySet(n2 + 1, t2);
            j.lazySet(n2, t);
            this.f.lazySet(n);
        }
        else {
            final AtomicReferenceArray k = new AtomicReferenceArray<T>(j.length());
            this.j = (AtomicReferenceArray<Object>)k;
            final int n3 = (int)value & i;
            k.lazySet(n3 + 1, t2);
            k.lazySet(n3, t);
            j.lazySet(j.length() - 1, k);
            j.lazySet(n3, a.o);
            this.f.lazySet(n);
        }
        return true;
    }
    
    public final T b() {
        final AtomicReferenceArray<Object> l = this.l;
        final long value = this.m.get();
        int k = this.k;
        final int n = (int)value & k;
        final T value2 = l.get(n);
        if (value2 == a.o) {
            ++k;
            final AtomicReferenceArray i = l.get(k);
            l.lazySet(k, null);
            this.l = i;
            return (T)i.get(n);
        }
        return value2;
    }
    
    public final void clear() {
        while (true) {
            if (this.poll() == null) {
                if (!this.isEmpty()) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final boolean isEmpty() {
        return this.f.get() == this.m.get();
    }
    
    public final boolean offer(final T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        final AtomicReferenceArray<Object> j = this.j;
        final long value = this.f.get();
        final int i = this.i;
        final int n = (int)value & i;
        if (value < this.h) {
            j.lazySet(n, t);
            this.f.lazySet(value + 1L);
            return true;
        }
        final long n2 = this.g + value;
        if (j.get((int)n2 & i) == null) {
            this.h = n2 - 1L;
            j.lazySet(n, t);
            this.f.lazySet(value + 1L);
            return true;
        }
        final long n3 = value + 1L;
        if (j.get((int)n3 & i) == null) {
            j.lazySet(n, t);
            this.f.lazySet(n3);
            return true;
        }
        final long n4 = i;
        final AtomicReferenceArray k = new AtomicReferenceArray<T>(j.length());
        this.j = (AtomicReferenceArray<Object>)k;
        this.h = n4 + value - 1L;
        k.lazySet(n, t);
        j.lazySet(j.length() - 1, k);
        j.lazySet(n, a.o);
        this.f.lazySet(n3);
        return true;
    }
    
    public final T poll() {
        final AtomicReferenceArray<Object> l = this.l;
        final long value = this.m.get();
        final int k = this.k;
        final int n = (int)value & k;
        final T value2 = l.get(n);
        final boolean b = value2 == a.o;
        if (value2 != null && !b) {
            l.lazySet(n, null);
            this.m.lazySet(value + 1L);
            return value2;
        }
        if (b) {
            final int n2 = k + 1;
            final AtomicReferenceArray i = l.get(n2);
            l.lazySet(n2, null);
            this.l = i;
            final Object value3 = i.get(n);
            if (value3 != null) {
                i.lazySet(n, null);
                this.m.lazySet(value + 1L);
            }
            return (T)value3;
        }
        return null;
    }
}
