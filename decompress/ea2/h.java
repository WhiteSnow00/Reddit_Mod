// 
// Decompiled by Procyon v0.6.0
// 

package ea2;

import sg2.e;
import java.math.BigInteger;

public final class h extends n
{
    public final String a;
    public final String b;
    public final String c;
    public final BigInteger d;
    public final int e;
    public final int f;
    
    public h(final String a, final String b, final String c, final BigInteger d) {
        sg2.e.f((Object)a, "subredditId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = 2131954660;
        this.f = 2131231558;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        return sg2.e.a((Object)this.a, (Object)h.a) && sg2.e.a((Object)this.b, (Object)h.b) && sg2.e.a((Object)this.c, (Object)h.c) && sg2.e.a((Object)this.d, (Object)h.d) && this.e == h.e && this.f == h.f;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final BigInteger d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return Integer.hashCode(this.f) + a.c(this.e, (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2) * 31, 31);
    }
    
    public final String toString() {
        final StringBuilder r = a.r("GasBalance(subredditId=");
        r.append(this.a);
        r.append(", token=");
        r.append(this.b);
        r.append(", tokenIconUrl=");
        r.append(this.c);
        r.append(", balance=");
        r.append(this.d);
        r.append(", placeholderTextRes=");
        r.append(this.e);
        r.append(", placeholderIconRes=");
        return d.l(r, this.f, ')');
    }
}
