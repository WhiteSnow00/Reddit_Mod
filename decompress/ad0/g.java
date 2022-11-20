// 
// Decompiled by Procyon v0.6.0
// 

package ad0;

import p1.h;
import ng2.e;

public final class g
{
    public final String a;
    public final String b;
    
    public g() {
        this(null, null);
    }
    
    public g(final String a, final String b) {
        this.a = a;
        this.b = b;
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
        return e.a((Object)this.a, (Object)g.a) && e.a((Object)this.b, (Object)g.b);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PostSetPostContent(html=");
        t.append(this.a);
        t.append(", markdown=");
        return h.c(t, this.b, ')');
    }
}
