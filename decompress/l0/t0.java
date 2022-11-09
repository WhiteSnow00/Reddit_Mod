// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;

public final class t0<V extends i> implements m0<V>
{
    public final int f;
    public final int g;
    public final q h;
    public final o0<V> i;
    
    public t0(final int f, final int g, final q h) {
        ah2.f.f((Object)h, "easing");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = new o0<V>(new w(f, g, h));
    }
    
    @Override
    public final V c(final long n, final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        return this.i.c(n, v, v2, v3);
    }
    
    @Override
    public final int f() {
        return this.g;
    }
    
    @Override
    public final V g(final long n, final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        return this.i.g(n, v, v2, v3);
    }
    
    @Override
    public final int getDurationMillis() {
        return this.f;
    }
}
