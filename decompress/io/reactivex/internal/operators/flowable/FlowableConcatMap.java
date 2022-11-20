// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import if2.f;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import if2.j;
import io.reactivex.internal.util.AtomicThrowable;
import nt2.d;
import af2.l;
import java.util.concurrent.atomic.AtomicInteger;
import lf2.f1;
import nt2.c;
import af2.g;
import io.reactivex.internal.util.ErrorMode;
import nt2.b;
import ff2.o;
import lf2.a;

public final class FlowableConcatMap<T, R> extends a<T, R>
{
    public final o<? super T, ? extends b<? extends R>> g;
    public final int h;
    public final ErrorMode i;
    
    public FlowableConcatMap(final int h, final g g, final o g2, final ErrorMode i) {
        super(g);
        this.g = (o<? super T, ? extends b<? extends R>>)g2;
        this.h = h;
        this.i = i;
    }
    
    public static <T, R> c<T> e(final c<? super R> c, final o<? super T, ? extends b<? extends R>> o, final int n, final ErrorMode errorMode) {
        final int n2 = FlowableConcatMap$a.a[((Enum)errorMode).ordinal()];
        if (n2 == 1) {
            return (c<T>)new ConcatMapDelayed((nt2.c<? super Object>)c, (ff2.o<? super Object, ? extends nt2.b<?>>)o, n, false);
        }
        if (n2 != 2) {
            return (c<T>)new ConcatMapImmediate((nt2.c<? super Object>)c, (ff2.o<? super Object, ? extends nt2.b<?>>)o, n);
        }
        return (c<T>)new ConcatMapDelayed((nt2.c<? super Object>)c, (ff2.o<? super Object, ? extends nt2.b<?>>)o, n, true);
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        if (f1.a(c, this.g, (b)super.f)) {
            return;
        }
        super.f.subscribe(e((nt2.c<? super Object>)c, (ff2.o<? super T, ? extends nt2.b<?>>)this.g, this.h, this.i));
    }
    
    public abstract static class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements l<T>, FlowableConcatMap$b<R>, d
    {
        private static final long serialVersionUID = -3511336836796789179L;
        public volatile boolean active;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final AtomicThrowable errors;
        public final ConcatMapInner<R> inner;
        public final int limit;
        public final o<? super T, ? extends b<? extends R>> mapper;
        public final int prefetch;
        public j<T> queue;
        public int sourceMode;
        public d upstream;
        
        public BaseConcatMapSubscriber(final o<? super T, ? extends b<? extends R>> mapper, final int prefetch) {
            this.mapper = mapper;
            this.prefetch = prefetch;
            this.limit = prefetch - (prefetch >> 2);
            this.inner = (ConcatMapInner<R>)new ConcatMapInner((io.reactivex.internal.operators.flowable.FlowableConcatMap$b<Object>)this);
            this.errors = new AtomicThrowable();
        }
        
        public abstract void cancel();
        
        public abstract void drain();
        
        public final void innerComplete() {
            this.active = false;
            this.drain();
        }
        
        public abstract void innerError(final Throwable p0);
        
        public abstract void innerNext(final T p0);
        
        public final void onComplete() {
            this.done = true;
            this.drain();
        }
        
        public abstract void onError(final Throwable p0);
        
        public final void onNext(final T t) {
            if (this.sourceMode != 2 && !this.queue.offer((Object)t)) {
                this.upstream.cancel();
                this.onError(new IllegalStateException("Queue full?!"));
                return;
            }
            this.drain();
        }
        
