// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.a0;
import ff2.y;
import sf2.a;

public final class ObservableDoFinally<T> extends a<T, T>
{
    public final kf2.a g;
    
    public ObservableDoFinally(final y<T> y, final kf2.a g) {
        super((y)y);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        super.f.subscribe((a0)new ObservableDoFinally.ObservableDoFinally$DoFinallyObserver((a0)a0, this.g));
    }
}
