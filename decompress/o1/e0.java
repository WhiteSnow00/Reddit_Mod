// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import a4.u1;
import android.graphics.RadialGradient;
import ng.f0;
import n1.f;
import a80.a;
import n1.c;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

public final class e0 extends j0
{
    public final List<r> c;
    public final List<Float> d;
    public final long e;
    public final float f;
    public final int g;
    
    public e0(final ArrayList c, final ArrayList d, final long e, final float f, final int g) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Shader b(final long n) {
        final long e = this.e;
        final long d = n1.c.d;
        final int n2 = 1;
        float c;
        float n3;
        if (e == d) {
            final long i = a80.a.I(n);
            c = n1.c.c(i);
            n3 = n1.c.d(i);
        }
        else {
            float n4;
            if (n1.c.c(e) == Float.POSITIVE_INFINITY) {
                n4 = n1.f.e(n);
            }
            else {
                n4 = n1.c.c(this.e);
            }
            c = n4;
            if (n1.c.d(this.e) == Float.POSITIVE_INFINITY) {
                n3 = n1.f.c(n);
            }
            else {
                n3 = n1.c.d(this.e);
            }
        }
        final List<r> c2 = this.c;
        final List<Float> d2 = this.d;
        final long y0 = yd.a.y0(c, n3);
        float f = this.f;
        int n5;
        if (f == Float.POSITIVE_INFINITY) {
            n5 = n2;
        }
        else {
            n5 = 0;
        }
        if (n5 != 0) {
            f = n1.f.d(n) / 2;
        }
        final int g = this.g;
        ah2.f.f((Object)c2, "colors");
        aj2.c.b1((List)c2, (List)d2);
        final int e2 = aj2.c.E((List)c2);
        return (Shader)new RadialGradient(n1.c.c(y0), n1.c.d(y0), f, aj2.c.n0(e2, (List)c2), aj2.c.o0((List)d2, e2, (List)c2), f0.x2(g));
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e0)) {
            return false;
        }
        final List<r> c = this.c;
        final e0 e0 = (e0)o;
        return ah2.f.a((Object)c, (Object)e0.c) && ah2.f.a((Object)this.d, (Object)e0.d) && n1.c.a(this.e, e0.e) && this.f == e0.f && this.g == e0.g;
    }
    
    public final int hashCode() {
        final int hashCode = this.c.hashCode();
        final List<Float> d = this.d;
        int hashCode2;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final long e = this.e;
        final int e2 = n1.c.e;
        return Integer.hashCode(this.g) + a.a(this.f, b.c(e, (hashCode * 31 + hashCode2) * 31, 31), 31);
    }
    
    public final String toString() {
        final boolean n1 = yd.a.N1(this.e);
        String string = "";
        String string2;
        if (n1) {
            final StringBuilder k = a.k("center=");
            k.append((Object)n1.c.h(this.e));
            k.append(", ");
            string2 = k.toString();
        }
        else {
            string2 = "";
        }
        final float f = this.f;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            final StringBuilder i = a.k("radius=");
            i.append(this.f);
            i.append(", ");
            string = i.toString();
        }
        final StringBuilder j = a.k("RadialGradient(colors=");
        j.append(this.c);
        j.append(", stops=");
        j.append(this.d);
        j.append(", ");
        j.append(string2);
        j.append(string);
        j.append("tileMode=");
        j.append((Object)u1.B1(this.g));
        j.append(')');
        return j.toString();
    }
}
