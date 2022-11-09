// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;
import androidx.compose.animation.core.RepeatMode;

public final class q0<V extends i> implements i0<V>
{
    public final m0<V> f;
    public final RepeatMode g;
    public final long h;
    public final long i;
    
    public q0(final m0 f, final RepeatMode g, final long n) {
        this.f = f;
        this.g = g;
        this.h = (f.getDurationMillis() + f.f()) * 1000000L;
        this.i = n * 1000000L;
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    @Override
    public final long b(final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        return Long.MAX_VALUE;
    }
    
    @Override
    public final V c(final long n, final V v, final V v2, V g) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)g, "initialVelocity");
        final m0<V> f = this.f;
        final long e = this.e(n);
        final long i = this.i;
        final long h = this.h;
        if (n + i > h) {
            g = (V)this.g(h - i, v, g, v2);
        }
        return f.c(e, v, v2, g);
    }
    
    public final long e(long h) {
        final long i = this.i;
        if (h + i <= 0L) {
            return 0L;
        }
        final long n = h + i;
        h = this.h;
        final long n2 = n / h;
        if (this.g != RepeatMode.Restart && n2 % 2 != 0L) {
            return (n2 + 1L) * h - n;
        }
        return n - n2 * h;
    }
    
    @Override
    public final V g(final long n, final V v, final V v2, V g) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)g, "initialVelocity");
        final m0<V> f = this.f;
        final long e = this.e(n);
        final long i = this.i;
        final long h = this.h;
        if (n + i > h) {
            g = (V)this.g(h - i, v, g, v2);
        }
        return f.g(e, v, v2, g);
    }
}
