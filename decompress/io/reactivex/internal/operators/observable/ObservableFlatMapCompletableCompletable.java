// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import af2.a0;
import af2.c;
import io.reactivex.plugins.RxJavaPlugins;
import af2.t;
import af2.e;
import ff2.o;
import af2.y;
import if2.d;
import af2.a;

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
    
    public final t<T> b() {
        return RxJavaPlugins.onAssembly((t)new ObservableFlatMapCompletable((y)this.f, (o)this.g, this.h));
    }
    
    @Override
    public final void w(final c c) {
        this.f.subscribe((a0)new ObservableFlatMapCompletableCompletable.ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver(c, (o)this.g, this.h));
    }
}
