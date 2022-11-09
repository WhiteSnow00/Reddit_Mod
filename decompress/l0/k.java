// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import androidx.appcompat.widget.s0;
import ah2.f;

public final class k
{
    public double a;
    public double b;
    
    public k(final double a, final double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k)) {
            return false;
        }
        final k k = (k)o;
        return f.a((Object)this.a, (Object)k.a) && f.a((Object)this.b, (Object)k.b);
    }
    
    @Override
    public final int hashCode() {
        return Double.hashCode(this.b) + Double.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ComplexDouble(_real=");
        k.append(this.a);
        k.append(", _imaginary=");
        return s0.l(k, this.b, ')');
    }
}
