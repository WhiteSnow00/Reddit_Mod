// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.subscribers;

import java.util.List;
import io.reactivex.internal.util.VolatileSizeArrayList;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nt2.c;
import nt2.d;
import af2.l;
import vf2.a;

public final class TestSubscriber<T> extends a<T, TestSubscriber<T>> implements l<T>, d
{
    public final c<? super T> j;
    public volatile boolean k;
    public final AtomicReference<d> l;
    public final AtomicLong m;
    
    public TestSubscriber() {
        this((c)EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }
    
    public TestSubscriber(final long n) {
        this((c)EmptySubscriber.INSTANCE, n);
    }
    
    public TestSubscriber(final c<? super T> j, final long n) {
        if (n >= 0L) {
            this.j = j;
            this.l = new AtomicReference<d>();
            this.m = new AtomicLong(n);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
    
    public final void cancel() {
        if (!this.k) {
            this.k = true;
            SubscriptionHelper.cancel(this.l);
        }
    }
    
    public final void dispose() {
        this.cancel();
    }
    
    public final boolean isDisposed() {
        return this.k;
    }
    
    public final void onComplete() {
        if (!super.i) {
            super.i = true;
            if (this.l.get() == null) {
                ((List<IllegalStateException>)super.h).add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.j.onComplete();
        }
        finally {
            super.f.countDown();
        }
    }
    
    public final void onError(final Throwable t) {
        if (!super.i) {
            super.i = true;
            if (this.l.get() == null) {
                ((List<NullPointerException>)super.h).add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            ((List<Throwable>)super.h).add(t);
            if (t == null) {
                ((List<IllegalStateException>)super.h).add(new IllegalStateException("onError received a null Throwable"));
            }
            this.j.onError(t);
        }
        finally {
            super.f.countDown();
        }
    }
    
    public final void onNext(final T t) {
        if (!super.i) {
            super.i = true;
            if (this.l.get() == null) {
                ((List<IllegalStateException>)super.h).add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        ((List<T>)super.g).add(t);
        if (t == null) {
            ((List<NullPointerException>)super.h).add(new NullPointerException("onNext received a null value"));
        }
        this.j.onNext((Object)t);
    }
    
    public final void onSubscribe(final d d) {
        Thread.currentThread();
        if (d == null) {
            ((List<NullPointerException>)super.h).add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        final AtomicReference<d> l = this.l;
        while (true) {
            while (!l.compareAndSet(null, d)) {
                if (l.get() != null) {
                    final boolean b = false;
                    if (!b) {
                        d.cancel();
                        if (this.l.get() != SubscriptionHelper.CANCELLED) {
                            final VolatileSizeArrayList h = super.h;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("onSubscribe received multiple subscriptions: ");
                            sb.append(d);
                            ((List<IllegalStateException>)h).add(new IllegalStateException(sb.toString()));
                        }
                        return;
                    }
                    this.j.onSubscribe(d);
                    final long andSet = this.m.getAndSet(0L);
                    if (andSet != 0L) {
                        d.request(andSet);
                    }
                    return;
                }
            }
            final boolean b = true;
            continue;
        }
    }
    
    public final void request(final long n) {
        SubscriptionHelper.deferredRequest(this.l, this.m, n);
    }
    
    public enum EmptySubscriber implements l<Object>
    {
        private static final EmptySubscriber[] $VALUES;
        
        INSTANCE;
        
        public void onComplete() {
        }
        
        public void onError(final Throwable t) {
        }
        
        public void onNext(final Object o) {
        }
        
        @Override
        public void onSubscribe(final d d) {
        }
    }
}
