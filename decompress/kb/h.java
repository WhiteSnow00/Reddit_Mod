// 
// Decompiled by Procyon v0.6.0
// 

package kb;

import java.util.Arrays;
import wb.d;
import android.util.Log;
import android.util.Pair;
import java.util.List;
import db.w;
import db.u$b;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import qb.a$b;
import db.w$a;
import ya.c;
import zc.f;
import com.google.android.exoplayer2.ParserException;
import db.v;
import db.u$a;
import java.io.IOException;
import db.i;
import db.x;
import bd.c0;
import bd.q;
import wb.b;
import java.util.ArrayList;
import java.util.ArrayDeque;
import bd.t;
import db.u;

public final class h implements db.h, u
{
    public final int a;
    public final t b;
    public final t c;
    public final t d;
    public final t e;
    public final ArrayDeque<a.a> f;
    public final j g;
    public final ArrayList h;
    public int i;
    public int j;
    public long k;
    public int l;
    public t m;
    public int n;
    public int o;
    public int p;
    public int q;
    public db.j r;
    public h.h$a[] s;
    public long[][] t;
    public int u;
    public long v;
    public int w;
    public b x;
    
    static {
        new(android.support.v4.media.a.class)();
    }
    
    public h() {
        this(0);
    }
    
    public h(final int n) {
        this.a = 0;
        this.i = 0;
        this.g = new j();
        this.h = new ArrayList();
        this.e = new t(16);
        this.f = new ArrayDeque<a.a>();
        this.b = new t(bd.q.a);
        this.c = new t(4);
        this.d = new t();
        this.n = -1;
    }
    
    public final void a(final long n, final long n2) {
        this.f.clear();
        this.l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (n == 0L) {
            if (this.i != 3) {
                this.i = 0;
                this.l = 0;
            }
            else {
                final j g = this.g;
                g.a.clear();
                g.b = 0;
                this.h.clear();
            }
        }
        else {
            final h.h$a[] s = this.s;
            if (s != null) {
                final int length = s.length;
                int i = 0;
            Label_0108:
                while (i < length) {
                    final h.h$a h$a = s[i];
                    final o b = h$a.b;
                    while (true) {
                        for (int j = c0.f(b.f, n2, false); j >= 0; --j) {
                            if ((b.g[j] & 0x1) != 0x0) {
                                int a = j;
                                if (j == -1) {
                                    a = b.a(n2);
                                }
                                h$a.e = a;
                                final x d = h$a.d;
                                if (d != null) {
                                    d.b = false;
                                    d.c = 0;
                                }
                                ++i;
                                continue Label_0108;
                            }
                        }
                        int j = -1;
                        continue;
                    }
                }
            }
        }
    }
    
    public final boolean c(final i i) throws IOException {
        return kb.k.a(i, false, (this.a & 0x2) != 0x0);
    }
    
    public final u$a d(long min) {
        long n = min;
        final h.h$a[] s = this.s;
        s.getClass();
        if (s.length == 0) {
            final v c = db.v.c;
            return new u$a(c, c);
        }
        long n2 = -1L;
        final int u = this.u;
        long n5 = 0L;
        long min2 = 0L;
        Label_0257: {
            if (u != -1) {
                final o b = this.s[u].b;
                int i = c0.f(b.f, n, false);
                while (true) {
                    while (i >= 0) {
                        if ((b.g[i] & 0x1) != 0x0) {
                            int a = i;
                            if (i == -1) {
                                a = b.a(n);
                            }
                            if (a == -1) {
                                final v c2 = db.v.c;
                                return new u$a(c2, c2);
                            }
                            final long n3 = b.f[a];
                            final long n4 = b.c[a];
                            Label_0226: {
                                if (n3 < n && a < b.b - 1) {
                                    final int a2 = b.a(n);
                                    if (a2 != -1 && a2 != a) {
                                        min = b.f[a2];
                                        n2 = b.c[a2];
                                        break Label_0226;
                                    }
                                }
                                min = -9223372036854775807L;
                            }
                            n = n3;
                            n5 = min;
                            min = n2;
                            min2 = n4;
                            break Label_0257;
                        }
                        else {
                            --i;
                        }
                    }
                    i = -1;
                    continue;
                }
            }
            min2 = Long.MAX_VALUE;
            min = -1L;
            n5 = -9223372036854775807L;
        }
        int n6 = 0;
        while (true) {
            final h.h$a[] s2 = this.s;
            if (n6 >= s2.length) {
                break;
            }
            Label_0472: {
                if (n6 != this.u) {
                    final o b2 = s2[n6].b;
                    int j = c0.f(b2.f, n, false);
                    while (true) {
                        while (j >= 0) {
                            if ((b2.g[j] & 0x1) != 0x0) {
                                int a3 = j;
                                if (j == -1) {
                                    a3 = b2.a(n);
                                }
                                if (a3 != -1) {
                                    min2 = Math.min(b2.c[a3], min2);
                                }
                                if (n5 != -9223372036854775807L) {
                                    int k = c0.f(b2.f, n5, false);
                                    while (true) {
                                        while (k >= 0) {
                                            if ((b2.g[k] & 0x1) != 0x0) {
                                                int a4 = k;
                                                if (k == -1) {
                                                    a4 = b2.a(n5);
                                                }
                                                if (a4 == -1) {
                                                    break Label_0472;
                                                }
                                                min = Math.min(b2.c[a4], min);
                                                break Label_0472;
                                            }
                                            else {
                                                --k;
                                            }
                                        }
                                        k = -1;
                                        continue;
                                    }
                                }
                                break Label_0472;
                            }
                            else {
                                --j;
                            }
                        }
                        j = -1;
                        continue;
                    }
                }
            }
            ++n6;
        }
        final v v = new v(n, min2);
        if (n5 == -9223372036854775807L) {
            return new u$a(v, v);
        }
        return new u$a(v, new v(n5, min));
    }
    
    public final boolean e() {
        return true;
    }
    
