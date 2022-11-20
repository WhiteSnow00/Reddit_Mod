// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscribers;

import io.reactivex.internal.util.NotificationLite;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Queue;
import af2.l;
import nt2.d;
import java.util.concurrent.atomic.AtomicReference;

public final class BlockingSubscriber<T> extends AtomicReference<d> implements l<T>, d
{
    public static final Object TERMINATED;
    private static final long serialVersionUID = -4875965440900746268L;
    public final Queue<Object> queue;
    
    static {
        TERMINATED = new Object();
    }
    
    public BlockingSubscriber(final Queue<Object> queue) {
        this.queue = queue;
    }
    
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(BlockingSubscriber.TERMINATED);
        }
    }
    
    public boolean isCancelled() {
        return this.get() == SubscriptionHelper.CANCELLED;
    }
    
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }
    
    public void onError(final Throwable t) {
        this.queue.offer(NotificationLite.error(t));
    }
    
    public void onNext(final T t) {
        this.queue.offer(NotificationLite.next((Object)t));
    }
    
    @Override
    public void onSubscribe(final d d) {
        if (SubscriptionHelper.setOnce(this, d)) {
            this.queue.offer(NotificationLite.subscription((d)this));
        }
    }
    
    public void request(final long n) {
        this.get().request(n);
    }
}
