// 
// Decompiled by Procyon v0.6.0
// 

package ec;

import ad.c0;
import yb.o;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import android.net.Uri;
import yb.j;

public final class c implements j<c>
{
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final n i;
    public final l j;
    public final Uri k;
    public final h l;
    public final List<g> m;
    
    public c(final long a, final long b, final long c, final boolean d, final long e, final long f, final long g, final long h, final h l, final n i, final l j, final Uri k, final ArrayList m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.l = l;
        this.i = i;
        this.k = k;
        this.j = j;
        this.m = m;
    }
    
    public final Object a(final List list) {
        final LinkedList list2 = new LinkedList(list);
        Collections.sort((List<Comparable>)list2);
        list2.add(new o(-1, -1, -1));
        final ArrayList list3 = new ArrayList();
        long n = 0L;
        int n2 = 0;
        long n3;
        while (true) {
            final int c = this.c();
            n3 = -9223372036854775807L;
            if (n2 >= c) {
                break;
            }
            long n4;
            if (list2.peek().f != n2) {
                final long d = this.d(n2);
                n4 = n;
                if (d != -9223372036854775807L) {
                    n4 = n + d;
                }
            }
            else {
                final g b = this.b(n2);
                final List c2 = b.c;
                o o = list2.poll();
                final int f = o.f;
                final ArrayList<a> list4 = new ArrayList<a>();
                do {
                    final int g = o.g;
                    final a a = c2.get(g);
                    final List c3 = a.c;
                    final ArrayList<ec.j> list5 = new ArrayList<ec.j>();
                    o o2 = o;
                    do {
                        list5.add((ec.j)c3.get(o2.h));
                        o = list2.poll();
                        if (o.f != f) {
                            break;
                        }
                        o2 = o;
                    } while (o.g == g);
                    list4.add(new a(a.a, a.b, (ArrayList)list5, a.d, a.e, a.f));
                } while (o.f == f);
                list2.addFirst(o);
                list3.add(new g(b.a, b.b - n, (ArrayList)list4, b.d));
                n4 = n;
            }
            ++n2;
            n = n4;
        }
        final long b2 = this.b;
        if (b2 != -9223372036854775807L) {
            n3 = b2 - n;
        }
        return new c(this.a, n3, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, list3);
    }
    
    public final g b(final int n) {
        return this.m.get(n);
    }
    
    public final int c() {
        return this.m.size();
    }
    
    public final long d(final int n) {
        final int size = this.m.size();
        long n2 = -9223372036854775807L;
        if (n == size - 1) {
            final long b = this.b;
            if (b != -9223372036854775807L) {
                n2 = b - this.m.get(n).b;
            }
        }
        else {
            n2 = this.m.get(n + 1).b - this.m.get(n).b;
        }
        return n2;
    }
    
    public final long e(final int n) {
        return c0.J(this.d(n));
    }
}
