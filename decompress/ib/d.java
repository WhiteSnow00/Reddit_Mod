// 
// Decompiled by Procyon v0.6.0
// 

package ib;

import db.u;
import db.u$b;
import db.w$a;
import java.util.Arrays;
import db.w;
import android.util.Log;
import java.io.IOException;
import db.i;
import com.google.android.exoplayer2.ParserException;
import db.x;
import java.util.Locale;
import ah0.b;
import bd.q;
import java.util.Collections;
import b5.k;
import java.util.HashMap;
import bd.c0;
import java.nio.ByteBuffer;
import bd.t;
import android.util.SparseArray;
import db.j;
import kc.g;
import java.util.Map;
import java.util.UUID;
import db.h;

public final class d implements h
{
    public static final byte[] b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public static final byte[] e0;
    public static final UUID f0;
    public static final Map<String, Integer> g0;
    public long A;
    public long B;
    public g C;
    public g D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;
    public final c a;
    public j a0;
    public final f b;
    public final SparseArray<d.d$b> c;
    public final boolean d;
    public final t e;
    public final t f;
    public final t g;
    public final t h;
    public final t i;
    public final t j;
    public final t k;
    public final t l;
    public final t m;
    public final t n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public d.d$b u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;
    
    static {
        b0 = new byte[] { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
        c0 = bd.c0.C("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        d0 = new byte[] { 68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44 };
        e0 = new byte[] { 87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10 };
        f0 = new UUID(72057594037932032L, -9223371306706625679L);
        final HashMap hashMap = new HashMap();
        k.t(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        g0 = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public d(final int n) {
        final ib.a a = new ib.a();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = (c)a;
        a.d = (ib.b)new a();
        this.d = ((n & 0x1) == 0x0);
        this.b = new f();
        this.c = (SparseArray<d.d$b>)new SparseArray();
        this.g = new t(4);
        this.h = new t(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new t(4);
        this.e = new t(bd.q.a);
        this.f = new t(4);
        this.j = new t();
        this.k = new t();
        this.l = new t(8);
        this.m = new t();
        this.n = new t();
        this.L = new int[1];
    }
    
    public static byte[] g(long n, final long n2, final String s) {
        b.C(n != -9223372036854775807L);
        final int n3 = (int)(n / 3600000000L);
        n -= n3 * 3600 * 1000000L;
        final int n4 = (int)(n / 60000000L);
        n -= n4 * 60 * 1000000L;
        final int n5 = (int)(n / 1000000L);
        return bd.c0.C(String.format(Locale.US, s, n3, n4, n5, (int)((n - n5 * 1000000L) / n2)));
    }
    
    public final void a(final long n, final long n2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        final ib.a a = (ib.a)this.a;
        a.e = 0;
        a.b.clear();
        final f c = a.c;
        c.b = 0;
        c.c = 0;
        final f b = this.b;
        b.b = 0;
        b.c = 0;
        this.j();
        for (int i = 0; i < this.c.size(); ++i) {
            final x t = ((d.d$b)this.c.valueAt(i)).T;
            if (t != null) {
                t.b = false;
                t.c = 0;
            }
        }
    }
    
    public final void b(final int n) throws ParserException {
        if (this.C != null && this.D != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder(37);
        sb.append("Element ");
        sb.append(n);
        sb.append(" must be in a Cues");
        throw ParserException.createForMalformedContainer(sb.toString(), (Throwable)null);
    }
    
    public final boolean c(final i i) throws IOException {
        final e e = new e();
        final db.e e2 = (db.e)i;
        final long c = e2.c;
        final long n = lcmp(c, -1L);
        long n2 = 1024L;
        if (n != 0) {
            if (c > 1024L) {
                n2 = n2;
            }
            else {
                n2 = c;
            }
        }
        final int n3 = (int)n2;
        final byte[] a = e.a.a;
        final boolean b = false;
        e2.h(a, 0, 4, false);
        long s = e.a.s();
        e.b = 4;
        while (s != 440786851L) {
            if (++e.b == n3) {
                return b;
            }
            e2.h(e.a.a, 0, 1, false);
            s = ((long)(e.a.a[0] & 0xFF) | (s << 8 & 0xFFFFFFFFFFFFFF00L));
        }
        final long a2 = e.a(e2);
        final long n4 = e.b;
        boolean b2 = b;
        if (a2 == Long.MIN_VALUE) {
            return b2;
        }
        if (n != 0 && n4 + a2 >= c) {
            b2 = b;
            return b2;
        }
        while (true) {
            final long n5 = lcmp((long)e.b, n4 + a2);
            if (n5 < 0) {
                if (e.a(e2) == Long.MIN_VALUE) {
                    b2 = b;
                    return b2;
                }
                final long a3 = e.a(e2);
                final long n6 = lcmp(a3, 0L);
                b2 = b;
                if (n6 < 0) {
                    return b2;
                }
                if (a3 > 2147483647L) {
                    b2 = b;
                    return b2;
                }
                if (n6 == 0) {
                    continue;
                }
                final int n7 = (int)a3;
                e2.j(n7, false);
                e.b += n7;
            }
            else {
                b2 = b;
                if (n5 == 0) {
                    b2 = true;
                    return b2;
                }
                return b2;
            }
        }
    }
    
    public final void d(final int n) throws ParserException {
        if (this.u != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(n);
        sb.append(" must be in a TrackEntry");
        throw ParserException.createForMalformedContainer(sb.toString(), (Throwable)null);
    }
    
    public final void e(final d.d$b d$b, final long n, int n2, int n3, final int n4) {
        final x t = d$b.T;
        if (t != null) {
            t.b(d$b.X, n, n2, n3, n4, d$b.j);
        }
        else {
            if ("S_TEXT/UTF8".equals(d$b.b) || "S_TEXT/ASS".equals(d$b.b) || "S_TEXT/WEBVTT".equals(d$b.b)) {
                if (this.K > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                }
                else {
                    final long i = this.I;
                    if (i == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    }
                    else {
                        final String b = d$b.b;
                        final byte[] a = this.k.a;
                        b.getClass();
                        final int hashCode = b.hashCode();
                        int n5 = -1;
                        if (hashCode != 738597099) {
                            if (hashCode != 1045209816) {
                                if (hashCode == 1422270023) {
                                    if (b.equals("S_TEXT/UTF8")) {
                                        n5 = 2;
                                    }
                                }
                            }
                            else if (b.equals("S_TEXT/WEBVTT")) {
                                n5 = 1;
                            }
                        }
                        else if (b.equals("S_TEXT/ASS")) {
                            n5 = 0;
                        }
                        byte[] array;
                        int n6;
                        if (n5 != 0) {
                            if (n5 != 1) {
                                if (n5 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                array = g(i, 1000L, "%02d:%02d:%02d,%03d");
                                n6 = 19;
                            }
                            else {
                                array = g(i, 1000L, "%02d:%02d:%02d.%03d");
                                n6 = 25;
                            }
                        }
                        else {
                            array = g(i, 10000L, "%01d:%02d:%02d:%02d");
                            n6 = 21;
                        }
                        System.arraycopy(array, 0, a, n6, array.length);
                        int b2 = this.k.b;
                        while (true) {
                            final t k = this.k;
                            if (b2 >= k.c) {
                                break;
                            }
                            if (k.a[b2] == 0) {
                                k.A(b2);
                                break;
                            }
                            ++b2;
                        }
                        final w x = d$b.X;
                        final t j = this.k;
                        x.c(j.c, j);
                        n3 += this.k.c;
                    }
                }
            }
            int n7 = n3;
            Label_0491: {
                if ((n2 & 0x10000000) != 0x0) {
                    if (this.K > 1) {
                        n2 &= 0xEFFFFFFF;
                        break Label_0491;
                    }
                    final t n8 = this.n;
                    final int c = n8.c;
                    d$b.X.d(n8, c);
                    n7 = n3 + c;
                }
                n3 = n7;
            }
            d$b.X.b(n, n2, n3, n4, d$b.j);
        }
        this.F = true;
    }
    
    public final void f(final j a0) {
        this.a0 = a0;
    }
    
    public final int h(final i i, final db.t t) throws IOException {
        this.F = false;
        int n = 1;
        while (n != 0 && !this.F) {
            final ib.a a = (ib.a)this.a;
            ah0.b.I((Object)a.d);
            Label_6229: {
                while (true) {
                    final a$a a$a = a.b.peek();
                    if (a$a != null && ((db.e)i).d >= a$a.b) {
                        ((a)a.d).a(((a$a)a.b.pop()).a);
                        break;
                    }
                    final int e = a.e;
                    final int n2 = 4;
                    if (e == 0) {
                        final f c = a.c;
                        final db.e e2 = (db.e)i;
                        long b = c.b(e2, true, false, 4);
                        if (b == -2L) {
                            e2.f = 0;
                            int n3;
                            int n6;
                            while (true) {
                                e2.h(a.a, 0, 4, false);
                                final byte b2 = a.a[0];
                                n3 = 0;
                                long n4;
                                long n5;
                                do {
                                    final long[] d = ib.f.d;
                                    if (n3 >= 8) {
                                        n3 = -1;
                                        break;
                                    }
                                    n4 = d[n3];
                                    n5 = b2;
                                    ++n3;
                                } while ((n4 & n5) == 0x0L);
                                if (n3 != -1 && n3 <= 4) {
                                    n6 = (int)ib.f.a(a.a, n3, false);
                                    ((a)a.d).a.getClass();
                                    if (n6 == 357149030 || n6 == 524531317 || n6 == 475249515 || n6 == 374648427) {
                                        break;
                                    }
                                }
                                e2.n(1);
                            }
                            e2.n(n3);
                            b = n6;
                        }
                        if (b == -1L) {
                            n = 0;
                            break Label_6229;
                        }
                        a.f = (int)b;
                        a.e = 1;
                    }
                    if (a.e == 1) {
                        a.g = a.c.b((db.e)i, false, true, 8);
                        a.e = 2;
                    }
                    final ib.b d2 = a.d;
                    final int f = a.f;
                    ((a)d2).a.getClass();
                    final int n7 = 3;
                    int n8 = 0;
                    switch (f) {
                        default: {
                            n8 = 0;
                            break;
                        }
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325: {
                            n8 = 5;
                            break;
                        }
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322: {
                            n8 = 4;
                            break;
                        }
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317: {
                            n8 = 1;
                            break;
                        }
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716: {
                            n8 = 3;
                            break;
                        }
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 241:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30321:
                        case 2352003:
                        case 2807729: {
                            n8 = 2;
                            break;
                        }
                    }
                    if (n8 != 0) {
                        if (n8 != 1) {
                            if (n8 != 2) {
                                if (n8 != 3) {
                                    if (n8 != 4) {
                                        if (n8 != 5) {
                                            final StringBuilder sb = new StringBuilder(32);
                                            sb.append("Invalid element type ");
                                            sb.append(n8);
                                            throw ParserException.createForMalformedContainer(sb.toString(), (Throwable)null);
                                        }
                                        final long g = a.g;
                                        if (g != 4L && g != 8L) {
                                            final StringBuilder sb2 = new StringBuilder(40);
                                            sb2.append("Invalid float size: ");
                                            sb2.append(g);
                                            throw ParserException.createForMalformedContainer(sb2.toString(), (Throwable)null);
                                        }
                                        final ib.b d3 = a.d;
                                        final int f2 = a.f;
                                        final int n9 = (int)g;
                                        ((db.e)i).f(a.a, 0, n9, false);
                                        int j = 0;
                                        long n10 = 0L;
                                        while (j < n9) {
                                            n10 = (n10 << 8 | (long)(a.a[j] & 0xFF));
                                            ++j;
                                        }
                                        double longBitsToDouble;
                                        if (n9 == 4) {
                                            longBitsToDouble = Float.intBitsToFloat((int)n10);
                                        }
                                        else {
                                            longBitsToDouble = Double.longBitsToDouble(n10);
                                        }
                                        final d a2 = ((a)d3).a;
                                        Label_1823: {
                                            if (f2 != 181) {
                                                if (f2 != 17545) {
                                                    switch (f2) {
                                                        default: {
                                                            switch (f2) {
                                                                default: {
                                                                    a2.getClass();
                                                                    break Label_1823;
                                                                }
                                                                case 30325: {
                                                                    a2.d(f2);
                                                                    a2.u.u = (float)longBitsToDouble;
                                                                    break Label_1823;
                                                                }
                                                                case 30324: {
                                                                    a2.d(f2);
                                                                    a2.u.t = (float)longBitsToDouble;
                                                                    break Label_1823;
                                                                }
                                                                case 30323: {
                                                                    a2.d(f2);
                                                                    a2.u.s = (float)longBitsToDouble;
                                                                    break Label_1823;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        case 21978: {
                                                            a2.d(f2);
                                                            a2.u.M = (float)longBitsToDouble;
                                                            break;
                                                        }
                                                        case 21977: {
                                                            a2.d(f2);
                                                            a2.u.L = (float)longBitsToDouble;
                                                            break;
                                                        }
                                                        case 21976: {
                                                            a2.d(f2);
                                                            a2.u.K = (float)longBitsToDouble;
                                                            break;
                                                        }
                                                        case 21975: {
                                                            a2.d(f2);
                                                            a2.u.J = (float)longBitsToDouble;
                                                            break;
                                                        }
                                                        case 21974: {
                                                            a2.d(f2);
                                                            a2.u.I = (float)longBitsToDouble;
                                                            break;
                                                        }
                                                        case 21973: {
                                                            a2.d(f2);
                                                            a2.u.H = (float)longBitsToDouble;
                                                            break;
                                                        }
                                                        case 21972: {
                                                            a2.d(f2);
                                                            a2.u.G = (float)longBitsToDouble;
                                                            break;
                                                        }
                                                        case 21971: {
                                                            a2.d(f2);
                                                            a2.u.F = (float)longBitsToDouble;
                                                            break;
                                                        }
                                                        case 21970: {
                                                            a2.d(f2);
                                                            a2.u.E = (float)longBitsToDouble;
                                                            break;
                                                        }
                                                        case 21969: {
                                                            a2.d(f2);
                                                            a2.u.D = (float)longBitsToDouble;
                                                            break;
                                                        }
                                                    }
                                                }
                                                else {
                                                    a2.s = (long)longBitsToDouble;
                                                }
                                            }
                                            else {
                                                a2.d(f2);
                                                a2.u.Q = (int)longBitsToDouble;
                                            }
                                        }
                                        a.e = 0;
                                        break;
                                    }
                                    else {
                                        final ib.b d4 = a.d;
                                        final int f3 = a.f;
                                        final int n11 = (int)a.g;
                                        final d a3 = ((a)d4).a;
                                        a3.getClass();
                                        if (f3 != 161 && f3 != 163) {
                                            if (f3 != 165) {
                                                if (f3 != 16877) {
                                                    if (f3 != 16981) {
                                                        if (f3 != 18402) {
                                                            if (f3 != 21419) {
                                                                if (f3 != 25506) {
                                                                    if (f3 != 30322) {
                                                                        final StringBuilder sb3 = new StringBuilder(26);
                                                                        sb3.append("Unexpected id: ");
                                                                        sb3.append(f3);
                                                                        throw ParserException.createForMalformedContainer(sb3.toString(), (Throwable)null);
                                                                    }
                                                                    a3.d(f3);
                                                                    final d.d$b u = a3.u;
                                                                    final byte[] v = new byte[n11];
                                                                    u.v = v;
                                                                    ((db.e)i).f(v, 0, n11, false);
                                                                }
                                                                else {
                                                                    a3.d(f3);
                                                                    final d.d$b u2 = a3.u;
                                                                    final byte[] k = new byte[n11];
                                                                    u2.k = k;
                                                                    ((db.e)i).f(k, 0, n11, false);
                                                                }
                                                            }
                                                            else {
                                                                Arrays.fill(a3.i.a, (byte)0);
                                                                ((db.e)i).f(a3.i.a, 4 - n11, n11, false);
                                                                a3.i.B(0);
                                                                a3.w = (int)a3.i.s();
                                                            }
                                                        }
                                                        else {
                                                            final byte[] array = new byte[n11];
                                                            ((db.e)i).f(array, 0, n11, false);
                                                            a3.d(f3);
                                                            a3.u.j = new w$a(1, array, 0, 0);
                                                        }
                                                    }
                                                    else {
                                                        a3.d(f3);
                                                        final d.d$b u3 = a3.u;
                                                        final byte[] l = new byte[n11];
                                                        u3.i = l;
                                                        ((db.e)i).f(l, 0, n11, false);
                                                    }
                                                }
                                                else {
                                                    a3.d(f3);
                                                    final d.d$b u4 = a3.u;
                                                    final int g2 = u4.g;
                                                    if (g2 != 1685485123 && g2 != 1685480259) {
                                                        ((db.e)i).n(n11);
                                                    }
                                                    else {
                                                        final byte[] n12 = new byte[n11];
                                                        u4.N = n12;
                                                        ((db.e)i).f(n12, 0, n11, false);
                                                    }
                                                }
                                            }
                                            else if (a3.G == 2) {
                                                final d.d$b d$b = (d.d$b)a3.c.get(a3.M);
                                                if (a3.P == 4 && "V_VP9".equals(d$b.b)) {
                                                    a3.n.y(n11);
                                                    ((db.e)i).f(a3.n.a, 0, n11, false);
                                                }
                                                else {
                                                    ((db.e)i).n(n11);
                                                }
                                            }
                                        }
                                        else {
                                            if (a3.G == 0) {
                                                a3.M = (int)a3.b.b((db.e)i, false, true, 8);
                                                a3.N = a3.b.c;
                                                a3.I = -9223372036854775807L;
                                                a3.G = 1;
                                                a3.g.y(0);
                                            }
                                            final d.d$b d$b2 = (d.d$b)a3.c.get(a3.M);
                                            if (d$b2 == null) {
                                                ((db.e)i).n(n11 - a3.N);
                                                a3.G = 0;
                                            }
                                            else {
                                                d$b2.X.getClass();
                                                if (a3.G == 1) {
                                                    final db.e e3 = (db.e)i;
                                                    a3.i(e3, 3);
                                                    final int n13 = (a3.g.a[2] & 0x6) >> 1;
                                                    if (n13 == 0) {
                                                        a3.K = 1;
                                                        int[] m = a3.L;
                                                        if (m == null) {
                                                            m = new int[] { 0 };
                                                        }
                                                        else if (m.length < 1) {
                                                            m = new int[Math.max(m.length * 2, 1)];
                                                        }
                                                        (a3.L = m)[0] = n11 - a3.N - 3;
                                                    }
                                                    else {
                                                        a3.i(e3, 4);
                                                        final int k2 = (a3.g.a[3] & 0xFF) + 1;
                                                        a3.K = k2;
                                                        int[] l2 = a3.L;
                                                        if (l2 == null) {
                                                            l2 = new int[k2];
                                                        }
                                                        else if (l2.length < k2) {
                                                            l2 = new int[Math.max(l2.length * 2, k2)];
                                                        }
                                                        a3.L = l2;
                                                        if (n13 == 2) {
                                                            final int n14 = a3.N;
                                                            final int k3 = a3.K;
                                                            Arrays.fill(l2, 0, k3, (n11 - n14 - 4) / k3);
                                                        }
                                                        else if (n13 == 1) {
                                                            int n15 = 0;
                                                            final int n16 = 0;
                                                            int n17 = n2;
                                                            int n18 = n16;
                                                            int n19;
                                                            while (true) {
                                                                n19 = a3.K - 1;
                                                                if (n15 >= n19) {
                                                                    break;
                                                                }
                                                                a3.L[n15] = 0;
                                                                int n20 = n17;
                                                                int n21;
                                                                int n22;
                                                                do {
                                                                    n17 = n20 + 1;
                                                                    a3.i(e3, n17);
                                                                    n21 = (a3.g.a[n17 - 1] & 0xFF);
                                                                    final int[] l3 = a3.L;
                                                                    n22 = l3[n15] + n21;
                                                                    l3[n15] = n22;
                                                                    n20 = n17;
                                                                } while (n21 == 255);
                                                                n18 += n22;
                                                                ++n15;
                                                            }
                                                            a3.L[n19] = n11 - a3.N - n17 - n18;
                                                        }
                                                        else {
                                                            if (n13 != 3) {
                                                                final StringBuilder sb4 = new StringBuilder(36);
                                                                sb4.append("Unexpected lacing value: ");
                                                                sb4.append(n13);
                                                                throw ParserException.createForMalformedContainer(sb4.toString(), (Throwable)null);
                                                            }
                                                            final int n23 = 0;
                                                            int n24 = 0;
                                                            int n25 = n2;
                                                            db.e e4 = e3;
                                                            int n26 = n23;
                                                        Label_3003:
                                                            while (true) {
                                                                final int n27 = a3.K - 1;
                                                                if (n26 >= n27) {
                                                                    a3.L[n27] = n11 - a3.N - n25 - n24;
                                                                    break;
                                                                }
                                                                a3.L[n26] = 0;
                                                                ++n25;
                                                                a3.i(e4, n25);
                                                                final byte[] a4 = a3.g.a;
                                                                final int n28 = n25 - 1;
                                                                if (a4[n28] != 0) {
                                                                    int n29 = 0;
                                                                    while (true) {
                                                                        while (n29 < 8) {
                                                                            final int n30 = 1 << 7 - n29;
                                                                            if ((a3.g.a[n28] & n30) != 0x0) {
                                                                                final int n31 = n25 + n29;
                                                                                a3.i(e4, n31);
                                                                                long n32 = a3.g.a[n28] & 0xFF & ~n30;
                                                                                for (int n33 = n28 + 1; n33 < n31; ++n33) {
                                                                                    n32 = (n32 << 8 | (long)(a3.g.a[n33] & 0xFF));
                                                                                }
                                                                                final db.e e5 = e4;
                                                                                long n34 = n32;
                                                                                n25 = n31;
                                                                                e4 = e5;
                                                                                if (n26 > 0) {
                                                                                    n34 = n32 - ((1L << n29 * 7 + 6) - 1L);
                                                                                    n25 = n31;
                                                                                    e4 = e5;
                                                                                }
                                                                                if (n34 >= -2147483648L && n34 <= 2147483647L) {
                                                                                    int n35 = (int)n34;
                                                                                    final int[] l4 = a3.L;
                                                                                    if (n26 != 0) {
                                                                                        n35 += l4[n26 - 1];
                                                                                    }
                                                                                    l4[n26] = n35;
                                                                                    n24 += n35;
                                                                                    ++n26;
                                                                                    continue Label_3003;
                                                                                }
                                                                                throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", (Throwable)null);
                                                                            }
                                                                            else {
                                                                                ++n29;
                                                                            }
                                                                        }
                                                                        long n34 = 0L;
                                                                        continue;
                                                                    }
                                                                }
                                                                throw ParserException.createForMalformedContainer("No valid varint length mask found", (Throwable)null);
                                                            }
                                                        }
                                                    }
                                                    final byte[] a5 = a3.g.a;
                                                    a3.H = a3.k((a5[1] & 0xFF) | a5[0] << 8) + a3.B;
                                                    int o;
                                                    if (d$b2.d != 2 && (f3 != 163 || (a3.g.a[2] & 0x80) != 0x80)) {
                                                        o = 0;
                                                    }
                                                    else {
                                                        o = 1;
                                                    }
                                                    a3.O = o;
                                                    a3.G = 2;
                                                    a3.J = 0;
                                                }
                                                if (f3 == 163) {
                                                    while (true) {
                                                        final int j2 = a3.J;
                                                        if (j2 >= a3.K) {
                                                            break;
                                                        }
                                                        a3.e(d$b2, a3.J * d$b2.e / 1000 + a3.H, a3.O, a3.l(a3.L[j2], (db.e)i, d$b2), 0);
                                                        ++a3.J;
                                                    }
                                                    a3.G = 0;
                                                }
                                                else {
                                                    while (true) {
                                                        final int j3 = a3.J;
                                                        if (j3 >= a3.K) {
                                                            break;
                                                        }
                                                        final int[] l5 = a3.L;
                                                        l5[j3] = a3.l(l5[j3], (db.e)i, d$b2);
                                                        ++a3.J;
                                                    }
                                                }
                                            }
                                        }
                                        a.e = 0;
                                    }
                                }
                                else {
                                    final long g3 = a.g;
                                    if (g3 > 2147483647L) {
                                        final StringBuilder sb5 = new StringBuilder(41);
                                        sb5.append("String element size: ");
                                        sb5.append(g3);
                                        throw ParserException.createForMalformedContainer(sb5.toString(), (Throwable)null);
                                    }
                                    final ib.b d5 = a.d;
                                    final int f4 = a.f;
                                    int n36 = (int)g3;
                                    String b3;
                                    if (n36 == 0) {
                                        b3 = "";
                                    }
                                    else {
                                        final byte[] array2 = new byte[n36];
                                        ((db.e)i).f(array2, 0, n36, false);
                                        while (n36 > 0) {
                                            final int n37 = n36 - 1;
                                            if (array2[n37] != 0) {
                                                break;
                                            }
                                            n36 = n37;
                                        }
                                        b3 = new String(array2, 0, n36);
                                    }
                                    final d a6 = ((a)d5).a;
                                    a6.getClass();
                                    if (f4 != 134) {
                                        if (f4 != 17026) {
                                            if (f4 != 21358) {
                                                if (f4 == 2274716) {
                                                    a6.d(f4);
                                                    a6.u.W = b3;
                                                }
                                            }
                                            else {
                                                a6.d(f4);
                                                a6.u.a = b3;
                                            }
                                        }
                                        else if (!"webm".equals(b3)) {
                                            if (!"matroska".equals(b3)) {
                                                final StringBuilder sb6 = new StringBuilder(b3.length() + 22);
                                                sb6.append("DocType ");
                                                sb6.append(b3);
                                                sb6.append(" not supported");
                                                throw ParserException.createForMalformedContainer(sb6.toString(), (Throwable)null);
                                            }
                                        }
                                    }
                                    else {
                                        a6.d(f4);
                                        a6.u.b = b3;
                                    }
                                    a.e = 0;
                                }
                            }
                            else {
                                final long g4 = a.g;
                                if (g4 > 8L) {
                                    final StringBuilder sb7 = new StringBuilder(42);
                                    sb7.append("Invalid integer size: ");
                                    sb7.append(g4);
                                    throw ParserException.createForMalformedContainer(sb7.toString(), (Throwable)null);
                                }
                                final ib.b d6 = a.d;
                                final int f5 = a.f;
                                final int n38 = (int)g4;
                                ((db.e)i).f(a.a, 0, n38, false);
                                int n39 = 0;
                                long r = 0L;
                                while (n39 < n38) {
                                    r = (r << 8 | (long)(a.a[n39] & 0xFF));
                                    ++n39;
                                }
                                final d a7 = ((a)d6).a;
                                a7.getClass();
                                Label_5748: {
                                    if (f5 != 20529) {
                                        if (f5 != 20530) {
                                            switch (f5) {
                                                default: {
                                                    switch (f5) {
                                                        default: {
                                                            break Label_5748;
                                                        }
                                                        case 21949: {
                                                            a7.d(f5);
                                                            a7.u.C = (int)r;
                                                            break Label_5748;
                                                        }
                                                        case 21948: {
                                                            a7.d(f5);
                                                            a7.u.B = (int)r;
                                                            break Label_5748;
                                                        }
                                                        case 21947: {
                                                            a7.d(f5);
                                                            final d.d$b u5 = a7.u;
                                                            u5.x = true;
                                                            final int n40 = (int)r;
                                                            int y;
                                                            if (n40 != 1) {
                                                                if (n40 != 9) {
                                                                    if (n40 != 4 && n40 != 5 && n40 != 6 && n40 != 7) {
                                                                        y = -1;
                                                                    }
                                                                    else {
                                                                        y = 2;
                                                                    }
                                                                }
                                                                else {
                                                                    y = 6;
                                                                }
                                                            }
                                                            else {
                                                                y = 1;
                                                            }
                                                            if (y != -1) {
                                                                u5.y = y;
                                                                break Label_5748;
                                                            }
                                                            break Label_5748;
                                                        }
                                                        case 21946: {
                                                            a7.d(f5);
                                                            final int n41 = (int)r;
                                                            int z = n7;
                                                            if (n41 != 1) {
                                                                if (n41 != 16) {
                                                                    if (n41 != 18) {
                                                                        z = n7;
                                                                        if (n41 != 6) {
                                                                            z = n7;
                                                                            if (n41 != 7) {
                                                                                z = -1;
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        z = 7;
                                                                    }
                                                                }
                                                                else {
                                                                    z = 6;
                                                                }
                                                            }
                                                            if (z != -1) {
                                                                a7.u.z = z;
                                                                break Label_5748;
                                                            }
                                                            break Label_5748;
                                                        }
                                                        case 21945: {
                                                            a7.d(f5);
                                                            final int n42 = (int)r;
                                                            if (n42 == 1) {
                                                                a7.u.A = 2;
                                                                break Label_5748;
                                                            }
                                                            if (n42 != 2) {
                                                                break Label_5748;
                                                            }
                                                            a7.u.A = 1;
                                                            break Label_5748;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 2807729: {
                                                    a7.r = r;
                                                    break;
                                                }
                                                case 2352003: {
                                                    a7.d(f5);
                                                    a7.u.e = (int)r;
                                                    break;
                                                }
                                                case 30321: {
                                                    a7.d(f5);
                                                    final int n43 = (int)r;
                                                    if (n43 == 0) {
                                                        a7.u.r = 0;
                                                        break;
                                                    }
                                                    if (n43 == 1) {
                                                        a7.u.r = 1;
                                                        break;
                                                    }
                                                    if (n43 == 2) {
                                                        a7.u.r = 2;
                                                        break;
                                                    }
                                                    if (n43 != 3) {
                                                        break;
                                                    }
                                                    a7.u.r = 3;
                                                    break;
                                                }
                                                case 25188: {
                                                    a7.d(f5);
                                                    a7.u.P = (int)r;
                                                    break;
                                                }
                                                case 22203: {
                                                    a7.d(f5);
                                                    a7.u.S = r;
                                                    break;
                                                }
                                                case 22186: {
                                                    a7.d(f5);
                                                    a7.u.R = r;
                                                    break;
                                                }
                                                case 21998: {
                                                    a7.d(f5);
                                                    a7.u.f = (int)r;
                                                    break;
                                                }
                                                case 21930: {
                                                    a7.d(f5);
                                                    a7.u.U = (r == 1L);
                                                    break;
                                                }
                                                case 21690: {
                                                    a7.d(f5);
                                                    a7.u.p = (int)r;
                                                    break;
                                                }
                                                case 21682: {
                                                    a7.d(f5);
                                                    a7.u.q = (int)r;
                                                    break;
                                                }
                                                case 21680: {
                                                    a7.d(f5);
                                                    a7.u.o = (int)r;
                                                    break;
                                                }
                                                case 21432: {
                                                    final int n44 = (int)r;
                                                    a7.d(f5);
                                                    if (n44 == 0) {
                                                        a7.u.w = 0;
                                                        break;
                                                    }
                                                    if (n44 == 1) {
                                                        a7.u.w = 2;
                                                        break;
                                                    }
                                                    if (n44 == 3) {
                                                        a7.u.w = 1;
                                                        break;
                                                    }
                                                    if (n44 != 15) {
                                                        break;
                                                    }
                                                    a7.u.w = 3;
                                                    break;
                                                }
                                                case 21420: {
                                                    a7.x = r + a7.q;
                                                    break;
                                                }
                                                case 18408: {
                                                    if (r == 1L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb8 = new StringBuilder(56);
                                                    sb8.append("AESSettingsCipherMode ");
                                                    sb8.append(r);
                                                    sb8.append(" not supported");
                                                    throw ParserException.createForMalformedContainer(sb8.toString(), (Throwable)null);
                                                }
                                                case 18401: {
                                                    if (r == 5L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb9 = new StringBuilder(49);
                                                    sb9.append("ContentEncAlgo ");
                                                    sb9.append(r);
                                                    sb9.append(" not supported");
                                                    throw ParserException.createForMalformedContainer(sb9.toString(), (Throwable)null);
                                                }
                                                case 17143: {
                                                    if (r == 1L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb10 = new StringBuilder(50);
                                                    sb10.append("EBMLReadVersion ");
                                                    sb10.append(r);
                                                    sb10.append(" not supported");
                                                    throw ParserException.createForMalformedContainer(sb10.toString(), (Throwable)null);
                                                }
                                                case 17029: {
                                                    if (r >= 1L && r <= 2L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb11 = new StringBuilder(53);
                                                    sb11.append("DocTypeReadVersion ");
                                                    sb11.append(r);
                                                    sb11.append(" not supported");
                                                    throw ParserException.createForMalformedContainer(sb11.toString(), (Throwable)null);
                                                }
                                                case 16980: {
                                                    if (r == 3L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb12 = new StringBuilder(50);
                                                    sb12.append("ContentCompAlgo ");
                                                    sb12.append(r);
                                                    sb12.append(" not supported");
                                                    throw ParserException.createForMalformedContainer(sb12.toString(), (Throwable)null);
                                                }
                                                case 16871: {
                                                    a7.d(f5);
                                                    a7.u.g = (int)r;
                                                    break;
                                                }
                                                case 251: {
                                                    a7.Q = true;
                                                    break;
                                                }
                                                case 241: {
                                                    if (!a7.E) {
                                                        a7.b(f5);
                                                        a7.D.a(r);
                                                        a7.E = true;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 238: {
                                                    a7.P = (int)r;
                                                    break;
                                                }
                                                case 231: {
                                                    a7.B = a7.k(r);
                                                    break;
                                                }
                                                case 215: {
                                                    a7.d(f5);
                                                    a7.u.c = (int)r;
                                                    break;
                                                }
                                                case 186: {
                                                    a7.d(f5);
                                                    a7.u.n = (int)r;
                                                    break;
                                                }
                                                case 179: {
                                                    a7.b(f5);
                                                    a7.C.a(a7.k(r));
                                                    break;
                                                }
                                                case 176: {
                                                    a7.d(f5);
                                                    a7.u.m = (int)r;
                                                    break;
                                                }
                                                case 159: {
                                                    a7.d(f5);
                                                    a7.u.O = (int)r;
                                                    break;
                                                }
                                                case 155: {
                                                    a7.I = a7.k(r);
                                                    break;
                                                }
                                                case 136: {
                                                    a7.d(f5);
                                                    a7.u.V = (r == 1L);
                                                    break;
                                                }
                                                case 131: {
                                                    a7.d(f5);
                                                    a7.u.d = (int)r;
                                                    break;
                                                }
                                            }
                                        }
                                        else if (r != 1L) {
                                            final StringBuilder sb13 = new StringBuilder(55);
                                            sb13.append("ContentEncodingScope ");
                                            sb13.append(r);
                                            sb13.append(" not supported");
                                            throw ParserException.createForMalformedContainer(sb13.toString(), (Throwable)null);
                                        }
                                    }
                                    else if (r != 0L) {
                                        final StringBuilder sb14 = new StringBuilder(55);
                                        sb14.append("ContentEncodingOrder ");
                                        sb14.append(r);
                                        sb14.append(" not supported");
                                        throw ParserException.createForMalformedContainer(sb14.toString(), (Throwable)null);
                                    }
                                }
                                a.e = 0;
                            }
                        }
                        else {
                            final long d7 = ((db.e)i).d;
                            a.b.push(new a$a(a.f, a.g + d7));
                            final ib.b d8 = a.d;
                            final int f6 = a.f;
                            final long g5 = a.g;
                            final d a8 = ((a)d8).a;
                            ah0.b.I((Object)a8.a0);
                            if (f6 != 160) {
                                if (f6 != 174) {
                                    if (f6 != 187) {
                                        if (f6 != 19899) {
                                            if (f6 != 20533) {
                                                if (f6 != 21968) {
                                                    if (f6 != 408125543) {
                                                        if (f6 != 475249515) {
                                                            if (f6 == 524531317) {
                                                                if (!a8.v) {
                                                                    if (a8.d && a8.z != -1L) {
                                                                        a8.y = true;
                                                                    }
                                                                    else {
                                                                        a8.a0.s((u)new u$b(a8.t));
                                                                        a8.v = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            a8.C = new g();
                                                            a8.D = new g();
                                                        }
                                                    }
                                                    else {
                                                        final long q = a8.q;
                                                        if (q != -1L && q != d7) {
                                                            throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", (Throwable)null);
                                                        }
                                                        a8.q = d7;
                                                        a8.p = g5;
                                                    }
                                                }
                                                else {
                                                    a8.d(f6);
                                                    a8.u.x = true;
                                                }
                                            }
                                            else {
                                                a8.d(f6);
                                                a8.u.h = true;
                                            }
                                        }
                                        else {
                                            a8.w = -1;
                                            a8.x = -1L;
                                        }
                                    }
                                    else {
                                        a8.E = false;
                                    }
                                }
                                else {
                                    a8.u = new d.d$b();
                                }
                            }
                            else {
                                a8.Q = false;
                            }
                            a.e = 0;
                        }
                        n = 1;
                        break Label_6229;
                    }
                    ((db.e)i).n((int)a.g);
                    a.e = 0;
                }
                n = 1;
            }
            if (n != 0) {
                final long d9 = ((db.e)i).d;
                boolean b4 = false;
                Label_6316: {
                    Label_6307: {
                        if (!this.y) {
                            if (this.v) {
                                final long a9 = this.A;
                                if (a9 != -1L) {
                                    t.a = a9;
                                    this.A = -1L;
                                    break Label_6307;
                                }
                            }
                            b4 = false;
                            break Label_6316;
                        }
                        this.A = d9;
                        t.a = this.z;
                        this.y = false;
                    }
                    b4 = true;
                }
                if (b4) {
                    return 1;
                }
                continue;
            }
        }
        if (n == 0) {
            for (int n45 = 0; n45 < this.c.size(); ++n45) {
                final d.d$b d$b3 = (d.d$b)this.c.valueAt(n45);
                d$b3.X.getClass();
                final x t2 = d$b3.T;
                if (t2 != null) {
                    t2.a(d$b3.X, d$b3.j);
                }
            }
            return -1;
        }
        return 0;
    }
    
    public final void i(final db.e e, final int n) throws IOException {
        final t g = this.g;
        if (g.c >= n) {
            return;
        }
        final byte[] a = g.a;
        if (a.length < n) {
            g.a(Math.max(a.length * 2, n));
        }
        final t g2 = this.g;
        final byte[] a2 = g2.a;
        final int c = g2.c;
        e.f(a2, c, n - c, false);
        this.g.A(n);
    }
    
    public final void j() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = 0;
        this.Z = false;
        this.j.y(0);
    }
    
    public final long k(final long n) throws ParserException {
        final long r = this.r;
        if (r != -9223372036854775807L) {
            return bd.c0.P(n, r, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", (Throwable)null);
    }
    
    public final int l(int n, final db.e e, final d.d$b d$b) throws IOException {
        if ("S_TEXT/UTF8".equals(d$b.b)) {
            this.m(e, ib.d.b0, n);
            n = this.S;
            this.j();
            return n;
        }
        if ("S_TEXT/ASS".equals(d$b.b)) {
            this.m(e, ib.d.d0, n);
            n = this.S;
            this.j();
            return n;
        }
        if ("S_TEXT/WEBVTT".equals(d$b.b)) {
            this.m(e, ib.d.e0, n);
            n = this.S;
            this.j();
            return n;
        }
        final w x = d$b.X;
        final boolean u = this.U;
        boolean b = true;
        if (!u) {
            if (d$b.h) {
                this.O &= 0xBFFFFFFF;
                final boolean v = this.V;
                int n2 = 128;
                if (!v) {
                    e.f(this.g.a, 0, 1, false);
                    ++this.R;
                    final byte y = this.g.a[0];
                    if ((y & 0x80) == 0x80) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", (Throwable)null);
                    }
                    this.Y = y;
                    this.V = true;
                }
                final byte y2 = this.Y;
                if ((y2 & 0x1) == 0x1) {
                    final boolean b2 = (y2 & 0x2) == 0x2;
                    this.O |= 0x40000000;
                    if (!this.Z) {
                        e.f(this.l.a, 0, 8, false);
                        this.R += 8;
                        this.Z = true;
                        final t g = this.g;
                        final byte[] a = g.a;
                        if (!b2) {
                            n2 = 0;
                        }
                        a[0] = (byte)(n2 | 0x8);
                        g.B(0);
                        x.d(this.g, 1);
                        ++this.S;
                        this.l.B(0);
                        x.d(this.l, 8);
                        this.S += 8;
                    }
                    if (b2) {
                        if (!this.W) {
                            e.f(this.g.a, 0, 1, false);
                            ++this.R;
                            this.g.B(0);
                            this.X = this.g.r();
                            this.W = true;
                        }
                        final int n3 = this.X * 4;
                        this.g.y(n3);
                        e.f(this.g.a, 0, n3, false);
                        this.R += n3;
                        final short n4 = (short)(this.X / 2 + 1);
                        final int n5 = n4 * 6 + 2;
                        final ByteBuffer o = this.o;
                        if (o == null || o.capacity() < n5) {
                            this.o = ByteBuffer.allocate(n5);
                        }
                        this.o.position(0);
                        this.o.putShort(n4);
                        int n6 = 0;
                        int n7 = 0;
                        int x2;
                        while (true) {
                            x2 = this.X;
                            if (n6 >= x2) {
                                break;
                            }
                            final int u2 = this.g.u();
                            if (n6 % 2 == 0) {
                                this.o.putShort((short)(u2 - n7));
                            }
                            else {
                                this.o.putInt(u2 - n7);
                            }
                            ++n6;
                            n7 = u2;
                        }
                        final int n8 = n - this.R - n7;
                        if (x2 % 2 == 1) {
                            this.o.putInt(n8);
                        }
                        else {
                            this.o.putShort((short)n8);
                            this.o.putInt(0);
                        }
                        this.m.z(n5, this.o.array());
                        x.d(this.m, n5);
                        this.S += n5;
                    }
                }
            }
            else {
                final byte[] i = d$b.i;
                if (i != null) {
                    this.j.z(i.length, i);
                }
            }
            if (d$b.f > 0) {
                this.O |= 0x10000000;
                this.n.y(0);
                this.g.y(4);
                final t g2 = this.g;
                final byte[] a2 = g2.a;
                a2[0] = (byte)(n >> 24 & 0xFF);
                a2[1] = (byte)(n >> 16 & 0xFF);
                a2[2] = (byte)(n >> 8 & 0xFF);
                a2[3] = (byte)(n & 0xFF);
                x.d(g2, 4);
                this.S += 4;
            }
            this.U = true;
        }
        final int n9 = n + this.j.c;
        if (!"V_MPEG4/ISO/AVC".equals(d$b.b) && !"V_MPEGH/ISO/HEVC".equals(d$b.b)) {
            if (d$b.T != null) {
                if (this.j.c != 0) {
                    b = false;
                }
                ah0.b.H(b);
                d$b.T.c((i)e);
            }
            while (true) {
                n = this.R;
                if (n >= n9) {
                    break;
                }
                n = n9 - n;
                final t j = this.j;
                final int n10 = j.c - j.b;
                if (n10 > 0) {
                    n = Math.min(n, n10);
                    x.c(n, this.j);
                }
                else {
                    n = x.e((zc.f)e, n, false);
                }
                this.R += n;
                this.S += n;
            }
        }
        else {
            final byte[] a3 = this.f.a;
            a3[0] = 0;
            a3[2] = (a3[1] = 0);
            final int y3 = d$b.Y;
            final int n11 = 4 - y3;
            while (this.R < n9) {
                final int t = this.T;
                if (t == 0) {
                    final t k = this.j;
                    n = Math.min(y3, k.c - k.b);
                    e.f(a3, n11 + n, y3 - n, false);
                    if (n > 0) {
                        this.j.b(n11, n, a3);
                    }
                    this.R += y3;
                    this.f.B(0);
                    this.T = this.f.u();
                    this.e.B(0);
                    x.c(4, this.e);
                    this.S += 4;
                }
                else {
                    final t l = this.j;
                    n = l.c - l.b;
                    if (n > 0) {
                        n = Math.min(t, n);
                        x.c(n, this.j);
                    }
                    else {
                        n = x.e((zc.f)e, t, false);
                    }
                    this.R += n;
                    this.S += n;
                    this.T -= n;
                }
            }
        }
        if ("A_VORBIS".equals(d$b.b)) {
            this.h.B(0);
            x.c(4, this.h);
            this.S += 4;
        }
        n = this.S;
        this.j();
        return n;
    }
    
    public final void m(final db.e e, final byte[] array, final int n) throws IOException {
        final int n2 = array.length + n;
        final t k = this.k;
        final byte[] a = k.a;
        if (a.length < n2) {
            final byte[] copy = Arrays.copyOf(array, n2 + n);
            k.z(copy.length, copy);
        }
        else {
            System.arraycopy(array, 0, a, 0, array.length);
        }
        e.f(this.k.a, array.length, n, false);
        this.k.B(0);
        this.k.A(n2);
    }
    
    public final void release() {
    }
    
    public final class a implements ib.b
    {
        public final d a;
        
        public a(final d a) {
            this.a = a;
        }
        
        public final void a(final int p0) throws ParserException {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        ib/d$a.a:Lib/d;
            //     4: astore          22
            //     6: aload           22
            //     8: getfield        ib/d.a0:Ldb/j;
            //    11: invokestatic    ah0/b.I:(Ljava/lang/Object;)V
            //    14: iconst_0       
            //    15: istore          5
            //    17: iload_1        
            //    18: sipush          160
            //    21: if_icmpeq       5784
            //    24: iload_1        
            //    25: sipush          174
            //    28: if_icmpeq       745
            //    31: iload_1        
            //    32: sipush          19899
            //    35: if_icmpeq       695
            //    38: iload_1        
            //    39: sipush          25152
            //    42: if_icmpeq       615
            //    45: iload_1        
            //    46: sipush          28032
            //    49: if_icmpeq       576
            //    52: iload_1        
            //    53: ldc             357149030
            //    55: if_icmpeq       525
            //    58: iload_1        
            //    59: ldc             374648427
            //    61: if_icmpeq       494
            //    64: iload_1        
            //    65: ldc             475249515
            //    67: if_icmpeq       73
            //    70: goto            5968
            //    73: aload           22
            //    75: getfield        ib/d.v:Z
            //    78: ifne            479
            //    81: aload           22
            //    83: getfield        ib/d.a0:Ldb/j;
            //    86: astore          23
            //    88: aload           22
            //    90: getfield        ib/d.C:Lkc/g;
            //    93: astore          15
            //    95: aload           22
            //    97: getfield        ib/d.D:Lkc/g;
            //   100: astore          14
            //   102: aload           22
            //   104: getfield        ib/d.q:J
            //   107: ldc2_w          -1
            //   110: lcmp           
            //   111: ifeq            450
            //   114: aload           22
            //   116: getfield        ib/d.t:J
            //   119: ldc2_w          -9223372036854775807
            //   122: lcmp           
            //   123: ifeq            450
            //   126: aload           15
            //   128: ifnull          450
            //   131: aload           15
            //   133: getfield        kc/g.f:I
            //   136: istore          6
            //   138: iload           6
            //   140: ifeq            450
            //   143: aload           14
            //   145: ifnull          450
            //   148: aload           14
            //   150: getfield        kc/g.f:I
            //   153: iload           6
            //   155: if_icmpeq       161
            //   158: goto            450
            //   161: iload           6
            //   163: newarray        I
            //   165: astore          21
            //   167: iload           6
            //   169: newarray        J
            //   171: astore          20
            //   173: iload           6
            //   175: newarray        J
            //   177: astore          19
            //   179: iload           6
            //   181: newarray        J
            //   183: astore          18
            //   185: iconst_0       
            //   186: istore          4
            //   188: iload           5
            //   190: istore_1       
            //   191: iload           4
            //   193: iload           6
            //   195: if_icmpge       238
            //   198: aload           18
            //   200: iload           4
            //   202: aload           15
            //   204: iload           4
            //   206: invokevirtual   kc/g.b:(I)J
            //   209: lastore        
            //   210: aload           22
            //   212: getfield        ib/d.q:J
            //   215: lstore          10
            //   217: aload           20
            //   219: iload           4
            //   221: aload           14
            //   223: iload           4
            //   225: invokevirtual   kc/g.b:(I)J
            //   228: lload           10
            //   230: ladd           
            //   231: lastore        
            //   232: iinc            4, 1
            //   235: goto            188
            //   238: iload           6
            //   240: iconst_1       
            //   241: isub           
            //   242: istore          4
            //   244: iload_1        
            //   245: iload           4
            //   247: if_icmpge       290
            //   250: iload_1        
            //   251: iconst_1       
            //   252: iadd           
            //   253: istore          4
            //   255: aload           21
            //   257: iload_1        
            //   258: aload           20
            //   260: iload           4
            //   262: laload         
            //   263: aload           20
            //   265: iload_1        
            //   266: laload         
            //   267: lsub           
            //   268: l2i            
            //   269: iastore        
            //   270: aload           19
            //   272: iload_1        
            //   273: aload           18
            //   275: iload           4
            //   277: laload         
            //   278: aload           18
            //   280: iload_1        
            //   281: laload         
            //   282: lsub           
            //   283: lastore        
            //   284: iload           4
            //   286: istore_1       
            //   287: goto            238
            //   290: aload           21
            //   292: iload           4
            //   294: aload           22
            //   296: getfield        ib/d.q:J
            //   299: aload           22
            //   301: getfield        ib/d.p:J
            //   304: ladd           
            //   305: aload           20
            //   307: iload           4
            //   309: laload         
            //   310: lsub           
            //   311: l2i            
            //   312: iastore        
            //   313: aload           22
            //   315: getfield        ib/d.t:J
            //   318: aload           18
            //   320: iload           4
            //   322: laload         
            //   323: lsub           
            //   324: lstore          10
            //   326: aload           19
            //   328: iload           4
            //   330: lload           10
            //   332: lastore        
            //   333: aload           21
            //   335: astore          17
            //   337: aload           20
            //   339: astore          16
            //   341: aload           19
            //   343: astore          15
            //   345: aload           18
            //   347: astore          14
            //   349: lload           10
            //   351: lconst_0       
            //   352: lcmp           
            //   353: ifgt            430
            //   356: new             Ljava/lang/StringBuilder;
            //   359: dup            
            //   360: bipush          72
            //   362: invokespecial   java/lang/StringBuilder.<init>:(I)V
            //   365: astore          14
            //   367: aload           14
            //   369: ldc             "Discarding last cue point with unexpected duration: "
            //   371: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   374: pop            
            //   375: aload           14
            //   377: lload           10
            //   379: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
            //   382: pop            
            //   383: ldc             "MatroskaExtractor"
            //   385: aload           14
            //   387: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   390: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
            //   393: pop            
            //   394: aload           21
            //   396: iload           4
            //   398: invokestatic    java/util/Arrays.copyOf:([II)[I
            //   401: astore          17
            //   403: aload           20
            //   405: iload           4
            //   407: invokestatic    java/util/Arrays.copyOf:([JI)[J
            //   410: astore          16
            //   412: aload           19
            //   414: iload           4
            //   416: invokestatic    java/util/Arrays.copyOf:([JI)[J
            //   419: astore          15
            //   421: aload           18
            //   423: iload           4
            //   425: invokestatic    java/util/Arrays.copyOf:([JI)[J
            //   428: astore          14
            //   430: new             Ldb/c;
            //   433: dup            
            //   434: aload           17
            //   436: aload           16
            //   438: aload           15
            //   440: aload           14
            //   442: invokespecial   db/c.<init>:([I[J[J[J)V
            //   445: astore          14
            //   447: goto            464
            //   450: new             Ldb/u$b;
            //   453: dup            
            //   454: aload           22
            //   456: getfield        ib/d.t:J
            //   459: invokespecial   db/u$b.<init>:(J)V
            //   462: astore          14
            //   464: aload           23
            //   466: aload           14
            //   468: invokeinterface db/j.s:(Ldb/u;)V
            //   473: aload           22
            //   475: iconst_1       
            //   476: putfield        ib/d.v:Z
            //   479: aload           22
            //   481: aconst_null    
            //   482: putfield        ib/d.C:Lkc/g;
            //   485: aload           22
            //   487: aconst_null    
            //   488: putfield        ib/d.D:Lkc/g;
            //   491: goto            5968
            //   494: aload           22
            //   496: getfield        ib/d.c:Landroid/util/SparseArray;
            //   499: invokevirtual   android/util/SparseArray.size:()I
            //   502: ifeq            518
            //   505: aload           22
            //   507: getfield        ib/d.a0:Ldb/j;
            //   510: invokeinterface db/j.b:()V
            //   515: goto            5968
            //   518: ldc             "No valid tracks were found"
            //   520: aconst_null    
            //   521: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //   524: athrow         
            //   525: aload           22
            //   527: getfield        ib/d.r:J
            //   530: ldc2_w          -9223372036854775807
            //   533: lcmp           
            //   534: ifne            545
            //   537: aload           22
            //   539: ldc2_w          1000000
            //   542: putfield        ib/d.r:J
            //   545: aload           22
            //   547: getfield        ib/d.s:J
            //   550: lstore          10
            //   552: lload           10
            //   554: ldc2_w          -9223372036854775807
            //   557: lcmp           
            //   558: ifeq            5968
            //   561: aload           22
            //   563: aload           22
            //   565: lload           10
            //   567: invokevirtual   ib/d.k:(J)J
            //   570: putfield        ib/d.t:J
            //   573: goto            5968
            //   576: aload           22
            //   578: iload_1        
            //   579: invokevirtual   ib/d.d:(I)V
            //   582: aload           22
            //   584: getfield        ib/d.u:Lib/d$b;
            //   587: astore          14
            //   589: aload           14
            //   591: getfield        ib/d$b.h:Z
            //   594: ifeq            5968
            //   597: aload           14
            //   599: getfield        ib/d$b.i:[B
            //   602: ifnonnull       608
            //   605: goto            5968
            //   608: ldc             "Combining encryption and compression is not supported"
            //   610: aconst_null    
            //   611: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //   614: athrow         
            //   615: aload           22
            //   617: iload_1        
            //   618: invokevirtual   ib/d.d:(I)V
            //   621: aload           22
            //   623: getfield        ib/d.u:Lib/d$b;
            //   626: astore          14
            //   628: aload           14
            //   630: getfield        ib/d$b.h:Z
            //   633: ifeq            5968
            //   636: aload           14
            //   638: getfield        ib/d$b.j:Ldb/w$a;
            //   641: astore          15
            //   643: aload           15
            //   645: ifnull          688
            //   648: aload           14
            //   650: new             Lcom/google/android/exoplayer2/drm/b;
            //   653: dup            
            //   654: iconst_1       
            //   655: anewarray       Lcom/google/android/exoplayer2/drm/b$b;
            //   658: dup            
            //   659: iconst_0       
            //   660: new             Lcom/google/android/exoplayer2/drm/b$b;
            //   663: dup            
            //   664: getstatic       wa/b.a:Ljava/util/UUID;
            //   667: aconst_null    
            //   668: ldc             "video/webm"
            //   670: aload           15
            //   672: getfield        db/w$a.b:[B
            //   675: invokespecial   com/google/android/exoplayer2/drm/b$b.<init>:(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V
            //   678: aastore        
            //   679: invokespecial   com/google/android/exoplayer2/drm/b.<init>:([Lcom/google/android/exoplayer2/drm/b$b;)V
            //   682: putfield        ib/d$b.l:Lcom/google/android/exoplayer2/drm/b;
            //   685: goto            5968
            //   688: ldc             "Encrypted Track found but ContentEncKeyID was not found"
            //   690: aconst_null    
            //   691: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //   694: athrow         
            //   695: aload           22
            //   697: getfield        ib/d.w:I
            //   700: istore_1       
            //   701: iload_1        
            //   702: iconst_m1      
            //   703: if_icmpeq       738
            //   706: aload           22
            //   708: getfield        ib/d.x:J
            //   711: lstore          10
            //   713: lload           10
            //   715: ldc2_w          -1
            //   718: lcmp           
            //   719: ifeq            738
            //   722: iload_1        
            //   723: ldc             475249515
            //   725: if_icmpne       5968
            //   728: aload           22
            //   730: lload           10
            //   732: putfield        ib/d.z:J
            //   735: goto            5968
            //   738: ldc             "Mandatory element SeekID or SeekPosition not found"
            //   740: aconst_null    
            //   741: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //   744: athrow         
            //   745: aload           22
            //   747: getfield        ib/d.u:Lib/d$b;
            //   750: astore          19
            //   752: aload           19
            //   754: invokestatic    ah0/b.I:(Ljava/lang/Object;)V
            //   757: aload           19
            //   759: getfield        ib/d$b.b:Ljava/lang/String;
            //   762: astore          14
            //   764: aload           14
            //   766: ifnull          5776
            //   769: aload           14
            //   771: invokevirtual   java/lang/String.hashCode:()I
            //   774: istore_1       
            //   775: iload_1        
            //   776: lookupswitch {
            //          -2095576542: 1673
            //          -2095575984: 1654
            //          -1985379776: 1635
            //          -1784763192: 1616
            //          -1730367663: 1597
            //          -1482641358: 1578
            //          -1482641357: 1558
            //          -1373388978: 1538
            //          -933872740: 1518
            //          -538363189: 1498
            //          -538363109: 1478
            //          -425012669: 1458
            //          -356037306: 1438
            //          62923557: 1418
            //          62923603: 1398
            //          62927045: 1378
            //          82318131: 1359
            //          82338133: 1340
            //          82338134: 1321
            //          99146302: 1302
            //          444813526: 1283
            //          542569478: 1264
            //          635596514: 1245
            //          725948237: 1226
            //          725957860: 1207
            //          738597099: 1188
            //          855502857: 1169
            //          1045209816: 1150
            //          1422270023: 1131
            //          1809237540: 1112
            //          1950749482: 1093
            //          1950789798: 1074
            //          1951062397: 1055
            //          default: 1052
            //        }
            //  1052: goto            1692
            //  1055: aload           14
            //  1057: ldc             "A_OPUS"
            //  1059: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1062: ifne            1068
            //  1065: goto            1052
            //  1068: bipush          32
            //  1070: istore_1       
            //  1071: goto            1694
            //  1074: aload           14
            //  1076: ldc             "A_FLAC"
            //  1078: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1081: ifne            1087
            //  1084: goto            1052
            //  1087: bipush          31
            //  1089: istore_1       
            //  1090: goto            1495
            //  1093: aload           14
            //  1095: ldc             "A_EAC3"
            //  1097: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1100: ifne            1106
            //  1103: goto            1052
            //  1106: bipush          30
            //  1108: istore_1       
            //  1109: goto            1495
            //  1112: aload           14
            //  1114: ldc             "V_MPEG2"
            //  1116: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1119: ifne            1125
            //  1122: goto            1052
            //  1125: bipush          29
            //  1127: istore_1       
            //  1128: goto            1495
            //  1131: aload           14
            //  1133: ldc             "S_TEXT/UTF8"
            //  1135: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1138: ifne            1144
            //  1141: goto            1052
            //  1144: bipush          28
            //  1146: istore_1       
            //  1147: goto            1495
            //  1150: aload           14
            //  1152: ldc             "S_TEXT/WEBVTT"
            //  1154: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1157: ifne            1163
            //  1160: goto            1052
            //  1163: bipush          27
            //  1165: istore_1       
            //  1166: goto            1495
            //  1169: aload           14
            //  1171: ldc             "V_MPEGH/ISO/HEVC"
            //  1173: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1176: ifne            1182
            //  1179: goto            1052
            //  1182: bipush          26
            //  1184: istore_1       
            //  1185: goto            1495
            //  1188: aload           14
            //  1190: ldc             "S_TEXT/ASS"
            //  1192: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1195: ifne            1201
            //  1198: goto            1052
            //  1201: bipush          25
            //  1203: istore_1       
            //  1204: goto            1694
            //  1207: aload           14
            //  1209: ldc             "A_PCM/INT/LIT"
            //  1211: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1214: ifne            1220
            //  1217: goto            1052
            //  1220: bipush          24
            //  1222: istore_1       
            //  1223: goto            1694
            //  1226: aload           14
            //  1228: ldc             "A_PCM/INT/BIG"
            //  1230: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1233: ifne            1239
            //  1236: goto            1052
            //  1239: bipush          23
            //  1241: istore_1       
            //  1242: goto            1495
            //  1245: aload           14
            //  1247: ldc             "A_PCM/FLOAT/IEEE"
            //  1249: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1252: ifne            1258
            //  1255: goto            1052
            //  1258: bipush          22
            //  1260: istore_1       
            //  1261: goto            1495
            //  1264: aload           14
            //  1266: ldc             "A_DTS/EXPRESS"
            //  1268: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1271: ifne            1277
            //  1274: goto            1052
            //  1277: bipush          21
            //  1279: istore_1       
            //  1280: goto            1495
            //  1283: aload           14
            //  1285: ldc             "V_THEORA"
            //  1287: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1290: ifne            1296
            //  1293: goto            1052
            //  1296: bipush          20
            //  1298: istore_1       
            //  1299: goto            1694
            //  1302: aload           14
            //  1304: ldc             "S_HDMV/PGS"
            //  1306: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1309: ifne            1315
            //  1312: goto            1052
            //  1315: bipush          19
            //  1317: istore_1       
            //  1318: goto            1495
            //  1321: aload           14
            //  1323: ldc             "V_VP9"
            //  1325: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1328: ifne            1334
            //  1331: goto            1052
            //  1334: bipush          18
            //  1336: istore_1       
            //  1337: goto            1495
            //  1340: aload           14
            //  1342: ldc             "V_VP8"
            //  1344: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1347: ifne            1353
            //  1350: goto            1052
            //  1353: bipush          17
            //  1355: istore_1       
            //  1356: goto            1495
            //  1359: aload           14
            //  1361: ldc             "V_AV1"
            //  1363: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1366: ifne            1372
            //  1369: goto            1052
            //  1372: bipush          16
            //  1374: istore_1       
            //  1375: goto            1575
            //  1378: aload           14
            //  1380: ldc_w           "A_DTS"
            //  1383: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1386: ifne            1392
            //  1389: goto            1052
            //  1392: bipush          15
            //  1394: istore_1       
            //  1395: goto            1694
            //  1398: aload           14
            //  1400: ldc_w           "A_AC3"
            //  1403: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1406: ifne            1412
            //  1409: goto            1052
            //  1412: bipush          14
            //  1414: istore_1       
            //  1415: goto            1495
            //  1418: aload           14
            //  1420: ldc_w           "A_AAC"
            //  1423: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1426: ifne            1432
            //  1429: goto            1052
            //  1432: bipush          13
            //  1434: istore_1       
            //  1435: goto            1495
            //  1438: aload           14
            //  1440: ldc_w           "A_DTS/LOSSLESS"
            //  1443: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1446: ifne            1452
            //  1449: goto            1052
            //  1452: bipush          12
            //  1454: istore_1       
            //  1455: goto            1495
            //  1458: aload           14
            //  1460: ldc_w           "S_VOBSUB"
            //  1463: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1466: ifne            1472
            //  1469: goto            1052
            //  1472: bipush          11
            //  1474: istore_1       
            //  1475: goto            1495
            //  1478: aload           14
            //  1480: ldc_w           "V_MPEG4/ISO/AVC"
            //  1483: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1486: ifne            1492
            //  1489: goto            1052
            //  1492: bipush          10
            //  1494: istore_1       
            //  1495: goto            1575
            //  1498: aload           14
            //  1500: ldc_w           "V_MPEG4/ISO/ASP"
            //  1503: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1506: ifne            1512
            //  1509: goto            1569
            //  1512: bipush          9
            //  1514: istore_1       
            //  1515: goto            1555
            //  1518: aload           14
            //  1520: ldc_w           "S_DVBSUB"
            //  1523: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1526: ifne            1532
            //  1529: goto            1569
            //  1532: bipush          8
            //  1534: istore_1       
            //  1535: goto            1555
            //  1538: aload           14
            //  1540: ldc_w           "V_MS/VFW/FOURCC"
            //  1543: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1546: ifne            1552
            //  1549: goto            1569
            //  1552: bipush          7
            //  1554: istore_1       
            //  1555: goto            1575
            //  1558: aload           14
            //  1560: ldc_w           "A_MPEG/L3"
            //  1563: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1566: ifne            1572
            //  1569: goto            1692
            //  1572: bipush          6
            //  1574: istore_1       
            //  1575: goto            1694
            //  1578: aload           14
            //  1580: ldc_w           "A_MPEG/L2"
            //  1583: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1586: ifne            1592
            //  1589: goto            1692
            //  1592: iconst_5       
            //  1593: istore_1       
            //  1594: goto            1694
            //  1597: aload           14
            //  1599: ldc_w           "A_VORBIS"
            //  1602: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1605: ifne            1611
            //  1608: goto            1692
            //  1611: iconst_4       
            //  1612: istore_1       
            //  1613: goto            1694
            //  1616: aload           14
            //  1618: ldc_w           "A_TRUEHD"
            //  1621: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1624: ifne            1630
            //  1627: goto            1692
            //  1630: iconst_3       
            //  1631: istore_1       
            //  1632: goto            1694
            //  1635: aload           14
            //  1637: ldc_w           "A_MS/ACM"
            //  1640: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1643: ifne            1649
            //  1646: goto            1692
            //  1649: iconst_2       
            //  1650: istore_1       
            //  1651: goto            1694
            //  1654: aload           14
            //  1656: ldc_w           "V_MPEG4/ISO/SP"
            //  1659: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1662: ifne            1668
            //  1665: goto            1692
            //  1668: iconst_1       
            //  1669: istore_1       
            //  1670: goto            1694
            //  1673: aload           14
            //  1675: ldc_w           "V_MPEG4/ISO/AP"
            //  1678: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1681: ifne            1687
            //  1684: goto            1692
            //  1687: iconst_0       
            //  1688: istore_1       
            //  1689: goto            1694
            //  1692: iconst_m1      
            //  1693: istore_1       
            //  1694: iload_1        
            //  1695: tableswitch {
            //                0: 1845
            //                1: 1845
            //                2: 1845
            //                3: 1845
            //                4: 1845
            //                5: 1845
            //                6: 1845
            //                7: 1845
            //                8: 1845
            //                9: 1845
            //               10: 1845
            //               11: 1845
            //               12: 1845
            //               13: 1845
            //               14: 1845
            //               15: 1845
            //               16: 1845
            //               17: 1845
            //               18: 1845
            //               19: 1845
            //               20: 1845
            //               21: 1845
            //               22: 1845
            //               23: 1845
            //               24: 1845
            //               25: 1845
            //               26: 1845
            //               27: 1845
            //               28: 1845
            //               29: 1845
            //               30: 1845
            //               31: 1845
            //               32: 1845
            //          default: 1840
            //        }
            //  1840: iconst_0       
            //  1841: istore_1       
            //  1842: goto            1847
            //  1845: iconst_1       
            //  1846: istore_1       
            //  1847: iload_1        
            //  1848: ifeq            5767
            //  1851: aload           22
            //  1853: getfield        ib/d.a0:Ldb/j;
            //  1856: astore          20
            //  1858: aload           19
            //  1860: getfield        ib/d$b.c:I
            //  1863: istore          7
            //  1865: aload           19
            //  1867: getfield        ib/d$b.b:Ljava/lang/String;
            //  1870: astore          14
            //  1872: aload           14
            //  1874: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //  1877: pop            
            //  1878: aload           14
            //  1880: invokevirtual   java/lang/String.hashCode:()I
            //  1883: lookupswitch {
            //          -2095576542: 2777
            //          -2095575984: 2758
            //          -1985379776: 2739
            //          -1784763192: 2720
            //          -1730367663: 2701
            //          -1482641358: 2682
            //          -1482641357: 2662
            //          -1373388978: 2642
            //          -933872740: 2622
            //          -538363189: 2602
            //          -538363109: 2582
            //          -425012669: 2562
            //          -356037306: 2542
            //          62923557: 2522
            //          62923603: 2502
            //          62927045: 2482
            //          82318131: 2463
            //          82338133: 2444
            //          82338134: 2425
            //          99146302: 2406
            //          444813526: 2387
            //          542569478: 2368
            //          635596514: 2349
            //          725948237: 2330
            //          725957860: 2311
            //          738597099: 2292
            //          855502857: 2273
            //          1045209816: 2254
            //          1422270023: 2235
            //          1809237540: 2216
            //          1950749482: 2197
            //          1950789798: 2178
            //          1951062397: 2159
            //          default: 2156
            //        }
            //  2156: goto            2796
            //  2159: aload           14
            //  2161: ldc             "A_OPUS"
            //  2163: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2166: ifne            2172
            //  2169: goto            2796
            //  2172: bipush          32
            //  2174: istore_1       
            //  2175: goto            2798
            //  2178: aload           14
            //  2180: ldc             "A_FLAC"
            //  2182: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2185: ifne            2191
            //  2188: goto            2796
            //  2191: bipush          31
            //  2193: istore_1       
            //  2194: goto            2798
            //  2197: aload           14
            //  2199: ldc             "A_EAC3"
            //  2201: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2204: ifne            2210
            //  2207: goto            2796
            //  2210: bipush          30
            //  2212: istore_1       
            //  2213: goto            2798
            //  2216: aload           14
            //  2218: ldc             "V_MPEG2"
            //  2220: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2223: ifne            2229
            //  2226: goto            2796
            //  2229: bipush          29
            //  2231: istore_1       
            //  2232: goto            2798
            //  2235: aload           14
            //  2237: ldc             "S_TEXT/UTF8"
            //  2239: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2242: ifne            2248
            //  2245: goto            2796
            //  2248: bipush          28
            //  2250: istore_1       
            //  2251: goto            2798
            //  2254: aload           14
            //  2256: ldc             "S_TEXT/WEBVTT"
            //  2258: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2261: ifne            2267
            //  2264: goto            2796
            //  2267: bipush          27
            //  2269: istore_1       
            //  2270: goto            2798
            //  2273: aload           14
            //  2275: ldc             "V_MPEGH/ISO/HEVC"
            //  2277: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2280: ifne            2286
            //  2283: goto            2796
            //  2286: bipush          26
            //  2288: istore_1       
            //  2289: goto            2798
            //  2292: aload           14
            //  2294: ldc             "S_TEXT/ASS"
            //  2296: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2299: ifne            2305
            //  2302: goto            2796
            //  2305: bipush          25
            //  2307: istore_1       
            //  2308: goto            2798
            //  2311: aload           14
            //  2313: ldc             "A_PCM/INT/LIT"
            //  2315: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2318: ifne            2324
            //  2321: goto            2796
            //  2324: bipush          24
            //  2326: istore_1       
            //  2327: goto            2798
            //  2330: aload           14
            //  2332: ldc             "A_PCM/INT/BIG"
            //  2334: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2337: ifne            2343
            //  2340: goto            2796
            //  2343: bipush          23
            //  2345: istore_1       
            //  2346: goto            2798
            //  2349: aload           14
            //  2351: ldc             "A_PCM/FLOAT/IEEE"
            //  2353: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2356: ifne            2362
            //  2359: goto            2796
            //  2362: bipush          22
            //  2364: istore_1       
            //  2365: goto            2798
            //  2368: aload           14
            //  2370: ldc             "A_DTS/EXPRESS"
            //  2372: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2375: ifne            2381
            //  2378: goto            2796
            //  2381: bipush          21
            //  2383: istore_1       
            //  2384: goto            2798
            //  2387: aload           14
            //  2389: ldc             "V_THEORA"
            //  2391: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2394: ifne            2400
            //  2397: goto            2796
            //  2400: bipush          20
            //  2402: istore_1       
            //  2403: goto            2798
            //  2406: aload           14
            //  2408: ldc             "S_HDMV/PGS"
            //  2410: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2413: ifne            2419
            //  2416: goto            2796
            //  2419: bipush          19
            //  2421: istore_1       
            //  2422: goto            2798
            //  2425: aload           14
            //  2427: ldc             "V_VP9"
            //  2429: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2432: ifne            2438
            //  2435: goto            2796
            //  2438: bipush          18
            //  2440: istore_1       
            //  2441: goto            2798
            //  2444: aload           14
            //  2446: ldc             "V_VP8"
            //  2448: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2451: ifne            2457
            //  2454: goto            2796
            //  2457: bipush          17
            //  2459: istore_1       
            //  2460: goto            2798
            //  2463: aload           14
            //  2465: ldc             "V_AV1"
            //  2467: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2470: ifne            2476
            //  2473: goto            2796
            //  2476: bipush          16
            //  2478: istore_1       
            //  2479: goto            2798
            //  2482: aload           14
            //  2484: ldc_w           "A_DTS"
            //  2487: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2490: ifne            2496
            //  2493: goto            2796
            //  2496: bipush          15
            //  2498: istore_1       
            //  2499: goto            2798
            //  2502: aload           14
            //  2504: ldc_w           "A_AC3"
            //  2507: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2510: ifne            2516
            //  2513: goto            2796
            //  2516: bipush          14
            //  2518: istore_1       
            //  2519: goto            2798
            //  2522: aload           14
            //  2524: ldc_w           "A_AAC"
            //  2527: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2530: ifne            2536
            //  2533: goto            2796
            //  2536: bipush          13
            //  2538: istore_1       
            //  2539: goto            2798
            //  2542: aload           14
            //  2544: ldc_w           "A_DTS/LOSSLESS"
            //  2547: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2550: ifne            2556
            //  2553: goto            2796
            //  2556: bipush          12
            //  2558: istore_1       
            //  2559: goto            2798
            //  2562: aload           14
            //  2564: ldc_w           "S_VOBSUB"
            //  2567: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2570: ifne            2576
            //  2573: goto            2796
            //  2576: bipush          11
            //  2578: istore_1       
            //  2579: goto            2798
            //  2582: aload           14
            //  2584: ldc_w           "V_MPEG4/ISO/AVC"
            //  2587: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2590: ifne            2596
            //  2593: goto            2796
            //  2596: bipush          10
            //  2598: istore_1       
            //  2599: goto            2798
            //  2602: aload           14
            //  2604: ldc_w           "V_MPEG4/ISO/ASP"
            //  2607: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2610: ifne            2616
            //  2613: goto            2796
            //  2616: bipush          9
            //  2618: istore_1       
            //  2619: goto            2798
            //  2622: aload           14
            //  2624: ldc_w           "S_DVBSUB"
            //  2627: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2630: ifne            2636
            //  2633: goto            2796
            //  2636: bipush          8
            //  2638: istore_1       
            //  2639: goto            2798
            //  2642: aload           14
            //  2644: ldc_w           "V_MS/VFW/FOURCC"
            //  2647: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2650: ifne            2656
            //  2653: goto            2796
            //  2656: bipush          7
            //  2658: istore_1       
            //  2659: goto            2798
            //  2662: aload           14
            //  2664: ldc_w           "A_MPEG/L3"
            //  2667: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2670: ifne            2676
            //  2673: goto            2796
            //  2676: bipush          6
            //  2678: istore_1       
            //  2679: goto            2798
            //  2682: aload           14
            //  2684: ldc_w           "A_MPEG/L2"
            //  2687: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2690: ifne            2696
            //  2693: goto            2796
            //  2696: iconst_5       
            //  2697: istore_1       
            //  2698: goto            2798
            //  2701: aload           14
            //  2703: ldc_w           "A_VORBIS"
            //  2706: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2709: ifne            2715
            //  2712: goto            2796
            //  2715: iconst_4       
            //  2716: istore_1       
            //  2717: goto            2798
            //  2720: aload           14
            //  2722: ldc_w           "A_TRUEHD"
            //  2725: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2728: ifne            2734
            //  2731: goto            2796
            //  2734: iconst_3       
            //  2735: istore_1       
            //  2736: goto            2798
            //  2739: aload           14
            //  2741: ldc_w           "A_MS/ACM"
            //  2744: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2747: ifne            2753
            //  2750: goto            2796
            //  2753: iconst_2       
            //  2754: istore_1       
            //  2755: goto            2798
            //  2758: aload           14
            //  2760: ldc_w           "V_MPEG4/ISO/SP"
            //  2763: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2766: ifne            2772
            //  2769: goto            2796
            //  2772: iconst_1       
            //  2773: istore_1       
            //  2774: goto            2798
            //  2777: aload           14
            //  2779: ldc_w           "V_MPEG4/ISO/AP"
            //  2782: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  2785: ifne            2791
            //  2788: goto            2796
            //  2791: iconst_0       
            //  2792: istore_1       
            //  2793: goto            2798
            //  2796: iconst_m1      
            //  2797: istore_1       
            //  2798: ldc_w           "video/x-unknown"
            //  2801: astore          16
            //  2803: ldc_w           "audio/raw"
            //  2806: astore          14
            //  2808: ldc_w           "audio/x-unknown"
            //  2811: astore          15
            //  2813: iload_1        
            //  2814: tableswitch {
            //                0: 4551
            //                1: 4551
            //                2: 4319
            //                3: 4299
            //                4: 4023
            //                5: 4000
            //                6: 3992
            //                7: 3736
            //                8: 3698
            //                9: 4551
            //               10: 3630
            //               11: 3607
            //               12: 3592
            //               13: 3517
            //               14: 3509
            //               15: 3501
            //               16: 3493
            //               17: 3485
            //               18: 3477
            //               19: 3469
            //               20: 3462
            //               21: 3501
            //               22: 3377
            //               23: 3288
            //               24: 3205
            //               25: 3179
            //               26: 3125
            //               27: 3117
            //               28: 3109
            //               29: 3101
            //               30: 3093
            //               31: 3070
            //               32: 2968
            //          default: 2960
            //        }
            //  2960: ldc_w           "Unrecognized codec identifier."
            //  2963: aconst_null    
            //  2964: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //  2967: athrow         
            //  2968: sipush          5760
            //  2971: istore          4
            //  2973: new             Ljava/util/ArrayList;
            //  2976: dup            
            //  2977: iconst_3       
            //  2978: invokespecial   java/util/ArrayList.<init>:(I)V
            //  2981: astore          16
            //  2983: aload           16
            //  2985: aload           19
            //  2987: aload           19
            //  2989: getfield        ib/d$b.b:Ljava/lang/String;
            //  2992: invokevirtual   ib/d$b.a:(Ljava/lang/String;)[B
            //  2995: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  2998: pop            
            //  2999: bipush          8
            //  3001: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
            //  3004: astore          14
            //  3006: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
            //  3009: astore          15
            //  3011: aload           16
            //  3013: aload           14
            //  3015: aload           15
            //  3017: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
            //  3020: aload           19
            //  3022: getfield        ib/d$b.R:J
            //  3025: invokevirtual   java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
            //  3028: invokevirtual   java/nio/ByteBuffer.array:()[B
            //  3031: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  3034: pop            
            //  3035: aload           16
            //  3037: bipush          8
            //  3039: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
            //  3042: aload           15
            //  3044: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
            //  3047: aload           19
            //  3049: getfield        ib/d$b.S:J
            //  3052: invokevirtual   java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
            //  3055: invokevirtual   java/nio/ByteBuffer.array:()[B
            //  3058: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  3061: pop            
            //  3062: ldc_w           "audio/opus"
            //  3065: astore          14
            //  3067: goto            4254
            //  3070: aload           19
            //  3072: aload           19
            //  3074: getfield        ib/d$b.b:Ljava/lang/String;
            //  3077: invokevirtual   ib/d$b.a:(Ljava/lang/String;)[B
            //  3080: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
            //  3083: astore          14
            //  3085: ldc_w           "audio/flac"
            //  3088: astore          15
            //  3090: goto            3973
            //  3093: ldc_w           "audio/eac3"
            //  3096: astore          14
            //  3098: goto            3597
            //  3101: ldc_w           "video/mpeg2"
            //  3104: astore          14
            //  3106: goto            3597
            //  3109: ldc_w           "application/x-subrip"
            //  3112: astore          14
            //  3114: goto            3597
            //  3117: ldc_w           "text/vtt"
            //  3120: astore          14
            //  3122: goto            3597
            //  3125: new             Lbd/t;
            //  3128: dup            
            //  3129: aload           19
            //  3131: aload           19
            //  3133: getfield        ib/d$b.b:Ljava/lang/String;
            //  3136: invokevirtual   ib/d$b.a:(Ljava/lang/String;)[B
            //  3139: invokespecial   bd/t.<init>:([B)V
            //  3142: invokestatic    cd/f.a:(Lbd/t;)Lcd/f;
            //  3145: astore          15
            //  3147: aload           15
            //  3149: getfield        cd/f.a:Ljava/util/List;
            //  3152: astore          14
            //  3154: aload           19
            //  3156: aload           15
            //  3158: getfield        cd/f.b:I
            //  3161: putfield        ib/d$b.Y:I
            //  3164: aload           15
            //  3166: getfield        cd/f.d:Ljava/lang/String;
            //  3169: astore          15
            //  3171: ldc_w           "video/hevc"
            //  3174: astore          16
            //  3176: goto            3681
            //  3179: getstatic       ib/d.c0:[B
            //  3182: aload           19
            //  3184: aload           19
            //  3186: getfield        ib/d$b.b:Ljava/lang/String;
            //  3189: invokevirtual   ib/d$b.a:(Ljava/lang/String;)[B
            //  3192: invokestatic    com/google/common/collect/ImmutableList.of:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
            //  3195: astore          14
            //  3197: ldc_w           "text/x-ssa"
            //  3200: astore          15
            //  3202: goto            3973
            //  3205: aload           19
            //  3207: getfield        ib/d$b.P:I
            //  3210: invokestatic    bd/c0.w:(I)I
            //  3213: istore          4
            //  3215: iload           4
            //  3217: istore_1       
            //  3218: iload           4
            //  3220: ifne            3391
            //  3223: aload           19
            //  3225: getfield        ib/d$b.P:I
            //  3228: istore_1       
            //  3229: new             Ljava/lang/StringBuilder;
            //  3232: dup            
            //  3233: bipush          89
            //  3235: invokespecial   java/lang/StringBuilder.<init>:(I)V
            //  3238: astore          14
            //  3240: aload           14
            //  3242: ldc_w           "Unsupported little endian PCM bit depth: "
            //  3245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  3248: pop            
            //  3249: aload           14
            //  3251: iload_1        
            //  3252: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
            //  3255: pop            
            //  3256: aload           14
            //  3258: ldc_w           ". Setting mimeType to "
            //  3261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  3264: pop            
            //  3265: aload           14
            //  3267: ldc_w           "audio/x-unknown"
            //  3270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  3273: pop            
            //  3274: ldc             "MatroskaExtractor"
            //  3276: aload           14
            //  3278: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //  3281: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
            //  3284: pop            
            //  3285: goto            3601
            //  3288: aload           19
            //  3290: getfield        ib/d$b.P:I
            //  3293: istore_1       
            //  3294: iload_1        
            //  3295: bipush          8
            //  3297: if_icmpne       3305
            //  3300: iconst_3       
            //  3301: istore_1       
            //  3302: goto            3391
            //  3305: iload_1        
            //  3306: bipush          16
            //  3308: if_icmpne       3318
            //  3311: ldc_w           268435456
            //  3314: istore_1       
            //  3315: goto            3391
            //  3318: new             Ljava/lang/StringBuilder;
            //  3321: dup            
            //  3322: bipush          86
            //  3324: invokespecial   java/lang/StringBuilder.<init>:(I)V
            //  3327: astore          14
            //  3329: aload           14
            //  3331: ldc_w           "Unsupported big endian PCM bit depth: "
            //  3334: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  3337: pop            
            //  3338: aload           14
            //  3340: iload_1        
            //  3341: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
            //  3344: pop            
            //  3345: aload           14
            //  3347: ldc_w           ". Setting mimeType to "
            //  3350: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  3353: pop            
            //  3354: aload           14
            //  3356: ldc_w           "audio/x-unknown"
            //  3359: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  3362: pop            
            //  3363: ldc             "MatroskaExtractor"
            //  3365: aload           14
            //  3367: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //  3370: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
            //  3373: pop            
            //  3374: goto            3601
            //  3377: aload           19
            //  3379: getfield        ib/d$b.P:I
            //  3382: istore_1       
            //  3383: iload_1        
            //  3384: bipush          32
            //  3386: if_icmpne       3403
            //  3389: iconst_4       
            //  3390: istore_1       
            //  3391: iconst_m1      
            //  3392: istore          4
            //  3394: aconst_null    
            //  3395: astore          16
            //  3397: aconst_null    
            //  3398: astore          15
            //  3400: goto            4595
            //  3403: new             Ljava/lang/StringBuilder;
            //  3406: dup            
            //  3407: bipush          90
            //  3409: invokespecial   java/lang/StringBuilder.<init>:(I)V
            //  3412: astore          14
            //  3414: aload           14
            //  3416: ldc_w           "Unsupported floating point PCM bit depth: "
            //  3419: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  3422: pop            
            //  3423: aload           14
            //  3425: iload_1        
            //  3426: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
            //  3429: pop            
            //  3430: aload           14
            //  3432: ldc_w           ". Setting mimeType to "
            //  3435: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  3438: pop            
            //  3439: aload           14
            //  3441: ldc_w           "audio/x-unknown"
            //  3444: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  3447: pop            
            //  3448: ldc             "MatroskaExtractor"
            //  3450: aload           14
            //  3452: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //  3455: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
            //  3458: pop            
            //  3459: goto            3601
            //  3462: aload           16
            //  3464: astore          14
            //  3466: goto            3597
            //  3469: ldc_w           "application/pgs"
            //  3472: astore          14
            //  3474: goto            3597
            //  3477: ldc_w           "video/x-vnd.on2.vp9"
            //  3480: astore          14
            //  3482: goto            3597
            //  3485: ldc_w           "video/x-vnd.on2.vp8"
            //  3488: astore          14
            //  3490: goto            3597
            //  3493: ldc_w           "video/av01"
            //  3496: astore          14
            //  3498: goto            3597
            //  3501: ldc_w           "audio/vnd.dts"
            //  3504: astore          14
            //  3506: goto            3597
            //  3509: ldc_w           "audio/ac3"
            //  3512: astore          14
            //  3514: goto            3597
            //  3517: aload           19
            //  3519: aload           19
            //  3521: getfield        ib/d$b.b:Ljava/lang/String;
            //  3524: invokevirtual   ib/d$b.a:(Ljava/lang/String;)[B
            //  3527: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
            //  3530: astore          14
            //  3532: aload           19
            //  3534: getfield        ib/d$b.k:[B
            //  3537: astore          15
            //  3539: new             Lbd/s;
            //  3542: dup            
            //  3543: aload           15
            //  3545: aload           15
            //  3547: arraylength    
            //  3548: invokespecial   bd/s.<init>:([BI)V
            //  3551: iconst_0       
            //  3552: invokestatic    ya/a.d:(Lbd/s;Z)Lya/a$a;
            //  3555: astore          15
            //  3557: aload           19
            //  3559: aload           15
            //  3561: getfield        ya/a$a.a:I
            //  3564: putfield        ib/d$b.Q:I
            //  3567: aload           19
            //  3569: aload           15
            //  3571: getfield        ya/a$a.b:I
            //  3574: putfield        ib/d$b.O:I
            //  3577: aload           15
            //  3579: getfield        ya/a$a.c:Ljava/lang/String;
            //  3582: astore          15
            //  3584: ldc_w           "audio/mp4a-latm"
            //  3587: astore          16
            //  3589: goto            3681
            //  3592: ldc_w           "audio/vnd.dts.hd"
            //  3595: astore          14
            //  3597: aload           14
            //  3599: astore          15
            //  3601: aconst_null    
            //  3602: astore          14
            //  3604: goto            3973
            //  3607: aload           19
            //  3609: aload           19
            //  3611: getfield        ib/d$b.b:Ljava/lang/String;
            //  3614: invokevirtual   ib/d$b.a:(Ljava/lang/String;)[B
            //  3617: invokestatic    com/google/common/collect/ImmutableList.of:(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
            //  3620: astore          14
            //  3622: ldc_w           "application/vobsub"
            //  3625: astore          15
            //  3627: goto            3973
            //  3630: new             Lbd/t;
            //  3633: dup            
            //  3634: aload           19
            //  3636: aload           19
            //  3638: getfield        ib/d$b.b:Ljava/lang/String;
            //  3641: invokevirtual   ib/d$b.a:(Ljava/lang/String;)[B
            //  3644: invokespecial   bd/t.<init>:([B)V
            //  3647: invokestatic    cd/a.a:(Lbd/t;)Lcd/a;
            //  3650: astore          15
            //  3652: aload           15
            //  3654: getfield        cd/a.a:Ljava/util/List;
            //  3657: astore          14
            //  3659: aload           19
            //  3661: aload           15
            //  3663: getfield        cd/a.b:I
            //  3666: putfield        ib/d$b.Y:I
            //  3669: aload           15
            //  3671: getfield        cd/a.f:Ljava/lang/String;
            //  3674: astore          15
            //  3676: ldc_w           "video/avc"
            //  3679: astore          16
            //  3681: aload           16
            //  3683: astore          17
            //  3685: iconst_m1      
            //  3686: istore_1       
            //  3687: aload           14
            //  3689: astore          16
            //  3691: aload           17
            //  3693: astore          14
            //  3695: goto            4510
            //  3698: iconst_4       
            //  3699: newarray        B
            //  3701: astore          14
            //  3703: aload           19
            //  3705: aload           19
            //  3707: getfield        ib/d$b.b:Ljava/lang/String;
            //  3710: invokevirtual   ib/d$b.a:(Ljava/lang/String;)[B
            //  3713: iconst_0       
            //  3714: aload           14
            //  3716: iconst_0       
            //  3717: iconst_4       
            //  3718: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
            //  3721: aload           14
            //  3723: invokestatic    com/google/common/collect/ImmutableList.of:(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
            //  3726: astore          14
            //  3728: ldc_w           "application/dvbsubs"
            //  3731: astore          15
            //  3733: goto            3973
            //  3736: new             Lbd/t;
            //  3739: dup            
            //  3740: aload           19
            //  3742: aload           19
            //  3744: getfield        ib/d$b.b:Ljava/lang/String;
            //  3747: invokevirtual   ib/d$b.a:(Ljava/lang/String;)[B
            //  3750: invokespecial   bd/t.<init>:([B)V
            //  3753: astore          14
            //  3755: aload           14
            //  3757: bipush          16
            //  3759: invokevirtual   bd/t.C:(I)V
            //  3762: aload           14
            //  3764: invokevirtual   bd/t.h:()J
            //  3767: lstore          10
            //  3769: lload           10
            //  3771: ldc2_w          1482049860
            //  3774: lcmp           
            //  3775: ifne            3794
            //  3778: new             Landroid/util/Pair;
            //  3781: dup            
            //  3782: ldc_w           "video/divx"
            //  3785: aconst_null    
            //  3786: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
            //  3789: astore          14
            //  3791: goto            3953
            //  3794: lload           10
            //  3796: ldc2_w          859189832
            //  3799: lcmp           
            //  3800: ifne            3819
            //  3803: new             Landroid/util/Pair;
            //  3806: dup            
            //  3807: ldc_w           "video/3gpp"
            //  3810: aconst_null    
            //  3811: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
            //  3814: astore          14
            //  3816: goto            3953
            //  3819: lload           10
            //  3821: ldc2_w          826496599
            //  3824: lcmp           
            //  3825: ifne            3931
            //  3828: aload           14
            //  3830: getfield        bd/t.b:I
            //  3833: bipush          20
            //  3835: iadd           
            //  3836: istore_1       
            //  3837: aload           14
            //  3839: getfield        bd/t.a:[B
            //  3842: astore          14
            //  3844: iload_1        
            //  3845: aload           14
            //  3847: arraylength    
            //  3848: iconst_4       
            //  3849: isub           
            //  3850: if_icmpge       3923
            //  3853: aload           14
            //  3855: iload_1        
            //  3856: baload         
            //  3857: ifne            3917
            //  3860: aload           14
            //  3862: iload_1        
            //  3863: iconst_1       
            //  3864: iadd           
            //  3865: baload         
            //  3866: ifne            3917
            //  3869: aload           14
            //  3871: iload_1        
            //  3872: iconst_2       
            //  3873: iadd           
            //  3874: baload         
            //  3875: iconst_1       
            //  3876: if_icmpne       3917
            //  3879: aload           14
            //  3881: iload_1        
            //  3882: iconst_3       
            //  3883: iadd           
            //  3884: baload         
            //  3885: bipush          15
            //  3887: if_icmpne       3917
            //  3890: new             Landroid/util/Pair;
            //  3893: dup            
            //  3894: ldc_w           "video/wvc1"
            //  3897: aload           14
            //  3899: iload_1        
            //  3900: aload           14
            //  3902: arraylength    
            //  3903: invokestatic    java/util/Arrays.copyOfRange:([BII)[B
            //  3906: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
            //  3909: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
            //  3912: astore          14
            //  3914: goto            3953
            //  3917: iinc            1, 1
            //  3920: goto            3844
            //  3923: ldc_w           "Failed to find FourCC VC1 initialization data"
            //  3926: aconst_null    
            //  3927: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //  3930: athrow         
            //  3931: ldc             "MatroskaExtractor"
            //  3933: ldc_w           "Unknown FourCC. Setting mimeType to video/x-unknown"
            //  3936: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
            //  3939: pop            
            //  3940: new             Landroid/util/Pair;
            //  3943: dup            
            //  3944: ldc_w           "video/x-unknown"
            //  3947: aconst_null    
            //  3948: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
            //  3951: astore          14
            //  3953: aload           14
            //  3955: getfield        android/util/Pair.first:Ljava/lang/Object;
            //  3958: checkcast       Ljava/lang/String;
            //  3961: astore          15
            //  3963: aload           14
            //  3965: getfield        android/util/Pair.second:Ljava/lang/Object;
            //  3968: checkcast       Ljava/util/List;
            //  3971: astore          14
            //  3973: iconst_m1      
            //  3974: istore_1       
            //  3975: aload           14
            //  3977: astore          16
            //  3979: goto            4016
            //  3982: astore          14
            //  3984: ldc_w           "Error parsing FourCC private data"
            //  3987: aconst_null    
            //  3988: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //  3991: athrow         
            //  3992: ldc_w           "audio/mpeg"
            //  3995: astore          14
            //  3997: goto            4005
            //  4000: ldc_w           "audio/mpeg-L2"
            //  4003: astore          14
            //  4005: sipush          4096
            //  4008: istore_1       
            //  4009: aconst_null    
            //  4010: astore          16
            //  4012: aload           14
            //  4014: astore          15
            //  4016: aload           15
            //  4018: astore          14
            //  4020: goto            4587
            //  4023: sipush          8192
            //  4026: istore          5
            //  4028: aload           19
            //  4030: aload           19
            //  4032: getfield        ib/d$b.b:Ljava/lang/String;
            //  4035: invokevirtual   ib/d$b.a:(Ljava/lang/String;)[B
            //  4038: astore          16
            //  4040: aload           16
            //  4042: iconst_0       
            //  4043: baload         
            //  4044: iconst_2       
            //  4045: if_icmpne       4281
            //  4048: iconst_0       
            //  4049: istore          4
            //  4051: iconst_1       
            //  4052: istore_1       
            //  4053: aload           16
            //  4055: iload_1        
            //  4056: baload         
            //  4057: sipush          255
            //  4060: iand           
            //  4061: istore          6
            //  4063: iload           6
            //  4065: sipush          255
            //  4068: if_icmpne       4083
            //  4071: iinc_w          4, 255
            //  4077: iinc            1, 1
            //  4080: goto            4053
            //  4083: iinc            1, 1
            //  4086: iload           4
            //  4088: iload           6
            //  4090: iadd           
            //  4091: istore          8
            //  4093: iconst_0       
            //  4094: istore          6
            //  4096: iload_1        
            //  4097: istore          4
            //  4099: iload           6
            //  4101: istore_1       
            //  4102: aload           16
            //  4104: iload           4
            //  4106: baload         
            //  4107: sipush          255
            //  4110: iand           
            //  4111: istore          6
            //  4113: iload           6
            //  4115: sipush          255
            //  4118: if_icmpne       4133
            //  4121: iinc_w          1, 255
            //  4127: iinc            4, 1
            //  4130: goto            4102
            //  4133: iinc            4, 1
            //  4136: aload           16
            //  4138: iload           4
            //  4140: baload         
            //  4141: iconst_1       
            //  4142: if_icmpne       4273
            //  4145: iload           8
            //  4147: newarray        B
            //  4149: astore          15
            //  4151: aload           16
            //  4153: iload           4
            //  4155: aload           15
            //  4157: iconst_0       
            //  4158: iload           8
            //  4160: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
            //  4163: iload           4
            //  4165: iload           8
            //  4167: iadd           
            //  4168: istore          4
            //  4170: aload           16
            //  4172: iload           4
            //  4174: baload         
            //  4175: iconst_3       
            //  4176: if_icmpne       4265
            //  4179: iload           4
            //  4181: iload_1        
            //  4182: iload           6
            //  4184: iadd           
            //  4185: iadd           
            //  4186: istore_1       
            //  4187: aload           16
            //  4189: iload_1        
            //  4190: baload         
            //  4191: iconst_5       
            //  4192: if_icmpne       4257
            //  4195: aload           16
            //  4197: arraylength    
            //  4198: iload_1        
            //  4199: isub           
            //  4200: newarray        B
            //  4202: astore          14
            //  4204: aload           16
            //  4206: iload_1        
            //  4207: aload           14
            //  4209: iconst_0       
            //  4210: aload           16
            //  4212: arraylength    
            //  4213: iload_1        
            //  4214: isub           
            //  4215: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
            //  4218: new             Ljava/util/ArrayList;
            //  4221: astore          16
            //  4223: aload           16
            //  4225: iconst_2       
            //  4226: invokespecial   java/util/ArrayList.<init>:(I)V
            //  4229: aload           16
            //  4231: aload           15
            //  4233: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  4236: pop            
            //  4237: aload           16
            //  4239: aload           14
            //  4241: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  4244: pop            
            //  4245: ldc_w           "audio/vorbis"
            //  4248: astore          14
            //  4250: iload           5
            //  4252: istore          4
            //  4254: goto            4590
            //  4257: ldc_w           "Error parsing vorbis codec private"
            //  4260: aconst_null    
            //  4261: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //  4264: athrow         
            //  4265: ldc_w           "Error parsing vorbis codec private"
            //  4268: aconst_null    
            //  4269: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //  4272: athrow         
            //  4273: ldc_w           "Error parsing vorbis codec private"
            //  4276: aconst_null    
            //  4277: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //  4280: athrow         
            //  4281: ldc_w           "Error parsing vorbis codec private"
            //  4284: aconst_null    
            //  4285: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //  4288: athrow         
            //  4289: astore          14
            //  4291: ldc_w           "Error parsing vorbis codec private"
            //  4294: aconst_null    
            //  4295: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //  4298: athrow         
            //  4299: aload           19
            //  4301: new             Ldb/x;
            //  4304: dup            
            //  4305: invokespecial   db/x.<init>:()V
            //  4308: putfield        ib/d$b.T:Ldb/x;
            //  4311: ldc_w           "audio/true-hd"
            //  4314: astore          14
            //  4316: goto            4535
            //  4319: new             Lbd/t;
            //  4322: dup            
            //  4323: aload           19
            //  4325: aload           19
            //  4327: getfield        ib/d$b.b:Ljava/lang/String;
            //  4330: invokevirtual   ib/d$b.a:(Ljava/lang/String;)[B
            //  4333: invokespecial   bd/t.<init>:([B)V
            //  4336: astore          17
            //  4338: aload           17
            //  4340: invokevirtual   bd/t.j:()I
            //  4343: istore_1       
            //  4344: iload_1        
            //  4345: iconst_1       
            //  4346: if_icmpne       4352
            //  4349: goto            4411
            //  4352: iload_1        
            //  4353: ldc_w           65534
            //  4356: if_icmpne       4416
            //  4359: aload           17
            //  4361: bipush          24
            //  4363: invokevirtual   bd/t.B:(I)V
            //  4366: aload           17
            //  4368: invokevirtual   bd/t.k:()J
            //  4371: lstore          10
            //  4373: getstatic       ib/d.f0:Ljava/util/UUID;
            //  4376: astore          16
            //  4378: lload           10
            //  4380: aload           16
            //  4382: invokevirtual   java/util/UUID.getMostSignificantBits:()J
            //  4385: lcmp           
            //  4386: ifne            4416
            //  4389: aload           17
            //  4391: invokevirtual   bd/t.k:()J
            //  4394: lstore          12
            //  4396: aload           16
            //  4398: invokevirtual   java/util/UUID.getLeastSignificantBits:()J
            //  4401: lstore          10
            //  4403: lload           12
            //  4405: lload           10
            //  4407: lcmp           
            //  4408: ifne            4416
            //  4411: iconst_1       
            //  4412: istore_1       
            //  4413: goto            4418
            //  4416: iconst_0       
            //  4417: istore_1       
            //  4418: iload_1        
            //  4419: ifeq            4516
            //  4422: aload           19
            //  4424: getfield        ib/d$b.P:I
            //  4427: invokestatic    bd/c0.w:(I)I
            //  4430: istore_1       
            //  4431: iload_1        
            //  4432: ifne            4504
            //  4435: aload           19
            //  4437: getfield        ib/d$b.P:I
            //  4440: istore_1       
            //  4441: new             Ljava/lang/StringBuilder;
            //  4444: dup            
            //  4445: bipush          75
            //  4447: invokespecial   java/lang/StringBuilder.<init>:(I)V
            //  4450: astore          14
            //  4452: aload           14
            //  4454: ldc_w           "Unsupported PCM bit depth: "
            //  4457: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  4460: pop            
            //  4461: aload           14
            //  4463: iload_1        
            //  4464: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
            //  4467: pop            
            //  4468: aload           14
            //  4470: ldc_w           ". Setting mimeType to "
            //  4473: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  4476: pop            
            //  4477: aload           14
            //  4479: ldc_w           "audio/x-unknown"
            //  4482: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //  4485: pop            
            //  4486: ldc             "MatroskaExtractor"
            //  4488: aload           14
            //  4490: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //  4493: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
            //  4496: pop            
            //  4497: aload           15
            //  4499: astore          14
            //  4501: goto            4535
            //  4504: aconst_null    
            //  4505: astore          15
            //  4507: aconst_null    
            //  4508: astore          16
            //  4510: iconst_m1      
            //  4511: istore          4
            //  4513: goto            4595
            //  4516: ldc             "MatroskaExtractor"
            //  4518: ldc_w           "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            //  4521: ldc_w           "audio/x-unknown"
            //  4524: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
            //  4527: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
            //  4530: pop            
            //  4531: aload           15
            //  4533: astore          14
            //  4535: aconst_null    
            //  4536: astore          15
            //  4538: goto            4581
            //  4541: astore          14
            //  4543: ldc_w           "Error parsing MS/ACM codec private"
            //  4546: aconst_null    
            //  4547: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //  4550: athrow         
            //  4551: aload           19
            //  4553: getfield        ib/d$b.k:[B
            //  4556: astore          14
            //  4558: aload           14
            //  4560: ifnonnull       4569
            //  4563: aconst_null    
            //  4564: astore          15
            //  4566: goto            4576
            //  4569: aload           14
            //  4571: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
            //  4574: astore          15
            //  4576: ldc_w           "video/mp4v-es"
            //  4579: astore          14
            //  4581: iconst_m1      
            //  4582: istore_1       
            //  4583: aload           15
            //  4585: astore          16
            //  4587: iload_1        
            //  4588: istore          4
            //  4590: aconst_null    
            //  4591: astore          15
            //  4593: iconst_m1      
            //  4594: istore_1       
            //  4595: iconst_1       
            //  4596: istore          6
            //  4598: aload           19
            //  4600: getfield        ib/d$b.N:[B
            //  4603: astore          21
            //  4605: aload           14
            //  4607: astore          18
            //  4609: aload           15
            //  4611: astore          17
            //  4613: aload           21
            //  4615: ifnull          4657
            //  4618: new             Lbd/t;
            //  4621: dup            
            //  4622: aload           21
            //  4624: invokespecial   bd/t.<init>:([B)V
            //  4627: invokestatic    cd/c.a:(Lbd/t;)Lcd/c;
            //  4630: astore          21
            //  4632: aload           14
            //  4634: astore          18
            //  4636: aload           15
            //  4638: astore          17
            //  4640: aload           21
            //  4642: ifnull          4657
            //  4645: aload           21
            //  4647: getfield        cd/c.f:Ljava/lang/String;
            //  4650: astore          17
            //  4652: ldc_w           "video/dolby-vision"
            //  4655: astore          18
            //  4657: aload           19
            //  4659: getfield        ib/d$b.V:Z
            //  4662: istore          9
            //  4664: aload           19
            //  4666: getfield        ib/d$b.U:Z
            //  4669: ifeq            4678
            //  4672: iconst_2       
            //  4673: istore          5
            //  4675: goto            4681
            //  4678: iconst_0       
            //  4679: istore          5
            //  4681: new             Lcom/google/android/exoplayer2/n$a;
            //  4684: dup            
            //  4685: invokespecial   com/google/android/exoplayer2/n$a.<init>:()V
            //  4688: astore          15
            //  4690: aload           18
            //  4692: invokestatic    bd/p.k:(Ljava/lang/String;)Z
            //  4695: ifeq            4730
            //  4698: aload           15
            //  4700: aload           19
            //  4702: getfield        ib/d$b.O:I
            //  4705: putfield        com/google/android/exoplayer2/n$a.x:I
            //  4708: aload           15
            //  4710: aload           19
            //  4712: getfield        ib/d$b.Q:I
            //  4715: putfield        com/google/android/exoplayer2/n$a.y:I
            //  4718: aload           15
            //  4720: iload_1        
            //  4721: putfield        com/google/android/exoplayer2/n$a.z:I
            //  4724: iload           6
            //  4726: istore_1       
            //  4727: goto            5605
            //  4730: aload           18
            //  4732: invokestatic    bd/p.m:(Ljava/lang/String;)Z
            //  4735: ifeq            5526
            //  4738: aload           19
            //  4740: getfield        ib/d$b.q:I
            //  4743: ifne            4805
            //  4746: aload           19
            //  4748: getfield        ib/d$b.o:I
            //  4751: istore          6
            //  4753: iload           6
            //  4755: istore_1       
            //  4756: iload           6
            //  4758: iconst_m1      
            //  4759: if_icmpne       4768
            //  4762: aload           19
            //  4764: getfield        ib/d$b.m:I
            //  4767: istore_1       
            //  4768: aload           19
            //  4770: iload_1        
            //  4771: putfield        ib/d$b.o:I
            //  4774: aload           19
            //  4776: getfield        ib/d$b.p:I
            //  4779: istore          6
            //  4781: iload           6
            //  4783: istore_1       
            //  4784: iload           6
            //  4786: iconst_m1      
            //  4787: if_icmpne       4796
            //  4790: aload           19
            //  4792: getfield        ib/d$b.n:I
            //  4795: istore_1       
            //  4796: aload           19
            //  4798: iload_1        
            //  4799: putfield        ib/d$b.p:I
            //  4802: goto            4805
            //  4805: iconst_m1      
            //  4806: istore          6
            //  4808: ldc_w           -1.0
            //  4811: fstore_3       
            //  4812: aload           19
            //  4814: getfield        ib/d$b.o:I
            //  4817: istore          8
            //  4819: fload_3        
            //  4820: fstore_2       
            //  4821: iload           8
            //  4823: iconst_m1      
            //  4824: if_icmpeq       4859
            //  4827: aload           19
            //  4829: getfield        ib/d$b.p:I
            //  4832: istore_1       
            //  4833: fload_3        
            //  4834: fstore_2       
            //  4835: iload_1        
            //  4836: iconst_m1      
            //  4837: if_icmpeq       4859
            //  4840: aload           19
            //  4842: getfield        ib/d$b.n:I
            //  4845: iload           8
            //  4847: imul           
            //  4848: i2f            
            //  4849: aload           19
            //  4851: getfield        ib/d$b.m:I
            //  4854: iload_1        
            //  4855: imul           
            //  4856: i2f            
            //  4857: fdiv           
            //  4858: fstore_2       
            //  4859: aload           19
            //  4861: getfield        ib/d$b.x:Z
            //  4864: ifeq            5277
            //  4867: aload           19
            //  4869: getfield        ib/d$b.D:F
            //  4872: ldc_w           -1.0
            //  4875: fcmpl          
            //  4876: ifeq            5245
            //  4879: aload           19
            //  4881: getfield        ib/d$b.E:F
            //  4884: ldc_w           -1.0
            //  4887: fcmpl          
            //  4888: ifeq            5245
            //  4891: aload           19
            //  4893: getfield        ib/d$b.F:F
            //  4896: ldc_w           -1.0
            //  4899: fcmpl          
            //  4900: ifeq            5245
            //  4903: aload           19
            //  4905: getfield        ib/d$b.G:F
            //  4908: ldc_w           -1.0
            //  4911: fcmpl          
            //  4912: ifeq            5245
            //  4915: aload           19
            //  4917: getfield        ib/d$b.H:F
            //  4920: ldc_w           -1.0
            //  4923: fcmpl          
            //  4924: ifeq            5245
            //  4927: aload           19
            //  4929: getfield        ib/d$b.I:F
            //  4932: ldc_w           -1.0
            //  4935: fcmpl          
            //  4936: ifeq            5245
            //  4939: aload           19
            //  4941: getfield        ib/d$b.J:F
            //  4944: ldc_w           -1.0
            //  4947: fcmpl          
            //  4948: ifeq            5245
            //  4951: aload           19
            //  4953: getfield        ib/d$b.K:F
            //  4956: ldc_w           -1.0
            //  4959: fcmpl          
            //  4960: ifeq            5245
            //  4963: aload           19
            //  4965: getfield        ib/d$b.L:F
            //  4968: ldc_w           -1.0
            //  4971: fcmpl          
            //  4972: ifeq            5245
            //  4975: aload           19
            //  4977: getfield        ib/d$b.M:F
            //  4980: ldc_w           -1.0
            //  4983: fcmpl          
            //  4984: ifne            4990
            //  4987: goto            5245
            //  4990: bipush          25
            //  4992: newarray        B
            //  4994: astore          14
            //  4996: aload           14
            //  4998: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
            //  5001: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
            //  5004: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
            //  5007: astore          21
            //  5009: aload           21
            //  5011: iconst_0       
            //  5012: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
            //  5015: pop            
            //  5016: aload           21
            //  5018: aload           19
            //  5020: getfield        ib/d$b.D:F
            //  5023: ldc_w           50000.0
            //  5026: fmul           
            //  5027: ldc_w           0.5
            //  5030: fadd           
            //  5031: f2i            
            //  5032: i2s            
            //  5033: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5036: pop            
            //  5037: aload           21
            //  5039: aload           19
            //  5041: getfield        ib/d$b.E:F
            //  5044: ldc_w           50000.0
            //  5047: fmul           
            //  5048: ldc_w           0.5
            //  5051: fadd           
            //  5052: f2i            
            //  5053: i2s            
            //  5054: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5057: pop            
            //  5058: aload           21
            //  5060: aload           19
            //  5062: getfield        ib/d$b.F:F
            //  5065: ldc_w           50000.0
            //  5068: fmul           
            //  5069: ldc_w           0.5
            //  5072: fadd           
            //  5073: f2i            
            //  5074: i2s            
            //  5075: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5078: pop            
            //  5079: aload           21
            //  5081: aload           19
            //  5083: getfield        ib/d$b.G:F
            //  5086: ldc_w           50000.0
            //  5089: fmul           
            //  5090: ldc_w           0.5
            //  5093: fadd           
            //  5094: f2i            
            //  5095: i2s            
            //  5096: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5099: pop            
            //  5100: aload           21
            //  5102: aload           19
            //  5104: getfield        ib/d$b.H:F
            //  5107: ldc_w           50000.0
            //  5110: fmul           
            //  5111: ldc_w           0.5
            //  5114: fadd           
            //  5115: f2i            
            //  5116: i2s            
            //  5117: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5120: pop            
            //  5121: aload           21
            //  5123: aload           19
            //  5125: getfield        ib/d$b.I:F
            //  5128: ldc_w           50000.0
            //  5131: fmul           
            //  5132: ldc_w           0.5
            //  5135: fadd           
            //  5136: f2i            
            //  5137: i2s            
            //  5138: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5141: pop            
            //  5142: aload           21
            //  5144: aload           19
            //  5146: getfield        ib/d$b.J:F
            //  5149: ldc_w           50000.0
            //  5152: fmul           
            //  5153: ldc_w           0.5
            //  5156: fadd           
            //  5157: f2i            
            //  5158: i2s            
            //  5159: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5162: pop            
            //  5163: aload           21
            //  5165: aload           19
            //  5167: getfield        ib/d$b.K:F
            //  5170: ldc_w           50000.0
            //  5173: fmul           
            //  5174: ldc_w           0.5
            //  5177: fadd           
            //  5178: f2i            
            //  5179: i2s            
            //  5180: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5183: pop            
            //  5184: aload           21
            //  5186: aload           19
            //  5188: getfield        ib/d$b.L:F
            //  5191: ldc_w           0.5
            //  5194: fadd           
            //  5195: f2i            
            //  5196: i2s            
            //  5197: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5200: pop            
            //  5201: aload           21
            //  5203: aload           19
            //  5205: getfield        ib/d$b.M:F
            //  5208: ldc_w           0.5
            //  5211: fadd           
            //  5212: f2i            
            //  5213: i2s            
            //  5214: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5217: pop            
            //  5218: aload           21
            //  5220: aload           19
            //  5222: getfield        ib/d$b.B:I
            //  5225: i2s            
            //  5226: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5229: pop            
            //  5230: aload           21
            //  5232: aload           19
            //  5234: getfield        ib/d$b.C:I
            //  5237: i2s            
            //  5238: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
            //  5241: pop            
            //  5242: goto            5248
            //  5245: aconst_null    
            //  5246: astore          14
            //  5248: new             Lcd/b;
            //  5251: dup            
            //  5252: aload           19
            //  5254: getfield        ib/d$b.y:I
            //  5257: aload           19
            //  5259: getfield        ib/d$b.A:I
            //  5262: aload           19
            //  5264: getfield        ib/d$b.z:I
            //  5267: aload           14
            //  5269: invokespecial   cd/b.<init>:(III[B)V
            //  5272: astore          14
            //  5274: goto            5280
            //  5277: aconst_null    
            //  5278: astore          14
            //  5280: aload           19
            //  5282: getfield        ib/d$b.a:Ljava/lang/String;
            //  5285: astore          23
            //  5287: iload           6
            //  5289: istore_1       
            //  5290: aload           23
            //  5292: ifnull          5334
            //  5295: getstatic       ib/d.g0:Ljava/util/Map;
            //  5298: astore          21
            //  5300: iload           6
            //  5302: istore_1       
            //  5303: aload           21
            //  5305: aload           23
            //  5307: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
            //  5312: ifeq            5334
            //  5315: aload           21
            //  5317: aload           19
            //  5319: getfield        ib/d$b.a:Ljava/lang/String;
            //  5322: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //  5327: checkcast       Ljava/lang/Integer;
            //  5330: invokevirtual   java/lang/Integer.intValue:()I
            //  5333: istore_1       
            //  5334: aload           19
            //  5336: getfield        ib/d$b.r:I
            //  5339: ifne            5462
            //  5342: aload           19
            //  5344: getfield        ib/d$b.s:F
            //  5347: fconst_0       
            //  5348: invokestatic    java/lang/Float.compare:(FF)I
            //  5351: ifne            5462
            //  5354: aload           19
            //  5356: getfield        ib/d$b.t:F
            //  5359: fconst_0       
            //  5360: invokestatic    java/lang/Float.compare:(FF)I
            //  5363: ifne            5462
            //  5366: aload           19
            //  5368: getfield        ib/d$b.u:F
            //  5371: fconst_0       
            //  5372: invokestatic    java/lang/Float.compare:(FF)I
            //  5375: ifne            5383
            //  5378: iconst_0       
            //  5379: istore_1       
            //  5380: goto            5462
            //  5383: aload           19
            //  5385: getfield        ib/d$b.t:F
            //  5388: ldc_w           90.0
            //  5391: invokestatic    java/lang/Float.compare:(FF)I
            //  5394: ifne            5403
            //  5397: bipush          90
            //  5399: istore_1       
            //  5400: goto            5462
            //  5403: aload           19
            //  5405: getfield        ib/d$b.t:F
            //  5408: ldc_w           -180.0
            //  5411: invokestatic    java/lang/Float.compare:(FF)I
            //  5414: ifeq            5455
            //  5417: aload           19
            //  5419: getfield        ib/d$b.t:F
            //  5422: ldc_w           180.0
            //  5425: invokestatic    java/lang/Float.compare:(FF)I
            //  5428: ifne            5434
            //  5431: goto            5455
            //  5434: aload           19
            //  5436: getfield        ib/d$b.t:F
            //  5439: ldc_w           -90.0
            //  5442: invokestatic    java/lang/Float.compare:(FF)I
            //  5445: ifne            5462
            //  5448: sipush          270
            //  5451: istore_1       
            //  5452: goto            5462
            //  5455: sipush          180
            //  5458: istore_1       
            //  5459: goto            5462
            //  5462: aload           15
            //  5464: aload           19
            //  5466: getfield        ib/d$b.m:I
            //  5469: putfield        com/google/android/exoplayer2/n$a.p:I
            //  5472: aload           15
            //  5474: aload           19
            //  5476: getfield        ib/d$b.n:I
            //  5479: putfield        com/google/android/exoplayer2/n$a.q:I
            //  5482: aload           15
            //  5484: fload_2        
            //  5485: putfield        com/google/android/exoplayer2/n$a.t:F
            //  5488: aload           15
            //  5490: iload_1        
            //  5491: putfield        com/google/android/exoplayer2/n$a.s:I
            //  5494: aload           15
            //  5496: aload           19
            //  5498: getfield        ib/d$b.v:[B
            //  5501: putfield        com/google/android/exoplayer2/n$a.u:[B
            //  5504: aload           15
            //  5506: aload           19
            //  5508: getfield        ib/d$b.w:I
            //  5511: putfield        com/google/android/exoplayer2/n$a.v:I
            //  5514: aload           15
            //  5516: aload           14
            //  5518: putfield        com/google/android/exoplayer2/n$a.w:Lcd/b;
            //  5521: iconst_2       
            //  5522: istore_1       
            //  5523: goto            5605
            //  5526: ldc_w           "application/x-subrip"
            //  5529: aload           18
            //  5531: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  5534: ifne            5603
            //  5537: ldc_w           "text/x-ssa"
            //  5540: aload           18
            //  5542: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  5545: ifne            5603
            //  5548: ldc_w           "text/vtt"
            //  5551: aload           18
            //  5553: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  5556: ifne            5603
            //  5559: ldc_w           "application/vobsub"
            //  5562: aload           18
            //  5564: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  5567: ifne            5603
            //  5570: ldc_w           "application/pgs"
            //  5573: aload           18
            //  5575: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  5578: ifne            5603
            //  5581: ldc_w           "application/dvbsubs"
            //  5584: aload           18
            //  5586: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  5589: ifeq            5595
            //  5592: goto            5603
            //  5595: ldc_w           "Unexpected MIME type."
            //  5598: aconst_null    
            //  5599: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //  5602: athrow         
            //  5603: iconst_3       
            //  5604: istore_1       
            //  5605: aload           19
            //  5607: getfield        ib/d$b.a:Ljava/lang/String;
            //  5610: astore          14
            //  5612: aload           14
            //  5614: ifnull          5640
            //  5617: getstatic       ib/d.g0:Ljava/util/Map;
            //  5620: aload           14
            //  5622: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
            //  5627: ifne            5640
            //  5630: aload           15
            //  5632: aload           19
            //  5634: getfield        ib/d$b.a:Ljava/lang/String;
            //  5637: putfield        com/google/android/exoplayer2/n$a.b:Ljava/lang/String;
            //  5640: aload           15
            //  5642: iload           7
            //  5644: invokevirtual   com/google/android/exoplayer2/n$a.b:(I)V
            //  5647: aload           15
            //  5649: aload           18
            //  5651: putfield        com/google/android/exoplayer2/n$a.k:Ljava/lang/String;
            //  5654: aload           15
            //  5656: iload           4
            //  5658: putfield        com/google/android/exoplayer2/n$a.l:I
            //  5661: aload           15
            //  5663: aload           19
            //  5665: getfield        ib/d$b.W:Ljava/lang/String;
            //  5668: putfield        com/google/android/exoplayer2/n$a.c:Ljava/lang/String;
            //  5671: aload           15
            //  5673: iload           9
            //  5675: iconst_0       
            //  5676: ior            
            //  5677: iload           5
            //  5679: ior            
            //  5680: putfield        com/google/android/exoplayer2/n$a.d:I
            //  5683: aload           15
            //  5685: aload           16
            //  5687: putfield        com/google/android/exoplayer2/n$a.m:Ljava/util/List;
            //  5690: aload           15
            //  5692: aload           17
            //  5694: putfield        com/google/android/exoplayer2/n$a.h:Ljava/lang/String;
            //  5697: aload           15
            //  5699: aload           19
            //  5701: getfield        ib/d$b.l:Lcom/google/android/exoplayer2/drm/b;
            //  5704: putfield        com/google/android/exoplayer2/n$a.n:Lcom/google/android/exoplayer2/drm/b;
            //  5707: new             Lcom/google/android/exoplayer2/n;
            //  5710: dup            
            //  5711: aload           15
            //  5713: invokespecial   com/google/android/exoplayer2/n.<init>:(Lcom/google/android/exoplayer2/n$a;)V
            //  5716: astore          14
            //  5718: aload           20
            //  5720: aload           19
            //  5722: getfield        ib/d$b.c:I
            //  5725: iload_1        
            //  5726: invokeinterface db/j.k:(II)Ldb/w;
            //  5731: astore          15
            //  5733: aload           19
            //  5735: aload           15
            //  5737: putfield        ib/d$b.X:Ldb/w;
            //  5740: aload           15
            //  5742: aload           14
            //  5744: invokeinterface db/w.a:(Lcom/google/android/exoplayer2/n;)V
            //  5749: aload           22
            //  5751: getfield        ib/d.c:Landroid/util/SparseArray;
            //  5754: aload           19
            //  5756: getfield        ib/d$b.c:I
            //  5759: aload           19
            //  5761: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
            //  5764: goto            5767
            //  5767: aload           22
            //  5769: aconst_null    
            //  5770: putfield        ib/d.u:Lib/d$b;
            //  5773: goto            5968
            //  5776: ldc_w           "CodecId is missing in TrackEntry element"
            //  5779: aconst_null    
            //  5780: invokestatic    com/google/android/exoplayer2/ParserException.createForMalformedContainer:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
            //  5783: athrow         
            //  5784: aload           22
            //  5786: getfield        ib/d.G:I
            //  5789: iconst_2       
            //  5790: if_icmpeq       5796
            //  5793: goto            5968
            //  5796: iconst_0       
            //  5797: istore          4
            //  5799: iconst_0       
            //  5800: istore_1       
            //  5801: iload           4
            //  5803: aload           22
            //  5805: getfield        ib/d.K:I
            //  5808: if_icmpge       5828
            //  5811: iload_1        
            //  5812: aload           22
            //  5814: getfield        ib/d.L:[I
            //  5817: iload           4
            //  5819: iaload         
            //  5820: iadd           
            //  5821: istore_1       
            //  5822: iinc            4, 1
            //  5825: goto            5801
            //  5828: aload           22
            //  5830: getfield        ib/d.c:Landroid/util/SparseArray;
            //  5833: aload           22
            //  5835: getfield        ib/d.M:I
            //  5838: invokevirtual   android/util/SparseArray.get:(I)Ljava/lang/Object;
            //  5841: checkcast       Lib/d$b;
            //  5844: astore          14
            //  5846: aload           14
            //  5848: getfield        ib/d$b.X:Ldb/w;
            //  5851: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //  5854: pop            
            //  5855: iconst_0       
            //  5856: istore          4
            //  5858: iload           4
            //  5860: aload           22
            //  5862: getfield        ib/d.K:I
            //  5865: if_icmpge       5962
            //  5868: aload           22
            //  5870: getfield        ib/d.H:J
            //  5873: lstore          12
            //  5875: aload           14
            //  5877: getfield        ib/d$b.e:I
            //  5880: iload           4
            //  5882: imul           
            //  5883: sipush          1000
            //  5886: idiv           
            //  5887: i2l            
            //  5888: lstore          10
            //  5890: aload           22
            //  5892: getfield        ib/d.O:I
            //  5895: istore          6
            //  5897: iload           6
            //  5899: istore          5
            //  5901: iload           4
            //  5903: ifne            5924
            //  5906: iload           6
            //  5908: istore          5
            //  5910: aload           22
            //  5912: getfield        ib/d.Q:Z
            //  5915: ifne            5924
            //  5918: iload           6
            //  5920: iconst_1       
            //  5921: ior            
            //  5922: istore          5
            //  5924: aload           22
            //  5926: getfield        ib/d.L:[I
            //  5929: iload           4
            //  5931: iaload         
            //  5932: istore          6
            //  5934: iload_1        
            //  5935: iload           6
            //  5937: isub           
            //  5938: istore_1       
            //  5939: aload           22
            //  5941: aload           14
            //  5943: lload           12
            //  5945: lload           10
            //  5947: ladd           
            //  5948: iload           5
            //  5950: iload           6
            //  5952: iload_1        
            //  5953: invokevirtual   ib/d.e:(Lib/d$b;JIII)V
            //  5956: iinc            4, 1
            //  5959: goto            5858
            //  5962: aload           22
            //  5964: iconst_0       
            //  5965: putfield        ib/d.G:I
            //  5968: return         
            //  5969: astore          14
            //  5971: goto            4291
            //    Exceptions:
            //  throws com.google.android.exoplayer2.ParserException
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                      
            //  -----  -----  -----  -----  ------------------------------------------
            //  3755   3769   3982   3992   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  3778   3791   3982   3992   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  3803   3816   3982   3992   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  3828   3844   3982   3992   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  3844   3853   3982   3992   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  3890   3914   3982   3992   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  3923   3931   3982   3992   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  4145   4163   4289   4291   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  4195   4245   4289   4291   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  4257   4265   5969   5974   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  4265   4273   5969   5974   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  4273   4281   5969   5974   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  4281   4289   5969   5974   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  4338   4344   4541   4551   Ljava/lang/ArrayIndexOutOfBoundsException;
            //  4359   4403   4541   4551   Ljava/lang/ArrayIndexOutOfBoundsException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_4257:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
    }
}
