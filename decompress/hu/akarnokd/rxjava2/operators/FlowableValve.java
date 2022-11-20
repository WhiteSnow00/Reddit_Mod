// 
// Decompiled by Procyon v0.6.0
// 

package hu.akarnokd.rxjava2.operators;

import nt2.d;
import nt2.c;
import nt2.b;
import af2.m;
import af2.k;
import af2.g;

public final class FlowableValve<T> extends g<T> implements k<T, T>, m<T, T>
{
    public final b<? extends T> f;
    public final b<Boolean> g;
    public final boolean h;
    public final int i;
    
    public FlowableValve(final b<? extends T> f, final b<Boolean> g, final boolean h, final int i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final FlowableValve d(final g g) {
        return new FlowableValve((b<? extends T>)g, this.g, this.h, this.i);
    }
    
    public final c<? super T> e(final c<? super T> c) {
        final FlowableValve.FlowableValve$ValveMainSubscriber flowableValve$ValveMainSubscriber = new FlowableValve.FlowableValve$ValveMainSubscriber((c)c, this.i, this.h);
        c.onSubscribe((d)flowableValve$ValveMainSubscriber);
        this.g.subscribe((c)flowableValve$ValveMainSubscriber.other);
        return (c<? super T>)flowableValve$ValveMainSubscriber;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        this.f.subscribe((c)this.e(c));
    }
}
