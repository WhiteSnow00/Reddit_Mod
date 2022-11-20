// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.plugins.RxJavaPlugins;
import nt2.d;
import java.util.concurrent.atomic.AtomicLong;
import af2.l;
import nt2.c;
import af2.g;
import lf2.c0;
import lf2.a;

public final class FlowableOnBackpressureError<T> extends a<T, T>
{
    public FlowableOnBackpressureError(final c0 c0) {
        super(c0);
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe(new BackpressureErrorSubscriber<Object>((nt2.c<? super T>)c));
    }
    
    public static final class BackpressureErrorSubscriber<T> extends AtomicLong implements l<T>, d
    {
        private static final long serialVersionUID = -3176480756392482682L;
        public boolean done;
        public final c<? super T> downstream;
        public d upstream;
        
        public BackpressureErrorSubscriber(final c<? super T> downstream) {
            this.downstream = downstream;
        }
        
        public void cancel() {
            this.upstream.cancel();
        }
        
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }
        
        public void onError(final Throwable t) {
            if (this.done) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.done = true;
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            if (this.done) {
                return;
            }
            if (this.get() != 0L) {
                this.downstream.onNext((Object)t);
                cg.d.E3((AtomicLong)this, 1L);
            }
            else {
                this.onError((Throwable)new MissingBackpressureException("could not emit value due to lack of requests"));
            }
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
                cg.d.w0((AtomicLong)this, n);
            }
        }
    }
}
