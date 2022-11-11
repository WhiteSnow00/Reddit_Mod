// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import sg2.e;

public final class u0<V extends i> implements m0<V>
{
    public final int a;
    public final int b;
    public final q c;
    public final o0<V> d;
    
    public u0(final int a, final int b, final q c) {
        e.f((Object)c, "easing");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (o0<V>)new o0((t)new w(a, b, c));
    }
    
    public final V c(final long n, final V v, final V v2, final V v3) {
        e.f((Object)v, "initialValue");
        e.f((Object)v2, "targetValue");
        e.f((Object)v3, "initialVelocity");
        return (V)this.d.c(n, (i)v, (i)v2, (i)v3);
    }
    
    public final int e() {
        return this.b;
    }
    
    public final V f(final long n, final V v, final V v2, final V v3) {
        e.f((Object)v, "initialValue");
        e.f((Object)v2, "targetValue");
        e.f((Object)v3, "initialVelocity");
        return (V)this.d.f(n, (i)v, (i)v2, (i)v3);
    }
    
    public final int getDurationMillis() {
        return this.a;
    }
}
