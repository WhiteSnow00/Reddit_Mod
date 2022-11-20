// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.subscriptions.EmptySubscription;
import hf2.a;
import nt2.c;
import nt2.b;
import java.util.concurrent.Callable;
import af2.g;

public final class m<T> extends g<T>
{
    public final Callable<? extends b<? extends T>> f;
    
    public m(final Callable<? extends b<? extends T>> f) {
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        try {
            final b<? extends T> call = (b<? extends T>)this.f.call();
            a.b((Object)call, "The publisher supplied is null");
            call.subscribe((c)c);
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            EmptySubscription.error(t, (c)c);
        }
    }
}