    public final void f(final db.j r) {
        this.r = r;
    }
    
    public final int h(final i i, final db.t t) throws IOException {
        while (true) {
            final int j = this.i;
            final boolean b = false;
            if (j != 0) {
                if (j != 1) {
                    if (j == 2) {
                        final long position = i.getPosition();
                        if (this.n == -1) {
                            long n = Long.MAX_VALUE;
                            long n3;
                            long n2 = n3 = Long.MAX_VALUE;
                            int n4 = 0;
                            int n5 = -1;
                            int n6 = -1;
                            int n7 = 1;
                            int n8 = 1;
                            while (true) {
                                final h.h$a[] s = this.s;
                                final int a = c0.a;
                                if (n4 >= s.length) {
                                    break;
                                }
                                final h.h$a h$a = s[n4];
                                final int e = h$a.e;
                                final o b2 = h$a.b;
                                long n9;
                                if (e == b2.b) {
                                    n9 = n;
                                }
                                else {
                                    final long n10 = b2.c[e];
                                    final long n11 = this.t[n4][e];
                                    final long n12 = n10 - position;
                                    int n13;
                                    if (n12 >= 0L && n12 < 262144L) {
                                        n13 = 0;
                                    }
                                    else {
                                        n13 = 1;
                                    }
                                    int n14 = 0;
                                    int n15 = 0;
                                    long n16 = 0L;
                                    long n17 = 0L;
                                    Label_1271: {
                                        if (n13 != 0 || n8 == 0) {
                                            n14 = n6;
                                            n15 = n8;
                                            n16 = n2;
                                            n17 = n3;
                                            if (n13 != n8) {
                                                break Label_1271;
                                            }
                                            n14 = n6;
                                            n15 = n8;
                                            n16 = n2;
                                            n17 = n3;
                                            if (n12 >= n3) {
                                                break Label_1271;
                                            }
                                        }
                                        n15 = n13;
                                        n14 = n4;
                                        n17 = n12;
                                        n16 = n11;
                                    }
                                    n6 = n14;
                                    n8 = n15;
                                    n9 = n;
                                    n2 = n16;
                                    n3 = n17;
                                    if (n11 < n) {
                                        n5 = n4;
                                        n3 = n17;
                                        n2 = n16;
                                        n9 = n11;
                                        n8 = n15;
                                        n7 = n13;
                                        n6 = n14;
                                    }
                                }
                                ++n4;
                                n = n9;
                            }
                            if (n == Long.MAX_VALUE || n7 == 0 || n2 < n + 10485760L) {
                                n5 = n6;
                            }
                            if ((this.n = n5) == -1) {
                                return -1;
                            }
                        }
                        final h.h$a[] s2 = this.s;
                        final int a2 = c0.a;
                        final h.h$a h$a2 = s2[this.n];
                        final w c = h$a2.c;
                        final int e2 = h$a2.e;
                        final o b3 = h$a2.b;
                        final long a3 = b3.c[e2];
                        final int n19 = b3.d[e2];
                        final x d = h$a2.d;
                        final long n20 = a3 - position + this.o;
                        int n18;
                        if (n20 >= 0L && n20 < 262144L) {
                            long n21 = n20;
                            int n22 = n19;
                            if (h$a2.a.g == 1) {
                                n21 = n20 + 8L;
                                n22 = n19 - 8;
                            }
                            i.n((int)n21);
                            final l a4 = h$a2.a;
                            final int k = a4.j;
                            int n24;
                            if (k != 0) {
                                final byte[] a5 = this.c.a;
                                a5[0] = 0;
                                a5[2] = (a5[1] = 0);
                                final int n23 = 4 - k;
                                while (true) {
                                    n24 = n22;
                                    if (this.p >= n22) {
                                        break;
                                    }
                                    final int q = this.q;
                                    if (q == 0) {
                                        i.readFully(a5, n23, k);
                                        this.o += k;
                                        this.c.B(0);
                                        final int c2 = this.c.c();
                                        if (c2 < 0) {
                                            throw ParserException.createForMalformedContainer("Invalid NAL length", (Throwable)null);
                                        }
                                        this.q = c2;
                                        this.b.B(0);
                                        c.c(4, this.b);
                                        this.p += 4;
                                        n22 += n23;
                                    }
                                    else {
                                        final int e3 = c.e((f)i, q, false);
                                        this.o += e3;
                                        this.p += e3;
                                        this.q -= e3;
                                    }
                                }
                            }
                            else {
                                int n25;
                                if ("audio/ac4".equals(a4.f.q)) {
                                    if (this.p == 0) {
                                        ya.c.a(n22, this.d);
                                        c.c(7, this.d);
                                        this.p += 7;
                                    }
                                    n25 = n22 + 7;
                                }
                                else {
                                    n25 = n22;
                                    if (d != null) {
                                        d.c(i);
                                        n25 = n22;
                                    }
                                }
                                while (true) {
                                    final int p2 = this.p;
                                    if (p2 >= (n24 = n25)) {
                                        break;
                                    }
                                    final int e4 = c.e((f)i, n25 - p2, false);
                                    this.o += e4;
                                    this.p += e4;
                                    this.q -= e4;
                                }
                            }
                            final o b4 = h$a2.b;
                            final long n26 = b4.f[e2];
                            final int n27 = b4.g[e2];
                            if (d != null) {
                                d.b(c, n26, n27, n24, 0, (w$a)null);
                                if (e2 + 1 == h$a2.b.b) {
                                    d.a(c, (w$a)null);
                                }
                            }
                            else {
                                c.b(n26, n27, n24, 0, (w$a)null);
                            }
                            ++h$a2.e;
                            this.n = -1;
                            this.o = 0;
                            this.p = 0;
                            this.q = 0;
                            n18 = 0;
                        }
                        else {
                            t.a = a3;
                            n18 = 1;
                        }
                        return n18;
                    }
                    if (j == 3) {
                        final j g = this.g;
                        final ArrayList h = this.h;
                        final int b5 = g.b;
                        if (b5 != 0) {
                            if (b5 != 1) {
                                if (b5 != 2) {
                                    if (b5 != 3) {
                                        throw new IllegalStateException();
                                    }
                                    final long position2 = i.getPosition();
                                    final int n28 = (int)(i.getLength() - i.getPosition() - g.c);
                                    final t t2 = new t(n28);
                                    i.readFully(t2.a, 0, n28);
                                    for (int l = 0; l < g.a.size(); ++l) {
                                        final j$a j$a = g.a.get(l);
                                        t2.B((int)(j$a.a - position2));
                                        t2.C(4);
                                        final int e5 = t2.e();
                                        final String o = t2.o(e5);
                                        int n29 = 0;
                                        Label_0326: {
                                            switch (o) {
                                                case "Super_SlowMotion_BGM": {
                                                    n29 = 4;
                                                    break Label_0326;
                                                }
                                                case "Super_SlowMotion_Deflickering_On": {
                                                    n29 = 3;
                                                    break Label_0326;
                                                }
                                                case "Super_SlowMotion_Data": {
                                                    n29 = 2;
                                                    break Label_0326;
                                                }
                                                case "Super_SlowMotion_Edit_Data": {
                                                    n29 = 1;
                                                    break Label_0326;
                                                }
                                                case "SlowMotion_Data": {
                                                    n29 = 0;
                                                    break Label_0326;
                                                }
                                                default:
                                                    break;
                                            }
                                            n29 = -1;
                                        }
                                        int n30;
                                        if (n29 != 0) {
                                            if (n29 != 1) {
                                                if (n29 != 2) {
                                                    if (n29 != 3) {
                                                        if (n29 != 4) {
                                                            throw ParserException.createForMalformedContainer("Invalid SEF name", (Throwable)null);
                                                        }
                                                        n30 = 2817;
                                                    }
                                                    else {
                                                        n30 = 2820;
                                                    }
                                                }
                                                else {
                                                    n30 = 2816;
                                                }
                                            }
                                            else {
                                                n30 = 2819;
                                            }
                                        }
                                        else {
                                            n30 = 2192;
                                        }
                                        final int b6 = j$a.b;
                                        if (n30 != 2192) {
                                            if (n30 != 2816 && n30 != 2817 && n30 != 2819) {
                                                if (n30 != 2820) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                        }
                                        else {
                                            final ArrayList<wb.c.b> list = new ArrayList<wb.c.b>();
                                            final List a6 = kb.j.e.a((CharSequence)t2.o(b6 - (e5 + 8)));
                                            int n31 = 0;
                                            while (n31 < a6.size()) {
                                                final List a7 = kb.j.d.a((CharSequence)a6.get(n31));
                                                if (a7.size() == 3) {
                                                    try {
                                                        list.add(new wb.c.b(1 << Integer.parseInt((String)a7.get(2)) - 1, Long.parseLong((String)a7.get(0)), Long.parseLong((String)a7.get(1))));
                                                        ++n31;
                                                        continue;
                                                    }
                                                    catch (final NumberFormatException ex) {
                                                        throw ParserException.createForMalformedContainer((String)null, (Throwable)ex);
                                                    }
                                                }
                                                throw ParserException.createForMalformedContainer((String)null, (Throwable)null);
                                            }
                                            h.add(new wb.c(list));
                                        }
                                    }
                                    t.a = 0L;
                                }
                                else {
                                    final long length = i.getLength();
                                    final int n32 = g.c - 12 - 8;
                                    final t t3 = new t(n32);
                                    i.readFully(t3.a, 0, n32);
                                    for (int n33 = 0; n33 < n32 / 12; ++n33) {
                                        t3.C(2);
                                        final short g2 = t3.g();
                                        if (g2 != 2192 && g2 != 2816) {
                                            if (g2 != 2817 && g2 != 2819) {
                                                if (g2 != 2820) {
                                                    t3.C(8);
                                                    continue;
                                                }
                                            }
                                        }
                                        g.a.add(new j$a(length - g.c - t3.e(), t3.e()));
                                    }
                                    if (g.a.isEmpty()) {
                                        t.a = 0L;
                                    }
                                    else {
                                        g.b = 3;
                                        t.a = ((j$a)g.a.get(0)).a;
                                    }
                                }
                            }
                            else {
                                final t t4 = new t(8);
                                i.readFully(t4.a, 0, 8);
                                g.c = t4.e() + 8;
                                if (t4.c() != 1397048916) {
                                    t.a = 0L;
                                }
                                else {
                                    t.a = i.getPosition() - (g.c - 12);
                                    g.b = 2;
                                }
                            }
                        }
                        else {
                            final long length2 = i.getLength();
                            long a8;
                            if (length2 != -1L && length2 >= 8L) {
                                a8 = length2 - 8L;
                            }
                            else {
                                a8 = 0L;
                            }
                            t.a = a8;
                            g.b = 1;
                        }
                        if (t.a == 0L) {
                            this.i = 0;
                            this.l = 0;
                        }
                        return 1;
                    }
                    throw new IllegalStateException();
                }
                else {
                    final long n34 = this.k - this.l;
                    final long position3 = i.getPosition();
                    final t m = this.m;
                    boolean b7 = false;
                    Label_2272: {
                        if (m != null) {
                            i.readFully(m.a, this.l, (int)n34);
                            if (this.j == 1718909296) {
                                m.B(8);
                                final int c3 = m.c();
                                int w;
                                if (c3 != 1751476579) {
                                    if (c3 != 1903435808) {
                                        w = 0;
                                    }
                                    else {
                                        w = 1;
                                    }
                                }
                                else {
                                    w = 2;
                                }
                                Label_2175: {
                                    if (w == 0) {
                                        m.C(4);
                                        while (m.c - m.b > 0) {
                                            final int c4 = m.c();
                                            if (c4 != 1751476579) {
                                                if (c4 != 1903435808) {
                                                    w = 0;
                                                }
                                                else {
                                                    w = 1;
                                                }
                                            }
                                            else {
                                                w = 2;
                                            }
                                            if (w != 0) {
                                                break Label_2175;
                                            }
                                        }
                                        w = 0;
                                    }
                                }
                                this.w = w;
                            }
                            else if (!this.f.isEmpty()) {
                                this.f.peek().c.add(new a.b(this.j, m));
                            }
                        }
                        else {
                            if (n34 >= 262144L) {
                                t.a = i.getPosition() + n34;
                                b7 = true;
                                break Label_2272;
                            }
                            i.n((int)n34);
                        }
                        b7 = false;
                    }
                    this.j(position3 + n34);
                    int n35 = b ? 1 : 0;
                    if (b7) {
                        n35 = (b ? 1 : 0);
                        if (this.i != 2) {
                            n35 = 1;
                        }
                    }
                    if (n35 != 0) {
                        return 1;
                    }
                    continue;
                }
            }
            else {
                boolean b8 = false;
                Label_3267: {
                    if (this.l == 0) {
                        if (!i.f(this.e.a, 0, 8, true)) {
                            if (this.w == 2 && (this.a & 0x2) != 0x0) {
                                final db.j r = this.r;
                                r.getClass();
                                final w k2 = r.k(0, 4);
                                final b x = this.x;
                                qb.a i2;
                                if (x == null) {
                                    i2 = null;
                                }
                                else {
                                    i2 = new qb.a(new a$b[] { (a$b)x });
                                }
                                final n$a n$a = new n$a();
                                n$a.i = i2;
                                k2.a(new n(n$a));
                                r.b();
                                r.s((u)new u$b(-9223372036854775807L));
                            }
                            b8 = false;
                            break Label_3267;
                        }
                        this.l = 8;
                        this.e.B(0);
                        this.k = this.e.s();
                        this.j = this.e.c();
                    }
                    final long k3 = this.k;
                    if (k3 == 1L) {
                        i.readFully(this.e.a, 8, 8);
                        this.l += 8;
                        this.k = this.e.v();
                    }
                    else if (k3 == 0L) {
                        long n37;
                        final long n36 = n37 = i.getLength();
                        if (n36 == -1L) {
                            final a.a a9 = this.f.peek();
                            n37 = n36;
                            if (a9 != null) {
                                n37 = a9.b;
                            }
                        }
                        if (n37 != -1L) {
                            this.k = n37 - i.getPosition() + this.l;
                        }
                    }
                    final long k4 = this.k;
                    final int l2 = this.l;
                    if (k4 < l2) {
                        throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
                    }
                    final int j2 = this.j;
                    if (j2 == 1836019574 || j2 == 1953653099 || j2 == 1835297121 || j2 == 1835626086 || j2 == 1937007212 || j2 == 1701082227 || j2 == 1835365473) {
                        final long position4 = i.getPosition();
                        final long k5 = this.k;
                        final long n38 = this.l;
                        final long n39 = position4 + k5 - n38;
                        if (k5 != n38 && this.j == 1835365473) {
                            this.d.y(8);
                            i.b(0, 8, this.d.a);
                            final t d2 = this.d;
                            final byte[] a10 = kb.b.a;
                            final int b9 = d2.b;
                            d2.C(4);
                            int n40 = b9;
                            if (d2.c() != 1751411826) {
                                n40 = b9 + 4;
                            }
                            d2.B(n40);
                            i.n(this.d.b);
                            i.i();
                        }
                        this.f.push(new a.a(this.j, n39));
                        if (this.k == this.l) {
                            this.j(n39);
                        }
                        else {
                            this.i = 0;
                            this.l = 0;
                        }
                    }
                    else if (j2 == 1835296868 || j2 == 1836476516 || j2 == 1751411826 || j2 == 1937011556 || j2 == 1937011827 || j2 == 1937011571 || j2 == 1668576371 || j2 == 1701606260 || j2 == 1937011555 || j2 == 1937011578 || j2 == 1937013298 || j2 == 1937007471 || j2 == 1668232756 || j2 == 1953196132 || j2 == 1718909296 || j2 == 1969517665 || j2 == 1801812339 || j2 == 1768715124) {
                        ah0.b.H(l2 == 8);
                        ah0.b.H(this.k <= 2147483647L);
                        final t m2 = new t((int)this.k);
                        System.arraycopy(this.e.a, 0, m2.a, 0, 8);
                        this.m = m2;
                        this.i = 1;
                    }
                    else {
                        final long position5 = i.getPosition();
                        final long n41 = this.l;
                        final long n42 = position5 - n41;
                        if (this.j == 1836086884) {
                            this.x = new b(0L, n42, -9223372036854775807L, n42 + n41, this.k - n41);
                        }
                        this.m = null;
                        this.i = 1;
                    }
                    b8 = true;
                }
                if (!b8) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    public final long i() {
        return this.v;
    }
    
    public final void j(final long n) throws ParserException {
        h h2;
        h h;
        h h3;
        for (h = (h2 = this); !h2.f.isEmpty() && h2.f.peek().b == n; h2 = h3) {
            final a.a a = h2.f.pop();
            if (a.a == 1836019574) {
                ArrayList<h.h$a> list = new ArrayList<h.h$a>();
                final boolean b = h2.w == 1;
                final db.q q = new db.q();
                final a.b c = a.c(1969517665);
                qb.a a3;
                qb.a a4;
                ArrayList<h.h$a> list2;
                if (c != null) {
                    final byte[] a2 = kb.b.a;
                    final t b2 = c.b;
                    b2.B(8);
                    Object o = null;
                    Object o2 = null;
                    while (true) {
                        final int c2 = b2.c;
                        final int b3 = b2.b;
                        if (c2 - b3 < 8) {
                            final Pair create = Pair.create(o, o2);
                            a3 = (qb.a)create.first;
                            a4 = (qb.a)create.second;
                            if (a3 != null) {
                                q.b(a3);
                            }
                            list2 = list;
                            break;
                        }
                        final int c3 = b2.c();
                        final int c4 = b2.c();
                        Object o5 = null;
                        Object o6 = null;
                        Label_1595: {
                            if (c4 == 1835365473) {
                                b2.B(b3);
                                b2.C(8);
                                final int b4 = b2.b;
                                b2.C(4);
                                int n2 = b4;
                                if (b2.c() != 1751411826) {
                                    n2 = b4 + 4;
                                }
                                b2.B(n2);
                                Object o4 = null;
                                Label_1383: {
                                Label_1380:
                                    while (true) {
                                        final int b5 = b2.b;
                                        if (b5 >= b3 + c3) {
                                            break;
                                        }
                                        final int c5 = b2.c();
                                        if (b2.c() == 1768715124) {
                                            b2.B(b5);
                                            final int n3 = b5 + c5;
                                            b2.C(8);
                                            final ArrayList<Throwable> list3 = new ArrayList<Throwable>();
                                            final ArrayList<h.h$a> list4 = list;
                                            int b6;
                                            int n4;
                                            int n5;
                                            int n6;
                                            String[] a5;
                                            String s = null;
                                            vb.l l;
                                            int c6;
                                            int c7;
                                            String m;
                                            int b7;
                                            String i;
                                            vb.i j;
                                            Object o3 = null;
                                            String value;
                                            String concat;
                                            Block_100_Outer:Block_95_Outer:
                                            while (true) {
                                                b6 = b2.b;
                                                if (b6 < n3) {
                                                    n4 = b2.c() + b6;
                                                    n5 = b2.c();
                                                    n6 = (n5 >> 24 & 0xFF);
                                                    Label_1328: {
                                                        Label_1305: {
                                                            Label_1272: {
                                                                Label_0988: {
                                                                    if (n6 == 169 || n6 == 253) {
                                                                        break Label_0988;
                                                                    }
                                                                    Label_0452: {
                                                                        if (n5 != 1735291493) {
                                                                            break Label_0452;
                                                                        }
                                                                        try {
                                                                            n5 = kb.f.f(b2);
                                                                            Label_0416: {
                                                                                if (n5 > 0) {
                                                                                    a5 = kb.f.a;
                                                                                    if (n5 <= 192) {
                                                                                        s = a5[n5 - 1];
                                                                                        break Label_0416;
                                                                                    }
                                                                                }
                                                                                s = null;
                                                                            }
                                                                            if (s != null) {
                                                                                l = new vb.l("TCON", null, s);
                                                                                break Label_1305;
                                                                            }
                                                                            Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                            break Label_1272;
                                                                            Label_0926_Outer:Block_106_Outer:
                                                                            while (true) {
                                                                                while (true) {
                                                                                    Label_0926:Block_96_Outer:
                                                                                    while (true) {
                                                                                        Block_104: {
                                                                                        Block_105:
                                                                                            while (true) {
                                                                                            Label_0820:
                                                                                                while (true) {
                                                                                                    Block_102: {
                                                                                                        while (true) {
                                                                                                            while (true) {
                                                                                                                Block_87: {
                                                                                                                    Block_94: {
                                                                                                                        while (true) {
                                                                                                                            Block_108_Outer:Block_97_Outer:
                                                                                                                            while (true) {
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                    Block_101:
                                                                                                                                        while (true) {
                                                                                                                                            c6 = b2.c();
                                                                                                                                            c7 = b2.c();
                                                                                                                                            b2.C(4);
                                                                                                                                            iftrue(Label_0877:)(c7 != 1835360622);
                                                                                                                                            break Block_104;
                                                                                                                                            kb.f.d(n5, b2, "TVSHOWSORT");
                                                                                                                                            break Label_1305;
                                                                                                                                            Label_0803: {
                                                                                                                                                iftrue(Label_1220:)(n5 != 757935405);
                                                                                                                                            }
                                                                                                                                            break Block_102;
                                                                                                                                            Label_0615:
                                                                                                                                            iftrue(Label_0638:)(n5 != 1936679276);
                                                                                                                                            break Block_94;
                                                                                                                                            Block_92: {
                                                                                                                                            Block_89_Outer:
                                                                                                                                                while (true) {
                                                                                                                                                    kb.f.a(n5, b2);
                                                                                                                                                    break Label_1305;
                                                                                                                                                    Label_0569:
                                                                                                                                                    iftrue(Label_0592:)(n5 != 1631670868);
                                                                                                                                                    break Block_92;
                                                                                                                                                    Label_0780:
                                                                                                                                                    iftrue(Label_0803:)(n5 != 1953919848);
                                                                                                                                                    break Block_101;
                                                                                                                                                    Block_98: {
                                                                                                                                                        while (true) {
                                                                                                                                                            kb.f.e(n5, "TBPM", b2, true, false);
                                                                                                                                                            break Label_1305;
                                                                                                                                                            Label_0707:
                                                                                                                                                            iftrue(Label_0732:)(n5 != 1920233063);
                                                                                                                                                            break Block_98;
                                                                                                                                                            Label_0501:
                                                                                                                                                            iftrue(Label_0526:)(n5 != 1953329263);
                                                                                                                                                            continue Block_95_Outer;
                                                                                                                                                        }
                                                                                                                                                        Label_0592:
                                                                                                                                                        iftrue(Label_0615:)(n5 != 1936682605);
                                                                                                                                                        Block_93: {
                                                                                                                                                            break Block_93;
                                                                                                                                                            kb.f.d(n5, b2, "TSOA");
                                                                                                                                                            break Label_1305;
                                                                                                                                                            break Label_0820;
                                                                                                                                                        }
                                                                                                                                                        kb.f.d(n5, b2, "TSOT");
                                                                                                                                                        break Label_1305;
                                                                                                                                                        kb.f.e(n5, "ITUNESGAPLESS", b2, false, true);
                                                                                                                                                        break Label_1305;
                                                                                                                                                        m = null;
                                                                                                                                                        iftrue(Label_0478:)(n5 != 1684632427);
                                                                                                                                                        break Block_87;
                                                                                                                                                    }
                                                                                                                                                    kb.f.e(n5, "ITUNESADVISORY", b2, false, false);
                                                                                                                                                    break Label_1305;
                                                                                                                                                    n6 = (0xFFFFFF & n5);
                                                                                                                                                    iftrue(Label_1021:)(n6 != 6516084);
                                                                                                                                                    continue Block_89_Outer;
                                                                                                                                                }
                                                                                                                                                Label_0526:
                                                                                                                                                iftrue(Label_0551:)(n5 != 1668311404);
                                                                                                                                                break Label_0820;
                                                                                                                                                while (true) {
                                                                                                                                                    break Label_1272;
                                                                                                                                                    iftrue(Label_0948:)(n6 != -1);
                                                                                                                                                    continue Block_108_Outer;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            kb.f.d(n5, b2, "TPE2");
                                                                                                                                            break Label_1305;
                                                                                                                                            kb.f.d(n5, b2, "TSOC");
                                                                                                                                            break Label_1305;
                                                                                                                                            kb.f.d(n5, b2, "TSOP");
                                                                                                                                            break Label_1305;
                                                                                                                                            b7 = b2.b;
                                                                                                                                            iftrue(Label_0929:)(b7 >= n4);
                                                                                                                                            continue Block_100_Outer;
                                                                                                                                        }
                                                                                                                                        kb.f.d(n5, b2, "TVSHOW");
                                                                                                                                        break Label_1305;
                                                                                                                                        b2.C(c6 - 12);
                                                                                                                                        continue Label_0926;
                                                                                                                                        kb.f.c(n5, b2, "TRCK");
                                                                                                                                        break Label_1305;
                                                                                                                                        Label_0551: {
                                                                                                                                            iftrue(Label_0569:)(n5 != 1668249202);
                                                                                                                                        }
                                                                                                                                        break Label_0926;
                                                                                                                                        Label_0929:
                                                                                                                                        iftrue(Label_1272:)(m == null || i == null);
                                                                                                                                        continue Block_97_Outer;
                                                                                                                                    }
                                                                                                                                    Label_0684: {
                                                                                                                                        iftrue(Label_0707:)(n5 != 1936679791);
                                                                                                                                    }
                                                                                                                                    continue Block_96_Outer;
                                                                                                                                }
                                                                                                                                Label_0948: {
                                                                                                                                    b2.B(n6);
                                                                                                                                }
                                                                                                                                b2.C(16);
                                                                                                                                j = new vb.i(m, i, b2.m(n5 - 16));
                                                                                                                                break Label_1305;
                                                                                                                                Label_0877:
                                                                                                                                iftrue(Label_0900:)(c7 != 1851878757);
                                                                                                                                break Block_105;
                                                                                                                                Label_0732:
                                                                                                                                iftrue(Label_0757:)(n5 != 1885823344);
                                                                                                                                continue Block_108_Outer;
                                                                                                                            }
                                                                                                                            Label_0478: {
                                                                                                                                iftrue(Label_0501:)(n5 != 1953655662);
                                                                                                                            }
                                                                                                                            continue Block_106_Outer;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    kb.f.d(n5, b2, "TSO2");
                                                                                                                    break Label_1305;
                                                                                                                }
                                                                                                                kb.f.c(n5, b2, "TPOS");
                                                                                                                break Label_1305;
                                                                                                                Label_0757: {
                                                                                                                    iftrue(Label_0780:)(n5 != 1936683886);
                                                                                                                }
                                                                                                                continue Block_95_Outer;
                                                                                                            }
                                                                                                            n5 = c6;
                                                                                                            n6 = b7;
                                                                                                            continue Block_106_Outer;
                                                                                                        }
                                                                                                    }
                                                                                                    n6 = -1;
                                                                                                    n5 = -1;
                                                                                                    i = null;
                                                                                                    continue Label_0820;
                                                                                                }
                                                                                                kb.f.e(n5, "TCMP", b2, true, true);
                                                                                                break Label_1305;
                                                                                                Label_0661: {
                                                                                                    iftrue(Label_0684:)(n5 != 1936679265);
                                                                                                }
                                                                                                continue Block_106_Outer;
                                                                                            }
                                                                                            i = b2.m(c6 - 12);
                                                                                            continue Label_0926;
                                                                                        }
                                                                                        m = b2.m(c6 - 12);
                                                                                        continue Label_0926;
                                                                                    }
                                                                                    kb.f.b(b2);
                                                                                    break Label_1305;
                                                                                    Label_0900: {
                                                                                        iftrue(Label_0916:)(c7 != 1684108385);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                Label_0638: {
                                                                                    iftrue(Label_0661:)(n5 != 1936679282);
                                                                                }
                                                                                continue Label_0926_Outer;
                                                                            }
                                                                        }
                                                                        finally {
                                                                            break Label_1328;
                                                                        }
                                                                    }
                                                                }
                                                                Label_1021: {
                                                                    if (n6 == 7233901 || n6 == 7631467) {
                                                                        o3 = kb.f.d(n5, b2, "TIT2");
                                                                        break Label_1305;
                                                                    }
                                                                }
                                                                if (n6 == 6516589 || n6 == 7828084) {
                                                                    o3 = kb.f.d(n5, b2, "TCOM");
                                                                    break Label_1305;
                                                                }
                                                                if (n6 == 6578553) {
                                                                    o3 = kb.f.d(n5, b2, "TDRC");
                                                                    break Label_1305;
                                                                }
                                                                if (n6 == 4280916) {
                                                                    o3 = kb.f.d(n5, b2, "TPE1");
                                                                    break Label_1305;
                                                                }
                                                                if (n6 == 7630703) {
                                                                    o3 = kb.f.d(n5, b2, "TSSE");
                                                                    break Label_1305;
                                                                }
                                                                if (n6 == 6384738) {
                                                                    o3 = kb.f.d(n5, b2, "TALB");
                                                                    break Label_1305;
                                                                }
                                                                if (n6 == 7108978) {
                                                                    o3 = kb.f.d(n5, b2, "USLT");
                                                                    break Label_1305;
                                                                }
                                                                if (n6 == 6776174) {
                                                                    o3 = kb.f.d(n5, b2, "TCON");
                                                                    break Label_1305;
                                                                }
                                                                if (n6 == 6779504) {
                                                                    o3 = kb.f.d(n5, b2, "TIT1");
                                                                    break Label_1305;
                                                                }
                                                                Label_1220:
                                                                value = String.valueOf(kb.a.a(n5));
                                                                if (value.length() != 0) {
                                                                    concat = "Skipped unknown metadata entry: ".concat(value);
                                                                }
                                                                else {
                                                                    concat = new String("Skipped unknown metadata entry: ");
                                                                }
                                                                Log.d("MetadataUtil", concat);
                                                            }
                                                            o3 = null;
                                                        }
                                                        b2.B(n4);
                                                        if (o3 == null) {
                                                            continue;
                                                        }
                                                        list3.add((Throwable)o3);
                                                        continue;
                                                    }
                                                    b2.B(n4);
                                                }
                                                else {
                                                    list = list4;
                                                    if (list3.isEmpty()) {
                                                        break Label_1380;
                                                    }
                                                    o4 = new qb.a((List)list3);
                                                    break Label_1383;
                                                }
                                            }
                                        }
                                        else {
                                            b2.B(b5 + c5);
                                        }
                                    }
                                    o4 = null;
                                }
                                o5 = o4;
                                o6 = o2;
                            }
                            else {
                                final ArrayList<h.h$a> list5 = list;
                                o5 = o;
                                o6 = o2;
                                list = list5;
                                if (c4 == 1936553057) {
                                    b2.B(b3);
                                    b2.C(12);
                                    while (true) {
                                        final int b8 = b2.b;
                                        if (b8 >= b3 + c3) {
                                            break;
                                        }
                                        final int c8 = b2.c();
                                        if (b2.c() == 1935766900) {
                                            if (c8 < 14) {
                                                break;
                                            }
                                            b2.C(5);
                                            final int r = b2.r();
                                            if (r != 12 && r != 13) {
                                                break;
                                            }
                                            float n7;
                                            if (r == 12) {
                                                n7 = 240.0f;
                                            }
                                            else {
                                                n7 = 120.0f;
                                            }
                                            b2.C(1);
                                            o6 = new qb.a(new a$b[] { (a$b)new d(n7, b2.r()) });
                                            o5 = o;
                                            list = list5;
                                            break Label_1595;
                                        }
                                        else {
                                            b2.B(b8 + c8);
                                        }
                                    }
                                    o6 = null;
                                    list = list5;
                                    o5 = o;
                                }
                            }
                        }
                        b2.B(b3 + c3);
                        o = o5;
                        o2 = o6;
                    }
                }
                else {
                    a4 = null;
                    a3 = null;
                    list2 = list;
                }
                final a.a b9 = a.b(1835365473);
                qb.a a7 = null;
                Label_2123: {
                    if (b9 != null) {
                        final byte[] a6 = kb.b.a;
                        final a.b c9 = b9.c(1751411826);
                        final a.b c10 = b9.c(1801812339);
                        final a.b c11 = b9.c(1768715124);
                        if (c9 != null && c10 != null && c11 != null) {
                            final t b10 = c9.b;
                            b10.B(16);
                            if (b10.c() == 1835299937) {
                                final t b11 = c10.b;
                                b11.B(12);
                                final int c12 = b11.c();
                                String[] array = new String[c12];
                                for (int k = 0; k < c12; ++k) {
                                    final int c13 = b11.c();
                                    b11.C(4);
                                    array[k] = b11.o(c13 - 8);
                                }
                                final t b12 = c11.b;
                                b12.B(8);
                                final ArrayList<Object> list6 = new ArrayList<Object>();
                                int n8 = c12;
                                while (true) {
                                    final int c14 = b12.c;
                                    final int b13 = b12.b;
                                    if (c14 - b13 <= 8) {
                                        break;
                                    }
                                    final int c15 = b12.c();
                                    final int n9 = b12.c() - 1;
                                    if (n9 >= 0 && n9 < n8) {
                                        final String s2 = array[n9];
                                        Object o7;
                                        while (true) {
                                            final int b14 = b12.b;
                                            if (b14 >= b13 + c15) {
                                                o7 = null;
                                                break;
                                            }
                                            int c16 = b12.c();
                                            if (b12.c() == 1684108385) {
                                                final int c17 = b12.c();
                                                final int c18 = b12.c();
                                                c16 -= 16;
                                                final byte[] array2 = new byte[c16];
                                                b12.b(0, c16, array2);
                                                o7 = new wb.a(s2, array2, c18, c17);
                                                break;
                                            }
                                            b12.B(b14 + c16);
                                        }
                                        final String[] array3 = array;
                                        final int n10 = n8 = n8;
                                        array = array3;
                                        if (o7 != null) {
                                            list6.add(o7);
                                            n8 = n10;
                                            array = array3;
                                        }
                                    }
                                    else {
                                        ph0.a.h(52, "Skipped metadata with unknown key index: ", n9, "AtomParsers");
                                    }
                                    b12.B(b13 + c15);
                                }
                                if (!list6.isEmpty()) {
                                    a7 = new qb.a((List)list6);
                                    break Label_2123;
                                }
                            }
                        }
                    }
                    a7 = null;
                }
                final ArrayList f = kb.b.f(a, q, -9223372036854775807L, (com.google.android.exoplayer2.drm.b)null, (h2.a & 0x1) != 0x0, b, (sg.c)new g());
                final db.j r2 = h2.r;
                r2.getClass();
                final int size = f.size();
                long max = -9223372036854775807L;
                int u = -1;
                int n11 = 0;
                final ArrayList<h.h$a> list7 = list2;
                final db.q q2 = q;
                qb.a a8 = a4;
                while (n11 < size) {
                    final o o8 = f.get(n11);
                    if (o8.b != 0) {
                        final l a9 = o8.a;
                        long n12 = a9.e;
                        if (n12 == -9223372036854775807L) {
                            n12 = o8.h;
                        }
                        max = Math.max(max, n12);
                        final h.h$a h$a = new h.h$a(a9, o8, r2.k(n11, a9.b));
                        int l2;
                        if ("audio/true-hd".equals(a9.f.q)) {
                            l2 = o8.e * 16;
                        }
                        else {
                            l2 = o8.e + 30;
                        }
                        final n f2 = a9.f;
                        f2.getClass();
                        final n$a n$a = new n$a(f2);
                        n$a.l = l2;
                        final int b15 = a9.b;
                        if (b15 == 2 && n12 > 0L) {
                            final int b16 = o8.b;
                            if (b16 > 1) {
                                n$a.r = b16 / (n12 / 1000000.0f);
                            }
                        }
                        if (b15 == 1) {
                            final int a10 = q2.a;
                            if (a10 != -1 && q2.b != -1) {
                                n$a.A = a10;
                                n$a.B = q2.b;
                            }
                        }
                        final qb.a[] array4 = { a8, null };
                        qb.a a11;
                        if (this.h.isEmpty()) {
                            a11 = null;
                        }
                        else {
                            a11 = new qb.a((List)this.h);
                        }
                        array4[1] = a11;
                        final qb.a a12 = new qb.a(new a$b[0]);
                        qb.a a14 = null;
                        Label_2693: {
                            qb.a a13;
                            if (b15 == 1) {
                                a13 = a8;
                                if (a3 != null) {
                                    a14 = a3;
                                    break Label_2693;
                                }
                            }
                            else {
                                a13 = a8;
                                if (b15 == 2) {
                                    a13 = a8;
                                    if (a7 != null) {
                                        int n13 = 0;
                                        while (true) {
                                            final a$b[] f3 = a7.f;
                                            a13 = a8;
                                            if (n13 >= f3.length) {
                                                break;
                                            }
                                            final a$b a$b = f3[n13];
                                            if (a$b instanceof wb.a) {
                                                final wb.a a15 = (wb.a)a$b;
                                                final String f4 = a15.f;
                                                final qb.a a16 = a8;
                                                if ("com.android.capture.fps".equals(f4)) {
                                                    a14 = new qb.a(new a$b[] { (a$b)a15 });
                                                    a8 = a16;
                                                    break Label_2693;
                                                }
                                            }
                                            ++n13;
                                        }
                                    }
                                }
                            }
                            a8 = a13;
                            a14 = a12;
                        }
                        int n14 = 0;
                        qb.a i2 = a14;
                        final qb.a[] array5 = array4;
                        while (n14 < 2) {
                            final qb.a a17 = array5[n14];
                            if (a17 != null) {
                                final a$b[] f5 = a17.f;
                                if (f5.length != 0) {
                                    final a$b[] f6 = i2.f;
                                    final int a18 = c0.a;
                                    final a$b[] copy = Arrays.copyOf(f6, f6.length + f5.length);
                                    System.arraycopy(f5, 0, copy, f6.length, f5.length);
                                    i2 = new qb.a((a$b[])copy);
                                }
                            }
                            ++n14;
                        }
                        if (i2.f.length > 0) {
                            n$a.i = i2;
                        }
                        h$a.c.a(new n(n$a));
                        int size2 = u;
                        if (a9.b == 2 && (size2 = u) == -1) {
                            size2 = list7.size();
                        }
                        list7.add(h$a);
                        h2 = this;
                        u = size2;
                    }
                    ++n11;
                }
                h = this;
                h2.u = u;
                h2.v = max;
                final h.h$a[] s3 = list7.toArray(new h.h$a[0]);
                h2.s = s3;
                final long[][] t = new long[s3.length][];
                final int[] array6 = new int[s3.length];
                final long[] array7 = new long[s3.length];
                final boolean[] array8 = new boolean[s3.length];
                for (int n15 = 0; n15 < s3.length; ++n15) {
                    t[n15] = new long[s3[n15].b.b];
                    array7[n15] = s3[n15].b.f[0];
                }
                int n16 = 0;
                long n17 = 0L;
                while (n16 < s3.length) {
                    long n18 = Long.MAX_VALUE;
                    int n19 = 0;
                    int n20 = -1;
                    while (n19 < s3.length) {
                        long n21 = n18;
                        int n22 = n20;
                        if (!array8[n19]) {
                            final long n23 = array7[n19];
                            n21 = n18;
                            n22 = n20;
                            if (n23 <= n18) {
                                n22 = n19;
                                n21 = n23;
                            }
                        }
                        ++n19;
                        n18 = n21;
                        n20 = n22;
                    }
                    int n24 = array6[n20];
                    final long[] array9 = t[n20];
                    array9[n24] = n17;
                    final o b17 = s3[n20].b;
                    n17 += b17.d[n24];
                    ++n24;
                    if ((array6[n20] = n24) < array9.length) {
                        array7[n20] = b17.f[n24];
                    }
                    else {
                        array8[n20] = true;
                        ++n16;
                    }
                }
                h2.t = t;
                r2.b();
                r2.s((u)h2);
                h2.f.clear();
                h2.i = 2;
                h3 = h2;
            }
            else {
                final h h4 = h;
                h3 = h2;
                h = h4;
                if (!h2.f.isEmpty()) {
                    h2.f.peek().d.add(a);
                    h = h4;
                    h3 = h2;
                }
            }
        }
        if (h2.i != 2) {
            h.i = 0;
            h.l = 0;
        }
    }
    
    public final void release() {
    }
}
