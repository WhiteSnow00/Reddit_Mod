// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import wf2.i;
import ff2.a0;
import ff2.y;
import ff2.b0;
import sf2.a;

public final class ObservableObserveOn<T> extends a<T, T>
{
    public final b0 g;
    public final boolean h;
    public final int i;
    
    public ObservableObserveOn(final y<T> y, final b0 g, final boolean h, final int i) {
        super((y)y);
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final b0 g = this.g;
        if (g instanceof i) {
            super.f.subscribe((a0)a0);
        }
        else {
            super.f.subscribe((a0)new ObservableObserveOn.ObservableObserveOn$ObserveOnObserver((a0)a0, g.a(), this.h, this.i));
        }
    }
}
