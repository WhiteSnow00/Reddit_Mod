// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.plugins.RxJavaPlugins;
import af2.t;
import df2.a;
import af2.e0;
import af2.y;
import if2.d;
import af2.c0;

public final class ObservableSequenceEqualSingle<T> extends c0<Boolean> implements d<Boolean>
{
    public final y<? extends T> f;
    public final y<? extends T> g;
    public final ff2.d<? super T, ? super T> h;
    public final int i;
    
    public ObservableSequenceEqualSingle(final y<? extends T> f, final y<? extends T> g, final ff2.d<? super T, ? super T> h, final int i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void G(final e0<? super Boolean> e0) {
        final ObservableSequenceEqualSingle.ObservableSequenceEqualSingle$EqualCoordinator observableSequenceEqualSingle$EqualCoordinator = new ObservableSequenceEqualSingle.ObservableSequenceEqualSingle$EqualCoordinator((e0)e0, this.i, (y)this.f, (y)this.g, (ff2.d)this.h);
        e0.onSubscribe((a)observableSequenceEqualSingle$EqualCoordinator);
        observableSequenceEqualSingle$EqualCoordinator.subscribe();
    }
    
    public final t<Boolean> b() {
        return RxJavaPlugins.onAssembly((t)new ObservableSequenceEqual(this.f, this.g, this.h, this.i));
    }
}
