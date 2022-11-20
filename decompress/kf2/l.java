// 
// Decompiled by Procyon v0.6.0
// 

package kf2;

import af2.c;
import af2.a0;
import af2.a;
import af2.e;
import af2.t;

public final class l<T> extends t<T>
{
    public final e f;
    
    public l(final a f) {
        this.f = (e)f;
    }
    
    @Override
    public final void subscribeActual(final a0<? super T> a0) {
        this.f.a((c)new l.l$a((a0)a0));
    }
}
