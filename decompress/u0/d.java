// 
// Decompiled by Procyon v0.6.0
// 

package u0;

import ah2.f;

public final class d implements b
{
    public final float a;
    
    public d(final float a) {
        this.a = a;
        if (a >= 0.0f && a <= 100.0f) {
            return;
        }
        throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
    }
    
    @Override
    public final float a(final u2.b b, final long n) {
        f.f((Object)b, "density");
        return this.a / 100.0f * n1.f.d(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof d && f.a((Object)this.a, (Object)((d)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CornerSize(size = ");
        k.append(this.a);
        k.append("%)");
        return k.toString();
    }
}
