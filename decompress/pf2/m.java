// 
// Decompiled by Procyon v0.6.0
// 

package pf2;

import af2.e0;
import ff2.o;
import af2.g0;
import af2.c0;

public final class m<T> extends c0<T>
{
    public final g0<? extends T> f;
    public final o<? super Throwable, ? extends T> g;
    public final T h;
    
    public m(final g0<? extends T> f, final o<? super Throwable, ? extends T> g, final T h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        this.f.a((e0)new m.m$a(this, (e0)e0));
    }
}
