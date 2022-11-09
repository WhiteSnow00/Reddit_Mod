// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;

public final class s0<V extends i> implements n0<V>
{
    public final /* synthetic */ o0<V> f;
    
    public s0(final float n, final float n2, final V v) {
        j j;
        if (v != null) {
            j = new j0(n, n2, v);
        }
        else {
            j = new k0(n, n2);
        }
        this.f = new o0<V>(j);
    }
    
    @Override
    public final boolean a() {
        this.f.getClass();
        return false;
    }
    
    @Override
    public final long b(final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        return this.f.b(v, v2, v3);
    }
    
    @Override
    public final V c(final long n, final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        return this.f.c(n, v, v2, v3);
    }
    
    @Override
    public final V d(final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        return this.f.d(v, v2, v3);
    }
    
    @Override
    public final V g(final long n, final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        return this.f.g(n, v, v2, v3);
    }
}
