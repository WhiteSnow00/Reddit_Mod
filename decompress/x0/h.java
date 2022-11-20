// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import ng2.e;
import u2.b;

public final class h implements q
{
    public final float a;
    
    public h(final float a) {
        this.a = a;
    }
    
    public final float a(final b b, final float n, final float n2) {
        e.f((Object)b, "<this>");
        return ah0.b.Q0(n, n2, this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof h && e.a((Object)this.a, (Object)((h)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return aq2.a.n(a.t("FractionalThreshold(fraction="), this.a, ')');
    }
}
