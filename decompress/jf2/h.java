// 
// Decompiled by Procyon v0.6.0
// 

package jf2;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import zd.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import df2.a;
import java.util.concurrent.Future;
import af2.a0;
import java.util.concurrent.CountDownLatch;

public final class h<T> extends CountDownLatch implements a0<T>, Future<T>, a
{
    public T f;
    public Throwable g;
    public final AtomicReference<a> h;
    
    public h() {
        super(1);
        this.h = new AtomicReference<a>();
    }
    
    public final boolean cancel(final boolean b) {
        boolean b2;
        a a = null;
    Label_0065:
        do {
            a = this.h.get();
            b2 = false;
            if (a != this) {
                final DisposableHelper disposed = DisposableHelper.DISPOSED;
                if (a != disposed) {
                    final AtomicReference<a> h = this.h;
                    while (!h.compareAndSet(a, (a)disposed)) {
                        if (h.get() != a) {
                            continue Label_0065;
                        }
                    }
                    b2 = true;
                    continue;
                }
            }
            return false;
        } while (!b2);
        if (a != null) {
            a.dispose();
        }
        this.countDown();
        return true;
    }
    
    public final void dispose() {
    }
    
    public final T get() throws InterruptedException, ExecutionException {
        if (this.getCount() != 0L) {
            b.z1();
            this.await();
        }
        if (this.isCancelled()) {
            throw new CancellationException();
        }
        final Throwable g = this.g;
        if (g == null) {
            return this.f;
        }
        throw new ExecutionException(g);
    }
    
    public final T get(final long n, final TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.getCount() != 0L) {
            b.z1();
            if (!this.await(n, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.c(n, timeUnit));
            }
        }
        if (this.isCancelled()) {
            throw new CancellationException();
        }
        final Throwable g = this.g;
        if (g == null) {
            return this.f;
        }
        throw new ExecutionException(g);
    }
    
    public final boolean isCancelled() {
        return DisposableHelper.isDisposed((a)this.h.get());
    }
    
    public final boolean isDisposed() {
        return this.isDone();
    }
    
    public final boolean isDone() {
        return this.getCount() == 0L;
    }
    
    public final void onComplete() {
        if (this.f == null) {
            this.onError(new NoSuchElementException("The source is empty"));
            return;
        }
        boolean b;
    Label_0076:
        do {
            final a a = this.h.get();
            if (a != this) {
                if (a != DisposableHelper.DISPOSED) {
                    final AtomicReference<a> h = this.h;
                    while (!h.compareAndSet(a, (a)this)) {
                        if (h.get() != a) {
                            b = false;
                            continue Label_0076;
                        }
                    }
                    b = true;
                    continue;
                }
            }
            return;
        } while (!b);
        this.countDown();
    }
    
    public final void onError(final Throwable g) {
        if (this.g == null) {
            this.g = g;
            boolean b;
        Label_0070:
            do {
                final a a = this.h.get();
                if (a == this || a == DisposableHelper.DISPOSED) {
                    RxJavaPlugins.onError(g);
                    return;
                }
                final AtomicReference<a> h = this.h;
                while (!h.compareAndSet(a, (a)this)) {
                    if (h.get() != a) {
                        b = false;
                        continue Label_0070;
                    }
                }
                b = true;
            } while (!b);
            this.countDown();
            return;
        }
        RxJavaPlugins.onError(g);
    }
    
    public final void onNext(final T f) {
        if (this.f != null) {
            this.h.get().dispose();
            this.onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.f = f;
    }
    
    public final void onSubscribe(final a a) {
        DisposableHelper.setOnce((AtomicReference)this.h, a);
    }
}
