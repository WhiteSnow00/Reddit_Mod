// 
// Decompiled by Procyon v0.6.0
// 

package mf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import hf2.a;
import af2.p;
import af2.r;
import java.util.concurrent.Callable;
import af2.n;

public final class b<T> extends n<T>
{
    public final Callable<? extends r<? extends T>> f;
    
    public b(final Callable<? extends r<? extends T>> f) {
        this.f = f;
    }
    
    @Override
    public final void t(final p<? super T> p) {
        try {
            final r<? extends T> call = (r<? extends T>)this.f.call();
            a.b((Object)call, "The maybeSupplier returned a null MaybeSource");
            call.a((p)p);
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            EmptyDisposable.error(t, p);
        }
    }
}
