// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import androidx.appcompat.widget.s0;
import ah2.f;

public final class c0
{
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    
    public c0(final String a, final int d, final String b, final String c, final String e, final String f, final String g) {
        a.t(a, "id", b, "username", c, "url", e, "title", g, "type");
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
        if (!(o instanceof c0)) {
            return false;
        }
        final c0 c0 = (c0)o;
        return ah2.f.a((Object)this.a, (Object)c0.a) && ah2.f.a((Object)this.b, (Object)c0.b) && ah2.f.a((Object)this.c, (Object)c0.c) && this.d == c0.d && ah2.f.a((Object)this.e, (Object)c0.e) && ah2.f.a((Object)this.f, (Object)c0.f) && ah2.f.a((Object)this.g, (Object)c0.g);
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.e, s0.e(this.d, ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        final String f2 = this.f;
        int hashCode;
        if (f2 == null) {
            hashCode = 0;
        }
        else {
            hashCode = f2.hashCode();
        }
        return this.g.hashCode() + (f + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("UserSocialLinkDataModel(id=");
        k.append(this.a);
        k.append(", username=");
        k.append(this.b);
        k.append(", url=");
        k.append(this.c);
        k.append(", position=");
        k.append(this.d);
        k.append(", title=");
        k.append(this.e);
        k.append(", handle=");
        k.append(this.f);
        k.append(", type=");
        return b.k(k, this.g, ')');
    }
}
