// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import xd.a;
import nt2.d;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import nt2.c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import af2.g;

public final class b0<T> extends g<T>
{
    public final Future<? extends T> f;
    public final long g;
    public final TimeUnit h;
    
    public b0(final Future<? extends T> f, final long g, final TimeUnit h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription((c)c);
        c.onSubscribe((d)deferredScalarSubscription);
        try {
            final TimeUnit h = this.h;
            T t;
            if (h != null) {
                t = (T)this.f.get(this.g, h);
            }
            else {
                t = (T)this.f.get();
            }
            if (t == null) {
                c.onError((Throwable)new NullPointerException("The future returned null"));
            }
            else {
                deferredScalarSubscription.complete((Object)t);
            }
        }
        finally {
            final Throwable t2;
            a.t1(t2);
            if (!deferredScalarSubscription.isCancelled()) {
                c.onError(t2);
            }
        }
    }
}
