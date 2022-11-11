// 
// Decompiled by Procyon v0.6.0
// 

package co0;

import sg2.e;
import com.reddit.domain.meta.model.MetaCorrelation;
import com.reddit.domain.meta.model.MetaCommunityCurrency;

public final class a
{
    public final jl0.a a;
    public final long b;
    public final long c;
    public final MetaCommunityCurrency d;
    public final boolean e;
    public final String f;
    public final String g;
    public final MetaCorrelation h;
    
    public a(final jl0.a a, final long b, final long c, final MetaCommunityCurrency d, final boolean e, final String f, final String g, final MetaCorrelation h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
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
        return sg2.e.a((Object)this.a, (Object)a.a) && this.b == a.b && this.c == a.c && this.d == a.d && this.e == a.e && sg2.e.a((Object)this.f, (Object)a.f) && sg2.e.a((Object)this.g, (Object)a.g) && sg2.e.a((Object)this.h, (Object)a.h);
    }
    
    @Override
    public final int hashCode() {
        final int b = b.b(this.c, b.b(this.b, this.a.hashCode() * 31, 31), 31);
        final MetaCommunityCurrency d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        return this.h.hashCode() + b.c(this.g, b.c(this.f, ((b + hashCode) * 31 + e) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Params(subreddit=");
        r.append(this.a);
        r.append(", membershipStartedAt=");
        r.append(this.b);
        r.append(", membershipEndsAt=");
        r.append(this.c);
        r.append(", membershipCurrency=");
        r.append(this.d);
        r.append(", membershipRenews=");
        r.append(this.e);
        r.append(", memberTitle=");
        r.append(this.f);
        r.append(", membershipTitle=");
        r.append(this.g);
        r.append(", correlation=");
        r.append(this.h);
        r.append(')');
        return r.toString();
    }
}
