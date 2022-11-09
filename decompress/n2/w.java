// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import androidx.appcompat.widget.s0;
import ah2.f;

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
        return f.a((Object)this.a, (Object)w.a) && f.a((Object)this.b, (Object)w.b) && this.c == w.c && this.d == w.d && f.a(this.e, w.e);
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
        final int e = s0.e(this.d, s0.e(this.c, (hashCode * 31 + this.b.f) * 31, 31), 31);
        final Object e2 = this.e;
        int hashCode2;
        if (e2 == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = e2.hashCode();
        }
        return e + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("TypefaceRequest(fontFamily=");
        k.append(this.a);
        k.append(", fontWeight=");
        k.append(this.b);
        k.append(", fontStyle=");
        k.append((Object)n2.k.a(this.c));
        k.append(", fontSynthesis=");
        k.append((Object)l.a(this.d));
        k.append(", resourceLoaderCacheKey=");
        return zu.a.b(k, this.e, ')');
    }
}
