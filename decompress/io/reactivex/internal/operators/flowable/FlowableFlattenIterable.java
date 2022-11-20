// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import af2.l;
import java.util.Iterator;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import nt2.c;
import af2.g;
import ff2.o;
import lf2.a;

public final class FlowableFlattenIterable<T, R> extends a<T, R>
{
    public final o<? super T, ? extends Iterable<? extends R>> g;
    public final int h;
    
    public FlowableFlattenIterable(final g<T> g, final o<? super T, ? extends Iterable<? extends R>> g2, final int h) {
        super(g);
        this.g = g2;
        this.h = h;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> c) {
        final g<T> f = super.f;
        if (f instanceof Callable) {
            try {
                final Object call = ((Callable<Object>)f).call();
                if (call == null) {
                    EmptySubscription.complete((c)c);
                    return;
                }
                try {
                    FlowableFromIterable.e((nt2.c<? super Object>)c, (Iterator<?>)((Iterable)this.g.apply(call)).iterator());
                    return;
                }
                finally {
                    final Throwable t;
                    xd.a.t1(t);
                    EmptySubscription.error(t, (c)c);
                    return;
                }
            }
            finally {
                final Throwable t2;
                xd.a.t1(t2);
                EmptySubscription.error(t2, (c)c);
                return;
            }
        }
        f.subscribe((l<? super T>)new FlowableFlattenIterable.FlowableFlattenIterable$FlattenIterableSubscriber((c)c, (o)this.g, this.h));
    }
}
