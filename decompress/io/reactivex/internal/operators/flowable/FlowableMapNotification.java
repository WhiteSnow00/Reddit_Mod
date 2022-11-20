// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import af2.l;
import nt2.c;
import af2.g;
import java.util.concurrent.Callable;
import ff2.o;
import lf2.a;

public final class FlowableMapNotification<T, R> extends a<T, R>
{
    public final o<? super T, ? extends R> g;
    public final o<? super Throwable, ? extends R> h;
    public final Callable<? extends R> i;
    
    public FlowableMapNotification(final g<T> g, final o<? super T, ? extends R> g2, final o<? super Throwable, ? extends R> h, final Callable<? extends R> i) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        super.f.subscribe(new MapNotificationSubscriber<Object, Object>(c, this.g, this.h, this.i));
    }
    
    public static final class MapNotificationSubscriber<T, R> extends SinglePostCompleteSubscriber<T, R>
    {
        private static final long serialVersionUID = 2757120512858778108L;
        public final Callable<? extends R> onCompleteSupplier;
        public final o<? super Throwable, ? extends R> onErrorMapper;
        public final o<? super T, ? extends R> onNextMapper;
        
        public MapNotificationSubscriber(final c<? super R> c, final o<? super T, ? extends R> onNextMapper, final o<? super Throwable, ? extends R> onErrorMapper, final Callable<? extends R> onCompleteSupplier) {
            super(c);
            this.onNextMapper = onNextMapper;
            this.onErrorMapper = onErrorMapper;
            this.onCompleteSupplier = onCompleteSupplier;
        }
        
        @Override
        public void onComplete() {
            try {
                final R call = (R)this.onCompleteSupplier.call();
                hf2.a.b((Object)call, "The onComplete publisher returned is null");
                this.complete(call);
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                super.downstream.onError(t);
            }
        }
        
        @Override
        public void onError(final Throwable t) {
            try {
                final Object apply = this.onErrorMapper.apply((Object)t);
                hf2.a.b(apply, "The onError publisher returned is null");
                this.complete((R)apply);
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                super.downstream.onError((Throwable)new CompositeException(new Throwable[] { t, t2 }));
            }
        }
        
        @Override
        public void onNext(final T t) {
            try {
                final Object apply = this.onNextMapper.apply((Object)t);
                hf2.a.b(apply, "The onNext publisher returned is null");
                ++super.produced;
                super.downstream.onNext(apply);
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                super.downstream.onError(t2);
            }
        }
    }
}
