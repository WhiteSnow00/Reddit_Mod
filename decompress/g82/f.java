// 
// Decompiled by Procyon v0.6.0
// 

package g82;

import ng2.e;
import java.math.BigInteger;
import r82.a;

public final class f
{
    public final String a;
    public final String b;
    public final a c;
    public final BigInteger d;
    public final BigInteger e;
    public final long f;
    public final boolean g;
    
    public f(final String a, final String b, final a c, final BigInteger d, final BigInteger e, final long f, final boolean g) {
        ng2.e.f((Object)a, "subredditId");
        ng2.e.f((Object)b, "userId");
        ng2.e.f((Object)d, "amount");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return ng2.e.a((Object)this.a, (Object)f.a) && ng2.e.a((Object)this.b, (Object)f.b) && ng2.e.a((Object)this.c, (Object)f.c) && ng2.e.a((Object)this.d, (Object)f.d) && ng2.e.a((Object)this.e, (Object)f.e) && this.f == f.f && this.g == f.g;
    }
    
    @Override
    public final int hashCode() {
        final int e = aq2.a.e(this.b, this.a.hashCode() * 31, 31);
        final a c = this.c;
        final int n = 0;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final int h = a.h(this.d, (e + hashCode) * 31, 31);
        final BigInteger e2 = this.e;
        int hashCode2;
        if (e2 == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = e2.hashCode();
        }
        final int b = b.b(this.f, (h + hashCode2) * 31, 31);
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        return b + g;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("SubredditPointsDataModel(subredditId=");
        t.append(this.a);
        t.append(", userId=");
        t.append(this.b);
        t.append(", address=");
        t.append(this.c);
        t.append(", amount=");
        t.append(this.d);
        t.append(", ethAmount=");
        t.append(this.e);
        t.append(", fetchedAt=");
        t.append(this.f);
        t.append(", isLocalUser=");
        return d.n(t, this.g, ')');
    }
}
