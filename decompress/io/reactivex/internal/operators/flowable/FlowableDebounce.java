// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import af2.l;
import bg2.d;
import nt2.c;
import af2.g;
import nt2.b;
import ff2.o;
import lf2.a;

public final class FlowableDebounce<T, U> extends a<T, T>
{
    public final o<? super T, ? extends b<U>> g;
    
    public FlowableDebounce(final g<T> g, final o<? super T, ? extends b<U>> g2) {
        super(g);
        this.g = g2;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe(new DebounceSubscriber<Object, Object>((nt2.c<? super T>)new d((c)c), this.g));
    }
    
    public static final class DebounceSubscriber<T, U> extends AtomicLong implements l<T>, nt2.d
    {
        private static final long serialVersionUID = 6725975399620862591L;
        public final o<? super T, ? extends b<U>> debounceSelector;
        public final AtomicReference<df2.a> debouncer;
        public boolean done;
        public final c<? super T> downstream;
        public volatile long index;
        public nt2.d upstream;
        
        public DebounceSubscriber(final c<? super T> downstream, final o<? super T, ? extends b<U>> debounceSelector) {
            this.debouncer = new AtomicReference<df2.a>();
            this.downstream = downstream;
            this.debounceSelector = debounceSelector;
        }
        
        public void cancel() {
            this.upstream.cancel();
            DisposableHelper.dispose((AtomicReference)this.debouncer);
        }
        
        public void emit(final long n, final T t) {
            if (n == this.index) {
                if (this.get() != 0L) {
                    this.downstream.onNext((Object)t);
                    cg.d.E3((AtomicLong)this, 1L);
                }
                else {
                    this.cancel();
                    this.downstream.onError((Throwable)new MissingBackpressureException("Could not deliver value due to lack of requests"));
                }
            }
        }
        
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            final df2.a a = this.debouncer.get();
            if (!DisposableHelper.isDisposed(a)) {
                final a a2 = (a)a;
                if (a2 != null) {
                    a2.a();
                }
                DisposableHelper.dispose((AtomicReference)this.debouncer);
                this.downstream.onComplete();
            }
        }
        
        public void onError(final Throwable t) {
            DisposableHelper.dispose((AtomicReference)this.debouncer);
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            if (this.done) {
                return;
            }
            final long index = this.index + 1L;
            this.index = index;
            final df2.a a = this.debouncer.get();
            if (a != null) {
                a.dispose();
            }
            try {
                final Object apply = this.debounceSelector.apply((Object)t);
                hf2.a.b(apply, "The publisher supplied is null");
                final b b = (b)apply;
                final a a2 = new a((DebounceSubscriber<Object, Object>)this, index, t);
                final AtomicReference<df2.a> debouncer = this.debouncer;
                while (true) {
                    while (!debouncer.compareAndSet(a, (df2.a)a2)) {
                        if (debouncer.get() != a) {
                            final boolean b2 = false;
                            if (b2) {
                                b.subscribe((c)a2);
                            }
                            return;
                        }
                    }
                    final boolean b2 = true;
                    continue;
                }
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                this.cancel();
                this.downstream.onError(t2);
            }
        }
        
        @Override
        public void onSubscribe(final nt2.d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((nt2.d)this);
                upstream.request(Long.MAX_VALUE);
            }
        }
        
        public void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                cg.d.w0((AtomicLong)this, n);
            }
        }
        
        public static final class a<T, U> extends bg2.b<U>
        {
            public final DebounceSubscriber<T, U> g;
            public final long h;
            public final T i;
            public boolean j;
            public final AtomicBoolean k;
            
            public a(final DebounceSubscriber<T, U> g, final long h, final T i) {
                this.k = new AtomicBoolean();
                this.g = g;
                this.h = h;
                this.i = i;
            }
            
            public final void a() {
                if (this.k.compareAndSet(false, true)) {
                    this.g.emit(this.h, this.i);
                }
            }
            
            public final void onComplete() {
                if (this.j) {
                    return;
                }
                this.j = true;
                this.a();
            }
            
            public final void onError(final Throwable t) {
                if (this.j) {
                    RxJavaPlugins.onError(t);
                    return;
                }
                this.j = true;
                this.g.onError(t);
            }
            
            public final void onNext(final U u) {
                if (this.j) {
                    return;
                }
                this.j = true;
                this.dispose();
                this.a();
            }
        }
    }
}
