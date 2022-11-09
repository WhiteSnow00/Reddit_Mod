// 
// Decompiled by Procyon v0.6.0
// 

package bd;

public final class r
{
    public byte[] a;
    public int b;
    public int c;
    public int d;
    
    public r() {
        this.a = c0.f;
    }
    
    public r(final byte[] a, final int d) {
        this.a = a;
        this.d = d;
    }
    
    public final void a() {
        final int b = this.b;
        boolean b2 = false;
        Label_0038: {
            if (b >= 0) {
                final int d = this.d;
                if (b < d || (b == d && this.c == 0)) {
                    b2 = true;
                    break Label_0038;
                }
            }
            b2 = false;
        }
        d0.f(b2);
    }
    
    public final int b() {
        return (this.d - this.b) * 8 - this.c;
    }
    
    public final void c() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        ++this.b;
        this.a();
    }
    
    public final int d() {
        d0.f(this.c == 0);
        return this.b;
    }
    
    public final int e() {
        return this.b * 8 + this.c;
    }
    
    public final boolean f() {
        final boolean b = (this.a[this.b] & 128 >> this.c) != 0x0;
        this.l();
        return b;
    }
    
    public final int g(final int n) {
        if (n == 0) {
            return 0;
        }
        this.c += n;
        int n2 = 0;
        int c;
        while (true) {
            c = this.c;
            if (c <= 8) {
                break;
            }
            final int c2 = c - 8;
            this.c = c2;
            n2 |= (this.a[this.b++] & 0xFF) << c2;
        }
        final byte[] a = this.a;
        final int b = this.b;
        final byte b2 = a[b];
        if (c == 8) {
            this.c = 0;
            this.b = b + 1;
        }
        this.a();
        return -1 >>> 32 - n & (n2 | (b2 & 0xFF) >> 8 - c);
    }
    
    public final void h(int n, final byte[] array) {
        final int n2 = (n >> 3) + 0;
        for (int i = 0; i < n2; ++i) {
            final byte[] a = this.a;
            final int b = this.b;
            final int b2 = b + 1;
            this.b = b2;
            final byte b3 = a[b];
            final int c = this.c;
            final byte b4 = (byte)(b3 << c);
            array[i] = b4;
            array[i] = (byte)((0xFF & a[b2]) >> 8 - c | b4);
        }
        n &= 0x7;
        if (n == 0) {
            return;
        }
        final byte b5 = (byte)(array[n2] & 255 >> n);
        array[n2] = b5;
        final int c2 = this.c;
        if (c2 + n > 8) {
            array[n2] = (byte)(b5 | (this.a[this.b++] & 0xFF) << c2);
            this.c = c2 - 8;
        }
        final int c3 = this.c + n;
        this.c = c3;
        final byte[] a2 = this.a;
        final int b6 = this.b;
        array[n2] |= (byte)((0xFF & a2[b6]) >> 8 - c3 << 8 - n);
        if (c3 == 8) {
            this.c = 0;
            this.b = b6 + 1;
        }
        this.a();
    }
    
    public final void i(final int n, final byte[] array) {
        d0.f(this.c == 0);
        System.arraycopy(this.a, this.b, array, 0, n);
        this.b += n;
        this.a();
    }
    
    public final void j(final int d, final byte[] a) {
        this.a = a;
        this.b = 0;
        this.c = 0;
        this.d = d;
    }
    
    public final void k(final int n) {
        final int b = n / 8;
        this.b = b;
        this.c = n - b * 8;
        this.a();
    }
    
    public final void l() {
        final int c = this.c + 1;
        this.c = c;
        if (c == 8) {
            this.c = 0;
            ++this.b;
        }
        this.a();
    }
    
    public final void m(int b) {
        final int n = b / 8;
        final int b2 = this.b + n;
        this.b = b2;
        b = a.b(n, 8, b, this.c);
        this.c = b;
        if (b > 7) {
            this.b = b2 + 1;
            this.c = b - 8;
        }
        this.a();
    }
    
    public final void n(final int n) {
        d0.f(this.c == 0);
        this.b += n;
        this.a();
    }
}
