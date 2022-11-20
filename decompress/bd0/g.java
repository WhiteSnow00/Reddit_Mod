// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import aq2.a;
import ng2.e;

public final class g
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
    
    public g(final String a, final boolean b, final boolean c, final String d, final String e, final String f, final String g, final String h, final int i, final boolean j, final Long k, final Long l) {
        b.w(d, "subredditKindWithId", e, "subredditName", f, "subredditNamePrefixed");
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
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        return ng2.e.a((Object)this.a, (Object)g.a) && this.b == g.b && this.c == g.c && ng2.e.a((Object)this.d, (Object)g.d) && ng2.e.a((Object)this.e, (Object)g.e) && ng2.e.a((Object)this.f, (Object)g.f) && ng2.e.a((Object)this.g, (Object)g.g) && ng2.e.a((Object)this.h, (Object)g.h) && this.i == g.i && this.j == g.j && ng2.e.a((Object)this.k, (Object)g.k) && ng2.e.a((Object)this.l, (Object)g.l);
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
        final int e = aq2.a.e(this.f, aq2.a.e(this.e, aq2.a.e(this.d, ((hashCode * 31 + n3) * 31 + c) * 31, 31), 31), 31);
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
        final int c2 = aq2.a.c(this.i, ((e + hashCode2) * 31 + hashCode3) * 31, 31);
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
        return ((c2 + j) * 31 + hashCode4) * 31 + hashCode5;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PowerupAllocation(orderId=");
        t.append(this.a);
        t.append(", isPremium=");
        t.append(this.b);
        t.append(", isActive=");
        t.append(this.c);
        t.append(", subredditKindWithId=");
        t.append(this.d);
        t.append(", subredditName=");
        t.append(this.e);
        t.append(", subredditNamePrefixed=");
        t.append(this.f);
        t.append(", subredditIconUrl=");
        t.append(this.g);
        t.append(", subredditPrimaryColor=");
        t.append(this.h);
        t.append(", powerupsCount=");
        t.append(this.i);
        t.append(", canDeallocate=");
        t.append(this.j);
        t.append(", cooldownEndsAtUtcMs=");
        t.append(this.k);
        t.append(", renewOnUtcMs=");
        return m5.a.i(t, this.l, ')');
    }
}
