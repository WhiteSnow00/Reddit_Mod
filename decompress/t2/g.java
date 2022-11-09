// 
// Decompiled by Procyon v0.6.0
// 

package t2;

import androidx.viewpager.widget.c;

public final class g
{
    public static final g c;
    public final float a;
    public final float b;
    
    static {
        c = new g(1.0f, 0.0f);
    }
    
    public g() {
        this(1.0f, 0.0f);
    }
    
    public g(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g)) {
            return false;
        }
        final float a = this.a;
        final g g = (g)o;
        return a == g.a && this.b == g.b;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("TextGeometricTransform(scaleX=");
        k.append(this.a);
        k.append(", skewX=");
        return androidx.viewpager.widget.c.j(k, this.b, ')');
    }
}
