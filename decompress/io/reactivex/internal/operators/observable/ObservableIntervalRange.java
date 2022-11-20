// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import rf2.i;
import df2.a;
import af2.a0;
import java.util.concurrent.TimeUnit;
import af2.b0;
import af2.t;

public final class ObservableIntervalRange extends t<Long>
{
    public final b0 f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final TimeUnit k;
    
    public ObservableIntervalRange(final long g, final long h, final long i, final long j, final TimeUnit k, final b0 f) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void subscribeActual(final a0<? super Long> a0) {
        final ObservableIntervalRange.ObservableIntervalRange$IntervalRangeObserver observableIntervalRange$IntervalRangeObserver = new ObservableIntervalRange.ObservableIntervalRange$IntervalRangeObserver((a0)a0, this.g, this.h);
        a0.onSubscribe((a)observableIntervalRange$IntervalRangeObserver);
        final b0 f = this.f;
        if (f instanceof i) {
            final b0.c a2 = f.a();
            observableIntervalRange$IntervalRangeObserver.setResource((a)a2);
            a2.d((Runnable)observableIntervalRange$IntervalRangeObserver, this.i, this.j, this.k);
        }
        else {
            observableIntervalRange$IntervalRangeObserver.setResource(f.e((Runnable)observableIntervalRange$IntervalRangeObserver, this.i, this.j, this.k));
        }
    }
}
