// 
// Decompiled by Procyon v0.6.0
// 

package ea;

import u2.d;

public final class b
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    
    public b(final float a, final float b, final float c, final float d, final float e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return u2.d.a(this.a, b.a) && u2.d.a(this.b, b.b) && u2.d.a(this.c, b.c) && u2.d.a(this.d, b.d) && u2.d.a(this.e, b.e);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.e) + d.d(this.d, d.d(this.c, d.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SwipeRefreshIndicatorSizes(size=");
        al0.a.v(this.a, r, ", arcRadius=");
        al0.a.v(this.b, r, ", strokeWidth=");
        al0.a.v(this.c, r, ", arrowWidth=");
        al0.a.v(this.d, r, ", arrowHeight=");
        r.append((Object)u2.d.c(this.e));
        r.append(')');
        return r.toString();
    }
}
