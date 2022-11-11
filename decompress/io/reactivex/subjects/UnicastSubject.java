// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import java.util.concurrent.atomic.AtomicBoolean;
import ff2.a0;
import java.util.concurrent.atomic.AtomicReference;
import vf2.a;
import fg2.c;

public final class UnicastSubject<T> extends c<T>
{
    public final a<T> f;
    public final AtomicReference<a0<? super T>> g;
    public final AtomicReference<Runnable> h;
    public final boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public Throwable l;
    public final AtomicBoolean m;
    public final BasicIntQueueDisposable<T> n;
    public boolean o;
    
    public UnicastSubject(final int n) {
        mf2.a.c(n, "capacityHint");
        this.f = new a<T>(n);
        this.h = new AtomicReference<Runnable>();
        this.i = true;
        this.g = new AtomicReference<a0<? super T>>();
        this.m = new AtomicBoolean();
        this.n = (BasicIntQueueDisposable<T>)new UnicastSubject.UnicastSubject$UnicastQueueDisposable(this);
    }
    
    public UnicastSubject(final int n, final Runnable runnable) {
        mf2.a.c(n, "capacityHint");
        this.f = new a<T>(n);
        if (runnable != null) {
            this.h = new AtomicReference<Runnable>(runnable);
            this.i = true;
            this.g = new AtomicReference<a0<? super T>>();
            this.m = new AtomicBoolean();
            this.n = (BasicIntQueueDisposable<T>)new UnicastSubject.UnicastSubject$UnicastQueueDisposable(this);
            return;
        }
        throw new NullPointerException("onTerminate");
    }
    
    public static <T> UnicastSubject<T> c(final int n) {
        return new UnicastSubject<T>(n);
    }
    
    public final void d() {
        final Runnable runnable = this.h.get();
        if (runnable != null) {
            final AtomicReference<Runnable> h = this.h;
            while (true) {
                while (!h.compareAndSet(runnable, null)) {
                    if (h.get() != runnable) {
                        final boolean b = false;
                        if (b) {
                            runnable.run();
                        }
                        return;
                    }
                }
                final boolean b = true;
                continue;
            }
        }
    }
    
    public final void e() {
        if (((AtomicInteger)this.n).getAndIncrement() != 0) {
            return;
        }
        a0 a0 = this.g.get();
        int addAndGet = 1;
        while (a0 == null) {
            addAndGet = ((AtomicInteger)this.n).addAndGet(-addAndGet);
            if (addAndGet == 0) {
                return;
            }
            a0 = this.g.get();
        }
        if (this.o) {
            final a<T> f = this.f;
            final boolean i = this.i;
            int addAndGet2 = 1;
            while (!this.j) {
                final boolean k = this.k;
                if ((i ^ true) && k) {
                    final Throwable l = this.l;
                    boolean b;
                    if (l != null) {
                        this.g.lazySet(null);
                        f.clear();
                        a0.onError(l);
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    if (b) {
                        return;
                    }
                }
                a0.onNext((Object)null);
                if (k) {
                    this.g.lazySet(null);
                    final Throwable j = this.l;
                    if (j != null) {
                        a0.onError(j);
                        return;
                    }
                    a0.onComplete();
                    return;
                }
                else {
                    if ((addAndGet2 = ((AtomicInteger)this.n).addAndGet(-addAndGet2)) == 0) {
                        return;
                    }
                    continue;
                }
            }
            this.g.lazySet(null);
        }
        else {
            final a<T> f2 = this.f;
            final boolean m = this.i;
            int n2;
            int n = n2 = 1;
            while (!this.j) {
                final boolean k2 = this.k;
                final T poll = this.f.poll();
                final boolean b2 = poll == null;
                int n3 = n;
                if (k2) {
                    n3 = n;
                    if ((m ^ true) && (n3 = n) != 0) {
                        final Throwable l2 = this.l;
                        boolean b3;
                        if (l2 != null) {
                            this.g.lazySet(null);
                            f2.clear();
                            a0.onError(l2);
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        if (b3) {
                            return;
                        }
                        n3 = 0;
                    }
                    if (b2) {
                        this.g.lazySet(null);
                        final Throwable l3 = this.l;
                        if (l3 != null) {
                            a0.onError(l3);
                            return;
                        }
                        a0.onComplete();
                        return;
                    }
                }
                if (b2) {
                    final int addAndGet3 = ((AtomicInteger)this.n).addAndGet(-n2);
                    n = n3;
                    if ((n2 = addAndGet3) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    a0.onNext((Object)poll);
                    n = n3;
                }
            }
            this.g.lazySet(null);
            f2.clear();
        }
    }
    
    public final Throwable getThrowable() {
        if (this.k) {
            return this.l;
        }
        return null;
    }
    
    public final boolean hasComplete() {
        return this.k && this.l == null;
    }
    
    public final boolean hasObservers() {
        return this.g.get() != null;
    }
    
    public final boolean hasThrowable() {
        return this.k && this.l != null;
    }
    
    public final void onComplete() {
        if (!this.k) {
            if (!this.j) {
                this.k = true;
                this.d();
                this.e();
            }
        }
    }
    
    public final void onError(final Throwable l) {
        if (l == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!this.k && !this.j) {
            this.l = l;
            this.k = true;
            this.d();
            this.e();
            return;
        }
        RxJavaPlugins.onError(l);
    }
    
    public final void onNext(final T t) {
        if (t != null) {
            if (!this.k) {
                if (!this.j) {
                    this.f.offer(t);
                    this.e();
                }
            }
            return;
        }
        throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
    
    public final void onSubscribe(final if2.a a) {
        if (this.k || this.j) {
            a.dispose();
        }
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        if (!this.m.get() && this.m.compareAndSet(false, true)) {
            a0.onSubscribe((if2.a)this.n);
            this.g.lazySet(a0);
            if (this.j) {
                this.g.lazySet(null);
                return;
            }
            this.e();
        }
        else {
            EmptyDisposable.error((Throwable)new IllegalStateException("Only a single observer allowed."), (a0)a0);
        }
    }
}
