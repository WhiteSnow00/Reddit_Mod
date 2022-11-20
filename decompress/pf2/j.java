// 
// Decompiled by Procyon v0.6.0
// 

package pf2;

import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.disposables.a;
import af2.e0;
import java.util.concurrent.Callable;
import af2.c0;

public final class j<T> extends c0<T>
{
    public final Callable<? extends T> f;
    
    public j(final Callable<? extends T> f) {
        this.f = f;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        final df2.a a = io.reactivex.disposables.a.a();
        e0.onSubscribe(a);
        if (a.isDisposed()) {
            return;
        }
        try {
            final T call = (T)this.f.call();
            hf2.a.b((Object)call, "The callable returned a null value");
            if (!a.isDisposed()) {
                e0.onSuccess((Object)call);
            }
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            if (!a.isDisposed()) {
                e0.onError(t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
    }
}
