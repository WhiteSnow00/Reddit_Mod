// 
// Decompiled by Procyon v0.6.0
// 

package jf2;

import io.reactivex.internal.util.ExceptionHelper;
import zd.b;
import df2.a;
import af2.p;
import af2.c;
import af2.e0;
import java.util.concurrent.CountDownLatch;

public final class f<T> extends CountDownLatch implements e0<T>, c, p<T>
{
    public T f;
    public Throwable g;
    public a h;
    public volatile boolean i;
    
    public f() {
        super(1);
    }
    
    public final T a() {
        if (this.getCount() != 0L) {
            try {
                b.z1();
                this.await();
            }
            catch (final InterruptedException ex) {
                this.i = true;
                final a h = this.h;
                if (h != null) {
                    h.dispose();
                }
                throw ExceptionHelper.d((Throwable)ex);
            }
        }
        final Throwable g = this.g;
        if (g == null) {
            return this.f;
        }
        throw ExceptionHelper.d(g);
    }
    
    public final void onComplete() {
        this.countDown();
    }
    
    public final void onError(final Throwable g) {
        this.g = g;
        this.countDown();
    }
    
    public final void onSubscribe(final a h) {
        this.h = h;
        if (this.i) {
            h.dispose();
        }
    }
    
    public final void onSuccess(final T f) {
        this.f = f;
        this.countDown();
    }
}
