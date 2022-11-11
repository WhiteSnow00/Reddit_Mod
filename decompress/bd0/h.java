// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import sg2.e;
import al0.b;

public final class h
{
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final boolean j;
    public final Long k;
    public final Long l;
    
    public h(final String a, final boolean b, final boolean c, final String d, final String e, final String f, final String g, final String h, final int i, final boolean j, final Long k, final Long l) {
        al0.b.q(d, "subredditKindWithId", e, "subredditName", f, "subredditNamePrefixed");
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
        this.k = k;
        this.l = l;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        return sg2.e.a((Object)this.a, (Object)h.a) && this.b == h.b && this.c == h.c && sg2.e.a((Object)this.d, (Object)h.d) && sg2.e.a((Object)this.e, (Object)h.e) && sg2.e.a((Object)this.f, (Object)h.f) && sg2.e.a((Object)this.g, (Object)h.g) && sg2.e.a((Object)this.h, (Object)h.h) && this.i == h.i && this.j == h.j && sg2.e.a((Object)this.k, (Object)h.k) && sg2.e.a((Object)this.l, (Object)h.l);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int b = this.b ? 1 : 0;
        final int n2 = 1;
        int n3 = b;
        if (b != 0) {
            n3 = 1;
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        final int c2 = b.c(this.f, b.c(this.e, b.c(this.d, ((hashCode * 31 + n3) * 31 + c) * 31, 31), 31), 31);
        final String g = this.g;
        int hashCode2;
        if (g == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = g.hashCode();
        }
        final String h = this.h;
        int hashCode3;
        if (h == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = h.hashCode();
        }
        final int c3 = a.c(this.i, ((c2 + hashCode2) * 31 + hashCode3) * 31, 31);
        int j = this.j ? 1 : 0;
        if (j != 0) {
            j = n2;
        }
        final Long k = this.k;
        int hashCode4;
        if (k == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = k.hashCode();
        }
        final Long l = this.l;
        int hashCode5;
        if (l == null) {
            hashCode5 = n;
        }
        else {
            hashCode5 = l.hashCode();
        }
        return ((c3 + j) * 31 + hashCode4) * 31 + hashCode5;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("PowerupAllocation(orderId=");
        r.append(this.a);
        r.append(", isPremium=");
        r.append(this.b);
        r.append(", isActive=");
        r.append(this.c);
        r.append(", subredditKindWithId=");
        r.append(this.d);
        r.append(", subredditName=");
        r.append(this.e);
        r.append(", subredditNamePrefixed=");
        r.append(this.f);
        r.append(", subredditIconUrl=");
        r.append(this.g);
        r.append(", subredditPrimaryColor=");
        r.append(this.h);
        r.append(", powerupsCount=");
        r.append(this.i);
        r.append(", canDeallocate=");
        r.append(this.j);
        r.append(", cooldownEndsAtUtcMs=");
        r.append(this.k);
        r.append(", renewOnUtcMs=");
        return a.l(r, this.l, ')');
    }
}
