// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.maybe;

import ff2.p;
import ff2.a0;
import ff2.n;
import ff2.r;
import ff2.t;

public final class MaybeToObservable<T> extends t<T>
{
    public final r<T> f;
    
    public MaybeToObservable(final n f) {
        this.f = (r<T>)f;
    }
    
    public static <T> p<T> c(final a0<? super T> a0) {
        return (p<T>)new MaybeToObservable.MaybeToObservable$MaybeToObservableObserver((a0)a0);
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        this.f.b((p)new MaybeToObservable.MaybeToObservable$MaybeToObservableObserver((a0)a0));
    }
}
