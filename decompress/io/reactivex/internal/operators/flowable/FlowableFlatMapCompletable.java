// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import af2.l;
import nt2.c;
import af2.g;
import af2.e;
import ff2.o;
import lf2.a;

public final class FlowableFlatMapCompletable<T> extends a<T, T>
{
    public final o<? super T, ? extends e> g;
    public final int h;
    public final boolean i;
    
    public FlowableFlatMapCompletable(final int h, final g g, final o g2, final boolean i) {
        super(g);
        this.g = (o<? super T, ? extends e>)g2;
        this.i = i;
        this.h = h;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        super.f.subscribe((l<? super T>)new FlowableFlatMapCompletable.FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber((c)c, (o)this.g, this.i, this.h));
    }
}
