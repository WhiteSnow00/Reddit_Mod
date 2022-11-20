// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import t5.w;
import aq2.a;
import ng2.e;

public final class y
{
    public final g a;
    public final o b;
    public final int c;
    public final int d;
    public final Object e;
    
    public y(final g a, final o b, final int c, final int d, final Object e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y)) {
            return false;
        }
        final y y = (y)o;
        return ng2.e.a((Object)this.a, (Object)y.a) && ng2.e.a((Object)this.b, (Object)y.b) && this.c == y.c && this.d == y.d && ng2.e.a(this.e, y.e);
    }
    
    @Override
    public final int hashCode() {
        final g a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int c = aq2.a.c(this.d, aq2.a.c(this.c, (hashCode * 31 + this.b.f) * 31, 31), 31);
        final Object e = this.e;
        int hashCode2;
        if (e == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = e.hashCode();
        }
        return c + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("TypefaceRequest(fontFamily=");
        t.append(this.a);
        t.append(", fontWeight=");
        t.append(this.b);
        t.append(", fontStyle=");
        t.append((Object)k.a(this.c));
        t.append(", fontSynthesis=");
        t.append((Object)l.a(this.d));
        t.append(", resourceLoaderCacheKey=");
        return w.h(t, this.e, ')');
    }
}
