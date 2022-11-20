// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import nt2.d;
import io.reactivex.plugins.RxJavaPlugins;
import nt2.c;
import java.util.concurrent.atomic.AtomicLong;
import af2.g;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import af2.l;
import lf2.a;

public final class FlowableCache<T> extends a<T, T> implements l<T>
{
    public static final FlowableCache.FlowableCache$CacheSubscription[] p;
    public static final FlowableCache.FlowableCache$CacheSubscription[] q;
    public final AtomicBoolean g;
    public final int h;
    public final AtomicReference<FlowableCache.FlowableCache$CacheSubscription<T>[]> i;
    public volatile long j;
    public final FlowableCache.FlowableCache$a<T> k;
    public FlowableCache.FlowableCache$a<T> l;
    public int m;
    public Throwable n;
    public volatile boolean o;
    
    static {
        p = new FlowableCache.FlowableCache$CacheSubscription[0];
        q = new FlowableCache.FlowableCache$CacheSubscription[0];
    }
    
    public FlowableCache(final g<T> g, final int h) {
        super(g);
        this.h = h;
        this.g = new AtomicBoolean();
        final FlowableCache.FlowableCache$a flowableCache$a = new FlowableCache.FlowableCache$a(h);
        this.k = (FlowableCache.FlowableCache$a<T>)flowableCache$a;
        this.l = (FlowableCache.FlowableCache$a<T>)flowableCache$a;
        this.i = new AtomicReference<FlowableCache.FlowableCache$CacheSubscription<T>[]>((FlowableCache.FlowableCache$CacheSubscription<T>[])FlowableCache.p);
    }
    
    public final void e(final FlowableCache.FlowableCache$CacheSubscription<T> flowableCache$CacheSubscription) {
        if (((AtomicInteger)flowableCache$CacheSubscription).getAndIncrement() != 0) {
            return;
        }
        long index = flowableCache$CacheSubscription.index;
        int offset = flowableCache$CacheSubscription.offset;
        FlowableCache.FlowableCache$a node = flowableCache$CacheSubscription.node;
        final AtomicLong requested = flowableCache$CacheSubscription.requested;
        final c downstream = flowableCache$CacheSubscription.downstream;
        final int h = this.h;
        int addAndGet = 1;
        while (true) {
            final boolean o = this.o;
            final boolean b = this.j == index;
            if (o && b) {
                flowableCache$CacheSubscription.node = null;
                final Throwable n = this.n;
                if (n != null) {
                    downstream.onError(n);
                }
                else {
                    downstream.onComplete();
                }
                return;
            }
            if (!b) {
                final long value = requested.get();
                if (value == Long.MIN_VALUE) {
                    flowableCache$CacheSubscription.node = null;
                    return;
                }
                if (value != index) {
                    int n2 = offset;
                    FlowableCache.FlowableCache$a b2 = node;
                    if (offset == h) {
                        b2 = node.b;
                        n2 = 0;
                    }
                    downstream.onNext(b2.a[n2]);
                    offset = n2 + 1;
                    ++index;
                    node = b2;
                    continue;
                }
            }
            flowableCache$CacheSubscription.index = index;
            flowableCache$CacheSubscription.offset = offset;
            flowableCache$CacheSubscription.node = node;
            if ((addAndGet = ((AtomicInteger)flowableCache$CacheSubscription).addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
    }
    
    public final void onComplete() {
        this.o = true;
        final FlowableCache.FlowableCache$CacheSubscription[] array = this.i.getAndSet((FlowableCache.FlowableCache$CacheSubscription<T>[])FlowableCache.q);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.e((FlowableCache.FlowableCache$CacheSubscription<T>)array[i]);
        }
    }
    
    public final void onError(final Throwable n) {
        if (this.o) {
            RxJavaPlugins.onError(n);
            return;
        }
        this.n = n;
        this.o = true;
        final FlowableCache.FlowableCache$CacheSubscription[] array = this.i.getAndSet((FlowableCache.FlowableCache$CacheSubscription<T>[])FlowableCache.q);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.e((FlowableCache.FlowableCache$CacheSubscription<T>)array[i]);
        }
    }
    
    public final void onNext(final T t) {
        final int m = this.m;
        final int h = this.h;
        int i = 0;
        if (m == h) {
            final FlowableCache.FlowableCache$a flowableCache$a = new FlowableCache.FlowableCache$a(m);
            flowableCache$a.a[0] = t;
            this.m = 1;
            this.l.b = flowableCache$a;
            this.l = (FlowableCache.FlowableCache$a<T>)flowableCache$a;
        }
        else {
            this.l.a[m] = t;
            this.m = m + 1;
        }
        ++this.j;
        for (FlowableCache.FlowableCache$CacheSubscription[] array = this.i.get(); i < array.length; ++i) {
            this.e((FlowableCache.FlowableCache$CacheSubscription<T>)array[i]);
        }
    }
    
    @Override
    public final void onSubscribe(final d d) {
        d.request(Long.MAX_VALUE);
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final FlowableCache.FlowableCache$CacheSubscription flowableCache$CacheSubscription = new FlowableCache.FlowableCache$CacheSubscription((c)c, this);
        c.onSubscribe((d)flowableCache$CacheSubscription);
        boolean b;
    Label_0096:
        do {
            final FlowableCache.FlowableCache$CacheSubscription[] array = this.i.get();
            if (array == FlowableCache.q) {
                break;
            }
            final int length = ((FlowableCache.FlowableCache$CacheSubscription<T>[])array).length;
            final FlowableCache.FlowableCache$CacheSubscription[] array2 = new FlowableCache.FlowableCache$CacheSubscription[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = flowableCache$CacheSubscription;
            final AtomicReference<FlowableCache.FlowableCache$CacheSubscription<T>[]> i = this.i;
            while (!i.compareAndSet((FlowableCache.FlowableCache$CacheSubscription<T>[])array, (FlowableCache.FlowableCache$CacheSubscription<T>[])array2)) {
                if (i.get() != array) {
                    b = false;
                    continue Label_0096;
                }
            }
            b = true;
        } while (!b);
        if (!this.g.get() && this.g.compareAndSet(false, true)) {
            super.f.subscribe(this);
        }
        else {
            this.e((FlowableCache.FlowableCache$CacheSubscription<T>)flowableCache$CacheSubscription);
        }
    }
}
