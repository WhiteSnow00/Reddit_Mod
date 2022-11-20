// 
// Decompiled by Procyon v0.6.0
// 

package p1;

import ng2.e;

public final class i
{
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    
    public i(final double a, final double b, final double c, final double d, final double e) {
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
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return ng2.e.a((Object)this.a, (Object)i.a) && ng2.e.a((Object)this.b, (Object)i.b) && ng2.e.a((Object)this.c, (Object)i.c) && ng2.e.a((Object)this.d, (Object)i.d) && ng2.e.a((Object)this.e, (Object)i.e) && ng2.e.a((Object)this.f, (Object)i.f) && ng2.e.a((Object)this.g, (Object)i.g);
    }
    
    @Override
    public final int hashCode() {
        return Double.hashCode(this.g) + h.a(this.f, h.a(this.e, h.a(this.d, h.a(this.c, h.a(this.b, Double.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("TransferParameters(gamma=");
        t.append(this.a);
        t.append(", a=");
        t.append(this.b);
        t.append(", b=");
        t.append(this.c);
        t.append(", c=");
        t.append(this.d);
        t.append(", d=");
        t.append(this.e);
        t.append(", e=");
        t.append(this.f);
        t.append(", f=");
        return a.p(t, this.g, ')');
    }
}
