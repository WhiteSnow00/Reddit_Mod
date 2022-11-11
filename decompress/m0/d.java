// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import sg2.e;
import o1.m0;
import o1.n;

public final class d
{
    public final float a;
    public final n b;
    
    public d(final float a, final m0 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final float a = this.a;
        final d d = (d)o;
        return u2.d.a(a, d.a) && e.a((Object)this.b, (Object)d.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("BorderStroke(width=");
        al0.a.v(this.a, r, ", brush=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
