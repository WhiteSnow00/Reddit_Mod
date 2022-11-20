// 
// Decompiled by Procyon v0.6.0
// 

package ad0;

import p1.h;
import ng2.e;

public final class f
{
    public final String a;
    public final String b;
    public final a c;
    public final String d;
    
    public f(final a c, final String a, final String b, final String d) {
        b.w(a, "id", b, "name", d, "prefixedName");
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
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return e.a((Object)this.a, (Object)f.a) && e.a((Object)this.b, (Object)f.b) && e.a((Object)this.c, (Object)f.c) && e.a((Object)this.d, (Object)f.d);
    }
    
    @Override
    public final int hashCode() {
        final int e = aq2.a.e(this.b, this.a.hashCode() * 31, 31);
        final a c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return this.d.hashCode() + (e + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PostSetPostAuthor(id=");
        t.append(this.a);
        t.append(", name=");
        t.append(this.b);
        t.append(", icon=");
        t.append(this.c);
        t.append(", prefixedName=");
        return h.c(t, this.d, ')');
    }
}
