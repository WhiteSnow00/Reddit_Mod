// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import af2.l;
import nt2.c;
import af2.g;
import ff2.q;
import lf2.a;

public final class FlowableAll<T> extends a<T, Boolean>
{
    public final q<? super T> g;
    
    public FlowableAll(final g<T> g, final q<? super T> g2) {
        super(g);
        this.g = g2;
    }
    
    @Override
    public final void subscribeActual(final c<? super Boolean> c) {
        super.f.subscribe((l<? super T>)new FlowableAll.FlowableAll$AllSubscriber((c)c, (q)this.g));
    }
}
