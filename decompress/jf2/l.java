// 
// Decompiled by Procyon v0.6.0
// 

package jf2;

import io.reactivex.internal.disposables.DisposableHelper;
import df2.a;
import java.util.concurrent.atomic.AtomicReference;
import af2.e0;

public final class l<T> implements e0<T>
{
    public final AtomicReference<a> f;
    public final e0<? super T> g;
    
    public l(final e0 g, final AtomicReference f) {
        this.f = f;
        this.g = (e0<? super T>)g;
    }
    
    public final void onError(final Throwable t) {
        this.g.onError(t);
    }
    
    public final void onSubscribe(final a a) {
        DisposableHelper.replace((AtomicReference)this.f, a);
    }
    
    public final void onSuccess(final T t) {
        this.g.onSuccess((Object)t);
    }
}
