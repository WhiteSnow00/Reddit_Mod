// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import ad.d0;
import java.util.Arrays;

public final class o
{
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    
    public o(int h, final int b, final float c, final float d, final int n) {
        this.a = h;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = h / (float)n;
        this.f = h / 400;
        h /= 65;
        this.g = h;
        h *= 2;
        this.h = h;
        this.i = new short[h];
        this.j = new short[h * b];
        this.l = new short[h * b];
        this.n = new short[h * b];
    }
    
    public static void d(final int n, final int n2, final short[] array, final int n3, final short[] array2, final int n4, final short[] array3, final int n5) {
        for (int i = 0; i < n2; ++i) {
            int n6 = n3 * n2 + i;
            int n7 = n5 * n2 + i;
            int n8 = n4 * n2 + i;
            for (short n9 = 0; n9 < n; ++n9) {
                array[n6] = (short)((array3[n7] * n9 + (n - n9) * array2[n8]) / n);
                n6 += n2;
                n8 += n2;
                n7 += n2;
            }
        }
    }
    
    public final void a(final short[] array, final int n, int i) {
        final int n2 = this.h / i;
        final int b = this.b;
        final int n3 = i * b;
        int n4;
        int j;
        for (i = 0; i < n2; ++i) {
            for (j = (n4 = 0); j < n3; ++j) {
                n4 += array[a.B(i, n3, n * b, j)];
            }
            this.i[i] = (short)(n4 / n3);
        }
    }
    
    public final short[] b(final short[] array, final int n, final int n2) {
        final int length = array.length;
        final int b = this.b;
        final int n3 = length / b;
        if (n + n2 <= n3) {
            return array;
        }
        return Arrays.copyOf(array, (n3 * 3 / 2 + n2) * b);
    }
    
    public final int c(final short[] array, int n, int i, final int n2) {
        final int n3 = n * this.b;
        int n4 = 1;
        int n5 = 255;
        int n7;
        int n6 = n7 = 0;
        while (i <= n2) {
            for (int j = n = 0; j < i; ++j) {
                n += Math.abs(array[n3 + j] - array[n3 + i + j]);
            }
            int n8 = n4;
            int n9 = n6;
            if (n * n6 < n4 * i) {
                n9 = i;
                n8 = n;
            }
            int n10 = n5;
            int n11 = n7;
            if (n * n5 > n7 * i) {
                n10 = i;
                n11 = n;
            }
            ++i;
            n4 = n8;
            n5 = n10;
            n6 = n9;
            n7 = n11;
        }
        this.u = n4 / n6;
        this.v = n7 / n5;
        return n6;
    }
    
