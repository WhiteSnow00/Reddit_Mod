// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import p1.h;
import ng2.e;
import od0.d;

public final class k
{
    public final String a;
    public final d b;
    public final String c;
    
    public k(final String a, final d b, final String c) {
        e.f((Object)a, "subredditName");
        e.f((Object)b, "requestType");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k)) {
            return false;
        }
        final k k = (k)o;
        return e.a((Object)this.a, (Object)k.a) && e.a((Object)this.b, (Object)k.b) && e.a((Object)this.c, (Object)k.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final String c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PredictionsTournamentPostsKey(subredditName=");
        t.append(this.a);
        t.append(", requestType=");
        t.append(this.b);
        t.append(", correlationId=");
        return h.c(t, this.c, ')');
    }
}
