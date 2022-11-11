// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.SequentialDisposable;
import ff2.a0;
import ff2.y;
import ff2.t;
import kf2.e;
import sf2.a;

public final class ObservableRepeatUntil<T> extends a<T, T>
{
    public final e g;
    
    public ObservableRepeatUntil(final t<T> t, final e g) {
        super((y)t);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final SequentialDisposable sequentialDisposable = new SequentialDisposable();
        a0.onSubscribe((if2.a)sequentialDisposable);
        new ObservableRepeatUntil.ObservableRepeatUntil$RepeatUntilObserver((a0)a0, this.g, sequentialDisposable, super.f).subscribeNext();
    }
}
