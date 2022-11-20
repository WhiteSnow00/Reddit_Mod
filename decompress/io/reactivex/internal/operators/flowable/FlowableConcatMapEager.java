// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.plugins.RxJavaPlugins;
import if2.j;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import nt2.d;
import java.util.concurrent.atomic.AtomicInteger;
import af2.l;
import nt2.c;
import af2.g;
import io.reactivex.internal.util.ErrorMode;
import nt2.b;
import ff2.o;
import lf2.a;

public final class FlowableConcatMapEager<T, R> extends a<T, R>
{
    public final o<? super T, ? extends b<? extends R>> g;
    public final int h;
    public final int i;
    public final ErrorMode j;
    
    public FlowableConcatMapEager(final g<T> g, final o<? super T, ? extends b<? extends R>> g2, final int h, final int i, final ErrorMode j) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        super.f.subscribe(new ConcatMapEagerDelayErrorSubscriber<Object, Object>(c, this.g, this.h, this.i, this.j));
    }
    
    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements l<T>, d, sf2.g<R>
    {
        private static final long serialVersionUID = -4255299542215038287L;
        public volatile boolean cancelled;
        public volatile InnerQueuedSubscriber<R> current;
        public volatile boolean done;
        public final c<? super R> downstream;
        public final ErrorMode errorMode;
        public final AtomicThrowable errors;
        public final o<? super T, ? extends b<? extends R>> mapper;
        public final int maxConcurrency;
        public final int prefetch;
        public final AtomicLong requested;
        public final qf2.a<InnerQueuedSubscriber<R>> subscribers;
        public d upstream;
        
        public ConcatMapEagerDelayErrorSubscriber(final c<? super R> downstream, final o<? super T, ? extends b<? extends R>> mapper, final int maxConcurrency, final int prefetch, final ErrorMode errorMode) {
            this.downstream = downstream;
            this.mapper = mapper;
            this.maxConcurrency = maxConcurrency;
            this.prefetch = prefetch;
            this.errorMode = errorMode;
            this.subscribers = new qf2.a<InnerQueuedSubscriber<R>>(Math.min(prefetch, maxConcurrency));
            this.errors = new AtomicThrowable();
            this.requested = new AtomicLong();
        }
        
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            this.drainAndCancel();
        }
        
        public void cancelAll() {
            final InnerQueuedSubscriber<R> current = this.current;
            this.current = null;
            if (current != null) {
                current.cancel();
            }
            while (true) {
                final InnerQueuedSubscriber innerQueuedSubscriber = this.subscribers.poll();
                if (innerQueuedSubscriber == null) {
                    break;
                }
                innerQueuedSubscriber.cancel();
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber<R> current = this.current;
            final c<? super R> downstream = this.downstream;
            final ErrorMode errorMode = this.errorMode;
            int addAndGet = 1;
            while (true) {
                final long value = this.requested.get();
                if (current == null) {
                    if (errorMode != ErrorMode.END && ((AtomicReference<Throwable>)this.errors).get() != null) {
                        this.cancelAll();
                        downstream.onError(this.errors.terminate());
                        return;
                    }
                    final boolean done = this.done;
                    final InnerQueuedSubscriber current2 = this.subscribers.poll();
                    if (done && current2 == null) {
                        final Throwable terminate = this.errors.terminate();
                        if (terminate != null) {
                            downstream.onError(terminate);
                        }
                        else {
                            downstream.onComplete();
                        }
                        return;
                    }
                    if ((current = current2) != null) {
                        this.current = current2;
                        current = current2;
                    }
                }
                long n = 0L;
                boolean b3 = false;
                Label_0526: {
                    if (current != null) {
                        final j queue = current.queue();
                        if (queue != null) {
                            n = 0L;
                            long n2 = 0L;
                            boolean b2 = false;
                            final InnerQueuedSubscriber innerQueuedSubscriber;
                            Label_0387: {
                                while (true) {
                                    n2 = lcmp(n, value);
                                    if (n2 == 0) {
                                        break;
                                    }
                                    if (this.cancelled) {
                                        this.cancelAll();
                                        return;
                                    }
                                    if (errorMode == ErrorMode.IMMEDIATE && ((AtomicReference<Throwable>)this.errors).get() != null) {
                                        this.current = null;
                                        current.cancel();
                                        this.cancelAll();
                                        downstream.onError(this.errors.terminate());
                                        return;
                                    }
                                    final boolean done2 = current.isDone();
                                    try {
                                        final Object poll = queue.poll();
                                        final boolean b = poll == null;
                                        if (done2 && b) {
                                            this.current = null;
                                            this.upstream.request(1L);
                                            b2 = true;
                                            break Label_0387;
                                        }
                                        if (!b) {
                                            downstream.onNext(poll);
                                            ++n;
                                            current.requestOne();
                                            continue;
                                        }
                                    }
                                    finally {
                                        xd.a.t1((Throwable)innerQueuedSubscriber);
                                        this.current = null;
                                        current.cancel();
                                        this.cancelAll();
                                        downstream.onError((Throwable)innerQueuedSubscriber);
                                        return;
                                    }
                                    break;
                                }
                                b2 = false;
                                innerQueuedSubscriber = current;
                            }
                            b3 = b2;
                            current = innerQueuedSubscriber;
                            if (n2 == 0) {
                                if (this.cancelled) {
                                    this.cancelAll();
                                    return;
                                }
                                if (errorMode == ErrorMode.IMMEDIATE && ((AtomicReference<Throwable>)this.errors).get() != null) {
                                    this.current = null;
                                    innerQueuedSubscriber.cancel();
                                    this.cancelAll();
                                    downstream.onError(this.errors.terminate());
                                    return;
                                }
                                final boolean done3 = innerQueuedSubscriber.isDone();
                                final boolean empty = queue.isEmpty();
                                b3 = b2;
                                current = innerQueuedSubscriber;
                                if (done3) {
                                    b3 = b2;
                                    current = innerQueuedSubscriber;
                                    if (empty) {
                                        this.current = null;
                                        this.upstream.request(1L);
                                        current = null;
                                        b3 = true;
                                    }
                                }
                            }
                            break Label_0526;
                        }
                    }
                    b3 = false;
                    n = 0L;
                }
                if (n != 0L && value != Long.MAX_VALUE) {
                    this.requested.addAndGet(-n);
                }
                if (b3) {
                    continue;
                }
                addAndGet = this.addAndGet(-addAndGet);
                if (addAndGet == 0) {
                    return;
                }
            }
        }
        
        public void drainAndCancel() {
            if (this.getAndIncrement() == 0) {
                do {
                    this.cancelAll();
                } while (this.decrementAndGet() != 0);
            }
        }
        
        public void innerComplete(final InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.setDone();
            this.drain();
        }
        
        public void innerError(final InnerQueuedSubscriber<R> innerQueuedSubscriber, final Throwable t) {
            if (this.errors.addThrowable(t)) {
                innerQueuedSubscriber.setDone();
                if (this.errorMode != ErrorMode.END) {
                    this.upstream.cancel();
                }
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void innerNext(final InnerQueuedSubscriber<R> innerQueuedSubscriber, final R r) {
            if (innerQueuedSubscriber.queue().offer((Object)r)) {
                this.drain();
            }
            else {
                innerQueuedSubscriber.cancel();
                this.innerError(innerQueuedSubscriber, (Throwable)new MissingBackpressureException());
            }
        }
        
        public void onComplete() {
            this.done = true;
            this.drain();
        }
        
        public void onError(final Throwable t) {
            if (this.errors.addThrowable(t)) {
                this.done = true;
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            try {
                final Object apply = this.mapper.apply((Object)t);
                hf2.a.b(apply, "The mapper returned a null Publisher");
                final b b = (b)apply;
                final InnerQueuedSubscriber<R> innerQueuedSubscriber = new InnerQueuedSubscriber<R>((sf2.g)this, this.prefetch);
                if (this.cancelled) {
                    return;
                }
                this.subscribers.offer(innerQueuedSubscriber);
                b.subscribe((c)innerQueuedSubscriber);
                if (this.cancelled) {
                    innerQueuedSubscriber.cancel();
                    this.drainAndCancel();
                }
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.upstream.cancel();
                this.onError(t2);
            }
        }
        
        @Override
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
                final int maxConcurrency = this.maxConcurrency;
                long n;
                if (maxConcurrency == Integer.MAX_VALUE) {
                    n = Long.MAX_VALUE;
                }
                else {
                    n = maxConcurrency;
                }
                upstream.request(n);
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
