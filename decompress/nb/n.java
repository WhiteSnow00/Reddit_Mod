// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.j;
import db.w$a;
import db.b;
import com.google.android.exoplayer2.n$a;
import java.util.ArrayList;
import bd.c0;
import bd.d0;
import bd.t;
import bd.p;
import java.util.Arrays;
import db.w;

public final class n implements k
{
    public final a0 a;
    public final boolean b;
    public final boolean c;
    public final s d;
    public final s e;
    public final s f;
    public long g;
    public final boolean[] h;
    public String i;
    public w j;
    public n.n$a k;
    public boolean l;
    public long m;
    public boolean n;
    public final bd.s o;
    
    public n(final a0 a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = new boolean[3];
        this.d = new s(7);
        this.e = new s(8);
        this.f = new s(6);
        this.m = -9223372036854775807L;
        this.o = new bd.s();
    }
    
    public final void a(int m, int g, final byte[] array) {
        if (!this.l || this.k.c) {
            this.d.a(m, g, array);
            this.e.a(m, g, array);
        }
        this.f.a(m, g, array);
        final n.n$a k = this.k;
        if (k.k) {
            g -= m;
            final byte[] g2 = k.g;
            final int length = g2.length;
            final int n = k.h + g;
            if (length < n) {
                k.g = Arrays.copyOf(g2, n * 2);
            }
            System.arraycopy(array, m, k.g, k.h, g);
            m = k.h + g;
            k.h = m;
            final t f = k.f;
            f.a = k.g;
            f.c = 0;
            f.b = m;
            f.d = 0;
            f.a();
            if (k.f.b(8)) {
                k.f.i();
                final int e = k.f.e(2);
                k.f.j(5);
                if (k.f.c()) {
                    k.f.f();
                    if (k.f.c()) {
                        final int f2 = k.f.f();
                        if (!k.c) {
                            k.k = false;
                            final n$a$a n2 = k.n;
                            n2.e = f2;
                            n2.b = true;
                        }
                        else if (k.f.c()) {
                            final int f3 = k.f.f();
                            if (k.e.indexOfKey(f3) < 0) {
                                k.k = false;
                            }
                            else {
                                final p.b b = (p.b)k.e.get(f3);
                                final p.c c = (p.c)k.d.get(b.a);
                                if (c.h) {
                                    if (!k.f.b(2)) {
                                        return;
                                    }
                                    k.f.j(2);
                                }
                                if (k.f.b(c.j)) {
                                    final int e2 = k.f.e(c.j);
                                    boolean d = false;
                                    boolean i = false;
                                    boolean j = false;
                                    Label_0530: {
                                        if (!c.i) {
                                            if (!k.f.b(1)) {
                                                return;
                                            }
                                            final boolean b2 = d = k.f.d();
                                            if (b2) {
                                                if (!k.f.b(1)) {
                                                    return;
                                                }
                                                final boolean d2 = k.f.d();
                                                i = true;
                                                d = b2;
                                                j = d2;
                                                break Label_0530;
                                            }
                                        }
                                        else {
                                            d = false;
                                        }
                                        j = (i = false);
                                    }
                                    final boolean l = k.i == 5;
                                    int f4;
                                    if (l) {
                                        if (!k.f.c()) {
                                            return;
                                        }
                                        f4 = k.f.f();
                                    }
                                    else {
                                        f4 = 0;
                                    }
                                    m = c.k;
                                    int g3 = 0;
                                    int g4 = 0;
                                    Label_0773: {
                                        Label_0768: {
                                            if (m == 0) {
                                                if (!k.f.b(c.l)) {
                                                    return;
                                                }
                                                g = (m = k.f.e(c.l));
                                                if (b.b) {
                                                    m = g;
                                                    if (!d) {
                                                        if (!k.f.c()) {
                                                            return;
                                                        }
                                                        g3 = k.f.g();
                                                        final int n3 = 0;
                                                        g4 = 0;
                                                        m = g;
                                                        g = n3;
                                                        break Label_0773;
                                                    }
                                                }
                                            }
                                            else if (m == 1 && !c.m) {
                                                if (!k.f.c()) {
                                                    return;
                                                }
                                                g4 = k.f.g();
                                                if (!b.b || d) {
                                                    m = 0;
                                                    break Label_0768;
                                                }
                                                if (!k.f.c()) {
                                                    return;
                                                }
                                                g = k.f.g();
                                                g3 = 0;
                                                m = 0;
                                                break Label_0773;
                                            }
                                            else {
                                                m = 0;
                                            }
                                            g4 = 0;
                                        }
                                        g = 0;
                                        g3 = 0;
                                    }
                                    final n$a$a n4 = k.n;
                                    n4.c = c;
                                    n4.d = e;
                                    n4.e = f2;
                                    n4.f = e2;
                                    n4.g = f3;
                                    n4.h = d;
                                    n4.i = i;
                                    n4.j = j;
                                    n4.k = l;
                                    n4.l = f4;
                                    n4.m = m;
                                    n4.n = g3;
                                    n4.o = g4;
                                    n4.p = g;
                                    n4.a = true;
                                    n4.b = true;
                                    k.k = false;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void b() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        p.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        final n.n$a k = this.k;
        if (k != null) {
            k.k = false;
            k.o = false;
            final n$a$a n = k.n;
            n.b = false;
            n.a = false;
        }
    }
    
    public final void c(final bd.s s) {
        d0.g(this.j);
        final int a = c0.a;
        int b = s.b;
        final int c = s.c;
        final byte[] a2 = s.a;
        final long g = this.g;
        final int n = c - b;
        this.g = g + n;
        this.j.c(n, s);
        final byte[] array = a2;
        while (true) {
            final int b2 = p.b(array, b, c, this.h);
            if (b2 == c) {
                break;
            }
            final int n2 = b2 + 3;
            final int i = array[n2] & 0x1F;
            final int n3 = b2 - b;
            if (n3 > 0) {
                this.a(b, b2, array);
            }
            final int n4 = c - b2;
            final long j = this.g - n4;
            int n5;
            if (n3 < 0) {
                n5 = -n3;
            }
            else {
                n5 = 0;
            }
            final long m = this.m;
            if (!this.l || this.k.c) {
                this.d.b(n5);
                this.e.b(n5);
                if (!this.l) {
                    if (this.d.c && this.e.c) {
                        final ArrayList<byte[]> k = new ArrayList<byte[]>();
                        final s d = this.d;
                        k.add(Arrays.copyOf(d.d, d.e));
                        final s e = this.e;
                        k.add(Arrays.copyOf(e.d, e.e));
                        final s d2 = this.d;
                        final p.c d3 = p.d(3, d2.e, d2.d);
                        final s e2 = this.e;
                        final t t = new t(e2.d, 4, e2.e);
                        final int f = t.f();
                        final int f2 = t.f();
                        t.i();
                        final p.b b3 = new p.b(f, f2, t.d());
                        final String a3 = d0.a(d3.a, d3.b, d3.c);
                        final w l = this.j;
                        final n$a n$a = new n$a();
                        n$a.a = this.i;
                        n$a.k = "video/avc";
                        n$a.h = a3;
                        n$a.p = d3.e;
                        n$a.q = d3.f;
                        n$a.t = d3.g;
                        n$a.m = k;
                        l.a(new com.google.android.exoplayer2.n(n$a));
                        this.l = true;
                        this.k.d.append(d3.d, (Object)d3);
                        this.k.e.append(f, (Object)b3);
                        this.d.c();
                        this.e.c();
                    }
                }
                else {
                    final s d4 = this.d;
                    if (d4.c) {
                        final p.c d5 = p.d(3, d4.e, d4.d);
                        this.k.d.append(d5.d, (Object)d5);
                        this.d.c();
                    }
                    else {
                        final s e3 = this.e;
                        if (e3.c) {
                            final t t2 = new t(e3.d, 4, e3.e);
                            final int f3 = t2.f();
                            final int f4 = t2.f();
                            t2.i();
                            this.k.e.append(f3, (Object)new p.b(f3, f4, t2.d()));
                            this.e.c();
                        }
                    }
                }
            }
            if (this.f.b(n5)) {
                final s f5 = this.f;
                this.o.z(p.e(f5.e, f5.d), this.f.d);
                this.o.B(4);
                db.b.a(m, this.o, this.a.b);
            }
            final n.n$a k2 = this.k;
            final boolean l2 = this.l;
            boolean n6 = this.n;
            Label_1213: {
                if (k2.i != 9) {
                    if (!k2.c) {
                        break Label_1213;
                    }
                    final n$a$a n7 = k2.n;
                    final n$a$a m2 = k2.m;
                    boolean b4 = false;
                    Label_1092: {
                        Label_1085: {
                            if (n7.a) {
                                if (m2.a) {
                                    final p.c c2 = n7.c;
                                    d0.g(c2);
                                    final p.c c3 = m2.c;
                                    d0.g(c3);
                                    if (n7.f == m2.f && n7.g == m2.g && n7.h == m2.h && (!n7.i || !m2.i || n7.j == m2.j)) {
                                        final int d6 = n7.d;
                                        final int d7 = m2.d;
                                        if (d6 == d7 || (d6 != 0 && d7 != 0)) {
                                            final int k3 = c2.k;
                                            if ((k3 != 0 || c3.k != 0 || (n7.m == m2.m && n7.n == m2.n)) && (k3 != 1 || c3.k != 1 || (n7.o == m2.o && n7.p == m2.p))) {
                                                final boolean k4 = n7.k;
                                                if (k4 == m2.k) {
                                                    if (!k4 || n7.l == m2.l) {
                                                        break Label_1085;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                b4 = true;
                                break Label_1092;
                            }
                        }
                        b4 = false;
                    }
                    if (!b4) {
                        break Label_1213;
                    }
                }
                if (l2 && k2.o) {
                    final long j2 = k2.j;
                    final int n8 = (int)(j - j2);
                    final long q = k2.q;
                    if (q != -9223372036854775807L) {
                        k2.a.b(q, (int)(k2.r ? 1 : 0), (int)(j2 - k2.p), n4 + n8, (w$a)null);
                    }
                }
                k2.p = k2.j;
                k2.q = k2.l;
                k2.r = false;
                k2.o = true;
            }
            Label_1262: {
                if (k2.b) {
                    final n$a$a n9 = k2.n;
                    if (n9.b) {
                        final int e4 = n9.e;
                        if (e4 == 7 || e4 == 2) {
                            n6 = true;
                            break Label_1262;
                        }
                    }
                    n6 = false;
                }
            }
            final boolean r = k2.r;
            final int i2 = k2.i;
            final boolean r2 = r | (i2 == 5 || (n6 && i2 == 1));
            k2.r = r2;
            if (r2) {
                this.n = false;
            }
            final long m3 = this.m;
            if (!this.l || this.k.c) {
                this.d.d(i);
                this.e.d(i);
            }
            this.f.d(i);
            final n.n$a k5 = this.k;
            k5.i = i;
            k5.l = m3;
            k5.j = j;
            if ((k5.b && i == 1) || (k5.c && (i == 5 || i == 1 || i == 2))) {
                final n$a$a m4 = k5.m;
                k5.m = k5.n;
                k5.n = m4;
                m4.b = false;
                m4.a = false;
                k5.h = 0;
                k5.k = true;
            }
            b = n2;
        }
        this.a(b, c, array);
    }
    
    public final void d(final j j, final e0$d e0$d) {
        e0$d.a();
        e0$d.b();
        this.i = e0$d.e;
        e0$d.b();
        final w k = j.k(e0$d.d, 2);
        this.j = k;
        this.k = new n.n$a(k, this.b, this.c);
        this.a.a(j, e0$d);
    }
    
    public final void e() {
    }
    
    public final void f(int n, final long m) {
        if (m != -9223372036854775807L) {
            this.m = m;
        }
        final boolean n2 = this.n;
        if ((n & 0x2) != 0x0) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.n = ((n | (n2 ? 1 : 0)) != 0x0);
    }
}
