// 
// Decompiled by Procyon v0.6.0
// 

package r82;

import sg2.e;

public final class b
{
    public final p82.b a;
    public final long b;
    
    public b(final p82.b a, final long b) {
        this.a = a;
        this.b = b;
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
        return e.a((Object)this.a, (Object)b.a) && this.b == b.b;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("GasBalance(balance=");
        r.append(this.a);
        r.append(", expiry=");
        return b.i(r, this.b, ')');
    }
}
