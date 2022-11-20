// 
// Decompiled by Procyon v0.6.0
// 

package mm2;

import ah0.b;

public final class a
{
    public int a;
    public int b;
    public int[][] c;
    public int d;
    
    public a(final a a) {
        this.b = a.b;
        this.a = a.a;
        this.d = a.d;
        this.c = new int[a.c.length][];
        int n = 0;
        while (true) {
            final int[][] c = this.c;
            if (n >= c.length) {
                break;
            }
            final int[] array = a.c[n];
            final int[] array2 = new int[array.length];
            System.arraycopy(array, 0, array2, 0, array.length);
            c[n] = array2;
            ++n;
        }
    }
    
    public a(final byte[] array) {
        if (array.length >= 9) {
            this.a = ah0.b.p(0, array);
            final int p = ah0.b.p(4, array);
            this.b = p;
            final int a = this.a;
            if (a > 0) {
                final int length = array.length;
                int n = 8;
                if ((p + 7 >>> 3) * a == length - 8) {
                    final int d = p + 31 >>> 5;
                    this.d = d;
                    this.c = new int[a][d];
                    final int b = this.b;
                    final int n2 = b >> 5;
                    for (int i = 0; i < this.a; ++i) {
                        for (int j = 0; j < n2; ++j, n += 4) {
                            this.c[i][j] = ah0.b.p(n, array);
                        }
                        for (int k = 0; k < (b & 0x1F); k += 8, ++n) {
                            final int[] array2 = this.c[i];
                            array2[n2] ^= (array[n] & 0xFF) << k;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
    
    public a(final int[][] c, int b) {
        int i = 0;
        final int[] array = c[0];
        if (array.length == b + 31 >> 5) {
            this.b = b;
            this.a = c.length;
            this.d = array.length;
            b &= 0x1F;
            if (b == 0) {
                b = -1;
            }
            else {
                b = (1 << b) - 1;
            }
            while (i < this.a) {
                final int[] array2 = c[i];
                final int n = this.d - 1;
                array2[n] &= b;
                ++i;
            }
            this.c = c;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }
    
    public final byte[] a() {
        final int b = this.b;
        final int a = this.a;
        int n = 8;
        final byte[] array = new byte[(b + 7 >>> 3) * a + 8];
        ah0.b.l(a, 0, array);
        ah0.b.l(this.b, 4, array);
        final int b2 = this.b;
        final int n2 = b2 >>> 5;
        for (int i = 0; i < this.a; ++i) {
            for (int j = 0; j < n2; ++j, n += 4) {
                ah0.b.l(this.c[i][j], n, array);
            }
            for (int k = 0; k < (b2 & 0x1F); k += 8, ++n) {
                array[n] = (byte)(this.c[i][n2] >>> k & 0xFF);
            }
        }
        return array;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        if (this.a == a.a && this.b == a.b && this.d == a.d) {
            for (int i = 0; i < this.a; ++i) {
                final int[] array = this.c[i];
                final int[] array2 = a.c[i];
                int n;
                if (array.length != array2.length) {
                    n = 0;
                }
                else {
                    int n2 = array.length - 1;
                    int n3 = 1;
                    while (true) {
                        n = n3;
                        if (n2 < 0) {
                            break;
                        }
                        n3 &= ((array[n2] == array2[n2]) ? 1 : 0);
                        --n2;
                    }
                }
                if (n == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n = (this.a * 31 + this.b) * 31 + this.d;
        for (int i = 0; i < this.a; ++i) {
            n = n * 31 + nm2.a.f(this.c[i]);
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final int n = this.b & 0x1F;
        int d = this.d;
        if (n != 0) {
            --d;
        }
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.a; ++i) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append(": ");
            sb.append(sb2.toString());
            for (int j = 0; j < d; ++j) {
                final int n2 = this.c[i][j];
                for (int k = 0; k < 32; ++k) {
                    if ((n2 >>> k & 0x1) == 0x0) {
                        sb.append('0');
                    }
                    else {
                        sb.append('1');
                    }
                }
                sb.append(' ');
            }
            final int n3 = this.c[i][this.d - 1];
            for (int l = 0; l < n; ++l) {
                if ((n3 >>> l & 0x1) == 0x0) {
                    sb.append('0');
                }
                else {
                    sb.append('1');
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
