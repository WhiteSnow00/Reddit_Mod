// 
// Decompiled by Procyon v0.6.0
// 

package u0;

import o1.z$c;
import o1.z$b;
import n1.c;
import o1.z;
import androidx.compose.ui.unit.LayoutDirection;

public final class e extends a
{
    public e(final b b, final b b2, final b b3, final b b4) {
        super(b, b2, b3, b4);
    }
    
    public final e a(final d d, final d d2, final d d3, final d d4) {
        return new e((b)d, (b)d2, (b)d3, (b)d4);
    }
    
    public final z b(long j, float n, float n2, float n3, final float n4, final LayoutDirection layoutDirection) {
        ng2.e.f((Object)layoutDirection, "layoutDirection");
        Object o;
        if (n + n2 + n3 + n4 == 0.0f) {
            o = new z$b(cg.d.P(c.b, j));
        }
        else {
            final n1.d p6 = cg.d.P(c.b, j);
            final LayoutDirection ltr = LayoutDirection.Ltr;
            float n5;
            if (layoutDirection == ltr) {
                n5 = n;
            }
            else {
                n5 = n2;
            }
            final long i = ah0.b.j(n5, n5);
            if (layoutDirection != ltr) {
                n2 = n;
            }
            j = ah0.b.j(n2, n2);
            if (layoutDirection == ltr) {
                n = n3;
            }
            else {
                n = n4;
            }
            final long k = ah0.b.j(n, n);
            if (layoutDirection == ltr) {
                n3 = n4;
            }
            o = new z$c(xd.a.l(p6, i, j, k, ah0.b.j(n3, n3)));
        }
        return (z)o;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final b f = super.f;
        final e e = (e)o;
        return ng2.e.a((Object)f, (Object)e.f) && ng2.e.a((Object)super.g, (Object)e.g) && ng2.e.a((Object)super.h, (Object)e.h) && ng2.e.a((Object)super.i, (Object)e.i);
    }
    
    public final int hashCode() {
        return super.i.hashCode() + (super.h.hashCode() + (super.g.hashCode() + super.f.hashCode() * 31) * 31) * 31;
    }
    
    public final String toString() {
        final StringBuilder t = a.t("RoundedCornerShape(topStart = ");
        t.append(super.f);
        t.append(", topEnd = ");
        t.append(super.g);
        t.append(", bottomEnd = ");
        t.append(super.h);
        t.append(", bottomStart = ");
        t.append(super.i);
        t.append(')');
        return t.toString();
    }
}
