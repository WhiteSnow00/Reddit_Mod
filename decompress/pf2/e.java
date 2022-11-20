// 
// Decompiled by Procyon v0.6.0
// 

package pf2;

import af2.e0;
import ff2.g;
import af2.g0;
import af2.c0;

public final class e<T> extends c0<T>
{
    public final g0<T> f;
    public final g<? super Throwable> g;
    
    public e(final g0<T> f, final g<? super Throwable> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.a((e0)new e.e$a(this, (e0)e0));
    }
}
