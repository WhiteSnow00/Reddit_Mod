// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import qt2.c;
import qt2.b;
import ff2.g;

public final class e<T> extends g<T>
{
    public final b<T> f;
    public final long g;
    
    public e(final b f) {
        this.f = (b<T>)f;
        this.g = 1L;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        this.f.subscribe((c)new FlowableTake.TakeSubscriber((qt2.c<? super Object>)c, this.g));
    }
}
