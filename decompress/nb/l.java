// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.j;
import db.w$a;
import bd.c0;
import android.util.Pair;
import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import java.util.Arrays;
import bd.d0;
import bd.p;
import bd.s;
import db.w;

public final class l implements k
{
    public static final double[] q;
    public String a;
    public w b;
    public final f0 c;
    public final s d;
    public final nb.s e;
    public final boolean[] f;
    public final l.l$a g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    
    static {
        q = new double[] { 23.976023976023978, 24.0, 25.0, 29.97002997002997, 30.0, 50.0, 59.94005994005994, 60.0 };
    }
    
    public l(final f0 c) {
        this.c = c;
        this.f = new boolean[4];
        this.g = new l.l$a();
        if (c != null) {
            this.e = new nb.s(178);
            this.d = new s();
        }
        else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
    
    public final void b() {
        bd.p.a(this.f);
        final l.l$a g = this.g;
        g.a = false;
        g.b = 0;
        g.c = 0;
        final nb.s e = this.e;
        if (e != null) {
            e.c();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
    
    public final void c(final s s) {
        d0.g(this.b);
        int b = s.b;
        final int c = s.c;
        final byte[] a = s.a;
        final long h = this.h;
        final int n = c - b;
        this.h = h + n;
        this.b.c(n, s);
        while (true) {
            final int b2 = bd.p.b(a, b, c, this.f);
            if (b2 == c) {
                break;
            }
            final byte[] a2 = s.a;
            final int n2 = b2 + 3;
            final int n3 = a2[n2] & 0xFF;
            final int n4 = b2 - b;
            if (!this.j) {
                if (n4 > 0) {
                    this.g.a(b, b2, a);
                }
                int n5;
                if (n4 < 0) {
                    n5 = -n4;
                }
                else {
                    n5 = 0;
                }
                final l.l$a g = this.g;
                boolean b3 = false;
                Label_0276: {
                    if (g.a) {
                        final int n6 = g.b - n5;
                        g.b = n6;
                        if (g.c != 0 || n3 != 181) {
                            g.a = false;
                            b3 = true;
                            break Label_0276;
                        }
                        g.c = n6;
                    }
                    else if (n3 == 179) {
                        g.a = true;
                    }
                    g.a(0, 3, nb.l.l$a.e);
                    b3 = false;
                }
                if (b3) {
                    final l.l$a g2 = this.g;
                    final String a3 = this.a;
                    a3.getClass();
                    final byte[] copy = Arrays.copyOf(g2.d, g2.b);
                    final byte b4 = copy[4];
                    final int n7 = copy[5] & 0xFF;
                    final byte b5 = copy[6];
                    final int p = (b4 & 0xFF) << 4 | n7 >> 4;
                    final int q = (n7 & 0xF) << 8 | (b5 & 0xFF);
                    final int n8 = (copy[7] & 0xF0) >> 4;
                    float t = 0.0f;
                    Label_0463: {
                        float n9;
                        int n10;
                        if (n8 != 2) {
                            if (n8 != 3) {
                                if (n8 != 4) {
                                    t = 1.0f;
                                    break Label_0463;
                                }
                                n9 = (float)(q * 121);
                                n10 = p * 100;
                            }
                            else {
                                n9 = (float)(q * 16);
                                n10 = p * 9;
                            }
                        }
                        else {
                            n9 = (float)(q * 4);
                            n10 = p * 3;
                        }
                        t = n9 / n10;
                    }
                    final n$a n$a = new n$a();
                    n$a.a = a3;
                    n$a.k = "video/mpeg2";
                    n$a.p = p;
                    n$a.q = q;
                    n$a.t = t;
                    n$a.m = Collections.singletonList(copy);
                    final n n11 = new n(n$a);
                    final int n12 = (copy[7] & 0xF) - 1;
                    long n16 = 0L;
                    Label_0634: {
                        if (n12 >= 0) {
                            final double[] q2 = nb.l.q;
                            if (n12 < 8) {
                                double n13 = q2[n12];
                                final byte b6 = copy[g2.c + 9];
                                final int n14 = (b6 & 0x60) >> 5;
                                final int n15 = b6 & 0x1F;
                                if (n14 != n15) {
                                    n13 *= (n14 + 1.0) / (n15 + 1);
                                }
                                n16 = (long)(1000000.0 / n13);
                                break Label_0634;
                            }
                        }
                        n16 = 0L;
                    }
                    final Pair create = Pair.create((Object)n11, (Object)n16);
                    this.b.a((n)create.first);
                    this.k = (long)create.second;
                    this.j = true;
                }
            }
            final int n17 = n3;
            final nb.s e = this.e;
            if (e != null) {
                int n18;
                if (n4 > 0) {
                    e.a(b, b2, a);
                    n18 = 0;
                }
                else {
                    n18 = -n4;
                }
                if (this.e.b(n18)) {
                    final nb.s e2 = this.e;
                    final int e3 = bd.p.e(e2.e, e2.d);
                    final s d = this.d;
                    final int a4 = c0.a;
                    d.z(e3, this.e.d);
                    this.c.a(this.n, this.d);
                }
                final int n19 = n17;
                if (n19 == 178 && s.a[b2 + 2] == 1) {
                    this.e.d(n19);
                }
            }
            if (n17 != 0 && n17 != 179) {
                if (n17 == 184) {
                    this.o = true;
                }
            }
            else {
                final int n20 = c - b2;
                if (this.p && this.j) {
                    final long n21 = this.n;
                    if (n21 != -9223372036854775807L) {
                        this.b.b(n21, (int)(this.o ? 1 : 0), (int)(this.h - this.m) - n20, n20, (w$a)null);
                    }
                }
                if (!this.i || this.p) {
                    this.m = this.h - n20;
                    long l = this.l;
                    if (l == -9223372036854775807L) {
                        final long n22 = this.n;
                        if (n22 != -9223372036854775807L) {
                            l = n22 + this.k;
                        }
                        else {
                            l = -9223372036854775807L;
                        }
                    }
                    this.n = l;
                    this.o = false;
                    this.l = -9223372036854775807L;
                    this.i = true;
                }
                boolean p2 = false;
                if (n17 == 0) {
                    p2 = true;
                }
                this.p = p2;
            }
            b = n2;
        }
        if (!this.j) {
            this.g.a(b, c, a);
        }
        final nb.s e4 = this.e;
        if (e4 != null) {
            e4.a(b, c, a);
        }
    }
    
    public final void d(final j j, final e0$d e0$d) {
        e0$d.a();
        e0$d.b();
        this.a = e0$d.e;
        e0$d.b();
        this.b = j.k(e0$d.d, 2);
        final f0 c = this.c;
        if (c != null) {
            c.b(j, e0$d);
        }
    }
    
    public final void e() {
    }
    
    public final void f(final int n, final long l) {
        this.l = l;
    }
}
