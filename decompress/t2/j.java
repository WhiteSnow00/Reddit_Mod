// 
// Decompiled by Procyon v0.6.0
// 

package t2;

import u2.k;
import mg.d0;

public final class j
{
    public static final j c;
    public final long a;
    public final long b;
    
    static {
        c = new j(d0.Z(0), d0.Z(0));
    }
    
    public j(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final long a = this.a;
        final j j = (j)o;
        return u2.j.a(a, j.a) && u2.j.a(this.b, j.b);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final k[] b = u2.j.b;
        return Long.hashCode(this.b) + Long.hashCode(a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("TextIndent(firstLine=");
        t.append((Object)u2.j.d(this.a));
        t.append(", restLine=");
        t.append((Object)u2.j.d(this.b));
        t.append(')');
        return t.toString();
    }
}
