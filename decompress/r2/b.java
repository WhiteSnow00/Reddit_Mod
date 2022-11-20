// 
// Decompiled by Procyon v0.6.0
// 

package r2;

import aq2.a;
import ng2.e;
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
        return e.a(this.a, b.a) && this.b == b.b && this.c == b.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + aq2.a.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("SpanRange(span=");
        t.append(this.a);
        t.append(", start=");
        t.append(this.b);
        t.append(", end=");
        return d.j(t, this.c, ')');
    }
}
