// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import vl.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import ff2.l;
import java.util.concurrent.atomic.AtomicReference;
import gg2.d;
import qt2.c;
import qt2.b;
import ff2.g;

public final class FlowableSamplePublisher<T> extends g<T>
{
    public final b<T> f;
    public final b<?> g;
    public final boolean h;
    
    public FlowableSamplePublisher(final b<T> f, final b<?> g, final boolean h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final d d = new d((c)c);
        if (this.h) {
            this.f.subscribe((c)new FlowableSamplePublisher.FlowableSamplePublisher$SampleMainEmitLast((c)d, (b)this.g));
        }
        else {
            this.f.subscribe((c)new FlowableSamplePublisher.FlowableSamplePublisher$SampleMainNoLast((c)d, (b)this.g));
        }
    }
    
    public abstract static class SamplePublisherSubscriber<T> extends AtomicReference<T> implements l<T>, qt2.d
    {
        private static final long serialVersionUID = -3517602651313910099L;
        public final c<? super T> downstream;
        public final AtomicReference<qt2.d> other;
        public final AtomicLong requested;
        public final b<?> sampler;
        public qt2.d upstream;
        
        public SamplePublisherSubscriber(final c<? super T> downstream, final b<?> sampler) {
            this.requested = new AtomicLong();
            this.other = new AtomicReference<qt2.d>();
            this.downstream = downstream;
            this.sampler = sampler;
        }
        
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            this.upstream.cancel();
        }
        
        public void complete() {
            this.upstream.cancel();
            this.completion();
        }
        
        public abstract void completion();
        
        public void emit() {
            final T andSet = this.getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0L) {
                    this.downstream.onNext((Object)andSet);
                    vl.a.l0(this.requested, 1L);
                }
                else {
                    this.cancel();
                    this.downstream.onError((Throwable)new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }
        
        public void error(final Throwable t) {
            this.upstream.cancel();
            this.downstream.onError(t);
        }
        
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            this.completion();
        }
        
        public void onError(final Throwable t) {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            this.lazySet(t);
        }
        
        public void onSubscribe(final qt2.d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((qt2.d)this);
                if (this.other.get() == null) {
                    this.sampler.subscribe((c)new a((SamplePublisherSubscriber<Object>)this));
                    upstream.request(Long.MAX_VALUE);
                }
            }
        }
        
        public void request(final long n) {
            if (SubscriptionHelper.validate(n)) {
                vl.a.l(this.requested, n);
            }
        }
        
        public abstract void run();
        
        public void setOther(final qt2.d d) {
            SubscriptionHelper.setOnce(this.other, d, Long.MAX_VALUE);
        }
    }
    
    public static final class a<T> implements l<Object>
    {
        public final SamplePublisherSubscriber<T> f;
        
        public a(final SamplePublisherSubscriber<T> f) {
            this.f = f;
        }
        
        public final void onComplete() {
            this.f.complete();
        }
        
        public final void onError(final Throwable t) {
            this.f.error(t);
        }
        
        public final void onNext(final Object o) {
            this.f.run();
        }
        
        public final void onSubscribe(final qt2.d other) {
            this.f.setOther(other);
        }
    }
}
