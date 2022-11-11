// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import nf2.f;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nf2.j;
import ff2.l;
import java.util.concurrent.atomic.AtomicReference;
import qt2.c;
import kf2.d;
import qt2.b;
import ff2.g;

public final class FlowableSequenceEqual<T> extends g<Boolean>
{
    public final b<? extends T> f;
    public final b<? extends T> g;
    public final d<? super T, ? super T> h;
    public final int i;
    
    public FlowableSequenceEqual(final b<? extends T> f, final b<? extends T> g, final d<? super T, ? super T> h, final int i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final c<? super Boolean> c) {
        final FlowableSequenceEqual.FlowableSequenceEqual$EqualCoordinator flowableSequenceEqual$EqualCoordinator = new FlowableSequenceEqual.FlowableSequenceEqual$EqualCoordinator((c)c, this.i, (d)this.h);
        c.onSubscribe((qt2.d)flowableSequenceEqual$EqualCoordinator);
        flowableSequenceEqual$EqualCoordinator.subscribe((b)this.f, (b)this.g);
    }
    
    public static final class EqualSubscriber<T> extends AtomicReference<qt2.d> implements l<T>
    {
        private static final long serialVersionUID = 4804128302091633067L;
        public volatile boolean done;
        public final int limit;
        public final a parent;
        public final int prefetch;
        public long produced;
        public volatile j<T> queue;
        public int sourceMode;
        
        public EqualSubscriber(final a parent, final int prefetch) {
            this.parent = parent;
            this.limit = prefetch - (prefetch >> 2);
            this.prefetch = prefetch;
        }
        
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }
        
        public void clear() {
            final j<T> queue = this.queue;
            if (queue != null) {
                queue.clear();
            }
        }
        
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }
        
        public void onError(final Throwable t) {
            this.parent.innerError(t);
        }
        
        public void onNext(final T t) {
            if (this.sourceMode == 0 && !this.queue.offer((Object)t)) {
                this.onError(new MissingBackpressureException());
                return;
            }
            this.parent.drain();
        }
        
        public void onSubscribe(final qt2.d d) {
            if (SubscriptionHelper.setOnce(this, d)) {
                if (d instanceof nf2.g) {
                    final nf2.g g = (nf2.g)d;
                    final int requestFusion = ((f)g).requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = (j<T>)g;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = (j<T>)g;
                        d.request((long)this.prefetch);
                        return;
                    }
                }
                this.queue = (j<T>)new SpscArrayQueue(this.prefetch);
                d.request((long)this.prefetch);
            }
        }
        
        public void request() {
            if (this.sourceMode != 1) {
                final long produced = this.produced + 1L;
                if (produced >= this.limit) {
                    this.produced = 0L;
                    this.get().request(produced);
                }
                else {
                    this.produced = produced;
                }
            }
        }
    }
    
    public interface a
    {
        void drain();
        
        void innerError(final Throwable p0);
    }
}
