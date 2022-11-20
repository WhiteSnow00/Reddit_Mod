// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import nt2.d;
import java.util.concurrent.atomic.AtomicLong;
import af2.l;
import nt2.c;
import ff2.g;
import lf2.a;

public final class FlowableOnBackpressureDrop<T> extends a<T, T> implements ff2.g<T>
{
    public final ff2.g<? super T> g;
    
    public FlowableOnBackpressureDrop(final g<T> g) {
        super(g);
        this.g = (ff2.g<? super T>)this;
    }
    
    public FlowableOnBackpressureDrop(final g<T> g, final ff2.g<? super T> g2) {
        super(g);
        this.g = g2;
    }
    
    public final void accept(final T t) {
    }
    
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe(new BackpressureDropSubscriber<Object>((nt2.c<? super T>)c, (ff2.g<? super T>)this.g));
    }
    
    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements l<T>, d
    {
        private static final long serialVersionUID = -6246093802440953054L;
        public boolean done;
        public final c<? super T> downstream;
        public final ff2.g<? super T> onDrop;
        public d upstream;
        
        public BackpressureDropSubscriber(final c<? super T> downstream, final ff2.g<? super T> onDrop) {
            this.downstream = downstream;
            this.onDrop = onDrop;
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
                try {
                    this.onDrop.accept((Object)t);
                }
                finally {
                    final Throwable t2;
                    xd.a.t1(t2);
                    this.cancel();
                    this.onError(t2);
                }
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
