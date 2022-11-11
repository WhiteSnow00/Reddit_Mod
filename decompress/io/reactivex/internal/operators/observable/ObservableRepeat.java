// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.SequentialDisposable;
import ff2.a0;
import ff2.y;
import ff2.t;
import sf2.a;

public final class ObservableRepeat<T> extends a<T, T>
{
    public final long g;
    
    public ObservableRepeat(final t<T> t, final long g) {
        super((y)t);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final SequentialDisposable sequentialDisposable = new SequentialDisposable();
        a0.onSubscribe((if2.a)sequentialDisposable);
        final long g = this.g;
        long n = Long.MAX_VALUE;
        if (g != Long.MAX_VALUE) {
            n = g - 1L;
        }
        new ObservableRepeat.ObservableRepeat$RepeatObserver((a0)a0, n, sequentialDisposable, super.f).subscribeNext();
    }
}
