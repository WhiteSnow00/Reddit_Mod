// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import al0.g7;
import sg2.e;

public final class w
{
    public final long a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    
    public w(final long a, final String b, final boolean c, final boolean d, final boolean e) {
        sg2.e.f((Object)b, "linkId");
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
        if (!(o instanceof w)) {
            return false;
        }
        final w w = (w)o;
        return this.a == w.a && sg2.e.a((Object)this.b, (Object)w.b) && this.c == w.c && this.d == w.d && this.e == w.e;
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.b, Long.hashCode(this.a) * 31, 31);
        final int c2 = this.c ? 1 : 0;
        int n = 1;
        int n2 = c2;
        if (c2 != 0) {
            n2 = 1;
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        final int e = this.e ? 1 : 0;
        if (e == 0) {
            n = e;
        }
        return ((c + n2) * 31 + d) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SubredditForkingDataModel(id=");
        r.append(this.a);
        r.append(", linkId=");
        r.append(this.b);
        r.append(", bottomSheetShown=");
        r.append(this.c);
        r.append(", hookModuleDismissed=");
        r.append(this.d);
        r.append(", subredditForked=");
        return g7.m(r, this.e, ')');
    }
}