    public final void e() {
        final int m = this.m;
        final float c = this.c;
        final float d = this.d;
        final float n = c / d;
        final float n2 = this.e * d;
        final double n3 = n;
        if (n3 <= 1.00001 && n3 >= 0.99999) {
            final short[] j = this.j;
            final int k = this.k;
            final short[] b = this.b(this.l, m, k);
            this.l = b;
            final int b2 = this.b;
            System.arraycopy(j, 0 * b2, b, this.m * b2, b2 * k);
            this.m += k;
            this.k = 0;
        }
        else {
            final int i = this.k;
            if (i >= this.h) {
                int n4 = 0;
                int n5;
                while (true) {
                    final int r = this.r;
                    if (r > 0) {
                        final int min = Math.min(this.h, r);
                        final short[] l = this.j;
                        final short[] b3 = this.b(this.l, this.m, min);
                        this.l = b3;
                        final int b4 = this.b;
                        System.arraycopy(l, n4 * b4, b3, this.m * b4, b4 * min);
                        this.m += min;
                        this.r -= min;
                        n5 = n4 + min;
                    }
                    else {
                        final short[] j2 = this.j;
                        final int a = this.a;
                        int n6;
                        if (a > 4000) {
                            n6 = a / 4000;
                        }
                        else {
                            n6 = 1;
                        }
                        int s;
                        if (this.b == 1 && n6 == 1) {
                            s = this.c(j2, n4, this.f, this.g);
                        }
                        else {
                            this.a(j2, n4, n6);
                            final int c2 = this.c(this.i, 0, this.f / n6, this.g / n6);
                            if (n6 != 1) {
                                final int n7 = c2 * n6;
                                final int n8 = n6 * 4;
                                final int n9 = n7 - n8;
                                final int n10 = n7 + n8;
                                final int f = this.f;
                                int n11;
                                if ((n11 = n9) < f) {
                                    n11 = f;
                                }
                                final int g = this.g;
                                int n12;
                                if ((n12 = n10) > g) {
                                    n12 = g;
                                }
                                if (this.b == 1) {
                                    s = this.c(j2, n4, n11, n12);
                                }
                                else {
                                    this.a(j2, n4, 1);
                                    s = this.c(this.i, 0, n11, n12);
                                }
                            }
                            else {
                                s = c2;
                            }
                        }
                        final int u = this.u;
                        final int v = this.v;
                        boolean b5 = false;
                        Label_0562: {
                            if (u != 0) {
                                if (this.s != 0) {
                                    if (v <= u * 3) {
                                        if (u * 2 > this.t * 3) {
                                            b5 = true;
                                            break Label_0562;
                                        }
                                    }
                                }
                            }
                            b5 = false;
                        }
                        int s2;
                        if (b5) {
                            s2 = this.s;
                        }
                        else {
                            s2 = s;
                        }
                        this.t = u;
                        this.s = s;
                        if (n3 > 1.0) {
                            final short[] j3 = this.j;
                            int n13;
                            if (n >= 2.0f) {
                                n13 = (int)(s2 / (n - 1.0f));
                            }
                            else {
                                this.r = (int)((2.0f - n) * s2 / (n - 1.0f));
                                n13 = s2;
                            }
                            final short[] b6 = this.b(this.l, this.m, n13);
                            this.l = b6;
                            d(n13, this.b, b6, this.m, j3, n4, j3, n4 + s2);
                            this.m += n13;
                            n5 = s2 + n13 + n4;
                        }
                        else {
                            final short[] j4 = this.j;
                            int n14;
                            if (n < 0.5f) {
                                n14 = (int)(s2 * n / (1.0f - n));
                            }
                            else {
                                this.r = (int)((2.0f * n - 1.0f) * s2 / (1.0f - n));
                                n14 = s2;
                            }
                            final short[] l2 = this.l;
                            final int m2 = this.m;
                            final int n15 = s2 + n14;
                            final short[] b7 = this.b(l2, m2, n15);
                            this.l = b7;
                            final int b8 = this.b;
                            System.arraycopy(j4, n4 * b8, b7, this.m * b8, b8 * s2);
                            d(n14, this.b, this.l, this.m + s2, j4, n4 + s2, j4, n4);
                            this.m += n15;
                            n5 = n4 + n14;
                        }
                    }
                    if (this.h + n5 > i) {
                        break;
                    }
                    n4 = n5;
                }
                final int k2 = this.k - n5;
                final short[] j5 = this.j;
                final int b9 = this.b;
                System.arraycopy(j5, n5 * b9, j5, 0, b9 * k2);
                this.k = k2;
            }
        }
        if (n2 != 1.0f) {
            if (this.m != m) {
                int a2;
                int n16;
                for (a2 = this.a, n16 = (int)(a2 / n2); n16 > 16384 || a2 > 16384; n16 /= 2, a2 /= 2) {}
                final int n17 = this.m - m;
                final short[] b10 = this.b(this.n, this.o, n17);
                this.n = b10;
                final short[] l3 = this.l;
                final int b11 = this.b;
                System.arraycopy(l3, m * b11, b10, this.o * b11, b11 * n17);
                this.m = m;
                this.o += n17;
                int n18 = 0;
                int o;
                int n19;
                while (true) {
                    o = this.o;
                    n19 = o - 1;
                    if (n18 >= n19) {
                        break;
                    }
                    int p;
                    int q;
                    while (true) {
                        p = this.p + 1;
                        q = this.q;
                        if (p * n16 <= q * a2) {
                            break;
                        }
                        this.l = this.b(this.l, this.m, 1);
                        int n20 = 0;
                        while (true) {
                            final int b12 = this.b;
                            if (n20 >= b12) {
                                break;
                            }
                            final short[] l4 = this.l;
                            final int m3 = this.m;
                            final short[] n21 = this.n;
                            final int n22 = n18 * b12 + n20;
                            final short n23 = n21[n22];
                            final short n24 = n21[n22 + b12];
                            final int q2 = this.q;
                            final int p2 = this.p;
                            final int n25 = (p2 + 1) * n16;
                            final int n26 = n25 - q2 * a2;
                            final int n27 = n25 - p2 * n16;
                            l4[m3 * b12 + n20] = (short)(((n27 - n26) * n24 + n23 * n26) / n27);
                            ++n20;
                        }
                        ++this.q;
                        ++this.m;
                    }
                    if ((this.p = p) == a2) {
                        this.p = 0;
                        d0.f(q == n16);
                        this.q = 0;
                    }
                    ++n18;
                }
                if (n19 != 0) {
                    final short[] n28 = this.n;
                    final int b13 = this.b;
                    System.arraycopy(n28, n19 * b13, n28, 0, (o - n19) * b13);
                    this.o -= n19;
                }
            }
        }
    }
}
