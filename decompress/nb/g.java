// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.j;
import com.google.android.exoplayer2.ParserException;
import ya.a$a;
import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import ya.a;
import android.util.Log;
import db.w$a;
import bd.c0;
import java.util.Arrays;
import db.w;
import bd.s;
import bd.r;

public final class g implements k
{
    public static final byte[] v;
    public final boolean a;
    public final r b;
    public final s c;
    public final String d;
    public String e;
    public w f;
    public w g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public w t;
    public long u;
    
    static {
        v = new byte[] { 73, 68, 51 };
    }
    
    public g(final boolean a, final String d) {
        this.b = new r(new byte[7], 7);
        this.c = new s(Arrays.copyOf(nb.g.v, 10));
        this.h = 0;
        this.i = 0;
        this.j = 256;
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.a = a;
        this.d = d;
    }
    
    public final boolean a(final int n, final s s, final byte[] array) {
        final int min = Math.min(s.c - s.b, n - this.i);
        s.b(this.i, min, array);
        final int i = this.i + min;
        this.i = i;
        return i == n;
    }
    
    public final void b() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }
    
    public final void c(final s s) throws ParserException {
        this.f.getClass();
        final int a = c0.a;
    Label_0012:
        while (true) {
            final int c = s.c;
            int i = s.b;
            final int n = c - i;
            if (n <= 0) {
                return;
            }
            final int h = this.h;
            final int n2 = -1;
            int n3 = 7;
            if (h != 0) {
                if (h != 1) {
                    if (h != 2) {
                        if (h != 3) {
                            if (h != 4) {
                                throw new IllegalStateException();
                            }
                            final int min = Math.min(n, this.r - this.i);
                            this.t.c(min, s);
                            final int j = this.i + min;
                            this.i = j;
                            final int r = this.r;
                            if (j != r) {
                                continue;
                            }
                            final long s2 = this.s;
                            if (s2 != -9223372036854775807L) {
                                this.t.b(s2, 1, r, 0, (w$a)null);
                                this.s += this.u;
                            }
                            this.h = 0;
                            this.i = 0;
                            this.j = 256;
                        }
                        else {
                            if (!this.k) {
                                n3 = 5;
                            }
                            if (!this.a(n3, s, this.b.a)) {
                                continue;
                            }
                            this.b.k(0);
                            if (!this.p) {
                                final int n4 = this.b.g(2) + 1;
                                int n5;
                                if ((n5 = n4) != 2) {
                                    final StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(n4);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                    n5 = 2;
                                }
                                this.b.m(5);
                                final byte[] b = ya.a.b(n5, this.n, this.b.g(3));
                                final a$a d = ya.a.d(new r(b, 2), false);
                                final n$a n$a = new n$a();
                                n$a.a = this.e;
                                n$a.k = "audio/mp4a-latm";
                                n$a.h = d.c;
                                n$a.x = d.b;
                                n$a.y = d.a;
                                n$a.m = Collections.singletonList(b);
                                n$a.c = this.d;
                                final n n6 = new n(n$a);
                                this.q = 1024000000L / n6.E;
                                this.f.a(n6);
                                this.p = true;
                            }
                            else {
                                this.b.m(10);
                            }
                            this.b.m(4);
                            int r2 = this.b.g(13) - 2 - 5;
                            if (this.k) {
                                r2 -= 2;
                            }
                            final w f = this.f;
                            final long q = this.q;
                            this.h = 4;
                            this.i = 0;
                            this.t = f;
                            this.u = q;
                            this.r = r2;
                        }
                    }
                    else {
                        if (!this.a(10, s, this.c.a)) {
                            continue;
                        }
                        this.g.c(10, this.c);
                        this.c.B(6);
                        final w g = this.g;
                        final int q2 = this.c.q();
                        this.h = 4;
                        this.i = 10;
                        this.t = g;
                        this.u = 0L;
                        this.r = q2 + 10;
                    }
                }
                else {
                    if (n == 0) {
                        continue;
                    }
                    final r b2 = this.b;
                    b2.a[0] = s.a[i];
                    b2.k(2);
                    final int g2 = this.b.g(4);
                    final int n7 = this.n;
                    if (n7 != -1 && g2 != n7) {
                        this.l = false;
                        this.h = 0;
                        this.i = 0;
                        this.j = 256;
                    }
                    else {
                        if (!this.l) {
                            this.l = true;
                            this.m = this.o;
                            this.n = g2;
                        }
                        this.h = 3;
                        this.i = 0;
                    }
                }
            }
            else {
                final byte[] a2 = s.a;
                int n8 = n2;
                while (i < c) {
                    final int n9 = i + 1;
                    final int n10 = a2[i] & 0xFF;
                    Label_1390: {
                        if (this.j == 512 && ((((byte)n10 & 0xFF) | 0xFF00) & 0xFFF6) == 0xFFF0) {
                            if (!this.l) {
                                final int n11 = n9 - 2;
                                s.B(n11 + 1);
                                final byte[] a3 = this.b.a;
                                boolean b3;
                                if (s.c - s.b < 1) {
                                    b3 = false;
                                }
                                else {
                                    s.b(0, 1, a3);
                                    b3 = true;
                                }
                                boolean b9 = false;
                                Label_1313: {
                                    Label_1310: {
                                        if (b3) {
                                            this.b.k(4);
                                            final int g3 = this.b.g(1);
                                            final int m = this.m;
                                            if (m == n8 || g3 == m) {
                                                Label_1302: {
                                                    Label_1114: {
                                                        Label_1084: {
                                                            if (this.n != n8) {
                                                                final byte[] a4 = this.b.a;
                                                                boolean b4;
                                                                if (s.c - s.b < 1) {
                                                                    b4 = false;
                                                                }
                                                                else {
                                                                    s.b(0, 1, a4);
                                                                    b4 = true;
                                                                }
                                                                if (!b4) {
                                                                    break Label_1084;
                                                                }
                                                                this.b.k(2);
                                                                if (this.b.g(4) != this.n) {
                                                                    break Label_1114;
                                                                }
                                                                s.B(n11 + 2);
                                                            }
                                                            final byte[] a5 = this.b.a;
                                                            boolean b5;
                                                            if (s.c - s.b < 4) {
                                                                b5 = false;
                                                            }
                                                            else {
                                                                s.b(0, 4, a5);
                                                                b5 = true;
                                                            }
                                                            if (b5) {
                                                                this.b.k(14);
                                                                final int g4 = this.b.g(13);
                                                                if (g4 < 7) {
                                                                    break Label_1114;
                                                                }
                                                                final byte[] a6 = s.a;
                                                                final int c2 = s.c;
                                                                int n12 = n11 + g4;
                                                                if (n12 < c2) {
                                                                    final byte b6 = a6[n12];
                                                                    final int n13 = -1;
                                                                    if (b6 == -1) {
                                                                        if (++n12 != c2) {
                                                                            final byte b7 = a6[n12];
                                                                            final boolean b8 = (((b7 & 0xFF) | 0xFF00) & 0xFFF6) == 0xFFF0;
                                                                            n8 = n13;
                                                                            if (!b8) {
                                                                                break Label_1310;
                                                                            }
                                                                            n8 = n13;
                                                                            if ((b7 & 0x8) >> 3 != g3) {
                                                                                break Label_1310;
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        if (b6 != 73) {
                                                                            n8 = n13;
                                                                            break Label_1310;
                                                                        }
                                                                        final int n14 = n12 + 1;
                                                                        if (n14 != c2) {
                                                                            if (a6[n14] != 68) {
                                                                                n8 = n13;
                                                                                break Label_1310;
                                                                            }
                                                                            n12 += 2;
                                                                            if (n12 != c2) {
                                                                                n8 = n13;
                                                                                if (a6[n12] != 51) {
                                                                                    break Label_1310;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break Label_1302;
                                                    }
                                                    n8 = -1;
                                                    break Label_1310;
                                                }
                                                n8 = -1;
                                                b9 = true;
                                                break Label_1313;
                                            }
                                        }
                                    }
                                    b9 = false;
                                }
                                if (!b9) {
                                    break Label_1390;
                                }
                            }
                            this.o = (n10 & 0x8) >> 3;
                            this.k = ((n10 & 0x1) == 0x0);
                            if (!this.l) {
                                this.h = 1;
                                this.i = 0;
                            }
                            else {
                                this.h = 3;
                                this.i = 0;
                            }
                            s.B(n9);
                            continue Label_0012;
                        }
                    }
                    final int k = this.j;
                    final int n15 = n10 | k;
                    if (n15 != 329) {
                        if (n15 != 511) {
                            if (n15 != 836) {
                                if (n15 == 1075) {
                                    this.h = 2;
                                    this.i = 3;
                                    this.r = 0;
                                    this.c.B(0);
                                    s.B(n9);
                                    continue Label_0012;
                                }
                                if (k != 256) {
                                    this.j = 256;
                                    i = n9 - 1;
                                    continue;
                                }
                            }
                            else {
                                this.j = 1024;
                            }
                        }
                        else {
                            this.j = 512;
                        }
                    }
                    else {
                        this.j = 768;
                    }
                    i = n9;
                }
                s.B(i);
            }
        }
    }
    
    public final void d(final j j, final e0$d e0$d) {
        e0$d.a();
        e0$d.b();
        this.e = e0$d.e;
        e0$d.b();
        final w k = j.k(e0$d.d, 1);
        this.f = k;
        this.t = k;
        if (this.a) {
            e0$d.a();
            e0$d.b();
            final w i = j.k(e0$d.d, 5);
            this.g = i;
            final n$a n$a = new n$a();
            e0$d.b();
            n$a.a = e0$d.e;
            n$a.k = "application/id3";
            i.a(new n(n$a));
        }
        else {
            this.g = (w)new db.g();
        }
    }
    
    public final void e() {
    }
    
    public final void f(final int n, final long s) {
        if (s != -9223372036854775807L) {
            this.s = s;
        }
    }
}
