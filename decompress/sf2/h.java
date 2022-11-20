// 
// Decompiled by Procyon v0.6.0
// 

package sf2;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.exceptions.MissingBackpressureException;
import df2.a;
import java.util.Collection;
import io.reactivex.internal.queue.MpscLinkedQueue;
import bg2.d;
import nt2.c;
import af2.l;

public abstract class h<T, U, V> extends i implements l<T>
{
    public final c<? super V> h;
    public final if2.i<U> i;
    public volatile boolean j;
    public volatile boolean k;
    public Throwable l;
    
    public h(final d h, final MpscLinkedQueue i) {
        this.h = (c<? super V>)h;
        this.i = (if2.i<U>)i;
    }
    
    public boolean a(final Object o, final c c) {
        return false;
    }
    
    public final boolean b() {
        return ((j)this).f.getAndIncrement() == 0;
    }
    
    public final boolean c() {
        final int value = ((j)this).f.get();
        boolean b = true;
        if (value != 0 || !((j)this).f.compareAndSet(0, 1)) {
            b = false;
        }
        return b;
    }
    
    public final void d(final Collection collection, final a a) {
        final c<? super V> h = this.h;
        final if2.i<U> i = this.i;
        if (this.c()) {
            final long value = super.g.get();
            if (value == 0L) {
                a.dispose();
                h.onError((Throwable)new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
            if (this.a(collection, h) && value != Long.MAX_VALUE) {
                this.g(1L);
            }
            if (this.f(-1) == 0) {
                return;
            }
        }
        else {
            ((if2.j)i).offer((Object)collection);
            if (!this.b()) {
                return;
            }
        }
        cg.d.L1((if2.i)i, (c)h, a, this);
    }
    
    public final void e(final Collection collection, final a a) {
        final c<? super V> h = this.h;
        final if2.i<U> i = this.i;
        if (this.c()) {
            final long value = super.g.get();
            if (value == 0L) {
                this.j = true;
                a.dispose();
                h.onError((Throwable)new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
            if (((if2.j)i).isEmpty()) {
                if (this.a(collection, h) && value != Long.MAX_VALUE) {
                    this.g(1L);
                }
                if (this.f(-1) == 0) {
                    return;
                }
            }
            else {
                ((if2.j)i).offer((Object)collection);
            }
        }
        else {
            ((if2.j)i).offer((Object)collection);
            if (!this.b()) {
                return;
            }
        }
        cg.d.L1((if2.i)i, (c)h, a, this);
    }
    
    public final int f(final int n) {
        return ((j)this).f.addAndGet(n);
    }
    
    public final long g(final long n) {
        return super.g.addAndGet(-1L);
    }
    
    public final long h() {
        return super.g.get();
    }
    
    public final void i(final long n) {
        if (SubscriptionHelper.validate(n)) {
            cg.d.w0(super.g, n);
        }
    }
}
