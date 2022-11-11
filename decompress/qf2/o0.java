// 
// Decompiled by Procyon v0.6.0
// 

package qf2;

import mf2.a;
import ff2.b0;
import qt2.b;
import ff2.g;
import kf2.o;

public final class o0<T, R> implements o<g<T>, b<R>>
{
    public final o<? super g<T>, ? extends b<R>> f;
    public final b0 g;
    
    public o0(final o<? super g<T>, ? extends b<R>> f, final b0 g) {
        this.f = f;
        this.g = g;
    }
    
    public final Object apply(Object apply) throws Exception {
        apply = this.f.apply((Object)apply);
        a.b(apply, "The selector returned a null Publisher");
        return ff2.g.fromPublisher((qt2.b<?>)apply).observeOn(this.g);
    }
}
