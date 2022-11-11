// 
// Decompiled by Procyon v0.6.0
// 

package ea2;

import al0.g7;
import sg2.e;
import java.math.BigInteger;
import x82.h;

public final class q extends n
{
    public final h a;
    public final BigInteger b;
    public final boolean c;
    
    public q(final h a, final BigInteger b, final boolean c) {
        e.f((Object)b, "points");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof q)) {
            return false;
        }
        final q q = (q)o;
        return e.a((Object)this.a, (Object)q.a) && e.a((Object)this.b, (Object)q.b) && this.c == q.c;
    }
    
    public final int hashCode() {
        final int f = d.f(this.b, this.a.hashCode() * 31, 31);
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return f + c;
    }
    
    public final String toString() {
        final StringBuilder r = a.r("SubredditPoint(community=");
        r.append(this.a);
        r.append(", points=");
        r.append(this.b);
        r.append(", pending=");
        return g7.m(r, this.c, ')');
    }
}
