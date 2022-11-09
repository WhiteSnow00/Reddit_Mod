// 
// Decompiled by Procyon v0.6.0
// 

package p1;

import androidx.appcompat.widget.s0;
import ah2.f;

public final class h
{
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    
    public h(final double a, final double b, final double c, final double d, final double e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = 0.0;
        this.g = 0.0;
        if (Double.isNaN(b) || Double.isNaN(c) || Double.isNaN(d) || Double.isNaN(e) || Double.isNaN(0.0) || Double.isNaN(0.0) || Double.isNaN(a)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (e < 0.0 || e > 1.0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Parameter d must be in the range [0..1], was ");
            sb.append(e);
            throw new IllegalArgumentException(sb.toString());
        }
        final int n = 1;
        if (e == 0.0 && (b == 0.0 || a == 0.0)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (e >= 1.0 && d == 0.0) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        final double n2 = dcmpg(b, 0.0);
        if (n2 == 0 || a == 0.0) {
            int n3;
            if (d == 0.0) {
                n3 = n;
            }
            else {
                n3 = 0;
            }
            if (n3 != 0) {
                throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
            }
        }
        if (d < 0.0) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (n2 >= 0 && a >= 0.0) {
            return;
        }
        throw new IllegalArgumentException("The transfer function must be positive or increasing");
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
        return ah2.f.a((Object)this.a, (Object)h.a) && ah2.f.a((Object)this.b, (Object)h.b) && ah2.f.a((Object)this.c, (Object)h.c) && ah2.f.a((Object)this.d, (Object)h.d) && ah2.f.a((Object)this.e, (Object)h.e) && ah2.f.a((Object)this.f, (Object)h.f) && ah2.f.a((Object)this.g, (Object)h.g);
    }
    
    @Override
    public final int hashCode() {
        return Double.hashCode(this.g) + b.a(this.f, b.a(this.e, b.a(this.d, b.a(this.c, b.a(this.b, Double.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("TransferParameters(gamma=");
        k.append(this.a);
        k.append(", a=");
        k.append(this.b);
        k.append(", b=");
        k.append(this.c);
        k.append(", c=");
        k.append(this.d);
        k.append(", d=");
        k.append(this.e);
        k.append(", e=");
        k.append(this.f);
        k.append(", f=");
        return s0.l(k, this.g, ')');
    }
}
