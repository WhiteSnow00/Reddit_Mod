// 
// Decompiled by Procyon v0.6.0
// 

package g82;

import b5.k;
import aq2.a;
import ng2.e;
import java.math.BigInteger;

public final class b
{
    public final String a;
    public final String b;
    public final BigInteger c;
    public final long d;
    
    public b(final String a, final String b, final BigInteger c, final long d) {
        e.f((Object)a, "subredditId");
        e.f((Object)b, "userId");
        e.f((Object)c, "round");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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
        return e.a((Object)this.a, (Object)b.a) && e.a((Object)this.b, (Object)b.b) && e.a((Object)this.c, (Object)b.c) && this.d == b.d;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.d) + a.h(this.c, aq2.a.e(this.b, this.a.hashCode() * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("ClaimingPointsDataModel(subredditId=");
        t.append(this.a);
        t.append(", userId=");
        t.append(this.b);
        t.append(", round=");
        t.append(this.c);
        t.append(", claimingAt=");
        return k.k(t, this.d, ')');
    }
}
