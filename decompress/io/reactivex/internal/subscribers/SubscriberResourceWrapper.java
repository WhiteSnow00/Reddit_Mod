// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscribers;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.c;
import nt2.d;
import af2.l;
import df2.a;
import java.util.concurrent.atomic.AtomicReference;

public final class SubscriberResourceWrapper<T> extends AtomicReference<a> implements l<T>, a, d
{
    private static final long serialVersionUID = -8612022020200669122L;
    public final c<? super T> downstream;
    public final AtomicReference<d> upstream;
    
    public SubscriberResourceWrapper(final c<? super T> downstream) {
        this.upstream = new AtomicReference<d>();
        this.downstream = downstream;
    }
    
    public void cancel() {
        this.dispose();
    }
    
    public void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose((AtomicReference)this);
    }
    
    public boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }
    
    public void onComplete() {
        DisposableHelper.dispose((AtomicReference)this);
        this.downstream.onComplete();
    }
    
    public void onError(final Throwable t) {
        DisposableHelper.dispose((AtomicReference)this);
        this.downstream.onError(t);
    }
    
    public void onNext(final T t) {
        this.downstream.onNext((Object)t);
    }
    
    @Override
    public void onSubscribe(final d d) {
        if (SubscriptionHelper.setOnce(this.upstream, d)) {
            this.downstream.onSubscribe((d)this);
        }
    }
    
    public void request(final long n) {
        if (SubscriptionHelper.validate(n)) {
            this.upstream.get().request(n);
        }
    }
    
    public void setResource(final a a) {
        DisposableHelper.set((AtomicReference)this, a);
    }
}
