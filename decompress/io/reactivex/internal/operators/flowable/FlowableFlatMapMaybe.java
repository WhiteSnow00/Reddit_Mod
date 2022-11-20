// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import af2.p;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.util.AtomicThrowable;
import nt2.d;
import java.util.concurrent.atomic.AtomicInteger;
import af2.l;
import nt2.c;
import af2.g;
import af2.r;
import ff2.o;
import lf2.a;

public final class FlowableFlatMapMaybe<T, R> extends a<T, R>
{
    public final o<? super T, ? extends r<? extends R>> g;
    public final boolean h;
    public final int i;
    
    public FlowableFlatMapMaybe(final int i, final g g, final o g2, final boolean h) {
        super(g);
        this.g = (o<? super T, ? extends r<? extends R>>)g2;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        super.f.subscribe(new FlatMapMaybeSubscriber<Object, Object>(c, this.g, this.h, this.i));
    }
    
    public static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements l<T>, d
    {
        private static final long serialVersionUID = 8600231336733376951L;
        public final AtomicInteger active;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final c<? super R> downstream;
        public final AtomicThrowable errors;
        public final o<? super T, ? extends r<? extends R>> mapper;
        public final int maxConcurrency;
        public final AtomicReference<qf2.a<R>> queue;
        public final AtomicLong requested;
        public final CompositeDisposable set;
        public d upstream;
        
        public FlatMapMaybeSubscriber(final c<? super R> downstream, final o<? super T, ? extends r<? extends R>> mapper, final boolean delayErrors, final int maxConcurrency) {
            this.downstream = downstream;
            this.mapper = mapper;
            this.delayErrors = delayErrors;
            this.maxConcurrency = maxConcurrency;
            this.requested = new AtomicLong();
            this.set = new CompositeDisposable();
            this.errors = new AtomicThrowable();
            this.active = new AtomicInteger(1);
            this.queue = new AtomicReference<qf2.a<R>>();
        }
        
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
        }
        
        public void clear() {
            final qf2.a a = this.queue.get();
            if (a != null) {
                a.clear();
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() == 0) {
                this.drainLoop();
            }
        }
        
