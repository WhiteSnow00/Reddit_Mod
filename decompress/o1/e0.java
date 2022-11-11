// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import android.graphics.RadialGradient;
import sg2.e;
import wd.a;
import n1.f;
import bg.d;
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
        float c2;
        float n3;
        if (e == d) {
            final long c0 = bg.d.c0(n);
            c2 = n1.c.c(c0);
            n3 = n1.c.d(c0);
        }
        else {
            float n4;
            if (n1.c.c(e) == Float.POSITIVE_INFINITY) {
                n4 = n1.f.f(n);
            }
            else {
                n4 = n1.c.c(this.e);
            }
            c2 = n4;
            if (n1.c.d(this.e) == Float.POSITIVE_INFINITY) {
                n3 = n1.f.d(n);
            }
            else {
                n3 = n1.c.d(this.e);
            }
        }
        final List<r> c3 = this.c;
        final List<Float> d2 = this.d;
        final long f = wd.a.f(c2, n3);
        float f2 = this.f;
        int n5;
        if (f2 == Float.POSITIVE_INFINITY) {
            n5 = n2;
        }
        else {
            n5 = 0;
        }
        if (n5 != 0) {
            f2 = n1.f.e(n) / 2;
        }
        final int g = this.g;
        sg2.e.f((Object)c3, "colors");
        vl.a.J0((List)c3, (List)d2);
        final int c4 = vl.a.C((List)c3);
        return (Shader)new RadialGradient(n1.c.c(f), n1.c.d(f), f2, vl.a.f0(c4, (List)c3), vl.a.g0((List)d2, c4, (List)c3), wd.a.z0(g));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e0)) {
            return false;
        }
        final List<r> c = this.c;
        final e0 e0 = (e0)o;
        return sg2.e.a((Object)c, (Object)e0.c) && sg2.e.a((Object)this.d, (Object)e0.d) && n1.c.a(this.e, e0.e) && this.f == e0.f && this.g == e0.g;
    }
    
    @Override
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
        return Integer.hashCode(this.g) + d.d(this.f, b.b(e, (hashCode * 31 + hashCode2) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final boolean w = wd.a.W(this.e);
        String string = "";
        String string2;
        if (w) {
            final StringBuilder r = a.r("center=");
            r.append((Object)n1.c.h(this.e));
            r.append(", ");
            string2 = r.toString();
        }
        else {
            string2 = "";
        }
        final float f = this.f;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            final StringBuilder r2 = a.r("radius=");
            r2.append(this.f);
            r2.append(", ");
            string = r2.toString();
        }
        final StringBuilder r3 = a.r("RadialGradient(colors=");
        r3.append(this.c);
        r3.append(", stops=");
        r3.append(this.d);
        r3.append(", ");
        r3.append(string2);
        r3.append(string);
        r3.append("tileMode=");
        r3.append((Object)np.a.f0(this.g));
        r3.append(')');
        return r3.toString();
    }
}
