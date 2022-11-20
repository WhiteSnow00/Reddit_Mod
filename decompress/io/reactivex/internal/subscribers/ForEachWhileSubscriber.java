// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import ff2.q;
import ff2.g;
import df2.a;
import af2.l;
import nt2.d;
import java.util.concurrent.atomic.AtomicReference;

public final class ForEachWhileSubscriber<T> extends AtomicReference<d> implements l<T>, a
{
    private static final long serialVersionUID = -4403180040475402120L;
    public boolean done;
    public final ff2.a onComplete;
    public final g<? super Throwable> onError;
    public final q<? super T> onNext;
    
    public ForEachWhileSubscriber(final q<? super T> onNext, final g<? super Throwable> onError, final ff2.a onComplete) {
        this.onNext = onNext;
        this.onError = onError;
        this.onComplete = onComplete;
    }
    
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }
    
    public boolean isDisposed() {
        return this.get() == SubscriptionHelper.CANCELLED;
    }
    
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        try {
            this.onComplete.run();
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            RxJavaPlugins.onError(t);
        }
    }
    
    public void onError(final Throwable t) {
        if (this.done) {
            RxJavaPlugins.onError(t);
            return;
        }
        this.done = true;
        try {
            this.onError.accept((Object)t);
        }
        finally {
            final Throwable t2;
            xd.a.t1(t2);
            RxJavaPlugins.onError((Throwable)new CompositeException(new Throwable[] { t, t2 }));
        }
    }
    
    public void onNext(final T t) {
        if (this.done) {
            return;
        }
        try {
            if (!this.onNext.test((Object)t)) {
                this.dispose();
                this.onComplete();
            }
        }
        finally {
            final Throwable t2;
            xd.a.t1(t2);
            this.dispose();
            this.onError(t2);
        }
    }
    
    @Override
    public void onSubscribe(final d d) {
        SubscriptionHelper.setOnce(this, d, Long.MAX_VALUE);
    }
}
