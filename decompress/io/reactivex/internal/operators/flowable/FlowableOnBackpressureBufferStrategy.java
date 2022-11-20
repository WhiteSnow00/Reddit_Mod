// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Deque;
import nt2.d;
import java.util.concurrent.atomic.AtomicInteger;
import af2.l;
import nt2.c;
import af2.g;
import io.reactivex.BackpressureOverflowStrategy;
import lf2.a;

public final class FlowableOnBackpressureBufferStrategy<T> extends a<T, T>
{
    public final long g;
    public final ff2.a h;
    public final BackpressureOverflowStrategy i;
    
    public FlowableOnBackpressureBufferStrategy(final g<T> g, final long g2, final ff2.a h, final BackpressureOverflowStrategy i) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe(new OnBackpressureBufferStrategySubscriber<Object>((nt2.c<? super T>)c, this.h, this.i, this.g));
    }
    
    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements l<T>, d
    {
        private static final long serialVersionUID = 3240706908776709697L;
        public final long bufferSize;
        public volatile boolean cancelled;
        public final Deque<T> deque;
        public volatile boolean done;
        public final c<? super T> downstream;
        public Throwable error;
        public final ff2.a onOverflow;
        public final AtomicLong requested;
        public final BackpressureOverflowStrategy strategy;
        public d upstream;
        
        public OnBackpressureBufferStrategySubscriber(final c<? super T> downstream, final ff2.a onOverflow, final BackpressureOverflowStrategy strategy, final long bufferSize) {
            this.downstream = downstream;
            this.onOverflow = onOverflow;
            this.strategy = strategy;
            this.bufferSize = bufferSize;
            this.requested = new AtomicLong();
            this.deque = new ArrayDeque<T>();
        }
        
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (this.getAndIncrement() == 0) {
                this.clear(this.deque);
            }
        }
        
        public void clear(final Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final Deque<T> deque = this.deque;
            final c<? super T> downstream = this.downstream;
            int addAndGet = 1;
            do {
                final long value = this.requested.get();
                long n = 0L;
                long n2;
                while (true) {
                    n2 = lcmp(n, value);
                    if (n2 == 0) {
                        break;
                    }
                    if (this.cancelled) {
                        this.clear(deque);
                        return;
                    }
                    final boolean done = this.done;
                    synchronized (deque) {
                        final T poll = deque.poll();
                        monitorexit(deque);
                        final boolean b = poll == null;
                        if (done) {
                            final Throwable error = this.error;
                            if (error != null) {
                                this.clear(deque);
                                downstream.onError(error);
                                return;
                            }
                            if (b) {
                                downstream.onComplete();
                                return;
                            }
                        }
                        if (!b) {
                            downstream.onNext((Object)poll);
                            ++n;
                            continue;
                        }
                    }
                    break;
                }
                if (n2 == 0) {
                    if (this.cancelled) {
                        this.clear(deque);
                        return;
                    }
                    final boolean done2 = this.done;
                    synchronized (deque) {
                        final boolean empty = deque.isEmpty();
                        monitorexit(deque);
                        if (done2) {
                            final Throwable error2 = this.error;
                            if (error2 != null) {
                                this.clear(deque);
                                downstream.onError(error2);
                                return;
                            }
                            if (empty) {
                                downstream.onComplete();
                                return;
                            }
                        }
                    }
                }
                if (n != 0L) {
                    cg.d.E3(this.requested, n);
                }
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        public void onComplete() {
            this.done = true;
            this.drain();
        }
        
        public void onError(final Throwable error) {
            if (this.done) {
                RxJavaPlugins.onError(error);
                return;
            }
            this.error = error;
            this.done = true;
            this.drain();
        }
        
        public void onNext(final T t) {
            if (this.done) {
                return;
            }
            final Deque<T> deque = this.deque;
            synchronized (deque) {
                final long n = deque.size();
                final long bufferSize = this.bufferSize;
                boolean b = false;
                boolean b2 = true;
                Label_0128: {
                    if (n == bufferSize) {
                        final int n2 = FlowableOnBackpressureBufferStrategy$a.a[((Enum)this.strategy).ordinal()];
                        if (n2 != 1) {
                            if (n2 != 2) {
                                break Label_0128;
                            }
                            deque.poll();
                            deque.offer(t);
                        }
                        else {
                            deque.pollLast();
                            deque.offer(t);
                        }
                        b2 = false;
                        b = true;
                    }
                    else {
                        deque.offer(t);
                        b2 = false;
                    }
                }
                monitorexit(deque);
                if (b) {
                    final ff2.a onOverflow = this.onOverflow;
                    if (onOverflow != null) {
                        try {
                            onOverflow.run();
                        }
                        finally {
                            final Throwable t2;
                            xd.a.t1(t2);
                            this.upstream.cancel();
                            this.onError(t2);
                        }
                    }
                }
                else if (b2) {
                    this.upstream.cancel();
                    this.onError((Throwable)new MissingBackpressureException());
                }
                else {
                    this.drain();
                }
            }
        }
        
        @Override
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
                upstream.request(Long.MAX_VALUE);
            }
        }
        
        public void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                cg.d.w0(this.requested, n);
                this.drain();
            }
        }
    }
}
