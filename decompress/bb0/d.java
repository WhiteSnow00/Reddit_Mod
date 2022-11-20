// 
// Decompiled by Procyon v0.6.0
// 

package bb0;

import p1.h;
import aq2.a;
import ng2.e;

public final class d
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    
    public d(final String a, final String b, final String c, final String d, final String e) {
        b.w(a, "id", d, "communityId", e, "communityName");
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
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return ng2.e.a((Object)this.a, (Object)d.a) && ng2.e.a((Object)this.b, (Object)d.b) && ng2.e.a((Object)this.c, (Object)d.c) && ng2.e.a((Object)this.d, (Object)d.d) && ng2.e.a((Object)this.e, (Object)d.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + aq2.a.e(this.d, aq2.a.e(this.c, aq2.a.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CreatorStatsPost(id=");
        t.append(this.a);
        t.append(", title=");
        t.append(this.b);
        t.append(", thumbnailUrl=");
        t.append(this.c);
        t.append(", communityId=");
        t.append(this.d);
        t.append(", communityName=");
        return h.c(t, this.e, ')');
    }
}
