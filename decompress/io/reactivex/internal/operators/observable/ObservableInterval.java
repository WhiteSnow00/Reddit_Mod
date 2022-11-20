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

public final class ObservableInterval extends t<Long>
{
    public final b0 f;
    public final long g;
    public final long h;
    public final TimeUnit i;
    
    public ObservableInterval(final long g, final long h, final TimeUnit i, final b0 f) {
        this.g = g;
        this.h = h;
        this.i = i;
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final a0<? super Long> a0) {
        final ObservableInterval.ObservableInterval$IntervalObserver observableInterval$IntervalObserver = new ObservableInterval.ObservableInterval$IntervalObserver((a0)a0);
        a0.onSubscribe((a)observableInterval$IntervalObserver);
        final b0 f = this.f;
        if (f instanceof i) {
            final b0.c a2 = f.a();
            observableInterval$IntervalObserver.setResource((a)a2);
            a2.d((Runnable)observableInterval$IntervalObserver, this.g, this.h, this.i);
        }
        else {
            observableInterval$IntervalObserver.setResource(f.e((Runnable)observableInterval$IntervalObserver, this.g, this.h, this.i));
        }
    }
}
