// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import android.util.Log;
import ad.s;

public final class b
{
    public static void a(final long n, final s s, final w[] array) {
    Label_0000:
        while (true) {
            final int c = s.c;
            final int b = s.b;
            final boolean b2 = true;
            if (c - b > 1) {
                int n2 = 0;
                while (true) {
                    while (s.c - s.b != 0) {
                        final int r = s.r();
                        final int n3 = n2 += r;
                        if (r != 255) {
                            int n4 = 0;
                            while (true) {
                                while (s.c - s.b != 0) {
                                    final int r2 = s.r();
                                    final int n5 = n4 += r2;
                                    if (r2 != 255) {
                                        final int b3 = s.b;
                                        final int n6 = b3 + n5;
                                        int c2;
                                        if (n5 != -1 && n5 <= s.c - b3) {
                                            c2 = n6;
                                            if (n3 == 4) {
                                                c2 = n6;
                                                if (n5 >= 8) {
                                                    final int r3 = s.r();
                                                    final int w = s.w();
                                                    int c3;
                                                    if (w == 49) {
                                                        c3 = s.c();
                                                    }
                                                    else {
                                                        c3 = 0;
                                                    }
                                                    final int r4 = s.r();
                                                    if (w == 47) {
                                                        s.C(1);
                                                    }
                                                    boolean b4 = r3 == 181 && (w == 49 || w == 47) && r4 == 3;
                                                    if (w == 49) {
                                                        b4 &= (c3 == 1195456820 && b2);
                                                    }
                                                    c2 = n6;
                                                    if (b4) {
                                                        b(n, s, array);
                                                        c2 = n6;
                                                    }
                                                }
                                            }
                                        }
                                        else {
                                            Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                                            c2 = s.c;
                                        }
                                        s.B(c2);
                                        continue Label_0000;
                                    }
                                }
                                final int n5 = -1;
                                continue;
                            }
                        }
                    }
                    final int n3 = -1;
                    continue;
                }
            }
            break;
        }
    }
    
    public static void b(final long n, final s s, final w[] array) {
        final int r = s.r();
        final int n2 = 0;
        if ((r & 0x40) == 0x0) {
            return;
        }
        s.C(1);
        final int n3 = (r & 0x1F) * 3;
        final int b = s.b;
        for (int length = array.length, i = n2; i < length; ++i) {
            final w w = array[i];
            s.B(b);
            w.e(n3, s);
            if (n != -9223372036854775807L) {
                w.a(n, 1, n3, 0, (w$a)null);
            }
        }
    }
}
