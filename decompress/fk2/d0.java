// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import java.util.concurrent.atomic.AtomicReference;

public final class d0
{
    public static final c0 a;
    public static final int b;
    public static final AtomicReference<c0>[] c;
    
    static {
        int i = 0;
        a = new c0(new byte[0], 0, 0, false, false);
        final int n = b = Integer.highestOneBit(Runtime.getRuntime().availableProcessors() * 2 - 1);
        final AtomicReference[] c2 = new AtomicReference[n];
        while (i < n) {
            c2[i] = new AtomicReference();
            ++i;
        }
        c = c2;
    }
    
    public static final void a(final c0 c0) {
        final c0 f = c0.f;
        final int n = 1;
        if (f != null || c0.g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c0.d) {
            return;
        }
        final AtomicReference<c0> atomicReference = d0.c[(int)(Thread.currentThread().getId() & d0.b - 1L)];
        final c0 f2 = atomicReference.get();
        if (f2 == d0.a) {
            return;
        }
        int c2;
        if (f2 == null) {
            c2 = 0;
        }
        else {
            c2 = f2.c;
        }
        if (c2 >= 65536) {
            return;
        }
        c0.f = f2;
        c0.b = 0;
        c0.c = c2 + 8192;
        while (true) {
            while (!atomicReference.compareAndSet(f2, c0)) {
                if (atomicReference.get() != f2) {
                    final int n2 = 0;
                    if (n2 == 0) {
                        c0.f = null;
                    }
                    return;
                }
            }
            final int n2 = n;
            continue;
        }
    }
    
    public static final c0 b() {
        final AtomicReference<c0> atomicReference = d0.c[(int)(Thread.currentThread().getId() & d0.b - 1L)];
        final c0 a = d0.a;
        final c0 c0 = atomicReference.getAndSet(a);
        if (c0 == a) {
            return new c0();
        }
        if (c0 == null) {
            atomicReference.set(null);
            return new c0();
        }
        atomicReference.set(c0.f);
        c0.f = null;
        c0.c = 0;
        return c0;
    }
}
