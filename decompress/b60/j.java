// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import al0.f0;
import sg2.e;
import al0.b;

public final class j
{
    public final String a;
    public final int b;
    public final String c;
    public long d;
    public final String e;
    
    public j(final int b, final long d, final String a, final String c, final String e) {
        al0.b.q(a, "linkId", c, "linkJson", e, "subredditId");
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
        if (!(o instanceof j)) {
            return false;
        }
        final j j = (j)o;
        return sg2.e.a((Object)this.a, (Object)j.a) && this.b == j.b && sg2.e.a((Object)this.c, (Object)j.c) && this.d == j.d && sg2.e.a((Object)this.e, (Object)j.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + b.b(this.d, b.c(this.c, a.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("LinkDataModel(linkId=");
        r.append(this.a);
        r.append(", listingPosition=");
        r.append(this.b);
        r.append(", linkJson=");
        r.append(this.c);
        r.append(", listingId=");
        r.append(this.d);
        r.append(", subredditId=");
        return f0.n(r, this.e, ')');
    }
}
