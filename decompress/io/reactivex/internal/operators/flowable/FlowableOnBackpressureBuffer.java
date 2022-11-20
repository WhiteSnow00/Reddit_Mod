// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import af2.l;
import nt2.c;
import af2.g;
import lf2.a;

public final class FlowableOnBackpressureBuffer<T> extends a<T, T>
{
    public final int g;
    public final boolean h;
    public final boolean i;
    public final ff2.a j;
    
    public FlowableOnBackpressureBuffer(final g<T> g, final int g2, final boolean h, final boolean i, final ff2.a j) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe((l<? super T>)new FlowableOnBackpressureBuffer.FlowableOnBackpressureBuffer$BackpressureBufferSubscriber((c)c, this.g, this.h, this.i, this.j));
    }
}
