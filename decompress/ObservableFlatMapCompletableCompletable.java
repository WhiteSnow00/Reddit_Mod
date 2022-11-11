// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.a0;
import ff2.c;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.t;
import ff2.e;
import kf2.o;
import ff2.y;
import nf2.d;
import ff2.a;

public final class ObservableFlatMapCompletableCompletable<T> extends a implements d<T>
{
    public final y<T> f;
    public final o<? super T, ? extends e> g;
    public final boolean h;
    
    public ObservableFlatMapCompletableCompletable(final y<T> f, final o<? super T, ? extends e> g, final boolean h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final t<T> a() {
        return RxJavaPlugins.onAssembly((ff2.t<T>)new ObservableFlatMapCompletable((ff2.y<Object>)this.f, (kf2.o<? super Object, ? extends e>)this.g, this.h));
    }
    
    @Override
    public final void w(final c c) {
        this.f.subscribe((a0)new ObservableFlatMapCompletableCompletable.ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver(c, (o)this.g, this.h));
    }
}
