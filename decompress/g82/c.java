// 
// Decompiled by Procyon v0.6.0
// 

package g82;

import aq2.a;
import ng2.e;
import p1.h;

public final class c
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    
    public c(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j) {
        p1.h.h(a, "id", b, "subredditName", f, "pointsName", j, "provider");
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
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return ng2.e.a((Object)this.a, (Object)c.a) && ng2.e.a((Object)this.b, (Object)c.b) && ng2.e.a((Object)this.c, (Object)c.c) && ng2.e.a((Object)this.d, (Object)c.d) && ng2.e.a((Object)this.e, (Object)c.e) && ng2.e.a((Object)this.f, (Object)c.f) && ng2.e.a((Object)this.g, (Object)c.g) && ng2.e.a((Object)this.h, (Object)c.h) && ng2.e.a((Object)this.i, (Object)c.i) && ng2.e.a((Object)this.j, (Object)c.j);
    }
    
    @Override
    public final int hashCode() {
        final int e = aq2.a.e(this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        final int n = 0;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final String d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final String e2 = this.e;
        int hashCode3;
        if (e2 == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = e2.hashCode();
        }
        final int e3 = aq2.a.e(this.f, (((e + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31, 31);
        final String g = this.g;
        int hashCode4;
        if (g == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = g.hashCode();
        }
        final String h = this.h;
        int hashCode5;
        if (h == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = h.hashCode();
        }
        final String i = this.i;
        int hashCode6;
        if (i == null) {
            hashCode6 = n;
        }
        else {
            hashCode6 = i.hashCode();
        }
        return this.j.hashCode() + (((e3 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CommunityDataModel(id=");
        t.append(this.a);
        t.append(", subredditName=");
        t.append(this.b);
        t.append(", subredditTitle=");
        t.append(this.c);
        t.append(", subredditIconUrl=");
        t.append(this.d);
        t.append(", subredditBannerUrl=");
        t.append(this.e);
        t.append(", pointsName=");
        t.append(this.f);
        t.append(", primaryColor=");
        t.append(this.g);
        t.append(", filledPointsUrl=");
        t.append(this.h);
        t.append(", grayPointsUrl=");
        t.append(this.i);
        t.append(", provider=");
        return p1.h.c(t, this.j, ')');
    }
}
