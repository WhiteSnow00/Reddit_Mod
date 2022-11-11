// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import nf2.j;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.plugins.RxJavaPlugins;
import ej2.c0;
import ff2.e0;
import mf2.a;
import io.reactivex.internal.queue.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicLong;
import nf2.i;
import io.reactivex.internal.util.AtomicThrowable;
import qt2.d;
import java.util.concurrent.atomic.AtomicInteger;
import ff2.l;
import qt2.c;
import io.reactivex.internal.util.ErrorMode;
import ff2.g0;
import kf2.o;
import ff2.g;

public final class FlowableConcatMapSingle<T, R> extends g<R>
{
    public final g<T> f;
    public final o<? super T, ? extends g0<? extends R>> g;
    public final ErrorMode h;
    public final int i;
    
    public FlowableConcatMapSingle(final int i, final g f, final o g, final ErrorMode h) {
        this.f = f;
        this.g = (o<? super T, ? extends g0<? extends R>>)g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        this.f.subscribe((ff2.l<? super T>)new ConcatMapSingleSubscriber((qt2.c<? super Object>)c, (kf2.o<? super Object, ? extends ff2.g0<?>>)this.g, this.i, this.h));
    }
    
    public static final class ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements l<T>, d
    {
        public static final int STATE_ACTIVE = 1;
        public static final int STATE_INACTIVE = 0;
        public static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final c<? super R> downstream;
        public long emitted;
        public final ErrorMode errorMode;
        public final AtomicThrowable errors;
        public final ConcatMapSingleSubscriber.FlowableConcatMapSingle$ConcatMapSingleSubscriber$ConcatMapSingleObserver<R> inner;
        public R item;
        public final o<? super T, ? extends g0<? extends R>> mapper;
        public final int prefetch;
        public final i<T> queue;
        public final AtomicLong requested;
        public volatile int state;
        public d upstream;
        
        public ConcatMapSingleSubscriber(final c<? super R> downstream, final o<? super T, ? extends g0<? extends R>> mapper, final int prefetch, final ErrorMode errorMode) {
            this.downstream = downstream;
            this.mapper = mapper;
            this.prefetch = prefetch;
            this.errorMode = errorMode;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
            this.inner = (ConcatMapSingleSubscriber.FlowableConcatMapSingle$ConcatMapSingleSubscriber$ConcatMapSingleObserver<R>)new ConcatMapSingleSubscriber.FlowableConcatMapSingle$ConcatMapSingleSubscriber$ConcatMapSingleObserver(this);
            this.queue = (i<T>)new SpscArrayQueue(prefetch);
        }
        
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.inner.dispose();
            if (this.getAndIncrement() == 0) {
                ((j)this.queue).clear();
                this.item = null;
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super R> downstream = this.downstream;
            final ErrorMode errorMode = this.errorMode;
            final i<T> queue = this.queue;
            final AtomicThrowable errors = this.errors;
            final AtomicLong requested = this.requested;
            final int prefetch = this.prefetch;
            final int n = prefetch - (prefetch >> 1);
            int addAndGet = 1;
            while (true) {
                Label_0392: {
                    if (this.cancelled) {
                        ((j)queue).clear();
                        this.item = null;
                    }
                    else {
                        final int state = this.state;
                        if (errors.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && state == 0))) {
                            ((j)queue).clear();
                            this.item = null;
                            downstream.onError(errors.terminate());
                            return;
                        }
                        if (state == 0) {
                            final boolean done = this.done;
                            final Object poll = queue.poll();
                            final boolean b = poll == null;
                            if (done && b) {
                                final Throwable terminate = errors.terminate();
                                if (terminate == null) {
                                    downstream.onComplete();
                                }
                                else {
                                    downstream.onError(terminate);
                                }
                                return;
                            }
                            if (b) {
                                break Label_0392;
                            }
                            final int consumed = this.consumed + 1;
                            if (consumed == n) {
                                this.consumed = 0;
                                this.upstream.request((long)n);
                            }
                            else {
                                this.consumed = consumed;
                            }
                            try {
                                final Object apply = this.mapper.apply(poll);
                                a.b(apply, "The mapper returned a null SingleSource");
                                final g0 g0 = (g0)apply;
                                this.state = 1;
                                g0.b((e0)this.inner);
                                break Label_0392;
                            }
                            finally {
                                c0.i4((Throwable)errorMode);
                                this.upstream.cancel();
                                ((j)queue).clear();
                                errors.addThrowable((Throwable)errorMode);
                                downstream.onError(errors.terminate());
                                return;
                            }
                        }
                        if (state == 2) {
                            final long emitted = this.emitted;
                            if (emitted != requested.get()) {
                                final R item = this.item;
                                this.item = null;
                                downstream.onNext((Object)item);
                                this.emitted = emitted + 1L;
                                this.state = 0;
                                continue;
                            }
                        }
                    }
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        public void innerError(final Throwable t) {
            if (this.errors.addThrowable(t)) {
                if (this.errorMode != ErrorMode.END) {
                    this.upstream.cancel();
                }
                this.state = 0;
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void innerSuccess(final R item) {
            this.item = item;
            this.state = 2;
            this.drain();
        }
        
        public void onComplete() {
            this.done = true;
            this.drain();
        }
        
        public void onError(final Throwable t) {
            if (this.errors.addThrowable(t)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.inner.dispose();
                }
                this.done = true;
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            if (!((j)this.queue).offer((Object)t)) {
                this.upstream.cancel();
                this.onError(new MissingBackpressureException("queue full?!"));
                return;
            }
            this.drain();
        }
        
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
                upstream.request((long)this.prefetch);
            }
        }
        
        public void request(final long n) {
            vl.a.l(this.requested, n);
            this.drain();
        }
    }
}
