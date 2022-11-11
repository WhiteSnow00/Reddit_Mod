// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.maybe;

import ff2.p;
import ff2.e0;
import ff2.g0;
import kf2.o;
import ff2.r;
import ff2.c0;

public final class MaybeFlatMapSingle<T, R> extends c0<R>
{
    public final r<T> f;
    public final o<? super T, ? extends g0<? extends R>> g;
    
    public MaybeFlatMapSingle(final r<T> f, final o<? super T, ? extends g0<? extends R>> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super R> e0) {
        this.f.b((p)new MaybeFlatMapSingle.MaybeFlatMapSingle$FlatMapMaybeObserver((e0)e0, (o)this.g));
    }
}
