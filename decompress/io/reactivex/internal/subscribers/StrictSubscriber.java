// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscribers;

import xd.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.util.AtomicThrowable;
import nt2.c;
import nt2.d;
import af2.l;
import java.util.concurrent.atomic.AtomicInteger;

public class StrictSubscriber<T> extends AtomicInteger implements l<T>, d
{
    private static final long serialVersionUID = -4945028590049415624L;
    public volatile boolean done;
    public final c<? super T> downstream;
    public final AtomicThrowable error;
    public final AtomicBoolean once;
    public final AtomicLong requested;
    public final AtomicReference<d> upstream;
    
    public StrictSubscriber(final c<? super T> downstream) {
        this.downstream = downstream;
        this.error = new AtomicThrowable();
        this.requested = new AtomicLong();
        this.upstream = new AtomicReference<d>();
        this.once = new AtomicBoolean();
    }
    
    public void cancel() {
        if (!this.done) {
            SubscriptionHelper.cancel(this.upstream);
        }
    }
    
    public void onComplete() {
        this.done = true;
        a.z0((c)this.downstream, (AtomicInteger)this, this.error);
    }
    
    public void onError(final Throwable t) {
        this.done = true;
        a.B0((c)this.downstream, t, (AtomicInteger)this, this.error);
    }
    
    public void onNext(final T t) {
        a.D0((c)this.downstream, (Object)t, (AtomicInteger)this, this.error);
    }
    
    @Override
    public void onSubscribe(final d d) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe((d)this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, d);
        }
        else {
            d.cancel();
            this.cancel();
            this.onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }
    
    public void request(final long n) {
        if (n <= 0L) {
            this.cancel();
            this.onError(new IllegalArgumentException(m5.a.e("§3.9 violated: positive request amount required but it was ", n)));
        }
        else {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, n);
        }
    }
}
