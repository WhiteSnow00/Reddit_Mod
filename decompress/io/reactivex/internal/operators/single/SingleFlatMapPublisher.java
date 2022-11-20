// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import df2.a;
import nt2.d;
import af2.l;
import java.util.concurrent.atomic.AtomicLong;
import af2.e0;
import nt2.c;
import nt2.b;
import ff2.o;
import af2.g0;
import af2.g;

public final class SingleFlatMapPublisher<T, R> extends g<R>
{
    public final g0<T> f;
    public final o<? super T, ? extends b<? extends R>> g;
    
    public SingleFlatMapPublisher(final g0<T> f, final o<? super T, ? extends b<? extends R>> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        this.f.a((e0)new SingleFlatMapPublisherObserver((nt2.c<? super Object>)c, (ff2.o<? super Object, ? extends nt2.b<?>>)this.g));
    }
    
    public static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements e0<S>, l<T>, d
    {
        private static final long serialVersionUID = 7759721921468635667L;
        public a disposable;
        public final c<? super T> downstream;
        public final o<? super S, ? extends b<? extends T>> mapper;
        public final AtomicReference<d> parent;
        
        public SingleFlatMapPublisherObserver(final c<? super T> downstream, final o<? super S, ? extends b<? extends T>> mapper) {
            this.downstream = downstream;
            this.mapper = mapper;
            this.parent = new AtomicReference<d>();
        }
        
        public void cancel() {
            this.disposable.dispose();
            SubscriptionHelper.cancel(this.parent);
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
        
        public void onSubscribe(final a disposable) {
            this.disposable = disposable;
            this.downstream.onSubscribe((d)this);
        }
        
        public void onSubscribe(final d d) {
            SubscriptionHelper.deferredSetOnce(this.parent, this, d);
        }
        
        public void onSuccess(final S n) {
            try {
                final Object apply = this.mapper.apply((Object)n);
                hf2.a.b(apply, "the mapper returned a null Publisher");
                ((b)apply).subscribe((c)this);
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                this.downstream.onError(t);
            }
        }
        
        public void request(final long n) {
            SubscriptionHelper.deferredRequest(this.parent, this, n);
        }
    }
}
