// 
// Decompiled by Procyon v0.6.0
// 

package td0;

import p1.h;
import ng2.e;
import java.util.List;

public final class a
{
    public final Integer a;
    public final List<b> b;
    
    public a(final Integer a, final List<b> b) {
        e.f((Object)b, "econSubscriptions");
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
        return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b);
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
        final StringBuilder t = a.t("CoinsAndSubscriptions(coins=");
        t.append(this.a);
        t.append(", econSubscriptions=");
        return h.d(t, (List)this.b, ')');
    }
}
