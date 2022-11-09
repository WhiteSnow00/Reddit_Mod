// 
// Decompiled by Procyon v0.6.0
// 

package jb;

import db.w$a;
import db.u;
import android.util.Log;
import bd.d0;
import db.t;
import com.google.android.exoplayer2.ParserException;
import ya.n;
import java.io.EOFException;
import db.i;
import java.io.IOException;
import qb.a$b;
import bd.c0;
import vb.l;
import qb.a;
import db.w;
import db.j;
import db.g;
import db.r;
import db.q;
import ya.n$a;
import bd.s;
import ia.c;
import db.h;

public final class d implements h
{
    public static final c u;
    public final int a;
    public final long b;
    public final s c;
    public final n$a d;
    public final q e;
    public final r f;
    public final g g;
    public j h;
    public w i;
    public w j;
    public int k;
    public a l;
    public long m;
    public long n;
    public long o;
    public int p;
    public e q;
    public boolean r;
    public boolean s;
    public long t;
    
    static {
        u = new c(6);
    }
    
    public d() {
        this(0);
    }
    
    public d(final int n) {
        this(-9223372036854775807L);
    }
    
    public d(final long b) {
        this.a = 0;
        this.b = b;
        this.c = new s(10);
        this.d = new n$a();
        this.e = new q();
        this.m = -9223372036854775807L;
        this.f = new r();
        final g g = new g();
        this.g = g;
        this.j = (w)g;
    }
    
    public static long d(final a a) {
        if (a != null) {
            for (int length = a.f.length, i = 0; i < length; ++i) {
                final a$b a$b = a.f[i];
                if (a$b instanceof l) {
                    final l l = (l)a$b;
                    if (l.f.equals("TLEN")) {
                        return c0.J(Long.parseLong(l.h));
                    }
                }
            }
        }
        return -9223372036854775807L;
    }
    
