// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import ad.r;

public final class b
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    
    static {
        a = new int[] { 1, 2, 3, 6 };
        b = new int[] { 48000, 44100, 32000 };
        c = new int[] { 24000, 22050, 16000 };
        d = new int[] { 2, 1, 2, 3, 3, 4, 4, 5 };
        e = new int[] { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640 };
        f = new int[] { 69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };
    }
    
    public static int a(int n, int n2) {
        final int n3 = n2 / 2;
        if (n >= 0) {
            final int[] b = xa.b.b;
            if (n < 3 && n2 >= 0) {
                final int[] f = xa.b.f;
                if (n3 < 19) {
                    n = b[n];
                    if (n == 44100) {
                        return (n2 % 2 + f[n3]) * 2;
                    }
                    n2 = xa.b.e[n3];
                    if (n == 32000) {
                        return n2 * 6;
                    }
                    return n2 * 4;
                }
            }
        }
        return -1;
    }
    
    public static a b(final r r) {
        final int e = r.e();
        r.m(40);
        final boolean b = r.g(5) > 10;
        r.k(e);
        int n = -1;
        String s;
        int n5;
        int a;
        int n7;
        if (b) {
            r.m(16);
            final int g = r.g(2);
            if (g != 0) {
                if (g != 1) {
                    if (g == 2) {
                        n = 2;
                    }
                }
                else {
                    n = 1;
                }
            }
            else {
                n = 0;
            }
            r.m(3);
            final int g2 = r.g(11);
            final int g3 = r.g(2);
            int n2;
            int n3;
            int g4;
            if (g3 == 3) {
                n2 = xa.b.c[r.g(2)];
                n3 = 6;
                g4 = 3;
            }
            else {
                g4 = r.g(2);
                n3 = xa.b.a[g4];
                n2 = xa.b.b[g3];
            }
            final int g5 = r.g(3);
            final int f = r.f() ? 1 : 0;
            final int n4 = xa.b.d[g5] + f;
            r.m(10);
            if (r.f()) {
                r.m(8);
            }
            if (g5 == 0) {
                r.m(5);
                if (r.f()) {
                    r.m(8);
                }
            }
            if (n == 1 && r.f()) {
                r.m(16);
            }
            if (r.f()) {
                if (g5 > 2) {
                    r.m(2);
                }
                if ((g5 & 0x1) != 0x0 && g5 > 2) {
                    r.m(6);
                }
                if ((g5 & 0x4) != 0x0) {
                    r.m(6);
                }
                if (f != 0 && r.f()) {
                    r.m(5);
                }
                if (n == 0) {
                    if (r.f()) {
                        r.m(6);
                    }
                    if (g5 == 0 && r.f()) {
                        r.m(6);
                    }
                    if (r.f()) {
                        r.m(6);
                    }
                    final int g6 = r.g(2);
                    if (g6 == 1) {
                        r.m(5);
                    }
                    else if (g6 == 2) {
                        r.m(12);
                    }
                    else if (g6 == 3) {
                        final int g7 = r.g(5);
                        if (r.f()) {
                            r.m(5);
                            if (r.f()) {
                                r.m(4);
                            }
                            if (r.f()) {
                                r.m(4);
                            }
                            if (r.f()) {
                                r.m(4);
                            }
                            if (r.f()) {
                                r.m(4);
                            }
                            if (r.f()) {
                                r.m(4);
                            }
                            if (r.f()) {
                                r.m(4);
                            }
                            if (r.f()) {
                                r.m(4);
                            }
                            if (r.f()) {
                                if (r.f()) {
                                    r.m(4);
                                }
                                if (r.f()) {
                                    r.m(4);
                                }
                            }
                        }
                        if (r.f()) {
                            r.m(5);
                            if (r.f()) {
                                r.m(7);
                                if (r.f()) {
                                    r.m(8);
                                }
                            }
                        }
                        r.m((g7 + 2) * 8);
                        r.c();
                    }
                    if (g5 < 2) {
                        if (r.f()) {
                            r.m(14);
                        }
                        if (g5 == 0 && r.f()) {
                            r.m(14);
                        }
                    }
                    if (r.f()) {
                        if (g4 == 0) {
                            r.m(5);
                        }
                        else {
                            for (int i = 0; i < n3; ++i) {
                                if (r.f()) {
                                    r.m(5);
                                }
                            }
                        }
                    }
                }
            }
            if (r.f()) {
                r.m(5);
                if (g5 == 2) {
                    r.m(4);
                }
                if (g5 >= 6) {
                    r.m(2);
                }
                if (r.f()) {
                    r.m(8);
                }
                if (g5 == 0 && r.f()) {
                    r.m(8);
                }
                if (g3 < 3) {
                    r.l();
                }
            }
            if (n == 0 && g4 != 3) {
                r.l();
            }
            if (n == 2 && (g4 == 3 || r.f())) {
                r.m(6);
            }
            if (r.f() && r.g(6) == 1 && r.g(8) == 1) {
                s = "audio/eac3-joc";
            }
            else {
                s = "audio/eac3";
            }
            n5 = n3 * 256;
            final int n6 = (g2 + 1) * 2;
            n = n2;
            a = n6;
            n7 = n4;
        }
        else {
            r.m(32);
            final int g8 = r.g(2);
            String s2;
            if (g8 == 3) {
                s2 = null;
            }
            else {
                s2 = "audio/ac3";
            }
            a = a(g8, r.g(6));
            r.m(8);
            final int g9 = r.g(3);
            if ((g9 & 0x1) != 0x0 && g9 != 1) {
                r.m(2);
            }
            if ((g9 & 0x4) != 0x0) {
                r.m(2);
            }
            if (g9 == 2) {
                r.m(2);
            }
            final int[] b2 = xa.b.b;
            if (g8 < 3) {
                n = b2[g8];
            }
            n7 = xa.b.d[g9] + (r.f() ? 1 : 0);
            n5 = 1536;
            s = s2;
        }
        return new a(s, n7, n, a, n5);
    }
    
    public static final class a
    {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        
        public a(final String a, final int c, final int b, final int d, final int e) {
            this.a = a;
            this.c = c;
            this.b = b;
            this.d = d;
            this.e = e;
        }
    }
}
