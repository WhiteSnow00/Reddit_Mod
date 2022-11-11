// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import ff2.c;
import if2.a;
import ff2.a0;
import ff2.y;
import ff2.e;
import ff2.t;

public final class CompletableAndThenObservable<R> extends t<R>
{
    public final e f;
    public final y<? extends R> g;
    
    public CompletableAndThenObservable(final e f, final t g) {
        this.f = f;
        this.g = (y<? extends R>)g;
    }
    
    public final void subscribeActual(final a0<? super R> a0) {
        final CompletableAndThenObservable.CompletableAndThenObservable$AndThenObservableObserver completableAndThenObservable$AndThenObservableObserver = new CompletableAndThenObservable.CompletableAndThenObservable$AndThenObservableObserver((a0)a0, (y)this.g);
        a0.onSubscribe((a)completableAndThenObservable$AndThenObservableObserver);
        this.f.b((c)completableAndThenObservable$AndThenObservableObserver);
    }
}
