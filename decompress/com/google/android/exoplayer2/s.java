// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import com.google.common.collect.ImmutableCollection$a;
import ac.j;
import com.google.common.collect.ImmutableList$a;
import v7.l;
import com.google.common.collect.ImmutableList;
import android.util.Pair;
import va.z;
import ad.d0;
import com.google.android.exoplayer2.source.i$b;
import va.y;
import android.os.Handler;
import wa.a;

public final class s
{
    public final e0$b a;
    public final e0$c b;
    public final a c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public y h;
    public y i;
    public y j;
    public int k;
    public Object l;
    public long m;
    
    public s(final a c, final Handler d) {
        this.c = c;
        this.d = d;
        this.a = new e0$b();
        this.b = new e0$c();
    }
    
    public static i$b m(final e0 e0, Object g, final long n, final long n2, final e0$c e0$c, final e0$b e0$b) {
        e0.g(g, e0$b);
        e0.m(e0$b.h, e0$c);
        int b = e0.b(g);
        while (e0$b.i == 0L) {
            final bc.a l = e0$b.l;
            if (l.g <= 0 || !e0$b.g(l.j) || e0$b.c(0L) != -1) {
                break;
            }
            final int n3 = b + 1;
            if (b >= e0$c.u) {
                break;
            }
            e0.f(n3, e0$b, true);
            g = e0$b.g;
            g.getClass();
            b = n3;
        }
        e0.g(g, e0$b);
        final int c = e0$b.c(n);
        if (c == -1) {
            return new i$b(g, e0$b.b(n), n2);
        }
        return new i$b(n2, c, g, e0$b.f(c));
    }
    
    public final y a() {
        final y h = this.h;
        if (h == null) {
            return null;
        }
        if (h == this.i) {
            this.i = h.l;
        }
        h.f();
        if (--this.k == 0) {
            this.j = null;
            final y h2 = this.h;
            this.l = h2.b;
            this.m = ((j)h2.f.a).d;
        }
        this.h = this.h.l;
        this.k();
        return this.h;
    }
    
