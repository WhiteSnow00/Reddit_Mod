// 
// Decompiled by Procyon v0.6.0
// 

package ea2;

import al0.g7;
import sg2.e;
import java.util.ArrayList;
import java.util.List;

public final class o extends v
{
    public final List<n> a;
    public final boolean b;
    
    public o(final ArrayList a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(final v v) {
        e.f((Object)v, "item");
        return v instanceof o;
    }
    
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
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    public final String toString() {
        final StringBuilder r = a.r("PointsItem(points=");
        r.append(this.a);
        r.append(", loading=");
        return g7.m(r, this.b, ')');
    }
}
