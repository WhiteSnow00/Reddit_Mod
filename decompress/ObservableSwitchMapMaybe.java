// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import lg.e0;
import ff2.a0;
import ff2.r;
import kf2.o;
import ff2.t;

public final class ObservableSwitchMapMaybe<T, R> extends t<R>
{
    public final t<T> f;
    public final o<? super T, ? extends r<? extends R>> g;
    public final boolean h;
    
    public ObservableSwitchMapMaybe(final t<T> f, final o<? super T, ? extends r<? extends R>> g, final boolean h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        if (!e0.t0((t)this.f, (o)this.g, (a0)a0)) {
            this.f.subscribe((a0)new ObservableSwitchMapMaybe.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver((a0)a0, (o)this.g, this.h));
        }
    }
}
