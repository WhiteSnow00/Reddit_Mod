// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ag0.a;
import ah2.f;
import ak0.m;

public final class b0
{
    public final String a;
    public final String b;
    public final String c;
    
    public b0(final String a, final String b, final String c) {
        m.y(a, "id", b, "name", c, "username");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b0)) {
            return false;
        }
        final b0 b0 = (b0)o;
        return f.a((Object)this.a, (Object)b0.a) && f.a((Object)this.b, (Object)b0.b) && f.a((Object)this.c, (Object)b0.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + ag0.a.f(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("UserMyRedditDataModel(id=");
        k.append(this.a);
        k.append(", name=");
        k.append(this.b);
        k.append(", username=");
        return b.k(k, this.c, ')');
    }
}
