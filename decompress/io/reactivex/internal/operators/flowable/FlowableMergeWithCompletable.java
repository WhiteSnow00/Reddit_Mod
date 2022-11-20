// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import af2.l;
import nt2.d;
import nt2.c;
import af2.g;
import af2.e;
import lf2.a;

public final class FlowableMergeWithCompletable<T> extends a<T, T>
{
    public final e g;
    
    public FlowableMergeWithCompletable(final g<T> g, final e g2) {
        super(g);
        this.g = g2;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final MergeWithSubscriber mergeWithSubscriber = new MergeWithSubscriber<Object>((nt2.c<? super T>)c);
        c.onSubscribe((d)mergeWithSubscriber);
        super.f.subscribe(mergeWithSubscriber);
        this.g.a((af2.c)mergeWithSubscriber.otherObserver);
    }
    
    public static final class MergeWithSubscriber<T> extends AtomicInteger implements l<T>, d
    {
        private static final long serialVersionUID = -4592979584110982903L;
        public final c<? super T> downstream;
        public final AtomicThrowable error;
        public volatile boolean mainDone;
        public final AtomicReference<d> mainSubscription;
        public volatile boolean otherDone;
        public final MergeWithSubscriber.FlowableMergeWithCompletable$MergeWithSubscriber$OtherObserver otherObserver;
        public final AtomicLong requested;
        
        public MergeWithSubscriber(final c<? super T> downstream) {
            this.downstream = downstream;
            this.mainSubscription = new AtomicReference<d>();
            this.otherObserver = new MergeWithSubscriber.FlowableMergeWithCompletable$MergeWithSubscriber$OtherObserver(this);
            this.error = new AtomicThrowable();
            this.requested = new AtomicLong();
        }
        
        public void cancel() {
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose((AtomicReference)this.otherObserver);
        }
        
        public void onComplete() {
            this.mainDone = true;
            if (this.otherDone) {
                xd.a.z0((c)this.downstream, (AtomicInteger)this, this.error);
            }
        }
        
        public void onError(final Throwable t) {
            DisposableHelper.dispose((AtomicReference)this.otherObserver);
            xd.a.B0((c)this.downstream, t, (AtomicInteger)this, this.error);
        }
        
        public void onNext(final T t) {
            xd.a.D0((c)this.downstream, (Object)t, (AtomicInteger)this, this.error);
        }
        
        @Override
        public void onSubscribe(final d d) {
            SubscriptionHelper.deferredSetOnce(this.mainSubscription, this.requested, d);
        }
        
        public void otherComplete() {
            this.otherDone = true;
            if (this.mainDone) {
                xd.a.z0((c)this.downstream, (AtomicInteger)this, this.error);
            }
        }
        
        public void otherError(final Throwable t) {
            SubscriptionHelper.cancel(this.mainSubscription);
            xd.a.B0((c)this.downstream, t, (AtomicInteger)this, this.error);
        }
        
        public void request(final long n) {
            SubscriptionHelper.deferredRequest(this.mainSubscription, this.requested, n);
        }
    }
}
