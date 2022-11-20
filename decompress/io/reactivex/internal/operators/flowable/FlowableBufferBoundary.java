// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.CompositeDisposable;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import af2.l;
import nt2.d;
import nt2.c;
import af2.g;
import ff2.o;
import nt2.b;
import java.util.concurrent.Callable;
import lf2.a;
import java.util.Collection;

public final class FlowableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends a<T, U>
{
    public final Callable<U> g;
    public final b<? extends Open> h;
    public final o<? super Open, ? extends b<? extends Close>> i;
    
    public FlowableBufferBoundary(final g<T> g, final b<? extends Open> h, final o<? super Open, ? extends b<? extends Close>> i, final Callable<U> g2) {
        super(g);
        this.h = h;
        this.i = i;
        this.g = g2;
    }
    
    @Override
    public final void subscribeActual(final c<? super U> c) {
        final BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber<Object, Object, Object, Object>(c, this.h, this.i, this.g);
        c.onSubscribe((d)bufferBoundarySubscriber);
        super.f.subscribe(bufferBoundarySubscriber);
    }
    
    public static final class BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements l<T>, d
    {
        private static final long serialVersionUID = -8466418554264089604L;
        public final o<? super Open, ? extends b<? extends Close>> bufferClose;
        public final b<? extends Open> bufferOpen;
        public final Callable<C> bufferSupplier;
        public Map<Long, C> buffers;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final c<? super C> downstream;
        public long emitted;
        public final AtomicThrowable errors;
        public long index;
        public final qf2.a<C> queue;
        public final AtomicLong requested;
        public final CompositeDisposable subscribers;
        public final AtomicReference<d> upstream;
        
        public BufferBoundarySubscriber(final c<? super C> downstream, final b<? extends Open> bufferOpen, final o<? super Open, ? extends b<? extends Close>> bufferClose, final Callable<C> bufferSupplier) {
            this.downstream = downstream;
            this.bufferSupplier = bufferSupplier;
            this.bufferOpen = bufferOpen;
            this.bufferClose = bufferClose;
            this.queue = new qf2.a<C>(g.bufferSize());
            this.subscribers = new CompositeDisposable();
            this.requested = new AtomicLong();
            this.upstream = new AtomicReference<d>();
            this.buffers = new LinkedHashMap<Long, C>();
            this.errors = new AtomicThrowable();
        }
        
        public void boundaryError(final df2.a a, final Throwable t) {
            SubscriptionHelper.cancel(this.upstream);
            this.subscribers.delete(a);
            this.onError(t);
        }
        
        public void cancel() {
            if (SubscriptionHelper.cancel(this.upstream)) {
                this.cancelled = true;
                this.subscribers.dispose();
                synchronized (this) {
                    this.buffers = null;
                    monitorexit(this);
                    if (this.getAndIncrement() != 0) {
                        this.queue.clear();
                    }
                }
            }
        }
        
        public void close(final BufferCloseSubscriber<T, C> bufferCloseSubscriber, final long n) {
            this.subscribers.delete((df2.a)bufferCloseSubscriber);
            boolean b;
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                b = true;
            }
            else {
                b = false;
            }
            synchronized (this) {
                final Map<Long, C> buffers = this.buffers;
                if (buffers == null) {
                    return;
                }
                this.queue.offer(buffers.remove(n));
                monitorexit(this);
                if (b) {
                    this.done = true;
                }
                this.drain();
            }
        }
        
