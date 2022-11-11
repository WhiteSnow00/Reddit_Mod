// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import qt2.d;
import nf2.a;
import qt2.c;
import ff2.g;

public final class FlowableRangeLong extends g<Long>
{
    public final long f;
    public final long g;
    
    public FlowableRangeLong(final long f, final long n) {
        this.f = f;
        this.g = f + n;
    }
    
    @Override
    public final void subscribeActual(final c<? super Long> c) {
        if (c instanceof a) {
            c.onSubscribe((d)new FlowableRangeLong.FlowableRangeLong$RangeConditionalSubscription((a)c, this.f, this.g));
        }
        else {
            c.onSubscribe((d)new FlowableRangeLong.FlowableRangeLong$RangeSubscription((c)c, this.f, this.g));
        }
    }
}
