// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.plugins.RxJavaPlugins;
import nt2.d;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import nt2.c;
import hf2.a;
import java.util.concurrent.Callable;
import af2.g;

public final class a0<T> extends g<T> implements Callable<T>
{
    public final Callable<? extends T> f;
    
    public a0(final Callable<? extends T> f) {
        this.f = f;
    }
    
    @Override
    public final T call() throws Exception {
        final T call = (T)this.f.call();
        a.b((Object)call, "The callable returned a null value");
        return call;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription((c)c);
        c.onSubscribe((d)deferredScalarSubscription);
        try {
            final T call = (T)this.f.call();
            a.b((Object)call, "The callable returned a null value");
            deferredScalarSubscription.complete((Object)call);
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            if (deferredScalarSubscription.isCancelled()) {
                RxJavaPlugins.onError(t);
            }
            else {
                c.onError(t);
            }
        }
    }
}
