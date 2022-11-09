// 
// Decompiled by Procyon v0.6.0
// 

package q9;

public final class l
{
    public short[] a;
    public short[] b;
    public short[] c;
    public short[] d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    
    public l(int n, int i) {
        this.t = n;
        this.i = i;
        this.p = n / 400;
        n /= 65;
        this.q = n;
        n *= 2;
        this.r = n;
        this.j = n;
        i *= n;
        this.a = new short[i];
        this.l = n;
        this.b = new short[i];
        this.k = n;
        this.c = new short[i];
        this.d = new short[n];
        this.u = 0;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0;
        this.h = 0;
    }
    
    public static void e(final int n, final int n2, final short[] array, final int n3, final short[] array2, final int n4, final short[] array3, final int n5) {
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
        final int n2 = this.r / i;
        final int j = this.i;
        final int n3 = i * j;
        int n4;
        int k;
        for (i = 0; i < n2; ++i) {
            for (k = (n4 = 0); k < n3; ++k) {
                n4 += array[b.b(i, n3, n * j, k)];
            }
            this.d[i] = (short)(n4 / n3);
        }
    }
    
    public final void b(int length) {
        final int n = this.n;
        final int l = this.l;
        if (n + length > l) {
            length = (l >> 1) + length + l;
            this.l = length;
            final short[] b = this.b;
            final int n2 = length * this.i;
            final short[] b2 = new short[n2];
            if (b.length <= (length = n2)) {
                length = b.length;
            }
            System.arraycopy(b, 0, b2, 0, length);
            this.b = b2;
        }
    }
    
    public final int c(final short[] array, int n, int i, final int n2) {
        final int n3 = n * this.i;
        int n4 = 1;
        int n5 = 255;
        int n7;
        int n6 = n7 = 0;
        while (i <= n2) {
            for (int j = n = 0; j < i; ++j) {
                final short n8 = array[n3 + j];
                final short n9 = array[n3 + i + j];
                int n10;
                if (n8 >= n9) {
                    n10 = n8 - n9;
                }
                else {
                    n10 = n9 - n8;
                }
                n += n10;
            }
            int n11 = n4;
            int n12 = n6;
            if (n * n6 < n4 * i) {
                n12 = i;
                n11 = n;
            }
            int n13 = n5;
            int n14 = n7;
            if (n * n5 > n7 * i) {
                n13 = i;
                n14 = n;
            }
            ++i;
            n4 = n11;
            n5 = n13;
            n6 = n12;
            n7 = n14;
        }
        this.w = n4 / n6;
        this.x = n7 / n5;
        return n6;
    }
    
    public final void d(final short[] array, final int n, final short[] array2, final int n2, final int n3) {
        final int i = this.i;
        System.arraycopy(array2, n2 * i, array, n * i, n3 * i);
    }
    
