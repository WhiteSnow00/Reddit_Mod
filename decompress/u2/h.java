// 
// Decompiled by Procyon v0.6.0
// 

package u2;

import androidx.appcompat.widget.s0;

public final class h
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public h(final int a, final int b, final int c, final int d) {
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
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        return this.a == h.a && this.b == h.b && this.c == h.c && this.d == h.d;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.d) + s0.e(this.c, s0.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("IntRect.fromLTRB(");
        k.append(this.a);
        k.append(", ");
        k.append(this.b);
        k.append(", ");
        k.append(this.c);
        k.append(", ");
        return d.k(k, this.d, ')');
    }
}
