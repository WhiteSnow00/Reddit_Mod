// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import ff2.a0;
import ff2.y;
import ff2.t;
import ff2.b0;
import java.util.concurrent.TimeUnit;
import sf2.a;

public final class ObservableThrottleLatest<T> extends a<T, T>
{
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    public final boolean j;
    
    public ObservableThrottleLatest(final t<T> t, final long g, final TimeUnit h, final b0 i, final boolean j) {
        super((y)t);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        super.f.subscribe((a0)new ThrottleLatestObserver((ff2.a0<? super Object>)a0, this.g, this.h, this.i.a(), this.j));
    }
    
    public static final class ThrottleLatestObserver<T> extends AtomicInteger implements a0<T>, if2.a, Runnable
    {
        private static final long serialVersionUID = -8296689127439125014L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final a0<? super T> downstream;
        public final boolean emitLast;
        public Throwable error;
        public final AtomicReference<T> latest;
        public final long timeout;
        public volatile boolean timerFired;
        public boolean timerRunning;
        public final TimeUnit unit;
        public if2.a upstream;
        public final b0.c worker;
        
        public ThrottleLatestObserver(final a0<? super T> downstream, final long timeout, final TimeUnit unit, final b0.c worker, final boolean emitLast) {
            this.downstream = downstream;
            this.timeout = timeout;
            this.unit = unit;
            this.worker = worker;
            this.emitLast = emitLast;
            this.latest = new AtomicReference<T>();
        }
        
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            ((if2.a)this.worker).dispose();
            if (this.getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final AtomicReference<T> latest = this.latest;
            final a0<? super T> downstream = this.downstream;
            int addAndGet = 1;
            while (!this.cancelled) {
                final boolean done = this.done;
                if (done && this.error != null) {
                    latest.lazySet(null);
                    downstream.onError(this.error);
                    ((if2.a)this.worker).dispose();
                    return;
                }
                final boolean b = latest.get() == null;
                if (done) {
                    final T andSet = latest.getAndSet(null);
                    if (!b && this.emitLast) {
                        downstream.onNext((Object)andSet);
                    }
                    downstream.onComplete();
                    ((if2.a)this.worker).dispose();
                    return;
                }
                if (b) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                }
                else if (!this.timerRunning || this.timerFired) {
                    downstream.onNext((Object)latest.getAndSet(null));
                    this.timerFired = false;
                    this.timerRunning = true;
                    this.worker.c(this, this.timeout, this.unit);
                    continue;
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
            latest.lazySet(null);
        }
        
        public boolean isDisposed() {
            return this.cancelled;
        }
        
        public void onComplete() {
            this.done = true;
            this.drain();
        }
        
        public void onError(final Throwable error) {
            this.error = error;
            this.done = true;
            this.drain();
        }
        
        public void onNext(final T t) {
            this.latest.set(t);
            this.drain();
        }
        
        public void onSubscribe(final if2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
            }
        }
        
        public void run() {
            this.timerFired = true;
            this.drain();
        }
    }
}
