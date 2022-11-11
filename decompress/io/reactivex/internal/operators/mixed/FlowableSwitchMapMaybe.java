// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import ej2.c0;
import ff2.p;
import mf2.a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.util.AtomicThrowable;
import qt2.d;
import java.util.concurrent.atomic.AtomicInteger;
import ff2.l;
import qt2.c;
import ff2.r;
import kf2.o;
import ff2.g;

public final class FlowableSwitchMapMaybe<T, R> extends g<R>
{
    public final g<T> f;
    public final o<? super T, ? extends r<? extends R>> g;
    public final boolean h;
    
    public FlowableSwitchMapMaybe(final g<T> f, final o<? super T, ? extends r<? extends R>> g, final boolean h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        this.f.subscribe((ff2.l<? super T>)new SwitchMapMaybeSubscriber((qt2.c<? super Object>)c, (kf2.o<? super Object, ? extends ff2.r<?>>)this.g, this.h));
    }
    
    public static final class SwitchMapMaybeSubscriber<T, R> extends AtomicInteger implements l<T>, d
    {
        public static final SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<Object> INNER_DISPOSED;
        private static final long serialVersionUID = -5402190102429853762L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final c<? super R> downstream;
        public long emitted;
        public final AtomicThrowable errors;
        public final AtomicReference<SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>> inner;
        public final o<? super T, ? extends r<? extends R>> mapper;
        public final AtomicLong requested;
        public d upstream;
        
        static {
            INNER_DISPOSED = new SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver((SwitchMapMaybeSubscriber)null);
        }
        
        public SwitchMapMaybeSubscriber(final c<? super R> downstream, final o<? super T, ? extends r<? extends R>> mapper, final boolean delayErrors) {
            this.downstream = downstream;
            this.mapper = mapper;
            this.delayErrors = delayErrors;
            this.errors = new AtomicThrowable();
            this.requested = new AtomicLong();
            this.inner = new AtomicReference<SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>>();
        }
        
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.disposeInner();
        }
        
        public void disposeInner() {
            final AtomicReference<SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>> inner = this.inner;
            final SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<Object> inner_DISPOSED = SwitchMapMaybeSubscriber.INNER_DISPOSED;
            final SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver = inner.getAndSet((SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>)inner_DISPOSED);
            if (flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver != null && flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver != inner_DISPOSED) {
                flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver.dispose();
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super R> downstream = this.downstream;
            final AtomicThrowable errors = this.errors;
            final AtomicReference<SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>> inner = this.inner;
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
                final SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver = inner.get();
                final boolean b = flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver == null;
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
                if (!b && flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver.item != null && emitted != requested.get()) {
                    while (true) {
                        while (!inner.compareAndSet((SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>)flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver, null)) {
                            if (inner.get() != flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver) {
                                downstream.onNext(flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver.item);
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
        
        public void innerComplete(final SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R> flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver) {
            final AtomicReference<SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>> inner = this.inner;
            while (true) {
                while (!inner.compareAndSet(flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver, null)) {
                    if (inner.get() != flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver) {
                        final boolean b = false;
                        if (b) {
                            this.drain();
                        }
                        return;
                    }
                }
                final boolean b = true;
                continue;
            }
        }
        
        public void innerError(final SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R> flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver, final Throwable t) {
            final AtomicReference<SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>> inner = this.inner;
            while (true) {
                while (!inner.compareAndSet(flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver, null)) {
                    if (inner.get() != flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver) {
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
            final SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver = this.inner.get();
            if (flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver != null) {
                flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver.dispose();
            }
            try {
                final Object apply = this.mapper.apply((Object)t);
                a.b(apply, "The mapper returned a null MaybeSource");
                final r r = (r)apply;
                final SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver2 = new SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver(this);
                boolean b;
            Label_0105:
                do {
                    final SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver3 = this.inner.get();
                    if (flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver3 == SwitchMapMaybeSubscriber.INNER_DISPOSED) {
                        return;
                    }
                    final AtomicReference<SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>> inner = this.inner;
                    while (!inner.compareAndSet((SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>)flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver3, (SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>)flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver2)) {
                        if (inner.get() != flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver3) {
                            b = false;
                            continue Label_0105;
                        }
                    }
                    b = true;
                } while (!b);
                r.b((p)flowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver2);
            }
            finally {
                final Throwable t2;
                c0.i4(t2);
                this.upstream.cancel();
                this.inner.getAndSet((SwitchMapMaybeSubscriber.FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber$SwitchMapMaybeObserver<R>)SwitchMapMaybeSubscriber.INNER_DISPOSED);
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
