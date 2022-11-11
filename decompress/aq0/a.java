// 
// Decompiled by Procyon v0.6.0
// 

package aq0;

import al0.g7;
import sg2.e;
import al0.b;

public final class a
{
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    
    public a(final String a, final String b, final String e, final String f, final String g, final boolean c, final boolean d, final boolean h, final boolean i) {
        al0.b.q(a, "title", b, "description", f, "iconImg");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
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
        return sg2.e.a((Object)this.a, (Object)a.a) && sg2.e.a((Object)this.b, (Object)a.b) && this.c == a.c && this.d == a.d && sg2.e.a((Object)this.e, (Object)a.e) && sg2.e.a((Object)this.f, (Object)a.f) && sg2.e.a((Object)this.g, (Object)a.g) && this.h == a.h && this.i == a.i;
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.b, this.a.hashCode() * 31, 31);
        final int c2 = this.c ? 1 : 0;
        final int n = 1;
        int n2 = c2;
        if (c2 != 0) {
            n2 = 1;
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        final String e = this.e;
        final int n3 = 0;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        final int c3 = b.c(this.f, (((c + n2) * 31 + d) * 31 + hashCode) * 31, 31);
        final String g = this.g;
        int hashCode2;
        if (g == null) {
            hashCode2 = n3;
        }
        else {
            hashCode2 = g.hashCode();
        }
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        int i = this.i ? 1 : 0;
        if (i != 0) {
            i = n;
        }
        return ((c3 + hashCode2) * 31 + h) * 31 + i;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("AccountPresentationModel(title=");
        r.append(this.a);
        r.append(", description=");
        r.append(this.b);
        r.append(", showMyActiveCommunities=");
        r.append(this.c);
        r.append(", showInDefaultSubreddits=");
        r.append(this.d);
        r.append(", bannerImg=");
        r.append(this.e);
        r.append(", iconImg=");
        r.append(this.f);
        r.append(", snoovatarImg=");
        r.append(this.g);
        r.append(", isDefaultIcon=");
        r.append(this.h);
        r.append(", isDefaultBanner=");
        return g7.m(r, this.i, ')');
    }
}
