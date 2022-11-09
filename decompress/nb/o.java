// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.j;
import db.b;
import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import ag0.a;
import bd.t;
import db.w$a;
import bd.c0;
import bd.d0;
import bd.p;
import db.w;

public final class o implements k
{
    public final a0 a;
    public String b;
    public w c;
    public o.o$a d;
    public boolean e;
    public final boolean[] f;
    public final s g;
    public final s h;
    public final s i;
    public final s j;
    public final s k;
    public long l;
    public long m;
    public final bd.s n;
    
    public o(final a0 a) {
        this.a = a;
        this.f = new boolean[3];
        this.g = new s(32);
        this.h = new s(33);
        this.i = new s(34);
        this.j = new s(39);
        this.k = new s(40);
        this.m = -9223372036854775807L;
        this.n = new bd.s();
    }
    
    public final void a(final int n, final int n2, final byte[] array) {
        final o.o$a d = this.d;
        if (d.f) {
            final int d2 = d.d;
            final int n3 = n + 2 - d2;
            if (n3 < n2) {
                d.g = ((array[n3] & 0x80) != 0x0);
                d.f = false;
            }
            else {
                d.d = n2 - n + d2;
            }
        }
        if (!this.e) {
            this.g.a(n, n2, array);
            this.h.a(n, n2, array);
            this.i.a(n, n2, array);
        }
        this.j.a(n, n2, array);
        this.k.a(n, n2, array);
    }
    
