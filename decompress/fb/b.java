// 
// Decompiled by Procyon v0.6.0
// 

package fb;

import db.u;
import db.u$b;
import db.o;
import com.google.android.exoplayer2.ParserException;
import db.m;
import db.w$a;
import com.google.common.collect.ImmutableList;
import qb.a$b;
import bd.c0;
import java.util.List;
import java.util.Arrays;
import db.z;
import db.n;
import db.n$a;
import db.t;
import java.io.IOException;
import vb.g;
import db.r;
import db.e;
import db.i;
import androidx.appcompat.widget.s0;
import db.p;
import qb.a;
import db.w;
import db.j;
import db.m$a;
import bd.s;
import db.h;

public final class b implements h
{
    public final byte[] a;
    public final s b;
    public final boolean c;
    public final m$a d;
    public j e;
    public w f;
    public int g;
    public a h;
    public p i;
    public int j;
    public int k;
    public fb.a l;
    public int m;
    public long n;
    
    static {
        new(androidx.appcompat.widget.s0.class)();
    }
    
    public b() {
        this.a = new byte[42];
        this.b = new s(new byte[32768], 0);
        this.c = false;
        this.d = new m$a();
        this.g = 0;
    }
    
    public final void a(long n, final long n2) {
        final long n3 = 0L;
        if (n == 0L) {
            this.g = 0;
        }
        else {
            final fb.a l = this.l;
            if (l != null) {
                l.c(n2);
            }
        }
        if (n2 == 0L) {
            n = n3;
        }
        else {
            n = -1L;
        }
        this.n = n;
        this.m = 0;
        this.b.y(0);
    }
    
    public final boolean c(final i i) throws IOException {
        final e e = (e)i;
        final a a = new r().a(e, (g.a)vb.g.g);
        if (a != null) {
            final int length = a.f.length;
        }
        final s s = new s(4);
        final byte[] a2 = s.a;
        boolean b = false;
        e.h(a2, 0, 4, false);
        if (s.s() == 1716281667L) {
            b = true;
        }
        return b;
    }
    
    public final void f(final j e) {
        this.e = e;
        this.f = e.k(0, 1);
        e.b();
    }
    
