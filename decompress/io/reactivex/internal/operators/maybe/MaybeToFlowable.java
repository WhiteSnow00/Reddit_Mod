// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.maybe;

import ff2.p;
import qt2.c;
import ff2.r;
import ff2.g;

public final class MaybeToFlowable<T> extends g<T>
{
    public final r<T> f;
    
    public MaybeToFlowable(final r<T> f) {
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        this.f.b((p)new MaybeToFlowable.MaybeToFlowable$MaybeToFlowableSubscriber((c)c));
    }
}
