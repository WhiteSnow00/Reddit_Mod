// 
// Decompiled by Procyon v0.6.0
// 

package jf2;

import cg.d;
import df2.a;
import java.util.Collection;
import io.reactivex.internal.queue.MpscLinkedQueue;
import vf2.g;
import if2.i;
import af2.a0;

public abstract class j<T, U, V> extends k implements a0<T>
{
    public final a0<? super V> g;
    public final i<U> h;
    public volatile boolean i;
    public volatile boolean j;
    public Throwable k;
    
    public j(final g g, final MpscLinkedQueue h) {
        this.g = (a0<? super V>)g;
        this.h = (i<U>)h;
    }
    
    public void a(final a0<? super V> a0, final U u) {
    }
    
    public final boolean b() {
        return super.f.getAndIncrement() == 0;
    }
    
    public final boolean c() {
        final int value = super.f.get();
        boolean b = true;
        if (value != 0 || !super.f.compareAndSet(0, 1)) {
            b = false;
        }
        return b;
    }
    
    public final void d(final Collection collection, final a a) {
        final a0<? super V> g = this.g;
        final i<U> h = this.h;
        if (super.f.get() == 0 && super.f.compareAndSet(0, 1)) {
            this.a(g, (U)collection);
            if (this.f(-1) == 0) {
                return;
            }
        }
        else {
            ((if2.j)h).offer((Object)collection);
            if (!this.b()) {
                return;
            }
        }
        d.K1((i)h, (a0)g, a, this);
    }
    
    public final void e(final Collection collection, final a a) {
        final a0<? super V> g = this.g;
        final i<U> h = this.h;
        if (super.f.get() == 0 && super.f.compareAndSet(0, 1)) {
            if (((if2.j)h).isEmpty()) {
                this.a(g, (U)collection);
                if (this.f(-1) == 0) {
                    return;
                }
            }
            else {
                ((if2.j)h).offer((Object)collection);
            }
        }
        else {
            ((if2.j)h).offer((Object)collection);
            if (!this.b()) {
                return;
            }
        }
        d.K1((i)h, (a0)g, a, this);
    }
    
    public final int f(final int n) {
        return super.f.addAndGet(n);
    }
}
