// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import androidx.viewpager.widget.c;
import ag0.a;
import androidx.appcompat.widget.s0;
import ah2.f;

public final class m
{
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public long e;
    
    public m(final int b, final int d, final long e, final String a, final String c) {
        f.f((Object)a, "discoveryUnitId");
        f.f((Object)c, "modelJson");
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
        return f.a((Object)this.a, (Object)m.a) && this.b == m.b && f.a((Object)this.c, (Object)m.c) && this.d == m.d && this.e == m.e;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.e) + s0.e(this.d, ag0.a.f(this.c, s0.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ListingDiscoveryUnitDataModel(discoveryUnitId=");
        k.append(this.a);
        k.append(", listingPosition=");
        k.append(this.b);
        k.append(", modelJson=");
        k.append(this.c);
        k.append(", modelType=");
        k.append(this.d);
        k.append(", listingId=");
        return androidx.viewpager.widget.c.k(k, this.e, ')');
    }
}
