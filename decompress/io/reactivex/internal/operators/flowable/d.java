// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import qt2.c;
import qf2.k0;
import kf2.o;
import qt2.b;
import ff2.g;

public final class d<T, U> extends g<U>
{
    public final b<T> f;
    public final o<? super T, ? extends U> g;
    
    public d(final b f, final k0 g) {
        this.f = (b<T>)f;
        this.g = (o<? super T, ? extends U>)g;
    }
    
    @Override
    public final void subscribeActual(final c<? super U> c) {
        this.f.subscribe((c)new c$b((c)c, (o)this.g));
    }
}
