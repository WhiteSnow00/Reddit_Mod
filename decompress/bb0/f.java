// 
// Decompiled by Procyon v0.6.0
// 

package bb0;

import ng2.e;

public final class f
{
    public final int a;
    public final c b;
    
    public f(final int a, final c b) {
        e.f((Object)b, "availability");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return this.a == f.a && e.a((Object)this.b, (Object)f.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CreatorStatsTotals(total=");
        t.append(this.a);
        t.append(", availability=");
        t.append(this.b);
        t.append(')');
        return t.toString();
    }
}