    public final void a(final long n, final long t) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = t;
        final e q = this.q;
        if (q instanceof b && !((b)q).a(t)) {
            this.s = true;
            this.j = (w)this.g;
        }
    }
    
    public final jb.a b(final db.e e, final boolean b) throws IOException {
        e.h(this.c.a, 0, 4, false);
        this.c.B(0);
        this.d.a(this.c.c());
        return new jb.a(e.c, e.d, this.d, b);
    }
    
    public final boolean c(final i i) throws IOException {
        return this.g((db.e)i, true);
    }
    
    public final boolean e(final db.e e) throws IOException {
        final e q = this.q;
        if (q != null) {
            final long g = q.g();
            if (g != -1L && e.k() > g - 4L) {
                return true;
            }
        }
        try {
            return e.h(this.c.a, 0, 4, true) ^ true;
        }
        catch (final EOFException ex) {
            return true;
        }
    }
    
    public final void f(final j h) {
        this.h = h;
        final w k = h.k(0, 1);
        this.i = k;
        this.j = k;
        this.h.b();
    }
    
    public final boolean g(final db.e e, final boolean b) throws IOException {
        int n;
        if (b) {
            n = 32768;
        }
        else {
            n = 131072;
        }
        e.f = 0;
        int n3;
        if (e.d == 0L) {
            Object u;
            if ((this.a & 0x8) == 0x0) {
                u = null;
            }
            else {
                u = jb.d.u;
            }
            final a a = this.f.a(e, (vb.g.a)u);
            this.l = a;
            if (a != null) {
                this.e.b(a);
            }
            final int n2 = n3 = (int)e.k();
            if (!b) {
                e.n(n2);
                n3 = n2;
            }
        }
        else {
            n3 = 0;
        }
        int k = 0;
        int n5;
        int n4 = n5 = k;
        while (true) {
            while (!this.e(e)) {
                this.c.B(0);
                final int c = this.c.c();
                if (k == 0 || (0xFFFE0C00 & c) == ((long)k & 0xFFFFFFFFFFFE0C00L)) {
                    final int a2 = ya.n.a(c);
                    if (a2 != -1) {
                        final int n6 = n4 + 1;
                        int n7;
                        if (n6 == 1) {
                            this.d.a(c);
                            n7 = c;
                        }
                        else {
                            n7 = k;
                            if (n6 == 4) {
                                if (b) {
                                    e.n(n3 + n5);
                                }
                                else {
                                    e.f = 0;
                                }
                                this.k = k;
                                return true;
                            }
                        }
                        e.j(a2 - 4, false);
                        k = n7;
                        n4 = n6;
                        continue;
                    }
                }
                final int n8 = n5 + 1;
                if (n5 == n) {
                    if (b) {
                        return false;
                    }
                    throw ParserException.createForMalformedContainer("Searched too many bytes.", (Throwable)null);
                }
                else {
                    if (b) {
                        e.f = 0;
                        e.j(n3 + n8, false);
                    }
                    else {
                        e.n(1);
                    }
                    n4 = 0;
                    n5 = n8;
                    k = n4;
                }
            }
            if (n4 > 0) {
                continue;
            }
            break;
        }
        throw new EOFException();
    }
    
    public final int h(final i i, final t t) throws IOException {
        d0.g(this.i);
        final int a = c0.a;
        int n19 = 0;
        Label_2214: {
            Label_2111: {
                if (this.k == 0) {
                    try {
                        this.g((db.e)i, false);
                    }
                    catch (final EOFException ex) {
                        break Label_2111;
                    }
                }
                if (this.q == null) {
                    final s s = new s(this.d.c);
                    final byte[] a2 = s.a;
                    final int c = this.d.c;
                    final db.e e = (db.e)i;
                    e.h(a2, 0, c, false);
                    final n$a d = this.d;
                    final int a3 = d.a;
                    int n = 21;
                    if ((a3 & 0x1) != 0x0) {
                        if (d.e != 1) {
                            n = 36;
                        }
                    }
                    else if (d.e == 1) {
                        n = 13;
                    }
                    int n2 = 0;
                    Label_0228: {
                        if (s.c >= n + 4) {
                            s.B(n);
                            final int c2 = s.c();
                            if ((n2 = c2) == 1483304551) {
                                break Label_0228;
                            }
                            if (c2 == 1231971951) {
                                n2 = c2;
                                break Label_0228;
                            }
                        }
                        if (s.c >= 40) {
                            s.B(36);
                            if (s.c() == 1447187017) {
                                n2 = 1447187017;
                                break Label_0228;
                            }
                        }
                        n2 = 0;
                    }
                    final String s2 = ", ";
                    final long n3 = -1L;
                    db.e e2 = null;
                    Object b;
                    if (n2 != 1483304551 && n2 != 1231971951) {
                        if (n2 == 1447187017) {
                            final long c3 = e.c;
                            final long d2 = e.d;
                            final n$a d3 = this.d;
                            s.C(10);
                            final int c4 = s.c();
                            Label_0619: {
                                Label_0469: {
                                    if (c4 > 0) {
                                        final int d4 = d3.d;
                                        final long n4 = c4;
                                        int n5;
                                        if (d4 >= 32000) {
                                            n5 = 1152;
                                        }
                                        else {
                                            n5 = 576;
                                        }
                                        final long p2 = c0.P(n4, n5 * 1000000L, d4);
                                        final int w = s.w();
                                        final int w2 = s.w();
                                        final int w3 = s.w();
                                        s.C(2);
                                        final long n6 = d3.c;
                                        final long[] array = new long[w];
                                        final long[] array2 = new long[w];
                                        long n7 = d2;
                                        for (int j = 0; j < w; ++j) {
                                            array[j] = j * p2 / w;
                                            array2[j] = Math.max(n7, n6 + d2);
                                            int n8;
                                            if (w3 != 1) {
                                                if (w3 != 2) {
                                                    if (w3 != 3) {
                                                        if (w3 != 4) {
                                                            e2 = e;
                                                            break Label_0469;
                                                        }
                                                        n8 = s.u();
                                                    }
                                                    else {
                                                        n8 = s.t();
                                                    }
                                                }
                                                else {
                                                    n8 = s.w();
                                                }
                                            }
                                            else {
                                                n8 = s.r();
                                            }
                                            n7 += n8 * w2;
                                        }
                                        if (c3 != -1L && c3 != n7) {
                                            final StringBuilder sb = new StringBuilder(67);
                                            sb.append("VBRI data size mismatch: ");
                                            sb.append(c3);
                                            sb.append(s2);
                                            sb.append(n7);
                                            Log.w("VbriSeeker", sb.toString());
                                        }
                                        final f f = new f(array, array2, p2, n7);
                                        e2 = e;
                                        b = f;
                                        break Label_0619;
                                    }
                                    e2 = e;
                                }
                                b = null;
                            }
                            e2.n(this.d.c);
                        }
                        else {
                            e2 = e;
                            e2.f = 0;
                            b = null;
                        }
                    }
                    else {
                        final db.e e3 = e;
                        final long c5 = e3.c;
                        final long d5 = e3.d;
                        final n$a d6 = this.d;
                        final int g = d6.g;
                        final int d7 = d6.d;
                        final int c6 = s.c();
                        Object o = null;
                        Label_0919: {
                            if ((c6 & 0x1) == 0x1) {
                                final int u = s.u();
                                if (u != 0) {
                                    final long p3 = c0.P(u, g * 1000000L, d7);
                                    jb.g g2;
                                    if ((c6 & 0x6) != 0x6) {
                                        g2 = new jb.g(d5, d6.c, p3, -1L, (long[])null);
                                    }
                                    else {
                                        final long s3 = s.s();
                                        final long[] array3 = new long[100];
                                        for (int k = 0; k < 100; ++k) {
                                            array3[k] = s.r();
                                        }
                                        if (c5 != -1L) {
                                            final long n9 = d5 + s3;
                                            if (c5 != n9) {
                                                final StringBuilder sb2 = new StringBuilder(67);
                                                sb2.append("XING data size mismatch: ");
                                                sb2.append(c5);
                                                sb2.append(", ");
                                                sb2.append(n9);
                                                Log.w("XingSeeker", sb2.toString());
                                            }
                                        }
                                        g2 = new jb.g(d5, d6.c, p3, s3, array3);
                                    }
                                    o = g2;
                                    break Label_0919;
                                }
                            }
                            o = null;
                        }
                        if (o != null) {
                            final q e4 = this.e;
                            if (e4.a == -1 || e4.b == -1) {
                                e3.f = 0;
                                e3.j(n + 141, false);
                                e3.h(this.c.a, 0, 3, false);
                                this.c.B(0);
                                final q e5 = this.e;
                                final int t2 = this.c.t();
                                final int a4 = t2 >> 12;
                                final int b2 = t2 & 0xFFF;
                                if (a4 <= 0 && b2 <= 0) {
                                    e5.getClass();
                                }
                                else {
                                    e5.a = a4;
                                    e5.b = b2;
                                }
                            }
                        }
                        e3.n(this.d.c);
                        b = o;
                        e2 = e3;
                        if (o != null) {
                            b = o;
                            e2 = e3;
                            if (!((jb.g)o).e()) {
                                b = o;
                                e2 = e3;
                                if (n2 == 1231971951) {
                                    b = this.b(e3, false);
                                    e2 = e3;
                                }
                            }
                        }
                    }
                    final a l = this.l;
                    long d8 = e2.d;
                    Object o2 = null;
                    Label_1347: {
                        if (l != null) {
                            for (int length = l.f.length, n10 = 0; n10 < length; ++n10) {
                                final a$b a$b = l.f[n10];
                                if (a$b instanceof vb.j) {
                                    final vb.j m = (vb.j)a$b;
                                    final long d9 = d(l);
                                    final int length2 = m.j.length;
                                    final int n11 = length2 + 1;
                                    final long[] array4 = new long[n11];
                                    final long[] array5 = new long[n11];
                                    array4[0] = d8;
                                    array5[0] = 0L;
                                    long n12 = 0L;
                                    for (int n13 = 1; n13 <= length2; ++n13) {
                                        final int h = m.h;
                                        final int[] j2 = m.j;
                                        final int n14 = n13 - 1;
                                        d8 += h + j2[n14];
                                        n12 += m.i + m.k[n14];
                                        array4[n13] = d8;
                                        array5[n13] = n12;
                                    }
                                    o2 = new jb.c(d9, array4, array5);
                                    break Label_1347;
                                }
                            }
                        }
                        o2 = null;
                    }
                    Object b3 = null;
                    Label_1535: {
                        if (this.r) {
                            b3 = new e$a();
                        }
                        else {
                            if ((this.a & 0x4) != 0x0) {
                                long i2 = 0L;
                                long g3 = 0L;
                                Label_1397: {
                                    long n15;
                                    if (o2 != null) {
                                        n15 = ((jb.c)o2).c;
                                    }
                                    else {
                                        if (b != null) {
                                            i2 = ((u)b).i();
                                            g3 = ((e)b).g();
                                            break Label_1397;
                                        }
                                        n15 = d(this.l);
                                    }
                                    i2 = n15;
                                    g3 = n3;
                                }
                                b = new b(i2, e2.d, g3);
                            }
                            else if (o2 != null) {
                                b = o2;
                            }
                            else if (b == null) {
                                b = null;
                            }
                            if (b != null) {
                                b3 = b;
                                if (((u)b).e()) {
                                    break Label_1535;
                                }
                                b3 = b;
                                if ((this.a & 0x1) == 0x0) {
                                    break Label_1535;
                                }
                            }
                            b3 = this.b(e2, (this.a & 0x2) != 0x0);
                        }
                    }
                    this.q = (e)b3;
                    this.h.s((u)b3);
                    final w j3 = this.j;
                    final com.google.android.exoplayer2.n$a n$a = new com.google.android.exoplayer2.n$a();
                    final n$a d10 = this.d;
                    n$a.k = d10.b;
                    n$a.l = 4096;
                    n$a.x = d10.e;
                    n$a.y = d10.d;
                    final q e6 = this.e;
                    n$a.A = e6.a;
                    n$a.B = e6.b;
                    a l2;
                    if ((this.a & 0x8) != 0x0) {
                        l2 = null;
                    }
                    else {
                        l2 = this.l;
                    }
                    n$a.i = l2;
                    j3.a(new com.google.android.exoplayer2.n(n$a));
                    this.o = e2.d;
                }
                else {
                    final long o3 = this.o;
                    if (o3 != 0L) {
                        final db.e e7 = (db.e)i;
                        final long d11 = e7.d;
                        if (d11 < o3) {
                            e7.n((int)(o3 - d11));
                        }
                    }
                }
                Label_2132: {
                    if (this.p == 0) {
                        final db.e e8 = (db.e)i;
                        e8.f = 0;
                        if (this.e(e8)) {
                            break Label_2111;
                        }
                        this.c.B(0);
                        final int c7 = this.c.c();
                        if ((0xFFFE0C00 & c7) != ((long)this.k & 0xFFFFFFFFFFFE0C00L) || ya.n.a(c7) == -1) {
                            e8.n(1);
                            this.k = 0;
                            break Label_2132;
                        }
                        this.d.a(c7);
                        if (this.m == -9223372036854775807L) {
                            this.m = this.q.b(e8.d);
                            if (this.b != -9223372036854775807L) {
                                this.m += this.b - this.q.b(0L);
                            }
                        }
                        final n$a d12 = this.d;
                        final int c8 = d12.c;
                        this.p = c8;
                        final e q = this.q;
                        if (q instanceof b) {
                            final b b4 = (b)q;
                            final long n16 = (this.n + d12.g) * 1000000L / d12.d + this.m;
                            final long d13 = e8.d;
                            final long n17 = c8;
                            if (!b4.a(n16)) {
                                b4.b.a(n16);
                                b4.c.a(d13 + n17);
                            }
                            if (this.s && b4.a(this.t)) {
                                this.s = false;
                                this.j = this.i;
                            }
                        }
                    }
                    final int e9 = this.j.e((zc.f)i, this.p, true);
                    if (e9 == -1) {
                        break Label_2111;
                    }
                    if ((this.p -= e9) <= 0) {
                        final w j4 = this.j;
                        final long n18 = this.n;
                        final long m2 = this.m;
                        final n$a d14 = this.d;
                        j4.b(m2 + n18 * 1000000L / d14.d, 1, d14.c, 0, (w$a)null);
                        this.n += this.d.g;
                        this.p = 0;
                        n19 = 0;
                        break Label_2214;
                    }
                }
                n19 = 0;
                break Label_2214;
            }
            n19 = -1;
        }
        if (n19 == -1) {
            final e q2 = this.q;
            if (q2 instanceof b) {
                final long d15 = this.n * 1000000L / this.d.d + this.m;
                if (((u)q2).i() != d15) {
                    final e q3 = this.q;
                    ((b)q3).d = d15;
                    this.h.s((u)q3);
                }
            }
        }
        return n19;
    }
    
    public final void release() {
    }
}
