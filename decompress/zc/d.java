// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.io.File;

public class d implements Comparable<d>
{
    public final String f;
    public final long g;
    public final long h;
    public final boolean i;
    public final File j;
    public final long k;
    
    public d(final String f, final long g, final long h, final long k, final File j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (j != null);
        this.j = j;
        this.k = k;
    }
    
    public final int a(final d d) {
        if (!this.f.equals(d.f)) {
            return this.f.compareTo(d.f);
        }
        final long n = lcmp(this.g - d.g, 0L);
        int n2;
        if (n == 0) {
            n2 = 0;
        }
        else if (n < 0) {
            n2 = -1;
        }
        else {
            n2 = 1;
        }
        return n2;
    }
    
    @Override
    public final String toString() {
        final long g = this.g;
        final long h = this.h;
        final StringBuilder sb = new StringBuilder(44);
        sb.append("[");
        sb.append(g);
        sb.append(", ");
        return d.m(sb, h, "]");
    }
}
