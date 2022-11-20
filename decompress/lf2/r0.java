// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import nt2.c;
import ff2.a;

public final class r0<T> implements a
{
    public final c<T> f;
    
    public r0(final c<T> f) {
        this.f = f;
    }
    
    public final void run() throws Exception {
        this.f.onComplete();
    }
}
