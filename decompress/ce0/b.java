// 
// Decompiled by Procyon v0.6.0
// 

package ce0;

import ah2.f;
import com.reddit.gold.model.DurationUnit;

public final class b
{
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final DurationUnit e;
    public final boolean f;
    public final String g;
    
    public b(final String a, final long b, final long c, final long d, final DurationUnit e, final boolean f, final String g) {
        ah2.f.f((Object)a, "id");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
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
        return ah2.f.a((Object)this.a, (Object)b.a) && this.b == b.b && this.c == b.c && this.d == b.d && this.e == b.e && this.f == b.f && ah2.f.a((Object)this.g, (Object)b.g);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.d, b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
        final DurationUnit e = this.e;
        int hashCode = 0;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        int f;
        if ((f = (this.f ? 1 : 0)) != 0) {
            f = 1;
        }
        final String g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((c + hashCode2) * 31 + f) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("EconSubscription(id=");
        k.append(this.a);
        k.append(", startedAtSeconds=");
        k.append(this.b);
        k.append(", expiresAtSeconds=");
        k.append(this.c);
        k.append(", ifCanceledExpiresAtSeconds=");
        k.append(this.d);
        k.append(", renewInterval=");
        k.append(this.e);
        k.append(", isCanceled=");
        k.append(this.f);
        k.append(", source=");
        return b.k(k, this.g, ')');
    }
}
