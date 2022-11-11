// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import ff2.e0;
import if2.a;
import ff2.a0;
import ff2.y;
import kf2.o;
import ff2.g0;
import ff2.t;

public final class SingleFlatMapObservable<T, R> extends t<R>
{
    public final g0<T> f;
    public final o<? super T, ? extends y<? extends R>> g;
    
    public SingleFlatMapObservable(final g0<T> f, final o<? super T, ? extends y<? extends R>> g) {
        this.f = f;
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        final SingleFlatMapObservable.SingleFlatMapObservable$FlatMapObserver singleFlatMapObservable$FlatMapObserver = new SingleFlatMapObservable.SingleFlatMapObservable$FlatMapObserver((a0)a0, (o)this.g);
        a0.onSubscribe((a)singleFlatMapObservable$FlatMapObserver);
        this.f.b((e0)singleFlatMapObservable$FlatMapObserver);
    }
}
