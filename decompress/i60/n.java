// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import androidx.viewpager.widget.c;
import ag0.a;
import ah2.f;
import ak0.m;

public final class n
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    
    public n() {
        this(null, null, null, 15);
    }
    
    public n(final String a, final String b, final String c, final long d) {
        m.y(a, "username", b, "subredditName", c, "responseJson");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n)) {
            return false;
        }
        final n n = (n)o;
        return f.a((Object)this.a, (Object)n.a) && f.a((Object)this.b, (Object)n.b) && f.a((Object)this.c, (Object)n.c) && this.d == n.d;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.d) + ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ModeratorsResponseDataModel(username=");
        k.append(this.a);
        k.append(", subredditName=");
        k.append(this.b);
        k.append(", responseJson=");
        k.append(this.c);
        k.append(", lastUpdateTimestamp=");
        return androidx.viewpager.widget.c.k(k, this.d, ')');
    }
}
