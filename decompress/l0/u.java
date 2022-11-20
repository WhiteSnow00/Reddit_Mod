// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ng2.e;

public interface u extends d<Float>
{
    default /* bridge */ j0 a(final h0 h0) {
        return (j0)this.a((l0.h0<Float, i>)h0);
    }
    
    default <V extends i> p0<V> a(final h0<Float, V> h0) {
        e.f((Object)h0, "converter");
        return (p0<V>)new p0(this);
    }
    
    long b(final float p0, final float p1, final float p2);
    
    float c(final float p0, final float p1, final float p2, final long p3);
    
    float d(final float p0, final float p1, final float p2, final long p3);
    
    default float e(final float n, final float n2, final float n3) {
        return this.d(n, n2, n3, this.b(n, n2, n3));
    }
}
