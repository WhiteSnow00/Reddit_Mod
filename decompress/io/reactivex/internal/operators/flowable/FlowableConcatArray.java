// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import af2.l;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import nt2.d;
import nt2.c;
import nt2.b;
import af2.g;

public final class FlowableConcatArray<T> extends g<T>
{
    public final b<? extends T>[] f;
    public final boolean g;
    
    public FlowableConcatArray(final b<? extends T>[] f, final boolean g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber((b<? extends T>[])this.f, this.g, (c<? super T>)c);
        c.onSubscribe((d)concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
    
    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements l<T>
    {
        private static final long serialVersionUID = -8158322871608889516L;
        public final boolean delayError;
        public final c<? super T> downstream;
        public List<Throwable> errors;
        public int index;
        public long produced;
        public final b<? extends T>[] sources;
        public final AtomicInteger wip;
        
        public ConcatArraySubscriber(final b<? extends T>[] sources, final boolean delayError, final c<? super T> downstream) {
            super(false);
            this.downstream = downstream;
            this.sources = sources;
            this.delayError = delayError;
            this.wip = new AtomicInteger();
        }
        
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                final b<? extends T>[] sources = this.sources;
                final int length = sources.length;
                int i = this.index;
                while (i != length) {
                    final b<? extends T> b = sources[i];
                    if (b == null) {
                        final NullPointerException ex = new NullPointerException("A Publisher entry is null");
                        if (!this.delayError) {
                            this.downstream.onError((Throwable)ex);
                            return;
                        }
                        List<Throwable> errors;
                        if ((errors = this.errors) == null) {
                            errors = new ArrayList<Throwable>(length - i + 1);
                            this.errors = errors;
                        }
                        errors.add(ex);
                        ++i;
                    }
                    else {
                        final long produced = this.produced;
                        if (produced != 0L) {
                            this.produced = 0L;
                            this.produced(produced);
                        }
                        b.subscribe((c)this);
                        ++i;
                        this.index = i;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                        continue;
                    }
                }
                final List<Throwable> errors2 = this.errors;
                if (errors2 != null) {
                    if (errors2.size() == 1) {
                        this.downstream.onError((Throwable)errors2.get(0));
                    }
                    else {
                        this.downstream.onError((Throwable)new CompositeException((Iterable)errors2));
                    }
                }
                else {
                    this.downstream.onComplete();
                }
            }
        }
        
        public void onError(final Throwable t) {
            if (this.delayError) {
                List<Throwable> errors;
                if ((errors = this.errors) == null) {
                    errors = new ArrayList<Throwable>(this.sources.length - this.index + 1);
                    this.errors = errors;
                }
                errors.add(t);
                this.onComplete();
            }
            else {
                this.downstream.onError(t);
            }
        }
        
        public void onNext(final T t) {
            ++this.produced;
            this.downstream.onNext((Object)t);
        }
        
        @Override
        public void onSubscribe(final d subscription) {
            this.setSubscription(subscription);
        }
    }
}
