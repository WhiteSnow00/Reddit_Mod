// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import ff2.c;
import ff2.o;

public final class k0<U, R, T> implements o<U, R>
{
    public final c<? super T, ? super U, ? extends R> f;
    public final T g;
    
    public k0(final Object g, final c f) {
        this.f = (c<? super T, ? super U, ? extends R>)f;
        this.g = (T)g;
    }
    
    public final R apply(final U u) throws Exception {
        return (R)this.f.apply((Object)this.g, (Object)u);
    }
}
