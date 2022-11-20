// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import java.nio.charset.Charset;
import m5.a;
import java.util.Arrays;
import ah0.b;

public final class t
{
    public byte[] a;
    public int b;
    public int c;
    
    public t() {
        this.a = c0.f;
    }
    
    public t(final int c) {
        this.a = new byte[c];
        this.c = c;
    }
    
    public t(final byte[] a) {
        this.a = a;
        this.c = a.length;
    }
    
    public t(final byte[] a, final int c) {
        this.a = a;
        this.c = c;
    }
    
    public final void A(final int c) {
        ah0.b.C(c >= 0 && c <= this.a.length);
        this.c = c;
    }
    
    public final void B(final int b) {
        b.C(b >= 0 && b <= this.c);
        this.b = b;
    }
    
    public final void C(final int n) {
        this.B(this.b + n);
    }
    
    public final void a(final int n) {
        final byte[] a = this.a;
        if (n > a.length) {
            this.a = Arrays.copyOf(a, n);
        }
    }
    
    public final void b(final int n, final int n2, final byte[] array) {
        System.arraycopy(this.a, this.b, array, n, n2);
        this.b += n2;
    }
    
    public final int c() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        final int n2 = n + 1;
        final byte b3 = a[n];
        final int n3 = n2 + 1;
        final byte b4 = a[n2];
        this.b = n3 + 1;
        return (a[n3] & 0xFF) | ((b2 & 0xFF) << 24 | (b3 & 0xFF) << 16 | (b4 & 0xFF) << 8);
    }
    
    public final String d() {
        int i;
        if (this.c - (i = this.b) == 0) {
            return null;
        }
        while (i < this.c) {
            final byte b = this.a[i];
            final int a = c0.a;
            if (b == 10 || b == 13) {
                break;
            }
            ++i;
        }
        final int b2 = this.b;
        if (i - b2 >= 3) {
            final byte[] a2 = this.a;
            if (a2[b2] == -17 && a2[b2 + 1] == -69 && a2[b2 + 2] == -65) {
                this.b = b2 + 3;
            }
        }
        final byte[] a3 = this.a;
        final int b3 = this.b;
        final int a4 = c0.a;
        final String s = new String(a3, b3, i - b3, sg.b.c);
        this.b = i;
        final int c = this.c;
        if (i == c) {
            return s;
        }
        final byte[] a5 = this.a;
        if (a5[i] == 13) {
            ++i;
            if ((this.b = i) == c) {
                return s;
            }
        }
        final int b4 = this.b;
        if (a5[b4] == 10) {
            this.b = b4 + 1;
        }
        return s;
    }
    
    public final int e() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        final int n2 = n + 1;
        final byte b3 = a[n];
        final int n3 = n2 + 1;
        final byte b4 = a[n2];
        this.b = n3 + 1;
        return (a[n3] & 0xFF) << 24 | ((b2 & 0xFF) | (b3 & 0xFF) << 8 | (b4 & 0xFF) << 16);
    }
    
    public final long f() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final long n2 = a[b];
        final int n3 = n + 1;
        final long n4 = a[n];
        final int n5 = n3 + 1;
        final long n6 = a[n3];
        final int n7 = n5 + 1;
        final long n8 = a[n5];
        final int n9 = n7 + 1;
        final long n10 = a[n7];
        final int n11 = n9 + 1;
        final long n12 = a[n9];
        final int n13 = n11 + 1;
        final long n14 = a[n11];
        this.b = n13 + 1;
        return (n2 & 0xFFL) | (n4 & 0xFFL) << 8 | (n6 & 0xFFL) << 16 | (n8 & 0xFFL) << 24 | (n10 & 0xFFL) << 32 | (n12 & 0xFFL) << 40 | (n14 & 0xFFL) << 48 | ((long)a[n13] & 0xFFL) << 56;
    }
    
    public final short g() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        this.b = n + 1;
        return (short)((a[n] & 0xFF) << 8 | (b2 & 0xFF));
    }
    
    public final long h() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final long n2 = a[b];
        final int n3 = n + 1;
        final long n4 = a[n];
        final int n5 = n3 + 1;
        final long n6 = a[n3];
        this.b = n5 + 1;
        return (n2 & 0xFFL) | (n4 & 0xFFL) << 8 | (n6 & 0xFFL) << 16 | ((long)a[n5] & 0xFFL) << 24;
    }
    
    public final int i() {
        final int e = this.e();
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException(m5.a.c(29, "Top bit not zero: ", e));
    }
    
    public final int j() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        this.b = n + 1;
        return (a[n] & 0xFF) << 8 | (b2 & 0xFF);
    }
    
    public final long k() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final long n2 = a[b];
        final int n3 = n + 1;
        final long n4 = a[n];
        final int n5 = n3 + 1;
        final long n6 = a[n3];
        final int n7 = n5 + 1;
        final long n8 = a[n5];
        final int n9 = n7 + 1;
        final long n10 = a[n7];
        final int n11 = n9 + 1;
        final long n12 = a[n9];
        final int n13 = n11 + 1;
        final long n14 = a[n11];
        this.b = n13 + 1;
        return (n2 & 0xFFL) << 56 | (n4 & 0xFFL) << 48 | (n6 & 0xFFL) << 40 | (n8 & 0xFFL) << 32 | (n10 & 0xFFL) << 24 | (n12 & 0xFFL) << 16 | (n14 & 0xFFL) << 8 | ((long)a[n13] & 0xFFL);
    }
    
    public final String l() {
        int b;
        String s;
        if (this.c - (b = this.b) == 0) {
            s = null;
        }
        else {
            while (b < this.c && this.a[b] != 0) {
                ++b;
            }
            final byte[] a = this.a;
            final int b2 = this.b;
            final int a2 = c0.a;
            s = new String(a, b2, b - b2, sg.b.c);
            if ((this.b = b) < this.c) {
                this.b = b + 1;
            }
        }
        return s;
    }
    
    public final String m(final int n) {
        if (n == 0) {
            return "";
        }
        final int b = this.b;
        final int n2 = b + n - 1;
        int n3;
        if (n2 < this.c && this.a[n2] == 0) {
            n3 = n - 1;
        }
        else {
            n3 = n;
        }
        final byte[] a = this.a;
        final int a2 = c0.a;
        final String s = new String(a, b, n3, sg.b.c);
        this.b += n;
        return s;
    }
    
    public final short n() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        this.b = n + 1;
        return (short)((a[n] & 0xFF) | (b2 & 0xFF) << 8);
    }
    
    public final String o(final int n) {
        return this.p(n, sg.b.c);
    }
    
    public final String p(final int n, final Charset charset) {
        final String s = new String(this.a, this.b, n, charset);
        this.b += n;
        return s;
    }
    
    public final int q() {
        return this.r() << 21 | this.r() << 14 | this.r() << 7 | this.r();
    }
    
    public final int r() {
        return this.a[this.b++] & 0xFF;
    }
    
    public final long s() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final long n2 = a[b];
        final int n3 = n + 1;
        final long n4 = a[n];
        final int n5 = n3 + 1;
        final long n6 = a[n3];
        this.b = n5 + 1;
        return (n2 & 0xFFL) << 24 | (n4 & 0xFFL) << 16 | (n6 & 0xFFL) << 8 | ((long)a[n5] & 0xFFL);
    }
    
    public final int t() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        final int n2 = n + 1;
        final byte b3 = a[n];
        this.b = n2 + 1;
        return (a[n2] & 0xFF) | ((b2 & 0xFF) << 16 | (b3 & 0xFF) << 8);
    }
    
    public final int u() {
        final int c = this.c();
        if (c >= 0) {
            return c;
        }
        throw new IllegalStateException(m5.a.c(29, "Top bit not zero: ", c));
    }
    
    public final long v() {
        final long k = this.k();
        if (k >= 0L) {
            return k;
        }
        final StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(k);
        throw new IllegalStateException(sb.toString());
    }
    
    public final int w() {
        final byte[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        final byte b2 = a[b];
        this.b = n + 1;
        return (a[n] & 0xFF) | (b2 & 0xFF) << 8;
    }
    
    public final long x() {
        long n = this.a[this.b];
        int n2 = 7;
        int i = 0;
        int n4 = 0;
        Label_0077: {
            while (true) {
                i = 1;
                if (n2 < 0) {
                    break;
                }
                final int n3 = 1 << n2;
                if (((long)n3 & n) == 0x0L) {
                    if (n2 < 6) {
                        n &= n3 - 1;
                        n4 = 7 - n2;
                        break Label_0077;
                    }
                    if (n2 == 7) {
                        n4 = 1;
                        break Label_0077;
                    }
                    break;
                }
                else {
                    --n2;
                }
            }
            n4 = 0;
        }
        if (n4 != 0) {
            while (i < n4) {
                final byte b = this.a[this.b + i];
                if ((b & 0xC0) != 0x80) {
                    final StringBuilder sb = new StringBuilder(62);
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(n);
                    throw new NumberFormatException(sb.toString());
                }
                n = (n << 6 | (long)(b & 0x3F));
                ++i;
            }
            this.b += n4;
            return n;
        }
        final StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(n);
        throw new NumberFormatException(sb2.toString());
    }
    
    public final void y(final int n) {
        byte[] a;
        if ((a = this.a).length < n) {
            a = new byte[n];
        }
        this.z(n, a);
    }
    
    public final void z(final int c, final byte[] a) {
        this.a = a;
        this.c = c;
        this.b = 0;
    }
}
