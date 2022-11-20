// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import p1.h;
import aq2.a;
import ng2.e;

public final class j
{
    public final String a;
    public final String b;
    public final String c;
    
    public j(final String a, final String b, final String c) {
        e.f((Object)a, "prefixedSubredditName");
        e.f((Object)b, "linkId");
        this.a = a;
        this.b = b;
        this.c = c;
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
        return e.a((Object)this.a, (Object)j.a) && e.a((Object)this.b, (Object)j.b) && e.a((Object)this.c, (Object)j.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + aq2.a.e(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PostDuplicatesKey(prefixedSubredditName=");
        t.append(this.a);
        t.append(", linkId=");
        t.append(this.b);
        t.append(", linkLastPathSegment=");
        return h.c(t, this.c, ')');
    }
}
