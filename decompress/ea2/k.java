// 
// Decompiled by Procyon v0.6.0
// 

package ea2;

import sg2.e;
import x82.i;
import x82.h;
import x82.n0;

public final class k extends v
{
    public final n0 a;
    public final h b;
    public final i c;
    public final x82.k d;
    
    public k(final n0 a, final h b, final i c, final x82.k d) {
        e.f((Object)a, "user");
        e.f((Object)b, "community");
        e.f((Object)c, "communityMembershipInfo");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean a(final v v) {
        e.f((Object)v, "item");
        return v instanceof k && e.a((Object)((k)v).b.f, (Object)this.b.f);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k)) {
            return false;
        }
        final k k = (k)o;
        return e.a((Object)this.a, (Object)k.a) && e.a((Object)this.b, (Object)k.b) && e.a((Object)this.c, (Object)k.c) && e.a((Object)this.d, (Object)k.d);
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final x82.k d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        return (hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + hashCode4;
    }
    
    public final String toString() {
        final StringBuilder r = a.r("MembershipAvailableItem(user=");
        r.append(this.a);
        r.append(", community=");
        r.append(this.b);
        r.append(", communityMembershipInfo=");
        r.append(this.c);
        r.append(", structuredStyle=");
        r.append(this.d);
        r.append(')');
        return r.toString();
    }
}
