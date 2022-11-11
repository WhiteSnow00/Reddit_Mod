// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import ff2.a0;
import ff2.y;
import ff2.b0;
import java.util.concurrent.TimeUnit;
import sf2.a;

public final class ObservableTakeLastTimed<T> extends a<T, T>
{
    public final long g;
    public final long h;
    public final TimeUnit i;
    public final b0 j;
    public final int k;
    public final boolean l;
    
    public ObservableTakeLastTimed(final y<T> y, final long g, final long h, final TimeUnit i, final b0 j, final int k, final boolean l) {
        super((y)y);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        super.f.subscribe((a0)new TakeLastTimedObserver((ff2.a0<? super Object>)a0, this.g, this.h, this.i, this.j, this.k, this.l));
    }
    
    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements a0<T>, if2.a
    {
        private static final long serialVersionUID = -5677354903406201275L;
        public volatile boolean cancelled;
        public final long count;
        public final boolean delayError;
        public final a0<? super T> downstream;
        public Throwable error;
        public final vf2.a<Object> queue;
        public final b0 scheduler;
        public final long time;
        public final TimeUnit unit;
        public if2.a upstream;
        
        public TakeLastTimedObserver(final a0<? super T> downstream, final long count, final long time, final TimeUnit unit, final b0 scheduler, final int n, final boolean delayError) {
            this.downstream = downstream;
            this.count = count;
            this.time = time;
            this.unit = unit;
            this.scheduler = scheduler;
            this.queue = new vf2.a<Object>(n);
            this.delayError = delayError;
        }
        
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                if (this.compareAndSet(false, true)) {
                    this.queue.clear();
                }
            }
        }
        
        public void drain() {
            if (!this.compareAndSet(false, true)) {
                return;
            }
            final a0<? super T> downstream = this.downstream;
            final vf2.a<Object> queue = this.queue;
            final boolean delayError = this.delayError;
            final b0 scheduler = this.scheduler;
            final TimeUnit unit = this.unit;
            scheduler.getClass();
            final long b = b0.b(unit);
            final long time = this.time;
            while (!this.cancelled) {
                if (!delayError) {
                    final Throwable error = this.error;
                    if (error != null) {
                        queue.clear();
                        downstream.onError(error);
                        return;
                    }
                }
                final Object poll = queue.poll();
                if (poll == null) {
                    final Throwable error2 = this.error;
                    if (error2 != null) {
                        downstream.onError(error2);
                    }
                    else {
                        downstream.onComplete();
                    }
                    return;
                }
                final Object poll2 = queue.poll();
                if ((long)poll < b - time) {
                    continue;
                }
                downstream.onNext(poll2);
            }
            queue.clear();
        }
        
        public boolean isDisposed() {
            return this.cancelled;
        }
        
        public void onComplete() {
            this.drain();
        }
        
        public void onError(final Throwable error) {
            this.error = error;
            this.drain();
        }
        
        public void onNext(final T t) {
            final vf2.a<Object> queue = this.queue;
            final b0 scheduler = this.scheduler;
            final TimeUnit unit = this.unit;
            scheduler.getClass();
            final long b = b0.b(unit);
            final long time = this.time;
            final long count = this.count;
            final boolean b2 = count == Long.MAX_VALUE;
            queue.a(b, t);
            while (!queue.isEmpty()) {
                if (queue.b() > b - time) {
                    if (b2) {
                        break;
                    }
                    long value = queue.m.get();
                    long value2;
                    long value3;
                    while (true) {
                        value2 = queue.f.get();
                        value3 = queue.m.get();
                        if (value == value3) {
                            break;
                        }
                        value = value3;
                    }
                    if ((int)(value2 - value3) >> 1 <= count) {
                        break;
                    }
                }
                queue.poll();
                queue.poll();
            }
        }
        
        public void onSubscribe(final if2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
            }
        }
    }
}
