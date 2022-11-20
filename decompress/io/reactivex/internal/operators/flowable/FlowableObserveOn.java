// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import af2.l;
import nt2.c;
import af2.g;
import af2.b0;
import lf2.a;

public final class FlowableObserveOn<T> extends a<T, T>
{
    public final b0 g;
    public final boolean h;
    public final int i;
    
    public FlowableObserveOn(final g<T> g, final b0 g2, final boolean h, final int i) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final b0.c a = this.g.a();
        if (c instanceof if2.a) {
            super.f.subscribe((l<? super T>)new FlowableObserveOn.FlowableObserveOn$ObserveOnConditionalSubscriber((if2.a)c, a, this.h, this.i));
        }
        else {
            super.f.subscribe((l<? super T>)new FlowableObserveOn.FlowableObserveOn$ObserveOnSubscriber((c)c, a, this.h, this.i));
        }
    }
}
