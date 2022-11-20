// 
// Decompiled by Procyon v0.6.0
// 

package td0;

import p1.h;
import ng2.e;
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
        ng2.e.f((Object)a, "id");
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
        return ng2.e.a((Object)this.a, (Object)b.a) && this.b == b.b && this.c == b.c && this.d == b.d && this.e == b.e && this.f == b.f && ng2.e.a((Object)this.g, (Object)b.g);
    }
    
    @Override
    public final int hashCode() {
        final int b = b.b(this.d, b.b(this.c, b.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
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
        return ((b + hashCode2) * 31 + f) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("EconSubscription(id=");
        t.append(this.a);
        t.append(", startedAtSeconds=");
        t.append(this.b);
        t.append(", expiresAtSeconds=");
        t.append(this.c);
        t.append(", ifCanceledExpiresAtSeconds=");
        t.append(this.d);
        t.append(", renewInterval=");
        t.append(this.e);
        t.append(", isCanceled=");
        t.append(this.f);
        t.append(", source=");
        return h.c(t, this.g, ')');
    }
}
