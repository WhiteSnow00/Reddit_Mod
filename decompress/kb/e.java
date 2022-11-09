// 
// Decompiled by Procyon v0.6.0
// 

package kb;

import db.u$b;
import db.u;
import db.w$a;
import zc.f;
import db.t;
import bd.c0;
import bd.d0;
import db.q;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import com.google.android.exoplayer2.ParserException;
import java.util.UUID;
import android.util.Log;
import com.google.android.exoplayer2.drm.b$b;
import com.google.android.exoplayer2.drm.b;
import java.util.ArrayList;
import bd.p;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import java.util.ArrayDeque;
import sb.c;
import bd.a0;
import bd.s;
import android.util.SparseArray;
import java.util.List;
import db.w;
import db.j;
import com.google.android.exoplayer2.n;
import db.h;

public final class e implements h
{
    public static final byte[] I;
    public static final n J;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public j E;
    public w[] F;
    public w[] G;
    public boolean H;
    public final int a;
    public final l b;
    public final List<n> c;
    public final SparseArray<b> d;
    public final s e;
    public final s f;
    public final s g;
    public final byte[] h;
    public final s i;
    public final a0 j;
    public final c k;
    public final s l;
    public final ArrayDeque<kb.a.a> m;
    public final ArrayDeque<a> n;
    public final w o;
    public int p;
    public int q;
    public long r;
    public int s;
    public s t;
    public long u;
    public int v;
    public long w;
    public long x;
    public long y;
    public b z;
    
