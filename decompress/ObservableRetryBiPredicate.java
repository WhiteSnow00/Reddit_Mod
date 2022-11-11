// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.SequentialDisposable;
import ff2.a0;
import ff2.y;
import ff2.t;
import kf2.d;
import sf2.a;

public final class ObservableRetryBiPredicate<T> extends a<T, T>
{
    public final d<? super Integer, ? super Throwable> g;
    
    public ObservableRetryBiPredicate(final t<T> t, final d<? super Integer, ? super Throwable> g) {
        super((y)t);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final SequentialDisposable sequentialDisposable = new SequentialDisposable();
        a0.onSubscribe((if2.a)sequentialDisposable);
        new ObservableRetryBiPredicate.ObservableRetryBiPredicate$RetryBiObserver((a0)a0, (d)this.g, sequentialDisposable, super.f).subscribeNext();
    }
}
