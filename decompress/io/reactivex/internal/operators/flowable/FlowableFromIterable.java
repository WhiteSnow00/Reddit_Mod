// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import nt2.d;
import if2.a;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Iterator;
import nt2.c;
import af2.g;

public final class FlowableFromIterable<T> extends g<T>
{
    public final Iterable<? extends T> f;
    
    public FlowableFromIterable(final Iterable<? extends T> f) {
        this.f = f;
    }
    
    public static <T> void e(final c<? super T> c, final Iterator<? extends T> iterator) {
        try {
            if (!iterator.hasNext()) {
                EmptySubscription.complete((c)c);
                return;
            }
            if (c instanceof a) {
                c.onSubscribe((d)new FlowableFromIterable.FlowableFromIterable$IteratorConditionalSubscription((a)c, (Iterator)iterator));
            }
            else {
                c.onSubscribe((d)new FlowableFromIterable.FlowableFromIterable$IteratorSubscription((c)c, (Iterator)iterator));
            }
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            EmptySubscription.error(t, (c)c);
        }
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        try {
            e((nt2.c<? super Object>)c, (Iterator<?>)this.f.iterator());
        }
        finally {
            final Throwable t;
            xd.a.t1(t);
            EmptySubscription.error(t, (c)c);
        }
    }
}
