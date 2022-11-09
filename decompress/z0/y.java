// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import ah2.f;

public final class y
{
    public final Object a;
    public final Object b;
    
    public y(final Integer a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y)) {
            return false;
        }
        final y y = (y)o;
        return f.a(this.a, y.a) && f.a(this.b, y.b);
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        final boolean b = a instanceof Enum;
        int n = 0;
        int n2;
        if (b) {
            n2 = ((Enum)a).ordinal();
        }
        else if (a != null) {
            n2 = a.hashCode();
        }
        else {
            n2 = 0;
        }
        final Object b2 = this.b;
        if (b2 instanceof Enum) {
            n = ((Enum)b2).ordinal();
        }
        else if (b2 != null) {
            n = b2.hashCode();
        }
        return n + n2 * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("JoinedKey(left=");
        k.append(this.a);
        k.append(", right=");
        return zu.a.b(k, this.b, ')');
    }
}
