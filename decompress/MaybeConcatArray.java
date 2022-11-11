// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.maybe;

import qt2.d;
import qt2.c;
import ff2.r;
import ff2.g;

public final class MaybeConcatArray<T> extends g<T>
{
    public final r<? extends T>[] f;
    
    public MaybeConcatArray(final r<? extends T>[] f) {
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final MaybeConcatArray.MaybeConcatArray$ConcatMaybeObserver maybeConcatArray$ConcatMaybeObserver = new MaybeConcatArray.MaybeConcatArray$ConcatMaybeObserver((c)c, (r[])this.f);
        c.onSubscribe((d)maybeConcatArray$ConcatMaybeObserver);
        maybeConcatArray$ConcatMaybeObserver.drain();
    }
}
