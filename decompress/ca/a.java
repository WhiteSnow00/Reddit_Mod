// 
// Decompiled by Procyon v0.6.0
// 

package ca;

import com.google.accompanist.flowlayout.LayoutOrientation;

public final class a
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public a(final long n, final LayoutOrientation layoutOrientation) {
        final LayoutOrientation horizontal = LayoutOrientation.Horizontal;
        int a;
        if (layoutOrientation == horizontal) {
            a = u2.a.j(n);
        }
        else {
            a = u2.a.i(n);
        }
        int b;
        if (layoutOrientation == horizontal) {
            b = u2.a.h(n);
        }
        else {
            b = u2.a.g(n);
        }
        int c;
        if (layoutOrientation == horizontal) {
            c = u2.a.i(n);
        }
        else {
            c = u2.a.j(n);
        }
        int d;
        if (layoutOrientation == horizontal) {
            d = u2.a.g(n);
        }
        else {
            d = u2.a.h(n);
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return this.a == a.a && this.b == a.b && this.c == a.c && this.d == a.d;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.d) + aq2.a.c(this.c, aq2.a.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("OrientationIndependentConstraints(mainAxisMin=");
        t.append(this.a);
        t.append(", mainAxisMax=");
        t.append(this.b);
        t.append(", crossAxisMin=");
        t.append(this.c);
        t.append(", crossAxisMax=");
        return d.j(t, this.d, ')');
    }
}
