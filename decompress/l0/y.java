// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ng2.e;
import androidx.compose.animation.core.RepeatMode;

public final class y<T> implements d<T>
{
    public final p<T> a;
    public final RepeatMode b;
    public final long c;
    
    public y() {
        throw null;
    }
    
    public y(final p a, final RepeatMode b, final long c) {
        this.a = (p<T>)a;
        this.b = b;
        this.c = c;
    }
    
    public final <V extends i> j0<V> a(final h0<T, V> h0) {
        e.f((Object)h0, "converter");
        return (j0<V>)new r0(this.a.a((h0)h0), this.b, this.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof y;
        boolean b2 = true;
        if (b) {
            final y y = (y)o;
            if (e.a((Object)y.a, (Object)this.a) && y.b == this.b && y.c == this.c) {
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
