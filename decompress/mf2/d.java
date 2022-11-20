// 
// Decompiled by Procyon v0.6.0
// 

package mf2;

import df2.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import af2.p;
import af2.n;

public final class d<T> extends n<T>
{
    public final Throwable f;
    
    public d(final Throwable f) {
        this.f = f;
    }
    
    @Override
    public final void t(final p<? super T> p) {
        p.onSubscribe((a)EmptyDisposable.INSTANCE);
        p.onError(this.f);
    }
}
