// 
// Decompiled by Procyon v0.6.0
// 

package ce0;

import ak0.m;
import ah2.f;
import java.util.List;

public final class a
{
    public final Integer a;
    public final List<b> b;
    
    public a(final Integer a, final List<b> b) {
        f.f((Object)b, "econSubscriptions");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return f.a((Object)this.a, (Object)a.a) && f.a((Object)this.b, (Object)a.b);
    }
    
    @Override
    public final int hashCode() {
        final Integer a = this.a;
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
        final StringBuilder k = a.k("CoinsAndSubscriptions(coins=");
        k.append(this.a);
        k.append(", econSubscriptions=");
        return m.n(k, (List)this.b, ')');
    }
}
