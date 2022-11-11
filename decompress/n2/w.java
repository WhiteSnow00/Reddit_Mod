// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import sg2.e;

public final class w
{
    public final g a;
    public final m b;
    public final int c;
    public final int d;
    public final Object e;
    
    public w(final g a, final m b, final int c, final int d, final Object e) {
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
        if (!(o instanceof w)) {
            return false;
        }
        final w w = (w)o;
        return sg2.e.a((Object)this.a, (Object)w.a) && sg2.e.a((Object)this.b, (Object)w.b) && this.c == w.c && this.d == w.d && sg2.e.a(this.e, w.e);
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
        final int c = a.c(this.d, a.c(this.c, (hashCode * 31 + this.b.f) * 31, 31), 31);
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
        final StringBuilder r = a.r("TypefaceRequest(fontFamily=");
        r.append(this.a);
        r.append(", fontWeight=");
        r.append(this.b);
        r.append(", fontStyle=");
        r.append((Object)k.a(this.c));
        r.append(", fontSynthesis=");
        r.append((Object)l.a(this.d));
        r.append(", resourceLoaderCacheKey=");
        return wu.a.b(r, this.e, ')');
    }
}
