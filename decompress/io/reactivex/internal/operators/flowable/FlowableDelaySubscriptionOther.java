// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import af2.l;
import java.util.concurrent.atomic.AtomicLong;
import nt2.d;
import nt2.c;
import nt2.b;
import af2.g;

public final class FlowableDelaySubscriptionOther<T, U> extends g<T>
{
    public final b<? extends T> f;
    public final b<U> g;
    
    public FlowableDelaySubscriptionOther(final b<? extends T> f, final b<U> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final MainSubscriber mainSubscriber = new MainSubscriber((c<? super T>)c, (b<? extends T>)this.f);
        c.onSubscribe((d)mainSubscriber);
        this.g.subscribe((c)mainSubscriber.other);
    }
    
    public static final class MainSubscriber<T> extends AtomicLong implements l<T>, d
    {
        private static final long serialVersionUID = 2259811067697317255L;
        public final c<? super T> downstream;
        public final b<? extends T> main;
        public final OtherSubscriber other;
        public final AtomicReference<d> upstream;
        
        public MainSubscriber(final c<? super T> downstream, final b<? extends T> main) {
            this.downstream = downstream;
            this.main = main;
            this.other = new OtherSubscriber();
            this.upstream = new AtomicReference<d>();
        }
        
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            SubscriptionHelper.cancel(this.upstream);
        }
        
        public void next() {
            this.main.subscribe((c)this);
        }
        
        public void onComplete() {
            this.downstream.onComplete();
        }
        
        public void onError(final Throwable t) {
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            this.downstream.onNext((Object)t);
        }
        
        @Override
        public void onSubscribe(final d d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this, d);
        }
        
        public void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                SubscriptionHelper.deferredRequest(this.upstream, this, n);
            }
        }
        
        public final class OtherSubscriber extends AtomicReference<d> implements l<Object>
        {
            private static final long serialVersionUID = -3892798459447644106L;
            public final MainSubscriber this$0;
            
            public OtherSubscriber(final MainSubscriber this$0) {
                this.this$0 = this$0;
            }
            
            public void onComplete() {
                if ((d)this.get() != SubscriptionHelper.CANCELLED) {
                    this.this$0.next();
                }
            }
            
            public void onError(final Throwable t) {
                if ((d)this.get() != SubscriptionHelper.CANCELLED) {
                    this.this$0.downstream.onError(t);
                }
                else {
                    RxJavaPlugins.onError(t);
                }
            }
            
            public void onNext(final Object o) {
                final d d = this.get();
                final SubscriptionHelper cancelled = SubscriptionHelper.CANCELLED;
                if (d != cancelled) {
                    this.lazySet((d)cancelled);
                    d.cancel();
                    this.this$0.next();
                }
            }
            
            @Override
            public void onSubscribe(final d d) {
                if (SubscriptionHelper.setOnce(this, d)) {
                    d.request(Long.MAX_VALUE);
                }
            }
        }
    }
}
