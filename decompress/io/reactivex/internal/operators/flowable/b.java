// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import qf2.f1;
import qt2.c;
import kf2.o;
import ff2.g;

public final class b<T, U> extends g<U>
{
    public final qt2.b<T> f;
    public final o<? super T, ? extends qt2.b<? extends U>> g;
    public final boolean h;
    public final int i;
    public final int j;
    
    public b(final g f, final o g, final int j) {
        this.f = (qt2.b<T>)f;
        this.g = (o<? super T, ? extends qt2.b<? extends U>>)g;
        this.h = false;
        this.i = Integer.MAX_VALUE;
        this.j = j;
    }
    
    @Override
    public final void subscribeActual(final c<? super U> c) {
        if (f1.a((c)c, (o)this.g, (qt2.b)this.f)) {
            return;
        }
        this.f.subscribe((c)new FlowableFlatMap$MergeSubscriber((c)c, (o)this.g, this.h, this.i, this.j));
    }
}