    static {
        I = new byte[] { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
        final n$a n$a = new n$a();
        n$a.k = "application/x-emsg";
        J = n$a.a();
    }
    
    public e(final int n) {
        this(0, null, null, Collections.emptyList());
    }
    
    public e(final int n, final a0 a0, final l l, final List<n> list) {
        this(n, a0, l, list, null);
    }
    
    public e(final int a, final a0 j, final l b, final List<n> list, final w o) {
        this.a = a;
        this.j = j;
        this.b = b;
        this.c = Collections.unmodifiableList((List<? extends n>)list);
        this.o = o;
        this.k = new c();
        this.l = new s(16);
        this.e = new s(bd.p.a);
        this.f = new s(5);
        this.g = new s();
        final byte[] h = new byte[16];
        this.h = h;
        this.i = new s(h);
        this.m = new ArrayDeque<kb.a.a>();
        this.n = new ArrayDeque<a>();
        this.d = (SparseArray<b>)new SparseArray();
        this.x = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.E = (j)db.j.I2;
        this.F = new w[0];
        this.G = new w[0];
    }
    
    public static com.google.android.exoplayer2.drm.b b(final ArrayList list) {
        final int size = list.size();
        final com.google.android.exoplayer2.drm.b b = null;
        List<b$b> list2 = null;
        List<b$b> list3;
        for (int i = 0; i < size; ++i, list2 = list3) {
            final kb.a.b b2 = list.get(i);
            list3 = list2;
            if (b2.a == 1886614376) {
                if ((list3 = list2) == null) {
                    list3 = new ArrayList<b$b>();
                }
                final byte[] a = b2.b.a;
                final i.a b3 = i.b(a);
                UUID a2;
                if (b3 == null) {
                    a2 = null;
                }
                else {
                    a2 = b3.a;
                }
                if (a2 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
                else {
                    ((ArrayList<b$b>)list3).add(new b$b(a2, (String)null, "video/mp4", a));
                }
            }
        }
        com.google.android.exoplayer2.drm.b b4;
        if (list2 == null) {
            b4 = b;
        }
        else {
            b4 = new com.google.android.exoplayer2.drm.b((String)null, false, (b$b[])list2.toArray(new b$b[0]));
        }
        return b4;
    }
    
    public static void d(final s s, int n, final kb.n n2) throws ParserException {
        s.B(n + 8);
        n = (s.c() & 0xFFFFFF);
        if ((n & 0x1) != 0x0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        final boolean b = (n & 0x2) != 0x0;
        n = s.u();
        if (n == 0) {
            Arrays.fill(n2.l, 0, n2.e, false);
            return;
        }
        final int e = n2.e;
        if (n == e) {
            Arrays.fill(n2.l, 0, n, b);
            n = s.c;
            n2.n.y(n - s.b);
            n2.k = true;
            n2.o = true;
            final s n3 = n2.n;
            s.b(0, n3.c, n3.a);
            n2.n.B(0);
            n2.o = false;
            return;
        }
        final StringBuilder sb = new StringBuilder(80);
        sb.append("Senc sample count ");
        sb.append(n);
        sb.append(" is different from fragment sample count");
        sb.append(e);
        throw ParserException.createForMalformedContainer(sb.toString(), (Throwable)null);
    }
    
    public final void a(final long n, final long w) {
        for (int size = this.d.size(), i = 0; i < size; ++i) {
            ((b)this.d.valueAt(i)).d();
        }
        this.n.clear();
        this.v = 0;
        this.w = w;
        this.m.clear();
        this.p = 0;
        this.s = 0;
    }
    
    public final boolean c(final db.i i) throws IOException {
        return kb.k.a(i, true, false);
    }
    
    public final void e(final long n) throws ParserException {
        e e2;
        e e;
        e e4;
        for (e = (e2 = this); !e2.m.isEmpty() && e2.m.peek().b == n; e2 = e4) {
            final kb.a.a a = e2.m.pop();
            final int a2 = a.a;
            if (a2 == 1836019574) {
                if (e2.b != null) {
                    throw new IllegalStateException("Unexpected moov box.");
                }
                final com.google.android.exoplayer2.drm.b b = b(a.c);
                final kb.a.a b2 = a.b(1836475768);
                b2.getClass();
                final SparseArray sparseArray = new SparseArray();
                final int size = b2.c.size();
                long n2 = -9223372036854775807L;
                for (int i = 0; i < size; ++i) {
                    final kb.a.b b3 = b2.c.get(i);
                    final int a3 = b3.a;
                    if (a3 == 1953654136) {
                        final s b4 = b3.b;
                        b4.B(12);
                        final Pair create = Pair.create((Object)b4.c(), (Object)new kb.c(b4.c() - 1, b4.c(), b4.c(), b4.c()));
                        sparseArray.put((int)create.first, (Object)create.second);
                    }
                    else if (a3 == 1835362404) {
                        final s b5 = b3.b;
                        b5.B(8);
                        if ((b5.c() >> 24 & 0xFF) == 0x0) {
                            n2 = b5.s();
                        }
                        else {
                            n2 = b5.v();
                        }
                    }
                }
                final ArrayList f = kb.b.f(a, new q(), n2, b, (e2.a & 0x10) != 0x0, false, (tg.c)new d(e2));
                final int size2 = f.size();
                if (e2.d.size() == 0) {
                    for (int j = 0; j < size2; ++j) {
                        final o o = f.get(j);
                        final l a4 = o.a;
                        final w k = e2.E.k(j, a4.b);
                        final int a5 = a4.a;
                        kb.c c;
                        if (sparseArray.size() == 1) {
                            c = (kb.c)sparseArray.valueAt(0);
                        }
                        else {
                            c = (kb.c)sparseArray.get(a5);
                            c.getClass();
                        }
                        e2.d.put(a4.a, (Object)new b(k, o, c));
                        e2.x = Math.max(e2.x, a4.e);
                    }
                    e2.E.b();
                }
                else {
                    d0.f(e2.d.size() == size2);
                    for (int l = 0; l < size2; ++l) {
                        final o d = f.get(l);
                        final l a6 = d.a;
                        final b b6 = (b)e2.d.get(a6.a);
                        final int a7 = a6.a;
                        kb.c e3;
                        if (sparseArray.size() == 1) {
                            e3 = (kb.c)sparseArray.valueAt(0);
                        }
                        else {
                            e3 = (kb.c)sparseArray.get(a7);
                            e3.getClass();
                        }
                        b6.d = d;
                        b6.e = e3;
                        b6.a.a(d.a.f);
                        b6.d();
                    }
                }
                e4 = e2;
            }
            else if (a2 == 1836019558) {
                final SparseArray<b> d2 = e2.d;
                int n3;
                if (e2.b != null) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                int a8 = e2.a;
                byte[] h = e2.h;
                int size3 = a.d.size();
                int n4 = 0;
                kb.a.a a9 = a;
                while (n4 < size3) {
                    final kb.a.a a10 = a9.d.get(n4);
                    int n21 = 0;
                    byte[] array5 = null;
                    int n28 = 0;
                    kb.a.a a18 = null;
                    int n29 = 0;
                    Label_3376: {
                        if (a10.a == 1953653094) {
                            final kb.a.b c2 = a10.c(1952868452);
                            c2.getClass();
                            final s b7 = c2.b;
                            b7.B(8);
                            final int n5 = b7.c() & 0xFFFFFF;
                            final int c3 = b7.c();
                            Object o2;
                            if (n3 != 0) {
                                o2 = d2.valueAt(0);
                            }
                            else {
                                o2 = d2.get(c3);
                            }
                            b b8 = (b)o2;
                            if (b8 == null) {
                                b8 = null;
                            }
                            else {
                                if ((n5 & 0x1) != 0x0) {
                                    final long v = b7.v();
                                    final kb.n b9 = b8.b;
                                    b9.b = v;
                                    b9.c = v;
                                }
                                final kb.c e5 = b8.e;
                                int a11;
                                if ((n5 & 0x2) != 0x0) {
                                    a11 = b7.c() - 1;
                                }
                                else {
                                    a11 = e5.a;
                                }
                                int n6;
                                if ((n5 & 0x8) != 0x0) {
                                    n6 = b7.c();
                                }
                                else {
                                    n6 = e5.b;
                                }
                                int n7;
                                if ((n5 & 0x10) != 0x0) {
                                    n7 = b7.c();
                                }
                                else {
                                    n7 = e5.c;
                                }
                                int n8;
                                if ((n5 & 0x20) != 0x0) {
                                    n8 = b7.c();
                                }
                                else {
                                    n8 = e5.d;
                                }
                                b8.b.a = new kb.c(a11, n6, n7, n8);
                            }
                            if (b8 != null) {
                                final kb.n b10 = b8.b;
                                final long p = b10.p;
                                final boolean q = b10.q;
                                b8.d();
                                b8.l = true;
                                final kb.a.b c4 = a10.c(1952867444);
                                if (c4 != null && (a8 & 0x2) == 0x0) {
                                    final s b11 = c4.b;
                                    b11.B(8);
                                    long p2;
                                    if ((b11.c() >> 24 & 0xFF) == 0x1) {
                                        p2 = b11.v();
                                    }
                                    else {
                                        p2 = b11.s();
                                    }
                                    b10.p = p2;
                                    b10.q = true;
                                }
                                else {
                                    b10.p = p;
                                    b10.q = q;
                                }
                                final ArrayList c5 = a10.c;
                                final int size4 = c5.size();
                                int n9 = 0;
                                int d3 = 0;
                                int e6 = 0;
                                while (n9 < size4) {
                                    final kb.a.b b12 = (kb.a.b)c5.get(n9);
                                    int n10 = d3;
                                    int n11 = e6;
                                    if (b12.a == 1953658222) {
                                        final s b13 = b12.b;
                                        b13.B(12);
                                        final int u = b13.u();
                                        n10 = d3;
                                        n11 = e6;
                                        if (u > 0) {
                                            n11 = e6 + u;
                                            n10 = d3 + 1;
                                        }
                                    }
                                    ++n9;
                                    d3 = n10;
                                    e6 = n11;
                                }
                                final int n12 = size3;
                                final int n13 = n3;
                                b8.h = 0;
                                b8.g = 0;
                                b8.f = 0;
                                final kb.n b14 = b8.b;
                                b14.d = d3;
                                b14.e = e6;
                                if (b14.g.length < d3) {
                                    b14.f = new long[d3];
                                    b14.g = new int[d3];
                                }
                                if (b14.h.length < e6) {
                                    final int n14 = e6 * 125 / 100;
                                    b14.h = new int[n14];
                                    b14.i = new long[n14];
                                    b14.j = new boolean[n14];
                                    b14.l = new boolean[n14];
                                }
                                int n15 = 0;
                                int n16 = 0;
                                int n17 = 0;
                                final kb.a.a a12 = a10;
                                final kb.n n18 = b10;
                                while (true) {
                                    final long n19 = 0L;
                                    if (n15 >= size4) {
                                        final int n20 = a8;
                                        final kb.a.a a13 = a9;
                                        n21 = n4;
                                        final l a14 = b8.d.a;
                                        final kb.c a15 = n18.a;
                                        a15.getClass();
                                        final int a16 = a15.a;
                                        final m[] m = a14.k;
                                        m m2;
                                        if (m == null) {
                                            m2 = null;
                                        }
                                        else {
                                            m2 = m[a16];
                                        }
                                        final kb.a.b c6 = a12.c(1935763834);
                                        if (c6 != null) {
                                            m2.getClass();
                                            final s b15 = c6.b;
                                            final int d4 = m2.d;
                                            b15.B(8);
                                            if ((b15.c() & 0xFFFFFF & 0x1) == 0x1) {
                                                b15.C(8);
                                            }
                                            final int r = b15.r();
                                            final int u2 = b15.u();
                                            final int e7 = n18.e;
                                            if (u2 > e7) {
                                                final StringBuilder sb = new StringBuilder(78);
                                                sb.append("Saiz sample count ");
                                                sb.append(u2);
                                                sb.append(" is greater than fragment sample count");
                                                sb.append(e7);
                                                throw ParserException.createForMalformedContainer(sb.toString(), (Throwable)null);
                                            }
                                            int n23;
                                            if (r == 0) {
                                                final boolean[] l2 = n18.l;
                                                int n22 = 0;
                                                n23 = 0;
                                                while (n22 < u2) {
                                                    final int r2 = b15.r();
                                                    n23 += r2;
                                                    l2[n22] = (r2 > d4);
                                                    ++n22;
                                                }
                                            }
                                            else {
                                                final boolean b16 = r > d4;
                                                n23 = r * u2 + 0;
                                                Arrays.fill(n18.l, 0, u2, b16);
                                            }
                                            Arrays.fill(n18.l, u2, n18.e, false);
                                            if (n23 > 0) {
                                                n18.n.y(n23);
                                                n18.k = true;
                                                n18.o = true;
                                            }
                                        }
                                        final kb.a.b c7 = a12.c(1935763823);
                                        if (c7 != null) {
                                            final s b17 = c7.b;
                                            b17.B(8);
                                            final int c8 = b17.c();
                                            if ((0xFFFFFF & c8 & 0x1) == 0x1) {
                                                b17.C(8);
                                            }
                                            final int u3 = b17.u();
                                            if (u3 != 1) {
                                                final StringBuilder sb2 = new StringBuilder(40);
                                                sb2.append("Unexpected saio entry count: ");
                                                sb2.append(u3);
                                                throw ParserException.createForMalformedContainer(sb2.toString(), (Throwable)null);
                                            }
                                            final long c9 = n18.c;
                                            long n24;
                                            if ((c8 >> 24 & 0xFF) == 0x0) {
                                                n24 = b17.s();
                                            }
                                            else {
                                                n24 = b17.v();
                                            }
                                            n18.c = c9 + n24;
                                        }
                                        final kb.a.b c10 = a12.c(1936027235);
                                        if (c10 != null) {
                                            d(c10.b, 0, n18);
                                        }
                                        String b18;
                                        if (m2 != null) {
                                            b18 = m2.b;
                                        }
                                        else {
                                            b18 = null;
                                        }
                                        s s2;
                                        s s = s2 = null;
                                        s s3;
                                        s s4;
                                        for (int n25 = 0; n25 < a12.c.size(); ++n25, s = s3, s2 = s4) {
                                            final kb.a.b b19 = a12.c.get(n25);
                                            final s b20 = b19.b;
                                            final int a17 = b19.a;
                                            if (a17 == 1935828848) {
                                                b20.B(12);
                                                s3 = s;
                                                s4 = s2;
                                                if (b20.c() == 1936025959) {
                                                    s3 = s;
                                                    s4 = b20;
                                                }
                                            }
                                            else {
                                                s3 = s;
                                                s4 = s2;
                                                if (a17 == 1936158820) {
                                                    b20.B(12);
                                                    s3 = s;
                                                    s4 = s2;
                                                    if (b20.c() == 1936025959) {
                                                        s3 = b20;
                                                        s4 = s2;
                                                    }
                                                }
                                            }
                                        }
                                        if (s2 != null) {
                                            if (s != null) {
                                                s2.B(8);
                                                final int c11 = s2.c();
                                                s2.C(4);
                                                if ((c11 >> 24 & 0xFF) == 0x1) {
                                                    s2.C(4);
                                                }
                                                if (s2.c() != 1) {
                                                    throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
                                                }
                                                s.B(8);
                                                final int n26 = s.c() >> 24 & 0xFF;
                                                s.C(4);
                                                if (n26 == 1) {
                                                    if (s.s() == 0L) {
                                                        throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
                                                    }
                                                }
                                                else if (n26 >= 2) {
                                                    s.C(4);
                                                }
                                                if (s.s() != 1L) {
                                                    throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
                                                }
                                                s.C(1);
                                                final int r3 = s.r();
                                                final boolean b21 = s.r() == 1;
                                                if (b21) {
                                                    final int r4 = s.r();
                                                    final byte[] array = new byte[16];
                                                    s.b(0, 16, array);
                                                    byte[] array3;
                                                    if (r4 == 0) {
                                                        final int r5 = s.r();
                                                        final byte[] array2 = new byte[r5];
                                                        s.b(0, r5, array2);
                                                        array3 = array2;
                                                    }
                                                    else {
                                                        array3 = null;
                                                    }
                                                    n18.k = true;
                                                    n18.m = new m(b21, b18, r4, array, (r3 & 0xF0) >> 4, r3 & 0xF, array3);
                                                }
                                            }
                                        }
                                        for (int size5 = a12.c.size(), n27 = 0; n27 < size5; ++n27) {
                                            final kb.a.b b22 = a12.c.get(n27);
                                            if (b22.a == 1970628964) {
                                                final s b23 = b22.b;
                                                b23.B(8);
                                                final byte[] array4 = h;
                                                b23.b(0, 16, array4);
                                                if (Arrays.equals(array4, kb.e.I)) {
                                                    d(b23, 16, n18);
                                                }
                                            }
                                        }
                                        array5 = h;
                                        n3 = n13;
                                        n28 = n12;
                                        a18 = a13;
                                        n29 = n20;
                                        break Label_3376;
                                    }
                                    final kb.a.b b24 = (kb.a.b)c5.get(n15);
                                    if (b24.a == 1953658222) {
                                        final s b25 = b24.b;
                                        b25.B(8);
                                        final int n30 = b25.c() & 0xFFFFFF;
                                        final l a19 = b8.d.a;
                                        final kb.n b26 = b8.b;
                                        final kb.c a20 = b26.a;
                                        final int a21 = c0.a;
                                        b26.g[n16] = b25.u();
                                        final long[] f2 = b26.f;
                                        final long b27 = b26.b;
                                        f2[n16] = b27;
                                        if ((n30 & 0x1) != 0x0) {
                                            f2[n16] = b27 + b25.c();
                                        }
                                        final boolean b28 = (n30 & 0x4) != 0x0;
                                        int n31 = a20.d;
                                        if (b28) {
                                            n31 = b25.c();
                                        }
                                        final boolean b29 = (n30 & 0x100) != 0x0;
                                        final boolean b30 = (n30 & 0x200) != 0x0;
                                        final boolean b31 = (n30 & 0x400) != 0x0;
                                        final boolean b32 = (n30 & 0x800) != 0x0;
                                        final long[] h2 = a19.h;
                                        long n32;
                                        if (h2 != null) {
                                            n32 = n19;
                                            if (h2.length == 1) {
                                                n32 = n19;
                                                if (h2[0] == 0L) {
                                                    n32 = a19.i[0];
                                                }
                                            }
                                        }
                                        else {
                                            n32 = n19;
                                        }
                                        final int[] h3 = b26.h;
                                        final long[] i2 = b26.i;
                                        final boolean[] j2 = b26.j;
                                        final boolean b33 = a19.b == 2 && (a8 & 0x1) != 0x0;
                                        final int n33 = b26.g[n16] + n17;
                                        final long c12 = a19.c;
                                        long p3 = b26.p;
                                        int n34 = n17;
                                        n17 = n33;
                                        final boolean b34 = b28;
                                        while (n34 < n17) {
                                            int n35;
                                            if (b29) {
                                                n35 = b25.c();
                                            }
                                            else {
                                                n35 = a20.b;
                                            }
                                            if (n35 < 0) {
                                                final StringBuilder sb3 = new StringBuilder(38);
                                                sb3.append("Unexpected negative value: ");
                                                sb3.append(n35);
                                                throw ParserException.createForMalformedContainer(sb3.toString(), (Throwable)null);
                                            }
                                            int n36;
                                            if (b30) {
                                                n36 = b25.c();
                                            }
                                            else {
                                                n36 = a20.c;
                                            }
                                            if (n36 < 0) {
                                                final StringBuilder sb4 = new StringBuilder(38);
                                                sb4.append("Unexpected negative value: ");
                                                sb4.append(n36);
                                                throw ParserException.createForMalformedContainer(sb4.toString(), (Throwable)null);
                                            }
                                            int n37;
                                            if (b31) {
                                                n37 = b25.c();
                                            }
                                            else if (n34 == 0 && b34) {
                                                n37 = n31;
                                            }
                                            else {
                                                n37 = a20.d;
                                            }
                                            int c13;
                                            if (b32) {
                                                c13 = b25.c();
                                            }
                                            else {
                                                c13 = 0;
                                            }
                                            final long p4 = c0.P(c13 + p3 - n32, 1000000L, c12);
                                            i2[n34] = p4;
                                            if (!b26.q) {
                                                i2[n34] = p4 + b8.d.h;
                                            }
                                            h3[n34] = n36;
                                            j2[n34] = ((n37 >> 16 & 0x1) == 0x0 && (!b33 || n34 == 0));
                                            p3 += n35;
                                            ++n34;
                                        }
                                        b26.p = p3;
                                        ++n16;
                                    }
                                    ++n15;
                                }
                            }
                        }
                        final int n38 = a8;
                        final kb.a.a a22 = a9;
                        n28 = size3;
                        final int n39 = n4;
                        array5 = h;
                        n29 = n38;
                        n21 = n39;
                        a18 = a22;
                    }
                    ++n21;
                    final byte[] array6 = array5;
                    size3 = n28;
                    a9 = a18;
                    h = array6;
                    a8 = n29;
                    n4 = n21;
                }
                final com.google.android.exoplayer2.drm.b b35 = b(a9.c);
                e = this;
                if (b35 != null) {
                    for (int size6 = e.d.size(), n40 = 0; n40 < size6; ++n40) {
                        final b b36 = (b)e.d.valueAt(n40);
                        final l a23 = b36.d.a;
                        final kb.c a24 = b36.b.a;
                        final int a25 = c0.a;
                        final int a26 = a24.a;
                        final m[] k2 = a23.k;
                        m m3;
                        if (k2 == null) {
                            m3 = null;
                        }
                        else {
                            m3 = k2[a26];
                        }
                        String b37;
                        if (m3 != null) {
                            b37 = m3.b;
                        }
                        else {
                            b37 = null;
                        }
                        final com.google.android.exoplayer2.drm.b a27 = b35.a(b37);
                        final n f3 = b36.d.a.f;
                        f3.getClass();
                        final n$a n$a = new n$a(f3);
                        n$a.n = a27;
                        b36.a.a(new n(n$a));
                    }
                }
                if (e.w != -9223372036854775807L) {
                    for (int size7 = e.d.size(), n41 = 0; n41 < size7; ++n41) {
                        final b b38 = (b)e.d.valueAt(n41);
                        final long w = e.w;
                        int f4 = b38.f;
                        while (true) {
                            final kb.n b39 = b38.b;
                            if (f4 >= b39.e || b39.i[f4] >= w) {
                                break;
                            }
                            if (b39.j[f4]) {
                                b38.i = f4;
                            }
                            ++f4;
                        }
                    }
                    e.w = -9223372036854775807L;
                }
                e4 = e;
            }
            else {
                final e e8 = e;
                e4 = e2;
                e = e8;
                if (!e2.m.isEmpty()) {
                    e2.m.peek().d.add(a);
                    e = e8;
                    e4 = e2;
                }
            }
        }
        e.p = 0;
        e.s = 0;
    }
    
    public final void f(final j e) {
        this.E = e;
        this.p = 0;
        this.s = 0;
        final w[] f = new w[2];
        this.F = f;
        final w o = this.o;
        int n;
        if (o != null) {
            f[0] = o;
            n = 1;
        }
        else {
            n = 0;
        }
        final int a = this.a;
        int n2 = 100;
        int n3 = n;
        if ((a & 0x4) != 0x0) {
            f[n] = e.k(100, 5);
            n3 = n + 1;
            n2 = 101;
        }
        final w[] f2 = (w[])c0.L(n3, this.F);
        this.F = f2;
        for (int length = f2.length, i = 0; i < length; ++i) {
            f2[i].a(e.J);
        }
        this.G = new w[this.c.size()];
        for (int j = 0; j < this.G.length; ++j, ++n2) {
            final w k = this.E.k(n2, 3);
            k.a((n)this.c.get(j));
            this.G[j] = k;
        }
        final l b = this.b;
        if (b != null) {
            this.d.put(0, (Object)new b(e.k(0, b.b), new o(this.b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new kb.c(0, 0, 0, 0)));
            this.E.b();
        }
    }
    
    public final int h(final db.i i, final t t) throws IOException {
        e e = this;
        while (true) {
            final int p2 = e.p;
            final int n = 0;
            final boolean b = false;
            if (p2 != 0) {
                if (p2 != 1) {
                    long n2 = Long.MAX_VALUE;
                    if (p2 != 2) {
                        int n7 = 0;
                        Label_1619: {
                            b z;
                            if ((z = e.z) == null) {
                                final SparseArray<b> d = e.d;
                                final int size = d.size();
                                long n3 = Long.MAX_VALUE;
                                z = null;
                                b b3;
                                long n4;
                                for (int j = 0; j < size; ++j, z = b3, n3 = n4) {
                                    final b b2 = (b)d.valueAt(j);
                                    final boolean l = b2.l;
                                    if (!l) {
                                        b3 = z;
                                        n4 = n3;
                                        if (b2.f == b2.d.b) {
                                            continue;
                                        }
                                    }
                                    if (l && b2.h == b2.b.d) {
                                        b3 = z;
                                        n4 = n3;
                                    }
                                    else {
                                        long n5;
                                        if (!l) {
                                            n5 = b2.d.c[b2.f];
                                        }
                                        else {
                                            n5 = b2.b.f[b2.h];
                                        }
                                        b3 = z;
                                        n4 = n3;
                                        if (n5 < n3) {
                                            b3 = b2;
                                            n4 = n5;
                                        }
                                    }
                                }
                                if (z == null) {
                                    final long u = e.u;
                                    final db.e e2 = (db.e)i;
                                    final int n6 = (int)(u - e2.d);
                                    if (n6 >= 0) {
                                        e2.n(n6);
                                        e.p = 0;
                                        e.s = 0;
                                        n7 = n;
                                        break Label_1619;
                                    }
                                    throw ParserException.createForMalformedContainer("Offset to end of mdat was negative.", (Throwable)null);
                                }
                                else {
                                    long n8;
                                    if (!z.l) {
                                        n8 = z.d.c[z.f];
                                    }
                                    else {
                                        n8 = z.b.f[z.h];
                                    }
                                    final db.e e3 = (db.e)i;
                                    int n9;
                                    if ((n9 = (int)(n8 - e3.d)) < 0) {
                                        Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        n9 = 0;
                                    }
                                    e3.n(n9);
                                    e.z = z;
                                }
                            }
                            Label_1616: {
                                if (e.p == 3) {
                                    int a;
                                    if (!z.l) {
                                        a = z.d.d[z.f];
                                    }
                                    else {
                                        a = z.b.h[z.f];
                                    }
                                    e.A = a;
                                    if (z.f < z.i) {
                                        ((db.e)i).n(a);
                                        final m a2 = z.a();
                                        if (a2 != null) {
                                            final s n10 = z.b.n;
                                            final int d2 = a2.d;
                                            if (d2 != 0) {
                                                n10.C(d2);
                                            }
                                            final kb.n b4 = z.b;
                                            final int f = z.f;
                                            int n11 = b ? 1 : 0;
                                            if (b4.k) {
                                                n11 = (b ? 1 : 0);
                                                if (b4.l[f]) {
                                                    n11 = 1;
                                                }
                                            }
                                            if (n11 != 0) {
                                                n10.C(n10.w() * 6);
                                            }
                                        }
                                        if (!z.b()) {
                                            e.z = null;
                                        }
                                        e.p = 3;
                                        break Label_1616;
                                    }
                                    if (z.d.a.g == 1) {
                                        e.A = a - 8;
                                        ((db.e)i).n(8);
                                    }
                                    if ("audio/ac4".equals(z.d.a.f.q)) {
                                        e.B = z.c(e.A, 7);
                                        ya.c.a(e.A, e.i);
                                        z.a.c(7, e.i);
                                        e.B += 7;
                                    }
                                    else {
                                        e.B = z.c(e.A, 0);
                                    }
                                    e.A += e.B;
                                    e.p = 4;
                                    e.C = 0;
                                }
                                final o d3 = z.d;
                                final l a3 = d3.a;
                                final w a4 = z.a;
                                long n12;
                                if (!z.l) {
                                    n12 = d3.f[z.f];
                                }
                                else {
                                    n12 = z.b.i[z.f];
                                }
                                final a0 k = e.j;
                                long a5 = n12;
                                if (k != null) {
                                    a5 = k.a(n12);
                                }
                                final int m = a3.j;
                                if (m != 0) {
                                    final byte[] a6 = e.f.a;
                                    a6[0] = 0;
                                    a6[1] = 0;
                                    a6[2] = 0;
                                    final int n13 = 4 - m;
                                    while (e.B < e.A) {
                                        final int c = e.C;
                                        if (c == 0) {
                                            ((db.e)i).f(a6, n13, m + 1, false);
                                            e.f.B(0);
                                            final int c2 = e.f.c();
                                            if (c2 < 1) {
                                                throw ParserException.createForMalformedContainer("Invalid NAL length", (Throwable)null);
                                            }
                                            e.C = c2 - 1;
                                            e.e.B(0);
                                            a4.c(4, e.e);
                                            a4.c(1, e.f);
                                            boolean d4 = false;
                                            Label_1086: {
                                                if (e.G.length > 0) {
                                                    final String q = a3.f.q;
                                                    final byte b5 = a6[4];
                                                    final byte[] a7 = bd.p.a;
                                                    if (("video/avc".equals(q) && (b5 & 0x1F) == 0x6) || ("video/hevc".equals(q) && (b5 & 0x7E) >> 1 == 39)) {
                                                        d4 = true;
                                                        break Label_1086;
                                                    }
                                                }
                                                d4 = false;
                                            }
                                            e.D = d4;
                                            e.B += 5;
                                            e.A += n13;
                                        }
                                        else {
                                            int n14;
                                            if (e.D) {
                                                e.g.y(c);
                                                ((db.e)i).f(e.g.a, 0, e.C, false);
                                                a4.c(e.C, e.g);
                                                n14 = e.C;
                                                final s g = e.g;
                                                final int e4 = bd.p.e(g.c, g.a);
                                                e.g.B("video/hevc".equals(a3.f.q) ? 1 : 0);
                                                e.g.A(e4);
                                                db.b.a(a5, e.g, e.G);
                                            }
                                            else {
                                                n14 = a4.e((f)i, c, false);
                                            }
                                            e.B += n14;
                                            e.C -= n14;
                                        }
                                    }
                                }
                                else {
                                    while (true) {
                                        final int b6 = e.B;
                                        final int a8 = e.A;
                                        if (b6 >= a8) {
                                            break;
                                        }
                                        e.B += a4.e((f)i, a8 - b6, false);
                                    }
                                }
                                int n15;
                                if (!z.l) {
                                    n15 = z.d.g[z.f];
                                }
                                else if (z.b.j[z.f]) {
                                    n15 = 1;
                                }
                                else {
                                    n15 = 0;
                                }
                                int n16 = n15;
                                if (z.a() != null) {
                                    n16 = (n15 | 0x40000000);
                                }
                                final m a9 = z.a();
                                w$a c3;
                                if (a9 != null) {
                                    c3 = a9.c;
                                }
                                else {
                                    c3 = null;
                                }
                                a4.b(a5, n16, e.A, 0, c3);
                                while (!e.n.isEmpty()) {
                                    final a a10 = e.n.removeFirst();
                                    e.v -= a10.c;
                                    long a11;
                                    final long n17 = a11 = a10.a;
                                    if (a10.b) {
                                        a11 = n17 + a5;
                                    }
                                    final a0 j2 = e.j;
                                    long a12 = a11;
                                    if (j2 != null) {
                                        a12 = j2.a(a11);
                                    }
                                    final w[] f2 = e.F;
                                    for (int length = f2.length, n18 = 0; n18 < length; ++n18) {
                                        f2[n18].b(a12, 1, a10.c, e.v, (w$a)null);
                                    }
                                }
                                if (!z.b()) {
                                    e.z = null;
                                }
                                e.p = 3;
                            }
                            n7 = 1;
                        }
                        if (n7 != 0) {
                            return 0;
                        }
                        continue;
                    }
                    else {
                        final int size2 = e.d.size();
                        int n19 = 0;
                        b b7 = null;
                        while (n19 < size2) {
                            final kb.n b8 = ((b)e.d.valueAt(n19)).b;
                            long n20 = n2;
                            b b9 = b7;
                            if (b8.o) {
                                final long c4 = b8.c;
                                n20 = n2;
                                b9 = b7;
                                if (c4 < n2) {
                                    b9 = (b)e.d.valueAt(n19);
                                    n20 = c4;
                                }
                            }
                            ++n19;
                            n2 = n20;
                            b7 = b9;
                        }
                        if (b7 == null) {
                            e.p = 3;
                        }
                        else {
                            final db.e e5 = (db.e)i;
                            final int n21 = (int)(n2 - e5.d);
                            if (n21 < 0) {
                                throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", (Throwable)null);
                            }
                            e5.n(n21);
                            final kb.n b10 = b7.b;
                            final s n22 = b10.n;
                            e5.f(n22.a, 0, n22.c, false);
                            b10.n.B(0);
                            b10.o = false;
                        }
                    }
                }
                else {
                    final int n23 = (int)e.r - e.s;
                    final s t2 = e.t;
                    Label_2821: {
                        if (t2 != null) {
                            final byte[] a13 = t2.a;
                            final db.e e6 = (db.e)i;
                            e6.f(a13, 8, n23, false);
                            final int q2 = e.q;
                            final kb.a.b b11 = new kb.a.b(q2, t2);
                            final long d5 = e6.d;
                            if (!e.m.isEmpty()) {
                                e.m.peek().c.add(b11);
                            }
                            else if (q2 == 1936286840) {
                                t2.B(8);
                                final int c5 = t2.c();
                                t2.C(4);
                                final long s = t2.s();
                                long n24;
                                long n25;
                                if ((c5 >> 24 & 0xFF) == 0x0) {
                                    n24 = t2.s();
                                    n25 = t2.s();
                                }
                                else {
                                    n24 = t2.v();
                                    n25 = t2.v();
                                }
                                final long n26 = n25 + d5;
                                final long p3 = c0.P(n24, 1000000L, s);
                                t2.C(2);
                                final int w = t2.w();
                                final int[] array = new int[w];
                                final long[] array2 = new long[w];
                                final long[] array3 = new long[w];
                                final long[] array4 = new long[w];
                                long p4 = p3;
                                int n27 = 0;
                                long n28 = n24;
                                long n29 = n26;
                                while (n27 < w) {
                                    final int c6 = t2.c();
                                    if ((c6 & Integer.MIN_VALUE) != 0x0) {
                                        throw ParserException.createForMalformedContainer("Unhandled indirect reference", (Throwable)null);
                                    }
                                    final long s2 = t2.s();
                                    array[n27] = (c6 & Integer.MAX_VALUE);
                                    array2[n27] = n29;
                                    array4[n27] = p4;
                                    n28 += s2;
                                    p4 = c0.P(n28, 1000000L, s);
                                    array3[n27] = p4 - array4[n27];
                                    t2.C(4);
                                    n29 += array[n27];
                                    ++n27;
                                }
                                final Pair create = Pair.create((Object)p3, (Object)new db.c(array, array2, array3, array4));
                                final long longValue = (long)create.first;
                                e = this;
                                e.y = longValue;
                                e.E.s((u)create.second);
                                e.H = true;
                            }
                            else {
                                final e e7 = e = e;
                                if (q2 == 1701671783) {
                                    if (e7.F.length == 0) {
                                        e = e7;
                                    }
                                    else {
                                        t2.B(8);
                                        final int n30 = t2.c() >> 24 & 0xFF;
                                        long p5;
                                        long n31;
                                        long n32;
                                        String s4;
                                        String s5;
                                        long p6;
                                        if (n30 != 0) {
                                            if (n30 != 1) {
                                                ag0.a.u(46, "Skipping unsupported emsg version: ", n30, "FragmentedMp4Extractor");
                                                e = e7;
                                                break Label_2821;
                                            }
                                            final long s3 = t2.s();
                                            p5 = c0.P(t2.v(), 1000000L, s3);
                                            n31 = c0.P(t2.s(), 1000L, s3);
                                            n32 = t2.s();
                                            s4 = t2.l();
                                            s4.getClass();
                                            s5 = t2.l();
                                            s5.getClass();
                                            p6 = -9223372036854775807L;
                                        }
                                        else {
                                            s4 = t2.l();
                                            s4.getClass();
                                            s5 = t2.l();
                                            s5.getClass();
                                            final long s6 = t2.s();
                                            p6 = c0.P(t2.s(), 1000000L, s6);
                                            final long y = e7.y;
                                            if (y != -9223372036854775807L) {
                                                p5 = y + p6;
                                            }
                                            else {
                                                p5 = -9223372036854775807L;
                                            }
                                            n31 = c0.P(t2.s(), 1000L, s6);
                                            n32 = t2.s();
                                        }
                                        final int n33 = t2.c - t2.b;
                                        final byte[] array5 = new byte[n33];
                                        t2.b(0, n33, array5);
                                        final s s7 = new s(e7.k.a(new sb.a(s4, s5, n31, n32, array5)));
                                        final int n34 = s7.c - s7.b;
                                        for (final w w2 : e7.F) {
                                            s7.B(0);
                                            w2.c(n34, s7);
                                        }
                                        if (p5 == -9223372036854775807L) {
                                            e7.n.addLast(new a(n34, p6, true));
                                            e7.v += n34;
                                            e = e7;
                                        }
                                        else if (!e7.n.isEmpty()) {
                                            e7.n.addLast(new a(n34, p5, false));
                                            e7.v += n34;
                                            e = e7;
                                        }
                                        else {
                                            final a0 j3 = e7.j;
                                            long a14 = p5;
                                            if (j3 != null) {
                                                a14 = j3.a(p5);
                                            }
                                            final w[] f4 = e7.F;
                                            final int length3 = f4.length;
                                            int n36 = 0;
                                            while (true) {
                                                e = e7;
                                                if (n36 >= length3) {
                                                    break;
                                                }
                                                f4[n36].b(a14, 1, n34, 0, (w$a)null);
                                                ++n36;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            ((db.e)i).n(n23);
                        }
                    }
                    e.e(((db.e)i).d);
                }
            }
            else {
                boolean b12 = false;
                Label_3779: {
                    if (e.s == 0) {
                        final byte[] a15 = e.l.a;
                        final db.e e8 = (db.e)i;
                        b12 = false;
                        if (!e8.f(a15, 0, 8, true)) {
                            break Label_3779;
                        }
                        e.s = 8;
                        e.l.B(0);
                        e.r = e.l.s();
                        e.q = e.l.c();
                    }
                    final long r = e.r;
                    if (r == 1L) {
                        ((db.e)i).f(e.l.a, 8, 8, false);
                        e.s += 8;
                        e.r = e.l.v();
                    }
                    else if (r == 0L) {
                        final db.e e9 = (db.e)i;
                        long n38;
                        final long n37 = n38 = e9.c;
                        if (n37 == -1L) {
                            n38 = n37;
                            if (!e.m.isEmpty()) {
                                n38 = e.m.peek().b;
                            }
                        }
                        if (n38 != -1L) {
                            e.r = n38 - e9.d + e.s;
                        }
                    }
                    final long r2 = e.r;
                    final int s8 = e.s;
                    if (r2 < s8) {
                        throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
                    }
                    final db.e e10 = (db.e)i;
                    final long n39 = e10.d - s8;
                    final int q3 = e.q;
                    if ((q3 == 1836019558 || q3 == 1835295092) && !e.H) {
                        e.E.s((u)new u$b(e.x, n39));
                        e.H = true;
                    }
                    if (e.q == 1836019558) {
                        for (int size3 = e.d.size(), n40 = 0; n40 < size3; ++n40) {
                            final kb.n b13 = ((b)e.d.valueAt(n40)).b;
                            b13.getClass();
                            b13.c = n39;
                            b13.b = n39;
                        }
                    }
                    final int q4 = e.q;
                    if (q4 == 1835295092) {
                        e.z = null;
                        e.u = n39 + e.r;
                        e.p = 2;
                        b12 = true;
                    }
                    else {
                        if (q4 == 1836019574 || q4 == 1953653099 || q4 == 1835297121 || q4 == 1835626086 || q4 == 1937007212 || q4 == 1836019558 || q4 == 1953653094 || q4 == 1836475768 || q4 == 1701082227) {
                            final long n41 = e10.d + e.r - 8L;
                            e.m.push(new kb.a.a(q4, n41));
                            if (e.r == e.s) {
                                e.e(n41);
                            }
                            else {
                                e.p = 0;
                                e.s = 0;
                            }
                        }
                        else if (q4 == 1751411826 || q4 == 1835296868 || q4 == 1836476516 || q4 == 1936286840 || q4 == 1937011556 || q4 == 1937011827 || q4 == 1668576371 || q4 == 1937011555 || q4 == 1937011578 || q4 == 1937013298 || q4 == 1937007471 || q4 == 1668232756 || q4 == 1937011571 || q4 == 1952867444 || q4 == 1952868452 || q4 == 1953196132 || q4 == 1953654136 || q4 == 1953658222 || q4 == 1886614376 || q4 == 1935763834 || q4 == 1935763823 || q4 == 1936027235 || q4 == 1970628964 || q4 == 1935828848 || q4 == 1936158820 || q4 == 1701606260 || q4 == 1835362404 || q4 == 1701671783) {
                            if (e.s != 8) {
                                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
                            }
                            final long r3 = e.r;
                            if (r3 > 2147483647L) {
                                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            final s t3 = new s((int)r3);
                            System.arraycopy(e.l.a, 0, t3.a, 0, 8);
                            e.t = t3;
                            e.p = 1;
                        }
                        else {
                            if (e.r > 2147483647L) {
                                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            e.t = null;
                            e.p = 1;
                        }
                        b12 = true;
                    }
                }
                if (!b12) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    public final void release() {
    }
    
    public static final class a
    {
        public final long a;
        public final boolean b;
        public final int c;
        
        public a(final int c, final long a, final boolean b) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class b
    {
        public final w a;
        public final kb.n b;
        public final s c;
        public o d;
        public kb.c e;
        public int f;
        public int g;
        public int h;
        public int i;
        public final s j;
        public final s k;
        public boolean l;
        
        public b(final w a, final o o, final kb.c c) {
            this.a = a;
            this.d = o;
            this.e = c;
            this.b = new kb.n();
            this.c = new s();
            this.j = new s(1);
            this.k = new s();
            this.d = o;
            this.e = c;
            a.a(o.a.f);
            this.d();
        }
        
        public final m a() {
            final boolean l = this.l;
            final m m = null;
            if (!l) {
                return null;
            }
            final kb.n b = this.b;
            final kb.c a = b.a;
            final int a2 = c0.a;
            final int a3 = a.a;
            m i = b.m;
            if (i == null) {
                final m[] k = this.d.a.k;
                if (k == null) {
                    i = null;
                }
                else {
                    i = k[a3];
                }
            }
            m j = m;
            if (i != null) {
                j = m;
                if (i.a) {
                    j = i;
                }
            }
            return j;
        }
        
        public final boolean b() {
            ++this.f;
            if (!this.l) {
                return false;
            }
            final int g = this.g + 1;
            this.g = g;
            final int[] g2 = this.b.g;
            final int h = this.h;
            if (g == g2[h]) {
                this.h = h + 1;
                this.g = 0;
                return false;
            }
            return true;
        }
        
        public final int c(int w, int n) {
            final m a = this.a();
            if (a == null) {
                return 0;
            }
            int n2 = a.d;
            s s;
            if (n2 != 0) {
                s = this.b.n;
            }
            else {
                final byte[] e = a.e;
                final int a2 = c0.a;
                this.k.z(e.length, e);
                s = this.k;
                n2 = e.length;
            }
            final kb.n b = this.b;
            final int f = this.f;
            final boolean b2 = b.k && b.l[f];
            final boolean b3 = b2 || n != 0;
            final s j = this.j;
            final byte[] a3 = j.a;
            int n3;
            if (b3) {
                n3 = 128;
            }
            else {
                n3 = 0;
            }
            a3[0] = (byte)(n3 | n2);
            j.B(0);
            this.a.d(this.j, 1);
            this.a.d(s, n2);
            if (!b3) {
                return n2 + 1;
            }
            if (!b2) {
                this.c.y(8);
                final s c = this.c;
                final byte[] a4 = c.a;
                a4[0] = 0;
                a4[1] = 1;
                a4[2] = (byte)(n >> 8 & 0xFF);
                a4[3] = (byte)(n & 0xFF);
                a4[4] = (byte)(w >> 24 & 0xFF);
                a4[5] = (byte)(w >> 16 & 0xFF);
                a4[6] = (byte)(w >> 8 & 0xFF);
                a4[7] = (byte)(w & 0xFF);
                this.a.d(c, 8);
                return n2 + 1 + 8;
            }
            final s n4 = this.b.n;
            w = n4.w();
            n4.C(-2);
            w = w * 6 + 2;
            s c2 = n4;
            if (n != 0) {
                this.c.y(w);
                final byte[] a5 = this.c.a;
                n4.b(0, w, a5);
                n += ((a5[2] & 0xFF) << 8 | (a5[3] & 0xFF));
                a5[2] = (byte)(n >> 8 & 0xFF);
                a5[3] = (byte)(n & 0xFF);
                c2 = this.c;
            }
            this.a.d(c2, w);
            return n2 + 1 + w;
        }
        
        public final void d() {
            final kb.n b = this.b;
            b.d = 0;
            b.p = 0L;
            b.q = false;
            b.k = false;
            b.o = false;
            b.m = null;
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }
    }
}
