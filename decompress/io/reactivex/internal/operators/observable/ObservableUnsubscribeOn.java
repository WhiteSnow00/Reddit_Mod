// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import ff2.a0;
import ff2.y;
import ff2.b0;
import sf2.a;

public final class ObservableUnsubscribeOn<T> extends sf2.a<T, T>
{
    public final b0 g;
    
    public ObservableUnsubscribeOn(final y<T> y, final b0 g) {
        super((y)y);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        super.f.subscribe((a0)new UnsubscribeObserver((ff2.a0<? super Object>)a0, this.g));
    }
    
    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements a0<T>, if2.a
    {
        private static final long serialVersionUID = 1015244841293359600L;
        public final a0<? super T> downstream;
        public final b0 scheduler;
        public if2.a upstream;
        
        public UnsubscribeObserver(final a0<? super T> downstream, final b0 scheduler) {
            this.downstream = downstream;
            this.scheduler = scheduler;
        }
        
        public void dispose() {
            if (this.compareAndSet(false, true)) {
                this.scheduler.c((Runnable)new a());
            }
        }
        
        public boolean isDisposed() {
            return this.get();
        }
        
        public void onComplete() {
            if (!this.get()) {
                this.downstream.onComplete();
            }
        }
        
        public void onError(final Throwable t) {
            if (this.get()) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            if (!this.get()) {
                this.downstream.onNext((Object)t);
            }
        }
        
        public void onSubscribe(final if2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
            }
        }
        
        public final class a implements Runnable
        {
            @Override
            public final void run() {
                UnsubscribeObserver.this.upstream.dispose();
            }
        }
    }
}
