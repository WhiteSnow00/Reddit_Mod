// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.maybe;

import ff2.p;
import z50.j0;
import ff2.g0;
import kf2.o;
import ff2.r;
import ff2.n;

public final class MaybeFlatMapSingleElement<T, R> extends n<R>
{
    public final r<T> f;
    public final o<? super T, ? extends g0<? extends R>> g;
    
    public MaybeFlatMapSingleElement(final n f, final j0 g) {
        this.f = (r<T>)f;
        this.g = (o<? super T, ? extends g0<? extends R>>)g;
    }
    
    public final void s(final p<? super R> p) {
        this.f.b((p)new MaybeFlatMapSingleElement.MaybeFlatMapSingleElement$FlatMapMaybeObserver((p)p, (o)this.g));
    }
}
