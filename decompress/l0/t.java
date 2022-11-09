// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;

public interface t extends d<Float>
{
    default <V extends i> o0<V> a(final g0<Float, V> g0) {
        f.f((Object)g0, "converter");
        return new o0<V>(this);
    }
    
    long b(final float p0, final float p1, final float p2);
    
    float c(final float p0, final float p1, final float p2, final long p3);
    
    float d(final float p0, final float p1, final float p2, final long p3);
    
    default float e(final float n, final float n2, final float n3) {
        return this.d(n, n2, n3, this.b(n, n2, n3));
    }
}
