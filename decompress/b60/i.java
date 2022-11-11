// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import sg2.e;

public final class i
{
    public final Long a;
    public final long b;
    public final long c;
    
    public i(final long b, final long c) {
        this.a = null;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return e.a((Object)this.a, (Object)i.a) && this.b == i.b && this.c == i.c;
    }
    
    @Override
    public final int hashCode() {
        final Long a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return Long.hashCode(this.c) + b.b(this.b, hashCode * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("KarmaStatisticsDataModel(id=");
        r.append(this.a);
        r.append(", timestamp=");
        r.append(this.b);
        r.append(", karma=");
        return b.i(r, this.c, ')');
    }
}
