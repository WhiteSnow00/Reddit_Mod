// 
// Decompiled by Procyon v0.6.0
// 

package mm2;

import xd.a;

public final class b
{
    public int a;
    public int b;
    
    public b(final byte[] array) {
        final boolean b = false;
        this.a = 0;
        if (array.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        final byte b2 = array[0];
        final byte b3 = array[1];
        int n = 2;
        final int b4 = (array[3] & 0xFF) << 24 | ((b2 & 0xFF) | (b3 & 0xFF) << 8 | (array[2] & 0xFF) << 16);
        int n2 = 0;
        Label_0168: {
            if ((this.b = b4) == 0) {
                n2 = (b ? 1 : 0);
            }
            else {
                int u0;
                for (int r = xd.a.R(b4), i = 0; i < r >>> 1; ++i, n = u0) {
                    u0 = xd.a.u0(n, n, b4);
                    int n3 = u0 ^ 0x2;
                    int x0;
                    for (int j = b4; j != 0; j = x0) {
                        x0 = xd.a.X0(n3, j);
                        n3 = j;
                    }
                    if (n3 != 1) {
                        n2 = (b ? 1 : 0);
                        break Label_0168;
                    }
                }
                n2 = 1;
            }
        }
        if (n2 != 0) {
            this.a = xd.a.R(this.b);
            return;
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }
    
    public final int a(int n) {
        final int a = this.a;
        final int n2 = 1;
        final int n3 = (1 << a) - 2;
        if (n3 == 0) {
            n = n2;
        }
        else if (n == 0) {
            n = 0;
        }
        else if (n == 1) {
            n = n2;
        }
        else {
            int i = n3;
            int n4 = n;
            if (n3 < 0) {
                n4 = this.a(n);
                i = -n3;
            }
            n = 1;
            while (i != 0) {
                int c = n;
                if ((i & 0x1) == 0x1) {
                    c = this.c(n, n4);
                }
                n4 = this.c(n4, n4);
                i >>>= 1;
                n = c;
            }
        }
        return n;
    }
    
    public final boolean b(final int n) {
        final int a = this.a;
        final boolean b = false;
        boolean b2 = false;
        if (a == 31) {
            if (n >= 0) {
                b2 = true;
            }
            return b2;
        }
        boolean b3 = b;
        if (n >= 0) {
            b3 = b;
            if (n < 1 << a) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final int c(final int n, final int n2) {
        return xd.a.u0(n, n2, this.b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != null) {
            if (o instanceof b) {
                final b b = (b)o;
                if (this.a == b.a && this.b == b.b) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Finite Field GF(2^");
        t.append(this.a);
        t.append(") = GF(2)[X]/<");
        final int b = this.b;
        String s;
        if (b == 0) {
            s = "0";
        }
        else {
            if ((byte)(b & 0x1) == 1) {
                s = "1";
            }
            else {
                s = "";
            }
            String string;
            for (int i = b >>> 1, n = 1; i != 0; i >>>= 1, ++n, s = string) {
                string = s;
                if ((byte)(i & 0x1) == 1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(s);
                    sb.append("+x^");
                    sb.append(n);
                    string = sb.toString();
                }
            }
        }
        return ph0.a.f(t, s, "> ");
    }
}
