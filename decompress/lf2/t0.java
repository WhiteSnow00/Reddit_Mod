// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import nt2.c;
import ff2.g;

public final class t0<T> implements g<T>
{
    public final c<T> f;
    
    public t0(final c<T> f) {
        this.f = f;
    }
    
    public final void accept(final T t) throws Exception {
        this.f.onNext((Object)t);
    }
}
