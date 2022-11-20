// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import af2.a0;
import if2.h;
import af2.t;

public final class a<T> extends t<T> implements h<T>
{
    public final T f;
    
    public a(final T f) {
        this.f = f;
    }
    
    public final T call() {
        return this.f;
    }
    
    @Override
    public final void subscribeActual(final a0<? super T> a0) {
        final ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable((a0)a0, (Object)this.f);
        a0.onSubscribe((df2.a)observableScalarXMap$ScalarDisposable);
        observableScalarXMap$ScalarDisposable.run();
    }
}
