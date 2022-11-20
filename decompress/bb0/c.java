// 
// Decompiled by Procyon v0.6.0
// 

package bb0;

import p1.h;
import ng2.e;

public final class c
{
    public final boolean a;
    public final String b;
    
    public c(final boolean a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return this.a == c.a && e.a((Object)this.b, (Object)c.b);
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return this.b.hashCode() + a * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CreatorStatsAvailability(isAvailable=");
        t.append(this.a);
        t.append(", availableAt=");
        return h.c(t, this.b, ')');
    }
}
