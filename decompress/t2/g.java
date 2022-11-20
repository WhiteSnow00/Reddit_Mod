// 
// Decompiled by Procyon v0.6.0
// 

package t2;

import mg2.l;
import cg.d;
import java.util.ArrayList;

public final class g
{
    public static final g b;
    public static final g c;
    public static final g d;
    public final int a;
    
    static {
        b = new g(0);
        c = new g(1);
        d = new g(2);
    }
    
    public g(final int a) {
        this.a = a;
    }
    
    public final boolean a(final g g) {
        final int a = this.a;
        return (g.a | a) == a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof g && this.a == ((g)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        if (this.a == 0) {
            return "TextDecoration.None";
        }
        final ArrayList list = new ArrayList();
        if ((this.a & 0x1) != 0x0) {
            list.add("Underline");
        }
        if ((this.a & 0x2) != 0x0) {
            list.add("LineThrough");
        }
        if (list.size() == 1) {
            final StringBuilder t = a.t("TextDecoration.");
            t.append(list.get(0));
            return t.toString();
        }
        final StringBuilder t2 = a.t("TextDecoration[");
        t2.append(cg.d.U1(list, ", ", (l)null, 62));
        t2.append(']');
        return t2.toString();
    }
}
