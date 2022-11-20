// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import xd.a;
import nt2.d;
import af2.f;
import ff2.c;
import java.util.concurrent.Callable;
import af2.g;

public final class FlowableGenerate<T, S> extends g<T>
{
    public final Callable<S> f;
    public final c<S, f<T>, S> g;
    public final ff2.g<? super S> h;
    
    public FlowableGenerate(final Callable<S> f, final c<S, f<T>, S> g, final ff2.g<? super S> h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void subscribeActual(final nt2.c<? super T> c) {
        try {
            c.onSubscribe((d)new FlowableGenerate.FlowableGenerate$GeneratorSubscription((nt2.c)c, (c)this.g, (ff2.g)this.h, (Object)this.f.call()));
        }
        finally {
            final Throwable t;
            a.t1(t);
            EmptySubscription.error(t, (nt2.c)c);
        }
    }
}
