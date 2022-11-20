// 
// Decompiled by Procyon v0.6.0
// 

package al2;

import ai2.h;

public final class d extends a
{
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int[] i;
    public int j;
    
    public d() {
        this.i = new int[80];
        this.reset();
    }
    
    public d(final d d) {
        super((a)d);
        this.i = new int[80];
        this.n(d);
    }
    
    public final void a(final nm2.d d) {
        final d d2 = (d)d;
        this.i((a)d2);
        this.n(d2);
    }
    
    public final nm2.d copy() {
        return (nm2.d)new d(this);
    }
    
    public final String e() {
        return "SHA-1";
    }
    
    public final int f() {
        return 20;
    }
    
    public final int g(final int n, final byte[] array) {
        this.j();
        ai2.h.G(this.d, n, array);
        ai2.h.G(this.e, n + 4, array);
        ai2.h.G(this.f, n + 8, array);
        ai2.h.G(this.g, n + 12, array);
        ai2.h.G(this.h, n + 16, array);
        this.reset();
        return 20;
    }
    
    public final void k() {
        for (int i = 16; i < 80; ++i) {
            final int[] j = this.i;
            final int n = j[i - 3] ^ j[i - 8] ^ j[i - 14] ^ j[i - 16];
            j[i] = (n >>> 31 | n << 1);
        }
        int n2 = this.d;
        int n3 = this.e;
        int f = this.f;
        int g = this.g;
        int h = this.h;
        int k;
        int n4;
        for (k = 0, n4 = 0; k < 4; ++k, ++n4) {
            final int[] l = this.i;
            final int n5 = n4 + 1;
            final int f2 = a.f((n2 << 5 | n2 >>> 27) + ((f & n3) | (~n3 & g)), l[n4], 1518500249, h);
            final int n6 = n3 >>> 2 | n3 << 30;
            final int n7 = n5 + 1;
            final int f3 = a.f((f2 << 5 | f2 >>> 27) + ((n6 & n2) | (~n2 & f)), l[n5], 1518500249, g);
            final int n8 = n2 >>> 2 | n2 << 30;
            final int n9 = n7 + 1;
            final int f4 = a.f((f3 << 5 | f3 >>> 27) + ((n8 & f2) | (~f2 & n6)), l[n7], 1518500249, f);
            h = (f2 >>> 2 | f2 << 30);
            n4 = n9 + 1;
            n3 = a.f((f4 << 5 | f4 >>> 27) + ((h & f3) | (~f3 & n8)), l[n9], 1518500249, n6);
            g = (f3 >>> 2 | f3 << 30);
            n2 = a.f((n3 << 5 | n3 >>> 27) + ((g & f4) | (~f4 & h)), l[n4], 1518500249, n8);
            f = (f4 >>> 2 | f4 << 30);
        }
        for (int n10 = 0; n10 < 4; ++n10, ++n4) {
            final int[] m = this.i;
            final int n11 = n4 + 1;
            final int f5 = a.f((n2 << 5 | n2 >>> 27) + (n3 ^ f ^ g), m[n4], 1859775393, h);
            final int n12 = n3 >>> 2 | n3 << 30;
            final int n13 = n11 + 1;
            final int f6 = a.f((f5 << 5 | f5 >>> 27) + (n2 ^ n12 ^ f), m[n11], 1859775393, g);
            final int n14 = n2 >>> 2 | n2 << 30;
            final int n15 = n13 + 1;
            final int f7 = a.f((f6 << 5 | f6 >>> 27) + (f5 ^ n14 ^ n12), m[n13], 1859775393, f);
            h = (f5 >>> 2 | f5 << 30);
            n4 = n15 + 1;
            n3 = a.f((f7 << 5 | f7 >>> 27) + (f6 ^ h ^ n14), m[n15], 1859775393, n12);
            g = (f6 >>> 2 | f6 << 30);
            n2 = a.f((n3 << 5 | n3 >>> 27) + (f7 ^ g ^ h), m[n4], 1859775393, n14);
            f = (f7 >>> 2 | f7 << 30);
        }
        for (int n16 = 0; n16 < 4; ++n16, ++n4) {
            final int[] i2 = this.i;
            final int n17 = n4 + 1;
            final int f8 = a.f(((n3 & f) | (n3 & g) | (f & g)) + (n2 << 5 | n2 >>> 27), i2[n4], -1894007588, h);
            final int n18 = n3 >>> 2 | n3 << 30;
            final int n19 = n17 + 1;
            final int f9 = a.f(((n2 & n18) | (n2 & f) | (n18 & f)) + (f8 << 5 | f8 >>> 27), i2[n17], -1894007588, g);
            final int n20 = n2 >>> 2 | n2 << 30;
            final int n21 = n19 + 1;
            final int f10 = a.f(((f8 & n20) | (f8 & n18) | (n20 & n18)) + (f9 << 5 | f9 >>> 27), i2[n19], -1894007588, f);
            h = (f8 >>> 2 | f8 << 30);
            n4 = n21 + 1;
            n3 = a.f(((f9 & h) | (f9 & n20) | (h & n20)) + (f10 << 5 | f10 >>> 27), i2[n21], -1894007588, n18);
            g = (f9 >>> 2 | f9 << 30);
            n2 = a.f(((f10 & g) | (f10 & h) | (g & h)) + (n3 << 5 | n3 >>> 27), i2[n4], -1894007588, n20);
            f = (f10 >>> 2 | f10 << 30);
        }
        final int n22 = 0;
        for (int n23 = n4, n24 = n22; n24 <= 3; ++n24, ++n23) {
            final int[] i3 = this.i;
            final int n25 = n23 + 1;
            final int f11 = a.f((n2 << 5 | n2 >>> 27) + (n3 ^ f ^ g), i3[n23], -899497514, h);
            final int n26 = n3 >>> 2 | n3 << 30;
            final int n27 = n25 + 1;
            final int f12 = a.f((f11 << 5 | f11 >>> 27) + (n2 ^ n26 ^ f), i3[n25], -899497514, g);
            final int n28 = n2 >>> 2 | n2 << 30;
            final int n29 = n27 + 1;
            final int f13 = a.f((f12 << 5 | f12 >>> 27) + (f11 ^ n28 ^ n26), i3[n27], -899497514, f);
            h = (f11 >>> 2 | f11 << 30);
            n23 = n29 + 1;
            n3 = a.f((f13 << 5 | f13 >>> 27) + (f12 ^ h ^ n28), i3[n29], -899497514, n26);
            g = (f12 >>> 2 | f12 << 30);
            n2 = a.f((n3 << 5 | n3 >>> 27) + (f13 ^ g ^ h), i3[n23], -899497514, n28);
            f = (f13 >>> 2 | f13 << 30);
        }
        this.d += n2;
        this.e += n3;
        this.f += f;
        this.g += g;
        this.h += h;
        this.j = 0;
        for (int n30 = 0; n30 < 16; ++n30) {
            this.i[n30] = 0;
        }
    }
    
    public final void l(final long n) {
        if (this.j > 14) {
            this.k();
        }
        final int[] i = this.i;
        i[14] = (int)(n >>> 32);
        i[15] = (int)n;
    }
    
    public final void m(int j, final byte[] array) {
        final byte b = array[j];
        final int n = j + 1;
        j = array[n];
        final int n2 = n + 1;
        final byte b2 = array[n2];
        final byte b3 = array[n2 + 1];
        final int[] i = this.i;
        final int k = this.j;
        i[k] = ((b3 & 0xFF) | (b << 24 | (j & 0xFF) << 16 | (b2 & 0xFF) << 8));
        j = k + 1;
        this.j = j;
        if (j == 16) {
            this.k();
        }
    }
    
    public final void n(final d d) {
        this.d = d.d;
        this.e = d.e;
        this.f = d.f;
        this.g = d.g;
        this.h = d.h;
        final int[] i = d.i;
        System.arraycopy(i, 0, this.i, 0, i.length);
        this.j = d.j;
    }
    
    public final void reset() {
        super.reset();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.h = -1009589776;
        this.j = 0;
        int n = 0;
        while (true) {
            final int[] i = this.i;
            if (n == i.length) {
                break;
            }
            i[n] = 0;
            ++n;
        }
    }
}
