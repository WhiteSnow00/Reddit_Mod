// 
// Decompiled by Procyon v0.6.0
// 

package uf2;

import if2.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import ff2.e0;
import ff2.c0;

public final class k<T> extends c0<T>
{
    public final T f;
    
    public k(final T f) {
        this.f = f;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        e0.onSubscribe((a)EmptyDisposable.INSTANCE);
        e0.onSuccess((Object)this.f);
    }
}
