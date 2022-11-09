// 
// Decompiled by Procyon v0.6.0
// 

package kb;

import java.util.ArrayList;
import db.q;
import ya.a$a;
import java.util.List;
import com.google.android.exoplayer2.n;
import cd.f;
import cd.c;
import android.util.Log;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import bd.r;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;
import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.ParserException;
import db.k;
import bd.o;
import bd.s;
import android.util.Pair;
import bd.c0;

public final class b
{
    public static final byte[] a;
    
    static {
        a = c0.C("OpusHead");
    }
    
    public static Pair<long[], long[]> a(final kb.a.a a) {
        final kb.a.b c = a.c(1701606260);
        if (c == null) {
            return null;
        }
        final s b = c.b;
        b.B(8);
        final int n = b.c() >> 24 & 0xFF;
        final int u = b.u();
        final long[] array = new long[u];
        final long[] array2 = new long[u];
        for (int i = 0; i < u; ++i) {
            long n2;
            if (n == 1) {
                n2 = b.v();
            }
            else {
                n2 = b.s();
            }
            array[i] = n2;
            long k;
            if (n == 1) {
                k = b.k();
            }
            else {
                k = b.c();
            }
            array2[i] = k;
            if (b.n() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            b.C(2);
        }
        return (Pair<long[], long[]>)Pair.create((Object)array, (Object)array2);
    }
    
    public static Pair b(int n, final s s) {
        s.B(n + 8 + 4);
        s.C(1);
        c(s);
        s.C(2);
        n = s.r();
        if ((n & 0x80) != 0x0) {
            s.C(2);
        }
        if ((n & 0x40) != 0x0) {
            s.C(s.w());
        }
        if ((n & 0x20) != 0x0) {
            s.C(2);
        }
        s.C(1);
        c(s);
        final String f = o.f(s.r());
        if (!"audio/mpeg".equals(f) && !"audio/vnd.dts".equals(f) && !"audio/vnd.dts.hd".equals(f)) {
            s.C(12);
            s.C(1);
            n = c(s);
            final byte[] array = new byte[n];
            s.b(0, n, array);
            return Pair.create((Object)f, (Object)array);
        }
        return Pair.create((Object)f, (Object)null);
    }
    
    public static int c(final s s) {
        int n;
        int n2;
        for (n = s.r(), n2 = (n & 0x7F); (n & 0x80) == 0x80; n = s.r(), n2 = (n2 << 7 | (n & 0x7F))) {}
        return n2;
    }
    
    public static Pair<Integer, m> d(final s s, final int n, final int n2) throws ParserException {
        int c;
        for (int b = s.b; b - n < n2; b += c) {
            s.B(b);
            c = s.c();
            final boolean b2 = true;
            k.a("childAtomSize must be positive", c > 0);
            if (s.c() == 1936289382) {
                int n3 = b + 8;
                int n4 = 0;
                int n5 = -1;
                String s2 = null;
                Integer n6 = null;
                while (n3 - b < c) {
                    s.B(n3);
                    final int c2 = s.c();
                    final int c3 = s.c();
                    Integer value;
                    String o;
                    if (c3 == 1718775137) {
                        value = s.c();
                        o = s2;
                    }
                    else if (c3 == 1935894637) {
                        s.C(4);
                        o = s.o(4);
                        value = n6;
                    }
                    else {
                        o = s2;
                        value = n6;
                        if (c3 == 1935894633) {
                            n5 = n3;
                            n4 = c2;
                            value = n6;
                            o = s2;
                        }
                    }
                    n3 += c2;
                    s2 = o;
                    n6 = value;
                }
                Pair create = null;
                Label_0540: {
                    if ("cenc".equals(s2) || "cbc1".equals(s2) || "cens".equals(s2) || "cbcs".equals(s2)) {
                        k.a("frma atom is mandatory", n6 != null);
                        k.a("schi atom is mandatory", n5 != -1);
                        while (true) {
                            int c4;
                            for (int n7 = n5 + 8; n7 - n5 < n4; n7 += c4) {
                                s.B(n7);
                                c4 = s.c();
                                if (s.c() == 1952804451) {
                                    final int c5 = s.c();
                                    s.C(1);
                                    int n9;
                                    int n8;
                                    if ((c5 >> 24 & 0xFF) == 0x0) {
                                        s.C(1);
                                        n8 = (n9 = 0);
                                    }
                                    else {
                                        final int r = s.r();
                                        n8 = (r & 0xF);
                                        n9 = (r & 0xF0) >> 4;
                                    }
                                    final boolean b3 = s.r() == 1;
                                    final int r2 = s.r();
                                    final byte[] array = new byte[16];
                                    s.b(0, 16, array);
                                    byte[] array2;
                                    if (b3 && r2 == 0) {
                                        final int r3 = s.r();
                                        array2 = new byte[r3];
                                        s.b(0, r3, array2);
                                    }
                                    else {
                                        array2 = null;
                                    }
                                    final Object o2 = new m(b3, s2, r2, array, n9, n8, array2);
                                    k.a("tenc atom is mandatory", o2 != null && b2);
                                    final int a = c0.a;
                                    create = Pair.create((Object)n6, o2);
                                    break Label_0540;
                                }
                            }
                            final Object o2 = null;
                            continue;
                        }
                    }
                    create = null;
                }
                if (create != null) {
                    return (Pair<Integer, m>)create;
                }
            }
        }
        return null;
    }
    
    public static l e(kb.a.a b, kb.a.b c, long o, final b b2, final boolean b3, final boolean b4) throws ParserException {
        final kb.a.a b5 = b.b(1835297121);
        b5.getClass();
        final kb.a.b c2 = b5.c(1751411826);
        c2.getClass();
        final s b6 = c2.b;
        b6.B(16);
        final int c3 = b6.c();
        int n;
        if (c3 == 1936684398) {
            n = 1;
        }
        else if (c3 == 1986618469) {
            n = 2;
        }
        else if (c3 != 1952807028 && c3 != 1935832172 && c3 != 1937072756 && c3 != 1668047728) {
            if (c3 == 1835365473) {
                n = 5;
            }
            else {
                n = -1;
            }
        }
        else {
            n = 3;
        }
        if (n == -1) {
            return null;
        }
        final kb.a.b c4 = b.c(1953196132);
        c4.getClass();
        final s b7 = c4.b;
        b7.B(8);
        final int n2 = b7.c() >> 24 & 0xFF;
        int n3;
        if (n2 == 0) {
            n3 = 8;
        }
        else {
            n3 = 16;
        }
        b7.C(n3);
        final int c5 = b7.c();
        b7.C(4);
        final int b8 = b7.b;
        int n4;
        if (n2 == 0) {
            n4 = 4;
        }
        else {
            n4 = 8;
        }
        while (true) {
            for (int i = 0; i < n4; ++i) {
                if (b7.a[b8 + i] != -1) {
                    final boolean b9 = false;
                    final long n5 = -9223372036854775807L;
                    long n6 = 0L;
                    Label_0334: {
                        if (b9) {
                            b7.C(n4);
                        }
                        else {
                            if (n2 == 0) {
                                n6 = b7.s();
                            }
                            else {
                                n6 = b7.v();
                            }
                            if (n6 != 0L) {
                                break Label_0334;
                            }
                        }
                        n6 = -9223372036854775807L;
                    }
                    b7.C(16);
                    final int c6 = b7.c();
                    final int c7 = b7.c();
                    b7.C(4);
                    final int c8 = b7.c();
                    final int c9 = b7.c();
                    int n7;
                    if (c6 == 0 && c7 == 65536 && c8 == -65536 && c9 == 0) {
                        n7 = 90;
                    }
                    else if (c6 == 0 && c7 == -65536 && c8 == 65536 && c9 == 0) {
                        n7 = 270;
                    }
                    else if (c6 == -65536 && c7 == 0 && c8 == 0 && c9 == -65536) {
                        n7 = 180;
                    }
                    else {
                        n7 = 0;
                    }
                    final f f = new f(c5, n6, n7);
                    if (o == -9223372036854775807L) {
                        o = n6;
                    }
                    final s b10 = c.b;
                    b10.B(8);
                    int n8;
                    if ((b10.c() >> 24 & 0xFF) == 0x0) {
                        n8 = 8;
                    }
                    else {
                        n8 = 16;
                    }
                    b10.C(n8);
                    final long s = b10.s();
                    if (o == -9223372036854775807L) {
                        o = n5;
                    }
                    else {
                        o = c0.P(o, 1000000L, s);
                    }
                    final kb.a.a b11 = b5.b(1835626086);
                    b11.getClass();
                    final kb.a.a b12 = b11.b(1937007212);
                    b12.getClass();
                    final kb.a.b c10 = b5.c(1835296868);
                    c10.getClass();
                    final s b13 = c10.b;
                    b13.B(8);
                    final int n9 = b13.c() >> 24 & 0xFF;
                    int n10;
                    if (n9 == 0) {
                        n10 = 8;
                    }
                    else {
                        n10 = 16;
                    }
                    b13.C(n10);
                    final long s2 = b13.s();
                    int n11;
                    if (n9 == 0) {
                        n11 = 4;
                    }
                    else {
                        n11 = 8;
                    }
                    b13.C(n11);
                    final int w = b13.w();
                    final char c11 = (char)((w >> 10 & 0x1F) + 96);
                    final char c12 = (char)((w >> 5 & 0x1F) + 96);
                    final char c13 = (char)((w & 0x1F) + 96);
                    final StringBuilder sb = new StringBuilder(3);
                    sb.append(c11);
                    sb.append(c12);
                    sb.append(c13);
                    final Pair create = Pair.create((Object)s2, (Object)sb.toString());
                    c = b12.c(1937011556);
                    c.getClass();
                    final s b14 = c.b;
                    final String s3 = (String)create.second;
                    b14.B(12);
                    final int c14 = b14.c();
                    c c15 = new c(c14);
                    int n12 = 0;
                    final int n13 = n;
                    final long n14 = o;
                    f f2 = f;
                    int s4 = n7;
                    while (true) {
                        b a = b2;
                        if (n12 >= c14) {
                            long[] array = null;
                            long[] array2 = null;
                            Label_5661: {
                                if (!b3) {
                                    b = b.b(1701082227);
                                    if (b != null) {
                                        final Pair<long[], long[]> a2 = a(b);
                                        if (a2 != null) {
                                            array = (long[])a2.first;
                                            array2 = (long[])a2.second;
                                            break Label_5661;
                                        }
                                    }
                                }
                                array = null;
                                array2 = null;
                            }
                            l l;
                            if (c15.b == null) {
                                l = null;
                            }
                            else {
                                l = new l(f2.a, n13, (long)create.first, s, n14, c15.b, c15.d, c15.a, c15.c, array, array2);
                            }
                            return l;
                        }
                        final int b15 = b14.b;
                        final int c16;
                        final int n15 = c16 = b14.c();
                        final boolean b16 = c16 > 0;
                        String s5 = "childAtomSize must be positive";
                        k.a("childAtomSize must be positive", b16);
                        int n16 = b14.c();
                        f f4 = null;
                        int n41 = 0;
                        c c24;
                        int n43;
                        if (n16 != 1635148593 && n16 != 1635148595 && n16 != 1701733238 && n16 != 1831958048 && n16 != 1836070006 && n16 != 1752589105 && n16 != 1751479857 && n16 != 1932670515 && n16 != 1211250227 && n16 != 1987063864 && n16 != 1987063865 && n16 != 1635135537 && n16 != 1685479798 && n16 != 1685479729 && n16 != 1685481573 && n16 != 1685481521) {
                            c c23 = null;
                            int n40 = 0;
                            int n42 = 0;
                            Label_3788: {
                                Label_1597: {
                                    if (n16 != 1836069985 && n16 != 1701733217 && n16 != 1633889587 && n16 != 1700998451 && n16 != 1633889588 && n16 != 1835823201 && n16 != 1685353315 && n16 != 1685353317 && n16 != 1685353320 && n16 != 1685353324 && n16 != 1685353336 && n16 != 1935764850 && n16 != 1935767394 && n16 != 1819304813 && n16 != 1936684916 && n16 != 1953984371 && n16 != 778924082 && n16 != 778924083 && n16 != 1835557169 && n16 != 1835560241 && n16 != 1634492771 && n16 != 1634492791 && n16 != 1970037111 && n16 != 1332770163 && n16 != 1716281667) {
                                        if (n16 != 1414810956 && n16 != 1954034535 && n16 != 2004251764 && n16 != 1937010800 && n16 != 1664495672) {
                                            if (n16 == 1835365492) {
                                                b14.B(b15 + 8 + 8);
                                                if (n16 == 1835365492) {
                                                    b14.l();
                                                    final String j = b14.l();
                                                    if (j != null) {
                                                        final n$a n$a = new n$a();
                                                        n$a.b(c5);
                                                        n$a.k = j;
                                                        c15.b = n$a.a();
                                                    }
                                                }
                                            }
                                            else if (n16 == 1667329389) {
                                                final n$a n$a2 = new n$a();
                                                n$a2.b(c5);
                                                n$a2.k = "application/x-camera-motion";
                                                c15.b = n$a2.a();
                                            }
                                        }
                                        else {
                                            b14.B(b15 + 8 + 8);
                                            o = Long.MAX_VALUE;
                                            String s6 = "application/ttml+xml";
                                            Object of = null;
                                            String k = null;
                                            Label_1544: {
                                                if (n16 != 1414810956) {
                                                    if (n16 == 1954034535) {
                                                        final int n17 = c16 - 8 - 8;
                                                        final byte[] array3 = new byte[n17];
                                                        b14.b(0, n17, array3);
                                                        of = ImmutableList.of((Object)array3);
                                                        k = "application/x-quicktime-tx3g";
                                                        o = Long.MAX_VALUE;
                                                        break Label_1544;
                                                    }
                                                    if (n16 == 2004251764) {
                                                        s6 = "application/x-mp4-vtt";
                                                    }
                                                    else if (n16 == 1937010800) {
                                                        o = 0L;
                                                    }
                                                    else {
                                                        if (n16 != 1664495672) {
                                                            throw new IllegalStateException();
                                                        }
                                                        c15.d = 1;
                                                        s6 = "application/x-mp4-cea-608";
                                                    }
                                                }
                                                final List list = null;
                                                k = s6;
                                                of = list;
                                            }
                                            final n$a n$a3 = new n$a();
                                            n$a3.b(c5);
                                            n$a3.k = k;
                                            n$a3.c = s3;
                                            n$a3.o = o;
                                            n$a3.m = (List)of;
                                            c15.b = n$a3.a();
                                        }
                                    }
                                    else {
                                        b14.B(b15 + 8 + 8);
                                        int w2;
                                        if (b4) {
                                            w2 = b14.w();
                                            b14.C(6);
                                        }
                                        else {
                                            b14.C(8);
                                            w2 = 0;
                                        }
                                        int n18;
                                        int n19;
                                        int n20;
                                        if (w2 != 0 && w2 != 1) {
                                            if (w2 != 2) {
                                                break Label_1597;
                                            }
                                            b14.C(16);
                                            n18 = (int)Math.round(Double.longBitsToDouble(b14.k()));
                                            n19 = b14.u();
                                            b14.C(20);
                                            n20 = 0;
                                        }
                                        else {
                                            n19 = b14.w();
                                            b14.C(6);
                                            final byte[] a3 = b14.a;
                                            final int b17 = b14.b;
                                            final int n21 = b17 + 1;
                                            final byte b18 = a3[b17];
                                            final byte b19 = a3[n21];
                                            b14.B((b14.b = n21 + 1 + 2) - 4);
                                            final int c17 = b14.c();
                                            if (w2 == 1) {
                                                b14.C(16);
                                            }
                                            n18 = ((b19 & 0xFF) | (b18 & 0xFF) << 8);
                                            n20 = c17;
                                        }
                                        final int b20 = b14.b;
                                        b n22;
                                        if (n16 == 1701733217) {
                                            final Pair<Integer, m> d = d(b14, b15, c16);
                                            if (d != null) {
                                                n16 = (int)d.first;
                                                if (a == null) {
                                                    a = null;
                                                }
                                                else {
                                                    a = a.a(((m)d.second).b);
                                                }
                                                c15.a[n12] = (m)d.second;
                                            }
                                            b14.B(b20);
                                            n22 = a;
                                        }
                                        else {
                                            n22 = a;
                                        }
                                        final int n23 = s4;
                                        final String m = "audio/ac3";
                                        final f f3 = f2;
                                        String s7 = "audio/raw";
                                        int z = 0;
                                        Label_2303: {
                                            if (n16 == 1633889587) {
                                                s7 = "audio/ac3";
                                            }
                                            else if (n16 == 1700998451) {
                                                s7 = "audio/eac3";
                                            }
                                            else if (n16 == 1633889588) {
                                                s7 = "audio/ac4";
                                            }
                                            else if (n16 == 1685353315) {
                                                s7 = "audio/vnd.dts";
                                            }
                                            else if (n16 != 1685353320 && n16 != 1685353324) {
                                                if (n16 == 1685353317) {
                                                    s7 = "audio/vnd.dts.hd;profile=lbr";
                                                }
                                                else if (n16 == 1685353336) {
                                                    s7 = "audio/vnd.dts.uhd;profile=p2";
                                                }
                                                else if (n16 == 1935764850) {
                                                    s7 = "audio/3gpp";
                                                }
                                                else if (n16 == 1935767394) {
                                                    s7 = "audio/amr-wb";
                                                }
                                                else {
                                                    if (n16 == 1819304813 || n16 == 1936684916) {
                                                        z = 2;
                                                        break Label_2303;
                                                    }
                                                    if (n16 == 1953984371) {
                                                        z = 268435456;
                                                        break Label_2303;
                                                    }
                                                    if (n16 != 778924082 && n16 != 778924083) {
                                                        if (n16 == 1835557169) {
                                                            s7 = "audio/mha1";
                                                        }
                                                        else if (n16 == 1835560241) {
                                                            s7 = "audio/mhm1";
                                                        }
                                                        else if (n16 == 1634492771) {
                                                            s7 = "audio/alac";
                                                        }
                                                        else if (n16 == 1634492791) {
                                                            s7 = "audio/g711-alaw";
                                                        }
                                                        else if (n16 == 1970037111) {
                                                            s7 = "audio/g711-mlaw";
                                                        }
                                                        else if (n16 == 1332770163) {
                                                            s7 = "audio/opus";
                                                        }
                                                        else if (n16 == 1716281667) {
                                                            s7 = "audio/flac";
                                                        }
                                                        else {
                                                            if (n16 != 1835823201) {
                                                                z = -1;
                                                                s7 = null;
                                                                break Label_2303;
                                                            }
                                                            s7 = "audio/true-hd";
                                                        }
                                                    }
                                                    else {
                                                        s7 = "audio/mpeg";
                                                    }
                                                }
                                            }
                                            else {
                                                s7 = "audio/vnd.dts.hd";
                                            }
                                            z = -1;
                                        }
                                        final int n24 = n18;
                                        int n25 = n19;
                                        int n26 = b20;
                                        final List list2 = null;
                                        String s8 = s7;
                                        String c18 = null;
                                        Object m2 = list2;
                                        final c c19 = c15;
                                        int n27 = n20;
                                        int n28 = n24;
                                        while (n26 - b15 < c16) {
                                            b14.B(n26);
                                            final int c20 = b14.c();
                                            k.a(s5, c20 > 0);
                                            final int c21 = b14.c();
                                            String s9 = null;
                                            int n35 = 0;
                                            int n36 = 0;
                                            Label_3612: {
                                                if (c21 == 1835557187) {
                                                    final int n29 = c20 - 13;
                                                    final byte[] array4 = new byte[n29];
                                                    b14.B(n26 + 13);
                                                    b14.b(0, n29, array4);
                                                    m2 = ImmutableList.of((Object)array4);
                                                }
                                                else {
                                                    s9 = s5;
                                                    if (c21 != 1702061171 && (!b4 || c21 != 2002876005)) {
                                                        if (c21 == 1684103987) {
                                                            b14.B(n26 + 8);
                                                            final String string = Integer.toString(c5);
                                                            final int y = ya.b.b[(b14.r() & 0xC0) >> 6];
                                                            final int r = b14.r();
                                                            int x = ya.b.d[(r & 0x38) >> 3];
                                                            if ((r & 0x4) != 0x0) {
                                                                ++x;
                                                            }
                                                            final n$a n$a4 = new n$a();
                                                            n$a4.a = string;
                                                            n$a4.k = m;
                                                            n$a4.x = x;
                                                            n$a4.y = y;
                                                            n$a4.n = n22;
                                                            n$a4.c = s3;
                                                            c19.b = n$a4.a();
                                                        }
                                                        else {
                                                            int n30 = c20;
                                                            if (c21 == 1684366131) {
                                                                b14.B(n26 + 8);
                                                                final String string2 = Integer.toString(c5);
                                                                b14.C(2);
                                                                final int y2 = ya.b.b[(b14.r() & 0xC0) >> 6];
                                                                final int r2 = b14.r();
                                                                int n32;
                                                                final int n31 = n32 = ya.b.d[(r2 & 0xE) >> 1];
                                                                if ((r2 & 0x1) != 0x0) {
                                                                    n32 = n31 + 1;
                                                                }
                                                                int x2 = n32;
                                                                if ((b14.r() & 0x1E) >> 1 > 0) {
                                                                    x2 = n32;
                                                                    if ((b14.r() & 0x2) != 0x0) {
                                                                        x2 = n32 + 2;
                                                                    }
                                                                }
                                                                String k2;
                                                                if (b14.c - b14.b > 0 && (b14.r() & 0x1) != 0x0) {
                                                                    k2 = "audio/eac3-joc";
                                                                }
                                                                else {
                                                                    k2 = "audio/eac3";
                                                                }
                                                                final n$a n$a5 = new n$a();
                                                                n$a5.a = string2;
                                                                n$a5.k = k2;
                                                                n$a5.x = x2;
                                                                n$a5.y = y2;
                                                                n$a5.n = n22;
                                                                n$a5.c = s3;
                                                                c19.b = n$a5.a();
                                                            }
                                                            else if (c21 == 1684103988) {
                                                                b14.B(n26 + 8);
                                                                final String string3 = Integer.toString(c5);
                                                                b14.C(1);
                                                                int y3;
                                                                if ((b14.r() & 0x20) >> 5 == 1) {
                                                                    y3 = 48000;
                                                                }
                                                                else {
                                                                    y3 = 44100;
                                                                }
                                                                final n$a n$a6 = new n$a();
                                                                n$a6.a = string3;
                                                                n$a6.k = "audio/ac4";
                                                                n$a6.x = 2;
                                                                n$a6.y = y3;
                                                                n$a6.n = n22;
                                                                n$a6.c = s3;
                                                                c19.b = n$a6.a();
                                                            }
                                                            else if (c21 == 1684892784) {
                                                                if (n27 <= 0) {
                                                                    final StringBuilder sb2 = new StringBuilder(60);
                                                                    sb2.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                                                    sb2.append(n27);
                                                                    throw ParserException.createForMalformedContainer(sb2.toString(), (Throwable)null);
                                                                }
                                                                n28 = n27;
                                                                n25 = 2;
                                                            }
                                                            else if (c21 == 1684305011) {
                                                                final n$a n$a7 = new n$a();
                                                                n$a7.b(c5);
                                                                n$a7.k = s8;
                                                                n$a7.x = n25;
                                                                n$a7.y = n28;
                                                                n$a7.n = n22;
                                                                n$a7.c = s3;
                                                                c19.b = n$a7.a();
                                                            }
                                                            else if (c21 == 1682927731) {
                                                                n30 -= 8;
                                                                final byte[] a4 = b.a;
                                                                final byte[] copy = Arrays.copyOf(a4, a4.length + n30);
                                                                b14.B(n26 + 8);
                                                                b14.b(a4.length, n30, copy);
                                                                m2 = yl.a.C(copy);
                                                            }
                                                            else if (c21 == 1684425825) {
                                                                n30 -= 12;
                                                                final byte[] array5 = new byte[n30 + 4];
                                                                array5[0] = 102;
                                                                array5[1] = 76;
                                                                array5[2] = 97;
                                                                array5[3] = 67;
                                                                b14.B(n26 + 12);
                                                                b14.b(4, n30, array5);
                                                                m2 = ImmutableList.of((Object)array5);
                                                            }
                                                            else if (c21 == 1634492771) {
                                                                final int n33 = n30 - 12;
                                                                final byte[] array6 = new byte[n33];
                                                                b14.B(n26 + 12);
                                                                b14.b(0, n33, array6);
                                                                final s s10 = new s(array6);
                                                                s10.B(9);
                                                                final int r3 = s10.r();
                                                                s10.B(20);
                                                                final Pair create2 = Pair.create((Object)s10.u(), (Object)r3);
                                                                n28 = (int)create2.first;
                                                                n25 = (int)create2.second;
                                                                m2 = ImmutableList.of((Object)array6);
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        int b21 = 0;
                                                        Label_3491: {
                                                            if (c21 == 1702061171) {
                                                                b21 = n26;
                                                                final int n34 = c20;
                                                                n35 = n27;
                                                                n36 = n34;
                                                            }
                                                            else {
                                                                b21 = b14.b;
                                                                k.a((String)null, b21 >= n26);
                                                                int n37 = c20;
                                                                n35 = n27;
                                                                while (true) {
                                                                    n36 = n37;
                                                                    if (b21 - n26 >= n36) {
                                                                        break;
                                                                    }
                                                                    b14.B(b21);
                                                                    final int c22 = b14.c();
                                                                    k.a(s9, c22 > 0);
                                                                    if (b14.c() == 1702061171) {
                                                                        break Label_3491;
                                                                    }
                                                                    b21 += c22;
                                                                    n37 = n36;
                                                                }
                                                                b21 = -1;
                                                            }
                                                        }
                                                        if (b21 != -1) {
                                                            final Pair b22 = b(b21, b14);
                                                            s8 = (String)b22.first;
                                                            final byte[] array7 = (byte[])b22.second;
                                                            if (array7 != null) {
                                                                if ("audio/mp4a-latm".equals(s8)) {
                                                                    final a$a d2 = ya.a.d(new r(array7, array7.length), false);
                                                                    n28 = d2.a;
                                                                    n25 = d2.b;
                                                                    c18 = d2.c;
                                                                }
                                                                m2 = ImmutableList.of((Object)array7);
                                                            }
                                                        }
                                                        break Label_3612;
                                                    }
                                                }
                                                s9 = s5;
                                                final int n38 = c20;
                                                n35 = n27;
                                                n36 = n38;
                                            }
                                            n26 += n36;
                                            n27 = n35;
                                            s5 = s9;
                                        }
                                        final int n39 = b15;
                                        c23 = c19;
                                        n40 = n23;
                                        f4 = f3;
                                        n41 = c16;
                                        n42 = n39;
                                        if (c19.b != null) {
                                            break Label_3788;
                                        }
                                        c23 = c19;
                                        n40 = n23;
                                        f4 = f3;
                                        n41 = c16;
                                        n42 = n39;
                                        if (s8 != null) {
                                            final n$a n$a8 = new n$a();
                                            n$a8.b(c5);
                                            n$a8.k = s8;
                                            n$a8.h = c18;
                                            n$a8.x = n25;
                                            n$a8.y = n28;
                                            n$a8.z = z;
                                            n$a8.m = (List)m2;
                                            n$a8.n = n22;
                                            n$a8.c = s3;
                                            c19.b = n$a8.a();
                                            n42 = n39;
                                            n41 = c16;
                                            f4 = f3;
                                            n40 = n23;
                                            c23 = c19;
                                        }
                                        break Label_3788;
                                    }
                                }
                                n41 = c16;
                                n42 = b15;
                                c23 = c15;
                                n40 = s4;
                                f4 = f2;
                            }
                            c24 = c23;
                            s4 = n40;
                            n43 = n42;
                        }
                        else {
                            final f f5 = f2;
                            final c c25 = c15;
                            final String s11 = "childAtomSize must be positive";
                            b14.B(b15 + 8 + 8);
                            b14.C(16);
                            final int w3 = b14.w();
                            final int w4 = b14.w();
                            b14.C(50);
                            int b23 = b14.b;
                            b n44;
                            if (n16 == 1701733238) {
                                final Pair<Integer, m> d3 = d(b14, b15, c16);
                                b a5;
                                if (d3 != null) {
                                    n16 = (int)d3.first;
                                    if (b2 == null) {
                                        a5 = null;
                                    }
                                    else {
                                        a5 = b2.a(((m)d3.second).b);
                                    }
                                    c25.a[n12] = (m)d3.second;
                                }
                                else {
                                    a5 = b2;
                                }
                                b14.B(b23);
                                n44 = a5;
                            }
                            else {
                                n44 = b2;
                            }
                            final int n45 = n15;
                            n43 = b15;
                            String k3;
                            if (n16 == 1831958048) {
                                k3 = "video/mpeg";
                            }
                            else if (n16 == 1211250227) {
                                k3 = "video/3gpp";
                            }
                            else {
                                k3 = null;
                            }
                            int n46 = 0;
                            float t = 1.0f;
                            final int n47 = -1;
                            String a6 = null;
                            ByteBuffer order = null;
                            Object of2 = null;
                            int n48 = -1;
                            int n49 = -1;
                            int n50 = -1;
                            byte[] u = null;
                            final int n51 = n16;
                            final int n52 = n45;
                            int v = n47;
                            while (b23 - n43 < n52) {
                                b14.B(b23);
                                final int b24 = b14.b;
                                int n53 = v;
                                final int c26 = b14.c();
                                byte[] copyOfRange = u;
                                if (c26 == 0 && b14.b - n43 == n52) {
                                    break;
                                }
                                k.a(s11, c26 > 0);
                                final int c27 = b14.c();
                                Label_5370: {
                                    ByteBuffer byteBuffer = null;
                                    List list5 = null;
                                    Label_4478: {
                                        List list3;
                                        String s12;
                                        if (c27 == 1635148611) {
                                            k.a((String)null, k3 == null);
                                            b14.B(b24 + 8);
                                            final cd.a a7 = cd.a.a(b14);
                                            list3 = a7.a;
                                            c25.c = a7.b;
                                            if (n46 == 0) {
                                                t = a7.e;
                                            }
                                            s12 = a7.f;
                                            k3 = "video/avc";
                                        }
                                        else {
                                            if (c27 != 1752589123) {
                                                int n66 = 0;
                                                int n67 = 0;
                                                int n68 = 0;
                                                Label_5358: {
                                                    if (c27 != 1685480259 && c27 != 1685485123) {
                                                        if (c27 == 1987076931) {
                                                            k.a((String)null, k3 == null);
                                                            if (n51 == 1987063864) {
                                                                k3 = "video/x-vnd.on2.vp8";
                                                            }
                                                            else {
                                                                k3 = "video/x-vnd.on2.vp9";
                                                            }
                                                        }
                                                        else if (c27 == 1635135811) {
                                                            k.a((String)null, k3 == null);
                                                            k3 = "video/av01";
                                                        }
                                                        else if (c27 == 1668050025) {
                                                            if (order == null) {
                                                                order = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                            }
                                                            order.position(21);
                                                            order.putShort(b14.n());
                                                            order.putShort(b14.n());
                                                        }
                                                        else {
                                                            if (c27 == 1835295606) {
                                                                ByteBuffer order2;
                                                                if ((order2 = order) == null) {
                                                                    order2 = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                }
                                                                final short n54 = b14.n();
                                                                final short n55 = b14.n();
                                                                final short n56 = b14.n();
                                                                final short n57 = b14.n();
                                                                final short n58 = b14.n();
                                                                final short n59 = b14.n();
                                                                final short n60 = b14.n();
                                                                final short n61 = b14.n();
                                                                o = b14.s();
                                                                final long s13 = b14.s();
                                                                order2.position(1);
                                                                order2.putShort(n58);
                                                                order2.putShort(n59);
                                                                order2.putShort(n54);
                                                                order2.putShort(n55);
                                                                order2.putShort(n56);
                                                                order2.putShort(n57);
                                                                order2.putShort(n60);
                                                                order2.putShort(n61);
                                                                order2.putShort((short)(o / 10000L));
                                                                order2.putShort((short)(s13 / 10000L));
                                                                final List list4 = (List)of2;
                                                                byteBuffer = order2;
                                                                list5 = list4;
                                                                break Label_4478;
                                                            }
                                                            if (c27 == 1681012275) {
                                                                k.a((String)null, k3 == null);
                                                                k3 = "video/3gpp";
                                                            }
                                                            else {
                                                                Label_4938: {
                                                                    if (c27 == 1702061171) {
                                                                        k.a((String)null, k3 == null);
                                                                        final Pair b25 = b(b24, b14);
                                                                        k3 = (String)b25.first;
                                                                        final byte[] array8 = (byte[])b25.second;
                                                                        if (array8 != null) {
                                                                            of2 = ImmutableList.of((Object)array8);
                                                                        }
                                                                    }
                                                                    else if (c27 == 1885434736) {
                                                                        b14.B(b24 + 8);
                                                                        t = b14.u() / (float)b14.u();
                                                                        n46 = 1;
                                                                    }
                                                                    else if (c27 == 1937126244) {
                                                                        int c28;
                                                                        for (int n62 = b24 + 8; n62 - b24 < c26; n62 += c28) {
                                                                            b14.B(n62);
                                                                            c28 = b14.c();
                                                                            if (b14.c() == 1886547818) {
                                                                                copyOfRange = Arrays.copyOfRange(b14.a, n62, c28 + n62);
                                                                                break Label_4938;
                                                                            }
                                                                        }
                                                                        copyOfRange = null;
                                                                    }
                                                                    else if (c27 == 1936995172) {
                                                                        final int r4 = b14.r();
                                                                        b14.C(3);
                                                                        if (r4 == 0) {
                                                                            final int r5 = b14.r();
                                                                            if (r5 != 0) {
                                                                                if (r5 != 1) {
                                                                                    if (r5 != 2) {
                                                                                        if (r5 == 3) {
                                                                                            n53 = 3;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        n53 = 2;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    n53 = 1;
                                                                                }
                                                                            }
                                                                            else {
                                                                                n53 = 0;
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (c27 == 1668246642) {
                                                                        final int c29 = b14.c();
                                                                        if (c29 == 1852009592 || c29 == 1852009571) {
                                                                            final int w5 = b14.w();
                                                                            final int w6 = b14.w();
                                                                            b14.C(2);
                                                                            final boolean b26 = c26 == 19 && (b14.r() & 0x80) != 0x0;
                                                                            int n63;
                                                                            if (w5 != 1) {
                                                                                if (w5 != 9) {
                                                                                    if (w5 != 4 && w5 != 5 && w5 != 6 && w5 != 7) {
                                                                                        n63 = -1;
                                                                                    }
                                                                                    else {
                                                                                        n63 = 2;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    n63 = 6;
                                                                                }
                                                                            }
                                                                            else {
                                                                                n63 = 1;
                                                                            }
                                                                            int n64;
                                                                            if (b26) {
                                                                                n64 = 1;
                                                                            }
                                                                            else {
                                                                                n64 = 2;
                                                                            }
                                                                            int n65 = 0;
                                                                            Label_5293: {
                                                                                if (w6 != 1) {
                                                                                    if (w6 == 16) {
                                                                                        n65 = 6;
                                                                                        break Label_5293;
                                                                                    }
                                                                                    if (w6 == 18) {
                                                                                        n65 = 7;
                                                                                        break Label_5293;
                                                                                    }
                                                                                    if (w6 != 6 && w6 != 7) {
                                                                                        n65 = -1;
                                                                                        break Label_5293;
                                                                                    }
                                                                                }
                                                                                n65 = 3;
                                                                            }
                                                                            n66 = n63;
                                                                            n67 = n65;
                                                                            n68 = n64;
                                                                            break Label_5358;
                                                                        }
                                                                        final String value = String.valueOf(kb.a.a(c29));
                                                                        String concat;
                                                                        if (value.length() != 0) {
                                                                            concat = "Unsupported color type: ".concat(value);
                                                                        }
                                                                        else {
                                                                            concat = new String("Unsupported color type: ");
                                                                        }
                                                                        Log.w("AtomParsers", concat);
                                                                    }
                                                                }
                                                            }
                                                            break Label_5370;
                                                        }
                                                        list5 = (List)of2;
                                                        byteBuffer = order;
                                                        break Label_4478;
                                                    }
                                                    final cd.c a8 = c.a(b14);
                                                    n66 = n48;
                                                    n67 = n49;
                                                    n68 = n50;
                                                    if (a8 != null) {
                                                        a6 = a8.a;
                                                        k3 = "video/dolby-vision";
                                                        n68 = n50;
                                                        n67 = n49;
                                                        n66 = n48;
                                                    }
                                                }
                                                n50 = n68;
                                                n49 = n67;
                                                n48 = n66;
                                                break Label_5370;
                                            }
                                            k.a((String)null, k3 == null);
                                            b14.B(b24 + 8);
                                            final cd.f a9 = cd.f.a(b14);
                                            list3 = a9.a;
                                            c25.c = a9.b;
                                            if (n46 == 0) {
                                                t = a9.c;
                                            }
                                            s12 = a9.d;
                                            k3 = "video/hevc";
                                        }
                                        list5 = list3;
                                        a6 = s12;
                                        byteBuffer = order;
                                    }
                                    order = byteBuffer;
                                    of2 = list5;
                                }
                                b23 += c26;
                                v = n53;
                                u = copyOfRange;
                            }
                            if (k3 == null) {
                                c24 = c25;
                                f4 = f5;
                                n41 = n52;
                            }
                            else {
                                final n$a n$a9 = new n$a();
                                n$a9.b(c5);
                                n$a9.k = k3;
                                n$a9.h = a6;
                                n$a9.p = w3;
                                n$a9.q = w4;
                                n$a9.t = t;
                                n$a9.s = s4;
                                n$a9.u = u;
                                n$a9.v = v;
                                n$a9.m = (List)of2;
                                n$a9.n = n44;
                                if (n48 != -1 || n50 != -1 || n49 != -1 || order != null) {
                                    byte[] array9;
                                    if (order != null) {
                                        array9 = order.array();
                                    }
                                    else {
                                        array9 = null;
                                    }
                                    n$a9.w = new cd.b(n48, n50, n49, array9);
                                }
                                final n b27 = new n(n$a9);
                                c24 = c25;
                                c24.b = b27;
                                n41 = n52;
                                f4 = f5;
                            }
                        }
                        b14.B(n43 + n41);
                        final c c30 = c24;
                        f2 = f4;
                        ++n12;
                        c15 = c30;
                    }
                }
                else {}
            }
            final boolean b9 = true;
            continue;
        }
    }
    
    public static ArrayList f(final kb.a.a a, final q q, final long n, final b b, final boolean b2, final boolean b3, final tg.c c) throws ParserException {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < a.d.size(); ++i) {
            final kb.a.a a2 = a.d.get(i);
            if (a2.a == 1953653099) {
                final kb.a.b c2 = a.c(1836476516);
                c2.getClass();
                final l l = (l)c.apply((Object)e(a2, c2, n, b, b2, b3));
                if (l != null) {
                    final kb.a.a b4 = a2.b(1835297121);
                    b4.getClass();
                    final kb.a.a b5 = b4.b(1835626086);
                    b5.getClass();
                    final kb.a.a b6 = b5.b(1937007212);
                    b6.getClass();
                    final kb.a.b c3 = b6.c(1937011578);
                    b b7;
                    if (c3 != null) {
                        b7 = new d(c3, l.f);
                    }
                    else {
                        final kb.a.b c4 = b6.c(1937013298);
                        if (c4 == null) {
                            throw ParserException.createForMalformedContainer("Track has no sample table size information", (Throwable)null);
                        }
                        b7 = new e(c4);
                    }
                    int b8 = b7.b();
                    kb.o o = null;
                    if (b8 == 0) {
                        o = new kb.o(l, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                    }
                    else {
                        kb.a.b b9 = b6.c(1937007471);
                        boolean b10;
                        if (b9 == null) {
                            b9 = b6.c(1668232756);
                            b9.getClass();
                            b10 = true;
                        }
                        else {
                            b10 = false;
                        }
                        final s b11 = b9.b;
                        final kb.a.b c5 = b6.c(1937011555);
                        c5.getClass();
                        final s b12 = c5.b;
                        final kb.a.b c6 = b6.c(1937011827);
                        c6.getClass();
                        final s b13 = c6.b;
                        final kb.a.b c7 = b6.c(1937011571);
                        s b14;
                        if (c7 != null) {
                            b14 = c7.b;
                        }
                        else {
                            b14 = null;
                        }
                        final kb.a.b c8 = b6.c(1668576371);
                        s b15;
                        if (c8 != null) {
                            b15 = c8.b;
                        }
                        else {
                            b15 = null;
                        }
                        final a a3 = new a(b12, b11, b10);
                        b13.B(12);
                        int n2 = b13.u() - 1;
                        int u = b13.u();
                        int n3 = b13.u();
                        int u2;
                        if (b15 != null) {
                            b15.B(12);
                            u2 = b15.u();
                        }
                        else {
                            u2 = 0;
                        }
                        int u3;
                        int n4;
                        if (b14 != null) {
                            b14.B(12);
                            u3 = b14.u();
                            if (u3 > 0) {
                                n4 = b14.u() - 1;
                            }
                            else {
                                n4 = -1;
                                b14 = null;
                            }
                        }
                        else {
                            n4 = -1;
                            u3 = 0;
                        }
                        final int c9 = b7.c();
                        final String q2 = l.f.q;
                        int[] copy = null;
                        long[] copy2 = null;
                        int[] copy3 = null;
                        long[] copy4 = null;
                        long n10 = 0L;
                        int n11 = 0;
                        l m = null;
                        int n12 = 0;
                        Label_1678: {
                            if (c9 == -1 || (!"audio/raw".equals(q2) && !"audio/g711-mlaw".equals(q2) && !"audio/g711-alaw".equals(q2)) || n2 != 0 || u2 != 0 || u3 != 0) {
                                final long[] array = new long[b8];
                                final int[] array2 = new int[b8];
                                final long[] array3 = new long[b8];
                                copy = new int[b8];
                                int n5 = n4;
                                int c10 = 0;
                                long d = 0L;
                                long n6 = 0L;
                                final int n7 = 0;
                                int u4 = 0;
                                int j = u2;
                                int n8 = 0;
                                int k = 0;
                                int c11 = n7;
                                while (true) {
                                    while (k < b8) {
                                        boolean a4 = true;
                                        boolean b16;
                                        while (true) {
                                            b16 = a4;
                                            if (c10 != 0) {
                                                break;
                                            }
                                            a4 = a3.a();
                                            if (!(b16 = a4)) {
                                                break;
                                            }
                                            d = a3.d;
                                            c10 = a3.c;
                                        }
                                        final int n9 = u3;
                                        if (!b16) {
                                            Log.w("AtomParsers", "Unexpected end of chunk data");
                                            copy2 = Arrays.copyOf(array, k);
                                            copy3 = Arrays.copyOf(array2, k);
                                            copy4 = Arrays.copyOf(array3, k);
                                            copy = Arrays.copyOf(copy, k);
                                            b8 = k;
                                            n10 = n6 + c11;
                                            boolean b17 = false;
                                            Label_1465: {
                                                if (b15 != null) {
                                                    while (j > 0) {
                                                        if (b15.u() != 0) {
                                                            b17 = false;
                                                            break Label_1465;
                                                        }
                                                        b15.c();
                                                        --j;
                                                    }
                                                }
                                                b17 = true;
                                            }
                                            if (n9 != 0 || u != 0 || c10 != 0 || n2 != 0 || u4 != 0 || !b17) {
                                                final int a5 = l.a;
                                                String s;
                                                if (!b17) {
                                                    s = ", ctts invalid";
                                                }
                                                else {
                                                    s = "";
                                                }
                                                final StringBuilder sb = new StringBuilder(s.length() + 262);
                                                sb.append("Inconsistent stbl box for track ");
                                                sb.append(a5);
                                                sb.append(": remainingSynchronizationSamples ");
                                                sb.append(n9);
                                                sb.append(", remainingSamplesAtTimestampDelta ");
                                                sb.append(u);
                                                sb.append(", remainingSamplesInChunk ");
                                                sb.append(c10);
                                                sb.append(", remainingTimestampDeltaChanges ");
                                                sb.append(n2);
                                                sb.append(", remainingSamplesAtTimestampOffset ");
                                                sb.append(u4);
                                                sb.append(s);
                                                Log.w("AtomParsers", sb.toString());
                                            }
                                            n11 = n8;
                                            m = l;
                                            n12 = b8;
                                            break Label_1678;
                                        }
                                        int n13 = j;
                                        int n14 = c11;
                                        int n15 = u4;
                                        if (b15 != null) {
                                            while (u4 == 0 && j > 0) {
                                                u4 = b15.u();
                                                c11 = b15.c();
                                                --j;
                                            }
                                            n15 = u4 - 1;
                                            n14 = c11;
                                            n13 = j;
                                        }
                                        array[k] = d;
                                        final int a6 = b7.a();
                                        int n16;
                                        if ((array2[k] = a6) > (n16 = n8)) {
                                            n16 = a6;
                                        }
                                        array3[k] = n6 + n14;
                                        int n17;
                                        if (b14 == null) {
                                            n17 = 1;
                                        }
                                        else {
                                            n17 = 0;
                                        }
                                        copy[k] = n17;
                                        int n18;
                                        if (k == n5) {
                                            copy[k] = 1;
                                            n18 = n9 - 1;
                                            if (n18 > 0) {
                                                b14.getClass();
                                                n5 = b14.u() - 1;
                                            }
                                        }
                                        else {
                                            n18 = n9;
                                        }
                                        final int n19 = n3;
                                        n6 += n19;
                                        --u;
                                        n3 = n19;
                                        int u5 = u;
                                        int n20 = n2;
                                        if (u == 0) {
                                            n3 = n19;
                                            u5 = u;
                                            if ((n20 = n2) > 0) {
                                                u5 = b13.u();
                                                n3 = b13.c();
                                                n20 = n2 - 1;
                                            }
                                        }
                                        final long n21 = array2[k];
                                        --c10;
                                        ++k;
                                        final int n22 = n14;
                                        d += n21;
                                        u3 = n18;
                                        u = u5;
                                        n8 = n16;
                                        j = n13;
                                        c11 = n22;
                                        u4 = n15;
                                        n2 = n20;
                                    }
                                    final int n9 = u3;
                                    copy4 = array3;
                                    copy3 = array2;
                                    copy2 = array;
                                    continue;
                                }
                            }
                            final int a7 = a3.a;
                            final long[] array4 = new long[a7];
                            final int[] array5 = new int[a7];
                            while (a3.a()) {
                                final int b18 = a3.b;
                                array4[b18] = a3.d;
                                array5[b18] = a3.c;
                            }
                            final long n23 = n3;
                            final int n24 = 8192 / c9;
                            int n25 = 0;
                            int n26 = 0;
                            while (n25 < a7) {
                                final int n27 = array5[n25];
                                final int a8 = c0.a;
                                n26 += (n27 + n24 - 1) / n24;
                                ++n25;
                            }
                            final long[] array6 = new long[n26];
                            copy3 = new int[n26];
                            copy4 = new long[n26];
                            copy = new int[n26];
                            int n28 = 0;
                            int n29 = 0;
                            n11 = 0;
                            int n30 = 0;
                            while (n29 < a7) {
                                int n31 = array5[n29];
                                long n32 = array4[n29];
                                final int n33 = n11;
                                int n34 = n30;
                                int max = n33;
                                while (n31 > 0) {
                                    final int min = Math.min(n24, n31);
                                    array6[n34] = n32;
                                    final int n35 = c9 * min;
                                    copy3[n34] = n35;
                                    max = Math.max(max, n35);
                                    copy4[n34] = n28 * n23;
                                    copy[n34] = 1;
                                    n32 += copy3[n34];
                                    n28 += min;
                                    n31 -= min;
                                    ++n34;
                                }
                                ++n29;
                                final int n36 = n34;
                                n11 = max;
                                n30 = n36;
                            }
                            n10 = n23 * n28;
                            n12 = b8;
                            m = l;
                            copy2 = array6;
                        }
                        final long p7 = c0.P(n10, 1000000L, m.c);
                        final long[] h = m.h;
                        Label_1738: {
                            if (h == null) {
                                c0.Q(copy4, m.c);
                                o = new kb.o(m, copy2, copy3, n11, copy4, copy, p7);
                            }
                            else {
                                if (h.length == 1 && m.b == 1 && copy4.length >= 2) {
                                    final long[] i2 = m.i;
                                    i2.getClass();
                                    final long n37 = i2[0];
                                    final long n38 = c0.P(m.h[0], m.c, m.d) + n37;
                                    final int n39 = copy4.length - 1;
                                    final int i3 = c0.i(4, 0, n39);
                                    final int i4 = c0.i(copy4.length - 4, 0, n39);
                                    final long n40 = copy4[0];
                                    if (n40 <= n37 && n37 < copy4[i3] && copy4[i4] < n38 && n38 <= n10) {
                                        final long p8 = c0.P(n37 - n40, m.f.E, m.c);
                                        final long p9 = c0.P(n10 - n38, m.f.E, m.c);
                                        if ((p8 != 0L || p9 != 0L) && p8 <= 2147483647L && p9 <= 2147483647L) {
                                            q.a = (int)p8;
                                            q.b = (int)p9;
                                            c0.Q(copy4, m.c);
                                            o = new kb.o(m, copy2, copy3, n11, copy4, copy, c0.P(m.h[0], 1000000L, m.d));
                                            break Label_1738;
                                        }
                                    }
                                }
                                final long[] h2 = m.h;
                                if (h2.length == 1 && h2[0] == 0L) {
                                    final long[] i5 = m.i;
                                    i5.getClass();
                                    final long n41 = i5[0];
                                    for (int n42 = 0; n42 < copy4.length; ++n42) {
                                        copy4[n42] = c0.P(copy4[n42] - n41, 1000000L, m.c);
                                    }
                                    o = new kb.o(m, copy2, copy3, n11, copy4, copy, c0.P(n10 - n41, 1000000L, m.c));
                                }
                                else {
                                    final boolean b19 = m.b == 1;
                                    final int[] array7 = new int[h2.length];
                                    final int[] array8 = new int[h2.length];
                                    final long[] i6 = m.i;
                                    i6.getClass();
                                    int n44;
                                    final int n43 = n44 = 0;
                                    int n46;
                                    int n45 = n46 = n44;
                                    int n47 = n43;
                                    while (true) {
                                        final long[] h3 = m.h;
                                        if (n47 >= h3.length) {
                                            break;
                                        }
                                        final long n48 = i6[n47];
                                        if (n48 != -1L) {
                                            final long p10 = c0.P(h3[n47], m.c, m.d);
                                            array7[n47] = c0.f(copy4, n48, true);
                                            array8[n47] = c0.b(copy4, n48 + p10, b19);
                                            int n49;
                                            int n50;
                                            while (true) {
                                                n49 = array7[n47];
                                                n50 = array8[n47];
                                                if (n49 >= n50 || (copy[n49] & 0x1) != 0x0) {
                                                    break;
                                                }
                                                array7[n47] = n49 + 1;
                                            }
                                            n45 |= ((n46 != n49) ? 1 : 0);
                                            n46 = n50;
                                            n44 += n50 - n49;
                                        }
                                        ++n47;
                                    }
                                    final int n51 = 1;
                                    int n52;
                                    if (n44 != n12) {
                                        n52 = n51;
                                    }
                                    else {
                                        n52 = 0;
                                    }
                                    final boolean b20 = (n45 | n52) != 0x0;
                                    long[] array9;
                                    if (b20) {
                                        array9 = new long[n44];
                                    }
                                    else {
                                        array9 = copy2;
                                    }
                                    int[] array10;
                                    if (b20) {
                                        array10 = new int[n44];
                                    }
                                    else {
                                        array10 = copy3;
                                    }
                                    if (b20) {
                                        n11 = 0;
                                    }
                                    int[] array11;
                                    if (b20) {
                                        array11 = new int[n44];
                                    }
                                    else {
                                        array11 = copy;
                                    }
                                    final long[] array12 = new long[n44];
                                    final int n53 = 0;
                                    int n54 = 0;
                                    long n55 = 0L;
                                    int[] array13 = copy3;
                                    int n56 = n11;
                                    final long[] array14 = copy4;
                                    long[] array15 = copy2;
                                    int[] array16;
                                    long[] array17;
                                    int n63;
                                    int n64;
                                    int[] array18;
                                    int n68;
                                    for (int n57 = n53; n57 < m.h.length; n57 = n64 + 1, array13 = array18, n54 = n63, array15 = array17, array11 = array16, n56 = n68) {
                                        final long n58 = m.i[n57];
                                        int n59 = array7[n57];
                                        final int n60 = array8[n57];
                                        if (b20) {
                                            final int n61 = n60 - n59;
                                            System.arraycopy(array15, n59, array9, n54, n61);
                                            System.arraycopy(array13, n59, array10, n54, n61);
                                            System.arraycopy(copy, n59, array11, n54, n61);
                                        }
                                        final int n62 = n56;
                                        array16 = array11;
                                        array17 = array15;
                                        n63 = n54;
                                        n64 = n57;
                                        array18 = array13;
                                        int n65 = n62;
                                        while (n59 < n60) {
                                            array12[n63] = c0.P(n55, 1000000L, m.d) + c0.P(Math.max(0L, array14[n59] - n58), 1000000L, m.c);
                                            int n66 = n65;
                                            if (b20 && array10[n63] > (n66 = n65)) {
                                                n66 = array18[n59];
                                            }
                                            ++n63;
                                            ++n59;
                                            n65 = n66;
                                        }
                                        final long n67 = m.h[n64];
                                        n68 = n65;
                                        n55 += n67;
                                    }
                                    o = new kb.o(m, array9, array10, n56, array12, array11, c0.P(n55, 1000000L, m.d));
                                }
                            }
                        }
                    }
                    list.add(o);
                }
            }
        }
        return list;
    }
    
    public static final class a
    {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final s f;
        public final s g;
        public int h;
        public int i;
        
        public a(final s g, final s f, final boolean e) throws ParserException {
            this.g = g;
            this.f = f;
            this.e = e;
            f.B(12);
            this.a = f.u();
            g.B(12);
            this.i = g.u();
            final int c = g.c();
            boolean b = true;
            if (c != 1) {
                b = false;
            }
            k.a("first_chunk must be 1", b);
            this.b = -1;
        }
        
        public final boolean a() {
            final int b = this.b + 1;
            this.b = b;
            if (b == this.a) {
                return false;
            }
            long d;
            if (this.e) {
                d = this.f.v();
            }
            else {
                d = this.f.s();
            }
            this.d = d;
            if (this.b == this.h) {
                this.c = this.g.u();
                this.g.C(4);
                int h;
                if (--this.i > 0) {
                    h = this.g.u() - 1;
                }
                else {
                    h = -1;
                }
                this.h = h;
            }
            return true;
        }
    }
    
    public interface b
    {
        int a();
        
        int b();
        
        int c();
    }
    
    public static final class c
    {
        public final m[] a;
        public n b;
        public int c;
        public int d;
        
        public c(final int n) {
            this.a = new m[n];
            this.d = 0;
        }
    }
    
    public static final class d implements b
    {
        public final int a;
        public final int b;
        public final s c;
        
        public d(final kb.a.b b, final n n) {
            final s b2 = b.b;
            (this.c = b2).B(12);
            int u;
            final int n2 = u = b2.u();
            Label_0118: {
                if ("audio/raw".equals(n.q)) {
                    final int x = c0.x(n.F, n.D);
                    if (n2 != 0) {
                        u = n2;
                        if (n2 % x == 0) {
                            break Label_0118;
                        }
                    }
                    final StringBuilder sb = new StringBuilder(88);
                    sb.append("Audio sample size mismatch. stsd sample size: ");
                    sb.append(x);
                    sb.append(", stsz sample size: ");
                    sb.append(n2);
                    Log.w("AtomParsers", sb.toString());
                    u = x;
                }
            }
            int a;
            if ((a = u) == 0) {
                a = -1;
            }
            this.a = a;
            this.b = b2.u();
        }
        
        @Override
        public final int a() {
            int n;
            if ((n = this.a) == -1) {
                n = this.c.u();
            }
            return n;
        }
        
        @Override
        public final int b() {
            return this.b;
        }
        
        @Override
        public final int c() {
            return this.a;
        }
    }
    
    public static final class e implements b
    {
        public final s a;
        public final int b;
        public final int c;
        public int d;
        public int e;
        
        public e(final kb.a.b b) {
            final s b2 = b.b;
            (this.a = b2).B(12);
            this.c = (b2.u() & 0xFF);
            this.b = b2.u();
        }
        
        @Override
        public final int a() {
            final int c = this.c;
            if (c == 8) {
                return this.a.r();
            }
            if (c == 16) {
                return this.a.w();
            }
            if (this.d++ % 2 == 0) {
                return ((this.e = this.a.r()) & 0xF0) >> 4;
            }
            return this.e & 0xF;
        }
        
        @Override
        public final int b() {
            return this.b;
        }
        
        @Override
        public final int c() {
            return -1;
        }
    }
    
    public static final class f
    {
        public final int a;
        
        public f(final int a, final long n, final int n2) {
            this.a = a;
        }
    }
}
