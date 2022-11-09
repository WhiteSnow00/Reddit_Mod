// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import androidx.appcompat.widget.s0;
import mj2.c0;
import ah2.f;
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
        f.f((Object)layoutOrientation, "orientation");
        long n;
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            n = c0.a(this.a, this.b, this.c, this.d);
        }
        else {
            n = c0.a(this.c, this.d, this.a, this.b);
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
        return Integer.hashCode(this.d) + s0.e(this.c, s0.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("OrientationIndependentConstraints(mainAxisMin=");
        k.append(this.a);
        k.append(", mainAxisMax=");
        k.append(this.b);
        k.append(", crossAxisMin=");
        k.append(this.c);
        k.append(", crossAxisMax=");
        return d.k(k, this.d, ')');
    }
}
