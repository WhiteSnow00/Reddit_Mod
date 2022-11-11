// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.a0;
import ff2.y;
import kf2.o;
import sf2.a;

public final class ObservableFlatMap<T, U> extends a<T, U>
{
    public final o<? super T, ? extends y<? extends U>> g;
    public final boolean h;
    public final int i;
    public final int j;
    
    public ObservableFlatMap(final y<T> y, final o<? super T, ? extends y<? extends U>> g, final boolean h, final int i, final int j) {
        super((y)y);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void subscribeActual(final a0<? super U> a0) {
        if (ObservableScalarXMap.a(a0, this.g, super.f)) {
            return;
        }
        super.f.subscribe((a0)new ObservableFlatMap.ObservableFlatMap$MergeObserver((a0)a0, (o)this.g, this.h, this.i, this.j));
    }
}
