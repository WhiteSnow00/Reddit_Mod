// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import af2.l;
import nt2.c;
import af2.g;
import ff2.b;
import java.util.concurrent.Callable;
import lf2.a;

public final class FlowableCollect<T, U> extends a<T, U>
{
    public final Callable<? extends U> g;
    public final b<? super U, ? super T> h;
    
    public FlowableCollect(final g<T> g, final Callable<? extends U> g2, final b<? super U, ? super T> h) {
        super(g);
        this.g = g2;
        this.h = h;
    }
    
    @Override
    public final void subscribeActual(final c<? super U> c) {
        try {
            final U call = (U)this.g.call();
            hf2.a.b((Object)call, "The initial value supplied is null");
            super.f.subscribe((l<? super T>)new FlowableCollect.FlowableCollect$CollectSubscriber((c)c, (Object)call, (b)this.h));
        }
        finally {
            final Throwable t;
            EmptySubscription.error(t, (c)c);
        }
    }
}
