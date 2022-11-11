// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import lg.e0;
import ff2.a0;
import io.reactivex.internal.util.ErrorMode;
import ff2.r;
import kf2.o;
import ff2.t;

public final class ObservableConcatMapMaybe<T, R> extends t<R>
{
    public final t<T> f;
    public final o<? super T, ? extends r<? extends R>> g;
    public final ErrorMode h;
    public final int i;
    
    public ObservableConcatMapMaybe(final t<T> f, final o<? super T, ? extends r<? extends R>> g, final ErrorMode h, final int i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        if (!e0.t0((t)this.f, (o)this.g, (a0)a0)) {
            this.f.subscribe((a0)new ObservableConcatMapMaybe.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver((a0)a0, (o)this.g, this.i, this.h));
        }
    }
}
