// 
// Decompiled by Procyon v0.6.0
// 

package p0;

public final class r
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public r(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof r)) {
            return false;
        }
        final int a = this.a;
        final r r = (r)o;
        if (a != r.a || this.b != r.b || this.c != r.c || this.d != r.d) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("InsetsValues(left=");
        k.append(this.a);
        k.append(", top=");
        k.append(this.b);
        k.append(", right=");
        k.append(this.c);
        k.append(", bottom=");
        return d.k(k, this.d, ')');
    }
}
