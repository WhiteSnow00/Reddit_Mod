// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import df2.a;
import af2.a0;
import java.util.concurrent.TimeUnit;
import af2.b0;
import af2.t;

public final class ObservableTimer extends t<Long>
{
    public final b0 f;
    public final long g;
    public final TimeUnit h;
    
    public ObservableTimer(final long g, final TimeUnit h, final b0 f) {
        this.g = g;
        this.h = h;
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final a0<? super Long> a0) {
        final ObservableTimer.ObservableTimer$TimerObserver observableTimer$TimerObserver = new ObservableTimer.ObservableTimer$TimerObserver((a0)a0);
        a0.onSubscribe((a)observableTimer$TimerObserver);
        observableTimer$TimerObserver.setResource(this.f.d((Runnable)observableTimer$TimerObserver, this.g, this.h));
    }
}
