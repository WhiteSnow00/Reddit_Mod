// 
// Decompiled by Procyon v0.6.0
// 

package nc;

import java.util.List;
import ab.f;

public abstract class j extends f implements nc.f
{
    public nc.f h;
    public long i;
    
    public final long a(final int n) {
        final nc.f h = this.h;
        h.getClass();
        return h.a(n) + this.i;
    }
    
    public final int c() {
        final nc.f h = this.h;
        h.getClass();
        return h.c();
    }
    
    public final int d(final long n) {
        final nc.f h = this.h;
        h.getClass();
        return h.d(n - this.i);
    }
    
    public final List<a> f(final long n) {
        final nc.f h = this.h;
        h.getClass();
        return h.f(n - this.i);
    }
    
    public final void t(long n, final nc.f h, final long n2) {
        super.g = n;
        this.h = h;
        if (n2 != Long.MAX_VALUE) {
            n = n2;
        }
        this.i = n;
    }
}
