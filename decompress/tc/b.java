// 
// Decompiled by Procyon v0.6.0
// 

package tc;

import java.util.Collections;
import java.util.List;
import bd.c0;
import bd.d0;
import nc.a;
import nc.f;

public final class b implements f
{
    public final a[] f;
    public final long[] g;
    
    public b(final a[] f, final long[] g) {
        this.f = f;
        this.g = g;
    }
    
    public final long a(final int n) {
        final boolean b = true;
        d0.c(n >= 0);
        d0.c(n < this.g.length && b);
        return this.g[n];
    }
    
    public final int c() {
        return this.g.length;
    }
    
    public final int d(final long n) {
        int b = c0.b(this.g, n, false);
        if (b >= this.g.length) {
            b = -1;
        }
        return b;
    }
    
    public final List<a> f(final long n) {
        final int f = c0.f(this.g, n, false);
        if (f != -1) {
            final a a = this.f[f];
            if (a != nc.a.w) {
                return Collections.singletonList(a);
            }
        }
        return Collections.emptyList();
    }
}
