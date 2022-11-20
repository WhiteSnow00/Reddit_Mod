// 
// Decompiled by Procyon v0.6.0
// 

package lb;

import java.io.IOException;
import qb.a;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import db.z$b;
import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import db.y;
import db.z;
import java.util.Arrays;
import ah0.b;
import bd.t;
import db.z$a;
import db.z$c;

public final class i extends h
{
    public i.i$a n;
    public int o;
    public boolean p;
    public z$c q;
    public z$a r;
    
    public final void a(final long g) {
        super.g = g;
        int e = 0;
        this.p = (g != 0L);
        final z$c q = this.q;
        if (q != null) {
            e = q.e;
        }
        this.o = e;
    }
    
    public final long b(final t t) {
        final byte[] a = t.a;
        int n = 0;
        final byte b = a[0];
        if ((b & 0x1) == 0x1) {
            return -1L;
        }
        final i.i$a n2 = this.n;
        ah0.b.I((Object)n2);
        int o;
        if (!n2.d[b >> 1 & 255 >>> 8 - n2.e].a) {
            o = n2.a.e;
        }
        else {
            o = n2.a.f;
        }
        if (this.p) {
            n = (this.o + o) / 4;
        }
        final long n3 = n;
        final byte[] a2 = t.a;
        final int length = a2.length;
        final int n4 = t.c + 4;
        if (length < n4) {
            final byte[] copy = Arrays.copyOf(a2, n4);
            t.z(copy.length, copy);
        }
        else {
            t.A(n4);
        }
        final byte[] a3 = t.a;
        final int c = t.c;
        a3[c - 4] = (byte)(n3 & 0xFFL);
        a3[c - 3] = (byte)(n3 >>> 8 & 0xFFL);
        a3[c - 2] = (byte)(n3 >>> 16 & 0xFFL);
        a3[c - 1] = (byte)(n3 >>> 24 & 0xFFL);
        this.p = true;
        this.o = o;
        return n3;
    }
    
