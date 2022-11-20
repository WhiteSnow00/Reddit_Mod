// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import af2.l;
import nt2.c;
import af2.g;
import lf2.a;

public final class FlowableCount<T> extends a<T, Long>
{
    public FlowableCount(final g<T> g) {
        super(g);
    }
    
    @Override
    public final void subscribeActual(final c<? super Long> c) {
        super.f.subscribe((l<? super T>)new FlowableCount.FlowableCount$CountSubscriber((c)c));
    }
}
