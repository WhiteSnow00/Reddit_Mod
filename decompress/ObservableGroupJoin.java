// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.a0;
import ff2.t;
import kf2.c;
import kf2.o;
import ff2.y;
import sf2.a;

public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends sf2.a<TLeft, R>
{
    public final y<? extends TRight> g;
    public final o<? super TLeft, ? extends y<TLeftEnd>> h;
    public final o<? super TRight, ? extends y<TRightEnd>> i;
    public final c<? super TLeft, ? super t<TRight>, ? extends R> j;
    
    public ObservableGroupJoin(final y<TLeft> y, final y<? extends TRight> g, final o<? super TLeft, ? extends y<TLeftEnd>> h, final o<? super TRight, ? extends y<TRightEnd>> i, final c<? super TLeft, ? super t<TRight>, ? extends R> j) {
        super((y)y);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        final ObservableGroupJoin.ObservableGroupJoin$GroupJoinDisposable observableGroupJoin$GroupJoinDisposable = new ObservableGroupJoin.ObservableGroupJoin$GroupJoinDisposable((a0)a0, (o)this.h, (o)this.i, (c)this.j);
        a0.onSubscribe((if2.a)observableGroupJoin$GroupJoinDisposable);
        final ObservableGroupJoin$LeftRightObserver observableGroupJoin$LeftRightObserver = new ObservableGroupJoin$LeftRightObserver((a)observableGroupJoin$GroupJoinDisposable, true);
        observableGroupJoin$GroupJoinDisposable.disposables.add((if2.a)observableGroupJoin$LeftRightObserver);
        final ObservableGroupJoin$LeftRightObserver observableGroupJoin$LeftRightObserver2 = new ObservableGroupJoin$LeftRightObserver((a)observableGroupJoin$GroupJoinDisposable, false);
        observableGroupJoin$GroupJoinDisposable.disposables.add((if2.a)observableGroupJoin$LeftRightObserver2);
        super.f.subscribe((a0)observableGroupJoin$LeftRightObserver);
        this.g.subscribe((a0)observableGroupJoin$LeftRightObserver2);
    }
    
    public interface a
    {
        void innerClose(final boolean p0, final ObservableGroupJoin$LeftRightEndObserver p1);
        
        void innerCloseError(final Throwable p0);
        
        void innerComplete(final ObservableGroupJoin$LeftRightObserver p0);
        
        void innerError(final Throwable p0);
        
        void innerValue(final boolean p0, final Object p1);
    }
}
