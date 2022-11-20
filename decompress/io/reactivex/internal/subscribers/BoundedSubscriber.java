// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import ff2.g;
import df2.a;
import af2.l;
import nt2.d;
import java.util.concurrent.atomic.AtomicReference;

public final class BoundedSubscriber<T> extends AtomicReference<d> implements l<T>, d, a
{
    private static final long serialVersionUID = -7251123623727029452L;
    public final int bufferSize;
    public int consumed;
    public final int limit;
    public final ff2.a onComplete;
    public final g<? super Throwable> onError;
    public final g<? super T> onNext;
    public final g<? super d> onSubscribe;
    
    public BoundedSubscriber(final g<? super T> onNext, final g<? super Throwable> onError, final ff2.a onComplete, final g<? super d> onSubscribe, final int bufferSize) {
        this.onNext = onNext;
        this.onError = onError;
        this.onComplete = onComplete;
        this.onSubscribe = onSubscribe;
        this.bufferSize = bufferSize;
        this.limit = bufferSize - (bufferSize >> 2);
    }
    
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }
    
    public void dispose() {
        this.cancel();
    }
    
    public boolean hasCustomOnError() {
        return this.onError != Functions.e;
    }
    
    public boolean isDisposed() {
        return this.get() == SubscriptionHelper.CANCELLED;
    }
    
    public void onComplete() {
        final SubscriptionHelper value = this.get();
        final SubscriptionHelper cancelled = SubscriptionHelper.CANCELLED;
        if (value != cancelled) {
            this.lazySet((d)cancelled);
            try {
                this.onComplete.run();
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                RxJavaPlugins.onError(t);
            }
        }
    }
    
    public void onError(final Throwable t) {
        final SubscriptionHelper value = this.get();
        final SubscriptionHelper cancelled = SubscriptionHelper.CANCELLED;
        if (value != cancelled) {
            this.lazySet((d)cancelled);
            try {
                this.onError.accept((Object)t);
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                RxJavaPlugins.onError((Throwable)new CompositeException(new Throwable[] { t, t2 }));
            }
        }
        else {
            RxJavaPlugins.onError(t);
        }
    }
    
    public void onNext(final T t) {
        if (!this.isDisposed()) {
            try {
                this.onNext.accept((Object)t);
                final int consumed = this.consumed + 1;
                if (consumed == this.limit) {
                    this.consumed = 0;
                    this.get().request((long)this.limit);
                }
                else {
                    this.consumed = consumed;
                }
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.get().cancel();
                this.onError(t2);
            }
        }
    }
    
    @Override
    public void onSubscribe(final d d) {
        if (SubscriptionHelper.setOnce(this, d)) {
            try {
                this.onSubscribe.accept((Object)this);
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                d.cancel();
                this.onError(t);
            }
        }
    }
    
    public void request(final long n) {
        this.get().request(n);
    }
}
