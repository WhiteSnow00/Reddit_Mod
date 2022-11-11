// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import qt2.c;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.util.ErrorMode;
import kf2.o;
import qt2.b;
import ff2.g;

public final class a<T, R> extends g<R>
{
    public final b<T> f;
    public final o<? super T, ? extends b<? extends R>> g;
    public final int h;
    public final int i;
    public final ErrorMode j;
    
    public a(final b f, final int h, final int i, final ErrorMode j) {
        final Functions.Functions$v a = Functions.a;
        this.f = (b<T>)f;
        this.g = (o<? super T, ? extends b<? extends R>>)a;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        this.f.subscribe((c)new FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber((c)c, (o)this.g, this.h, this.i, this.j));
    }
}
