// 
// Decompiled by Procyon v0.6.0
// 

package qm2;

public final class e
{
    public b a;
    public int b;
    public int[] c;
    
    public e(final b a, final int b) {
        this.a = a;
        this.b = b;
        (this.c = new int[b + 1])[b] = 1;
    }
    
    public e(final b a, final byte[] array) {
        this.a = a;
        int n = 8;
        int n2 = 1;
        while (a.a > n) {
            ++n2;
            n += 8;
        }
        if (array.length % n2 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.c = new int[array.length / n2];
        int n4;
        int n3 = n4 = 0;
        while (true) {
            final int[] c = this.c;
            if (n3 < c.length) {
                for (int i = 0; i < n; i += 8, ++n4) {
                    final int[] c2 = this.c;
                    c2[n3] ^= (array[n4] & 0xFF) << i;
                }
                if (!this.a.b(this.c[n3])) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                ++n3;
            }
            else {
                if (c.length != 1 && c[c.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                this.c();
            }
        }
    }
    
    public e(final b a, final int[] array) {
        this.a = a;
        int b = b(array);
        int[] c;
        if (b == -1) {
            c = new int[] { 0 };
        }
        else {
            final int length = array.length;
            ++b;
            if (length == b) {
                c = new int[array.length];
                System.arraycopy(array, 0, c, 0, array.length);
            }
            else {
                c = new int[b];
                System.arraycopy(array, 0, c, 0, b);
            }
        }
        this.c = c;
        this.c();
    }
    
    public e(final e e) {
        this.a = e.a;
        this.b = e.b;
        final int[] c = e.c;
        final int[] c2 = new int[c.length];
        System.arraycopy(c, 0, c2, 0, c.length);
        this.c = c2;
    }
    
    public static int b(final int[] array) {
        int n;
        for (n = array.length - 1; n >= 0 && array[n] == 0; --n) {}
        return n;
    }
    
    public final int[] a(int[] array, int[] array2) {
        if (array.length < array2.length) {
            final int[] array3 = new int[array2.length];
            System.arraycopy(array2, 0, array3, 0, array2.length);
            array2 = array3;
        }
        else {
            final int[] array4 = new int[array.length];
            System.arraycopy(array, 0, array4, 0, array.length);
            array = array2;
            array2 = array4;
        }
        for (int i = array.length - 1; i >= 0; --i) {
            final b a = this.a;
            final int n = array2[i];
            final int n2 = array[i];
            a.getClass();
            array2[i] = (n ^ n2);
        }
        return array2;
    }
    
    public final void c() {
        int n = this.c.length;
        do {
            this.b = n - 1;
            n = this.b;
        } while (n >= 0 && this.c[n] == 0);
    }
    
    public final int d(final int n) {
        if (n >= 0 && n <= this.b) {
            return this.c[n];
        }
        return 0;
    }
    
    public final byte[] e() {
        int n = 8;
        int n2 = 1;
        while (this.a.a > n) {
            ++n2;
            n += 8;
        }
        final byte[] array = new byte[this.c.length * n2];
        int n3;
        for (int i = n3 = 0; i < this.c.length; ++i) {
            for (int j = 0; j < n; j += 8, ++n3) {
                array[n3] = (byte)(this.c[i] >>> j);
            }
        }
        return array;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != null) {
            if (o instanceof e) {
                final e e = (e)o;
                if (this.a.equals(e.a) && this.b == e.b) {
                    final int[] c = this.c;
                    final int[] c2 = e.c;
                    final int b = b(c);
                    boolean b2 = false;
                    Label_0105: {
                        Label_0067: {
                            if (b == b(c2)) {
                                for (int i = 0; i <= b; ++i) {
                                    if (c[i] != c2[i]) {
                                        break Label_0067;
                                    }
                                }
                                b2 = true;
                                break Label_0105;
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final e f(final int n) {
        if (this.a.b(n)) {
            return new e(this.a, this.g(n, this.c));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }
    
    public final int[] g(final int n, final int[] array) {
        int i = b(array);
        if (i == -1 || n == 0) {
            return new int[1];
        }
        if (n == 1) {
            final int[] array2 = new int[array.length];
            System.arraycopy(array, 0, array2, 0, array.length);
            return array2;
        }
        final int[] array3 = new int[i + 1];
        while (i >= 0) {
            array3[i] = this.a.c(array[i], n);
            --i;
        }
        return array3;
    }
    
    @Override
    public final int hashCode() {
        int b = this.a.b;
        int n = 0;
        while (true) {
            final int[] c = this.c;
            if (n >= c.length) {
                break;
            }
            b = b * 31 + c[n];
            ++n;
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r(" Polynomial over ");
        r.append(this.a.toString());
        r.append(": \n");
        String s = r.toString();
        for (int i = 0; i < this.c.length; ++i) {
            final StringBuilder r2 = a.r(s);
            final b a = this.a;
            int n = this.c[i];
            String o = "";
            for (int j = 0; j < a.a; ++j) {
                StringBuilder sb;
                String s2;
                if (((byte)n & 0x1) == 0x0) {
                    sb = new StringBuilder();
                    s2 = "0";
                }
                else {
                    sb = new StringBuilder();
                    s2 = "1";
                }
                o = a.o(sb, s2, o);
                n >>>= 1;
            }
            r2.append(o);
            r2.append("Y^");
            r2.append(i);
            r2.append("+");
            s = r2.toString();
        }
        return al0.b.h(s, ";");
    }
}
