// 
// Decompiled by Procyon v0.6.0
// 

package a2;

import n1.c;

public final class d
{
    public final long a;
    public final long b;
    
    public d(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return c.a(this.a, d.a) && this.b == d.b;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int e = c.e;
        return Long.hashCode(this.b) + Long.hashCode(a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PointAtTime(point=");
        k.append((Object)c.h(this.a));
        k.append(", time=");
        return androidx.viewpager.widget.c.k(k, this.b, ')');
    }
}
