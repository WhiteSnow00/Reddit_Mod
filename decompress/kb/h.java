// 
// Decompiled by Procyon v0.6.0
// 

package kb;

import java.util.Arrays;
import wb.e;
import android.util.Log;
import android.util.Pair;
import db.q;
import java.util.List;
import db.w;
import bd.d0;
import db.u$b;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import qb.a$b;
import wb.c$b;
import db.w$a;
import zc.f;
import com.google.android.exoplayer2.ParserException;
import db.t;
import db.v;
import db.u$a;
import java.io.IOException;
import db.i;
import db.x;
import bd.c0;
import bd.p;
import androidx.viewpager.widget.c;
import wb.b;
import java.util.ArrayList;
import java.util.ArrayDeque;
import bd.s;
import db.u;

public final class h implements db.h, u
{
    public final int a;
    public final s b;
    public final s c;
    public final s d;
    public final s e;
    public final ArrayDeque<kb.a.a> f;
    public final j g;
    public final ArrayList h;
    public int i;
    public int j;
    public long k;
    public int l;
    public s m;
    public int n;
    public int o;
    public int p;
    public int q;
    public db.j r;
    public a[] s;
    public long[][] t;
    public int u;
    public long v;
    public int w;
    public b x;
    
    static {
        new(androidx.viewpager.widget.c.class)();
    }
    
    public h() {
        this(0);
    }
    
