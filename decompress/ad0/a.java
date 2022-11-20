// 
// Decompiled by Procyon v0.6.0
// 

package ad0;

import ng2.e;

public final class a
{
    public final String a;
    public final int b;
    public final int c;
    
    public a(final String a, final int b, final int c) {
        e.f((Object)a, "url");
        this.a = a;
        this.b = b;
        this.c = c;
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
        return e.a((Object)this.a, (Object)a.a) && this.b == a.b && this.c == a.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + aq2.a.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("MediaSource(url=");
        t.append(this.a);
        t.append(", width=");
        t.append(this.b);
        t.append(", height=");
        return d.j(t, this.c, ')');
    }
}
