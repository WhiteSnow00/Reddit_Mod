// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import df2.a;
import af2.a0;
import af2.t;

public final class ObservableRangeLong extends t<Long>
{
    public final long f;
    public final long g;
    
    public ObservableRangeLong(final long f, final long g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void subscribeActual(final a0<? super Long> a0) {
        final long f = this.f;
        final ObservableRangeLong.ObservableRangeLong$RangeDisposable observableRangeLong$RangeDisposable = new ObservableRangeLong.ObservableRangeLong$RangeDisposable((a0)a0, f, f + this.g);
        a0.onSubscribe((a)observableRangeLong$RangeDisposable);
        observableRangeLong$RangeDisposable.run();
    }
}
