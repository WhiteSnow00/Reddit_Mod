// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.j;
import com.google.android.exoplayer2.n$a;
import ya.m;
import java.util.Arrays;
import bd.r;
import db.w$a;
import bd.d0;
import com.google.android.exoplayer2.n;
import db.w;
import bd.s;

public final class i implements k
{
    public final s a;
    public final String b;
    public String c;
    public w d;
    public int e;
    public int f;
    public int g;
    public long h;
    public n i;
    public int j;
    public long k;
    
    public i(final String b) {
        this.a = new s(new byte[18]);
        this.e = 0;
        this.k = -9223372036854775807L;
        this.b = b;
    }
    
    public final void b() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }
    
    public final void c(final s s) {
        d0.g(this.d);
    Label_0007:
        while (true) {
            final int n = s.c - s.b;
            if (n <= 0) {
                return;
            }
            final int e = this.e;
            if (e == 0) {
                while (true) {
                    while (s.c - s.b > 0) {
                        final int g = this.g << 8;
                        this.g = g;
                        final int g2 = g | s.r();
                        this.g = g2;
                        if (g2 == 2147385345 || g2 == -25230976 || g2 == 536864768 || g2 == -14745368) {
                            final byte[] a = this.a.a;
                            a[0] = (byte)(g2 >> 24 & 0xFF);
                            a[1] = (byte)(g2 >> 16 & 0xFF);
                            a[2] = (byte)(g2 >> 8 & 0xFF);
                            a[3] = (byte)(g2 & 0xFF);
                            this.f = 4;
                            this.g = 0;
                            final boolean b = true;
                            if (b) {
                                this.e = 1;
                                continue Label_0007;
                            }
                            continue Label_0007;
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
            if (e != 1) {
                if (e != 2) {
                    throw new IllegalStateException();
                }
                final int min = Math.min(n, this.j - this.f);
                this.d.c(min, s);
                final int f = this.f + min;
                this.f = f;
                final int j = this.j;
                if (f != j) {
                    continue;
                }
                final long k = this.k;
                if (k != -9223372036854775807L) {
                    this.d.b(k, 1, j, 0, (w$a)null);
                    this.k += this.h;
                }
                this.e = 0;
            }
            else {
                final byte[] a2 = this.a.a;
                final int min2 = Math.min(n, 18 - this.f);
                s.b(this.f, min2, a2);
                if ((this.f += min2) != 18) {
                    continue;
                }
                final byte[] a3 = this.a.a;
                if (this.i == null) {
                    final String c = this.c;
                    final String b2 = this.b;
                    r r;
                    if (a3[0] == 127) {
                        r = new r(a3, a3.length);
                    }
                    else {
                        final byte[] copy = Arrays.copyOf(a3, a3.length);
                        final byte b3 = copy[0];
                        if (b3 == -2 || b3 == -1) {
                            for (int i = 0; i < copy.length - 1; i += 2) {
                                final byte b4 = copy[i];
                                final int n2 = i + 1;
                                copy[i] = copy[n2];
                                copy[n2] = b4;
                            }
                        }
                        r = new r(copy, copy.length);
                        if (copy[0] == 31) {
                            final r r2 = new r(copy, copy.length);
                            while (r2.b() >= 16) {
                                r2.m(2);
                                final int n3 = r2.g(14) & 0x3FFF;
                                final int min3 = Math.min(8 - r.c, 14);
                                final int c2 = r.c;
                                final int n4 = 8 - c2 - min3;
                                final byte[] a4 = r.a;
                                final int b5 = r.b;
                                final byte b6 = (byte)((65280 >> c2 | (1 << n4) - 1) & a4[b5]);
                                a4[b5] = b6;
                                int l = 14 - min3;
                                a4[b5] = (byte)(b6 | n3 >>> l << n4);
                                int n5;
                                byte[] a5;
                                for (n5 = b5 + 1; l > 8; l -= 8, a5[n5] = (byte)(n3 >>> l), ++n5) {
                                    a5 = r.a;
                                }
                                final int n6 = 8 - l;
                                final byte[] a6 = r.a;
                                final byte b7 = (byte)(a6[n5] & (1 << n6) - 1);
                                a6[n5] = b7;
                                a6[n5] = (byte)((n3 & (1 << l) - 1) << n6 | b7);
                                r.m(14);
                                r.a();
                            }
                        }
                        r.j(copy.length, copy);
                    }
                    r.m(60);
                    final int n7 = m.a[r.g(6)];
                    final int y = m.b[r.g(4)];
                    final int g3 = r.g(5);
                    final int[] c3 = m.c;
                    int f2;
                    if (g3 >= 29) {
                        f2 = -1;
                    }
                    else {
                        f2 = c3[g3] * 1000 / 2;
                    }
                    r.m(10);
                    int n8;
                    if (r.g(2) > 0) {
                        n8 = 1;
                    }
                    else {
                        n8 = 0;
                    }
                    final n$a n$a = new n$a();
                    n$a.a = c;
                    n$a.k = "audio/vnd.dts";
                    n$a.f = f2;
                    n$a.x = n7 + n8;
                    n$a.y = y;
                    n$a.n = null;
                    n$a.c = b2;
                    final n m = new n(n$a);
                    this.i = m;
                    this.d.a(m);
                }
                final byte b8 = a3[0];
                int n11 = 0;
                boolean b11 = false;
                Label_0977: {
                    int n9 = 0;
                    byte b9 = 0;
                    Label_0963: {
                        if (b8 != -2) {
                            int n10;
                            byte b10;
                            if (b8 != -1) {
                                if (b8 != 31) {
                                    n9 = ((0x3 & a3[5]) << 12 | (a3[6] & 0xFF) << 4);
                                    b9 = a3[7];
                                    break Label_0963;
                                }
                                n10 = ((0x3 & a3[6]) << 12 | (a3[7] & 0xFF) << 4);
                                b10 = a3[8];
                            }
                            else {
                                n10 = ((0x3 & a3[7]) << 12 | (a3[6] & 0xFF) << 4);
                                b10 = a3[9];
                            }
                            n11 = (n10 | (b10 & 0x3C) >> 2) + 1;
                            b11 = true;
                            break Label_0977;
                        }
                        n9 = ((a3[4] & 0x3) << 12 | (a3[7] & 0xFF) << 4);
                        b9 = a3[6];
                    }
                    n11 = (n9 | (b9 & 0xF0) >> 4) + 1;
                    b11 = false;
                }
                int j2 = n11;
                if (b11) {
                    j2 = n11 * 16 / 14;
                }
                this.j = j2;
                int n12 = 0;
                int n13 = 0;
                Label_1103: {
                    byte b12 = 0;
                    Label_1097: {
                        if (b8 != -2) {
                            byte b13;
                            if (b8 != -1) {
                                if (b8 != 31) {
                                    n12 = (a3[4] & 0x1) << 6;
                                    b12 = a3[5];
                                    break Label_1097;
                                }
                                n12 = (0x7 & a3[5]) << 4;
                                b13 = a3[6];
                            }
                            else {
                                final byte b14 = a3[4];
                                b13 = a3[7];
                                n12 = (b14 & 0x7) << 4;
                            }
                            n13 = (b13 & 0x3C);
                            break Label_1103;
                        }
                        n12 = (a3[5] & 0x1) << 6;
                        b12 = a3[4];
                    }
                    n13 = (b12 & 0xFC);
                }
                this.h = (int)(((n13 >> 2 | n12) + 1) * 32 * 1000000L / this.i.E);
                this.a.B(0);
                this.d.c(18, this.a);
                this.e = 2;
            }
        }
    }
    
    public final void d(final j j, final e0$d e0$d) {
        e0$d.a();
        e0$d.b();
        this.c = e0$d.e;
        e0$d.b();
        this.d = j.k(e0$d.d, 1);
    }
    
    public final void e() {
    }
    
    public final void f(final int n, final long k) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
}
