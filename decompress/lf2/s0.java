// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import nt2.c;
import ff2.g;

public final class s0<T> implements g<Throwable>
{
    public final c<T> f;
    
    public s0(final c<T> f) {
        this.f = f;
    }
    
    public final void accept(final Object o) throws Exception {
        this.f.onError((Throwable)o);
    }
}
