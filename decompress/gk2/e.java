// 
// Decompiled by Procyon v0.6.0
// 

package gk2;

import fk2.w;
import fk2.c;
import fk2.c0;
import xi2.a;

public final class e
{
    public static final byte[] a;
    
    static {
        final byte[] bytes = "0123456789abcdef".getBytes(xi2.a.b);
        ng2.e.e((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        a = bytes;
    }
    
    public static final boolean a(c0 c0, int n, final byte[] array, final int n2) {
        int c2 = c0.c;
        byte[] array2 = c0.a;
        int c3;
        c0 f;
        for (int i = 1; i < n2; ++i, c2 = c3, c0 = f) {
            c3 = c2;
            f = c0;
            int b;
            if ((b = n) == c2) {
                f = c0.f;
                ng2.e.c((Object)f);
                array2 = f.a;
                b = f.b;
                c3 = f.c;
            }
            if (array2[b] != array[i]) {
                return false;
            }
            n = b + 1;
        }
        return true;
    }
    
    public static final String b(final c c, final long n) {
        ng2.e.f((Object)c, "<this>");
        if (n > 0L) {
            final long n2 = n - 1L;
            if (c.s(n2) == (byte)13) {
                final String f = c.F(n2);
                c.skip(2L);
                return f;
            }
        }
        final String f2 = c.F(n);
        c.skip(1L);
        return f2;
    }
    
    public static final int c(final c c, final w w, final boolean b) {
        ng2.e.f((Object)c, "<this>");
        ng2.e.f((Object)w, "options");
        final c0 f = c.f;
        int n = -2;
        if (f == null) {
            if (!b) {
                n = -1;
            }
            return n;
        }
        final byte[] a = f.a;
        int b2 = f.b;
        int c2 = f.c;
        final int[] g = w.g;
        c0 c3 = f;
        int n2 = -1;
        int n3 = 0;
        byte[] a2 = a;
    Label_0228:
        while (true) {
            final int n4 = n3 + 1;
            final int n5 = g[n3];
            final int n6 = n4 + 1;
            final int n7 = g[n4];
            if (n7 != -1) {
                n2 = n7;
            }
            if (c3 == null) {
                break;
            }
            int n10 = 0;
            int n11 = 0;
            c0 f2 = null;
            Label_0438: {
                if (n5 >= 0) {
                    final int n8 = b2 + 1;
                    final byte b3 = a2[b2];
                    int i = n6;
                    while (i != n6 + n5) {
                        if ((b3 & 0xFF) == g[i]) {
                            final int n9 = n10 = g[i + n5];
                            n11 = c2;
                            f2 = c3;
                            if ((b2 = n8) != c2) {
                                break Label_0438;
                            }
                            final c0 f3 = c3.f;
                            ng2.e.c((Object)f3);
                            final int b4 = f3.b;
                            final byte[] a3 = f3.a;
                            final int c4 = f3.c;
                            a2 = a3;
                            n10 = n9;
                            n11 = c4;
                            f2 = f3;
                            b2 = b4;
                            if (f3 == f) {
                                f2 = null;
                                b2 = b4;
                                n11 = c4;
                                n10 = n9;
                                a2 = a3;
                            }
                            break Label_0438;
                        }
                        else {
                            ++i;
                        }
                    }
                    return n2;
                }
                int n12 = n6;
                int n14;
                int b7;
                int c5;
                while (true) {
                    final int n13 = b2 + 1;
                    final byte b5 = a2[b2];
                    n14 = n12 + 1;
                    if ((b5 & 0xFF) != g[n12]) {
                        return n2;
                    }
                    final boolean b6 = n14 == n5 * -1 + n6;
                    if (n13 == c2) {
                        ng2.e.c((Object)c3);
                        f2 = c3.f;
                        ng2.e.c((Object)f2);
                        b7 = f2.b;
                        a2 = f2.a;
                        c5 = f2.c;
                        if (f2 == f) {
                            if (!b6) {
                                break Label_0228;
                            }
                            f2 = null;
                        }
                    }
                    else {
                        c5 = c2;
                        b7 = n13;
                        f2 = c3;
                    }
                    if (b6) {
                        break;
                    }
                    final int n15 = c5;
                    b2 = b7;
                    c2 = n15;
                    c3 = f2;
                    n12 = n14;
                }
                n10 = g[n14];
                n11 = c5;
                b2 = b7;
            }
            if (n10 >= 0) {
                return n10;
            }
            final int n16 = -n10;
            c2 = n11;
            n3 = n16;
            c3 = f2;
        }
        if (b) {
            return -2;
        }
        return n2;
    }
}
