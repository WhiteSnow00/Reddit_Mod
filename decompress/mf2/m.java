// 
// Decompiled by Procyon v0.6.0
// 

package mf2;

import df2.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import af2.p;
import if2.h;
import af2.n;

public final class m<T> extends n<T> implements h<T>
{
    public final T f;
    
    public m(final T f) {
        this.f = f;
    }
    
    public final T call() {
        return this.f;
    }
    
    @Override
    public final void t(final p<? super T> p) {
        p.onSubscribe((a)EmptyDisposable.INSTANCE);
        p.onSuccess((Object)this.f);
    }
}