        @Override
        public final void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                if (upstream instanceof if2.g) {
                    final if2.g g = (if2.g)upstream;
                    final int requestFusion = ((f)g).requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = (j<T>)g;
                        this.done = true;
                        this.subscribeActual();
                        this.drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = (j<T>)g;
                        this.subscribeActual();
                        upstream.request((long)this.prefetch);
                        return;
                    }
                }
                this.queue = (j<T>)new SpscArrayQueue(this.prefetch);
                this.subscribeActual();
                upstream.request((long)this.prefetch);
            }
        }
        
        public abstract void request(final long p0);
        
        public abstract void subscribeActual();
    }
    
    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R>
    {
        private static final long serialVersionUID = -2945777694260521066L;
        public final c<? super R> downstream;
        public final boolean veryEnd;
        
        public ConcatMapDelayed(final c<? super R> downstream, final o<? super T, ? extends b<? extends R>> o, final int n, final boolean veryEnd) {
            super(o, n);
            this.downstream = downstream;
            this.veryEnd = veryEnd;
        }
        
        @Override
        public void cancel() {
            if (!super.cancelled) {
                super.cancelled = true;
                super.inner.cancel();
                super.upstream.cancel();
            }
        }
        
        @Override
        public void drain() {
            if (this.getAndIncrement() == 0) {
                while (!super.cancelled) {
                    Label_0433: {
                        if (!super.active) {
                            final boolean done = super.done;
                            if (done && !this.veryEnd && ((AtomicReference<Throwable>)super.errors).get() != null) {
                                this.downstream.onError(super.errors.terminate());
                                return;
                            }
                            try {
                                final Object poll = super.queue.poll();
                                final boolean b = poll == null;
                                if (done && b) {
                                    final Throwable terminate = super.errors.terminate();
                                    if (terminate != null) {
                                        this.downstream.onError(terminate);
                                    }
                                    else {
                                        this.downstream.onComplete();
                                    }
                                    return;
                                }
                                if (!b) {
                                    try {
                                        final Object apply = super.mapper.apply(poll);
                                        hf2.a.b(apply, "The mapper returned a null Publisher");
                                        final b b2 = (b)apply;
                                        if (super.sourceMode != 1) {
                                            final int consumed = super.consumed + 1;
                                            if (consumed == super.limit) {
                                                super.consumed = 0;
                                                super.upstream.request((long)consumed);
                                            }
                                            else {
                                                super.consumed = consumed;
                                            }
                                        }
                                        if (!(b2 instanceof Callable)) {
                                            super.active = true;
                                            b2.subscribe((c)super.inner);
                                            break Label_0433;
                                        }
                                        final Callable callable = (Callable)b2;
                                        Object o = null;
                                        try {
                                            callable.call();
                                        }
                                        finally {
                                            final Throwable t;
                                            xd.a.t1(t);
                                            super.errors.addThrowable(t);
                                            if (!this.veryEnd) {
                                                super.upstream.cancel();
                                                this.downstream.onError(super.errors.terminate());
                                                return;
                                            }
                                            o = null;
                                        }
                                        if (o == null) {
                                            continue;
                                        }
                                        if (super.inner.isUnbounded()) {
                                            this.downstream.onNext(o);
                                            continue;
                                        }
                                        super.active = true;
                                        final ConcatMapInner<R> inner = super.inner;
                                        inner.setSubscription((d)new FlowableConcatMap$c(o, (c)inner));
                                    }
                                    finally {
                                        final Throwable t2;
                                        xd.a.t1(t2);
                                        super.upstream.cancel();
                                        super.errors.addThrowable(t2);
                                        this.downstream.onError(super.errors.terminate());
                                        return;
                                    }
                                }
                            }
                            finally {
                                final Throwable t3;
                                xd.a.t1(t3);
                                super.upstream.cancel();
                                super.errors.addThrowable(t3);
                                this.downstream.onError(super.errors.terminate());
                                return;
                            }
                        }
                    }
                    if (this.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
        
        @Override
        public void innerError(final Throwable t) {
            if (super.errors.addThrowable(t)) {
                if (!this.veryEnd) {
                    super.upstream.cancel();
                    super.done = true;
                }
                super.active = false;
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        @Override
        public void innerNext(final R r) {
            this.downstream.onNext((Object)r);
        }
        
        @Override
        public void onError(final Throwable t) {
            if (super.errors.addThrowable(t)) {
                super.done = true;
                this.drain();
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        @Override
        public void request(final long n) {
            super.inner.request(n);
        }
        
        @Override
        public void subscribeActual() {
            this.downstream.onSubscribe((d)this);
        }
    }
    
    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R>
    {
        private static final long serialVersionUID = 7898995095634264146L;
        public final c<? super R> downstream;
        public final AtomicInteger wip;
        
        public ConcatMapImmediate(final c<? super R> downstream, final o<? super T, ? extends b<? extends R>> o, final int n) {
            super(o, n);
            this.downstream = downstream;
            this.wip = new AtomicInteger();
        }
        
        @Override
        public void cancel() {
            if (!super.cancelled) {
                super.cancelled = true;
                super.inner.cancel();
                super.upstream.cancel();
            }
        }
        
        @Override
        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                while (!super.cancelled) {
                    Label_0397: {
                        if (!super.active) {
                            final boolean done = super.done;
                            try {
                                final Object poll = super.queue.poll();
                                final boolean b = poll == null;
                                if (done && b) {
                                    this.downstream.onComplete();
                                    return;
                                }
                                if (!b) {
                                    try {
                                        final Object apply = super.mapper.apply(poll);
                                        hf2.a.b(apply, "The mapper returned a null Publisher");
                                        final b b2 = (b)apply;
                                        if (super.sourceMode != 1) {
                                            final int consumed = super.consumed + 1;
                                            if (consumed == super.limit) {
                                                super.consumed = 0;
                                                super.upstream.request((long)consumed);
                                            }
                                            else {
                                                super.consumed = consumed;
                                            }
                                        }
                                        if (b2 instanceof Callable) {
                                            final Callable callable = (Callable)b2;
                                            try {
                                                final Object call = callable.call();
                                                if (call == null) {
                                                    continue;
                                                }
                                                if (!super.inner.isUnbounded()) {
                                                    super.active = true;
                                                    final ConcatMapInner<R> inner = super.inner;
                                                    inner.setSubscription((d)new FlowableConcatMap$c(call, (c)inner));
                                                    break Label_0397;
                                                }
                                                if (this.get() != 0 || !this.compareAndSet(0, 1)) {
                                                    continue;
                                                }
                                                this.downstream.onNext(call);
                                                if (!this.compareAndSet(1, 0)) {
                                                    this.downstream.onError(super.errors.terminate());
                                                    return;
                                                }
                                                continue;
                                            }
                                            finally {
                                                final Throwable t;
                                                xd.a.t1(t);
                                                super.upstream.cancel();
                                                super.errors.addThrowable(t);
                                                this.downstream.onError(super.errors.terminate());
                                                return;
                                            }
                                        }
                                        super.active = true;
                                        b2.subscribe((c)super.inner);
                                    }
                                    finally {
                                        final Throwable t2;
                                        xd.a.t1(t2);
                                        super.upstream.cancel();
                                        super.errors.addThrowable(t2);
                                        this.downstream.onError(super.errors.terminate());
                                        return;
                                    }
                                }
                            }
                            finally {
                                final Throwable t3;
                                xd.a.t1(t3);
                                super.upstream.cancel();
                                super.errors.addThrowable(t3);
                                this.downstream.onError(super.errors.terminate());
                                return;
                            }
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
        
        @Override
        public void innerError(final Throwable t) {
            if (super.errors.addThrowable(t)) {
                super.upstream.cancel();
                if (this.getAndIncrement() == 0) {
                    this.downstream.onError(super.errors.terminate());
                }
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        @Override
        public void innerNext(final R r) {
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                this.downstream.onNext((Object)r);
                if (this.compareAndSet(1, 0)) {
                    return;
                }
                this.downstream.onError(super.errors.terminate());
            }
        }
        
        @Override
        public void onError(final Throwable t) {
            if (super.errors.addThrowable(t)) {
                super.inner.cancel();
                if (this.getAndIncrement() == 0) {
                    this.downstream.onError(super.errors.terminate());
                }
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        @Override
        public void request(final long n) {
            super.inner.request(n);
        }
        
        @Override
        public void subscribeActual() {
            this.downstream.onSubscribe((d)this);
        }
    }
    
    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements l<R>
    {
        private static final long serialVersionUID = 897683679971470653L;
        public final FlowableConcatMap$b<R> parent;
        public long produced;
        
        public ConcatMapInner(final FlowableConcatMap$b<R> parent) {
            super(false);
            this.parent = parent;
        }
        
        public void onComplete() {
            final long produced = this.produced;
            if (produced != 0L) {
                this.produced = 0L;
                this.produced(produced);
            }
            this.parent.innerComplete();
        }
        
        public void onError(final Throwable t) {
            final long produced = this.produced;
            if (produced != 0L) {
                this.produced = 0L;
                this.produced(produced);
            }
            this.parent.innerError(t);
        }
        
        public void onNext(final R r) {
            ++this.produced;
            this.parent.innerNext((Object)r);
        }
        
        @Override
        public void onSubscribe(final d subscription) {
            this.setSubscription(subscription);
        }
    }
}
