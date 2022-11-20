// 
// Decompiled by Procyon v0.6.0
// 

package va2;

import p1.h;
import ng2.e;
import r82.o;

public final class a
{
    public final o a;
    public final String b;
    
    public a(final o a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b);
    }
    
    @Override
    public final int hashCode() {
        final o a = this.a;
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
        final StringBuilder t = a.t("Params(deepLink=");
        t.append(this.a);
        t.append(", correlation=");
        return h.c(t, this.b, ')');
    }
}
