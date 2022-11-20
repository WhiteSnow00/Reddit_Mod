// 
// Decompiled by Procyon v0.6.0
// 

package pf2;

import af2.e0;
import b60.b0;
import ff2.g;
import af2.g0;
import af2.c0;

public final class c<T> extends c0<T>
{
    public final g0<T> f;
    public final g<? super T> g;
    
    public c(final c0 f, final b0 g) {
        this.f = (g0<T>)f;
        this.g = (g<? super T>)g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.a((e0)new c.c$a((e0)e0, (g)this.g));
    }
}
