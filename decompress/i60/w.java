// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;

public final class w
{
    public final long a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    
    public w(final long a, final String b, final boolean c, final boolean d, final boolean e) {
        f.f((Object)b, "linkId");
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
        return this.a == w.a && f.a((Object)this.b, (Object)w.b) && this.c == w.c && this.d == w.d && this.e == w.e;
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.b, Long.hashCode(this.a) * 31, 31);
        final int c = this.c ? 1 : 0;
        int n = 1;
        int n2 = c;
        if (c != 0) {
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
        return ((f + n2) * 31 + d) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SubredditForkingDataModel(id=");
        k.append(this.a);
        k.append(", linkId=");
        k.append(this.b);
        k.append(", bottomSheetShown=");
        k.append(this.c);
        k.append(", hookModuleDismissed=");
        k.append(this.d);
        k.append(", subredditForked=");
        return s0.o(k, this.e, ')');
    }
}
