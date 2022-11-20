// 
// Decompiled by Procyon v0.6.0
// 

package ad0;

import ph0.a;
import java.util.List;

public final class b
{
    public final String a;
    public final List<e> b;
    public final e c;
    public final int d;
    
    public b(final String a, final List<e> b, final e c, final int d) {
        ng2.e.f((Object)a, "id");
        ng2.e.f((Object)b, "posts");
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
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return ng2.e.a((Object)this.a, (Object)b.a) && ng2.e.a((Object)this.b, (Object)b.b) && ng2.e.a((Object)this.c, (Object)b.c) && this.d == b.d;
    }
    
    @Override
    public final int hashCode() {
        final int b = ph0.a.b((List)this.b, this.a.hashCode() * 31, 31);
        final e c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return Integer.hashCode(this.d) + (b + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PostSet(id=");
        t.append(this.a);
        t.append(", posts=");
        t.append(this.b);
        t.append(", defaultPost=");
        t.append(this.c);
        t.append(", maxAllowedPosts=");
        return d.j(t, this.d, ')');
    }
}
