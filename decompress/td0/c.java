// 
// Decompiled by Procyon v0.6.0
// 

package td0;

import p1.h;
import aq2.a;
import ng2.e;

public final class c
{
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    
    public c(final int b, final int d, final String a, final String c, final String e) {
        b.w(a, "productId", c, "productDescription", e, "pricePackageId");
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
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return ng2.e.a((Object)this.a, (Object)c.a) && this.b == c.b && ng2.e.a((Object)this.c, (Object)c.c) && this.d == c.d && ng2.e.a((Object)this.e, (Object)c.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + aq2.a.c(this.d, aq2.a.e(this.c, aq2.a.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PremiumCancelOffer(productId=");
        t.append(this.a);
        t.append(", bonusCoins=");
        t.append(this.b);
        t.append(", productDescription=");
        t.append(this.c);
        t.append(", productVersion=");
        t.append(this.d);
        t.append(", pricePackageId=");
        return h.c(t, this.e, ')');
    }
}
