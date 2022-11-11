// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import u2.d;
import sg2.e;
import androidx.compose.ui.unit.LayoutDirection;

public final class a0 implements z
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    
    public a0(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final float a() {
        return this.d;
    }
    
    public final float b(final LayoutDirection layoutDirection) {
        e.f((Object)layoutDirection, "layoutDirection");
        float n;
        if (layoutDirection == LayoutDirection.Ltr) {
            n = this.a;
        }
        else {
            n = this.c;
        }
        return n;
    }
    
    public final float c(final LayoutDirection layoutDirection) {
        e.f((Object)layoutDirection, "layoutDirection");
        float n;
        if (layoutDirection == LayoutDirection.Ltr) {
            n = this.c;
        }
        else {
            n = this.a;
        }
        return n;
    }
    
    public final float d() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof a0;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final float a = this.a;
        final a0 a2 = (a0)o;
        boolean b3 = b2;
        if (u2.d.a(a, a2.a)) {
            b3 = b2;
            if (u2.d.a(this.b, a2.b)) {
                b3 = b2;
                if (u2.d.a(this.c, a2.c)) {
                    b3 = b2;
                    if (u2.d.a(this.d, a2.d)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.d) + d.d(this.c, d.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("PaddingValues(start=");
        al0.a.v(this.a, r, ", top=");
        al0.a.v(this.b, r, ", end=");
        al0.a.v(this.c, r, ", bottom=");
        r.append((Object)u2.d.c(this.d));
        r.append(')');
        return r.toString();
    }
}
