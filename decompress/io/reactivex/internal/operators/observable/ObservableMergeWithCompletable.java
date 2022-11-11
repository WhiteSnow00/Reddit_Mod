// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.c;
import ff2.a0;
import ff2.y;
import ff2.t;
import ff2.e;
import sf2.a;

public final class ObservableMergeWithCompletable<T> extends a<T, T>
{
    public final e g;
    
    public ObservableMergeWithCompletable(final t<T> t, final e g) {
        super((y)t);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final ObservableMergeWithCompletable.ObservableMergeWithCompletable$MergeWithObserver observableMergeWithCompletable$MergeWithObserver = new ObservableMergeWithCompletable.ObservableMergeWithCompletable$MergeWithObserver((a0)a0);
        a0.onSubscribe((if2.a)observableMergeWithCompletable$MergeWithObserver);
        super.f.subscribe((a0)observableMergeWithCompletable$MergeWithObserver);
        this.g.b((c)observableMergeWithCompletable$MergeWithObserver.otherObserver);
    }
}
