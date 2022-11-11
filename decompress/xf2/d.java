// 
// Decompiled by Procyon v0.6.0
// 

package xf2;

import java.util.concurrent.CountDownLatch;
import io.reactivex.plugins.RxJavaPlugins;

public final class d<T> extends c<T>
{
    public final void onError(final Throwable g) {
        if (super.f == null) {
            super.g = g;
        }
        else {
            RxJavaPlugins.onError(g);
        }
        ((CountDownLatch)this).countDown();
    }
    
    public final void onNext(final T f) {
        if (super.f == null) {
            super.f = f;
            super.h.cancel();
            ((CountDownLatch)this).countDown();
        }
    }
}
