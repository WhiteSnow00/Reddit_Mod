// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import df2.a;
import af2.a0;
import af2.t;

public final class ObservableRange extends t<Integer>
{
    public final int f;
    public final long g;
    
    public ObservableRange(final int f, final int n) {
        this.f = f;
        this.g = f + (long)n;
    }
    
    @Override
    public final void subscribeActual(final a0<? super Integer> a0) {
        final ObservableRange.ObservableRange$RangeDisposable observableRange$RangeDisposable = new ObservableRange.ObservableRange$RangeDisposable((a0)a0, (long)this.f, this.g);
        a0.onSubscribe((a)observableRange$RangeDisposable);
        observableRange$RangeDisposable.run();
    }
}
