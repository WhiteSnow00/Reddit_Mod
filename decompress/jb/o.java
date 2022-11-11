// 
// Decompiled by Procyon v0.6.0
// 

package jb;

import ad.c0;
import ad.d0;

public final class o
{
    public final l a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;
    
    public o(final l a, final long[] c, final int[] d, int e, final long[] f, final int[] g, final long h) {
        final int length = d.length;
        final int length2 = f.length;
        final boolean b = false;
        d0.c(length == length2);
        d0.c(c.length == f.length);
        boolean b2 = b;
        if (g.length == f.length) {
            b2 = true;
        }
        d0.c(b2);
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.b = c.length;
        if (g.length > 0) {
            e = g.length - 1;
            g[e] |= 0x20000000;
        }
    }
    
    public final int a(final long n) {
        for (int i = c0.b(this.f, n, true); i < this.f.length; ++i) {
            if ((this.g[i] & 0x1) != 0x0) {
                return i;
            }
        }
        return -1;
    }
}
