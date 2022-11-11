// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import ad.r;
import ad.s;

public final class c
{
    public static final int[] a;
    
    static {
        a = new int[] { 2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048 };
    }
    
    public static void a(final int n, final s s) {
        s.y(7);
        final byte[] a = s.a;
        a[0] = -84;
        a[1] = 64;
        a[2] = -1;
        a[3] = -1;
        a[4] = (byte)(n >> 16 & 0xFF);
        a[5] = (byte)(n >> 8 & 0xFF);
        a[6] = (byte)(n & 0xFF);
    }
    
    public static a b(final r r) {
        final int g = r.g(16);
        int n = r.g(16);
        int n2;
        if (n == 65535) {
            n = r.g(24);
            n2 = 7;
        }
        else {
            n2 = 4;
        }
        int n3 = n + n2;
        if (g == 44097) {
            n3 += 2;
        }
        final int g2 = r.g(2);
        final int n4 = 0;
        if (g2 == 3) {
            do {
                r.g(2);
            } while (r.f());
        }
        final int g3 = r.g(10);
        if (r.f() && r.g(3) > 0) {
            r.m(2);
        }
        int n5;
        if (r.f()) {
            n5 = 48000;
        }
        else {
            n5 = 44100;
        }
        final int g4 = r.g(4);
        int n6;
        if (n5 == 44100 && g4 == 13) {
            n6 = c.a[g4];
        }
        else {
            n6 = n4;
            if (n5 == 48000) {
                final int[] a = c.a;
                n6 = n4;
                if (g4 < 14) {
                    final int n7 = a[g4];
                    final int n8 = g3 % 5;
                    Label_0274: {
                        if (n8 != 1) {
                            if (n8 != 2) {
                                if (n8 != 3) {
                                    if (n8 != 4) {
                                        n6 = n7;
                                        return new a(n5, n3, n6);
                                    }
                                    if (g4 == 3 || g4 == 8) {
                                        break Label_0274;
                                    }
                                    n6 = n7;
                                    if (g4 == 11) {
                                        break Label_0274;
                                    }
                                    return new a(n5, n3, n6);
                                }
                            }
                            else {
                                if (g4 == 8) {
                                    break Label_0274;
                                }
                                n6 = n7;
                                if (g4 == 11) {
                                    break Label_0274;
                                }
                                return new a(n5, n3, n6);
                            }
                        }
                        if (g4 != 3) {
                            n6 = n7;
                            if (g4 != 8) {
                                return new a(n5, n3, n6);
                            }
                        }
                    }
                    n6 = n7 + 1;
                }
            }
        }
        return new a(n5, n3, n6);
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        public final int c;
        
        public a(final int a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
