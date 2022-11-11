// 
// Decompiled by Procyon v0.6.0
// 

package y82;

import x82.l0;
import java.math.BigInteger;

public final class e
{
    public final BigInteger a;
    public final p82.e b;
    public final l0 c;
    
    public e(final BigInteger a, final p82.e b, final l0 c) {
        sg2.e.f((Object)a, "hash");
        sg2.e.f((Object)c, "pendingTransaction");
        this.a = a;
        this.b = b;
        this.c = c;
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
        return sg2.e.a((Object)this.a, (Object)e.a) && sg2.e.a((Object)this.b, (Object)e.b) && sg2.e.a((Object)this.c, (Object)e.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("PendingTransactionInfo(hash=");
        r.append(this.a);
        r.append(", transactionResult=");
        r.append(this.b);
        r.append(", pendingTransaction=");
        r.append(this.c);
        r.append(')');
        return r.toString();
    }
}
