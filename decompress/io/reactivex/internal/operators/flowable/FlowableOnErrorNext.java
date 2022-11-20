// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import af2.l;
import nt2.d;
import nt2.c;
import af2.g;
import nt2.b;
import ff2.o;
import lf2.a;

public final class FlowableOnErrorNext<T> extends a<T, T>
{
    public final o<? super Throwable, ? extends b<? extends T>> g;
    public final boolean h;
    
    public FlowableOnErrorNext(final g<T> g, final o<? super Throwable, ? extends b<? extends T>> g2, final boolean h) {
        super(g);
        this.g = g2;
        this.h = h;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber<Object>((nt2.c<? super T>)c, (ff2.o<? super Throwable, ? extends nt2.b<? extends T>>)this.g, this.h);
        c.onSubscribe((d)onErrorNextSubscriber);
        super.f.subscribe(onErrorNextSubscriber);
    }
    
    public static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements l<T>
    {
        private static final long serialVersionUID = 4063763155303814625L;
        public final boolean allowFatal;
        public boolean done;
        public final c<? super T> downstream;
        public final o<? super Throwable, ? extends b<? extends T>> nextSupplier;
        public boolean once;
        public long produced;
        
        public OnErrorNextSubscriber(final c<? super T> downstream, final o<? super Throwable, ? extends b<? extends T>> nextSupplier, final boolean allowFatal) {
            super(false);
            this.downstream = downstream;
            this.nextSupplier = nextSupplier;
            this.allowFatal = allowFatal;
        }
        
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.once = true;
            this.downstream.onComplete();
        }
        
        public void onError(final Throwable t) {
            if (this.once) {
                if (this.done) {
                    RxJavaPlugins.onError(t);
                    return;
                }
                this.downstream.onError(t);
            }
            else {
                this.once = true;
                if (this.allowFatal && !(t instanceof Exception)) {
                    this.downstream.onError(t);
                    return;
                }
                try {
                    final Object apply = this.nextSupplier.apply((Object)t);
                    hf2.a.b(apply, "The nextSupplier returned a null Publisher");
                    final b b = (b)apply;
                    final long produced = this.produced;
                    if (produced != 0L) {
                        this.produced(produced);
                    }
                    b.subscribe((c)this);
                }
                finally {
                    final Throwable t2;
                    xd.a.t1(t2);
                    this.downstream.onError((Throwable)new CompositeException(new Throwable[] { t, t2 }));
                }
            }
        }
        
        public void onNext(final T t) {
            if (this.done) {
                return;
            }
            if (!this.once) {
                ++this.produced;
            }
            this.downstream.onNext((Object)t);
        }
        
        @Override
        public void onSubscribe(final d subscription) {
            this.setSubscription(subscription);
        }
    }
}
