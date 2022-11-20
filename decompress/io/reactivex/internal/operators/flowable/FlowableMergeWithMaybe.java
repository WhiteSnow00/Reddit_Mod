// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import if2.j;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import if2.i;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import af2.p;
import af2.l;
import nt2.d;
import nt2.c;
import af2.g;
import af2.r;
import lf2.a;

public final class FlowableMergeWithMaybe<T> extends a<T, T>
{
    public final r<? extends T> g;
    
    public FlowableMergeWithMaybe(final g<T> g, final r<? extends T> g2) {
        super(g);
        this.g = g2;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final MergeWithObserver mergeWithObserver = new MergeWithObserver<Object>((nt2.c<? super T>)c);
        c.onSubscribe((d)mergeWithObserver);
        super.f.subscribe(mergeWithObserver);
        this.g.a((p)mergeWithObserver.otherObserver);
    }
    
    public static final class MergeWithObserver<T> extends AtomicInteger implements l<T>, d
    {
        public static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        public static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        public volatile boolean cancelled;
        public int consumed;
        public final c<? super T> downstream;
        public long emitted;
        public final AtomicThrowable error;
        public final int limit;
        public volatile boolean mainDone;
        public final AtomicReference<d> mainSubscription;
        public final MergeWithObserver.FlowableMergeWithMaybe$MergeWithObserver$OtherObserver<T> otherObserver;
        public volatile int otherState;
        public final int prefetch;
        public volatile i<T> queue;
        public final AtomicLong requested;
        public T singleItem;
        
        public MergeWithObserver(final c<? super T> downstream) {
            this.downstream = downstream;
            this.mainSubscription = new AtomicReference<d>();
            this.otherObserver = (MergeWithObserver.FlowableMergeWithMaybe$MergeWithObserver$OtherObserver<T>)new MergeWithObserver.FlowableMergeWithMaybe$MergeWithObserver$OtherObserver(this);
            this.error = new AtomicThrowable();
            this.requested = new AtomicLong();
            final int bufferSize = g.bufferSize();
            this.prefetch = bufferSize;
            this.limit = bufferSize - (bufferSize >> 2);
        }
        
        public void cancel() {
            this.cancelled = true;
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose((AtomicReference)this.otherObserver);
            if (this.getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() == 0) {
                this.drainLoop();
            }
        }
        
        public void drainLoop() {
            final c<? super T> downstream = this.downstream;
            long emitted = this.emitted;
            int consumed = this.consumed;
            final int limit = this.limit;
            int addAndGet = 1;
            while (true) {
                final long value = this.requested.get();
                long n;
                while (true) {
                    n = lcmp(emitted, value);
                    if (n == 0) {
                        break;
                    }
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (((AtomicReference<Object>)this.error).get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        downstream.onError(this.error.terminate());
                        return;
                    }
                    final int otherState = this.otherState;
                    if (otherState == 1) {
                        final T singleItem = this.singleItem;
                        this.singleItem = null;
                        this.otherState = 2;
                        downstream.onNext((Object)singleItem);
                        ++emitted;
                    }
                    else {
                        final boolean mainDone = this.mainDone;
                        final i<T> queue = this.queue;
                        Object poll;
                        if (queue != null) {
                            poll = queue.poll();
                        }
                        else {
                            poll = null;
                        }
                        final boolean b = poll == null;
                        if (mainDone && b && otherState == 2) {
                            this.queue = null;
                            downstream.onComplete();
                            return;
                        }
                        if (b) {
                            break;
                        }
                        downstream.onNext(poll);
                        ++emitted;
                        if (++consumed != limit) {
                            continue;
                        }
                        this.mainSubscription.get().request((long)limit);
                        consumed = 0;
                    }
                }
                if (n == 0) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (((AtomicReference<Object>)this.error).get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        downstream.onError(this.error.terminate());
                        return;
                    }
                    final boolean mainDone2 = this.mainDone;
                    final i<T> queue2 = this.queue;
                    final boolean b2 = queue2 == null || ((j)queue2).isEmpty();
                    if (mainDone2 && b2 && this.otherState == 2) {
                        this.queue = null;
                        downstream.onComplete();
                        return;
                    }
                }
                this.emitted = emitted;
                this.consumed = consumed;
                addAndGet = this.addAndGet(-addAndGet);
                if (addAndGet == 0) {
                    return;
                }
            }
        }
        
        public i<T> getOrCreateQueue() {
            Object queue;
            if ((queue = this.queue) == null) {
                queue = new SpscArrayQueue(af2.g.bufferSize());
                this.queue = (i<T>)queue;
            }
            return (i<T>)queue;
        }
        
        public void onComplete() {
            this.mainDone = true;
            this.drain();
        }
        
        public void onError(final Throwable t) {
            if (this.error.addThrowable(t)) {
                DisposableHelper.dispose((AtomicReference)this.otherObserver);
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            if (this.compareAndSet(0, 1)) {
                final long emitted = this.emitted;
                if (this.requested.get() != emitted) {
                    final i<T> queue = this.queue;
                    if (queue != null && !((j)queue).isEmpty()) {
                        ((j)queue).offer((Object)t);
                    }
                    else {
                        this.emitted = emitted + 1L;
                        this.downstream.onNext((Object)t);
                        final int consumed = this.consumed + 1;
                        if (consumed == this.limit) {
                            this.consumed = 0;
                            this.mainSubscription.get().request((long)consumed);
                        }
                        else {
                            this.consumed = consumed;
                        }
                    }
                }
                else {
                    ((j)this.getOrCreateQueue()).offer((Object)t);
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            else {
                ((j)this.getOrCreateQueue()).offer((Object)t);
                if (this.getAndIncrement() != 0) {
                    return;
                }
            }
            this.drainLoop();
        }
        
        @Override
        public void onSubscribe(final d d) {
            SubscriptionHelper.setOnce(this.mainSubscription, d, this.prefetch);
        }
        
        public void otherComplete() {
            this.otherState = 2;
            this.drain();
        }
        
        public void otherError(final Throwable t) {
            if (this.error.addThrowable(t)) {
                SubscriptionHelper.cancel(this.mainSubscription);
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void otherSuccess(final T t) {
            if (this.compareAndSet(0, 1)) {
                final long emitted = this.emitted;
                if (this.requested.get() != emitted) {
                    this.emitted = emitted + 1L;
                    this.downstream.onNext((Object)t);
                    this.otherState = 2;
                }
                else {
                    this.singleItem = t;
                    this.otherState = 1;
                    if (this.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
            else {
                this.singleItem = t;
                this.otherState = 1;
                if (this.getAndIncrement() != 0) {
                    return;
                }
            }
            this.drainLoop();
        }
        
        public void request(final long n) {
            cg.d.w0(this.requested, n);
            this.drain();
        }
    }
}
