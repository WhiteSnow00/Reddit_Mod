// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nt2.d;
import java.util.concurrent.atomic.AtomicInteger;
import af2.l;
import nt2.c;
import af2.g;
import lf2.a;

public final class FlowableOnBackpressureLatest<T> extends a<T, T>
{
    public FlowableOnBackpressureLatest(final g<T> g) {
        super(g);
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe(new BackpressureLatestSubscriber<Object>((nt2.c<? super T>)c));
    }
    
    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements l<T>, d
    {
        private static final long serialVersionUID = 163080509307634843L;
        public volatile boolean cancelled;
        public final AtomicReference<T> current;
        public volatile boolean done;
        public final c<? super T> downstream;
        public Throwable error;
        public final AtomicLong requested;
        public d upstream;
        
        public BackpressureLatestSubscriber(final c<? super T> downstream) {
            this.requested = new AtomicLong();
            this.current = new AtomicReference<T>();
            this.downstream = downstream;
        }
        
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (this.getAndIncrement() == 0) {
                    this.current.lazySet(null);
                }
            }
        }
        
        public boolean checkTerminated(final boolean b, final boolean b2, final c<?> c, final AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (b) {
                final Throwable error = this.error;
                if (error != null) {
                    atomicReference.lazySet(null);
                    c.onError(error);
                    return true;
                }
                if (b2) {
                    c.onComplete();
                    return true;
                }
            }
            return false;
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super T> downstream = this.downstream;
            final AtomicLong requested = this.requested;
            final AtomicReference<T> current = this.current;
            int addAndGet = 1;
            do {
                long n = 0L;
                boolean b;
                while (true) {
                    final long value = requested.get();
                    b = false;
                    if (n == value) {
                        break;
                    }
                    final boolean done = this.done;
                    final T andSet = current.getAndSet(null);
                    final boolean b2 = andSet == null;
                    if (this.checkTerminated(done, b2, downstream, current)) {
                        return;
                    }
                    if (b2) {
                        break;
                    }
                    downstream.onNext((Object)andSet);
                    ++n;
                }
                if (n == requested.get()) {
                    final boolean done2 = this.done;
                    boolean b3 = b;
                    if (current.get() == null) {
                        b3 = true;
                    }
                    if (this.checkTerminated(done2, b3, downstream, current)) {
                        return;
                    }
                }
                if (n != 0L) {
                    cg.d.E3(requested, n);
                }
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
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
            this.current.lazySet(t);
            this.drain();
        }
        
        @Override
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
                upstream.request(Long.MAX_VALUE);
            }
        }
        
        public void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                cg.d.w0(this.requested, n);
                this.drain();
            }
        }
    }
}
