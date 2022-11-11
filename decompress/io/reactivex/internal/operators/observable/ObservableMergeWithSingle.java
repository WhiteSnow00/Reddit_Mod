// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.e0;
import ff2.a0;
import ff2.y;
import ff2.t;
import ff2.g0;
import sf2.a;

public final class ObservableMergeWithSingle<T> extends a<T, T>
{
    public final g0<? extends T> g;
    
    public ObservableMergeWithSingle(final t<T> t, final g0<? extends T> g) {
        super((y)t);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final ObservableMergeWithSingle.ObservableMergeWithSingle$MergeWithObserver observableMergeWithSingle$MergeWithObserver = new ObservableMergeWithSingle.ObservableMergeWithSingle$MergeWithObserver((a0)a0);
        a0.onSubscribe((if2.a)observableMergeWithSingle$MergeWithObserver);
        super.f.subscribe((a0)observableMergeWithSingle$MergeWithObserver);
        this.g.b((e0)observableMergeWithSingle$MergeWithObserver.otherObserver);
    }
}