        public void drainLoop() {
            final c<? super R> downstream = this.downstream;
            final AtomicInteger active = this.active;
            final AtomicReference<qf2.a<R>> queue = this.queue;
            int addAndGet = 1;
            do {
                final long value = this.requested.get();
                long n = 0L;
                long n2;
                int n3;
                while (true) {
                    n2 = lcmp(n, value);
                    n3 = 0;
                    if (n2 == 0) {
                        break;
                    }
                    if (this.cancelled) {
                        this.clear();
                        return;
                    }
                    if (!this.delayErrors && ((AtomicReference<Throwable>)this.errors).get() != null) {
                        final Throwable terminate = this.errors.terminate();
                        this.clear();
                        downstream.onError(terminate);
                        return;
                    }
                    final boolean b = active.get() == 0;
                    final qf2.a a = queue.get();
                    Object poll;
                    if (a != null) {
                        poll = a.poll();
                    }
                    else {
                        poll = null;
                    }
                    final boolean b2 = poll == null;
                    if (b && b2) {
                        final Throwable terminate2 = this.errors.terminate();
                        if (terminate2 != null) {
                            downstream.onError(terminate2);
                        }
                        else {
                            downstream.onComplete();
                        }
                        return;
                    }
                    if (b2) {
                        break;
                    }
                    downstream.onNext(poll);
                    ++n;
                }
                if (n2 == 0) {
                    if (this.cancelled) {
                        this.clear();
                        return;
                    }
                    if (!this.delayErrors && ((AtomicReference<Throwable>)this.errors).get() != null) {
                        final Throwable terminate3 = this.errors.terminate();
                        this.clear();
                        downstream.onError(terminate3);
                        return;
                    }
                    final boolean b3 = active.get() == 0;
                    final qf2.a a2 = queue.get();
                    int n4 = 0;
                    Label_0327: {
                        if (a2 != null) {
                            n4 = n3;
                            if (!a2.isEmpty()) {
                                break Label_0327;
                            }
                        }
                        n4 = 1;
                    }
                    if (b3 && n4 != 0) {
                        final Throwable terminate4 = this.errors.terminate();
                        if (terminate4 != null) {
                            downstream.onError(terminate4);
                        }
                        else {
                            downstream.onComplete();
                        }
                        return;
                    }
                }
                if (n != 0L) {
                    cg.d.E3(this.requested, n);
                    if (this.maxConcurrency == Integer.MAX_VALUE) {
                        continue;
                    }
                    this.upstream.request(n);
                }
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        public qf2.a<R> getOrCreateQueue() {
            boolean b;
            qf2.a<R> a2 = null;
        Label_0056:
            do {
                final qf2.a a = this.queue.get();
                if (a != null) {
                    return a;
                }
                a2 = new qf2.a<R>(af2.g.bufferSize());
                final AtomicReference<qf2.a<R>> queue = this.queue;
                while (!queue.compareAndSet(null, a2)) {
                    if (queue.get() != null) {
                        b = false;
                        continue Label_0056;
                    }
                }
                b = true;
            } while (!b);
            return a2;
        }
        
        public void innerComplete(final FlatMapMaybeSubscriber.FlowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver) {
            this.set.delete((df2.a)flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver);
            if (this.get() == 0) {
                boolean b = false;
                if (this.compareAndSet(0, 1)) {
                    if (this.active.decrementAndGet() == 0) {
                        b = true;
                    }
                    final qf2.a a = this.queue.get();
                    if (b && (a == null || a.isEmpty())) {
                        final Throwable terminate = this.errors.terminate();
                        if (terminate != null) {
                            this.downstream.onError(terminate);
                        }
                        else {
                            this.downstream.onComplete();
                        }
                        return;
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(1L);
                    }
                    if (this.decrementAndGet() == 0) {
                        return;
                    }
                    this.drainLoop();
                    return;
                }
            }
            this.active.decrementAndGet();
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
            this.drain();
        }
        
        public void innerError(final FlatMapMaybeSubscriber.FlowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver, final Throwable t) {
            this.set.delete((df2.a)flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver);
            if (this.errors.addThrowable(t)) {
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    this.set.dispose();
                }
                else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    this.upstream.request(1L);
                }
                this.active.decrementAndGet();
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void innerSuccess(FlatMapMaybeSubscriber.FlowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver, final R r) {
            this.set.delete((df2.a)flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver);
            Label_0211: {
                if (this.get() == 0) {
                    boolean b = false;
                    if (this.compareAndSet(0, 1)) {
                        if (this.active.decrementAndGet() == 0) {
                            b = true;
                        }
                        Label_0167: {
                            if (this.requested.get() != 0L) {
                                this.downstream.onNext((Object)r);
                                flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver = (FlatMapMaybeSubscriber.FlowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver)this.queue.get();
                                if (b && (flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver == null || ((qf2.a)flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver).isEmpty())) {
                                    final Throwable terminate = this.errors.terminate();
                                    if (terminate != null) {
                                        this.downstream.onError(terminate);
                                    }
                                    else {
                                        this.downstream.onComplete();
                                    }
                                    return;
                                }
                                cg.d.E3(this.requested, 1L);
                                if (this.maxConcurrency != Integer.MAX_VALUE) {
                                    this.upstream.request(1L);
                                    break Label_0167;
                                }
                                break Label_0167;
                            }
                            flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver = (FlatMapMaybeSubscriber.FlowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver)this.getOrCreateQueue();
                            synchronized (flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver) {
                                ((qf2.a<R>)flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver).offer(r);
                                monitorexit(flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver);
                                if (this.decrementAndGet() == 0) {
                                    return;
                                }
                                break Label_0211;
                            }
                        }
                    }
                }
                flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver = (FlatMapMaybeSubscriber.FlowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver)this.getOrCreateQueue();
                synchronized (flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver) {
                    ((qf2.a<R>)flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver).offer(r);
                    monitorexit(flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver);
                    this.active.decrementAndGet();
                    if (this.getAndIncrement() != 0) {
                        return;
                    }
                    this.drainLoop();
                }
            }
        }
        
        public void onComplete() {
            this.active.decrementAndGet();
            this.drain();
        }
        
        public void onError(final Throwable t) {
            this.active.decrementAndGet();
            if (this.errors.addThrowable(t)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            try {
                final Object apply = this.mapper.apply((Object)t);
                hf2.a.b(apply, "The mapper returned a null MaybeSource");
                final r r = (r)apply;
                this.active.getAndIncrement();
                final FlatMapMaybeSubscriber.FlowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver = new FlatMapMaybeSubscriber.FlowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver(this);
                if (!this.cancelled && this.set.add((df2.a)flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver)) {
                    r.a((p)flowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver);
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
                if (maxConcurrency == Integer.MAX_VALUE) {
                    upstream.request(Long.MAX_VALUE);
                }
                else {
                    upstream.request((long)maxConcurrency);
                }
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
