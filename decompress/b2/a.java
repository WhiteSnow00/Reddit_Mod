// 
// Decompiled by Procyon v0.6.0
// 

package b2;

import androidx.viewpager.widget.c;

public final class a implements w1.a
{
    public final float a;
    public final float b;
    public final long c;
    
    public a(final float a, final float b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof a;
        boolean b2 = true;
        if (b) {
            final a a = (a)o;
            if (a.a == this.a && a.b == this.b && a.c == this.c) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.c) + a.a(this.b, a.a(this.a, 0, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("RotaryScrollEvent(verticalScrollPixels=");
        k.append(this.a);
        k.append(",horizontalScrollPixels=");
        k.append(this.b);
        k.append(",uptimeMillis=");
        return androidx.viewpager.widget.c.k(k, this.c, ')');
    }
}