    public h(final int n) {
        this.a = 0;
        this.i = 0;
        this.g = new j();
        this.h = new ArrayList();
        this.e = new s(16);
        this.f = new ArrayDeque<kb.a.a>();
        this.b = new s(bd.p.a);
        this.c = new s(4);
        this.d = new s();
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
            final a[] s = this.s;
            if (s != null) {
                final int length = s.length;
                int i = 0;
            Label_0108:
                while (i < length) {
                    final a a = s[i];
                    final o b = a.b;
                    while (true) {
                        for (int j = c0.f(b.f, n2, false); j >= 0; --j) {
                            if ((b.g[j] & 0x1) != 0x0) {
                                int a2 = j;
                                if (j == -1) {
                                    a2 = b.a(n2);
                                }
                                a.e = a2;
                                final x d = a.d;
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
        final a[] s = this.s;
        s.getClass();
        if (s.length == 0) {
            final v c = db.v.c;
            return new u$a(c, c);
        }
        long min2 = -1L;
        final int u = this.u;
        long n4 = 0L;
        Label_0261: {
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
                            final long n2 = b.f[a];
                            final long n3 = b.c[a];
                            Label_0235: {
                                if (n2 < n && a < b.b - 1) {
                                    final int a2 = b.a(n);
                                    if (a2 != -1 && a2 != a) {
                                        min = b.f[a2];
                                        min2 = b.c[a2];
                                        break Label_0235;
                                    }
                                }
                                min = -9223372036854775807L;
                            }
                            n = n2;
                            n4 = min;
                            min = n3;
                            break Label_0261;
                        }
                        else {
                            --i;
                        }
                    }
                    i = -1;
                    continue;
                }
            }
            min = Long.MAX_VALUE;
            min2 = -1L;
            n4 = -9223372036854775807L;
        }
        int n5 = 0;
        while (true) {
            final a[] s2 = this.s;
            if (n5 >= s2.length) {
                break;
            }
            Label_0480: {
                if (n5 != this.u) {
                    final o b2 = s2[n5].b;
                    int j = c0.f(b2.f, n, false);
                    while (true) {
                        while (j >= 0) {
                            if ((b2.g[j] & 0x1) != 0x0) {
                                int a3 = j;
                                if (j == -1) {
                                    a3 = b2.a(n);
                                }
                                if (a3 != -1) {
                                    min = Math.min(b2.c[a3], min);
                                }
                                if (n4 != -9223372036854775807L) {
                                    int k = c0.f(b2.f, n4, false);
                                    while (true) {
                                        while (k >= 0) {
                                            if ((b2.g[k] & 0x1) != 0x0) {
                                                int a4 = k;
                                                if (k == -1) {
                                                    a4 = b2.a(n4);
                                                }
                                                if (a4 == -1) {
                                                    break Label_0480;
                                                }
                                                min2 = Math.min(b2.c[a4], min2);
                                                break Label_0480;
                                            }
                                            else {
                                                --k;
                                            }
                                        }
                                        k = -1;
                                        continue;
                                    }
                                }
                                break Label_0480;
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
            ++n5;
        }
        final v v = new v(n, min);
        if (n4 == -9223372036854775807L) {
            return new u$a(v, v);
        }
        return new u$a(v, new v(n4, min2));
    }
    
    public final boolean e() {
        return true;
    }
    
    public final void f(final db.j r) {
        this.r = r;
    }
    
    public final int h(final i i, final t t) throws IOException {
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
                            long n2 = n3 = n;
                            int n4 = 0;
                            int n5 = -1;
                            int n6 = -1;
                            int n7 = 1;
                            int n8 = 1;
                            while (true) {
                                final a[] s = this.s;
                                final int a = c0.a;
                                if (n4 >= s.length) {
                                    break;
                                }
                                final a a2 = s[n4];
                                final int e = a2.e;
                                final o b2 = a2.b;
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
                                    Label_1274: {
                                        if (n13 != 0 || n8 == 0) {
                                            n14 = n6;
                                            n15 = n8;
                                            n16 = n2;
                                            n17 = n3;
                                            if (n13 != n8) {
                                                break Label_1274;
                                            }
                                            n14 = n6;
                                            n15 = n8;
                                            n16 = n2;
                                            n17 = n3;
                                            if (n12 >= n3) {
                                                break Label_1274;
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
                        final a[] s2 = this.s;
                        final int a3 = c0.a;
                        final a a4 = s2[this.n];
                        final w c = a4.c;
                        final int e2 = a4.e;
                        final o b3 = a4.b;
                        final long a5 = b3.c[e2];
                        final int n19 = b3.d[e2];
                        final x d = a4.d;
                        final long n20 = a5 - position + this.o;
                        int n18;
                        if (n20 >= 0L && n20 < 262144L) {
                            long n21 = n20;
                            int n22 = n19;
                            if (a4.a.g == 1) {
                                n21 = n20 + 8L;
                                n22 = n19 - 8;
                            }
                            i.n((int)n21);
                            final l a6 = a4.a;
                            final int k = a6.j;
                            int n24;
                            if (k != 0) {
                                final byte[] a7 = this.c.a;
                                a7[0] = 0;
                                a7[1] = 0;
                                a7[2] = 0;
                                final int n23 = 4 - k;
                                while (true) {
                                    n24 = n22;
                                    if (this.p >= n22) {
                                        break;
                                    }
                                    final int q = this.q;
                                    if (q == 0) {
                                        i.readFully(a7, n23, k);
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
                                if ("audio/ac4".equals(a6.f.q)) {
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
                            final o b4 = a4.b;
                            final long n26 = b4.f[e2];
                            final int n27 = b4.g[e2];
                            if (d != null) {
                                d.b(c, n26, n27, n24, 0, (w$a)null);
                                if (e2 + 1 == a4.b.b) {
                                    d.a(c, (w$a)null);
                                }
                            }
                            else {
                                c.b(n26, n27, n24, 0, (w$a)null);
                            }
                            ++a4.e;
                            this.n = -1;
                            this.o = 0;
                            this.p = 0;
                            this.q = 0;
                            n18 = 0;
                        }
                        else {
                            t.a = a5;
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
                                    final s s3 = new s(n28);
                                    i.readFully(s3.a, 0, n28);
                                    for (int l = 0; l < g.a.size(); ++l) {
                                        final j.a a8 = g.a.get(l);
                                        s3.B((int)(a8.a - position2));
                                        s3.C(4);
                                        final int e5 = s3.e();
                                        final String o = s3.o(e5);
                                        int n29 = 0;
                                        Label_0331: {
                                            switch (o) {
                                                case "Super_SlowMotion_BGM": {
                                                    n29 = 4;
                                                    break Label_0331;
                                                }
                                                case "Super_SlowMotion_Deflickering_On": {
                                                    n29 = 3;
                                                    break Label_0331;
                                                }
                                                case "Super_SlowMotion_Data": {
                                                    n29 = 2;
                                                    break Label_0331;
                                                }
                                                case "Super_SlowMotion_Edit_Data": {
                                                    n29 = 1;
                                                    break Label_0331;
                                                }
                                                case "SlowMotion_Data": {
                                                    n29 = 0;
                                                    break Label_0331;
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
                                        final int b6 = a8.b;
                                        if (n30 != 2192) {
                                            if (n30 != 2816 && n30 != 2817 && n30 != 2819) {
                                                if (n30 != 2820) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                        }
                                        else {
                                            final ArrayList<c$b> list = new ArrayList<c$b>();
                                            final List a9 = kb.j.e.a((CharSequence)s3.o(b6 - (e5 + 8)));
                                            int n31 = 0;
                                            while (n31 < a9.size()) {
                                                final List a10 = kb.j.d.a((CharSequence)a9.get(n31));
                                                if (a10.size() == 3) {
                                                    try {
                                                        list.add(new c$b(1 << Integer.parseInt((String)a10.get(2)) - 1, Long.parseLong((String)a10.get(0)), Long.parseLong((String)a10.get(1))));
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
                                    final s s4 = new s(n32);
                                    i.readFully(s4.a, 0, n32);
                                    for (int n33 = 0; n33 < n32 / 12; ++n33) {
                                        s4.C(2);
                                        final short g2 = s4.g();
                                        if (g2 != 2192 && g2 != 2816) {
                                            if (g2 != 2817 && g2 != 2819) {
                                                if (g2 != 2820) {
                                                    s4.C(8);
                                                    continue;
                                                }
                                            }
                                        }
                                        g.a.add(new j.a(length - g.c - s4.e(), s4.e()));
                                    }
                                    if (g.a.isEmpty()) {
                                        t.a = 0L;
                                    }
                                    else {
                                        g.b = 3;
                                        t.a = ((j.a)g.a.get(0)).a;
                                    }
                                }
                            }
                            else {
                                final s s5 = new s(8);
                                i.readFully(s5.a, 0, 8);
                                g.c = s5.e() + 8;
                                if (s5.c() != 1397048916) {
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
                            long a11;
                            if (length2 != -1L && length2 >= 8L) {
                                a11 = length2 - 8L;
                            }
                            else {
                                a11 = 0L;
                            }
                            t.a = a11;
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
                    final s m = this.m;
                    boolean b7 = false;
                    Label_2278: {
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
                                Label_2181: {
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
                                                break Label_2181;
                                            }
                                        }
                                        w = 0;
                                    }
                                }
                                this.w = w;
                            }
                            else if (!this.f.isEmpty()) {
                                this.f.peek().c.add(new kb.a.b(this.j, m));
                            }
                        }
                        else {
                            if (n34 >= 262144L) {
                                t.a = i.getPosition() + n34;
                                b7 = true;
                                break Label_2278;
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
                Label_3273: {
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
                            break Label_3273;
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
                            final kb.a.a a12 = this.f.peek();
                            n37 = n36;
                            if (a12 != null) {
                                n37 = a12.b;
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
                            final s d2 = this.d;
                            final byte[] a13 = kb.b.a;
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
                        this.f.push(new kb.a.a(this.j, n39));
                        if (this.k == this.l) {
                            this.j(n39);
                        }
                        else {
                            this.i = 0;
                            this.l = 0;
                        }
                    }
                    else if (j2 == 1835296868 || j2 == 1836476516 || j2 == 1751411826 || j2 == 1937011556 || j2 == 1937011827 || j2 == 1937011571 || j2 == 1668576371 || j2 == 1701606260 || j2 == 1937011555 || j2 == 1937011578 || j2 == 1937013298 || j2 == 1937007471 || j2 == 1668232756 || j2 == 1953196132 || j2 == 1718909296 || j2 == 1969517665 || j2 == 1801812339 || j2 == 1768715124) {
                        d0.f(l2 == 8);
                        d0.f(this.k <= 2147483647L);
                        final s m2 = new s((int)this.k);
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
            final kb.a.a a = h2.f.pop();
            if (a.a == 1836019574) {
                ArrayList<a> list = new ArrayList<a>();
                final boolean b = h2.w == 1;
                final q q = new q();
                final kb.a.b c = a.c(1969517665);
                qb.a a3;
                qb.a a4;
                ArrayList<a> list2;
                if (c != null) {
                    final byte[] a2 = kb.b.a;
                    final s b2 = c.b;
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
                        Label_1550: {
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
                                int n3 = 1768715124;
                                Object o4 = null;
                                Label_1339: {
                                Label_1336:
                                    while (true) {
                                        final int b5 = b2.b;
                                        if (b5 >= b3 + c3) {
                                            break;
                                        }
                                        final int c5 = b2.c();
                                        if (b2.c() == n3) {
                                            b2.B(b5);
                                            final int n4 = b5 + c5;
                                            b2.C(8);
                                            final ArrayList<Throwable> list3 = new ArrayList<Throwable>();
                                            final ArrayList<a> list4 = list;
                                            int b6;
                                            int n5;
                                            int n6;
                                            int n7;
                                            String[] a5;
                                            String s = null;
                                            vb.l l;
                                            int c6;
                                            String m;
                                            int c7;
                                            String i;
                                            int b7;
                                            vb.i j;
                                            Object o3 = null;
                                            String value;
                                            String concat;
                                            Block_98_Outer:Block_110_Outer:Block_99_Outer:Block_108_Outer:Label_0797_Outer:
                                            while (true) {
                                                b6 = b2.b;
                                                if (b6 < n4) {
                                                    n5 = b2.c() + b6;
                                                    n6 = b2.c();
                                                    n7 = (n6 >> 24 & 0xFF);
                                                    Label_1281: {
                                                        Label_1260: {
                                                            Label_1230: {
                                                                Label_0961: {
                                                                    if (n7 == 169 || n7 == 253) {
                                                                        break Label_0961;
                                                                    }
                                                                    Label_0445: {
                                                                        if (n6 != 1735291493) {
                                                                            break Label_0445;
                                                                        }
                                                                        try {
                                                                            n6 = kb.f.f(b2);
                                                                            Label_0412: {
                                                                                if (n6 > 0) {
                                                                                    a5 = kb.f.a;
                                                                                    if (n6 <= 192) {
                                                                                        s = a5[n6 - 1];
                                                                                        break Label_0412;
                                                                                    }
                                                                                }
                                                                                s = null;
                                                                            }
                                                                            if (s != null) {
                                                                                l = new vb.l("TCON", null, s);
                                                                                break Label_1260;
                                                                            }
                                                                            Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                            break Label_1230;
                                                                            Block_104_Outer:Block_101_Outer:
                                                                            while (true) {
                                                                                while (true) {
                                                                                    while (true) {
                                                                                        Block_103: {
                                                                                            Block_87: {
                                                                                                Block_97: {
                                                                                                    while (true) {
                                                                                                        Block_96: {
                                                                                                        Label_0797:
                                                                                                            while (true) {
                                                                                                                Label_0902: {
                                                                                                                    Block_90: {
                                                                                                                        Block_89:Label_0892_Outer:
                                                                                                                        while (true) {
                                                                                                                            while (true) {
                                                                                                                            Block_91:
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                        Block_109_Outer:Block_95_Outer:
                                                                                                                                        while (true) {
                                                                                                                                            while (true) {
                                                                                                                                                while (true) {
                                                                                                                                                    Block_94: {
                                                                                                                                                        while (true) {
                                                                                                                                                        Block_100_Outer:
                                                                                                                                                            while (true) {
                                                                                                                                                                m = b2.m(c6 - 12);
                                                                                                                                                                break Label_0902;
                                                                                                                                                                while (true) {
                                                                                                                                                                    kb.f.d(n6, b2, "TVSHOWSORT");
                                                                                                                                                                    break Label_1260;
                                                                                                                                                                    Label_0516: {
                                                                                                                                                                        iftrue(Label_0540:)(n6 != 1668311404);
                                                                                                                                                                    }
                                                                                                                                                                    break Block_90;
                                                                                                                                                                    Label_0579:
                                                                                                                                                                    iftrue(Label_0601:)(n6 != 1936682605);
                                                                                                                                                                    break Label_0797;
                                                                                                                                                                    kb.f.e(n6, "ITUNESADVISORY", b2, false, false);
                                                                                                                                                                    break Label_1260;
                                                                                                                                                                    break Label_1230;
                                                                                                                                                                    Label_0737:
                                                                                                                                                                    iftrue(Label_0759:)(n6 != 1936683886);
                                                                                                                                                                    continue Block_98_Outer;
                                                                                                                                                                }
                                                                                                                                                                kb.f.d(n6, b2, "TSOA");
                                                                                                                                                                break Label_1260;
                                                                                                                                                                Label_0601: {
                                                                                                                                                                    iftrue(Label_0623:)(n6 != 1936679276);
                                                                                                                                                                }
                                                                                                                                                                break Block_94;
                                                                                                                                                                Label_0854:
                                                                                                                                                                iftrue(Label_0876:)(c7 != 1851878757);
                                                                                                                                                                continue Block_100_Outer;
                                                                                                                                                            }
                                                                                                                                                            kb.f.a(n6, b2);
                                                                                                                                                            break Label_1260;
                                                                                                                                                            i = null;
                                                                                                                                                            iftrue(Label_0470:)(n6 != 1684632427);
                                                                                                                                                            break Block_87;
                                                                                                                                                            kb.f.e(n6, "ITUNESGAPLESS", b2, false, true);
                                                                                                                                                            break Label_1260;
                                                                                                                                                            iftrue(Label_0923:)(n7 != -1);
                                                                                                                                                            continue Block_95_Outer;
                                                                                                                                                        }
                                                                                                                                                        kb.f.c(n6, b2, "TRCK");
                                                                                                                                                        break Label_1260;
                                                                                                                                                    }
                                                                                                                                                    kb.f.d(n6, b2, "TSO2");
                                                                                                                                                    break Label_1260;
                                                                                                                                                    Label_0540: {
                                                                                                                                                        iftrue(Label_0557:)(n6 != 1668249202);
                                                                                                                                                    }
                                                                                                                                                    break Block_91;
                                                                                                                                                    Label_0667:
                                                                                                                                                    iftrue(Label_0689:)(n6 != 1936679791);
                                                                                                                                                    break Block_97;
                                                                                                                                                    Label_0492:
                                                                                                                                                    iftrue(Label_0516:)(n6 != 1953329263);
                                                                                                                                                    break Block_89;
                                                                                                                                                    Label_0623:
                                                                                                                                                    iftrue(Label_0645:)(n6 != 1936679282);
                                                                                                                                                    continue Block_110_Outer;
                                                                                                                                                }
                                                                                                                                                Label_0470: {
                                                                                                                                                    iftrue(Label_0492:)(n6 != 1953655662);
                                                                                                                                                }
                                                                                                                                                continue Label_0892_Outer;
                                                                                                                                            }
                                                                                                                                            b2.C(c6 - 12);
                                                                                                                                            b7 = b2.b;
                                                                                                                                            iftrue(Label_0905:)(b7 >= n5);
                                                                                                                                            break Block_103;
                                                                                                                                            Label_0781: {
                                                                                                                                                iftrue(Label_1184:)(n6 != 757935405);
                                                                                                                                            }
                                                                                                                                            Block_102: {
                                                                                                                                                break Block_102;
                                                                                                                                                Label_0645:
                                                                                                                                                iftrue(Label_0667:)(n6 != 1936679265);
                                                                                                                                                break Block_96;
                                                                                                                                            }
                                                                                                                                            n7 = -1;
                                                                                                                                            n6 = -1;
                                                                                                                                            m = null;
                                                                                                                                            continue Label_0797;
                                                                                                                                            Label_0689:
                                                                                                                                            iftrue(Label_0713:)(n6 != 1920233063);
                                                                                                                                            continue Block_109_Outer;
                                                                                                                                        }
                                                                                                                                        n7 = (0xFFFFFF & n6);
                                                                                                                                        iftrue(Label_0992:)(n7 != 6516084);
                                                                                                                                        continue Block_99_Outer;
                                                                                                                                    }
                                                                                                                                    Label_0713: {
                                                                                                                                        iftrue(Label_0737:)(n6 != 1885823344);
                                                                                                                                    }
                                                                                                                                    continue Block_108_Outer;
                                                                                                                                }
                                                                                                                                kb.f.b(b2);
                                                                                                                                break Label_1260;
                                                                                                                                kb.f.d(n6, b2, "TPE2");
                                                                                                                                break Label_1260;
                                                                                                                                n6 = c6;
                                                                                                                                n7 = b7;
                                                                                                                                continue Label_0797_Outer;
                                                                                                                            }
                                                                                                                            i = b2.m(c6 - 12);
                                                                                                                            break Label_0902;
                                                                                                                            Label_0905: {
                                                                                                                                iftrue(Label_1230:)(i == null || m == null);
                                                                                                                            }
                                                                                                                            continue Label_0892_Outer;
                                                                                                                        }
                                                                                                                        kb.f.e(n6, "TBPM", b2, true, false);
                                                                                                                        break Label_1260;
                                                                                                                    }
                                                                                                                    kb.f.e(n6, "TCMP", b2, true, true);
                                                                                                                    break Label_1260;
                                                                                                                }
                                                                                                                continue Label_0797;
                                                                                                            }
                                                                                                            kb.f.d(n6, b2, "TSOT");
                                                                                                            break Label_1260;
                                                                                                            kb.f.d(n6, b2, "TVSHOW");
                                                                                                            break Label_1260;
                                                                                                        }
                                                                                                        kb.f.d(n6, b2, "TSOP");
                                                                                                        break Label_1260;
                                                                                                        Label_0876: {
                                                                                                            iftrue(Label_0892:)(c7 != 1684108385);
                                                                                                        }
                                                                                                        continue Block_104_Outer;
                                                                                                    }
                                                                                                    Label_0923: {
                                                                                                        b2.B(n7);
                                                                                                    }
                                                                                                    b2.C(16);
                                                                                                    j = new vb.i(i, m, b2.m(n6 - 16));
                                                                                                    break Label_1260;
                                                                                                }
                                                                                                kb.f.d(n6, b2, "TSOC");
                                                                                                break Label_1260;
                                                                                            }
                                                                                            kb.f.c(n6, b2, "TPOS");
                                                                                            break Label_1260;
                                                                                        }
                                                                                        c6 = b2.c();
                                                                                        c7 = b2.c();
                                                                                        b2.C(4);
                                                                                        iftrue(Label_0854:)(c7 != 1835360622);
                                                                                        continue Block_101_Outer;
                                                                                    }
                                                                                    Label_0759: {
                                                                                        iftrue(Label_0781:)(n6 != 1953919848);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                Label_0557: {
                                                                                    iftrue(Label_0579:)(n6 != 1631670868);
                                                                                }
                                                                                continue Block_104_Outer;
                                                                            }
                                                                        }
                                                                        finally {
                                                                            break Label_1281;
                                                                        }
                                                                    }
                                                                }
                                                                Label_0992: {
                                                                    if (n7 == 7233901 || n7 == 7631467) {
                                                                        o3 = kb.f.d(n6, b2, "TIT2");
                                                                        break Label_1260;
                                                                    }
                                                                }
                                                                if (n7 == 6516589 || n7 == 7828084) {
                                                                    o3 = kb.f.d(n6, b2, "TCOM");
                                                                    break Label_1260;
                                                                }
                                                                if (n7 == 6578553) {
                                                                    o3 = kb.f.d(n6, b2, "TDRC");
                                                                    break Label_1260;
                                                                }
                                                                if (n7 == 4280916) {
                                                                    o3 = kb.f.d(n6, b2, "TPE1");
                                                                    break Label_1260;
                                                                }
                                                                if (n7 == 7630703) {
                                                                    o3 = kb.f.d(n6, b2, "TSSE");
                                                                    break Label_1260;
                                                                }
                                                                if (n7 == 6384738) {
                                                                    o3 = kb.f.d(n6, b2, "TALB");
                                                                    break Label_1260;
                                                                }
                                                                if (n7 == 7108978) {
                                                                    o3 = kb.f.d(n6, b2, "USLT");
                                                                    break Label_1260;
                                                                }
                                                                if (n7 == 6776174) {
                                                                    o3 = kb.f.d(n6, b2, "TCON");
                                                                    break Label_1260;
                                                                }
                                                                if (n7 == 6779504) {
                                                                    o3 = kb.f.d(n6, b2, "TIT1");
                                                                    break Label_1260;
                                                                }
                                                                Label_1184:
                                                                value = String.valueOf(kb.a.a(n6));
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
                                                        b2.B(n5);
                                                        if (o3 == null) {
                                                            continue;
                                                        }
                                                        list3.add((Throwable)o3);
                                                        continue;
                                                    }
                                                    b2.B(n5);
                                                }
                                                else {
                                                    list = list4;
                                                    if (list3.isEmpty()) {
                                                        break Label_1336;
                                                    }
                                                    o4 = new qb.a((List)list3);
                                                    break Label_1339;
                                                }
                                            }
                                        }
                                        else {
                                            b2.B(b5 + c5);
                                            n3 = 1768715124;
                                        }
                                    }
                                    o4 = null;
                                }
                                o5 = o4;
                                o6 = o2;
                            }
                            else {
                                final ArrayList<a> list5 = list;
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
                                            float n8;
                                            if (r == 12) {
                                                n8 = 240.0f;
                                            }
                                            else {
                                                n8 = 120.0f;
                                            }
                                            b2.C(1);
                                            o6 = new qb.a(new a$b[] { (a$b)new e(n8, b2.r()) });
                                            o5 = o;
                                            list = list5;
                                            break Label_1550;
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
                final kb.a.a b9 = a.b(1835365473);
                qb.a a7 = null;
                Label_2066: {
                    if (b9 != null) {
                        final byte[] a6 = kb.b.a;
                        final kb.a.b c9 = b9.c(1751411826);
                        final kb.a.b c10 = b9.c(1801812339);
                        final kb.a.b c11 = b9.c(1768715124);
                        if (c9 != null && c10 != null && c11 != null) {
                            final s b10 = c9.b;
                            b10.B(16);
                            if (b10.c() == 1835299937) {
                                final s b11 = c10.b;
                                b11.B(12);
                                final int c12 = b11.c();
                                String[] array = new String[c12];
                                for (int k = 0; k < c12; ++k) {
                                    final int c13 = b11.c();
                                    b11.C(4);
                                    array[k] = b11.o(c13 - 8);
                                }
                                final s b12 = c11.b;
                                b12.B(8);
                                final ArrayList<Object> list6 = new ArrayList<Object>();
                                int n9 = c12;
                                while (true) {
                                    final int c14 = b12.c;
                                    final int b13 = b12.b;
                                    if (c14 - b13 <= 8) {
                                        break;
                                    }
                                    final int c15 = b12.c();
                                    final int n10 = b12.c() - 1;
                                    if (n10 >= 0 && n10 < n9) {
                                        final String s2 = array[n10];
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
                                        final int n11 = n9 = n9;
                                        array = array3;
                                        if (o7 != null) {
                                            list6.add(o7);
                                            n9 = n11;
                                            array = array3;
                                        }
                                    }
                                    else {
                                        ag0.a.u(52, "Skipped metadata with unknown key index: ", n10, "AtomParsers");
                                    }
                                    b12.B(b13 + c15);
                                }
                                if (!list6.isEmpty()) {
                                    a7 = new qb.a((List)list6);
                                    break Label_2066;
                                }
                            }
                        }
                    }
                    a7 = null;
                }
                final ArrayList f = kb.b.f(a, q, -9223372036854775807L, null, (h2.a & 0x1) != 0x0, b, (tg.c)new g());
                final db.j r2 = h2.r;
                r2.getClass();
                final int size = f.size();
                long max = -9223372036854775807L;
                int u = -1;
                int n12 = 0;
                final ArrayList<a> list7 = list2;
                final q q2 = q;
                qb.a a8 = a4;
                while (n12 < size) {
                    final o o8 = f.get(n12);
                    if (o8.b != 0) {
                        final l a9 = o8.a;
                        final qb.a a10 = a3;
                        long n13 = a9.e;
                        if (n13 == -9223372036854775807L) {
                            n13 = o8.h;
                        }
                        max = Math.max(max, n13);
                        final a a11 = new a(a9, o8, r2.k(n12, a9.b));
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
                        if (b15 == 2 && n13 > 0L) {
                            final int b16 = o8.b;
                            if (b16 > 1) {
                                n$a.r = b16 / (n13 / 1000000.0f);
                            }
                        }
                        if (b15 == 1) {
                            final int a12 = q2.a;
                            if (a12 != -1 && q2.b != -1) {
                                n$a.A = a12;
                                n$a.B = q2.b;
                            }
                        }
                        final qb.a[] array4 = { a8, null };
                        qb.a a13;
                        if (this.h.isEmpty()) {
                            a13 = null;
                        }
                        else {
                            a13 = new qb.a((List)this.h);
                        }
                        array4[1] = a13;
                        final qb.a a14 = new qb.a(new a$b[0]);
                        qb.a a16 = null;
                        Label_2631: {
                            qb.a a15;
                            if (b15 == 1) {
                                a15 = a8;
                                if (a10 != null) {
                                    a16 = a10;
                                    break Label_2631;
                                }
                            }
                            else {
                                a15 = a8;
                                if (b15 == 2) {
                                    a15 = a8;
                                    if (a7 != null) {
                                        int n14 = 0;
                                        while (true) {
                                            final a$b[] f3 = a7.f;
                                            a15 = a8;
                                            if (n14 >= f3.length) {
                                                break;
                                            }
                                            final a$b a$b = f3[n14];
                                            if (a$b instanceof wb.a) {
                                                final wb.a a17 = (wb.a)a$b;
                                                final String f4 = a17.f;
                                                final qb.a a18 = a8;
                                                if ("com.android.capture.fps".equals(f4)) {
                                                    a16 = new qb.a(new a$b[] { (a$b)a17 });
                                                    a8 = a18;
                                                    break Label_2631;
                                                }
                                            }
                                            ++n14;
                                        }
                                    }
                                }
                            }
                            a8 = a15;
                            a16 = a14;
                        }
                        int n15 = 0;
                        qb.a i2 = a16;
                        final qb.a[] array5 = array4;
                        while (n15 < 2) {
                            final qb.a a19 = array5[n15];
                            if (a19 != null) {
                                final a$b[] f5 = a19.f;
                                if (f5.length != 0) {
                                    final a$b[] f6 = i2.f;
                                    final int a20 = c0.a;
                                    final a$b[] copy = Arrays.copyOf(f6, f6.length + f5.length);
                                    System.arraycopy(f5, 0, copy, f6.length, f5.length);
                                    i2 = new qb.a((a$b[])copy);
                                }
                            }
                            ++n15;
                        }
                        if (i2.f.length > 0) {
                            n$a.i = i2;
                        }
                        a11.c.a(new n(n$a));
                        int size2 = u;
                        if (a9.b == 2 && (size2 = u) == -1) {
                            size2 = list7.size();
                        }
                        list7.add(a11);
                        h2 = this;
                        u = size2;
                    }
                    ++n12;
                }
                h = this;
                h2.u = u;
                h2.v = max;
                final a[] s3 = list7.toArray(new a[0]);
                h2.s = s3;
                final long[][] t = new long[s3.length][];
                final int[] array6 = new int[s3.length];
                final long[] array7 = new long[s3.length];
                final boolean[] array8 = new boolean[s3.length];
                for (int n16 = 0; n16 < s3.length; ++n16) {
                    t[n16] = new long[s3[n16].b.b];
                    array7[n16] = s3[n16].b.f[0];
                }
                int n17 = 0;
                long n18 = 0L;
                while (n17 < s3.length) {
                    long n19 = Long.MAX_VALUE;
                    int n20 = 0;
                    int n21 = -1;
                    while (n20 < s3.length) {
                        long n22 = n19;
                        int n23 = n21;
                        if (!array8[n20]) {
                            final long n24 = array7[n20];
                            n22 = n19;
                            n23 = n21;
                            if (n24 <= n19) {
                                n23 = n20;
                                n22 = n24;
                            }
                        }
                        ++n20;
                        n19 = n22;
                        n21 = n23;
                    }
                    int n25 = array6[n21];
                    final long[] array9 = t[n21];
                    array9[n25] = n18;
                    final o b17 = s3[n21].b;
                    n18 += b17.d[n25];
                    ++n25;
                    if ((array6[n21] = n25) < array9.length) {
                        array7[n21] = b17.f[n25];
                    }
                    else {
                        array8[n21] = true;
                        ++n17;
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
    
    public static final class a
    {
        public final l a;
        public final o b;
        public final w c;
        public final x d;
        public int e;
        
        public a(final l a, final o b, final w c) {
            this.a = a;
            this.b = b;
            this.c = c;
            x d;
            if ("audio/true-hd".equals(a.f.q)) {
                d = new x();
            }
            else {
                d = null;
            }
            this.d = d;
        }
    }
}
