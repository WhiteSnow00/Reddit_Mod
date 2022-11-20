// 
// Decompiled by Procyon v0.6.0
// 

package qe2;

public final class a
{
    public static byte[] a(final byte[] array) {
        final int length = array.length;
        final a$c a$c = new a$c();
        int n = length / 3 * 4;
        if (length % 3 > 0) {
            n += 4;
        }
        final byte[] a = new byte[n];
        ((a)a$c).a = a;
        final byte[] i = qe2.a.a$c.i;
        final int e = a$c.e;
        final int n2 = 0;
        final int n3 = 0;
        final int n4 = length + 0;
        final int d = a$c.d;
        int n5 = 0;
        int n6 = 0;
        Label_0197: {
            if (d != 1) {
                if (d == 2) {
                    if (1 <= n4) {
                        final byte[] c = a$c.c;
                        n5 = ((c[1] & 0xFF) << 8 | (c[0] & 0xFF) << 16 | (array[0] & 0xFF));
                        a$c.d = 0;
                        n6 = 1;
                        break Label_0197;
                    }
                }
            }
            else if (2 <= n4) {
                n5 = ((a$c.c[0] & 0xFF) << 16 | (array[0] & 0xFF) << 8 | (array[1] & 0xFF));
                a$c.d = 0;
                n6 = 2;
                break Label_0197;
            }
            n6 = 0;
            n5 = -1;
        }
        while (true) {
            Label_0475: {
                int n8 = 0;
                Label_0464: {
                    int n7;
                    int n10;
                    if (n5 != -1) {
                        a[0] = i[n5 >> 18 & 0x3F];
                        a[1] = i[n5 >> 12 & 0x3F];
                        a[2] = i[n5 >> 6 & 0x3F];
                        a[3] = i[n5 & 0x3F];
                        n7 = e - 1;
                        if (n7 == 0) {
                            a[4] = 10;
                            n8 = 4 + 1;
                            final byte[] array2 = a;
                            final a$c a$c2 = a$c;
                            final int n9 = n6;
                            break Label_0464;
                        }
                        n10 = 4;
                    }
                    else {
                        n10 = 0;
                        n7 = e;
                    }
                    int e2 = n7;
                    final byte[] array2 = a;
                    final a$c a$c2 = a$c;
                    int n9 = n6;
                    int n11 = n10;
                    final int n12 = n9 + 3;
                    if (n12 > n4) {
                        final int d2 = a$c.d;
                        final int n13 = n9 - d2;
                        int b2 = 0;
                        Label_0914: {
                            int n20;
                            if (n13 == n4 - 1) {
                                byte b;
                                int n14;
                                if (d2 > 0) {
                                    b = a$c.c[0];
                                    n14 = 1;
                                }
                                else {
                                    b = array[n9];
                                    n14 = n3;
                                }
                                final int n15 = (b & 0xFF) << 4;
                                a$c.d = d2 - n14;
                                final int n16 = n11 + 1;
                                array2[n11] = i[n15 >> 6 & 0x3F];
                                int n17 = n16 + 1;
                                array2[n16] = i[n15 & 0x3F];
                                if (a$c.f) {
                                    final int n18 = n17 + 1;
                                    array2[n18] = (array2[n17] = 61);
                                    n17 = n18 + 1;
                                }
                                b2 = n17;
                                if (!a$c.g) {
                                    break Label_0914;
                                }
                                int n19 = n17;
                                if (a$c.h) {
                                    array2[n17] = 13;
                                    n19 = n17 + 1;
                                }
                                n20 = n19 + 1;
                                array2[n19] = 10;
                            }
                            else if (n13 == n4 - 2) {
                                int n21;
                                int n22;
                                if (d2 > 1) {
                                    n21 = a$c.c[0];
                                    n22 = 1;
                                }
                                else {
                                    final byte b3 = array[n9];
                                    ++n9;
                                    n22 = n2;
                                    n21 = b3;
                                }
                                byte b4;
                                if (d2 > 0) {
                                    b4 = a$c.c[n22];
                                    ++n22;
                                }
                                else {
                                    b4 = array[n9];
                                }
                                final int n23 = (b4 & 0xFF) << 2 | (n21 & 0xFF) << 10;
                                a$c.d = d2 - n22;
                                final int n24 = n11 + 1;
                                array2[n11] = i[n23 >> 12 & 0x3F];
                                final int n25 = n24 + 1;
                                array2[n24] = i[n23 >> 6 & 0x3F];
                                int n26 = n25 + 1;
                                array2[n25] = i[n23 & 0x3F];
                                if (a$c.f) {
                                    array2[n26] = 61;
                                    ++n26;
                                }
                                b2 = n26;
                                if (!a$c.g) {
                                    break Label_0914;
                                }
                                int n27 = n26;
                                if (a$c.h) {
                                    array2[n26] = 13;
                                    n27 = n26 + 1;
                                }
                                n20 = n27 + 1;
                                array2[n27] = 10;
                            }
                            else {
                                b2 = n11;
                                if (!a$c.g || (b2 = n11) <= 0) {
                                    break Label_0914;
                                }
                                b2 = n11;
                                if (e2 == 19) {
                                    break Label_0914;
                                }
                                int n28 = n11;
                                if (a$c.h) {
                                    array2[n11] = 13;
                                    n28 = n11 + 1;
                                }
                                n20 = n28 + 1;
                                array2[n28] = 10;
                            }
                            b2 = n20;
                        }
                        ((a)a$c).b = b2;
                        a$c.e = e2;
                        return ((a)a$c2).a;
                    }
                    final int n29 = (array[n9 + 1] & 0xFF) << 8 | (array[n9] & 0xFF) << 16 | (array[n9 + 2] & 0xFF);
                    array2[n11] = i[n29 >> 18 & 0x3F];
                    array2[n11 + 1] = i[n29 >> 12 & 0x3F];
                    array2[n11 + 2] = i[n29 >> 6 & 0x3F];
                    array2[n11 + 3] = i[n29 & 0x3F];
                    n11 += 4;
                    if (--e2 != 0) {
                        n9 = n12;
                        break Label_0475;
                    }
                    int n30 = n11;
                    if (a$c.h) {
                        array2[n11] = 13;
                        n30 = n11 + 1;
                    }
                    array2[n30] = 10;
                    final int n31 = n30 + 1;
                    n9 = n12;
                    n8 = n31;
                }
                int e2 = 19;
                int n11 = n8;
            }
            continue;
        }
    }
    
    public abstract static class a
    {
        public byte[] a;
        public int b;
    }
}
