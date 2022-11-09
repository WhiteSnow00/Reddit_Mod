// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import nc.a$a;
import java.util.Comparator;
import nc.a;
import bd.c0;
import bd.d0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import nc.f;

public final class h implements f
{
    public final List<d> f;
    public final long[] g;
    public final long[] h;
    
    public h(final ArrayList list) {
        this.f = Collections.unmodifiableList((List<? extends d>)new ArrayList<d>(list));
        this.g = new long[list.size() * 2];
        for (int i = 0; i < list.size(); ++i) {
            final d d = list.get(i);
            final int n = i * 2;
            final long[] g = this.g;
            g[n] = d.b;
            g[n + 1] = d.c;
        }
        final long[] g2 = this.g;
        Arrays.sort(this.h = Arrays.copyOf(g2, g2.length));
    }
    
    public final long a(final int n) {
        final boolean b = true;
        d0.c(n >= 0);
        d0.c(n < this.h.length && b);
        return this.h[n];
    }
    
    public final int c() {
        return this.h.length;
    }
    
    public final int d(final long n) {
        int b = c0.b(this.h, n, false);
        if (b >= this.h.length) {
            b = -1;
        }
        return b;
    }
    
    public final List<a> f(final long n) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final int n2 = 0;
        for (int i = 0; i < this.f.size(); ++i) {
            final long[] g = this.g;
            final int n3 = i * 2;
            if (g[n3] <= n && n < g[n3 + 1]) {
                final d d = this.f.get(i);
                final a a = d.a;
                if (a.j == -3.4028235E38f) {
                    list2.add(d);
                }
                else {
                    list.add(a);
                }
            }
        }
        Collections.sort((List<Object>)list2, (Comparator<? super Object>)new e2.d(4));
        for (int j = n2; j < list2.size(); ++j) {
            final a a2 = list2.get(j).a;
            a2.getClass();
            final a$a a$a = new a$a(a2);
            a$a.e = (float)(-1 - j);
            a$a.f = 1;
            list.add(a$a.a());
        }
        return list;
    }
}
