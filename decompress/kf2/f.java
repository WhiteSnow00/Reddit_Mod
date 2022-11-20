// 
// Decompiled by Procyon v0.6.0
// 

package kf2;

import io.reactivex.plugins.RxJavaPlugins;
import af2.c;
import java.util.concurrent.Callable;
import af2.a;

public final class f extends a
{
    public final Callable<?> f;
    
    public f(final Callable<?> f) {
        this.f = f;
    }
    
    @Override
    public final void w(final c c) {
        final df2.a a = io.reactivex.disposables.a.a();
        c.onSubscribe(a);
        try {
            this.f.call();
            if (!a.isDisposed()) {
                c.onComplete();
            }
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            if (!a.isDisposed()) {
                c.onError(t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
    }
}
