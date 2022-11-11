// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.a0;
import ff2.y;
import ff2.g0;
import kf2.o;
import sf2.a;

public final class ObservableFlatMapSingle<T, R> extends a<T, R>
{
    public final o<? super T, ? extends g0<? extends R>> g;
    public final boolean h;
    
    public ObservableFlatMapSingle(final y<T> y, final o<? super T, ? extends g0<? extends R>> g, final boolean h) {
        super((y)y);
        this.g = g;
        this.h = h;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        super.f.subscribe((a0)new ObservableFlatMapSingle.ObservableFlatMapSingle$FlatMapSingleObserver((a0)a0, (o)this.g, this.h));
    }
}
