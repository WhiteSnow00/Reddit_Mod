// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import af2.l;
import nt2.d;
import af2.g;
import ff2.c;
import ff2.o;
import nt2.b;
import lf2.a;

public final class FlowableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends a<TLeft, R>
{
    public final b<? extends TRight> g;
    public final o<? super TLeft, ? extends b<TLeftEnd>> h;
    public final o<? super TRight, ? extends b<TRightEnd>> i;
    public final c<? super TLeft, ? super g<TRight>, ? extends R> j;
    
    public FlowableGroupJoin(final g<TLeft> g, final b<? extends TRight> g2, final o<? super TLeft, ? extends b<TLeftEnd>> h, final o<? super TRight, ? extends b<TRightEnd>> i, final c<? super TLeft, ? super g<TRight>, ? extends R> j) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void subscribeActual(final nt2.c<? super R> c) {
        final FlowableGroupJoin.FlowableGroupJoin$GroupJoinSubscription flowableGroupJoin$GroupJoinSubscription = new FlowableGroupJoin.FlowableGroupJoin$GroupJoinSubscription((nt2.c)c, (o)this.h, (o)this.i, (c)this.j);
        c.onSubscribe((d)flowableGroupJoin$GroupJoinSubscription);
        final LeftRightSubscriber leftRightSubscriber = new LeftRightSubscriber((FlowableGroupJoin$a)flowableGroupJoin$GroupJoinSubscription, true);
        flowableGroupJoin$GroupJoinSubscription.disposables.add((df2.a)leftRightSubscriber);
        final LeftRightSubscriber leftRightSubscriber2 = new LeftRightSubscriber((FlowableGroupJoin$a)flowableGroupJoin$GroupJoinSubscription, false);
        flowableGroupJoin$GroupJoinSubscription.disposables.add((df2.a)leftRightSubscriber2);
        super.f.subscribe(leftRightSubscriber);
        this.g.subscribe((nt2.c)leftRightSubscriber2);
    }
    
    public static final class LeftRightEndSubscriber extends AtomicReference<d> implements l<Object>, df2.a
    {
        private static final long serialVersionUID = 1883890389173668373L;
        public final int index;
        public final boolean isLeft;
        public final FlowableGroupJoin$a parent;
        
        public LeftRightEndSubscriber(final FlowableGroupJoin$a parent, final boolean isLeft, final int index) {
            this.parent = parent;
            this.isLeft = isLeft;
            this.index = index;
        }
        
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }
        
        public boolean isDisposed() {
            return this.get() == SubscriptionHelper.CANCELLED;
        }
        
        public void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }
        
        public void onError(final Throwable t) {
            this.parent.innerCloseError(t);
        }
        
        public void onNext(final Object o) {
            if (SubscriptionHelper.cancel(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }
        
        @Override
        public void onSubscribe(final d d) {
            SubscriptionHelper.setOnce(this, d, Long.MAX_VALUE);
        }
    }
    
    public static final class LeftRightSubscriber extends AtomicReference<d> implements l<Object>, df2.a
    {
        private static final long serialVersionUID = 1883890389173668373L;
        public final boolean isLeft;
        public final FlowableGroupJoin$a parent;
        
        public LeftRightSubscriber(final FlowableGroupJoin$a parent, final boolean isLeft) {
            this.parent = parent;
            this.isLeft = isLeft;
        }
        
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }
        
        public boolean isDisposed() {
            return this.get() == SubscriptionHelper.CANCELLED;
        }
        
        public void onComplete() {
            this.parent.innerComplete(this);
        }
        
        public void onError(final Throwable t) {
            this.parent.innerError(t);
        }
        
        public void onNext(final Object o) {
            this.parent.innerValue(this.isLeft, o);
        }
        
        @Override
        public void onSubscribe(final d d) {
            SubscriptionHelper.setOnce(this, d, Long.MAX_VALUE);
        }
    }
}
