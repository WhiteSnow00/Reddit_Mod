// 
// Decompiled by Procyon v0.6.0
// 

package mf2;

import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.disposables.a;
import af2.p;
import java.util.concurrent.Callable;
import af2.n;

public final class g<T> extends n<T> implements Callable<T>
{
    public final Callable<? extends T> f;
    
    public g(final Callable<? extends T> f) {
        this.f = f;
    }
    
    @Override
    public final T call() throws Exception {
        return (T)this.f.call();
    }
    
    @Override
    public final void t(final p<? super T> p) {
        final df2.a a = io.reactivex.disposables.a.a();
        p.onSubscribe(a);
        if (!a.isDisposed()) {
            try {
                final T call = (T)this.f.call();
                if (!a.isDisposed()) {
                    if (call == null) {
                        p.onComplete();
                    }
                    else {
                        p.onSuccess((Object)call);
                    }
                }
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                if (!a.isDisposed()) {
                    p.onError(t);
                }
                else {
                    RxJavaPlugins.onError(t);
                }
            }
        }
    }
}
