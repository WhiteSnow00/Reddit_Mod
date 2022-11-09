// 
// Decompiled by Procyon v0.6.0
// 

package r2;

import androidx.appcompat.widget.s0;
import ah2.f;
import android.text.style.MetricAffectingSpan;

public final class b
{
    public final Object a;
    public final int b;
    public final int c;
    
    public b(final MetricAffectingSpan a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return f.a(this.a, b.a) && this.b == b.b && this.c == b.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + s0.e(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SpanRange(span=");
        k.append(this.a);
        k.append(", start=");
        k.append(this.b);
        k.append(", end=");
        return d.k(k, this.c, ')');
    }
}