    public final void f(int u, short[] array) {
        if (u != 0) {
            final int m = this.m;
            final int j = this.j;
            if (m + u > j) {
                final int i = (j >> 1) + u + j;
                this.j = i;
                final short[] a = this.a;
                final int n = i * this.i;
                final short[] a2 = new short[n];
                int length;
                if (a.length <= (length = n)) {
                    length = a.length;
                }
                System.arraycopy(a, 0, a2, 0, length);
                this.a = a2;
            }
            this.d(this.a, this.m, array, 0, u);
            this.m += u;
        }
        final int n2 = this.n;
        final float n3 = this.e / 1.0f;
        final float n4 = this.f * 1.0f;
        final double n5 = n3;
        if (n5 <= 1.00001 && n5 >= 0.99999) {
            array = this.a;
            u = this.m;
            this.b(u);
            this.d(this.b, this.n, array, 0, u);
            this.n += u;
            this.m = 0;
        }
        else {
            final int k = this.m;
            if (k >= this.r) {
                int n6 = 0;
                while (true) {
                    u = this.s;
                    if (u > 0) {
                        u = Math.min(this.r, u);
                        array = this.a;
                        this.b(u);
                        this.d(this.b, this.n, array, n6, u);
                        this.n += u;
                        this.s -= u;
                        u += n6;
                    }
                    else {
                        array = this.a;
                        u = this.t;
                        if (u > 4000) {
                            u /= 4000;
                        }
                        else {
                            u = 1;
                        }
                        if (this.i == 1 && u == 1) {
                            u = this.c(array, n6, this.p, this.q);
                        }
                        else {
                            this.a(array, n6, u);
                            final int c = this.c(this.d, 0, this.p / u, this.q / u);
                            if (u != 1) {
                                final int n7 = c * u;
                                u <<= 2;
                                final int n8 = n7 - u;
                                final int n9 = n7 + u;
                                final int p2 = this.p;
                                if ((u = n8) < p2) {
                                    u = p2;
                                }
                                final int q = this.q;
                                int n10;
                                if ((n10 = n9) > q) {
                                    n10 = q;
                                }
                                if (this.i == 1) {
                                    u = this.c(array, n6, u, n10);
                                }
                                else {
                                    this.a(array, n6, 1);
                                    u = this.c(this.d, 0, u, n10);
                                }
                            }
                            else {
                                u = c;
                            }
                        }
                        final int w = this.w;
                        final int x = this.x;
                        boolean b = false;
                        Label_0572: {
                            if (w != 0) {
                                if (this.u != 0) {
                                    if (x <= w * 3) {
                                        if (w * 2 > this.v * 3) {
                                            b = true;
                                            break Label_0572;
                                        }
                                    }
                                }
                            }
                            b = false;
                        }
                        int u2;
                        if (b) {
                            u2 = this.u;
                        }
                        else {
                            u2 = u;
                        }
                        this.v = w;
                        this.u = u;
                        if (n5 > 1.0) {
                            array = this.a;
                            if (n3 >= 2.0f) {
                                u = (int)(u2 / (n3 - 1.0f));
                            }
                            else {
                                this.s = (int)((2.0f - n3) * u2 / (n3 - 1.0f));
                                u = u2;
                            }
                            this.b(u);
                            e(u, this.i, this.b, this.n, array, n6, array, n6 + u2);
                            this.n += u;
                            u = u2 + u + n6;
                        }
                        else {
                            array = this.a;
                            if (n3 < 0.5f) {
                                u = (int)(u2 * n3 / (1.0f - n3));
                            }
                            else {
                                this.s = (int)((2.0f * n3 - 1.0f) * u2 / (1.0f - n3));
                                u = u2;
                            }
                            final int n11 = u2 + u;
                            this.b(n11);
                            this.d(this.b, this.n, array, n6, u2);
                            e(u, this.i, this.b, this.n + u2, array, n6 + u2, array, n6);
                            this.n += n11;
                            u += n6;
                        }
                    }
                    if (this.r + u > k) {
                        break;
                    }
                    n6 = u;
                }
                final int l = this.m - u;
                array = this.a;
                this.d(array, 0, array, u, l);
                this.m = l;
            }
        }
        if (n4 != 1.0f) {
            if (this.n != n2) {
                int t;
                for (t = this.t, u = (int)(t / n4); u > 16384 || t > 16384; u >>= 1, t >>= 1) {}
                final int n12 = this.n - n2;
                final int o = this.o;
                final int k2 = this.k;
                if (o + n12 > k2) {
                    final int k3 = (k2 >> 1) + n12 + k2;
                    this.k = k3;
                    array = this.c;
                    final int n13 = k3 * this.i;
                    final short[] c2 = new short[n13];
                    int length2;
                    if (array.length <= (length2 = n13)) {
                        length2 = array.length;
                    }
                    System.arraycopy(array, 0, c2, 0, length2);
                    this.c = c2;
                }
                this.d(this.c, this.o, this.b, n2, n12);
                this.n = n2;
                this.o += n12;
                int n14 = 0;
                int o2;
                while (true) {
                    o2 = this.o;
                    if (n14 >= o2 - 1) {
                        break;
                    }
                    int g;
                    int h;
                    while (true) {
                        g = this.g + 1;
                        h = this.h;
                        if (g * u <= h * t) {
                            break;
                        }
                        this.b(1);
                        int n15 = 0;
                        while (true) {
                            final int i2 = this.i;
                            if (n15 >= i2) {
                                break;
                            }
                            array = this.b;
                            final int n16 = this.n;
                            final short[] c3 = this.c;
                            final int n17 = n14 * i2 + n15;
                            final short n18 = c3[n17];
                            final short n19 = c3[n17 + i2];
                            final int h2 = this.h;
                            final int g2 = this.g;
                            final int n20 = (g2 + 1) * u;
                            final int n21 = n20 - h2 * t;
                            final int n22 = n20 - g2 * u;
                            array[n16 * i2 + n15] = (short)(((n22 - n21) * n19 + n18 * n21) / n22);
                            ++n15;
                        }
                        ++this.h;
                        ++this.n;
                    }
                    if ((this.g = g) == t) {
                        this.g = 0;
                        if (h != u) {
                            System.out.printf("Assertion failed: newRatePosition != newSampleRate\n", new Object[0]);
                        }
                        this.h = 0;
                    }
                    ++n14;
                }
                u = o2 - 1;
                if (u != 0) {
                    array = this.c;
                    this.d(array, 0, array, u, o2 - u);
                    this.o -= u;
                }
            }
        }
    }
}
