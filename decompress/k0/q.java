// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import ah2.f;
import l0.s;
import u2.g;
import u2.i;
import zg2.l;

public final class q
{
    public final l<i, g> a;
    public final s<g> b;
    
    public q(final s b, final l a) {
        f.f((Object)b, "animationSpec");
        this.a = (l<i, g>)a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof q)) {
            return false;
        }
        final q q = (q)o;
        return f.a((Object)this.a, (Object)q.a) && f.a((Object)this.b, (Object)q.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Slide(slideOffset=");
        k.append(this.a);
        k.append(", animationSpec=");
        k.append(this.b);
        k.append(')');
        return k.toString();
    }
}
