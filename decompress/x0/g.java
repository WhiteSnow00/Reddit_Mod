// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import u2.d;
import ah2.f;
import u2.b;

public final class g implements q
{
    public final float a;
    
    public g(final float a) {
        this.a = a;
    }
    
    @Override
    public final float a(final b b, final float n, final float n2) {
        f.f((Object)b, "<this>");
        return Math.signum(n2 - n) * b.M0(this.a) + n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof g && d.a(this.a, ((g)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("FixedThreshold(offset=");
        k.append((Object)d.b(this.a));
        k.append(')');
        return k.toString();
    }
}
