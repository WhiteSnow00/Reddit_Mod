// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import qt2.d;
import ff2.l;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.EmptySubscription;
import ej2.c0;
import mf2.a;
import qt2.c;
import qt2.b;
import kf2.o;
import java.util.concurrent.Callable;
import ff2.g;

public final class FlowableUsing<T, D> extends g<T>
{
    public final Callable<? extends D> f;
    public final o<? super D, ? extends b<? extends T>> g;
    public final kf2.g<? super D> h;
    public final boolean i;
    
    public FlowableUsing(final Callable<? extends D> f, final o<? super D, ? extends b<? extends T>> g, final kf2.g<? super D> h, final boolean i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        try {
            final D call = (D)this.f.call();
            try {
                final Object apply = this.g.apply((Object)call);
                a.b(apply, "The sourceSupplier returned a null Publisher");
                ((b)apply).subscribe((c)new UsingSubscriber((qt2.c<? super Object>)c, call, (kf2.g<? super Object>)this.h, this.i));
            }
            finally {
                final Throwable t;
                c0.i4(t);
                try {
                    this.h.accept((Object)call);
                    EmptySubscription.error(t, c);
                }
                finally {
                    final Throwable t2;
                    c0.i4(t2);
                    EmptySubscription.error(new CompositeException(new Throwable[] { t, t2 }), c);
                }
            }
        }
        finally {
            final Throwable t3;
            c0.i4(t3);
            EmptySubscription.error(t3, c);
        }
    }
    
    public static final class UsingSubscriber<T, D> extends AtomicBoolean implements l<T>, d
    {
        private static final long serialVersionUID = 5904473792286235046L;
        public final kf2.g<? super D> disposer;
        public final c<? super T> downstream;
        public final boolean eager;
        public final D resource;
        public d upstream;
        
        public UsingSubscriber(final c<? super T> downstream, final D resource, final kf2.g<? super D> disposer, final boolean eager) {
            this.downstream = downstream;
            this.resource = resource;
            this.disposer = disposer;
            this.eager = eager;
        }
        
        public void cancel() {
            this.disposeAfter();
            this.upstream.cancel();
        }
        
        public void disposeAfter() {
            if (this.compareAndSet(false, true)) {
                try {
                    this.disposer.accept((Object)this.resource);
                }
                finally {
                    final Throwable t;
                    c0.i4(t);
                    RxJavaPlugins.onError(t);
                }
            }
        }
        
        public void onComplete() {
            if (this.eager) {
                if (this.compareAndSet(false, true)) {
                    try {
                        this.disposer.accept((Object)this.resource);
                    }
                    finally {
                        final Throwable t;
                        c0.i4(t);
                        this.downstream.onError(t);
                        return;
                    }
                }
                this.upstream.cancel();
                this.downstream.onComplete();
            }
            else {
                this.downstream.onComplete();
                this.upstream.cancel();
                this.disposeAfter();
            }
        }
        
        public void onError(final Throwable t) {
            if (this.eager) {
                final Throwable t2 = null;
                if (this.compareAndSet(false, true)) {
                    try {
                        this.disposer.accept((Object)this.resource);
                    }
                    finally {
                        c0.i4(t2);
                    }
                }
                this.upstream.cancel();
                if (t2 != null) {
                    this.downstream.onError((Throwable)new CompositeException(new Throwable[] { t, t2 }));
                }
                else {
                    this.downstream.onError(t);
                }
            }
            else {
                this.downstream.onError(t);
                this.upstream.cancel();
                this.disposeAfter();
            }
        }
        
        public void onNext(final T t) {
            this.downstream.onNext((Object)t);
        }
        
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
            }
        }
        
        public void request(final long n) {
            this.upstream.request(n);
        }
    }
}
