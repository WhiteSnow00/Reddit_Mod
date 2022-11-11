// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import sg2.e;

public final class s0<V extends i> implements m0<V>
{
    public final int a;
    
    public s0(final int a) {
        this.a = a;
    }
    
    public final V c(final long n, final V v, final V v2, final V v3) {
        e.f((Object)v, "initialValue");
        e.f((Object)v2, "targetValue");
        e.f((Object)v3, "initialVelocity");
        if (n < this.a * 1000000L) {
            return v;
        }
        return v2;
    }
    
    public final int e() {
        return this.a;
    }
    
    public final V f(final long n, final V v, final V v2, final V v3) {
        e.f((Object)v, "initialValue");
        e.f((Object)v2, "targetValue");
        e.f((Object)v3, "initialVelocity");
        return v3;
    }
    
    public final int getDurationMillis() {
        return 0;
    }
}
