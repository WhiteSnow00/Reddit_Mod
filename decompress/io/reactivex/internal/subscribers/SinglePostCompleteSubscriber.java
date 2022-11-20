// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.c;
import nt2.d;
import af2.l;
import java.util.concurrent.atomic.AtomicLong;

public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements l<T>, d
{
    public static final long COMPLETE_MASK = Long.MIN_VALUE;
    public static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    public final c<? super R> downstream;
    public long produced;
    public d upstream;
    public R value;
    
    public SinglePostCompleteSubscriber(final c<? super R> downstream) {
        this.downstream = downstream;
    }
    
    public void cancel() {
        this.upstream.cancel();
    }
    
    public final void complete(final R value) {
        final long produced = this.produced;
        if (produced != 0L) {
            cg.d.E3((AtomicLong)this, produced);
        }
        while (true) {
            final long value2 = this.get();
            if ((value2 & Long.MIN_VALUE) != 0x0L) {
                this.onDrop(value);
                return;
            }
            if ((value2 & Long.MAX_VALUE) != 0x0L) {
                this.lazySet(-9223372036854775807L);
                this.downstream.onNext((Object)value);
                this.downstream.onComplete();
                return;
            }
            this.value = value;
            if (this.compareAndSet(0L, Long.MIN_VALUE)) {
                return;
            }
            this.value = null;
        }
    }
    
    public abstract void onComplete();
    
    public void onDrop(final R r) {
    }
    
    public abstract void onError(final Throwable p0);
    
    public abstract void onNext(final T p0);
    
    @Override
    public void onSubscribe(final d upstream) {
        if (SubscriptionHelper.validate(this.upstream, upstream)) {
            this.upstream = upstream;
            this.downstream.onSubscribe((d)this);
        }
    }
    
    public final void request(final long n) {
        if (SubscriptionHelper.validate(n)) {
            long value;
            do {
                value = this.get();
                if ((value & Long.MIN_VALUE) != 0x0L) {
                    if (this.compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onNext((Object)this.value);
                        this.downstream.onComplete();
                    }
                    return;
                }
            } while (!this.compareAndSet(value, cg.d.y0(value, n)));
            this.upstream.request(n);
        }
    }
}
