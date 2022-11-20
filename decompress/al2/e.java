// 
// Decompiled by Procyon v0.6.0
// 

package al2;

import ai2.h;
import nm2.d;

public final class e extends a
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
    
    public e() {
        this.l = new int[64];
        this.reset();
    }
    
    public e(final e e) {
        super((a)e);
        this.l = new int[64];
        this.q(e);
    }
    
    public static int n(final int n, final int n2, final int n3) {
        return (n & n3) ^ (n & n2) ^ (n2 & n3);
    }
    
    public static int o(final int n) {
        return (n << 10 | n >>> 22) ^ ((n >>> 2 | n << 30) ^ (n >>> 13 | n << 19));
    }
    
    public static int p(final int n) {
        return (n << 7 | n >>> 25) ^ ((n >>> 6 | n << 26) ^ (n >>> 11 | n << 21));
    }
    
    public final void a(final d d) {
        this.q((e)d);
    }
    
    public final d copy() {
        return (d)new e(this);
    }
    
    public final String e() {
        return "SHA-224";
    }
    
    public final int f() {
        return 28;
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
        this.reset();
        return 28;
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
            final int p = p(h);
            final int[] n6 = al2.e.n;
            final int n7 = p + ((j & h) ^ (~h & k)) + n6[n5] + this.l[n5] + m;
            final int n8 = g + n7;
            final int n9 = n(d, e, f) + o(d) + n7;
            ++n5;
            final int n10 = p(n8) + ((~n8 & j) ^ (h & n8)) + n6[n5] + this.l[n5] + k;
            final int n11 = f + n10;
            final int n12 = n(n9, d, e) + o(n9) + n10;
            ++n5;
            final int n13 = p(n11) + ((n8 & n11) ^ (~n11 & h)) + n6[n5] + this.l[n5] + j;
            final int n14 = e + n13;
            final int n15 = n(n12, n9, d) + o(n12) + n13;
            int n16 = n5 + 1;
            final int n17 = p(n14) + ((n11 & n14) ^ (~n14 & n8)) + n6[n16] + this.l[n16] + h;
            final int n18 = d + n17;
            final int n19 = n(n15, n12, n9) + o(n15) + n17;
            ++n16;
            final int n20 = p(n18) + ((n14 & n18) ^ (~n18 & n11)) + n6[n16] + this.l[n16] + n8;
            final int n21 = n9 + n20;
            g = n20 + (n(n19, n15, n12) + o(n19));
            int n22 = n16 + 1;
            final int n23 = p(n21) + ((n18 & n21) ^ (~n21 & n14)) + n6[n22] + this.l[n22] + n11;
            k = n12 + n23;
            f = n(g, n19, n15) + o(g) + n23;
            ++n22;
            final int n24 = p(k) + ((n21 & k) ^ (~k & n18)) + n6[n22] + this.l[n22] + n14;
            j = n15 + n24;
            e = n24 + (n(f, g, n19) + o(f));
            final int n25 = n22 + 1;
            final int n26 = p(j) + ((k & j) ^ (~j & n21)) + n6[n25] + this.l[n25] + n18;
            final int o = o(e);
            final int n27 = n(e, f, g);
            n5 = n25 + 1;
            final int n28 = n4 + 1;
            final int n29 = n21;
            h = n19 + n26;
            d = n27 + o + n26;
            m = n29;
            n4 = n28;
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
        for (int n30 = 0; n30 < 16; ++n30) {
            this.l[n30] = 0;
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
    
    public final void q(final e e) {
        this.i((a)e);
        this.d = e.d;
        this.e = e.e;
        this.f = e.f;
        this.g = e.g;
        this.h = e.h;
        this.i = e.i;
        this.j = e.j;
        this.k = e.k;
        final int[] l = e.l;
        System.arraycopy(l, 0, this.l, 0, l.length);
        this.m = e.m;
    }
    
    public final void reset() {
        super.reset();
        this.d = -1056596264;
        this.e = 914150663;
        this.f = 812702999;
        this.g = -150054599;
        this.h = -4191439;
        this.i = 1750603025;
        this.j = 1694076839;
        this.k = -1090891868;
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
