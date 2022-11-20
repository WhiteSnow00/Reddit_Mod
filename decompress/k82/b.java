// 
// Decompiled by Procyon v0.6.0
// 

package k82;

import p1.h;
import ng2.e;
import java.math.BigInteger;

public final class b
{
    public final BigInteger a;
    public final String b;
    
    public b(final String b, final BigInteger a) {
        e.f((Object)a, "gas");
        e.f((Object)b, "token");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return e.a((Object)this.a, (Object)b.a) && e.a((Object)this.b, (Object)b.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("GasQuantity(gas=");
        t.append(this.a);
        t.append(", token=");
        return h.c(t, this.b, ')');
    }
}
