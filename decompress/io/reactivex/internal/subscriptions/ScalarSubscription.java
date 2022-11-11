// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscriptions;

import qt2.c;
import nf2.g;
import java.util.concurrent.atomic.AtomicInteger;

public final class ScalarSubscription<T> extends AtomicInteger implements g<T>
{
    public static final int CANCELLED = 2;
    public static final int NO_REQUEST = 0;
    public static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    public final c<? super T> subscriber;
    public final T value;
    
    public ScalarSubscription(final c<? super T> subscriber, final T value) {
        this.subscriber = subscriber;
        this.value = value;
    }
    
    public void cancel() {
        this.lazySet(2);
    }
    
    public void clear() {
        this.lazySet(1);
    }
    
    public boolean isCancelled() {
        return this.get() == 2;
    }
    
    public boolean isEmpty() {
        return this.get() != 0;
    }
    
    public boolean offer(final T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    public boolean offer(final T t, final T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    public T poll() {
        if (this.get() == 0) {
            this.lazySet(1);
            return this.value;
        }
        return null;
    }
    
    public void request(final long n) {
        if (!SubscriptionHelper.validate(n)) {
            return;
        }
        if (this.compareAndSet(0, 1)) {
            final c<? super T> subscriber = this.subscriber;
            subscriber.onNext((Object)this.value);
            if (this.get() != 2) {
                subscriber.onComplete();
            }
        }
    }
    
    public int requestFusion(final int n) {
        return n & 0x1;
    }
}