    public final void b() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        p.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        final o.o$a d = this.d;
        if (d != null) {
            d.f = false;
            d.g = false;
            d.h = false;
            d.i = false;
            d.j = false;
        }
    }
    
    public final void c(final bd.s s) {
        d0.g(this.c);
        final int a = c0.a;
        while (true) {
            final int c = s.c;
            int i = s.b;
            final int n = c - i;
            if (n <= 0) {
                return;
            }
            final byte[] a2 = s.a;
            this.l += n;
            this.c.c(n, s);
            final byte[] array = a2;
            while (i < c) {
                final int b = p.b(array, i, c, this.f);
                if (b == c) {
                    this.a(i, c, array);
                    return;
                }
                final int n2 = b + 3;
                final int n3 = (array[n2] & 0x7E) >> 1;
                final int n4 = b - i;
                if (n4 > 0) {
                    this.a(i, b, array);
                }
                final int n5 = c - b;
                final long b2 = this.l - n5;
                int n6;
                if (n4 < 0) {
                    n6 = -n4;
                }
                else {
                    n6 = 0;
                }
                final long m = this.m;
                final o.o$a d = this.d;
                final boolean e = this.e;
                if (d.j && d.g) {
                    d.m = d.c;
                    d.j = false;
                }
                else if (d.h || d.g) {
                    if (e && d.i) {
                        final long b3 = d.b;
                        final int n7 = (int)(b2 - b3);
                        final long l = d.l;
                        if (l != -9223372036854775807L) {
                            d.a.b(l, (int)(d.m ? 1 : 0), (int)(b3 - d.k), n7 + n5, (w$a)null);
                        }
                    }
                    d.k = d.b;
                    d.l = d.e;
                    d.m = d.c;
                    d.i = true;
                }
                if (!this.e) {
                    this.g.b(n6);
                    this.h.b(n6);
                    this.i.b(n6);
                    final s g = this.g;
                    if (g.c) {
                        final s h = this.h;
                        if (h.c) {
                            final s j = this.i;
                            if (j.c) {
                                final w c2 = this.c;
                                final String b4 = this.b;
                                final int e2 = g.e;
                                final byte[] array2 = new byte[h.e + e2 + j.e];
                                System.arraycopy(g.d, 0, array2, 0, e2);
                                System.arraycopy(h.d, 0, array2, g.e, h.e);
                                System.arraycopy(j.d, 0, array2, g.e + h.e, j.e);
                                final t t = new t(h.d, 0, h.e);
                                t.j(44);
                                final int e3 = t.e(3);
                                t.i();
                                final int e4 = t.e(2);
                                final boolean d2 = t.d();
                                final int e5 = t.e(5);
                                int k = 0;
                                int n8 = 0;
                                while (k < 32) {
                                    int n9 = n8;
                                    if (t.d()) {
                                        n9 = (n8 | 1 << k);
                                    }
                                    ++k;
                                    n8 = n9;
                                }
                                final int[] array3 = new int[6];
                                for (int n10 = 0; n10 < 6; ++n10) {
                                    array3[n10] = t.e(8);
                                }
                                final int e6 = t.e(8);
                                int n11 = 0;
                                for (int n12 = 0; n12 < e3; ++n12) {
                                    int n13 = n11;
                                    if (t.d()) {
                                        n13 = n11 + 89;
                                    }
                                    n11 = n13;
                                    if (t.d()) {
                                        n11 = n13 + 8;
                                    }
                                }
                                t.j(n11);
                                if (e3 > 0) {
                                    t.j((8 - e3) * 2);
                                }
                                t.f();
                                final int f = t.f();
                                if (f == 3) {
                                    t.i();
                                }
                                final int f2 = t.f();
                                final int f3 = t.f();
                                int p;
                                int n18;
                                if (t.d()) {
                                    final int f4 = t.f();
                                    final int f5 = t.f();
                                    final int f6 = t.f();
                                    final int f7 = t.f();
                                    int n14;
                                    if (f != 1 && f != 2) {
                                        n14 = 1;
                                    }
                                    else {
                                        n14 = 2;
                                    }
                                    int n15;
                                    if (f == 1) {
                                        n15 = 2;
                                    }
                                    else {
                                        n15 = 1;
                                    }
                                    final int n16 = f2 - (f4 + f5) * n14;
                                    final int n17 = f3 - (f6 + f7) * n15;
                                    p = n16;
                                    n18 = n17;
                                }
                                else {
                                    n18 = f3;
                                    p = f2;
                                }
                                t.f();
                                t.f();
                                final int f8 = t.f();
                                int n19;
                                if (t.d()) {
                                    n19 = 0;
                                }
                                else {
                                    n19 = e3;
                                }
                                while (n19 <= e3) {
                                    t.f();
                                    t.f();
                                    t.f();
                                    ++n19;
                                }
                                t.f();
                                t.f();
                                t.f();
                                t.f();
                                t.f();
                                t.f();
                                if (t.d() && t.d()) {
                                    for (int n20 = 0; n20 < 4; ++n20) {
                                        int n23;
                                        for (int n21 = 0; n21 < 6; n21 += n23) {
                                            if (!t.d()) {
                                                t.f();
                                            }
                                            else {
                                                final int min = Math.min(64, 1 << (n20 << 1) + 4);
                                                if (n20 > 1) {
                                                    t.g();
                                                }
                                                for (int n22 = 0; n22 < min; ++n22) {
                                                    t.g();
                                                }
                                            }
                                            n23 = 3;
                                            if (n20 != 3) {
                                                n23 = 1;
                                            }
                                        }
                                    }
                                }
                                t.j(2);
                                if (t.d()) {
                                    t.j(8);
                                    t.f();
                                    t.f();
                                    t.i();
                                }
                                final int f9 = t.f();
                                boolean d3 = false;
                                int n24 = 0;
                                for (int n25 = 0; n25 < f9; ++n25) {
                                    if (n25 != 0) {
                                        d3 = t.d();
                                    }
                                    if (d3) {
                                        t.i();
                                        t.f();
                                        for (int n26 = 0; n26 <= n24; ++n26) {
                                            if (t.d()) {
                                                t.i();
                                            }
                                        }
                                    }
                                    else {
                                        final int f10 = t.f();
                                        final int f11 = t.f();
                                        for (int n27 = 0; n27 < f10; ++n27) {
                                            t.f();
                                            t.i();
                                        }
                                        for (int n28 = 0; n28 < f11; ++n28) {
                                            t.f();
                                            t.i();
                                        }
                                        n24 = f10 + f11;
                                    }
                                }
                                if (t.d()) {
                                    for (int n29 = 0; n29 < t.f(); ++n29) {
                                        t.j(f8 + 4 + 1);
                                    }
                                }
                                t.j(2);
                                float t2;
                                final float n30 = t2 = 1.0f;
                                int q = n18;
                                if (t.d()) {
                                    float n31 = n30;
                                    if (t.d()) {
                                        final int e7 = t.e(8);
                                        if (e7 == 255) {
                                            final int e8 = t.e(16);
                                            final int e9 = t.e(16);
                                            n31 = n30;
                                            if (e8 != 0) {
                                                n31 = n30;
                                                if (e9 != 0) {
                                                    n31 = e8 / (float)e9;
                                                }
                                            }
                                        }
                                        else {
                                            final float[] b5 = bd.p.b;
                                            if (e7 < 17) {
                                                n31 = b5[e7];
                                            }
                                            else {
                                                ag0.a.u(46, "Unexpected aspect_ratio_idc value: ", e7, "H265Reader");
                                                n31 = n30;
                                            }
                                        }
                                    }
                                    if (t.d()) {
                                        t.i();
                                    }
                                    if (t.d()) {
                                        t.j(4);
                                        if (t.d()) {
                                            t.j(24);
                                        }
                                    }
                                    if (t.d()) {
                                        t.f();
                                        t.f();
                                    }
                                    t.i();
                                    t2 = n31;
                                    q = n18;
                                    if (t.d()) {
                                        q = n18 * 2;
                                        t2 = n31;
                                    }
                                }
                                final String b6 = d0.b(e4, d2, e5, n8, array3, e6);
                                final n$a n$a = new n$a();
                                n$a.a = b4;
                                n$a.k = "video/hevc";
                                n$a.h = b6;
                                n$a.p = p;
                                n$a.q = q;
                                n$a.t = t2;
                                n$a.m = Collections.singletonList(array2);
                                c2.a(new n(n$a));
                                this.e = true;
                            }
                        }
                    }
                }
                if (this.j.b(n6)) {
                    final s j2 = this.j;
                    this.n.z(p.e(j2.e, j2.d), this.j.d);
                    this.n.C(5);
                    db.b.a(m, this.n, this.a.b);
                }
                if (this.k.b(n6)) {
                    final s k2 = this.k;
                    this.n.z(p.e(k2.e, k2.d), this.k.d);
                    this.n.C(5);
                    db.b.a(m, this.n, this.a.b);
                }
                final long m2 = this.m;
                final o.o$a d4 = this.d;
                final boolean e10 = this.e;
                final boolean b7 = false;
                d4.g = false;
                d4.h = false;
                d4.e = m2;
                d4.d = 0;
                d4.b = b2;
                if (n3 >= 32 && n3 != 40) {
                    if (d4.i && !d4.j) {
                        if (e10) {
                            final long l2 = d4.l;
                            if (l2 != -9223372036854775807L) {
                                d4.a.b(l2, (int)(d4.m ? 1 : 0), (int)(b2 - d4.k), n5, (w$a)null);
                            }
                        }
                        d4.i = false;
                    }
                    if ((32 <= n3 && n3 <= 35) || n3 == 39) {
                        d4.h = (d4.j ^ true);
                        d4.j = true;
                    }
                }
                boolean f12 = false;
                Label_2154: {
                    if (!(d4.c = (n3 >= 16 && n3 <= 21))) {
                        f12 = b7;
                        if (n3 > 9) {
                            break Label_2154;
                        }
                    }
                    f12 = true;
                }
                d4.f = f12;
                if (!this.e) {
                    this.g.d(n3);
                    this.h.d(n3);
                    this.i.d(n3);
                }
                this.j.d(n3);
                this.k.d(n3);
                i = n2;
            }
        }
    }
    
    public final void d(final j j, final e0$d e0$d) {
        e0$d.a();
        e0$d.b();
        this.b = e0$d.e;
        e0$d.b();
        final w k = j.k(e0$d.d, 2);
        this.c = k;
        this.d = new o.o$a(k);
        this.a.a(j, e0$d);
    }
    
    public final void e() {
    }
    
    public final void f(final int n, final long m) {
        if (m != -9223372036854775807L) {
            this.m = m;
        }
    }
}
