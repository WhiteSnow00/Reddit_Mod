// 
// Decompiled by Procyon v0.6.0
// 

package p1;

import androidx.viewpager.widget.c;
import ah2.f;

public final class i
{
    public final float a;
    public final float b;
    
    public i(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final float[] a() {
        final float a = this.a;
        final float b = this.b;
        return new float[] { a / b, 1.0f, (1.0f - a - b) / b };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return f.a((Object)this.a, (Object)i.a) && f.a((Object)this.b, (Object)i.b);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("WhitePoint(x=");
        k.append(this.a);
        k.append(", y=");
        return c.j(k, this.b, ')');
    }
}
