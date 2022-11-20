// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import df2.a;
import af2.a0;
import ff2.d;
import af2.y;
import af2.t;

public final class ObservableSequenceEqual<T> extends t<Boolean>
{
    public final y<? extends T> f;
    public final y<? extends T> g;
    public final d<? super T, ? super T> h;
    public final int i;
    
    public ObservableSequenceEqual(final y<? extends T> f, final y<? extends T> g, final d<? super T, ? super T> h, final int i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final a0<? super Boolean> a0) {
        final ObservableSequenceEqual.ObservableSequenceEqual$EqualCoordinator observableSequenceEqual$EqualCoordinator = new ObservableSequenceEqual.ObservableSequenceEqual$EqualCoordinator((a0)a0, this.i, (y)this.f, (y)this.g, (d)this.h);
        a0.onSubscribe((a)observableSequenceEqual$EqualCoordinator);
        observableSequenceEqual$EqualCoordinator.subscribe();
    }
}
