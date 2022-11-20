// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import cg2.j;
import mg2.l;

public final class v1 implements l<Throwable, j>
{
    public static final AtomicIntegerFieldUpdater i;
    private volatile int _state;
    public final z0 f;
    public final Thread g;
    public m0 h;
    
    static {
        i = AtomicIntegerFieldUpdater.newUpdater(v1.class, "_state");
    }
    
    public v1(final z0 f) {
        this.f = f;
        this._state = 0;
        this.g = Thread.currentThread();
    }
    
    public static void b(final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Illegal state ");
        sb.append(n);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final void a() {
        while (true) {
            final int state = this._state;
            if (state != 0) {
                if (state == 2) {
                    continue;
                }
                if (state == 3) {
                    Thread.interrupted();
                    return;
                }
                b(state);
                throw null;
            }
            else {
                if (v1.i.compareAndSet(this, state, 1)) {
                    final m0 h = this.h;
                    if (h != null) {
                        h.dispose();
                    }
                    return;
                }
                continue;
            }
        }
    }
    
    public final void c() {
        this.h = this.f.o(true, true, (l<? super Throwable, j>)this);
        int state;
        do {
            state = this._state;
            if (state != 0) {
                if (state != 2 && state != 3) {
                    b(state);
                    throw null;
                }
            }
        } while (!v1.i.compareAndSet(this, state, 0));
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        int state;
        do {
            state = this._state;
            if (state != 0) {
                if (state != 1 && state != 2) {
                    if (state != 3) {
                        b(state);
                        throw null;
                    }
                }
                return j.a;
            }
        } while (!v1.i.compareAndSet(this, state, 2));
        this.g.interrupt();
        this._state = 3;
        return j.a;
    }
}
