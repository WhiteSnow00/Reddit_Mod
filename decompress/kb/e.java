// 
// Decompiled by Procyon v0.6.0
// 

package kb;

import db.u$b;
import db.u;
import db.w$a;
import zc.f;
import bd.c0;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import com.google.android.exoplayer2.ParserException;
import java.util.UUID;
import android.util.Log;
import com.google.android.exoplayer2.drm.b$b;
import com.google.android.exoplayer2.drm.b;
import java.util.ArrayList;
import bd.q;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import java.util.ArrayDeque;
import sb.c;
import bd.a0;
import bd.t;
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
    public final SparseArray<e.e$b> d;
    public final t e;
    public final t f;
    public final t g;
    public final byte[] h;
    public final t i;
    public final a0 j;
    public final c k;
    public final t l;
    public final ArrayDeque<a.a> m;
    public final ArrayDeque<e.e$a> n;
    public final w o;
    public int p;
    public int q;
    public long r;
    public int s;
    public t t;
    public long u;
    public int v;
    public long w;
    public long x;
    public long y;
    public e.e$b z;
    
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
        this.l = new t(16);
        this.e = new t(bd.q.a);
        this.f = new t(5);
        this.g = new t();
        final byte[] h = new byte[16];
        this.h = h;
        this.i = new t(h);
        this.m = new ArrayDeque<a.a>();
        this.n = new ArrayDeque<e.e$a>();
        this.d = (SparseArray<e.e$b>)new SparseArray();
        this.x = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.E = (j)db.j.T2;
        this.F = new w[0];
        this.G = new w[0];
    }
    
    public static b b(final ArrayList list) {
        final int size = list.size();
        final b b = null;
        List<b$b> list2 = null;
        List<b$b> list3;
        for (int i = 0; i < size; ++i, list2 = list3) {
            final a.b b2 = list.get(i);
            list3 = list2;
            if (b2.a == 1886614376) {
                if ((list3 = list2) == null) {
                    list3 = new ArrayList<b$b>();
                }
                final byte[] a = b2.b.a;
                final i$a b3 = i.b(a);
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
        b b4;
        if (list2 == null) {
            b4 = b;
        }
        else {
            b4 = new b((String)null, false, (b$b[])list2.toArray(new b$b[0]));
        }
        return b4;
    }
    
    public static void d(final t t, int n, final kb.n n2) throws ParserException {
        t.B(n + 8);
        n = (t.c() & 0xFFFFFF);
        if ((n & 0x1) != 0x0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        final boolean b = (n & 0x2) != 0x0;
        n = t.u();
        if (n == 0) {
            Arrays.fill(n2.l, 0, n2.e, false);
            return;
        }
        final int e = n2.e;
        if (n == e) {
            Arrays.fill(n2.l, 0, n, b);
            final int c = t.c;
            n = t.b;
            n2.n.y(c - n);
            n2.k = true;
            n2.o = true;
            final t n3 = n2.n;
            t.b(0, n3.c, n3.a);
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
            ((e.e$b)this.d.valueAt(i)).d();
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
            final a.a a = e2.m.pop();
            final int a2 = a.a;
            if (a2 == 1836019574) {
                if (e2.b != null) {
                    throw new IllegalStateException("Unexpected moov box.");
                }
                final b b = b(a.c);
                final a.a b2 = a.b(1836475768);
                b2.getClass();
                final SparseArray sparseArray = new SparseArray();
                final int size = b2.c.size();
                long n2 = -9223372036854775807L;
                for (int i = 0; i < size; ++i) {
                    final a.b b3 = b2.c.get(i);
                    final int a3 = b3.a;
                    if (a3 == 1953654136) {
                        final t b4 = b3.b;
                        b4.B(12);
                        final Pair create = Pair.create((Object)b4.c(), (Object)new kb.c(b4.c() - 1, b4.c(), b4.c(), b4.c()));
                        sparseArray.put((int)create.first, (Object)create.second);
                    }
                    else if (a3 == 1835362404) {
                        final t b5 = b3.b;
                        b5.B(8);
                        if ((b5.c() >> 24 & 0xFF) == 0x0) {
                            n2 = b5.s();
                        }
                        else {
                            n2 = b5.v();
                        }
                    }
                }
                final ArrayList f = kb.b.f(a, new db.q(), n2, b, (e2.a & 0x10) != 0x0, false, (sg.c)new d(e2));
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
                        e2.d.put(a4.a, (Object)new e.e$b(k, o, c));
                        e2.x = Math.max(e2.x, a4.e);
                    }
                    e2.E.b();
                }
                else {
                    ah0.b.H(e2.d.size() == size2);
                    for (int l = 0; l < size2; ++l) {
                        final o d = f.get(l);
                        final l a6 = d.a;
                        final e.e$b e$b = (e.e$b)e2.d.get(a6.a);
                        final int a7 = a6.a;
                        kb.c e3;
                        if (sparseArray.size() == 1) {
                            e3 = (kb.c)sparseArray.valueAt(0);
                        }
                        else {
                            e3 = (kb.c)sparseArray.get(a7);
                            e3.getClass();
                        }
                        e$b.d = d;
                        e$b.e = e3;
                        e$b.a.a(d.a.f);
                        e$b.d();
                    }
                }
                e4 = e2;
            }
            else if (a2 == 1836019558) {
                final SparseArray<e.e$b> d2 = e2.d;
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
                a.a a9 = a;
                while (n4 < size3) {
                    final a.a a10 = a9.d.get(n4);
                    int n20 = 0;
                    byte[] array4 = null;
                    int n27 = 0;
                    a.a a17 = null;
                    int n28 = 0;
                    Label_3337: {
                        if (a10.a == 1953653094) {
                            final a.b c2 = a10.c(1952868452);
                            c2.getClass();
                            final t b6 = c2.b;
                            b6.B(8);
                            final int n5 = b6.c() & 0xFFFFFF;
                            final int c3 = b6.c();
                            Object o2;
                            if (n3 != 0) {
                                o2 = d2.valueAt(0);
                            }
                            else {
                                o2 = d2.get(c3);
                            }
                            e.e$b e$b2 = (e.e$b)o2;
                            if (e$b2 == null) {
                                e$b2 = null;
                            }
                            else {
                                if ((n5 & 0x1) != 0x0) {
                                    final long v = b6.v();
                                    final kb.n b7 = e$b2.b;
                                    b7.b = v;
                                    b7.c = v;
                                }
                                final kb.c e5 = e$b2.e;
                                int a11;
                                if ((n5 & 0x2) != 0x0) {
                                    a11 = b6.c() - 1;
                                }
                                else {
                                    a11 = e5.a;
                                }
                                int n6;
                                if ((n5 & 0x8) != 0x0) {
                                    n6 = b6.c();
                                }
                                else {
                                    n6 = e5.b;
                                }
                                int n7;
                                if ((n5 & 0x10) != 0x0) {
                                    n7 = b6.c();
                                }
                                else {
                                    n7 = e5.c;
                                }
                                int n8;
                                if ((n5 & 0x20) != 0x0) {
                                    n8 = b6.c();
                                }
                                else {
                                    n8 = e5.d;
                                }
                                e$b2.b.a = new kb.c(a11, n6, n7, n8);
                            }
                            if (e$b2 != null) {
                                final kb.n b8 = e$b2.b;
                                final long p = b8.p;
                                final boolean q = b8.q;
                                e$b2.d();
                                e$b2.l = true;
                                final a.b c4 = a10.c(1952867444);
                                if (c4 != null && (a8 & 0x2) == 0x0) {
                                    final t b9 = c4.b;
                                    b9.B(8);
                                    long p2;
                                    if ((b9.c() >> 24 & 0xFF) == 0x1) {
                                        p2 = b9.v();
                                    }
                                    else {
                                        p2 = b9.s();
                                    }
                                    b8.p = p2;
                                    b8.q = true;
                                }
                                else {
                                    b8.p = p;
                                    b8.q = q;
                                }
                                final ArrayList c5 = a10.c;
                                final int size4 = c5.size();
                                int n9 = 0;
                                int d3 = 0;
                                int e6 = 0;
                                while (n9 < size4) {
                                    final a.b b10 = (a.b)c5.get(n9);
                                    int n10 = d3;
                                    int n11 = e6;
                                    if (b10.a == 1953658222) {
                                        final t b11 = b10.b;
                                        b11.B(12);
                                        final int u = b11.u();
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
                                e$b2.h = 0;
                                e$b2.g = 0;
                                e$b2.f = 0;
                                final kb.n b12 = e$b2.b;
                                b12.d = d3;
                                b12.e = e6;
                                if (b12.g.length < d3) {
                                    b12.f = new long[d3];
                                    b12.g = new int[d3];
                                }
                                if (b12.h.length < e6) {
                                    final int n14 = e6 * 125 / 100;
                                    b12.h = new int[n14];
                                    b12.i = new long[n14];
                                    b12.j = new boolean[n14];
                                    b12.l = new boolean[n14];
                                }
                                int n15 = 0;
                                int n16 = 0;
                                int n17 = 0;
                                while (true) {
                                    final long n18 = 0L;
                                    if (n15 >= size4) {
                                        final int n19 = a8;
                                        final a.a a12 = a9;
                                        n20 = n4;
                                        final l a13 = e$b2.d.a;
                                        final kb.c a14 = b8.a;
                                        a14.getClass();
                                        final int a15 = a14.a;
                                        final m[] m = a13.k;
                                        m m2;
                                        if (m == null) {
                                            m2 = null;
                                        }
                                        else {
                                            m2 = m[a15];
                                        }
                                        final a.b c6 = a10.c(1935763834);
                                        if (c6 != null) {
                                            m2.getClass();
                                            final t b13 = c6.b;
                                            final int d4 = m2.d;
                                            b13.B(8);
                                            if ((b13.c() & 0xFFFFFF & 0x1) == 0x1) {
                                                b13.C(8);
                                            }
                                            final int r = b13.r();
                                            final int u2 = b13.u();
                                            final int e7 = b8.e;
                                            if (u2 > e7) {
                                                final StringBuilder sb = new StringBuilder(78);
                                                sb.append("Saiz sample count ");
                                                sb.append(u2);
                                                sb.append(" is greater than fragment sample count");
                                                sb.append(e7);
                                                throw ParserException.createForMalformedContainer(sb.toString(), (Throwable)null);
                                            }
                                            int n22;
                                            if (r == 0) {
                                                final boolean[] l2 = b8.l;
                                                int n21 = 0;
                                                n22 = 0;
                                                while (n21 < u2) {
                                                    final int r2 = b13.r();
                                                    n22 += r2;
                                                    l2[n21] = (r2 > d4);
                                                    ++n21;
                                                }
                                            }
                                            else {
                                                final boolean b14 = r > d4;
                                                n22 = r * u2 + 0;
                                                Arrays.fill(b8.l, 0, u2, b14);
                                            }
                                            Arrays.fill(b8.l, u2, b8.e, false);
                                            if (n22 > 0) {
                                                b8.n.y(n22);
                                                b8.k = true;
                                                b8.o = true;
                                            }
                                        }
                                        final a.b c7 = a10.c(1935763823);
                                        if (c7 != null) {
                                            final t b15 = c7.b;
                                            b15.B(8);
                                            final int c8 = b15.c();
                                            if ((0xFFFFFF & c8 & 0x1) == 0x1) {
                                                b15.C(8);
                                            }
                                            final int u3 = b15.u();
                                            if (u3 != 1) {
                                                final StringBuilder sb2 = new StringBuilder(40);
                                                sb2.append("Unexpected saio entry count: ");
                                                sb2.append(u3);
                                                throw ParserException.createForMalformedContainer(sb2.toString(), (Throwable)null);
                                            }
                                            final long c9 = b8.c;
                                            long n23;
                                            if ((c8 >> 24 & 0xFF) == 0x0) {
                                                n23 = b15.s();
                                            }
                                            else {
                                                n23 = b15.v();
                                            }
                                            b8.c = c9 + n23;
                                        }
                                        final a.b c10 = a10.c(1936027235);
                                        if (c10 != null) {
                                            d(c10.b, 0, b8);
                                        }
                                        String b16;
                                        if (m2 != null) {
                                            b16 = m2.b;
                                        }
                                        else {
                                            b16 = null;
                                        }
                                        t t = null;
                                        t t2 = null;
                                        t t3;
                                        t t4;
                                        for (int n24 = 0; n24 < a10.c.size(); ++n24, t = t3, t2 = t4) {
                                            final a.b b17 = a10.c.get(n24);
                                            final t b18 = b17.b;
                                            final int a16 = b17.a;
                                            if (a16 == 1935828848) {
                                                b18.B(12);
                                                t3 = t;
                                                t4 = t2;
                                                if (b18.c() == 1936025959) {
                                                    t4 = b18;
                                                    t3 = t;
                                                }
                                            }
                                            else {
                                                t3 = t;
                                                t4 = t2;
                                                if (a16 == 1936158820) {
                                                    b18.B(12);
                                                    t3 = t;
                                                    t4 = t2;
                                                    if (b18.c() == 1936025959) {
                                                        t4 = t2;
                                                        t3 = b18;
                                                    }
                                                }
                                            }
                                        }
                                        if (t2 != null) {
                                            if (t != null) {
                                                t2.B(8);
                                                final int c11 = t2.c();
                                                t2.C(4);
                                                if ((c11 >> 24 & 0xFF) == 0x1) {
                                                    t2.C(4);
                                                }
                                                if (t2.c() != 1) {
                                                    throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
                                                }
                                                t.B(8);
                                                final int n25 = t.c() >> 24 & 0xFF;
                                                t.C(4);
                                                if (n25 == 1) {
                                                    if (t.s() == 0L) {
                                                        throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
                                                    }
                                                }
                                                else if (n25 >= 2) {
                                                    t.C(4);
                                                }
                                                if (t.s() != 1L) {
                                                    throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
                                                }
                                                t.C(1);
                                                final int r3 = t.r();
                                                final boolean b19 = t.r() == 1;
                                                if (b19) {
                                                    final int r4 = t.r();
                                                    final byte[] array = new byte[16];
                                                    t.b(0, 16, array);
                                                    byte[] array3;
                                                    if (r4 == 0) {
                                                        final int r5 = t.r();
                                                        final byte[] array2 = new byte[r5];
                                                        t.b(0, r5, array2);
                                                        array3 = array2;
                                                    }
                                                    else {
                                                        array3 = null;
                                                    }
                                                    b8.k = true;
                                                    b8.m = new m(b19, b16, r4, array, (r3 & 0xF0) >> 4, r3 & 0xF, array3);
                                                }
                                            }
                                        }
                                        for (int size5 = a10.c.size(), n26 = 0; n26 < size5; ++n26) {
                                            final a.b b20 = a10.c.get(n26);
                                            if (b20.a == 1970628964) {
                                                final t b21 = b20.b;
                                                b21.B(8);
                                                b21.b(0, 16, h);
                                                if (Arrays.equals(h, kb.e.I)) {
                                                    d(b21, 16, b8);
                                                }
                                            }
                                        }
                                        array4 = h;
                                        n3 = n13;
                                        n27 = n12;
                                        a17 = a12;
                                        n28 = n19;
                                        break Label_3337;
                                    }
                                    final a.b b22 = (a.b)c5.get(n15);
                                    if (b22.a == 1953658222) {
                                        final t b23 = b22.b;
                                        b23.B(8);
                                        final int n29 = b23.c() & 0xFFFFFF;
                                        final l a18 = e$b2.d.a;
                                        final kb.n b24 = e$b2.b;
                                        final kb.c a19 = b24.a;
                                        final int a20 = c0.a;
                                        b24.g[n16] = b23.u();
                                        final long[] f2 = b24.f;
                                        final long b25 = b24.b;
                                        f2[n16] = b25;
                                        if ((n29 & 0x1) != 0x0) {
                                            f2[n16] = b25 + b23.c();
                                        }
                                        final boolean b26 = (n29 & 0x4) != 0x0;
                                        int n30 = a19.d;
                                        if (b26) {
                                            n30 = b23.c();
                                        }
                                        final boolean b27 = (n29 & 0x100) != 0x0;
                                        final boolean b28 = (n29 & 0x200) != 0x0;
                                        final boolean b29 = (n29 & 0x400) != 0x0;
                                        final boolean b30 = (n29 & 0x800) != 0x0;
                                        final long[] h2 = a18.h;
                                        long n31;
                                        if (h2 != null) {
                                            n31 = n18;
                                            if (h2.length == 1) {
                                                n31 = n18;
                                                if (h2[0] == 0L) {
                                                    n31 = a18.i[0];
                                                }
                                            }
                                        }
                                        else {
                                            n31 = n18;
                                        }
                                        final int[] h3 = b24.h;
                                        final long[] i2 = b24.i;
                                        final boolean[] j2 = b24.j;
                                        final boolean b31 = a18.b == 2 && (a8 & 0x1) != 0x0;
                                        final int n32 = b24.g[n16] + n17;
                                        final long c12 = a18.c;
                                        long p3 = b24.p;
                                        int n33 = n17;
                                        n17 = n32;
                                        final boolean b32 = b26;
                                        while (n33 < n17) {
                                            int n34;
                                            if (b27) {
                                                n34 = b23.c();
                                            }
                                            else {
                                                n34 = a19.b;
                                            }
                                            if (n34 < 0) {
                                                final StringBuilder sb3 = new StringBuilder(38);
                                                sb3.append("Unexpected negative value: ");
                                                sb3.append(n34);
                                                throw ParserException.createForMalformedContainer(sb3.toString(), (Throwable)null);
                                            }
                                            int n35;
                                            if (b28) {
                                                n35 = b23.c();
                                            }
                                            else {
                                                n35 = a19.c;
                                            }
                                            if (n35 < 0) {
                                                final StringBuilder sb4 = new StringBuilder(38);
                                                sb4.append("Unexpected negative value: ");
                                                sb4.append(n35);
                                                throw ParserException.createForMalformedContainer(sb4.toString(), (Throwable)null);
                                            }
                                            int n36;
                                            if (b29) {
                                                n36 = b23.c();
                                            }
                                            else if (n33 == 0 && b32) {
                                                n36 = n30;
                                            }
                                            else {
                                                n36 = a19.d;
                                            }
                                            int c13;
                                            if (b30) {
                                                c13 = b23.c();
                                            }
                                            else {
                                                c13 = 0;
                                            }
                                            final long p4 = c0.P(c13 + p3 - n31, 1000000L, c12);
                                            i2[n33] = p4;
                                            if (!b24.q) {
                                                i2[n33] = p4 + e$b2.d.h;
                                            }
                                            h3[n33] = n35;
                                            j2[n33] = ((n36 >> 16 & 0x1) == 0x0 && (!b31 || n33 == 0));
                                            p3 += n34;
                                            ++n33;
                                        }
                                        b24.p = p3;
                                        ++n16;
                                    }
                                    ++n15;
                                }
                            }
                        }
                        final int n37 = a8;
                        n27 = size3;
                        final int n38 = n4;
                        final byte[] array5 = h;
                        n28 = n37;
                        n20 = n38;
                        a17 = a9;
                        array4 = array5;
                    }
                    ++n20;
                    size3 = n27;
                    final a.a a21 = a17;
                    h = array4;
                    a8 = n28;
                    a9 = a21;
                    n4 = n20;
                }
                final b b33 = b(a9.c);
                e = this;
                if (b33 != null) {
                    for (int size6 = e.d.size(), n39 = 0; n39 < size6; ++n39) {
                        final e.e$b e$b3 = (e.e$b)e.d.valueAt(n39);
                        final l a22 = e$b3.d.a;
                        final kb.c a23 = e$b3.b.a;
                        final int a24 = c0.a;
                        final int a25 = a23.a;
                        final m[] k2 = a22.k;
                        m m3;
                        if (k2 == null) {
                            m3 = null;
                        }
                        else {
                            m3 = k2[a25];
                        }
                        String b34;
                        if (m3 != null) {
                            b34 = m3.b;
                        }
                        else {
                            b34 = null;
                        }
                        final b a26 = b33.a(b34);
                        final n f3 = e$b3.d.a.f;
                        f3.getClass();
                        final n$a n$a = new n$a(f3);
                        n$a.n = a26;
                        e$b3.a.a(new n(n$a));
                    }
                }
                if (e.w != -9223372036854775807L) {
                    for (int size7 = e.d.size(), n40 = 0; n40 < size7; ++n40) {
                        final e.e$b e$b4 = (e.e$b)e.d.valueAt(n40);
                        final long w = e.w;
                        int f4 = e$b4.f;
                        while (true) {
                            final kb.n b35 = e$b4.b;
                            if (f4 >= b35.e || b35.i[f4] >= w) {
                                break;
                            }
                            if (b35.j[f4]) {
                                e$b4.i = f4;
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
        final w[] f2 = (w[])c0.L(n3, (Object[])this.F);
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
            this.d.put(0, (Object)new e.e$b(e.k(0, b.b), new o(this.b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new kb.c(0, 0, 0, 0)));
            this.E.b();
        }
    }
    
    public final int h(final db.i i, final db.t t) throws IOException {
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
                        Label_1566: {
                            e.e$b z;
                            if ((z = e.z) == null) {
                                final SparseArray<e.e$b> d = e.d;
                                final int size = d.size();
                                long n3 = Long.MAX_VALUE;
                                z = null;
                                e.e$b e$b2;
                                long n4;
                                for (int j = 0; j < size; ++j, z = e$b2, n3 = n4) {
                                    final e.e$b e$b = (e.e$b)d.valueAt(j);
                                    final boolean l = e$b.l;
                                    if (!l) {
                                        e$b2 = z;
                                        n4 = n3;
                                        if (e$b.f == e$b.d.b) {
                                            continue;
                                        }
                                    }
                                    if (l && e$b.h == e$b.b.d) {
                                        e$b2 = z;
                                        n4 = n3;
                                    }
                                    else {
                                        long n5;
                                        if (!l) {
                                            n5 = e$b.d.c[e$b.f];
                                        }
                                        else {
                                            n5 = e$b.b.f[e$b.h];
                                        }
                                        e$b2 = z;
                                        n4 = n3;
                                        if (n5 < n3) {
                                            e$b2 = e$b;
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
                                        break Label_1566;
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
                            Label_1564: {
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
                                            final t n10 = z.b.n;
                                            final int d2 = a2.d;
                                            if (d2 != 0) {
                                                n10.C(d2);
                                            }
                                            final kb.n b2 = z.b;
                                            final int f = z.f;
                                            int n11 = b ? 1 : 0;
                                            if (b2.k) {
                                                n11 = (b ? 1 : 0);
                                                if (b2.l[f]) {
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
                                        break Label_1564;
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
                                    a6[2] = (a6[1] = 0);
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
                                            Label_1048: {
                                                if (e.G.length > 0) {
                                                    final String q = a3.f.q;
                                                    final byte b3 = a6[4];
                                                    final byte[] a7 = bd.q.a;
                                                    if (("video/avc".equals(q) && (b3 & 0x1F) == 0x6) || ("video/hevc".equals(q) && (b3 & 0x7E) >> 1 == 39)) {
                                                        d4 = true;
                                                        break Label_1048;
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
                                                final t g = e.g;
                                                final int e4 = bd.q.e(g.c, g.a);
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
                                        final int b4 = e.B;
                                        final int a8 = e.A;
                                        if (b4 >= a8) {
                                            break;
                                        }
                                        e.B += a4.e((f)i, a8 - b4, false);
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
                                    final e.e$a e$a = e.n.removeFirst();
                                    e.v -= e$a.c;
                                    long a10;
                                    final long n17 = a10 = e$a.a;
                                    if (e$a.b) {
                                        a10 = n17 + a5;
                                    }
                                    final a0 j2 = e.j;
                                    long a11 = a10;
                                    if (j2 != null) {
                                        a11 = j2.a(a10);
                                    }
                                    final w[] f2 = e.F;
                                    for (int length = f2.length, n18 = 0; n18 < length; ++n18) {
                                        f2[n18].b(a11, 1, e$a.c, e.v, (w$a)null);
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
                        e.e$b e$b3 = null;
                        while (n19 < size2) {
                            final kb.n b5 = ((e.e$b)e.d.valueAt(n19)).b;
                            long n20 = n2;
                            e.e$b e$b4 = e$b3;
                            if (b5.o) {
                                final long c4 = b5.c;
                                n20 = n2;
                                e$b4 = e$b3;
                                if (c4 < n2) {
                                    e$b4 = (e.e$b)e.d.valueAt(n19);
                                    n20 = c4;
                                }
                            }
                            ++n19;
                            n2 = n20;
                            e$b3 = e$b4;
                        }
                        if (e$b3 == null) {
                            e.p = 3;
                        }
                        else {
                            final db.e e5 = (db.e)i;
                            final int n21 = (int)(n2 - e5.d);
                            if (n21 < 0) {
                                throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", (Throwable)null);
                            }
                            e5.n(n21);
                            final kb.n b6 = e$b3.b;
                            final t n22 = b6.n;
                            e5.f(n22.a, 0, n22.c, false);
                            b6.n.B(0);
                            b6.o = false;
                        }
                    }
                }
                else {
                    final int n23 = (int)e.r - e.s;
                    final t t2 = e.t;
                    Label_2752: {
                        if (t2 != null) {
                            final byte[] a12 = t2.a;
                            final db.e e6 = (db.e)i;
                            e6.f(a12, 8, n23, false);
                            final int q2 = e.q;
                            final a.b b7 = new a.b(q2, t2);
                            final long d5 = e6.d;
                            if (!e.m.isEmpty()) {
                                e.m.peek().c.add(b7);
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
                                        long p6;
                                        long n31;
                                        String s4;
                                        String s5;
                                        long n32;
                                        if (n30 != 0) {
                                            if (n30 != 1) {
                                                ph0.a.h(46, "Skipping unsupported emsg version: ", n30, "FragmentedMp4Extractor");
                                                e = e7;
                                                break Label_2752;
                                            }
                                            final long s3 = t2.s();
                                            p5 = c0.P(t2.v(), 1000000L, s3);
                                            p6 = c0.P(t2.s(), 1000L, s3);
                                            n31 = t2.s();
                                            s4 = t2.l();
                                            s4.getClass();
                                            s5 = t2.l();
                                            s5.getClass();
                                            n32 = -9223372036854775807L;
                                        }
                                        else {
                                            s4 = t2.l();
                                            s4.getClass();
                                            s5 = t2.l();
                                            s5.getClass();
                                            final long s6 = t2.s();
                                            final long p7 = c0.P(t2.s(), 1000000L, s6);
                                            final long y = e7.y;
                                            if (y != -9223372036854775807L) {
                                                p5 = y + p7;
                                            }
                                            else {
                                                p5 = -9223372036854775807L;
                                            }
                                            final long p8 = c0.P(t2.s(), 1000L, s6);
                                            n31 = t2.s();
                                            p6 = p8;
                                            n32 = p7;
                                        }
                                        final int n33 = t2.c - t2.b;
                                        final byte[] array5 = new byte[n33];
                                        t2.b(0, n33, array5);
                                        final t t3 = new t(e7.k.a(new sb.a(s4, s5, p6, n31, array5)));
                                        final int n34 = t3.c - t3.b;
                                        for (final w w2 : e7.F) {
                                            t3.B(0);
                                            w2.c(n34, t3);
                                        }
                                        if (p5 == -9223372036854775807L) {
                                            e7.n.addLast(new e.e$a(n34, n32, true));
                                            e7.v += n34;
                                            e = e7;
                                        }
                                        else if (!e7.n.isEmpty()) {
                                            e7.n.addLast(new e.e$a(n34, p5, false));
                                            e7.v += n34;
                                            e = e7;
                                        }
                                        else {
                                            final a0 j3 = e7.j;
                                            long a13 = p5;
                                            if (j3 != null) {
                                                a13 = j3.a(p5);
                                            }
                                            final w[] f4 = e7.F;
                                            final int length3 = f4.length;
                                            int n36 = 0;
                                            while (true) {
                                                e = e7;
                                                if (n36 >= length3) {
                                                    break;
                                                }
                                                f4[n36].b(a13, 1, n34, 0, (w$a)null);
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
                boolean b8 = false;
                Label_3692: {
                    if (e.s == 0) {
                        final byte[] a14 = e.l.a;
                        final db.e e8 = (db.e)i;
                        b8 = false;
                        if (!e8.f(a14, 0, 8, true)) {
                            break Label_3692;
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
                    final int s7 = e.s;
                    if (r2 < s7) {
                        throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
                    }
                    final db.e e10 = (db.e)i;
                    final long n39 = e10.d - s7;
                    final int q3 = e.q;
                    if ((q3 == 1836019558 || q3 == 1835295092) && !e.H) {
                        e.E.s((u)new u$b(e.x, n39));
                        e.H = true;
                    }
                    if (e.q == 1836019558) {
                        for (int size3 = e.d.size(), n40 = 0; n40 < size3; ++n40) {
                            final kb.n b9 = ((e.e$b)e.d.valueAt(n40)).b;
                            b9.getClass();
                            b9.c = n39;
                            b9.b = n39;
                        }
                    }
                    final int q4 = e.q;
                    if (q4 == 1835295092) {
                        e.z = null;
                        e.u = n39 + e.r;
                        e.p = 2;
                        b8 = true;
                    }
                    else {
                        if (q4 == 1836019574 || q4 == 1953653099 || q4 == 1835297121 || q4 == 1835626086 || q4 == 1937007212 || q4 == 1836019558 || q4 == 1953653094 || q4 == 1836475768 || q4 == 1701082227) {
                            final long n41 = e10.d + e.r - 8L;
                            e.m.push(new a.a(q4, n41));
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
                            final t t4 = new t((int)r3);
                            System.arraycopy(e.l.a, 0, t4.a, 0, 8);
                            e.t = t4;
                            e.p = 1;
                        }
                        else {
                            if (e.r > 2147483647L) {
                                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            e.t = null;
                            e.p = 1;
                        }
                        b8 = true;
                    }
                }
                if (!b8) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    public final void release() {
    }
}
