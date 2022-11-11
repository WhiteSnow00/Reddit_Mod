// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.RxJavaPlugins;
import ff2.g;
import if2.a;
import ff2.e0;
import kf2.d;
import nf2.b;
import ff2.c0;

public final class FlowableSequenceEqualSingle<T> extends c0<Boolean> implements b<Boolean>
{
    public final qt2.b<? extends T> f;
    public final qt2.b<? extends T> g;
    public final d<? super T, ? super T> h;
    public final int i;
    
    public FlowableSequenceEqualSingle(final qt2.b<? extends T> f, final qt2.b<? extends T> g, final d<? super T, ? super T> h, final int i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void G(final e0<? super Boolean> e0) {
        final FlowableSequenceEqualSingle.FlowableSequenceEqualSingle$EqualCoordinator flowableSequenceEqualSingle$EqualCoordinator = new FlowableSequenceEqualSingle.FlowableSequenceEqualSingle$EqualCoordinator((e0)e0, this.i, (d)this.h);
        e0.onSubscribe((a)flowableSequenceEqualSingle$EqualCoordinator);
        flowableSequenceEqualSingle$EqualCoordinator.subscribe((qt2.b)this.f, (qt2.b)this.g);
    }
    
    public final g<Boolean> d() {
        return RxJavaPlugins.onAssembly((g<Boolean>)new FlowableSequenceEqual<Object>(this.f, this.g, this.h, this.i));
    }
}
