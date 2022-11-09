// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;

public interface m0<V extends i> extends n0<V>
{
    default long b(final V v, final V v2, final V v3) {
        f.f((Object)v, "initialValue");
        f.f((Object)v2, "targetValue");
        f.f((Object)v3, "initialVelocity");
        return (this.getDurationMillis() + this.f()) * 1000000L;
    }
    
    int f();
    
    int getDurationMillis();
}
