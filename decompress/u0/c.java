// 
// Decompiled by Procyon v0.6.0
// 

package u0;

import u2.d;
import ah2.f;

public final class c implements b
{
    public final float a;
    
    public c(final float a) {
        this.a = a;
    }
    
    @Override
    public final float a(final u2.b b, final long n) {
        f.f((Object)b, "density");
        return b.M0(this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c && d.a(this.a, ((c)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CornerSize(size = ");
        k.append(this.a);
        k.append(".dp)");
        return k.toString();
    }
}
