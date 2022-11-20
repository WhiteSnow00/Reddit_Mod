// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import nt2.d;
import java.util.concurrent.atomic.AtomicInteger;

public class SubscriptionArbiter extends AtomicInteger implements d
{
    private static final long serialVersionUID = -2189523197179400958L;
    public d actual;
    public final boolean cancelOnReplace;
    public volatile boolean cancelled;
    public final AtomicLong missedProduced;
    public final AtomicLong missedRequested;
    public final AtomicReference<d> missedSubscription;
    public long requested;
    public boolean unbounded;
    
    public SubscriptionArbiter(final boolean cancelOnReplace) {
        this.cancelOnReplace = cancelOnReplace;
        this.missedSubscription = new AtomicReference<d>();
        this.missedRequested = new AtomicLong();
        this.missedProduced = new AtomicLong();
    }
    
    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.drain();
        }
    }
    
    final void drain() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        this.drainLoop();
    }
    
    final void drainLoop() {
        int i = 1;
        d d = null;
        long n = 0L;
        long n4;
        d d2;
        do {
            d actual;
            if ((actual = this.missedSubscription.get()) != null) {
                actual = this.missedSubscription.getAndSet(null);
            }
            long n2;
            if ((n2 = this.missedRequested.get()) != 0L) {
                n2 = this.missedRequested.getAndSet(0L);
            }
            long n3;
            if ((n3 = this.missedProduced.get()) != 0L) {
                n3 = this.missedProduced.getAndSet(0L);
            }
            final d actual2 = this.actual;
            if (this.cancelled) {
                if (actual2 != null) {
                    actual2.cancel();
                    this.actual = null;
                }
                n4 = n;
                d2 = d;
                if (actual != null) {
                    actual.cancel();
                    n4 = n;
                    d2 = d;
                }
            }
            else {
                long requested;
                final long n5 = requested = this.requested;
                if (n5 != Long.MAX_VALUE) {
                    long y0;
                    final long n6 = y0 = cg.d.y0(n5, n2);
                    if (n6 != Long.MAX_VALUE) {
                        final long n7 = y0 = n6 - n3;
                        if (n7 < 0L) {
                            SubscriptionHelper.reportMoreProduced(n7);
                            y0 = 0L;
                        }
                    }
                    this.requested = y0;
                    requested = y0;
                }
                if (actual != null) {
                    if (actual2 != null && this.cancelOnReplace) {
                        actual2.cancel();
                    }
                    this.actual = actual;
                    n4 = n;
                    d2 = d;
                    if (requested != 0L) {
                        n4 = cg.d.y0(n, requested);
                        d2 = actual;
                    }
                }
                else {
                    n4 = n;
                    d2 = d;
                    if (actual2 != null) {
                        n4 = n;
                        d2 = d;
                        if (n2 != 0L) {
                            n4 = cg.d.y0(n, n2);
                            d2 = actual2;
                        }
                    }
                }
            }
            i = this.addAndGet(-i);
            n = n4;
            d = d2;
        } while (i != 0);
        if (n4 != 0L) {
            d2.request(n4);
        }
    }
    
    public final boolean isCancelled() {
        return this.cancelled;
    }
    
    public final boolean isUnbounded() {
        return this.unbounded;
    }
    
    public final void produced(long requested) {
        if (this.unbounded) {
            return;
        }
        if (this.get() != 0 || !this.compareAndSet(0, 1)) {
            cg.d.w0(this.missedProduced, requested);
            this.drain();
            return;
        }
        final long requested2 = this.requested;
        if (requested2 != Long.MAX_VALUE) {
            final long n = requested = requested2 - requested;
            if (n < 0L) {
                SubscriptionHelper.reportMoreProduced(n);
                requested = 0L;
            }
            this.requested = requested;
        }
        if (this.decrementAndGet() == 0) {
            return;
        }
        this.drainLoop();
    }
    
    public final void request(final long n) {
        if (SubscriptionHelper.validate(n)) {
            if (this.unbounded) {
                return;
            }
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                final long requested = this.requested;
                if (requested != Long.MAX_VALUE) {
                    final long y0 = cg.d.y0(requested, n);
                    this.requested = y0;
                    if (y0 == Long.MAX_VALUE) {
                        this.unbounded = true;
                    }
                }
                final d actual = this.actual;
                if (this.decrementAndGet() != 0) {
                    this.drainLoop();
                }
                if (actual != null) {
                    actual.request(n);
                }
                return;
            }
            cg.d.w0(this.missedRequested, n);
            this.drain();
        }
    }
    
    public final void setSubscription(d actual) {
        if (this.cancelled) {
            actual.cancel();
            return;
        }
        if (actual == null) {
            throw new NullPointerException("s is null");
        }
        if (this.get() == 0 && this.compareAndSet(0, 1)) {
            final d actual2 = this.actual;
            if (actual2 != null && this.cancelOnReplace) {
                actual2.cancel();
            }
            this.actual = actual;
            final long requested = this.requested;
            if (this.decrementAndGet() != 0) {
                this.drainLoop();
            }
            if (requested != 0L) {
                actual.request(requested);
            }
            return;
        }
        actual = this.missedSubscription.getAndSet(actual);
        if (actual != null && this.cancelOnReplace) {
            actual.cancel();
        }
        this.drain();
    }
}
