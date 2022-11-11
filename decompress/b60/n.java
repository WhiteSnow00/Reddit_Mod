// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import sg2.e;
import al0.b;

public final class n
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    
    public n() {
        this(null, null, null, 15);
    }
    
    public n(final String a, final String b, final String c, final long d) {
        al0.b.q(a, "username", b, "subredditName", c, "responseJson");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n)) {
            return false;
        }
        final n n = (n)o;
        return e.a((Object)this.a, (Object)n.a) && e.a((Object)this.b, (Object)n.b) && e.a((Object)this.c, (Object)n.c) && this.d == n.d;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.d) + b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ModeratorsResponseDataModel(username=");
        r.append(this.a);
        r.append(", subredditName=");
        r.append(this.b);
        r.append(", responseJson=");
        r.append(this.c);
        r.append(", lastUpdateTimestamp=");
        return b.i(r, this.d, ')');
    }
}
