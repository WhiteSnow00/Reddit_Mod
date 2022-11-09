// 
// Decompiled by Procyon v0.6.0
// 

package ce0;

import ag0.a;
import androidx.appcompat.widget.s0;
import ah2.f;
import ak0.m;

public final class c
{
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    
    public c(final int b, final int d, final String a, final String c, final String e) {
        m.y(a, "productId", c, "productDescription", e, "pricePackageId");
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
        return f.a((Object)this.a, (Object)c.a) && this.b == c.b && f.a((Object)this.c, (Object)c.c) && this.d == c.d && f.a((Object)this.e, (Object)c.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + s0.e(this.d, ag0.a.f(this.c, s0.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PremiumCancelOffer(productId=");
        k.append(this.a);
        k.append(", bonusCoins=");
        k.append(this.b);
        k.append(", productDescription=");
        k.append(this.c);
        k.append(", productVersion=");
        k.append(this.d);
        k.append(", pricePackageId=");
        return b.k(k, this.e, ')');
    }
}
