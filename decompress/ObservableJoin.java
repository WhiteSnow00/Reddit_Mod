// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.a0;
import kf2.c;
import kf2.o;
import ff2.y;
import sf2.a;

public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends a<TLeft, R>
{
    public final y<? extends TRight> g;
    public final o<? super TLeft, ? extends y<TLeftEnd>> h;
    public final o<? super TRight, ? extends y<TRightEnd>> i;
    public final c<? super TLeft, ? super TRight, ? extends R> j;
    
    public ObservableJoin(final y<TLeft> y, final y<? extends TRight> g, final o<? super TLeft, ? extends y<TLeftEnd>> h, final o<? super TRight, ? extends y<TRightEnd>> i, final c<? super TLeft, ? super TRight, ? extends R> j) {
        super((y)y);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        final ObservableJoin.ObservableJoin$JoinDisposable observableJoin$JoinDisposable = new ObservableJoin.ObservableJoin$JoinDisposable((a0)a0, (o)this.h, (o)this.i, (c)this.j);
        a0.onSubscribe((if2.a)observableJoin$JoinDisposable);
        final ObservableGroupJoin$LeftRightObserver observableGroupJoin$LeftRightObserver = new ObservableGroupJoin$LeftRightObserver((ObservableGroupJoin.a)observableJoin$JoinDisposable, true);
        observableJoin$JoinDisposable.disposables.add((if2.a)observableGroupJoin$LeftRightObserver);
        final ObservableGroupJoin$LeftRightObserver observableGroupJoin$LeftRightObserver2 = new ObservableGroupJoin$LeftRightObserver((ObservableGroupJoin.a)observableJoin$JoinDisposable, false);
        observableJoin$JoinDisposable.disposables.add((if2.a)observableGroupJoin$LeftRightObserver2);
        super.f.subscribe((a0)observableGroupJoin$LeftRightObserver);
        this.g.subscribe((a0)observableGroupJoin$LeftRightObserver2);
    }
}
