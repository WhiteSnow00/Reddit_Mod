// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import nt2.d;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import af2.e0;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import af2.l;
import nt2.c;
import af2.g;
import af2.g0;
import lf2.a;

public final class FlowableConcatWithSingle<T> extends a<T, T>
{
    public final g0<? extends T> g;
    
    public FlowableConcatWithSingle(final g<T> g, final g0<? extends T> g2) {
        super(g);
        this.g = g2;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe(new ConcatWithSubscriber((nt2.c<? super Object>)c, this.g));
    }
    
    public static final class ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements e0<T>
    {
        private static final long serialVersionUID = -7346385463600070225L;
        public g0<? extends T> other;
        public final AtomicReference<df2.a> otherDisposable;
        
        public ConcatWithSubscriber(final c<? super T> c, final g0<? extends T> other) {
            super(c);
            this.other = other;
            this.otherDisposable = new AtomicReference<df2.a>();
        }
        
        @Override
        public void cancel() {
            super.cancel();
            DisposableHelper.dispose((AtomicReference)this.otherDisposable);
        }
        
        @Override
        public void onComplete() {
            super.upstream = (d)SubscriptionHelper.CANCELLED;
            final g0<? extends T> other = this.other;
            this.other = null;
            other.a((e0)this);
        }
        
        @Override
        public void onError(final Throwable t) {
            super.downstream.onError(t);
        }
        
        @Override
        public void onNext(final T t) {
            ++super.produced;
            super.downstream.onNext((Object)t);
        }
        
        public void onSubscribe(final df2.a a) {
            DisposableHelper.setOnce((AtomicReference)this.otherDisposable, a);
        }
        
        public void onSuccess(final T t) {
            this.complete(t);
        }
    }
}
