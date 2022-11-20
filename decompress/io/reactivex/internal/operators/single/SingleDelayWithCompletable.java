// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.single;

import af2.c;
import af2.e0;
import af2.e;
import af2.g0;
import af2.c0;

public final class SingleDelayWithCompletable<T> extends c0<T>
{
    public final g0<T> f;
    public final e g;
    
    public SingleDelayWithCompletable(final c0 f, final e g) {
        this.f = (g0<T>)f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.g.a((c)new SingleDelayWithCompletable.SingleDelayWithCompletable$OtherObserver((e0)e0, (g0)this.f));
    }
}
