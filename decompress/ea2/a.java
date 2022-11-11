// 
// Decompiled by Procyon v0.6.0
// 

package ea2;

import al0.f0;
import sg2.e;

public final class a extends v
{
    public final String a;
    
    public a(final String a) {
        e.f((Object)a, "pointsName");
        this.a = a;
    }
    
    public final boolean a(final v v) {
        e.f((Object)v, "item");
        return v instanceof a && e.a((Object)((a)v).a, (Object)this.a);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a && e.a((Object)this.a, (Object)((a)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        return f0.n(a.r("AirdroppingPointsItem(pointsName="), this.a, ')');
    }
}