    public final boolean c(final t t, long n, final h$a h$a) throws IOException {
        if (this.n != null) {
            h$a.a.getClass();
            return false;
        }
        final z$c q = this.q;
        i.i$a n41 = null;
        Label_1770: {
            if (q == null) {
                z.c(1, t, false);
                t.i();
                final int r = t.r();
                final int i = t.i();
                int e = t.e();
                if (e <= 0) {
                    e = -1;
                }
                int e2 = t.e();
                if (e2 <= 0) {
                    e2 = -1;
                }
                t.e();
                final int r2 = t.r();
                final int n2 = (int)Math.pow(2.0, r2 & 0xF);
                final int n3 = (int)Math.pow(2.0, (r2 & 0xF0) >> 4);
                t.r();
                this.q = new z$c(r, i, e, e2, n2, n3, Arrays.copyOf(t.a, t.c));
            }
            else {
                final z$a r3 = this.r;
                if (r3 == null) {
                    this.r = z.b(t, true, true);
                }
                else {
                    final int c = t.c;
                    final byte[] array = new byte[c];
                    System.arraycopy(t.a, 0, array, 0, c);
                    final int a = q.a;
                    z.c(5, t, false);
                    int n4 = t.r() + 1;
                    final y y = new y(t.a);
                    y.c(t.b * 8);
                    int n5 = 0;
                    byte[] array2 = array;
                    while (true) {
                        int n6 = 5;
                        if (n5 < n4) {
                            if (y.b(24) != 5653314) {
                                final int c2 = y.c;
                                final int d = y.d;
                                final StringBuilder sb = new StringBuilder(66);
                                sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                                sb.append(c2 * 8 + d);
                                throw ParserException.createForMalformedContainer(sb.toString(), (Throwable)null);
                            }
                            final int b = y.b(16);
                            final int b2 = y.b(24);
                            final long[] array3 = new long[b2];
                            final boolean a2 = y.a();
                            n = 0L;
                            byte[] array4;
                            if (!a2) {
                                final boolean a3 = y.a();
                                for (int j = 0; j < b2; ++j) {
                                    if (a3) {
                                        if (y.a()) {
                                            array3[j] = y.b(n6) + 1;
                                        }
                                        else {
                                            array3[j] = 0L;
                                        }
                                        n6 = 5;
                                    }
                                    else {
                                        array3[j] = y.b(n6) + 1;
                                    }
                                }
                                array4 = array2;
                            }
                            else {
                                final int n7 = n4;
                                int n8 = y.b(5) + 1;
                                int n9 = 0;
                                while (true) {
                                    array4 = array2;
                                    n4 = n7;
                                    if (n9 >= b2) {
                                        break;
                                    }
                                    int k = b2 - n9;
                                    int n10 = 0;
                                    while (k > 0) {
                                        ++n10;
                                        k >>>= 1;
                                    }
                                    for (int b3 = y.b(n10), n11 = 0; n11 < b3 && n9 < b2; ++n9, ++n11) {
                                        array3[n9] = n8;
                                    }
                                    ++n8;
                                }
                            }
                            final int b4 = y.b(4);
                            if (b4 > 2) {
                                final StringBuilder sb2 = new StringBuilder(53);
                                sb2.append("lookup type greater than 2 not decodable: ");
                                sb2.append(b4);
                                throw ParserException.createForMalformedContainer(sb2.toString(), (Throwable)null);
                            }
                            if (b4 == 1 || b4 == 2) {
                                y.c(32);
                                y.c(32);
                                final int b5 = y.b(4);
                                y.c(1);
                                if (b4 == 1) {
                                    if (b != 0) {
                                        n = b2;
                                        n = (long)Math.floor(Math.pow((double)n, 1.0 / b));
                                    }
                                }
                                else {
                                    n = b2 * (long)b;
                                }
                                y.c((int)((b5 + 1) * n));
                            }
                            ++n5;
                            array2 = array4;
                        }
                        else {
                            for (int b6 = y.b(6), l = 0; l < b6 + 1; ++l) {
                                if (y.b(16) != 0) {
                                    throw ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", (Throwable)null);
                                }
                            }
                            for (int b7 = y.b(6), n12 = 0; n12 < b7 + 1; ++n12) {
                                final int b8 = y.b(16);
                                if (b8 != 0) {
                                    if (b8 != 1) {
                                        final StringBuilder sb3 = new StringBuilder(52);
                                        sb3.append("floor type greater than 1 not decodable: ");
                                        sb3.append(b8);
                                        throw ParserException.createForMalformedContainer(sb3.toString(), (Throwable)null);
                                    }
                                    final int b9 = y.b(5);
                                    final int[] array5 = new int[b9];
                                    int n13 = 0;
                                    int n14 = -1;
                                    while (n13 < b9) {
                                        final int b10 = y.b(4);
                                        int n15;
                                        if ((array5[n13] = b10) > (n15 = n14)) {
                                            n15 = b10;
                                        }
                                        ++n13;
                                        n14 = n15;
                                    }
                                    final int n16 = n14 + 1;
                                    final int[] array6 = new int[n16];
                                    for (int n17 = 0; n17 < n16; ++n17) {
                                        array6[n17] = y.b(3) + 1;
                                        final int b11 = y.b(2);
                                        if (b11 > 0) {
                                            y.c(8);
                                        }
                                        for (int n18 = 0; n18 < 1 << b11; ++n18) {
                                            y.c(8);
                                        }
                                    }
                                    y.c(2);
                                    final int b12 = y.b(4);
                                    int n19 = 0;
                                    int n20 = 0;
                                    int n21 = 0;
                                    while (n19 < b9) {
                                        for (n20 += array6[array5[n19]]; n21 < n20; ++n21) {
                                            y.c(b12);
                                        }
                                        ++n19;
                                    }
                                }
                                else {
                                    y.c(8);
                                    y.c(16);
                                    y.c(16);
                                    y.c(6);
                                    y.c(8);
                                    for (int b13 = y.b(4), n22 = 0; n22 < b13 + 1; ++n22) {
                                        y.c(8);
                                    }
                                }
                            }
                            for (int b14 = y.b(6), n23 = 0; n23 < b14 + 1; ++n23) {
                                if (y.b(16) > 2) {
                                    throw ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", (Throwable)null);
                                }
                                y.c(24);
                                y.c(24);
                                y.c(24);
                                final int n24 = y.b(6) + 1;
                                y.c(8);
                                final int[] array7 = new int[n24];
                                for (int n25 = 0; n25 < n24; ++n25) {
                                    final int b15 = y.b(3);
                                    int b16;
                                    if (y.a()) {
                                        b16 = y.b(5);
                                    }
                                    else {
                                        b16 = 0;
                                    }
                                    array7[n25] = b16 * 8 + b15;
                                }
                                for (int n26 = 0; n26 < n24; ++n26) {
                                    for (int n27 = 0; n27 < 8; ++n27) {
                                        if ((array7[n26] & 1 << n27) != 0x0) {
                                            y.c(8);
                                        }
                                    }
                                }
                            }
                            for (int b17 = y.b(6), n28 = 0; n28 < b17 + 1; ++n28) {
                                final int b18 = y.b(16);
                                if (b18 != 0) {
                                    final StringBuilder sb4 = new StringBuilder(52);
                                    sb4.append("mapping type other than 0 not supported: ");
                                    sb4.append(b18);
                                    Log.e("VorbisUtil", sb4.toString());
                                }
                                else {
                                    int n29;
                                    if (y.a()) {
                                        n29 = y.b(4) + 1;
                                    }
                                    else {
                                        n29 = 1;
                                    }
                                    if (y.a()) {
                                        for (int b19 = y.b(8), n30 = 0; n30 < b19 + 1; ++n30) {
                                            int n32;
                                            int n31 = n32 = a - 1;
                                            int n33 = 0;
                                            while (n32 > 0) {
                                                ++n33;
                                                n32 >>>= 1;
                                            }
                                            y.c(n33);
                                            int n34 = 0;
                                            while (n31 > 0) {
                                                ++n34;
                                                n31 >>>= 1;
                                            }
                                            y.c(n34);
                                        }
                                    }
                                    if (y.b(2) != 0) {
                                        throw ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", (Throwable)null);
                                    }
                                    if (n29 > 1) {
                                        for (int n35 = 0; n35 < a; ++n35) {
                                            y.c(4);
                                        }
                                    }
                                    for (int n36 = 0; n36 < n29; ++n36) {
                                        y.c(8);
                                        y.c(8);
                                        y.c(8);
                                    }
                                }
                            }
                            final int n37 = y.b(6) + 1;
                            final z$b[] array8 = new z$b[n37];
                            for (int n38 = 0; n38 < n37; ++n38) {
                                final boolean a4 = y.a();
                                y.b(16);
                                y.b(16);
                                y.b(8);
                                array8[n38] = new z$b(a4);
                            }
                            if (y.a()) {
                                int n39 = n37 - 1;
                                int n40 = 0;
                                while (n39 > 0) {
                                    ++n40;
                                    n39 >>>= 1;
                                }
                                n41 = new i.i$a(q, r3, array2, array8, n40);
                                break Label_1770;
                            }
                            throw ParserException.createForMalformedContainer("framing bit after modes not set as expected", (Throwable)null);
                        }
                    }
                }
            }
            n41 = null;
        }
        this.n = n41;
        if (n41 == null) {
            return true;
        }
        final z$c a5 = n41.a;
        final ArrayList<byte[]> m = new ArrayList<byte[]>();
        m.add(a5.g);
        m.add(n41.c);
        final a a6 = z.a((List)ImmutableList.copyOf((Object[])n41.b.a));
        final n$a n$a = new n$a();
        n$a.k = "audio/vorbis";
        n$a.f = a5.d;
        n$a.g = a5.c;
        n$a.x = a5.a;
        n$a.y = a5.b;
        n$a.m = m;
        n$a.i = a6;
        h$a.a = new n(n$a);
        return true;
    }
    
    public final void d(final boolean b) {
        super.d(b);
        if (b) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
