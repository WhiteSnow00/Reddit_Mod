// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.a0;
import ff2.y;
import ff2.r;
import kf2.o;
import sf2.a;

public final class ObservableFlatMapMaybe<T, R> extends a<T, R>
{
    public final o<? super T, ? extends r<? extends R>> g;
    public final boolean h;
    
    public ObservableFlatMapMaybe(final y<T> y, final o<? super T, ? extends r<? extends R>> g, final boolean h) {
        super((y)y);
        this.g = g;
        this.h = h;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        super.f.subscribe((a0)new ObservableFlatMapMaybe.ObservableFlatMapMaybe$FlatMapMaybeObserver((a0)a0, (o)this.g, this.h));
    }
}
