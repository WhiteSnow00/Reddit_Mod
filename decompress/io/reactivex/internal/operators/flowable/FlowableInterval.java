// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import df2.a;
import rf2.i;
import nt2.d;
import nt2.c;
import java.util.concurrent.TimeUnit;
import af2.b0;
import af2.g;

public final class FlowableInterval extends g<Long>
{
    public final b0 f;
    public final long g;
    public final long h;
    public final TimeUnit i;
    
    public FlowableInterval(final long g, final long h, final TimeUnit i, final b0 f) {
        this.g = g;
        this.h = h;
        this.i = i;
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final c<? super Long> c) {
        final FlowableInterval.FlowableInterval$IntervalSubscriber flowableInterval$IntervalSubscriber = new FlowableInterval.FlowableInterval$IntervalSubscriber((c)c);
        c.onSubscribe((d)flowableInterval$IntervalSubscriber);
        final b0 f = this.f;
        if (f instanceof i) {
            final b0.c a = f.a();
            flowableInterval$IntervalSubscriber.setResource((a)a);
            a.d((Runnable)flowableInterval$IntervalSubscriber, this.g, this.h, this.i);
        }
        else {
            flowableInterval$IntervalSubscriber.setResource(f.e((Runnable)flowableInterval$IntervalSubscriber, this.g, this.h, this.i));
        }
    }
}
