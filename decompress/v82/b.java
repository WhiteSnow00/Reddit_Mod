// 
// Decompiled by Procyon v0.6.0
// 

package v82;

import ng2.e;
import com.reddit.vault.ethereum.eip712.a;

public final class b
{
    public final String a;
    public final a b;
    
    public b(final String a, final a b) {
        e.f((Object)a, "name");
        e.f((Object)b, "type");
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
        return e.a((Object)this.a, (Object)b.a) && e.a((Object)this.b, (Object)b.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("StructParam(name=");
        t.append(this.a);
        t.append(", type=");
        t.append(this.b);
        t.append(')');
        return t.toString();
    }
}
