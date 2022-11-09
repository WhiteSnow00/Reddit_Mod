// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ag0.a;
import androidx.appcompat.widget.s0;
import ah2.f;
import ak0.m;

public final class j
{
    public final String a;
    public final int b;
    public final String c;
    public long d;
    public final String e;
    
    public j(final int b, final long d, final String a, final String c, final String e) {
        m.y(a, "linkId", c, "linkJson", e, "subredditId");
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
        return f.a((Object)this.a, (Object)j.a) && this.b == j.b && f.a((Object)this.c, (Object)j.c) && this.d == j.d && f.a((Object)this.e, (Object)j.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + b.c(this.d, ag0.a.f(this.c, s0.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("LinkDataModel(linkId=");
        k.append(this.a);
        k.append(", listingPosition=");
        k.append(this.b);
        k.append(", linkJson=");
        k.append(this.c);
        k.append(", listingId=");
        k.append(this.d);
        k.append(", subredditId=");
        return b.k(k, this.e, ')');
    }
}
