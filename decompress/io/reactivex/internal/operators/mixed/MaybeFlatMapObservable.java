// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import ff2.p;
import if2.a;
import ff2.a0;
import lk0.l;
import ff2.n;
import ff2.y;
import kf2.o;
import ff2.r;
import ff2.t;

public final class MaybeFlatMapObservable<T, R> extends t<R>
{
    public final r<T> f;
    public final o<? super T, ? extends y<? extends R>> g;
    
    public MaybeFlatMapObservable(final n f, final l g) {
        this.f = (r<T>)f;
        this.g = (o<? super T, ? extends y<? extends R>>)g;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        final MaybeFlatMapObservable.MaybeFlatMapObservable$FlatMapObserver maybeFlatMapObservable$FlatMapObserver = new MaybeFlatMapObservable.MaybeFlatMapObservable$FlatMapObserver((a0)a0, (o)this.g);
        a0.onSubscribe((a)maybeFlatMapObservable$FlatMapObserver);
        this.f.b((p)maybeFlatMapObservable$FlatMapObserver);
    }
}
