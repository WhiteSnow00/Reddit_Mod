// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import af2.l;
import nt2.c;
import af2.g;
import lf2.a;

public final class FlowableElementAt<T> extends a<T, T>
{
    public final long g;
    public final T h;
    public final boolean i;
    
    public FlowableElementAt(final g<T> g, final long g2, final T h, final boolean i) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe((l<? super T>)new FlowableElementAt.FlowableElementAt$ElementAtSubscriber((c)c, this.g, (Object)this.h, this.i));
    }
}
