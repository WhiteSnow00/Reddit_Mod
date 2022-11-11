// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import qt2.d;
import qt2.c;
import java.util.concurrent.TimeUnit;
import ff2.b0;
import ff2.g;

public final class FlowableTimer extends g<Long>
{
    public final b0 f;
    public final long g;
    public final TimeUnit h;
    
    public FlowableTimer(final long g, final TimeUnit h, final b0 f) {
        this.g = g;
        this.h = h;
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final c<? super Long> c) {
        final FlowableTimer.FlowableTimer$TimerSubscriber flowableTimer$TimerSubscriber = new FlowableTimer.FlowableTimer$TimerSubscriber((c)c);
        c.onSubscribe((d)flowableTimer$TimerSubscriber);
        flowableTimer$TimerSubscriber.setResource(this.f.d((Runnable)flowableTimer$TimerSubscriber, this.g, this.h));
    }
}
