// 
// Decompiled by Procyon v0.6.0
// 

package bb0;

import p1.h;
import ng2.e;
import java.util.List;

public final class g
{
    public final c a;
    public final List<a> b;
    
    public g(final c a, final List<a> b) {
        e.f((Object)b, "data");
        this.a = a;
        this.b = b;
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
        return e.a((Object)this.a, (Object)g.a) && e.a((Object)this.b, (Object)g.b);
    }
    
    @Override
    public final int hashCode() {
        final c a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.b.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CreatorStatsTrends(availability=");
        t.append(this.a);
        t.append(", data=");
        return h.d(t, (List)this.b, ')');
    }
}
