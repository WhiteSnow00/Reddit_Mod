// 
// Decompiled by Procyon v0.6.0
// 

package bb0;

import p1.h;
import ng2.e;

public final class a
{
    public final int a;
    public final String b;
    
    public a(final int a, final String b) {
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
        return this.a == a.a && e.a((Object)this.b, (Object)a.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CreatorStatTrendData(value=");
        t.append(this.a);
        t.append(", timestamp=");
        return h.c(t, this.b, ')');
    }
}
