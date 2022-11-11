// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import al0.b;

public final class r
{
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    
    public r(int a, int e, int f) {
        final int n = 0;
        int b;
        if ((f & 0x2) != 0x0) {
            b = a;
        }
        else {
            b = 0;
        }
        final boolean c = (f & 0x4) != 0x0;
        int d;
        if ((f & 0x8) != 0x0) {
            d = a * 3;
        }
        else {
            d = 0;
        }
        if ((f & 0x10) != 0x0) {
            e = Integer.MAX_VALUE;
        }
        if ((f & 0x20) != 0x0) {
            f = Integer.MIN_VALUE;
        }
        else {
            f = 0;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        if (!c && b == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (e != Integer.MAX_VALUE && e < b * 2 + a) {
            final StringBuilder j = al0.b.j("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=", a, ", prefetchDist=", b, ", maxSize=");
            j.append(e);
            throw new IllegalArgumentException(j.toString());
        }
        Label_0204: {
            if (f != Integer.MIN_VALUE) {
                a = n;
                if (f <= 0) {
                    break Label_0204;
                }
            }
            a = 1;
        }
        if (a != 0) {
            return;
        }
        throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
    }
}
