// 
// Decompiled by Procyon v0.6.0
// 

package eb;

import cb.u;
import cb.o;
import com.google.android.exoplayer2.ParserException;
import cb.w$a;
import com.google.common.collect.ImmutableList;
import pb.a$b;
import ad.c0;
import java.util.List;
import java.util.Arrays;
import cb.z;
import cb.n;
import cb.t;
import java.io.IOException;
import ub.g$a;
import ub.g;
import cb.r;
import cb.e;
import cb.i;
import cb.p;
import pb.a;
import cb.w;
import cb.j;
import cb.m;
import ad.s;
import cb.h;

public final class c implements h
{
    public final byte[] a;
    public final s b;
    public final boolean c;
    public final m.a d;
    public j e;
    public w f;
    public int g;
    public a h;
    public p i;
    public int j;
    public int k;
    public eb.a l;
    public int m;
    public long n;
    
    static {
        new(eb.b.class)();
    }
    
    public c() {
        this.a = new byte[42];
        this.b = new s(new byte[32768], 0);
        this.c = false;
        this.d = new m.a();
        this.g = 0;
    }
    
    @Override
    public final void a(long n, final long n2) {
        final long n3 = 0L;
        if (n == 0L) {
            this.g = 0;
        }
        else {
            final eb.a l = this.l;
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
    
    @Override
    public final void e(final j e) {
        this.e = e;
        this.f = e.i(0, 1);
        e.b();
    }
    
    @Override
    public final boolean f(final i i) throws IOException {
        final e e = (e)i;
        final a a = new r().a(e, (g$a)ub.g.b);
        if (a != null) {
            final int length = a.f.length;
        }
        final s s = new s(4);
        final byte[] a2 = s.a;
        boolean b = false;
        e.g(a2, 0, 4, false);
        if (s.s() == 1716281667L) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final int i(i i, t b) throws IOException {
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
            Object b2;
            if (c ^ true) {
                b2 = null;
            }
            else {
                b2 = ub.g.b;
            }
            final a a2 = new r().a(e, (g$a)b2);
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
            e2.g(a3, 0, length, false);
            e2.f = 0;
            this.g = 2;
            return 0;
        }
        if (g != 2) {
            int n4 = 6;
            if (g == 3) {
                final n.a a4 = new n.a(this.i);
                boolean f = false;
                while (!f) {
                    final e e3 = (e)i;
                    e3.f = 0;
                    final ad.r r = new ad.r(new byte[4], 4);
                    e3.g(r.a, 0, 4, false);
                    f = r.f();
                    final int g2 = r.g(7);
                    final int n5 = r.g(24) + 4;
                    if (g2 == 0) {
                        final byte[] array = new byte[38];
                        e3.e(array, 0, 38, false);
                        a4.a = new p(array, 4);
                    }
                    else {
                        final p a5 = a4.a;
                        if (a5 == null) {
                            throw new IllegalArgumentException();
                        }
                        if (g2 == 3) {
                            final s s = new s(n5);
                            e3.e(s.a, 0, n5, false);
                            a4.a = new p(a5.a, a5.b, a5.c, a5.d, a5.e, a5.g, a5.h, a5.j, cb.n.a(s), a5.l);
                        }
                        else if (g2 == 4) {
                            final s s2 = new s(n5);
                            e3.e(s2.a, 0, n5, false);
                            s2.C(4);
                            final a a6 = z.a((List)Arrays.asList(z.b(s2, false, false).a));
                            a l = a5.l;
                            if (l == null) {
                                l = a6;
                            }
                            else if (a6 != null) {
                                final a$b[] f2 = a6.f;
                                if (f2.length != 0) {
                                    final a$b[] f3 = l.f;
                                    final int a7 = c0.a;
                                    final a$b[] copy = Arrays.copyOf(f3, f3.length + f2.length);
                                    System.arraycopy(f2, 0, copy, f3.length, f2.length);
                                    l = new a((a$b[])copy);
                                }
                            }
                            a4.a = new p(a5.a, a5.b, a5.c, a5.d, a5.e, a5.g, a5.h, a5.j, a5.k, l);
                        }
                        else if (g2 == 6) {
                            final s s3 = new s(n5);
                            e3.e(s3.a, 0, n5, false);
                            s3.C(4);
                            final a a8 = new a((List)ImmutableList.of((Object)sb.a.a(s3)));
                            a j = a5.l;
                            if (j == null) {
                                j = a8;
                            }
                            else {
                                final a$b[] f4 = a8.f;
                                if (f4.length != 0) {
                                    final a$b[] f5 = j.f;
                                    final int a9 = c0.a;
                                    final a$b[] copy2 = Arrays.copyOf(f5, f5.length + f4.length);
                                    System.arraycopy(f4, 0, copy2, f5.length, f4.length);
                                    j = new a((a$b[])copy2);
                                }
                            }
                            a4.a = new p(a5.a, a5.b, a5.c, a5.d, a5.e, a5.g, a5.h, a5.j, a5.k, j);
                        }
                        else {
                            e3.n(n5);
                        }
                    }
                    final p a10 = a4.a;
                    final int a11 = c0.a;
                    this.i = a10;
                }
                this.i.getClass();
                this.j = Math.max(this.i.c, 6);
                final w f6 = this.f;
                final int a12 = c0.a;
                f6.b(this.i.c(this.a, this.h));
                this.g = 4;
                return 0;
            }
            if (g != 4) {
                if (g == 5) {
                    this.f.getClass();
                    this.i.getClass();
                    final eb.a m = this.l;
                    int a13;
                    if (m != null && m.c != null) {
                        a13 = m.a((e)i, b);
                    }
                    else {
                        if (this.n != -1L) {
                            final s b3 = this.b;
                            final int c2 = b3.c;
                            int n7;
                            if (c2 < 32768) {
                                final int read = ((e)i).read(b3.a, c2, 32768 - c2);
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
                                    final s b4 = this.b;
                                    n7 = n6;
                                    if (b4.c - b4.b == 0) {
                                        final long n8 = this.n;
                                        final p i2 = this.i;
                                        final int a14 = c0.a;
                                        this.f.a(n8 * 1000000L / i2.e, 1, this.m, 0, (w$a)null);
                                        a13 = -1;
                                        return a13;
                                    }
                                }
                            }
                            else {
                                n7 = 0;
                            }
                            final s b5 = this.b;
                            final int b6 = b5.b;
                            final int m2 = this.m;
                            final int j2 = this.j;
                            if (m2 < j2) {
                                b5.C(Math.min(j2 - m2, b5.c - b6));
                            }
                            b = (t)this.b;
                            this.i.getClass();
                            int b7 = ((s)b).b;
                        Label_0723:
                            while (true) {
                                while (b7 <= ((s)b).c - 16) {
                                    ((s)b).B(b7);
                                    if (cb.m.a((s)b, this.i, this.k, this.d)) {
                                        ((s)b).B(b7);
                                        final long n9 = this.d.a;
                                        final s b8 = this.b;
                                        final int n10 = b8.b - b6;
                                        b8.B(b6);
                                        this.f.e(n10, this.b);
                                        final int m3 = this.m + n10;
                                        this.m = m3;
                                        if (n9 != -1L) {
                                            final long n11 = this.n;
                                            final p i3 = this.i;
                                            final int a15 = c0.a;
                                            this.f.a(n11 * 1000000L / i3.e, 1, m3, 0, (w$a)null);
                                            this.m = 0;
                                            this.n = n9;
                                        }
                                        final s b9 = this.b;
                                        final int c3 = b9.c;
                                        final int b10 = b9.b;
                                        final int n12 = c3 - b10;
                                        a13 = n3;
                                        if (n12 < 16) {
                                            final byte[] a16 = b9.a;
                                            System.arraycopy(a16, b10, a16, 0, n12);
                                            this.b.B(0);
                                            this.b.A(n12);
                                            a13 = n3;
                                            return a13;
                                        }
                                        return a13;
                                    }
                                    else {
                                        ++b7;
                                    }
                                }
                                if (n7 != 0) {
                                    while (true) {
                                        final int c4 = ((s)b).c;
                                        if (b7 > c4 - this.j) {
                                            ((s)b).B(c4);
                                            break;
                                        }
                                        ((s)b).B(b7);
                                        boolean a17;
                                        try {
                                            a17 = cb.m.a((s)b, this.i, this.k, this.d);
                                        }
                                        catch (final IndexOutOfBoundsException ex) {
                                            a17 = false;
                                        }
                                        if (((s)b).b > ((s)b).c) {
                                            a17 = false;
                                        }
                                        if (a17) {
                                            ((s)b).B(b7);
                                            final long n9 = this.d.a;
                                            continue Label_0723;
                                        }
                                        ++b7;
                                    }
                                }
                                else {
                                    ((s)b).B(b7);
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
                        e4.g(array2, 0, 1, false);
                        final boolean b11 = (array2[0] & 0x1) == 0x1;
                        e4.j(2, false);
                        if (b11) {
                            n4 = 7;
                        }
                        final s s4 = new s(n4);
                        final byte[] a18 = s4.a;
                        int n13;
                        int p;
                        for (n13 = 0; n13 < n4; n13 += p) {
                            p = e4.p(0 + n13, n4 - n13, a18);
                            if (p == -1) {
                                break;
                            }
                        }
                        s4.A(n13);
                        e4.f = 0;
                        i = (i)new m.a();
                        int n14;
                        try {
                            long x = s4.x();
                            if (!b11) {
                                x *= i4.b;
                            }
                            ((m.a)i).a = x;
                            n14 = n2;
                        }
                        catch (final NumberFormatException ex2) {
                            n14 = 0;
                        }
                        if (n14 == 0) {
                            throw ParserException.createForMalformedContainer(null, null);
                        }
                        this.n = ((m.a)i).a;
                        a13 = n3;
                    }
                    return a13;
                }
                throw new IllegalStateException();
            }
            else {
                final e e5 = (e)i;
                e5.f = 0;
                final s s5 = new s(2);
                e5.g(s5.a, 0, 2, false);
                final int w = s5.w();
                if (w >> 2 == 16382) {
                    e5.f = 0;
                    this.k = w;
                    final j e6 = this.e;
                    final int a19 = c0.a;
                    final long d = e5.d;
                    final long c5 = e5.c;
                    this.i.getClass();
                    final p i5 = this.i;
                    Object a20;
                    if (i5.k != null) {
                        a20 = new o(i5, d);
                    }
                    else if (c5 != -1L && i5.j > 0L) {
                        final eb.a l2 = new eb.a(i5, this.k, d, c5);
                        this.l = l2;
                        a20 = l2.a;
                    }
                    else {
                        a20 = new u.b(i5.b());
                    }
                    e6.l((u)a20);
                    this.g = 5;
                    return 0;
                }
                e5.f = 0;
                throw ParserException.createForMalformedContainer("First frame does not start with sync code.", null);
            }
        }
        else {
            final s s6 = new s(4);
            ((e)i).e(s6.a, 0, 4, false);
            if (s6.s() == 1716281667L) {
                this.g = 3;
                return 0;
            }
            throw ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }
    
    @Override
    public final void release() {
    }
}
