// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import ag2.g;
import ff2.a0;
import ff2.y;
import ff2.b0;
import java.util.concurrent.TimeUnit;
import sf2.a;

public final class ObservableThrottleFirstTimed<T> extends a<T, T>
{
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    
    public ObservableThrottleFirstTimed(final long g, final TimeUnit h, final y y, final b0 i) {
        super(y);
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        super.f.subscribe((a0)new DebounceTimedObserver((ff2.a0<? super Object>)new g((a0)a0), this.g, this.h, this.i.a()));
    }
    
    public static final class DebounceTimedObserver<T> extends AtomicReference<if2.a> implements a0<T>, if2.a, Runnable
    {
        private static final long serialVersionUID = 786994795061867455L;
        public boolean done;
        public final a0<? super T> downstream;
        public volatile boolean gate;
        public final long timeout;
        public final TimeUnit unit;
        public if2.a upstream;
        public final b0.c worker;
        
        public DebounceTimedObserver(final a0<? super T> downstream, final long timeout, final TimeUnit unit, final b0.c worker) {
            this.downstream = downstream;
            this.timeout = timeout;
            this.unit = unit;
            this.worker = worker;
        }
        
        public void dispose() {
            this.upstream.dispose();
            ((if2.a)this.worker).dispose();
        }
        
        public boolean isDisposed() {
            return ((if2.a)this.worker).isDisposed();
        }
        
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
                ((if2.a)this.worker).dispose();
            }
        }
        
        public void onError(final Throwable t) {
            if (this.done) {
                RxJavaPlugins.onError(t);
            }
            else {
                this.done = true;
                this.downstream.onError(t);
                ((if2.a)this.worker).dispose();
            }
        }
        
        public void onNext(final T t) {
            if (!this.gate && !this.done) {
                this.gate = true;
                this.downstream.onNext((Object)t);
                final if2.a a = this.get();
                if (a != null) {
                    a.dispose();
                }
                DisposableHelper.replace((AtomicReference)this, this.worker.c(this, this.timeout, this.unit));
            }
        }
        
        public void onSubscribe(final if2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
            }
        }
        
        public void run() {
            this.gate = false;
        }
    }
}
