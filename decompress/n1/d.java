// 
// Decompiled by Procyon v0.6.0
// 

package n1;

import ah2.f;
import yd.a;

public final class d
{
    public static final d e;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    
    static {
        e = new d(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    public d(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static d a(final d d, float a, float b, float c, final int n) {
        if ((n & 0x1) != 0x0) {
            a = d.a;
        }
        if ((n & 0x2) != 0x0) {
            b = d.b;
        }
        if ((n & 0x4) != 0x0) {
            c = d.c;
        }
        float d2;
        if ((n & 0x8) != 0x0) {
            d2 = d.d;
        }
        else {
            d2 = 0.0f;
        }
        return new d(a, b, c, d2);
    }
    
    public final long b() {
        final float a = this.a;
        final float n = (this.c - a) / 2.0f;
        final float b = this.b;
        return yd.a.y0(n + a, (this.d - b) / 2.0f + b);
    }
    
    public final boolean c(final d d) {
        f.f((Object)d, "other");
        if (this.c > d.a) {
            if (d.c > this.a) {
                if (this.d > d.b) {
                    if (d.d > this.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final d d(final float n, final float n2) {
        return new d(this.a + n, this.b + n2, this.c + n, this.d + n2);
    }
    
    public final d e(final long n) {
        return new d(n1.c.c(n) + this.a, n1.c.d(n) + this.b, n1.c.c(n) + this.c, n1.c.d(n) + this.d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return f.a((Object)this.a, (Object)d.a) && f.a((Object)this.b, (Object)d.b) && f.a((Object)this.c, (Object)d.c) && f.a((Object)this.d, (Object)d.d);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.d) + a.a(this.c, a.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Rect.fromLTRB(");
        k.append(a80.a.M0(this.a));
        k.append(", ");
        k.append(a80.a.M0(this.b));
        k.append(", ");
        k.append(a80.a.M0(this.c));
        k.append(", ");
        k.append(a80.a.M0(this.d));
        k.append(')');
        return k.toString();
    }
}
