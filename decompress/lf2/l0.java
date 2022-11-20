// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import io.reactivex.internal.operators.flowable.d;
import hf2.a;
import ff2.c;
import nt2.b;
import ff2.o;

public final class l0<T, R, U> implements o<T, b<R>>
{
    public final c<? super T, ? super U, ? extends R> f;
    public final o<? super T, ? extends b<? extends U>> g;
    
    public l0(final o g, final c f) {
        this.f = (c<? super T, ? super U, ? extends R>)f;
        this.g = (o<? super T, ? extends b<? extends U>>)g;
    }
    
    public final Object apply(final Object o) throws Exception {
        final Object apply = this.g.apply(o);
        a.b(apply, "The mapper returned a null Publisher");
        return new d((b)apply, new k0(o, this.f));
    }
}
