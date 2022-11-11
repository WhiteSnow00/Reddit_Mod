// 
// Decompiled by Procyon v0.6.0
// 

package qf2;

import kf2.g;
import ff2.f;
import kf2.c;

public final class q0<T, S> implements c<S, f<T>, S>
{
    public final g<f<T>> f;
    
    public q0(final g<f<T>> f) {
        this.f = f;
    }
    
    public final Object apply(final Object o, final Object o2) throws Exception {
        this.f.accept((Object)o2);
        return o;
    }
}
