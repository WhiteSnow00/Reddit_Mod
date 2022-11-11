// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import ff2.a0;
import lg.e0;
import ff2.c;
import io.reactivex.internal.util.ErrorMode;
import ff2.e;
import kf2.o;
import ff2.t;
import ff2.a;

public final class ObservableConcatMapCompletable<T> extends a
{
    public final t<T> f;
    public final o<? super T, ? extends e> g;
    public final ErrorMode h;
    public final int i;
    
    public ObservableConcatMapCompletable(final t<T> f, final o<? super T, ? extends e> g, final ErrorMode h, final int i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void w(final c c) {
        if (!e0.s0((t)this.f, (o)this.g, c)) {
            this.f.subscribe((a0)new ObservableConcatMapCompletable.ObservableConcatMapCompletable$ConcatMapCompletableObserver(c, (o)this.g, this.h, this.i));
        }
    }
}
