// 
// Decompiled by Procyon v0.6.0
// 

package xi2;

import sg2.e;

public final class a<T>
{
    public final T a;
    public final T b;
    
    public a(final T a, final T b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b);
    }
    
    @Override
    public final int hashCode() {
        final T a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final T b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ApproximationBounds(lower=");
        r.append(this.a);
        r.append(", upper=");
        return wu.a.b(r, (Object)this.b, ')');
    }
}
