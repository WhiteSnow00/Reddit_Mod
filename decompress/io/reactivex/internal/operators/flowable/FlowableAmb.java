// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import af2.l;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import nt2.d;
import xd.a;
import io.reactivex.internal.subscriptions.EmptySubscription;
import nt2.c;
import nt2.b;
import af2.g;

public final class FlowableAmb<T> extends g<T>
{
    public final b<? extends T>[] f;
    public final Iterable<? extends b<? extends T>> g;
    
    public FlowableAmb(final b<? extends T>[] f, final Iterable<? extends b<? extends T>> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        b[] f = this.f;
        final int n = 0;
        int length = 0;
        Label_0151: {
            if (f == null) {
                b[] array = new b[8];
                try {
                    final Iterator<? extends b<? extends T>> iterator = this.g.iterator();
                    int n2 = 0;
                    while (true) {
                        f = array;
                        length = n2;
                        if (!iterator.hasNext()) {
                            break Label_0151;
                        }
                        final b b = iterator.next();
                        if (b == null) {
                            break;
                        }
                        f = array;
                        if (n2 == array.length) {
                            f = new b[(n2 >> 2) + n2];
                            System.arraycopy(array, 0, f, 0, n2);
                        }
                        f[n2] = b;
                        ++n2;
                        array = f;
                    }
                    EmptySubscription.error((Throwable)new NullPointerException("One of the sources is null"), (c)c);
                    return;
                }
                finally {
                    final Throwable t;
                    a.t1(t);
                    EmptySubscription.error(t, (c)c);
                    return;
                }
            }
            length = f.length;
        }
        if (length == 0) {
            EmptySubscription.complete((c)c);
            return;
        }
        if (length == 1) {
            f[0].subscribe((c)c);
            return;
        }
        final FlowableAmb$a flowableAmb$a = new FlowableAmb$a((c)c, length);
        final AmbInnerSubscriber[] g = flowableAmb$a.g;
        final int length2 = g.length;
        int n3;
        for (int i = 0; i < length2; i = n3) {
            n3 = i + 1;
            g[i] = new AmbInnerSubscriber((io.reactivex.internal.operators.flowable.FlowableAmb$a<Object>)flowableAmb$a, n3, (nt2.c<? super Object>)flowableAmb$a.f);
        }
        flowableAmb$a.h.lazySet(0);
        flowableAmb$a.f.onSubscribe((d)flowableAmb$a);
        for (int n4 = n; n4 < length2 && flowableAmb$a.h.get() == 0; ++n4) {
            f[n4].subscribe((c)g[n4]);
        }
    }
    
    public static final class AmbInnerSubscriber<T> extends AtomicReference<d> implements l<T>, d
    {
        private static final long serialVersionUID = -1185974347409665484L;
        public final c<? super T> downstream;
        public final int index;
        public final AtomicLong missedRequested;
        public final FlowableAmb$a<T> parent;
        public boolean won;
        
        public AmbInnerSubscriber(final FlowableAmb$a<T> parent, final int index, final c<? super T> downstream) {
            this.missedRequested = new AtomicLong();
            this.parent = parent;
            this.index = index;
            this.downstream = downstream;
        }
        
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }
        
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            }
            else if (this.parent.a(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            }
            else {
                this.get().cancel();
            }
        }
        
        public void onError(final Throwable t) {
            if (this.won) {
                this.downstream.onError(t);
            }
            else if (this.parent.a(this.index)) {
                this.won = true;
                this.downstream.onError(t);
            }
            else {
                this.get().cancel();
                RxJavaPlugins.onError(t);
            }
        }
        
        public void onNext(final T t) {
            if (this.won) {
                this.downstream.onNext((Object)t);
            }
            else if (this.parent.a(this.index)) {
                this.won = true;
                this.downstream.onNext((Object)t);
            }
            else {
                this.get().cancel();
            }
        }
        
        @Override
        public void onSubscribe(final d d) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, d);
        }
        
        public void request(final long n) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, n);
        }
    }
}
