// 
// Decompiled by Procyon v0.6.0
// 

package qf2;

import kf2.b;
import ff2.f;
import kf2.c;

public final class p0<T, S> implements c<S, f<T>, S>
{
    public final b<S, f<T>> f;
    
    public p0(final b<S, f<T>> f) {
        this.f = f;
    }
    
    public final Object apply(final Object o, final Object o2) throws Exception {
        this.f.accept(o, (Object)o2);
        return o;
    }
}
