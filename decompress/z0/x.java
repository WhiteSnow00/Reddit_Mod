// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import t5.w;
import ng2.e;

public final class x
{
    public final Object a;
    public final Object b;
    
    public x(final Integer a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof x)) {
            return false;
        }
        final x x = (x)o;
        return e.a(this.a, x.a) && e.a(this.b, x.b);
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
        final StringBuilder t = a.t("JoinedKey(left=");
        t.append(this.a);
        t.append(", right=");
        return w.h(t, this.b, ')');
    }
}
