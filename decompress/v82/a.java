// 
// Decompiled by Procyon v0.6.0
// 

package v82;

import p1.h;
import ng2.e;
import com.reddit.vault.ethereum.eip712.a$b$a;

public final class a
{
    public final a$b$a a;
    public final a$b$a b;
    public final String c;
    
    public a(final a$b$a a, final a$b$a b) {
        this.a = a;
        this.b = b;
        this.c = null;
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
        return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b) && e.a((Object)this.c, (Object)a.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final String c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Eip712Payload(message=");
        t.append(this.a);
        t.append(", domain=");
        t.append(this.b);
        t.append(", primaryType=");
        return h.c(t, this.c, ')');
    }
}
