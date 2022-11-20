// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import af2.l;
import nt2.d;
import af2.g;
import ff2.c;
import ff2.o;
import nt2.b;
import lf2.a;

public final class FlowableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends a<TLeft, R>
{
    public final b<? extends TRight> g;
    public final o<? super TLeft, ? extends b<TLeftEnd>> h;
    public final o<? super TRight, ? extends b<TRightEnd>> i;
    public final c<? super TLeft, ? super TRight, ? extends R> j;
    
    public FlowableJoin(final g<TLeft> g, final b<? extends TRight> g2, final o<? super TLeft, ? extends b<TLeftEnd>> h, final o<? super TRight, ? extends b<TRightEnd>> i, final c<? super TLeft, ? super TRight, ? extends R> j) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void subscribeActual(final nt2.c<? super R> c) {
        final FlowableJoin.FlowableJoin$JoinSubscription flowableJoin$JoinSubscription = new FlowableJoin.FlowableJoin$JoinSubscription((nt2.c)c, (o)this.h, (o)this.i, (c)this.j);
        c.onSubscribe((d)flowableJoin$JoinSubscription);
        final FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber = new FlowableGroupJoin.LeftRightSubscriber((FlowableGroupJoin$a)flowableJoin$JoinSubscription, true);
        flowableJoin$JoinSubscription.disposables.add((df2.a)leftRightSubscriber);
        final FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber2 = new FlowableGroupJoin.LeftRightSubscriber((FlowableGroupJoin$a)flowableJoin$JoinSubscription, false);
        flowableJoin$JoinSubscription.disposables.add((df2.a)leftRightSubscriber2);
        super.f.subscribe(leftRightSubscriber);
        this.g.subscribe((nt2.c)leftRightSubscriber2);
    }
}
