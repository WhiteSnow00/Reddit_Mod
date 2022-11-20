// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import nt2.d;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import af2.l;
import af2.c;
import io.reactivex.plugins.RxJavaPlugins;
import af2.e;
import ff2.o;
import af2.g;
import if2.b;
import af2.a;

public final class FlowableFlatMapCompletableCompletable<T> extends a implements b<T>
{
    public final g<T> f;
    public final o<? super T, ? extends e> g;
    public final int h;
    public final boolean i;
    
    public FlowableFlatMapCompletableCompletable(final int h, final g f, final o g, final boolean i) {
        this.f = f;
        this.g = (o<? super T, ? extends e>)g;
        this.i = i;
        this.h = h;
    }
    
    public final g<T> d() {
        return RxJavaPlugins.onAssembly((g)new FlowableFlatMapCompletable(this.h, this.f, this.g, this.i));
    }
    
    @Override
    public final void w(final c c) {
        this.f.subscribe(new FlatMapCompletableMainSubscriber<Object>(c, this.g, this.i, this.h));
    }
    
    public static final class FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements l<T>, df2.a
    {
        private static final long serialVersionUID = 8443155186132538303L;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public final c downstream;
        public final AtomicThrowable errors;
        public final o<? super T, ? extends e> mapper;
        public final int maxConcurrency;
        public final CompositeDisposable set;
        public d upstream;
        
        public FlatMapCompletableMainSubscriber(final c downstream, final o<? super T, ? extends e> mapper, final boolean delayErrors, final int maxConcurrency) {
            this.downstream = downstream;
            this.mapper = mapper;
            this.delayErrors = delayErrors;
            this.errors = new AtomicThrowable();
            this.set = new CompositeDisposable();
            this.maxConcurrency = maxConcurrency;
            this.lazySet(1);
        }
        
        public void dispose() {
            this.disposed = true;
            this.upstream.cancel();
            this.set.dispose();
        }
        
        public void innerComplete(final FlatMapCompletableMainSubscriber.FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver flowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver) {
            this.set.delete((df2.a)flowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver);
            this.onComplete();
        }
        
        public void innerError(final FlatMapCompletableMainSubscriber.FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver flowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver, final Throwable t) {
            this.set.delete((df2.a)flowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver);
            this.onError(t);
        }
        
        public boolean isDisposed() {
            return this.set.isDisposed();
        }
        
        public void onComplete() {
            if (this.decrementAndGet() == 0) {
                final Throwable terminate = this.errors.terminate();
                if (terminate != null) {
                    this.downstream.onError(terminate);
                }
                else {
                    this.downstream.onComplete();
                }
            }
            else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        }
        
        public void onError(Throwable t) {
            if (this.errors.addThrowable(t)) {
                if (this.delayErrors) {
                    if (this.decrementAndGet() == 0) {
                        t = this.errors.terminate();
                        this.downstream.onError(t);
                    }
                    else if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(1L);
                    }
                }
                else {
                    this.dispose();
                    if (this.getAndSet(0) > 0) {
                        t = this.errors.terminate();
                        this.downstream.onError(t);
                    }
                }
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            try {
                final Object apply = this.mapper.apply((Object)t);
                hf2.a.b(apply, "The mapper returned a null CompletableSource");
                final e e = (e)apply;
                this.getAndIncrement();
                final FlatMapCompletableMainSubscriber.FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver flowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver = new FlatMapCompletableMainSubscriber.FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver(this);
                if (!this.disposed && this.set.add((df2.a)flowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver)) {
                    e.a((c)flowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver);
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
                this.downstream.onSubscribe((df2.a)this);
                final int maxConcurrency = this.maxConcurrency;
                if (maxConcurrency == Integer.MAX_VALUE) {
                    upstream.request(Long.MAX_VALUE);
                }
                else {
                    upstream.request((long)maxConcurrency);
                }
            }
        }
    }
}
