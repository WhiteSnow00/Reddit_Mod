// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import sg2.e;

public final class m
{
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public long e;
    
    public m(final int b, final int d, final long e, final String a, final String c) {
        sg2.e.f((Object)a, "discoveryUnitId");
        sg2.e.f((Object)c, "modelJson");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final m m = (m)o;
        return sg2.e.a((Object)this.a, (Object)m.a) && this.b == m.b && sg2.e.a((Object)this.c, (Object)m.c) && this.d == m.d && this.e == m.e;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.e) + a.c(this.d, b.c(this.c, a.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ListingDiscoveryUnitDataModel(discoveryUnitId=");
        r.append(this.a);
        r.append(", listingPosition=");
        r.append(this.b);
        r.append(", modelJson=");
        r.append(this.c);
        r.append(", modelType=");
        r.append(this.d);
        r.append(", listingId=");
        return b.i(r, this.e, ')');
    }
}
