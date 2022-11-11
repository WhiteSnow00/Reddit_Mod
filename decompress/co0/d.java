// 
// Decompiled by Procyon v0.6.0
// 

package co0;

import al0.g7;
import sg2.e;
import android.support.v4.media.a;
import b91.b;

public final class d
{
    public final String a;
    public final b b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    
    public d(final String a, final b b, final String c, final String d, final String e, final String f, final String g, final boolean h) {
        android.support.v4.media.a.t(a, "subredditName", e, "memberSince", f, "memberTitle", g, "membershipTitle");
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
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return sg2.e.a((Object)this.a, (Object)d.a) && sg2.e.a((Object)this.b, (Object)d.b) && sg2.e.a((Object)this.c, (Object)d.c) && sg2.e.a((Object)this.d, (Object)d.d) && sg2.e.a((Object)this.e, (Object)d.e) && sg2.e.a((Object)this.f, (Object)d.f) && sg2.e.a((Object)this.g, (Object)d.g) && this.h == d.h;
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.c, (this.b.hashCode() + this.a.hashCode() * 31) * 31, 31);
        final String d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        final int c2 = b.c(this.g, b.c(this.f, b.c(this.e, (c + hashCode) * 31, 31), 31), 31);
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        return c2 + h;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("MembershipDetailPresentationModel(subredditName=");
        r.append(this.a);
        r.append(", communityIcon=");
        r.append(this.b);
        r.append(", username=");
        r.append(this.c);
        r.append(", userImageUrl=");
        r.append(this.d);
        r.append(", memberSince=");
        r.append(this.e);
        r.append(", memberTitle=");
        r.append(this.f);
        r.append(", membershipTitle=");
        r.append(this.g);
        r.append(", showCancellation=");
        return g7.m(r, this.h, ')');
    }
}
