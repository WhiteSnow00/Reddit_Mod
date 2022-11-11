// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ff2.a0;
import ff2.t;
import ff2.y;
import ff2.b0;
import java.util.concurrent.TimeUnit;
import sf2.a;

public final class ObservableTimeoutTimed<T> extends sf2.a<T, T>
{
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    public final y<? extends T> j;
    
    public ObservableTimeoutTimed(final t<T> t, final long g, final TimeUnit h, final b0 i, final y<? extends T> j) {
        super((y)t);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        if (this.j == null) {
            final TimeoutObserver timeoutObserver = new TimeoutObserver((a0<? super T>)a0, this.g, this.h, this.i.a());
            a0.onSubscribe((if2.a)timeoutObserver);
            timeoutObserver.startTimeout(0L);
            super.f.subscribe((a0)timeoutObserver);
        }
        else {
            final TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver((ff2.a0<? super Object>)a0, this.g, this.h, this.i.a(), this.j);
            a0.onSubscribe((if2.a)timeoutFallbackObserver);
            timeoutFallbackObserver.startTimeout(0L);
            super.f.subscribe((a0)timeoutFallbackObserver);
        }
    }
    
    public static final class TimeoutFallbackObserver<T> extends AtomicReference<if2.a> implements a0<T>, if2.a, b
    {
        private static final long serialVersionUID = 3764492702657003550L;
        public final a0<? super T> downstream;
        public y<? extends T> fallback;
        public final AtomicLong index;
        public final SequentialDisposable task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<if2.a> upstream;
        public final b0.c worker;
        
        public TimeoutFallbackObserver(final a0<? super T> downstream, final long timeout, final TimeUnit unit, final b0.c worker, final y<? extends T> fallback) {
            this.downstream = downstream;
            this.timeout = timeout;
            this.unit = unit;
            this.worker = worker;
            this.fallback = fallback;
            this.task = new SequentialDisposable();
            this.index = new AtomicLong();
            this.upstream = new AtomicReference<if2.a>();
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this.upstream);
            DisposableHelper.dispose((AtomicReference)this);
            ((if2.a)this.worker).dispose();
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((if2.a)this.get());
        }
        
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                ((if2.a)this.worker).dispose();
            }
        }
        
        public void onError(final Throwable t) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(t);
                ((if2.a)this.worker).dispose();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            final long value = this.index.get();
            if (value != Long.MAX_VALUE) {
                final AtomicLong index = this.index;
                final long n = 1L + value;
                if (index.compareAndSet(value, n)) {
                    ((AtomicReference<if2.a>)this.task).get().dispose();
                    this.downstream.onNext((Object)t);
                    this.startTimeout(n);
                }
            }
        }
        
        public void onSubscribe(final if2.a a) {
            DisposableHelper.setOnce((AtomicReference)this.upstream, a);
        }
        
        public void onTimeout(final long n) {
            if (this.index.compareAndSet(n, Long.MAX_VALUE)) {
                DisposableHelper.dispose((AtomicReference)this.upstream);
                final y<? extends T> fallback = this.fallback;
                this.fallback = null;
                fallback.subscribe((a0)new a((ff2.a0<? super Object>)this.downstream, this));
                ((if2.a)this.worker).dispose();
            }
        }
        
        public void startTimeout(final long n) {
            this.task.replace(this.worker.c(new c(n, this), this.timeout, this.unit));
        }
    }
    
    public static final class TimeoutObserver<T> extends AtomicLong implements a0<T>, if2.a, b
    {
        private static final long serialVersionUID = 3764492702657003550L;
        public final a0<? super T> downstream;
        public final SequentialDisposable task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<if2.a> upstream;
        public final b0.c worker;
        
        public TimeoutObserver(final a0<? super T> downstream, final long timeout, final TimeUnit unit, final b0.c worker) {
            this.downstream = downstream;
            this.timeout = timeout;
            this.unit = unit;
            this.worker = worker;
            this.task = new SequentialDisposable();
            this.upstream = new AtomicReference<if2.a>();
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this.upstream);
            ((if2.a)this.worker).dispose();
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((if2.a)this.upstream.get());
        }
        
        public void onComplete() {
            if (this.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                ((if2.a)this.worker).dispose();
            }
        }
        
        public void onError(final Throwable t) {
            if (this.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(t);
                ((if2.a)this.worker).dispose();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            final long value = this.get();
            if (value != Long.MAX_VALUE) {
                final long n = 1L + value;
                if (this.compareAndSet(value, n)) {
                    ((AtomicReference<if2.a>)this.task).get().dispose();
                    this.downstream.onNext((Object)t);
                    this.startTimeout(n);
                }
            }
        }
        
        public void onSubscribe(final if2.a a) {
            DisposableHelper.setOnce((AtomicReference)this.upstream, a);
        }
        
        public void onTimeout(final long n) {
            if (this.compareAndSet(n, Long.MAX_VALUE)) {
                DisposableHelper.dispose((AtomicReference)this.upstream);
                this.downstream.onError((Throwable)new TimeoutException(ExceptionHelper.c(this.timeout, this.unit)));
                ((if2.a)this.worker).dispose();
            }
        }
        
        public void startTimeout(final long n) {
            this.task.replace(this.worker.c(new c(n, this), this.timeout, this.unit));
        }
    }
    
    public static final class a<T> implements a0<T>
    {
        public final a0<? super T> f;
        public final AtomicReference<if2.a> g;
        
        public a(final a0<? super T> f, final AtomicReference<if2.a> g) {
            this.f = f;
            this.g = g;
        }
        
        public final void onComplete() {
            this.f.onComplete();
        }
        
        public final void onError(final Throwable t) {
            this.f.onError(t);
        }
        
        public final void onNext(final T t) {
            this.f.onNext((Object)t);
        }
        
        public final void onSubscribe(final if2.a a) {
            DisposableHelper.replace((AtomicReference)this.g, a);
        }
    }
    
    public interface b
    {
        void onTimeout(final long p0);
    }
    
    public static final class c implements Runnable
    {
        public final b f;
        public final long g;
        
        public c(final long g, final b f) {
            this.g = g;
            this.f = f;
        }
        
        @Override
        public final void run() {
            this.f.onTimeout(this.g);
        }
    }
}
