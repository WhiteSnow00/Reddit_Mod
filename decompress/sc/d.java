// 
// Decompiled by Procyon v0.6.0
// 

package sc;

import java.util.Collections;
import bd.c0;
import bd.d0;
import java.util.ArrayList;
import nc.a;
import java.util.List;
import nc.f;

public final class d implements f
{
    public final List<List<a>> f;
    public final List<Long> g;
    
    public d(final ArrayList f, final ArrayList g) {
        this.f = f;
        this.g = g;
    }
    
    public final long a(final int n) {
        final boolean b = true;
        d0.c(n >= 0);
        d0.c(n < this.g.size() && b);
        return this.g.get(n);
    }
    
    public final int c() {
        return this.g.size();
    }
    
    public final int d(final long n) {
        final List<Long> g = this.g;
        final Long value = n;
        final int a = c0.a;
        int binarySearch = Collections.binarySearch(g, value);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        else {
            while (++binarySearch < g.size() && ((Comparable<Long>)g.get(binarySearch)).compareTo(value) == 0) {}
        }
        if (binarySearch >= this.g.size()) {
            binarySearch = -1;
        }
        return binarySearch;
    }
    
    public final List<a> f(final long n) {
        final int d = c0.d(this.g, n, false);
        if (d == -1) {
            return Collections.emptyList();
        }
        return this.f.get(d);
    }
}
