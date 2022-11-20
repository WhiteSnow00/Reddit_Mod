// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import java.util.Comparator;
import kc.d;
import nc.a;
import bd.c0;
import ah0.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import nc.f;

public final class i implements f
{
    public final List<e> f;
    public final long[] g;
    public final long[] h;
    
    public i(final ArrayList list) {
        this.f = Collections.unmodifiableList((List<? extends e>)new ArrayList<e>(list));
        this.g = new long[list.size() * 2];
        for (int i = 0; i < list.size(); ++i) {
            final e e = list.get(i);
            final int n = i * 2;
            final long[] g = this.g;
            g[n] = e.b;
            g[n + 1] = e.c;
        }
        final long[] g2 = this.g;
        Arrays.sort(this.h = Arrays.copyOf(g2, g2.length));
    }
    
    @Override
    public final long a(final int n) {
        final boolean b = true;
        ah0.b.C(n >= 0);
        ah0.b.C(n < this.h.length && b);
        return this.h[n];
    }
    
    @Override
    public final int c() {
        return this.h.length;
    }
    
    @Override
    public final int d(final long n) {
        int b = c0.b(this.h, n, false);
        if (b >= this.h.length) {
            b = -1;
        }
        return b;
    }
    
    @Override
    public final List<a> e(final long n) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final int n2 = 0;
        for (int i = 0; i < this.f.size(); ++i) {
            final long[] g = this.g;
            final int n3 = i * 2;
            if (g[n3] <= n && n < g[n3 + 1]) {
                final e e = this.f.get(i);
                final a a = e.a;
                if (a.j == -3.4028235E38f) {
                    list2.add(e);
                }
                else {
                    list.add(a);
                }
            }
        }
        Collections.sort((List<Object>)list2, (Comparator<? super Object>)new d(1));
        for (int j = n2; j < list2.size(); ++j) {
            final a a2 = list2.get(j).a;
            a2.getClass();
            final a.a a3 = new a.a(a2);
            a3.e = (float)(-1 - j);
            a3.f = 1;
            list.add(a3.a());
        }
        return list;
    }
}
