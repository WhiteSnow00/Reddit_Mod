// 
// Decompiled by Procyon v0.6.0
// 

package dc;

import ec.i;
import ad.c0;
import cb.c;

public final class d implements b
{
    public final long f;
    public final Object g;
    
    @Override
    public final long b(final long n) {
        return ((c)this.g).e[(int)n] - this.f;
    }
    
    @Override
    public final long c(final long n, final long n2) {
        return ((c)this.g).d[(int)n];
    }
    
    @Override
    public final long d(final long n, final long n2) {
        return 0L;
    }
    
    @Override
    public final long e(final long n, final long n2) {
        return -9223372036854775807L;
    }
    
    @Override
    public final long f(final long n, long f) {
        final c c = (c)this.g;
        f = this.f;
        return c0.f(c.e, n + f, true);
    }
    
    @Override
    public final long g(final long n) {
        return ((c)this.g).a;
    }
    
    @Override
    public final long h() {
        return 0L;
    }
    
    @Override
    public final i i(final long n) {
        final Object g = this.g;
        final long[] c = ((c)g).c;
        final int n2 = (int)n;
        return new i((String)null, c[n2], (long)((c)g).b[n2]);
    }
    
    @Override
    public final boolean j() {
        return true;
    }
    
    @Override
    public final long k(final long n, final long n2) {
        return ((c)this.g).a;
    }
}
