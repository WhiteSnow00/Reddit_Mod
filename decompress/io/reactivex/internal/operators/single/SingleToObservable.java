// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import af2.e0;
import af2.a0;
import af2.g0;
import af2.t;

public final class SingleToObservable<T> extends t<T>
{
    public final g0<? extends T> f;
    
    public SingleToObservable(final g0<? extends T> f) {
        this.f = f;
    }
    
    public static <T> e0<T> b(final a0<? super T> a0) {
        return (e0<T>)new SingleToObservable.SingleToObservable$SingleToObservableObserver((a0)a0);
    }
    
    @Override
    public final void subscribeActual(final a0<? super T> a0) {
        this.f.a((e0)new SingleToObservable.SingleToObservable$SingleToObservableObserver((a0)a0));
    }
}
