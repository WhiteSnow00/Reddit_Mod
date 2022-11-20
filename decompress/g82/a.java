// 
// Decompiled by Procyon v0.6.0
// 

package g82;

import b5.k;
import ng2.e;
import java.math.BigInteger;
import java.util.Date;

public final class a
{
    public final String a;
    public final String b;
    public final Date c;
    public final BigInteger d;
    public final BigInteger e;
    public final r82.a f;
    public final String g;
    public final int h;
    public final int i;
    public final long j;
    
    public a(final String a, final String b, final Date c, final BigInteger d, final BigInteger e, final r82.a f, final String g, final int h, final int i, final long j) {
        ng2.e.f((Object)a, "subredditId");
        ng2.e.f((Object)b, "userId");
        ng2.e.f((Object)d, "pointsToClaim");
        ng2.e.f((Object)e, "round");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
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
        return ng2.e.a((Object)this.a, (Object)a.a) && ng2.e.a((Object)this.b, (Object)a.b) && ng2.e.a((Object)this.c, (Object)a.c) && ng2.e.a((Object)this.d, (Object)a.d) && ng2.e.a((Object)this.e, (Object)a.e) && ng2.e.a((Object)this.f, (Object)a.f) && ng2.e.a((Object)this.g, (Object)a.g) && this.h == a.h && this.i == a.i && this.j == a.j;
    }
    
    @Override
    public final int hashCode() {
        final int h = a.h(this.e, a.h(this.d, (this.c.hashCode() + aq2.a.e(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31);
        final r82.a f = this.f;
        int hashCode = 0;
        int hashCode2;
        if (f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = f.hashCode();
        }
        final String g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return Long.hashCode(this.j) + aq2.a.c(this.i, aq2.a.c(this.h, ((h + hashCode2) * 31 + hashCode) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("ClaimablePointsDataModel(subredditId=");
        t.append(this.a);
        t.append(", userId=");
        t.append(this.b);
        t.append(", expiresAt=");
        t.append(this.c);
        t.append(", pointsToClaim=");
        t.append(this.d);
        t.append(", round=");
        t.append(this.e);
        t.append(", address=");
        t.append(this.f);
        t.append(", signature=");
        t.append(this.g);
        t.append(", totalKarma=");
        t.append(this.h);
        t.append(", userKarma=");
        t.append(this.i);
        t.append(", claimingAt=");
        return k.k(t, this.j, ')');
    }
}
