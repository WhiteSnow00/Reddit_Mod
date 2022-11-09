// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;

public interface i0<V extends i>
{
    boolean a();
    
    long b(final V p0, final V p1, final V p2);
    
    V c(final long p0, final V p1, final V p2, final V p3);
    
    default V d(final V v, final V v2, final V v3) {
        f.f((Object)v, "initialValue");
        f.f((Object)v2, "targetValue");
        f.f((Object)v3, "initialVelocity");
        return this.g(this.b(v, v2, v3), v, v2, v3);
    }
    
    V g(final long p0, final V p1, final V p2, final V p3);
}
