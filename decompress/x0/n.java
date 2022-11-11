// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import u0.e;
import u0.f;
import u0.a;

public final class n
{
    public final a a;
    public final a b;
    public final a c;
    
    public n() {
        this(0);
    }
    
    public n(final int n) {
        final e c = f.c((float)4);
        final e c2 = f.c((float)4);
        final e c3 = f.c((float)0);
        this.a = (a)c;
        this.b = (a)c2;
        this.c = (a)c3;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n)) {
            return false;
        }
        final a a = this.a;
        final n n = (n)o;
        return sg2.e.a((Object)a, (Object)n.a) && sg2.e.a((Object)this.b, (Object)n.b) && sg2.e.a((Object)this.c, (Object)n.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Shapes(small=");
        r.append(this.a);
        r.append(", medium=");
        r.append(this.b);
        r.append(", large=");
        r.append(this.c);
        r.append(')');
        return r.toString();
    }
}
