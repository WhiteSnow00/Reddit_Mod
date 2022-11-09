// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;
import androidx.compose.animation.core.RepeatMode;

public final class x<T> implements d<T>
{
    public final p<T> a;
    public final RepeatMode b;
    public final long c;
    
    public x() {
        throw null;
    }
    
    public x(final p a, final RepeatMode b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final <V extends i> i0<V> a(final g0<T, V> g0) {
        f.f((Object)g0, "converter");
        return new q0<V>(this.a.a(g0), this.b, this.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof x;
        boolean b2 = true;
        if (b) {
            final x x = (x)o;
            if (f.a((Object)x.a, (Object)this.a) && x.b == this.b && x.c == this.c) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
}
