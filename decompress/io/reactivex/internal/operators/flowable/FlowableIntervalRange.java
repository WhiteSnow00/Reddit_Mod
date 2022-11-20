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

public final class FlowableIntervalRange extends g<Long>
{
    public final b0 f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final TimeUnit k;
    
    public FlowableIntervalRange(final long g, final long h, final long i, final long j, final TimeUnit k, final b0 f) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void subscribeActual(final c<? super Long> c) {
        final FlowableIntervalRange.FlowableIntervalRange$IntervalRangeSubscriber flowableIntervalRange$IntervalRangeSubscriber = new FlowableIntervalRange.FlowableIntervalRange$IntervalRangeSubscriber((c)c, this.g, this.h);
        c.onSubscribe((d)flowableIntervalRange$IntervalRangeSubscriber);
        final b0 f = this.f;
        if (f instanceof i) {
            final b0.c a = f.a();
            flowableIntervalRange$IntervalRangeSubscriber.setResource((a)a);
            a.d((Runnable)flowableIntervalRange$IntervalRangeSubscriber, this.i, this.j, this.k);
        }
        else {
            flowableIntervalRange$IntervalRangeSubscriber.setResource(f.e((Runnable)flowableIntervalRange$IntervalRangeSubscriber, this.i, this.j, this.k));
        }
    }
}
