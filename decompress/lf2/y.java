// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.subscriptions.EmptySubscription;
import hf2.a;
import nt2.c;
import java.util.concurrent.Callable;
import af2.g;

public final class y<T> extends g<T>
{
    public final Callable<? extends Throwable> f;
    
    public y(final Callable<? extends Throwable> f) {
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        final Throwable t2;
        try {
            final Throwable call = (Throwable)this.f.call();
            a.b((Object)call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            final Throwable t = call;
        }
        finally {
            xd.a.t1(t2);
        }
        EmptySubscription.error(t2, (c)c);
    }
}
