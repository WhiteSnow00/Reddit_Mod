// 
// Decompiled by Procyon v0.6.0
// 

package sf2;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import zd.b;
import nt2.d;
import af2.l;
import java.util.concurrent.CountDownLatch;

public abstract class c<T> extends CountDownLatch implements l<T>
{
    public T f;
    public Throwable g;
    public d h;
    
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
                final d h = this.h;
                this.h = (d)SubscriptionHelper.CANCELLED;
                if (h != null) {
                    h.cancel();
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
    
    @Override
    public final void onSubscribe(final d h) {
        if (SubscriptionHelper.validate(this.h, h)) {
            (this.h = h).request(Long.MAX_VALUE);
        }
    }
}
