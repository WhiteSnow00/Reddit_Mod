// 
// Decompiled by Procyon v0.6.0
// 

package jf2;

import io.reactivex.internal.util.ExceptionHelper;
import zd.b;
import df2.a;
import af2.a0;
import java.util.concurrent.CountDownLatch;

public abstract class c<T> extends CountDownLatch implements a0<T>, a
{
    public T f;
    public Throwable g;
    public a h;
    public volatile boolean i;
    
    public c() {
        super(1);
    }
    
    public final T a() {
        if (this.getCount() != 0L) {
            try {
                b.z1();
                this.await();
            }
            catch (final InterruptedException ex) {
                this.dispose();
                throw ExceptionHelper.d((Throwable)ex);
            }
        }
        final Throwable g = this.g;
        if (g == null) {
            return this.f;
        }
        throw ExceptionHelper.d(g);
    }
    
    public final void dispose() {
        this.i = true;
        final a h = this.h;
        if (h != null) {
            h.dispose();
        }
    }
    
    public final boolean isDisposed() {
        return this.i;
    }
    
    public final void onComplete() {
        this.countDown();
    }
    
    public final void onSubscribe(final a h) {
        this.h = h;
        if (this.i) {
            h.dispose();
        }
    }
}
