// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import af2.l;
import nt2.c;
import af2.g;
import lf2.a;

public final class FlowableDoFinally<T> extends a<T, T>
{
    public final ff2.a g;
    
    public FlowableDoFinally(final g<T> g, final ff2.a g2) {
        super(g);
        this.g = g2;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        if (c instanceof if2.a) {
            super.f.subscribe((l<? super T>)new FlowableDoFinally.FlowableDoFinally$DoFinallyConditionalSubscriber((if2.a)c, this.g));
        }
        else {
            super.f.subscribe((l<? super T>)new FlowableDoFinally.FlowableDoFinally$DoFinallySubscriber((c)c, this.g));
        }
    }
}
