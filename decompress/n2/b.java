// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import yl.a;
import ah2.f;

public final class b implements q
{
    public final int b;
    
    public b(final int b) {
        this.b = b;
    }
    
    @Override
    public final m a(final m m) {
        f.f((Object)m, "fontWeight");
        final int b = this.b;
        if (b != 0 && b != Integer.MAX_VALUE) {
            return new m(yl.a.K(m.f + b, 1, 1000));
        }
        return m;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof b && this.b == ((b)o).b);
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b);
    }
    
    @Override
    public final String toString() {
        return d.k(a.k("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.b, ')');
    }
}
