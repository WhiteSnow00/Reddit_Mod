// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import ej2.c0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import if2.a;
import java.util.concurrent.atomic.AtomicLong;
import ff2.l;
import qt2.d;
import java.util.concurrent.atomic.AtomicReference;
import ff2.p;
import qt2.c;
import ff2.n;
import qt2.b;
import kf2.o;
import ff2.r;
import ff2.g;

public final class MaybeFlatMapPublisher<T, R> extends g<R>
{
    public final r<T> f;
    public final o<? super T, ? extends b<? extends R>> g;
    
    public MaybeFlatMapPublisher(final n f, final m3.b g) {
        this.f = (r<T>)f;
        this.g = (o<? super T, ? extends b<? extends R>>)g;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        this.f.b((p)new FlatMapPublisherSubscriber((qt2.c<? super Object>)c, (kf2.o<? super Object, ? extends qt2.b<?>>)this.g));
    }
    
    public static final class FlatMapPublisherSubscriber<T, R> extends AtomicReference<d> implements l<R>, p<T>, d
    {
        private static final long serialVersionUID = -8948264376121066672L;
        public final c<? super R> downstream;
        public final o<? super T, ? extends b<? extends R>> mapper;
        public final AtomicLong requested;
        public a upstream;
        
        public FlatMapPublisherSubscriber(final c<? super R> downstream, final o<? super T, ? extends b<? extends R>> mapper) {
            this.downstream = downstream;
            this.mapper = mapper;
            this.requested = new AtomicLong();
        }
        
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }
        
        public void onComplete() {
            this.downstream.onComplete();
        }
        
        public void onError(final Throwable t) {
            this.downstream.onError(t);
        }
        
        public void onNext(final R r) {
            this.downstream.onNext((Object)r);
        }
        
        public void onSubscribe(final a upstream) {
            if (DisposableHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
            }
        }
        
        public void onSubscribe(final d d) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, d);
        }
        
        public void onSuccess(final T t) {
            try {
                final Object apply = this.mapper.apply((Object)t);
                mf2.a.b(apply, "The mapper returned a null Publisher");
                ((b)apply).subscribe((c)this);
            }
            finally {
                final Throwable t2;
                c0.i4(t2);
                this.downstream.onError(t2);
            }
        }
        
        public void request(final long n) {
            SubscriptionHelper.deferredRequest(this, this.requested, n);
        }
    }
}
