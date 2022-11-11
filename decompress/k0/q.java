// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import sg2.e;
import l0.s;
import u2.g;
import u2.i;
import rg2.l;

public final class q
{
    public final l<i, g> a;
    public final s<g> b;
    
    public q(final s b, final l a) {
        e.f((Object)b, "animationSpec");
        this.a = a;
        this.b = (s<g>)b;
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
        return e.a((Object)this.a, (Object)q.a) && e.a((Object)this.b, (Object)q.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Slide(slideOffset=");
        r.append(this.a);
        r.append(", animationSpec=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
