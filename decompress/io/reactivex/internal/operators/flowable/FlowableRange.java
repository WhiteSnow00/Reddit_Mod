// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import qt2.d;
import nf2.a;
import qt2.c;
import ff2.g;

public final class FlowableRange extends g<Integer>
{
    public final int f;
    public final int g;
    
    public FlowableRange(final int f, final int n) {
        this.f = f;
        this.g = f + n;
    }
    
    @Override
    public final void subscribeActual(final c<? super Integer> c) {
        if (c instanceof a) {
            c.onSubscribe((d)new FlowableRange.FlowableRange$RangeConditionalSubscription((a)c, this.f, this.g));
        }
        else {
            c.onSubscribe((d)new FlowableRange.FlowableRange$RangeSubscription((c)c, this.f, this.g));
        }
    }
}
