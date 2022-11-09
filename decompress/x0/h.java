// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import androidx.viewpager.widget.c;
import eg.n0;
import ah2.f;
import u2.b;

public final class h implements q
{
    public final float a;
    
    public h(final float a) {
        this.a = a;
    }
    
    @Override
    public final float a(final b b, final float n, final float n2) {
        f.f((Object)b, "<this>");
        return n0.f0(n, n2, this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof h && f.a((Object)this.a, (Object)((h)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return c.j(a.k("FractionalThreshold(fraction="), this.a, ')');
    }
}
