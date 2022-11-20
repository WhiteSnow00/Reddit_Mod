// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import af2.e0;
import nt2.c;
import af2.g0;
import af2.g;

public final class SingleToFlowable<T> extends g<T>
{
    public final g0<? extends T> f;
    
    public SingleToFlowable(final g0<? extends T> f) {
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        this.f.a((e0)new SingleToFlowable.SingleToFlowable$SingleToFlowableObserver((c)c));
    }
}
