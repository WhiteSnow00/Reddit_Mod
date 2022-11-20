// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.ArrayDeque;
import ff2.e;
import nt2.d;
import java.util.concurrent.atomic.AtomicLong;
import af2.l;
import nt2.c;
import af2.g;
import java.util.concurrent.Callable;
import lf2.a;
import java.util.Collection;

public final class FlowableBuffer<T, C extends Collection<? super T>> extends lf2.a<T, C>
{
    public final int g;
    public final int h;
    public final Callable<C> i;
    
    public FlowableBuffer(final g<T> g, final int g2, final int h, final Callable<C> i) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final c<? super C> c) {
        final int g = this.g;
        final int h = this.h;
        if (g == h) {
            super.f.subscribe(new a<Object, Object>((nt2.c<? super Collection>)c, g, (Callable<Collection>)this.i));
        }
        else if (h > g) {
            super.f.subscribe(new PublisherBufferSkipSubscriber<Object, Object>((nt2.c<? super Collection>)c, this.g, this.h, (Callable<Collection>)this.i));
        }
        else {
            super.f.subscribe(new PublisherBufferOverlappingSubscriber<Object, Object>((nt2.c<? super Collection>)c, this.g, this.h, (Callable<Collection>)this.i));
        }
    }
    
    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements l<T>, d, e
    {
        private static final long serialVersionUID = -7370244972039324525L;
        public final Callable<C> bufferSupplier;
        public final ArrayDeque<C> buffers;
        public volatile boolean cancelled;
        public boolean done;
        public final c<? super C> downstream;
        public int index;
        public final AtomicBoolean once;
        public long produced;
        public final int size;
        public final int skip;
        public d upstream;
        
        public PublisherBufferOverlappingSubscriber(final c<? super C> downstream, final int size, final int skip, final Callable<C> bufferSupplier) {
            this.downstream = downstream;
            this.size = size;
            this.skip = skip;
            this.bufferSupplier = bufferSupplier;
            this.once = new AtomicBoolean();
            this.buffers = new ArrayDeque<C>();
        }
        
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }
        
        public boolean getAsBoolean() {
            return this.cancelled;
        }
        
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            final long produced = this.produced;
            if (produced != 0L) {
                cg.d.E3((AtomicLong)this, produced);
            }
            final c<? super C> downstream = this.downstream;
            final ArrayDeque<C> buffers = this.buffers;
            if (buffers.isEmpty()) {
                downstream.onComplete();
            }
            else if (!cg.d.D3(this.get(), (c)downstream, (ArrayDeque)buffers, (AtomicLong)this, (e)this)) {
                long value;
                long n;
                do {
                    value = this.get();
                    if ((value & Long.MIN_VALUE) != 0x0L) {
                        return;
                    }
                    n = (Long.MIN_VALUE | value);
                } while (!this.compareAndSet(value, n));
                if (value != 0L) {
                    cg.d.D3(n, (c)downstream, (ArrayDeque)buffers, (AtomicLong)this, (e)this);
                }
            }
        }
        
        public void onError(final Throwable t) {
            if (this.done) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            if (this.done) {
                return;
            }
            final ArrayDeque<C> buffers = this.buffers;
            final int index = this.index;
            final int n = index + 1;
            if (index == 0) {
                try {
                    final Collection<? super T> call = this.bufferSupplier.call();
                    hf2.a.b((Object)call, "The bufferSupplier returned a null buffer");
                    buffers.offer((C)call);
                }
                finally {
                    xd.a.t1((Throwable)t);
                    this.cancel();
                    this.onError((Throwable)t);
                    return;
                }
            }
            final Collection<? super T> collection = buffers.peek();
            if (collection != null && collection.size() + 1 == this.size) {
                buffers.poll();
                collection.add(t);
                ++this.produced;
                this.downstream.onNext((Object)collection);
            }
            final Iterator<C> iterator = buffers.iterator();
            while (iterator.hasNext()) {
                ((Collection<Object>)iterator.next()).add(t);
            }
            int index2;
            if ((index2 = n) == this.skip) {
                index2 = 0;
            }
            this.index = index2;
        }
        
        @Override
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
            }
        }
        
        public void request(long n) {
            if (SubscriptionHelper.validate(n)) {
                final c<? super C> downstream = this.downstream;
                final ArrayDeque<C> buffers = this.buffers;
                long value;
                do {
                    value = this.get();
                } while (!this.compareAndSet(value, cg.d.y0(Long.MAX_VALUE & value, n) | (value & Long.MIN_VALUE)));
                boolean b;
                if (value == Long.MIN_VALUE) {
                    cg.d.D3(n | Long.MIN_VALUE, (c)downstream, (ArrayDeque)buffers, (AtomicLong)this, (e)this);
                    b = true;
                }
                else {
                    b = false;
                }
                if (b) {
                    return;
                }
                if (!this.once.get() && this.once.compareAndSet(false, true)) {
                    n = cg.d.s3((long)this.skip, n - 1L);
                    n = cg.d.y0((long)this.size, n);
                    this.upstream.request(n);
                }
                else {
                    n = cg.d.s3((long)this.skip, n);
                    this.upstream.request(n);
                }
            }
        }
    }
    
    public static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements l<T>, d
    {
        private static final long serialVersionUID = -5616169793639412593L;
        public C buffer;
        public final Callable<C> bufferSupplier;
        public boolean done;
        public final c<? super C> downstream;
        public int index;
        public final int size;
        public final int skip;
        public d upstream;
        
        public PublisherBufferSkipSubscriber(final c<? super C> downstream, final int size, final int skip, final Callable<C> bufferSupplier) {
            this.downstream = downstream;
            this.size = size;
            this.skip = skip;
            this.bufferSupplier = bufferSupplier;
        }
        
        public void cancel() {
            this.upstream.cancel();
        }
        
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            final Collection<? super T> buffer = this.buffer;
            this.buffer = null;
            if (buffer != null) {
                this.downstream.onNext((Object)buffer);
            }
            this.downstream.onComplete();
        }
        
        public void onError(final Throwable t) {
            if (this.done) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            if (this.done) {
                return;
            }
            Collection<? super T> buffer = this.buffer;
            final int index = this.index;
            final int n = index + 1;
            if (index == 0) {
                try {
                    buffer = this.bufferSupplier.call();
                    hf2.a.b((Object)buffer, "The bufferSupplier returned a null buffer");
                    buffer = buffer;
                    this.buffer = (C)buffer;
                }
                finally {
                    xd.a.t1((Throwable)t);
                    this.cancel();
                    this.onError((Throwable)t);
                    return;
                }
            }
            if (buffer != null) {
                buffer.add(t);
                if (buffer.size() == this.size) {
                    this.buffer = null;
                    this.downstream.onNext((Object)buffer);
                }
            }
            int index2;
            if ((index2 = n) == this.skip) {
                index2 = 0;
            }
            this.index = index2;
        }
        
        @Override
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
            }
        }
        
        public void request(long s3) {
            if (SubscriptionHelper.validate(s3)) {
                if (this.get() == 0 && this.compareAndSet(0, 1)) {
                    final long s4 = cg.d.s3(s3, (long)this.size);
                    s3 = cg.d.s3((long)(this.skip - this.size), s3 - 1L);
                    this.upstream.request(cg.d.y0(s4, s3));
                }
                else {
                    this.upstream.request(cg.d.s3((long)this.skip, s3));
                }
            }
        }
    }
    
    public static final class a<T, C extends Collection<? super T>> implements l<T>, d
    {
        public final c<? super C> f;
        public final Callable<C> g;
        public final int h;
        public C i;
        public d j;
        public boolean k;
        public int l;
        
        public a(final c<? super C> f, final int h, final Callable<C> g) {
            this.f = f;
            this.h = h;
            this.g = g;
        }
        
        public final void cancel() {
            this.j.cancel();
        }
        
        public final void onComplete() {
            if (this.k) {
                return;
            }
            this.k = true;
            final Collection<? super T> i = this.i;
            if (i != null && !i.isEmpty()) {
                this.f.onNext((Object)i);
            }
            this.f.onComplete();
        }
        
        public final void onError(final Throwable t) {
            if (this.k) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.k = true;
            this.f.onError(t);
        }
        
        public final void onNext(final T t) {
            if (this.k) {
                return;
            }
            Collection<? super T> i;
            if ((i = this.i) == null) {
                try {
                    i = this.g.call();
                    hf2.a.b((Object)i, "The bufferSupplier returned a null buffer");
                    i = i;
                    this.i = (C)i;
                }
                finally {
                    xd.a.t1((Throwable)t);
                    this.cancel();
                    this.onError((Throwable)t);
                    return;
                }
            }
            i.add(t);
            final int l = this.l + 1;
            if (l == this.h) {
                this.l = 0;
                this.i = null;
                this.f.onNext((Object)i);
            }
            else {
                this.l = l;
            }
        }
        
        @Override
        public final void onSubscribe(final d j) {
            if (SubscriptionHelper.validate(this.j, j)) {
                this.j = j;
                this.f.onSubscribe((d)this);
            }
        }
        
        public final void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                this.j.request(cg.d.s3(n, (long)this.h));
            }
        }
    }
}
