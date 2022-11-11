// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import nf2.j;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.util.ExceptionHelper;
import ej2.c0;
import io.reactivex.internal.queue.SpscArrayQueue;
import qt2.d;
import nf2.i;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import ff2.l;
import ff2.c;
import io.reactivex.internal.util.ErrorMode;
import ff2.e;
import kf2.o;
import ff2.g;
import ff2.a;

public final class FlowableConcatMapCompletable<T> extends a
{
    public final g<T> f;
    public final o<? super T, ? extends e> g;
    public final ErrorMode h;
    public final int i;
    
    public FlowableConcatMapCompletable(final int i, final g f, final o g, final ErrorMode h) {
        this.f = f;
        this.g = (o<? super T, ? extends e>)g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void w(final c c) {
        this.f.subscribe((ff2.l<? super T>)new ConcatMapCompletableObserver(c, (kf2.o<? super Object, ? extends e>)this.g, this.h, this.i));
    }
    
    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements l<T>, if2.a
    {
        private static final long serialVersionUID = 3610901111000061034L;
        public volatile boolean active;
        public int consumed;
        public volatile boolean disposed;
        public volatile boolean done;
        public final c downstream;
        public final ErrorMode errorMode;
        public final AtomicThrowable errors;
        public final ConcatMapCompletableObserver.FlowableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver inner;
        public final o<? super T, ? extends e> mapper;
        public final int prefetch;
        public final i<T> queue;
        public d upstream;
        
        public ConcatMapCompletableObserver(final c downstream, final o<? super T, ? extends e> mapper, final ErrorMode errorMode, final int prefetch) {
            this.downstream = downstream;
            this.mapper = mapper;
            this.errorMode = errorMode;
            this.prefetch = prefetch;
            this.errors = new AtomicThrowable();
            this.inner = new ConcatMapCompletableObserver.FlowableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver(this);
            this.queue = (i<T>)new SpscArrayQueue(prefetch);
        }
        
        public void dispose() {
            this.disposed = true;
            this.upstream.cancel();
            this.inner.dispose();
            if (this.getAndIncrement() == 0) {
                ((j)this.queue).clear();
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            while (!this.disposed) {
                if (!this.active) {
                    if (this.errorMode == ErrorMode.BOUNDARY && this.errors.get() != null) {
                        ((j)this.queue).clear();
                        this.downstream.onError(this.errors.terminate());
                        return;
                    }
                    final boolean done = this.done;
                    final Object poll = this.queue.poll();
                    final boolean b = poll == null;
                    if (done && b) {
                        final Throwable terminate = this.errors.terminate();
                        if (terminate != null) {
                            this.downstream.onError(terminate);
                        }
                        else {
                            this.downstream.onComplete();
                        }
                        return;
                    }
                    if (!b) {
                        final int prefetch = this.prefetch;
                        final int n = prefetch - (prefetch >> 1);
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
                            mf2.a.b(apply, "The mapper returned a null CompletableSource");
                            final e e = (e)apply;
                            this.active = true;
                            e.b((c)this.inner);
                        }
                        finally {
                            final Throwable t;
                            c0.i4(t);
                            ((j)this.queue).clear();
                            this.upstream.cancel();
                            this.errors.addThrowable(t);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            ((j)this.queue).clear();
        }
        
        public void innerComplete() {
            this.active = false;
            this.drain();
        }
        
        public void innerError(Throwable terminate) {
            if (this.errors.addThrowable(terminate)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.upstream.cancel();
                    terminate = this.errors.terminate();
                    if (terminate != ExceptionHelper.a) {
                        this.downstream.onError(terminate);
                    }
                    if (this.getAndIncrement() == 0) {
                        ((j)this.queue).clear();
                    }
                }
                else {
                    this.active = false;
                    this.drain();
                }
            }
            else {
                RxJavaPlugins.onError(terminate);
            }
        }
        
        public boolean isDisposed() {
            return this.disposed;
        }
        
        public void onComplete() {
            this.done = true;
            this.drain();
        }
        
        public void onError(Throwable terminate) {
            if (this.errors.addThrowable(terminate)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.inner.dispose();
                    terminate = this.errors.terminate();
                    if (terminate != ExceptionHelper.a) {
                        this.downstream.onError(terminate);
                    }
                    if (this.getAndIncrement() == 0) {
                        ((j)this.queue).clear();
                    }
                }
                else {
                    this.done = true;
                    this.drain();
                }
            }
            else {
                RxJavaPlugins.onError(terminate);
            }
        }
        
        public void onNext(final T t) {
            if (((j)this.queue).offer((Object)t)) {
                this.drain();
            }
            else {
                this.upstream.cancel();
                this.onError(new MissingBackpressureException("Queue full?!"));
            }
        }
        
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((if2.a)this);
                upstream.request((long)this.prefetch);
            }
        }
    }
}
