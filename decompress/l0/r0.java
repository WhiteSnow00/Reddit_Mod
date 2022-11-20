// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ng2.e;
import androidx.compose.animation.core.RepeatMode;

public final class r0<V extends i> implements j0<V>
{
    public final n0<V> f;
    public final RepeatMode g;
    public final long h;
    public final long i;
    
    public r0(final n0 f, final RepeatMode g, final long n) {
        this.f = (n0<V>)f;
        this.g = g;
        this.h = (f.getDurationMillis() + f.f()) * 1000000L;
        this.i = n * 1000000L;
    }
    
    public final boolean a() {
        return true;
    }
    
    public final long b(final V v, final V v2, final V v3) {
        e.f((Object)v, "initialValue");
        e.f((Object)v2, "targetValue");
        return Long.MAX_VALUE;
    }
    
    public final V c(final long n, final V v, final V v2, V g) {
        e.f((Object)v, "initialValue");
        e.f((Object)v2, "targetValue");
        e.f((Object)g, "initialVelocity");
        final n0<V> f = this.f;
        final long d = this.d(n);
        final long i = this.i;
        final long h = this.h;
        if (n + i > h) {
            g = (V)this.g(h - i, v, g, v2);
        }
        return (V)((j0)f).c(d, (i)v, (i)v2, (i)g);
    }
    
    public final long d(long n) {
        final long i = this.i;
        if (n + i <= 0L) {
            return 0L;
        }
        final long n2 = n + i;
        final long h = this.h;
        n = n2 / h;
        if (this.g != RepeatMode.Restart && n % 2 != 0L) {
            return (n + 1L) * h - n2;
        }
        return n2 - n * h;
    }
    
    public final V g(final long n, final V v, final V v2, V g) {
        e.f((Object)v, "initialValue");
        e.f((Object)v2, "targetValue");
        e.f((Object)g, "initialVelocity");
        final n0<V> f = this.f;
        final long d = this.d(n);
        final long i = this.i;
        final long h = this.h;
        if (n + i > h) {
            g = (V)this.g(h - i, v, g, v2);
        }
        return (V)((j0)f).g(d, (i)v, (i)v2, (i)g);
    }
}
