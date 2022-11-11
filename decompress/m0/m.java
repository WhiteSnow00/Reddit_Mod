// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import al0.g7;
import u2.d;
import u2.f;

public final class m
{
    public static final m g;
    public static final m h;
    public final boolean a;
    public final long b;
    public final float c;
    public final float d;
    public final boolean e;
    public final boolean f;
    
    static {
        final long c = f.c;
        g = new m(false, c, Float.NaN, Float.NaN, true, false);
        h = new m(true, c, Float.NaN, Float.NaN, true, false);
    }
    
    public m(final boolean a, final long b, final float c, final float d, final boolean e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final boolean a = this.a;
        final m m = (m)o;
        return a == m.a && this.b == m.b && u2.d.a(this.c, m.c) && u2.d.a(this.d, m.d) && this.e == m.e && this.f == m.f;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = Boolean.hashCode(this.a);
        final long b = this.b;
        final int d = u2.f.d;
        return Boolean.hashCode(this.f) + (Boolean.hashCode(this.e) + d.d(this.d, d.d(this.c, b.b(b, hashCode * 31, 31), 31), 31)) * 31;
    }
    
    @Override
    public final String toString() {
        String m;
        if (this.a) {
            m = "MagnifierStyle.TextDefault";
        }
        else {
            final StringBuilder r = a.r("MagnifierStyle(size=");
            r.append((Object)u2.f.c(this.b));
            r.append(", cornerRadius=");
            al0.a.v(this.c, r, ", elevation=");
            al0.a.v(this.d, r, ", clippingEnabled=");
            r.append(this.e);
            r.append(", fishEyeEnabled=");
            m = g7.m(r, this.f, ')');
        }
        return m;
    }
}
