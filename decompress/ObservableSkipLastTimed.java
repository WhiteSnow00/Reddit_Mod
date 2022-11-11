// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import ff2.a0;
import ff2.y;
import ff2.b0;
import java.util.concurrent.TimeUnit;
import sf2.a;

public final class ObservableSkipLastTimed<T> extends a<T, T>
{
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    public final int j;
    public final boolean k;
    
    public ObservableSkipLastTimed(final y<T> y, final long g, final TimeUnit h, final b0 i, final int j, final boolean k) {
        super((y)y);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        super.f.subscribe((a0)new SkipLastTimedObserver((ff2.a0<? super Object>)a0, this.g, this.h, this.i, this.j, this.k));
    }
    
    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements a0<T>, if2.a
    {
        private static final long serialVersionUID = -5677354903406201275L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public final a0<? super T> downstream;
        public Throwable error;
        public final vf2.a<Object> queue;
        public final b0 scheduler;
        public final long time;
        public final TimeUnit unit;
        public if2.a upstream;
        
        public SkipLastTimedObserver(final a0<? super T> downstream, final long time, final TimeUnit unit, final b0 scheduler, final int n, final boolean delayError) {
            this.downstream = downstream;
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
                if (this.getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final a0<? super T> downstream = this.downstream;
            final vf2.a<Object> queue = this.queue;
            final boolean delayError = this.delayError;
            final TimeUnit unit = this.unit;
            final b0 scheduler = this.scheduler;
            final long time = this.time;
            int addAndGet = 1;
            while (!this.cancelled) {
                final boolean done = this.done;
                final Long n = queue.b();
                final boolean b = n == null;
                scheduler.getClass();
                final long b2 = b0.b(unit);
                boolean b3 = b;
                if (!b) {
                    b3 = b;
                    if (n > b2 - time) {
                        b3 = true;
                    }
                }
                if (done) {
                    if (delayError) {
                        if (b3) {
                            final Throwable error = this.error;
                            if (error != null) {
                                downstream.onError(error);
                            }
                            else {
                                downstream.onComplete();
                            }
                            return;
                        }
                    }
                    else {
                        final Throwable error2 = this.error;
                        if (error2 != null) {
                            this.queue.clear();
                            downstream.onError(error2);
                            return;
                        }
                        if (b3) {
                            downstream.onComplete();
                            return;
                        }
                    }
                }
                if (b3) {
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    queue.poll();
                    downstream.onNext(queue.poll());
                }
            }
            this.queue.clear();
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
            final vf2.a<Object> queue = this.queue;
            final b0 scheduler = this.scheduler;
            final TimeUnit unit = this.unit;
            scheduler.getClass();
            queue.a(b0.b(unit), t);
            this.drain();
        }
        
        public void onSubscribe(final if2.a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
            }
        }
    }
}
