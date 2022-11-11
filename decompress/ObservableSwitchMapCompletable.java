// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import ff2.a0;
import lg.e0;
import ff2.c;
import ff2.e;
import kf2.o;
import ff2.t;
import ff2.a;

public final class ObservableSwitchMapCompletable<T> extends a
{
    public final t<T> f;
    public final o<? super T, ? extends e> g;
    public final boolean h;
    
    public ObservableSwitchMapCompletable(final t<T> f, final o<? super T, ? extends e> g, final boolean h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void w(final c c) {
        if (!e0.s0((t)this.f, (o)this.g, c)) {
            this.f.subscribe((a0)new ObservableSwitchMapCompletable.ObservableSwitchMapCompletable$SwitchMapCompletableObserver(c, (o)this.g, this.h));
        }
    }
}
