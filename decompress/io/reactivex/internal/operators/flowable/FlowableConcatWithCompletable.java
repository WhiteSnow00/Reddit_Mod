// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.disposables.DisposableHelper;
import nt2.d;
import java.util.concurrent.atomic.AtomicReference;
import af2.l;
import nt2.c;
import af2.g;
import af2.e;
import lf2.a;

public final class FlowableConcatWithCompletable<T> extends a<T, T>
{
    public final e g;
    
    public FlowableConcatWithCompletable(final g<T> g, final e g2) {
        super(g);
        this.g = g2;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe(new ConcatWithSubscriber<Object>((nt2.c<? super T>)c, this.g));
    }
    
    public static final class ConcatWithSubscriber<T> extends AtomicReference<df2.a> implements l<T>, af2.c, d
    {
        private static final long serialVersionUID = -7346385463600070225L;
        public final c<? super T> downstream;
        public boolean inCompletable;
        public e other;
        public d upstream;
        
        public ConcatWithSubscriber(final c<? super T> downstream, final e other) {
            this.downstream = downstream;
            this.other = other;
        }
        
        public void cancel() {
            this.upstream.cancel();
            DisposableHelper.dispose((AtomicReference)this);
        }
        
        public void onComplete() {
            if (this.inCompletable) {
                this.downstream.onComplete();
            }
            else {
                this.inCompletable = true;
                this.upstream = (d)SubscriptionHelper.CANCELLED;
                final e other = this.other;
                this.other = null;
                other.a((af2.c)this);
            }
        }
        
        public void onError(final Throwable t) {
            this.downstream.onError(t);
        }
        
        public void onNext(final T t) {
            this.downstream.onNext((Object)t);
        }
        
        public void onSubscribe(final df2.a a) {
            DisposableHelper.setOnce((AtomicReference)this, a);
        }
        
        @Override
        public void onSubscribe(final d upstream) {
            if (SubscriptionHelper.validate(this.upstream, upstream)) {
                this.upstream = upstream;
                this.downstream.onSubscribe((d)this);
            }
        }
        
        public void request(final long n) {
            this.upstream.request(n);
        }
    }
}
