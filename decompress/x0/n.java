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
        final e c = f.c(4);
        final e c2 = f.c(4);
        final e c3 = f.c(0);
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
        return ah2.f.a((Object)a, (Object)n.a) && ah2.f.a((Object)this.b, (Object)n.b) && ah2.f.a((Object)this.c, (Object)n.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Shapes(small=");
        k.append(this.a);
        k.append(", medium=");
        k.append(this.b);
        k.append(", large=");
        k.append(this.c);
        k.append(')');
        return k.toString();
    }
}
