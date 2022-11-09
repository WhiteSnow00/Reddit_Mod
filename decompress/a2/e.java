// 
// Decompiled by Procyon v0.6.0
// 

package a2;

import androidx.viewpager.widget.c;
import ah2.f;
import java.util.ArrayList;
import java.util.List;

public final class e
{
    public final List<Float> a;
    public final float b;
    
    public e(final ArrayList a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return f.a((Object)this.a, (Object)e.a) && f.a((Object)this.b, (Object)e.b);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PolynomialFit(coefficients=");
        k.append(this.a);
        k.append(", confidence=");
        return c.j(k, this.b, ')');
    }
}