    public final int h(i i, t b) throws IOException {
        final int g = this.g;
        final a a = null;
        final int n = 1;
        final int n2 = 1;
        final int n3 = 0;
        if (g == 0) {
            final boolean c = this.c;
            final e e = (e)i;
            e.f = 0;
            final long k = e.k();
            Object g2;
            if (c ^ true) {
                g2 = null;
            }
            else {
                g2 = vb.g.g;
            }
            final a a2 = new r().a(e, (g.a)g2);
            a h = a;
            if (a2 != null) {
                if (a2.f.length == 0) {
                    h = a;
                }
                else {
                    h = a2;
                }
            }
            e.n((int)(e.k() - k));
            this.h = h;
            this.g = 1;
            return 0;
        }
        if (g == 1) {
            final byte[] a3 = this.a;
            final int length = a3.length;
            final e e2 = (e)i;
            e2.h(a3, 0, length, false);
            e2.f = 0;
            this.g = 2;
            return 0;
        }
        if (g != 2) {
            int n4 = 6;
            if (g == 3) {
                final n$a n$a = new n$a(this.i);
                boolean f = false;
                while (!f) {
                    final e e3 = (e)i;
                    e3.f = 0;
                    final bd.r r = new bd.r(new byte[4], 4);
                    e3.h(r.a, 0, 4, false);
                    f = r.f();
                    final int g3 = r.g(7);
                    final int n5 = r.g(24) + 4;
                    if (g3 == 0) {
                        final byte[] array = new byte[38];
                        e3.f(array, 0, 38, false);
                        n$a.a = new p(array, 4);
                    }
                    else {
                        final p a4 = n$a.a;
                        if (a4 == null) {
                            throw new IllegalArgumentException();
                        }
                        if (g3 == 3) {
                            final s s = new s(n5);
                            e3.f(s.a, 0, n5, false);
                            n$a.a = new p(a4.a, a4.b, a4.c, a4.d, a4.e, a4.g, a4.h, a4.j, db.n.a(s), a4.l);
                        }
                        else if (g3 == 4) {
                            final s s2 = new s(n5);
                            e3.f(s2.a, 0, n5, false);
                            s2.C(4);
                            final a a5 = z.a((List)Arrays.asList(z.b(s2, false, false).a));
                            a l = a4.l;
                            if (l == null) {
                                l = a5;
                            }
                            else if (a5 != null) {
                                final a$b[] f2 = a5.f;
                                if (f2.length != 0) {
                                    final a$b[] f3 = l.f;
                                    final int a6 = c0.a;
                                    final a$b[] copy = Arrays.copyOf(f3, f3.length + f2.length);
                                    System.arraycopy(f2, 0, copy, f3.length, f2.length);
                                    l = new a((a$b[])copy);
                                }
                            }
                            n$a.a = new p(a4.a, a4.b, a4.c, a4.d, a4.e, a4.g, a4.h, a4.j, a4.k, l);
                        }
                        else if (g3 == 6) {
                            final s s3 = new s(n5);
                            e3.f(s3.a, 0, n5, false);
                            s3.C(4);
                            final a a7 = new a((List)ImmutableList.of((Object)tb.a.a(s3)));
                            a j = a4.l;
                            if (j == null) {
                                j = a7;
                            }
                            else {
                                final a$b[] f4 = a7.f;
                                if (f4.length != 0) {
                                    final a$b[] f5 = j.f;
                                    final int a8 = c0.a;
                                    final a$b[] copy2 = Arrays.copyOf(f5, f5.length + f4.length);
                                    System.arraycopy(f4, 0, copy2, f5.length, f4.length);
                                    j = new a((a$b[])copy2);
                                }
                            }
                            n$a.a = new p(a4.a, a4.b, a4.c, a4.d, a4.e, a4.g, a4.h, a4.j, a4.k, j);
                        }
                        else {
                            e3.n(n5);
                        }
                    }
                    final p a9 = n$a.a;
                    final int a10 = c0.a;
                    this.i = a9;
                }
                this.i.getClass();
                this.j = Math.max(this.i.c, 6);
                final w f6 = this.f;
                final int a11 = c0.a;
                f6.a(this.i.c(this.a, this.h));
                this.g = 4;
                return 0;
            }
            if (g != 4) {
                if (g == 5) {
                    this.f.getClass();
                    this.i.getClass();
                    final fb.a m = this.l;
                    int a12;
                    if (m != null && m.c != null) {
                        a12 = m.a((e)i, b);
                    }
                    else {
                        if (this.n != -1L) {
                            final s b2 = this.b;
                            final int c2 = b2.c;
                            int n7;
                            if (c2 < 32768) {
                                final int read = ((e)i).read(b2.a, c2, 32768 - c2);
                                int n6;
                                if (read == -1) {
                                    n6 = n;
                                }
                                else {
                                    n6 = 0;
                                }
                                if (n6 == 0) {
                                    this.b.A(c2 + read);
                                    n7 = n6;
                                }
                                else {
                                    final s b3 = this.b;
                                    n7 = n6;
                                    if (b3.c - b3.b == 0) {
                                        final long n8 = this.n;
                                        final p i2 = this.i;
                                        final int a13 = c0.a;
                                        this.f.b(n8 * 1000000L / i2.e, 1, this.m, 0, (w$a)null);
                                        a12 = -1;
                                        return a12;
                                    }
                                }
                            }
                            else {
                                n7 = 0;
                            }
                            final s b4 = this.b;
                            final int b5 = b4.b;
                            final int m2 = this.m;
                            final int j2 = this.j;
                            if (m2 < j2) {
                                b4.C(Math.min(j2 - m2, b4.c - b5));
                            }
                            b = (t)this.b;
                            this.i.getClass();
                            int b6 = ((s)b).b;
                        Label_0723:
                            while (true) {
                                while (b6 <= ((s)b).c - 16) {
                                    ((s)b).B(b6);
                                    if (db.m.a((s)b, this.i, this.k, this.d)) {
                                        ((s)b).B(b6);
                                        final long n9 = this.d.a;
                                        final s b7 = this.b;
                                        final int n10 = b7.b - b5;
                                        b7.B(b5);
                                        this.f.c(n10, this.b);
                                        final int m3 = this.m + n10;
                                        this.m = m3;
                                        if (n9 != -1L) {
                                            final long n11 = this.n;
                                            final p i3 = this.i;
                                            final int a14 = c0.a;
                                            this.f.b(n11 * 1000000L / i3.e, 1, m3, 0, (w$a)null);
                                            this.m = 0;
                                            this.n = n9;
                                        }
                                        final s b8 = this.b;
                                        final int c3 = b8.c;
                                        final int b9 = b8.b;
                                        final int n12 = c3 - b9;
                                        a12 = n3;
                                        if (n12 < 16) {
                                            final byte[] a15 = b8.a;
                                            System.arraycopy(a15, b9, a15, 0, n12);
                                            this.b.B(0);
                                            this.b.A(n12);
                                            a12 = n3;
                                            return a12;
                                        }
                                        return a12;
                                    }
                                    else {
                                        ++b6;
                                    }
                                }
                                if (n7 != 0) {
                                    while (true) {
                                        final int c4 = ((s)b).c;
                                        if (b6 > c4 - this.j) {
                                            ((s)b).B(c4);
                                            break;
                                        }
                                        ((s)b).B(b6);
                                        boolean a16;
                                        try {
                                            a16 = db.m.a((s)b, this.i, this.k, this.d);
                                        }
                                        catch (final IndexOutOfBoundsException ex) {
                                            a16 = false;
                                        }
                                        if (((s)b).b > ((s)b).c) {
                                            a16 = false;
                                        }
                                        if (a16) {
                                            ((s)b).B(b6);
                                            final long n9 = this.d.a;
                                            continue Label_0723;
                                        }
                                        ++b6;
                                    }
                                }
                                else {
                                    ((s)b).B(b6);
                                }
                                final long n9 = -1L;
                                continue Label_0723;
                            }
                        }
                        final p i4 = this.i;
                        final e e4 = (e)i;
                        e4.f = 0;
                        e4.j(1, false);
                        final byte[] array2 = { 0 };
                        e4.h(array2, 0, 1, false);
                        final boolean b10 = (array2[0] & 0x1) == 0x1;
                        e4.j(2, false);
                        if (b10) {
                            n4 = 7;
                        }
                        final s s4 = new s(n4);
                        final byte[] a17 = s4.a;
                        int n13;
                        int p;
                        for (n13 = 0; n13 < n4; n13 += p) {
                            p = e4.p(0 + n13, n4 - n13, a17);
                            if (p == -1) {
                                break;
                            }
                        }
                        s4.A(n13);
                        e4.f = 0;
                        i = (i)new m$a();
                        int n14;
                        try {
                            long x = s4.x();
                            if (!b10) {
                                x *= i4.b;
                            }
                            ((m$a)i).a = x;
                            n14 = n2;
                        }
                        catch (final NumberFormatException ex2) {
                            n14 = 0;
                        }
                        if (n14 == 0) {
                            throw ParserException.createForMalformedContainer((String)null, (Throwable)null);
                        }
                        this.n = ((m$a)i).a;
                        a12 = n3;
                    }
                    return a12;
                }
                throw new IllegalStateException();
            }
            else {
                final e e5 = (e)i;
                e5.f = 0;
                final s s5 = new s(2);
                e5.h(s5.a, 0, 2, false);
                final int w = s5.w();
                if (w >> 2 == 16382) {
                    e5.f = 0;
                    this.k = w;
                    final j e6 = this.e;
                    final int a18 = c0.a;
                    final long d = e5.d;
                    final long c5 = e5.c;
                    this.i.getClass();
                    final p i5 = this.i;
                    Object a19;
                    if (i5.k != null) {
                        a19 = new o(i5, d);
                    }
                    else if (c5 != -1L && i5.j > 0L) {
                        final fb.a l2 = new fb.a(i5, this.k, d, c5);
                        this.l = l2;
                        a19 = l2.a;
                    }
                    else {
                        a19 = new u$b(i5.b());
                    }
                    e6.s((u)a19);
                    this.g = 5;
                    return 0;
                }
                e5.f = 0;
                throw ParserException.createForMalformedContainer("First frame does not start with sync code.", (Throwable)null);
            }
        }
        else {
            final s s6 = new s(4);
            ((e)i).f(s6.a, 0, 4, false);
            if (s6.s() == 1716281667L) {
                this.g = 3;
                return 0;
            }
            throw ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", (Throwable)null);
        }
    }
    
    public final void release() {
    }
}
