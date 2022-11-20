// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import nt2.d;
import if2.a;
import nt2.c;
import af2.g;

public final class FlowableFromArray<T> extends g<T>
{
    public final T[] f;
    
    public FlowableFromArray(final T[] f) {
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        if (c instanceof a) {
            c.onSubscribe((d)new FlowableFromArray.FlowableFromArray$ArrayConditionalSubscription((a)c, (Object[])this.f));
        }
        else {
            c.onSubscribe((d)new FlowableFromArray.FlowableFromArray$ArraySubscription((c)c, (Object[])this.f));
        }
    }
}
