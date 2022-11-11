// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import sg2.e;
import bg.d;
import wd.a;
import n1.f;
import n1.c;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

public final class y extends j0
{
    public final List<r> c;
    public final List<Float> d;
    public final long e;
    public final long f;
    public final int g;
    
    public y(final List c, final ArrayList d, final long e, final long f, final int g) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Shader b(long f) {
        final float c = n1.c.c(this.e);
        final int n = 1;
        float n2;
        if (c == Float.POSITIVE_INFINITY) {
            n2 = f.f(f);
        }
        else {
            n2 = n1.c.c(this.e);
        }
        float n3;
        if (n1.c.d(this.e) == Float.POSITIVE_INFINITY) {
            n3 = f.d(f);
        }
        else {
            n3 = n1.c.d(this.e);
        }
        float n4;
        if (n1.c.c(this.f) == Float.POSITIVE_INFINITY) {
            n4 = f.f(f);
        }
        else {
            n4 = n1.c.c(this.f);
        }
        int n5;
        if (n1.c.d(this.f) == Float.POSITIVE_INFINITY) {
            n5 = n;
        }
        else {
            n5 = 0;
        }
        float n6;
        if (n5 != 0) {
            n6 = f.d(f);
        }
        else {
            n6 = n1.c.d(this.f);
        }
        final List<r> c2 = this.c;
        final List<Float> d = this.d;
        f = wd.a.f(n2, n3);
        return (Shader)bg.d.m(this.g, f, wd.a.f(n4, n6), (List)c2, (List)d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y)) {
            return false;
        }
        final List<r> c = this.c;
        final y y = (y)o;
        return sg2.e.a((Object)c, (Object)y.c) && sg2.e.a((Object)this.d, (Object)y.d) && n1.c.a(this.e, y.e) && n1.c.a(this.f, y.f) && this.g == y.g;
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
        return Integer.hashCode(this.g) + b.b(this.f, b.b(e, (hashCode * 31 + hashCode2) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final boolean r = wd.a.R(this.e);
        String string = "";
        String string2;
        if (r) {
            final StringBuilder r2 = a.r("start=");
            r2.append((Object)n1.c.h(this.e));
            r2.append(", ");
            string2 = r2.toString();
        }
        else {
            string2 = "";
        }
        if (wd.a.R(this.f)) {
            final StringBuilder r3 = a.r("end=");
            r3.append((Object)n1.c.h(this.f));
            r3.append(", ");
            string = r3.toString();
        }
        final StringBuilder r4 = a.r("LinearGradient(colors=");
        r4.append(this.c);
        r4.append(", stops=");
        r4.append(this.d);
        r4.append(", ");
        r4.append(string2);
        r4.append(string);
        r4.append("tileMode=");
        r4.append((Object)np.a.f0(this.g));
        r4.append(')');
        return r4.toString();
    }
}
