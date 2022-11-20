// 
// Decompiled by Procyon v0.6.0
// 

package al2;

import ai2.h;
import nm2.d;

public final class f extends a
{
    public static final int[] n;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int[] l;
    public int m;
    
    static {
        n = new int[] { 1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998 };
    }
    
    public f() {
        this.l = new int[64];
        this.reset();
    }
    
    public f(final f f) {
        super((a)f);
        this.l = new int[64];
        this.p(f);
    }
    
    public static int n(final int n) {
        return (n << 10 | n >>> 22) ^ ((n >>> 2 | n << 30) ^ (n >>> 13 | n << 19));
    }
    
    public static int o(final int n) {
        return (n << 7 | n >>> 25) ^ ((n >>> 6 | n << 26) ^ (n >>> 11 | n << 21));
    }
    
    public final void a(final d d) {
        this.p((f)d);
    }
    
    public final d copy() {
        return (d)new f(this);
    }
    
    public final String e() {
        return "SHA-256";
    }
    
    public final int f() {
        return 32;
    }
    
    public final int g(final int n, final byte[] array) {
        this.j();
        ai2.h.G(this.d, n, array);
        ai2.h.G(this.e, n + 4, array);
        ai2.h.G(this.f, n + 8, array);
        ai2.h.G(this.g, n + 12, array);
        ai2.h.G(this.h, n + 16, array);
        ai2.h.G(this.i, n + 20, array);
        ai2.h.G(this.j, n + 24, array);
        ai2.h.G(this.k, n + 28, array);
        this.reset();
        return 32;
    }
    
    public final void k() {
        for (int i = 16; i <= 63; ++i) {
            final int[] l = this.l;
            final int n = l[i - 2];
            final int n2 = l[i - 7];
            final int n3 = l[i - 15];
            l[i] = (n >>> 10 ^ ((n >>> 17 | n << 15) ^ (n >>> 19 | n << 13))) + n2 + (n3 >>> 3 ^ ((n3 >>> 7 | n3 << 25) ^ (n3 >>> 18 | n3 << 14))) + l[i - 16];
        }
        int d = this.d;
        int e = this.e;
        int f = this.f;
        int g = this.g;
        int h = this.h;
        int j = this.i;
        int k = this.j;
        int m = this.k;
        int n4 = 0;
        int n5 = 0;
        while (n4 < 8) {
            final int o = o(h);
            final int[] n6 = al2.f.n;
            final int n7 = o + ((j & h) ^ (~h & k)) + n6[n5] + this.l[n5] + m;
            final int n8 = g + n7;
            final int n9 = n(d) + (((d ^ e) & f) | (d & e)) + n7;
            ++n5;
            final int n10 = o(n8) + ((~n8 & j) ^ (h & n8)) + n6[n5] + this.l[n5] + k;
            final int n11 = f + n10;
            final int n12 = n(n9) + ((n9 & d) | ((n9 ^ d) & e)) + n10;
            ++n5;
            final int n13 = o(n11) + ((n8 & n11) ^ (~n11 & h)) + n6[n5] + this.l[n5] + j;
            final int n14 = e + n13;
            final int n15 = n(n12) + ((n12 & n9) | ((n12 ^ n9) & d)) + n13;
            ++n5;
            final int n16 = o(n14) + ((n11 & n14) ^ (~n14 & n8)) + n6[n5] + this.l[n5] + h;
            final int n17 = d + n16;
            final int n18 = n(n15) + ((n15 & n12) | ((n15 ^ n12) & n9)) + n16;
            ++n5;
            final int n19 = o(n17) + ((n14 & n17) ^ (~n17 & n11)) + n6[n5] + this.l[n5] + n8;
            m = n9 + n19;
            g = n(n18) + ((n18 & n15) | ((n18 ^ n15) & n12)) + n19;
            ++n5;
            final int n20 = o(m) + ((n17 & m) ^ (~m & n14)) + n6[n5] + this.l[n5] + n11;
            k = n12 + n20;
            f = n(g) + ((g & n18) | ((g ^ n18) & n15)) + n20;
            ++n5;
            final int n21 = o(k) + ((m & k) ^ (~k & n17)) + n6[n5] + this.l[n5] + n14;
            j = n15 + n21;
            e = n(f) + ((f & g) | ((f ^ g) & n18)) + n21;
            ++n5;
            final int n22 = o(j) + ((k & j) ^ (~j & m)) + n6[n5] + this.l[n5] + n17;
            h = n18 + n22;
            d = n(e) + ((e & f) | ((e ^ f) & g)) + n22;
            ++n5;
            ++n4;
        }
        this.d += d;
        this.e += e;
        this.f += f;
        this.g += g;
        this.h += h;
        this.i += j;
        this.j += k;
        this.k += m;
        this.m = 0;
        for (int n23 = 0; n23 < 16; ++n23) {
            this.l[n23] = 0;
        }
    }
    
    public final void l(final long n) {
        if (this.m > 14) {
            this.k();
        }
        final int[] l = this.l;
        l[14] = (int)(n >>> 32);
        l[15] = (int)(n & -1L);
    }
    
    public final void m(int m, final byte[] array) {
        final byte b = array[m];
        final int n = m + 1;
        m = array[n];
        final int n2 = n + 1;
        final byte b2 = array[n2];
        final byte b3 = array[n2 + 1];
        final int[] l = this.l;
        final int i = this.m;
        l[i] = ((b3 & 0xFF) | (b << 24 | (m & 0xFF) << 16 | (b2 & 0xFF) << 8));
        m = i + 1;
        this.m = m;
        if (m == 16) {
            this.k();
        }
    }
    
    public final void p(final f f) {
        this.i((a)f);
        this.d = f.d;
        this.e = f.e;
        this.f = f.f;
        this.g = f.g;
        this.h = f.h;
        this.i = f.i;
        this.j = f.j;
        this.k = f.k;
        final int[] l = f.l;
        System.arraycopy(l, 0, this.l, 0, l.length);
        this.m = f.m;
    }
    
    public final void reset() {
        super.reset();
        this.d = 1779033703;
        this.e = -1150833019;
        this.f = 1013904242;
        this.g = -1521486534;
        this.h = 1359893119;
        this.i = -1694144372;
        this.j = 528734635;
        this.k = 1541459225;
        this.m = 0;
        int n = 0;
        while (true) {
            final int[] l = this.l;
            if (n == l.length) {
                break;
            }
            l[n] = 0;
            ++n;
        }
    }
}
