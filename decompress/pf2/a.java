// 
// Decompiled by Procyon v0.6.0
// 

package pf2;

import io.reactivex.internal.disposables.EmptyDisposable;
import af2.e0;
import af2.g0;
import java.util.concurrent.Callable;
import af2.c0;

public final class a<T> extends c0<T>
{
    public final Callable<? extends g0<? extends T>> f;
    
    public a(final Callable<? extends g0<? extends T>> f) {
        this.f = f;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        try {
            final g0<? extends T> call = (g0<? extends T>)this.f.call();
            hf2.a.b((Object)call, "The singleSupplier returned a null SingleSource");
            call.a((e0)e0);
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            EmptyDisposable.error(t, e0);
        }
    }
}
