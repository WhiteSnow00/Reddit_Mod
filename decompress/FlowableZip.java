// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import nf2.f;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nf2.j;
import ff2.l;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import qt2.d;
import io.reactivex.internal.subscriptions.EmptySubscription;
import qt2.c;
import kf2.o;
import qt2.b;
import ff2.g;

public final class FlowableZip<T, R> extends g<R>
{
    public final b<? extends T>[] f;
    public final Iterable<? extends b<? extends T>> g;
    public final o<? super Object[], ? extends R> h;
    public final int i;
    public final boolean j;
    
    public FlowableZip(final b<? extends T>[] f, final Iterable<? extends b<? extends T>> g, final o<? super Object[], ? extends R> h, final int i, final boolean j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        b[] f = this.f;
        int length;
        if (f == null) {
            b[] array = new b[8];
            final Iterator<? extends b<? extends T>> iterator = this.g.iterator();
            int n = 0;
            while (true) {
                f = array;
                length = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final b b = iterator.next();
                b[] array2 = array;
                if (n == array.length) {
                    array2 = new b[(n >> 2) + n];
                    System.arraycopy(array, 0, array2, 0, n);
                }
                array2[n] = b;
                ++n;
                array = array2;
            }
        }
        else {
            length = f.length;
        }
        if (length == 0) {
            EmptySubscription.complete(c);
            return;
        }
        final FlowableZip$ZipCoordinator flowableZip$ZipCoordinator = new FlowableZip$ZipCoordinator((c)c, (o)this.h, length, this.i, this.j);
        c.onSubscribe((d)flowableZip$ZipCoordinator);
        flowableZip$ZipCoordinator.subscribe(f, length);
    }
    
    public static final class ZipSubscriber<T, R> extends AtomicReference<d> implements l<T>, d
    {
        private static final long serialVersionUID = -4627193790118206028L;
        public volatile boolean done;
        public final int limit;
        public final FlowableZip$ZipCoordinator<T, R> parent;
        public final int prefetch;
        public long produced;
        public j<T> queue;
        public int sourceMode;
        
        public ZipSubscriber(final FlowableZip$ZipCoordinator<T, R> parent, final int prefetch) {
            this.parent = parent;
            this.prefetch = prefetch;
            this.limit = prefetch - (prefetch >> 2);
        }
        
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }
        
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }
        
        public void onError(final Throwable t) {
            this.parent.error(this, t);
        }
        
        public void onNext(final T t) {
            if (this.sourceMode != 2) {
                this.queue.offer((Object)t);
            }
            this.parent.drain();
        }
        
        public void onSubscribe(final d d) {
            if (SubscriptionHelper.setOnce(this, d)) {
                if (d instanceof nf2.g) {
                    final nf2.g g = (nf2.g)d;
                    final int requestFusion = ((f)g).requestFusion(7);
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
        
        public void request(long produced) {
            if (this.sourceMode != 1) {
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
    }
}