    public final void b() {
        if (this.k == 0) {
            return;
        }
        y y = this.h;
        d0.g(y);
        this.l = y.b;
        this.m = ((j)y.f.a).d;
        while (y != null) {
            y.f();
            y = y.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        this.k();
    }
    
    public final z c(final e0 e0, y l, long n) {
        final z f = l.f;
        final long n2 = l.o + f.e - n;
        final boolean g = f.g;
        n = 0L;
        if (g) {
            final int b = e0.b(((j)f.a).a);
            final e0$b a = this.a;
            final e0$c b2 = this.b;
            final int f2 = this.f;
            final boolean g2 = this.g;
            boolean b3 = true;
            final int d = e0.d(b, a, b2, f2, g2);
            if (d == -1) {
                return null;
            }
            final int h = e0.f(d, this.a, b3).h;
            final Object g3 = this.a.g;
            g3.getClass();
            long d2 = ((j)f.a).d;
            Object o;
            long c;
            if (e0.m(h, this.b).t == d) {
                final Pair j = e0.j(this.b, this.a, h, -9223372036854775807L, Math.max(0L, n2));
                if (j == null) {
                    return null;
                }
                final Object first = j.first;
                final long longValue = (long)j.second;
                l = l.l;
                if (l != null && l.b.equals(first)) {
                    n = ((j)l.f.a).d;
                }
                else {
                    n = this.e;
                    this.e = 1L + n;
                }
                final long n3 = -9223372036854775807L;
                o = first;
                d2 = n;
                n = longValue;
                c = n3;
            }
            else {
                c = 0L;
                o = g3;
            }
            final i$b m = m(e0, o, n, d2, this.b, this.a);
            long c2 = n;
            if (c != -9223372036854775807L) {
                c2 = n;
                if (f.c != -9223372036854775807L) {
                    Label_0380: {
                        if (e0.g(((j)f.a).a, this.a).l.g > 0) {
                            final e0$b a2 = this.a;
                            if (a2.g(a2.l.j)) {
                                break Label_0380;
                            }
                        }
                        b3 = false;
                    }
                    if (((j)m).a() && b3) {
                        c = f.c;
                        return this.d(e0, m, c, n);
                    }
                    c2 = n;
                    if (b3) {
                        c2 = f.c;
                    }
                }
            }
            n = c2;
            return this.d(e0, m, c, n);
        }
        else {
            boolean b4 = true;
            final i$b a3 = f.a;
            e0.g(((j)a3).a, this.a);
            if (((j)a3).a()) {
                final int b5 = ((j)a3).b;
                final int g4 = this.a.l.a(b5).g;
                if (g4 == -1) {
                    return null;
                }
                final int a4 = this.a.l.a(b5).a(((j)a3).c);
                if (a4 < g4) {
                    return this.e(e0, ((j)a3).a, b5, a4, f.c, ((j)a3).d);
                }
                if ((n = f.c) == -9223372036854775807L) {
                    final e0$c b6 = this.b;
                    final e0$b a5 = this.a;
                    final Pair i = e0.j(b6, a5, a5.h, -9223372036854775807L, Math.max(0L, n2));
                    if (i == null) {
                        return null;
                    }
                    n = (long)i.second;
                }
                return this.f(e0, ((j)a3).a, Math.max(this.g(e0, ((j)a3).a, ((j)a3).b), n), f.c, ((j)a3).d);
            }
            else {
                final int f3 = this.a.f(((j)a3).e);
                if (!this.a.g(((j)a3).e) || this.a.e(((j)a3).e, f3) != 3) {
                    b4 = false;
                }
                if (f3 != this.a.l.a(((j)a3).e).g && !b4) {
                    return this.e(e0, ((j)a3).a, ((j)a3).e, f3, f.e, ((j)a3).d);
                }
                n = this.g(e0, ((j)a3).a, ((j)a3).e);
                return this.f(e0, ((j)a3).a, n, f.e, ((j)a3).d);
            }
        }
    }
    
    public final z d(final e0 e0, final i$b i$b, final long n, final long n2) {
        e0.g(((j)i$b).a, this.a);
        if (((j)i$b).a()) {
            return this.e(e0, ((j)i$b).a, ((j)i$b).b, ((j)i$b).c, n, ((j)i$b).d);
        }
        return this.f(e0, ((j)i$b).a, n2, n, ((j)i$b).d);
    }
    
    public final z e(final e0 e0, final Object o, final int n, final int n2, final long n3, long n4) {
        final i$b i$b = new i$b(n4, n, o, n2);
        final long a = e0.g(o, this.a).a(n, n2);
        if (n2 == this.a.f(n)) {
            n4 = this.a.l.h;
        }
        else {
            n4 = 0L;
        }
        final boolean g = this.a.g(n);
        if (a != -9223372036854775807L && n4 >= a) {
            n4 = Math.max(0L, a - 1L);
        }
        return new z(i$b, n4, n3, -9223372036854775807L, a, g, false, false, false);
    }
    
    public final z f(final e0 e0, Object o, long n, final long n2, long i) {
        final long n3 = n;
        e0.g(o, this.a);
        int b = this.a.b(n3);
        boolean b3 = false;
        Label_0200: {
            Label_0197: {
                if (b == -1) {
                    final e0$b a = this.a;
                    final bc.a l = a.l;
                    if (l.g <= 0 || !a.g(l.j)) {
                        break Label_0197;
                    }
                }
                else {
                    if (!this.a.g(b)) {
                        break Label_0197;
                    }
                    n = this.a.d(b);
                    final e0$b a2 = this.a;
                    if (n != a2.i) {
                        break Label_0197;
                    }
                    final bc.a.a a3 = a2.l.a(b);
                    boolean b2 = false;
                    Label_0184: {
                        Label_0175: {
                            if (a3.g != -1) {
                                for (int j = 0; j < a3.g; ++j) {
                                    final int n4 = a3.i[j];
                                    if (n4 == 0) {
                                        break Label_0175;
                                    }
                                    if (n4 == 1) {
                                        break Label_0175;
                                    }
                                }
                                b2 = false;
                                break Label_0184;
                            }
                        }
                        b2 = true;
                    }
                    if (!(b2 ^ true)) {
                        break Label_0197;
                    }
                    b = -1;
                }
                b3 = true;
                break Label_0200;
            }
            b3 = false;
        }
        o = new i$b(o, b, i);
        final boolean b4 = !((j)o).a() && b == -1;
        final boolean k = this.j(e0, (i$b)o);
        final boolean m = this.i(e0, (i$b)o, b4);
        final boolean b5 = b != -1 && this.a.g(b);
        if (b != -1) {
            n = this.a.d(b);
        }
        else if (b3) {
            n = this.a.i;
        }
        else {
            n = -9223372036854775807L;
        }
        if (n != -9223372036854775807L && n != Long.MIN_VALUE) {
            i = n;
        }
        else {
            i = this.a.i;
        }
        long max = n3;
        if (i != -9223372036854775807L) {
            max = n3;
            if (n3 >= i) {
                max = Math.max(0L, i - 1L);
            }
        }
        return new z((i$b)o, max, n2, n, i, b5, b4, k, m);
    }
    
    public final long g(final e0 e0, final Object o, final int n) {
        e0.g(o, this.a);
        final long d = this.a.d(n);
        if (d == Long.MIN_VALUE) {
            return this.a.i;
        }
        return d + this.a.l.a(n).k;
    }
    
    public final z h(final e0 e0, final z z) {
        final i$b a = z.a;
        final boolean b = !((j)a).a() && ((j)a).e == -1;
        final boolean j = this.j(e0, a);
        final boolean i = this.i(e0, a, b);
        e0.g(((j)z.a).a, this.a);
        long d = 0L;
        Label_0104: {
            if (!((j)a).a()) {
                final int e2 = ((j)a).e;
                if (e2 != -1) {
                    d = this.a.d(e2);
                    break Label_0104;
                }
            }
            d = -9223372036854775807L;
        }
        long n;
        if (((j)a).a()) {
            n = this.a.a(((j)a).b, ((j)a).c);
        }
        else if (d != -9223372036854775807L && d != Long.MIN_VALUE) {
            n = d;
        }
        else {
            n = this.a.i;
        }
        boolean g;
        if (((j)a).a()) {
            g = this.a.g(((j)a).b);
        }
        else {
            final int e3 = ((j)a).e;
            g = (e3 != -1 && this.a.g(e3));
        }
        return new z(a, z.b, z.c, d, n, g, b, j, i);
    }
    
    public final boolean i(final e0 e0, final i$b i$b, final boolean b) {
        final int b2 = e0.b(((j)i$b).a);
        final e0$b a = this.a;
        boolean b4;
        final boolean b3 = b4 = false;
        if (!e0.m(e0.f(b2, a, false).h, this.b).n) {
            final boolean b5 = e0.d(b2, this.a, this.b, this.f, this.g) == -1;
            b4 = b3;
            if (b5) {
                b4 = b3;
                if (b) {
                    b4 = true;
                }
            }
        }
        return b4;
    }
    
    public final boolean j(final e0 e0, final i$b i$b) {
        final boolean a = ((j)i$b).a();
        boolean b = true;
        if (a || ((j)i$b).e != -1) {
            return false;
        }
        if (e0.m(e0.g(((j)i$b).a, this.a).h, this.b).u != e0.b(((j)i$b).a)) {
            b = false;
        }
        return b;
    }
    
    public final void k() {
        final ImmutableList$a builder = ImmutableList.builder();
        for (y y = this.h; y != null; y = y.l) {
            ((ImmutableCollection$a)builder).c((Object)y.f.a);
        }
        final y i = this.i;
        Object a;
        if (i == null) {
            a = null;
        }
        else {
            a = i.f.a;
        }
        this.d.post((Runnable)new l((Object)this, 1, (Object)builder, a));
    }
    
    public final boolean l(y j) {
        final boolean b = false;
        d0.f(j != null);
        if (j.equals(this.j)) {
            return false;
        }
        this.j = j;
        boolean b2 = b;
        while (true) {
            j = j.l;
            if (j == null) {
                break;
            }
            if (j == this.i) {
                this.i = this.h;
                b2 = true;
            }
            j.f();
            --this.k;
        }
        j = this.j;
        if (j.l != null) {
            j.b();
            j.l = null;
            j.c();
        }
        this.k();
        return b2;
    }
    
    public final i$b n(final e0 e0, Object g, final long n) {
        final Object l = g;
        final int h = e0.g(g, this.a).h;
        final Object i = this.l;
    Label_0067:
        while (true) {
            Label_0070: {
                if (i == null) {
                    break Label_0070;
                }
                final int b = e0.b(i);
                if (b == -1 || e0.f(b, this.a, false).h != h) {
                    break Label_0070;
                }
                final long n2 = this.m;
                e0.g(g, this.a);
                e0.m(this.a.h, this.b);
                int b2 = e0.b(g);
                int n3 = 0;
                g = l;
                Object o;
                while (true) {
                    o = g;
                    if (b2 < this.b.t) {
                        break;
                    }
                    final e0$b a = this.a;
                    int n4 = 1;
                    e0.f(b2, a, true);
                    final e0$b a2 = this.a;
                    if (a2.l.g <= 0) {
                        n4 = 0;
                    }
                    n3 |= n4;
                    if (a2.c(a2.i) != -1) {
                        g = this.a.g;
                        g.getClass();
                    }
                    if (n3 != 0) {
                        o = g;
                        if (n4 == 0) {
                            break;
                        }
                        if (this.a.i != 0L) {
                            o = g;
                            break;
                        }
                    }
                    --b2;
                }
                return m(e0, o, n, n2, this.b, this.a);
            }
            for (y y = this.h; y != null; y = y.l) {
                if (y.b.equals(g)) {
                    final long n2 = ((j)y.f.a).d;
                    continue Label_0067;
                }
            }
            for (y y2 = this.h; y2 != null; y2 = y2.l) {
                final int b3 = e0.b(y2.b);
                if (b3 != -1 && e0.f(b3, this.a, false).h == h) {
                    final long n2 = ((j)y2.f.a).d;
                    continue Label_0067;
                }
            }
            final long e2 = this.e;
            this.e = 1L + e2;
            long n2 = e2;
            if (this.h == null) {
                this.l = l;
                this.m = e2;
                n2 = e2;
            }
            continue Label_0067;
        }
    }
    
    public final boolean o(final e0 e0) {
        y y = this.h;
        if (y == null) {
            return true;
        }
        int n = e0.b(y.b);
        y y2;
        do {
            n = e0.d(n, this.a, this.b, this.f, this.g);
            y2 = y;
            while (true) {
                y = y2.l;
                if (y == null || y2.f.g) {
                    break;
                }
                y2 = y;
            }
            if (n == -1) {
                break;
            }
            if (y == null) {
                break;
            }
        } while (e0.b(y.b) == n);
        final boolean l = this.l(y2);
        y2.f = this.h(e0, y2.f);
        return l ^ true;
    }
    
    public final boolean p(final e0 e0, long e2, final long n) {
        y h = this.h;
        y y = null;
        boolean b2;
        while (true) {
            boolean b = true;
            if (h == null) {
                return true;
            }
            final z f = h.f;
            z h2;
            if (y == null) {
                h2 = this.h(e0, f);
            }
            else {
                final z c = this.c(e0, y, e2);
                if (c == null) {
                    b2 = this.l(y);
                    break;
                }
                if (f.b != c.b || !((j)f.a).equals(c.a)) {
                    b2 = this.l(y);
                    break;
                }
                h2 = c;
            }
            h.f = h2.a(f.c);
            final long e3 = f.e;
            final long e4 = h2.e;
            if (e3 != -9223372036854775807L && e3 != e4) {
                h.h();
                e2 = h2.e;
                if (e2 == -9223372036854775807L) {
                    e2 = Long.MAX_VALUE;
                }
                else {
                    e2 += h.o;
                }
                final boolean b3 = h == this.i && !h.f.f && (n == Long.MIN_VALUE || n >= e2);
                if (this.l(h) || b3) {
                    b = false;
                }
                return b;
            }
            final y l = h.l;
            y = h;
            h = l;
        }
        return b2 ^ true;
    }
}
