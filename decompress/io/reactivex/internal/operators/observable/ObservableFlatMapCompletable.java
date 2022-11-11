// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.a0;
import ff2.y;
import ff2.e;
import kf2.o;
import sf2.a;

public final class ObservableFlatMapCompletable<T> extends a<T, T>
{
    public final o<? super T, ? extends e> g;
    public final boolean h;
    
    public ObservableFlatMapCompletable(final y<T> y, final o<? super T, ? extends e> g, final boolean h) {
        super((y)y);
        this.g = g;
        this.h = h;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        super.f.subscribe((a0)new ObservableFlatMapCompletable.ObservableFlatMapCompletable$FlatMapCompletableMainObserver((a0)a0, (o)this.g, this.h));
    }
}
