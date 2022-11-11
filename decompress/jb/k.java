// 
// Decompiled by Procyon v0.6.0
// 

package jb;

import java.io.IOException;
import ad.s;
import cb.i;

public final class k
{
    public static final int[] a;
    
    static {
        a = new int[] { 1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686 };
    }
    
    public static boolean a(final i i, final boolean b, final boolean b2) throws IOException {
        final long length = i.getLength();
        final long n = lcmp(length, -1L);
        long n2 = 4096L;
        if (n != 0) {
            if (length > 4096L) {
                n2 = n2;
            }
            else {
                n2 = length;
            }
        }
        int n3 = (int)n2;
        final s s = new s(64);
        int n4 = 0;
        while (true) {
            int n5;
            int n10;
            int n11;
            for (int j = n5 = 0; j < n3; n3 = n10, n5 = n11) {
                s.y(8);
                if (!i.g(s.a, n4, 8, true)) {
                    break;
                }
                final long s2 = s.s();
                final int c = s.c();
                int n6 = 16;
                long k;
                if (s2 == 1L) {
                    i.b(8, 8, s.a);
                    s.A(16);
                    k = s.k();
                }
                else {
                    k = s2;
                    if (s2 == 0L) {
                        final long length2 = i.getLength();
                        k = s2;
                        if (length2 != -1L) {
                            k = length2 - i.k() + 8;
                        }
                    }
                    n6 = 8;
                }
                final long n7 = n6;
                if (k < n7) {
                    return n4 != 0;
                }
                final int n8 = j + n6;
                if (c == 1836019574) {
                    int n9 = n3 + (int)k;
                    if (n != 0 && n9 > length) {
                        n9 = (int)length;
                    }
                    n10 = n9;
                    j = n8;
                    n11 = n5;
                }
                else {
                    if (c == 1836019558 || c == 1836475768) {
                        final int n12 = 1;
                        if (n5 != 0 && (b ? 1 : 0) == n12) {
                            n4 = 1;
                        }
                        return n4 != 0;
                    }
                    if (n8 + k - n7 >= n3) {
                        n4 = 0;
                        break;
                    }
                    final int n13 = (int)(k - n7);
                    final int n14 = n8 + n13;
                    if (c == 1718909296) {
                        if (n13 < 8) {
                            return false;
                        }
                        s.y(n13);
                        i.b(0, n13, s.a);
                        final int n15 = n13 / 4;
                        int n16 = 0;
                        int n17;
                        while (true) {
                            n17 = n5;
                            if (n16 >= n15) {
                                break;
                            }
                            if (n16 == 1) {
                                s.C(4);
                            }
                            else {
                                final int c2 = s.c();
                                boolean b3 = false;
                                Label_0489: {
                                    Label_0474: {
                                        if (c2 >>> 8 != 3368816) {
                                            if (c2 != 1751476579 || !b2) {
                                                final int[] a = jb.k.a;
                                                for (int l = 0; l < 29; ++l) {
                                                    if (a[l] == c2) {
                                                        break Label_0474;
                                                    }
                                                }
                                                b3 = false;
                                                break Label_0489;
                                            }
                                        }
                                    }
                                    b3 = true;
                                }
                                if (b3) {
                                    n17 = 1;
                                    break;
                                }
                            }
                            ++n16;
                        }
                        n4 = 0;
                        n10 = n3;
                        j = n14;
                        if ((n11 = n17) == 0) {
                            return false;
                        }
                    }
                    else {
                        final int n18 = n4 = 0;
                        n10 = n3;
                        j = n14;
                        n11 = n5;
                        if (n13 != 0) {
                            i.m(n13);
                            n11 = n5;
                            j = n14;
                            n10 = n3;
                            n4 = n18;
                        }
                    }
                }
            }
            final int n12 = n4;
            continue;
        }
    }
}