        public void drain() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            long emitted = this.emitted;
            final c<? super C> downstream = this.downstream;
            final qf2.a<C> queue = this.queue;
            int addAndGet = 1;
            do {
                final long value = this.requested.get();
                long n;
                while (true) {
                    n = lcmp(emitted, value);
                    if (n == 0) {
                        break;
                    }
                    if (this.cancelled) {
                        queue.clear();
                        return;
                    }
                    final boolean done = this.done;
                    if (done && ((AtomicReference<Object>)this.errors).get() != null) {
                        queue.clear();
                        downstream.onError(this.errors.terminate());
                        return;
                    }
                    final Collection<? super T> collection = queue.poll();
                    final boolean b = collection == null;
                    if (done && b) {
                        downstream.onComplete();
                        return;
                    }
                    if (b) {
                        break;
                    }
                    downstream.onNext((Object)collection);
                    ++emitted;
                }
                if (n == 0) {
                    if (this.cancelled) {
                        queue.clear();
                        return;
                    }
                    if (this.done) {
                        if (((AtomicReference<Object>)this.errors).get() != null) {
                            queue.clear();
                            downstream.onError(this.errors.terminate());
                            return;
                        }
                        if (queue.isEmpty()) {
                            downstream.onComplete();
                            return;
                        }
                    }
                }
                this.emitted = emitted;
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        public void onComplete() {
            this.subscribers.dispose();
            synchronized (this) {
                final Map<Long, C> buffers = this.buffers;
                if (buffers == null) {
                    return;
                }
                final Iterator<C> iterator = buffers.values().iterator();
                while (iterator.hasNext()) {
                    this.queue.offer(iterator.next());
                }
                this.buffers = null;
                monitorexit(this);
                this.done = true;
                this.drain();
            }
        }
        
        public void onError(final Throwable t) {
            if (this.errors.addThrowable(t)) {
                this.subscribers.dispose();
                synchronized (this) {
                    this.buffers = null;
                    monitorexit(this);
                    this.done = true;
                    this.drain();
                    return;
                }
            }
            RxJavaPlugins.onError(t);
        }
        
        public void onNext(final T t) {
            synchronized (this) {
                final Map<Long, C> buffers = this.buffers;
                if (buffers == null) {
                    return;
                }
                final Iterator<C> iterator = buffers.values().iterator();
                while (iterator.hasNext()) {
                    ((Collection<T>)iterator.next()).add(t);
                }
            }
        }
        
        @Override
        public void onSubscribe(final d d) {
            if (SubscriptionHelper.setOnce(this.upstream, d)) {
                final BufferOpenSubscriber bufferOpenSubscriber = new BufferOpenSubscriber((BufferBoundarySubscriber<?, ?, Object, ?>)this);
                this.subscribers.add((df2.a)bufferOpenSubscriber);
                this.bufferOpen.subscribe((c)bufferOpenSubscriber);
                d.request(Long.MAX_VALUE);
            }
        }
        
        public void open(final Open open) {
            try {
                final Collection<? super T> call = this.bufferSupplier.call();
                hf2.a.b((Object)call, "The bufferSupplier returned a null Collection");
                final Collection<? super T> collection = call;
                final Object apply = this.bufferClose.apply((Object)open);
                hf2.a.b(apply, "The bufferClose returned a null Publisher");
                final b b = (b)apply;
                final long index = this.index;
                this.index = 1L + index;
                synchronized (this) {
                    final Map<Long, C> buffers = this.buffers;
                    if (buffers == null) {
                        return;
                    }
                    buffers.put(index, (C)collection);
                    monitorexit(this);
                    final BufferCloseSubscriber bufferCloseSubscriber = new BufferCloseSubscriber((BufferBoundarySubscriber<Object, Collection, ?, ?>)this, index);
                    this.subscribers.add((df2.a)bufferCloseSubscriber);
                    b.subscribe((c)bufferCloseSubscriber);
                }
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                SubscriptionHelper.cancel(this.upstream);
                this.onError(t);
            }
        }
        
        public void openComplete(final BufferOpenSubscriber<Open> bufferOpenSubscriber) {
            this.subscribers.delete((df2.a)bufferOpenSubscriber);
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                this.done = true;
                this.drain();
            }
        }
        
        public void request(final long n) {
            cg.d.w0(this.requested, n);
            this.drain();
        }
        
        public static final class BufferOpenSubscriber<Open> extends AtomicReference<d> implements l<Open>, df2.a
        {
            private static final long serialVersionUID = -8498650778633225126L;
            public final BufferBoundarySubscriber<?, ?, Open, ?> parent;
            
            public BufferOpenSubscriber(final BufferBoundarySubscriber<?, ?, Open, ?> parent) {
                this.parent = parent;
            }
            
            public void dispose() {
                SubscriptionHelper.cancel(this);
            }
            
            public boolean isDisposed() {
                return this.get() == SubscriptionHelper.CANCELLED;
            }
            
            public void onComplete() {
                this.lazySet((d)SubscriptionHelper.CANCELLED);
                this.parent.openComplete(this);
            }
            
            public void onError(final Throwable t) {
                this.lazySet((d)SubscriptionHelper.CANCELLED);
                this.parent.boundaryError((df2.a)this, t);
            }
            
            public void onNext(final Open open) {
                this.parent.open(open);
            }
            
            @Override
            public void onSubscribe(final d d) {
                SubscriptionHelper.setOnce(this, d, Long.MAX_VALUE);
            }
        }
    }
    
    public static final class BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<d> implements l<Object>, df2.a
    {
        private static final long serialVersionUID = -8498650778633225126L;
        public final long index;
        public final BufferBoundarySubscriber<T, C, ?, ?> parent;
        
        public BufferCloseSubscriber(final BufferBoundarySubscriber<T, C, ?, ?> parent, final long index) {
            this.parent = parent;
            this.index = index;
        }
        
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }
        
        public boolean isDisposed() {
            return this.get() == SubscriptionHelper.CANCELLED;
        }
        
        public void onComplete() {
            final SubscriptionHelper value = this.get();
            final SubscriptionHelper cancelled = SubscriptionHelper.CANCELLED;
            if (value != cancelled) {
                this.lazySet((d)cancelled);
                this.parent.close(this, this.index);
            }
        }
        
        public void onError(final Throwable t) {
            final SubscriptionHelper value = this.get();
            final SubscriptionHelper cancelled = SubscriptionHelper.CANCELLED;
            if (value != cancelled) {
                this.lazySet((d)cancelled);
                this.parent.boundaryError((df2.a)this, t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final Object o) {
            final d d = this.get();
            final SubscriptionHelper cancelled = SubscriptionHelper.CANCELLED;
            if (d != cancelled) {
                this.lazySet((d)cancelled);
                d.cancel();
                this.parent.close(this, this.index);
            }
        }
        
        @Override
        public void onSubscribe(final d d) {
            SubscriptionHelper.setOnce(this, d, Long.MAX_VALUE);
        }
    }
}
