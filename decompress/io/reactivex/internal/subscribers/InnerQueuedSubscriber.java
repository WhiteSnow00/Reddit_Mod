// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscribers;

import if2.f;
import io.reactivex.internal.queue.SpscArrayQueue;
import qf2.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import if2.j;
import sf2.g;
import af2.l;
import nt2.d;
import java.util.concurrent.atomic.AtomicReference;

public final class InnerQueuedSubscriber<T> extends AtomicReference<d> implements l<T>, d
{
    private static final long serialVersionUID = 22876611072430776L;
    public volatile boolean done;
    public int fusionMode;
    public final int limit;
    public final g<T> parent;
    public final int prefetch;
    public long produced;
    public volatile j<T> queue;
    
    public InnerQueuedSubscriber(final g<T> parent, final int prefetch) {
        this.parent = parent;
        this.prefetch = prefetch;
        this.limit = prefetch - (prefetch >> 2);
    }
    
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }
    
    public boolean isDone() {
        return this.done;
    }
    
    public void onComplete() {
        this.parent.innerComplete(this);
    }
    
    public void onError(final Throwable t) {
        this.parent.innerError(this, t);
    }
    
    public void onNext(final T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, (Object)t);
        }
        else {
            this.parent.drain();
        }
    }
    
    @Override
    public void onSubscribe(final d d) {
        if (SubscriptionHelper.setOnce(this, d)) {
            if (d instanceof if2.g) {
                final if2.g g = (if2.g)d;
                final int requestFusion = ((f)g).requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = (j<T>)g;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = (j<T>)g;
                    cg.d.K3(d, this.prefetch);
                    return;
                }
            }
            final int prefetch = this.prefetch;
            Object queue;
            if (prefetch < 0) {
                queue = new a(-prefetch);
            }
            else {
                queue = new SpscArrayQueue(prefetch);
            }
            this.queue = (j<T>)queue;
            cg.d.K3(d, this.prefetch);
        }
    }
    
    public j<T> queue() {
        return this.queue;
    }
    
    public void request(long produced) {
        if (this.fusionMode != 1) {
            produced += this.produced;
            if (produced >= this.limit) {
                this.produced = 0L;
                this.get().request(produced);
            }
            else {
                this.produced = produced;
            }
        }
    }
    
    public void requestOne() {
        if (this.fusionMode != 1) {
            final long produced = this.produced + 1L;
            if (produced == this.limit) {
                this.produced = 0L;
                this.get().request(produced);
            }
            else {
                this.produced = produced;
            }
        }
    }
    
    public void setDone() {
        this.done = true;
    }
}
