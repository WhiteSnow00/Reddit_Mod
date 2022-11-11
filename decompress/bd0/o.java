// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import sg2.e;
import java.util.List;

public final class o
{
    public final List<h> a;
    public final int b;
    
    public o(final List<h> a, final int b) {
        e.f((Object)a, "allocations");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof o)) {
            return false;
        }
        final o o2 = (o)o;
        return e.a((Object)this.a, (Object)o2.a) && this.b == o2.b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SelfPowerupAllocations(allocations=");
        r.append(this.a);
        r.append(", freePowerupsCount=");
        return d.l(r, this.b, ')');
    }
}
