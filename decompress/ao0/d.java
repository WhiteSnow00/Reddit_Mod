// 
// Decompiled by Procyon v0.6.0
// 

package ao0;

import al0.g7;
import sg2.e;
import com.reddit.domain.meta.model.Badge;
import java.util.List;

public final class d
{
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final List<Badge> e;
    public final boolean f;
    
    public d(final String a, final String c, final String d, final List e, final boolean b, final boolean f) {
        sg2.e.f((Object)a, "membershipTitleText");
        sg2.e.f((Object)c, "usernameText");
        sg2.e.f((Object)d, "aboutSpecialMembershipText");
        sg2.e.f((Object)e, "demoBadges");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return sg2.e.a((Object)this.a, (Object)d.a) && this.b == d.b && sg2.e.a((Object)this.c, (Object)d.c) && sg2.e.a((Object)this.d, (Object)d.d) && sg2.e.a((Object)this.e, (Object)d.e) && this.f == d.f;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b ? 1 : 0;
        final int n = 1;
        int n2 = b;
        if (b != 0) {
            n2 = 1;
        }
        final int c = aw.b.c((List)this.e, b.c(this.d, b.c(this.c, (hashCode * 31 + n2) * 31, 31), 31), 31);
        int f = this.f ? 1 : 0;
        if (f != 0) {
            f = n;
        }
        return c + f;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SpecialMembershipAdPresentationModel(membershipTitleText=");
        r.append(this.a);
        r.append(", editBadgesButtonVisible=");
        r.append(this.b);
        r.append(", usernameText=");
        r.append(this.c);
        r.append(", aboutSpecialMembershipText=");
        r.append(this.d);
        r.append(", demoBadges=");
        r.append(this.e);
        r.append(", gifsEnabled=");
        return g7.m(r, this.f, ')');
    }
}
