// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import af2.l;
import bg2.d;
import nt2.c;
import af2.g;
import af2.b0;
import java.util.concurrent.TimeUnit;
import lf2.a;

public final class FlowableDebounceTimed<T> extends a<T, T>
{
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    
    public FlowableDebounceTimed(final g<T> g, final long g2, final TimeUnit h, final b0 i) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe(new DebounceTimedSubscriber<Object>((nt2.c<? super T>)new d((c)c), this.g, this.h, this.i.a()));
    }
    
    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements l<T>, nt2.d
    {
        private static final long serialVersionUID = -9102637559663639004L;
        public boolean done;
        public final c<? super T> downstream;
        public volatile long index;
        public final long timeout;
        public df2.a timer;
        public final TimeUnit unit;
        public nt2.d upstream;
        public final b0.c worker;
        
        public DebounceTimedSubscriber(final c<? super T> downstream, final long timeout, final TimeUnit unit, final b0.c worker) {
            this.downstream = downstream;
            this.timeout = timeout;
            this.unit = unit;
            this.worker = worker;
        }
        
        public void cancel() {
            this.upstream.cancel();
            ((df2.a)this.worker).dispose();
        }
        
        public void emit(final long n, final T t, final FlowableDebounceTimed$DebounceEmitter<T> flowableDebounceTimed$DebounceEmitter) {
            if (n == this.index) {
                if (this.get() != 0L) {
                    this.downstream.onNext((Object)t);
                    cg.d.E3((AtomicLong)this, 1L);
                    flowableDebounceTimed$DebounceEmitter.dispose();
                }
                else {
                    this.cancel();
                    this.downstream.onError((Throwable)new MissingBackpressureException("Could not deliver value due to lack of requests"));
                }
            }
        }
        
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            final df2.a timer = this.timer;
            if (timer != null) {
                timer.dispose();
            }
            final FlowableDebounceTimed$DebounceEmitter flowableDebounceTimed$DebounceEmitter = (FlowableDebounceTimed$DebounceEmitter)timer;
            if (flowableDebounceTimed$DebounceEmitter != null) {
                flowableDebounceTimed$DebounceEmitter.emit();
            }
            this.downstream.onComplete();
            ((df2.a)this.worker).dispose();
        }
        
        public void onError(final Throwable t) {
            if (this.done) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.done = true;
            final df2.a timer = this.timer;
            if (timer != null) {
                timer.dispose();
            }
            this.downstream.onError(t);
            ((df2.a)this.worker).dispose();
        }
        
        public void onNext(final T t) {
            if (this.done) {
                return;
            }
            final long index = this.index + 1L;
            this.index = index;
            final df2.a timer = this.timer;
            if (timer != null) {
                timer.dispose();
            }
            final FlowableDebounceTimed$DebounceEmitter timer2 = new FlowableDebounceTimed$DebounceEmitter((Object)t, index, this);
            ((FlowableDebounceTimed$DebounceEmitter)(this.timer = (df2.a)timer2)).setResource(this.worker.c((Runnable)timer2, this.timeout, this.unit));
        }
        
        @Override
        public void onSubscribe(final nt2.d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((nt2.d)this);
                upstream.request(Long.MAX_VALUE);
            }
        }
        
        public void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                cg.d.w0((AtomicLong)this, n);
            }
        }
    }
}
