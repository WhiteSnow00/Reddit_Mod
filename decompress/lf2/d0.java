// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import nt2.c;
import nt2.b;
import af2.g;

public final class d0<T> extends g<T>
{
    public final b<? extends T> f;
    
    public d0(final b<? extends T> f) {
        this.f = f;
    }
    
    @Override
    public final void subscribeActual(final c<? super T> c) {
        this.f.subscribe((c)c);
    }
}
