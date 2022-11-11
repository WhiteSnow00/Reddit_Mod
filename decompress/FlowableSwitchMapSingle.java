// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import ej2.c0;
import ff2.e0;
import mf2.a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.util.AtomicThrowable;
import qt2.d;
import java.util.concurrent.atomic.AtomicInteger;
import ff2.l;
import qt2.c;
import ff2.g0;
import kf2.o;
import ff2.g;

public final class FlowableSwitchMapSingle<T, R> extends g<R>
{
    public final g<T> f;
    public final o<? super T, ? extends g0<? extends R>> g;
    public final boolean h;
    
    public FlowableSwitchMapSingle(final g<T> f, final o<? super T, ? extends g0<? extends R>> g, final boolean h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        this.f.subscribe((ff2.l<? super T>)new SwitchMapSingleSubscriber((qt2.c<? super Object>)c, (kf2.o<? super Object, ? extends ff2.g0<?>>)this.g, this.h));
    }
    
    public static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements l<T>, d
    {
        public static final SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<Object> INNER_DISPOSED;
        private static final long serialVersionUID = -5402190102429853762L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final c<? super R> downstream;
        public long emitted;
        public final AtomicThrowable errors;
        public final AtomicReference<SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> inner;
        public final o<? super T, ? extends g0<? extends R>> mapper;
        public final AtomicLong requested;
        public d upstream;
        
        static {
            INNER_DISPOSED = new SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver((SwitchMapSingleSubscriber)null);
        }
        
        public SwitchMapSingleSubscriber(final c<? super R> downstream, final o<? super T, ? extends g0<? extends R>> mapper, final boolean delayErrors) {
            this.downstream = downstream;
            this.mapper = mapper;
            this.delayErrors = delayErrors;
            this.errors = new AtomicThrowable();
            this.requested = new AtomicLong();
            this.inner = new AtomicReference<SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>>();
        }
        
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.disposeInner();
        }
        
        public void disposeInner() {
            final AtomicReference<SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> inner = this.inner;
            final SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<Object> inner_DISPOSED = SwitchMapSingleSubscriber.INNER_DISPOSED;
            final SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver = inner.getAndSet((SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>)inner_DISPOSED);
            if (flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver != null && flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver != inner_DISPOSED) {
                flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver.dispose();
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super R> downstream = this.downstream;
            final AtomicThrowable errors = this.errors;
            final AtomicReference<SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> inner = this.inner;
            final AtomicLong requested = this.requested;
            long emitted = this.emitted;
            int addAndGet = 1;
        Label_0038:
            while (!this.cancelled) {
                if (errors.get() != null && !this.delayErrors) {
                    downstream.onError(errors.terminate());
                    return;
                }
                final boolean done = this.done;
                final SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver = inner.get();
                final boolean b = flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver == null;
                if (done && b) {
                    final Throwable terminate = errors.terminate();
                    if (terminate != null) {
                        downstream.onError(terminate);
                    }
                    else {
                        downstream.onComplete();
                    }
                    return;
                }
                if (!b && flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver.item != null && emitted != requested.get()) {
                    while (true) {
                        while (!inner.compareAndSet((SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>)flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver, null)) {
                            if (inner.get() != flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver) {
                                downstream.onNext(flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver.item);
                                ++emitted;
                                continue Label_0038;
                            }
                        }
                        continue;
                    }
                }
                this.emitted = emitted;
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        public void innerError(final SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R> flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver, final Throwable t) {
            final AtomicReference<SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> inner = this.inner;
            while (true) {
                while (!inner.compareAndSet(flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver, null)) {
                    if (inner.get() != flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver) {
                        final boolean b = false;
                        if (b && this.errors.addThrowable(t)) {
                            if (!this.delayErrors) {
                                this.upstream.cancel();
                                this.disposeInner();
                            }
                            this.drain();
                            return;
                        }
                        RxJavaPlugins.onError(t);
                        return;
                    }
                }
                final boolean b = true;
                continue;
            }
        }
        
        public void onComplete() {
            this.done = true;
            this.drain();
        }
        
        public void onError(final Throwable t) {
            if (this.errors.addThrowable(t)) {
                if (!this.delayErrors) {
                    this.disposeInner();
                }
                this.done = true;
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            final SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver = this.inner.get();
            if (flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver != null) {
                flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver.dispose();
            }
            try {
                final Object apply = this.mapper.apply((Object)t);
                a.b(apply, "The mapper returned a null SingleSource");
                final g0 g0 = (g0)apply;
                final SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver2 = new SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver(this);
                boolean b;
            Label_0106:
                do {
                    final SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver3 = this.inner.get();
                    if (flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver3 == SwitchMapSingleSubscriber.INNER_DISPOSED) {
                        return;
                    }
                    final AtomicReference<SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> inner = this.inner;
                    while (!inner.compareAndSet((SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>)flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver3, (SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>)flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver2)) {
                        if (inner.get() != flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver3) {
                            b = false;
                            continue Label_0106;
                        }
                    }
                    b = true;
                } while (!b);
                g0.b((e0)flowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver2);
            }
            finally {
                final Throwable t2;
                c0.i4(t2);
                this.upstream.cancel();
                this.inner.getAndSet((SwitchMapSingleSubscriber.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>)SwitchMapSingleSubscriber.INNER_DISPOSED);
                this.onError(t2);
            }
        }
        
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
                upstream.request(Long.MAX_VALUE);
            }
        }
        
        public void request(final long n) {
            vl.a.l(this.requested, n);
            this.drain();
        }
    }
}
