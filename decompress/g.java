// 
// Decompiled by Procyon v0.6.0
// 

package a2;

import ah2.f;
import n1.c;

public final class g
{
    public static final g e;
    public final long a;
    public final float b;
    public final long c;
    public final long d;
    
    static {
        final long b = c.b;
        e = new g(b, 1.0f, 0L, b);
    }
    
    public g(final long a, final float b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        return n1.c.a(this.a, g.a) && f.a((Object)this.b, (Object)g.b) && this.c == g.c && n1.c.a(this.d, g.d);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int e = n1.c.e;
        return Long.hashCode(this.d) + b.c(this.c, a.a(this.b, Long.hashCode(a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("VelocityEstimate(pixelsPerSecond=");
        k.append((Object)n1.c.h(this.a));
        k.append(", confidence=");
        k.append(this.b);
        k.append(", durationMillis=");
        k.append(this.c);
        k.append(", offset=");
        k.append((Object)n1.c.h(this.d));
        k.append(')');
        return k.toString();
    }
}
