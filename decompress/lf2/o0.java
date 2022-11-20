// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import hf2.a;
import af2.b0;
import nt2.b;
import af2.g;
import ff2.o;

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
        return af2.g.fromPublisher((nt2.b<?>)apply).observeOn(this.g);
    }
}
