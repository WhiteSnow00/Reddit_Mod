// 
// Decompiled by Procyon v0.6.0
// 

package sf2;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import zd.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import nt2.d;
import java.util.concurrent.Future;
import af2.l;
import java.util.concurrent.CountDownLatch;

public final class f<T> extends CountDownLatch implements l<T>, Future<T>, d
{
    public T f;
    public Throwable g;
    public final AtomicReference<d> h;
    
    public f() {
        super(1);
        this.h = new AtomicReference<d>();
    }
    
    public final void cancel() {
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        boolean b2;
        d d = null;
    Label_0063:
        do {
            d = this.h.get();
            b2 = false;
            if (d != this) {
                final SubscriptionHelper cancelled = SubscriptionHelper.CANCELLED;
                if (d != cancelled) {
                    final AtomicReference<d> h = this.h;
                    while (!h.compareAndSet(d, (d)cancelled)) {
                        if (h.get() != d) {
                            continue Label_0063;
                        }
                    }
                    b2 = true;
                    continue;
                }
            }
            return false;
        } while (!b2);
        if (d != null) {
            d.cancel();
        }
        this.countDown();
        return true;
    }
    
    @Override
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
    
    @Override
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
    
    @Override
    public final boolean isCancelled() {
        return this.h.get() == SubscriptionHelper.CANCELLED;
    }
    
    @Override
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
            final d d = this.h.get();
            if (d != this) {
                if (d != SubscriptionHelper.CANCELLED) {
                    final AtomicReference<d> h = this.h;
                    while (!h.compareAndSet(d, (d)this)) {
                        if (h.get() != d) {
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
        boolean b;
    Label_0063:
        do {
            final d d = this.h.get();
            if (d == this || d == SubscriptionHelper.CANCELLED) {
                RxJavaPlugins.onError(g);
                return;
            }
            this.g = g;
            final AtomicReference<d> h = this.h;
            while (!h.compareAndSet(d, (d)this)) {
                if (h.get() != d) {
                    b = false;
                    continue Label_0063;
                }
            }
            b = true;
        } while (!b);
        this.countDown();
    }
    
    public final void onNext(final T f) {
        if (this.f != null) {
            this.h.get().cancel();
            this.onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.f = f;
    }
    
    @Override
    public final void onSubscribe(final d d) {
        SubscriptionHelper.setOnce(this.h, d, Long.MAX_VALUE);
    }
    
    public final void request(final long n) {
    }
}
