// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import ad.c0;
import ad.s;

public final class m
{
    public static boolean a(final s s, final p p4, int b, final a a) {
        final int b2 = s.b;
        final long s2 = s.s();
        final long n = s2 >>> 16;
        if (n != b) {
            return false;
        }
        if ((n & 0x1L) == 0x1L) {
            b = 1;
        }
        else {
            b = 0;
        }
        final int n2 = (int)(s2 >> 12 & 0xFL);
        final int n3 = (int)(s2 >> 8 & 0xFL);
        final int n4 = (int)(0xFL & s2 >> 4);
        final int n5 = (int)(s2 >> 1 & 0x7L);
        final boolean b3 = (s2 & 0x1L) == 0x1L;
        while (true) {
            if ((n4 <= 7) ? (n4 == p4.g - 1) : (n4 <= 10 && p4.g == 2)) {
                boolean b4 = false;
                Label_0185: {
                    if (n5 != 0) {
                        if (n5 != p4.i) {
                            b4 = false;
                            break Label_0185;
                        }
                    }
                    b4 = true;
                }
                if (b4 && !b3) {
                    try {
                        long x = s.x();
                        if (b == 0) {
                            x *= p4.b;
                        }
                        a.a = x;
                        b = 1;
                    }
                    catch (final NumberFormatException ex) {
                        b = 0;
                    }
                    if (b != 0) {
                        b = b(n2, s);
                        if (b != -1 && b <= p4.b) {
                            b = 1;
                        }
                        else {
                            b = 0;
                        }
                        if (b != 0) {
                            final int e = p4.e;
                            Label_0365: {
                                if (n3 != 0) {
                                    if ((n3 > 11) ? ((n3 != 12) ? (n3 <= 14) : (s.r() * 1000 == e)) : (n3 == p4.f)) {
                                        break Label_0358;
                                    }
                                    Label_0363: {
                                        b = 0;
                                    }
                                    break Label_0365;
                                }
                                b = 1;
                            }
                            if (b != 0) {
                                final int r = s.r();
                                final int b5 = s.b;
                                final byte[] a2 = s.a;
                                b = 0;
                                for (int i = b2; i < b5 - 1; ++i) {
                                    b = c0.o[b ^ (a2[i] & 0xFF)];
                                }
                                final int a3 = c0.a;
                                if (r == b) {
                                    b = 1;
                                }
                                else {
                                    b = 0;
                                }
                                if (b != 0) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
            final int n6;
            b = n6 * 10;
            int e = 0;
            iftrue(Label_0363:)(b != e);
            continue;
        }
    }
    
    public static int b(final int n, final s s) {
        switch (n) {
            default: {
                return -1;
            }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15: {
                return 256 << n - 8;
            }
            case 7: {
                return s.w() + 1;
            }
            case 6: {
                return s.r() + 1;
            }
            case 2:
            case 3:
            case 4:
            case 5: {
                return 576 << n - 2;
            }
            case 1: {
                return 192;
            }
        }
    }
    
    public static final class a
    {
        public long a;
    }
}
