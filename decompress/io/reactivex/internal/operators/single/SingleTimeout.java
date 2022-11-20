// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import df2.a;
import af2.e0;
import af2.b0;
import java.util.concurrent.TimeUnit;
import af2.g0;
import af2.c0;

public final class SingleTimeout<T> extends c0<T>
{
    public final g0<T> f;
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    public final g0<? extends T> j;
    
    public SingleTimeout(final g0 f, final long g, final TimeUnit h, final b0 i) {
        this.f = (g0<T>)f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = null;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        final TimeoutMainObserver timeoutMainObserver = new TimeoutMainObserver((e0<? super T>)e0, (g0<? extends T>)this.j, this.g, this.h);
        e0.onSubscribe((a)timeoutMainObserver);
        DisposableHelper.replace((AtomicReference)timeoutMainObserver.task, this.i.d((Runnable)timeoutMainObserver, this.g, this.h));
        this.f.a((e0)timeoutMainObserver);
    }
    
    public static final class TimeoutMainObserver<T> extends AtomicReference<a> implements e0<T>, Runnable, a
    {
        private static final long serialVersionUID = 37497744973048446L;
        public final e0<? super T> downstream;
        public final TimeoutFallbackObserver<T> fallback;
        public g0<? extends T> other;
        public final AtomicReference<a> task;
        public final long timeout;
        public final TimeUnit unit;
        
        public TimeoutMainObserver(final e0<? super T> downstream, final g0<? extends T> other, final long timeout, final TimeUnit unit) {
            this.downstream = downstream;
            this.other = other;
            this.timeout = timeout;
            this.unit = unit;
            this.task = new AtomicReference<a>();
            if (other != null) {
                this.fallback = new TimeoutFallbackObserver<T>(downstream);
            }
            else {
                this.fallback = null;
            }
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this);
            DisposableHelper.dispose((AtomicReference)this.task);
            final TimeoutFallbackObserver<T> fallback = this.fallback;
            if (fallback != null) {
                DisposableHelper.dispose((AtomicReference)fallback);
            }
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((a)this.get());
        }
        
        public void onError(final Throwable t) {
            final a a = this.get();
            final DisposableHelper disposed = DisposableHelper.DISPOSED;
            if (a != disposed && this.compareAndSet(a, (a)disposed)) {
                DisposableHelper.dispose((AtomicReference)this.task);
                this.downstream.onError(t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onSubscribe(final a a) {
            DisposableHelper.setOnce((AtomicReference)this, a);
        }
        
        public void onSuccess(final T t) {
            final a a = this.get();
            final DisposableHelper disposed = DisposableHelper.DISPOSED;
            if (a != disposed && this.compareAndSet(a, (a)disposed)) {
                DisposableHelper.dispose((AtomicReference)this.task);
                this.downstream.onSuccess((Object)t);
            }
        }
        
        public void run() {
            final a a = this.get();
            final DisposableHelper disposed = DisposableHelper.DISPOSED;
            if (a != disposed && this.compareAndSet(a, (a)disposed)) {
                if (a != null) {
                    a.dispose();
                }
                final g0<? extends T> other = this.other;
                if (other == null) {
                    this.downstream.onError((Throwable)new TimeoutException(ExceptionHelper.c(this.timeout, this.unit)));
                }
                else {
                    this.other = null;
                    other.a((e0)this.fallback);
                }
            }
        }
        
        public static final class TimeoutFallbackObserver<T> extends AtomicReference<a> implements e0<T>
        {
            private static final long serialVersionUID = 2071387740092105509L;
            public final e0<? super T> downstream;
            
            public TimeoutFallbackObserver(final e0<? super T> downstream) {
                this.downstream = downstream;
            }
            
            public void onError(final Throwable t) {
                this.downstream.onError(t);
            }
            
            public void onSubscribe(final a a) {
                DisposableHelper.setOnce((AtomicReference)this, a);
            }
            
            public void onSuccess(final T t) {
                this.downstream.onSuccess((Object)t);
            }
        }
    }
}
