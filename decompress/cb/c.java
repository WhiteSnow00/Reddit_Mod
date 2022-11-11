// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import android.support.v4.media.a;
import a81.e;
import java.util.Arrays;
import ad.c0;

public final class c implements u
{
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;
    
    public c(final int[] b, final long[] c, final long[] d, final long[] e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final int length = b.length;
        this.a = length;
        if (length > 0) {
            this.f = d[length - 1] + e[length - 1];
        }
        else {
            this.f = 0L;
        }
    }
    
    public final u.a c(final long n) {
        int f = c0.f(this.e, n, true);
        final long[] e = this.e;
        final long n2 = e[f];
        final long[] c = this.c;
        final v v = new v(n2, c[f]);
        if (n2 < n && f != this.a - 1) {
            ++f;
            return new u.a(v, new v(e[f], c[f]));
        }
        return new u.a(v, v);
    }
    
    public final boolean d() {
        return true;
    }
    
    public final long h() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String string = Arrays.toString(this.b);
        final String string2 = Arrays.toString(this.c);
        final String string3 = Arrays.toString(this.e);
        final String string4 = Arrays.toString(this.d);
        final StringBuilder sb = new StringBuilder(a81.e.h(string4, a81.e.h(string3, a81.e.h(string2, a81.e.h(string, 71)))));
        sb.append("ChunkIndex(length=");
        sb.append(a);
        sb.append(", sizes=");
        sb.append(string);
        d.A(sb, ", offsets=", string2, ", timeUs=", string3);
        return android.support.v4.media.a.l(sb, ", durationsUs=", string4, ")");
    }
}
