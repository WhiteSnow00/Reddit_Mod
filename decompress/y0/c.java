// 
// Decompiled by Procyon v0.6.0
// 

package y0;

public final class c
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    
    public c(final float a, final float b, final float c, final float d) {
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
        if (!(o instanceof c)) {
            return false;
        }
        final float a = this.a;
        final c c = (c)o;
        return a == c.a && this.b == c.b && this.c == c.c && this.d == c.d;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.d) + a.a(this.c, a.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("RippleAlpha(draggedAlpha=");
        k.append(this.a);
        k.append(", focusedAlpha=");
        k.append(this.b);
        k.append(", hoveredAlpha=");
        k.append(this.c);
        k.append(", pressedAlpha=");
        return androidx.viewpager.widget.c.j(k, this.d, ')');
    }
}
