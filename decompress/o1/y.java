// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import a4.u1;
import yd.a;
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
    public final Shader b(long y0) {
        final float c = n1.c.c(this.e);
        final int n = 1;
        float n2;
        if (c == Float.POSITIVE_INFINITY) {
            n2 = n1.f.e(y0);
        }
        else {
            n2 = n1.c.c(this.e);
        }
        float n3;
        if (n1.c.d(this.e) == Float.POSITIVE_INFINITY) {
            n3 = n1.f.c(y0);
        }
        else {
            n3 = n1.c.d(this.e);
        }
        float n4;
        if (n1.c.c(this.f) == Float.POSITIVE_INFINITY) {
            n4 = n1.f.e(y0);
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
            n6 = n1.f.c(y0);
        }
        else {
            n6 = n1.c.d(this.f);
        }
        final List<r> c2 = this.c;
        final List<Float> d = this.d;
        y0 = yd.a.y0(n2, n3);
        return (Shader)yl.a.d(this.g, y0, yd.a.y0(n4, n6), (List)c2, (List)d);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y)) {
            return false;
        }
        final List<r> c = this.c;
        final y y = (y)o;
        return ah2.f.a((Object)c, (Object)y.c) && ah2.f.a((Object)this.d, (Object)y.d) && n1.c.a(this.e, y.e) && n1.c.a(this.f, y.f) && this.g == y.g;
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
        return Integer.hashCode(this.g) + b.c(this.f, b.c(e, (hashCode * 31 + hashCode2) * 31, 31), 31);
    }
    
    public final String toString() {
        final boolean f1 = yd.a.F1(this.e);
        String string = "";
        String string2;
        if (f1) {
            final StringBuilder k = a.k("start=");
            k.append((Object)n1.c.h(this.e));
            k.append(", ");
            string2 = k.toString();
        }
        else {
            string2 = "";
        }
        if (yd.a.F1(this.f)) {
            final StringBuilder i = a.k("end=");
            i.append((Object)n1.c.h(this.f));
            i.append(", ");
            string = i.toString();
        }
        final StringBuilder j = a.k("LinearGradient(colors=");
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
