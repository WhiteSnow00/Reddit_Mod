// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.p;
import ff2.a0;
import ff2.y;
import ff2.t;
import ff2.r;
import sf2.a;

public final class ObservableMergeWithMaybe<T> extends a<T, T>
{
    public final r<? extends T> g;
    
    public ObservableMergeWithMaybe(final t<T> t, final r<? extends T> g) {
        super((y)t);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final ObservableMergeWithMaybe.ObservableMergeWithMaybe$MergeWithObserver observableMergeWithMaybe$MergeWithObserver = new ObservableMergeWithMaybe.ObservableMergeWithMaybe$MergeWithObserver((a0)a0);
        a0.onSubscribe((if2.a)observableMergeWithMaybe$MergeWithObserver);
        super.f.subscribe((a0)observableMergeWithMaybe$MergeWithObserver);
        this.g.b((p)observableMergeWithMaybe$MergeWithObserver.otherObserver);
    }
}
