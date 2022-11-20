// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import nt2.d;
import java.util.concurrent.atomic.AtomicLong;
import af2.l;
import nt2.c;
import af2.g;
import lf2.a;

public final class FlowableLimit<T> extends a<T, T>
{
    public final long g;
    
    public FlowableLimit(final long g, final g g2) {
        super(g2);
        this.g = g;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe(new LimitSubscriber<Object>((nt2.c<? super T>)c, this.g));
    }
    
    public static final class LimitSubscriber<T> extends AtomicLong implements l<T>, d
    {
        private static final long serialVersionUID = 2288246011222124525L;
        public final c<? super T> downstream;
        public long remaining;
        public d upstream;
        
        public LimitSubscriber(final c<? super T> downstream, final long remaining) {
            this.downstream = downstream;
            this.lazySet(this.remaining = remaining);
        }
        
        public void cancel() {
            this.upstream.cancel();
        }
        
        public void onComplete() {
            if (this.remaining > 0L) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }
        
        public void onError(final Throwable t) {
            if (this.remaining > 0L) {
                this.remaining = 0L;
                this.downstream.onError(t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            final long remaining = this.remaining;
            if (remaining > 0L) {
                final long remaining2 = remaining - 1L;
                this.remaining = remaining2;
                this.downstream.onNext((Object)t);
                if (remaining2 == 0L) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }
        
        @Override
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                if (this.remaining == 0L) {
                    upstream.cancel();
                    EmptySubscription.complete((c)this.downstream);
                }
                else {
                    this.upstream = upstream;
                    this.downstream.onSubscribe((d)this);
                }
            }
        }
        
        public void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                long value;
                long n2;
                do {
                    value = this.get();
                    if (value == 0L) {
                        return;
                    }
                    if (value <= n) {
                        n2 = value;
                    }
                    else {
                        n2 = n;
                    }
                } while (!this.compareAndSet(value, value - n2));
                this.upstream.request(n2);
            }
        }
    }
}
