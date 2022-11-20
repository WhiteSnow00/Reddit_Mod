// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import aq2.a;
import cg.d;
import ng2.e;
import androidx.compose.foundation.layout.LayoutOrientation;

public final class y
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public y(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final long a(final LayoutOrientation layoutOrientation) {
        e.f((Object)layoutOrientation, "orientation");
        long n;
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            n = cg.d.G(this.a, this.b, this.c, this.d);
        }
        else {
            n = cg.d.G(this.c, this.d, this.a, this.b);
        }
        return n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y)) {
            return false;
        }
        final y y = (y)o;
        return this.a == y.a && this.b == y.b && this.c == y.c && this.d == y.d;
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
