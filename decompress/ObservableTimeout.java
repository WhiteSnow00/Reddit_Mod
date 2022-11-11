// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import ff2.a0;
import ff2.t;
import kf2.o;
import ff2.y;
import sf2.a;

public final class ObservableTimeout<T, U, V> extends sf2.a<T, T>
{
    public final y<U> g;
    public final o<? super T, ? extends y<V>> h;
    public final y<? extends T> i;
    
    public ObservableTimeout(final t<T> t, final y<U> g, final o<? super T, ? extends y<V>> h, final y<? extends T> i) {
        super((y)t);
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        if (this.i == null) {
            final ObservableTimeout.ObservableTimeout$TimeoutObserver observableTimeout$TimeoutObserver = new ObservableTimeout.ObservableTimeout$TimeoutObserver((a0)a0, (o)this.h);
            a0.onSubscribe((if2.a)observableTimeout$TimeoutObserver);
            observableTimeout$TimeoutObserver.startFirstTimeout((y)this.g);
            super.f.subscribe((a0)observableTimeout$TimeoutObserver);
        }
        else {
            final ObservableTimeout.ObservableTimeout$TimeoutFallbackObserver observableTimeout$TimeoutFallbackObserver = new ObservableTimeout.ObservableTimeout$TimeoutFallbackObserver((a0)a0, (o)this.h, (y)this.i);
            a0.onSubscribe((if2.a)observableTimeout$TimeoutFallbackObserver);
            observableTimeout$TimeoutFallbackObserver.startFirstTimeout((y)this.g);
            super.f.subscribe((a0)observableTimeout$TimeoutFallbackObserver);
        }
    }
    
    public static final class TimeoutConsumer extends AtomicReference<if2.a> implements a0<Object>, if2.a
    {
        private static final long serialVersionUID = 8708641127342403073L;
        public final long idx;
        public final a parent;
        
        public TimeoutConsumer(final long idx, final a parent) {
            this.idx = idx;
            this.parent = parent;
        }
        
        public void dispose() {
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((if2.a)this.get());
        }
        
        public void onComplete() {
            final DisposableHelper value = ((AtomicReference<DisposableHelper>)this).get();
            final DisposableHelper disposed = DisposableHelper.DISPOSED;
            if (value != disposed) {
                this.lazySet((if2.a)disposed);
                ((ObservableTimeoutTimed.b)this.parent).onTimeout(this.idx);
            }
        }
        
        public void onError(final Throwable t) {
            final DisposableHelper value = ((AtomicReference<DisposableHelper>)this).get();
            final DisposableHelper disposed = DisposableHelper.DISPOSED;
            if (value != disposed) {
                this.lazySet((if2.a)disposed);
                this.parent.onTimeoutError(this.idx, t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final Object o) {
            final if2.a a = this.get();
            final DisposableHelper disposed = DisposableHelper.DISPOSED;
            if (a != disposed) {
                a.dispose();
                this.lazySet((if2.a)disposed);
                ((ObservableTimeoutTimed.b)this.parent).onTimeout(this.idx);
            }
        }
        
        public void onSubscribe(final if2.a a) {
            DisposableHelper.setOnce((AtomicReference)this, a);
        }
    }
    
    public interface a extends b
    {
        void onTimeoutError(final long p0, final Throwable p1);
    }
}
