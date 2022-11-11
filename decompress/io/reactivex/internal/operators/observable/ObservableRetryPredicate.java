// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.SequentialDisposable;
import ff2.a0;
import ff2.y;
import ff2.t;
import kf2.q;
import sf2.a;

public final class ObservableRetryPredicate<T> extends a<T, T>
{
    public final q<? super Throwable> g;
    public final long h;
    
    public ObservableRetryPredicate(final t<T> t, final long h, final q<? super Throwable> g) {
        super((y)t);
        this.g = g;
        this.h = h;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final SequentialDisposable sequentialDisposable = new SequentialDisposable();
        a0.onSubscribe((if2.a)sequentialDisposable);
        new ObservableRetryPredicate.ObservableRetryPredicate$RepeatObserver((a0)a0, this.h, (q)this.g, sequentialDisposable, super.f).subscribeNext();
    }
}
