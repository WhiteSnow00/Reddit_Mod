// 
// Decompiled by Procyon v0.6.0
// 

package jj2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class r<S extends r<S>> extends e<S>
{
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public final long c;
    private volatile /* synthetic */ int cleanedAndPointers;
    
    static {
        d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers");
    }
    
    public r(final long c, final S n, final int n2) {
        super((e)n);
        this.c = c;
        this.cleanedAndPointers = n2 << 16;
    }
    
    public final boolean b() {
        return this.cleanedAndPointers == this.f() && !this.c();
    }
    
    public final boolean e() {
        return r.d.addAndGet(this, -65536) == this.f() && !this.c();
    }
    
    public abstract int f();
    
    public final boolean g() {
        int cleanedAndPointers;
        do {
            cleanedAndPointers = this.cleanedAndPointers;
            final int f = this.f();
            final boolean b = false;
            if (cleanedAndPointers == f && !this.c()) {
                return b;
            }
        } while (!r.d.compareAndSet(this, cleanedAndPointers, 65536 + cleanedAndPointers));
        return true;
    }
}
