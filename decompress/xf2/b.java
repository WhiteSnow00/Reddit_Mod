// 
// Decompiled by Procyon v0.6.0
// 

package xf2;

import nf2.j;
import nf2.f;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import ej2.c0;
import qt2.d;
import qt2.c;
import nf2.g;
import ff2.l;

public abstract class b<T, R> implements l<T>, g<R>
{
    public final c<? super R> f;
    public d g;
    public g<T> h;
    public boolean i;
    public int j;
    
    public b(final c<? super R> f) {
        this.f = f;
    }
    
    public final void a(final Throwable t) {
        c0.i4(t);
        this.g.cancel();
        this.onError(t);
    }
    
    public final int b(int requestFusion) {
        final g<T> h = this.h;
        if (h != null && (requestFusion & 0x4) == 0x0) {
            requestFusion = ((f)h).requestFusion(requestFusion);
            if (requestFusion != 0) {
                this.j = requestFusion;
            }
            return requestFusion;
        }
        return 0;
    }
    
    public final void cancel() {
        this.g.cancel();
    }
    
    public void clear() {
        ((j)this.h).clear();
    }
    
    public final boolean isEmpty() {
        return ((j)this.h).isEmpty();
    }
    
    public final boolean offer(final R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    public void onComplete() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f.onComplete();
    }
    
    public void onError(final Throwable t) {
        if (this.i) {
            RxJavaPlugins.onError(t);
            return;
        }
        this.i = true;
        this.f.onError(t);
    }
    
    public final void onSubscribe(final d g) {
        if (SubscriptionHelper.validate(this.g, g)) {
            this.g = g;
            if (g instanceof g) {
                this.h = (g<T>)g;
            }
            this.f.onSubscribe((d)this);
        }
    }
    
    public final void request(final long n) {
        this.g.request(n);
    }
}
